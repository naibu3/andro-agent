#!/usr/bin/env bash
set -euo pipefail

LOCAL_DIR="${1:-.}"
REMOTE_USER="agent"
REMOTE_HOST="192.168.1.27"
REMOTE_DIR="/home/agent/android-agent-mvp"

EXCLUDES=(
  "--exclude" ".git"
  "--exclude" ".venv"
  "--exclude" "__pycache__"
  "--exclude" "*.pyc"
  "--exclude" "output"
  #"--exclude" ".env"
  "--exclude" ".idea"
  "--exclude" ".vscode"
  "--exclude" "notas"
)

echo "[*] Sincronizando ${LOCAL_DIR} -> ${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_DIR}"

rsync -avz --delete \
  -e "ssh" \
  "${EXCLUDES[@]}" \
  "${LOCAL_DIR}/" \
  "${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_DIR}/"

echo "[+] Sincronización completada"