#!/usr/bin/env bash
set -euo pipefail

REMOTE_USER="agent"
REMOTE_HOST="192.168.1.27"
REMOTE_DIR="/home/agent/android-agent-mvp/android-agent-mvp/output"
LOCAL_DIR="./vm-reports"
SSH_KEY="${HOME}/.ssh/id_ed25519"

mkdir -p "${LOCAL_DIR}"

rsync -avz \
  -e "ssh -i ${SSH_KEY}" \
  --include="*.md" \
  --include="*.json" \
  --exclude="*" \
  --exclude="./apktool" \
  --exclude="./jadx" \
  "${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_DIR}/" \
  "${LOCAL_DIR}/report"

echo "[+] Markdown descargado en ${LOCAL_DIR}"