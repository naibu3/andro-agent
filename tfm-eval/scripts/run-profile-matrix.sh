#!/usr/bin/env bash

set -u

if [ "$#" -ne 2 ]; then
  echo "Usage: $0 <apk-path> <case-prefix>" >&2
  exit 2
fi

APK_PATH=$1
CASE_PREFIX=$2
REPO_ROOT=$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)
ANALYZER_BIN=${ANDRO_AGENT_BIN:-andro-agent}

cd "$REPO_ROOT" || exit 1

if [ ! -f "$APK_PATH" ]; then
  echo "APK not found: $APK_PATH" >&2
  exit 1
fi

if [[ ! "$CASE_PREFIX" =~ ^[A-Za-z0-9._-]+$ ]]; then
  echo "Case prefix may contain only letters, numbers, dots, underscores, and hyphens." >&2
  exit 2
fi

TIMESTAMP=$(date -u +"%Y%m%dT%H%M%SZ")
RUN_DIR="tfm-eval/runs/$TIMESTAMP"
ARTIFACTS_DIR="tfm-eval/artifacts"
mkdir -p "$RUN_DIR" "$ARTIFACTS_DIR"

profiles=("no-llm" "fast" "full")
if [ -n "${ANDRO_AGENT_LLM_PROVIDER:-}" ] && [ -n "${ANDRO_AGENT_LLM_MODEL:-}" ]; then
  profiles+=("llm")
else
  echo "Skipping llm profile: provider/model environment variables are not both set."
fi

summary=()

for profile in "${profiles[@]}"; do
  case_id="${CASE_PREFIX}-${profile}-${TIMESTAMP}"
  log_path="$RUN_DIR/${profile}.log"

  echo "Running profile=$profile case_id=$case_id"
  "$ANALYZER_BIN" run "$APK_PATH" \
    --case-id "$case_id" \
    --profile "$profile" \
    --artifacts-dir "$ARTIFACTS_DIR" \
    >"$log_path" 2>&1
  exit_code=$?

  summary+=("$profile|$case_id|$exit_code")
  echo "Completed profile=$profile exit_code=$exit_code log=$log_path"
done

echo
echo "Profile summary"
printf '%-10s %-48s %s\n' "PROFILE" "CASE ID" "EXIT"
for row in "${summary[@]}"; do
  IFS='|' read -r profile case_id exit_code <<<"$row"
  printf '%-10s %-48s %s\n' "$profile" "$case_id" "$exit_code"
done

echo "Logs: $RUN_DIR"
