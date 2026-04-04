# andro-agent

Agent-guided APK analyzer for Android application security analysis.

## Setup

```bash
python -m venv .venv
source .venv/bin/activate
pip install -e .[dev]
```

## Commands

```bash
andro-agent init-dirs
andro-agent validate samples/app.apk
andro-agent inspect samples/app.apk
```

## Testing

```bash
pip install -e .[dev]
pytest
andro-agent init-dirs
andro-agent validate samples/app.apk
```

