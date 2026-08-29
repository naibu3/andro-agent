import importlib.util
import json
import subprocess
import sys
from pathlib import Path

SCRIPT = Path(__file__).parents[1] / "tfm-eval" / "scripts" / "compare-profile-results.py"
SPEC = importlib.util.spec_from_file_location("compare_profile_results", SCRIPT)
assert SPEC and SPEC.loader
compare = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(compare)


def write_case(
    root: Path,
    case_id: str,
    findings: list[dict],
    duration: float = 10.0,
    report: str = "# Report\nEvidence EVID-123.\n",
    evidence_file: bool = False,
) -> None:
    case = root / case_id
    (case / "metrics").mkdir(parents=True)
    (case / "findings").mkdir()
    (case / "report").mkdir()
    (case / "metrics" / "run_metrics_summary.json").write_text(
        json.dumps(
            {
                "duration_seconds": duration,
                "steps": 4,
                "agents": 1,
                "summary": {
                    "status": "completed",
                    "analysis_profile": case_id,
                    "warnings_count": 2,
                    "errors_count": 0,
                },
            }
        ),
        encoding="utf-8",
    )
    (case / "findings" / "manifest_findings.json").write_text(
        json.dumps(findings), encoding="utf-8"
    )
    (case / "findings" / "code_findings.json").write_text("[]", encoding="utf-8")
    (case / "report" / "static_analysis_report.md").write_text(
        report, encoding="utf-8"
    )
    if evidence_file:
        (case / "evidence").mkdir()
        (case / "evidence" / "canonical.json").write_text("{}", encoding="utf-8")


def finding(rule_id: str, severity: str = "HIGH", category: str = " Config ") -> dict:
    return {"rule_id": rule_id, "severity": severity, "category": category}


def test_loads_metrics_findings_signatures_and_severity(tmp_path: Path) -> None:
    write_case(tmp_path, "base", [finding("  RULE   ONE  "), finding("RULE_TWO", "low")])

    summary, signatures = compare.analyze_case(tmp_path, "no-llm", "base")

    assert summary["duration_seconds"] == 10.0
    assert summary["status"] == "completed"
    assert summary["total_deterministic_findings"] == 2
    assert summary["severity_distribution"] == {"high": 1, "low": 1}
    assert "manifest|RULE ONE|high|config" in signatures
    assert summary["evid_references_count"] == 1


def test_equal_and_extra_and_missing_findings(tmp_path: Path) -> None:
    common = [finding("ONE"), finding("TWO", "medium")]
    write_case(tmp_path, "base", common)
    write_case(tmp_path, "equal", common)
    write_case(tmp_path, "fast", common[:1])
    write_case(tmp_path, "full", common + [finding("THREE", "low")])

    result = compare.compare_profiles(
        tmp_path,
        [
            ("no-llm", "base"),
            ("equal", "equal"),
            ("fast", "fast"),
            ("full", "full"),
        ],
    )
    comparisons = {item["profile"]: item for item in result["comparisons"]}

    assert comparisons["no-llm"]["deterministic_sets_equal"] is True
    assert comparisons["equal"]["deterministic_sets_equal"] is True
    assert comparisons["fast"]["missing_count"] == 1
    assert comparisons["fast"]["extra_count"] == 0
    assert comparisons["full"]["missing_count"] == 0
    assert comparisons["full"]["extra_count"] == 1
    assert any("may be invalid" in warning for warning in result["warnings"])


def test_missing_files_do_not_crash_and_outputs_are_written(tmp_path: Path) -> None:
    artifacts = tmp_path / "artifacts"
    artifacts.mkdir()
    output = tmp_path / "reports" / "comparison"

    completed = subprocess.run(
        [
            sys.executable,
            str(SCRIPT),
            "--artifacts-dir",
            str(artifacts),
            "--cases",
            "fast=missing-case",
            "--output-dir",
            str(output),
        ],
        check=True,
        capture_output=True,
        text=True,
        env={},
    )

    assert completed.stdout == ""
    assert completed.stderr == ""
    data = json.loads((output / "comparison.json").read_text(encoding="utf-8"))
    assert data["profiles"][0]["missing_files"]
    assert (output / "comparison.md").is_file()
    serialized = json.dumps(data)
    assert "PASSWORD" not in serialized
    assert "TOKEN" not in serialized


def test_missing_evidence_adds_warning_and_markdown_spacing(tmp_path: Path) -> None:
    common = [finding("ONE")]
    write_case(tmp_path, "base", common, report="# Report\nNo canonical references.\n")
    write_case(tmp_path, "full", common, report="# Report\nNo canonical references.\n")

    result = compare.compare_profiles(tmp_path, [("no-llm", "base"), ("full", "full")])
    markdown = compare.render_markdown(result)

    assert all(item["deterministic_sets_equal"] for item in result["comparisons"])
    assert (
        "Canonical evidence was not exported for any profile; CLI/report outputs may lack "
        "Finding -> Evidence traceability."
        in result["warnings"]
    )
    assert "\n\n## Warnings\n" in markdown


def test_mixed_evidence_availability_adds_warning(tmp_path: Path) -> None:
    common = [finding("ONE")]
    write_case(tmp_path, "base", common, evidence_file=True)
    write_case(tmp_path, "full", common, report="# Report\nNo canonical references.\n")

    result = compare.compare_profiles(tmp_path, [("no-llm", "base"), ("full", "full")])

    assert "Canonical evidence availability differs across profiles." in result["warnings"]


def test_longer_no_llm_report_adds_qualitative_warning(tmp_path: Path) -> None:
    common = [finding("ONE")]
    write_case(tmp_path, "base", common, report="word " * 20)
    write_case(tmp_path, "full", common, report="word " * 10)

    result = compare.compare_profiles(tmp_path, [("no-llm", "base"), ("full", "full")])

    assert (
        "no-llm report is longer than full report; qualitative report comparison should "
        "inspect content, not only LLM usage."
        in result["warnings"]
    )


def test_canonical_counts_do_not_affect_deterministic_comparison(tmp_path: Path) -> None:
    common = [finding("ONE")]
    write_case(tmp_path, "base", common)
    write_case(tmp_path, "full", common)
    canonical = [
        {"finding_id": "ONE", "evidence_ids": ["EVID-ABC"]},
        {"finding_id": "EXTRA-CANONICAL", "evidence_ids": []},
    ]
    case_dir = tmp_path / "full"
    (case_dir / "findings" / "canonical_findings.json").write_text(
        json.dumps(canonical), encoding="utf-8"
    )
    (case_dir / "evidence").mkdir()
    (case_dir / "evidence" / "evidence.json").write_text(
        json.dumps([{"evidence_id": "EVID-ABC"}]), encoding="utf-8"
    )
    (case_dir / "analysis").mkdir()
    (case_dir / "analysis" / "static_investigation_trace.json").write_text(
        json.dumps(
            {
                "termination_reason": "completed",
                "tool_calls": [{"tool": "search_code"}, {"tool": "get_evidence"}],
            }
        ),
        encoding="utf-8",
    )
    (case_dir / "analysis" / "llm_hypotheses.json").write_text(
        json.dumps([{"hypothesis_id": "LLM-HYP-ABC"}]), encoding="utf-8"
    )
    (case_dir / "findings" / "llm_candidate_findings.json").write_text(
        json.dumps([{"finding_id": "LLM-FIND-ABC", "evidence_ids": ["EVID-ABC"]}]),
        encoding="utf-8",
    )

    result = compare.compare_profiles(tmp_path, [("no-llm", "base"), ("full", "full")])
    profiles = {profile["profile"]: profile for profile in result["profiles"]}
    comparisons = {item["profile"]: item for item in result["comparisons"]}

    assert profiles["full"]["canonical_findings_count"] == 2
    assert profiles["full"]["evidence_items_count"] == 1
    assert profiles["full"]["findings_with_evidence_ids_count"] == 1
    assert profiles["full"]["static_investigation_ran"] is True
    assert profiles["full"]["static_investigation_tool_calls"] == 2
    assert profiles["full"]["llm_hypotheses_count"] == 1
    assert profiles["full"]["llm_candidate_findings_count"] == 1
    assert profiles["full"]["llm_candidate_findings_with_evidence_count"] == 1
    assert profiles["full"]["static_investigation_termination_reason"] == "completed"
    assert comparisons["full"]["deterministic_sets_equal"] is True
    assert "manual validation is required" in compare.render_markdown(result)
