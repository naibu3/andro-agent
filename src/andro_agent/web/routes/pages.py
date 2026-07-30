from __future__ import annotations

from pathlib import Path

from fastapi import APIRouter, BackgroundTasks, File, HTTPException, Request, UploadFile
from fastapi.responses import HTMLResponse, RedirectResponse
from fastapi.templating import Jinja2Templates

from andro_agent.web.db import CaseRepository
from andro_agent.web.routes.api_scans import create_scan
from andro_agent.web.services.result_service import (
    attach_evidence_to_web_findings,
    category_summary,
    collect_findings_from_state,
    extract_artifacts,
    extract_package_name_from_state,
    final_report_markdown,
    load_case_state,
    load_evidence_for_case,
    render_report_html,
    severity_summary,
)


templates = Jinja2Templates(
    directory=str(Path(__file__).resolve().parent.parent / "templates")
)

router = APIRouter()
case_repo = CaseRepository()


@router.get("/", response_class=HTMLResponse)
def dashboard(request: Request):
    cases = case_repo.list_cases()

    total = len(cases)
    completed = len([case for case in cases if case["status"] == "completed"])
    failed = len([case for case in cases if case["status"] == "failed"])
    running = len([case for case in cases if case["status"] == "running"])
    queued = len([case for case in cases if case["status"] == "queued"])

    return templates.TemplateResponse(
        request,
        "dashboard.html",
        {
            "cases": cases[:10],
            "stats": {
                "total": total,
                "completed": completed,
                "failed": failed,
                "running": running,
                "queued": queued,
            },
        },
    )


@router.get("/upload", response_class=HTMLResponse)
def upload_page(request: Request):
    return templates.TemplateResponse(
        request,
        "upload.html",
        {},
    )


@router.post("/upload", response_model=None)
async def upload_form(
    request: Request,
    background_tasks: BackgroundTasks,
    file: UploadFile = File(...),
    analysis_profile: str = "static_basic",
):
    try:
        result = await create_scan(
            background_tasks=background_tasks,
            file=file,
            analysis_profile=analysis_profile,
        )

    except Exception as exc:
        return templates.TemplateResponse(
            request,
            "upload.html",
            {
                "error": str(exc),
            },
            status_code=400,
        )

    return RedirectResponse(
        result["detail_url"],
        status_code=303,
    )


@router.get("/cases", response_class=HTMLResponse)
def cases_page(request: Request):
    return templates.TemplateResponse(
        request,
        "cases.html",
        {
            "cases": case_repo.list_cases(),
        },
    )


@router.get("/cases/{case_id}", response_class=HTMLResponse)
def case_detail(request: Request, case_id: str):
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    if case["status"] in {"queued", "running"}:
        return templates.TemplateResponse(
            request,
            "case_detail.html",
            {
                "case": case,
                "is_pending": True,
                "is_failed": False,
                "is_completed": False,
                "is_non_final": False,
            },
        )

    if case["status"] == "failed":
        return templates.TemplateResponse(
            request,
            "case_detail.html",
            {
                "case": case,
                "is_pending": False,
                "is_failed": True,
                "is_completed": False,
                "is_non_final": False,
            },
        )

    if case["status"] != "completed":
        return templates.TemplateResponse(
            request,
            "case_detail.html",
            {
                "case": case,
                "is_pending": False,
                "is_failed": False,
                "is_completed": False,
                "is_non_final": True,
            },
        )

    state = load_case_state(Path(case["artifacts_dir"]).parent, case_id)
    canonical_findings = collect_findings_from_state(state)
    db_findings = case_repo.list_findings(case_id)
    display_findings = canonical_findings if canonical_findings else db_findings
    evidence = load_evidence_for_case(state)
    display_findings = attach_evidence_to_web_findings(display_findings, evidence)

    if not case.get("package_name"):
        case["package_name"] = extract_package_name_from_state(state)

    report_md = final_report_markdown(
        case=case,
        state=state,
        findings=display_findings,
        evidence=evidence,
    )
    report_html = render_report_html(report_md)

    artifacts_dir = Path(case["artifacts_dir"])

    return templates.TemplateResponse(
        request,
        "case_detail.html",
        {
            "case": case,
            "is_pending": False,
            "is_failed": False,
            "is_completed": True,
            "is_non_final": False,
            "state": state,
            "findings": display_findings,
            "evidence": evidence,
            "evidence_count": len(evidence),
            "severity_summary": severity_summary(display_findings),
            "category_summary": category_summary(display_findings),
            "report_html": report_html,
            "artifacts": extract_artifacts(artifacts_dir),
        },
    )
