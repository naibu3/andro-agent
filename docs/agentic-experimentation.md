# Agentic experimentation

Andro-Agent uses Python pipeline settings and CLI flags for agentic experiments. It does not use
external YAML or JSON agent profiles. Deterministic manifest, code, and canonical findings remain
the stable baseline; agentic output is written separately as hypotheses and candidate findings.

## CLI controls

Run a balanced single-agent investigation with Ollama:

```bash
andro-agent run app.apk --case-id ollama-single --profile full \
  --agentic-mode single --agentic-budget balanced \
  --llm-provider ollama --llm-model qwen2.5-coder:7b
```

For OpenRouter, use `--llm-provider openrouter`, select an OpenRouter model with `--llm-model`,
and configure the existing provider credentials. The built-in budgets are `conservative` (3
questions/10 tool calls), `balanced` (5/20), and `deep` (8/40). All search, context, candidate,
and tool-output limits scale with the selected preset and remain subject to hard caps.

The modes are:

- `none`: skip static investigation.
- `single`: run the implemented bounded planning, tool execution, and synthesis flow.
- `planner-executor`: currently runs the single-agent implementation and records
  `agentic_strategy_runtime=single_agent_fallback`.
- `multi-phase`: does not claim multi-agent orchestration; it uses the same explicitly recorded
  fallback until a real implementation exists.

`no-llm` always forces `none`. `fast` defaults to `none`. `full` and `llm` default to `single`.
An explicit `--agentic-mode none` disables investigation.

## Comparing runs

The transparent matrix helper runs the same APK through representative built-in combinations:

```bash
tfm-eval/scripts/run-agentic-modes-matrix.sh \
  tfm-eval/apks/AndroGoat.apk androgoat-agentic ollama qwen2.5-coder:7b
```

Run metrics and the static investigation trace record the requested mode, actual runtime strategy,
budget, provider/model, enabled tools, limits, tool-call count, termination reason, and hypothesis
and candidate counts. Compare agentic candidates against canonical findings rather than treating
them as replacements for deterministic results.
