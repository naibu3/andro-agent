from __future__ import annotations

from andro_agent.web.services.report_rendering import (
    evidence_lookup_by_id,
    render_evidence_reference,
    render_finding_markdown,
    render_structured_report_markdown,
)
from andro_agent.web.services.result_service import final_report_markdown


def sample_evidence() -> dict:
    return {
        "evidence_id": "EVID-123",
        "case_id": "case-1",
        "evidence_type": "source",
        "source_tool": "code",
        "artifact_path": "jadx/sources/MainActivity.java",
        "selector": "line:42",
        "snippet": "webView.loadUrl(url)",
    }


def sample_finding() -> dict:
    return {
        "finding_id": "FIND-123",
        "title": "Unsafe WebView URL loading",
        "description": "A WebView loads attacker-controlled content.",
        "severity": "high",
        "confidence": "medium",
        "status": "static_candidate",
        "category": "webview",
        "masvs_refs": ["MASVS-PLATFORM"],
        "cwe_refs": ["CWE-939"],
        "affected_components": ["com.example.MainActivity"],
        "evidence_ids": ["EVID-123"],
        "impact": "An attacker may control rendered content.",
        "reproduction_steps": ["Launch the activity with a crafted URL."],
        "remediation": "Validate URLs before loading them.",
        "references": ["https://example.test/webview"],
    }


def test_evidence_lookup_by_id_builds_lookup():
    lookup = evidence_lookup_by_id([sample_evidence()])

    assert lookup["EVID-123"]["artifact_path"] == "jadx/sources/MainActivity.java"


def test_render_evidence_reference_includes_available_fields():
    markdown = render_evidence_reference(sample_evidence())

    assert "Evidence ID: `EVID-123`" in markdown
    assert "Type: `source`" in markdown
    assert "Source tool: `code`" in markdown
    assert "Artifact path: `jadx/sources/MainActivity.java`" in markdown
    assert "Selector: `line:42`" in markdown
    assert "Snippet: `webView.loadUrl(url)`" in markdown


def test_render_finding_markdown_renders_linked_evidence_details():
    markdown = render_finding_markdown(sample_finding(), {"EVID-123": sample_evidence()})

    assert "### [HIGH] Unsafe WebView URL loading" in markdown
    assert "Finding ID: `FIND-123`" in markdown
    assert "Evidence ID: `EVID-123`" in markdown
    assert "Snippet: `webView.loadUrl(url)`" in markdown


def test_render_finding_markdown_renders_missing_evidence():
    finding = sample_finding()
    finding["evidence_ids"] = ["EVID-MISSING"]

    markdown = render_finding_markdown(finding, {})

    assert "Missing evidence: `EVID-MISSING`" in markdown


def test_render_finding_markdown_renders_legacy_evidence_without_ids():
    finding = sample_finding()
    finding["evidence_ids"] = []
    finding["evidence"] = [{"relative_path": "AndroidManifest.xml"}]

    markdown = render_finding_markdown(finding, {})

    assert "Legacy evidence" in markdown
    assert "AndroidManifest.xml" in markdown


def test_render_structured_report_markdown_includes_summary_methodology_and_findings():
    markdown = render_structured_report_markdown(
        case={
            "id": "case-1",
            "filename": "app.apk",
            "sha256": "a" * 64,
            "package_name": "com.example",
        },
        state={"case_id": "case-1"},
        findings=[sample_finding()],
        evidence=[sample_evidence()],
    )

    assert "# Android Security Analysis Report" in markdown
    assert "## Executive Summary" in markdown
    assert "Package name: `com.example`" in markdown
    assert "Total findings: **1**" in markdown
    assert "## Methodology" in markdown
    assert "static analysis" in markdown
    assert "## Findings" in markdown
    assert "Evidence ID: `EVID-123`" in markdown


def test_final_report_markdown_uses_structured_findings_and_evidence():
    markdown = final_report_markdown(
        case={"id": "case-1", "filename": "app.apk", "sha256": "a" * 64},
        state={"case_id": "case-1"},
        findings=[sample_finding()],
        evidence=[sample_evidence()],
    )

    assert "# Android Security Analysis Report" in markdown
    assert "Evidence ID: `EVID-123`" in markdown
