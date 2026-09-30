const fs = require('fs');
const path = require('path');
const { createAppDatabase } = require('../services/app/db');
const { inspectJar } = require('../shared/jar');
async function main() {
  const uiDir = path.resolve(__dirname, '..', '..', 'UI');
  const catalog = JSON.parse(fs.readFileSync(path.join(uiDir, 'apps.json'), 'utf8'));
  // Validate every existing input before any mutation. Imported reference apps are free.
  const inputs = catalog.apps.map(app => {
    const file = path.resolve(uiDir, app.artifact);
    if (!file.startsWith(uiDir + path.sep)) throw new Error('Artifact outside UI directory');
    const bytes = fs.readFileSync(file); return { app, bytes, info: inspectJar(bytes) };
  });
  const db = await createAppDatabase();
  try {
    for (const { app, bytes, info } of inputs) {
      const slug = app.id.toLowerCase();
      let row = await db.get('SELECT * FROM apps WHERE slug=?', [slug]);
      if (!row) {
        const result = await db.run('INSERT INTO apps(slug,name,description,category,design_url) VALUES(?,?,?,?,?)', [slug, app.name, `App tham khảo FlintUI 240×320. Màn hình: ${app.screens.join(', ')}. Chưa kiểm chứng trên thiết bị.`, app.category, catalog.design]);
        row = { id: result.lastID };
      }
      if (await db.get('SELECT id FROM releases WHERE app_id=? AND sha256=?', [row.id, info.sha256])) { console.log(`Unchanged: ${app.name}`); continue; }
      const version = `ui-${info.sha256.slice(0,12)}`;
      await db.run('INSERT INTO releases(app_id,version,filename,jar_blob,sha256,size_bytes,main_class,manifest,notes) VALUES(?,?,?,?,?,?,?,?,?)', [row.id, version, `${slug}-${version}.jar`, bytes, info.sha256, info.sizeBytes, info.mainClass, info.manifest, 'Imported from UI/apps.json; host build verified; device unverified']);
      console.log(`Imported: ${app.name} ${version} ${info.sizeBytes} bytes SHA256=${info.sha256}`);
    }
  } finally { await db.close(); }
}
main().catch(error => { console.error(error.message); process.exit(1); });
