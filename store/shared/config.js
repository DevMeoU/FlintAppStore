const path = require('path');
const fs = require('fs');
// Node 22+ loads .env without an extra dependency; environment variables take priority.
const rootDir = path.join(__dirname, '..');
if (fs.existsSync(path.join(rootDir, '.env')) && process.loadEnvFile) process.loadEnvFile(path.join(rootDir, '.env'));
const isTest = process.env.NODE_ENV === 'test';
const production = process.env.NODE_ENV === 'production';
const publicDemo = production && process.env.DEPLOYMENT_MODE === 'demo';
if (production && (!process.env.JWT_SECRET || !process.env.INTERNAL_SERVICE_SECRET || !process.env.ADMIN_PASSWORD)) throw new Error('Production requires JWT_SECRET, INTERNAL_SERVICE_SECRET and ADMIN_PASSWORD');
if (production && (process.env.JWT_SECRET.length < 32 || process.env.INTERNAL_SERVICE_SECRET.length < 32 || process.env.ADMIN_PASSWORD.length < 12)) throw new Error('Production secrets require JWT/internal >=32 characters and admin password >=12');
const config = {
  rootDir, isTest, production, publicDemo,
  dataDir: process.env.DATA_DIR || path.join(rootDir, 'data'),
  gatewayPort: Number(process.env.PORT || process.env.GATEWAY_PORT || (isTest ? 4330 : 3300)),
  userServicePort: Number(process.env.USER_SERVICE_PORT || (isTest ? 4331 : 3301)),
  appServicePort: Number(process.env.APP_SERVICE_PORT || (isTest ? 4332 : 3302)),
  orderServicePort: Number(process.env.ORDER_SERVICE_PORT || (isTest ? 4333 : 3303)),
  jwtSecret: process.env.JWT_SECRET || 'flint-store-local-only-jwt',
  internalServiceSecret: process.env.INTERNAL_SERVICE_SECRET || 'flint-store-local-only-internal',
  paymentMode: process.env.PAYMENT_MODE || (production ? 'manual' : 'demo'),
  gatewayHost: process.env.HOST || (process.env.RENDER ? '0.0.0.0' : '127.0.0.1'),
  maxJarBytes: 25 * 1024 * 1024,
  publicOrigin: process.env.PUBLIC_ORIGIN || process.env.RENDER_EXTERNAL_URL || `http://127.0.0.1:${process.env.PORT || process.env.GATEWAY_PORT || (isTest ? 4330 : 3300)}`,
  sessionSeconds: 8 * 60 * 60,
  cookieName: production ? '__Host-flint_session' : 'flint_session',
  dbPath(name) { return path.join(this.dataDir, `${name}${isTest ? '-test' : ''}.db`); }
};
const publicUrl = new URL(config.publicOrigin);
if (publicUrl.origin !== config.publicOrigin || publicUrl.username || publicUrl.password || (production && publicUrl.protocol !== 'https:') || (!production && publicUrl.protocol !== 'https:' && !['127.0.0.1', 'localhost'].includes(publicUrl.hostname))) throw new Error('PUBLIC_ORIGIN must be an exact HTTPS origin (loopback HTTP allowed locally)');
if (!['demo', 'manual'].includes(config.paymentMode) || (production && config.paymentMode === 'demo' && !publicDemo)) throw new Error('Demo payments require DEPLOYMENT_MODE=demo in production');
if (process.env.REQUIRE_TURSO === 'true' && !isTest) {
  for (const name of ['USER_SERVICE','APP_SERVICE','ORDER_SERVICE']) {
    if (!/^(libsql|https):\/\//.test(process.env[`TURSO_${name}_URL`] || '') || !(process.env[`TURSO_${name}_TOKEN`] || process.env.TURSO_TOKEN)) throw new Error(`Missing remote Turso URL/token for ${name}; refusing ephemeral local fallback`);
  }
}
module.exports = config;
