#!/usr/bin/env bash
set -euo pipefail

SDK_ROOT="${ANDROID_HOME:-${ANDROID_SDK_ROOT:-$HOME/Android/Sdk}}"
CMDLINE_TOOLS_VERSION="${CMDLINE_TOOLS_VERSION:-13114758}"
API_LEVEL="${API_LEVEL:-34}"
SYSTEM_IMAGE="${SYSTEM_IMAGE:-system-images;android-${API_LEVEL};google_apis;x86_64}"
PLATFORM_PKG="platforms;android-${API_LEVEL}"
AVD_NAME="${AVD_NAME:-Pixel_6_API_34}"
DEVICE_ID="${DEVICE_ID:-pixel_6}"

TOOLS_DIR="$SDK_ROOT/cmdline-tools"
LATEST_DIR="$TOOLS_DIR/latest"
ZIP_NAME="commandlinetools-linux-${CMDLINE_TOOLS_VERSION}_latest.zip"
DOWNLOAD_URL="https://dl.google.com/android/repository/${ZIP_NAME}"

echo "[*] SDK root: $SDK_ROOT"
mkdir -p "$SDK_ROOT"
mkdir -p "$TOOLS_DIR"

need_cmd() {
  command -v "$1" >/dev/null 2>&1 || {
    echo "[!] Missing required command: $1"
    exit 1
  }
}

need_cmd curl
need_cmd unzip
need_cmd java

if [ ! -x "$LATEST_DIR/bin/sdkmanager" ]; then
  echo "[*] Android cmdline-tools not found. Downloading..."
  TMP_ZIP="$(mktemp /tmp/android-cmdline-tools.XXXXXX.zip)"
  curl -L "$DOWNLOAD_URL" -o "$TMP_ZIP"

  TMP_DIR="$(mktemp -d /tmp/android-cmdline-tools.XXXXXX)"
  unzip -q "$TMP_ZIP" -d "$TMP_DIR"

  rm -rf "$LATEST_DIR"
  mkdir -p "$LATEST_DIR"

  # El zip suele descomprimir en una carpeta llamada cmdline-tools/
  if [ -d "$TMP_DIR/cmdline-tools" ]; then
    mv "$TMP_DIR/cmdline-tools/"* "$LATEST_DIR/"
  else
    mv "$TMP_DIR/"* "$LATEST_DIR/"
  fi

  rm -f "$TMP_ZIP"
  rm -rf "$TMP_DIR"
fi

export ANDROID_HOME="$SDK_ROOT"
export ANDROID_SDK_ROOT="$SDK_ROOT"
export PATH="$SDK_ROOT/platform-tools:$SDK_ROOT/emulator:$LATEST_DIR/bin:$PATH"

echo "[*] Accepting SDK licenses..."
yes | sdkmanager --sdk_root="$SDK_ROOT" --licenses >/dev/null || true

echo "[*] Installing required SDK packages..."
sdkmanager --sdk_root="$SDK_ROOT" \
  "platform-tools" \
  "emulator" \
  "$PLATFORM_PKG" \
  "$SYSTEM_IMAGE"

if ! emulator -list-avds | grep -qx "$AVD_NAME"; then
  echo "[*] Creating AVD: $AVD_NAME"
  echo "no" | avdmanager create avd \
    -n "$AVD_NAME" \
    -k "$SYSTEM_IMAGE" \
    -d "$DEVICE_ID"
else
  echo "[*] AVD already exists: $AVD_NAME"
fi

echo
echo "[+] Android environment ready"
echo "    ANDROID_HOME=$ANDROID_HOME"
echo "    AVD_NAME=$AVD_NAME"
echo
echo "Add these lines to your shell profile if needed:"
echo "export ANDROID_HOME=\"$SDK_ROOT\""
echo "export ANDROID_SDK_ROOT=\"$SDK_ROOT\""
echo "export PATH=\"\$ANDROID_HOME/platform-tools:\$ANDROID_HOME/emulator:\$ANDROID_HOME/cmdline-tools/latest/bin:\$PATH\""