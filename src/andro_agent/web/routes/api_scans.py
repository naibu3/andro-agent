from __future__ import annotations

from pathlib import Path
from uuid import uuid4

from fastapi import APIRouter, BackgroundTasks, File, HTTPException, UploadFile
from fastapi.responses import JSONResponse

from andro_agent.web.db import CaseRepository
from andro_agent.web.services.result_service import (
    build_fallback_report_markdown,
    extract_package_name_from_state,
    load_case_state,
    read_text_if_exists,
    severity_summary,
    should_use_fallback_report,
)
from andro_agent.web.services.scan_service import run_static_scan
from andro_agent.web.services.upload_service import save_uploaded_apk
from andro_agent.web.settings import ARTIFACTS_DIR


router = APIRouter(prefix="/api/scans", tags=["scans"])
case_repo = CaseRepository()


@router.post("")
async def create_scan(
    background_tasks: BackgroundTasks,
    file: UploadFile = File(...),
    analysis_profile: str = "static_basic",
) -> dict[str, str]:
    case_id = str(uuid4())
    apk_path, digest = await save_uploaded_apk(file, case_id)
    artifacts_dir = ARTIFACTS_DIR / case_id

    case_repo.create_case(
        case_id=case_id,
        filename=file.filename or "uploaded.apk",
        sha256=digest,
        apk_path=apk_path,
        artifacts_dir=artifacts_dir,
        analysis_profile=analysis_profile,
    )

    background_tasks.add_task(run_static_scan, case_id)

    return {
        "case_id": case_id,
        "status": "queued",
        "sha256": digest,
        "detail_url": f"/cases/{case_id}",
        "status_url": f"/api/scans/{case_id}/status",
    }


@router.get("")
def list_scans() -> list[dict]:
    return case_repo.list_cases()


@router.get("/{case_id}")
def get_scan(case_id: str) -> dict:
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    state = load_case_state(Path(case["artifacts_dir"]).parent, case_id)
    findings = case_repo.list_findings(case_id)

    if not case.get("package_name"):
        case["package_name"] = extract_package_name_from_state(state)

    return {
        "case": case,
        "state": state,
        "findings": findings,
        "summary": severity_summary(findings),
    }


@router.get("/{case_id}/status")
def get_scan_status(case_id: str) -> dict:
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    return {
        "case_id": case_id,
        "status": case["status"],
        "current_step": case["current_step"],
        "progress": case["progress"],
        "error_message": case["error_message"],
    }


@router.get("/{case_id}/findings")
def get_scan_findings(case_id: str) -> list[dict]:
    if not case_repo.get_case(case_id):
        raise HTTPException(status_code=404, detail="Case not found")

    return case_repo.list_findings(case_id)


@router.get("/{case_id}/report")
def get_scan_report(case_id: str) -> JSONResponse:
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    state = load_case_state(Path(case["artifacts_dir"]).parent, case_id)
    findings = case_repo.list_findings(case_id)

    if not case.get("package_name"):
        case["package_name"] = extract_package_name_from_state(state)

    report = read_text_if_exists(state.get("static_report_path"))

    if should_use_fallback_report(report, findings):
        report = build_fallback_report_markdown(
            case=case,
            state=state,
            findings=findings,
        )

    return JSONResponse(
        {
            "case_id": case_id,
            "markdown": report,
        }
    )