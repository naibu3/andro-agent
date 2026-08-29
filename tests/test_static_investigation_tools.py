from __future__ import annotations

import hashlib
import json
from pathlib import Path

from andro_agent.investigation import StaticInvestigationTools


def _write_json(path: Path, value: object) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value, indent=2), encoding="utf-8")


def _case(tmp_path: Path) -> Path:
    case_dir = tmp_path / "artifacts" / "case-1"
    canonical = [
        {
            "finding_id": "FIND-1",
            "rule_id": "RULE-1",
            "title": "Manifest issue",
            "description": "Description",
            "severity": "high",
            "category": "manifest",
            "source": "manifest",
            "evidence_ids": ["EVID-1"],
            "metadata": {"raw_finding": {"path": str(tmp_path / "private")}},
        },
        {
            "finding_id": "FIND-2",
            "rule_id": "RULE-2",
            "title": "Code issue",
            "description": "Description",
            "severity": "medium",
            "category": "code",
            "source": "code",
            "evidence_ids": ["EVID-2"],
        },
        {
            "finding_id": "FIND-3",
            "rule_id": "RULE-3",
            "title": "Another code issue",
            "severity": "low",
            "category": "code",
            "source": "code",
            "evidence_ids": [],
        },
    ]
    evidence = [
        {
            "evidence_id": "EVID-1",
            "case_id": "case-1",
            "evidence_type": "manifest",
            "source_tool": "manifest",
            "selector": "debuggable",
            "snippet": "debuggable=True",
            "metadata": {"raw_evidence": {"path": str(tmp_path / "private")}},
        },
        {
            "evidence_id": "EVID-2",
            "case_id": "case-1",
            "evidence_type": "source",
            "source_tool": "code",
            "artifact_path": "jadx/sources/com/example/Main.java",
            "selector": "line:4",
            "snippet": "Runtime.exec(command);",
        },
    ]
    facts = [
        {
            "type": "manifest.application.debuggable",
            "key": "debuggable",
            "value": True,
            "source": "manifest",
            "confidence": "high",
            "metadata": {},
        },
        {
            "type": "manifest.component.activity.exported",
            "key": "com.example.MainActivity",
            "value": True,
            "source": "manifest",
            "confidence": "high",
            "metadata": {"component_type": "activity"},
        },
    ]
    _write_json(case_dir / "findings" / "canonical_findings.json", canonical)
    _write_json(case_dir / "evidence" / "evidence.json", evidence)
    _write_json(case_dir / "facts" / "manifest_facts.json", facts)
    source = case_dir / "jadx" / "sources" / "com" / "example" / "Main.java"
    source.parent.mkdir(parents=True)
    source.write_text(
        "package com.example;\n"
        "class Main {\n"
        "  void execute() {\n"
        "    Runtime.exec(command);\n"
        "    db.rawQuery(query, null);\n"
        "  }\n"
        "}",
        encoding="utf-8",
    )
    return case_dir


def _hash_files(case_dir: Path) -> dict[str, str]:
    return {
        path.relative_to(case_dir).as_posix(): hashlib.sha256(path.read_bytes()).hexdigest()
        for path in sorted(case_dir.rglob("*"))
        if path.is_file()
    }


def test_get_findings_returns_canonical_and_respects_filters(tmp_path: Path) -> None:
    tools = StaticInvestigationTools(_case(tmp_path))

    all_findings = tools.get_findings()
    filtered = tools.get_findings(source="code", severity="medium", category="code")

    assert all_findings["success"] is True
    assert [item["finding_id"] for item in all_findings["findings"]] == [
        "FIND-1",
        "FIND-2",
        "FIND-3",
    ]
    assert filtered["count"] == 1
    assert filtered["findings"][0]["finding_id"] == "FIND-2"
    assert "metadata" not in all_findings["findings"][0]


def test_get_findings_enforces_limit(tmp_path: Path) -> None:
    tools = StaticInvestigationTools(_case(tmp_path))

    result = tools.get_findings(limit=1)

    assert result["count"] == 1
    assert result["truncated"] is True


def test_get_findings_falls_back_to_legacy_files(tmp_path: Path) -> None:
    case_dir = _case(tmp_path)
    (case_dir / "findings" / "canonical_findings.json").unlink()
    _write_json(
        case_dir / "findings" / "manifest_findings.json",
        [{"rule_id": "MANIFEST-1", "severity": "high", "category": "manifest"}],
    )
    _write_json(
        case_dir / "findings" / "code_findings.json",
        [{"rule_id": "CODE-1", "severity": "low", "category": "code"}],
    )

    result = StaticInvestigationTools(case_dir).get_findings(source="code")

    assert result["success"] is True
    assert result["count"] == 1
    assert result["findings"][0]["finding_id"] == "CODE-1"


def test_get_evidence_selects_ids_and_reports_missing(tmp_path: Path) -> None:
    tools = StaticInvestigationTools(_case(tmp_path))

    result = tools.get_evidence(["EVID-2", "EVID-MISSING"])

    assert result["success"] is True
    assert [item["evidence_id"] for item in result["evidence"]] == ["EVID-2"]
    assert result["missing_evidence_ids"] == ["EVID-MISSING"]


def test_search_code_is_bounded_relative_and_case_scoped(tmp_path: Path) -> None:
    case_dir = _case(tmp_path)
    second = case_dir / "jadx" / "sources" / "Second.kt"
    second.write_text("Runtime.exec(other)\n", encoding="utf-8")
    outside = tmp_path / "outside.java"
    outside.write_text("Runtime.exec(outside)\n", encoding="utf-8")

    result = StaticInvestigationTools(case_dir).search_code("Runtime.exec", top_k=1)

    assert result["success"] is True
    assert result["count"] == 1
    assert result["truncated"] is True
    assert not Path(result["matches"][0]["path"]).is_absolute()
    assert result["matches"][0]["path"].startswith("jadx/sources/")
    assert "outside.java" not in json.dumps(result)


def test_open_source_context_returns_numbered_bounded_lines(tmp_path: Path) -> None:
    tools = StaticInvestigationTools(_case(tmp_path))

    result = tools.open_source_context(
        "jadx/sources/com/example/Main.java",
        line=4,
        context_lines=10,
        max_lines=3,
    )

    assert result["success"] is True
    assert len(result["lines"]) == 3
    assert [item["line"] for item in result["lines"]] == [3, 4, 5]
    assert result["artifact_path"] == "jadx/sources/com/example/Main.java"
    assert result["truncated"] is True


def test_open_source_context_rejects_traversal_and_outside_absolute_path(
    tmp_path: Path,
) -> None:
    case_dir = _case(tmp_path)
    outside = tmp_path / "outside.java"
    outside.write_text("secret", encoding="utf-8")
    tools = StaticInvestigationTools(case_dir)

    traversal = tools.open_source_context("jadx/sources/../../../outside.java")
    absolute = tools.open_source_context(str(outside.resolve()))

    assert traversal["success"] is False
    assert "traversal" in traversal["error"].lower()
    assert absolute["success"] is False
    assert "outside" in absolute["error"].lower()


def test_get_manifest_facts_is_filtered_and_bounded(tmp_path: Path) -> None:
    tools = StaticInvestigationTools(_case(tmp_path))

    result = tools.get_manifest_facts(component="MainActivity", limit=1)

    assert result["success"] is True
    assert result["count"] == 1
    assert result["facts"][0]["key"] == "com.example.MainActivity"


def test_missing_files_return_structured_errors(tmp_path: Path) -> None:
    case_dir = tmp_path / "case-empty"
    case_dir.mkdir()
    tools = StaticInvestigationTools(case_dir)

    results = [
        tools.get_findings(),
        tools.get_evidence(),
        tools.search_code("rawQuery"),
        tools.open_source_context("jadx/sources/Missing.java"),
        tools.get_manifest_facts(),
    ]

    assert all(result["success"] is False for result in results)
    assert all(isinstance(result["error"], str) and result["error"] for result in results)


def test_tools_do_not_modify_inputs_or_leak_absolute_paths(tmp_path: Path) -> None:
    case_dir = _case(tmp_path)
    before = _hash_files(case_dir)
    tools = StaticInvestigationTools(case_dir)

    results = [
        tools.get_findings(),
        tools.get_evidence(),
        tools.search_code("rawQuery"),
        tools.open_source_context("jadx/sources/com/example/Main.java", line=5),
        tools.get_manifest_facts(),
    ]

    assert _hash_files(case_dir) == before
    serialized = json.dumps(results)
    assert str(tmp_path) not in serialized
