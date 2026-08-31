from __future__ import annotations

import hashlib
import json
import re
from collections import Counter
from dataclasses import asdict, dataclass
from pathlib import Path
from typing import Any

from andro_agent.agentic import AgenticRuntimeConfig
from andro_agent.core.llm import build_llm_model, get_llm_metadata
from andro_agent.investigation import StaticInvestigationTools

ALLOWED_TOOLS = frozenset(
    {"get_findings", "get_evidence", "search_code", "open_source_context", "get_manifest_facts"}
)
SEVERITIES = frozenset({"low", "medium", "high", "critical"})
CONFIDENCES = frozenset({"low", "medium", "high"})
CONCRETE_SEARCH_TERMS = (
    "Runtime.getRuntime().exec",
    ".exec(",
    "ProcessBuilder",
    "rawQuery",
    "execSQL",
    "SQLiteDatabase",
    "loadUrl",
    "addJavascriptInterface",
    "setJavaScriptEnabled",
    "http://",
    "usesCleartextTraffic",
    "ContentProvider",
    "query(",
    "insert(",
    "update(",
    "delete(",
    "SharedPreferences",
    "FileOutputStream",
    "Base64",
    "AES",
    "Cipher.getInstance",
)
MANIFEST_TERMS = (
    "export",
    "permission",
    "provider",
    "service",
    "activity",
    "receiver",
    "debuggable",
    "allowbackup",
    "networksecurityconfig",
    "usescleartexttraffic",
    "manifest",
)


class LLMJSONParseError(RuntimeError):
    def __init__(self, reason: str) -> None:
        self.reason = reason
        message = (
            "LLM returned an empty response."
            if reason == "empty_response"
            else ("LLM response was not valid JSON.")
        )
        super().__init__(message)


class LLMProviderError(RuntimeError):
    pass


@dataclass(frozen=True)
class StaticInvestigationBudget:
    max_questions: int = 5
    max_tool_calls: int = 20
    max_search_results: int = 10
    max_context_lines: int = 40
    max_candidates: int = 10
    max_output_chars_per_tool: int = 12_000


class StaticInvestigationAgent:
    name = "static_investigation"

    def __init__(
        self,
        *,
        case_dir: Path,
        profile: str,
        provider: str | None = None,
        model_id: str | None = None,
        model_client: Any | None = None,
        budget: StaticInvestigationBudget | None = None,
        runtime_config: AgenticRuntimeConfig | None = None,
    ) -> None:
        self.case_dir = Path(case_dir)
        self.profile = profile
        self.runtime_config = runtime_config or AgenticRuntimeConfig(mode="single")
        self.provider = self.runtime_config.provider or provider
        self.model_id = self.runtime_config.model or model_id
        self.model_client = model_client
        self.budget = budget or StaticInvestigationBudget(
            max_questions=self.runtime_config.max_questions,
            max_tool_calls=self.runtime_config.max_tool_calls,
            max_search_results=self.runtime_config.max_search_results,
            max_context_lines=self.runtime_config.max_context_lines,
            max_candidates=self.runtime_config.max_candidates,
            max_output_chars_per_tool=self.runtime_config.max_output_chars_per_tool,
        )
        self.enabled_tools = self.runtime_config.enabled_tools
        self.tools = StaticInvestigationTools(self.case_dir)
        self._agno_agent: Any | None = None
        self._usage: list[dict[str, Any]] = []
        self._deterministic_findings: list[dict[str, Any]] = []
        self._raw_response_attempts: dict[str, int] = {}
        self._last_raw_response: dict[str, str] = {}

    def run(self) -> dict[str, Any]:
        trace = self._new_trace()
        hypotheses: list[dict[str, Any]] = []
        candidates: list[dict[str, Any]] = []
        try:
            metadata = get_llm_metadata(model_id=self.model_id, provider=self.provider)
            self.provider = metadata["provider"]
            self.model_id = metadata["model"]
            trace["llm_provider"] = self.provider
            trace["llm_model"] = self.model_id
            self._set_phase(trace, "context_building")
            context, context_calls = self._build_context()
            trace["tool_calls"].extend(context_calls)
            self._set_phase(trace, "question_planning")
            try:
                plan = self._call_model(self._planning_prompt(context), phase="question_planning")
                questions = self._normalize_questions(plan.get("questions"))
                trace["question_planning_source"] = "llm"
            except LLMProviderError:
                raise
            except LLMJSONParseError as exc:
                trace["question_planning_error"] = exc.reason
                trace["errors"].append(f"question_planning: {exc}")
                questions = self._repair_question_planning(context, exc, trace)
            except (RuntimeError, TypeError) as exc:
                trace["question_planning_error"] = "invalid_json"
                trace["errors"].append(f"question_planning: {exc}")
                questions = []
            if not questions:
                questions = self._fallback_questions(context["top_findings"])
                trace["question_planning_source"] = "fallback"
                if trace["question_planning_error"] is None:
                    trace["question_planning_error"] = "invalid_json"
            for question in questions:
                if question.pop("_legacy_plan", False) and not question["needed_evidence_ids"]:
                    question["needed_evidence_ids"] = list(
                        dict.fromkeys(
                            evidence_id
                            for finding in context["top_findings"][:3]
                            for evidence_id in finding.get("evidence_ids", [])
                        )
                    )[:10]
            trace["questions"] = questions

            self._set_phase(trace, "tool_execution")
            observations: list[dict[str, Any]] = []
            for question in questions:
                self._execute_question(question, trace, observations)
                if trace["termination_reason"] == "budget_exhausted":
                    break

            self._set_phase(trace, "final_synthesis")
            final_prompt = self._final_prompt(context, questions, observations)
            try:
                final = self._call_model(final_prompt, phase="final_synthesis")
            except LLMJSONParseError as exc:
                trace["final_synthesis_error"] = exc.reason
                final = self._repair_final_synthesis(final_prompt, exc, trace)
            self._set_phase(trace, "validation")
            valid_evidence_ids = set(self._evidence_ids_in(observations))
            hypotheses, candidates = self._validate_outputs(
                final,
                valid_evidence_ids=valid_evidence_ids,
                deterministic_findings=self._deterministic_findings,
            )
            if trace["termination_reason"] != "budget_exhausted":
                trace["termination_reason"] = "completed"
        except LLMJSONParseError as exc:
            trace["termination_reason"] = exc.reason
            trace["failed_phase"] = trace["current_phase"]
            trace["errors"].append(str(exc))
        except LLMProviderError as exc:
            trace["termination_reason"] = "llm_error"
            trace["failed_phase"] = trace["current_phase"]
            if trace["current_phase"] == "question_planning":
                trace["question_planning_error"] = "llm_error"
            elif trace["current_phase"] == "final_synthesis":
                trace["final_synthesis_error"] = "llm_error"
            trace["errors"].append(str(exc))
        except RuntimeError as exc:
            message = str(exc)
            lowered = message.lower()
            trace["termination_reason"] = (
                "llm_error"
                if "api key" in lowered and "not configured" in lowered
                else "disabled"
                if "not configured" in lowered
                else "invalid_json"
                if "valid json" in lowered or "json object" in lowered
                else "llm_error"
            )
            trace["failed_phase"] = trace["current_phase"]
            trace["errors"].append(message)
        except Exception as exc:  # noqa: BLE001 - optional agent failures must not fail the pipeline
            trace["termination_reason"] = "llm_error"
            trace["failed_phase"] = trace["current_phase"]
            trace["errors"].append(str(exc))

        self._set_phase(trace, "output_writing")
        paths = self._write_outputs(trace, hypotheses, candidates)
        return {
            "trace": trace,
            "hypotheses": hypotheses,
            "candidates": candidates,
            "paths": paths,
            "usage": self._combined_usage(),
        }

    def write_disabled_outputs(self, reason: str) -> dict[str, Any]:
        trace = self._new_trace()
        trace["static_investigation_ran"] = False
        trace["termination_reason"] = "disabled"
        self._set_phase(trace, "output_writing")
        trace["errors"] = [reason]
        paths = self._write_outputs(trace, [], [])
        return {"trace": trace, "hypotheses": [], "candidates": [], "paths": paths, "usage": None}

    def _new_trace(self) -> dict[str, Any]:
        return {
            "case_id": self.case_dir.name,
            "profile": self.profile,
            "agent": self.name,
            "agentic_mode": self.runtime_config.mode.value,
            "requested_agentic_mode": self.runtime_config.mode.value,
            "agentic_strategy_runtime": self.runtime_config.strategy_runtime,
            "strategy_runtime": self.runtime_config.strategy_runtime,
            "agentic_budget": self.runtime_config.budget_preset.value,
            "llm_provider": self.provider,
            "llm_model": self.model_id,
            "provider": self.provider,
            "model": self.model_id,
            "enabled_tools": sorted(self.enabled_tools),
            "budget": asdict(self.budget),
            "static_investigation_ran": True,
            "current_phase": "context_building",
            "phases": [],
            "failed_phase": None,
            "questions": [],
            "tool_calls": [],
            "llm_retries": 0,
            "repair_attempts": [],
            "question_planning_source": None,
            "question_planning_error": None,
            "final_synthesis_error": None,
            "termination_reason": "disabled",
            "errors": [],
        }

    @staticmethod
    def _set_phase(trace: dict[str, Any], phase: str) -> None:
        trace["current_phase"] = phase
        if not trace["phases"] or trace["phases"][-1] != phase:
            trace["phases"].append(phase)

    def _build_context(self) -> tuple[dict[str, Any], list[dict[str, Any]]]:
        findings = self.tools.get_findings(limit=200)
        calls = [self._trace_for_result("get_findings", {"limit": 200}, findings)]
        if not findings.get("success"):
            raise RuntimeError(f"Static findings unavailable: {findings.get('error')}")

        items = findings.get("findings", [])
        severity_distribution = Counter(str(item.get("severity") or "unknown") for item in items)
        prioritized = sorted(
            items,
            key=lambda item: (
                {"critical": 0, "high": 1, "medium": 2, "low": 3}.get(
                    str(item.get("severity") or "").lower(), 4
                ),
                str(item.get("finding_id") or ""),
            ),
        )
        top = [self._compact_finding(item) for item in prioritized[:15]]
        self._deterministic_findings = [self._compact_finding(item) for item in prioritized]
        return (
            {
                "case_id": self.case_dir.name,
                "profile": self.profile,
                "total_canonical_findings": len(items),
                "severity_distribution": dict(severity_distribution),
                "top_findings": top,
                "categories": sorted(
                    {str(item.get("category")) for item in items if item.get("category")}
                ),
                "available_tools": sorted(self.enabled_tools),
                "budget": asdict(self.budget),
            },
            calls,
        )

    def _planning_prompt(self, context: dict[str, Any]) -> str:
        return (
            self._rules()
            + "\nPlan at most "
            + str(self.budget.max_questions)
            + " focused static investigation questions. Return strict JSON only with schema: "
            '{"questions":[{"question_id":"Q1","title":str,"rationale":str,'
            '"target_category":str,"related_finding_ids":[str],'
            '"needed_evidence_ids":["EVID-..."],"tool_plan":['
            '{"tool":"get_evidence","evidence_ids":["EVID-..."]},'
            '{"tool":"open_source_context","from_evidence_id":"EVID-..."},'
            '{"tool":"search_code","query":"Runtime.getRuntime().exec"},'
            '{"tool":"get_manifest_facts","component":"ComponentName"}]}]}. '
            "search_code queries must be exact symbols, literals, or short patterns, never natural "
            "language instructions. Request only relevant evidence IDs.\nCONTEXT:\n"
            + json.dumps(context, ensure_ascii=False)
        )

    def _final_prompt(
        self,
        context: dict[str, Any],
        questions: list[dict[str, Any]],
        observations: list[dict[str, Any]],
    ) -> str:
        schema = {
            "hypotheses": [
                {
                    "title": "str",
                    "rationale": "str",
                    "related_evidence_ids": ["EVID-..."],
                    "suggested_next_steps": ["str"],
                    "confidence": "low|medium|high",
                    "status": "open|inconclusive",
                }
            ],
            "candidate_findings": [
                {
                    "title": "str",
                    "description": "str",
                    "severity": "low|medium|high|critical",
                    "confidence": "low|medium|high",
                    "category": "str",
                    "affected_components": ["str"],
                    "evidence_ids": ["EVID-..."],
                    "impact": "str",
                    "remediation": "str",
                    "why_not_already_detected": "str",
                    "related_deterministic_findings": ["str"],
                }
            ],
        }
        synthesis_questions = [
            {
                key: (
                    [
                        {
                            plan_key: plan_value
                            for plan_key, plan_value in request.items()
                            if plan_key != "original_query"
                        }
                        for request in value
                    ]
                    if key == "normalized_tool_plan" and isinstance(value, list)
                    else value
                )
                for key, value in question.items()
                if key
                not in {
                    "original_planned_searches",
                    "skipped_natural_language_searches",
                    "_legacy_plan",
                }
            }
            for question in questions
        ]
        deterministic_ids = [
            str(item.get("finding_id"))
            for item in self._deterministic_findings
            if item.get("finding_id")
        ]
        return (
            self._rules()
            + f"\nReturn at most {self.budget.max_candidates} candidates. Return strict JSON only "
            "matching this schema:\n"
            + json.dumps(schema, ensure_ascii=False)
            + "\nCOMPACT BASELINE:\n"
            + json.dumps(context, ensure_ascii=False)
            + "\nDETERMINISTIC FINDING IDS FOR DEDUPLICATION:\n"
            + json.dumps(deterministic_ids, ensure_ascii=False)
            + "\nINVESTIGATION QUESTIONS:\n"
            + json.dumps(synthesis_questions, ensure_ascii=False)
            + "\nTOOL OBSERVATIONS:\n"
            + json.dumps(observations, ensure_ascii=False)
        )

    @staticmethod
    def _rules() -> str:
        return (
            "You are a bounded Android static investigation agent. Do not invent files, classes, "
            "methods, line numbers, or evidence. Use only the supplied context and tool "
            "observations. "
            "Do not repeat deterministic findings as new candidates. If evidence is insufficient, "
            "return a hypothesis, not a finding. Every candidate must cite concrete EVID-* IDs. "
            "Prefer fewer high-quality candidates. Never request shell, network, device, or "
            "arbitrary file access."
        )

    def _call_model(self, prompt: str, *, phase: str) -> dict[str, Any]:
        try:
            if self.model_client is not None:
                raw = self.model_client.complete_json(prompt)
            else:
                self._ensure_model()
                response = self._agno_agent.run(prompt)
                status = getattr(response, "status", None)
                status_value = getattr(status, "value", status)
                if str(status_value).upper() == "ERROR":
                    raise LLMProviderError("LLM provider request failed with status ERROR.")
                usage = getattr(response, "usage", None)
                if usage:
                    self._usage.append(self._usage_dict(usage))
                raw = getattr(response, "content", response)
        except LLMProviderError:
            raise
        except Exception as exc:
            if isinstance(exc, RuntimeError) and "api key" in str(exc).lower():
                raise LLMProviderError(str(exc)) from exc
            if isinstance(exc, RuntimeError) and "not configured" in str(exc).lower():
                raise
            raise LLMProviderError(f"LLM provider request failed: {exc}") from exc
        self._write_raw_response(phase, raw)
        value = self._parse_json(raw)
        if not isinstance(value, dict):
            raise LLMJSONParseError("invalid_json")
        return value

    def _repair_question_planning(
        self,
        context: dict[str, Any],
        error: LLMJSONParseError,
        trace: dict[str, Any],
    ) -> list[dict[str, Any]]:
        trace["llm_retries"] += 1
        attempt = {"phase": "question_planning", "reason": error.reason, "success": False}
        trace["repair_attempts"].append(attempt)
        prompt = (
            "Return strict JSON only. Repair the prior question-planning response to match the "
            "requested schema. Do not add Markdown or prose. Compact context:\n"
            + json.dumps(context, ensure_ascii=False)
            + "\nMalformed response:\n"
            + self._last_raw_response.get("question_planning", "")[:12_000]
        )
        try:
            repaired = self._call_model(prompt, phase="question_planning")
            questions = self._normalize_questions(repaired.get("questions"))
            attempt["success"] = bool(questions)
            if questions:
                trace["question_planning_source"] = "llm"
            return questions
        except LLMProviderError:
            raise
        except (LLMJSONParseError, RuntimeError, TypeError) as exc:
            trace["errors"].append(f"question_planning repair: {exc}")
            return []

    def _repair_final_synthesis(
        self,
        original_prompt: str,
        error: LLMJSONParseError,
        trace: dict[str, Any],
    ) -> dict[str, Any]:
        trace["llm_retries"] += 1
        attempt = {"phase": "final_synthesis", "reason": error.reason, "success": False}
        trace["repair_attempts"].append(attempt)
        prompt = (
            "Return strict JSON only. Repair the prior final-synthesis response to match the "
            "hypotheses and candidate_findings schema. Do not add Markdown or prose.\n"
            + original_prompt[-12_000:]
            + "\nMalformed response:\n"
            + self._last_raw_response.get("final_synthesis", "")[:12_000]
        )
        try:
            repaired = self._call_model(prompt, phase="final_synthesis")
            attempt["success"] = True
            return repaired
        except LLMJSONParseError as exc:
            trace["errors"].append(f"final_synthesis repair: {exc}")
            raise

    def _write_raw_response(self, phase: str, raw: Any) -> None:
        analysis_dir = self.case_dir / "analysis"
        analysis_dir.mkdir(parents=True, exist_ok=True)
        attempt = self._raw_response_attempts.get(phase, 0)
        self._raw_response_attempts[phase] = attempt + 1
        sanitized = self._sanitized_raw_response(raw)
        self._last_raw_response[phase] = sanitized
        suffix = "" if attempt == 0 else "_repair"
        path = analysis_dir / f"static_investigation_{phase}{suffix}_raw.txt"
        path.write_text(sanitized, encoding="utf-8")

    @staticmethod
    def _sanitized_raw_response(raw: Any) -> str:
        if raw is None or (isinstance(raw, str) and not raw.strip()):
            return "[empty response]"
        text = json.dumps(raw, ensure_ascii=False) if isinstance(raw, (dict, list)) else str(raw)
        text = re.sub(r"(?i)\bBearer\s+[A-Za-z0-9._~+/=-]+", "Bearer [redacted]", text)
        text = re.sub(r"\bsk-[A-Za-z0-9_-]{12,}\b", "[redacted-api-key]", text)
        text = re.sub(
            r"(?i)(api[_ -]?key|authorization|auth[_ -]?token)(\s*[:=]\s*)[^\s,}\]]+",
            r"\1\2[redacted]",
            text,
        )
        return text[:100_000]

    def _ensure_model(self) -> None:
        if self.model_client is not None or self._agno_agent is not None:
            return
        from agno.agent import Agent

        metadata = get_llm_metadata(model_id=self.model_id, provider=self.provider)
        self._agno_agent = Agent(
            model=build_llm_model(model_id=self.model_id, provider=self.provider),
            description="Bounded Android static investigation agent.",
            instructions=[self._rules(), "Return strict JSON only without Markdown fences."],
            markdown=False,
        )
        self.provider = metadata["provider"]
        self.model_id = metadata["model"]

    @staticmethod
    def _parse_json(raw: Any) -> Any:
        if isinstance(raw, (dict, list)):
            return raw
        text = str(raw or "").strip()
        if not text:
            raise LLMJSONParseError("empty_response")
        try:
            return json.loads(text)
        except json.JSONDecodeError:
            pass
        for fenced in re.findall(r"```(?:json)?\s*([\s\S]*?)```", text, re.IGNORECASE):
            try:
                return json.loads(fenced.strip())
            except json.JSONDecodeError:
                continue
        extracted = StaticInvestigationAgent._first_balanced_json(text)
        if extracted is not None:
            try:
                return json.loads(extracted)
            except json.JSONDecodeError:
                pass
        raise LLMJSONParseError("invalid_json")

    @staticmethod
    def _first_balanced_json(text: str) -> str | None:
        for start, char in enumerate(text):
            if char not in "{[":
                continue
            stack = [char]
            in_string = False
            escaped = False
            for index in range(start + 1, len(text)):
                current = text[index]
                if in_string:
                    if escaped:
                        escaped = False
                    elif current == "\\":
                        escaped = True
                    elif current == '"':
                        in_string = False
                    continue
                if current == '"':
                    in_string = True
                elif current in "{[":
                    stack.append(current)
                elif current in "}]":
                    if not stack or (stack[-1], current) not in {("{", "}"), ("[", "]")}:
                        break
                    stack.pop()
                    if not stack:
                        candidate = text[start : index + 1]
                        try:
                            json.loads(candidate)
                        except json.JSONDecodeError:
                            break
                        return candidate
        return None

    def _normalize_questions(self, raw: Any) -> list[dict[str, Any]]:
        if not isinstance(raw, list):
            return []
        questions: list[dict[str, Any]] = []
        for item in raw[: self.budget.max_questions]:
            if not isinstance(item, dict):
                continue
            title = str(item.get("title") or item.get("question") or "").strip()[:300]
            if not title:
                continue
            searches = item.get("planned_searches")
            evidence_ids = item.get("needed_evidence_ids")
            legacy_calls = (
                item.get("tool_calls") if isinstance(item.get("tool_calls"), list) else []
            )
            if not isinstance(searches, list):
                searches = [
                    call.get("arguments", {}).get("query")
                    for call in legacy_calls
                    if isinstance(call, dict)
                    and call.get("tool") == "search_code"
                    and isinstance(call.get("arguments"), dict)
                ]
            original_searches = (
                [str(value)[:500] for value in searches[:10] if str(value).strip()]
                if isinstance(searches, list)
                else []
            )
            question_text = " ".join(
                (
                    title,
                    str(item.get("rationale") or ""),
                    str(item.get("target_category") or ""),
                    " ".join(original_searches),
                )
            )
            raw_plan = item.get("tool_plan")
            normalized_plan, skipped = self._normalize_tool_plan(
                raw_plan if isinstance(raw_plan, list) else [],
                question_text=question_text,
            )
            if not normalized_plan or original_searches:
                fallback_plan, fallback_skipped = self._fallback_tool_plan(
                    question_text=question_text,
                    evidence_ids=evidence_ids if isinstance(evidence_ids, list) else [],
                    original_searches=original_searches,
                )
                normalized_plan = self._dedupe_tool_plan(normalized_plan + fallback_plan)
                skipped.extend(fallback_skipped)
            questions.append(
                {
                    "question_id": str(item.get("question_id") or f"Q{len(questions) + 1}")[:30],
                    "title": title,
                    "rationale": str(item.get("rationale") or "")[:1000],
                    "target_category": str(item.get("target_category") or "")[:100],
                    "related_finding_ids": [
                        str(value)[:200] for value in item.get("related_finding_ids", [])[:20]
                    ],
                    "original_planned_searches": original_searches,
                    "needed_evidence_ids": list(
                        dict.fromkeys(
                            str(value)
                            for value in evidence_ids[:20]
                            if str(value).startswith("EVID-")
                        )
                    )
                    if isinstance(evidence_ids, list)
                    else [],
                    "normalized_tool_plan": normalized_plan,
                    "skipped_natural_language_searches": skipped,
                    "concrete_search_queries_executed": [],
                    "context_openings_from_evidence": 0,
                    "context_openings_from_search_results": 0,
                    "_legacy_plan": bool(legacy_calls),
                }
            )
        return questions

    def _fallback_questions(self, findings: list[dict[str, Any]]) -> list[dict[str, Any]]:
        text = " ".join(
            str(value)
            for finding in findings
            for value in (finding.get("title"), finding.get("description"), finding.get("category"))
        ).casefold()
        rules = (
            (
                ("contentprovider", "provider", "exported"),
                "Provider exposure",
                "components",
                ["ContentProvider", "query("],
                True,
            ),
            (
                ("rawquery", "execsql", "sql"),
                "SQL injection and data access",
                "injection",
                ["rawQuery", "execSQL"],
                False,
            ),
            (
                ("webview", "loadurl", "javascript"),
                "WebView input handling",
                "webview",
                ["loadUrl", "setJavaScriptEnabled"],
                False,
            ),
            (
                ("runtime.exec", "processbuilder", "command execution"),
                "Command execution",
                "command_execution",
                ["Runtime.exec", "ProcessBuilder"],
                False,
            ),
            (
                ("storage", "sharedpreferences", "external storage"),
                "Insecure storage",
                "storage",
                ["SharedPreferences", "getExternalStorage"],
                False,
            ),
        )
        questions: list[dict[str, Any]] = []
        for needles, title, category, searches, _manifest in rules:
            if not any(needle in text for needle in needles):
                continue
            related = [
                f for f in findings if any(needle in json.dumps(f).casefold() for needle in needles)
            ]
            questions.append(
                {
                    "question_id": f"Q{len(questions) + 1}",
                    "title": title,
                    "rationale": (
                        "Deterministic findings indicate this area needs bounded contextual "
                        "investigation."
                    ),
                    "target_category": category,
                    "related_finding_ids": [
                        str(f.get("finding_id")) for f in related if f.get("finding_id")
                    ][:10],
                    "original_planned_searches": [],
                    "needed_evidence_ids": list(
                        dict.fromkeys(
                            evidence_id
                            for f in related
                            for evidence_id in f.get("evidence_ids", [])
                        )
                    )[:20],
                    "normalized_tool_plan": self._preset_tool_plan(
                        " ".join((*needles, title)),
                        list(
                            dict.fromkeys(
                                evidence_id
                                for f in related
                                for evidence_id in f.get("evidence_ids", [])
                            )
                        )[:20],
                    ),
                    "skipped_natural_language_searches": [],
                    "concrete_search_queries_executed": [],
                    "context_openings_from_evidence": 0,
                    "context_openings_from_search_results": 0,
                }
            )
            if len(questions) >= self.budget.max_questions:
                break
        if not questions and findings:
            finding = findings[0]
            questions.append(
                {
                    "question_id": "Q1",
                    "title": f"Contextual review of {finding.get('title') or 'top finding'}",
                    "rationale": "Review the highest-priority deterministic finding in context.",
                    "target_category": str(finding.get("category") or "general"),
                    "related_finding_ids": [str(finding.get("finding_id"))]
                    if finding.get("finding_id")
                    else [],
                    "original_planned_searches": [],
                    "needed_evidence_ids": [
                        str(value) for value in finding.get("evidence_ids", [])[:20]
                    ],
                    "normalized_tool_plan": self._preset_tool_plan(
                        json.dumps(finding), finding.get("evidence_ids", [])[:20]
                    ),
                    "skipped_natural_language_searches": [],
                    "concrete_search_queries_executed": [],
                    "context_openings_from_evidence": 0,
                    "context_openings_from_search_results": 0,
                }
            )
        return questions

    def _requests_for_question(self, question: dict[str, Any]) -> list[dict[str, Any]]:
        return [
            request
            for request in question.get("normalized_tool_plan", [])
            if request.get("tool") in self.enabled_tools
        ]

    def _normalize_tool_plan(
        self, raw_plan: list[Any], *, question_text: str
    ) -> tuple[list[dict[str, Any]], list[dict[str, str]]]:
        plan: list[dict[str, Any]] = []
        skipped: list[dict[str, str]] = []
        for item in raw_plan[:20]:
            if not isinstance(item, dict) or item.get("tool") not in ALLOWED_TOOLS:
                continue
            tool = str(item["tool"])
            if tool == "search_code":
                original = str(item.get("query") or "").strip()
                queries = self._concrete_search_queries(original)
                if not queries:
                    skipped.append(
                        {
                            "original_query": original[:500],
                            "skipped_search_reason": "query_not_concrete",
                        }
                    )
                for query in queries:
                    plan.append(
                        {
                            "tool": "search_code",
                            "arguments": {
                                "query": query,
                                "top_k": self.budget.max_search_results,
                            },
                            "original_query": original,
                        }
                    )
            elif tool == "get_evidence":
                evidence_ids = [
                    str(value)
                    for value in item.get("evidence_ids", [])[:20]
                    if str(value).startswith("EVID-")
                ]
                if evidence_ids:
                    plan.append(
                        {
                            "tool": tool,
                            "arguments": {
                                "evidence_ids": evidence_ids,
                                "limit": len(evidence_ids),
                            },
                        }
                    )
            elif tool == "open_source_context" and item.get("from_evidence_id"):
                plan.append(
                    {
                        "tool": tool,
                        "from_evidence_id": str(item["from_evidence_id"])[:200],
                    }
                )
            elif tool == "get_manifest_facts":
                plan.append(
                    {
                        "tool": tool,
                        "arguments": self._only(item, {"component", "fact_type", "limit"}),
                    }
                )
            elif tool == "get_findings":
                plan.append(
                    {
                        "tool": tool,
                        "arguments": self._only(item, {"source", "severity", "category", "limit"}),
                    }
                )
        if self._is_manifest_question(question_text) and not any(
            request["tool"] == "get_manifest_facts" for request in plan
        ):
            plan.append({"tool": "get_manifest_facts", "arguments": {"limit": 20}})
        return self._dedupe_tool_plan(plan), skipped

    def _fallback_tool_plan(
        self,
        *,
        question_text: str,
        evidence_ids: list[Any],
        original_searches: list[str],
    ) -> tuple[list[dict[str, Any]], list[dict[str, str]]]:
        plan = self._preset_tool_plan(question_text, evidence_ids)
        skipped: list[dict[str, str]] = []
        for original in original_searches:
            queries = self._concrete_search_queries(original)
            if not queries:
                skipped.append(
                    {"original_query": original, "skipped_search_reason": "query_not_concrete"}
                )
            for query in queries:
                plan.append(
                    {
                        "tool": "search_code",
                        "arguments": {"query": query, "top_k": self.budget.max_search_results},
                        "original_query": original,
                    }
                )
        return self._dedupe_tool_plan(plan), skipped

    def _preset_tool_plan(
        self, question_text: str, evidence_ids: list[Any]
    ) -> list[dict[str, Any]]:
        text = question_text.casefold()
        ids = [str(value) for value in evidence_ids[:20] if str(value).startswith("EVID-")]
        plan: list[dict[str, Any]] = []
        if ids:
            plan.append(
                {"tool": "get_evidence", "arguments": {"evidence_ids": ids, "limit": len(ids)}}
            )
        presets: list[str] = []
        if any(value in text for value in ("runtime.exec", "command execution", "processbuilder")):
            presets.extend(("Runtime.getRuntime().exec", ".exec(", "ProcessBuilder"))
        if any(value in text for value in ("rawquery", "execsql", "sql")):
            presets.extend(("rawQuery", "execSQL", "SQLiteDatabase"))
        if any(value in text for value in ("webview", "loadurl", "javascript")):
            presets.extend(("loadUrl", "addJavascriptInterface", "setJavaScriptEnabled"))
        if any(value in text for value in ("http", "cleartext", "networksecurityconfig")):
            presets.extend(("http://", "usesCleartextTraffic"))
        for query in dict.fromkeys(presets):
            plan.append(
                {
                    "tool": "search_code",
                    "arguments": {"query": query, "top_k": self.budget.max_search_results},
                }
            )
        if self._is_manifest_question(text) or any(
            value in text for value in ("http", "cleartext", "secure transport")
        ):
            component_match = re.search(
                r"\b([A-Za-z_$][\w.$]*(?:Activity|Service|Provider|Receiver))\b",
                question_text,
            )
            arguments: dict[str, Any] = {"limit": 20}
            if component_match:
                arguments["component"] = component_match.group(1)[:200]
            if any(value in text for value in ("cleartext", "networksecurityconfig")):
                arguments["fact_type"] = "network"
            plan.append({"tool": "get_manifest_facts", "arguments": arguments})
        return self._dedupe_tool_plan(plan)

    @staticmethod
    def _concrete_search_queries(original: str) -> list[str]:
        value = str(original or "").strip()
        if not value:
            return []
        found = [term for term in CONCRETE_SEARCH_TERMS if term.casefold() in value.casefold()]
        if found:
            return list(dict.fromkeys(found))
        words = re.findall(r"[A-Za-z0-9_.$:/()-]+", value)
        looks_instructional = len(words) > 4 or bool(
            re.match(r"(?i)^(review|verify|check|confirm|get|determine|inspect|find)\b", value)
        )
        if looks_instructional or len(value) > 80 or any(char in value for char in "\n;,"):
            return []
        if len(words) == 1 or any(token in value for token in ("(", ".", "://")):
            return [value[:80]]
        return []

    @staticmethod
    def _is_manifest_question(value: str) -> bool:
        text = str(value).casefold()
        return any(term in text for term in MANIFEST_TERMS)

    @staticmethod
    def _dedupe_tool_plan(plan: list[dict[str, Any]]) -> list[dict[str, Any]]:
        result: list[dict[str, Any]] = []
        seen: set[str] = set()
        for request in plan:
            key = json.dumps(
                {"tool": request.get("tool"), "arguments": request.get("arguments", {})},
                sort_keys=True,
                default=str,
            )
            if request.get("from_evidence_id"):
                key += str(request["from_evidence_id"])
            if key not in seen:
                seen.add(key)
                result.append(request)
        return result[:20]

    def _execute_question(
        self,
        question: dict[str, Any],
        trace: dict[str, Any],
        observations: list[dict[str, Any]],
    ) -> None:
        plan = self._requests_for_question(question)
        evidence_ids = list(question.get("needed_evidence_ids", []))
        for request in plan:
            if request.get("tool") == "get_evidence":
                evidence_ids.extend(request.get("arguments", {}).get("evidence_ids", []))
        evidence_ids = list(dict.fromkeys(str(value) for value in evidence_ids))[:20]
        evidence_by_id: dict[str, dict[str, Any]] = {}

        if evidence_ids and "get_evidence" in self.enabled_tools:
            output = self._run_question_tool(
                question,
                trace,
                observations,
                {
                    "tool": "get_evidence",
                    "arguments": {"evidence_ids": evidence_ids, "limit": len(evidence_ids)},
                },
            )
            if output:
                evidence_by_id = {
                    str(item.get("evidence_id")): item
                    for item in output.get("evidence", [])
                    if isinstance(item, dict) and item.get("evidence_id")
                }
                self._open_evidence_contexts(question, evidence_by_id.values(), trace, observations)

        for request in plan:
            if trace["termination_reason"] == "budget_exhausted":
                return
            tool = request.get("tool")
            if tool in {"get_evidence", "open_source_context"}:
                continue
            if tool == "search_code":
                original = str(
                    request.get("original_query") or request.get("arguments", {}).get("query") or ""
                )
                normalized = self._concrete_search_queries(
                    str(request.get("arguments", {}).get("query") or "")
                )
                if not normalized:
                    question["skipped_natural_language_searches"].append(
                        {
                            "original_query": original[:500],
                            "skipped_search_reason": "query_not_concrete",
                        }
                    )
                    continue
                for query in normalized:
                    safe_request = {
                        "tool": "search_code",
                        "arguments": {
                            **request.get("arguments", {}),
                            "query": query[:80],
                        },
                    }
                    output = self._run_question_tool(question, trace, observations, safe_request)
                    if output is None:
                        return
                    question["concrete_search_queries_executed"].append(query[:80])
                    search_trace = trace["tool_calls"][-1]
                    search_trace["query"] = query[:80]
                    if original != query:
                        search_trace["original_query"] = original[:500]
                    search_trace["matches_count"] = int(output.get("count") or 0)
                    opened = self._open_search_context(question, output, trace, observations)
                    search_trace["opened_context_count"] = opened
                    search_trace["skipped_context_reason"] = (
                        None
                        if opened
                        else "no_matches"
                        if not output.get("matches")
                        else "context_tool_disabled_or_budget_exhausted"
                    )
            else:
                self._run_question_tool(question, trace, observations, request)

    def _run_question_tool(
        self,
        question: dict[str, Any],
        trace: dict[str, Any],
        observations: list[dict[str, Any]],
        request: dict[str, Any],
    ) -> dict[str, Any] | None:
        if len(trace["tool_calls"]) >= self.budget.max_tool_calls:
            trace["termination_reason"] = "budget_exhausted"
            return None
        call_trace, output = self._execute_tool_request(request)
        trace["tool_calls"].append(call_trace)
        observations.append(
            {
                "question_id": question["question_id"],
                "tool": call_trace["tool"],
                "result": self._bounded_output(output),
            }
        )
        if not call_trace["success"]:
            trace["errors"].append(f"{call_trace['tool']}: {output.get('error') or 'tool failed'}")
        return output

    def _open_evidence_contexts(
        self,
        question: dict[str, Any],
        evidence: Any,
        trace: dict[str, Any],
        observations: list[dict[str, Any]],
    ) -> None:
        if "open_source_context" not in self.enabled_tools:
            return
        opened: set[tuple[str, int]] = set()
        for item in evidence:
            path = str(item.get("artifact_path") or "")
            selector = str(item.get("selector") or "")
            match = re.search(r"(?:^|\b)line:(\d+)", selector)
            if not path or not match or "jadx/sources/" not in path.replace("\\", "/"):
                continue
            target = (path, int(match.group(1)))
            if target in opened:
                continue
            opened.add(target)
            output = self._run_question_tool(
                question,
                trace,
                observations,
                {
                    "tool": "open_source_context",
                    "arguments": {
                        "artifact_path": path,
                        "line": target[1],
                        "max_lines": self.budget.max_context_lines,
                    },
                },
            )
            if output is None:
                return
            trace["tool_calls"][-1]["context_source"] = "evidence"
            question["context_openings_from_evidence"] += int(bool(output.get("success")))

    def _open_search_context(
        self,
        question: dict[str, Any],
        search_output: dict[str, Any],
        trace: dict[str, Any],
        observations: list[dict[str, Any]],
    ) -> int:
        if "open_source_context" not in self.enabled_tools:
            return 0
        matches = search_output.get("matches", [])
        if not isinstance(matches, list) or not matches:
            return 0
        match = matches[0]
        if not isinstance(match, dict) or not match.get("path") or not match.get("line"):
            return 0
        output = self._run_question_tool(
            question,
            trace,
            observations,
            {
                "tool": "open_source_context",
                "arguments": {
                    "artifact_path": match["path"],
                    "line": match["line"],
                    "max_lines": self.budget.max_context_lines,
                },
            },
        )
        if output is None:
            return 0
        trace["tool_calls"][-1]["context_source"] = "search_result"
        opened = int(bool(output.get("success")))
        question["context_openings_from_search_results"] += opened
        return opened

    def _execute_tool_request(
        self, request: dict[str, Any]
    ) -> tuple[dict[str, Any], dict[str, Any]]:
        tool = request["tool"]
        arguments = dict(request.get("arguments") or {})
        if tool not in self.enabled_tools:
            output = {"success": False, "error": f"Tool is disabled: {tool}"}
            return self._trace_for_result(tool, self._safe_input(arguments), output), output
        try:
            if tool == "get_findings":
                allowed = self._only(arguments, {"source", "severity", "category", "limit"})
                allowed["limit"] = min(self._positive_int(allowed.get("limit"), 50), 50)
                output = self.tools.get_findings(**allowed)
            elif tool == "get_evidence":
                allowed = self._only(arguments, {"evidence_ids", "limit"})
                allowed["limit"] = min(self._positive_int(allowed.get("limit"), 20), 50)
                output = self.tools.get_evidence(**allowed)
            elif tool == "search_code":
                allowed = self._only(arguments, {"query", "top_k", "file_extensions"})
                allowed["top_k"] = min(
                    self._positive_int(allowed.get("top_k"), self.budget.max_search_results),
                    self.budget.max_search_results,
                )
                output = self.tools.search_code(**allowed)
            elif tool == "open_source_context":
                allowed = self._only(
                    arguments, {"artifact_path", "line", "context_lines", "max_lines"}
                )
                allowed["max_lines"] = min(
                    self._positive_int(allowed.get("max_lines"), self.budget.max_context_lines),
                    self.budget.max_context_lines,
                )
                output = self.tools.open_source_context(**allowed)
            else:
                allowed = self._only(arguments, {"component", "fact_type", "limit"})
                allowed["limit"] = min(self._positive_int(allowed.get("limit"), 50), 50)
                output = self.tools.get_manifest_facts(**allowed)
        except (TypeError, ValueError) as exc:
            output = {"success": False, "error": f"Invalid tool arguments: {exc}"}
        return self._trace_for_result(tool, self._safe_input(arguments), output), output

    def _trace_for_result(
        self, tool: str, arguments: dict[str, Any], result: dict[str, Any]
    ) -> dict[str, Any]:
        evidence_ids = self._evidence_ids_in(result)
        count = result.get("count")
        summary = f"success={bool(result.get('success'))}"
        if isinstance(count, int):
            summary += f", count={count}"
        if result.get("truncated"):
            summary += ", truncated=true"
        if result.get("error"):
            summary += f", error={str(result['error'])[:300]}"
        return {
            "tool": tool,
            "input_summary": self._safe_input(arguments),
            "success": bool(result.get("success")),
            "result_summary": summary,
            "evidence_ids": evidence_ids[:50],
        }

    def _validate_outputs(
        self,
        raw: dict[str, Any],
        *,
        valid_evidence_ids: set[str],
        deterministic_findings: list[dict[str, Any]],
    ) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
        hypotheses: list[dict[str, Any]] = []
        candidates: list[dict[str, Any]] = []
        deterministic_titles = {
            self._normalized_text(item.get("title")): str(item.get("finding_id") or "")
            for item in deterministic_findings
            if item.get("title")
        }

        for item in raw.get("hypotheses", []) if isinstance(raw.get("hypotheses"), list) else []:
            if isinstance(item, dict):
                hypotheses.append(self._hypothesis(item, valid_evidence_ids))

        candidate_value = raw.get("candidate_findings", raw.get("candidates"))
        raw_candidates = candidate_value if isinstance(candidate_value, list) else []
        for item in raw_candidates[: self.budget.max_candidates]:
            if not isinstance(item, dict):
                continue
            evidence_ids = [
                str(value)
                for value in item.get("evidence_ids", [])
                if str(value) in valid_evidence_ids
            ]
            duplicate_id = deterministic_titles.get(self._normalized_text(item.get("title")))
            if not evidence_ids or duplicate_id:
                downgraded = {
                    "title": item.get("title") or "Unresolved candidate",
                    "rationale": item.get("description")
                    or (
                        "Duplicates an existing deterministic finding."
                        if duplicate_id
                        else "Evidence was insufficient."
                    ),
                    "related_evidence_ids": evidence_ids,
                    "suggested_next_steps": ["Review against the deterministic baseline."],
                    "confidence": item.get("confidence") or "low",
                    "status": "inconclusive" if not evidence_ids else "open",
                }
                hypotheses.append(self._hypothesis(downgraded, valid_evidence_ids))
                continue
            candidates.append(self._candidate(item, evidence_ids))

        hypotheses = self._dedupe_by_id(hypotheses)[: self.budget.max_candidates]
        candidates = self._dedupe_by_id(candidates)[: self.budget.max_candidates]
        return hypotheses, candidates

    def _hypothesis(self, item: dict[str, Any], valid_evidence_ids: set[str]) -> dict[str, Any]:
        evidence_ids = [
            str(value)
            for value in item.get("related_evidence_ids", [])
            if str(value) in valid_evidence_ids
        ]
        payload = {
            "title": str(item.get("title") or "Untitled hypothesis")[:300],
            "rationale": str(item.get("rationale") or "")[:4000],
            "related_evidence_ids": list(dict.fromkeys(evidence_ids))[:20],
            "suggested_next_steps": [
                str(value)[:500] for value in item.get("suggested_next_steps", [])[:10]
            ],
            "confidence": item.get("confidence")
            if item.get("confidence") in CONFIDENCES
            else "low",
            "status": item.get("status")
            if item.get("status") in {"open", "inconclusive"}
            else "open",
        }
        payload["hypothesis_id"] = self._stable_id("LLM-HYP", payload)
        return {"hypothesis_id": payload.pop("hypothesis_id"), **payload}

    def _candidate(self, item: dict[str, Any], evidence_ids: list[str]) -> dict[str, Any]:
        metadata = {
            "source": "llm_static_investigation",
            "why_not_already_detected": str(item.get("why_not_already_detected") or "")[:2000],
            "related_deterministic_findings": [
                str(value)[:200] for value in item.get("related_deterministic_findings", [])[:20]
            ],
            "tool_trace_refs": [
                value for value in item.get("tool_trace_refs", [])[:20] if isinstance(value, int)
            ],
        }
        payload = {
            "title": str(item.get("title") or "Untitled candidate")[:300],
            "description": str(item.get("description") or "")[:4000],
            "severity": item.get("severity") if item.get("severity") in SEVERITIES else "medium",
            "confidence": item.get("confidence")
            if item.get("confidence") in CONFIDENCES
            else "medium",
            "status": "static_candidate",
            "category": str(item.get("category") or "uncategorized")[:200],
            "affected_components": [
                str(value)[:500] for value in item.get("affected_components", [])[:20]
            ],
            "evidence_ids": list(dict.fromkeys(evidence_ids))[:20],
            "impact": str(item.get("impact") or "")[:3000],
            "remediation": str(item.get("remediation") or "")[:3000],
            "references": [],
            "metadata": metadata,
        }
        payload["finding_id"] = self._stable_id("LLM-FIND", payload)
        return {"finding_id": payload.pop("finding_id"), **payload}

    def _available_evidence_ids(self) -> set[str]:
        result = self.tools.get_evidence(limit=200)
        return {
            str(item.get("evidence_id"))
            for item in result.get("evidence", [])
            if item.get("evidence_id")
        }

    @staticmethod
    def _compact_finding(item: dict[str, Any]) -> dict[str, Any]:
        return {
            "finding_id": item.get("finding_id"),
            "title": str(item.get("title") or "")[:300],
            "description": str(item.get("description") or "")[:500],
            "severity": item.get("severity"),
            "category": item.get("category"),
            "source": item.get("source"),
            "evidence_ids": [str(value) for value in item.get("evidence_ids", [])[:20]],
        }

    def _write_outputs(
        self,
        trace: dict[str, Any],
        hypotheses: list[dict[str, Any]],
        candidates: list[dict[str, Any]],
    ) -> dict[str, Path]:
        analysis_dir = self.case_dir / "analysis"
        findings_dir = self.case_dir / "findings"
        analysis_dir.mkdir(parents=True, exist_ok=True)
        findings_dir.mkdir(parents=True, exist_ok=True)
        paths = {
            "trace": analysis_dir / "static_investigation_trace.json",
            "hypotheses": analysis_dir / "llm_hypotheses.json",
            "candidates": findings_dir / "llm_candidate_findings.json",
        }
        for key, value in (
            ("trace", trace),
            ("hypotheses", hypotheses),
            ("candidates", candidates),
        ):
            paths[key].write_text(
                json.dumps(value, indent=2, ensure_ascii=False) + "\n", encoding="utf-8"
            )
        return paths

    def _bounded_output(self, output: dict[str, Any]) -> Any:
        text = json.dumps(output, ensure_ascii=False, default=str)
        if len(text) <= self.budget.max_output_chars_per_tool:
            return output
        return {
            "success": output.get("success", False),
            "truncated": True,
            "summary": text[: self.budget.max_output_chars_per_tool],
        }

    @staticmethod
    def _only(values: dict[str, Any], allowed: set[str]) -> dict[str, Any]:
        return {key: value for key, value in values.items() if key in allowed}

    @staticmethod
    def _positive_int(value: Any, default: int) -> int:
        return (
            value
            if isinstance(value, int) and not isinstance(value, bool) and value > 0
            else default
        )

    @staticmethod
    def _safe_input(arguments: dict[str, Any]) -> dict[str, Any]:
        return {
            str(key)[:100]: (
                [str(item)[:200] for item in value[:20]]
                if isinstance(value, list)
                else value[:500]
                if isinstance(value, str)
                else value
                if isinstance(value, (int, float, bool, type(None)))
                else str(value)[:500]
            )
            for key, value in list(arguments.items())[:20]
        }

    @staticmethod
    def _evidence_ids_in(value: Any) -> list[str]:
        found: list[str] = []
        if isinstance(value, dict):
            for key, item in value.items():
                if key in {"evidence_id", "evidence_ids", "related_evidence_ids"}:
                    values = item if isinstance(item, list) else [item]
                    found.extend(
                        str(candidate) for candidate in values if str(candidate).startswith("EVID-")
                    )
                else:
                    found.extend(StaticInvestigationAgent._evidence_ids_in(item))
        elif isinstance(value, list):
            for item in value:
                found.extend(StaticInvestigationAgent._evidence_ids_in(item))
        return list(dict.fromkeys(found))

    def _stable_id(self, prefix: str, payload: dict[str, Any]) -> str:
        digest = (
            hashlib.sha256(
                json.dumps(
                    {"case_id": self.case_dir.name, "payload": payload},
                    sort_keys=True,
                    ensure_ascii=False,
                ).encode("utf-8")
            )
            .hexdigest()[:12]
            .upper()
        )
        return f"{prefix}-{digest}"

    @staticmethod
    def _plan_arguments(value: Any) -> dict[str, Any]:
        if not isinstance(value, dict):
            return {}
        result: dict[str, Any] = {}
        for key, item in list(value.items())[:20]:
            if isinstance(item, str):
                result[str(key)[:100]] = item[:2_000]
            elif isinstance(item, (int, float, bool)) or item is None:
                result[str(key)[:100]] = item
            elif isinstance(item, list):
                result[str(key)[:100]] = [str(entry)[:500] for entry in item[:50]]
        return result

    @staticmethod
    def _normalized_text(value: Any) -> str:
        return re.sub(r"\s+", " ", str(value or "").strip()).casefold()

    @staticmethod
    def _dedupe_by_id(items: list[dict[str, Any]]) -> list[dict[str, Any]]:
        result: list[dict[str, Any]] = []
        seen: set[str] = set()
        for item in items:
            identifier = str(item.get("finding_id") or item.get("hypothesis_id") or "")
            if identifier and identifier not in seen:
                seen.add(identifier)
                result.append(item)
        return result

    @staticmethod
    def _usage_dict(usage: Any) -> dict[str, Any]:
        if isinstance(usage, dict):
            return usage
        return {
            "prompt_tokens": getattr(usage, "prompt_tokens", None),
            "completion_tokens": getattr(usage, "completion_tokens", None),
            "total_tokens": getattr(usage, "total_tokens", None),
        }

    def _combined_usage(self) -> dict[str, int] | None:
        if not self._usage:
            return None
        return {
            key: sum(int(item.get(key) or 0) for item in self._usage)
            for key in ("prompt_tokens", "completion_tokens", "total_tokens")
        }
