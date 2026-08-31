#!/usr/bin/env bash

set -Eeuo pipefail
if [ "$#" -ne 4 ]; then
  echo "Usage: $0 <apk-path> <case-prefix> <provider> <model>" >&2
  exit 2
fi

APK=$1
PREFIX=$2
PROVIDER=$3
MODEL=$4
ANDRO_AGENT_BIN="${ANDRO_AGENT_BIN:-andro-agent}"
ROOT=${ANDRO_AGENT_ARTIFACTS_DIR:-tfm-eval/artifacts}

if [ "$ANDRO_AGENT_BIN" = "andro-agent" ]; then
  if ! command -v andro-agent >/dev/null 2>&1; then
    echo "ERROR: andro-agent command not found." >&2
    echo "Activate the virtual environment or use:" >&2
    echo "ANDRO_AGENT_BIN=.venv/bin/andro-agent tfm-eval/scripts/smoke-static-mvp.sh ..." >&2
    exit 1
  fi
elif [[ "$ANDRO_AGENT_BIN" == */* ]] && [ ! -x "$ANDRO_AGENT_BIN" ]; then
  echo "ERROR: ANDRO_AGENT_BIN is not executable: $ANDRO_AGENT_BIN" >&2
  exit 1
fi

require_artifact() {
  path=$1
  if [ ! -f "$path" ]; then
    echo "ERROR: expected artifact is missing: $path" >&2
    return 1
  fi
}

run_and_check() {
  profile=$1
  mode=$2
  case_id="${PREFIX}-${profile}"
  if ! "$ANDRO_AGENT_BIN" run "$APK" --case-id "$case_id" --artifacts-dir "$ROOT" \
    --analysis-profile "$profile" --agentic-mode "$mode" \
    --llm-provider "$PROVIDER" --llm-model "$MODEL"; then
    echo "ERROR: andro-agent run failed for profile $profile (case $case_id)." >&2
    return 1
  fi
  require_artifact "$ROOT/$case_id/findings/manifest_findings.json"
  require_artifact "$ROOT/$case_id/findings/code_findings.json"
  require_artifact "$ROOT/$case_id/findings/canonical_findings.json"
  require_artifact "$ROOT/$case_id/metrics/run_metrics_summary.json"
  if [ "$mode" = "single" ]; then
    require_artifact "$ROOT/$case_id/analysis/static_investigation_trace.json"
  else
    if [ -f "$ROOT/$case_id/analysis/static_investigation_trace.json" ]; then
      echo "ERROR: unexpected static investigation trace: $ROOT/$case_id/analysis/static_investigation_trace.json" >&2
      return 1
    fi
  fi
}

run_and_check no-llm none
run_and_check fast none
run_and_check full single
echo "Static MVP smoke checks passed."
