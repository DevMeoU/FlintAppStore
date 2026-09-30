# Xác minh ngày 30/09/2026

- `npm ci`: cài mới thành công từ lockfile trên Node 22, native SQLite tải được.
- `npm test`: **35/35** kịch bản tích hợp pass sau khi cập nhật `adm-zip 0.6.1`, `sqlite3 6.0.1`.
- `npm audit --omit=dev`: **0 vulnerabilities** tại thời điểm kiểm tra.
- Import 5 JAR thật từ `UI/apps.json` vào SQLite BLOB, giữ SHA-256/dung lượng/manifest. JAR local có thể được chat Java khác build lại; importer giữ lịch sử và thêm phiên bản khi bytes thay đổi.
- Browser QA trên database riêng: admin đăng nhập, chỉnh Flint Music thành giá thử nghiệm 25.000 VND; customer tìm app, tạo đơn `/pay/1`, nhấn thanh toán mô phỏng, thấy PAID và app xuất hiện trong App đã mua.
- Browser tải được `flint-music-ui-edc14c773901.jar` vào Downloads, 68.325 bytes; SHA-256 `edc14c773901aa235a7fbb8bdf2f4cb3dc0b1fb9760a8de218c512a07ef7a6c9` khớp release QA và file nguồn tại thời điểm đó. Sự kiện download của browser tool timeout nhưng file trên filesystem đã được xác minh, nên kết quả tải được dựa trên file/hash thực tế.
- Giá thử nghiệm và đơn QA chỉ nằm trong `data/ui-qa`; 5 app tham khảo trong database chính giữ giá miễn phí.
- `git diff --check`: pass. Nguồn UTT không chỉnh sửa; không commit/push.

Giới hạn: Figma MCP thiếu quyền truy cập; đối chiếu app theo chat Figma, catalog/Java local. Chưa kiểm thử trên thiết bị hoặc Turso remote, chưa tích hợp tiền thật. Download JAR về máy không phải cài trực tiếp lên FlintOS.

## Giao diện tham khảo Microsoft Store

- Đã đổi web sang nền sáng, sidebar icon 88px, tìm kiếm trên header, banner FlintOS, thẻ ứng dụng và icon SVG. Cửa hàng, chi tiết, thư viện, đơn, thanh toán và quản trị dùng chung các token mới.
- Browser xác minh: tìm Music chỉ còn 1 app; tìm từ trang chi tiết chuyển đến danh sách app; chi tiết Home hiển thị phiên bản và nút tải; đăng nhập admin mở được form thông tin và upload JAR. Không thay đổi giá/database để kiểm tra giao diện.
- Mobile viewport 390×844: nội dung thực 375px bằng chiều rộng viewport sau scrollbar, không tràn ngang; điều hướng chuyển xuống dưới. Đã trả browser về kích thước mặc định.
- `npm test` sau đổi giao diện: **35/35 pass**; `node --check frontend/app.js` và `node --check design/figma-microsoft-store/code.js` pass.
- File Figma riêng đã có 12 màn hình editable: https://www.figma.com/design/gj3GI8uLKAMIHM63svfKhD. **Bản cloud chưa đổi sang Microsoft Store**: Starter hết lượt MCP; browser chỉ xem. Plugin đổi 12 màn hình đã chuẩn bị tại `design/figma-microsoft-store`, chưa chạy hay kiểm chứng trực quan trong Figma.
