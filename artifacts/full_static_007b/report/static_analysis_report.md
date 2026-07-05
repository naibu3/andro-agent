# Análisis Estático de la Aplicación Android

## Resumen ejecutivo  
La inspección estática revela una superficie de ataque extensa. Se detectaron **actividades exportadas sin filtrado de permisos**, habilitación de **debug** y **backup** sin protección, uso de **tráfico en texto claro** y una serie de vulnerabilidades a nivel de código: ejecución de `Runtime.exec`, carga de URLs no filtradas en `WebView`, cifrado AES en modo `ECB` sin autenticación, y escritura de archivos sin restricciones. Estas debilidades, aisladas y combinadas, crearían vías para exfiltración de datos o ejecución arbitraria.

## Riesgos prioritarios  

| # | Riesgo | Evidencia | Impacto |
|---|--------|-----------|---------|
| 1 | Actividades exportadas sin controles | `android:exported="true"` en `MainActivity`, `InsecureCryptoActivity`, `VulnWeb` | Inyección de intents y filtrado de datos. |
| 2 | Tráfico en texto claro | Permiso de `usesCleartextTraffic` no restringido | Interceptación de peticiones y exfiltración de datos. |
| 3 | `Runtime.exec` sin validación | `Runtime.exec("/system/bin/grep -c root …")` en `RootBeer.java` | Ejecución de comandos arbitrarios. |
| 4 | `WebView.loadUrl` con contenido no filtrado | `VulnWeb.java` llama a `loadUrl` con cadena externa | Redirecciones web maliciosas y fugas de datos. |
| 5 | Cifrado AES/ECB débil | `CryptoUtil.java` usa `Cipher.getInstance("AES/ECB/PKCS5Padding")` | Compromiso de la confidencialidad de la información. |

## Correlaciones relevantes  
- **Exported VulnWeb** → `WebView.loadUrl` con contenido controlado por manifiesto, potencial para carga de URLs arbitrarias.  
- **Debuggable build** → `Runtime.exec` de RootBeer expuesto a manipulaciones en tiempo de ejecución.  
- **Permisos de almacenamiento** + `FileOutputStream` hacia directorios compartidos → riesgo de exfiltración por backup (`allowBackup`).  
- **Cleartext traffic** → posibilidad de escuchar y modificar la comunicación que podría contener datos cifrados (AES).  

## Posibles candidatos de vulnerabilidad  
- Actividades con `android:exported="true"` sin permisos: `MainActivity`, `InsecureCryptoActivity`, `VulnWeb`.  
- `WebView.loadUrl()` llamado con variable no sanitizada.  
- Uso de `AES/ECB/PKCS5Padding` en `CryptoUtil`.  
- `Runtime.exec()` en `RootBeer` sin sanitizar la entrada.  
- `FileOutputStream` escribe en `/sdcard/...` sin declaración de `WRITE_EXTERNAL_STORAGE`.

## Siguientes pasos recomendados  

1. **Deshabilitar Debug**  
   - Remplazar `android:debuggable="true"` por `false` o eliminar la propiedad.  
   - Revisar la configuración de construcción (`build.gradle`) para asegurar que no se exponga en producción.  

2. **Habilitar `allowBackup="false"`** o aplicar reglas de backup seguro.  
3. **Restringir actividades exportadas**  
   - Añadir `android:exported="false"` o mecanismos de autorización (`permission`, `intent-filter`) alrededor de cada actividad exportada.  

4. **Bloquear tráfico en claro**  
   - Establecer `android:usesCleartextTraffic="false"` en el manifiesto.  
   - Asegurar que todas las conexiones utilicen TLS 1.2+.  

5. **Limpiar la entrada de `WebView.loadUrl`**  
   - Implementar una lista blanca de dominios permitidos.  
   - Sanitizar parámetros de URL y evitar concatenar directamente con datos externos.  

6. **Cambiar la implementación de AES**  
   - Migrar a `AES/GCM/NoPadding` u otro modo autenticado.  
   - Gestionar clave de forma segura (Android KeyStore o API similar).  

7. **Sanitizar la ejecución de procesos**  
   - Validar cualquier argumento pasado a `Runtime.exec`.  
   - Considerar eliminar código innecesario