# Agentic Pipeline Plan

## 1. Current state

Andro-Agent runs deterministic manifest and code analysis before any model is
invoked. Extraction, facts, and rules produce the legacy manifest/code findings,
which define the reproducible baseline. The pipeline also exports canonical
findings and canonical evidence with stable `EVID-*` references, making the
relationship between a finding and its supporting artifact explicit.

The current analysis profiles are:

- `no-llm`: deterministic analysis and deterministic report;
- `fast`: deterministic analysis with compact LLM-assisted reporting when
  configured;
- `full`: deterministic analysis followed by manifest, code, fusion, and report
  reasoning agents.

Today, LLMs mainly interpret, prioritize, correlate, and present results already
found by deterministic rules. In the AndroGoat evaluation, all three profiles
produced the same deterministic finding set. `full` took substantially longer
than `no-llm`, but did not add findings; its contribution was reasoning and
reporting. Canonical evidence export now provides the traceability needed for a
controlled investigation layer.

## 2. Problem statement

The current agents summarize available signals but do not actively inspect
additional code context or test a concrete security hypothesis. More JSON layers
would not solve this limitation: new representations are valuable only when an
agent can request the exact context required to answer an investigation question.

The next challenge is to let models inspect static artifacts and, where enabled,
interact with runtime state without weakening reproducibility. Each action must
be bounded and observable, and each accepted result must point to durable
evidence. The deterministic baseline must remain comparable even when model,
tool availability, or emulator state changes.

## 3. Design principles

- The deterministic baseline remains stable and is never rewritten by an LLM.
- No evidence, no finding: an unsupported statement remains a hypothesis.
- LLM-derived outputs are stored separately from deterministic findings.
- Tool access is allow-listed and bounded by steps, calls, time, and output size.
- Every accepted candidate or confirmed finding references canonical evidence.
- Dynamic actions record reproducible commands, inputs, device state, and output.
- Token budgets are explicit per run and per investigation.
- Hypotheses are not findings until supported by static or dynamic evidence.
- Existing evidence is reused before requesting new extraction or execution.
- Failures and inconclusive checks remain visible rather than being presented as
  negative results.

## 4. Proposed agentic pipeline

```text
APK
  -> deterministic baseline
  -> compact static bundle
  -> bounded LLM investigation loop
       -> static tool calls
       -> optional dynamic tool calls
  -> hypotheses / candidate findings
  -> evidence and validation gate
  -> report
```

The compact bundle seeds the investigation with package metadata, attack surface,
finding summaries, evidence IDs, and a ranked file index. The agent selects a
small number of questions, calls tools to retrieve context, and updates each
hypothesis after every observation. Static investigation runs without an emulator.
Dynamic verification is a separate, explicitly enabled stage.

The validation gate rejects candidates without valid evidence IDs, separates
duplicates of deterministic findings, and records whether evidence supports,
refutes, or leaves the hypothesis inconclusive. Reports combine the unchanged
baseline with clearly labelled agent-derived results.

## 5. Agent capabilities

### Static capabilities

- list deterministic and canonical findings;
- retrieve canonical evidence by ID;
- search decompiled code with constrained patterns and paths;
- open bounded source snippets around a match;
- inspect normalized manifest facts and components;
- inspect class and method context without loading the full source tree;
- correlate manifest entry points, code handlers, and existing findings.

### Dynamic capabilities

- install and launch the APK on a controlled device;
- inspect the current UI hierarchy;
- perform bounded UI interactions;
- start exported activities and send constrained intents;
- open deep links;
- query content providers with explicit URIs and projections;
- collect filtered logcat output;
- inspect approved runtime files in the application sandbox when access permits;
- capture and analyze traffic when a configured interception environment exists.

Dynamic tools must expose capability and precondition failures cleanly. An
unsupported operation must produce an inconclusive result, not an inferred
finding.

## 6. Tool interface proposal

All tools should return a small structured result containing `success`, a bounded
summary, relevant artifact paths, and any newly created evidence IDs. Inputs must
be validated and paths restricted to the current case directory.

| Tool | Purpose | Inputs | Output type | Evidence produced |
| --- | --- | --- | --- | --- |
| `get_findings` | Retrieve baseline or agent-derived findings | source, severity/category filters, limit | Finding summaries | None; returns existing evidence IDs |
| `get_evidence` | Resolve evidence for inspection | evidence IDs | Canonical evidence records | None |
| `search_code` | Find relevant symbols or text | query, path scope, file types, top-k | Ranked matches | Search-result evidence when retained |
| `open_source_context` | Inspect bounded code around a match | artifact path, line/method, context limit | Numbered source snippet | Source evidence |
| `get_manifest_facts` | Inspect application/component configuration | fact types, component, limit | Manifest fact records | Manifest evidence when retained |
| `inspect_symbol` | Retrieve class/method callers and local context | class or method identifier, depth limit | Symbol context | Source evidence |
| `correlate_entrypoint` | Link a manifest component to handling code | component identifier, optional intent | Correlation result | References existing and new source evidence |
| `device_prepare` | Establish a known runtime state | APK, device profile, reset policy | Device/session metadata | Tool-output evidence |
| `app_launch` | Install or launch the target | session, package/activity, reset flag | Launch result | Command and log evidence |
| `ui_snapshot` | Capture current UI state | session | UI hierarchy summary | UI hierarchy and optional screenshot evidence |
| `ui_action` | Perform one constrained interaction | session, selector, action, value | Action result and new UI state | Action/log evidence |
| `start_activity` | Exercise an activity or intent | component, action, extras, flags | Command result | ADB/logcat evidence |
| `open_deeplink` | Exercise a URI entry point | URI, package, flags | Command result | ADB/logcat/UI evidence |
| `query_provider` | Test an exposed provider | URI, projection, selection, limit | Bounded query result | Command/result evidence |
| `collect_logcat` | Retrieve logs for a time-bounded action | filters, since marker, maximum lines | Filtered log records | Logcat evidence |
| `inspect_runtime_file` | Read an approved application artifact | session, sandbox-relative path, byte limit | File metadata/snippet | Runtime-file evidence |
| `capture_traffic` | Observe configured network traffic | session, time window, filters | Request/response summaries | Traffic evidence |

No generic shell tool should be exposed to the investigation agent. Lower-level
commands may be used behind typed tools, with the resolved command recorded in
evidence.

## 7. Token optimization strategy

- Never place the full decompiled codebase in a prompt.
- Retrieve source snippets only when a hypothesis requires them.
- Rank files and return only the top-k candidates with explicit score/reason.
- Allocate context budgets separately to baseline, observations, and conclusions.
- Summarize large tool outputs deterministically and retain full output as an
  artifact rather than prompt content.
- Cache static indexes and summaries by APK hash and tool version.
- Refer to deterministic findings by ID instead of repeating their full text.
- Deduplicate observations and evidence before adding them to context.
- Enforce strict maximum investigation steps, tool calls, output bytes, and total
  tokens; stop with an inconclusive state when a budget is exhausted.

## 8. Finding lifecycle

| State | Meaning and admission rule |
| --- | --- |
| Deterministic finding | Produced by existing rules. It belongs to the stable baseline and is independent of LLM execution. |
| LLM hypothesis | A question or plausible weakness selected for investigation. It may reference signals but is not reported as a finding. |
| LLM candidate finding | A distinct security claim supported by relevant static evidence and accepted by schema/evidence validation, but not dynamically verified. |
| Dynamically confirmed finding | A candidate reproduced at runtime with recorded actions and canonical dynamic evidence. |
| Refuted finding | A hypothesis or candidate contradicted by a valid check. The check and refuting evidence remain recorded. |
| Inconclusive finding | Investigation could not establish or refute the claim because of missing capability, ambiguous evidence, failure, or budget exhaustion. |

Transitions are append-only from the evaluation perspective. An agent cannot
promote a hypothesis by changing its wording; promotion requires new evidence and
validation. Candidate findings that duplicate a deterministic finding should be
stored as enrichment or verification of that finding, not counted as new
detection.

## 9. Profile evolution

- `no-llm`: deterministic extraction, rules, canonical export, and deterministic
  report only.
- `fast`: deterministic baseline plus a compact summary and prioritization; no
  autonomous investigation loop.
- `full`: deterministic baseline plus bounded static LLM investigation and
  candidate generation.
- `agentic` or `dynamic`: deterministic baseline, static investigation, and
  controlled dynamic verification on a configured device.

Profile names must describe capability rather than model size. Each profile must
record model configuration, budgets, enabled tools, and termination reason so
runs remain comparable.

## 10. Evaluation plan

For each selected OWASP MASTG reference APK:

1. Run `no-llm` to establish deterministic findings and canonical evidence.
2. Run the future `full` static-agent profile with fixed model/tool budgets.
3. Run the dynamic-agent profile where emulator and application support allow it.
4. Verify that legacy deterministic signatures remain identical across profiles.
5. Count hypotheses and distinct LLM candidate findings separately.
6. Manually label candidates as valid, duplicate, false positive, or inconclusive
   against the reference weakness and application behavior.
7. Measure elapsed time, token usage, tool calls, evidence generated, confirmed
   findings, and false positives.

Results should be reported per APK and in aggregate. Comparisons must distinguish
new detection from better explanation of an existing deterministic finding. Runs
with missing evidence, different baseline signatures, unsupported dynamic tools,
or unrecoverable device failures should be flagged rather than silently pooled.

## 11. Implementation phases

### Phase 1: Planning and context optimization

Define investigation contracts, budgets, lifecycle schemas, termination reasons,
and compact indexes. Measure current bundle/context size before changing agents.

### Phase 2: Static investigation tools

Implement read-only, case-scoped tools for findings, evidence, code search, source
context, manifest facts, and symbol/entry-point correlation. Test output bounds and
path safety independently of any LLM.

### Phase 3: LLM static candidate generation

Add a bounded investigation loop that emits hypotheses and evidence-linked
candidates into separate artifacts. Add validation and deterministic-duplicate
checks before candidates reach reports.

### Phase 4: Dynamic verification tools

Introduce session-controlled device preparation, intents, deep links, UI actions,
provider queries, logcat, runtime files, and optional traffic capture. Persist
replayable action plans and results.

### Phase 5: Benchmark on MASTG

Run fixed profile matrices on selected reference APKs, manually validate candidate
findings, and analyze effectiveness, cost, latency, and flakiness.

### Phase 6: Documentation and TFM write-up

Document architecture, tool contracts, benchmark protocol, threats to validity,
results, and reproducibility instructions. Keep private APKs and generated reports
inside the ignored evaluation workspace.

## 12. Risks and mitigations

| Risk | Mitigation |
| --- | --- |
| Hallucinated findings | Require evidence IDs, schema validation, and explicit hypothesis/candidate separation. |
| Token explosion | Use retrieval, top-k limits, cached summaries, output truncation, and hard budgets. |
| Dynamic flakiness | Reset device state, add bounded retries, record preconditions, and classify unresolved runs as inconclusive. |
| Emulator instability | Pin images/configuration, run health checks, capture diagnostics, and isolate sessions. |
| Duplicated findings | Compare candidates with deterministic IDs, categories, locations, and evidence before accepting them as new. |
| Unsupported applications | Detect architecture, SDK, anti-emulator, authentication, and environment constraints early; report capability gaps. |
| Unclear evidence | Prefer numbered snippets and captured commands/results; reject evidence that cannot support the exact claim. |
| Over-engineering | Deliver one measurable capability per phase and avoid new registries or schemas until a concrete consumer requires them. |

## 13. TFM framing

This plan supports a thesis built around a reproducible deterministic baseline and
an experimentally separable agentic LLM layer. The baseline provides stable recall
and profile comparability; the agentic layer is evaluated on whether it can produce
additional, evidence-based candidates or confirmations under controlled budgets.

Vulnerable MASTG APKs provide known targets for measuring detection, false
positives, cost, and runtime reliability. Results can be compared with MobSF as a
conventional Android analysis baseline and with Codex or Claude as general-purpose
agentic systems, using the same APKs and manual validation criteria. The core TFM
claim is therefore testable: controlled tool use and canonical evidence can make
LLM investigation more useful than report generation while retaining auditability
and reproducibility.
