const assert = require('node:assert/strict');
const {spawnSync} = require('node:child_process');
const path = require('node:path');
const file=path.resolve(__dirname,'../shared/config.js');
const base={...process.env,NODE_ENV:'production',JWT_SECRET:'test-only-jwt'.repeat(4),INTERNAL_SERVICE_SECRET:'test-only-internal'.repeat(3),ADMIN_PASSWORD:'test-only-admin-password',PAYMENT_MODE:'manual',PUBLIC_ORIGIN:'https://store.example.test'};
for(const key of Object.keys(base))if(key.startsWith('TURSO_')||['RENDER','REQUIRE_TURSO','DEPLOYMENT_MODE','HOST'].includes(key))delete base[key];
function run(extra){return spawnSync(process.execPath,['-e',`const c=require(process.argv[1]);console.log(JSON.stringify({paymentMode:c.paymentMode,host:c.gatewayHost,demo:c.publicDemo}))`,file],{env:{...base,...extra},encoding:'utf8'});}
assert.equal(run({PAYMENT_MODE:'demo'}).status,1,'production must reject implicit mock payment');
assert.equal(run({ADMIN_PASSWORD:''}).status,1,'production must require admin secret');
assert.equal(run({JWT_SECRET:'weak'}).status,1,'production rejects weak signing secrets');
assert.equal(run({PUBLIC_ORIGIN:'https://store.example.test/redirect'}).status,1,'callback origin cannot include a path');
assert.equal(run({PUBLIC_ORIGIN:'http://store.example.test'}).status,1,'production must use HTTPS');
assert.equal(run({REQUIRE_TURSO:'true'}).status,1,'cloud must reject ephemeral database fallback');
const required={REQUIRE_TURSO:'true',TURSO_USER_SERVICE_URL:'libsql://user.invalid',TURSO_USER_SERVICE_TOKEN:'test-only-user',TURSO_APP_SERVICE_URL:'libsql://app.invalid',TURSO_APP_SERVICE_TOKEN:'test-only-app',TURSO_ORDER_SERVICE_URL:'libsql://order.invalid',TURSO_ORDER_SERVICE_TOKEN:'test-only-order'};
assert.equal(run(required).status,0);
assert.equal(run({...required,TURSO_APP_SERVICE_URL:'file:ephemeral.db'}).status,1,'cloud must reject local-file URLs');
const demo=run({...required,DEPLOYMENT_MODE:'demo',PAYMENT_MODE:'demo',RENDER:'true'});
assert.equal(demo.status,0);assert.deepEqual(JSON.parse(demo.stdout),{paymentMode:'demo',host:'0.0.0.0',demo:true});
const manual=run({});assert.equal(manual.status,0);assert.equal(JSON.parse(manual.stdout).host,'127.0.0.1');
const nativeFree=spawnSync(process.execPath,['-e',`
  const Module=require('node:module');const original=Module._load;
  Module._load=function(name,...args){
    if(name==='sqlite3'||name==='libsql'||name==='@libsql/client')throw new Error('Native SQLite unavailable on cloud runtime');
    return original.call(this,name,...args);
  };
  const db=require(process.argv[1]).openDatabase('app-service');
  if(db.backend!=='turso')throw new Error('Expected Turso');
  db.close();
`,path.resolve(__dirname,'../shared/db.js')],{env:{...base,...required},encoding:'utf8'});
assert.equal(nativeFree.status,0,nativeFree.stderr);
console.log('PASS: production/demo gates, required secrets, remote database guard, gateway host, Turso without native SQLite');
