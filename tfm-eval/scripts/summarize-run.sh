#!/usr/bin/env bash

set -u

if [ "$#" -ne 1 ]; then
  echo "Usage: $0 <case-id>" >&2
  exit 2
fi

CASE_ID=$1
REPO_ROOT=$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)
CASE_DIR="$REPO_ROOT/tfm-eval/artifacts/$CASE_ID"

if [ ! -d "$CASE_DIR" ]; then
  echo "Case artifacts not found: $CASE_DIR" >&2
  exit 1
fi

echo "Case: $CASE_ID"
echo "Artifacts: $CASE_DIR"
echo

echo "Files generated"
find "$CASE_DIR" -type f -print | sort

echo
echo "Report files found"
find "$CASE_DIR" -type f \( -iname "*.md" -o -iname "*.html" \) -print | sort

echo
echo "Findings JSON files found"
find "$CASE_DIR" -type f -iname "*findings*.json" -print | sort

echo
echo "Evidence JSON files found"
find "$CASE_DIR" -type f -iname "*evidence*.json" -print | sort

echo
if command -v grep >/dev/null 2>&1; then
  evid_count=$(
    grep -rhoE 'EVID-[A-Fa-f0-9]{12}' "$CASE_DIR" 2>/dev/null |
      wc -l |
      tr -d '[:space:]'
  )
  echo "EVID references: ${evid_count:-0}"
else
  echo "EVID references: unavailable (grep not found)"
fi
