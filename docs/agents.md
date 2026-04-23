# Agentes del sistema

## 1. Filosofía general

Los agentes no sustituyen el análisis estático determinista. Su papel es:

- interpretar evidencia
- correlacionar señales
- priorizar riesgos
- generar hipótesis plausibles
- producir salidas legibles

La arquitectura evita un único agente “todoterreno”, esa fue la primera aproximación que se realizó, pero se encontraron distintas problemáticas:

- Contexto - al disponer de tanta información de forma simultánea, el agente tenía problemas con sus propios límites de contexto
- Consumo de tokens - un contexto tan amplio reduce la eficiencia y hace que el agente consuma más tokens de los necesarios, encareciendo los costes por análisis
- Inestabilidad - un único agente tiende a centrarse y limitarse a ciertas zonas de la aplicación de forma no determinista, lo que produce irregularidad en los resultados y vulnerabilidades no detectadas

---

## 2. Análisis estático

## 2.1 `ManifestRiskAgent`

### Propósito
Analizar solo la capa de manifest.

### Consume
- `manifest`
- `manifest_facts`
- `manifest_findings`
- pequeño summary del bundle

### Produce
- `manifest_reasoning.json`
- `manifest_reasoning_raw.txt`

### Tipo de preguntas que responde
- ¿Cuál es la superficie de ataque visible?
- ¿Qué componentes exportados son más relevantes?
- ¿Qué flags inseguras aumentan el riesgo?
- ¿Qué hipótesis de abuso de componentes son plausibles?

### Ejemplo de salida
```json
{
  "summary": "The app exposes multiple exported components.",
  "attack_surface": ["Exported activities", "Exported receiver"],
  "top_risks": ["Abuse of exported components"],
  "abuse_hypotheses": ["Intent abuse against Activity X"],
  "recommended_next_steps": ["Try launching exported activities with adb"]
}
```

---

## 2.2 `CodeRiskAgent`

### Propósito
Analizar solo la capa de código.

### Consume
- findings de código,
- agregados por categoría,
- top files,
- ejemplos de matches por categoría.

### Produce
- `code_reasoning.json`
- `code_reasoning_raw.txt`

### Qué evita
No consume el código completo ni todos los matches sin filtrar, para no romper contexto.

### Tipo de preguntas que responde
- ¿Qué familias de riesgo aparecen en el código?
- ¿Qué ficheros conviene revisar antes?
- ¿Qué patrones parecen más peligrosos?
- ¿Qué hipótesis de vulnerabilidad son más plausibles?

### Ejemplo de salida
```json
{
  "summary": "Multiple SQL and WebView signals were detected.",
  "top_risks": ["Potential SQLi", "Potential WebView abuse"],
  "vulnerability_hypotheses": ["Unsafe SQL construction in file X"],
  "priority_files": ["LoginActivity.java"],
  "recommended_next_steps": ["Inspect SQL query construction"]
}
```

---

## 2.3 `RiskFusionAgent`

### Propósito
Fusionar las perspectivas de manifest y código.

### Consume
- `manifest_reasoning.json`
- `code_reasoning.json`
- `bundle.summary`

### Produce
- `static_analysis_reasoning.json`
- `static_analysis_reasoning_raw.txt`

### Rol arquitectónico
Es el agente que realmente:
- prioriza,
- correlaciona,
- propone riesgos fuertes,
- prepara el handoff a reporte.

### Ejemplo de salida
```json
{
  "summary": "The app combines exported attack surface with risky code patterns.",
  "top_risks": ["Exported activity plus risky code path"],
  "correlations": ["Exported component + SQL logic"],
  "vulnerability_candidates": ["Possible externally reachable SQL abuse"],
  "recommended_next_steps": ["Validate exported flows dynamically"]
}
```

---

## 2.4 `MarkdownReportAgent`

### Propósito
Transformar el reasoning final en un informe Markdown.

### Consume
- `static_analysis_reasoning.json`

### Produce
- `static_analysis_report.md`

### Ventaja
Separa claramente permite obtener una conclusión clara que ayuda al proceso manual de comprobación de resultados.

---

## 3. Patrón común de implementación

Todos los agentes siguen aproximadamente esta estructura:

### `build_prompt(state)`
Construye el prompt con la vista de datos necesaria.

### `run_with_prompt(prompt)`
Ejecuta el modelo y captura:
- raw,
- parsed,
- usage si existe.

### `run(state)`
Método de conveniencia que:
- construye prompt,
- ejecuta.

---

## 4. Parseo robusto de salida

Los agentes no asumen que el modelo siempre devuelve JSON perfecto.

El parseo intenta:
1. JSON directo
2. JSON dentro de fences markdown
3. extraer primer objeto `{ ... }`
4. fallback estructurado

Esto es importante sobre todo con modelos free o para respuestas truncadas.

---

## 5. Por qué varios agentes y no uno

### Problema del monoagente
- contexto demasiado grande,
- peor control del prompt,
- coste alto,
- razonamiento menos especializado.

### Ventaja del multiagente
- cada agente ve solo lo necesario,
- menor contexto,
- más estabilidad,
- métricas comparables por agente.

---

## 6. Cómo evolucionar esta capa

En el futuro puedes añadir:

- `StringsRiskAgent`
- `DynamicPlanningAgent`
- `VerifierAgent`

sin romper la arquitectura, porque cada uno puede consumir artefactos concretos en vez de todo el bundle bruto.
