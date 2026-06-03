# Static Analysis Report

## Resumen ejecutivo
El análisis estático de la APK revela una superficie de ataque considerable. Se detectan componentes exportados sin restricciones, modo de depuración habilitado y permisos críticos. Además, el código contiene varios defectos de alto riesgo, como `Runtime.exec` sin restricciones, consultas SQL no parametrizadas, almacenamiento inseguro de datos sensibles y uso débil de AES/CBC. Cuando los puntos de entrada expuestos (UI o servicios) activan estos caminos de código inseguros, los riesgos se potencian.

## Riesgos prioritarios
- **Acceso no autorizado a componentes exportados** que permite ejecución de comandos o filtraciones de datos.  
- **SharedPreferences sin cifrar** expuestas vía provider exportado.  
- **Inyección de SQL o XSS** a través de entrada no confiable en WebView y consultas dinámicas.  
- **URLs de red codificadas** y habilitación de respaldo/debug facilitando la ingeniería inversa.  
- **AES/CBC débil** con IV estático, propenso a ataques de canal lateral y reutilización de flujo de clave.

## Correlaciones relevantes
| Componente Expuesto | Función Crítica | Riesgo Potencial |
|---------------------|-----------------|------------------|
| Servicios sin permiso + `Runtime.exec` | Ejecución arbitraria | Acceso remoto y bypass de sandbox |
| Provide content sin permiso + `SharedPreferences` plano | Lectura de PIN y datos sensibles | Filtración de credenciales |
| WebView sin sanitización + consultas dinámicas | Inyección SQL/XSS | Acceso o modificación de base de datos |
| URLs hardcode + backup/debug | Exposición de endpoints | Rastrear backend y diccionarios de contraseñas |
| AES/CBC con IV stateless + respaldo no cifrado | Desencriptar datos | Compromiso de datos confidenciales |

## Posibles candidatos de vulnerabilidad
- **Runtime.exec** en `DownloadInvoiceService` llamado por cualquier aplicación externa.  
- **SQL no parametrizado** en `InsecureStorageSQLiteActivity` accedido a través de intents de `AccessControl1ViewActivity`.  
- **URL dinámica** cargada por `WebView` en `InputValidationsWebViewURLActivity`.  
- **PINs** almacenados en plain `SharedPreferences`, accesibles por content provider exportado.  
- **AES/CBC** en `TrafficActivity` con IV estático que puede exponer el keystream.

## Siguientes pasos recomendados
1. **Restricción de componentes exportados**  
   - Marcar `android:exported="false"` para todos los servicios, activities y providers que no necesiten ser accesibles externamente.  
   - Añadir controles de permisos (`checkCallingOrSelfPermission`) en los exportados.

2. **Eliminación de `Runtime.exec`**  
   - Sustituir por APIs propias de Android donde sea posible o bloquear su uso si no es crítico.  
   - Validar explícitamente los argumentos antes de su ejecución.

3. **Uso de consultas parametrizadas**  
   - Refactorizar `InsecureStorageSQLiteActivity` para emplear `SQLiteStatement` o `PreparedStatement`.  
   - Filtrar y validar todas las entradas de usuario antes de construir cualquier consulta SQL.

4. **Protección de datos sensibles**  
   - Migrar PINs y datos críticos a `EncryptedSharedPreferences` o `Android Keystore`.  
   - Restringir el acceso al content provider mediante permisos personalizados y verificación de `callerUniqueId`.

5. **Mejora de la criptografía**  
   - Cambiar a modos de operación autenticados y contemporáneos como AES/GCM o ChaCha20-Poly1305.  
   - Garantizar que cada operación use un IV único y aleatorio, almacenado de forma segura o derivado.

6. **Revisión de hardcoding y depuración**  
   - Remover cadenas de URLs fijas o hacerlas configurables vía build-variants.  
   - Deshabilitar versiones de lanzamiento de las funciones de backup y debug, y añadir controles de firma para evitar erosion de la capa de seguridad.

Al abordar estos puntos con validaciones manuales (por ejemplo, pruebas de sandbox, análisis de intents y revisiones de datos en tiempo de ejecución), se reducirá significativamente la superficie de ataque y la probabilidad de explotación.