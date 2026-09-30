const assert = require('node:assert/strict');
const { spawn } = require('node:child_process');
const fs = require('node:fs');
const os = require('node:os');
const path = require('node:path');
const crypto = require('node:crypto');
const AdmZip = require('adm-zip');
const sqlite3 = require('sqlite3');
const root = path.resolve(__dirname, '..');
const data = fs.mkdtempSync(path.join(os.tmpdir(), 'flint-store-test-'));
const basePort = 44330;
const base = `http://127.0.0.1:${basePort}`;
const files = ['gateway/index.js', 'services/user/index.js', 'services/app/index.js', 'services/order/index.js'];
let children = [], output = '', passed = 0;
async function check(name, fn) { await fn(); passed++; console.log(`PASS ${passed}: ${name}`); }
async function start(mode = 'demo') {
  const env = { ...process.env, NODE_ENV: 'test', DATA_DIR: data, PORT: String(basePort), USER_SERVICE_PORT: String(basePort + 1), APP_SERVICE_PORT: String(basePort + 2), ORDER_SERVICE_PORT: String(basePort + 3), JWT_SECRET: 'test-jwt-only', INTERNAL_SERVICE_SECRET: 'test-internal-only', PAYMENT_MODE: mode };
  children = files.map(file => {
    const child = spawn(process.execPath, [path.join(root, file)], { env, stdio: ['ignore', 'pipe', 'pipe'] });
    child.stdout.on('data', b => output += b); child.stderr.on('data', b => output += b); return child;
  });
  for (let n = 0; n < 100; n++) {
    if (children.some(c => c.exitCode !== null)) throw new Error(output);
    try { const r = await fetch(base + '/api/health'); if (r.ok) return; } catch {}
    await new Promise(resolve => setTimeout(resolve, 100));
  }
  throw new Error('Startup timeout: ' + output);
}
async function stop() {
  await Promise.all(children.map(child => new Promise(resolve => { if (child.exitCode !== null) return resolve(); child.once('exit', resolve); child.kill(); })));
  children = [];
}
async function request(url, token, body, method, headers = {}) {
  const response = await fetch(base + '/api' + url, { method: method || (body === undefined ? 'GET' : 'POST'), headers: { ...(token ? { Authorization: 'Bearer ' + token } : {}), ...(body ? { 'Content-Type': 'application/json' } : {}), ...headers }, body: body === undefined ? undefined : JSON.stringify(body) });
  const cookie=response.headers.getSetCookie().find(c=>c.startsWith('flint_session='));
  return { status: response.status, body: await response.json(), session:cookie?decodeURIComponent(cookie.split(';')[0].slice('flint_session='.length)):undefined, cookie:cookie?.split(';')[0], headers:response.headers };
}
async function upload(id, token, bytes, version = '1.0.0', channel='STABLE') {
  const r = await fetch(base + `/api/apps/${id}/releases`, { method: 'POST', headers: { Authorization: 'Bearer ' + token, 'Content-Type': 'application/java-archive', 'X-App-Version': version,'X-Release-Channel':channel }, body: bytes });
  return { status: r.status, body: await r.json() };
}
function jar(version) {
  const zip = new AdmZip();
  zip.addFile('META-INF/MANIFEST.MF', Buffer.from('Manifest-Version: 1.0\r\nMain-Class: Main\r\n\r\n'));
  zip.addFile('Main.class', Buffer.from([0xca, 0xfe, 0xba, 0xbe, 0, 0, 0, version]));
  return zip.toBuffer();
}
async function run() {
  await start();
  let admin, customer, other, free, paid, order, release1, payCapability, cancelledCapability, pendingCapability;
  const jar1 = jar(1), jar2 = jar(2);
  await check('web and 3 services ready', async () => { assert.equal((await fetch(base + '/')).status, 200); assert.equal((await request('/health')).body.services, 3); });
  await check('admin and customer log in', async () => {
    const a = await request('/login', null, { username: 'admin', password: '123456' }); assert.equal(a.status, 200); admin = a.session;
    const c = await request('/auth/login', null, { username: 'customer', password: '123456' }); assert.equal(c.status, 200); customer = c.session;
  });
  await check('invalid password rejected', async () => assert.equal((await request('/login', null, { username: 'admin', password: 'wrong' })).status, 401));
  await check('registration cannot assign admin role', async () => { const r = await request('/register', null, { username: 'other', fullName: 'Other User', password: '1234567890', role: 'ADMIN' }); assert.equal(r.status, 201); assert.equal(r.body.user.role, 'CUSTOMER'); other = r.session; });
  await check('duplicate account rejected', async () => assert.equal((await request('/register', null, { username: 'OTHER', fullName: 'Other User', password: '1234567890' })).status, 409));
  await check('forged identity cannot create app', async () => assert.equal((await request('/apps', null, { slug: 'evil', name: 'Evil' }, 'POST', { 'x-user-id': '1', 'x-user-role': 'ADMIN' })).status, 401));
  await check('anonymous cannot submit an app', async () => assert.equal((await request('/apps', null, { slug: 'evil', name: 'Evil' })).status, 401));
  await check('admin creates free and paid apps', async () => {
    const f = await request('/apps', admin, { slug: 'free-app', name: 'Free app', priceVnd: 0 }); assert.equal(f.status, 201); free = f.body.id;
    const p = await request('/apps', admin, { slug: 'paid-app', name: 'Paid app', priceVnd: 25000 }); assert.equal(p.status, 201); paid = p.body.id;
  });
  await check('invalid price rejected', async () => assert.equal((await request('/apps/' + paid, admin, { priceVnd: -1 }, 'PUT')).status, 400));
  await check('unreleased app cannot be purchased', async () => assert.equal((await request('/orders', customer, { appId: paid })).status, 404));
  await check('malformed JAR rejected', async () => assert.equal((await upload(paid, admin, Buffer.from('not a jar'))).status, 400));
  await check('ZIP without entry point rejected', async () => { const zip = new AdmZip(); zip.addFile('META-INF/MANIFEST.MF', Buffer.from('Manifest-Version: 1.0')); assert.equal((await upload(paid, admin, zip.toBuffer())).status, 400); });
  await check('customer cannot upload release', async () => assert.equal((await upload(paid, customer, jar1)).status, 403));
  await check('admin uploads real UI JAR and versioned paid fixture', async () => {
    const bytes = fs.readFileSync(path.resolve(root, 'tests/fixtures/reference-ui.jar'));
    assert.equal((await upload(free, admin, bytes)).status, 201);
    const p = await upload(paid, admin, jar1); assert.equal(p.status, 201); release1 = p.body.id;
  });
  await check('release version cannot be overwritten', async () => assert.equal((await upload(paid, admin, jar2)).status, 409));
  await check('JAR bytes physically stored as BLOB', async () => {
    const db = new sqlite3.Database(path.join(data, 'app-service-test.db'));
    try { const row = await new Promise((resolve, reject) => db.get('SELECT typeof(jar_blob) AS type,jar_blob,sha256 FROM releases WHERE app_id=?', [paid], (e, r) => e ? reject(e) : resolve(r))); assert.equal(row.type, 'blob'); assert.deepEqual(row.jar_blob, jar1); assert.equal(row.sha256, crypto.createHash('sha256').update(jar1).digest('hex')); }
    finally { await new Promise(resolve => db.close(resolve)); }
  });
  await check('anonymous free download repeated without quota', async () => { for (let i = 0; i < 3; i++) { const r = await fetch(base + `/api/apps/${free}/download`); assert.equal(r.status, 200); assert.equal(r.headers.get('content-type'), 'application/java-archive'); assert.ok((await r.arrayBuffer()).byteLength > 60000); } });
  await check('paid download requires sign-in and payment', async () => {
    assert.equal((await fetch(base + `/api/apps/${paid}/download`)).status, 401);
    assert.equal((await fetch(base + `/api/apps/${paid}/download`, { headers: { Authorization: 'Bearer ' + customer } })).status, 402);
    assert.equal((await fetch(base + `/api/apps/${paid}/download`, { headers: { Authorization: 'Bearer ' + admin } })).status, 402);
  });
  await check('no static or internal route exposes JAR', async () => { assert.equal((await fetch(base + '/api/internal/apps/' + paid)).status, 404); assert.equal((await fetch(base + '/assets/data/app-service.db')).status, 404); });
  await check('public metadata excludes BLOB and manifest', async () => { const r = await request('/apps/' + paid); assert.equal(r.status, 200); assert.ok(!JSON.stringify(r.body).includes('jar_blob')); assert.ok(!JSON.stringify(r.body).includes('Manifest-Version')); });
  await check('order price comes from database', async () => { const r = await request('/orders', customer, { appId: paid, amountVnd: 1, status: 'PAID' }); assert.equal(r.status, 201); assert.equal(r.body.amount_vnd, 25000); assert.equal(r.body.status, 'PENDING'); order = r.body; });
  await check('concurrent order clicks reuse same pending order', async () => { const rs = await Promise.all(Array.from({ length: 5 }, () => request('/orders', customer, { appId: paid }))); rs.forEach(r => assert.equal(r.body.id, order.id)); });
  await check('only buyer/admin can obtain a QR payment link', async () => {
    assert.equal((await request(`/orders/${order.id}/payment-link`)).status,401);
    assert.equal((await request(`/orders/${order.id}/payment-link`,other)).status,404);
    const linked=await request(`/orders/${order.id}/payment-link`,customer);assert.equal(linked.status,200);
    assert.match(linked.body.path,new RegExp(`^/pay/${order.id}#t=[a-f0-9]{64}$`));
    payCapability=linked.body.path.split('#t=')[1];
    assert.equal((await request(`/orders/${order.id}/payment-link`,admin)).body.path,linked.body.path);
  });
  await check('public QR invoice requires the correct order capability and exposes no account data', async () => {
    for(const cap of ['', '0'.repeat(64),customer])assert.equal((await request(`/pay/${order.id}`,null,undefined,'GET',{'X-Payment-Token':cap})).status,404);
    assert.equal((await request(`/pay/${order.id+1}`,null,undefined,'GET',{'X-Payment-Token':payCapability})).status,404);
    const invoice=await request(`/pay/${order.id}`,null,undefined,'GET',{'X-Payment-Token':payCapability});
    assert.equal(invoice.status,200);assert.equal(invoice.body.amount_vnd,25000);assert.equal(invoice.body.status,'PENDING');
    assert.deepEqual(Object.keys(invoice.body).sort(),['id','app_name','amount_vnd','currency','status','payment_code','payment_source','paid_at'].sort());
  });
  await check('public confirm rejects missing/forged token and QR token cannot sign in or download', async () => {
    for(const cap of ['', '0'.repeat(64)])assert.equal((await request(`/pay/${order.id}/confirm`,null,{t:cap})).status,404);
    assert.equal((await request('/users/me',payCapability)).status,401);
    assert.equal((await fetch(base+`/api/apps/${paid}/download`,{headers:{'X-Payment-Token':payCapability}})).status,401);
    assert.equal((await request(`/orders/${order.id}`,payCapability)).status,401);
  });
  await check('other user cannot inspect, pay or cancel order', async () => { for (const suffix of ['', '/pay', '/cancel']) { const r = await request('/orders/' + order.id + suffix, other, suffix ? {} : undefined); assert.equal(r.status, 404); } });
  await check('customer cannot manually confirm payment', async () => assert.equal((await request(`/orders/${order.id}/confirm`, customer, { reference: 'fake' })).status, 403));
  await check('payment link renders without leaking order', async () => { const r = await fetch(base + '/pay/' + order.id); assert.equal(r.status, 200); assert.ok(!(await r.text()).includes(order.payment_code)); });
  await check('QR library is served locally and invoice responses are not cached', async () => {
    const script=await fetch(base+'/assets/vendor/qrcode.min.js');assert.equal(script.status,200);
    const r=await fetch(base+`/api/pay/${order.id}`,{headers:{'X-Payment-Token':payCapability}});assert.equal(r.headers.get('cache-control'),'private, no-store');
    const qr=require('../frontend/vendor/qrcode.min.js')(0,'M');qr.addData(`https://flint-app-store-demo.onrender.com/pay/${order.id}#t=${payCapability}`);qr.make();assert.ok(qr.getModuleCount()>20);
  });
  await check('parallel simulated payments grant one durable right', async () => {
    const rs = await Promise.all(Array.from({ length: 5 }, (_,i) => i%2 ? request(`/orders/${order.id}/pay`, customer, {}) : request(`/pay/${order.id}/confirm`,null,{t:payCapability,amountVnd:1,status:'CANCELLED'})));
    rs.forEach(r => { assert.equal(r.status, 200); assert.equal(r.body.status, 'PAID'); assert.equal(r.body.payment_source, 'DEMO'); });
    assert.equal((await request('/orders', customer)).body.length, 1);
  });
  await check('scanned invoice shows paid receipt; paid orders cannot issue another link', async () => {
    const r=await request(`/pay/${order.id}`,null,undefined,'GET',{'X-Payment-Token':payCapability});assert.equal(r.body.status,'PAID');assert.equal(r.body.amount_vnd,25000);
    assert.equal((await request(`/orders/${order.id}/payment-link`,customer)).status,409);
  });
  await check('paid download is exact original bytes and hash', async () => {
    const r = await fetch(base + `/api/apps/${paid}/download`, { headers: { Authorization: 'Bearer ' + customer } }); assert.equal(r.status, 200); assert.deepEqual(Buffer.from(await r.arrayBuffer()), jar1); assert.equal(r.headers.get('x-jar-sha256'), crypto.createHash('sha256').update(jar1).digest('hex')); assert.equal(r.headers.get('cache-control'), 'private, no-store');
  });
  await check('other account still cannot download paid JAR', async () => assert.equal((await fetch(base + `/api/apps/${paid}/download`, { headers: { Authorization: 'Bearer ' + other } })).status, 402));
  await check('new release and older version both use existing purchase', async () => {
    assert.equal((await upload(paid, admin, jar2, '2.0.0')).status, 201);
    for (const [query, bytes] of [['', jar2], ['?releaseId=' + release1, jar1]]) {
      const r = await fetch(base + `/api/apps/${paid}/download${query}`, { headers: { Authorization: 'Bearer ' + customer } }); assert.equal(r.status, 200); assert.deepEqual(Buffer.from(await r.arrayBuffer()), bytes);
    }
  });
  await check('release ID cannot cross app boundary', async () => assert.equal((await fetch(base + `/api/apps/${free}/download?releaseId=${release1}`)).status, 404));
  await check('paid order cannot be cancelled or repurchased', async () => { assert.equal((await request(`/orders/${order.id}/cancel`, customer, {})).status, 409); assert.equal((await request('/orders', customer, { appId: paid })).body.id, order.id); });
  await check('pending cancel opens no right; repurchase creates new order', async () => {
    const first = (await request('/orders', other, { appId: paid })).body;
    cancelledCapability=(await request(`/orders/${first.id}/payment-link`,other)).body.path.split('#t=')[1];
    assert.equal((await request(`/orders/${first.id}/cancel`, other, {})).status, 200);
    assert.equal((await request(`/orders/${first.id}/pay`, other, {})).status, 409);
    const second = (await request('/orders', other, { appId: paid })).body; assert.notEqual(second.id, first.id);
    pendingCapability=(await request(`/orders/${second.id}/payment-link`,other)).body.path.split('#t=')[1];
    assert.equal((await request(`/pay/${first.id}/confirm`,null,{t:cancelledCapability})).status,409);
    assert.equal((await request(`/pay/${second.id}/confirm`,null,{t:cancelledCapability})).status,404);
  });
  await check('hidden app unavailable to public, visible to admin', async () => {
    assert.equal((await request('/apps/' + free, admin, { published: false }, 'PUT')).status, 200);
    assert.equal((await request('/apps/' + free)).status, 404);
    assert.equal((await fetch(base + `/api/apps/${free}/download`)).status, 404);
    assert.equal((await request('/apps/' + free, admin)).status, 200);
    assert.ok(!(await request('/apps')).body.some(a => a.id === free));
  });
  await check('direct service does not trust forged user headers', async () => {
    const r = await fetch(`http://127.0.0.1:${basePort + 2}/apps`, { method: 'POST', headers: { 'Content-Type': 'application/json', 'x-user-id': '1', 'x-user-role': 'ADMIN' }, body: JSON.stringify({ name: 'Forged', slug: 'forged' }) }); assert.equal(r.status, 401);
    const rights = await fetch(`http://127.0.0.1:${basePort + 3}/internal/entitlements?userId=1&appId=${paid}`); assert.equal(rights.status, 403);
  });
  let submitted, secondSubmission, submittedStable, submittedBeta, betaEnrollment, betaOnly, betaOnlyRelease;
  await check('every user can submit an app but cannot forge ownership or approval',async()=>{
    const r=await request('/apps',customer,{name:'Publisher app',slug:'publisher-app',priceVnd:25000,published:true,owner_user_id:1,review_status:'APPROVED'});
    assert.equal(r.status,201);submitted=r.body.id;assert.equal(r.body.owner_user_id,2);assert.equal(r.body.review_status,'PENDING');assert.equal(r.body.published,0);
    const second=await request('/apps',customer,{name:'Second app',slug:'second-app'});assert.equal(second.status,201);secondSubmission=second.body.id;
    assert.equal((await request('/apps/'+submitted)).status,404);assert.equal((await request('/apps/'+submitted,other)).status,404);
    assert.equal((await request('/apps/'+submitted,customer)).status,200);assert.equal((await request('/apps/'+submitted,admin)).status,200);
    assert.ok(!(await request('/apps')).body.some(a=>a.id===submitted));
  });
  await check('publisher workspace is scoped to each account and cross-owner writes/downloads are denied',async()=>{
    const own=(await request('/publisher/apps',customer)).body;assert.ok(own.some(a=>a.id===submitted));assert.ok(own.every(a=>a.owner_user_id===2));
    assert.ok(!(await request('/publisher/apps',other)).body.some(a=>a.id===submitted));
    assert.equal((await request('/apps/'+submitted,other,{name:'Hijacked'},'PUT')).status,403);
    assert.equal((await upload(submitted,other,jar1)).status,403);
    assert.equal((await request('/apps/'+submitted,customer,{published:true},'PUT')).status,403);
  });
  await check('publisher uploads stable and beta JARs into individual review queues',async()=>{
    const stable=await upload(submitted,customer,jar1,'1.0.0');assert.equal(stable.status,201);submittedStable=stable.body.id;assert.equal(stable.body.review_status,'PENDING');
    const beta=await upload(submitted,customer,jar2,'2.0.0-beta.1','BETA');assert.equal(beta.status,201);submittedBeta=beta.body.id;assert.equal(beta.body.review_status,'PENDING');
    assert.equal((await upload(submitted,customer,jar1,'invalid-channel','CANARY')).status,400);
    assert.equal((await request(`/apps/${submitted}/releases/${submittedStable}/review-download`,other)).status,404);
    const inspected=await fetch(base+`/api/apps/${submitted}/releases/${submittedBeta}/review-download`,{headers:{Authorization:'Bearer '+admin}});assert.equal(inspected.status,200);assert.deepEqual(Buffer.from(await inspected.arrayBuffer()),jar2);
    assert.equal((await fetch(base+`/api/apps/${submitted}/download?releaseId=${submittedBeta}`)).status,404);
  });
  await check('only admin can review apps and JARs; approval does not grant account-wide publishing',async()=>{
    assert.equal((await request(`/apps/${submitted}/review`,customer,{status:'APPROVED'},'PATCH')).status,403);
    assert.equal((await request(`/apps/${submitted}/releases/${submittedStable}/review`,customer,{status:'APPROVED'},'PATCH')).status,403);
    assert.equal((await request(`/apps/${submitted}/review`,admin,{status:'APPROVED'},'PATCH')).status,200);
    const noReleases=(await request('/apps/'+submitted)).body;assert.equal(noReleases.releases.length,0);assert.equal(noReleases.latest_release_id,null);
    assert.equal((await request('/apps/'+secondSubmission)).status,404);assert.equal((await request('/apps/'+secondSubmission,customer)).body.review_status,'PENDING');
    for(const id of [submittedStable,submittedBeta])assert.equal((await request(`/apps/${submitted}/releases/${id}/review`,admin,{status:'APPROVED'},'PATCH')).status,200);
    assert.equal((await request(`/apps/${paid}/releases/${submittedBeta}/review`,admin,{status:'APPROVED'},'PATCH')).status,404);
  });
  await check('approved beta never replaces stable latest or bypasses enrollment',async()=>{
    const row=(await request('/apps/'+submitted)).body;assert.equal(row.latest_release_id,submittedStable);assert.equal(row.latest_beta_release_id,submittedBeta);
    assert.equal((await fetch(base+`/api/apps/${submitted}/download?releaseId=${submittedBeta}`)).status,401);
    assert.equal((await fetch(base+`/api/apps/${submitted}/download?releaseId=${submittedBeta}`,{headers:{Authorization:'Bearer '+other}})).status,403);
    assert.equal((await fetch(base+`/api/apps/${submitted}/download`,{headers:{Authorization:'Bearer '+other}})).status,402);
  });
  await check('beta signup is idempotent, tied to current user, and stays pending until admin approval',async()=>{
    const rs=await Promise.all(Array.from({length:4},()=>request(`/apps/${submitted}/beta-enrollment`,other,{user_id:2,status:'APPROVED'})));
    rs.forEach(r=>{assert.equal(r.status,200);assert.equal(r.body.status,'PENDING');assert.equal(r.body.user_id,3);});betaEnrollment=rs[0].body.id;rs.forEach(r=>assert.equal(r.body.id,betaEnrollment));
    assert.equal((await request('/beta-enrollments',other)).status,403);
    assert.equal((await request('/beta-enrollments/'+betaEnrollment,customer,{status:'APPROVED'},'PATCH')).status,403);
    assert.equal((await request(`/apps/${submitted}/beta-enrollment`,customer)).body.status,'NOT_REGISTERED');
    assert.equal((await request('/beta-enrollments/'+betaEnrollment,admin,{status:'APPROVED'},'PATCH')).status,200);
  });
  await check('approved beta member still must pay; exact bytes unlock after payment',async()=>{
    const path=base+`/api/apps/${submitted}/download?releaseId=${submittedBeta}`,headers={Authorization:'Bearer '+other};
    assert.equal((await fetch(path,{headers})).status,402);
    const order=(await request('/orders',other,{appId:submitted})).body;assert.equal(order.status,'PENDING');
    assert.equal((await request(`/orders/${order.id}/pay`,other,{})).status,200);
    const r=await fetch(path,{headers});assert.equal(r.status,200);assert.deepEqual(Buffer.from(await r.arrayBuffer()),jar2);
    const stable=await fetch(base+`/api/apps/${submitted}/download`,{headers});assert.deepEqual(Buffer.from(await stable.arrayBuffer()),jar1);
  });
  await check('beta approval can be revoked without granting other accounts access',async()=>{
    assert.equal((await request('/beta-enrollments/'+betaEnrollment,admin,{status:'REJECTED',note:'Beta ended'},'PATCH')).status,200);
    assert.equal((await fetch(base+`/api/apps/${submitted}/download?releaseId=${submittedBeta}`,{headers:{Authorization:'Bearer '+other}})).status,403);
    assert.equal((await fetch(base+`/api/apps/${submitted}/download?releaseId=${submittedBeta}`,{headers:{Authorization:'Bearer '+customer}})).status,403);
  });
  await check('free beta-only app is listed but requires enrollment; default stable download has no beta fallback',async()=>{
    betaOnly=(await request('/apps',admin,{name:'Only beta',slug:'only-beta'})).body.id;
    betaOnlyRelease=(await upload(betaOnly,admin,jar2,'0.1-beta','BETA')).body.id;
    const row=(await request('/apps/'+betaOnly)).body;assert.equal(row.latest_release_id,null);assert.equal(row.latest_beta_release_id,betaOnlyRelease);
    assert.equal((await fetch(base+`/api/apps/${betaOnly}/download`)).status,404);
    const enrollment=(await request(`/apps/${betaOnly}/beta-enrollment`,customer,{})).body;
    await request('/beta-enrollments/'+enrollment.id,admin,{status:'APPROVED'},'PATCH');
    const r=await fetch(base+`/api/apps/${betaOnly}/download?releaseId=${betaOnlyRelease}`,{headers:{Authorization:'Bearer '+customer}});assert.equal(r.status,200);assert.deepEqual(Buffer.from(await r.arrayBuffer()),jar2);
  });
  await check('editing published metadata returns that app to review and new JAR remains pending',async()=>{
    const r=await request('/apps/'+submitted,customer,{description:'Updated by publisher',review_status:'APPROVED',owner_user_id:1},'PUT');assert.equal(r.status,200);assert.equal(r.body.review_status,'PENDING');assert.equal(r.body.owner_user_id,2);
    assert.equal((await request('/apps/'+submitted)).status,404);
    const next=await upload(submitted,customer,jar1,'3.0.0');assert.equal(next.body.review_status,'PENDING');
    assert.equal((await request('/apps/'+submitted,admin,{published:true},'PUT')).status,409);
  });
  await check('cookie sessions are HttpOnly, JWT is absent from JSON, and CSRF cross-site requests are blocked',async()=>{
    const login=await request('/login',null,{username:'customer',password:'123456'});assert.equal(login.status,200);assert.ok(!('token' in login.body));
    const cookie=login.headers.get('set-cookie');assert.match(cookie,/HttpOnly/);assert.match(cookie,/SameSite=Lax/);
    assert.equal((await request('/users/me',null,undefined,'GET',{Cookie:login.cookie})).status,200);
    assert.equal((await request('/apps',null,{name:'Blocked',slug:'blocked-csrf'},'POST',{Cookie:login.cookie})).status,403);
    assert.equal((await request('/logout',null,{},'POST',{Cookie:login.cookie,'X-Flint-Request':'1',Origin:'https://evil.invalid'})).status,403);
    assert.equal((await request('/logout',null,{},'POST',{Cookie:login.cookie,'X-Flint-Request':'1',Origin:base})).status,200);
    assert.equal((await request('/users/me',login.session)).status,401);
    assert.equal((await request('/apps',login.session,{name:'Revoked',slug:'revoked'})).status,401);
  });
  await check('server resolves role from database rather than stale JWT claims',async()=>{
    const jwt=require('jsonwebtoken'),claims=jwt.decode(other);
    const forged=jwt.sign({id:claims.id,sid:claims.sid,role:'ADMIN'},'test-jwt-only',{issuer:'flint-store',audience:'flint-store',expiresIn:60});
    assert.equal((await request('/apps/'+secondSubmission+'/review',forged,{status:'APPROVED'},'PATCH')).status,403);
    const legacy=jwt.sign({id:1,role:'ADMIN'},'test-jwt-only',{expiresIn:60});assert.equal((await request('/users/me',legacy)).status,401);
  });
  await check('weak/oversized passwords and reserved social usernames are rejected; OAuth stays disabled without credentials',async()=>{
    for(const password of ['short', 'é'.repeat(37)])assert.equal((await request('/register',null,{username:'bad_password',fullName:'Bad Password',password})).status,400);
    assert.equal((await request('/register',null,{username:'social_reserved',fullName:'Reserved',password:'valid-password-10'})).status,400);
    const providers=(await request('/auth/providers')).body;assert.deepEqual(providers.map(p=>p.id),['google','facebook','github']);assert.ok(providers.every(p=>!p.enabled));
    assert.equal((await request('/auth/oauth/google/start')).status,503);
    assert.equal((await request('/auth/oauth/github/callback?state=bad&code=bad')).status,400);
  });
  await check('login brute force is rate limited without exposing whether username exists',async()=>{
    for(let i=0;i<10;i++)assert.equal((await request('/login',null,{username:'not_existing',password:'invalid-pass'})).status,401);
    assert.equal((await request('/login',null,{username:'not_existing',password:'invalid-pass'})).status,429);
  });
  await check('database survives restart and manual mode disables demo pay', async () => {
    await stop(); await start('manual');
    assert.equal((await request('/config')).body.paymentMode, 'manual');
    assert.equal((await request(`/orders/${order.id}/pay`, customer, {})).status, 403);
    assert.equal((await request(`/pay/${order.id}`,null,undefined,'GET',{'X-Payment-Token':payCapability})).body.status,'PAID');
    assert.equal((await fetch(base + `/api/apps/${paid}/download`, { headers: { Authorization: 'Bearer ' + customer } })).status, 200);
    const pending = (await request('/orders', other)).body.find(o => o.status === 'PENDING');
    assert.equal((await request(`/pay/${pending.id}/confirm`,null,{t:pendingCapability})).status,403);
    assert.equal((await request(`/orders/${pending.id}/confirm`, admin, { reference: 'BANK-TEST-001' })).body.payment_source, 'MANUAL');
    assert.equal((await fetch(base + `/api/apps/${paid}/download`, { headers: { Authorization: 'Bearer ' + other } })).status, 200);
  });
  console.log(`\n${passed}/${passed} integration scenarios passed`);
}
run().catch(error => { console.error(error); console.error(output); process.exitCode = 1; }).finally(async () => {
  await stop();
  const resolved = path.resolve(data);
  if (resolved.startsWith(path.resolve(os.tmpdir()) + path.sep) && path.basename(resolved).startsWith('flint-store-test-')) fs.rmSync(resolved, { recursive: true, force: true });
});
