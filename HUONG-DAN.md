# Hướng dẫn dùng bản riêng

## 1. Cho GitHub tự build app (làm một lần)

Mở repo này trên GitHub → **Settings → Secrets and variables → Actions → New repository secret**, thêm 4 secret:

| Tên secret | Giá trị |
|---|---|
| `BAO_KEYSTORE_BASE64` | toàn bộ nội dung file `release.jks.base64.txt` |
| `BAO_KEYSTORE_PASSWORD` | nội dung file `password.txt` |
| `BAO_KEY_PASSWORD` | nội dung file `password.txt` (giống dòng trên) |
| `BAO_KEY_ALIAS` | `nhacrieng` |

> ⚠️ **Cất giữ file `release.jks` và `password.txt` thật kỹ** (Google Drive riêng, USB…). Mất khoá này thì các bản sau không cài đè lên app cũ được: phải sao lưu trong app, gỡ, cài lại, khôi phục. Không bao giờ đưa khoá lên repo.

Sau đó vào tab **Actions → Personal release (Android) → Run workflow**. Khoảng 20–40 phút sau, mục **Releases** có file APK.

## 2. Cài lên điện thoại

1. Trên điện thoại, mở trang **Releases** của repo, tải `NhacNheo-arm64-v8a.apk` (máy cũ/lạ thì lấy bản `universal`).
2. Mở file, cho phép "cài từ nguồn này" nếu được hỏi, bấm **Cài đặt** (Play Protect cảnh báo thì chọn *Vẫn cài đặt*).
3. App mở lên là dùng được, **không cần server nào**.

Mỗi lần có commit mới trên `main`, GitHub build bản mới; app sẽ hiện thẻ "Cập nhật" trên trang chủ, bấm thì mới cài.

> Repo để **private** thì app không tự thấy bản mới (GitHub không cho đọc Releases của repo riêng tư khi chưa đăng nhập). Khi đó anh tải APK thủ công trong Releases.

## 3. Server đồng bộ miễn phí (không bắt buộc)

Dùng khi muốn nghe dở máy này, mở máy kia nghe tiếp, và đăng nhập YouTube một lần cho mọi máy. Chạy trên **Cloudflare Workers gói free, không cần thẻ**. GitHub Actions dựng giúp, không cần cài gì trên máy.

1. Tạo tài khoản ở https://dash.cloudflare.com (miễn phí), mở mục **Workers & Pages** một lần (nếu được hỏi tên miền phụ `workers.dev` thì đặt một tên bất kỳ).
2. Tạo API token: https://dash.cloudflare.com/profile/api-tokens → **Create Token** → mẫu **Edit Cloudflare Workers** → **Use template** → ở *Permissions* bấm **+ Add more**, chọn *Account* · **D1** · **Edit** → *Account Resources*: tài khoản của mình → **Continue to summary** → **Create Token**, copy token.
3. Repo → Settings → Secrets and variables → Actions, thêm:
   - `CLOUDFLARE_API_TOKEN`: token vừa copy
   - `SYNC_KEY`: khoá đồng bộ (một chuỗi ngẫu nhiên dài, giữ bí mật)
4. Tab **Actions → Deploy sync server → Run workflow**. Chạy xong (1–2 phút), mở lần chạy đó, phần *Summary* ghi địa chỉ `https://simpmusic-sync.….workers.dev`.
5. Trên mỗi điện thoại / máy tính: **Cài đặt → Playback sync**, nhập địa chỉ đó và `SYNC_KEY`, bấm **Test connection**.

## 4. Lấy bản sửa mới từ tác giả (khi cần)

Nếu YouTube đổi gì đó làm app hỏng, tác giả gốc thường sửa trong `baotrq/project-2b` / `baotrq/core` hoặc `maxrave-dev/SimpMusic`. Có thể nhờ Claude chép riêng các bản sửa đó vào repo này, rồi push để GitHub build lại. Không cần nhận nguyên bản của tác giả.

## 5. Phím tắt trên máy tính

| Phím | Tác dụng |
|---|---|
| `Space` | Phát / tạm dừng |
| `←` / `→` | Tua lùi / tới 5 giây |
| `Ctrl + ←` / `Ctrl + →` | Bài trước / bài sau |
| `↑` / `↓` | Tăng / giảm âm lượng |
| `M` | Tắt / bật tiếng |
| `L` | Thích bài đang phát |
| `S` | Trộn bài |
| `R` | Lặp lại |
| `Ctrl + F` | Mở tìm kiếm |
| `F11` | Toàn màn hình |

Phím tắt không chạy khi đang gõ chữ trong ô tìm kiếm.
