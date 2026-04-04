# Arquitectura Propuesta - Sistema Multiagente de Análisis de APKs Android

## 1. Objetivo

Diseñar un sistema multiagente capaz de analizar aplicaciones Android (APK) de forma automatizada, asistiendo a investigadores mediante generación de hipótesis, verificación y reporting estructurado.

------------------------------------------------------------------------
## 2. Principios de diseño

-   Sistema híbrido: herramientas deterministas + LLM + reglas
-   Estado explícito por caso (Case Memory)
-   Separación clara entre hechos, hipótesis y hallazgos
-   Tooling controlado (sin ejecución libre)
-   Soporte para múltiples modelos (cloud y local)
-   Reproducibilidad en entorno local

------------------------------------------------------------------------
## 3. Arquitectura General

### Capas del sistema

1.  Ingesta y Case Manager
2.  Orquestador (State Machine)
3.  Agentes especializados
4.  Tooling Engine
5.  Knowledge & Retrieval (RAG híbrido)
6.  Storage
7.  Sandbox Execution

------------------------------------------------------------------------

## 4. Módulos

### 4.1 Ingesta

-   Entrada: APK
-   Funciones:
    -   Hashing (SHA256)
    -   Extracción básica de metadata
    -   Creación del Case

### 4.2 Orchestrator

-   Control de flujo
-   Routing entre agentes
-   Gestión de estado
-   Gestión de presupuesto (tiempo/coste)

Tecnología: - Python - Agno o LangGraph (opcional) - Lógica determinista

------------------------------------------------------------------------
### 4.3 Agentes

#### Triage Agent

-   Clasificación inicial
-   Identificación de superficie de ataque

#### Static Analysis Agent

-   Análisis de código y configuración
-   Generación de hipótesis

#### Dynamic Verification Agent

-   Diseño y validación de pruebas

#### Reporting Agent

-   Generación de informe estructurado

------------------------------------------------------------------------

### 4.4 Tooling Engine

#### Static Tools

- apktool
- JADX
- Androguard
- aapt2

#### Dynamic Tools

- adb
- Android Emulator
- Frida
- Objection
- mitmproxy - ?
- uiautomator2 - ?

#### Evidence Tools

- almacenamiento de artefactos
- correlación de evidencias

------------------------------------------------------------------------

### 4.5 Knowledge & Retrieval

#### Tipos de RAG

1.  Evidence Retrieval (interno)
2.  Security Knowledge Retrieval

#### Tecnologías

-   SQLite + FTS
-   (Opcional) FAISS o Chroma para embeddings

#### Knowledge Base

-   MASVS
-   CWE mappings
-   Android security patterns

------------------------------------------------------------------------

### 4.6 Storage

#### Raw Artifacts

-   APK
-   logs
-   tráfico
-   outputs herramientas

#### Structured Data

-   SQLite/PostgreSQL

Tablas: - cases - facts - hypotheses - evidence - findings

------------------------------------------------------------------------

### 4.7 Sandbox

Tecnologías: - Docker Compose - Android Emulator - adb - perfiles de
ejecución aislados

Modo: - local_only - hybrid - cloud

------------------------------------------------------------------------

## 5. Modelo de datos

### Case State

``` json
{
  "case_id": "",
  "facts": [],
  "hypotheses": [],
  "findings": [],
  "tool_history": []
}
```

------------------------------------------------------------------------

## 6. Flujo de ejecución

1.  Ingesta APK
2.  Extracción estática inicial
3.  Rule Engine
4.  Triage Agent
5.  Static Analysis Agent
6.  Generación de hipótesis
7.  Verificación dinámica (opcional)
8.  Consolidación de evidencias
9.  Reporting

------------------------------------------------------------------------

## 7. Tecnologías recomendadas

### Backend

-   Python 3.11
-   FastAPI

### Orquestación - TODO

Hay dos opciones:

-   Agno (recomendado para TFM)
-   LangGraph (opcional)

Agno es más simple y rápida de utilizar, pero LangGraph es más profesional.

### Modelos

Para pruebas:
- Openrouter/free

Próximas etapas - TODO checkear cuál es más rápido
-   OpenAI
-   Anthropic
-   Ollama (local)
-   vLLM

### Análisis estático

-   apktool
-   JADX
-   Androguard

### Dinámico

-   Frida
-   adb
-   Android Emulator
-   mitmproxy

### Storage

-   SQLite (TFM)
-   PostgreSQL (opcional)

### RAG

-   SQLite FTS
-   FAISS (opcional)

### Contenerización

-   Docker Compose

------------------------------------------------------------------------

## 8. Estructura de proyecto

    core/
    agents/
    tools/
    knowledge/
    models/
    storage/
    sandbox/
    reporting/

------------------------------------------------------------------------

## 9. MVP recomendado

Incluir: - análisis estático - generación de hipótesis - reporting

Opcional: - verificación dinámica

Excluir: - Kubernetes - multi-worker distribuido - fuzzing avanzado

------------------------------------------------------------------------

## 10. Contribución del TFM

-   Sistema multiagente híbrido para análisis APK
-   Evaluación comparativa de modelos LLM
-   Arquitectura reproducible y extensible
-   Integración de análisis estático + razonamiento LLM
