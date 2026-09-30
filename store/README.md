# Flint App Store

Chuyển mô hình `D:\UTT\Đồ án 3\library-microservices-demo` sang kho app Java cho FlintOS. Tái dùng SQLite/Turso wrapper và cách tổ chức Express Gateway + service; dùng JWT, bcrypt và hai vai trò `CUSTOMER`, `ADMIN`.

## Chạy local

Yêu cầu Node.js 22+. Trong thư mục `FlintAppStore/store`:

```powershell
npm.cmd ci
npm.cmd run import:ui
npm.cmd start
```

Mở **http://127.0.0.1:3300**. Tài khoản local: `customer / 123456`, quản trị: `admin / 123456`. Có thể đăng ký tài khoản mới. `Ctrl+C` dừng stack; script chỉ quản lý tiến trình nó tạo, không giết tiến trình theo port.

`import:ui` đọc `../UI/apps.json`, kiểm tra JAR thật rồi lưu bytes trong database. Import lại bỏ qua cùng SHA-256, tạo release mới nếu bytes thay đổi, giữ nguyên giá/quyền hiển thị quản trị đã sửa. Năm app mẫu miễn phí: Flint Home, Settings, Music, Gallery, Files. Các app có thiết kế nhưng chưa có JAR (ví dụ Paint) chưa được phát hành.

## Luồng sử dụng

- Khám phá: tìm tên, lọc danh mục/miễn phí/trả phí, xem các release và SHA-256.
- Miễn phí: tải không cần đăng nhập, không giới hạn lượt tải.
- Trả phí: đăng nhập → Mua app → `/pay/{id}` → quét QR hoặc mở/copy link → **Thanh toán mô phỏng** → tải JAR. Thiết bị quét mở hóa đơn mà không cần đăng nhập; màn hình của người mua tự cập nhật trạng thái sau thanh toán. Chuyển khoản này không chuyển tiền thật; đơn ghi `payment_source=DEMO`.
- App đã mua: tải lại và cập nhật mọi phiên bản của app trên cùng tài khoản, không mua lại.
- Quản lý kho: thêm/sửa thông tin, đặt giá VND (0 = miễn phí), upload release JAR, ẩn/hiện app, xem và xác nhận đơn.
- Admin đăng nhập từ trang chủ sẽ vào thẳng `#admin`, có nút **Quản trị** ở thanh tài khoản và thống kê ứng dụng/đơn. Tài khoản CUSTOMER không có menu hay quyền quản trị; API vẫn kiểm tra JWT và role. Khi đang mở app cụ thể hoặc link QR, đăng nhập giữ nguyên màn hình đó.

Admin mở **QR thanh toán** trong bảng đơn PENDING để khách quét. QR được tạo ngay trong trình duyệt bằng thư viện `qrcode-generator` như nguồn Đồ án 3, kèm giấy phép MIT trong `frontend/vendor/qrcode.LICENSE`. Link dùng token riêng cho từng hóa đơn, đặt trong fragment để không xuất hiện trong URL request/log HTTP. Quyền tải thuộc tài khoản mua app; link hóa đơn chỉ xem thông tin thanh toán và xác nhận mô phỏng cho đúng đơn đó. QR trên bản Render dùng URL HTTPS của website; link localhost chỉ truy cập được trên máy chạy local.

Nút tải tải file về trình duyệt. Cài lên thiết bị bằng cách chép JAR vào thiết bị và chạy bằng FlintOS; chưa có installer từ trình duyệt, chưa kiểm chứng phần cứng. App UI tham khảo [FlintUI Embedded UI Kit](https://www.figma.com/design/fOy5bP1ef3uCQKF5rDnCF9/FlintUI-Embedded-UI-Kit?node-id=13-47), đối chiếu catalog và Java app local. Figma MCP của phiên này không có quyền đọc file; web storefront là bố cục quản lý mới, không tuyên bố sao chép từng pixel Figma.

## Kiến trúc và database

| Thành phần | Port | Dữ liệu |
|---|---:|---|
| Gateway + frontend | 3300 | Proxy API JSON/binary, không public thư mục data |
| User Service | 3301 | `user-service.db`: users, bcrypt hashes |
| App Service | 3302 | `app-service.db`: apps, releases, downloads |
| Order Service | 3303 | `order-service.db`: orders, quyền sở hữu từ trạng thái PAID |

`releases.jar_blob` là **BLOB chứa toàn bộ bytes JAR**; database cũng lưu manifest, entry point, dung lượng, SHA-256, phiên bản. Release bất biến, không ghi đè cùng version. Không có đường dẫn file JAR công khai để bỏ qua kiểm tra quyền.

Gateway chỉ chuyển tiếp JWT; services tự xác minh JWT, không tin `x-user-role`/`x-user-id` do client gửi. API nội bộ có secret riêng, không được expose qua gateway. Dịch vụ local bind loopback. Khi Order Service lỗi, App Service từ chối tải app trả phí. Giá được chụp từ App Service lúc tạo đơn; client không quyết định số tiền. Mua trùng/nhấn thanh toán nhiều lần trả cùng đơn; chuyển trạng thái thanh toán là một câu SQL nguyên tử. Hủy chỉ áp dụng đơn PENDING, không cấp quyền tải.

JAR tối đa 25MB; kiểm tra ZIP, đường dẫn, tổng kích thước giải nén, manifest, Main-Class/MIDlet-1 cùng class tương ứng và CRC. Không thực thi JAR khi upload. Kiểm tra cấu trúc không chứng minh code bên trong an toàn hoặc chạy được trên mọi firmware.

## API

| API | Quyền |
|---|---|
| `POST /api/login`, `/api/register` | Public |
| `GET /api/users/me` | Đăng nhập |
| `GET /api/apps`, `/api/apps/:id` | Public với app hiển thị; ADMIN xem cả app ẩn |
| `POST /api/apps`, `PUT /api/apps/:id` | ADMIN |
| `POST /api/apps/:id/releases` | ADMIN, bytes `application/java-archive`, header `X-App-Version` |
| `GET /api/apps/:id/download?releaseId=...` | Miễn phí public; trả phí cần PAID của tài khoản |
| `GET/POST /api/orders`, `GET /api/orders/:id` | Tài khoản chỉ xem đơn của mình; ADMIN có thể xem tất cả |
| `POST /api/orders/:id/pay` | Chủ đơn; chỉ PAYMENT_MODE=demo |
| `GET /api/orders/:id/payment-link` | Chủ đơn hoặc ADMIN, chỉ đơn PENDING |
| `GET /api/pay/:id` | Token của QR qua header `X-Payment-Token`; trả hóa đơn giới hạn thông tin |
| `POST /api/pay/:id/confirm` | Token của QR qua body `{t}`, chỉ PAYMENT_MODE=demo |
| `POST /api/orders/:id/cancel` | Chủ đơn, PENDING |
| `POST /api/orders/:id/confirm` | ADMIN, cần `reference` |
| `GET /api/config`, `/api/health` | Public |

## Cấu hình và kiểm thử

Copy `.env.example` thành `.env` nếu cần; Node 22 tải tự động. `DATA_DIR` chọn nơi lưu DB local. Wrapper hỗ trợ URL/token Turso riêng từng service. Bản demo Render đã xác minh 5 app, 11 bản JAR trên Turso, tải BLOB khớp SHA-256 và quyền tải sau thanh toán mô phỏng. Giới hạn upload của ứng dụng là 25MB; kích thước tối đa này chưa được kiểm chứng trên Turso.

```powershell
npm.cmd test
```

40 kiểm thử tích hợp dùng thư mục tạm và port 44330–44333, không sửa catalog thật. Kiểm tra RBAC, bytes BLOB, tải miễn phí, chặn trả phí, quyền truy cập link QR, token giả/sai đơn/đơn đã hủy, thanh toán lặp/concurrent giữa QR và chủ đơn, phiên bản, hash, restart, chế độ manual.

`PAYMENT_MODE=demo` mặc định cho local. `NODE_ENV=production` bắt buộc `JWT_SECRET`, `INTERNAL_SERVICE_SECRET`, `ADMIN_PASSWORD`. Deploy thử có thể bật `DEPLOYMENT_MODE=demo` để giữ thanh toán mô phỏng; nếu không có flag này, production chỉ cho `PAYMENT_MODE=manual`. Chế độ manual cần admin xác nhận mã giao dịch sau khi nhận tiền; chưa tích hợp ngân hàng/cổng thanh toán. Bản public không tạo tài khoản customer mặc định. Xem [triển khai Render + Turso](docs/deploy-render-turso.md).

Nguồn UTT không bị sửa hoặc mang theo database, credentials, ảnh bìa sách hay lịch sử mượn. Các project Java trong FlintAppStore giữ nguyên.
