const jwt = require('jsonwebtoken');
const crypto = require('node:crypto');
const config = require('./config');
const hash = value => crypto.createHash('sha256').update(value).digest('hex');
function cookies(req) {
  const values = {};
  for (const item of (req.get('cookie') || '').split(';')) {
    const at = item.indexOf('='); if (at < 0) continue;
    try { values[item.slice(0, at).trim()] = decodeURIComponent(item.slice(at + 1)); } catch {}
  }
  return values;
}
function tokenClaims(req) {
  const header = req.get('authorization') || '';
  const token = header.startsWith('Bearer ') ? header.slice(7) : cookies(req)[config.cookieName];
  if (!token) return null;
  try {
    const c = jwt.verify(token, config.jwtSecret, { algorithms: ['HS256'], issuer: 'flint-store', audience: 'flint-store' });
    return Number.isInteger(c.id) && c.id > 0 && typeof c.sid === 'string' && /^[\w-]{43}$/.test(c.sid) ? c : null;
  } catch { return null; }
}
function signUserToken(user, sid) {
  return jwt.sign({ id: user.id, sid }, config.jwtSecret, { expiresIn: config.sessionSeconds, subject: String(user.id), issuer: 'flint-store', audience: 'flint-store', algorithm: 'HS256' });
}
function authenticate(resolveSession) {
  return async (req, res, next) => {
    req.user = null;
    const claims = tokenClaims(req);
    if (claims) {
      try {
        const row = resolveSession ? await resolveSession(hash(claims.sid)) : await require('./http').service(config.userServicePort, '/internal/sessions/' + hash(claims.sid));
        if (row && row.id === claims.id && ['ADMIN','CUSTOMER'].includes(row.role)) req.user = row;
        req.sessionHash = hash(claims.sid);
      } catch { return res.status(503).json({ error: 'Chưa xác minh được phiên đăng nhập; hãy thử lại' }); }
    }
    next();
  };
}
const identity = req => req.user || null;
function requireUser(req, res, roles = ['CUSTOMER', 'ADMIN']) {
  const user = identity(req);
  if (!user) { res.status(401).json({ error: 'Vui lòng đăng nhập' }); return null; }
  if (!roles.includes(user.role)) { res.status(403).json({ error: 'Bạn không có quyền thực hiện thao tác này' }); return null; }
  return user;
}
const cookieOptions = { httpOnly: true, secure: config.production, sameSite: 'lax', path: '/' };
function setSessionCookie(res, token) { res.cookie(config.cookieName, token, { ...cookieOptions, maxAge: config.sessionSeconds * 1000 }); }
function clearSessionCookie(res) { res.clearCookie(config.cookieName, cookieOptions); }
function internal(req, res, next) {
  const a = Buffer.from(req.get('x-internal-secret') || ''), b = Buffer.from(config.internalServiceSecret);
  if (a.length !== b.length || !crypto.timingSafeEqual(a, b)) return res.status(403).json({ error: 'Internal access denied' });
  next();
}
module.exports = { signUserToken, identity, requireUser, authenticate, internal, hash, cookies, setSessionCookie, clearSessionCookie, cookieOptions };
