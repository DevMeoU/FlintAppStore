// Import the reviewed app-only snapshot into the new Turso app database.
// Credentials come only from environment/.env. Users/orders are never copied.
const fs=require('node:fs');
const path=require('node:path');
const sqlite3=require('sqlite3');
const {createAppDatabase}=require('../services/app/db');
const {inspectJar}=require('../shared/jar');
const config=require('../shared/config');
async function main(){
  if(!/^libsql:\/\/|^https:\/\//.test(process.env.TURSO_APP_SERVICE_URL||''))throw new Error('A remote Turso app database URL is required');
  const file=process.env.APP_SNAPSHOT_FILE||path.join(config.dataDir,'turso-app-seed.db');
  if(!fs.existsSync(file))throw new Error('Snapshot file does not exist');
  const local=new sqlite3.Database(file,sqlite3.OPEN_READONLY);
  const query=sql=>new Promise((resolve,reject)=>local.all(sql,(error,rows)=>error?reject(error):resolve(rows)));
  let apps,releases;
  try{
    apps=await query('SELECT * FROM apps ORDER BY id');releases=await query('SELECT * FROM releases ORDER BY id');
    for(const r of releases){const info=inspectJar(Buffer.from(r.jar_blob));if(info.sha256!==r.sha256||info.sizeBytes!==r.size_bytes)throw new Error('Snapshot release hash/size mismatch: '+r.id);}
  }finally{await new Promise((resolve,reject)=>local.close(error=>error?reject(error):resolve()));}
  const db=await createAppDatabase();
  try{
    for(const a of apps){
      const existing=await db.get('SELECT * FROM apps WHERE id=? OR slug=?',[a.id,a.slug]);
      if(existing&&(existing.id!==a.id||existing.slug!==a.slug))throw new Error('App ID conflict; refusing to overwrite remote data');
      if(!existing)await db.run('INSERT INTO apps(id,slug,name,description,category,price_vnd,published,design_url,created_at) VALUES(?,?,?,?,?,?,?,?,?)',[a.id,a.slug,a.name,a.description,a.category,a.price_vnd,a.published,a.design_url,a.created_at]);
    }
    for(const r of releases){
      const existing=await db.get('SELECT id,sha256,app_id,version FROM releases WHERE id=? OR (app_id=? AND version=?)',[r.id,r.app_id,r.version]);
      if(existing){if(existing.id!==r.id||existing.sha256!==r.sha256||existing.app_id!==r.app_id||existing.version!==r.version)throw new Error('Release conflict; refusing to overwrite');continue;}
      await db.run('INSERT INTO releases(id,app_id,version,filename,jar_blob,sha256,size_bytes,main_class,manifest,notes,created_at) VALUES(?,?,?,?,?,?,?,?,?,?,?)',[r.id,r.app_id,r.version,r.filename,Buffer.from(r.jar_blob),r.sha256,r.size_bytes,r.main_class,r.manifest,r.notes,r.created_at]);
    }
    for(const r of releases){const remote=await db.get('SELECT jar_blob FROM releases WHERE id=?',[r.id]);if(inspectJar(Buffer.from(remote.jar_blob)).sha256!==r.sha256)throw new Error('Remote BLOB hash mismatch: '+r.id);}
    console.log(JSON.stringify({database:db.backend,apps:apps.length,releases:releases.length,remoteBlobHashesVerified:true}));
  }finally{await db.close();}
}
main().catch(error=>{console.error(error.message);process.exitCode=1;});
