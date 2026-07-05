from __future__ import annotations

from pathlib import Path
from uuid import uuid4

from fastapi import APIRouter, BackgroundTasks, File, HTTPException, UploadFile
from fastapi.responses import FileResponse, JSONResponse

from andro_agent.web.db import CaseRepository
from andro_agent.web.services.result_service import (
    build_download_bundle,
    extract_package_name_from_state,
    final_report_markdown,
    load_case_state,
    severity_summary,
    write_final_download_files,
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

    if case["status"] != "completed":
        return {
            "case": {
                "id": case["id"],
                "filename": case["filename"],
                "status": case["status"],
                "current_step": case["current_step"],
                "progress": case["progress"],
                "error_message": case["error_message"],
            }
        }

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
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    ensure_completed(case)

    return case_repo.list_findings(case_id)


@router.get("/{case_id}/report")
def get_scan_report(case_id: str) -> JSONResponse:
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    ensure_completed(case)

    state = load_case_state(Path(case["artifacts_dir"]).parent, case_id)
    findings = case_repo.list_findings(case_id)

    if not case.get("package_name"):
        case["package_name"] = extract_package_name_from_state(state)

    report = final_report_markdown(
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


@router.get("/{case_id}/downloads/findings.json")
def download_findings(case_id: str) -> FileResponse:
    case, case_dir, state, findings = get_completed_download_context(case_id)
    paths = write_final_download_files(
        case_dir=case_dir,
        case=case,
        state=state,
        findings=findings,
    )

    return FileResponse(
        paths["findings"],
        media_type="application/json",
        filename="findings.json",
    )


@router.get("/{case_id}/downloads/report.md")
def download_report_markdown(case_id: str) -> FileResponse:
    case, case_dir, state, findings = get_completed_download_context(case_id)
    paths = write_final_download_files(
        case_dir=case_dir,
        case=case,
        state=state,
        findings=findings,
    )

    return FileResponse(
        paths["report_md"],
        media_type="text/markdown; charset=utf-8",
        filename="report.md",
    )


@router.get("/{case_id}/downloads/report.html")
def download_report_html(case_id: str) -> FileResponse:
    case, case_dir, state, findings = get_completed_download_context(case_id)
    paths = write_final_download_files(
        case_dir=case_dir,
        case=case,
        state=state,
        findings=findings,
    )

    return FileResponse(
        paths["report_html"],
        media_type="text/html; charset=utf-8",
        filename="report.html",
    )


@router.get("/{case_id}/downloads/bundle.zip")
def download_bundle(case_id: str) -> FileResponse:
    case, case_dir, state, findings = get_completed_download_context(case_id)
    bundle_path = build_download_bundle(
        case_dir=case_dir,
        case=case,
        state=state,
        findings=findings,
    )

    return FileResponse(
        bundle_path,
        media_type="application/zip",
        filename="bundle.zip",
    )


def ensure_completed(case: dict) -> None:
    if case["status"] != "completed":
        raise HTTPException(
            status_code=409,
            detail={"error": "Scan results are only available after completion."},
        )


def get_completed_download_context(case_id: str) -> tuple[dict, Path, dict, list[dict]]:
    case = case_repo.get_case(case_id)

    if not case:
        raise HTTPException(status_code=404, detail="Case not found")

    ensure_completed(case)

    case_dir = Path(case["artifacts_dir"])
    state = load_case_state(case_dir.parent, case_id)
    findings = case_repo.list_findings(case_id)

    if not case.get("package_name"):
        case["package_name"] = extract_package_name_from_state(state)

    return case, case_dir, state, findings
