const config = require('./config');
function requestGuard(req, res, next) {
  if (!['POST','PUT','PATCH','DELETE'].includes(req.method)) return next();
  const origin = req.get('origin');
  if ((origin && origin !== config.publicOrigin) || req.get('sec-fetch-site') === 'cross-site') return res.status(403).json({ error: 'Yêu cầu từ website khác bị chặn' });
  if (req.get('cookie') && !req.get('authorization') && req.get('x-flint-request') !== '1') return res.status(403).json({ error: 'Thiếu bảo vệ CSRF; hãy tải lại trang' });
  next();
}
function rateLimit({ max = 600, windowMs = 5 * 60000, key = req => req.ip } = {}) {
  const entries = new Map();
  return (req, res, next) => {
    const now = Date.now();
    for (const [k, row] of entries) if (row.until <= now) entries.delete(k);
    const id = key(req);
    if (!entries.has(id) && entries.size >= 10000) return res.status(429).json({ error: 'Hệ thống đang bận; hãy thử lại sau' });
    const row = entries.get(id) || { count: 0, until: now + windowMs };
    row.count++; entries.set(id, row);
    if (row.count > max) { res.set('Retry-After', String(Math.ceil((row.until - now) / 1000))); return res.status(429).json({ error: 'Quá nhiều yêu cầu; hãy thử lại sau' }); }
    next();
  };
}
module.exports = { requestGuard, rateLimit };
