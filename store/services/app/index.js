const express = require('express');
const { createAppDatabase } = require('./db');
const { inspectJar } = require('../../shared/jar');
const { requireUser, identity, internal, authenticate } = require('../../shared/auth');
const { installModeration, canManage } = require('./moderation');
const { route, errors, service, listen } = require('../../shared/http');
const config = require('../../shared/config');
const fields = `a.*, (SELECT id FROM releases WHERE app_id=a.id AND channel='STABLE' AND review_status='APPROVED' ORDER BY id DESC LIMIT 1) AS latest_release_id,
  (SELECT version FROM releases WHERE app_id=a.id AND channel='STABLE' AND review_status='APPROVED' ORDER BY id DESC LIMIT 1) AS latest_version,
  (SELECT size_bytes FROM releases WHERE app_id=a.id AND channel='STABLE' AND review_status='APPROVED' ORDER BY id DESC LIMIT 1) AS size_bytes,
  (SELECT id FROM releases WHERE app_id=a.id AND channel='BETA' AND review_status='APPROVED' ORDER BY id DESC LIMIT 1) AS latest_beta_release_id,
  (SELECT version FROM releases WHERE app_id=a.id AND channel='BETA' AND review_status='APPROVED' ORDER BY id DESC LIMIT 1) AS latest_beta_version,
  (SELECT COUNT(*) FROM downloads WHERE app_id=a.id) AS download_count`;
async function start() {
  const db = await createAppDatabase(); const app = express();
  app.use(express.json({ limit: '64kb' }));
  app.use(authenticate());
  installModeration(app,db,fields);
  app.get('/apps', route(async (req, res) => {
    const admin = identity(req)?.role === 'ADMIN';
    res.json(await db.all(`SELECT ${fields} FROM apps a WHERE ${admin ? '1=1' : "a.published=1 AND a.review_status='APPROVED'"} ORDER BY a.id`));
  }));
  app.get('/internal/apps/:id', internal, route(async (req, res) => {
    res.json(await db.get(`SELECT ${fields} FROM apps a WHERE id=?`, [req.params.id]) || null);
  }));
  app.get('/apps/:id', route(async (req, res) => {
    const row = await db.get(`SELECT ${fields} FROM apps a WHERE id=?`, [req.params.id]);
    if (!row || ((!row.published || row.review_status !== 'APPROVED') && !canManage(identity(req),row))) return res.status(404).json({ error: 'Không tìm thấy app' });
    const releases = await db.all(`SELECT id,version,filename,sha256,size_bytes,main_class,notes,channel,review_status,review_note,created_at FROM releases WHERE app_id=? ${canManage(identity(req),row) ? '' : "AND review_status='APPROVED'"} ORDER BY id DESC`, [row.id]);
    res.json({ ...row, releases });
  }));
  function metadata(body, slug) {
    const { name, description = '', category = 'Utilities', priceVnd = 0, designUrl = '', published = true } = body;
    if (typeof slug !== 'string' || !/^[a-z0-9-]{2,80}$/.test(slug) || typeof name !== 'string' || !name.trim() || name.length > 100 || typeof description !== 'string' || description.length > 4000 || typeof category !== 'string' || category.length > 50 || !category.trim() || !Number.isSafeInteger(priceVnd) || priceVnd < 0 || priceVnd > 100000000 || typeof designUrl !== 'string' || designUrl.length > 1000 || (designUrl && !/^https:\/\/www\.figma\.com\//.test(designUrl)) || typeof published !== 'boolean') throw new Error('INVALID_METADATA');
    return [name.trim(), description, category.trim(), priceVnd, designUrl, published ? 1 : 0];
  }
  app.post('/apps', route(async (req, res) => {
    const user = requireUser(req,res); if (!user) return;
    try {
      const values = metadata(req.body, req.body.slug);
      if (user.role !== 'ADMIN') values[5] = 0;
      const result = await db.run('INSERT INTO apps(name,description,category,price_vnd,design_url,published,slug,owner_user_id,review_status) VALUES(?,?,?,?,?,?,?,?,?)', [...values, req.body.slug, user.id, user.role === 'ADMIN' ? 'APPROVED' : 'PENDING']);
      res.status(201).json(await db.get('SELECT * FROM apps WHERE id=?', [result.lastID]));
    } catch (error) {
      if (error.message === 'INVALID_METADATA') return res.status(400).json({ error: 'Thông tin app không hợp lệ' });
      if (/UNIQUE/i.test(error.message)) return res.status(409).json({ error: 'Slug đã tồn tại' }); throw error;
    }
  }));
  app.put('/apps/:id', route(async (req, res) => {
    const user = requireUser(req,res); if (!user) return;
    const old = await db.get('SELECT * FROM apps WHERE id=?', [req.params.id]);
    if (!old) return res.status(404).json({ error: 'Không tìm thấy app' });
    if (!canManage(user,old)) return res.status(403).json({ error:'Bạn chỉ được quản lý app mình gửi' });
    if (user.role !== 'ADMIN' && Object.hasOwn(req.body,'published')) return res.status(403).json({ error:'Admin duyệt và quyết định hiển thị app' });
    if (req.body.published === true && old.review_status !== 'APPROVED') return res.status(409).json({ error:'Duyệt app trước khi hiển thị' });
    try {
      const values = metadata({ name: old.name, description: old.description, category: old.category, priceVnd: old.price_vnd, designUrl: old.design_url, published: !!old.published, ...req.body }, old.slug);
      if (user.role === 'ADMIN') await db.run('UPDATE apps SET name=?,description=?,category=?,price_vnd=?,design_url=?,published=? WHERE id=?', [...values, old.id]);
      else await db.run("UPDATE apps SET name=?,description=?,category=?,price_vnd=?,design_url=?,published=0,review_status='PENDING',review_note='',reviewed_by=NULL,reviewed_at=NULL WHERE id=?", [...values.slice(0,5),old.id]);
      res.json(await db.get('SELECT * FROM apps WHERE id=?', [old.id]));
    } catch (error) { if (error.message === 'INVALID_METADATA') return res.status(400).json({ error: 'Thông tin app không hợp lệ' }); throw error; }
  }));
  app.post('/apps/:id/releases', (req, res, next) => requireUser(req, res) && next(), express.raw({ type: 'application/java-archive', limit: config.maxJarBytes }), route(async (req, res) => {
    const row = await db.get('SELECT * FROM apps WHERE id=?', [req.params.id]);
    if (!row) return res.status(404).json({ error: 'Không tìm thấy app' });
    const user = identity(req);
    if (!canManage(user,row)) return res.status(403).json({ error:'Bạn chỉ được upload JAR cho app mình gửi' });
    const version = req.get('x-app-version') || '';
    const channel = req.get('x-release-channel') || 'STABLE';
    if (!['STABLE','BETA'].includes(channel)) return res.status(400).json({ error:'Chọn kênh STABLE hoặc BETA' });
    if (!/^[a-zA-Z0-9._-]{1,40}$/.test(version)) return res.status(400).json({ error: 'Phiên bản không hợp lệ' });
    let info;
    try { info = inspectJar(req.body); } catch (error) { return res.status(400).json({ error: error.message }); }
    try {
      const reviewStatus = user.role === 'ADMIN' ? 'APPROVED' : 'PENDING';
      const result = await db.run('INSERT INTO releases(app_id,version,filename,jar_blob,sha256,size_bytes,main_class,manifest,channel,review_status) VALUES(?,?,?,?,?,?,?,?,?,?)', [row.id, version, `${row.slug}-${version}.jar`, req.body, info.sha256, info.sizeBytes, info.mainClass, info.manifest,channel,reviewStatus]);
      res.status(201).json({ id: result.lastID, appId: row.id, version, channel, review_status:reviewStatus, sha256: info.sha256, sizeBytes: info.sizeBytes });
    } catch (error) { if (/UNIQUE/i.test(error.message)) return res.status(409).json({ error: 'Phiên bản đã tồn tại, hãy dùng phiên bản mới' }); throw error; }
  }));
  app.get('/apps/:id/download', route(async (req, res) => {
    const row = await db.get("SELECT * FROM apps WHERE id=? AND published=1 AND review_status='APPROVED'", [req.params.id]);
    if (!row) return res.status(404).json({ error: 'Không tìm thấy app' });
    const user = identity(req);
    const release = req.query.releaseId
      ? await db.get("SELECT * FROM releases WHERE app_id=? AND id=? AND review_status='APPROVED'", [row.id, req.query.releaseId])
      : await db.get("SELECT * FROM releases WHERE app_id=? AND channel='STABLE' AND review_status='APPROVED' ORDER BY id DESC LIMIT 1", [row.id]);
    if (!release) return res.status(404).json({ error:'Chưa có phiên bản JAR ổn định được duyệt' });
    if (release.channel === 'BETA') {
      if (!user) return res.status(401).json({ error:'Đăng nhập để đăng ký beta' });
      const access = await db.get("SELECT id FROM beta_enrollments WHERE app_id=? AND user_id=? AND status='APPROVED'", [row.id,user.id]);
      if (!access) return res.status(403).json({ error:'Bạn cần đăng ký beta và được admin duyệt' });
    }
    if (row.price_vnd > 0) {
      if (!user) return res.status(401).json({ error: 'Đăng nhập để tải app trả phí' });
      let rights;
      try { rights = await service(config.orderServicePort, `/internal/entitlements?userId=${user.id}&appId=${row.id}`); }
      catch { return res.status(503).json({ error: 'Chưa kiểm tra được quyền tải; hãy thử lại' }); }
      if (!rights.owned) return res.status(402).json({ error: 'Thanh toán trước khi tải app', appId: row.id });
    }
    const bytes = Buffer.from(release.jar_blob);
    await db.run('INSERT INTO downloads(app_id,release_id,user_id) VALUES(?,?,?)', [row.id, release.id, user?.id || null]);
    res.set({ 'Content-Type': 'application/java-archive', 'Content-Disposition': `attachment; filename="${release.filename}"`, 'Content-Length': bytes.length, 'X-JAR-SHA256': release.sha256, 'Cache-Control': 'private, no-store', 'X-Content-Type-Options': 'nosniff' }).send(bytes);
  }));
  app.get('/health', route(async (req, res) => { await db.get('SELECT 1 AS ok'); res.json({ status: 'ok', database: db.backend }); }));
  app.use(errors); await listen(app, config.appServicePort, db);
}
start().catch(error => { console.error(error); process.exit(1); });
