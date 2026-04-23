from __future__ import annotations

import json
import subprocess
from pathlib import Path

from andro_agent.core.state import CaseState


class PackageResolutionError(RuntimeError):
    pass


def resolve_package_name(
    state: CaseState,
    apk_path: Path,
    package_override: str | None = None,
) -> str:
    """
    Resolution order:
    1. explicit override
    2. CaseState.package_name
    3. static_analysis_bundle.json
    4. manifest_json_path
    5. aapt badging from APK
    """

    if package_override:
        return package_override.strip()

    if state.package_name:
        return state.package_name.strip()

    bundle_pkg = _from_static_bundle(state)
    if bundle_pkg:
        return bundle_pkg

    manifest_pkg = _from_manifest_json(state)
    if manifest_pkg:
        return manifest_pkg

    apk_pkg = _from_apk_badging(apk_path)
    if apk_pkg:
        return apk_pkg

    raise PackageResolutionError(
        "Could not resolve package name from case state, static artifacts, or APK."
    )


def _from_static_bundle(state: CaseState) -> str | None:
    path = state.static_analysis_bundle_path
    if not path or not path.exists():
        return None

    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return None

    # intenta varias ubicaciones por compatibilidad
    candidates = [
        data.get("package_name"),
        ((data.get("manifest") or {}).get("package_name")),
        ((data.get("summary") or {}).get("package_name")),
        ((data.get("manifest_json") or {}).get("package")),
    ]

    for value in candidates:
        if isinstance(value, str) and value.strip():
            return value.strip()

    return None


def _from_manifest_json(state: CaseState) -> str | None:
    path = state.manifest_json_path
    if not path or not path.exists():
        return None

    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return None

    candidates = [
        data.get("package"),
        data.get("package_name"),
        ((data.get("manifest") or {}).get("package")),
    ]

    for value in candidates:
        if isinstance(value, str) and value.strip():
            return value.strip()

    return None


def _from_apk_badging(apk_path: Path) -> str | None:
    """
    Usa aapt/aapt2 sobre la APK compilada. Es una buena última fuente porque
    devuelve el package final del artefacto instalado.
    """
    commands = [
        ["aapt", "dump", "badging", str(apk_path)],
        ["aapt2", "dump", "badging", str(apk_path)],
    ]

    for cmd in commands:
        try:
            proc = subprocess.run(
                cmd,
                check=False,
                capture_output=True,
                text=True,
                timeout=30,
            )
        except FileNotFoundError:
            continue
        except Exception:
            continue

        if proc.returncode != 0:
            continue

        for line in proc.stdout.splitlines():
            line = line.strip()
            if line.startswith("package:"):
                # Ejemplo: package: name='com.example.app' versionCode='1' ...
                marker = "name='"
                idx = line.find(marker)
                if idx != -1:
                    start = idx + len(marker)
                    end = line.find("'", start)
                    if end != -1:
                        value = line[start:end].strip()
                        if value:
                            return value

    return None