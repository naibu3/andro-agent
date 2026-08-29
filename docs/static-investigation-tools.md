# Static Investigation Tools

## Purpose

`StaticInvestigationTools` provides bounded, read-only access to artifacts from
one completed analysis case. It is the retrieval layer intended for a future LLM
investigation loop; it does not invoke a model, rerun analysis, create evidence,
or modify deterministic findings.

Implementation: `src/andro_agent/investigation/static_tools.py`.

## Audit summary

The five operations are methods of `StaticInvestigationTools`; they are not
registered with an agent or exposed through the CLI.

| Tool | Read-only and case-scoped | Path and output controls | Safe failure | Tests |
| --- | --- | --- | --- | --- |
| `get_findings` | Reads fixed canonical or legacy finding paths | Filters plus 200-record hard limit; compact fields omit raw metadata | Missing/malformed files return `success=false` | Canonical read, filters, limit, legacy fallback, immutability |
| `get_evidence` | Reads only `evidence/evidence.json` | ID selection, 200-record hard limit, bounded values, no outside absolute artifact paths | Missing IDs are reported separately; missing/malformed file is structured | Selection, missing IDs, immutability, path leakage |
| `search_code` | Searches only the current case's `jadx/sources` | Extension allow-list and query, file, byte, scan, and top-k caps; relative paths only | Missing source tree and invalid inputs are structured | Query match, top-k, outside-file exclusion, relative paths |
| `open_source_context` | Reads one validated file below the current case's `jadx/sources` | Shared containment resolver; traversal, outside paths, symlinks, suffixes, file bytes, lines, and line length bounded | Unsafe/missing paths return `success=false` | Numbered context, max lines, traversal/outside rejection |
| `get_manifest_facts` | Reads fixed facts or parsed-manifest paths | Filters, bounded nested values, and 200-record hard limit | Missing/malformed artifacts return a structured error | Filter and limit behavior, missing files, immutability |

No method calls an LLM, subprocess, web service, database, rule engine, or report
writer. The tests hash all case inputs before and after a representative tool run
to verify that no file changes.

## Tool list

Every method returns a dictionary with `success`, `error`, data-specific fields,
and a `truncated` flag where the result can be limited.

### `get_findings`

Inputs: optional `source`, `severity`, and `category` filters, plus `limit`.

Output: compact canonical finding records under `findings`, their returned
`count`, and `truncated`. The tool prefers
`findings/canonical_findings.json`. If it is absent, it reads the legacy manifest
and code finding files without changing them and labels their source in memory.

Default limit: 50. Hard limit: 200.

### `get_evidence`

Inputs: optional list of `evidence_ids` and `limit`.

Output: selected canonical records under `evidence`, returned `count`,
`missing_evidence_ids`, and `truncated`. Raw legacy evidence metadata is omitted
from the bounded view. Absolute artifact paths outside the case are not returned.

Default limit: 50. Hard limit: 200. Evidence IDs supplied in one call are also
bounded to 200.

### `search_code`

Inputs: literal `query`, `top_k`, and optional `file_extensions`.

Output: `matches` containing case-relative `path`, `line`, bounded `line_text`,
and a simple occurrence `score`, plus `scanned_files` and `truncated`.

The query is limited to 200 characters. `top_k` defaults to 20 and has a hard
limit of 50. Searches are restricted to `jadx/sources` and the extensions
`.java`, `.kt`, `.smali`, and `.xml`. Individual files are capped at 2 MiB; a
call scans at most 10,000 files or 32 MiB.

### `open_source_context`

Inputs: `artifact_path`, optional one-based `line`, `context_lines`, and
`max_lines`.

Output: a case-relative artifact path, start/end lines, numbered `{line, text}`
records, and `truncated`.

The path must resolve to a regular allowed source file below `jadx/sources`.
Returned lines are capped at 500 characters. `max_lines` defaults to 40 and has a
hard limit of 100; source files larger than 2 MiB are rejected.

### `get_manifest_facts`

Inputs: optional `component` substring and exact `fact_type`, plus `limit`.

Output: bounded fact records under `facts`, returned `count`, and `truncated`.
The primary source is `facts/manifest_facts.json`. If it is absent, the tool can
derive a limited fact view from `parsed/manifest.json`.

Default limit: 100. Hard limit: 200.

## Safety constraints

- One service instance is bound to one existing, non-symlink case directory.
- All reads pass through the same containment resolver.
- Traversal segments and paths resolving outside the case are rejected.
- Source operations are further restricted to `jadx/sources`.
- Symlink files are skipped during search and rejected by direct source reads.
- JSON and source file sizes, search work, result counts, line lengths, and
  nested values are bounded.
- Normal output uses case-relative paths and omits path-heavy raw finding/evidence
  metadata.
- Methods return structured errors for missing or malformed artifacts.
- The service contains no write calls, subprocess calls, database access, web
  state, dynamic tooling, or LLM/provider calls.

## Example usage

```python
from pathlib import Path

from andro_agent.investigation import StaticInvestigationTools

tools = StaticInvestigationTools(Path("artifacts/example-case"))
findings = tools.get_findings(severity="high", limit=10)
matches = tools.search_code("rawQuery", top_k=5)
```

Run the local read-only smoke test from the repository root:

```bash
python tfm-eval/scripts/smoke-test-static-tools.py \
  --case-dir tfm-eval/artifacts/androgoat-no-llm-20260802T164005Z
```

Each tool failure is reported in the Markdown summary without stopping the other
checks.

## Relation to the future agentic loop

These tools allow an investigation agent to start from stable deterministic
findings, resolve only relevant evidence, locate additional code context, and
inspect manifest facts on demand. Search results and source snippets are
observations, not new findings. A future admission step must require canonical
evidence before promoting an LLM hypothesis to a candidate finding, and must keep
that candidate separate from the deterministic baseline.

## Current limitations

- Code search is bounded literal matching, not a symbol index or call graph.
- No class/method/caller resolution is available.
- The service does not create canonical evidence from selected source context.
- It does not yet emit a persistent tool-call trace or enforce token budgets; it
  only bounds returned context and scan work.
- It assumes the static pipeline has already produced a conventional case layout.
- No dynamic, UI, device, network, Frida, shell, or unrestricted file tools are
  exposed.
