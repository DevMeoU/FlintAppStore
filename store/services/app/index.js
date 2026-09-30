const express = require('express');
const { createAppDatabase } = require('./db');
const { inspectJar } = require('../../shared/jar');
const { requireUser, identity, internal } = require('../../shared/auth');
const { route, errors, service, listen } = require('../../shared/http');
const config = require('../../shared/config');
const fields = `a.*, (SELECT id FROM releases WHERE app_id=a.id ORDER BY id DESC LIMIT 1) AS latest_release_id,
  (SELECT version FROM releases WHERE app_id=a.id ORDER BY id DESC LIMIT 1) AS latest_version,
  (SELECT size_bytes FROM releases WHERE app_id=a.id ORDER BY id DESC LIMIT 1) AS size_bytes,
  (SELECT COUNT(*) FROM downloads WHERE app_id=a.id) AS download_count`;
async function start() {
  const db = await createAppDatabase(); const app = express();
  app.use(express.json({ limit: '64kb' }));
  app.get('/apps', route(async (req, res) => {
    const admin = identity(req)?.role === 'ADMIN';
    res.json(await db.all(`SELECT ${fields} FROM apps a WHERE ${admin ? '1=1' : 'a.published=1'} ORDER BY a.id`));
  }));
  app.get('/internal/apps/:id', internal, route(async (req, res) => {
    res.json(await db.get(`SELECT ${fields} FROM apps a WHERE id=?`, [req.params.id]) || null);
  }));
  app.get('/apps/:id', route(async (req, res) => {
    const row = await db.get(`SELECT ${fields} FROM apps a WHERE id=?`, [req.params.id]);
    if (!row || (!row.published && identity(req)?.role !== 'ADMIN')) return res.status(404).json({ error: 'Không tìm thấy app' });
    const releases = await db.all('SELECT id,version,filename,sha256,size_bytes,main_class,notes,created_at FROM releases WHERE app_id=? ORDER BY id DESC', [row.id]);
    res.json({ ...row, releases });
  }));
  function metadata(body, slug) {
    const { name, description = '', category = 'Utilities', priceVnd = 0, designUrl = '', published = true } = body;
    if (typeof slug !== 'string' || !/^[a-z0-9-]{2,80}$/.test(slug) || typeof name !== 'string' || !name.trim() || name.length > 100 || typeof description !== 'string' || description.length > 4000 || typeof category !== 'string' || category.length > 50 || !category.trim() || !Number.isSafeInteger(priceVnd) || priceVnd < 0 || priceVnd > 100000000 || typeof designUrl !== 'string' || designUrl.length > 1000 || (designUrl && !/^https:\/\/www\.figma\.com\//.test(designUrl)) || typeof published !== 'boolean') throw new Error('INVALID_METADATA');
    return [name.trim(), description, category.trim(), priceVnd, designUrl, published ? 1 : 0];
  }
  app.post('/apps', route(async (req, res) => {
    if (!requireUser(req, res, ['ADMIN'])) return;
    try {
      const values = metadata(req.body, req.body.slug);
      const result = await db.run('INSERT INTO apps(name,description,category,price_vnd,design_url,published,slug) VALUES(?,?,?,?,?,?,?)', [...values, req.body.slug]);
      res.status(201).json(await db.get('SELECT * FROM apps WHERE id=?', [result.lastID]));
    } catch (error) {
      if (error.message === 'INVALID_METADATA') return res.status(400).json({ error: 'Thông tin app không hợp lệ' });
      if (/UNIQUE/i.test(error.message)) return res.status(409).json({ error: 'Slug đã tồn tại' }); throw error;
    }
  }));
  app.put('/apps/:id', route(async (req, res) => {
    if (!requireUser(req, res, ['ADMIN'])) return;
    const old = await db.get('SELECT * FROM apps WHERE id=?', [req.params.id]);
    if (!old) return res.status(404).json({ error: 'Không tìm thấy app' });
    try {
      const values = metadata({ name: old.name, description: old.description, category: old.category, priceVnd: old.price_vnd, designUrl: old.design_url, published: !!old.published, ...req.body }, old.slug);
      await db.run('UPDATE apps SET name=?,description=?,category=?,price_vnd=?,design_url=?,published=? WHERE id=?', [...values, old.id]);
      res.json(await db.get('SELECT * FROM apps WHERE id=?', [old.id]));
    } catch (error) { if (error.message === 'INVALID_METADATA') return res.status(400).json({ error: 'Thông tin app không hợp lệ' }); throw error; }
  }));
  app.post('/apps/:id/releases', (req, res, next) => requireUser(req, res, ['ADMIN']) && next(), express.raw({ type: 'application/java-archive', limit: config.maxJarBytes }), route(async (req, res) => {
    const row = await db.get('SELECT id,slug FROM apps WHERE id=?', [req.params.id]);
    if (!row) return res.status(404).json({ error: 'Không tìm thấy app' });
    const version = req.get('x-app-version') || '';
    if (!/^[a-zA-Z0-9._-]{1,40}$/.test(version)) return res.status(400).json({ error: 'Phiên bản không hợp lệ' });
    let info;
    try { info = inspectJar(req.body); } catch (error) { return res.status(400).json({ error: error.message }); }
    try {
      const result = await db.run('INSERT INTO releases(app_id,version,filename,jar_blob,sha256,size_bytes,main_class,manifest) VALUES(?,?,?,?,?,?,?,?)', [row.id, version, `${row.slug}-${version}.jar`, req.body, info.sha256, info.sizeBytes, info.mainClass, info.manifest]);
      res.status(201).json({ id: result.lastID, appId: row.id, version, sha256: info.sha256, sizeBytes: info.sizeBytes });
    } catch (error) { if (/UNIQUE/i.test(error.message)) return res.status(409).json({ error: 'Phiên bản đã tồn tại, hãy dùng phiên bản mới' }); throw error; }
  }));
  app.get('/apps/:id/download', route(async (req, res) => {
    const row = await db.get('SELECT * FROM apps WHERE id=? AND published=1', [req.params.id]);
    if (!row) return res.status(404).json({ error: 'Không tìm thấy app' });
    const user = identity(req);
    if (row.price_vnd > 0) {
      if (!user) return res.status(401).json({ error: 'Đăng nhập để tải app trả phí' });
      let rights;
      try { rights = await service(config.orderServicePort, `/internal/entitlements?userId=${user.id}&appId=${row.id}`); }
      catch { return res.status(503).json({ error: 'Chưa kiểm tra được quyền tải; hãy thử lại' }); }
      if (!rights.owned) return res.status(402).json({ error: 'Thanh toán trước khi tải app', appId: row.id });
    }
    const release = req.query.releaseId
      ? await db.get('SELECT * FROM releases WHERE app_id=? AND id=?', [row.id, req.query.releaseId])
      : await db.get('SELECT * FROM releases WHERE app_id=? ORDER BY id DESC LIMIT 1', [row.id]);
    if (!release) return res.status(404).json({ error: 'Chưa có phiên bản JAR' });
    const bytes = Buffer.from(release.jar_blob);
    await db.run('INSERT INTO downloads(app_id,release_id,user_id) VALUES(?,?,?)', [row.id, release.id, user?.id || null]);
    res.set({ 'Content-Type': 'application/java-archive', 'Content-Disposition': `attachment; filename="${release.filename}"`, 'Content-Length': bytes.length, 'X-JAR-SHA256': release.sha256, 'Cache-Control': 'private, no-store', 'X-Content-Type-Options': 'nosniff' }).send(bytes);
  }));
  app.get('/health', route(async (req, res) => { await db.get('SELECT 1 AS ok'); res.json({ status: 'ok', database: db.backend }); }));
  app.use(errors); await listen(app, config.appServicePort, db);
}
start().catch(error => { console.error(error); process.exit(1); });
