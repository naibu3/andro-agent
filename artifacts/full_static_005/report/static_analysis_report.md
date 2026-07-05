# Static Analysis Report  
**Case ID**: `full_static_005`  
**APK**: `samples/app-debug.apk`  
**Fecha de generación**: 2026-04-04  

## Resumen ejecutivo  
El análisis estático ha revelado varios vectores de ataque de alto riesgo.  
- La aplicación está construida en modo **debuggable** y permite **backups**, lo que facilita la ingeniería inversa y la exfiltración de datos.  
- Tres actividades se exponen sin protección por permiso (`MainActivity`, `InsecureCryptoActivity`, `VulnWeb`).  
- Se detecta uso de `Runtime.exec()` para chequeos de root, y la aplicación permite `usesCleartextTraffic`.  
- El código incluye `WebView.loadUrl()` con datos potencialmente no sanitizados y uso de `Cipher.getInstance("AES/ECB/...")`, una cifra insegura.  
- Se observan patrones de `execSQL` y `rawQuery` sin parámetros, lo que abre la puerta a inyecciones SQL.

## Superficie de ataque  
| Área | Rango | Evidencia | Comentario |
|------|-------|-----------|------------|
| **Componentes exportados sin permiso** | 3 | `MainActivity`, `InsecureCryptoActivity`, `VulnWeb` (exported=false: *no*? ; serializer shows exported=true). | Atacantes externos pueden iniciar actividad. |
| **Modo Debuggable** | 1 | `android:debuggable=true` | Facilita depuraciones y extracción de código. |
| **Backups permitidos** | 1 | `allowBackup=true` | Riesgo de exfiltración de datos sensibles a través del backup. |
| **Tráfico claro** | 1 | `usesCleartextTraffic=true` | Datos podrían transmitirse sin cifrado. |
| **Root‑check con Runtime.exec** | 4 | `Runtime.getRuntime().exec(...)` en varias clases | Posible ejecución de comandos arbitrarios. |
| **WebView con loadUrl** | 2 | `loadUrl(String.valueOf(content))` y `$webView.loadUrl(url)` | Inyección de contenido no con confianza. |
| **SQL inseguro** | 2 | `execSQL()` y `rawQuery()` con cadenas estáticas | Posible SQL injection. |
| **Criptografía insegura** | 1 | `Cipher.getInstance("AES/ECB/...")` | Modo ECB no recomendado. |

## Hallazgos del manifest  
1. **MANIFEST_DEBUGGABLE_ENABLED** – `application:debuggable=true` (severidad: **media**)  
2. **MANIFEST_ALLOW_BACKUP_ENABLED** – `allowBackup=true` (media)  
3. **MANIFEST_CLEARTEXT_TRAFFIC_ENABLED** – `usesCleartextTraffic=true` (media)  
4. **3 actividades exportadas sin permiso**  
   * `id.blackbear.vulnapk.MainActivity` (exported=true)  
   * `id.blackbear.vulnapk.InsecureCryptoActivity` (exported=true)  
   * `id.blackbear.vulnapk.VulnWeb` (exported=true)  

## Hallazgos de código  
| Tipo | Fase | Línea (ejemplo) | Severidad | Comentario |
|------|------|-----------------|-----------|------------|
| **WebView.loadUrl** | Ada | `this.webView.loadUrl(String.valueOf(content));` | media | Entrada no sanitizada. |
| **SQL rawQuery** | Ada | `sQLiteDatabase.rawQuery(qry, null)` | media | Posible injection. |
| **SQL execSQL