const crypto = require('node:crypto');
const jwt = require('jsonwebtoken');
const config = require('./config');
const { hash, cookies, cookieOptions } = require('./auth');
const { route } = require('./http');
const labels = { google: 'Google', facebook: 'Facebook', github: 'GitHub' };
function providers(env = process.env) {
  return Object.keys(labels).map(id => ({ id, label: labels[id], enabled: !!(env[`OAUTH_${id.toUpperCase()}_CLIENT_ID`] && env[`OAUTH_${id.toUpperCase()}_CLIENT_SECRET`] && (id !== 'facebook' || /^v\d+\.\d+$/.test(env.FACEBOOK_GRAPH_VERSION || ''))) }));
}
function createOAuth({ env = process.env, fetcher = fetch } = {}) {
  const settings = id => ({ id: env[`OAUTH_${id.toUpperCase()}_CLIENT_ID`], secret: env[`OAUTH_${id.toUpperCase()}_CLIENT_SECRET`] });
  const callback = id => config.publicOrigin + '/api/auth/oauth/' + id + '/callback';
  async function json(url, options = {}) {
    const res = await fetcher(url, { ...options, redirect: 'error', signal: AbortSignal.timeout(10000) });
    if (!res.ok) throw new Error('OAUTH_PROVIDER_ERROR');
    const body = await res.json(); if (body.error) throw new Error('OAUTH_PROVIDER_ERROR'); return body;
  }
  function authorization(id, attempt) {
    const s = settings(id);
    const urls = { google: 'https://accounts.google.com/o/oauth2/v2/auth', github: 'https://github.com/login/oauth/authorize', facebook: `https://www.facebook.com/${env.FACEBOOK_GRAPH_VERSION}/dialog/oauth` };
    const url = new URL(urls[id]);
    const params = { client_id: s.id, redirect_uri: callback(id), response_type: 'code', state: attempt.state };
    if (id === 'google') Object.assign(params, { scope: 'openid profile', nonce: attempt.nonce });
    if (id === 'github') Object.assign(params, { scope: 'read:user' });
    if (id === 'facebook') Object.assign(params, { scope: 'public_profile' });
    else Object.assign(params, { code_challenge: crypto.createHash('sha256').update(attempt.verifier).digest('base64url'), code_challenge_method: 'S256' });
    url.search = new URLSearchParams(params).toString(); return url.href;
  }
  async function exchange(id, code, attempt) {
    const s = settings(id);
    const form = { client_id: s.id, client_secret: s.secret, code, redirect_uri: callback(id) };
    if (id !== 'facebook') Object.assign(form, { grant_type: 'authorization_code', code_verifier: attempt.verifier });
    const urls = { google: 'https://oauth2.googleapis.com/token', github: 'https://github.com/login/oauth/access_token', facebook: `https://graph.facebook.com/${env.FACEBOOK_GRAPH_VERSION}/oauth/access_token` };
    const tokens = await json(urls[id], { method: 'POST', headers: { 'Content-Type': 'application/x-www-form-urlencoded', Accept: 'application/json' }, body: new URLSearchParams(form).toString() });
    if (typeof tokens.access_token !== 'string' || !tokens.access_token) throw new Error('OAUTH_PROVIDER_ERROR');
    let profile;
    if (id === 'google') {
      const decoded = jwt.decode(tokens.id_token, { complete: true });
      if (!decoded || decoded.header.alg !== 'RS256' || typeof decoded.header.kid !== 'string') throw new Error('OAUTH_INVALID_IDENTITY');
      const jwks = await json('https://www.googleapis.com/oauth2/v3/certs');
      const key = jwks.keys?.find(k => k.kid === decoded.header.kid && k.kty === 'RSA');
      if (!key) throw new Error('OAUTH_INVALID_IDENTITY');
      const claims = jwt.verify(tokens.id_token, crypto.createPublicKey({ key, format: 'jwk' }), { algorithms: ['RS256'], audience: s.id, issuer: ['https://accounts.google.com','accounts.google.com'] });
      if (!Number.isFinite(claims.exp) || claims.nonce !== attempt.nonce || (claims.azp && claims.azp !== s.id) || typeof claims.sub !== 'string' || !claims.sub) throw new Error('OAUTH_INVALID_IDENTITY');
      profile = { subject: claims.sub, name: claims.name || 'Google user' };
    } else if (id === 'github') {
      const who = await json('https://api.github.com/user', { headers: { Authorization: 'Bearer ' + tokens.access_token, Accept: 'application/vnd.github+json', 'User-Agent': 'FlintAppStore' } });
      if (!Number.isSafeInteger(who.id) || who.id <= 0) throw new Error('OAUTH_INVALID_IDENTITY');
      profile = { subject: String(who.id), name: who.name || who.login || 'GitHub user' };
    } else {
      const debug = new URL(`https://graph.facebook.com/${env.FACEBOOK_GRAPH_VERSION}/debug_token`);
      debug.searchParams.set('input_token', tokens.access_token);
      const checked = (await json(debug.href, { headers: { Authorization: 'Bearer ' + s.id + '|' + s.secret } })).data;
      const now = Math.floor(Date.now()/1000);
      if (!checked?.is_valid || String(checked.app_id) !== s.id || !checked.user_id || !Number.isFinite(checked.expires_at) || checked.expires_at <= now || (checked.data_access_expires_at && checked.data_access_expires_at <= now)) throw new Error('OAUTH_INVALID_IDENTITY');
      const me = new URL(`https://graph.facebook.com/${env.FACEBOOK_GRAPH_VERSION}/me`);
      me.searchParams.set('fields', 'id,name');
      me.searchParams.set('appsecret_proof', crypto.createHmac('sha256', s.secret).update(tokens.access_token).digest('hex'));
      const who = await json(me.href, { headers: { Authorization: 'Bearer ' + tokens.access_token } });
      if (String(who.id) !== String(checked.user_id)) throw new Error('OAUTH_INVALID_IDENTITY');
      profile = { subject: String(who.id), name: who.name || 'Facebook user' };
    }
    if (profile.subject.length > 255) throw new Error('OAUTH_INVALID_IDENTITY');
    return { provider: id, subject: profile.subject, fullName: String(profile.name).slice(0,100) };
  }
  return { authorization, exchange };
}
async function installOAuth(app, db, issueSession, client = createOAuth()) {
  const flowCookie = config.production ? '__Host-flint_oauth' : 'flint_oauth';
  app.get('/auth/providers', (req,res) => res.json(providers()));
  app.get('/auth/oauth/:provider/start', route(async (req,res) => {
    const id = req.params.provider;
    if (!providers().find(p => p.id === id)?.enabled) return res.status(503).json({ error: 'Nhà cung cấp đăng nhập chưa được cấu hình' });
    const state = crypto.randomBytes(32).toString('base64url'), browser = crypto.randomBytes(32).toString('base64url');
    const verifier = crypto.randomBytes(32).toString('base64url'), nonce = crypto.randomBytes(32).toString('base64url');
    const destination = typeof req.query.returnTo === 'string' && /^\/(?:pay\/\d+(?:\?releaseId=\d+)?)?(?:#[a-zA-Z0-9/?=&._-]*)?$/.test(req.query.returnTo) ? req.query.returnTo : '/';
    await db.run('DELETE FROM oauth_attempts WHERE expires_at<?', [Date.now()]);
    await db.run('INSERT INTO oauth_attempts(state_hash,browser_hash,provider,verifier,nonce,return_path,expires_at) VALUES(?,?,?,?,?,?,?)', [hash(state),hash(browser),id,verifier,nonce,destination,Date.now()+10*60000]);
    res.cookie(flowCookie,browser,{...cookieOptions,maxAge:10*60000});
    res.set({ 'Cache-Control':'no-store', 'Referrer-Policy':'no-referrer' }).redirect(client.authorization(id,{state,verifier,nonce}));
  }));
  app.get('/auth/oauth/:provider/callback', route(async (req,res) => {
    res.set({ 'Cache-Control':'no-store', 'Referrer-Policy':'no-referrer' });
    const state = req.query.state, browser = cookies(req)[flowCookie];
    if (typeof state !== 'string' || !/^[\w-]{43}$/.test(state) || typeof browser !== 'string' || !/^[\w-]{43}$/.test(browser)) return res.status(400).json({ error:'Phiên OAuth không hợp lệ. Hãy đăng nhập lại.' });
    const attempt = await db.get('SELECT * FROM oauth_attempts WHERE state_hash=? AND browser_hash=? AND provider=? AND used=0 AND expires_at>?', [hash(state),hash(browser),req.params.provider,Date.now()]);
    if (!attempt) return res.status(400).json({ error:'Phiên OAuth hết hạn hoặc đã được sử dụng' });
    const claimed = await db.run('UPDATE oauth_attempts SET used=1 WHERE state_hash=? AND used=0', [hash(state)]);
    if (!claimed.changes) return res.status(400).json({ error:'Phiên OAuth đã được sử dụng' });
    res.clearCookie(flowCookie,cookieOptions);
    if (req.query.error) return res.redirect('/#auth-error=cancelled');
    try {
      if (typeof req.query.code !== 'string' || req.query.code.length > 4096) throw new Error('OAUTH_INVALID_CODE');
      const profile = await client.exchange(req.params.provider,req.query.code,attempt);
      // Provider subject is authoritative. Never merge accounts using email or username.
      let account = await db.get('SELECT u.* FROM users u JOIN oauth_accounts o ON o.user_id=u.id WHERE o.provider=? AND o.subject=?', [profile.provider,profile.subject]);
      if (!account) {
        const username = 'social_' + crypto.randomBytes(16).toString('hex');
        const result = await db.run('INSERT INTO users(full_name,username,password_hash,role) VALUES(?,?,?,?)', [profile.fullName,username,await require('bcryptjs').hash(crypto.randomBytes(32).toString('base64url'),10),'CUSTOMER']);
        await db.run('INSERT OR IGNORE INTO oauth_accounts(provider,subject,user_id) VALUES(?,?,?)', [profile.provider,profile.subject,result.lastID]);
        account = await db.get('SELECT u.* FROM users u JOIN oauth_accounts o ON o.user_id=u.id WHERE o.provider=? AND o.subject=?', [profile.provider,profile.subject]);
        if (account.id !== result.lastID) await db.run('DELETE FROM users WHERE id=?', [result.lastID]);
      }
      await issueSession(account,res); res.redirect(attempt.return_path);
    } catch { res.redirect('/#auth-error=failed'); }
  }));
}
module.exports = { providers, createOAuth, installOAuth };
