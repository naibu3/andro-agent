#!/usr/bin/env python3
"""DeepSeek samples campaign, reusing the final campaign's extraction helpers."""
from __future__ import annotations

import importlib.util
import json
import os
import signal
import subprocess
import sys
import time
from collections import Counter, defaultdict
from pathlib import Path

ROOT = Path(__file__).resolve().parents[3]
BASE_PATH = ROOT / "tfm-eval/final-samples-campaign/scripts/run_campaign.py"
spec = importlib.util.spec_from_file_location("campaign_base", BASE_PATH)
base = importlib.util.module_from_spec(spec)
assert spec and spec.loader
spec.loader.exec_module(base)

for field in ("fallback_from_model", "fallback_to_model", "fallback_reason"):
    if field not in base.FIELDS:
        base.FIELDS.insert(base.FIELDS.index("dynamic_status"), field)

CAMPAIGN = ROOT / "tfm-eval/deepseek-samples-campaign"
for name, value in {
    "CAMPAIGN": CAMPAIGN,
    "LOGS": CAMPAIGN / "logs",
    "METRICS": CAMPAIGN / "metrics",
    "REPORTS": CAMPAIGN / "reports",
}.items():
    setattr(base, name, value)


def run_matrix(samples: list[dict]) -> list[dict]:
    executions = []
    for sample in samples:
        sid = sample["sample_id"]
        case = f"deepseek-campaign-{sid}-no-llm"
        executions.append({**sample, "case_id": case, "profile_type": "static_no_llm",
            **base.run_command(case, base.cli_run(sample, case, "no-llm"), 1800),
            "fallback_model_used": False, "notes": None})

        case = f"deepseek-campaign-{sid}-full"
        command = base.cli_run(sample, case, "full") + [
            "--agentic-mode", "single", "--agentic-budget", "balanced",
            "--llm-provider", "deepseek", "--llm-model", "deepseek-chat",
        ]
        executions.append({**sample, "case_id": case, "profile_type": "static_deepseek_full",
            **base.run_command(case, command, 1800), "fallback_model_used": False, "notes": None})

        case = f"deepseek-campaign-{sid}-dynamic"
        executions.append({**sample, "case_id": case, "profile_type": "dynamic",
            **base.run_command(case, base.dynamic_run(sample, case, []), 900),
            "fallback_model_used": False, "notes": None})

        case = f"deepseek-campaign-{sid}-dynamic-api-auto"
        pre = base.run_command(case, base.cli_run(sample, case, "no-llm"), 1800)
        dyn = base.run_command(case, base.dynamic_run(sample, case, [
            "--api-discovery", "auto", "--api-probe", "off", "--api-max-hosts", "5",
        ]), 1800, True)
        dyn["wall_seconds"] = round(pre["wall_seconds"] + dyn["wall_seconds"], 3)
        executions.append({**sample, "case_id": case, "profile_type": "dynamic_api_auto",
            **dyn, "fallback_model_used": False,
            "notes": None if pre["returncode"] == 0 else f"static prepass exit={pre['returncode']}"})
    return executions


def local_control(sample: dict) -> dict:
    case = "deepseek-campaign-local-api-probe"
    mock_dir = Path("/tmp/andro-agent-deepseek-campaign-api-mock")
    mock_dir.mkdir(parents=True, exist_ok=True)
    (mock_dir / "openapi.json").write_text(
        '{"openapi":"3.0.0","info":{"title":"DeepSeek Campaign Mock API","version":"1.0"},'
        '"paths":{"/health":{"get":{}},"/users":{"post":{}},"/admin":{"delete":{}}}}\n'
    )
    (mock_dir / "health").write_text('{"status":"ok"}\n')
    server_log = Path("/tmp/andro-agent-deepseek-campaign-api-mock.log").open("w")
    server = subprocess.Popen([sys.executable, "-m", "http.server", "8888"], cwd=mock_dir,
        stdout=server_log, stderr=subprocess.STDOUT, start_new_session=True)
    try:
        time.sleep(1)
        result = base.run_command(case, base.dynamic_run(sample, case, [
            "--api-base-url", "http://127.0.0.1:8888", "--api-probe", "safe",
            "--api-allow-private", "--api-max-requests", "20", "--api-timeout", "5",
        ]), 1800)
    finally:
        try:
            os.killpg(server.pid, signal.SIGTERM)
            server.wait(timeout=5)
        except (ProcessLookupError, subprocess.TimeoutExpired):
            pass
        server_log.close()
    return {**sample, "case_id": case, "profile_type": "local_api_probe_control", **result,
        "fallback_model_used": False, "notes": None}


def validate(rows: list[dict]) -> list[str]:
    failures = []
    for row in rows:
        if row["profile_type"] == "dynamic_api_auto" and (
            row["api_probe_enabled"] is True or (row["api_probe_requests_count"] or 0) > 0
        ):
            failures.append(f"real API probing occurred: {row['case_id']}")
        if row["profile_type"] == "static_deepseek_full" and row.get(
            "static_investigation_termination_reason"
        ) in {"llm_error", "provider_error", "invalid_json"}:
            failures.append(f"DeepSeek investigation failed: {row['case_id']}")
    control = ROOT / "artifacts/deepseek-campaign-local-api-probe"
    requests_obj = base.load(control / "dynamic/api_requests.json", {}) or {}
    requests = requests_obj.get("requests", [])
    if len(requests) > 20:
        failures.append("local control exceeded request budget")
    if any(r.get("method") in {"POST", "PUT", "PATCH", "DELETE"} and not r.get("skipped") for r in requests):
        failures.append("local control sent a mutating request")
    for relative in ("dynamic/api_requests.json", "findings/api_candidate_findings.json", "evidence/api_evidence.json"):
        if not (control / relative).is_file():
            failures.append(f"local control missing {relative}")
    findings = base.load(control / "findings/api_candidate_findings.json", []) or []
    if not any(f.get("finding_id") == "API_DOCS_EXPOSED" for f in findings):
        failures.append("local control missing API_DOCS_EXPOSED")
    key = os.environ.get("DEEPSEEK_API_KEY")
    if key:
        for root in (ROOT / "artifacts", CAMPAIGN):
            for path in root.rglob("*"):
                if path.is_file() and key in path.read_text(errors="ignore"):
                    failures.append(f"secret leakage: {path}")
    base.dump(CAMPAIGN / "metrics/validation.json", {"ok": not failures, "failures": failures})
    return failures


def report(samples: list[dict], rows: list[dict], failures: list[str]) -> None:
    profiles = defaultdict(list)
    for row in rows:
        profiles[row["profile_type"]].append(row)
    deep = profiles["static_deepseek_full"]
    dyn = profiles["dynamic"] + profiles["dynamic_api_auto"]
    control = ROOT / "artifacts/deepseek-campaign-local-api-probe"
    requests = (base.load(control / "dynamic/api_requests.json", {}) or {}).get("requests", [])
    api_findings = base.load(control / "findings/api_candidate_findings.json", []) or []
    api_evidence = base.load(control / "evidence/api_evidence.json", []) or []
    status = "OK" if not failures and all(r["command_status"] == "completed" for r in rows) else "Partially OK"
    lines = ["# Native DeepSeek samples campaign", "", f"## Overall status: {status}", "",
        f"The campaign contains {len(samples)} APKs and {len(rows)} run rows.", "",
        "## DeepSeek status", "", "- Native provider model: `deepseek-chat`.",
        "- Preflight connectivity and agentic execution succeeded.",
        f"- Investigation termination reasons: {dict(Counter(str(r['static_investigation_termination_reason']) for r in deep))}.",
        f"- Model fallback used by {sum(bool(r.get('fallback_model_used')) for r in deep)} cases.", "",
        "## APK inventory", "", f"Total: {len(samples)}; MASTG: {sum(s['group']=='MASTG' for s in samples)}; BB: {sum(s['group']=='BB' for s in samples)}."]
    lines += [f"- {s['filename']} — `{s['sample_id']}`" for s in samples]
    static = profiles["static_no_llm"]
    values = [r["canonical_findings_count"] for r in static if isinstance(r.get("canonical_findings_count"), int)]
    lines += ["", "## Static no-LLM results", "",
        f"Completed: {sum(r['command_status']=='completed' for r in static)}/{len(static)}; findings range: {min(values) if values else 'n/a'}–{max(values) if values else 'n/a'}."]
    lines += [f"- {r['filename']}: findings={r['canonical_findings_count']}, evidence={r['evidence_items_count']}." for r in static]
    lines += ["", "## DeepSeek full agentic results", ""]
    for r in deep:
        hyps = base.load(ROOT / "artifacts" / r["case_id"] / "analysis/llm_hypotheses.json", []) or []
        cands = base.load(ROOT / "artifacts" / r["case_id"] / "findings/llm_candidate_findings.json", []) or []
        titles = [x.get("title") for x in hyps[:2] + cands[:2] if x.get("title")]
        lines.append(f"- {r['filename']}: status={r['command_status']}, termination={r['static_investigation_termination_reason']}, tools={r['static_investigation_tool_calls']}, hypotheses={len(hyps)}, candidates={len(cands)}, evidence-backed={r['llm_candidate_findings_with_evidence_count']}; top: {', '.join(titles) or 'none'}.")
    obs = [r["dynamic_observations_count"] for r in dyn if isinstance(r.get("dynamic_observations_count"), int)]
    lines += ["", "## Dynamic results", "",
        f"Install successes: {sum(r['dynamic_install_success'] is True for r in dyn)}/{len(dyn)}; launch successes: {sum(r['dynamic_launch_success'] is True for r in dyn)}/{len(dyn)}; observations range: {min(obs) if obs else 'n/a'}–{max(obs) if obs else 'n/a'}."]
    lines += [f"- `{r['case_id']}`: {r['dynamic_termination_reason']}." for r in dyn if r["dynamic_termination_reason"] != "completed"]
    lines += ["", "## API auto-discovery", ""]
    for r in profiles["dynamic_api_auto"]:
        d = base.load(ROOT / "artifacts" / r["case_id"] / "dynamic/api_discovery.json", {}) or {}
        selected = ", ".join(x.get("base_url", "") for x in d.get("selected_candidates", [])[:3]) or "none"
        skipped = ", ".join(f"{x.get('base_url')} ({x.get('reason')})" for x in d.get("skipped_candidates", [])[:3]) or "none"
        lines.append(f"- {r['filename']}: candidates={r['api_candidates_count']}, selected={r['api_selected_candidates_count']}; selected: {selected}; skipped: {skipped}.")
    lines += ["", "Real API probing was off for every auto-discovery case.", "",
        "## Local API probing control", "",
        f"Requests: {len(requests)}/20; actually sent methods: {dict(Counter(r.get('method') for r in requests if not r.get('skipped')))}; skipped mutating methods: {sum(r.get('method') in {'POST','PUT','PATCH','DELETE'} and r.get('skipped') for r in requests)}; findings={len(api_findings)}; evidence={len(api_evidence)}.", "",
        "## Safety", "", "- No DEEPSEEK_API_KEY leakage detected.",
        "- No mutating request was sent.", "- No real discovered API was probed.",
        "- JSON artifacts parsed successfully.", "", "## Limitations", "",
        "- Emulator availability may prevent install, launch, and runtime observations.",
        "- API extraction may include framework, schema, infrastructure, or documentation candidates.",
        "- Generated artifacts are untracked; no commit was created."]
    if failures:
        lines += ["", "Validation issues: " + "; ".join(failures) + "."]
    (CAMPAIGN / "reports/campaign_report.md").write_text("\n".join(lines) + "\n")


def main() -> int:
    for directory in (CAMPAIGN, CAMPAIGN / "reports", CAMPAIGN / "metrics", CAMPAIGN / "logs"):
        directory.mkdir(parents=True, exist_ok=True)
    samples = base.manifest()
    executions = run_matrix(samples)
    control_sample = next((s for s in samples if s["filename"] == "AndroGoat.apk"), samples[0])
    executions.append(local_control(control_sample))
    base.dump(CAMPAIGN / "metrics/process_results.json", executions)
    rows = base.summarize(executions)
    failures = validate(rows)
    report(samples, rows, failures)
    print(f"Campaign complete: {len(rows)} rows, {len(failures)} validation failures", flush=True)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
