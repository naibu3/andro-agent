# Andro-Agent Docs

## TLDR;

**Andro-Agent** es un sistema de análisis estático de APKs Android orientado a arquitectura **híbrida**:

- **Análisis estático**
	- **Herramientas deterministas** para extraer evidencia técnica reproducible.
	- **Normalización** de esa evidencia en facts, findings y bundles.
	- **Agentes LLM especializados** para razonar, priorizar riesgos y redactar resultados.
	- **Métricas** para medir tiempo, tokens y efectividad del pipeline.
- **Análisis dinámico**
	- TODO - Próximos pasos

El objetivo no es solo obtener un informe bonito, sino construir una base sólida para:

- Asistir a pentesters en auditorías a aplicaciones Android reales.
- Permitir a programadores verificar la seguridad de su código con la detección temprana de vulnerabilidades.
- Ayudar a cualquier usuario a probar la seguridad de aplicaciones de uso diario.

---

## Flujo actual de alto nivel

```text
APK
 ├─[STATIC ANALISIS]
 ├── validate
 ├── extract_manifest
 ├── build_manifest_facts
 ├── apply_manifest_rules
 ├── jadx_decompile
 ├── code_search
 ├── build_code_facts
 ├── apply_code_rules
 ├── build_static_bundle
 ├── ManifestRiskAgent
 ├── CodeRiskAgent
 ├── RiskFusionAgent
 ├── MarkdownReportAgent
 ├─[DINAMIC ANALISIS] 
 └──Final Report
```

El pipeline actual genera los siguientes ficheros con resultados:

- `case_state.json`
- `static_analysis_bundle.json`
- `manifest_reasoning.json`
- `code_reasoning.json`
- `static_analysis_reasoning.json`
- `static_analysis_report.md`
- `run_metrics.json`

---

## Filosofía de diseño

### 1. Pipeline determinista primero
El sistema no depende del modelo para descubrir la evidencia básica.  
Primero se extraen datos con herramientas y reglas; después los agentes razonan sobre esa evidencia.

### 2. Estado explícito
Cada ejecución tiene un `CaseState` persistido en disco. Esto permite:

- depuración,
- reanudación futura,
- trazabilidad,
- evaluación.

### 3. Artefactos intermedios visibles
Cada fase genera artefactos legibles. Esto facilita:

- inspección manual,
- debugging,
- validación incremental del pipeline,
- documentación del TFM.

### 4. Multiagente por partición semántica
En vez de pasar todo el bundle a un solo agente, el contexto se divide por responsabilidad:

- manifest,
- código,
- fusión,
- reporting.

Eso reduce contexto, mejora estabilidad y permite medir coste por agente.

---

## Estructura del proyecto

```text
src/andro_agent/
├── agents/
├── bundle/
├── core/
├── evidence/
├── facts/
├── metrics/
├── pipelines/
├── rules/
├── tools/
└── utils/
```

---

## Cómo leer esta documentación

- **Arquitectura** → visión global del sistema.
- **Pipeline estático** → ejecución paso a paso.
- **Artefactos** → qué genera cada fase.
- **Agentes** → qué consume y produce cada agente.
- **Métricas** → qué se mide y por qué.
- **Decisiones de diseño** → justificación arquitectónica.

---

## Ejemplo de ejecución

```bash
andro-agent -v run samples/base.apk --case-id <id_ejecución>
```

Artefactos esperados:

```text
artifacts/full_static_007/
├── analysis/
├── bundle/
├── facts/
├── findings/
├── jadx/
├── logs/
├── metrics/
├── parsed/
├── raw/
├── report/
└── case_state.json
```

---

## Próximos pasos

Una vez consolidada esta fase estática, el siguiente paso será el desarrollo de la fase de análisis dinámico:

- deploy del entorno sándbox
- análisis dinámico guiado por agentes
- generación de resultados de análisis dinámico
- verificación de resultados y generación de documentación
