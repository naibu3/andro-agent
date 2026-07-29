from __future__ import annotations

import json

import pytest
from pydantic import ValidationError

from andro_agent.domain.models.security import (
    Artifact,
    ArtifactKind,
    Confidence,
    Evidence,
    EvidenceType,
    Finding,
    FindingStatus,
    Hypothesis,
    HypothesisStatus,
    Severity,
    VerificationResult,
    VerificationStatus,
)


def test_enum_values():
    assert [item.value for item in Severity] == ["info", "low", "medium", "high", "critical"]
    assert [item.value for item in Confidence] == ["low", "medium", "high"]
    assert [item.value for item in FindingStatus] == [
        "static_candidate",
        "dynamic_confirmed",
        "refuted",
        "inconclusive",
    ]
    assert [item.value for item in EvidenceType] == [
        "manifest",
        "source",
        "smali",
        "string",
        "config",
        "logcat",
        "traffic",
        "screenshot",
        "adb",
        "frida",
        "tool_output",
        "report",
        "other",
    ]
    assert [item.value for item in ArtifactKind] == [
        "apktool_output",
        "jadx_output",
        "manifest",
        "source_file",
        "log",
        "traffic",
        "screenshot",
        "report",
        "json",
        "zip",
        "other",
    ]
    assert [item.value for item in HypothesisStatus] == [
        "open",
        "selected_for_verification",
        "confirmed",
        "refuted",
        "inconclusive",
    ]
    assert [item.value for item in VerificationStatus] == [
        "confirmed",
        "refuted",
        "inconclusive",
        "error",
    ]


@pytest.mark.parametrize(
    "model_class",
    [
        Evidence,
        Artifact,
        Finding,
        Hypothesis,
        VerificationResult,
    ],
)
def test_required_fields_are_enforced(model_class):
    with pytest.raises(ValidationError):
        model_class()


def test_default_list_and_dict_fields_are_not_shared():
    first = Finding(
        finding_id="finding-1",
        case_id="case-1",
        title="Exported activity",
        description="Activity is exported.",
        severity=Severity.MEDIUM,
        confidence=Confidence.MEDIUM,
        status=FindingStatus.STATIC_CANDIDATE,
    )
    second = Finding(
        finding_id="finding-2",
        case_id="case-1",
        title="Cleartext traffic",
        description="Cleartext traffic is enabled.",
        severity=Severity.LOW,
        confidence=Confidence.HIGH,
        status=FindingStatus.STATIC_CANDIDATE,
    )

    first.evidence_ids.append("evidence-1")
    first.metadata["owner"] = "static"

    assert second.evidence_ids == []
    assert second.metadata == {}

    first_hypothesis = Hypothesis(
        hypothesis_id="hypothesis-1",
        case_id="case-1",
        title="Deep link can be abused",
        rationale="The manifest exposes a browsable activity.",
        confidence=Confidence.MEDIUM,
        status=HypothesisStatus.OPEN,
    )
    second_hypothesis = Hypothesis(
        hypothesis_id="hypothesis-2",
        case_id="case-1",
        title="Provider can leak data",
        rationale="The provider has no read permission.",
        confidence=Confidence.LOW,
        status=HypothesisStatus.OPEN,
    )

    first_hypothesis.related_evidence_ids.append("evidence-1")
    first_hypothesis.metadata["priority"] = "manual"

    assert second_hypothesis.related_evidence_ids == []
    assert second_hypothesis.metadata == {}


def test_json_serialization():
    evidence = Evidence(
        evidence_id="evidence-1",
        case_id="case-1",
        evidence_type=EvidenceType.MANIFEST,
        source_tool="manifest_parser",
        metadata={"package": "com.example"},
    )

    payload = json.loads(evidence.model_dump_json())

    assert payload["evidence_id"] == "evidence-1"
    assert payload["evidence_type"] == "manifest"
    assert payload["timestamp"].endswith("Z")
    assert payload["metadata"] == {"package": "com.example"}


def test_dynamic_confirmed_finding_requires_evidence_ids():
    with pytest.raises(ValidationError, match="dynamic_confirmed"):
        Finding(
            finding_id="finding-1",
            case_id="case-1",
            title="Confirmed issue",
            description="Confirmed dynamically.",
            severity=Severity.HIGH,
            confidence=Confidence.HIGH,
            status=FindingStatus.DYNAMIC_CONFIRMED,
        )


def test_confirmed_verification_result_requires_evidence_ids():
    with pytest.raises(ValidationError, match="confirmed verification"):
        VerificationResult(
            verification_id="verification-1",
            case_id="case-1",
            hypothesis_id="hypothesis-1",
            status=VerificationStatus.CONFIRMED,
        )


@pytest.mark.parametrize("severity", [Severity.HIGH, Severity.CRITICAL])
def test_high_or_critical_finding_rejects_low_confidence(severity):
    with pytest.raises(ValidationError, match="low confidence"):
        Finding(
            finding_id="finding-1",
            case_id="case-1",
            title="Severe candidate",
            description="A severe issue needs stronger confidence.",
            severity=severity,
            confidence=Confidence.LOW,
            status=FindingStatus.STATIC_CANDIDATE,
        )


@pytest.mark.parametrize("severity", [Severity.HIGH, Severity.CRITICAL])
def test_high_or_critical_finding_allows_low_confidence_when_inconclusive(severity):
    finding = Finding(
        finding_id="finding-1",
        case_id="case-1",
        title="Unresolved severe candidate",
        description="Evidence is insufficient.",
        severity=severity,
        confidence=Confidence.LOW,
        status=FindingStatus.INCONCLUSIVE,
    )

    assert finding.status == FindingStatus.INCONCLUSIVE


def test_valid_sample_models():
    evidence = Evidence(
        evidence_id="evidence-1",
        case_id="case-1",
        evidence_type=EvidenceType.SOURCE,
        source_tool="code_search",
        artifact_path="jadx/sources/com/example/MainActivity.java",
        selector="line:42",
        snippet="webView.loadUrl(url)",
        sha256="a" * 64,
        metadata={"rule": "webview-load-url"},
    )
    artifact = Artifact(
        artifact_id="artifact-1",
        case_id="case-1",
        kind=ArtifactKind.SOURCE_FILE,
        name="MainActivity.java",
        path="jadx/sources/com/example/MainActivity.java",
        mime_type="text/x-java-source",
        size_bytes=1234,
        sha256="b" * 64,
        previewable=True,
    )
    finding = Finding(
        finding_id="finding-1",
        case_id="case-1",
        title="Unsafe WebView URL loading",
        description="A WebView loads a URL from an untrusted source.",
        severity=Severity.HIGH,
        confidence=Confidence.MEDIUM,
        status=FindingStatus.STATIC_CANDIDATE,
        category="webview",
        masvs_refs=["MASVS-PLATFORM"],
        cwe_refs=["CWE-939"],
        affected_components=["com.example.MainActivity"],
        evidence_ids=[evidence.evidence_id],
        impact="An attacker may control loaded content.",
        reproduction_steps=["Open the exported activity with a controlled URL."],
        remediation="Validate and constrain URLs before loading them.",
        references=["https://developer.android.com/privacy-and-security/risks/unsafe-uri-loading"],
    )
    hypothesis = Hypothesis(
        hypothesis_id="hypothesis-1",
        case_id="case-1",
        title="WebView accepts attacker-controlled URL",
        rationale="Static evidence shows WebView.loadUrl receives external input.",
        related_evidence_ids=[evidence.evidence_id],
        proposed_dynamic_checks=["Launch activity with malicious URL extra."],
        confidence=Confidence.MEDIUM,
        status=HypothesisStatus.SELECTED_FOR_VERIFICATION,
    )
    verification = VerificationResult(
        verification_id="verification-1",
        case_id="case-1",
        hypothesis_id=hypothesis.hypothesis_id,
        status=VerificationStatus.CONFIRMED,
        evidence_ids=[evidence.evidence_id],
        steps_executed=["Started activity with crafted intent."],
        notes="The WebView loaded the controlled URL.",
    )

    assert evidence.evidence_type == EvidenceType.SOURCE
    assert artifact.downloadable is True
    assert artifact.previewable is True
    assert finding.evidence_ids == ["evidence-1"]
    assert hypothesis.related_evidence_ids == ["evidence-1"]
    assert verification.evidence_ids == ["evidence-1"]
