#!/usr/bin/env bash

set -u
if [ "$#" -ne 3 ] && [ "$#" -ne 5 ]; then
  echo "Usage: $0 <apk-path> <case-prefix> <avd> [provider model]" >&2
  exit 2
fi

APK=$1
PREFIX=$2
AVD=$3
BIN=${ANDRO_AGENT_BIN:-andro-agent}
ROOT=${ANDRO_AGENT_ARTIFACTS_DIR:-tfm-eval/artifacts}

run_dynamic() {
  case_id=$1
  shift
  if ! "$BIN" dynamic run "$APK" --case-id "$case_id" --artifacts-dir "$ROOT" \
    --avd "$AVD" "$@"; then
    echo "Dynamic run failed cleanly; inspect $ROOT/$case_id/dynamic/dynamic_trace.json" >&2
  fi
  test -f "$ROOT/$case_id/dynamic/dynamic_results.json"
  test -f "$ROOT/$case_id/dynamic/dynamic_trace.json"
  test -f "$ROOT/$case_id/metrics/run_metrics_summary.json"
}

run_dynamic "${PREFIX}-basic"
if [ "$#" -eq 5 ]; then
  run_dynamic "${PREFIX}-agentic" --agentic-mode single --llm-provider "$4" --llm-model "$5"
  test -f "$ROOT/${PREFIX}-agentic/dynamic/dynamic_agentic_trace.json"
fi
echo "Dynamic MVP smoke artifacts are present."
