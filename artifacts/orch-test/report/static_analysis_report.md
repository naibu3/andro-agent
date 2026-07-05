# Static Analysis Report

## Resumen ejecutivo  
La revisión estática del paquete **“orch‑test”** muestra un conjunto de amenazas potenciales derivados de componentes exportados sin protección, configuraciones de depuración y respaldo habilitadas y varias vulnerabilidades de nivel de código. En particular, se observan llamadas a **`Runtime.exec`**, consultas SQL sin parámetro, URLs HTTP codificadas en claro y almacenamiento inseguro en **`SharedPreferences`**. Este escenario facilita vectores de ataque que van desde modificaciones de datos en la base interna hasta elevación de privilegios y exfiltración de la información del dispositivo.

---

## Riesgos prioritarios

| # | Riesgo | Evidencia |
|---|--------|-----------|
| 1 | Componentes exportados sin permisos seguros | `exported="true"` en Activities/Services/ContentProvider |
| 2 | `android:debuggable="true"` y `android:allowBackup="true"` | Valoraciones en **AndroidManifest.xml** |
| 3 | Consultas SQL sin parámetros | Uso de concatenación de cadenas en `ContentProviderActivity` y `InsecureStorageSQLiteActivity` |
| 4 | Uso de `Runtime.exec()` sin sanitizar | `RootDetectionActivity`, `InputValidationsOSCMDInjectionMain2Activity` |
| 5 | URLs HTTP codificadas | Endpoints hard‑coded en código y filtros de intentos (`schema "androgoat"`) |

---

## Correlaciones relevantes

1. **Exportado + SQL sin parámetro**  
   El ContentProvider exportado permite que cualquier aplicación externa invoque la base de datos que se construye con consultas sin parámetros, abriendo un vector SQL injection intrínsecamente accesible.
2. **Exportado + Runtime.exec**  
   La exposición de actividades que ejecutan `Runtime.exec()` permite a actores maliciosos disparar comandos del sistema a través de interfaces públicas.
3. **Debug/Backup + SharedPreferences**  
   Cuando el componente puede ser respaldado y el APK se vive en modo depuración, la información almacenada en SharedPreferences queda susceptible a captura, ya que no está cifrada.
4. **HTTP hard‑coded + Intent filters**  
   Los endpoints en claro pueden ser interceptados y manipulados por atacantes que puedan registrar tráfico de red o aprovechar los filtros de intentos que exponen el esquema “androgoat”.

---

## Posibles candidatos de vulnerabilidad

| Tipo | Detalle | Acción posible |
|------|---------|----------------|
| **SQL Injection** | `ContentProviderActivity`, `InsecureStorageSQLiteActivity` | Inyección de operaciones SELECT/UPDATE/DELETE |
| **Command Injection** | `Runtime.exec()` en `RootDetectionActivity`, `InputValidationsOSCMDInjectionMain2Activity` | Ejecución arbitraria de comandos del shell |
| **Exfiltración de datos** | `android:allowBackup`, uso no cifrado de `SharedPreferences` | Copia de configuración y datos sensibles mediante backup |
| **XSS/Redirección WebView** | `InputValidationsWebViewURLActivity` | Cargar contenido malicioso a través de WebView |
| **Interceptación de tráfico** | URLs HTTP hard‑coded | Intercambio y modificación de datos entre cliente/apk y servidor |

---

## Siguientes pasos recomendados

1. **Deshabilitar depuración y respaldo**  
   - Cambiar `<application android:debuggable="false" android:allowBackup="false" …>` en el `AndroidManifest.xml`.  
   - Eliminar construcciones de debug antes de publicar.

2. **Proteger los componentes exportados**  
   - Establecer `android:exported="false"` para Activities, Services y ContentProviders siempre que no requieran acceso externo.  
   - Si la exportación es necesaria, exigir permisos personalizados (`android:permission`) y validar permisos antes del negocio lógico.

3. **Mitigar las consultas SQL**  
   - Refactorizar para usar consultas parametrizadas (`?` / `?` placeholders) o un ORM como Room.  
   - Validar y sanitizar cualquier dato proveniente del exterior antes de incluirlo en la consulta.

4. **Enfocar los `Runtime.exec()`**  
   - Eliminar los `exec()` siempre y cuando no sean esenciales.  
   - Si se mantienen, encapsular la ejecución en un `ProcessBuilder` con entradas estrictamente validadas y restringir el alcance (p. ej., evitar rutas arbitrarias y usar listas blancas de comandos).

5. **Cifrar la comunicación**  
  