# MVP operational contract

The MVP keeps deterministic detection as the baseline and treats LLM and device-dependent stages as
optional extensions. Every started pipeline must finish with usable artifacts or a controlled failure
with an error, trace, state, and metrics. No external agentic YAML/JSON configuration is used.

## Supported flows

### Static deterministic

```bash
andro-agent run app.apk --case-id static-base --analysis-profile no-llm
```

Input is a readable APK and case ID. The run requires no LLM. It writes manifest/code findings,
canonical findings and evidence when available, a static report, case state, and run metrics. Static
investigation is disabled. Validation or tool failures produce `status=failed`, retained deterministic
artifacts, a clear error in case state, and metrics.

### Static LLM/agentic

```bash
andro-agent run app.apk --case-id static-agentic --analysis-profile full \
  --agentic-mode single --llm-provider ollama --llm-model qwen2.5-coder:7b
```

The provider/model and its existing credentials or local service are required. In addition to the
deterministic artifacts, a started investigation always writes `analysis/static_investigation_trace.json`,
`analysis/llm_hypotheses.json`, and `findings/llm_candidate_findings.json`. Empty or invalid model output
is an investigation termination, not corruption of deterministic results. Planner-executor and
multi-phase remain explicit `single_agent_fallback` modes.

### Dynamic basic

```bash
andro-agent dynamic run app.apk --case-id dynamic-basic --avd Pixel_6_API_34
```

Inputs are an APK, case ID, and configured AVD/device environment. The existing pipeline resolves the
package, starts/connects the emulator, installs and launches the app through its plan, collects existing
observations/logcat/network artifacts, and performs current cleanup. It writes `dynamic/dynamic_plan.json`
when planning succeeds, `dynamic/dynamic_results.json`, `dynamic/dynamic_trace.json`, case state, and
metrics. Emulator, package, install, and launch failures return a nonzero CLI status and retain a
classified termination reason and error.

### Dynamic agentic (experimental)

```bash
andro-agent dynamic run app.apk --case-id dynamic-agentic --avd Pixel_6_API_34 \
  --agentic-mode single --llm-provider ollama --llm-model qwen2.5-coder:7b
```

This runs the same device workflow with the existing bounded decision mechanism. It additionally writes
`dynamic/dynamic_agentic_trace.json` containing decisions, observations count, warnings, errors, and the
termination reason. Individual LLM decision failures are warnings and do not abort the basic run.
Advanced crawling, Frida, and new vulnerability-specific actions are outside the MVP.

### Web

Upload an APK at `/upload`; the case progresses through queued, running, and completed or failed. The
status endpoint exposes status, current step, progress, and a clean error. Completed pages show available
deterministic findings/evidence, LLM hypotheses/candidates, dynamic observations, reports, and artifacts.
Missing optional sections render as `Not available` and do not prevent other results from rendering.
Downloads include findings, canonical findings, evidence, Markdown/HTML reports, and a safe bundle when
available. Uploaded APKs and paths outside the case are excluded from bundles.

## Metrics contract

`metrics/run_metrics_summary.json` contains top-level case ID, status, duration, step/agent counts,
warnings/errors, provider/model and token counts when known, static finding/evidence counts, static
agentic fields, and dynamic fields. Non-applicable booleans and counts use `false` and `0`; unavailable
strings and token values use `null`. The nested `summary` object remains for compatibility.

## Web smoke checklist

1. Upload a valid APK and confirm the returned case begins as `queued`.
2. Poll `/api/scans/<case>/status` and verify `running` progress/current step.
3. Open the completed page and verify deterministic findings and available optional sections.
4. Open a failed case and verify a readable error without a template failure.
5. Download findings, canonical findings, evidence, report Markdown/HTML, and bundle where available.
6. Remove an optional hypothesis, evidence, or dynamic file and confirm the page shows `Not available`.
7. Inspect the bundle and confirm it does not contain the uploaded APK or out-of-case symlink targets.
