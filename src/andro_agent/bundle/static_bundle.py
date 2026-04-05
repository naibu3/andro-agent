from __future__ import annotations

import json
from datetime import datetime
from pathlib import Path
from typing import Any

from andro_agent.core.state import CaseState


def _load_json(path: Path | None) -> Any:
    if not path or not path.exists():
        return None
    try:
        return json.loads(path.read_text(encoding="utf-8"))
    except Exception:
        return None


def build_static_analysis_bundle(state: CaseState, artifacts_dir: Path) -> Path:
    case_dir = artifacts_dir / state.case_id
    bundle_dir = case_dir / "bundle"
    bundle_dir.mkdir(parents=True, exist_ok=True)

    manifest = _load_json(state.manifest_json_path)
    manifest_facts = _load_json(state.facts_path) or []
    manifest_findings = _load_json(state.findings_path) or []

    code_search_results = _load_json(state.code_search_results_path) or []
    code_facts = _load_json(state.code_facts_path) or []
    code_findings = _load_json(state.code_findings_path) or []

    correlated_findings = _load_json(state.correlated_findings_path) or []

    summary = {
        "exported_components": sum(
            1 for f in manifest_facts
            if f.get("type", "").endswith(".exported") and f.get("value") is True
        ),
        "dangerous_permissions": sum(
            1 for f in manifest_facts
            if "permission" in f.get("type", "")
        ),
        "code_matches": len(code_search_results),
        "manifest_findings": len(manifest_findings),
        "code_findings": len(code_findings),
        "correlated_findings": len(correlated_findings),
    }

    bundle = {
        "case_id": state.case_id,
        "apk_path": str(state.apk_path),

        "manifest": manifest,

        "manifest_facts": manifest_facts,
        "manifest_findings": manifest_findings,

        "code_search_results": code_search_results,
        "code_facts": code_facts,
        "code_findings": code_findings,

        "correlated_findings": correlated_findings,

        "summary": summary,

        "metadata": {
            "tools": ["apktool", "jadx", "code_search"],
            "generated_at": datetime.utcnow().isoformat(),
            "version": "1.0"
        }
    }

    bundle_path = bundle_dir / "static_analysis_bundle.json"
    bundle_path.write_text(
        json.dumps(bundle, indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return bundle_path