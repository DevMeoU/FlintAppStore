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
  return db;
}
module.exports = { createAppDatabase };
