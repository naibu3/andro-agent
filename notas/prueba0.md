---
version: 0.1
---

# Prueba 0

## Resumen

Prueba inicial del proyecto, se han definido los objetivos del proyecto: implementar una herramienta guiada por IA agéntica que realice un análisis de vulnerabilidades automatizado sobre un archivo apk.

Además se han definido algunas características:

- Sandbox aislado de pruebas con herramientas para el uso del agente en Ubuntu server 24.04 LTS
- Agno como framework de orquestación y OpenRouter como proveedor de APIs de agentes remotos
- Subida de ficheros con Telegram

## Estructura propuesta

Por ahora se trata de un único agente que se invoca una vez y analiza todo el conjunto de la aplicación.

## Observaciones

Las salidas con muy irregulares, a menudo reporta pocas vulnerabilidades y pierde contexto.

## Conclusiones y próximos pasos

Una única llamada al agente provoca pérdidas de contexto y alucinaciones. Probablemente dividir la ejecución en múltiples llamadas con propósitos más específicos ayude.