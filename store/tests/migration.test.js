process.env.NODE_ENV = 'test';
const assert = require('node:assert/strict');
const fs = require('node:fs'), os = require('node:os'), path = require('node:path');
const config = require('../shared/config');
const { openDatabase } = require('../shared/db');
const { createAppDatabase } = require('../services/app/db');
const temp = fs.mkdtempSync(path.join(os.tmpdir(), 'flint-migration-test-'));
config.dataDir = temp;
async function run() {
  let db = openDatabase('app-service');
  try {
    await db.exec(`CREATE TABLE apps(id INTEGER PRIMARY KEY,slug TEXT UNIQUE,name TEXT,description TEXT,category TEXT,price_vnd INTEGER,published INTEGER,design_url TEXT,created_at TEXT);
      CREATE TABLE releases(id INTEGER PRIMARY KEY,app_id INTEGER,version TEXT,filename TEXT,jar_blob BLOB,sha256 TEXT,size_bytes INTEGER,main_class TEXT,manifest TEXT,notes TEXT,created_at TEXT,UNIQUE(app_id,version));`);
    const bytes = fs.readFileSync(path.join(__dirname,'fixtures/reference-ui.jar'));
    const digest = require('node:crypto').createHash('sha256').update(bytes).digest('hex');
    await db.run("INSERT INTO apps VALUES(17,'legacy','Existing app','','Utilities',25000,0,'','2026-01-01')");
    await db.run("INSERT INTO releases VALUES(31,17,'legacy-v1','legacy.jar',?,?,?,'Main','','','2026-01-01')", [bytes,digest,bytes.length]);
    await db.close(); db = await createAppDatabase();
    const app = await db.get('SELECT * FROM apps WHERE id=17');
    const release = await db.get('SELECT * FROM releases WHERE id=31');
    assert.equal(app.price_vnd,25000); assert.equal(app.published,0); assert.equal(app.owner_user_id,null); assert.equal(app.review_status,'APPROVED');
    assert.equal(app.availability,'AVAILABLE'); assert.equal(app.availability_updated_by,null);
    assert.equal(release.channel,'STABLE'); assert.equal(release.review_status,'APPROVED'); assert.equal(release.sha256,digest); assert.deepEqual(Buffer.from(release.jar_blob),bytes);
    await db.run("UPDATE apps SET availability='UNAVAILABLE',availability_updated_by=1 WHERE id=17");
    await db.close(); db = await createAppDatabase();
    assert.equal((await db.get('SELECT availability FROM apps WHERE id=17')).availability,'UNAVAILABLE');
    assert.equal((await db.get('SELECT COUNT(*) AS n FROM releases')).n,1);
    assert.equal((await db.all('PRAGMA table_info(beta_enrollments)')).length,8);
    console.log('PASS: additive and repeatable migration preserves legacy IDs, price, visibility and real JAR bytes');
  } finally { await db.close(); }
}
run().catch(error => { console.error(error); process.exitCode=1; }).finally(() => {
  const resolved=path.resolve(temp);
  if(path.dirname(resolved)===os.tmpdir() && path.basename(resolved).startsWith('flint-migration-test-')) fs.rmSync(resolved,{recursive:true,force:true});
});
