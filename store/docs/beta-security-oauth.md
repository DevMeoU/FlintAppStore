# Phát hành, beta và đăng nhập xã hội

## Duyệt từng app

Mọi tài khoản đăng nhập đều được mở **Phát hành**, tạo app và upload JAR. Người gửi là nhà phát hành của app đó, chỉ được quản lý app thuộc mình. Không cấp vai trò PUBLISHER vĩnh viễn cho tài khoản: database vẫn dùng CUSTOMER và ADMIN; quyền phát hành được xác định bằng `apps.owner_user_id`.

App của user bắt đầu ở trạng thái PENDING, chưa hiển thị công khai. Admin mở **Quản lý**, tải JAR để kiểm tra, duyệt riêng app và từng phiên bản JAR. Duyệt app cần có ít nhất một JAR đã upload. App chỉ có bản beta được duyệt vẫn có thể hiển thị để người dùng đăng ký beta. JAR đang chờ duyệt không được tải qua API công khai; chủ app và admin có đường tải kiểm tra riêng.

Sửa thông tin hoặc giá bằng tài khoản nhà phát hành đưa app về PENDING và ẩn khỏi kho để admin duyệt lại. Upload JAR mới tạo một phiên bản PENDING bất biến, không ghi đè hoặc thay bytes của bản đã duyệt. Admin có thể từ chối app/JAR và ghi lý do. Một app được duyệt không cấp quyền tự duyệt app khác.

## Beta

Chọn kênh **Beta** khi upload. Sau khi app và JAR beta được duyệt, trang chi tiết hiện **Đăng ký beta**. Admin duyệt từng yêu cầu trong **Quản lý → Duyệt đăng ký beta**, có thể từ chối hoặc thu hồi quyền. Người dùng tải beta sau khi yêu cầu được APPROVED; tải app beta trả phí vẫn cần đơn PAID của chính tài khoản đó. Quyền beta áp dụng cho một user và một app, gồm các bản beta được admin duyệt của app này.

Tải mặc định luôn chọn bản STABLE được duyệt, không tự chuyển sang beta. App chỉ có beta không được tải bằng đường tải ổn định. App miễn phí ổn định vẫn tải không cần đăng nhập. Luồng QR thanh toán mô phỏng được giữ nguyên.

## Bảo mật phiên đăng nhập

- Cookie phiên HttpOnly, SameSite=Lax; production dùng Secure và tên `__Host-flint_session`. Frontend không lưu JWT vào storage và login không trả JWT trong JSON.
- Phiên sống 8 giờ, lưu hash mã phiên trong User Service; logout thu hồi phiên. Mọi service kiểm tra phiên còn hiệu lực và role hiện tại trong database, không tin role của JWT/client.
- Gateway kiểm tra origin chính xác và header `X-Flint-Request: 1` cho thao tác ghi bằng cookie. API không bật CORS. Giới hạn request/đăng nhập và khóa ngắn sau nhiều lần sai mật khẩu; giới hạn này nằm trong RAM, reset khi tiến trình khởi động lại.
- OAuth state dùng một lần, hết hạn sau 10 phút, gắn với cookie trình duyệt. Google/GitHub dùng PKCE S256. Google kiểm tra chữ ký OIDC, issuer, audience, nonce và thời hạn; Facebook kiểm tra token thuộc App ID và user tương ứng.
- Tài khoản xã hội ánh xạ bằng provider + subject, tạo CUSTOMER riêng. Không tự ghép email/tên với tài khoản có sẵn và không cấp quyền admin. Không lưu access token hoặc refresh token của provider.

Đây là tăng cường bảo mật ứng dụng, chưa phải kết quả pentest độc lập. JAR được kiểm tra cấu trúc ZIP/manifest/class/CRC, không có antivirus hoặc sandbox thực thi.

## Cấu hình Render

Trong service `flint-app-store-demo` → Environment, đặt `PUBLIC_ORIGIN=https://flint-app-store-demo.onrender.com` (không dấu `/` cuối). Nếu đổi domain, sửa origin và callback tại từng provider đồng thời. Production yêu cầu JWT_SECRET và INTERNAL_SERVICE_SECRET dài ít nhất 32 ký tự; ADMIN_PASSWORD ít nhất 12 ký tự. Giữ các secret hiện tại nếu đã đáp ứng.

Chỉ thêm credentials cho provider đã tạo. Không gửi Client Secret vào chat hoặc Git. Chưa có credentials thì nút provider hiển thị **Chưa cấu hình** và không khởi tạo OAuth. Lưu environment và redeploy sau khi cấu hình. Nếu dùng Blueprint, không tạo các giá trị `sync: false` bắt buộc cho provider chưa dùng.

| Provider | Biến environment | Callback chính xác |
|---|---|---|
| Google | OAUTH_GOOGLE_CLIENT_ID, OAUTH_GOOGLE_CLIENT_SECRET | https://flint-app-store-demo.onrender.com/api/auth/oauth/google/callback |
| GitHub | OAUTH_GITHUB_CLIENT_ID, OAUTH_GITHUB_CLIENT_SECRET | https://flint-app-store-demo.onrender.com/api/auth/oauth/github/callback |
| Facebook | OAUTH_FACEBOOK_CLIENT_ID, OAUTH_FACEBOOK_CLIENT_SECRET, FACEBOOK_GRAPH_VERSION | https://flint-app-store-demo.onrender.com/api/auth/oauth/facebook/callback |

### Google

Tạo project trong [Google Cloud Console](https://console.cloud.google.com/), cấu hình màn hình đồng ý OAuth và thêm test users nếu còn ở chế độ testing. Tạo OAuth client kiểu Web application; thêm callback Google ở bảng trên vào Authorized redirect URIs. Scope code sử dụng `openid profile`, không yêu cầu email. Xem [hướng dẫn OpenID Connect chính thức](https://developers.google.com/identity/openid-connect/openid-connect). Với local, tạo/thêm callback `http://127.0.0.1:3300/api/auth/oauth/google/callback`.

### GitHub

Trong [Developer settings → OAuth Apps](https://github.com/settings/developers), tạo OAuth App với Homepage URL là origin website và Authorization callback URL là callback GitHub ở bảng. Generate Client Secret rồi nhập trực tiếp vào Render. Code chỉ xin `read:user`. Nên dùng OAuth App riêng khi thử local với callback `http://127.0.0.1:3300/api/auth/oauth/github/callback`. Xem [code flow và PKCE chính thức](https://docs.github.com/en/apps/oauth-apps/building-oauth-apps/authorizing-oauth-apps).

### Facebook

Tạo ứng dụng trong [Meta for Developers](https://developers.facebook.com/apps/), cấu hình use case Facebook Login và Web OAuth login. Thêm callback Facebook ở bảng vào Valid OAuth Redirect URIs, cấu hình domain website và các URL/chính sách Meta yêu cầu cho ứng dụng của bạn. Lấy App ID/App Secret trực tiếp từ dashboard. Đặt FACEBOOK_GRAPH_VERSION theo phiên bản Graph API được dashboard hỗ trợ, dạng `vXX.X`; code không đoán phiên bản hiện hành. Chế độ development chỉ dùng các tài khoản có quyền kiểm thử app; public login cần hoàn tất yêu cầu xuất bản của Meta. Xem [manual login flow](https://developers.facebook.com/docs/facebook-login/guides/advanced/manual-flow/). Nên thử bằng callback HTTPS của Render.

### Xác minh sau cấu hình

Đăng nhập bằng từng provider, xác nhận quay về app và tài khoản chỉ có quyền CUSTOMER. Logout rồi đăng nhập lại phải quay về cùng tài khoản xã hội. Đóng/hủy consent phải trở lại modal đăng nhập; dùng lại callback/state phải bị từ chối. Không kiểm thử bằng cách chia sẻ secret, code hoặc URL callback còn hiệu lực.

Hiện kiểm thử OAuth sử dụng phản hồi provider mô phỏng và route/database thật. Đăng nhập thực tế Google/Facebook/GitHub chưa được xác minh vì chưa tạo OAuth apps.

## Migration và API mới

Migration tự chạy khi khởi động, chỉ thêm cột/bảng; app/release cũ giữ ID, BLOB, giá và quyền hiển thị. App cũ thuộc quản trị, APPROVED; release cũ là STABLE/APPROVED. Phiên JWT cũ không có session ID sẽ cần đăng nhập lại. Sao lưu database trước triển khai; không rollback code cũ mà bỏ qua các ràng buộc duyệt mới.

| API | Quyền |
|---|---|
| POST /api/apps | Mọi tài khoản đăng nhập; user tạo PENDING |
| GET /api/publisher/apps | Các app của chính người gửi |
| PUT /api/apps/:id, POST /api/apps/:id/releases | Chủ app hoặc ADMIN; header X-Release-Channel: STABLE/BETA |
| PATCH /api/apps/:id/review | ADMIN; APPROVED/REJECTED và note |
| PATCH /api/apps/:id/releases/:releaseId/review | ADMIN; kiểm tra release thuộc đúng app |
| GET /api/apps/:id/releases/:releaseId/review-download | Chủ app hoặc ADMIN |
| GET/POST /api/apps/:id/beta-enrollment | Yêu cầu của chính user |
| GET /api/beta-enrollments/mine | Các đăng ký của chính user |
| GET /api/beta-enrollments, PATCH /api/beta-enrollments/:id | ADMIN |
| POST /api/logout | Thu hồi phiên hiện tại |
| GET /api/auth/providers | Metadata provider, không chứa credentials |
| GET /api/auth/oauth/:provider/start, /callback | Code flow, state + cookie bắt buộc ở callback |

Tests chạy trên DB tạm, không chạm Turso thật. Kiểm thử gồm duyệt từng app/JAR, chặn sửa/tải app người khác, stable/beta, duyệt và thu hồi beta, thanh toán, cookie/CSRF/session/role, chống brute force và OAuth mocked contracts.
