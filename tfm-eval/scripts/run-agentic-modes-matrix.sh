#!/usr/bin/env bash

set -u

if [ "$#" -ne 4 ]; then
  echo "Usage: $0 <apk-path> <case-prefix> <provider> <model>" >&2
  exit 2
fi

APK_PATH=$1
CASE_PREFIX=$2
PROVIDER=$3
MODEL=$4
REPO_ROOT=$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)
ANALYZER_BIN=${ANDRO_AGENT_BIN:-andro-agent}
ARTIFACTS_DIR="$REPO_ROOT/tfm-eval/artifacts"
TIMESTAMP=$(date -u +"%Y%m%dT%H%M%SZ")

if [ ! -f "$APK_PATH" ]; then
  echo "APK not found: $APK_PATH" >&2
  exit 1
fi

mkdir -p "$ARTIFACTS_DIR"

runs=(
  "single conservative"
  "single balanced"
  "planner-executor balanced"
  "multi-phase balanced"
)

for run in "${runs[@]}"; do
  read -r mode budget <<<"$run"
  case_id="${CASE_PREFIX}-${mode}-${budget}-${TIMESTAMP}"
  echo "Running mode=$mode budget=$budget provider=$PROVIDER model=$MODEL case_id=$case_id"
  "$ANALYZER_BIN" run "$APK_PATH" \
    --case-id "$case_id" \
    --artifacts-dir "$ARTIFACTS_DIR" \
    --profile full \
    --agentic-mode "$mode" \
    --agentic-budget "$budget" \
    --llm-provider "$PROVIDER" \
    --llm-model "$MODEL"
done

echo "Completed. Planner-executor and multi-phase currently record single_agent_fallback."
