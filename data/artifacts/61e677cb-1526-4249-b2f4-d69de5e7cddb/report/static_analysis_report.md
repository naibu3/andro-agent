# Static Analysis Report

## Resumen ejecutivo  
El análisis estático indica que la aplicación **expose múltiples componentes sin la debida protección** y contiene patrones de código que pueden derivar en inyección de SQL, ejecución de comandos del sistema, XSS en `WebView` y tráfico de red en texto claro. Estas vulnerabilidades recrean un amplio vector de ataque al mismo tiempo que se observan permisos peligrosos (e.g., `READ/WRITE_EXTERNAL_STORAGE`) sin restricciones en los componentes exportados.

## Riesgos prioritarios  
| Riesgo | Evidencia encontrada | Implicación |
|--------|-----------------------|------------|
| **Componentes exportados sin protección de permisos** | Múltiples `Activities`/`Services` exportados identificados en el manifiesto. | Permite que cualquier aplicación externa invoque funciones sensibles. |
| **Consultas SQL no parametrizadas** | Uso de `rawQuery`/`execSQL` con parámetros concatenados. | Posibilidad de inyección de SQL. |
| **Ejecución de comandos con `Runtime.exec` mediante entrada externa** | Llamadas a `Runtime.exec()` que aceptan parámetros derivados de la entrada del usuario. | Permite la ejecución de comandos arbitrarios en el dispositivo. |
| **`WebView.loadUrl` con datos no confiables** | `WebView` cargando URLs construidas a partir de entrada no validada. | Riesgo de XSS host‑based y carga de contenido malicioso. |
| **Puntos finales HTTP codificados y tráfico claro** | URL estáticas en el código texto plano. | Exposición de credenciales y datos sensibles en red. |

## Correlaciones relevantes  
- Los *componentes exportados* coinciden con las rutas vulnerables de `Runtime.exec` y consultas SQL, aumentando las posibilidades de explotación desde otras apps.  
- Los permisos `READ/WRITE_EXTERNAL_STORAGE` se otorgan sin controles en los componentes exportados, favoreciendo la manipulación de archivos y la inyección de datos.  
- El uso de `WebView` en componentes exportados, junto con la carga de URLs sin validación, expande el riesgo a ataques XSS basados en el host.

## Posibles candidatos de vulnerabilidad  
- **Exported Activity/Service**: Sin `android:exported="false"` o sin `intent-filter` con `android:permission`.  
- **SQL Injection paths**: `rawQuery("SELECT * FROM table WHERE id=" + userInput)`.  
- **Command Injection paths**: `Runtime.getRuntime().exec("sh -c " + shellCommand)`.  
- **WebView content injection**: `webView.loadUrl("https://example.com/page?id=" + userId)`.  
> (Este informe no identificó candidatos concretos de vulnerabilidad más allá de las correlaciones y los riesgos listados; se recomienda una revisión de código más profunda.)

## Siguientes pasos recomendados  

1. **Revisar y restringir componentes exportados**  
   - Añadir `android:exported="false"` a cada `Activity`, `Service` y `BroadcastReceiver` que no necesite ser accesible desde otras apps.  
   - Si deben permanecer exportados, exigir permisos específicos (`android:permission`) y validar los `Intent` entrantes.

2. **Auditar consultas SQL**  
   - Refactorizar a consultas parametrizadas (`SQLiteDatabase#rawQuery(String, String[])`).  
   - Implementar validaciones y sanit