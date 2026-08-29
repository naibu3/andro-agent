# Tool Capability Inventory

## 1. Purpose

This document maps functionality already present in Andro-Agent to possible
bounded tools for the future investigation agent. It identifies reusable code,
missing safety boundaries, and capabilities that should remain deferred. The aim
is to reuse the deterministic pipeline without exposing internal file access or
general command execution to an LLM.

The inventory reflects the repository as it exists now. A module being usable by
the pipeline does not automatically make it safe as an agent tool: agent-facing
tools also need validated inputs, case isolation, bounded output, trace records,
and predictable failure behavior.

## 2. Current available static capabilities

### Capability inventory

| Capability | Existing module or file | Current input and output | Safe for agent use now? | Wrapper needed for LLM use |
| --- | --- | --- | --- | --- |
| Manifest extraction | `tools/extract_manifest.py`, `parsers/manifest_parser.py`, `validators/apk.py` | `ExtractManifestInput` containing APK, case, and artifact paths; runs apktool and writes raw XML plus `parsed/manifest.json` | No. It invokes a subprocess, creates directories, and is intended as a pipeline stage | Do not expose during investigation. The agent should read already-produced facts through a case-scoped tool |
| Manifest facts | `facts/manifest_facts.py`, `models.py` | Reads validated `parsed/manifest.json`; writes `facts/manifest_facts.json` and returns typed `Fact` objects | Data is reusable, but the builder is not an agent query API | Read-only filter/pagination wrapper over the existing facts file; allow fact type and component filters only |
| Manifest findings | `rules/manifest_rules.py` | Reads manifest facts; applies fixed rules; writes `findings/manifest_findings.json` | Findings are safe to read; rule execution must remain a deterministic pipeline concern | `get_findings` should read canonical output or the legacy file through a fixed case resolver, never rerun or alter rules |
| Code search | `tools/code_search.py` | Recursively scans JADX sources for a fixed list of regex patterns; writes `code_search/code_search_results.json` with file, line, category, and line text | Partly reusable, not agent-safe. It scans the whole tree, has no result limit, accepts tool-configured regexes, and writes output | Read-only search wrapper with a case-fixed source root, literal-by-default query, extension allow-list, top-k, time/result limits, and path-relative results |
| Code facts | `facts/code_search_facts.py` | Converts search matches into `Fact` records and writes `facts/code_search_facts.json` | Safe to read, but generation belongs to the baseline | A filtered reader can expose fact type, category, file, line, and snippet; no regeneration by the agent |
| Code findings | `rules/code_rules.py` | Reads code facts; applies fixed rules; writes `findings/code_findings.json` | Findings are safe to read; rule execution is not an investigation action | Serve through `get_findings`, preserving source and evidence IDs and bounding result count |
| JADX output | `tools/reverse/jadx_tool.py`, `CaseState.jadx_output_dir` | Validates an APK, runs JADX, and writes decompiled sources under the case directory | Decompilation is not agent-safe; the resulting source tree is useful read-only data | Add a safe path resolver and bounded snippet reader. Do not expose arbitrary path reads or JADX invocation |
| Canonical findings | `domain/adapters/security_findings.py`, `web/services/result_service.py` | Canonicalizes legacy findings and exports `findings/canonical_findings.json` with IDs, lifecycle fields, metadata, and evidence IDs | Yes as a data source, subject to case/path checks and output limits | Thin `get_findings` wrapper with filters, pagination, stable ordering, and compact records |
| Canonical evidence | `domain/adapters/security_evidence.py`, `domain/models/security.py`, `web/services/result_service.py` | Converts legacy evidence into typed `Evidence` dictionaries and exports `evidence/evidence.json` with stable `EVID-*` IDs | Yes as a data source. Existing loading validates list shape, but it is web-service oriented | `get_evidence` should accept explicit IDs, preserve ordering, cap records/snippet size, and report missing IDs |
| Static bundle | `bundle/static_bundle.py` | Reads manifest, facts, searches, and findings; writes `bundle/static_analysis_bundle.json` plus counts | Useful internally, but too broad for direct prompt/tool exposure | Use only as an index or cache source. Return selected fields rather than the complete bundle |
| Report generation | `pipelines/static_pipeline.py`, `web/services/report_rendering.py`, `web/services/result_service.py` | Produces deterministic or LLM Markdown; structured renderer links findings to evidence | No investigation capability; it is a terminal presentation step | No agent tool is needed initially. Reports should consume validated candidate findings after investigation |
| Metrics | `metrics/models.py`, `metrics/tracker.py` | Tracks run, step, and agent duration; records character counts and provider token usage; writes full and summary JSON | Suitable for observation, not yet for enforcing agent budgets | Add tool-call metrics and budget counters later; existing metrics can receive aggregate investigation results |

### Existing safety foundations

Several pieces can be reused when building wrappers:

- `CaseState` associates artifact paths with one `case_id`.
- `_safe_case_artifacts_dir()` and `infer_case_artifacts_dir()` in
  `web/services/result_service.py` perform limited case-directory inference.
- Canonical findings and evidence already provide stable IDs and typed records.
- `security_artifacts.py` and `safe_final_artifacts()` demonstrate resolved-path,
  symlink, extension, and excluded-directory checks.
- Pydantic models already validate many pipeline inputs and security records.

These foundations are now used by the read-only service in
`investigation/static_tools.py`, which provides a shared containment resolver and
bounded access to findings, evidence, code, source context, and manifest facts.

## 3. Current available dynamic capabilities

The repository contains a dynamic pipeline and an allow-listed task model, but it
should be treated as a prototype. `DynamicAnalysisPipeline` starts mitmproxy and
an emulator, modifies the emulator trust store, installs the APK, executes a
static-derived plan, collects artifacts, and optionally asks an LLM for follow-up
task kinds. This is materially broader than a safe agent tool interface.

| Capability | Existing module or file | Maturity | Current input and output | Risks or prerequisites | Exposure decision |
| --- | --- | --- | --- | --- | --- |
| ADB foundation | `tools/android/adb_tool.py`, `tools/android/android_sdk_tool.py` | Prototype | Methods accept APK, package, component, URI, or output path; return raw `CompletedProcess` or write files | Requires SDK and a reachable device; no device serial/session binding, uniform validation, output cap, or canonical evidence conversion | Later, only behind typed session-scoped wrappers |
| Emulator/device handling | `tools/android/emulator_tool.py`, `dynamic/setup.py` | Prototype | Starts/stops a named AVD and waits for boot/package service | Global emulator/ADB state, long timeouts, process ownership, snapshot/reset policy, and concurrent-run isolation are unresolved | Later; not directly LLM-controlled |
| App installation and launch | `ADBTool.install_apk()`, `ADBTool.launch_app()`, dynamic pipeline launch handler | Usable inside the controlled pipeline | APK/package input; return code and stdout/stderr; post-action screenshot, UI dump, and logcat artifacts | Must bind APK/package to the case, establish clean device state, redact/cap output, and prevent cross-session actions | Later after a device-session controller exists |
| Activities and intents | `ADBTool.launch_activity()`, `DynamicAction`, dynamic pipeline handlers | Prototype | Component string; executes `am start -n`; records observations and artifacts | Component is weakly validated; extras/actions/flags are not modeled; launching arbitrary components can affect other apps | Later with manifest-derived allow-list and typed intent schema |
| Deep links | `ADBTool.open_deeplink()`, `plan_from_static.py`, dynamic handler | Prototype | URL string; executes an ACTION_VIEW intent; captures UI/log artifacts | URI scheme/host/package scope is not enforced and external handlers may receive the intent | Later with manifest-derived URI allow-list and target-package controls |
| Content provider queries | `ADBTool.query_content_provider()`, `dynamic/provider_paths.py`, dynamic handler | Prototype | URI string; runs `content query`; detects rows or permission denial | URI and result size are unbounded; query may expose sensitive data; no projection/selection schema or redaction | Later with authority allow-list, row/byte limits, and explicit user opt-in |
| UI capture and analysis | `ADBTool.dump_ui()`, `ADBTool.screenshot()`, `dynamic/analyzers/ui_analyzer.py`, `ui_diff.py` | Usable for controlled capture; analysis is heuristic | Writes XML/PNG; analyzers return observations for text, package, resource IDs, classes, and before/after differences | Captures may contain sensitive data; output paths and device session need isolation | Later as observation tools after session controls |
| UI interaction | No tap/type/swipe implementation | Missing | No current input/output contract | Coordinate/selector validation, secrets, destructive actions, and replay are unresolved | Not now; defer |
| Logcat | `tools/logcat_tool.py`, crash detection in `dynamic_pipeline.py` | Prototype | Clears global logcat and dumps all available lines to a file | Global clear affects other work; dump is unfiltered/unbounded and may contain secrets from unrelated processes | Later with package/PID filters, time markers, byte limits, and redaction |
| Network/traffic | `tools/network/mitmproxy_tool.py`, `android_cert_tool.py`, `dynamic/analyzers/network_analyzer.py` | Prototype and environment-dependent | Starts mitmdump, saves flows/logs, installs a system CA, derives host/URL summaries | Requires mitmproxy, root/remount-compatible AVD, certificate mutation, proxy configuration, cleanup, and handling of pinning/non-HTTP traffic | Later, opt-in only after static tools prove value |
| TLS pinning | `pinning_triage` task handler and network artifacts | Placeholder | Emits an observation that triage was requested and lists existing network artifact paths | It does not bypass or validate pinning and can overstate capability | Not as an executable tool; retain only as a future hypothesis category |
| Frida | Evidence enum/metadata mentions only; no Frida tool or runtime integration | Missing | No implementation | Requires server/client version management, rooted device setup, script allow-listing, and strong execution boundaries | Not now |

The dynamic task validator allow-lists task kinds, which is a useful foundation.
However, it does not validate task-specific parameters, and the orchestrator has
no global maximum number of follow-up tasks or tool calls. Dynamic handlers also
record some calls in `CaseState.tool_history`, but tracing is not uniform across
all handlers and does not create canonical evidence for every action.

## 4. Proposed minimal static tool set

The first tools should be read-only, operate only on completed static artifacts,
and return compact JSON-compatible records. Suggested limits below are defaults
and hard caps, not hints that the model can override.

### `get_findings`

- **Purpose:** retrieve deterministic or canonical findings without repeating the
  entire finding corpus in the prompt.
- **Input schema:** `{case_id, source?: "manifest"|"code"|"canonical",
  finding_ids?: string[<=20], severities?: string[<=5], categories?:
  string[<=10], offset?: int>=0, limit?: int=1..50}`.
- **Output schema:** `{items: [{finding_id, rule_id, source, title, severity,
  category, status, evidence_ids}], total, offset, truncated}`.
- **Maximum output:** 50 findings and 32 KiB serialized.
- **Evidence behavior:** returns evidence IDs only; it does not create evidence.
- **Safety checks:** resolve the case from the configured artifact root, read only
  known finding filenames, reject unknown filters, use stable ordering, and never
  mutate or merge the deterministic files.

### `get_evidence`

- **Purpose:** resolve supporting material only when an investigation needs it.
- **Input schema:** `{case_id, evidence_ids: string[1..20],
  include_raw?: bool=false}`.
- **Output schema:** `{items: [{evidence_id, evidence_type, source_tool,
  artifact_path, selector, snippet, command, metadata?}], missing_ids,
  truncated}`.
- **Maximum output:** 20 records, 2 KiB per snippet, and 32 KiB serialized.
- **Evidence behavior:** reads existing canonical evidence; creates nothing.
- **Safety checks:** validate `EVID-*` shape, load only
  `evidence/evidence.json`, preserve requested order, omit `raw_evidence` unless
  explicitly requested, and truncate nested metadata.

### `search_code`

- **Purpose:** locate code relevant to one hypothesis without sending the full
  source tree to the model.
- **Input schema:** `{case_id, query: string[2..200], mode?: "literal"|"regex",
  path_prefix?: string, extensions?: [".java"|".kt"|".xml"], limit?:
  int=1..25}`. Regex mode should be disabled in the first version unless a safe
  regex policy and timeout are available.
- **Output schema:** `{matches: [{artifact_path, line_number, line_text}],
  scanned_files, truncated}`.
- **Maximum output:** 25 matches, 500 characters per line, and 24 KiB serialized.
- **Evidence behavior:** search results are observations, not automatically
  canonical evidence. A later accepted candidate may persist selected matches as
  evidence.
- **Safety checks:** force the root to the current case's JADX source directory,
  resolve and verify `path_prefix`, reject symlinks and unsupported extensions,
  enforce file/byte/time/result limits, and return case-relative paths.

### `open_source_context`

- **Purpose:** retrieve a small numbered source window around a known match.
- **Input schema:** `{case_id, artifact_path, line_number: int>=1,
  before?: int=0..40, after?: int=0..40}`.
- **Output schema:** `{artifact_path, start_line, end_line, lines:
  [{number, text}], truncated, sha256?}`.
- **Maximum output:** 81 lines, 500 characters per line, and 24 KiB serialized.
- **Evidence behavior:** initially returns an observation. When used to support an
  accepted candidate, the exact path, selector, snippet, and optional file hash
  should be canonicalized as source evidence.
- **Safety checks:** use a shared resolver to prove containment in the case JADX
  tree, reject absolute paths, traversal and symlinks, allow text source suffixes
  only, cap file size before reading, and use tolerant UTF-8 decoding.

### `get_manifest_facts`

- **Purpose:** query application flags, permissions, components, authorities, and
  intent-related facts without loading the full manifest bundle.
- **Input schema:** `{case_id, fact_types?: string[<=20], component?:
  string[<=200], value?: scalar, offset?: int>=0, limit?: int=1..50}`.
- **Output schema:** `{items: [{type, key, value, source, confidence, metadata}],
  total, offset, truncated}`.
- **Maximum output:** 50 facts and 32 KiB serialized.
- **Evidence behavior:** returns existing facts. Selected facts may be converted
  to manifest evidence only when a candidate passes validation.
- **Safety checks:** read only `facts/manifest_facts.json`, validate scalar
  filters, cap nested metadata, use stable ordering, and never invoke extraction
  or rules.

## 5. Deferred tools

- **UI interaction:** there is capture and diff analysis, but no tap/type/swipe
  implementation or replay-safe selector contract. Interaction also introduces
  state, destructive-action, authentication, and secret-handling risks.
- **Traffic capture:** current mitmproxy support changes emulator configuration
  and installs a system CA. It is environment-dependent and too invasive for an
  initial investigation proof.
- **Frida:** no Frida integration exists. Adding device setup, script execution,
  and version management before static investigation is measured would be a
  separate project.
- **Generic shell:** it would bypass typed validation, case isolation, output
  limits, and reproducible evidence. It should never be an LLM-facing tool.
- **Unrestricted file access:** arbitrary reads could expose APK-independent
  workspace data or secrets. Tools should expose semantic operations over
  allow-listed case artifacts instead.

## 6. Gaps

- **Source snippet opener:** implemented for bounded line windows in
  `StaticInvestigationTools`; method/class-aware extraction remains absent.
- **Symbol/caller index:** absent. JADX output can be searched as text, but there
  is no class/method index, call graph, or caller lookup.
- **Safe path resolver:** implemented inside the static investigation service for
  case/JADX containment, traversal, symlink, suffix, and file-size checks. It is
  not yet a repository-wide public path API.
- **Tool trace:** `CaseState.tool_history` and run metrics capture selected calls,
  but there is no uniform record for tool name, normalized input, bounded output
  summary, duration, error, and produced evidence IDs.
- **Token budget tracking:** agent metrics record provider usage after calls, but
  there is no enforced run/investigation token ceiling or remaining-budget API.
- **Tool-call budget:** the dynamic orchestrator can accept follow-ups without a
  global step/call ceiling. A static investigation loop needs hard termination
  limits before model-driven use.
- **Dynamic session stability:** emulator startup, ADB selection, proxy and CA
  setup, application reset, cleanup, and recovery are not represented by one
  isolated session contract. Concurrent runs or partial failures can therefore
  leave ambiguous device state. Dynamic agent tools should wait until sessions
  have explicit ownership, health checks, reset policy, and teardown guarantees.
- **Result-size policy:** existing artifact readers and code search do not share a
  standard serialized byte cap or truncation contract.
- **Candidate admission gate:** canonical models support evidence-linked states,
  but there is not yet a dedicated validator that separates hypotheses,
  candidates, duplicates, and accepted findings.

## 7. Recommended next implementation

The recommended read-only static investigation service is now implemented with
five bounded operations: `get_findings`, `get_evidence`, `search_code`,
`open_source_context`, and `get_manifest_facts`.

The batch introduced a shared case/JADX resolver, compact response dictionaries,
and hard result/byte limits while reusing canonical JSON and JADX output without
changing rules, agents, prompts, or the deterministic pipeline. Persistent,
uniform tool traces remain a separate gap. No dynamic work should be combined
with validation of this static layer.

Acceptance should be testable without an LLM: temporary case fixtures must prove
path isolation, stable ordering, truncation, missing-file behavior, evidence-ID
lookup, and that every operation is read-only.

## 8. TFM relevance

This inventory limits the TFM scope to capabilities that can answer a measurable
research question. Reusing canonical findings, canonical evidence, JADX output,
and existing metrics avoids building parallel data layers. Bounded retrieval then
makes it possible to measure whether an LLM chooses useful context, how many tool
calls and tokens it consumes, and whether it produces valid evidence-linked
candidates beyond the deterministic baseline.

The same artifact and evaluation protocol can be applied to general-purpose
agents such as Codex and Claude, while MobSF provides a conventional Android
analysis comparison. Recording which repository capabilities were reused,
wrapped, or deferred also makes threats to validity and engineering trade-offs
explicit rather than attributing all behavior to the model.
