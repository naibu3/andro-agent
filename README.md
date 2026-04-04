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

