import ast
import json
import os
import re
from pathlib import Path
from typing import Any

from dotenv import load_dotenv
from agno.agent import Agent
from agno.models.openrouter import OpenRouter

from prompts import (
    DISCOVERY_PROMPT,
    TRIAGE_PROMPT,
    INVESTIGATION_PROMPT_TEMPLATE,
    FINAL_REPORT_PROMPT,
)

from tools import (
    run_jadx,
    run_apktool,
    build_initial_evidence,
    search_code,
    read_source_file,
    read_multiple_files,
)

load_dotenv()

BASE_DIR = Path(__file__).resolve().parent.parent
OUTPUT_DIR = BASE_DIR / "output"
INVESTIGATIONS_DIR = OUTPUT_DIR / "investigations"
SAMPLES_DIR = BASE_DIR / "samples"

apk_files = sorted(SAMPLES_DIR.glob("*.apk"))
if not apk_files:
    raise FileNotFoundError(f"No se encontró ningún APK en: {SAMPLES_DIR}")

APK_PATH = apk_files[0]

MODEL_ID = os.getenv("OPENROUTER_MODEL", "google/gemini-flash-1.5")
API_KEY = os.getenv("OPENROUTER_API_KEY")

if not API_KEY:
    raise RuntimeError("OPENROUTER_API_KEY no definida en .env")


# -----------------------------------------------------------------------------
# Helpers
# -----------------------------------------------------------------------------

def ensure_dirs():
    OUTPUT_DIR.mkdir(exist_ok=True)
    INVESTIGATIONS_DIR.mkdir(exist_ok=True)


def strip_code_fences(text: str) -> str:
    text = str(text).strip()

    if text.startswith("```"):
        text = re.sub(r"^```[a-zA-Z0-9_-]*\n?", "", text)
        text = re.sub(r"\n?```$", "", text)

    return text.strip()


def agent_content(response: Any) -> str:
    if hasattr(response, "content") and response.content is not None:
        content = response.content
        if isinstance(content, str):
            return content
        return str(content)

    return str(response)


# -----------------------------------------------------------------------------
# Parsing utilities
# -----------------------------------------------------------------------------

def extract_structured_candidate(text: str) -> Any:
    text = strip_code_fences(text)

    # intento JSON directo
    try:
        return json.loads(text)
    except Exception:
        pass

    # buscar bloque JSON
    match = re.search(r"(\{.*\}|\[.*\])", text, re.DOTALL)

    if match:
        candidate = match.group(1)

        try:
            return json.loads(candidate)
        except Exception:
            pass

        fixed = (
            candidate
            .replace("None", "null")
            .replace("True", "true")
            .replace("False", "false")
        )

        try:
            return json.loads(fixed)
        except Exception:
            pass

        try:
            return ast.literal_eval(candidate)
        except Exception:
            pass

    return None


def fallback_parse_suspicions(text: str):

    suspicions = []

    blocks = re.split(r"\n\s*\n", text)

    idx = 1

    for block in blocks:

        block = block.strip()

        if len(block) < 20:
            continue

        title = block.split("\n")[0][:120]

        suspicions.append({
            "id": f"SUSP-{idx:03}",
            "category": "unknown",
            "title": title,
            "severity_estimate": "medium",
            "confidence": "low",
            "component": None,
            "initial_evidence": [block[:500]],
            "why_interesting": block[:500],
            "recommended_next_steps": []
        })

        idx += 1

    return {"suspicions": suspicions}


def parse_discovery_output(text: str):

    parsed = extract_structured_candidate(text)

    if isinstance(parsed, dict) and isinstance(parsed.get("suspicions"), list):
        return parsed

    if isinstance(parsed, list):
        return {"suspicions": parsed}

    return fallback_parse_suspicions(text)


def parse_triage_output(text: str, original_suspicions):

    parsed = extract_structured_candidate(text)

    if isinstance(parsed, dict) and isinstance(parsed.get("suspicions"), list):
        return parsed

    if isinstance(parsed, list):
        return {"suspicions": parsed}

    triaged = []

    for i, s in enumerate(original_suspicions, start=1):
        item = dict(s)
        item["priority"] = i
        triaged.append(item)

    return {"suspicions": triaged}


def parse_investigation_output(text: str, suspicion):

    parsed = extract_structured_candidate(text)

    if isinstance(parsed, dict) and "status" in parsed:
        return parsed

    return {
        "id": suspicion.get("id", "UNKNOWN"),
        "category": suspicion.get("category", "unknown"),
        "title": suspicion.get("title", "Investigación incompleta"),
        "status": "hypothesis",
        "severity": suspicion.get("severity_estimate", "medium"),
        "confidence": "low",
        "component": suspicion.get("component"),
        "files_reviewed": [],
        "evidence": [
            {
                "type": "llm_raw_output",
                "file": "",
                "detail": text[:2000],
            }
        ],
        "impact": "No se pudo estructurar completamente la respuesta.",
        "conditions_exploitation": [],
        "manual_validation": ["Revisar manualmente la salida cruda del modelo."],
        "reasoning_summary": text[:1000],
    }


# -----------------------------------------------------------------------------
# Agent factory
# -----------------------------------------------------------------------------

def build_agent(system_prompt: str, allow_tools=False):

    tools = []

    if allow_tools:
        tools = [
            search_code,
            read_source_file,
            read_multiple_files,
        ]

    return Agent(
        model=OpenRouter(
            id=MODEL_ID,
            temperature=0.1,
            max_tokens=3000,
        ),
        instructions=system_prompt,
        tools=tools,
        markdown=False,
    )


# -----------------------------------------------------------------------------
# Pipeline stages
# -----------------------------------------------------------------------------

def prepare_artifacts():
    print(f"[+] Preparando artefactos para: {APK_PATH}")

    jadx_result = run_jadx(str(APK_PATH))
    print(jadx_result)

    apktool_result = run_apktool(str(APK_PATH))
    print(apktool_result)

    evidence_raw = build_initial_evidence()
    evidence = extract_structured_candidate(evidence_raw)

    if not evidence:
        evidence = {}

    evidence["artifact_status"] = {
        "jadx": jadx_result,
        "apktool": apktool_result,
    }

    (OUTPUT_DIR / "initial_evidence.json").write_text(
        json.dumps(evidence, indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return evidence

def discover_suspicions(initial_evidence):

    print("[+] Discovery de sospechas")

    agent = build_agent(DISCOVERY_PROMPT)

    prompt = f"""
Analiza esta evidencia inicial del APK {APK_PATH} y genera todas las sospechas razonables.

EVIDENCIA:
{json.dumps(initial_evidence, indent=2, ensure_ascii=False)}
"""

    response = agent.run(prompt)

    raw = agent_content(response)

    (OUTPUT_DIR / "discovery_raw.txt").write_text(raw)

    data = parse_discovery_output(raw)

    suspicions = data.get("suspicions", [])

    (OUTPUT_DIR / "suspicions.json").write_text(
        json.dumps({"suspicions": suspicions}, indent=2, ensure_ascii=False)
    )

    return suspicions


def triage_suspicions(suspicions):

    print("[+] Triage de sospechas")

    agent = build_agent(TRIAGE_PROMPT)

    prompt = f"""
Prioriza estas sospechas para investigación:

{json.dumps({"suspicions": suspicions}, indent=2, ensure_ascii=False)}
"""

    response = agent.run(prompt)

    raw = agent_content(response)

    (OUTPUT_DIR / "triage_raw.txt").write_text(raw)

    data = parse_triage_output(raw, suspicions)

    triaged = data.get("suspicions", [])

    triaged.sort(key=lambda x: x.get("priority", 999))

    (OUTPUT_DIR / "triaged_suspicions.json").write_text(
        json.dumps({"suspicions": triaged}, indent=2, ensure_ascii=False)
    )

    return triaged


def investigate_one_suspicion(suspicion):

    suspicion_id = suspicion.get("id", "UNKNOWN")

    print(f"[+] Investigando {suspicion_id}")

    agent = build_agent(
        INVESTIGATION_PROMPT_TEMPLATE.format(
            suspect_json=json.dumps(suspicion, indent=2, ensure_ascii=False)
        ),
        allow_tools=True
    )

    prompt = """
Investiga esta sospecha. Usa herramientas si necesitas localizar o leer código.
Devuelve el resultado final de investigación.
"""

    response = agent.run(prompt)

    raw = agent_content(response)

    (INVESTIGATIONS_DIR / f"{suspicion_id}_raw.txt").write_text(raw)

    investigation = parse_investigation_output(raw, suspicion)

    (INVESTIGATIONS_DIR / f"{suspicion_id}.json").write_text(
        json.dumps(investigation, indent=2, ensure_ascii=False)
    )

    return investigation


def investigate_all(triaged_suspicions):

    investigations = []

    for suspicion in triaged_suspicions:

        try:
            result = investigate_one_suspicion(suspicion)
            investigations.append(result)

        except Exception as e:

            investigations.append({
                "id": suspicion.get("id"),
                "status": "hypothesis",
                "confidence": "low",
                "reasoning_summary": f"Error investigando: {e}",
            })

    return investigations


def build_evidence_store(initial_evidence, triaged, investigations):

    store = {
        "apk_path": str(APK_PATH),
        "model": MODEL_ID,
        "initial_evidence": initial_evidence,
        "triaged_suspicions": triaged,
        "investigations": investigations,
    }

    (OUTPUT_DIR / "evidence_store.json").write_text(
        json.dumps(store, indent=2, ensure_ascii=False)
    )

    return store


def generate_final_report(evidence_store):

    print("[+] Generando report.md")

    agent = build_agent(FINAL_REPORT_PROMPT)

    prompt = f"""
Genera el informe final en Markdown a partir de este evidence_store:

{json.dumps(evidence_store, indent=2, ensure_ascii=False)}
"""

    response = agent.run(prompt)

    content = agent_content(response)

    (OUTPUT_DIR / "report.md").write_text(content)

    return content


# -----------------------------------------------------------------------------
# Main
# -----------------------------------------------------------------------------

def main():

    ensure_dirs()

    print(f"[+] Usando modelo: {MODEL_ID}")

    initial_evidence = prepare_artifacts()

    suspicions = discover_suspicions(initial_evidence)

    triaged = triage_suspicions(suspicions)

    investigations = investigate_all(triaged)

    evidence_store = build_evidence_store(
        initial_evidence,
        triaged,
        investigations,
    )

    generate_final_report(evidence_store)

    print("\n[+] Pipeline completado")
    print(f"[+] output/report.md")
    print(f"[+] output/evidence_store.json")


if __name__ == "__main__":
    main()