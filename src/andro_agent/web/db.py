from __future__ import annotations

import json
import sqlite3
from contextlib import contextmanager
from datetime import UTC, datetime
from pathlib import Path
from typing import Any, Iterator

from andro_agent.web.settings import DB_PATH


def utc_now() -> str:
    return datetime.now(UTC).isoformat()


@contextmanager
def connect(db_path: Path = DB_PATH) -> Iterator[sqlite3.Connection]:
    db_path.parent.mkdir(parents=True, exist_ok=True)
    conn = sqlite3.connect(db_path)
    conn.row_factory = sqlite3.Row

    try:
        yield conn
        conn.commit()
    finally:
        conn.close()


def init_db(db_path: Path = DB_PATH) -> None:
    with connect(db_path) as conn:
        conn.execute(
            """
            CREATE TABLE IF NOT EXISTS cases (
                id TEXT PRIMARY KEY,
                filename TEXT NOT NULL,
                package_name TEXT,
                sha256 TEXT NOT NULL,
                status TEXT NOT NULL,
                analysis_profile TEXT NOT NULL,
                agentic_mode TEXT NOT NULL DEFAULT 'none',
                agentic_budget TEXT NOT NULL DEFAULT 'balanced',
                llm_provider TEXT,
                llm_model TEXT,
                apk_path TEXT NOT NULL,
                artifacts_dir TEXT NOT NULL,
                current_step TEXT,
                progress INTEGER NOT NULL DEFAULT 0,
                created_at TEXT NOT NULL,
                updated_at TEXT NOT NULL,
                error_message TEXT
            )
            """
        )

        existing_columns = {
            row["name"] for row in conn.execute("PRAGMA table_info(cases)").fetchall()
        }
        for name, definition in (
            ("agentic_mode", "TEXT NOT NULL DEFAULT 'none'"),
            ("agentic_budget", "TEXT NOT NULL DEFAULT 'balanced'"),
            ("llm_provider", "TEXT"),
            ("llm_model", "TEXT"),
        ):
            if name not in existing_columns:
                conn.execute(f"ALTER TABLE cases ADD COLUMN {name} {definition}")

        conn.execute(
            """
            CREATE TABLE IF NOT EXISTS findings (
                id TEXT PRIMARY KEY,
                case_id TEXT NOT NULL,
                title TEXT NOT NULL,
                description TEXT,
                severity TEXT,
                category TEXT,
                source TEXT,
                evidence_json TEXT,
                created_at TEXT NOT NULL,
                FOREIGN KEY(case_id) REFERENCES cases(id)
            )
            """
        )

        conn.execute(
            """
            CREATE TABLE IF NOT EXISTS tool_runs (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                case_id TEXT NOT NULL,
                tool_name TEXT NOT NULL,
                status TEXT NOT NULL,
                started_at TEXT,
                finished_at TEXT,
                output_path TEXT,
                error_message TEXT,
                FOREIGN KEY(case_id) REFERENCES cases(id)
            )
            """
        )


class CaseRepository:
    def create_case(
        self,
        *,
        case_id: str,
        filename: str,
        sha256: str,
        apk_path: Path,
        artifacts_dir: Path,
        analysis_profile: str,
        agentic_mode: str = "none",
        agentic_budget: str = "balanced",
        llm_provider: str | None = None,
        llm_model: str | None = None,
    ) -> None:
        now = utc_now()

        with connect() as conn:
            conn.execute(
                """
                INSERT INTO cases (
                    id, filename, sha256, status, analysis_profile,
                    agentic_mode, agentic_budget, llm_provider, llm_model,
                    apk_path, artifacts_dir, current_step, progress,
                    created_at, updated_at
                )
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """,
                (
                    case_id,
                    filename,
                    sha256,
                    "queued",
                    analysis_profile,
                    agentic_mode,
                    agentic_budget,
                    llm_provider,
                    llm_model,
                    str(apk_path),
                    str(artifacts_dir),
                    "queued",
                    0,
                    now,
                    now,
                ),
            )

    def list_cases(self) -> list[dict[str, Any]]:
        with connect() as conn:
            rows = conn.execute(
                """
                SELECT
                    c.*,
                    COUNT(f.id) AS findings_count,
                    SUM(CASE WHEN LOWER(f.severity) = 'critical' THEN 1 ELSE 0 END) AS critical_count,
                    SUM(CASE WHEN LOWER(f.severity) = 'high' THEN 1 ELSE 0 END) AS high_count,
                    SUM(CASE WHEN LOWER(f.severity) = 'medium' THEN 1 ELSE 0 END) AS medium_count,
                    SUM(CASE WHEN LOWER(f.severity) = 'low' THEN 1 ELSE 0 END) AS low_count,
                    SUM(CASE WHEN LOWER(f.severity) = 'info' THEN 1 ELSE 0 END) AS info_count
                FROM cases c
                LEFT JOIN findings f ON f.case_id = c.id
                GROUP BY c.id
                ORDER BY c.created_at DESC
                """
            ).fetchall()

        return [dict(row) for row in rows]

    def get_case(self, case_id: str) -> dict[str, Any] | None:
        with connect() as conn:
            row = conn.execute(
                "SELECT * FROM cases WHERE id = ?",
                (case_id,),
            ).fetchone()

        return dict(row) if row else None

    def update_status(
        self,
        case_id: str,
        status: str,
        *,
        current_step: str | None = None,
        progress: int | None = None,
        error_message: str | None = None,
        package_name: str | None = None,
    ) -> None:
        case = self.get_case(case_id)

        if not case:
            return

        with connect() as conn:
            conn.execute(
                """
                UPDATE cases
                SET status = ?,
                    current_step = ?,
                    progress = ?,
                    error_message = ?,
                    package_name = COALESCE(?, package_name),
                    updated_at = ?
                WHERE id = ?
                """,
                (
                    status,
                    current_step if current_step is not None else case.get("current_step"),
                    progress if progress is not None else case.get("progress", 0),
                    error_message,
                    package_name,
                    utc_now(),
                    case_id,
                ),
            )

    def replace_findings(self, case_id: str, findings: list[dict[str, Any]]) -> None:
        with connect() as conn:
            conn.execute("DELETE FROM findings WHERE case_id = ?", (case_id,))

            now = utc_now()

            for idx, finding in enumerate(findings):
                evidence = finding.get("evidence", [])

                conn.execute(
                    """
                    INSERT INTO findings (
                        id, case_id, title, description, severity,
                        category, source, evidence_json, created_at
                    )
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                    """,
                    (
                        f"{case_id}:{idx}",
                        case_id,
                        finding.get("title") or finding.get("rule_id") or f"Finding {idx + 1}",
                        finding.get("description") or finding.get("summary"),
                        str(finding.get("severity") or finding.get("level") or "info").lower(),
                        finding.get("category") or finding.get("type") or "uncategorized",
                        finding.get("source") or finding.get("origin") or "static",
                        json.dumps(evidence, ensure_ascii=False, default=str),
                        now,
                    ),
                )

    def list_findings(self, case_id: str) -> list[dict[str, Any]]:
        severity_order = """
            CASE LOWER(severity)
                WHEN 'critical' THEN 0
                WHEN 'high' THEN 1
                WHEN 'medium' THEN 2
                WHEN 'low' THEN 3
                WHEN 'info' THEN 4
                ELSE 5
            END
        """

        with connect() as conn:
            rows = conn.execute(
                f"""
                SELECT *
                FROM findings
                WHERE case_id = ?
                ORDER BY {severity_order}, category ASC, title ASC
                """,
                (case_id,),
            ).fetchall()

        findings = []

        for row in rows:
            item = dict(row)
            raw_evidence = item.pop("evidence_json") or "[]"

            try:
                evidence = json.loads(raw_evidence)
            except json.JSONDecodeError:
                evidence = raw_evidence

            item["evidence"] = evidence
            item["evidence_pretty"] = json.dumps(
                evidence,
                indent=2,
                ensure_ascii=False,
                default=str,
            )

            findings.append(item)

        return findings
