from __future__ import annotations

from pathlib import Path

from andro_agent.pipelines.static_pipeline import StaticAnalysisPipeline
from andro_agent.validators.apk import APKValidationError, validate_apk
from andro_agent.web.db import CaseRepository
from andro_agent.web.services.result_service import (
    collect_findings_and_evidence_from_state,
    extract_package_name_from_state,
    write_evidence_json_if_possible,
)


case_repo = CaseRepository()


def run_static_scan(case_id: str) -> None:
    case = case_repo.get_case(case_id)

    if not case:
        return

    apk_path = Path(case["apk_path"])
    artifacts_dir = Path(case["artifacts_dir"]).parent

    try:
        case_repo.update_status(
            case_id,
            "running",
            current_step="validating_apk",
            progress=5,
        )

        validate_apk(apk_path)

        case_repo.update_status(
            case_id,
            "running",
            current_step="static_pipeline",
            progress=15,
        )

        pipeline = StaticAnalysisPipeline(artifacts_dir=artifacts_dir)
        state = pipeline.run(apk_path=apk_path, case_id=case_id)

        state_dict = state.model_dump(mode="json")

        findings, evidence = collect_findings_and_evidence_from_state(state_dict)
        write_evidence_json_if_possible(state=state_dict, evidence=evidence)
        case_repo.replace_findings(case_id, findings)

        package_name = state.package_name or extract_package_name_from_state(state_dict)

        final_status = "completed" if state.status == "completed" else "failed"

        case_repo.update_status(
            case_id,
            final_status,
            current_step=state.current_step or final_status,
            progress=100,
            error_message="\n".join(state.errors) if state.errors else None,
            package_name=package_name,
        )

    except APKValidationError as exc:
        case_repo.update_status(
            case_id,
            "failed",
            current_step="validation_failed",
            progress=100,
            error_message=str(exc),
        )

    except Exception as exc:
        case_repo.update_status(
            case_id,
            "failed",
            current_step="failed",
            progress=100,
            error_message=str(exc),
        )
