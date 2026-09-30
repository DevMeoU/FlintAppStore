const config = require('./config');
const route = fn => (req, res, next) => Promise.resolve(fn(req, res)).catch(next);
function errors(error, req, res, next) {
  if (error.type === 'entity.too.large') return res.status(413).json({ error: 'File hoặc dữ liệu vượt kích thước cho phép' });
  if (error instanceof SyntaxError) return res.status(400).json({ error: 'JSON không hợp lệ' });
  console.error(error.message);
  res.status(500).json({ error: 'Dịch vụ gặp lỗi nội bộ' });
}
async function service(port, url) {
  const response = await fetch(`http://127.0.0.1:${port}${url}`, { headers: { 'x-internal-secret': config.internalServiceSecret }, signal: AbortSignal.timeout(8000) });
  if (!response.ok) throw new Error(`Internal service returned ${response.status}`);
  return response.json();
}
async function listen(app, port, db, host = '127.0.0.1') {
  const server = app.listen(port, host, () => console.log(`Ready http://${host}:${port}`));
  server.on('error', error => { console.error(error.message); process.exit(1); });
  const close = () => server.close(async () => { if (db) await db.close(); process.exit(0); });
  process.on('SIGTERM', close); process.on('SIGINT', close);
}
module.exports = { route, errors, service, listen };
