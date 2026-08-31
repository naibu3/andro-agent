from __future__ import annotations

import asyncio
import importlib
import json
import zipfile
from pathlib import Path
from types import SimpleNamespace

import pytest
from fastapi import BackgroundTasks, HTTPException
from starlette.requests import Request
from starlette.routing import Match

from andro_agent.web.services.result_service import (
    attach_evidence_to_web_findings,
    collect_findings_and_evidence_from_state,
    load_evidence_for_case,
)


class MultipartUpload:
    filename = "app.apk"

    async def read(self, size):
        if hasattr(self, "consumed"):
            return b""
        self.consumed = True
        return b"apk"


@pytest.fixture()
def web_context(tmp_path, monkeypatch):
    monkeypatch.setenv("ANDRO_AGENT_DATA_DIR", str(tmp_path / "data"))
    monkeypatch.setenv("ANDRO_AGENT_DB", str(tmp_path / "data" / "andro_agent.db"))
    monkeypatch.setenv("ANDRO_AGENT_UPLOADS_DIR", str(tmp_path / "data" / "uploads"))
    monkeypatch.setenv("ANDRO_AGENT_ARTIFACTS_DIR", str(tmp_path / "data" / "artifacts"))

    import andro_agent.web.settings as settings
    import andro_agent.web.db as db
    import andro_agent.web.routes.api_scans as api_scans
    import andro_agent.web.routes.pages as pages

    importlib.reload(settings)
    importlib.reload(db)
    importlib.reload(api_scans)
    importlib.reload(pages)
    db.init_db()

    return {
        "api": api_scans,
        "pages": pages,
        "repo": api_scans.case_repo,
        "uploads_dir": settings.UPLOADS_DIR,
        "artifacts_dir": settings.ARTIFACTS_DIR,
    }


def render_case_detail(web_context, case_id: str) -> str:
    return case_detail_response(web_context, case_id).body.decode("utf-8")


def case_detail_response(web_context, case_id: str):
    request = Request(
        {
            "type": "http",
            "method": "GET",
            "path": f"/cases/{case_id}",
            "headers": [],
        }
    )
    return web_context["pages"].case_detail(request, case_id)


def create_case(
    web_context,
    case_id: str,
    status: str,
    *,
    analysis_profile: str = "static_basic",
    agentic_mode: str = "none",
    agentic_budget: str = "balanced",
    llm_provider: str | None = None,
    llm_model: str | None = None,
):
    repo = web_context["repo"]
    uploads_dir = web_context["uploads_dir"]
    artifacts_root = web_context["artifacts_dir"]
    uploads_dir.mkdir(parents=True, exist_ok=True)
    artifacts_root.mkdir(parents=True, exist_ok=True)

    apk_path = uploads_dir / f"{case_id}.apk"
    apk_path.write_bytes(b"apk")
    case_dir = artifacts_root / case_id
    case_dir.mkdir(parents=True, exist_ok=True)

    repo.create_case(
        case_id=case_id,
        filename=f"{case_id}.apk",
        sha256="a" * 64,
        apk_path=apk_path,
        artifacts_dir=case_dir,
        analysis_profile=analysis_profile,
        agentic_mode=agentic_mode,
        agentic_budget=agentic_budget,
        llm_provider=llm_provider,
        llm_model=llm_model,
    )
    repo.update_status(
        case_id,
        status,
        current_step=f"{status}_step",
        progress=100 if status in {"completed", "failed"} else 45,
        error_message="validation failed" if status == "failed" else None,
        package_name="com.example.app" if status == "completed" else None,
    )

    return case_dir


def make_completed_case(
    web_context,
    case_id: str = "completed-case",
    report_text: str = "# Final report\n\nConfirmed issue.",
    **case_config,
):
    case_dir = create_case(web_context, case_id, "completed", **case_config)
    report_path = case_dir / "reports" / "static_report.md"
    report_path.parent.mkdir(parents=True, exist_ok=True)
    report_path.write_text(report_text, encoding="utf-8")

    (case_dir / "facts").mkdir(parents=True, exist_ok=True)
    (case_dir / "facts" / "manifest.json").write_text("{}", encoding="utf-8")
    (case_dir / "logs").mkdir(parents=True, exist_ok=True)
    (case_dir / "logs" / "run.log").write_text("done", encoding="utf-8")
    (case_dir / "tmp").mkdir(parents=True, exist_ok=True)
    (case_dir / "tmp" / "scratch.txt").write_text("exclude", encoding="utf-8")
    (case_dir / "cache").mkdir(parents=True, exist_ok=True)
    (case_dir / "cache" / "cached.json").write_text("exclude", encoding="utf-8")
    (case_dir / ".cache").mkdir(parents=True, exist_ok=True)
    (case_dir / ".cache" / "cached.json").write_text("exclude", encoding="utf-8")
    (case_dir / "temporary").mkdir(parents=True, exist_ok=True)
    (case_dir / "temporary" / "temp.log").write_text("exclude", encoding="utf-8")
    (case_dir / ".pytest_cache").mkdir(parents=True, exist_ok=True)
    (case_dir / ".pytest_cache" / "state.json").write_text("exclude", encoding="utf-8")
    (case_dir / "__pycache__").mkdir(parents=True, exist_ok=True)
    (case_dir / "__pycache__" / "cached.json").write_text("exclude", encoding="utf-8")
    (case_dir / "debug.tmp").write_text("exclude", encoding="utf-8")
    (case_dir / "uploaded.apk").write_bytes(b"original apk")

    state = {
        "case_id": case_id,
        "status": "completed",
        "package_name": "com.example.app",
        "static_report_path": str(report_path),
    }
    (case_dir / "case_state.json").write_text(json.dumps(state), encoding="utf-8")
    (case_dir / "findings").mkdir(parents=True, exist_ok=True)
    (case_dir / "findings" / "manifest_findings.json").write_text(
        json.dumps(
            [
                {
                    "rule_id": "EXPORTED_ACTIVITY",
                    "summary": "Activity is exported.",
                    "severity": "high",
                    "category": "attack_surface",
                    "evidence": [{"relative_path": "AndroidManifest.xml"}],
                }
            ]
        ),
        encoding="utf-8",
    )
    state["findings_path"] = str(case_dir / "findings" / "manifest_findings.json")
    (case_dir / "case_state.json").write_text(json.dumps(state), encoding="utf-8")

    web_context["repo"].replace_findings(
        case_id,
        [
            {
                "title": "Exported activity",
                "description": "Activity is exported.",
                "severity": "high",
                "category": "attack_surface",
                "source": "static",
                "evidence": [{"relative_path": "AndroidManifest.xml"}],
            }
        ],
    )

    return case_dir


def evidence_state(tmp_path, case_id: str = "evidence-case"):
    case_dir = tmp_path / case_id
    findings_path = case_dir / "findings" / "findings.json"
    findings_path.parent.mkdir(parents=True)
    findings_path.write_text("[]", encoding="utf-8")
    return case_dir, {"case_id": case_id, "findings_path": str(findings_path)}


def test_load_evidence_for_case_returns_empty_when_missing(tmp_path):
    _, state = evidence_state(tmp_path)

    assert load_evidence_for_case(state) == []


def test_multipart_full_scan_persists_llm_configuration(web_context):
    api = web_context["api"]
    result = asyncio.run(
        api.create_scan(
            background_tasks=BackgroundTasks(),
            file=MultipartUpload(),
            analysis_profile="full",
            agentic_mode="single",
            agentic_budget="balanced",
            llm_provider="openrouter",
            llm_model="openrouter/free",
        )
    )

    case = web_context["repo"].get_case(result["case_id"])
    assert case["analysis_profile"] == "full"
    assert case["agentic_mode"] == "single"
    assert case["agentic_budget"] == "balanced"
    assert case["llm_provider"] == "openrouter"
    assert case["llm_model"] == "openrouter/free"


def test_multipart_no_llm_scan_clears_llm_configuration(web_context):
    api = web_context["api"]
    result = asyncio.run(
        api.create_scan(
            background_tasks=BackgroundTasks(),
            file=MultipartUpload(),
            analysis_profile="no-llm",
            agentic_mode="single",
            agentic_budget="deep",
            llm_provider="openrouter",
            llm_model="openrouter/free",
        )
    )

    case = web_context["repo"].get_case(result["case_id"])
    assert case["analysis_profile"] == "no-llm"
    assert case["agentic_mode"] == "none"
    assert case["llm_provider"] is None
    assert case["llm_model"] is None


def test_scan_service_propagates_llm_configuration(tmp_path, monkeypatch):
    import andro_agent.web.services.scan_service as scan_service

    captured = {}
    status_updates = []
    case = {
        "id": "full-case",
        "apk_path": str(tmp_path / "app.apk"),
        "artifacts_dir": str(tmp_path / "artifacts" / "full-case"),
        "analysis_profile": "full",
        "agentic_mode": "single",
        "agentic_budget": "balanced",
        "llm_provider": "openrouter",
        "llm_model": "openrouter/free",
    }

    class FakeRepository:
        def get_case(self, case_id):
            return case

        def update_status(self, *args, **kwargs):
            status_updates.append((args, kwargs))

        def replace_findings(self, *args, **kwargs):
            pass

    class FakePipeline:
        def __init__(self, **kwargs):
            captured.update(kwargs)

        def run(self, **kwargs):
            return SimpleNamespace(
                status="completed",
                current_step="output_writing",
                errors=[],
                package_name="com.example.app",
                model_dump=lambda **options: {},
            )

    monkeypatch.setattr(scan_service, "case_repo", FakeRepository())
    monkeypatch.setattr(scan_service, "validate_apk", lambda path: path)
    monkeypatch.setattr(scan_service, "StaticAnalysisPipeline", FakePipeline)
    monkeypatch.setattr(
        scan_service, "collect_findings_and_evidence_from_state", lambda state: ([], [])
    )
    monkeypatch.setattr(scan_service, "write_evidence_json_if_possible", lambda **kwargs: None)

    scan_service.run_static_scan("full-case")

    assert captured == {
        "artifacts_dir": tmp_path / "artifacts",
        "profile": "full",
        "agentic_mode": "single",
        "agentic_budget": "balanced",
        "llm_provider": "openrouter",
        "llm_model": "openrouter/free",
    }
    assert status_updates[-1][1]["current_step"] == "completed"


def test_full_case_detail_displays_llm_configuration(web_context):
    case_dir = make_completed_case(
        web_context,
        case_id="full-config-case",
        analysis_profile="full",
        agentic_mode="single",
        agentic_budget="balanced",
    )
    state_path = case_dir / "case_state.json"
    state = json.loads(state_path.read_text(encoding="utf-8"))
    trace_path = case_dir / "analysis" / "static_investigation_trace.json"
    trace_path.parent.mkdir(parents=True, exist_ok=True)
    trace_path.write_text(
        json.dumps({"termination_reason": "completed", "failed_phase": None}),
        encoding="utf-8",
    )
    state.update(
        {
            "llm_provider": "openrouter",
            "llm_model": "openai/gpt-oss-20b",
            "static_investigation_trace_path": str(trace_path),
        }
    )
    state_path.write_text(json.dumps(state), encoding="utf-8")

    body = render_case_detail(web_context, "full-config-case")

    assert "Analysis profile" in body
    assert "full" in body
    assert "LLM provider" in body
    assert "openrouter" in body
    assert "LLM model" in body
    assert "openai/gpt-oss-20b" in body
    assert "Agentic mode" in body
    assert "single" in body
    assert "Agentic budget" in body
    assert "balanced" in body
    assert "Static investigation termination reason" in body
    assert "completed" in body


def test_completed_case_detail_does_not_show_stale_current_step(web_context):
    make_completed_case(web_context, case_id="completed-step-case")

    body = render_case_detail(web_context, "completed-step-case")

    assert "completed_step" not in body
    assert "<dd>completed</dd>" in body


def test_load_evidence_for_case_loads_valid_json(tmp_path):
    case_dir, state = evidence_state(tmp_path)
    evidence = [{"evidence_id": "EVID-1", "evidence_type": "manifest"}]
    evidence_dir = case_dir / "evidence"
    evidence_dir.mkdir()
    (evidence_dir / "evidence.json").write_text(json.dumps(evidence), encoding="utf-8")

    assert load_evidence_for_case(state) == evidence


def test_load_evidence_for_case_returns_empty_for_invalid_json(tmp_path, caplog):
    case_dir, state = evidence_state(tmp_path)
    evidence_dir = case_dir / "evidence"
    evidence_dir.mkdir()
    (evidence_dir / "evidence.json").write_text("{invalid", encoding="utf-8")

    assert load_evidence_for_case(state) == []
    assert "Could not parse evidence JSON" in caplog.text


def test_attach_evidence_to_web_findings_links_and_records_missing_ids():
    findings = [
        {
            "title": "Finding",
            "evidence_ids": ["EVID-1", "EVID-MISSING"],
            "evidence": ["legacy"],
        }
    ]
    evidence = [{"evidence_id": "EVID-1", "snippet": "exported=true"}]

    attached = attach_evidence_to_web_findings(findings, evidence)

    assert attached[0]["linked_evidence"] == evidence
    assert attached[0]["missing_evidence_ids"] == ["EVID-MISSING"]
    assert attached[0]["evidence"] == ["legacy"]


def test_finding_with_partial_evidence_renders_compact_warning(web_context, monkeypatch):
    make_completed_case(web_context, case_id="partial-evidence-case")
    monkeypatch.setattr(
        web_context["pages"],
        "collect_findings_from_state",
        lambda state: [
            {
                "title": "Partial evidence",
                "description": "One reference resolves.",
                "severity": "medium",
                "evidence_ids": ["EVID-1", "EVID-MISSING"],
            }
        ],
    )
    monkeypatch.setattr(
        web_context["pages"],
        "load_evidence_for_case",
        lambda state: [{"evidence_id": "EVID-1", "snippet": "resolved evidence"}],
    )

    body = render_case_detail(web_context, "partial-evidence-case")

    assert "resolved evidence" in body
    assert "Some evidence references could not be resolved: 1" in body
    assert "EVID-MISSING" in body
    assert "No evidence metadata could be resolved for this finding." not in body


def test_finding_with_no_resolved_evidence_renders_clear_warning(web_context, monkeypatch):
    make_completed_case(web_context, case_id="missing-evidence-case")
    monkeypatch.setattr(
        web_context["pages"],
        "collect_findings_from_state",
        lambda state: [
            {
                "title": "Missing evidence",
                "description": "No reference resolves.",
                "severity": "medium",
                "evidence_ids": ["EVID-MISSING"],
            }
        ],
    )
    monkeypatch.setattr(web_context["pages"], "load_evidence_for_case", lambda state: [])

    body = render_case_detail(web_context, "missing-evidence-case")

    assert "No evidence metadata could be resolved for this finding." in body
    assert "Some evidence references could not be resolved" not in body


def test_running_detail_hides_final_sections(web_context):
    create_case(web_context, "running-case", "running")

    body = render_case_detail(web_context, "running-case")

    assert "running-case.apk" in body
    assert "running_step" in body
    assert "45%" in body
    assert "Findings" not in body
    assert "Reporte" not in body
    assert "Report" not in body
    assert "Artifacts" not in body
    assert "Downloads" not in body
    assert "Raw CaseState" not in body


def test_queued_detail_hides_final_sections(web_context):
    create_case(web_context, "queued-case", "queued")

    body = render_case_detail(web_context, "queued-case")

    assert "queued-case.apk" in body
    assert "queued_step" in body
    assert "45%" in body
    assert "Findings" not in body
    assert "Reporte" not in body
    assert "Report" not in body
    assert "Artifacts" not in body
    assert "Downloads" not in body
    assert "Raw CaseState" not in body


def test_failed_detail_shows_error_only(web_context):
    create_case(web_context, "failed-case", "failed")

    body = render_case_detail(web_context, "failed-case")

    assert "failed-case.apk" in body
    assert "validation failed" in body
    assert "Findings" not in body
    assert "Reporte" not in body
    assert "Report" not in body
    assert "Artifacts" not in body
    assert "Downloads" not in body
    assert "Raw CaseState" not in body


def test_unknown_status_does_not_render_final_sections(web_context):
    create_case(web_context, "cancelled-case", "cancelled")

    body = render_case_detail(web_context, "cancelled-case")

    assert "cancelled-case.apk" in body
    assert "cancelled" in body
    assert "Findings" not in body
    assert "Reporte" not in body
    assert "Report" not in body
    assert "Artifacts" not in body
    assert "Downloads" not in body
    assert "Raw CaseState" not in body


def test_completed_detail_shows_results_and_downloads(web_context):
    make_completed_case(web_context)

    body = render_case_detail(web_context, "completed-case")

    assert "Findings" in body
    assert "EXPORTED_ACTIVITY" in body
    assert "Reporte" in body
    assert "Android Security Analysis Report" in body
    assert "Artifacts" in body
    assert "Downloads" in body
    assert "/api/scans/completed-case/downloads/findings.json" in body
    assert "/api/scans/completed-case/downloads/report.md" in body
    assert "/api/scans/completed-case/downloads/report.html" in body
    assert "/api/scans/completed-case/downloads/bundle.zip" in body


def test_completed_detail_prefers_canonical_findings(web_context):
    make_completed_case(web_context, "canonical-case")

    response = case_detail_response(web_context, "canonical-case")

    assert [finding["title"] for finding in response.context["findings"]] == [
        "EXPORTED_ACTIVITY"
    ]
    assert "Exported activity" not in response.body.decode("utf-8")


def test_completed_detail_does_not_copy_canonical_evidence_ids_to_db_findings(
    web_context, monkeypatch
):
    make_completed_case(web_context, "no-index-merge-case")
    db_finding = {
        "title": "Unrelated DB finding",
        "description": "Not the canonical finding.",
        "severity": "low",
        "category": "other",
        "source": "database",
    }
    monkeypatch.setattr(
        web_context["pages"].case_repo,
        "list_findings",
        lambda case_id: [db_finding],
    )

    response = case_detail_response(web_context, "no-index-merge-case")

    assert "evidence_ids" not in db_finding
    assert response.context["findings"][0]["title"] == "EXPORTED_ACTIVITY"
    assert response.context["findings"][0]["evidence_ids"]


def test_completed_detail_falls_back_to_db_findings(web_context):
    case_dir = make_completed_case(web_context, "db-fallback-case")
    state = json.loads((case_dir / "case_state.json").read_text(encoding="utf-8"))
    Path(state["findings_path"]).write_text("[]", encoding="utf-8")

    response = case_detail_response(web_context, "db-fallback-case")

    assert [finding["title"] for finding in response.context["findings"]] == [
        "Exported activity"
    ]


def test_completed_detail_severity_summary_uses_displayed_findings(web_context):
    make_completed_case(web_context, "display-summary-case")
    web_context["repo"].replace_findings(
        "display-summary-case",
        [
            {
                "title": "Critical DB-only finding",
                "description": "Must not affect the displayed summary.",
                "severity": "critical",
                "category": "other",
                "source": "database",
            }
        ],
    )

    response = case_detail_response(web_context, "display-summary-case")

    assert response.context["severity_summary"] == {
        "critical": 0,
        "high": 1,
        "medium": 0,
        "low": 0,
        "info": 0,
        "total": 1,
    }


def test_completed_detail_category_summary_uses_displayed_findings(web_context):
    make_completed_case(web_context, "display-category-case")
    web_context["repo"].replace_findings(
        "display-category-case",
        [
            {
                "title": "DB-only category",
                "description": "Must not affect the displayed summary.",
                "severity": "low",
                "category": "database_only",
                "source": "database",
            }
        ],
    )

    response = case_detail_response(web_context, "display-category-case")

    assert response.context["category_summary"] == {"attack_surface": 1}


def test_completed_detail_renders_linked_evidence(web_context):
    case_dir = make_completed_case(web_context, "linked-evidence-case")
    state = json.loads((case_dir / "case_state.json").read_text(encoding="utf-8"))
    _, evidence = collect_findings_and_evidence_from_state(state)
    evidence[0].update(
        {
            "source_tool": "manifest",
            "selector": "activity:MainActivity",
            "snippet": "android:exported=true",
            "command": "inspect manifest",
        }
    )
    evidence_dir = case_dir / "evidence"
    evidence_dir.mkdir()
    (evidence_dir / "evidence.json").write_text(json.dumps(evidence), encoding="utf-8")

    body = render_case_detail(web_context, "linked-evidence-case")

    assert "Evidence items" in body
    assert evidence[0]["evidence_id"] in body
    assert "android:exported=true" in body
    assert "inspect manifest" in body


@pytest.mark.parametrize("status", ["running", "failed"])
def test_non_completed_detail_does_not_render_evidence(web_context, status):
    case_dir = create_case(web_context, f"{status}-evidence-case", status)
    evidence_dir = case_dir / "evidence"
    evidence_dir.mkdir()
    (evidence_dir / "evidence.json").write_text(
        json.dumps([{"evidence_id": "EVID-SHOULD-NOT-RENDER"}]),
        encoding="utf-8",
    )

    body = render_case_detail(web_context, f"{status}-evidence-case")

    assert "EVID-SHOULD-NOT-RENDER" not in body
    assert "Evidence items" not in body


def test_status_endpoint_is_minimal(web_context):
    make_completed_case(web_context, "status-case")

    response = web_context["api"].get_scan_status("status-case")

    assert response == {
        "case_id": "status-case",
        "status": "completed",
        "current_step": "completed_step",
        "progress": 100,
        "error_message": None,
    }
    body = json.dumps(response)
    assert "findings" not in body
    assert "evidence" not in body
    assert "report" not in body
    assert "artifacts" not in body
    assert "CaseState" not in body
    assert "apk_path" not in body
    assert "artifacts_dir" not in body
    assert str(web_context["artifacts_dir"]) not in body
    assert str(web_context["uploads_dir"]) not in body


@pytest.mark.parametrize("status", ["queued", "running", "failed", "cancelled"])
@pytest.mark.parametrize("api_method", ["get_scan_findings", "get_scan_report"])
def test_findings_and_report_return_409_before_completion(web_context, status, api_method):
    create_case(web_context, f"{status}-{api_method}", status)

    with pytest.raises(HTTPException) as exc_info:
        getattr(web_context["api"], api_method)(f"{status}-{api_method}")

    assert exc_info.value.status_code == 409
    assert exc_info.value.detail["error"] == "Scan results are only available after completion."


@pytest.mark.parametrize(
    "path",
    [
        "findings.json",
        "report.md",
        "report.html",
        "bundle.zip",
    ],
)
def test_download_endpoints_return_409_before_completion(web_context, path):
    create_case(web_context, "pending-download", "running")

    with pytest.raises(HTTPException) as exc_info:
        call_download(web_context, "pending-download", path)

    assert exc_info.value.status_code == 409
    assert exc_info.value.detail["error"] == "Scan results are only available after completion."


@pytest.mark.parametrize("api_method", ["get_scan_status", "get_scan_findings", "get_scan_report"])
def test_scan_api_returns_404_for_unknown_cases(web_context, api_method):
    with pytest.raises(HTTPException) as exc_info:
        getattr(web_context["api"], api_method)("missing")

    assert exc_info.value.status_code == 404


@pytest.mark.parametrize(
    "path",
    [
        "findings.json",
        "report.md",
        "report.html",
        "bundle.zip",
    ],
)
def test_download_endpoints_return_404_for_unknown_cases(web_context, path):
    with pytest.raises(HTTPException) as exc_info:
        call_download(web_context, "missing", path)

    assert exc_info.value.status_code == 404


def test_download_endpoints_work_after_completion(web_context):
    make_completed_case(web_context, "download-case")

    findings = web_context["api"].download_findings("download-case")
    report_md = web_context["api"].download_report_markdown("download-case")
    report_html = web_context["api"].download_report_html("download-case")
    bundle = web_context["api"].download_bundle("download-case")

    downloaded_findings = json.loads(Path(findings.path).read_text(encoding="utf-8"))

    assert downloaded_findings[0]["title"] == "EXPORTED_ACTIVITY"
    assert downloaded_findings[0]["evidence_ids"]
    report_markdown = Path(report_md.path).read_text(encoding="utf-8")

    assert "# Android Security Analysis Report" in report_markdown
    assert "Analysis profile: `static_basic`" in report_markdown
    assert downloaded_findings[0]["evidence_ids"][0] in report_markdown
    assert "<h1" in Path(report_html.path).read_text(encoding="utf-8")
    assert bundle.media_type == "application/zip"
    assert bundle.path.name == "bundle.zip"


def test_bundle_contains_safe_files_and_excludes_uploaded_apk(web_context):
    make_completed_case(web_context, "bundle-case")

    response = web_context["api"].download_bundle("bundle-case")
    bundle_path = web_context["artifacts_dir"] / "bundle-case" / "downloads" / "bundle.zip"

    assert Path(response.path) == bundle_path

    with zipfile.ZipFile(bundle_path) as bundle:
        names = set(bundle.namelist())

    assert "findings.json" in names
    assert "report.md" in names
    assert "report.html" in names
    assert "evidence/evidence.json" in names
    assert "artifacts/evidence/evidence.json" not in names
    assert "artifacts/facts/manifest.json" in names
    assert "artifacts/logs/run.log" in names
    assert "artifacts/uploaded.apk" not in names
    assert "artifacts/case_state.json" not in names
    assert "artifacts/tmp/scratch.txt" not in names
    assert "artifacts/cache/cached.json" not in names
    assert "artifacts/.cache/cached.json" not in names
    assert "artifacts/temporary/temp.log" not in names
    assert "artifacts/.pytest_cache/state.json" not in names
    assert "artifacts/__pycache__/cached.json" not in names
    assert "artifacts/debug.tmp" not in names


def test_findings_download_contains_generated_evidence_ids(web_context):
    make_completed_case(web_context, "download-evidence-case")

    response = web_context["api"].download_findings("download-evidence-case")
    findings = json.loads(Path(response.path).read_text(encoding="utf-8"))

    assert findings[0]["evidence_ids"]


def test_bundle_excludes_symlinks_outside_case_dir(web_context, tmp_path):
    case_dir = make_completed_case(web_context, "symlink-case")
    outside = tmp_path / "outside.json"
    outside.write_text('{"secret": true}', encoding="utf-8")
    (case_dir / "facts" / "outside.json").symlink_to(outside)

    web_context["api"].download_bundle("symlink-case")
    bundle_path = web_context["artifacts_dir"] / "symlink-case" / "downloads" / "bundle.zip"

    with zipfile.ZipFile(bundle_path) as bundle:
        names = set(bundle.namelist())

    assert "artifacts/facts/outside.json" not in names


def test_report_html_escapes_raw_html(web_context):
    make_completed_case(
        web_context,
        "unsafe-report-case",
        report_text="# Final report\n\n<script>alert('x')</script>\n\n<img src=x onerror=alert(1)>",
    )

    response = web_context["api"].download_report_html("unsafe-report-case")
    html = Path(response.path).read_text(encoding="utf-8")

    assert "<script" not in html.lower()
    assert "<img" not in html.lower()
    assert "Android Security Analysis Report" in html


def test_bundle_regenerates_on_each_download(web_context):
    case_dir = make_completed_case(web_context, "fresh-bundle-case")

    web_context["api"].download_bundle("fresh-bundle-case")
    (case_dir / "logs" / "fresh.txt").write_text("fresh", encoding="utf-8")
    web_context["api"].download_bundle("fresh-bundle-case")

    bundle_path = web_context["artifacts_dir"] / "fresh-bundle-case" / "downloads" / "bundle.zip"

    with zipfile.ZipFile(bundle_path) as bundle:
        names = set(bundle.namelist())

    assert "artifacts/logs/fresh.txt" in names


def test_path_traversal_is_not_possible(web_context):
    make_completed_case(web_context, "traversal-case")

    scope = {
        "type": "http",
        "method": "GET",
        "path": "/api/scans/traversal-case/downloads/../case_state.json",
        "headers": [],
    }

    assert all(route.matches(scope)[0] is Match.NONE for route in web_context["api"].router.routes)


def call_download(web_context, case_id: str, path: str):
    api = web_context["api"]

    if path == "findings.json":
        return api.download_findings(case_id)
    if path == "report.md":
        return api.download_report_markdown(case_id)
    if path == "report.html":
        return api.download_report_html(case_id)
    if path == "bundle.zip":
        return api.download_bundle(case_id)

    raise AssertionError(f"Unknown path {path}")
