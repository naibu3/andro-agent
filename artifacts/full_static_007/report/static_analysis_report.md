# Informe de Análisis Estático

## Resumen ejecutivo  
El análisis combinado muestra un perfil de riesgo multidimensional. El ataque de superficie es amplio debido a componentes exportados sin protección y a permisos peligrosos. Además, existen vulnerabilidades a nivel de código en WebView, interfaces JavaScript y consultas a la base de datos, que pueden ser activadas cuando una aplicación externa accede a estos puntos de entrada y luego interactúa con un WebView o con la base de datos de la app.

## Riesgos prioritarios  
1. **Actividades/Servicios exportados sin autenticación** – las apps externas pueden iniciar `MainActivity`, `SystemJobService`, etc. sin dominio de control.  
2. **Receptores de broadcast no protegidos** – permiten ejecución arbitraria de código.  
3. **Tráfico en claro** – se exponen credenciales y URLs de origen codificado.  
4. **WebView con `loadUrl` sin saneamiento** – vulnerabilidad a XSS y inyección de comandos.  
5. **Interfaces JavaScript expuestas** – exponen código nativo a contenido web no confiable.

## Correlaciones relevantes  
* `MainActivity`, `FirebaseInstanceIdReceiver`, `DiagnosticsReceiver` y `ProfileInstallReceiver` aparecen en flujos que cargan URLs y ejecutan consultas SQL dinámicas.  
* Se permite tráfico en claro mientras que se usan `loadUrl` y `rawQuery` con URL HTTP codificadas.  
* La configuración `FileProvider` con `grantUriPermissions` puede ser abusada junto con la compartición de contenido de WebView.  
* La alta cantidad de permisos peligrosos facilita iniciar servicios y exponer receptores.  
* URLs HTTP hardcodeadas en archivos SDK coinciden con la configuración de red que permite tráfico en claro.

## Posibles candidatos de vulnerabilidad  
* `MainActivity` (exportada, sin protección)  
* `FirebaseInstanceIdReceiver` (exportada, sin protección)  
* `DiagnosticsReceiver` (exportada, sin protección)  
* `ProfileInstallReceiver` (exportada, sin protección)  
* `IonicWebViewEngine.loadUrl` (entrada no saneada)

## Siguientes pasos recomendados  
1. **Restringir componentes exportados** – aplicar políticas `<intent-filter>` o eliminarlos si no son necesarios.  
2. **Actualizar `network_security_config`** – deshabilitar tráfico en claro y forzar HTTPS.  
3. **Revisar permisos peligrosos** – minimizar su uso y solicitar en tiempo de ejecución solo cuando sea indispensable.  
4. **Validar y codificar parámetros de `loadUrl`** – restringir dominios permitidos en WebView.  
5. **Limitar interfaces JavaScript** – exponer únicamente métodos autorizados y removerlos cuando la página no sea confiable.  

---  
**Procedimiento de validación manual recomendado**  
1. Crear un proyecto Android separado con una actividad que invoque cada componente exportado y verificar si se requieren permisos/validaciones.  
2. Realizar un escaneo de tráfico con un proxy SSL para confirmar que el tráfico se realiza en HTTPS tras la actualización.  
3. Inyectar parámetros maliciosos en `loadUrl` para evidenciar XSS o inyección de comandos.  
4. Ejecutar los receptores de broadcast desde una app externa para comprobar la posibilidad de ejecución arbitraria de código.  

Con estos pasos, podrás validar de forma concreta las vulnerabilidades señaladas y determinar el nivel real de riesgo para la aplicación.