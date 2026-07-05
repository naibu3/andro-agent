# Informe de Análisis Estático

## Resumen ejecutivo
El análisis indica que la aplicación expone **seis componentes exportados** y solicita **ocho permisos críticos**. Se detectaron **50 patrones de uso inseguro** en áreas de almacenamiento, red, criptografía y ejecución de comandos, lo que genera una superficie de ataque alta con vulnerabilidades de riesgo de **alto a medio**. Los hallazgos destacan riesgos en la ejecución de comandos en tiempo de ejecución, inyección SQL, WebView sin validación, puntos finales HTTP en texto plano y almacenamiento local inseguro.

## Riesgos prioritarios
| Riesgo | Nivel | Evidencia clave |
|--------|-------|-----------------|
| Ejecución de comandos en *Runtime.exec* | Alto | Se identificaron llamadas a `Runtime.exec` con entradas potencialmente no controladas. |
| Inyección SQL via `rawQuery`/`execSQL` | Medio | Se observa uso de consultas SQL sin preparación en base de datos. |
| WebView `loadUrl` sin validación | Medio | La actividad exportada crea `WebView` con `loadUrl` de origen externo. |
| Endpoints HTTP en texto plano | Medio | Se encontraron URLs HTTP estáticas en el código fuente. |
| Almacenamiento local inseguro | Bajo‑medio | Se utilizan `SharedPreferences` y archivos con credenciales sin cifrado. |

## Correlaciones relevantes
- Los **componentes exportados** expuestos pueden ejecutar `Runtime.exec` sin validación de entrada, ampliando el vector de ataques.
- Permisos `ACCESS_NETWORK_STATE` y `INTERNET` combinados con endpoints HTTP facilitan ataques MITM.
- La actividad de WebView expuesta permite que atacantes carguen URL maliciosas.
- Una actividad pública que accede a SQLite permite inyección SQL a través de datos de intención.
- Almacenamiento en `SharedPreferences` dentro de actividades exportadas aumenta el riesgo de filtración de credenciales.

## Posibles candidatos de vulnerabilidad
- **Inyección de comando**: `Runtime.exec` alimentado por datos de usuario sin saneamiento.
- **Inyección SQL**: Consulta `rawQuery`/`execSQL` con entrada directa del usuario.
- **XSS/Phishing en WebView**: `loadUrl` con URL no filtrada que permite scripts maliciosos.
- **Transmisión sin cifrar**: HTTPS no utilizado en endpoints con credenciales sensibles.
- **Filtración de datos sensibles**: Almacenamiento de credenciales en `SharedPreferences` o archivos sin cifrado.

## Siguientes pasos recomendados
1. **Validar y sanitizar** todos los argumentos de `Runtime.exec`; limitar su uso a utilidades seguras.
2. Sustituir `rawQuery` y `execSQL` por consultas preparadas (`SQLiteDatabase.rawQuery` con placeholders o `SQLiteStatement.applyBindArguments`).
3. Validar URLs antes de `WebView.loadUrl`; deshabilitar JavaScript cuando no sea necesario.
4. Migrar todos los endpoints HTTP a HTTPS y reflejarlo en la configuración de seguridad de red (`network_security_config.xml`).
5. Cifrar datos sensibles en `SharedPreferences` usando `EncryptedSharedPreferences` o almacenar en el Keystore; asegurar los archivos con permisos de archivo apropiados.

**Nota:** Estos pasos apuntan a cerrar los vectores más críticos identificados. Se recomienda realizar pruebas manuales de validación para confirmar la eliminación de riesgos.