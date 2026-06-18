#!/usr/bin/env bash
set -euo pipefail
HOST_URL="${OLLAMA_HOST:-http://127.0.0.1:11434}"
echo "Checking Ollama at $HOST_URL"
curl -fsS "$HOST_URL/api/tags" | python -m json.tool
