const main = document.querySelector('#main');
const dialog = document.querySelector('#auth-dialog');
let token = sessionStorage.getItem('flint-token') || '';
let user = null, config = {}, apps = [], orders = [], authMode = 'login', renderId = 0;
const esc = value => String(value ?? '').replace(/[&<>"']/g, c => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]));
const money = value => Number(value).toLocaleString('vi-VN') + ' ₫';
const size = value => value ? (value / 1024).toFixed(1) + ' KB' : 'Chưa có JAR';
const iconPaths = {
  home: '<path d="m3 10 9-7 9 7v10H3zM9 20v-7h6v7"/>',
  settings: '<path d="m9 3-1 3-3 1-2 3 2 2-1 3 2 3 3-1 3 3 3-3 3 1 2-3-1-3 2-2-2-3-3-1-1-3z"/><circle cx="12" cy="12" r="3"/>',
  music: '<path d="M10 17V5l10-2v12M10 8l10-2"/><ellipse cx="6.5" cy="18" rx="3.5" ry="2.5"/><ellipse cx="16.5" cy="16" rx="3.5" ry="2.5"/>',
  gallery: '<rect x="3" y="3" width="18" height="18" rx="2"/><circle cx="8" cy="8" r="2"/><path d="m3 18 6-6 4 4 4-6 4 5"/>',
  files: '<path d="M3 7V5h7l2 3h9v12H3zM3 11h18"/>'
};
const glyph = key => `<svg viewBox="0 0 24 24" aria-hidden="true">${iconPaths[key] || iconPaths.home}</svg>`;
const icon = app => iconPaths[app.slug.replace('flint-', '')] ? glyph(app.slug.replace('flint-', '')) : esc(app.name.charAt(0).toUpperCase());
const appIcon = app => `<span class="app-icon icon-${Object.hasOwn(iconPaths, app.slug.replace('flint-', '')) ? app.slug.replace('flint-', '') : 'home'}">${icon(app)}</span>`;
let searchQuery = '';
const owned = id => orders.some(o => o.app_id === id && o.status === 'PAID');
const badge = status => `<span class="badge ${status === 'PENDING' ? 'pending' : status === 'CANCELLED' ? 'cancelled' : ''}">${{ PAID: 'Đã thanh toán', PENDING: 'Chờ thanh toán', CANCELLED: 'Đã hủy' }[status]}</span>`;
function toast(message) { const el = document.querySelector('#toast'); el.textContent = message; el.hidden = false; clearTimeout(toast.timer); toast.timer = setTimeout(() => el.hidden = true, 5000); }
async function api(path, options = {}) {
  const response = await fetch('/api' + path, { ...options, headers: { ...(token ? { Authorization: 'Bearer ' + token } : {}), ...options.headers, ...(options.body && !options.raw ? { 'Content-Type': 'application/json' } : {}) }, body: options.body && !options.raw ? JSON.stringify(options.body) : options.body });
  const json = await response.json();
  if (!response.ok) { if (response.status === 401 && token) { token = ''; user = null; sessionStorage.removeItem('flint-token'); account(); } throw new Error(json.error || 'Không thực hiện được thao tác'); }
  return json;
}
function account() {
  document.querySelector('.demo-hint').hidden = config.demoAccounts === false;
  document.querySelector('#account').innerHTML = user ? `<span class="avatar">${esc(user.fullName.charAt(0))}</span><span class="account-name">${esc(user.fullName)}</span><button class="quiet" data-action="logout">Đăng xuất</button>` : '<button class="primary" data-action="login">Đăng nhập</button>';
  document.querySelector('#admin-nav').hidden = user?.role !== 'ADMIN';
}
function openAuth() { document.querySelector('#auth-error').textContent = ''; dialog.showModal(); }
function navigate(route) { if (location.pathname !== '/') history.replaceState(null, '', '/' + location.hash); location.hash = route; }
function card(app) {
  const isOwned = owned(app.id);
  return `<article class="card"><a class="card-top" href="#app/${app.id}">${appIcon(app)}<div><h3>${esc(app.name)}</h3><p class="muted">${esc(app.category)}</p></div></a><div class="card-desc">${esc(app.description)}</div><div class="card-meta"><span>${size(app.size_bytes)}</span><span>· ${app.download_count} lượt tải</span></div><div class="card-bottom"><span class="price">${isOwned ? 'Đã mua' : app.price_vnd ? money(app.price_vnd) : 'Miễn phí'}</span><button data-action="get" data-id="${app.id}" aria-label="${!app.latest_release_id ? 'Chưa phát hành' : !app.price_vnd || isOwned ? 'Tải JAR' : 'Mua'} ${esc(app.name)}" ${!app.latest_release_id ? 'disabled' : ''}>${!app.latest_release_id ? 'Sắp ra mắt' : !app.price_vnd || isOwned ? 'Tải JAR' : 'Mua'}</button></div></article>`;
}
function catalog(browse = false) {
  const highlights = [['flint-music', 'music', 'Âm nhạc, theo cách của bạn', 'Một giai điệu cho mỗi khoảnh khắc.'], ['flint-gallery', 'gallery', 'Lưu giữ khoảnh khắc', 'Ảnh yêu thích luôn trong tầm tay.']].map(([slug, type, title, description]) => {
    const app = apps.find(a => a.slug === slug); if (!app) return '';
    return `<a class="spotlight ${type}" href="#app/${app.id}"><div><h2>${title}</h2><p>${description}</p><small>${esc(app.name)} · Khám phá →</small></div>${appIcon(app)}</a>`;
  }).join('');
  main.innerHTML = `${browse ? '<div class="page-heading"><h1>Ứng dụng</h1><p class="muted">Tìm ứng dụng phù hợp cho thiết bị Flint của bạn.</p></div>' : `<div class="featured-layout"><section class="hero"><div class="hero-copy"><span class="eyebrow">KHÁM PHÁ FLINTOS</span><h1>Nhỏ gọn.<br>Đầy khả năng.</h1><p>Mọi ứng dụng bạn cần, trong một kho. Khám phá trải nghiệm mới cho thiết bị Flint của bạn.</p><a class="button" href="#apps">Khám phá ngay</a><div class="hero-meta">${apps.length} ứng dụng · Dành cho FlintOS</div></div><div class="hero-visual" aria-hidden="true"><div class="orbit"></div><div class="device"><div class="device-bar"><span>FlintOS</span><span>▰</span></div><div class="device-display"><strong>09:41</strong><small>Chào ngày mới.</small><div class="device-grid">${['home','music','gallery','files'].map(k => `<span>${glyph(k)}</span>`).join('')}</div></div></div><div class="float-icon">${glyph('music')}</div></div></section><div class="spotlights">${highlights || '<div class="spotlight"><h2>Ứng dụng mới đang chờ bạn</h2></div>'}</div></div><div class="category-strip"><a href="#apps">${glyph('home')} Tất cả ứng dụng</a><a href="#apps?price=free">${glyph('files')} Tải miễn phí</a><a href="#apps?price=paid">${glyph('music')} App trả phí</a><a href="#library">${glyph('gallery')} Thư viện của bạn</a></div>`}<div class="section-head"><h2>${browse ? 'Tất cả ứng dụng' : 'Ứng dụng dành cho bạn'}</h2>${browse ? '<span class="muted">Khám phá · Tải về · Trải nghiệm</span>' : '<a href="#apps">Xem tất cả →</a>'}</div><div class="toolbar"><select id="category-filter" aria-label="Danh mục"><option value="">Tất cả danh mục</option>${[...new Set(apps.map(a => a.category))].map(c => `<option>${esc(c)}</option>`).join('')}</select><select id="price-filter" aria-label="Loại giá"><option value="">Tất cả mức giá</option><option value="free">Miễn phí</option><option value="paid">Trả phí</option></select><span class="filter-summary" id="filter-summary"></span></div><div class="grid" id="app-grid"></div>${browse ? '' : '<section class="feature-note"><div><h3>Miễn phí, tải thoải mái</h3><p>App miễn phí luôn sẵn sàng. Không cần tạo đơn.</p></div><div><h3>Mua một lần, dùng lâu dài</h3><p>Thanh toán để mở quyền tải và cập nhật app trả phí.</p></div><div><h3>Dành cho thiết bị Flint</h3><p>Tải JAR, chép vào thiết bị và chạy với FlintOS.</p></div></section>'}`;
  const params = new URLSearchParams(location.hash.split('?')[1] || '');
  document.querySelector('#price-filter').value = ['free', 'paid'].includes(params.get('price')) ? params.get('price') : '';
  ['category-filter', 'price-filter'].forEach(id => document.getElementById(id).addEventListener('input', filterCatalog));
  filterCatalog();
}
function filterCatalog() {
  const grid = document.querySelector('#app-grid'); if (!grid) return;
  const q = searchQuery.trim().toLocaleLowerCase('vi');
  const category = document.querySelector('#category-filter').value, price = document.querySelector('#price-filter').value;
  const result = apps.filter(a => (a.name + ' ' + a.description).toLocaleLowerCase('vi').includes(q) && (!category || a.category === category) && (!price || (price === 'free' ? !a.price_vnd : a.price_vnd > 0)));
  grid.innerHTML = result.length ? result.map(card).join('') : '<div class="empty">Không tìm thấy app phù hợp.</div>';
  document.querySelector('#filter-summary').textContent = `${result.length} ứng dụng${q ? ' · Kết quả tìm kiếm' : ''}`;
}
async function detail(id, activeRender) {
  const app = await api('/apps/' + id); if (activeRender !== renderId) return;
  main.innerHTML = `<a class="muted" href="#catalog">← Trở về kho app</a><div class="detail-top">${appIcon(app)}<div><span class="eyebrow">${esc(app.category)}</span><h1>${esc(app.name)}</h1><span class="muted">Java archive · FlintOS</span></div></div><div class="two-cols"><section><div class="panel"><h2>Về ứng dụng</h2><p class="muted">${esc(app.description)}</p>${/^https:\/\/www\.figma\.com\//.test(app.design_url) ? `<a class="button quiet" href="${esc(app.design_url)}" target="_blank" rel="noreferrer">Xem thiết kế FlintUI ↗</a>` : ''}</div><div class="panel"><h2>Phiên bản JAR</h2>${app.releases.map(r => `<div class="release"><div><strong>${esc(r.version)}</strong><p class="muted">${size(r.size_bytes)} · ${esc(r.main_class)}</p><div class="hash">SHA-256: ${esc(r.sha256)}</div></div><button data-action="get" data-id="${app.id}" data-release="${r.id}">Tải ↓</button></div>`).join('') || '<p class="muted">Chưa có phiên bản được phát hành.</p>'}</div></section><aside class="panel"><h2>${owned(app.id) ? 'Bạn đã sở hữu app' : app.price_vnd ? money(app.price_vnd) : 'Miễn phí'}</h2><p class="muted">${app.price_vnd ? 'Mua một lần, tải lại và cập nhật không giới hạn trên tài khoản này.' : 'Tải và cài thoải mái, không cần thanh toán.'}</p><button class="primary full" data-action="get" data-id="${app.id}" ${!app.latest_release_id ? 'disabled' : ''}>${app.price_vnd && !owned(app.id) ? 'Mua ứng dụng' : 'Tải JAR mới nhất'}</button><div class="info-line"><span>Phiên bản</span><span>${esc(app.latest_version || '—')}</span></div><div class="info-line"><span>Dung lượng</span><span>${size(app.size_bytes)}</span></div><div class="info-line"><span>Lượt tải</span><span>${app.download_count}</span></div><p class="muted">Sau khi tải, chép JAR vào thiết bị và chạy bằng FlintOS. Trình duyệt chưa cài trực tiếp lên thiết bị.</p></aside></div>`;
}
function orderTable(rows, admin = false) {
  return `<div class="table-wrap"><table><thead><tr><th>Đơn</th><th>Ứng dụng</th><th>Số tiền</th><th>Trạng thái</th><th>Thao tác</th></tr></thead><tbody>${rows.map(o => `<tr><td>#${o.id}</td><td>${esc(o.app_name)}</td><td>${money(o.amount_vnd)}</td><td>${badge(o.status)}</td><td>${o.status === 'PENDING' ? admin ? `<button data-action="confirm" data-id="${o.id}">Xác nhận</button>` : `<a class="button" href="/pay/${o.id}">Thanh toán →</a> <button class="quiet" data-action="cancel" data-id="${o.id}">Hủy</button>` : o.status === 'PAID' ? `<a class="button quiet" href="#app/${o.app_id}">Xem app</a>` : '—'}</td></tr>`).join('')}</tbody></table></div>`;
}
async function payment(id, activeRender) {
  if (!user) { main.innerHTML = '<div class="empty"><h2>Đăng nhập để thanh toán</h2><p>Mở đơn của bạn sau khi đăng nhập.</p><button class="primary" data-action="login">Đăng nhập</button></div>'; return; }
  const order = await api('/orders/' + id); if (activeRender !== renderId) return;
  main.innerHTML = `<a class="muted" href="#orders">← Đơn của tôi</a><section class="panel pay-panel"><div class="payment-icon">${order.status === 'PAID' ? '✓' : '↗'}</div><h1 class="full">${order.status === 'PAID' ? 'Thanh toán thành công' : order.status === 'CANCELLED' ? 'Đơn đã hủy' : 'Thanh toán ứng dụng'}</h1><p class="muted full">${esc(order.app_name)} · Đơn #${order.id}</p><div class="payment-total">${money(order.amount_vnd)}</div><div class="info-line"><span>Nội dung chuyển khoản</span><strong class="payment-code">${esc(order.payment_code)}</strong></div><div class="info-line"><span>Trạng thái</span>${badge(order.status)}</div><p class="notice">${config.paymentMode === 'demo' ? 'Đây là chuyển khoản mô phỏng. Nhấn nút bên dưới để giả lập thanh toán thành công. Không có tiền thật được chuyển.' : 'Chuyển khoản theo hướng dẫn của quản trị viên và dùng đúng mã đơn. Quyền tải mở sau khi quản trị viên xác nhận.'}</p>${order.status === 'PENDING' ? config.paymentMode === 'demo' ? `<button class="primary full" data-action="pay" data-id="${order.id}">Thanh toán mô phỏng · ${money(order.amount_vnd)}</button>` : '<p class="muted">Đang chờ quản trị viên xác nhận chuyển khoản.</p>' : order.status === 'PAID' ? `<button class="primary full" data-action="get" data-id="${order.app_id}">Tải JAR ngay ↓</button>` : '<a class="button full" href="#catalog">Về kho app</a>'}</section>`;
  if (order.status === 'PAID') main.querySelector('.notice').textContent = order.payment_source === 'DEMO' ? 'Đã thanh toán mô phỏng. Quyền tải đã mở; không có tiền thật được chuyển.' : 'Đã xác nhận thanh toán. Bạn có thể tải lại mọi phiên bản của app.';
}
function adminForm(app = {}) {
  const edit = !!app.id;
  return `<form id="app-form" data-id="${app.id || ''}"><h2>${edit ? 'Sửa ứng dụng' : 'Thêm ứng dụng'}</h2><div class="form-grid"><label>Tên app<input name="name" value="${esc(app.name || '')}" required maxlength="100"></label><label>Slug<input name="slug" value="${esc(app.slug || '')}" pattern="[a-z0-9-]{2,80}" required ${edit ? 'readonly' : ''}></label><label>Danh mục<input name="category" value="${esc(app.category || 'Utilities')}" required maxlength="50"></label><label>Giá (VND, 0 = miễn phí)<input name="priceVnd" type="number" min="0" max="100000000" step="1" value="${app.price_vnd || 0}" required></label><label class="wide">Mô tả<textarea name="description" maxlength="4000">${esc(app.description || '')}</textarea></label><label class="wide">Link thiết kế Figma (tùy chọn)<input name="designUrl" type="url" value="${esc(app.design_url || '')}"></label><label class="check"><input name="published" type="checkbox" ${!edit || app.published ? 'checked' : ''}> Hiển thị trong kho</label></div><button class="primary" type="submit">${edit ? 'Lưu thay đổi' : 'Tạo app'}</button>${edit ? ' <button type="button" data-action="admin-reset">Thêm app khác</button>' : ''}</form>`;
}
async function admin(activeRender) {
  if (user?.role !== 'ADMIN') { main.innerHTML = '<div class="empty">Đăng nhập bằng tài khoản quản trị để quản lý kho.</div>'; return; }
  const allOrders = await api('/orders?all=1'); if (activeRender !== renderId) return;
  main.innerHTML = `<span class="eyebrow">STORE MANAGEMENT</span><h1>Quản lý kho ứng dụng</h1><p class="muted">Phát hành JAR, chỉnh giá và theo dõi thanh toán.</p><div class="two-cols"><div class="panel" id="admin-form">${adminForm()}</div><section class="panel"><h2>Phát hành phiên bản JAR</h2><form id="release-form"><label>Ứng dụng<select name="appId" required>${apps.map(a => `<option value="${a.id}">${esc(a.name)}</option>`).join('')}</select></label><label>Phiên bản<input name="version" placeholder="1.0.0" required pattern="[a-zA-Z0-9._-]{1,40}"></label><label>File JAR (tối đa 25MB)<input name="jar" type="file" accept=".jar" required></label><p class="muted">File được kiểm tra manifest, entry point và CRC trước khi lưu vào database. Phiên bản đã phát hành không bị ghi đè.</p><button class="primary" type="submit" ${!apps.length ? 'disabled' : ''}>Upload & phát hành</button></form></section></div><section class="panel"><h2>Danh sách ứng dụng</h2>${apps.map(a => `<div class="admin-app"><div><strong>${esc(a.name)}</strong> <span class="muted">${a.published ? 'Đang hiển thị' : 'Đã ẩn'}</span><p class="muted">${a.price_vnd ? money(a.price_vnd) : 'Miễn phí'} · ${esc(a.latest_version || 'Chưa có JAR')}</p></div><div class="action-row"><button data-action="edit" data-id="${a.id}">Sửa thông tin / giá</button><button data-action="publish" data-id="${a.id}">${a.published ? 'Ẩn app' : 'Hiển thị'}</button></div></div>`).join('')}</section><section class="panel"><h2>Tất cả đơn thanh toán</h2>${allOrders.length ? orderTable(allOrders, true) : '<p class="muted">Chưa có đơn.</p>'}</section>`;
}
async function render() {
  const current = ++renderId;
  const paymentPath = location.pathname.match(/^\/pay\/(\d+)$/);
  const route = paymentPath ? 'pay/' + paymentPath[1] : location.hash.slice(1) || 'catalog';
  const [page, id] = route.split('?')[0].split('/');
  const names = { catalog: 'Khám phá', app: 'Chi tiết app', library: 'App đã mua', orders: 'Đơn thanh toán', pay: 'Thanh toán', admin: 'Quản lý kho' };
  document.title = `${page === 'apps' ? 'Ứng dụng' : names[page] || 'Khám phá'} · Flint App Store`;
  document.querySelectorAll('[data-nav]').forEach(a => { const selected = a.dataset.nav === page || (page === 'app' && a.dataset.nav === 'apps') || (page === 'pay' && a.dataset.nav === 'orders'); a.classList.toggle('active', selected); if (selected) a.setAttribute('aria-current', 'page'); else a.removeAttribute('aria-current'); });
  main.innerHTML = '<p class="muted">Đang tải…</p>';
  try {
    [apps, orders] = await Promise.all([api('/apps'), user ? api('/orders') : Promise.resolve([])]);
    if (current !== renderId) return;
    if (page === 'app' && /^\d+$/.test(id)) await detail(id, current);
    else if (page === 'pay' && /^\d+$/.test(id)) await payment(id, current);
    else if (page === 'admin') await admin(current);
    else if (page === 'library') {
      const list = apps.filter(a => owned(a.id));
      main.innerHTML = `<span class="eyebrow">YOUR COLLECTION</span><h1>App đã mua</h1><p class="muted">Tải lại hoặc cập nhật các ứng dụng bạn đã thanh toán.</p>${list.length ? `<div class="grid">${list.map(card).join('')}</div>` : '<div class="empty">Chưa có app đã mua. App miễn phí tải trực tiếp từ kho.<p><a class="button" href="#catalog">Khám phá app</a></p></div>'}`;
    } else if (page === 'orders') main.innerHTML = `<span class="eyebrow">PAYMENTS</span><h1>Đơn thanh toán</h1><p class="muted">Theo dõi đơn của bạn và tiếp tục thanh toán.</p><div class="panel">${orders.length ? orderTable(orders) : '<div class="empty">Chưa có đơn thanh toán.</div>'}</div>`;
    else catalog(page === 'apps');
  } catch (error) { if (current === renderId) main.innerHTML = `<div class="empty"><p class="error">${esc(error.message)}</p><button data-action="retry">Thử lại</button></div>`; }
}
async function download(id, release) {
  const response = await fetch(`/api/apps/${id}/download${release ? '?releaseId=' + release : ''}`, { headers: token ? { Authorization: 'Bearer ' + token } : {} });
  if (!response.ok) throw new Error((await response.json()).error);
  const blob = await response.blob();
  const url = URL.createObjectURL(blob); const link = document.createElement('a');
  link.href = url; link.download = response.headers.get('content-disposition')?.match(/filename="([^"]+)"/)?.[1] || 'flint-app.jar';
  document.body.append(link); link.click(); link.remove(); setTimeout(() => URL.revokeObjectURL(url), 10000);
  toast('Đã tải JAR. Chép file vào thiết bị để cài đặt.');
}
document.addEventListener('click', async event => {
  const button = event.target.closest('[data-action]'); if (!button) return;
  const { action, id, release } = button.dataset;
  if (action === 'login') return openAuth();
  if (action === 'logout') { token = ''; user = null; sessionStorage.removeItem('flint-token'); account(); return render(); }
  button.disabled = true;
  try {
    if (action === 'get') {
      const app = apps.find(a => a.id === Number(id));
      if (!app) throw new Error('App không còn trong kho');
      if (!app.price_vnd || owned(app.id)) await download(id, release);
      else if (!user) openAuth();
      else { const order = await api('/orders', { method: 'POST', body: { appId: app.id } }); if (order.status === 'PAID') { await render(); await download(id, release); } else location.href = '/pay/' + order.id; }
    } else if (action === 'pay') { await api(`/orders/${id}/pay`, { method: 'POST', body: {} }); toast('Thanh toán mô phỏng thành công. Quyền tải đã mở.'); await render(); }
    else if (action === 'cancel') { await api(`/orders/${id}/cancel`, { method: 'POST', body: {} }); await render(); }
    else if (action === 'confirm') { const reference = prompt('Mã giao dịch chuyển khoản đã nhận:'); if (reference) { await api(`/orders/${id}/confirm`, { method: 'POST', body: { reference } }); await render(); } }
    else if (action === 'edit') { document.querySelector('#admin-form').innerHTML = adminForm(apps.find(a => a.id === Number(id))); document.querySelector('#admin-form').scrollIntoView({ behavior: 'smooth' }); }
    else if (action === 'admin-reset') document.querySelector('#admin-form').innerHTML = adminForm();
    else if (action === 'publish') { const app = apps.find(a => a.id === Number(id)); await api('/apps/' + id, { method: 'PUT', body: { published: !app.published } }); await render(); }
    else if (action === 'retry') await render();
  } catch (error) { toast(error.message); }
  finally { button.disabled = false; }
});
document.addEventListener('submit', async event => {
  const form = event.target; if (!['app-form', 'release-form', 'auth-form'].includes(form.id)) return;
  event.preventDefault(); const button = form.querySelector('[type="submit"]'); button.disabled = true;
  try {
    const values = Object.fromEntries(new FormData(form));
    if (form.id === 'auth-form') {
      const result = await api('/' + authMode, { method: 'POST', body: values }); token = result.token; user = result.user;
      sessionStorage.setItem('flint-token', token); dialog.close(); account(); await render();
    } else if (form.id === 'app-form') {
      values.priceVnd = Number(values.priceVnd); values.published = !!values.published;
      await api('/apps' + (form.dataset.id ? '/' + form.dataset.id : ''), { method: form.dataset.id ? 'PUT' : 'POST', body: values }); toast('Đã lưu app.'); await render();
    } else {
      const file = values.jar;
      if (!file.name.toLowerCase().endsWith('.jar') || file.size > config.maxJarBytes) throw new Error('Chọn file .jar tối đa 25MB');
      await api(`/apps/${values.appId}/releases`, { method: 'POST', raw: true, body: file, headers: { 'Content-Type': 'application/java-archive', 'X-App-Version': values.version } }); toast('Đã lưu JAR vào database.'); await render();
    }
  } catch (error) { if (form.id === 'auth-form') document.querySelector('#auth-error').textContent = error.message; else toast(error.message); }
  finally { button.disabled = false; }
});
document.querySelector('[data-close]').onclick = () => dialog.close();
document.querySelector('.skip-link').addEventListener('click', event => {
  event.preventDefault(); main.focus(); main.scrollIntoView({block:'start'});
});
document.querySelector('#search-form').addEventListener('submit', event => {
  event.preventDefault(); searchQuery = document.querySelector('#global-search').value;
  if (!location.pathname.startsWith('/pay/') && ['catalog', 'apps'].includes(location.hash.slice(1).split('?')[0] || 'catalog')) filterCatalog();
  else navigate('apps');
});
document.querySelector('#global-search').addEventListener('input', event => {
  searchQuery = event.target.value;
  if (!location.pathname.startsWith('/pay/') && ['catalog', 'apps'].includes(location.hash.slice(1).split('?')[0] || 'catalog')) filterCatalog();
});
document.querySelector('#auth-toggle').onclick = () => {
  authMode = authMode === 'login' ? 'register' : 'login'; const register = authMode === 'register';
  document.querySelector('#auth-title').textContent = register ? 'Tạo tài khoản Flint' : 'Chào mừng trở lại';
  document.querySelector('#name-label').hidden = !register; document.querySelector('[name="fullName"]').required = register;
  document.querySelector('#auth-toggle').textContent = register ? 'Đã có tài khoản? Đăng nhập' : 'Chưa có tài khoản? Đăng ký';
};
window.addEventListener('hashchange', () => { if (location.pathname !== '/') history.replaceState(null, '', '/' + location.hash); render(); });
(async () => {
  try { config = await api('/config'); document.querySelector('#figma-link').href = config.designUrl; if (config.paymentMode !== 'demo') document.querySelector('footer span').textContent = 'Thanh toán chuyển khoản · Admin xác nhận'; if (token) { try { user = await api('/users/me'); } catch { token = ''; sessionStorage.removeItem('flint-token'); } } account(); await render(); }
  catch (error) { main.innerHTML = `<p class="error">${esc(error.message)}</p>`; }
})();
