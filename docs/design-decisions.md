# Decisiones de diseño

## 1. Objetivo de este documento

Recoger las decisiones arquitectónicas importantes y su justificación.

No documenta “qué hace el código”, sino “por qué se eligió hacerlo así”.

---

## 2. Sistema stateful

### Decisión
Usar `CaseState` persistido en disco por `case_id`.

### Motivo
Permite:
- trazabilidad,
- depuración,
- reanudación futura,
- asociación clara entre artefactos.

### Alternativa descartada
Pipeline puramente stateless con outputs dispersos.

### Por qué se descartó
Complica mucho:
- el debugging,
- la observabilidad,
- la evolución hacia multiagente y dinámico.

---

## 3. Pipeline determinista antes que agentes

### Decisión
Extraer evidencia con tools y reglas antes de razonar con modelos.

### Motivo
Los agentes son mejores interpretando y priorizando que descubriendo evidencia cruda desde cero.

### Ventajas
- reproducibilidad,
- auditabilidad,
- menor dependencia del modelo.

---

## 4. Artefactos intermedios visibles

### Decisión
Persistir:
- facts,
- findings,
- bundle,
- reasoning,
- métricas.

### Motivo
Se quiere que el sistema sea inspeccionable fase a fase.

### Beneficio
Permite verificar si el pipeline va por buen camino antes de añadir más complejidad.

---

## 5. Multiagente en vez de monoagente

### Decisión
Dividir el razonamiento en:
- manifest,
- código,
- fusión,
- reporte.

### Motivo
El bundle completo crecía demasiado y rompía el límite de contexto.

### Beneficios
- menor contexto por agente,
- mayor especialización,
- mejores métricas,
- mejor estabilidad.

---

## 6. No pasar artefactos completos al modelo

### Decisión
No meter el bundle bruto completo en un único prompt.

### Motivo
El contexto bruto:
- rompe límites,
- sube costes,
- mete mucho ruido.

### Solución elegida
Crear vistas especializadas por dominio.

---

## 7. Mantener tools reales aunque fallen parcialmente

### Decisión
Aceptar outputs parciales de `jadx` cuando el decompilado es suficiente.

### Motivo
En reversing Android es normal que ciertas clases fallen parcialmente, pero el output restante siga siendo muy útil.

### Beneficio
Pipeline más robusto y realista.

---

## 8. Guardar raw de respuestas LLM

### Decisión
Persistir siempre la respuesta textual original además del JSON parseado.

### Motivo
Las respuestas de modelos free no siempre son JSON limpio.

### Beneficio
- debugging,
- trazabilidad,
- análisis de fallos de parseo,
- comparación de prompts/modelos.

---

## 9. No forzar todavía correlación determinista rígida

### Decisión
No implementar un motor de correlación muy estricto en estático.

### Motivo
Puede:
- sobrefiltrar señales,
- perder información útil,
- acoplar demasiado el sistema a heurísticas tempranas.

### Estrategia elegida
Preservar evidencia y dejar gran parte de la correlación semántica a agentes especializados.

---

## 10. Medir desde ahora

### Decisión
Implementar métricas de steps y agentes en esta fase.

### Motivo
Las decisiones futuras de arquitectura deben apoyarse en datos, no en impresiones.

### Qué habilita
- comparar monoagente vs multiagente,
- comparar prompts,
- estudiar coste/beneficio.

---

## 11. Bundle como producto intermedio canónico

### Decisión
Crear `static_analysis_bundle.json`.

### Motivo
Desacoplar el sistema de herramientas concretas como `jadx`.

### Beneficio
Permite añadir:
- Androguard,
- strings,
- nuevas fuentes

sin romper la arquitectura de agentes.

---

## 12. Separar reasoning de reporting

### Decisión
Un agente razona y otro redacta.

### Motivo
Son tareas distintas:
- reasoning → correlación y prioridad
- reporting → claridad y presentación

### Beneficio
Mejor control de prompts, contexto y calidad final.
