# Static Analysis Report  
## Resumen ejecutivo  
El análisis estático indica que la aplicación Android presenta **riesgos de alta severidad** derivados de componentes exportados sin protección, ejecución de comandos en tiempo de ejecución (Runtime.exec) sin filtrado, consultas SQL no parametrizadas, configuración debuggable y `allowBackup` activados, y un `ContentProvider` expuesto sin restricciones de permiso. Estas vulnerabilidades crean múltiples superficies de ataque que podrían permitir a un atacante ejecutar código arbitrario, inyectar SQL, extraer datos sensibles y persistir artefactos maliciosos en el dispositivo.

## Riesgos prioritarios  

| Riesgo | Descripción | Impacto |
|--------|-------------|---------|
| Componentes exportados sin protección | Actividad, servicio o receptor sin `android:exported="false"` o con permisos insuficientes | Ejecución arbitraria de código a través de intents externos |
| Uso no filtrado de `Runtime.exec` | Llamadas a `Runtime.exec` sin validación o sanitización | Inyección de comandos shell y ejecución remota |
| Consultas SQL sin parámetros | Sentencias SQL construidas concatenando strings | Inyección de SQL que permite leer/escribir datos sensibles |
| `debuggable=true` y `allowBackup=true` | Permiten depuración remota y backup sin cifrado | Exposición de SharedPreferences y archivos sensibles |
| `ContentProvider` expuesto sin permiso | Lectura/escritura directa desde cualquier aplicación | Exfiltración y modificación de datos críticos |

## Correlaciones relevantes  

* Los componentes exportados pueden activar directamente las llamadas a `Runtime.exec`, combinando la vulnerabilidad de componentes no protegidos con la de ejecución de comandos.  
* La presencia de `debuggable` y `allowBackup` facilita la extracción de datos que pudieron haber sido escritos por `SharedPreferences` sin cifrado.  
* Si la aplicación cuenta con permisos peligrosos (por ejemplo, `WRITE_EXTERNAL_STORAGE`), un atacante puede aprovechar las consultas SQL sin parámetros para insertar instrucciones con fines maliciosos.  
* El `ContentProvider` expuesto permite a terceros leer/escribir archivos creados mediante `FileOutputStream` sin protección, ampliando la superficie de exfiltración.  
* Una actividad WebView exportada que carga URLs sin validar puede ser utilizada para inyección de XSS o como canal de comando.

## Posibles candidatos de vulnerabilidad  

- `artifacts/optimization1/jadx/sources/owasp/sat/agoat/RootDetectionActivity.java`  
- (indicaciones de otras rutas truncadas, pero la información completa no está disponible en el reporte actual)

## Siguientes pasos recomendados  

1. **Revisión manual del AndroidManifest.xml**  
   - Verificar todas las etiquetas `<activity>`,