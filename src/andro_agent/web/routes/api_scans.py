from __future__ import annotations

from pathlib import Path
from uuid import uuid4

from fastapi import APIRouter, BackgroundTasks, File, Form, HTTPException, UploadFile
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
    analysis_profile: str = Form("no-llm"),
    agentic_mode: str = Form("none"),
    agentic_budget: str = Form("balanced"),
    llm_provider: str | None = Form(None),
    llm_model: str | None = Form(None),
) -> dict[str, str]:
    if analysis_profile not in {"no-llm", "fast", "full"}:
        raise HTTPException(status_code=400, detail="Unsupported analysis profile")
    if agentic_mode not in {"none", "single"}:
        raise HTTPException(status_code=400, detail="Unsupported agentic mode")
    if agentic_budget not in {"conservative", "balanced", "deep"}:
        raise HTTPException(status_code=400, detail="Unsupported agentic budget")
    if analysis_profile == "no-llm":
        agentic_mode = "none"
        llm_provider = None
        llm_model = None
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
        agentic_mode=agentic_mode,
        agentic_budget=agentic_budget,
        llm_provider=llm_provider,
        llm_model=llm_model,
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


@router.get("/{case_id}/downloads/canonical_findings.json")
def download_canonical_findings(case_id: str) -> FileResponse:
    _, case_dir, _, _ = get_completed_download_context(case_id)
    return _optional_download(
        case_dir, Path("findings/canonical_findings.json"), "application/json"
    )


@router.get("/{case_id}/downloads/evidence.json")
def download_evidence(case_id: str) -> FileResponse:
    _, case_dir, _, _ = get_completed_download_context(case_id)
    return _optional_download(case_dir, Path("evidence/evidence.json"), "application/json")


@router.get("/{case_id}/downloads/dynamic/{artifact_name}")
def download_dynamic_artifact(case_id: str, artifact_name: str) -> FileResponse:
    _, case_dir, _, _ = get_completed_download_context(case_id)
    allowed = {
        "dynamic_results.json": Path("dynamic/dynamic_results.json"),
        "runtime_observations.json": Path("dynamic/runtime_observations.json"),
        "api_discovery.json": Path("dynamic/api_discovery.json"),
        "api_observations.json": Path("dynamic/api_observations.json"),
        "api_requests.json": Path("dynamic/api_requests.json"),
        "api_candidate_findings.json": Path("findings/api_candidate_findings.json"),
    }
    relative_path = allowed.get(artifact_name)
    if relative_path is None:
        raise HTTPException(status_code=404, detail="Artifact not available")
    return _optional_download(case_dir, relative_path, "application/json")


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


def _optional_download(case_dir: Path, relative_path: Path, media_type: str) -> FileResponse:
    path = (case_dir / relative_path).resolve()
    try:
        path.relative_to(case_dir.resolve())
    except ValueError as exc:
        raise HTTPException(status_code=400, detail="Unsafe artifact path") from exc
    if not path.is_file() or path.is_symlink():
        raise HTTPException(status_code=404, detail="Artifact not available")
    return FileResponse(path, media_type=media_type, filename=relative_path.name)
