# Flint App Store — Microsoft Store theme

Giao diện web đã áp dụng nền sáng, sidebar icon, tìm kiếm trên cùng, banner và thẻ app lấy bố cục tham khảo từ Microsoft Store. Logo, tên sản phẩm, icon và hình minh họa là Flint.

File Figma cần chỉnh: https://www.figma.com/design/gj3GI8uLKAMIHM63svfKhD

`code.js` là plugin phát triển **đã chuẩn bị, chưa chạy trong Figma** vì tài khoản Starter hết lượt MCP và browser hiện chỉ có quyền xem. Không thể xác nhận kết quả trên cloud cho đến khi chạy plugin trong editor. Plugin không truy cập mạng, database hay thanh toán; giữ nguyên 12 màn hình và component đã có, đổi palette, font nếu có Segoe UI, bố cục sidebar/header và icon app.

Để áp dụng bằng Figma desktop: mở file trên với quyền chỉnh sửa, chọn **Plugins → Development → Import plugin from manifest**, chọn `manifest.json` trong thư mục này, rồi chạy **Flint App Store — Microsoft Store theme**. Dùng Undo nếu cần khôi phục. Plugin chỉ nhận cấu trúc và node ID của file trên; không chạy trên file khác.

12 màn hình: cửa hàng; chi tiết miễn phí; chi tiết trả phí; thanh toán mô phỏng; thanh toán thành công; thư viện đã mua; đơn của tôi; đăng nhập; quản lý app; thông tin và giá; phát hành JAR; quản lý đơn.

Nguồn tham khảo trực quan: https://apps.microsoft.com/home?gl=US&hl=en-GB và https://blogs.windows.com/windowsexperience/2021/10/04/11-things-to-know-about-the-new-microsoft-store-on-windows-11/
