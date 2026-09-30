const main = document.querySelector('#main');
const dialog = document.querySelector('#auth-dialog');
sessionStorage.removeItem('flint-token');
let user = null, config = {}, apps = [], managedApps = [], orders = [], authMode = 'login', renderId = 0, paymentPoll = null;
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
const isUnavailable = app => app?.availability === 'UNAVAILABLE';
const availabilityBadge = app => isUnavailable(app) ? '<span class="badge cancelled">Unavailable · Đã khóa tải</span>' : '';
const badge = status => `<span class="badge ${status === 'PENDING' ? 'pending' : status === 'CANCELLED' ? 'cancelled' : ''}">${{ PAID: 'Đã thanh toán', PENDING: 'Chờ thanh toán', CANCELLED: 'Đã hủy' }[status]}</span>`;
function toast(message) { const el = document.querySelector('#toast'); el.textContent = message; el.hidden = false; clearTimeout(toast.timer); toast.timer = setTimeout(() => el.hidden = true, 5000); }
async function api(path, options = {}) {
  const response = await fetch('/api' + path, { ...options, credentials:'same-origin', headers: { 'X-Flint-Request':'1', ...options.headers, ...(options.body && !options.raw ? { 'Content-Type': 'application/json' } : {}) }, body: options.body && !options.raw ? JSON.stringify(options.body) : options.body });
  const json = await response.json();
  if (!response.ok) { if (response.status === 401 && user) { user = null; account(); } throw new Error(json.error || 'Không thực hiện được thao tác'); }
  return json;
}
function account() {
  document.querySelector('.demo-hint').hidden = config.demoAccounts === false;
  document.querySelector('#account').innerHTML = user ? `<span class="avatar" title="${esc(user.username)} · ${user.role === 'ADMIN' ? 'Quản trị viên' : 'Khách hàng'}">${esc(user.fullName.charAt(0))}</span><span class="account-name">${esc(user.fullName)}</span>${user.role === 'ADMIN' ? '<a class="button admin-shortcut" href="#admin">Quản trị</a>' : '<span class="account-role">Khách hàng</span>'}<button class="quiet" data-action="logout">Đăng xuất</button>` : '<button class="primary" data-action="login">Đăng nhập</button>';
  document.querySelector('#admin-nav').hidden = user?.role !== 'ADMIN';
  document.querySelector('#publisher-nav').hidden = !user;
}
function openAuth() {
  document.querySelector('#auth-error').textContent = '';
  const destination = encodeURIComponent(location.pathname + location.search + location.hash);
  document.querySelector('#social-auth').innerHTML = (config.authProviders || []).map(p => p.enabled ? `<a class="button social-login" href="/api/auth/oauth/${p.id}/start?returnTo=${destination}">Đăng nhập với ${p.label}</a>` : `<button type="button" class="social-login" disabled title="Chưa có cấu hình OAuth">${p.label} · Chưa cấu hình</button>`).join('');
  dialog.showModal();
}
function enterAdmin() {
  if (user?.role === 'ADMIN' && location.pathname === '/' && ['', '#catalog', '#apps'].includes(location.hash)) {
    navigate('admin'); return true;
  }
  return false;
}
function navigate(route) { if (location.pathname !== '/') history.replaceState(null, '', '/' + location.hash); location.hash = route; }
function card(app) {
  const isOwned = owned(app.id), locked = isUnavailable(app);
  const actionLabel = locked ? 'Unavailable' : !app.latest_release_id ? (app.latest_beta_release_id ? 'Xem beta' : 'Sắp ra mắt') : !app.price_vnd || isOwned ? 'Tải JAR' : 'Mua';
  return `<article class="card"><a class="card-top" href="#app/${app.id}">${appIcon(app)}<div><h3>${esc(app.name)}</h3><p class="muted">${esc(app.category)}${app.latest_beta_release_id ? ' · Beta' : ''}</p></div></a>${availabilityBadge(app)}<div class="card-desc">${esc(app.description)}</div><div class="card-meta"><span>${size(app.size_bytes)}</span><span>· ${app.download_count} lượt tải</span></div><div class="card-bottom"><span class="price">${isOwned ? 'Đã mua' : app.price_vnd ? money(app.price_vnd) : 'Miễn phí'}</span><button data-action="get" data-id="${app.id}" aria-label="${actionLabel} ${esc(app.name)}" ${locked || (!app.latest_release_id && !app.latest_beta_release_id) ? 'disabled' : ''}>${actionLabel}</button></div></article>`;
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
  const app = await api('/apps/' + id);
  const enrollment = user && app.latest_beta_release_id && app.published && app.review_status==='APPROVED' ? await api('/apps/'+id+'/beta-enrollment') : null;
  if (activeRender !== renderId) return;
  main.innerHTML = `<a class="muted" href="#catalog">← Trở về kho app</a><div class="detail-top">${appIcon(app)}<div><span class="eyebrow">${esc(app.category)}</span><h1>${esc(app.name)}</h1><span class="muted">Java archive · FlintOS</span></div></div><div class="two-cols"><section><div class="panel"><h2>Về ứng dụng</h2><p class="muted">${esc(app.description)}</p>${app.design_url ? `<a class="button quiet" href="${esc(app.design_url)}" target="_blank" rel="noreferrer">Xem thiết kế app ↗</a>` : ""}${availabilityBadge(app)}${isUnavailable(app)?'<p class="notice">Admin đã khóa app. Tất cả phiên bản JAR tạm ngừng tải, kể cả app đã mua và beta đã được duyệt.</p>':''}${app.review_status!=='APPROVED'?reviewBadge(app.review_status):''}${app.review_note?'<p class="error">'+esc(app.review_note)+'</p>':''}</div><div class="panel"><h2>Phiên bản JAR</h2>${app.releases.map(r=>releaseRow(app,r,enrollment)).join('')||'<p class="muted">Chưa có phiên bản được phát hành.</p>'}</div></section><aside>${betaPanel(app,enrollment)}<section class="panel"><h2>${owned(app.id)?'Bạn đã sở hữu app':app.price_vnd?money(app.price_vnd):'Miễn phí'}</h2><p class="muted">${isUnavailable(app)?'Tạm ngừng tải mọi phiên bản. Quyền mua và quyền beta hiện có được giữ lại khi admin mở khóa.':app.price_vnd?'Mua một lần, tải lại và cập nhật các bản ổn định. Beta cần được duyệt thêm.':'App ổn định miễn phí được tải tự do. Beta cần đăng ký và được duyệt.'}</p><button class="primary full" data-action="get" data-id="${app.id}" ${isUnavailable(app)||!app.latest_release_id||!app.published||app.review_status!=='APPROVED'?'disabled':''}>${isUnavailable(app)?'Unavailable':app.price_vnd&&!owned(app.id)?'Mua bản ổn định':'Tải JAR ổn định'}</button><div class="info-line"><span>Ổn định</span><span>${esc(app.latest_version||'Chưa phát hành')}</span></div><div class="info-line"><span>Beta</span><span>${esc(app.latest_beta_version||'Chưa phát hành')}</span></div><p class="muted">Chép JAR vào thiết bị và chạy với FlintOS. Chưa hỗ trợ cài trực tiếp từ trình duyệt.</p></section></aside></div>`;
}
function orderTable(rows, admin = false) {
  return `<div class="table-wrap"><table><thead><tr><th>Đơn</th><th>Ứng dụng</th><th>Số tiền</th><th>Trạng thái</th><th>Thao tác</th></tr></thead><tbody>${rows.map(o => `<tr><td>#${o.id}</td><td>${esc(o.app_name)}</td><td>${money(o.amount_vnd)}</td><td>${badge(o.status)}</td><td>${o.status === 'PENDING' ? `<a class="button quiet" href="/pay/${o.id}">QR thanh toán</a> ` + (admin ? `<button data-action="confirm" data-id="${o.id}">Xác nhận</button>` : `<button class="quiet" data-action="cancel" data-id="${o.id}">Hủy</button>`) : o.status === 'PAID' ? `<a class="button quiet" href="#app/${o.app_id}">Xem app</a>` : '—'}</td></tr>`).join('')}</tbody></table></div>`;
}
function scannedPaymentToken() {
  return /^\/pay\/\d+$/.test(location.pathname) ? new URLSearchParams(location.hash.slice(1)).get('t') || '' : '';
}
function paymentQr(link) {
  const qr = window.qrcode(0, 'M');
  qr.addData(link); qr.make();
  return qr.createSvgTag({ cellSize: 6, margin: 24, scalable: true,
    title: 'QR thanh toán đơn ứng dụng', alt: 'Quét để mở hóa đơn và thanh toán mô phỏng' });
}
function watchPayment(id, status, capability, activeRender) {
  const controller = new AbortController(); paymentPoll = controller;
  let timer;
  controller.signal.addEventListener('abort', () => clearTimeout(timer), { once: true });
  const check = async () => {
    if (controller.signal.aborted || activeRender !== renderId) return;
    try {
      if (!document.hidden) {
        const bill = await api(capability ? '/pay/' + id : '/orders/' + id, {
          signal: controller.signal, headers: capability ? { 'X-Payment-Token': capability } : {} });
        if (controller.signal.aborted || activeRender !== renderId) return;
        if (bill.status !== status) return render();
        const label = document.querySelector('#pay-status');
        if (label) label.textContent = 'Đang chờ thanh toán · Tự cập nhật sau khi quét QR';
      }
    } catch {
      if (controller.signal.aborted) return;
      const label = document.querySelector('#pay-status');
      if (label) label.textContent = 'Chưa cập nhật được trạng thái. Hệ thống sẽ thử lại.';
    }
    if (!controller.signal.aborted && activeRender === renderId) timer = setTimeout(check, 3000);
  };
  timer = setTimeout(check, 3000);
}
async function payment(id, activeRender) {
  const capability = scannedPaymentToken();
  if (!capability && !user) { main.innerHTML = '<div class="empty"><h2>Đăng nhập để thanh toán</h2><p>Mở đơn của bạn sau khi đăng nhập, hoặc quét QR thanh toán của đơn.</p><button class="primary" data-action="login">Đăng nhập</button></div>'; return; }
  const order = await api(capability ? '/pay/' + id : '/orders/' + id, { headers: capability ? { 'X-Payment-Token': capability } : {} });
  if (activeRender !== renderId) return;
  const pending = order.status === 'PENDING';
  let link = '';
  if (pending && !capability) {
    let issued;
    try { issued = await api(`/orders/${id}/payment-link`); }
    catch (error) {
      const latest = await api('/orders/' + id);
      if (activeRender !== renderId) return;
      if (latest.status !== order.status) return render();
      throw error;
    }
    if (activeRender !== renderId) return;
    link = new URL(issued.path, location.origin).href;
  }
  const canDownload = !capability && order.user_id === user?.id;
  const locked = isUnavailable(apps.find(a=>a.id===order.app_id));
  main.innerHTML = `<a class="muted" href="${capability ? '#catalog' : user?.role === 'ADMIN' ? '#admin' : '#orders'}">← ${capability ? 'Flint App Store' : user?.role === 'ADMIN' ? 'Quản lý kho' : 'Đơn của tôi'}</a><section class="panel pay-panel"><div class="payment-icon">${order.status === 'PAID' ? '✓' : '↗'}</div><h1 class="full">${order.status === 'PAID' ? 'Thanh toán thành công' : order.status === 'CANCELLED' ? 'Đơn đã hủy' : 'Thanh toán ứng dụng'}</h1><p class="muted full">${esc(order.app_name)} · Đơn #${order.id}</p><div class="payment-total">${money(order.amount_vnd)}</div><div class="info-line"><span>Nội dung chuyển khoản</span><strong class="payment-code">${esc(order.payment_code)}</strong></div><div class="info-line"><span>Trạng thái</span>${badge(order.status)}</div>${link ? `<div class="payment-qr"><h2>Quét QR để thanh toán</h2><p class="muted">Dùng điện thoại quét mã, mở link và nhấn thanh toán mô phỏng.</p><div id="pay-qr" class="qr-code"></div><div class="qr-link-row"><input id="pay-link" aria-label="Link thanh toán QR" readonly value="${esc(link)}"><button data-action="copy-pay-link">Copy link</button></div><a class="button quiet full" href="${esc(link)}" target="_blank" rel="noreferrer">Mở trang thanh toán ↗</a></div>` : ''}<p class="notice">${order.status === 'PAID' ? locked ? 'Đơn đã thanh toán được giữ nguyên, nhưng admin đang khóa tải app (Unavailable). Bạn có thể tải lại khi app được mở khóa.' : 'Quyền tải đã mở cho tài khoản mua app. Quay lại tài khoản đó để tải JAR. Không có tiền thật được chuyển khi thanh toán mô phỏng.' : config.paymentMode === 'demo' ? 'Đây là chuyển khoản mô phỏng. Nhấn nút bên dưới để giả lập thanh toán thành công. Không có tiền thật được chuyển.' : 'Chuyển khoản theo hướng dẫn của quản trị viên. Quyền tải mở sau khi quản trị viên xác nhận.'}</p>${pending ? `<p id="pay-status" class="payment-status" role="status">Đang chờ thanh toán · Tự cập nhật sau khi quét QR</p>` + (config.paymentMode === 'demo' && (capability || canDownload) ? `<button class="primary full" data-action="${capability ? 'pay-linked' : 'pay'}" data-id="${order.id}">Thanh toán mô phỏng · ${money(order.amount_vnd)}</button>` : '<p class="muted">Đang chờ xác nhận thanh toán.</p>') : order.status === 'PAID' && canDownload ? `<button class="primary full" ${locked?'disabled':''} data-action="get" data-id="${order.app_id}" data-release="${/^\d+$/.test(new URLSearchParams(location.search).get('releaseId') || '') ? new URLSearchParams(location.search).get('releaseId') : ''}">${locked?'Unavailable · Admin đã khóa tải':'Tải JAR ngay ↓'}</button>` : '<a class="button full" href="#catalog">Về kho app</a>'}</section>`;
  if (link) {
    try { document.querySelector('#pay-qr').innerHTML = paymentQr(link); }
    catch { document.querySelector('#pay-qr').textContent = 'Chưa tạo được QR. Bạn có thể copy hoặc mở link bên dưới.'; }
    // Keep the full code above the mobile navigation so a camera can scan it.
    if (window.matchMedia('(max-width:600px)').matches) document.querySelector('#pay-qr').scrollIntoView({ block: 'center' });
  }
  if (pending) watchPayment(id, order.status, capability, activeRender);
}
function adminForm(app = {}) {
  const edit = !!app.id;
  return `<form id="app-form" data-id="${app.id || ''}"><h2>${edit ? 'Sửa ứng dụng' : 'Thêm ứng dụng'}</h2><div class="form-grid"><label>Tên app<input name="name" value="${esc(app.name || '')}" required maxlength="100"></label><label>Slug<input name="slug" value="${esc(app.slug || '')}" pattern="[a-z0-9-]{2,80}" required ${edit ? 'readonly' : ''}></label><label>Danh mục<input name="category" value="${esc(app.category || 'Utilities')}" required maxlength="50"></label><label>Giá (VND, 0 = miễn phí)<input name="priceVnd" type="number" min="0" max="100000000" step="1" value="${app.price_vnd || 0}" required></label><label class="wide">Mô tả<textarea name="description" maxlength="4000">${esc(app.description || '')}</textarea></label><label class="wide">Link thiết kế Figma (tùy chọn)<input name="designUrl" type="url" value="${esc(app.design_url || '')}"></label><label class="check"><input name="published" type="checkbox" ${!edit || app.published ? 'checked' : ''}> Hiển thị trong kho</label></div><button class="primary" type="submit">${edit ? 'Lưu thay đổi' : 'Tạo app'}</button>${edit ? ' <button type="button" data-action="admin-reset">Thêm app khác</button>' : ''}</form>`;
}
async function admin(activeRender) { return workspace(false,activeRender); }
async function publisher(activeRender) { return workspace(true,activeRender); }
async function render() {
  paymentPoll?.abort(); paymentPoll = null;
  const current = ++renderId;
  const paymentPath = location.pathname.match(/^\/pay\/(\d+)$/);
  const route = paymentPath ? 'pay/' + paymentPath[1] : location.hash.slice(1) || 'catalog';
  const [page, id] = route.split('?')[0].split('/');
  const names = { catalog: 'Khám phá', app: 'Chi tiết app', library: 'App đã mua', orders: 'Đơn thanh toán', pay: 'Thanh toán', admin: 'Quản lý kho', publisher: 'Nhà phát hành' };
  document.title = `${page === 'apps' ? 'Ứng dụng' : names[page] || 'Khám phá'} · Flint App Store`;
  document.querySelectorAll('[data-nav]').forEach(a => { const selected = a.dataset.nav === page || (page === 'app' && a.dataset.nav === 'apps') || (page === 'pay' && a.dataset.nav === 'orders'); a.classList.toggle('active', selected); if (selected) a.setAttribute('aria-current', 'page'); else a.removeAttribute('aria-current'); });
  main.innerHTML = '<p class="muted">Đang tải…</p>';
  try {
    [apps, orders] = await Promise.all([api('/apps'), user ? api('/orders') : Promise.resolve([])]);
    if (current !== renderId) return;
    if (page === 'app' && /^\d+$/.test(id)) await detail(id, current);
    else if (page === 'pay' && /^\d+$/.test(id)) await payment(id, current);
    else if (page === 'admin') await admin(current);
    else if (page === 'publisher') await publisher(current);
    else if (page === 'library') {
      const list = apps.filter(a => owned(a.id));
      main.innerHTML = `<span class="eyebrow">YOUR COLLECTION</span><h1>App đã mua</h1><p class="muted">Tải lại hoặc cập nhật các ứng dụng bạn đã thanh toán.</p>${list.length ? `<div class="grid">${list.map(card).join('')}</div>` : '<div class="empty">Chưa có app đã mua. App miễn phí tải trực tiếp từ kho.<p><a class="button" href="#catalog">Khám phá app</a></p></div>'}`;
    } else if (page === 'orders') main.innerHTML = `<span class="eyebrow">PAYMENTS</span><h1>Đơn thanh toán</h1><p class="muted">Theo dõi đơn của bạn và tiếp tục thanh toán.</p><div class="panel">${orders.length ? orderTable(orders) : '<div class="empty">Chưa có đơn thanh toán.</div>'}</div>`;
    else catalog(page === 'apps');
  } catch (error) { if (current === renderId) main.innerHTML = `<div class="empty"><p class="error">${esc(error.message)}</p><button data-action="retry">Thử lại</button></div>`; }
}
async function download(id, release, review = false) {
  const path = review ? `/api/apps/${id}/releases/${release}/review-download` : `/api/apps/${id}/download${release ? '?releaseId=' + release : ''}`;
  const response = await fetch(path, { credentials:'same-origin' });
  if (!response.ok) throw new Error((await response.json()).error);
  const blob = await response.blob();
  const url = URL.createObjectURL(blob); const link = document.createElement('a');
  link.href = url; link.download = response.headers.get('content-disposition')?.match(/filename="([^"]+)"/)?.[1] || 'flint-app.jar';
  document.body.append(link); link.click(); link.remove(); setTimeout(() => URL.revokeObjectURL(url), 10000);
  toast(review ? 'Đã tải JAR để kiểm tra trước khi duyệt.' : 'Đã tải JAR. Chép file vào thiết bị để cài đặt.');
}
document.addEventListener('click', async event => {
  const button = event.target.closest('[data-action]'); if (!button) return;
  const { action, id, release } = button.dataset;
  if (action === 'login') return openAuth();
  if (action === 'logout') { try { await api('/logout',{method:'POST',body:{}}); user = null; account(); await render(); } catch(error) { toast(error.message); } return; }
  button.disabled = true;
  try {
    if (action === 'get') {
      const app = apps.find(a => a.id === Number(id));
      if (!app) throw new Error('App không còn trong kho');
      if (isUnavailable(app)) throw new Error('App đang bị admin khóa (Unavailable). Không thể tải JAR.');
      if (!app.latest_release_id && !release && app.latest_beta_release_id) return navigate('app/'+id);
      if (!app.price_vnd || owned(app.id)) await download(id, release);
      else if (!user) openAuth();
      else { const order = await api('/orders', { method: 'POST', body: { appId: app.id } }); if (order.status === 'PAID') { await render(); await download(id, release); } else location.href = '/pay/' + order.id + (release ? '?releaseId='+release : ''); }
    } else if (action === 'join-beta') {
      await api('/apps/'+id+'/beta-enrollment',{method:'POST',body:{}}); toast('Đã đăng ký beta; chờ admin duyệt.'); await render();
    } else if (action === 'review-download') await download(id,release,true);
    else if (['review-app','review-release','review-beta'].includes(action)) {
      const status = button.dataset.status;
      const note = status === 'REJECTED' ? prompt('Ghi chú từ chối / thu hồi quyền:') : '';
      if (note !== null) {
        const path = action === 'review-app' ? '/apps/'+id+'/review' : action === 'review-release' ? `/apps/${id}/releases/${release}/review` : '/beta-enrollments/'+id;
        await api(path,{method:'PATCH',body:{status,note}}); toast('Đã cập nhật quyết định duyệt.'); await render();
      }
    } else if (action === 'availability') {
      await api('/apps/'+id+'/availability',{method:'PATCH',body:{availability:button.dataset.availability}});
      toast(button.dataset.availability==='UNAVAILABLE'?'Đã khóa mọi đường tải JAR của app.':'Đã mở khóa app.'); await render();
    } else if (action === 'copy-pay-link') {
      const input = document.querySelector('#pay-link');
      try { await navigator.clipboard.writeText(input.value); toast('Đã copy link thanh toán.'); }
      catch { input.select(); toast('Hãy copy link đã chọn.'); }
    } else if (action === 'pay-linked') { await api(`/pay/${id}/confirm`, { method: 'POST', body: { t: scannedPaymentToken() } }); toast('Thanh toán mô phỏng thành công.'); await render(); }
    else if (action === 'pay') { await api(`/orders/${id}/pay`, { method: 'POST', body: {} }); toast('Thanh toán mô phỏng thành công. Quyền tải đã mở.'); await render(); }
    else if (action === 'cancel') { await api(`/orders/${id}/cancel`, { method: 'POST', body: {} }); await render(); }
    else if (action === 'confirm') { const reference = prompt('Mã giao dịch chuyển khoản đã nhận:'); if (reference) { await api(`/orders/${id}/confirm`, { method: 'POST', body: { reference } }); await render(); } }
    else if (action === 'edit') { document.querySelector('#admin-form').innerHTML = adminForm(managedApps.find(a => a.id === Number(id))); if (user?.role !== 'ADMIN') document.querySelector('#app-form .check').remove(); document.querySelector('#admin-form').scrollIntoView({ behavior: 'smooth' }); }
    else if (action === 'admin-reset') { document.querySelector('#admin-form').innerHTML = adminForm(); if (user?.role !== 'ADMIN') document.querySelector('#app-form .check').remove(); }
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
      const result = await api('/' + authMode, { method: 'POST', body: values }); user = result.user;
      dialog.close(); account(); if (!enterAdmin()) await render();
    } else if (form.id === 'app-form') {
      values.priceVnd = Number(values.priceVnd); if (user?.role === 'ADMIN') values.published = !!values.published; else delete values.published;
      await api('/apps' + (form.dataset.id ? '/' + form.dataset.id : ''), { method: form.dataset.id ? 'PUT' : 'POST', body: values }); toast(user?.role === 'ADMIN' ? 'Đã lưu app.' : 'Đã gửi app; chờ admin duyệt riêng app này.'); await render();
    } else {
      const file = values.jar;
      if (!file.name.toLowerCase().endsWith('.jar') || file.size > config.maxJarBytes) throw new Error('Chọn file .jar tối đa 25MB');
      await api(`/apps/${values.appId}/releases`, { method: 'POST', raw: true, body: file, headers: { 'Content-Type': 'application/java-archive', 'X-App-Version': values.version, 'X-Release-Channel':values.channel } }); toast(user?.role === 'ADMIN' ? 'Đã phát hành JAR vào database.' : 'Đã gửi JAR; chờ admin duyệt phiên bản.'); await render();
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
  document.querySelector('[name="password"]').minLength = register ? 10 : 6;
  document.querySelector('#auth-toggle').textContent = register ? 'Đã có tài khoản? Đăng nhập' : 'Chưa có tài khoản? Đăng ký';
};
window.addEventListener('hashchange', () => { if (location.pathname !== '/') history.replaceState(null, '', '/' + location.hash); render(); });
(async () => {
  try { config = await api('/config'); document.querySelector('#figma-link').href = config.designUrl; if (config.paymentMode !== 'demo') document.querySelector('footer span').textContent = 'Thanh toán chuyển khoản · Admin xác nhận'; try { user = await api('/users/me'); } catch {} account(); if (!enterAdmin()) await render(); if (location.hash.startsWith('#auth-error=')) { const cancelled = location.hash === '#auth-error=cancelled'; history.replaceState(null,'','/'); toast(cancelled ? 'Bạn đã hủy đăng nhập xã hội.' : 'Chưa đăng nhập được. Hãy thử lại hoặc dùng tài khoản Flint.'); openAuth(); } }
  catch (error) { main.innerHTML = `<p class="error">${esc(error.message)}</p>`; }
})();
