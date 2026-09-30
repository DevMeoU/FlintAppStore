// Create a consistent SQLite snapshot for the Turso dashboard upload.
// Copies apps and JAR history; removes download event records only from the copy.
const fs=require('node:fs');
const path=require('node:path');
const crypto=require('node:crypto');
const sqlite3=require('sqlite3');
const config=require('../shared/config');
const {inspectJar}=require('../shared/jar');
const target=path.join(config.dataDir,'turso-app-seed.db');
const source=config.dbPath('app-service');
function open(file,mode){return new sqlite3.Database(file,mode);}
function run(db,sql,params=[]){return new Promise((resolve,reject)=>db.run(sql,params,error=>error?reject(error):resolve()));}
function all(db,sql){return new Promise((resolve,reject)=>db.all(sql,(error,rows)=>error?reject(error):resolve(rows)));}
function close(db){return new Promise((resolve,reject)=>db.close(error=>error?reject(error):resolve()));}
async function main(){
  if(fs.existsSync(target))throw new Error('Snapshot already exists: '+target);
  if(!fs.existsSync(source))throw new Error('Local app database does not exist');
  const src=open(source,sqlite3.OPEN_READONLY);
  try{await run(src,'VACUUM INTO ?',[target]);}finally{await close(src);}
  const copy=open(target,sqlite3.OPEN_READWRITE);
  try{
    await run(copy,'DELETE FROM downloads');
    const releases=await all(copy,'SELECT * FROM releases');
    for(const release of releases){
      const bytes=Buffer.from(release.jar_blob),info=inspectJar(bytes);
      if(info.sha256!==release.sha256||bytes.length!==release.size_bytes)throw new Error('Corrupt release '+release.id);
    }
    console.log(JSON.stringify({snapshot:target,apps:(await all(copy,'SELECT id FROM apps')).length,releases:releases.length,sha256:crypto.createHash('sha256').update(fs.readFileSync(target)).digest('hex')}));
  }finally{await close(copy);}
}
main().catch(error=>{console.error(error.message);process.exitCode=1;});
