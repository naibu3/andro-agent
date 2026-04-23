from __future__ import annotations

from pathlib import Path


def load_keywords_from_file(path: Path) -> list[str]:
    if not path.exists():
        return []

    try:
        lines = path.read_text(encoding="utf-8").splitlines()
    except Exception:
        return []

    keywords = [
        line.strip().lower()
        for line in lines
        if line.strip() and not line.strip().startswith("#")
    ]

    return keywords