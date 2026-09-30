const express = require('express');
const bcrypt = require('bcryptjs');
const { openDatabase } = require('../../shared/db');
const { signUserToken, requireUser } = require('../../shared/auth');
const { route, errors, listen } = require('../../shared/http');
const config = require('../../shared/config');
async function start() {
  const db = openDatabase('user-service');
  await db.exec(`CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT, full_name TEXT NOT NULL,
    username TEXT NOT NULL UNIQUE COLLATE NOCASE, password_hash TEXT NOT NULL,
    role TEXT NOT NULL CHECK(role IN ('CUSTOMER','ADMIN')), created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
  );`);
  if (!(await db.get('SELECT id FROM users LIMIT 1'))) {
    await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', ['Quản trị Flint', 'admin', await bcrypt.hash(process.env.ADMIN_PASSWORD || '123456', 10), 'ADMIN']);
    if (!config.production) await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', ['Người dùng Flint', 'customer', await bcrypt.hash('123456', 10), 'CUSTOMER']);
  }
  const app = express();
  app.use(express.json({ limit: '32kb' }));
  const publicUser = u => ({ id: u.id, fullName: u.full_name, username: u.username, role: u.role });
  const attempts = new Map();
  app.post('/login', route(async (req, res) => {
    const key = req.ip + ':' + String(req.body.username || '').toLowerCase();
    const now = Date.now();
    for (const [k, v] of attempts) if (v.until < now) attempts.delete(k);
    const attempt = attempts.get(key) || { count: 0, until: now + 60000 };
    if (attempt.count >= 10) return res.status(429).json({ error: 'Thử lại sau một phút' });
    attempt.count++; attempts.set(key, attempt);
    const user = await db.get('SELECT * FROM users WHERE username=?', [String(req.body.username || '').trim().toLowerCase()]);
    if (!user || typeof req.body.password !== 'string' || !await bcrypt.compare(req.body.password, user.password_hash)) return res.status(401).json({ error: 'Sai tài khoản hoặc mật khẩu' });
    attempts.delete(key);
    res.json({ token: signUserToken(user), user: publicUser(user) });
  }));
  app.post('/register', route(async (req, res) => {
    const { username, fullName, password } = req.body;
    if (typeof username !== 'string' || !/^[a-zA-Z0-9._-]{3,50}$/.test(username) || typeof fullName !== 'string' || fullName.trim().length < 2 || fullName.length > 100 || typeof password !== 'string' || password.length < 6 || password.length > 100) return res.status(400).json({ error: 'Tên đăng nhập 3–50 ký tự; tên từ 2 ký tự; mật khẩu 6–100 ký tự' });
    try {
      const result = await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', [fullName.trim(), username.toLowerCase(), await bcrypt.hash(password, 10), 'CUSTOMER']);
      const user = await db.get('SELECT * FROM users WHERE id=?', [result.lastID]);
      res.status(201).json({ token: signUserToken(user), user: publicUser(user) });
    } catch (error) { if (/UNIQUE/i.test(error.message)) return res.status(409).json({ error: 'Tên đăng nhập đã tồn tại' }); throw error; }
  }));
  app.get('/users/me', route(async (req, res) => {
    const user = requireUser(req, res); if (!user) return;
    const row = await db.get('SELECT * FROM users WHERE id=?', [user.id]);
    if (!row) return res.status(401).json({ error: 'Tài khoản không tồn tại' });
    res.json(publicUser(row));
  }));
  app.get('/health', route(async (req, res) => { await db.get('SELECT 1 AS ok'); res.json({ status: 'ok', database: db.backend }); }));
  app.use(errors); await listen(app, config.userServicePort, db);
}
start().catch(error => { console.error(error); process.exit(1); });
