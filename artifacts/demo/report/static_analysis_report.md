# Informe de Análisis Estático

## Resumen ejecutivo  
La aplicación presenta una superficie de ataque considerable: múltiples componentes exportados, flag de **debuggable** activado y respaldo habilitado. El análisis de código revela vulnerabilidades críticas como *ejecución dinámica de comandos* (`Runtime.exec`), *inyección SQL*, *cargas de URL sin validación* en `WebView`, *puntos finales HTTP codificados* y *almacenamiento en texto plano* de datos sensibles (PINs y puntuaciones) en `SharedPreferences`.

## Riesgos prioritarios  
1. Componentes exportados sin protección que exponen lógica de `Runtime.exec` y de inyección SQL a llamantes externos.  
2. `ContentProvider` exportado que permite leer/escribir PINs sensibles sin controles de permiso.  
3. Flag de aplicación debuggable que facilita ingeniería inversa y manipulación.  
4. Enlaces HTTP codificados que exponen datos a ataques MITM.  
5. Persistencia en texto plano de PINs y puntuaciones en `SharedPreferences`.

## Correlaciones relevantes  
- Actividades exportadas (ej.: `RootDetectionActivity`, `InsecureStorageSQLiteActivity`) permiten invocar `Runtime.exec`.  
- `ContentProvider` expuesto a otras apps combinado con PINs sin encriptar en `SharedPreferences`.  
- Flag de debug permite evadir enlaces HTTP y capturar tráfico TLS.  
- Respaldos habilitados pueden exportar preferencias con PINs en texto plano.  
- `BroadcastReceiver` exportado desencadena cargas de `WebView` sin validaciones, exponiendo XSS.

## Posibles candidatos de vulnerabilidad  
| Componente | Vulnerabilidad | Evidencia | Impacto |
|------------|----------------|-----------|---------|
| `RootDetectionActivity` | Ejecución de comandos (`Runtime.exec`) | Uso de `Runtime.getRuntime().exec`. | Elevado (remote code execution). |
| `InsecureStorageSQLiteActivity` y `ContentProviderActivity` | Inyección SQL (concatenación sin parámetros) | `execSQL` con concatenación. | Elevado (data exfiltration/modificación). |
| `ContentProviderActivity` | Exposición sin permiso | Provider exportado, acceso a PINs. | Elevado (privacidad). |
| `TrafficActivity` | Puntos finales HTTP codificados