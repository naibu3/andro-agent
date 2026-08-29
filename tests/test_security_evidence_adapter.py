from __future__ import annotations

import json

from andro_agent.domain.adapters.security_evidence import (
    attach_evidence_to_finding_dicts,
    canonicalize_evidence,
    evidence_id_for,
)
from andro_agent.domain.models.security import EvidenceType
from andro_agent.web.services.result_service import (
    build_download_bundle,
    collect_findings_and_evidence_from_state,
    collect_findings_from_state,
    export_canonical_findings_and_evidence,
    normalize_findings,
    normalize_findings_with_evidence,
    write_evidence_json_if_possible,
    write_final_download_files,
)


def test_evidence_id_generation_is_stable():
    first = evidence_id_for("case-1", "code", "finding-1", 0, {"path": "MainActivity.java"})
    second = evidence_id_for("case-1", "code", "finding-1", 0, {"path": "MainActivity.java"})

    assert first == second
    assert first.startswith("EVID-")
    assert len(first) == 17


def test_string_path_evidence_maps_artifact_path_and_selector():
    evidence = canonicalize_evidence(
        "jadx/sources/MainActivity.java:42",
        case_id="case-1",
        source="code",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.artifact_path == "jadx/sources/MainActivity.java"
    assert evidence.selector == "line:42"
    assert evidence.snippet is None


def test_string_non_path_evidence_becomes_snippet():
    evidence = canonicalize_evidence(
        "usesCleartextTraffic=true",
        case_id="case-1",
        source="manifest",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.artifact_path is None
    assert evidence.selector is None
    assert evidence.snippet == "usesCleartextTraffic=true"


def test_dict_evidence_maps_relative_path_line_and_snippet():
    evidence = canonicalize_evidence(
        {
            "relative_path": "jadx/sources/MainActivity.java",
            "line": 42,
            "snippet": "webView.loadUrl(url)",
        },
        case_id="case-1",
        source="code",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.artifact_path == "jadx/sources/MainActivity.java"
    assert evidence.selector == "line:42"
    assert evidence.snippet == "webView.loadUrl(url)"


def test_manifest_evidence_gets_manifest_type():
    evidence = canonicalize_evidence(
        "AndroidManifest.xml:12",
        case_id="case-1",
        source="code",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.evidence_type == EvidenceType.MANIFEST


def test_java_and_kotlin_path_evidence_gets_source_type():
    java_evidence = canonicalize_evidence(
        "jadx/sources/MainActivity.java",
        case_id="case-1",
        source="other",
        finding_id="finding-1",
        index=0,
    )
    kotlin_evidence = canonicalize_evidence(
        "jadx/sources/MainActivity.kt",
        case_id="case-1",
        source="other",
        finding_id="finding-1",
        index=1,
    )

    assert java_evidence.evidence_type == EvidenceType.SOURCE
    assert kotlin_evidence.evidence_type == EvidenceType.SOURCE


def test_smali_path_evidence_gets_smali_type():
    evidence = canonicalize_evidence(
        "apktool/smali/com/example/MainActivity.smali:10",
        case_id="case-1",
        source="manifest",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.evidence_type == EvidenceType.SMALI


def test_arbitrary_dict_evidence_is_preserved_in_metadata():
    raw = {"component": "com.example.Provider", "reason": "exported without permission"}
    evidence = canonicalize_evidence(
        raw,
        case_id="case-1",
        source="manifest",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.snippet == "exported without permission"
    assert evidence.metadata["raw_evidence"] == raw
    assert evidence.metadata["finding_id"] == "finding-1"
    assert evidence.metadata["source"] == "manifest"


def test_legacy_code_evidence_maps_path_line_text_and_metadata(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    source_path = case_dir / "jadx" / "sources" / "MainActivity.java"
    raw = {
        "type": "code.pattern.webview_loadUrl",
        "key": str(source_path),
        "value": True,
        "source": "code_search",
        "confidence": "high",
        "metadata": {"line_number": 43, "line_text": "$webView.loadUrl(url);"},
    }

    evidence = canonicalize_evidence(
        raw,
        case_id="case-1",
        source="code",
        finding_id="finding-1",
        index=0,
        case_dir=case_dir,
    )

    assert evidence.artifact_path == "jadx/sources/MainActivity.java"
    assert evidence.selector == "line:43"
    assert evidence.snippet == "$webView.loadUrl(url);"
    assert evidence.evidence_type == EvidenceType.SOURCE
    assert evidence.metadata["raw_evidence"] == raw
    assert evidence.metadata["legacy_type"] == "code.pattern.webview_loadUrl"
    assert evidence.metadata["legacy_source"] == "code_search"
    assert evidence.metadata["legacy_confidence"] == "high"


def test_legacy_manifest_key_and_value_produce_useful_evidence():
    raw = {
        "type": "manifest.application.debuggable",
        "key": "debuggable",
        "value": True,
        "source": "manifest",
        "confidence": "high",
        "metadata": {},
    }

    evidence = canonicalize_evidence(
        raw,
        case_id="case-1",
        source="manifest",
        finding_id="finding-1",
        index=0,
    )

    assert evidence.artifact_path is None
    assert evidence.selector == "debuggable"
    assert evidence.snippet == "debuggable=True"
    assert evidence.evidence_type == EvidenceType.MANIFEST
    assert evidence.metadata["raw_evidence"] == raw
    assert evidence.metadata["legacy_type"] == "manifest.application.debuggable"
    assert evidence.metadata["legacy_confidence"] == "high"


def test_attach_evidence_to_finding_dicts_adds_evidence_ids():
    findings, evidences = attach_evidence_to_finding_dicts(
        [
            {
                "finding_id": "finding-1",
                "source": "code",
                "metadata": {"legacy_evidence": ["MainActivity.java:42"]},
                "evidence": ["MainActivity.java:42"],
            }
        ],
        case_id="case-1",
        source="code",
    )

    assert findings[0]["evidence_ids"] == [evidences[0]["evidence_id"]]
    assert evidences[0]["artifact_path"] == "MainActivity.java"


def test_attach_evidence_to_finding_dicts_deduplicates_evidence_by_id():
    raw_evidence = "MainActivity.java:42"
    findings, evidences = attach_evidence_to_finding_dicts(
        [
            {"finding_id": "finding-1", "source": "code", "evidence": [raw_evidence]},
            {"finding_id": "finding-1", "source": "code", "evidence": [raw_evidence]},
        ],
        case_id="case-1",
        source="code",
    )

    assert len(evidences) == 1
    assert findings[0]["evidence_ids"] == findings[1]["evidence_ids"]


def test_attach_evidence_preserves_existing_evidence_for_web():
    findings, _ = attach_evidence_to_finding_dicts(
        [{"finding_id": "finding-1", "evidence": [{"relative_path": "AndroidManifest.xml"}]}],
        case_id="case-1",
        source="manifest",
    )

    assert findings[0]["evidence"] == [{"relative_path": "AndroidManifest.xml"}]
    assert "evidence_pretty" in findings[0]


def test_attach_evidence_preserves_and_combines_existing_evidence_ids_without_duplicates():
    generated_id = evidence_id_for("case-1", "code", "finding-1", 0, "MainActivity.java:42")
    findings, evidences = attach_evidence_to_finding_dicts(
        [
            {
                "finding_id": "finding-1",
                "source": "code",
                "evidence_ids": ["existing-evidence", generated_id],
                "evidence": ["MainActivity.java:42"],
            }
        ],
        case_id="case-1",
        source="code",
    )

    assert findings[0]["evidence_ids"] == ["existing-evidence", generated_id]
    assert evidences[0]["evidence_id"] == generated_id


def test_normalize_findings_still_returns_list_of_dicts():
    findings = normalize_findings(
        [{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["MainActivity.java:42"]}],
        "code",
        state={"case_id": "case-1"},
    )

    assert isinstance(findings, list)
    assert isinstance(findings[0], dict)
    assert findings[0]["finding_id"] == "RULE-1"


def test_normalize_findings_with_evidence_returns_findings_and_evidence_dicts():
    findings, evidences = normalize_findings_with_evidence(
        [{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["MainActivity.java:42"]}],
        "code",
        state={"case_id": "case-1"},
    )

    assert findings[0]["evidence_ids"] == [evidences[0]["evidence_id"]]
    assert findings[0]["evidence"] == ["MainActivity.java:42"]
    assert evidences[0]["case_id"] == "case-1"
    assert evidences[0]["source_tool"] == "code"


def test_collect_findings_and_evidence_from_state_returns_findings_with_evidence_ids(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    findings_dir = case_dir / "findings"
    findings_dir.mkdir(parents=True)
    findings_path = findings_dir / "manifest_findings.json"
    findings_path.write_text(
        '[{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["AndroidManifest.xml:12"]}]',
        encoding="utf-8",
    )

    findings, evidence = collect_findings_and_evidence_from_state(
        {
            "case_id": "case-1",
            "findings_path": str(findings_path),
        }
    )

    assert findings[0]["evidence_ids"] == [evidence[0]["evidence_id"]]
    assert evidence[0]["artifact_path"] == "AndroidManifest.xml"


def test_collect_findings_and_evidence_from_state_returns_evidence_dicts(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    findings_dir = case_dir / "findings"
    findings_dir.mkdir(parents=True)
    findings_path = findings_dir / "manifest_findings.json"
    findings_path.write_text(
        '[{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["AndroidManifest.xml:12"]}]',
        encoding="utf-8",
    )

    _, evidence = collect_findings_and_evidence_from_state(
        {
            "case_id": "case-1",
            "findings_path": str(findings_path),
        }
    )

    assert isinstance(evidence, list)
    assert isinstance(evidence[0], dict)
    assert evidence[0]["evidence_id"].startswith("EVID-")


def test_collect_findings_and_evidence_from_state_deduplicates_evidence(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    findings_dir = case_dir / "findings"
    findings_dir.mkdir(parents=True)
    findings_path = findings_dir / "manifest_findings.json"
    code_findings_path = findings_dir / "code_findings.json"
    payload = '[{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["MainActivity.java:42"]}]'
    findings_path.write_text(payload, encoding="utf-8")
    code_findings_path.write_text(payload, encoding="utf-8")

    _, evidence = collect_findings_and_evidence_from_state(
        {
            "case_id": "case-1",
            "findings_path": str(findings_path),
            "code_findings_path": str(code_findings_path),
        }
    )

    assert len({item["evidence_id"] for item in evidence}) == len(evidence)


def test_collect_findings_from_state_remains_list_of_dicts(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    findings_dir = case_dir / "findings"
    findings_dir.mkdir(parents=True)
    findings_path = findings_dir / "manifest_findings.json"
    findings_path.write_text(
        '[{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["AndroidManifest.xml:12"]}]',
        encoding="utf-8",
    )

    findings = collect_findings_from_state(
        {
            "case_id": "case-1",
            "findings_path": str(findings_path),
        }
    )

    assert isinstance(findings, list)
    assert isinstance(findings[0], dict)


def test_export_canonical_findings_and_evidence_preserves_legacy_files(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    findings_dir = case_dir / "findings"
    findings_dir.mkdir(parents=True)
    manifest_path = findings_dir / "manifest_findings.json"
    code_path = findings_dir / "code_findings.json"
    manifest_payload = json.dumps(
        [
            {
                "rule_id": "MANIFEST_DEBUGGABLE",
                "title": "Debuggable application",
                "severity": "high",
                "evidence": [
                    {
                        "type": "manifest.application.debuggable",
                        "key": "debuggable",
                        "value": True,
                        "source": "manifest",
                        "confidence": "high",
                        "metadata": {},
                    }
                ],
            }
        ]
    )
    code_payload = json.dumps(
        [
            {
                "rule_id": "CODE_WEBVIEW_LOAD_URL",
                "title": "WebView URL loading",
                "severity": "medium",
                "evidence": [
                    {
                        "type": "code.pattern.webview_loadUrl",
                        "key": str(case_dir / "jadx/sources/MainActivity.java"),
                        "value": True,
                        "source": "code_search",
                        "confidence": "high",
                        "metadata": {"line_number": 43, "line_text": "loadUrl(url);"},
                    }
                ],
            }
        ]
    )
    manifest_path.write_text(manifest_payload, encoding="utf-8")
    code_path.write_text(code_payload, encoding="utf-8")

    canonical_path, evidence_path = export_canonical_findings_and_evidence(
        state={
            "case_id": "case-1",
            "findings_path": str(manifest_path),
            "code_findings_path": str(code_path),
        },
        output_dir=case_dir,
    )

    assert canonical_path == findings_dir / "canonical_findings.json"
    assert evidence_path == case_dir / "evidence" / "evidence.json"
    canonical = json.loads(canonical_path.read_text(encoding="utf-8"))
    evidence = json.loads(evidence_path.read_text(encoding="utf-8"))
    assert len(canonical) == 2
    assert all(finding["finding_id"] for finding in canonical)
    assert all(finding["evidence_ids"] for finding in canonical)
    assert all(item["evidence_id"].startswith("EVID-") for item in evidence)
    assert canonical[0]["evidence"]
    assert canonical[0]["metadata"]["raw_finding"]
    assert manifest_path.read_text(encoding="utf-8") == manifest_payload
    assert code_path.read_text(encoding="utf-8") == code_payload


def test_export_canonical_findings_handles_missing_files(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    case_dir.mkdir(parents=True)

    paths = export_canonical_findings_and_evidence(
        state={"case_id": "case-1"},
        output_dir=case_dir,
    )

    assert paths == (None, None)


def test_write_evidence_json_if_possible_writes_valid_json(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    reports_dir = case_dir / "reports"
    reports_dir.mkdir(parents=True)
    report_path = reports_dir / "static_report.md"
    report_path.write_text("# Report", encoding="utf-8")
    evidence = [{"evidence_id": "EVID-123", "case_id": "case-1"}]

    path = write_evidence_json_if_possible(
        state={"case_id": "case-1", "static_report_path": str(report_path)},
        evidence=evidence,
    )

    assert path == case_dir / "evidence" / "evidence.json"
    assert path is not None
    assert path.read_text(encoding="utf-8").startswith("[")


def test_write_evidence_json_if_possible_returns_none_for_empty_evidence(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    reports_dir = case_dir / "reports"
    reports_dir.mkdir(parents=True)
    report_path = reports_dir / "static_report.md"
    report_path.write_text("# Report", encoding="utf-8")

    path = write_evidence_json_if_possible(
        state={"case_id": "case-1", "static_report_path": str(report_path)},
        evidence=[],
    )

    assert path is None


def test_write_evidence_json_if_possible_returns_none_without_safe_path():
    path = write_evidence_json_if_possible(
        state={"case_id": "case-1"},
        evidence=[{"evidence_id": "EVID-123"}],
    )

    assert path is None


def test_write_final_download_files_includes_evidence_path_when_evidence_exists(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    reports_dir = case_dir / "reports"
    findings_dir = case_dir / "findings"
    reports_dir.mkdir(parents=True)
    findings_dir.mkdir(parents=True)
    report_path = reports_dir / "static_report.md"
    findings_path = findings_dir / "manifest_findings.json"
    report_path.write_text("# Report", encoding="utf-8")
    findings_path.write_text(
        '[{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["AndroidManifest.xml:12"]}]',
        encoding="utf-8",
    )

    paths = write_final_download_files(
        case_dir=case_dir,
        case={"id": "case-1", "filename": "app.apk"},
        state={
            "case_id": "case-1",
            "static_report_path": str(report_path),
            "findings_path": str(findings_path),
        },
        findings=[],
    )

    assert paths["evidence"] == case_dir / "evidence" / "evidence.json"
    assert paths["evidence"].exists()


def test_bundle_includes_evidence_once(tmp_path):
    case_dir = tmp_path / "artifacts" / "case-1"
    reports_dir = case_dir / "reports"
    findings_dir = case_dir / "findings"
    reports_dir.mkdir(parents=True)
    findings_dir.mkdir(parents=True)
    report_path = reports_dir / "static_report.md"
    findings_path = findings_dir / "manifest_findings.json"
    report_path.write_text("# Report", encoding="utf-8")
    findings_path.write_text(
        '[{"rule_id": "RULE-1", "summary": "Issue", "evidence": ["AndroidManifest.xml:12"]}]',
        encoding="utf-8",
    )

    bundle_path = build_download_bundle(
        case_dir=case_dir,
        case={"id": "case-1", "filename": "app.apk"},
        state={
            "case_id": "case-1",
            "static_report_path": str(report_path),
            "findings_path": str(findings_path),
        },
        findings=[],
    )

    import zipfile

    with zipfile.ZipFile(bundle_path) as bundle:
        names = set(bundle.namelist())

    assert "evidence/evidence.json" in names
    assert "artifacts/artifacts.json" in names
    assert "artifacts/evidence/evidence.json" not in names
    assert "artifacts/artifacts/artifacts.json" not in names
