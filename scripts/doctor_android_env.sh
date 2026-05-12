#!/usr/bin/env bash
set -euo pipefail

SDK_ROOT="${ANDROID_HOME:-${ANDROID_SDK_ROOT:-$HOME/Android/Sdk}}"
LATEST_BIN="$SDK_ROOT/cmdline-tools/latest/bin"

echo "SDK root: $SDK_ROOT"
echo

check_path() {
  local label="$1"
  local path="$2"
  if [ -e "$path" ]; then
    echo "[OK] $label -> $path"
  else
    echo "[NO] $label -> $path"
  fi
}

check_cmd() {
  local name="$1"
  if command -v "$name" >/dev/null 2>&1; then
    echo "[OK] $name in PATH -> $(command -v "$name")"
  else
    echo "[NO] $name not in PATH"
  fi
}

check_path "sdkmanager" "$LATEST_BIN/sdkmanager"
check_path "avdmanager" "$LATEST_BIN/avdmanager"
check_path "adb" "$SDK_ROOT/platform-tools/adb"
check_path "emulator" "$SDK_ROOT/emulator/emulator"

echo
check_cmd java
check_cmd sdkmanager
check_cmd avdmanager
check_cmd adb
check_cmd emulator

echo
command -v mitmdump >/dev/null 2>&1 || {
  echo "[NO] mitmdump not found"
}

echo
if [ -x "$SDK_ROOT/emulator/emulator" ]; then
  "$SDK_ROOT/emulator/emulator" -list-avds || true
fi