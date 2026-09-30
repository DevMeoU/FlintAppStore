const express = require('express');
const bcrypt = require('bcryptjs');
const crypto = require('node:crypto');
const { openDatabase } = require('../../shared/db');
const { signUserToken, requireUser, authenticate, internal, hash, setSessionCookie, clearSessionCookie } = require('../../shared/auth');
const { rateLimit } = require('../../shared/security');
const { installOAuth } = require('../../shared/oauth');
const { route, errors, listen } = require('../../shared/http');
const config = require('../../shared/config');
async function start() {
  const db = openDatabase('user-service');
  await db.exec(`CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT, full_name TEXT NOT NULL,
    username TEXT NOT NULL UNIQUE COLLATE NOCASE, password_hash TEXT NOT NULL,
    role TEXT NOT NULL CHECK(role IN ('CUSTOMER','ADMIN')), created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
  );`);
  await db.exec(`CREATE TABLE IF NOT EXISTS sessions (
    sid_hash TEXT PRIMARY KEY, user_id INTEGER NOT NULL, expires_at INTEGER NOT NULL,
    revoked INTEGER NOT NULL DEFAULT 0, created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
  ); CREATE INDEX IF NOT EXISTS session_users ON sessions(user_id);
  CREATE TABLE IF NOT EXISTS oauth_accounts (
    provider TEXT NOT NULL, subject TEXT NOT NULL, user_id INTEGER NOT NULL,
    PRIMARY KEY(provider,subject)
  ); CREATE TABLE IF NOT EXISTS oauth_attempts (
    state_hash TEXT PRIMARY KEY, browser_hash TEXT NOT NULL, provider TEXT NOT NULL,
    verifier TEXT NOT NULL, nonce TEXT NOT NULL, return_path TEXT NOT NULL,
    expires_at INTEGER NOT NULL, used INTEGER NOT NULL DEFAULT 0
  );`);
  if (!(await db.get('SELECT id FROM users LIMIT 1'))) {
    await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', ['Quản trị Flint', 'admin', await bcrypt.hash(process.env.ADMIN_PASSWORD || '123456', 10), 'ADMIN']);
    if (!config.production) await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', ['Người dùng Flint', 'customer', await bcrypt.hash('123456', 10), 'CUSTOMER']);
  }
  const app = express();
  app.use(express.json({ limit: '32kb' }));
  const publicUser = u => ({ id: u.id, fullName: u.full_name, username: u.username, role: u.role });
  const sessionUser = async sid => {
    const row = await db.get('SELECT u.* FROM users u JOIN sessions s ON s.user_id=u.id WHERE s.sid_hash=? AND s.revoked=0 AND s.expires_at>?', [sid,Date.now()]);
    return row ? publicUser(row) : null;
  };
  app.use(authenticate(sessionUser));
  app.get('/internal/sessions/:sid', internal, route(async (req,res) => {
    res.json(/^[a-f0-9]{64}$/.test(req.params.sid) ? await sessionUser(req.params.sid) : null);
  }));
  async function issueSession(user,res) {
    const sid = crypto.randomBytes(32).toString('base64url');
    await db.run('DELETE FROM sessions WHERE expires_at<?', [Date.now()]);
    await db.run('INSERT INTO sessions(sid_hash,user_id,expires_at) VALUES(?,?,?)', [hash(sid),user.id,Date.now()+config.sessionSeconds*1000]);
    setSessionCookie(res,signUserToken(user,sid));
  }
  const dummyHash = await bcrypt.hash(crypto.randomBytes(32).toString('base64url'),10);
  app.use(['/login','/register','/auth/oauth'],rateLimit({max:30,windowMs:60000,key:req => req.get('x-flint-client-ip') || req.ip}));
  const attempts = new Map();
  app.post('/login', route(async (req, res) => {
    const key = (req.get('x-flint-client-ip') || req.ip) + ':' + String(req.body.username || '').trim().toLowerCase().slice(0,50);
    const now = Date.now();
    for (const [k, v] of attempts) if (v.until < now) attempts.delete(k);
    const attempt = attempts.get(key) || { count: 0, until: now + 60000 };
    if (!attempts.has(key) && attempts.size >= 10000) return res.status(429).json({ error:'Hãy thử lại sau một phút' });
    if (attempt.count >= 10) return res.status(429).json({ error: 'Thử lại sau một phút' });
    attempt.count++; attempts.set(key, attempt);
    const user = await db.get('SELECT * FROM users WHERE username=?', [String(req.body.username || '').trim().toLowerCase()]);
    const password = typeof req.body.password === 'string' && Buffer.byteLength(req.body.password,'utf8') <= 72 ? req.body.password : '';
    const matches = await bcrypt.compare(password, user?.password_hash || dummyHash);
    if (!user || !password || !matches) return res.status(401).json({ error: 'Sai tài khoản hoặc mật khẩu' });
    attempts.delete(key);
    await issueSession(user,res); res.json({ user: publicUser(user) });
  }));
  app.post('/register', route(async (req, res) => {
    const { username, fullName, password } = req.body;
    if (typeof username !== 'string' || !/^[a-zA-Z0-9._-]{3,50}$/.test(username) || /^social_/i.test(username) || typeof fullName !== 'string' || fullName.trim().length < 2 || fullName.length > 100 || typeof password !== 'string' || password.length < 10 || Buffer.byteLength(password,'utf8') > 72) return res.status(400).json({ error: 'Tên đăng nhập 3–50 ký tự; tên từ 2 ký tự; mật khẩu tối thiểu 10 ký tự và tối đa 72 byte' });
    try {
      const result = await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', [fullName.trim(), username.toLowerCase(), await bcrypt.hash(password, 10), 'CUSTOMER']);
      const user = await db.get('SELECT * FROM users WHERE id=?', [result.lastID]);
      await issueSession(user,res); res.status(201).json({ user: publicUser(user) });
    } catch (error) { if (/UNIQUE/i.test(error.message)) return res.status(409).json({ error: 'Tên đăng nhập đã tồn tại' }); throw error; }
  }));
  app.get('/users/me', route(async (req, res) => {
    const user = requireUser(req, res); if (!user) return;
    const row = await db.get('SELECT * FROM users WHERE id=?', [user.id]);
    if (!row) return res.status(401).json({ error: 'Tài khoản không tồn tại' });
    res.json(publicUser(row));
  }));
  app.post('/logout', route(async (req,res) => {
    if (req.sessionHash) await db.run('UPDATE sessions SET revoked=1 WHERE sid_hash=?', [req.sessionHash]);
    clearSessionCookie(res); res.json({ ok:true });
  }));
  await installOAuth(app,db,issueSession);
  app.get('/health', route(async (req, res) => { await db.get('SELECT 1 AS ok'); res.json({ status: 'ok', database: db.backend }); }));
  app.use(errors); await listen(app, config.userServicePort, db);
}
start().catch(error => { console.error(error); process.exit(1); });
