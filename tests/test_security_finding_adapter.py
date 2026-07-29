from __future__ import annotations

from andro_agent.domain.adapters.security_findings import (
    canonicalize_finding,
    canonicalize_findings,
    finding_to_web_dict,
    findings_to_web_dicts,
)
from andro_agent.domain.models.security import Confidence, FindingStatus, Severity
from andro_agent.web.services.result_service import normalize_findings


def test_raw_minimal_finding_becomes_valid_finding():
    finding = canonicalize_finding({}, case_id="case-1", source="manifest", index=0)

    assert finding.finding_id.startswith("FIND-")
    assert finding.case_id == "case-1"
    assert finding.title == "Untitled finding"
    assert finding.description == ""
    assert finding.severity == Severity.INFO
    assert finding.confidence == Confidence.MEDIUM
    assert finding.status == FindingStatus.STATIC_CANDIDATE
    assert finding.category == "manifest"
    assert finding.metadata["source"] == "manifest"
    assert finding.metadata["raw_finding"] == {}


def test_finding_id_generation_is_stable():
    first = canonicalize_finding({}, case_id="case-1", source="code", index=7)
    second = canonicalize_finding({}, case_id="case-1", source="code", index=7)

    assert first.finding_id == second.finding_id


def test_legacy_field_mapping():
    finding = canonicalize_finding(
        {
            "rule_id": "RULE-1",
            "issue": "Exported activity",
            "details": "Activity can be launched externally.",
            "risk": "high",
            "type": "attack_surface",
            "recommendation": "Restrict exported components.",
            "impact": "Unexpected external launch.",
            "refs": "https://example.test/ref",
        },
        case_id="case-1",
        source="manifest",
        index=0,
    )

    assert finding.finding_id == "RULE-1"
    assert finding.title == "Exported activity"
    assert finding.description == "Activity can be launched externally."
    assert finding.severity == Severity.HIGH
    assert finding.category == "attack_surface"
    assert finding.remediation == "Restrict exported components."
    assert finding.impact == "Unexpected external launch."
    assert finding.references == ["https://example.test/ref"]


def test_severity_aliases_are_normalized():
    aliases = {
        "informational": Severity.INFO,
        "info": Severity.INFO,
        "low": Severity.LOW,
        "medium": Severity.MEDIUM,
        "moderate": Severity.MEDIUM,
        "high": Severity.HIGH,
        "critical": Severity.CRITICAL,
        "crit": Severity.CRITICAL,
    }

    for raw_value, expected in aliases.items():
        finding = canonicalize_finding(
            {"severity": raw_value},
            case_id="case-1",
            source="code",
            index=0,
        )
        assert finding.severity == expected


def test_unknown_severity_becomes_info():
    finding = canonicalize_finding(
        {"severity": "severe"},
        case_id="case-1",
        source="code",
        index=0,
    )

    assert finding.severity == Severity.INFO


def test_missing_or_unknown_confidence_becomes_medium():
    missing = canonicalize_finding({}, case_id="case-1", source="code", index=0)
    unknown = canonicalize_finding(
        {"confidence": "certain"},
        case_id="case-1",
        source="code",
        index=1,
    )

    assert missing.confidence == Confidence.MEDIUM
    assert unknown.confidence == Confidence.MEDIUM


def test_confirmed_without_evidence_ids_is_downgraded():
    finding = canonicalize_finding(
        {"status": "confirmed"},
        case_id="case-1",
        source="dynamic",
        index=0,
    )

    assert finding.status == FindingStatus.STATIC_CANDIDATE
    assert finding.metadata["original_status"] == "confirmed"


def test_dynamic_confirmed_with_evidence_ids_is_preserved():
    finding = canonicalize_finding(
        {"status": "dynamic_confirmed", "evidence_ids": ["evidence-1"]},
        case_id="case-1",
        source="dynamic",
        index=0,
    )

    assert finding.status == FindingStatus.DYNAMIC_CONFIRMED
    assert finding.evidence_ids == ["evidence-1"]


def test_high_severity_low_confidence_is_upgraded_and_preserved():
    finding = canonicalize_finding(
        {"severity": "high", "confidence": "low"},
        case_id="case-1",
        source="code",
        index=0,
    )

    assert finding.confidence == Confidence.MEDIUM
    assert finding.metadata["original_confidence"] == "low"


def test_high_severity_low_confidence_is_allowed_when_inconclusive():
    finding = canonicalize_finding(
        {"severity": "critical", "confidence": "low", "status": "inconclusive"},
        case_id="case-1",
        source="code",
        index=0,
    )

    assert finding.severity == Severity.CRITICAL
    assert finding.confidence == Confidence.LOW
    assert finding.status == FindingStatus.INCONCLUSIVE


def test_evidence_strings_are_preserved_as_legacy_evidence():
    finding = canonicalize_finding(
        {"evidence": ["AndroidManifest.xml:12", "MainActivity.java:42"]},
        case_id="case-1",
        source="code",
        index=0,
    )

    assert finding.evidence_ids == []
    assert finding.metadata["legacy_evidence"] == ["AndroidManifest.xml:12", "MainActivity.java:42"]


def test_affected_components_are_extracted_from_legacy_locations():
    finding = canonicalize_finding(
        {
            "component": "com.example.MainActivity",
            "components": ["com.example.Provider"],
            "path": "jadx/MainActivity.java",
            "file": "AndroidManifest.xml",
            "location": "line:42",
        },
        case_id="case-1",
        source="manifest",
        index=0,
    )

    assert finding.affected_components == [
        "com.example.MainActivity",
        "com.example.Provider",
        "jadx/MainActivity.java",
        "AndroidManifest.xml",
        "line:42",
    ]


def test_masvs_and_cwe_fields_are_normalized_to_lists():
    finding = canonicalize_finding(
        {
            "masvs": "MASVS-PLATFORM, MASVS-CODE",
            "cwe_refs": ["CWE-22", 79],
            "references": ["https://example.test/a"],
        },
        case_id="case-1",
        source="code",
        index=0,
    )

    assert finding.masvs_refs == ["MASVS-PLATFORM", "MASVS-CODE"]
    assert finding.cwe_refs == ["CWE-22", "79"]
    assert finding.references == ["https://example.test/a"]


def test_finding_to_web_dict_preserves_web_fields():
    finding = canonicalize_finding(
        {
            "id": "legacy-id",
            "rule_id": "RULE-1",
            "title": "Exported activity",
            "description": "Exported activity.",
            "severity": "medium",
            "confidence": "high",
            "evidence": [{"relative_path": "AndroidManifest.xml"}],
            "category": "attack_surface",
        },
        case_id="case-1",
        source="manifest",
        index=0,
    )
    data = finding_to_web_dict(finding)

    assert data["id"] == "legacy-id"
    assert data["finding_id"] == "legacy-id"
    assert data["rule_id"] == "RULE-1"
    assert data["title"] == "Exported activity"
    assert data["description"] == "Exported activity."
    assert data["severity"] == "medium"
    assert data["confidence"] == "high"
    assert data["status"] == "static_candidate"
    assert data["category"] == "attack_surface"
    assert data["source"] == "manifest"
    assert data["evidence"] == [{"relative_path": "AndroidManifest.xml"}]
    assert "evidence_pretty" in data
    assert "metadata" in data


def test_finding_to_web_dict_uses_evidence_ids_when_no_legacy_evidence():
    finding = canonicalize_finding(
        {
            "title": "Confirmed exported activity",
            "severity": "high",
            "status": "dynamic_confirmed",
            "evidence_ids": ["evidence-1", "evidence-2"],
        },
        case_id="case-1",
        source="dynamic",
        index=0,
    )
    data = finding_to_web_dict(finding)

    assert data["evidence"] == ["evidence-1", "evidence-2"]
    assert data["evidence_pretty"] == '[\n  "evidence-1",\n  "evidence-2"\n]'


def test_batch_helpers_return_expected_types():
    findings = canonicalize_findings(
        [{"title": "One"}, {"title": "Two"}],
        case_id="case-1",
        source="code",
    )
    web_findings = findings_to_web_dicts(findings)

    assert [finding.title for finding in findings] == ["One", "Two"]
    assert [finding["title"] for finding in web_findings] == ["One", "Two"]


def test_normalize_findings_returns_web_compatible_structured_dicts():
    findings = normalize_findings(
        [
            {
                "rule_id": "RULE-1",
                "name": "Hardcoded token",
                "message": "A token-like value was found.",
                "level": "moderate",
                "confidence": "high",
                "evidence": ["jadx/sources/MainActivity.java:42"],
                "recommendation": "Move secrets to a backend.",
            }
        ],
        "code",
        state={"case_id": "case-1"},
    )

    assert len(findings) == 1
    assert findings[0]["finding_id"] == "RULE-1"
    assert findings[0]["title"] == "Hardcoded token"
    assert findings[0]["description"] == "A token-like value was found."
    assert findings[0]["severity"] == "medium"
    assert findings[0]["confidence"] == "high"
    assert findings[0]["status"] == "static_candidate"
    assert findings[0]["source"] == "code"
    assert findings[0]["rule_id"] == "RULE-1"
    assert findings[0]["evidence"] == ["jadx/sources/MainActivity.java:42"]
    assert findings[0]["metadata"]["legacy_evidence"] == ["jadx/sources/MainActivity.java:42"]


def test_normalize_findings_keeps_legacy_behavior_for_common_rule_findings():
    findings = normalize_findings(
        [
            {
                "rule_id": "EXPORTED_ACTIVITY",
                "summary": "Exported activity detected.",
                "severity": "high",
                "category": "attack_surface",
                "evidence": [{"key": "AndroidManifest.xml"}],
            }
        ],
        "manifest",
        state={"case_id": "case-1"},
    )

    assert findings[0]["title"] == "EXPORTED_ACTIVITY"
    assert findings[0]["description"] == "Exported activity detected."
    assert findings[0]["severity"] == "high"
    assert findings[0]["category"] == "attack_surface"
    assert findings[0]["evidence"] == [{"key": "AndroidManifest.xml", "relative_path": "AndroidManifest.xml"}]
