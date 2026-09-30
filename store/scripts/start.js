const { spawn } = require('child_process');
const path = require('path');
require('../shared/config');
const files = ['services/user/index.js', 'services/app/index.js', 'services/order/index.js', 'gateway/index.js'];
const children = files.map(file => spawn(process.execPath, [path.join(__dirname, '..', file)], { stdio: 'inherit', env: process.env }));
let stopping = false;
function stop(code = 0) {
  if (stopping) return; stopping = true;
  for (const child of children) child.kill();
  setTimeout(() => process.exit(code), 1000);
}
for (const child of children) {
  child.on('error', error => { console.error(error.message); stop(1); });
  child.on('exit', code => { if (!stopping) stop(code || 1); });
}
process.on('SIGINT', () => stop()); process.on('SIGTERM', () => stop());
