# Informe de Análisis Estático

## Resumen ejecutivo  
El análisis estático del APK detecta una serie de debilidades a nivel de código que exponen al proyecto a ataques comunes: inyección SQL por consultas crudas, carga de URLs no comprobadas en WebView, ejecución de comandos a través de `Runtime.exec`, tráfico HTTP sin cifrado y escritura de archivos sin autenticación. Además, la aplicación expone múltiples componentes y solicita ocho permisos considerados peligrosos, ampliando su superficie de ataque.

---

## Riesgos prioritarios  

| Riesgo | Evidencia | Impacto |
|--------|-----------|---------|
| **Inyección SQL vía `rawQuery/execSQL`** | “Static analysis reveals multiple code-level weaknesses—including SQL injection via raw queries...”. | Acceso, modificación o eliminación de la base de datos, robo de datos sensibles. |
| **Carga de URLs en WebView sin validación** | “...insecure WebView URL loading...” | Phishing, inyección de contenido y ejecución de JavaScript malicioso. |
| **Ejecución de comandos con `Runtime.exec`** | “...command injection, Runtime.exec...” | Ejecución de código arbitrario con privilegios de la app. |
| **Tráfico HTTP sin cifrado** | “Hard‑coded HTTP URLs (clear‑text traffic)” | Intercepción de datos confidenciales (credenciales, tokens). |
| **Escritura de archivos no autenticada** | “Unauthenticated file writes to arbitrary paths” | Modificación o eliminación de archivos críticos, instalaciones de malware o cambios de configuración. |

---

## Correlaciones relevantes  

1. **Componentes exportados + `rawQuery`**: “Exported components combined with rawQuery could let external apps trigger SQL injection.”  
2. **Permisos peligrosos**: WRITE\_EXTERNAL\_STORAGE y ACCESS\_NETWORK\_STATE permiten escritura de archivos y manipulación de tráfico de red, potenciando los riesgos anteriores.  
3. **Receptores de broadcast exportados + `Runtime.exec`**: “Exported broadcast receivers may trigger Runtime.exec via malicious intent extras.”  
4. **WebView expuesta**: “Component exposure increases reach for WebView loading untrusted URLs.”  
5. **Falta de controles de acceso**: “Permission combinations lack enforceable checks, amplifying credential leakage risk.”

---

## Posibles candidatos de vulnerabilidad  

| Archivo / clase | Línea relevante (si se indica) | Riesgo asociado |
|-----------------|-------------------------------|-----------------|
| `InsecureStorageSQLiteActivity.java` | *archivo mencionado* | Inyección SQL |
| `ContentProviderActivity.java` | *archivo mencionado* | Inyección SQL y acceso no autorizado |
| *Archivo parcial* | *truncado* | Se desconoce, pero correlacionado con los riesgos listados |

*Nota*: Los nombres de archivos están extraídos de la cadena de `vulnerability_candidates` del informe.

---

## Siguientes pasos recomendados  

1. **Revisar consultas SQL en `InsecureStorageSQLiteActivity.java` y `ContentProviderActivity.java`**  
   - Buscar concatenaciones de cadenas y parámetros no sanitizados.  
   - Verificar el uso de `SQLiteDatabase.rawQuery()` o `execSQL()` con entrada de usuario.  
2. **Auditar la implementación de `WebView`**  
   - Confirmar que las URLs cargadas provienen de fuentes confiables.  
   - Habilitar `shouldOverrideUrlLoading` y validar dominios.  
3. **Inspeccionar llamadas a `Runtime.exec`**  
   - Identificar `Runtime.getRuntime().exec(...)`.  
   - Verificar si los argumentos provienen de extras, intentos o datos externos.  
4. **Verificar configuración de red**  
   - Revisar la presencia de `android:usesCleartextTraffic="true"` o URLs HTTP codificadas.  
   - Usar `Network Security Configuration` para forzar HTTPS.  
5. **Validar permiso WRITE_EXTERNAL_STORAGE**  
   - Analizar rutas de escritura (`openFileOutput`, `FileOutputStream`).  
   - Confirmar si se comprueba la existencia y autenticidad de los datos escritos.  
6. **Examinar componentes exportados**