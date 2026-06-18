# andro-agent

Agent-guided APK analyzer for Android application security analysis.

## Setup

```bash
python -m venv .venv
source .venv/bin/activate
.venv/bin/pip install -e .[dev]
```

## Commands

```bash
andro-agent init-dirs
andro-agent validate samples/app.apk
andro-agent inspect samples/app.apk
```

## Testing

```bash
.venv/bin/pip install -e ".[dev]"
pytest
andro-agent init-dirs
andro-agent validate samples/app.apk
```

## Elegir provider

### Mediante .env

En caso de solo definir un provider en el archivo .env, se utilizará ese provider por defecto:

Ollama:
```bash
LLM_PROVIDER=ollama
OLLAMA_HOST=http://127.0.0.1:11434
OLLAMA_MODEL_ID=qwen2.5-coder:7b
OLLAMA_TIMEOUT=120
OLLAMA_TEMPERATURE=0.1

OPENROUTER_API_KEY=
OPENROUTER_MODEL_ID=openai/gpt-oss-20b
```

OpenRouter:
```bash
LLM_PROVIDER=openrouter
OPENROUTER_API_KEY=tu_api_key
OPENROUTER_MODEL_ID=openai/gpt-oss-20b

OLLAMA_HOST=http://127.0.0.1:11434
OLLAMA_MODEL_ID=qwen2.5-coder:7b
OLLAMA_TIMEOUT=120
OLLAMA_TEMPERATURE=0.1
```

### Mediante CLI

Ollama:

```bash
andro-agent run samples/AndroGoat.apk --case-id test-ollama --llm-provider ollama --llm-model qwen2.5-coder:7b
```

OpenRouter:

```bash
andro-agent run samples/AndroGoat.apk --case-id test-openrouter --llm-provider openrouter --llm-model openai/gpt-oss-20b
```