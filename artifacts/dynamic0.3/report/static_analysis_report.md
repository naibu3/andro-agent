# Static Analysis Report  

## Resumen ejecutivo  
El APK analizado presenta un conjunto de prácticas inseguras que generan un riesgo **alto**. La aplicación expone múltiples componentes (Activities, ContentProviders, Services) sin restricciones de acceso, habilita la depuración en tiempo de ejecución y permite copias de seguridad (`allowBackup=true`). Con permisos peligrosos (INTERNET, CAMERA, STORAGE) combinados con tráfico HTTP sin cifrar, la app facilita la interceptación de datos sensibles. Además, se detecta uso de `Runtime.exec`, consultas SQL sin parametrizar y carga de URLs sin validación en WebViews, lo que abre puertas a inyección de comandos, inyección SQL, XSS y escalada de privilegios.

## Riesgos prioritarios  

| Riesgo | Evidencia | Impacto |
|--------|-----------|---------|
| Componentes *exportados* sin protección | `userpinsprovider`, `SplashActivity`, `AccessControl1ViewActivity` | Hijacking, copia de datos y manipulación externa |
| `android:debuggable="true"` y `allowBackup=true` | Valores encontrados en AndroidManifest | Facilita ingeniería inversa y extracción de datos mediante respaldos |
| `Runtime.exec` expuesto | Código en `InputValidationsOSCMDInjectionMain2Activity` | Ejecutar comandos arbitrarios y enumerar privilegios root |
| Consultas SQL crudas | `rawQuery`, `execSQL` en `SQLinjectionActivity` | Inyección SQL y pérdida de integridad de datos |
| URLs sin sanitizar en WebView | `InputValidationsWebViewURLActivity` | XSS y pérdida de datos sensibles |
| Tráfico HTTP sin cifrar | Endpoints HTTP detectados | Intercepción de credenciales y datos confidenciales |
| SharedPreferences sin cifrar | Persistencia de datos sensibles | Robo de datos vía backups o otras apps |

## Correlaciones relevantes  

1. **Exported + Debbugable** – La combinación permite a atacantes externos analizar y ejecutar código a través de servicios expuestos.  
2. **Runtime.exec + Componentes Exportados** – Permite que interfaces públicas disparen comandos arbitrarios en el dispositivo.  
3. **Permisos peligrosos + Tráfico HTTP** – El uso de `INTERNET` junto con HTTP sin cifrar crea una vía de intercepción directa.  
4. **Raw SQL + Permisos amplios** – Alno permitir consultas sin valorización, un atacante con acceso a la actividad puede inyectar código SQL.  
5. **SharedPreferences sin cifrar + allowBackup** – Los datos sensibles pueden ser recuperados mediante copias de seguridad.

## Posibles candidatos de vulnerabilidad  

- **SplashActivity** (exported) – Puede ser lanzado sin autenticación.  
- **AccessControl1ViewActivity** – Permite lectura/escritura de datos mediante esquema personalizado.  
- **SQLinjectionActivity** – `rawQuery` no parametrizado expone a inyección SQL.  
- **InputValidationsOSCMDInjectionMain2Activity** – `Runtime.exec` vulnerable a inyección de comandos.  
- **InputValidationsWebViewURLActivity** – Carga URLs sin validar permite XSS y ataques de phishing.

## Siguientes pasos recomendados  

1. **Deshabilitar depuración y copias de seguridad**  
   * Editar `AndroidManifest.xml`:  
     ```xml
     <application android:debuggable="false" android:allowBackup="false" …>
     ```
   * Verificar que la compilación final no incluya estos atributos.

2. **Proteger o eliminar componentes exportados**  
   * Reforzar los `<activity>`, `<service>`, `<receiver>`, `<provider>` con `android:export