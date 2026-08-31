# Informe de Análisis Estático

## Resumen ejecutivo  
El análisis de la aplicación Android reveló una superficie de ataque elevada. Se identificaron múltiples componentes exportados sin controles de permiso, construcción depurables y respaldos habilitados. A nivel de código, existen vulnerabilidades críticas: ejecución dinámica de comandos mediante `Runtime.exec`, consultas SQL sin parametrizar, exposición de URLs HTTP sin cifrado y carga de URLs no confiables en un `WebView`. Estas debilidades pueden resultar en exfiltración de datos, inyección de comandos, MITM y la ejecución remota de código.

## Riesgos prioritarios  
| Riesgo | Impacto | Evidencia | Comentario |
|--------|---------|-----------|------------|
| Invocación no autorizada de componentes exportados | Elevado | Varios `android:exported="true"` en `AndroidManifest.xml` sin restricciones de permiso | Puede permitir que aplicaciones maliciosas accedan a datos sensibles. |
| ContentProvider abierto sin permiso | Muy alto | `ContentProviderActivity` expuesto sin `android:permission` | Permite lectura/escritura arbitraria de la base de datos. |
| Ejecución dinámica de comandos | Alto | `Runtime.exec` en `InputValidationsOSCMDInjectionMain2Activity` | Riesgo de inyección de comandos OS. |
| Inyección SQL sin parametrizar | Alto | `rawQuery`/`execSQL` en `SQLinjectionActivity` | Posibilidad de manipulación de la base de datos. |
| Exposición a MITM con URLs HTTP | Medio | URLs hardcoded en `TrafficActivity` y permiso `INTERNET` | Expuestas a sniffing y ataques de intermediario. |
| Carga de URLs no confiables en `WebView` | Medio | `InputValidationsWebViewURLActivity`| Riesgo de SSRF, XSS y fuga de información. |

## Correlaciones relevantes  
- **Provider sin permiso**: `ContentProviderActivity.java` implementa un `ContentProvider` exportado que coincide con la declaración de exposición en el `AndroidManifest.xml`.  
- **Ejecución de comandos**: En `InputValidationsOSCMDInjectionMain2Activity.java`, `Runtime.exec` se activa a través de intents que podrían ser disparados por componentes exportados.  
- **Inyección SQL**: `SQLinjectionActivity.java` ejecuta consultas crudas (`rawQuery/execSQL`) con entradas del usuario, coincidiendo con posibles disparadores exportados.  
- **Tarifas HTTP**: `TrafficActivity.java` utiliza URLs HTTP codificadas y la aplicación posee el permiso `INTERNET`.  
- **WebView sin control**: `InputValidationsWebViewURLActivity` carga URLs externas no verificadas y hay un `WebView` exportado, aumentando la superficie de ataque.

## Posibles candidatos de vulnerabilidad  
1. **ContentProviderActivity** – Lectura/escritura arbitraria de datos sin protección de permiso.  
2. **Runtime.exec en InputValidationsOSCMDInjectionMain2Activity** – Inyección de comandos OS a través de entrada externa.  
3. **SQLinjectionActivity** – Inyección SQL por uso de consultas no parametrizadas.  
4. **TrafficActivity** – Exposición a MITM por URLs HTTP hardcoded.  
5. **InputValidationsWebViewURLActivity** – Carga de URLs no confiables en `WebView`, potencial SSRF/XSS.

## Siguientes pasos recomendados  
1. **Control de componentes exportados**  
   - Revisar cada `android:exported="true"` en el manifiesto.  
   - Añadir `android:exported="false"` para aquellos no necesarios o requerir un `android:permission` autorizado.  
2. **Configuración de la compilación**  
   - Deshabilitar depuración: `android:debuggable="false"` en el `AndroidManifest` o a través del script Gradle.  
   - Desactivar `android:allowBackup="false"` si el respaldo no es requerido.  
3. **Seguridad de la base de datos**  
   - Refactorizar consultas en `SQLinjectionActivity` y demás archivos para

## Analysis metadata

- Profile: `full`

## LLM static investigation candidates

These candidates were proposed by the static investigation agent and should be manually reviewed. They are kept separate from deterministic findings.

### [CRITICAL] OS Command Injection in InputValidationsOSCMDInjectionMain2Activity

- Confidence: `high`
- Evidence IDs: `EVID-3F2AD89FFC6C`

The application performs unsafe command execution by concatenating unsanitized user input from an EditText into a command string used by Runtime.exec(). This can lead to arbitrary command execution on the device.

Why it may not have been detected by deterministic rules: The finding was detected by the rule engine, but the specific sink-to-source flow (OS Command Injection) requires manual verification of the input source.

Remediation: Avoid using Runtime.exec() with string concatenation. Instead, use a list of arguments to prevent shell interpretation, or use safer APIs for specific tasks like network connectivity checks.
