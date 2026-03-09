import os
from pathlib import Path

from dotenv import load_dotenv
from agno.agent import Agent
from agno.models.openrouter import OpenRouter

from prompts import SYSTEM_PROMPT
from tools import (
    run_jadx,
    run_apktool,
    build_initial_evidence,
    read_source_file,
    search_code,
)

load_dotenv()

BASE_DIR = Path(__file__).resolve().parent.parent
SAMPLES_DIR = BASE_DIR / "samples"

apk_files = sorted(SAMPLES_DIR.glob("*.apk"))
if not apk_files:
    raise FileNotFoundError(f"No se encontró ningún APK en: {SAMPLES_DIR}")

APK_PATH = apk_files[0]

model_id = os.getenv("OPENROUTER_MODEL", "google/gemini-flash-1.5")
api_key = os.getenv("OPENROUTER_API_KEY")

if not api_key:
    raise RuntimeError("OPENROUTER_API_KEY no definida en .env")


def build_agent():
    return Agent(
        model=OpenRouter(
            id=model_id,
            temperature=0.1,
            max_tokens=2500,
        ),
        instructions=SYSTEM_PROMPT,
        tools=[read_source_file, search_code],
        markdown=True,
    )


def phase_1_prepare():
    print(run_jadx(str(APK_PATH)))
    print(run_apktool(str(APK_PATH)))
    evidence = build_initial_evidence()

    output_dir = BASE_DIR / "output"
    output_dir.mkdir(exist_ok=True)

    with open(output_dir / "initial_evidence.json", "w", encoding="utf-8") as f:
        f.write(evidence)

    return evidence


def phase_2_reasoning(agent: Agent, evidence: str):
    prompt = f"""
Se ha generado evidencia inicial del APK {APK_PATH}.

Tu tarea es:
1. Revisar la evidencia inicial.
2. Identificar las sospechas más prometedoras para encontrar vulnerabilidades reportables.
3. Si necesitas más contexto, usa las herramientas para buscar o leer código concreto.
4. Devuelve como máximo 3 hallazgos:
   - confirmados, o
   - hipótesis sólidas con evidencia parcial

EVIDENCIA INICIAL:
{evidence}
"""
    return agent.run(prompt)


def main():
    print(f"[+] Usando modelo: {model_id}")
    evidence = phase_1_prepare()
    agent = build_agent()

    response = phase_2_reasoning(agent, evidence)

    content = response.content if hasattr(response, "content") else str(response)

    report_path = BASE_DIR / "output" / "report.md"
    with open(report_path, "w", encoding="utf-8") as f:
        f.write(content)

    print(content)
    print(f"\n[+] Reporte guardado en: {report_path}")


if __name__ == "__main__":
    main()