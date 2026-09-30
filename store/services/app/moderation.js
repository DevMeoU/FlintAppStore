const { requireUser } = require('../../shared/auth');
const { route } = require('../../shared/http');
const canManage = (user,app) => !!user && (user.role === 'ADMIN' || app.owner_user_id === user.id);
function decision(body,res) {
  if (!['APPROVED','REJECTED'].includes(body.status) || (body.note !== undefined && (typeof body.note !== 'string' || body.note.length > 1000))) {
    res.status(400).json({ error:'Chọn APPROVED hoặc REJECTED, ghi chú tối đa 1000 ký tự' }); return null;
  }
  return { status:body.status,note:(body.note || '').trim() };
}
function installModeration(app,db,fields) {
  app.patch('/apps/:id/availability',route(async(req,res) => {
    const user = requireUser(req,res,['ADMIN']); if (!user) return;
    if (!['AVAILABLE','UNAVAILABLE'].includes(req.body.availability)) return res.status(400).json({error:'Chọn AVAILABLE hoặc UNAVAILABLE'});
    const result = await db.run('UPDATE apps SET availability=?,availability_updated_by=?,availability_updated_at=CURRENT_TIMESTAMP WHERE id=?',[req.body.availability,user.id,req.params.id]);
    if (!result.changes) return res.status(404).json({error:'Không tìm thấy app'});
    res.json(await db.get('SELECT * FROM apps WHERE id=?',[req.params.id]));
  }));
  app.get('/publisher/apps',route(async(req,res) => {
    const user = requireUser(req,res); if (!user) return;
    res.json(await db.all(`SELECT ${fields} FROM apps a WHERE owner_user_id=? ORDER BY id DESC`, [user.id]));
  }));
  app.patch('/apps/:id/review',route(async(req,res) => {
    const user = requireUser(req,res,['ADMIN']); if (!user) return;
    const choice = decision(req.body,res); if (!choice) return;
    const row = await db.get('SELECT id FROM apps WHERE id=?',[req.params.id]);
    if (!row) return res.status(404).json({error:'Không tìm thấy app'});
    if (choice.status === 'APPROVED' && !await db.get('SELECT id FROM releases WHERE app_id=? LIMIT 1',[row.id])) return res.status(409).json({error:'App cần có JAR trước khi được duyệt'});
    await db.run('UPDATE apps SET review_status=?,published=?,review_note=?,reviewed_by=?,reviewed_at=CURRENT_TIMESTAMP WHERE id=?',[choice.status,choice.status==='APPROVED'?1:0,choice.note,user.id,row.id]);
    res.json(await db.get('SELECT * FROM apps WHERE id=?',[row.id]));
  }));
  app.patch('/apps/:id/releases/:releaseId/review',route(async(req,res) => {
    const user = requireUser(req,res,['ADMIN']); if (!user) return;
    const choice = decision(req.body,res); if (!choice) return;
    const row = await db.get('SELECT id FROM releases WHERE app_id=? AND id=?',[req.params.id,req.params.releaseId]);
    if (!row) return res.status(404).json({error:'Không tìm thấy phiên bản của app'});
    await db.run('UPDATE releases SET review_status=?,review_note=?,reviewed_by=?,reviewed_at=CURRENT_TIMESTAMP WHERE id=?',[choice.status,choice.note,user.id,row.id]);
    res.json(await db.get('SELECT id,app_id,version,channel,review_status,review_note FROM releases WHERE id=?',[row.id]));
  }));
  app.get('/apps/:id/releases/:releaseId/review-download',route(async(req,res) => {
    const user = requireUser(req,res); if (!user) return;
    const owner = await db.get('SELECT * FROM apps WHERE id=?',[req.params.id]);
    if (!owner || !canManage(user,owner)) return res.status(404).json({error:'Không tìm thấy app của bạn'});
    if (owner.availability === 'UNAVAILABLE') return res.status(403).json({error:'App đang bị admin khóa (Unavailable). Không thể tải JAR.',code:'APP_UNAVAILABLE'});
    const row = await db.get('SELECT * FROM releases WHERE app_id=? AND id=?',[owner.id,req.params.releaseId]);
    if (!row) return res.status(404).json({error:'Không tìm thấy phiên bản của app'});
    res.set({'Content-Type':'application/java-archive','Content-Disposition':`attachment; filename="${row.filename}"`,'X-JAR-SHA256':row.sha256,'Cache-Control':'private, no-store'}).send(Buffer.from(row.jar_blob));
  }));
  app.get('/apps/:id/beta-enrollment',route(async(req,res) => {
    const user = requireUser(req,res); if (!user) return;
    const row = await db.get("SELECT id FROM apps WHERE id=? AND published=1 AND review_status='APPROVED'",[req.params.id]);
    if (!row) return res.status(404).json({error:'Không tìm thấy app'});
    res.json(await db.get('SELECT * FROM beta_enrollments WHERE app_id=? AND user_id=?',[row.id,user.id]) || {status:'NOT_REGISTERED'});
  }));
  app.post('/apps/:id/beta-enrollment',route(async(req,res) => {
    const user = requireUser(req,res); if (!user) return;
    const row = await db.get("SELECT id,availability FROM apps WHERE id=? AND published=1 AND review_status='APPROVED'",[req.params.id]);
    if (!row || !await db.get("SELECT id FROM releases WHERE app_id=? AND channel='BETA' AND review_status='APPROVED' LIMIT 1",[row.id])) return res.status(404).json({error:'App chưa phát hành bản beta được duyệt'});
    if (row.availability === 'UNAVAILABLE') return res.status(403).json({error:'App đang bị admin khóa (Unavailable). Chưa thể đăng ký beta.',code:'APP_UNAVAILABLE'});
    await db.run('INSERT OR IGNORE INTO beta_enrollments(app_id,user_id) VALUES(?,?)',[row.id,user.id]);
    res.json(await db.get('SELECT * FROM beta_enrollments WHERE app_id=? AND user_id=?',[row.id,user.id]));
  }));
  app.get('/beta-enrollments/mine',route(async(req,res) => {
    const user = requireUser(req,res); if (!user) return;
    res.json(await db.all('SELECT b.*,a.name AS app_name FROM beta_enrollments b JOIN apps a ON a.id=b.app_id WHERE b.user_id=? ORDER BY b.id DESC',[user.id]));
  }));
  app.get('/beta-enrollments',route(async(req,res) => {
    if (!requireUser(req,res,['ADMIN'])) return;
    res.json(await db.all('SELECT b.*,a.name AS app_name FROM beta_enrollments b JOIN apps a ON a.id=b.app_id ORDER BY b.id DESC'));
  }));
  app.patch('/beta-enrollments/:id',route(async(req,res) => {
    const user = requireUser(req,res,['ADMIN']); if (!user) return;
    const choice = decision(req.body,res); if (!choice) return;
    const row = await db.get('SELECT id FROM beta_enrollments WHERE id=?',[req.params.id]);
    if (!row) return res.status(404).json({error:'Không tìm thấy đăng ký beta'});
    await db.run('UPDATE beta_enrollments SET status=?,review_note=?,reviewed_by=?,reviewed_at=CURRENT_TIMESTAMP WHERE id=?',[choice.status,choice.note,user.id,row.id]);
    res.json(await db.get('SELECT * FROM beta_enrollments WHERE id=?',[row.id]));
  }));
}
module.exports = {installModeration,canManage};
