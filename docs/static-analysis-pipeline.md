# Pipeline de análisis estático

## 1. Visión general

El pipeline estático es la secuencia principal que transforma un APK en:

- evidencia técnica,
- findings deterministas,
- razonamiento multiagente,
- reporte Markdown,
- métricas.

La implementación vive en `StaticAnalysisPipeline`.

---

## 2. Orden de ejecución

```text
validate
extract_manifest
build_manifest_facts
apply_manifest_rules
jadx_decompile
code_search
build_code_facts
apply_code_rules
build_static_bundle
manifest_risk_agent
code_risk_agent
risk_fusion_agent
markdown_report_agent
```

---

## 3. Step por step

## 3.1 `validate`

### Objetivo
Validar que el input es un APK procesable.

### Comprueba
- que existe,
- que es un fichero,
- que acaba en `.apk`,
- que es ZIP válido,
- que contiene `AndroidManifest.xml`.

### Ejemplo
```bash
andro-agent validate samples/base.apk
```

### Errores comunes
- ruta inexistente,
- fichero no APK,
- APK corrupto.

---

## 3.2 `extract_manifest`

### Objetivo
Decodificar el manifest y normalizarlo a JSON.

### Herramienta
- `apktool`

### Artefactos
- `raw/AndroidManifest.xml`
- `parsed/manifest.json`
- `logs/extract_manifest.log`

### Ejemplo de salida
```json
{
  "package_name": "com.example.app",
  "version_code": "1",
  "permissions": ["android.permission.INTERNET"]
}
```

---

## 3.3 `build_manifest_facts`

### Objetivo
Convertir `manifest.json` en facts.

### Ejemplos de facts
```json
{
  "type": "manifest.application.debuggable",
  "key": "debuggable",
  "value": true
}
```

```json
{
  "type": "manifest.component.activity.exported",
  "key": ".MainActivity",
  "value": true
}
```

### Por qué existe
El agente no debería razonar directamente sobre XML crudo ni sobre estructuras demasiado heterogéneas.

---

## 3.4 `apply_manifest_rules`

### Objetivo
Aplicar reglas deterministas básicas sobre los facts de manifest.

### Ejemplos de reglas
- `debuggable == true`
- `allowBackup == true`
- `exported component sin permiso`
- `usesCleartextTraffic == true`

### Artefacto
- `findings/manifest_findings.json`

---

## 3.5 `jadx_decompile`

### Objetivo
Decompilar el APK para obtener fuentes Java/Kotlin y recursos.

### Herramienta
- `jadx`

### Artefactos
- `jadx/sources/`
- `jadx/resources/`
- `logs/jadx_decompile.log`

### Nota importante
JADX puede terminar con errores parciales y aun así producir salida útil.  
El pipeline está diseñado para tolerar ese caso.

---

## 3.6 `code_search`

### Objetivo
Buscar patrones de código potencialmente relevantes para seguridad.

### Ejemplos de patrones
- `loadUrl(`
- `addJavascriptInterface(`
- `rawQuery(`
- `execSQL(`
- `Runtime.getRuntime().exec(`
- `Cipher.getInstance(`
- URLs HTTP hardcodeadas

### Artefacto
- `code_search/code_search_results.json`

### Ejemplo de match
```json
{
  "pattern_name": "sql_rawQuery",
  "category": "sql",
  "file_path": "LoginActivity.java",
  "line_number": 88,
  "line_text": "db.rawQuery(query, null)"
}
```

---

## 3.7 `build_code_facts`

### Objetivo
Transformar resultados de búsqueda en facts de código.

### Ejemplo
```json
{
  "type": "code.pattern.sql_rawQuery",
  "key": "LoginActivity.java",
  "value": true
}
```

---

## 3.8 `apply_code_rules`

### Objetivo
Traducir patrones de código a findings iniciales.

### Ejemplos
- uso de `rawQuery`
- uso de `addJavascriptInterface`
- HTTP hardcodeado
- uso de `Runtime.exec`

### Artefacto
- `findings/code_findings.json`

---

## 3.9 `build_static_bundle`

### Objetivo
Agrupar todo lo anterior en un artefacto intermedio canónico.

### Artefacto
- `bundle/static_analysis_bundle.json`

### Por qué existe
Para desacoplar el pipeline de tools concretas y preparar el consumo por agentes.

---

## 3.10 `manifest_risk_agent`

### Objetivo
Razonar sobre la superficie de ataque y los riesgos visibles en el manifest.

### Consume
- `manifest`
- `manifest_facts`
- `manifest_findings`
- `bundle.summary` parcial

### Produce
- `analysis/manifest_reasoning.json`
- `analysis/manifest_reasoning_raw.txt`

---

## 3.11 `code_risk_agent`

### Objetivo
Razonar sobre señales de código sin cargar todo el bundle.

### Consume
- vista resumida de resultados de código,
- conteos por categoría,
- top files,
- findings de código.

### Produce
- `analysis/code_reasoning.json`
- `analysis/code_reasoning_raw.txt`

### Importante
Este step evita el problema de contexto de meter todos los matches completos en un único prompt.

---

## 3.12 `risk_fusion_agent`

### Objetivo
Fusionar manifest y código en una visión estática coherente.

### Consume
- `manifest_reasoning.json`
- `code_reasoning.json`
- `bundle.summary`

### Produce
- `analysis/static_analysis_reasoning.json`
- `analysis/static_analysis_reasoning_raw.txt`

### Resultado esperado
- top risks,
- correlations,
- posibles candidatos,
- siguientes pasos.

---

## 3.13 `markdown_report_agent`

### Objetivo
Convertir el reasoning final en un informe Markdown.

### Consume
- `analysis/static_analysis_reasoning.json`

### Produce
- `report/static_analysis_report.md`

### Ventaja
Separa claramente:
- razonamiento técnico,
- presentación al usuario.

---

## 4. Ejemplo de `run()`

```python
state = CaseState(case_id=case_id, apk_path=apk_path)
tracker = MetricsTracker(case_id, self.artifacts_dir)

self._run_step(tracker, "validate", self._step_validate, state)
self._run_step(tracker, "extract_manifest", self._step_extract_manifest, state)
...
self._run_step(tracker, "build_static_bundle", self._step_build_static_bundle, state)

self._step_manifest_risk_agent(state, tracker)
self._step_code_risk_agent(state, tracker)
self._step_risk_fusion_agent(state, tracker)
self._step_markdown_report_agent(state, tracker)
```

---

## 5. Qué medir en este pipeline

### Por step
- duración,
- éxito/fallo,
- warnings,
- errores.

### Por agente
- duración,
- chars de input/output,
- tokens si vienen del proveedor,
- modelo usado.

---

## 6. Problemas típicos

## 6.1 Límite de contexto
Solución:
- no pasar el bundle completo,
- usar agentes especializados,
- pasar vistas parciales.

## 6.2 JADX con errores parciales
Solución:
- aceptar output parcial si existen fuentes útiles.

## 6.3 Respuestas no parseables como JSON
Solución:
- parser robusto,
- guardar raw,
- fallback estructurado.

---

## 7. Resultado final de la fase estática

Si todo va bien, una ejecución produce:

- evidencia de manifest,
- evidencia de código,
- reasoning especializado,
- reasoning fusionado,
- reporte Markdown,
- métricas de todo el pipeline.
