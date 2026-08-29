# Local TFM Evaluation Workspace

This directory is reserved for local TFM evaluation. It keeps private test inputs
and generated results separate from the product source tree.

Place APKs manually under `tfm-eval/apks/`. APK files must never be committed.
Execution output belongs under `tfm-eval/artifacts/`, command logs under
`tfm-eval/runs/`, and private reports under `tfm-eval/reports/`. These locations
are ignored by Git. Evaluation notes can be maintained under `tfm-eval/notes/`,
and expected findings can be documented under `tfm-eval/expected/`.

## Running individual profiles

Run commands from the repository root:

```bash
andro-agent run tfm-eval/apks/example.apk \
  --case-id example-no-llm-001 \
  --profile no-llm \
  --artifacts-dir tfm-eval/artifacts

andro-agent run tfm-eval/apks/example.apk \
  --case-id example-fast-001 \
  --profile fast \
  --artifacts-dir tfm-eval/artifacts

andro-agent run tfm-eval/apks/example.apk \
  --case-id example-full-001 \
  --profile full \
  --artifacts-dir tfm-eval/artifacts

andro-agent run tfm-eval/apks/example.apk \
  --case-id example-llm-001 \
  --profile llm \
  --artifacts-dir tfm-eval/artifacts
```

The `llm` profile requires the provider credentials and model configuration used
by the local andro-agent installation.

To run the standard comparison matrix:

```bash
./tfm-eval/scripts/run-profile-matrix.sh tfm-eval/apks/example.apk example
```

Set both `ANDRO_AGENT_LLM_PROVIDER` and `ANDRO_AGENT_LLM_MODEL` to include the
`llm` profile in the matrix. The script does not print their values.

## Comparing results

Use the same APK and a distinct case ID for every profile. Compare:

- execution duration and status from the run logs;
- generated findings and severity distributions;
- missed findings and false positives against an expected-findings file;
- evidence quality and report usefulness;
- differences in LLM usage between `no-llm`, `fast`, `full`, and `llm`.

Inspect one case with:

```bash
./tfm-eval/scripts/summarize-run.sh example-full-001
```

## Comparing profile outputs

Deterministic manifest and code findings should remain stable across profiles for
the same APK. LLM-enabled profiles can add reasoning and improve reports, but a
change to the deterministic finding set makes the profile comparison suspicious.

```bash
python tfm-eval/scripts/compare-profile-results.py \
  --artifacts-dir tfm-eval/artifacts \
  --cases \
    no-llm=androgoat-no-llm-20260731T154540Z \
    fast=androgoat-fast-20260731T154540Z \
    full=androgoat-full-20260731T154540Z \
  --output-dir tfm-eval/reports/androgoat-20260731T154540Z
```

`comparison.json` contains machine-readable profile summaries, normalized
deterministic-set differences, severity distributions, and warnings.
`comparison.md` presents the same comparison as a readable table with timing,
report, evidence, and interpretation notes. Files under `tfm-eval/reports/` are
private evaluation outputs and are ignored by Git.

Copy `notes/evaluation-template.md` for each evaluated APK and keep any private
report material in `reports/`.

## TFM evaluation use

This workspace supports a repeatable evaluation chapter by keeping the APK,
commit, profile, provider/model, expected weaknesses, observed findings,
execution problems, and post-improvement results documented in a consistent
format. Only reusable templates and scripts belong in version control; APKs,
execution artifacts, logs, and private reports remain local.
