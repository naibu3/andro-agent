# Static Analysis Report
## Resumen ejecutivo
El análisis estático detecta una combinación crítica de exposición a nivel de manifiesto y manejo inseguro de datos dentro de la aplicación.  
- **Componentes exportados** (`MainActivity` y `ProfileInstallReceiver`) se exponen a cualquier aplicación, lo que permite su invocación arbitraria.  
- El código muestra **almacenamiento sensible** (SharedPreferences, archivos de texto plano) sin cifrado, además de **secretos codificados en Base64** y llamadas criptográficas potencialmente débiles.  
- Existe riesgo de **tráfico de red en texto claro** y de que datos críticos se exfiltren a través de los puntos de entrada expuestos.

## Riesgos prioritarios
| Riesgo | Impacto | Evidencia |
|--------|---------|------------|
| `MainActivity` exportado sin protección | Lanza la app desde apps maliciosas | `MainActivity exported` |
| `ProfileInstallReceiver` exportado sin permiso | Recibe intents externos | `ProfileInstallReceiver exported` |
| Tráfico de red en texto claro | Exposición de credenciales | `Cleartext network traffic` |
| SharedPreferences sin cifrar | Almacenamiento de datos sensibles | `Insecure SharedPreferences` |
| Persistencia de archivos en texto plano | Logs/Notas accesibles | `Plain‑text file persistence` |

## Correlaciones relevantes
- Los componentes exportados pueden ser usados para **leer/escribir** las `SharedPreferences` inseguras.  
- El tráfico en texto claro puede transportar los **secrets Base64** almacenados en el código.  
- Con el permiso `MANAGE_EXTERNAL_STORAGE`, los archivos escritos vía `FileOutputStream` pueden ser leídos por otras apps.  
- Los datos de respaldo (`backup data`) podrían exfiltrar notas o credenciales guardadas en archivos o SharedPreferences.  
- El uso de `Cipher.getInstance` sin especificar un algoritmo seguro puede debilitar la protección de los datos almacenados.

## Posibles candidatos de vulnerabilidad
- `MainActivity` sin atributo `exported="false"` ni protección adicional.  
- `ProfileInstallReceiver` sin permiso requerido ni protección.  
- `SharedPreferences` que contienen IPs de servidor o tokens sin encriptar.  
- Escritura de logs/note en archivos externos con nombres predecibles.  
- Cadenas codificadas en Base64 que podrían contener claves API o credenciales.  
- Llamadas a `Cipher.getInstance` con algoritmos obsoletos o modos de operación inseguros.

## Siguientes pasos recomendados
1. **Revisar y actualizar `AndroidManifest.xml`:**  
   - Establecer `exported="false"` o usar una **permiso personalizado** (`android:permission="com.example.SECURE"`) en `MainActivity`.  
   - Habilitar `android:exported="false"` o requerir permisos específicos en `ProfileInstallReceiver`.  
2. **Forzar HTTPS y bloquear tráfico en texto claro:**  
   - Añadir un `networkSecurityConfig` que permita solo HTTPS y rechace conexiones por HTTP.  
3. **Proteger los `SharedPreferences`:**  
   - Cambiar a `MODE_PRIVATE` y cifrar valores sensibles con el Android Keystore (`EncryptedSharedPreferences`).  
4. **Reubicar la escritura de archivos:**  
   - Mover la persistencia a almacenamiento interno y cifrar el contenido, o restringir los permisos de archivo para evitar accesos externos.  
5. **Auditar la utilización de `Cipher.getInstance`:**  
   - Verificar que se usen algoritmos modernos (AES‑GCM, ChaCha20‑Poly1305) con claves gestionadas correctamente.  
6. **Validación manual:**  
   - Inspeccionar el código fuente (o bytecode) buscando instancias de `SharedPreferences.getString(...)` y `FileOutputStream(...)`.  
   - Ejecutar la app en un entorno controlado y disparar los intents en `ProfileInstallReceiver` para confirmar la exposición.  
   - Analizar paquetes de red capturados (Wireshark) para identificar si se envían datos en texto claro o con Base64 codificados.  
   - Revisar el proceso de backup de la app para detectar la persistencia de datos sensibles.

Implementar las corre