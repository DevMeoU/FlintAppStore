const AdmZip = require('adm-zip');
const crypto = require('crypto');
const config = require('./config');
function inspectJar(bytes) {
  if (!Buffer.isBuffer(bytes) || !bytes.length || bytes.length > config.maxJarBytes) throw new Error('JAR phải có dữ liệu và không vượt quá 25MB');
  const zip = new AdmZip(bytes);
  const entries = zip.getEntries();
  if (new Set(entries.map(e => e.entryName)).size !== entries.length) throw new Error('JAR có tên mục trùng nhau');
  if (entries.length > 10000 || entries.reduce((sum, e) => sum + e.header.size, 0) > 100 * 1024 * 1024) throw new Error('JAR có quá nhiều mục hoặc kích thước giải nén quá lớn');
  if (entries.some(e => e.entryName.startsWith('/') || e.entryName.includes('\\') || e.entryName.split('/').includes('..') || (e.header.flags & 1))) throw new Error('JAR có đường dẫn hoặc mã hóa không hợp lệ');
  const manifestEntry = zip.getEntry('META-INF/MANIFEST.MF');
  if (!manifestEntry || manifestEntry.header.size > 65536) throw new Error('JAR thiếu manifest hợp lệ');
  const manifest = manifestEntry.getData().toString('utf8').replace(/\r?\n /g, '');
  const mainClass = manifest.match(/^Main-Class:\s*(\S+)\s*$/mi)?.[1];
  const midletClass = manifest.match(/^MIDlet-1:\s*[^,]*,[^,]*,\s*(\S+)\s*$/mi)?.[1];
  const entryPoint = mainClass || midletClass;
  if (!entryPoint || !zip.getEntry(entryPoint.replace(/\./g, '/') + '.class')) throw new Error('JAR cần Main-Class hoặc MIDlet-1 cùng class tương ứng');
  const entryClass = zip.getEntry(entryPoint.replace(/\./g, '/') + '.class').getData();
  if (entryClass.length < 8 || entryClass.readUInt32BE(0) !== 0xcafebabe) throw new Error('Entry point không phải Java class hợp lệ');
  // Verify CRCs without ever extracting to disk or executing uploaded code.
  for (const entry of entries) if (!entry.isDirectory) entry.getData();
  return { sha256: crypto.createHash('sha256').update(bytes).digest('hex'), sizeBytes: bytes.length, mainClass: entryPoint, manifest };
}
module.exports = { inspectJar };
