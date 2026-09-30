const jwt = require('jsonwebtoken');
const config = require('./config');
function signUserToken(user) {
  return jwt.sign({ id: user.id, username: user.username, fullName: user.full_name, role: user.role }, config.jwtSecret, { expiresIn: '8h', subject: String(user.id) });
}
function identity(req) {
  const header = req.get('authorization') || '';
  if (!header.startsWith('Bearer ')) return null;
  try {
    const user = jwt.verify(header.slice(7), config.jwtSecret);
    return Number.isInteger(user.id) && user.id > 0 && ['CUSTOMER', 'ADMIN'].includes(user.role) ? user : null;
  } catch { return null; }
}
function requireUser(req, res, roles = ['CUSTOMER', 'ADMIN']) {
  const user = identity(req);
  if (!user) { res.status(401).json({ error: 'Vui lòng đăng nhập' }); return null; }
  if (!roles.includes(user.role)) { res.status(403).json({ error: 'Bạn không có quyền thực hiện thao tác này' }); return null; }
  return user;
}
function internal(req, res, next) {
  if (req.get('x-internal-secret') !== config.internalServiceSecret) return res.status(403).json({ error: 'Internal access denied' });
  next();
}
module.exports = { signUserToken, identity, requireUser, internal };
