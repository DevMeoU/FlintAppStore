const { openDatabase } = require('../../shared/db');
async function createAppDatabase() {
  const db = openDatabase('app-service');
  await db.exec(`PRAGMA foreign_keys=ON;
    CREATE TABLE IF NOT EXISTS apps (
      id INTEGER PRIMARY KEY AUTOINCREMENT, slug TEXT NOT NULL UNIQUE, name TEXT NOT NULL,
      description TEXT NOT NULL DEFAULT '', category TEXT NOT NULL DEFAULT 'Utilities',
      price_vnd INTEGER NOT NULL DEFAULT 0 CHECK(price_vnd>=0), published INTEGER NOT NULL DEFAULT 1 CHECK(published IN (0,1)),
      design_url TEXT NOT NULL DEFAULT '', created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
    );
    CREATE TABLE IF NOT EXISTS releases (
      id INTEGER PRIMARY KEY AUTOINCREMENT, app_id INTEGER NOT NULL REFERENCES apps(id), version TEXT NOT NULL,
      filename TEXT NOT NULL, jar_blob BLOB NOT NULL, sha256 TEXT NOT NULL,
      size_bytes INTEGER NOT NULL, main_class TEXT NOT NULL, manifest TEXT NOT NULL,
      notes TEXT NOT NULL DEFAULT '', created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP, UNIQUE(app_id,version)
    );
    CREATE TABLE IF NOT EXISTS downloads (
      id INTEGER PRIMARY KEY AUTOINCREMENT, app_id INTEGER NOT NULL, release_id INTEGER NOT NULL,
      user_id INTEGER, created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
    );`);
  // Additive migration: preserve legacy app IDs, releases and immutable JAR BLOBs.
  async function addColumns(table, columns) {
    const present = new Set((await db.all(`PRAGMA table_info(${table})`)).map(c => c.name));
    for (const [name, definition] of Object.entries(columns)) if (!present.has(name)) await db.exec(`ALTER TABLE ${table} ADD COLUMN ${name} ${definition}`);
  }
  await addColumns('apps', {
    owner_user_id: 'INTEGER', review_status: "TEXT NOT NULL DEFAULT 'APPROVED' CHECK(review_status IN ('PENDING','APPROVED','REJECTED'))",
    review_note: "TEXT NOT NULL DEFAULT ''", reviewed_by: 'INTEGER', reviewed_at: 'TEXT'
  });
  await addColumns('releases', {
    channel: "TEXT NOT NULL DEFAULT 'STABLE' CHECK(channel IN ('STABLE','BETA'))",
    review_status: "TEXT NOT NULL DEFAULT 'APPROVED' CHECK(review_status IN ('PENDING','APPROVED','REJECTED'))",
    review_note: "TEXT NOT NULL DEFAULT ''", reviewed_by: 'INTEGER', reviewed_at: 'TEXT'
  });
  await db.exec(`CREATE TABLE IF NOT EXISTS beta_enrollments (
    id INTEGER PRIMARY KEY AUTOINCREMENT, app_id INTEGER NOT NULL REFERENCES apps(id), user_id INTEGER NOT NULL,
    status TEXT NOT NULL DEFAULT 'PENDING' CHECK(status IN ('PENDING','APPROVED','REJECTED')),
    review_note TEXT NOT NULL DEFAULT '', reviewed_by INTEGER, reviewed_at TEXT,
    created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP, UNIQUE(app_id,user_id)
  ); CREATE INDEX IF NOT EXISTS release_channel ON releases(app_id,channel,review_status,id);
  CREATE INDEX IF NOT EXISTS beta_queue ON beta_enrollments(status,app_id);`);
  return db;
}
module.exports = { createAppDatabase };
