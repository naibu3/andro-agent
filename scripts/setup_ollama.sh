#!/usr/bin/env bash
set -euo pipefail

MODEL="${1:-qwen2.5-coder:7b}"
HOST_URL="${OLLAMA_HOST:-http://127.0.0.1:11434}"
PROJECT_ROOT="${PROJECT_ROOT:-$(pwd)}"

log() { printf '\033[1;32m[+]\033[0m %s\n' "$*"; }
warn() { printf '\033[1;33m[!]\033[0m %s\n' "$*"; }
err() { printf '\033[1;31m[-]\033[0m %s\n' "$*" >&2; }

if ! command -v ollama >/dev/null 2>&1; then
  log "Ollama no encontrado. Instalando..."
  curl -fsSL https://ollama.com/install.sh | sh
else
  log "Ollama ya está instalado: $(command -v ollama)"
fi

if command -v systemctl >/dev/null 2>&1; then
  if systemctl list-unit-files | grep -q '^ollama.service'; then
    log "Activando servicio systemd de Ollama..."
    sudo systemctl enable --now ollama || sudo systemctl restart ollama
  else
    warn "No veo ollama.service. Intentaré usar el servidor existente o arrancarlo manualmente si hace falta."
  fi
fi

if ! curl -fsS "$HOST_URL/api/tags" >/dev/null 2>&1; then
  warn "Ollama no responde en $HOST_URL. Arrancando 'ollama serve' en segundo plano..."
  nohup ollama serve >/tmp/ollama-serve.log 2>&1 &
  sleep 3
fi

if ! curl -fsS "$HOST_URL/api/tags" >/dev/null 2>&1; then
  err "Ollama sigue sin responder en $HOST_URL. Revisa: journalctl -u ollama -n 80 o /tmp/ollama-serve.log"
  exit 1
fi

log "Descargando modelo local: $MODEL"
ollama pull "$MODEL"

ENV_FILE="$PROJECT_ROOT/.env"
touch "$ENV_FILE"

set_env() {
  local key="$1"
  local value="$2"
  if grep -qE "^${key}=" "$ENV_FILE"; then
    sed -i "s#^${key}=.*#${key}=${value}#" "$ENV_FILE"
  else
    printf '%s=%s\n' "$key" "$value" >> "$ENV_FILE"
  fi
}

log "Actualizando $ENV_FILE"
set_env "LLM_PROVIDER" "ollama"
set_env "OLLAMA_HOST" "$HOST_URL"
set_env "OLLAMA_MODEL_ID" "$MODEL"
set_env "OLLAMA_TIMEOUT" "120"
set_env "OLLAMA_TEMPERATURE" "0.1"

log "Ollama listo. Modelos disponibles:"
ollama list || true

cat <<EOF

Uso recomendado:
  andro-agent run samples/AndroGoat.apk --case-id test-ollama --llm-provider ollama --llm-model $MODEL

Comprobación:
  curl $HOST_URL/api/tags
EOF
