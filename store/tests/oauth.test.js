process.env.NODE_ENV='test';
const assert=require('node:assert/strict'),crypto=require('node:crypto'),jwt=require('jsonwebtoken');
const {createOAuth,providers,installOAuth}=require('../shared/oauth');
const {openDatabase}=require('../shared/db');
const {hash}=require('../shared/auth');
const config=require('../shared/config');
const os=require('node:os'),fs=require('node:fs'),path=require('node:path'),express=require('express');
const testDir=fs.mkdtempSync(path.join(os.tmpdir(),'flint-oauth-test-'));
config.dataDir=testDir;
const env={OAUTH_GOOGLE_CLIENT_ID:'google-test',OAUTH_GOOGLE_CLIENT_SECRET:'google-secret',OAUTH_GITHUB_CLIENT_ID:'github-test',OAUTH_GITHUB_CLIENT_SECRET:'github-secret',OAUTH_FACEBOOK_CLIENT_ID:'123456',OAUTH_FACEBOOK_CLIENT_SECRET:'facebook-secret',FACEBOOK_GRAPH_VERSION:'v24.0'};
const attempt={state:crypto.randomBytes(32).toString('base64url'),verifier:crypto.randomBytes(32).toString('base64url'),nonce:crypto.randomBytes(32).toString('base64url')};
const {privateKey,publicKey}=crypto.generateKeyPairSync('rsa',{modulusLength:2048});
const key={...publicKey.export({format:'jwk'}),kid:'test-rsa-key'};
let googleOverrides={},fbOverrides={},fail=false,badSignature=false,called=[];
const wrongPrivateKey=crypto.generateKeyPairSync('rsa',{modulusLength:2048}).privateKey;
const response=body=>({ok:true,json:async()=>body});
const fetcher=async(url,options)=>{
 called.push({url,options});if(fail)return {ok:false};
 if(url==='https://oauth2.googleapis.com/token'){
  const {aud,iss,exp,...claims}=googleOverrides;
  return response({access_token:'google-access',id_token:jwt.sign({sub:'google-subject',nonce:attempt.nonce,name:'Same name',...claims,...(exp===undefined?{}:{exp})},badSignature?wrongPrivateKey:privateKey,{algorithm:'RS256',keyid:key.kid,issuer:iss||'https://accounts.google.com',audience:aud||env.OAUTH_GOOGLE_CLIENT_ID,...(exp===undefined?{expiresIn:120}:{})})});
 }
 if(url==='https://www.googleapis.com/oauth2/v3/certs')return response({keys:[key]});
 if(url==='https://github.com/login/oauth/access_token')return response({access_token:'github-access'});
 if(url==='https://api.github.com/user')return response({id:9876,name:'Same name',login:'admin',email:'admin@example.test'});
 if(url==='https://graph.facebook.com/v24.0/oauth/access_token')return response({access_token:'facebook-access'});
 if(url.includes('/debug_token?'))return response({data:{is_valid:true,app_id:env.OAUTH_FACEBOOK_CLIENT_ID,user_id:'fb-subject',expires_at:Math.floor(Date.now()/1000)+120,...fbOverrides}});
 if(url.includes('/me?'))return response({id:'fb-subject',name:'Same name'});
 throw Error('Unexpected provider endpoint');
};
async function run(){
 const client=createOAuth({env,fetcher});assert.ok(providers(env).every(p=>p.enabled));assert.ok(!providers({...env,FACEBOOK_GRAPH_VERSION:''}).find(p=>p.id==='facebook').enabled);
 for(const provider of ['google','github','facebook']){
  const url=new URL(client.authorization(provider,attempt));assert.equal(url.searchParams.get('state'),attempt.state);assert.equal(url.searchParams.get('redirect_uri'),config.publicOrigin+'/api/auth/oauth/'+provider+'/callback');
  assert.ok(!url.search.includes('secret'));
  if(provider!=='facebook'){assert.equal(url.searchParams.get('code_challenge_method'),'S256');assert.equal(url.searchParams.get('code_challenge'),crypto.createHash('sha256').update(attempt.verifier).digest('base64url'));}
  const profile=await client.exchange(provider,'temporary-code',attempt);assert.equal(profile.provider,provider);assert.ok(profile.subject);assert.ok(!('access_token' in profile));assert.ok(!('email' in profile));
 }
 const githubExchange=called.find(c=>c.url==='https://github.com/login/oauth/access_token');assert.equal(new URLSearchParams(githubExchange.options.body).get('code_verifier'),attempt.verifier);
 assert.ok(called.every(c=>c.options.redirect==='error'));
 for(const overrides of [{nonce:'wrong'},{aud:'different-client'},{iss:'https://evil.invalid'},{azp:'different-client'},{exp:1}]){
  googleOverrides=overrides;
  await assert.rejects(()=>client.exchange('google','code',attempt));
 }
 googleOverrides={};
 badSignature=true;await assert.rejects(()=>client.exchange('google','code',attempt));badSignature=false;
 for(const overrides of [{app_id:'other-app'},{is_valid:false},{expires_at:1},{data_access_expires_at:1}]){fbOverrides=overrides;await assert.rejects(()=>client.exchange('facebook','code',attempt));}
 fbOverrides={};fail=true;await assert.rejects(()=>client.exchange('github','code',attempt));fail=false;
 // Real route handlers and SQLite validate the browser-bound state, expiry,
 // one-time consumption and redirect allowlist without contacting a provider.
 Object.assign(process.env,env);
 const db=openDatabase('oauth-test');
 await db.exec('CREATE TABLE oauth_attempts(state_hash TEXT PRIMARY KEY,browser_hash TEXT,provider TEXT,verifier TEXT,nonce TEXT,return_path TEXT,expires_at INTEGER,used INTEGER DEFAULT 0)');
 await db.exec("CREATE TABLE users(id INTEGER PRIMARY KEY AUTOINCREMENT,full_name TEXT,username TEXT UNIQUE,password_hash TEXT,role TEXT); CREATE TABLE oauth_accounts(provider TEXT,subject TEXT,user_id INTEGER,UNIQUE(provider,subject)); INSERT INTO users(full_name,username,password_hash,role) VALUES('Same name','admin','existing-admin-hash','ADMIN')");
 const app=express();let sessions=0,issued=[];await installOAuth(app,db,async account=>{sessions++;issued.push(account);},{authorization:client.authorization,exchange:async()=>({provider:'github',subject:'9876',fullName:'Same name'})});
 const server=app.listen(0,'127.0.0.1');await new Promise(resolve=>server.once('listening',resolve));
 const base='http://127.0.0.1:'+server.address().port;
 try{
  const start=await fetch(base+'/auth/oauth/github/start?returnTo=https://evil.invalid',{redirect:'manual'});assert.equal(start.status,302);
  const location=new URL(start.headers.get('location')),state=location.searchParams.get('state'),cookie=start.headers.get('set-cookie').split(';')[0];
  assert.match(start.headers.get('set-cookie'),/HttpOnly/);const stored=await db.get('SELECT * FROM oauth_attempts WHERE state_hash=?',[hash(state)]);assert.equal(stored.return_path,'/');assert.notEqual(stored.browser_hash,cookie.split('=')[1]);
  const callback='/auth/oauth/github/callback?state='+state+'&error=access_denied';
  assert.equal((await fetch(base+callback,{redirect:'manual'})).status,400);
  assert.equal((await fetch(base+callback,{headers:{Cookie:'flint_oauth=wrong'},redirect:'manual'})).status,400);
  assert.equal((await fetch(base+callback.replace('github','google'),{headers:{Cookie:cookie},redirect:'manual'})).status,400);
  const cancelled=await fetch(base+callback,{headers:{Cookie:cookie},redirect:'manual'});assert.equal(cancelled.status,302);assert.equal(cancelled.headers.get('location'),'/#auth-error=cancelled');
  assert.equal((await fetch(base+callback,{headers:{Cookie:cookie},redirect:'manual'})).status,400);assert.equal(sessions,0);
  const next=await fetch(base+'/auth/oauth/google/start',{redirect:'manual'});const nextState=new URL(next.headers.get('location')).searchParams.get('state');await db.run('UPDATE oauth_attempts SET expires_at=1 WHERE state_hash=?',[hash(nextState)]);
  assert.equal((await fetch(base+'/auth/oauth/google/callback?state='+nextState+'&code=code',{headers:{Cookie:next.headers.get('set-cookie').split(';')[0]},redirect:'manual'})).status,400);
  async function socialLogin(){
   const started=await fetch(base+'/auth/oauth/github/start?returnTo=%2F%23publisher',{redirect:'manual'});
   return fetch(base+'/auth/oauth/github/callback?code=code&state='+new URL(started.headers.get('location')).searchParams.get('state'),{headers:{Cookie:started.headers.get('set-cookie').split(';')[0]},redirect:'manual'});
  }
  assert.equal((await socialLogin()).headers.get('location'),'/#publisher');assert.equal(sessions,1);assert.equal(issued[0].role,'CUSTOMER');assert.notEqual(issued[0].id,1);assert.match(issued[0].username,/^social_[0-9a-f]{32}$/);
  await socialLogin();assert.equal(issued[1].id,issued[0].id);assert.equal((await db.get('SELECT COUNT(*) AS n FROM users')).n,2);assert.equal((await db.get('SELECT role FROM users WHERE id=1')).role,'ADMIN');
 }finally{await new Promise(resolve=>server.close(resolve));await db.close();}
 console.log('PASS: mocked Google/GitHub/Facebook contracts, PKCE, OIDC signature/audience/nonce, Facebook app binding, OAuth browser state, replay, expiry and redirect allowlist');
}
run().catch(e=>{console.error(e);process.exitCode=1;}).finally(()=>{if(path.dirname(testDir)===os.tmpdir()&&path.basename(testDir).startsWith('flint-oauth-test-'))fs.rmSync(testDir,{recursive:true,force:true});});
