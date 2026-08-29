#!/usr/bin/env bash

set -u
if [ "$#" -ne 4 ]; then
  echo "Usage: $0 <apk-path> <case-prefix> <provider> <model>" >&2
  exit 2
fi

APK=$1
PREFIX=$2
PROVIDER=$3
MODEL=$4
BIN=${ANDRO_AGENT_BIN:-andro-agent}
ROOT=${ANDRO_AGENT_ARTIFACTS_DIR:-tfm-eval/artifacts}

run_and_check() {
  profile=$1
  mode=$2
  case_id="${PREFIX}-${profile}"
  "$BIN" run "$APK" --case-id "$case_id" --artifacts-dir "$ROOT" \
    --analysis-profile "$profile" --agentic-mode "$mode" \
    --llm-provider "$PROVIDER" --llm-model "$MODEL" || return 1
  test -f "$ROOT/$case_id/findings/manifest_findings.json"
  test -f "$ROOT/$case_id/findings/code_findings.json"
  test -f "$ROOT/$case_id/findings/canonical_findings.json"
  test -f "$ROOT/$case_id/metrics/run_metrics_summary.json"
  if [ "$mode" = "single" ]; then
    test -f "$ROOT/$case_id/analysis/static_investigation_trace.json"
  else
    test ! -f "$ROOT/$case_id/analysis/static_investigation_trace.json"
  fi
}

run_and_check no-llm none
run_and_check fast none
run_and_check full single
echo "Static MVP smoke checks passed."
