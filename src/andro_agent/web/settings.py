from __future__ import annotations

import os
from pathlib import Path


def _path_from_env(name: str, default: str) -> Path:
    return Path(os.getenv(name, default)).expanduser().resolve()


DATA_DIR = _path_from_env("ANDRO_AGENT_DATA_DIR", "data")
DB_PATH = _path_from_env("ANDRO_AGENT_DB", str(DATA_DIR / "andro_agent.db"))
UPLOADS_DIR = _path_from_env("ANDRO_AGENT_UPLOADS_DIR", str(DATA_DIR / "uploads"))
ARTIFACTS_DIR = _path_from_env("ANDRO_AGENT_ARTIFACTS_DIR", str(DATA_DIR / "artifacts"))

MAX_UPLOAD_SIZE_BYTES = int(os.getenv("ANDRO_AGENT_MAX_UPLOAD_SIZE", str(250 * 1024 * 1024)))


def ensure_runtime_dirs() -> None:
    DATA_DIR.mkdir(parents=True, exist_ok=True)
    UPLOADS_DIR.mkdir(parents=True, exist_ok=True)
    ARTIFACTS_DIR.mkdir(parents=True, exist_ok=True)
