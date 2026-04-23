# Artefactos generados

## 1. Objetivo de este documento

Este documento describe los artefactos que genera el sistema y cómo se relacionan entre sí.

La filosofía general es:

- cada fase deja salida visible,
- cada artefacto puede inspeccionarse manualmente,
- el sistema no oculta el estado interno importante.

---

## 2. Estructura general por `case_id`

```text
artifacts/<case_id>/
├── analysis/
├── bundle/
├── code_search/
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

## 3. `case_state.json`

### Propósito
Representa el estado persistente de la ejecución.

### Lo genera
- `CaseState.save()`

### Lo consume
- pipeline,
- herramientas de debugging futuras,
- posible reanudación.

### Ejemplo
```json
{
  "case_id": "full_static_007",
  "apk_path": "samples/base.apk",
  "manifest_json_path": "artifacts/.../parsed/manifest.json",
  "status": "completed"
}
```

---

## 4. Carpeta `raw/`

### Contenido típico
- `AndroidManifest.xml`

### Propósito
Guardar artefactos crudos generados por herramientas externas.

---

## 5. Carpeta `parsed/`

### Contenido típico
- `manifest.json`

### Propósito
Guardar artefactos ya parseados y normalizados desde formatos crudos.

---

## 6. Carpeta `facts/`

### Artefactos típicos
- `manifest_facts.json`
- `code_search_facts.json`

### Propósito
Representar hechos atómicos sobre el APK.

### Ejemplo de `manifest_facts.json`
```json
[
  {
    "type": "manifest.application.allow_backup",
    "key": "allow_backup",
    "value": true
  }
]
```

### Ejemplo de `code_search_facts.json`
```json
[
  {
    "type": "code.pattern.webview_loadUrl",
    "key": "WebActivity.java",
    "value": true
  }
]
```

---

## 7. Carpeta `findings/`

### Artefactos típicos
- `manifest_findings.json`
- `code_findings.json`

### Propósito
Guardar hallazgos iniciales generados por reglas deterministas.

### Ejemplo
```json
[
  {
    "rule_id": "CODE_WEBVIEW_LOADURL",
    "title": "WebView loadUrl usage detected",
    "severity": "medium"
  }
]
```

---

## 8. Carpeta `code_search/`

### Artefacto principal
- `code_search_results.json`

### Propósito
Guardar coincidencias de patrones en código decompilado.

### Ejemplo
```json
[
  {
    "pattern_name": "sql_rawQuery",
    "category": "sql",
    "file_path": "LoginActivity.java",
    "line_number": 88,
    "line_text": "db.rawQuery(query, null)"
  }
]
```

---

## 9. Carpeta `jadx/`

### Contenido típico
- `sources/`
- `resources/`

### Propósito
Guardar el output de decompilación.

### Notas
- puede haber errores parciales,
- aun así puede contener material muy útil.

---

## 10. Carpeta `bundle/`

### Artefacto principal
- `static_analysis_bundle.json`

### Propósito
Ser el producto intermedio canónico de la fase estática.

### Contiene
- manifest,
- manifest facts,
- manifest findings,
- code search results,
- code facts,
- code findings,
- summary agregado.

### Ventaja
Permite:
- desacoplar tools del razonamiento,
- añadir nuevas fuentes sin rehacer agentes.

---

## 11. Carpeta `analysis/`

### Artefactos actuales
- `manifest_reasoning.json`
- `manifest_reasoning_raw.txt`
- `code_reasoning.json`
- `code_reasoning_raw.txt`
- `static_analysis_reasoning.json`
- `static_analysis_reasoning_raw.txt`

### Propósito
Guardar outputs de agentes especializados y reasoning final.

### Diferencia entre JSON y RAW
- `.json` → salida parseada/normalizada
- `.txt` → respuesta textual exacta del modelo

Esto es muy útil para debugging y evaluación.

---

## 12. Carpeta `report/`

### Artefacto principal
- `static_analysis_report.md`

### Propósito
Guardar un informe legible para humanos generado a partir del reasoning final.

---

## 13. Carpeta `metrics/`

### Artefactos
- `run_metrics.json`
- `run_metrics_summary.json`

### Propósito
Registrar tiempos, tokens, tamaño de prompts y resumen cuantitativo de la ejecución.

---

## 14. Carpeta `logs/`

### Artefactos típicos
- `extract_manifest.log`
- `jadx_decompile.log`

### Propósito
Guardar stdout/stderr de herramientas externas.

### Importancia
Es esencial para:
- depurar fallos,
- diferenciar errores completos de outputs parciales.

---

## 15. Flujo entre artefactos

```text
manifest.json
 -> manifest_facts.json
 -> manifest_findings.json

code_search_results.json
 -> code_search_facts.json
 -> code_findings.json

todo lo anterior
 -> static_analysis_bundle.json

bundle
 -> manifest_reasoning.json
 -> code_reasoning.json
 -> static_analysis_reasoning.json
 -> static_analysis_report.md
```

---

## 16. Qué artefactos son “fuente de verdad”

### Tool-native
- manifest raw,
- logs,
- JADX sources,
- code search results.

### Normalizados
- facts,
- findings,
- bundle.

### Razonamiento
- reasoning JSONs,
- markdown final.

La evidencia cruda sigue siendo importante aunque exista razonamiento por encima.
