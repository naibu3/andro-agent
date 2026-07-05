# Informe de Análisis Estático

## Resumen ejecutivo  
El análisis detecta una superficie de ataque amplia: muchas actividades, receptores y un proveedor están exportados sin restricciones adecuadas; la aplicación declara 44 permisos peligrosos (entre ellos `SYSTEM_ALERT_WINDOW`, `CAMERA`, `RECORD_AUDIO`, y acceso a almacenamiento externo). Se hallaron **patrones inseguros** que incluyen:

- Llamadas a `WebView.loadUrl` sin validar el origen de la URL.  
- Interfaz de JavaScript expuesta (`JavaScriptInterface`) que permite que código web acceda a APIs nativas de Android.  
- Uso de consultas SQL crudas (`execSQL`) y de `Runtime.exec`.  
- URLs HTTP codificadas estáticamente, provocando transmisión de datos en texto plano.  

Estos factores combinan la posibilidad de *intent hijacking*, filtración de datos, XSS / ejecución remota de código, inyección SQL/command y exposición de datos sensibles a la red.

## Riesgos prioritarios  
1. **Componentes exportados sin protección** – expuestos a *intent hijacking* y punto de entrada no autorizado.  
2. **Archivo de respaldo y proveedor de archivos sin seguridad** – fuga potencial de datos (allowBackup, FileProvider no restringido).  
3. **WebView con carga de URLs no validadas** – vulnerabilidad XSS y ejecución remota de código.  
4. **Interfaces JavaScript expuestas** – vulnerabilidad de ejecución de código a través del navegador web.  
5. **SQL y ejecución de comandos con `execSQL` / `Runtime.exec`** – riesgo de inyección de código y manipulación de recursos del sistema.

## Correlaciones relevantes  
- La falta de permisos sobre componentes exportados agrava la capacidad de un atacante de aprovechar la interfaz de JavaScript y las llamadas de `Runtime.exec`.  
- La presencia de URLs HTTP codificadas y el uso inseguro de WebView podrían exponer datos factúlicos a sistemas de backup o a proveedores de archivos expuestos.  
- La combinación de código crudo (SQL/Runtime.exec) con componentes exportados abre la posibilidad de invocar estos métodos a través de receptores maliciosos.  
- Los permisos peligrosos aumentan los vectores de ataque para las vulnerabilidades identificadas.

## Posibles candidatos de vulnerabilidad  
| # | Archivo | Puntos de riesgo | Evidencia |
|---|---------|------------------|-----------|
| 1 | `com/stripe/hcaptcha/webview/HCaptchaWebViewHelper.java` | `WebView.loadUrl` sin validación | `WebView.loadUrl` carga URLs no confiables. |
| 2 | `com/facebook/react/modules/systeminfo/AndroidInfoHelpers.java` | Interfaz JavaScript expuesta | `JavaScriptInterface` que expone APIs Android. |
| 3 | `com/google/android/datatrans` (código truncado) | Consulta SQL cruda | `execSQL` utilizado directamente con parámetros no sanitizados. |
| 4 | Cualquier local con `Runtime.exec` | Ejecución de comandos arbitrarios | `Runtime.exec` llamado probablemente a través de recursos externos. |

> *Nota:* El JSON original fue truncado; la lista completa de candidatos debe revisarse en el código fuente.

## Siguientes pasos recomendados  
1. **Revisar y restringir componentes exportados**  
   - Añadir `android:exported="false"` o exigir permisos (`android:permission=`) cuando sea necesario.  
   - Verificar los `intent-filters` y eliminar aquellos no requeridos.

2.