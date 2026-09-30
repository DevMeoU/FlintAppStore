const express = require('express');
const crypto = require('crypto');
const { openDatabase } = require('../../shared/db');
const { requireUser, internal, authenticate } = require('../../shared/auth');
const { route, errors, service, listen } = require('../../shared/http');
const config = require('../../shared/config');
const { paymentToken, validPaymentToken, publicInvoice } = require('../../shared/payment');
async function start() {
  const db = openDatabase('order-service');
  await db.exec(`CREATE TABLE IF NOT EXISTS orders (
    id INTEGER PRIMARY KEY AUTOINCREMENT, user_id INTEGER NOT NULL, app_id INTEGER NOT NULL,
    app_name TEXT NOT NULL, amount_vnd INTEGER NOT NULL CHECK(amount_vnd>0), currency TEXT NOT NULL DEFAULT 'VND',
    status TEXT NOT NULL DEFAULT 'PENDING' CHECK(status IN ('PENDING','PAID','CANCELLED')),
    payment_code TEXT NOT NULL UNIQUE, payment_source TEXT, payment_reference TEXT, verified_by INTEGER,
    created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP, paid_at TEXT
  );
  CREATE UNIQUE INDEX IF NOT EXISTS one_open_or_paid_order ON orders(user_id,app_id) WHERE status IN ('PENDING','PAID');
  CREATE INDEX IF NOT EXISTS rights ON orders(user_id,app_id,status);`);
  const app = express(); app.use(express.json({ limit: '32kb' }));
  app.use(authenticate());
  app.get('/internal/entitlements', internal, route(async (req, res) => {
    const row = await db.get("SELECT id FROM orders WHERE user_id=? AND app_id=? AND status='PAID'", [req.query.userId, req.query.appId]);
    res.json({ owned: !!row });
  }));
  app.get('/orders', route(async (req, res) => {
    const user = requireUser(req, res); if (!user) return;
    res.json(await db.all(`SELECT * FROM orders ${user.role === 'ADMIN' && req.query.all === '1' ? '' : 'WHERE user_id=?'} ORDER BY id DESC`, user.role === 'ADMIN' && req.query.all === '1' ? [] : [user.id]));
  }));
  app.post('/orders', route(async (req, res) => {
    const user = requireUser(req, res); if (!user) return;
    const appId = req.body.appId;
    if (!Number.isInteger(appId) || appId <= 0) return res.status(400).json({ error: 'Mã app không hợp lệ' });
    let item;
    try { item = await service(config.appServicePort, `/internal/apps/${appId}`); }
    catch { return res.status(503).json({ error: 'Chưa đọc được giá app' }); }
    if (!item?.published || item.review_status !== 'APPROVED' || (!item.latest_release_id && !item.latest_beta_release_id)) return res.status(404).json({ error: 'App chưa phát hành JAR' });
    if (!item.price_vnd) return res.status(400).json({ error: 'App miễn phí có thể tải trực tiếp' });
    const existing = await db.get("SELECT * FROM orders WHERE user_id=? AND app_id=? AND status IN ('PENDING','PAID')", [user.id, appId]);
    if (existing) return res.json(existing);
    try {
      const result = await db.run('INSERT INTO orders(user_id,app_id,app_name,amount_vnd,payment_code) VALUES(?,?,?,?,?)', [user.id, appId, item.name, item.price_vnd, `FLINT-${crypto.randomBytes(8).toString('hex').toUpperCase()}`]);
      res.status(201).json(await db.get('SELECT * FROM orders WHERE id=?', [result.lastID]));
    } catch (error) {
      if (/UNIQUE/i.test(error.message)) return res.json(await db.get("SELECT * FROM orders WHERE user_id=? AND app_id=? AND status IN ('PENDING','PAID')", [user.id, appId]));
      throw error;
    }
  }));
  async function ownedOrder(req, res, adminAllowed = true) {
    const user = requireUser(req, res); if (!user) return null;
    const order = await db.get('SELECT * FROM orders WHERE id=?', [req.params.id]);
    if (!order || (order.user_id !== user.id && !(adminAllowed && user.role === 'ADMIN'))) { res.status(404).json({ error: 'Không tìm thấy đơn của bạn' }); return null; }
    return { user, order };
  }
  app.get('/orders/:id', route(async (req, res) => {
    const found = await ownedOrder(req, res); if (!found) return;
    res.json(found.order);
  }));
  app.get('/orders/:id/payment-link', route(async (req, res) => {
    const found = await ownedOrder(req, res); if (!found) return;
    if (found.order.status !== 'PENDING') return res.status(409).json({ error: 'Đơn không còn chờ thanh toán' });
    // Fragment tokens stay out of HTTP request URLs, access logs and referrers.
    res.json({ path: `/pay/${found.order.id}#t=${paymentToken(found.order)}` });
  }));
  async function linkedOrder(req, res) {
    const order = await db.get('SELECT * FROM orders WHERE id=?', [req.params.id]);
    const token = req.get('x-payment-token') || req.body?.t;
    if (!validPaymentToken(order, token)) { res.status(404).json({ error: 'Liên kết thanh toán không hợp lệ' }); return null; }
    return order;
  }
  app.get('/pay/:id', route(async (req, res) => {
    const order = await linkedOrder(req, res); if (!order) return;
    res.json(publicInvoice(order));
  }));
  app.post('/pay/:id/confirm', route(async (req, res) => {
    const order = await linkedOrder(req, res); if (!order) return;
    if (config.paymentMode !== 'demo') return res.status(403).json({ error: 'Thanh toán mô phỏng đang tắt' });
    if (order.status === 'CANCELLED') return res.status(409).json({ error: 'Đơn đã hủy' });
    await db.run("UPDATE orders SET status='PAID',payment_source='DEMO',payment_reference=payment_code,verified_by=NULL,paid_at=CURRENT_TIMESTAMP WHERE id=? AND status='PENDING'", [order.id]);
    const paid = await db.get('SELECT * FROM orders WHERE id=?', [order.id]);
    if (paid.status !== 'PAID') return res.status(409).json({ error: 'Trạng thái đơn đã thay đổi' });
    res.json(publicInvoice(paid));
  }));
  app.post('/orders/:id/pay', route(async (req, res) => {
    const found = await ownedOrder(req, res, false); if (!found) return;
    if (config.paymentMode !== 'demo') return res.status(403).json({ error: 'Thanh toán mô phỏng đang tắt' });
    if (found.order.status === 'CANCELLED') return res.status(409).json({ error: 'Đơn đã hủy' });
    // One atomic transition grants the entitlement. Repeated clicks return the same paid order.
    await db.run("UPDATE orders SET status='PAID',payment_source='DEMO',payment_reference=payment_code,verified_by=?,paid_at=CURRENT_TIMESTAMP WHERE id=? AND user_id=? AND status='PENDING'", [found.user.id, found.order.id, found.user.id]);
    const paid = await db.get('SELECT * FROM orders WHERE id=?', [found.order.id]);
    if (paid.status !== 'PAID') return res.status(409).json({ error: 'Trạng thái đơn đã thay đổi' });
    res.json(paid);
  }));
  app.post('/orders/:id/confirm', route(async (req, res) => {
    const admin = requireUser(req, res, ['ADMIN']); if (!admin) return;
    const reference = req.body.reference;
    if (typeof reference !== 'string' || !reference.trim() || reference.length > 120) return res.status(400).json({ error: 'Cần mã giao dịch để xác nhận' });
    const order = await db.get('SELECT * FROM orders WHERE id=?', [req.params.id]);
    if (!order) return res.status(404).json({ error: 'Không tìm thấy đơn' });
    if (order.status === 'CANCELLED') return res.status(409).json({ error: 'Đơn đã hủy' });
    await db.run("UPDATE orders SET status='PAID',payment_source='MANUAL',payment_reference=?,verified_by=?,paid_at=CURRENT_TIMESTAMP WHERE id=? AND status='PENDING'", [reference.trim(), admin.id, order.id]);
    const paid = await db.get('SELECT * FROM orders WHERE id=?', [order.id]);
    if (paid.status !== 'PAID') return res.status(409).json({ error: 'Trạng thái đơn đã thay đổi' });
    res.json(paid);
  }));
  app.post('/orders/:id/cancel', route(async (req, res) => {
    const found = await ownedOrder(req, res, false); if (!found) return;
    const result = await db.run("UPDATE orders SET status='CANCELLED' WHERE id=? AND user_id=? AND status='PENDING'", [found.order.id, found.user.id]);
    if (!result.changes) return res.status(409).json({ error: 'Chỉ hủy được đơn đang chờ thanh toán' });
    res.json(await db.get('SELECT * FROM orders WHERE id=?', [found.order.id]));
  }));
  app.get('/health', route(async (req, res) => { await db.get('SELECT 1 AS ok'); res.json({ status: 'ok', database: db.backend }); }));
  app.use(errors); await listen(app, config.orderServicePort, db);
}
start().catch(error => { console.error(error); process.exit(1); });
