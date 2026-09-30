const express = require('express');
const path = require('path');
const config = require('../shared/config');
const { errors, listen } = require('../shared/http');
const app = express();
app.disable('x-powered-by');
app.use((req, res, next) => {
  res.set({ 'X-Content-Type-Options': 'nosniff', 'Referrer-Policy': 'same-origin', 'Content-Security-Policy': "default-src 'self'; script-src 'self'; style-src 'self'; img-src 'self' blob:; connect-src 'self'; object-src 'none'; frame-ancestors 'none'; base-uri 'self'" });
  next();
});
app.use(express.json({ limit: '64kb' }));
app.use(express.raw({ type: 'application/java-archive', limit: config.maxJarBytes }));
app.get('/api/config', (req, res) => res.json({ paymentMode: config.paymentMode, demoAccounts: !config.production, maxJarBytes: config.maxJarBytes, designUrl: 'https://www.figma.com/design/fOy5bP1ef3uCQKF5rDnCF9/FlintUI-Embedded-UI-Kit?node-id=13-47' }));
app.get('/api/health', async (req, res) => {
  try {
    const replies = await Promise.all([config.userServicePort, config.appServicePort, config.orderServicePort].map(port => fetch(`http://127.0.0.1:${port}/health`, { signal: AbortSignal.timeout(2000) })));
    if (replies.some(r => !r.ok)) throw new Error('Unhealthy');
    res.json({ status: 'ok', services: 3 });
  } catch { res.status(503).json({ status: 'starting' }); }
});
app.use('/api', async (req, res) => {
  const p = req.originalUrl.split('?')[0];
  let port, url = req.originalUrl.replace(/^\/api/, '');
  if (/^\/api\/(login|register)$/.test(p)) port = config.userServicePort;
  else if (/^\/api\/auth\/(login|register)$/.test(p)) { port = config.userServicePort; url = url.replace('/auth', ''); }
  else if (/^\/api\/users\/me$/.test(p)) port = config.userServicePort;
  else if (/^\/api\/apps(?:\/\d+(?:\/(?:releases|download))?)?$/.test(p)) port = config.appServicePort;
  else if (/^\/api\/orders(?:\/\d+(?:\/(?:pay|confirm|cancel|payment-link))?)?$/.test(p)) port = config.orderServicePort;
  else if (/^\/api\/pay\/\d+(?:\/confirm)?$/.test(p)) port = config.orderServicePort;
  else return res.status(404).json({ error: 'API không tồn tại' });
  const headers = { 'Content-Type': req.get('content-type') || 'application/json' };
  for (const key of ['authorization', 'x-app-version', 'x-payment-token']) if (req.get(key)) headers[key] = req.get(key);
  // Never forward browser-supplied internal secrets or identity headers.
  try {
    const response = await fetch(`http://127.0.0.1:${port}${url}`, {
      method: req.method, headers, signal: AbortSignal.timeout(30000),
      body: ['GET', 'HEAD'].includes(req.method) ? undefined : Buffer.isBuffer(req.body) ? req.body : JSON.stringify(req.body || {})
    });
    for (const key of ['content-type', 'content-disposition', 'x-jar-sha256']) if (response.headers.get(key)) res.set(key, response.headers.get(key));
    res.set('Cache-Control', 'private, no-store');
    res.status(response.status).send(Buffer.from(await response.arrayBuffer()));
  } catch { res.status(502).json({ error: 'Dịch vụ tạm thời không phản hồi' }); }
});
app.use('/assets', express.static(path.join(config.rootDir, 'frontend')));
app.get(['/', '/pay/:id'], (req, res) => res.sendFile(path.join(config.rootDir, 'frontend', 'index.html')));
app.use(errors); listen(app, config.gatewayPort, undefined, config.gatewayHost);
