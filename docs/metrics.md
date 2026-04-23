# Métricas y observabilidad

## 1. Objetivo

La capa de métricas existe para responder preguntas como:

- ¿qué parte del pipeline tarda más?
- ¿qué agente consume más contexto?
- ¿cuántos findings produce una estrategia?
- ¿merece la pena el enfoque multiagente?
- ¿qué configuración ofrece mejor relación coste/valor?

Sin esta capa, cualquier comparación sería demasiado subjetiva.

---

## 2. Qué se mide

## 2.1 Por ejecución (`RunMetrics`)
- `case_id`
- `started_at`
- `finished_at`
- `duration_seconds`
- lista de `steps`
- lista de `agents`
- `summary`

## 2.2 Por step (`StepMetric`)
- nombre del step
- tiempo de inicio/fin
- duración
- éxito/fallo
- warnings
- errores

## 2.3 Por agente (`AgentMetric`)
- nombre del agente
- modelo usado
- tiempo de inicio/fin
- duración
- chars de input/output
- tokens si están disponibles
- éxito/fallo
- warnings/errores

---

## 3. Artefactos generados

```text
metrics/
├── run_metrics.json
└── run_metrics_summary.json
```

---

## 4. Ejemplo de `run_metrics_summary.json`

```json
{
  "case_id": "full_static_007",
  "duration_seconds": 38.4,
  "steps": 13,
  "agents": 4,
  "summary": {
    "status": "completed",
    "warnings_count": 0,
    "errors_count": 0,
    "tool_history_count": 12,
    "has_manifest_reasoning": true,
    "has_code_reasoning": true,
    "has_fused_reasoning": true,
    "has_markdown_report": true
  }
}
```

---

## 5. Cómo se usa el tracker

### Inicialización
```python
tracker = MetricsTracker(case_id, self.artifacts_dir)
```

### Step normal
```python
tracker.start_step("extract_manifest")
self._step_extract_manifest(state)
tracker.end_step(success=True)
```

### Agente
```python
tracker.start_agent(
    name="code_risk_agent",
    model=agent.model_id,
    input_text=prompt,
)

result = agent.run_with_prompt(prompt)

tracker.end_agent(
    output_text=result["raw"],
    success=True,
    usage=result.get("usage"),
)
```

### Finalización
```python
tracker.set_summary({...})
tracker.finalize()
```

---

## 6. Por qué medir chars además de tokens

No siempre el proveedor devuelve uso de tokens.

Por eso el sistema guarda también:

- `input_chars`
- `output_chars`

Eso permite:
- aproximar coste,
- comparar tamaños relativos,
- seguir midiendo aunque cambie el proveedor.

---

## 7. Casos de uso de estas métricas

## 7.1 Comparar arquitecturas
Ejemplo:
- monoagente vs multiagente,
- bundle completo vs vistas parciales.

## 7.2 Optimizar prompts
Ejemplo:
- prompts más cortos,
- reducción de contexto,
- coste por agente.

## 7.3 Detectar cuellos de botella
Ejemplo:
- `jadx_decompile` tarda demasiado,
- `CodeRiskAgent` recibe demasiado contexto.

## 7.4 Evaluar efectividad
Puedes relacionar:
- tiempo total,
- número de findings,
- número de warnings,
- calidad del reasoning.

---

## 8. Recomendaciones prácticas

- mide desde el principio,
- no dependas de un único proveedor para tokens,
- guarda siempre métricas aunque un agente falle,
- usa el summary para comparativas rápidas.

---

## 9. Futuras métricas recomendables

- coste estimado por proveedor,
- número de artefactos generados,
- cobertura por categoría de finding,
- número de candidatos de vulnerabilidad,
- calidad del reporte según rúbrica manual.
