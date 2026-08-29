#!/usr/bin/env python3

from __future__ import annotations

import argparse
import re
from collections.abc import Callable
from pathlib import Path
from typing import Any

from andro_agent.investigation import StaticInvestigationTools


def safe_call(name: str, call: Callable[[], dict[str, Any]]) -> dict[str, Any]:
    try:
        return call()
    except Exception as exc:  # noqa: BLE001 - each smoke-test check must remain isolated
        return {"success": False, "error": f"{name} failed unexpectedly: {exc}"}


def status(result: dict[str, Any]) -> str:
    return "ok" if result.get("success") else f"failed: {result.get('error') or 'unknown error'}"


def selector_line(selector: Any) -> int | None:
    match = re.fullmatch(r"line:(\d+)", str(selector or "").strip())
    return int(match.group(1)) if match else None


def main() -> int:
    parser = argparse.ArgumentParser(description="Smoke-test read-only static investigation tools.")
    parser.add_argument("--case-dir", type=Path, required=True)
    args = parser.parse_args()
    tools = StaticInvestigationTools(args.case_dir)

    findings = safe_call("get_findings", lambda: tools.get_findings(limit=200))
    evidence = safe_call("get_evidence", lambda: tools.get_evidence(limit=200))
    facts = safe_call("get_manifest_facts", lambda: tools.get_manifest_facts(limit=5))

    sample_lookup: dict[str, Any]
    evidence_ids = [
        evidence_id
        for finding in findings.get("findings", [])
        for evidence_id in finding.get("evidence_ids", [])
    ]
    if evidence_ids:
        sample_lookup = safe_call(
            "get_evidence sample",
            lambda: tools.get_evidence([str(evidence_ids[0])], limit=1),
        )
    else:
        sample_lookup = {"success": False, "error": "no finding evidence ID was available"}

    search = safe_call("search_code", lambda: tools.search_code("Runtime.exec", top_k=5))
    search_query = "Runtime.exec"
    if search.get("success") and not search.get("matches"):
        search_query = "rawQuery"
        search = safe_call("search_code", lambda: tools.search_code(search_query, top_k=5))

    context: dict[str, Any] = {
        "success": False,
        "error": "no source evidence with an artifact path and line selector was available",
    }
    for item in evidence.get("evidence", []):
        artifact_path = item.get("artifact_path")
        line = selector_line(item.get("selector"))
        if artifact_path and line:
            context = safe_call(
                "open_source_context",
                lambda artifact_path=str(artifact_path), line=line: tools.open_source_context(
                    artifact_path,
                    line=line,
                    context_lines=3,
                    max_lines=7,
                ),
            )
            break

    print("# Static investigation tool smoke test")
    print()
    print(f"- `get_findings`: {status(findings)}; count={findings.get('count', 0)}")
    print(f"- `get_evidence`: {status(evidence)}; count={evidence.get('count', 0)}")
    print(f"- Sample evidence lookup: {status(sample_lookup)}")
    print(
        f"- `search_code` for `{search_query}`: {status(search)}; "
        f"matches={search.get('count', 0)}"
    )
    first_match = (search.get("matches") or [None])[0]
    if first_match:
        print(
            f"  - First match: `{first_match['path']}:{first_match['line']}` "
            f"— {first_match['line_text']}"
        )
    print(
        f"- `open_source_context`: {status(context)}; "
        f"lines={len(context.get('lines', []))}"
    )
    if context.get("success"):
        print(
            f"  - Context: `{context['artifact_path']}:{context['start_line']}-"
            f"{context['end_line']}`"
        )
    print(f"- `get_manifest_facts`: {status(facts)}; sample_count={facts.get('count', 0)}")
    for fact in facts.get("facts", [])[:3]:
        print(f"  - `{fact.get('type', 'unknown')}`: `{fact.get('key', 'unknown')}`")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
