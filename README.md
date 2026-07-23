# Flint App Store

Kho game J2ME dùng để build, nạp thử và debug với Flint debugger. Repository này không là submodule, không sửa mã nguồn FlintOS, và chỉ đọc SDK/runtime từ FlintOS.

## Cấu trúc

```text
FlintAppStore/
├── SrcGame/                 # JAR gốc và sidecar *.flint.properties
├── scripts/build-game.sh    # Entry point build duy nhất
├── Ancient-Empires-II/
├── Diamond-Rush-EUB/
├── Diamond-Rush-Nokia-E50/
├── GTA-5-MOD/
└── The-Fight-3D/
```

`bin/`, `stage/`, `build/`, helper `*.class` là output local. Không commit hoặc push các file này.

## Yêu cầu

- Bash: Linux, Git Bash/MSYS2 hoặc WSL.
- JDK 17+: `java`, `javac`, `jar` trên `PATH`.
- FlintOS đã tạo SDK jars trong `files/lib/`. Nếu thiếu, chạy `FlintOS/scripts/build-sdks.sh` hoặc `FlintOS/scripts/build-sdks.ps1`.

Script dùng các JAR read-only:

```text
FlintOS/files/lib/java.base.jar
FlintOS/files/lib/flint.drawing.jar
FlintOS/files/lib/flintos.device.jar
FlintOS/files/lib/midp.jar
FlintOS/files/lib/flintos.midp.jar
FlintOS/files/lib/m3g.jar
```

## Build

Chỉ dùng entrypoint này:

```bash
cd FlintAppStore
./scripts/build-game.sh \
  --flintos /path/to/FlintOS \
  --app ./Diamond-Rush-EUB
```

Hoặc đặt biến môi trường:

```bash
export FLINTOS_ROOT=/path/to/FlintOS
./scripts/build-game.sh --app ./Diamond-Rush-EUB
```

Nếu AppStore nằm cạnh FlintOS, script chỉ dùng fallback `../FlintOS` sau khi kiểm tra đầy đủ SDK jars. Không đoán path khác.

Input JAR có thể override:

```bash
./scripts/build-game.sh \
  --flintos /path/to/FlintOS \
  --app ./Ancient-Empires-II \
  --game ./SrcGame/Ancient-Empires-II_J2ME_EN_v10.jar
```

Artifact debug/install nằm tại:

```text
<App>/bin/jar/FlintApp.jar
```

Script không ghi file vào FlintOS. Flint debugger dùng artifact này khi VS Code chạy cấu hình `Debug with FlintJVM`.

## Manifest và resource

Script extract JAR gốc, giữ nguyên game `.class` và resource path trong JAR, rồi chỉ compile launcher `Main`. Manifest output giữ các thuộc tính J2ME gốc, gồm:

- `MIDlet-Name`
- `MIDlet-Version`
- `MIDlet-Vendor`
- `MIDlet-1`
- `MicroEdition-Configuration`
- `MicroEdition-Profile`

Sidecar `<game>.flint.properties` cạnh JAR có thể override MIDlet/display compatibility. Diamond EUB dùng `320x240`, `direct`, `maxfps=10`.

Nếu có `tools/BuildDebugClass.java` và `tools/cfr-0.152.jar`, script thêm debug line mapping vào bản debug. Patch compatibility `HNullPatch.java` hoặc `IPaintPatch.java` chỉ chạy khi app chứa cả source patcher và ASM JAR.

## VS Code

Mở folder app, chọn `Debug with FlintJVM`, nhấn F5. `preLaunchTask` gọi cùng `scripts/build-game.sh`; không dùng per-app build script.
