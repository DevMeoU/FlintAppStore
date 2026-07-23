#!/usr/bin/env bash
set -euo pipefail
IFS=$'\n\t'

usage() {
    cat <<'EOF'
Usage:
  ./scripts/build-game.sh [options]

Options:
  --flintos <path>       FlintOS repository path.
  --app <path>           App directory. Default: current directory.
  --game <path>          Original game JAR. Default: app JAR or known SrcGame JAR.
  --game-id <id>         Output game identifier. Default: JAR base name.
  --debug-source <path>  Decompiled source directory. Default: src-full-debug.
  --skip-debug-map       Do not add debugger line mappings.
  --help                 Show this help.
EOF
}

fail() {
    printf 'ERROR: %s\n' "$*" >&2
    exit 1
}

require_command() {
    command -v "$1" >/dev/null 2>&1 || fail "Required tool was not found: $1"
}

normalize_input_path() {
    local path=$1
    if command -v cygpath >/dev/null 2>&1 && [[ "$path" =~ ^[A-Za-z]:[\\/] ]]; then
        cygpath -u "$path"
    else
        printf '%s\n' "$path"
    fi
}

absolute_dir() {
    local path
    path=$(normalize_input_path "$1")
    [ -d "$path" ] || return 1
    (
        cd "$path"
        pwd -P
    )
}

absolute_file() {
    local path parent base
    path=$(normalize_input_path "$1")
    [ -f "$path" ] || return 1
    parent=$(dirname "$path")
    base=$(basename "$path")
    printf '%s/%s\n' "$(absolute_dir "$parent")" "$base"
}

require_jdk17() {
    local version major
    version=$(javac -version 2>&1) || fail "Could not read javac version"
    major=$(printf '%s\n' "$version" | sed -nE 's/.*javac ([0-9]+)(\.[0-9]+)?.*/\1/p' | head -n 1)
    [[ "$major" =~ ^[0-9]+$ ]] && [ "$major" -ge 17 ] || fail "JDK 17 or newer is required: $version"
}

java_path() {
    local path=$1
    if command -v cygpath >/dev/null 2>&1; then
        cygpath -aw "$path"
    else
        printf '%s\n' "$path"
    fi
}

java_path_list() {
    local paths=$1
    if command -v cygpath >/dev/null 2>&1; then
        cygpath -wp "$paths"
    else
        printf '%s\n' "$paths"
    fi
}

safe_game_id() {
    local value=$1
    value=${value##*/}
    value=${value%.*}
    value=$(printf '%s' "$value" | tr -cs '[:alnum:]_.-' '-')
    value=${value#-}
    value=${value%-}
    [ -n "$value" ] || value=Game
    printf '%s\n' "$value"
}

escape_java() {
    local value=$1
    value=${value//\\/\\\\}
    value=${value//\"/\\\"}
    value=${value//$'\r'/\\r}
    value=${value//$'\n'/\\n}
    printf '%s' "$value"
}

manifest_value() {
    local key=$1
    local manifest=$2
    awk -v wanted="$key" '
        function flush() {
            if (active && current_key == wanted) {
                print current_value
                exit
            }
        }
        /^[ ]/ {
            if (active) current_value = current_value substr($0, 2)
            next
        }
        {
            flush()
            active = 0
            current_key = ""
            current_value = ""
            colon = index($0, ":")
            if (colon > 0) {
                active = 1
                current_key = substr($0, 1, colon - 1)
                current_value = substr($0, colon + 1)
                sub(/^[ ]+/, "", current_value)
            }
        }
        END {
            if (active && current_key == wanted) print current_value
        }
    ' "$manifest" | tr -d '\r' | awk 'NF { print; exit }'
}

property_value() {
    local key=$1
    local properties=$2
    [ -f "$properties" ] || return 0
    awk -v wanted="$key" '
        BEGIN { wanted = tolower(wanted) }
        {
            line = $0
            sub(/\r$/, "", line)
            sub(/^[ \t]+/, "", line)
            sub(/[ \t]+$/, "", line)
            if (line == "" || line ~ /^[#;]/) next
            separator = index(line, "=")
            if (separator == 0) separator = index(line, ":")
            if (separator <= 1) next
            current = substr(line, 1, separator - 1)
            sub(/^[ \t]+/, "", current)
            sub(/[ \t]+$/, "", current)
            if (tolower(current) != wanted) next
            value = substr(line, separator + 1)
            sub(/^[ \t]+/, "", value)
            sub(/[ \t]+$/, "", value)
            print value
            exit
        }
    ' "$properties"
}

copy_tree_contents() {
    local source=$1
    local target=$2
    mkdir -p "$target"
    cp -a "$source/." "$target/"
}

resolve_flintos_candidate() {
    local candidate=$1
    [ -n "$candidate" ] || return 1
    absolute_dir "$candidate" || return 1
}

validate_flintos() {
    local root=$1
    local required=(
        files/lib/java.base.jar
        files/lib/flint.drawing.jar
        files/lib/flintos.device.jar
        files/lib/midp.jar
        files/lib/flintos.midp.jar
        files/lib/m3g.jar
    )
    local path
    for path in "${required[@]}"; do
        [ -f "$root/$path" ] || return 1
    done
    return 0
}

resolve_flintos() {
    local candidate resolved
    local candidates=()
    local explicit_candidate=
    if [ -n "$FLINTOS_ARG" ]; then
        explicit_candidate=$FLINTOS_ARG
        candidates+=("$FLINTOS_ARG")
    elif [ -n "${FLINTOS_ROOT:-}" ]; then
        explicit_candidate=$FLINTOS_ROOT
        candidates+=("$FLINTOS_ROOT")
    else
        candidates+=("$STORE_ROOT/../FlintOS")
        candidates+=("$STORE_ROOT/..")
    fi

    for candidate in "${candidates[@]}"; do
        resolved=$(resolve_flintos_candidate "$candidate" || true)
        if [ -n "$resolved" ] && validate_flintos "$resolved"; then
            printf '%s\n' "$resolved"
            return 0
        fi
    done

    if [ -n "$explicit_candidate" ] && [ -d "$explicit_candidate" ]; then
        fail "SDK libraries missing in $explicit_candidate/files/lib. Run <FlintOS>/scripts/build-sdks.sh or <FlintOS>/scripts/build-sdks.ps1 first."
    fi

    cat >&2 <<'EOF'
ERROR: FlintOS repository was not found.

Specify its location using one of the following methods:

  ./scripts/build-game.sh --flintos /path/to/FlintOS

or:

  export FLINTOS_ROOT=/path/to/FlintOS
EOF
    exit 1
}

source_jar_for_app() {
    case "$(basename "$APP_DIR")" in
        Ancient-Empires-II) printf '%s\n' "$STORE_ROOT/SrcGame/Ancient-Empires-II_J2ME_EN_v10.jar" ;;
        Diamond-Rush-EUB) printf '%s\n' "$STORE_ROOT/SrcGame/diamond_EUB.jar" ;;
        Diamond-Rush-Nokia-E50) printf '%s\n' "$STORE_ROOT/SrcGame/Diamond Rush [240x320] (Nokia E50) (andrew-lviv.net).jar" ;;
        GTA-5-MOD) printf '%s\n' "$STORE_ROOT/SrcGame/GTA 5 MOD [240x320] (andrew-lviv.net).jar" ;;
        The-Fight-3D) printf '%s\n' "$STORE_ROOT/SrcGame/The Fight 3D [240x320] (SonyEricsson K800i, K810i, K850i, W910i, C905) (andrew-lviv.net).jar" ;;
        *) return 1 ;;
    esac
}

FLINTOS_ARG=
APP_ARG=
GAME_ARG=
GAME_ID_ARG=
DEBUG_SOURCE_ARG=
SKIP_DEBUG_MAP=0

while [ "$#" -gt 0 ]; do
    case "$1" in
        --flintos)
            [ "$#" -ge 2 ] || fail "--flintos requires a path"
            FLINTOS_ARG=$2
            shift 2
            ;;
        --app)
            [ "$#" -ge 2 ] || fail "--app requires a path"
            APP_ARG=$2
            shift 2
            ;;
        --game)
            [ "$#" -ge 2 ] || fail "--game requires a path"
            GAME_ARG=$2
            shift 2
            ;;
        --game-id)
            [ "$#" -ge 2 ] || fail "--game-id requires an identifier"
            GAME_ID_ARG=$2
            shift 2
            ;;
        --debug-source)
            [ "$#" -ge 2 ] || fail "--debug-source requires a path"
            DEBUG_SOURCE_ARG=$2
            shift 2
            ;;
        --skip-debug-map)
            SKIP_DEBUG_MAP=1
            shift
            ;;
        --help|-h)
            usage
            exit 0
            ;;
        *)
            fail "Unknown option: $1"
            ;;
    esac
done

SCRIPT_DIR=$(absolute_dir "$(dirname "${BASH_SOURCE[0]}")")
STORE_ROOT=$(absolute_dir "$SCRIPT_DIR/..")
APP_DIR=$(absolute_dir "${APP_ARG:-$PWD}") || fail "App directory was not found: ${APP_ARG:-$PWD}"
FLINTOS_ROOT=$(resolve_flintos)

for tool in java javac jar awk find cp rm mkdir; do
    require_command "$tool"
done
require_jdk17

if [ -n "$GAME_ARG" ]; then
    if [[ "$GAME_ARG" = /* ]] || [[ "$GAME_ARG" =~ ^[A-Za-z]:[/\\] ]]; then
        GAME_JAR=$(absolute_file "$GAME_ARG") || fail "Game JAR was not found: $GAME_ARG"
    else
        GAME_JAR=$(absolute_file "$APP_DIR/$GAME_ARG" || absolute_file "$GAME_ARG") || fail "Game JAR was not found: $GAME_ARG"
    fi
else
    mapfile -d '' app_jars < <(find "$APP_DIR" -maxdepth 1 -type f -name '*.jar' -print0 | sort -z)
    if [ "${#app_jars[@]}" -eq 1 ]; then
        GAME_JAR=$(absolute_file "${app_jars[0]}")
    elif [ "${#app_jars[@]}" -gt 1 ]; then
        fail "Multiple game JARs found in $APP_DIR. Use --game <path>."
    else
        GAME_JAR=$(source_jar_for_app || true)
        GAME_JAR=$(absolute_file "$GAME_JAR" || true)
        [ -n "$GAME_JAR" ] || fail "No game JAR found for $APP_DIR. Use --game <path>."
    fi
fi

GAME_BASE=$(basename "$GAME_JAR")
GAME_BASE=${GAME_BASE%.jar}
GAME_ID=${GAME_ID_ARG:-$(safe_game_id "$GAME_BASE")}
[ -n "$GAME_ID" ] || fail "Game identifier is empty"
SIDE_CAR="$(dirname "$GAME_JAR")/$GAME_BASE.flint.properties"
if [ ! -f "$SIDE_CAR" ] && [ -f "$STORE_ROOT/SrcGame/$GAME_BASE.flint.properties" ]; then
    SIDE_CAR="$STORE_ROOT/SrcGame/$GAME_BASE.flint.properties"
fi

BUILD_ROOT="$STORE_ROOT/build/games/$GAME_ID"
EXTRACT_DIR="$BUILD_ROOT/extract"
GAME_BIN="$BUILD_ROOT/bin"
STAGE_DIR="$BUILD_ROOT/stage"
GENERATED_SRC_DIR="$BUILD_ROOT/src"
MAIN_SOURCE="$GENERATED_SRC_DIR/Main.java"
MANIFEST_SOURCE="$EXTRACT_DIR/META-INF/MANIFEST.MF"
APP_MANIFEST="$BUILD_ROOT/APP.MF"
APP_BIN_DIR="$APP_DIR/bin/build"
APP_STAGE_DIR="$APP_DIR/stage"
APP_JAR_DIR="$APP_DIR/bin/jar"
APP_GENERATED_SRC_DIR="$APP_DIR/bin/generated-src"
APP_JAR="$APP_JAR_DIR/FlintApp.jar"
GAME_JAR_OUT="$GAME_BIN/$GAME_ID.jar"

JAVA_BASE="$FLINTOS_ROOT/files/lib/java.base.jar"
DRAWING="$FLINTOS_ROOT/files/lib/flint.drawing.jar"
DEVICE="$FLINTOS_ROOT/files/lib/flintos.device.jar"
MIDP="$FLINTOS_ROOT/files/lib/j2me.jar"
MIDP_RUNTIME="$FLINTOS_ROOT/files/lib/flintos.midp.jar"
M3G="$FLINTOS_ROOT/files/lib/m3g.jar"
CLASSPATH="$JAVA_BASE:$MIDP:$MIDP_RUNTIME:$M3G:$DRAWING:$DEVICE"

rm -rf "$BUILD_ROOT"
mkdir -p "$EXTRACT_DIR" "$GAME_BIN" "$STAGE_DIR" "$GENERATED_SRC_DIR"
(
    cd "$EXTRACT_DIR"
    jar xf "$(java_path "$GAME_JAR")"
)
[ -f "$MANIFEST_SOURCE" ] || fail "Game JAR manifest was not found: $GAME_JAR"

MIDLET_LINE=$(manifest_value "MIDlet-1" "$MANIFEST_SOURCE")
[ -n "$MIDLET_LINE" ] || fail "MIDlet-1 is missing from manifest: $GAME_JAR"
IFS=',' read -r MIDLET_NAME MIDLET_ICON MIDLET_CLASS <<< "$MIDLET_LINE"
MIDLET_NAME=$(printf '%s' "$MIDLET_NAME" | xargs)
MIDLET_ICON=$(printf '%s' "$MIDLET_ICON" | xargs)
MIDLET_CLASS=$(printf '%s' "$MIDLET_CLASS" | xargs)

MIDLET_OVERRIDE=$(property_value midlet "$SIDE_CAR")
[ -z "$MIDLET_OVERRIDE" ] && MIDLET_OVERRIDE=$(property_value midletClass "$SIDE_CAR")
if [ -n "$MIDLET_OVERRIDE" ]; then
    MIDLET_CLASS=$MIDLET_OVERRIDE
else
    MIDLET_INDEX=$(property_value midletIndex "$SIDE_CAR")
    MIDLET_NAME_OVERRIDE=$(property_value midletName "$SIDE_CAR")
    if [ -n "$MIDLET_INDEX" ]; then
        [[ "$MIDLET_INDEX" =~ ^[1-9][0-9]*$ ]] || fail "Invalid midletIndex in $SIDE_CAR: $MIDLET_INDEX"
        MIDLET_LINE=$(manifest_value "MIDlet-$MIDLET_INDEX" "$MANIFEST_SOURCE")
        [ -n "$MIDLET_LINE" ] || fail "MIDlet-$MIDLET_INDEX is missing from manifest: $GAME_JAR"
        IFS=',' read -r MIDLET_NAME MIDLET_ICON MIDLET_CLASS <<< "$MIDLET_LINE"
        MIDLET_NAME=$(printf '%s' "$MIDLET_NAME" | xargs)
        MIDLET_ICON=$(printf '%s' "$MIDLET_ICON" | xargs)
        MIDLET_CLASS=$(printf '%s' "$MIDLET_CLASS" | xargs)
    elif [ -n "$MIDLET_NAME_OVERRIDE" ]; then
        MIDLET_LINE=
        MIDLET_INDEX=1
        while :; do
            candidate=$(manifest_value "MIDlet-$MIDLET_INDEX" "$MANIFEST_SOURCE")
            [ -n "$candidate" ] || break
            IFS=',' read -r candidate_name candidate_icon candidate_class <<< "$candidate"
            candidate_name=$(printf '%s' "$candidate_name" | xargs)
            if [ "$candidate_name" = "$MIDLET_NAME_OVERRIDE" ]; then
                MIDLET_LINE=$candidate
                break
            fi
            MIDLET_INDEX=$((MIDLET_INDEX + 1))
        done
        [ -n "$MIDLET_LINE" ] || fail "MIDlet named '$MIDLET_NAME_OVERRIDE' is missing from manifest: $GAME_JAR"
        IFS=',' read -r MIDLET_NAME MIDLET_ICON MIDLET_CLASS <<< "$MIDLET_LINE"
        MIDLET_NAME=$(printf '%s' "$MIDLET_NAME" | xargs)
        MIDLET_ICON=$(printf '%s' "$MIDLET_ICON" | xargs)
        MIDLET_CLASS=$(printf '%s' "$MIDLET_CLASS" | xargs)
    fi
fi
[ -n "$MIDLET_CLASS" ] || fail "MIDlet entry class is empty: $GAME_JAR"

ORIENTATION=$(property_value orientation "$SIDE_CAR")
case "${ORIENTATION,,}" in
    landscape|horizontal|ngang) WIDTH=320; HEIGHT=240; PRESENT=direct ;;
    portrait|vertical|doc|'') WIDTH=240; HEIGHT=320; PRESENT=rotate270 ;;
    *) fail "Invalid orientation in $SIDE_CAR: $ORIENTATION" ;;
esac
WIDTH_OVERRIDE=$(property_value width "$SIDE_CAR")
HEIGHT_OVERRIDE=$(property_value height "$SIDE_CAR")
PRESENT_OVERRIDE=$(property_value present "$SIDE_CAR")
MAX_FPS=$(property_value maxfps "$SIDE_CAR")
[ -n "$WIDTH_OVERRIDE" ] && WIDTH=$WIDTH_OVERRIDE
[ -n "$HEIGHT_OVERRIDE" ] && HEIGHT=$HEIGHT_OVERRIDE
[ -n "$PRESENT_OVERRIDE" ] && PRESENT=${PRESENT_OVERRIDE,,}
[ -n "$MAX_FPS" ] || MAX_FPS=25
case "$PRESENT" in
    direct|rotate90|rotate270|scale) ;;
    *) fail "Invalid present mode in $SIDE_CAR: $PRESENT" ;;
esac
[[ "$WIDTH" =~ ^[1-9][0-9]*$ ]] || fail "Invalid display width: $WIDTH"
[[ "$HEIGHT" =~ ^[1-9][0-9]*$ ]] || fail "Invalid display height: $HEIGHT"
[[ "$MAX_FPS" =~ ^[0-9]+$ ]] || fail "Invalid maxfps: $MAX_FPS"

find "$EXTRACT_DIR" -type f ! -name '*.class' ! -path "$EXTRACT_DIR/META-INF/MANIFEST.MF" -print0 |
while IFS= read -r -d '' source; do
    relative=${source#"$EXTRACT_DIR/"}
    target="$STAGE_DIR/$relative"
    mkdir -p "$(dirname "$target")"
    cp "$source" "$target"
done
find "$EXTRACT_DIR" -type f -name '*.class' -print0 |
while IFS= read -r -d '' source; do
    relative=${source#"$EXTRACT_DIR/"}
    target="$STAGE_DIR/$relative"
    mkdir -p "$(dirname "$target")"
    cp "$source" "$target"
done

cat > "$MAIN_SOURCE" <<EOF
import javax.microedition.lcdui.DisplayAccess;
import javax.microedition.midlet.MIDletLifecycle;
import javax.microedition.rms.RecordStore;

public final class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("flint.lcdui.maxfps", "$(escape_java "$MAX_FPS")");
        DisplayAccess.initScreen($WIDTH, $HEIGHT, "$(escape_java "$PRESENT")");
        board.Touch.init();
        board.Audio.init();
        RecordStore.openRecordStore("Preferences", true).closeRecordStore();
        MIDletLifecycle.main(new String[]{"$(escape_java "$MIDLET_CLASS")"});
        while(true) Thread.sleep(1000);
    }
}
EOF

javac -g --release 17 -encoding UTF-8 \
    -cp "$(java_path_list "$CLASSPATH")" \
    -d "$(java_path "$GAME_BIN")" \
    "$(java_path "$MAIN_SOURCE")"
cp "$GAME_BIN/Main.class" "$STAGE_DIR/Main.class"

{
    printf 'Manifest-Version: 1.0\r\n'
    printf 'Main-Class: Main\r\n'
    awk '
        function flush() {
            if (!active) return
            if (current_key != "Manifest-Version" && current_key != "Main-Class" && current_key != "Created-By") {
                printf "%s: %s\r\n", current_key, current_value
            }
        }
        /^[ ]/ {
            if (active) current_value = current_value substr($0, 2)
            next
        }
        {
            flush()
            active = 0
            line = $0
            sub(/\r$/, "", line)
            colon = index(line, ":")
            if (colon <= 0) next
            active = 1
            current_key = substr(line, 1, colon - 1)
            current_value = substr(line, colon + 1)
            sub(/^[ ]+/, "", current_value)
        }
        END { flush() }
    ' "$MANIFEST_SOURCE"
    printf '\r\n'
} > "$APP_MANIFEST"

jar --create \
    --file "$(java_path "$GAME_JAR_OUT")" \
    --manifest "$(java_path "$APP_MANIFEST")" \
    -0 -C "$(java_path "$STAGE_DIR")" .

rm -rf "$APP_BIN_DIR" "$APP_STAGE_DIR" "$APP_GENERATED_SRC_DIR"
mkdir -p "$APP_BIN_DIR" "$APP_STAGE_DIR" "$APP_GENERATED_SRC_DIR" "$APP_JAR_DIR"
copy_tree_contents "$STAGE_DIR" "$APP_STAGE_DIR"
copy_tree_contents "$STAGE_DIR" "$APP_BIN_DIR"
cp "$MAIN_SOURCE" "$APP_GENERATED_SRC_DIR/Main.java"

if [ "$SKIP_DEBUG_MAP" -eq 0 ]; then
    DEBUG_SOURCE=${DEBUG_SOURCE_ARG:-src-full-debug}
    if [[ "$DEBUG_SOURCE" = /* ]] || [[ "$DEBUG_SOURCE" =~ ^[A-Za-z]:[/\\] ]]; then
        DEBUG_SOURCE=$(absolute_dir "$DEBUG_SOURCE" || true)
    else
        DEBUG_SOURCE=$(absolute_dir "$APP_DIR/$DEBUG_SOURCE" || true)
    fi
    TOOLS_DIR="$APP_DIR/tools"
    CFR_JAR="$TOOLS_DIR/cfr-0.152.jar"
    MAPPER_SOURCE="$TOOLS_DIR/BuildDebugClass.java"
    if [ -n "$DEBUG_SOURCE" ] && [ -f "$CFR_JAR" ] && [ -f "$MAPPER_SOURCE" ]; then
        javac --release 17 -encoding UTF-8 \
            -cp "$(java_path "$CFR_JAR")" \
            -d "$(java_path "$TOOLS_DIR")" \
            "$(java_path "$MAPPER_SOURCE")"
        MAPPER_CP="$TOOLS_DIR:$CFR_JAR"
        DECOMPILER_CP="$STAGE_DIR:$MIDP:$MIDP_RUNTIME:$M3G:$DRAWING:$DEVICE"
        find "$STAGE_DIR" -type f -name '*.class' ! -name 'Main.class' -print0 |
        while IFS= read -r -d '' class_file; do
            relative=${class_file#"$STAGE_DIR/"}
            mapped="$APP_BIN_DIR/$relative"
            mkdir -p "$(dirname "$mapped")"
            java -cp "$(java_path_list "$MAPPER_CP")" BuildDebugClass \
                "$(java_path "$class_file")" \
                "$(java_path "$DEBUG_SOURCE")" \
                "$(java_path "$mapped")" \
                "$(java_path_list "$DECOMPILER_CP")"
        done

        ASM_JAR=$(find "$TOOLS_DIR" -maxdepth 1 -type f -name 'asm-*.jar' -print -quit)
        if [ -n "${ASM_JAR:-}" ]; then
            PATCH_SOURCES=()
            [ -f "$TOOLS_DIR/HNullPatch.java" ] && PATCH_SOURCES+=("$TOOLS_DIR/HNullPatch.java")
            [ -f "$TOOLS_DIR/IPaintPatch.java" ] && PATCH_SOURCES+=("$TOOLS_DIR/IPaintPatch.java")
            if [ "${#PATCH_SOURCES[@]}" -gt 0 ]; then
                PATCH_JAVA_SOURCES=()
                for source in "${PATCH_SOURCES[@]}"; do
                    PATCH_JAVA_SOURCES+=("$(java_path "$source")")
                done
                javac --release 17 -encoding UTF-8 \
                    -cp "$(java_path "$ASM_JAR")" \
                    -d "$(java_path "$TOOLS_DIR")" \
                    "${PATCH_JAVA_SOURCES[@]}"
                PATCH_CP="$TOOLS_DIR:$ASM_JAR"
                for patcher in HNullPatch IPaintPatch; do
                    [ -f "$TOOLS_DIR/$patcher.java" ] || continue
                    find "$APP_BIN_DIR" -type f -name '*.class' ! -name 'Main.class' -print0 |
                    while IFS= read -r -d '' class_file; do
                        temporary="$class_file.tmp"
                        java -cp "$(java_path_list "$PATCH_CP")" "$patcher" \
                            "$(java_path "$class_file")" \
                            "$(java_path "$temporary")"
                        mv -f "$temporary" "$class_file"
                    done
                done
            fi
        fi
    else
        printf 'Skipping debug mapping: tools or debug source missing for %s\n' "$APP_DIR"
    fi
fi

cp "$GAME_BIN/Main.class" "$APP_BIN_DIR/Main.class"
jar --create \
    --file "$(java_path "$APP_JAR")" \
    --manifest "$(java_path "$APP_MANIFEST")" \
    -0 -C "$(java_path "$APP_BIN_DIR")" .

printf 'Game JAR: %s\n' "$GAME_JAR"
printf 'Game ID: %s\n' "$GAME_ID"
printf 'MIDlet: %s\n' "$MIDLET_CLASS"
printf 'Display: %sx%s, %s, maxfps=%s\n' "$WIDTH" "$HEIGHT" "$PRESENT" "$MAX_FPS"
printf 'Manifest: %s\n' "$APP_MANIFEST"
printf 'Artifact: %s\n' "$APP_JAR"
