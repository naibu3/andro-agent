# Static Analysis Report

## Resumen ejecutivo
El análisis revela que el APK presenta un amplio superficie de ataque debido a componentes exportados sin protección, construcción debuggable y configuraciones de backup habilitadas. Además, se detectan vulnerabilidades a nivel de código, como consultas SQL sin parametrizar, llamadas a `Runtime.exec`, almacenamiento inseguro y exponer puertos de red. Estas condiciones inducen caminos probables de escalada de privilegios, fuga de datos y inyección.

## Riesgos prioritarios
| # | Riesgo | Evidencia |
|---|--------|-----------|
| 1 | Componentes exportados sin protección | Actividades/servicios declarados con `android:exported="true"` en el manifest y sin parámetros de seguridad (`android:permission`). |
| 2 | ContentProvider expuesto sin permisos | `ContentProviderActivity` exportado y expone un proveedor de datos sin tener `android:readPermission` / `android:writePermission`. |
| 3 | `Runtime.exec` susceptible a inyección | Usado en `RootDetectionActivity` e `InputValidationsOSCMDInjectionMain2Activity` con argumentos no sanitizados. |
| 4 | Consultas SQL sucias | `InsecureStorageSQLiteActivity` y `ContentProviderActivity` construyen sentencias SQL con concatenación de texto. |
| 5 | Construcción debuggable y backup habilitado | `android:debuggable="true"` y `android:allowBackup="true"` permiten inspección y copia de datos sensibles durante el desarrollo. |

## Correlaciones relevantes
- **Exportado + SQL** – El `ContentProviderActivity` exportado y su uso de SQL sin parametrizar incrementa la exposición de los datos.  
- **Exportado + `Runtime.exec`** – Los `exported` broadcasts y actividades que hacen `Runtime.exec` vinculan la superficie de IPC con la inyección de comandos.  
- **Backup + Endpoint HTTP** – La combinación de `allowBackup="true"` y las URLs codificadas en `TrafficActivity` puede exfiltrar datos al restablecer una copia de seguridad.  
- **Debuggable + URLs hardcodeadas** – La presencia del flag `debuggable` facilita la interceptación de peticiones HTTP definidas de forma fija y sin validación.  
- **Receivers exportados + WebView** – Los `BroadcastReceiver` exportados y la carga dinámica de URLs en un `WebView` abren vector de ataque para “Deep-Linking” y redireccionamientos maliciosos.

## Posibles candidatos de vulnerabilidad
| Archivo | Riesgo asociado |
|---------|-----------------|
| `artifacts/dynamic0.2/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java` | ContentProvider expuesto + SQL inyección |
| `artifacts/dynamic0.2/jadx/sources/owasp/sat/agoat/InputValidationsOSCMDInjectionMain2Activity.java` | `Runtime.exec` con argumentos no sanitizados |
| `artifacts/dynamic0.2/jadx/sources/owasp/sat/agoat/RootDetectionActivity.java` | `Runtime.exec` sin validación |
| `artifacts/dynamic0.2/jadx/sources/owasp/sat/agoat/InsecureStorageSQLiteActivity.java` | Almacenamiento SQLite sin cifrado + SQL concatenada |
| `artifacts/dynamic0.2/jadx/sources/owasp/sat/agoat/TrafficActivity.java` | URLs hardcodeadas + uso de `allowBackup` |

## Siguientes pasos recomendados
1. **Desactivar construcción debuggable**  
   - Quitar o establecer `android:debuggable="false"` en el manifest para todas versiones de producción.  
   - Revisar los `build.gradle` para asegurar que la build release no incluya el flag.

2. **Deshabilitar allowBackup**  
   - Cambiar `android:allowBackup="false"` o manipular políticas de backup mediante `android:allowBackup="true"` con restricciones de datos sensibles.

3. **Restringir componentes exportados**  
   - Añadir `android:protectionLevel="signature"` o definir permisos personalizados (`android:permission`).  
   - Revisar cada actividad, servicio y receptor que tenga `android:exported="true"` y evaluarlos según si realmente deben ser accesibles externamente.

4. **Remediar ContentProvider & SQL**  
   - Imponer `android:readPermission` y `android:writePermission`.  
   - Refactorizar las consultas para usar `SQLiteQueryBuilder`