# Roadmap + Checklist de Desarrollo - Sistema Multiagente de Análisis de APKs

## Objetivo

Desarrollar un sistema multiagente para análisis automatizado de APKs
Android, priorizando: - rapidez de desarrollo - reproducibilidad -
claridad arquitectónica - valor práctico

------------------------------------------------------------------------

## Estrategia General

-   Desarrollo incremental (vertical slices)
-   Pipeline determinista primero
-   Introducción progresiva de LLM
-   Validación basada en evidencia

------------------------------------------------------------------------

# FASE 0 --- Setup Base (2--3 días)

## Checklist

-   [x] Crear repositorio Git
-   [x] Definir estructura de carpetas
-   [x] Configurar entorno Python
-   [x] Crear CLI básica
-   [x] Validar input APK
-   [ ] ~~(Opcional) Docker Compose básico~~

------------------------------------------------------------------------

# FASE 1 --- Pipeline Estático (1--2 semanas)

## Checklist

### Tools

-   [x] Extraer manifest (apktool)
-   [ ] Ejecutar JADX
-   [ ] Extraer permisos
-   [ ] Detectar componentes exportados
-   [ ] Extraer strings

### Fact Builder

-   [ ] Generar JSON estructurado
-   [ ] Guardar facts

### Rule Engine

-   [ ] exported sin permiso
-   [ ] debuggable
-   [ ] allowBackup

### Output

-   [ ] Generar findings JSON
-   [ ] Mostrar resultados

------------------------------------------------------------------------

# FASE 2 --- Primer Agente (1--2 semanas)

## Checklist

### Model Adapter

-   [ ] Crear interfaz común
-   [ ] Implementar OpenAI
-   [ ] Implementar Ollama

### Static Agent

-   [ ] Input: facts
-   [ ] Output: hipótesis

### Prompt

-   [ ] Definir contexto
-   [ ] Limitar tamaño

### Testing

-   [ ] Validar outputs

------------------------------------------------------------------------

# FASE 3 --- Estado + Orquestador (1 semana)

## Checklist

-   [ ] Crear CaseState
-   [ ] Implementar orquestador
-   [ ] Pipeline básico
-   [ ] Persistencia SQLite
-   [ ] Guardado por fases

------------------------------------------------------------------------

# FASE 4 --- Verificación (1--2 semanas)

## Checklist

### Tools

-   [ ] Configurar adb
-   [ ] Implementar intents
-   [ ] Implementar queries

### Verifier

-   [ ] Validar hipótesis
-   [ ] Generar evidencia

### Testing

-   [ ] Validar casos reales

------------------------------------------------------------------------

# FASE 5 --- Reporting (1 semana)

## Checklist

-   [ ] Generar Markdown
-   [ ] Añadir findings
-   [ ] Añadir evidencias
-   [ ] Clasificar resultados
-   [ ] Export JSON

------------------------------------------------------------------------

# Timeline Estimado

  Fase                Tiempo
  ------------------- --------------
  Setup               2--3 días
  Pipeline estático   1--2 semanas
  Agente              1--2 semanas
  Orquestador         1 semana
  Verificación        1--2 semanas
  Reporting           1 semana

Total: 6--9 semanas

------------------------------------------------------------------------

# MVP Final

``` bash
python run_analysis.py app.apk
```

------------------------------------------------------------------------

# Conclusión

Sistema incremental, reproducible y orientado a evidencia.
