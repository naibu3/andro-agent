# Arquitectura del sistema

## 1. Objetivo arquitectónico

La arquitectura de Andro-Agent está diseñada para analizar APKs Android de manera incremental, trazable y extensible.

El sistema busca equilibrar tres necesidades:

1. **Reproducibilidad**: que el mismo APK genere evidencia comparable.
2. **Capacidad de razonamiento**: usar modelos para interpretar señales complejas.
3. **Evolución futura**: poder añadir nuevas tools, nuevas fuentes y nuevos agentes sin rehacer el core.

---

## 2. Capas de la arquitectura

```text
[ Input ]
   APK
    │
    ▼
[ Tooling Layer ]
   apktool / JADX / búsquedas / futuras tools
    │
    ▼
[ Normalization Layer ]
   manifest facts / code facts / findings / bundle
    │
    ▼
[ Agent Layer ]
   ManifestRiskAgent / CodeRiskAgent / RiskFusionAgent / MarkdownReportAgent
    │
    ▼
[ State & Metrics Layer ]
   CaseState / run_metrics / artefactos persistidos
```

---

## 3. Componentes principales

## 3.1 Core

### `CaseState`
Representa el estado persistente de una ejecución concreta (`case_id`).

Responsabilidades:

- guardar rutas a artefactos,
- registrar estado general,
- almacenar warnings y errores,
- servir como contrato común entre steps.

Ejemplo simplificado:

```python
class CaseState(BaseModel):
    case_id: str
    apk_path: Path

    manifest_json_path: Path | None = None
    facts_path: Path | None = None
    findings_path: Path | None = None

    static_analysis_bundle_path: Path | None = None

    manifest_reasoning_path: Path | None = None
    code_reasoning_path: Path | None = None
    analysis_path: Path | None = None
    static_report_path: Path | None = None

    status: str = "created"
    current_step: str | None = None
```

### `StaticAnalysisPipeline`
Orquesta la ejecución de la fase estática completa.

No contiene la lógica de análisis en sí; coordina steps.

---

## 3.2 Tooling Layer

Esta capa ejecuta herramientas reales y genera artefactos crudos o semiprocesados.

### Ejemplos actuales

#### `ExtractManifestTool`
- usa `apktool`
- extrae `AndroidManifest.xml`
- genera `manifest.json`

#### `JadxDecompileTool`
- usa `jadx`
- decompila el APK
- genera directorio `jadx/sources`

#### `CodeSearchTool`
- recorre el código decompilado
- busca patrones regex de interés
- genera `code_search_results.json`

---

## 3.3 Normalization Layer

Aquí el sistema transforma outputs de tools en estructuras más estables y reutilizables.

### Facts
Hechos atómicos.

Ejemplos:

```json
{
  "type": "manifest.application.debuggable",
  "key": "debuggable",
  "value": true
}
```

```json
{
  "type": "code.pattern.sql_rawQuery",
  "key": "MainActivity.java",
  "value": true
}
```

### Findings
Interpretaciones deterministas iniciales.

Ejemplo:

```json
{
  "rule_id": "MANIFEST_DEBUGGABLE_ENABLED",
  "title": "Application is debuggable",
  "severity": "medium"
}
```

### Bundle
Producto intermedio canónico de la fase estática.

Agrupa:

- manifest,
- facts,
- findings,
- evidencia de código,
- summary agregado.

---

## 3.4 Agent Layer

Aquí entran los modelos.

La arquitectura actual usa varios agentes especializados para evitar meter todo el contexto en un único prompt.

### `ManifestRiskAgent`
Consume solo evidencia de manifest.

### `CodeRiskAgent`
Consume solo evidencia de código.

### `RiskFusionAgent`
Fusiona los outputs de manifest y código.

### `MarkdownReportAgent`
Transforma el reasoning final en Markdown legible.

---

## 3.5 Metrics Layer

La arquitectura también incorpora observabilidad desde el principio.

Se registran:

- tiempo por step,
- tiempo por agente,
- tokens si el proveedor los devuelve,
- chars de input/output,
- éxito/fallo.

Esto permite comparar arquitecturas:

- monoagente,
- multiagente,
- prompts cortos vs largos.

---

## 4. Flujo de datos

```text
APK
 -> ExtractManifestTool
 -> manifest.json
 -> build_manifest_facts
 -> manifest_facts.json
 -> apply_manifest_rules
 -> manifest_findings.json

APK
 -> JadxDecompileTool
 -> code_search
 -> code_search_results.json
 -> build_code_facts
 -> code_search_facts.json
 -> apply_code_rules
 -> code_findings.json

manifest + code
 -> static_analysis_bundle.json

bundle
 -> ManifestRiskAgent
 -> manifest_reasoning.json

bundle
 -> CodeRiskAgent
 -> code_reasoning.json

manifest_reasoning + code_reasoning + bundle.summary
 -> RiskFusionAgent
 -> static_analysis_reasoning.json

static_analysis_reasoning.json
 -> MarkdownReportAgent
 -> static_analysis_report.md
```

---

## 5. Por qué esta arquitectura y no otra

## 5.1 Por qué no un único agente
Porque el contexto crece demasiado rápido.  
Pasarle todo el bundle a un solo agente acaba en:

- límites de contexto,
- coste alto,
- inestabilidad.

## 5.2 Por qué no todo determinista
Porque encontrar vulnerabilidades plausibles exige correlación semántica y priorización, no solo reglas.

## 5.3 Por qué híbrida
Porque combina:

- estabilidad y trazabilidad de las tools,
- capacidad de abstracción de los agentes.

---

## 6. Extensibilidad prevista

La arquitectura está preparada para incorporar más fuentes sin cambiar el core:

- Androguard
- extracción de strings
- aapt2
- análisis dinámico posterior
- handoff a agentes verificadores

La clave es que toda nueva fuente debe integrarse vía:

- artefacto tool-native,
- facts/findings normalizados,
- bundle.

---

## 7. Ejemplo de evolución futura

### Estado actual
```text
manifest + code patterns + reasoning
```

### Evolución prevista
```text
manifest + code patterns + strings + androguard + candidates + dynamic handover
```

La arquitectura actual ya soporta esa evolución porque el punto de integración es el bundle y no una tool concreta.
