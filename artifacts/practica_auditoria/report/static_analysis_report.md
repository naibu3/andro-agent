# Static Analysis Report

## Resumen ejecutivo  
El análisis detecta un perfil de riesgo elevado por la combinación de debilidades a nivel de *manifest*—componentes exportados sin protección, modo *debug* habilitado y configuraciones de copia de seguridad permisivas—y código que contiene vulnerabilidades de alto impacto: inyección SQL, inyección de comandos, uso inseguro de WebView, tráfico de red en texto plano y escritura de archivos sin cifrar. La relación entre estos puntos indica una alta probabilidad de exposición de datos y explotación de la lógica de negocio interna a través de interacciones externas con la aplicación.

## Riesgos prioritarios  
1. Componentes exportados sin protección permiten la inyección de intents externos y el uso indebido de la lógica interna.  
2. Llamadas a `Runtime.exec` con datos sin sanitizar habilitan la ejecución arbitraria de comandos.  
3. Uso de `execSQL`/`rawQuery` dinámicos facilita ataques de inyección SQL.  
4. Puntos finales HTTP codificados y la construcción *debuggable* expone el tráfico a escuchas.  
5. Escritura de archivos sin cifrar combinada con `allowBackup` aumenta el riesgo de filtración de datos.

## Correlaciones relevantes  
- Un servicio/receiver exportado puede ser activado por intents maliciosos que llegan a código vulnerable a SQL o ejecución de comandos.  
- Los datos copiados pueden incluir archivos escritos sin cifrar por la aplicación.  
- La configuración *debuggable* permite una inspección más sencilla del tráfico en texto claro y de los caminos de código vulnerables.  
- Un ContentProvider público expuesto junto con consultas SQL crudas puede revelar tablas sensibles.  
- Una URL insegura en WebView puede ser utilizada por componentes externos para entregar contenido malicioso.

## Posibles candidatos de vulnerabilidad  
- `artifacts/practica_auditoria/jadx/sources/owasp/sat/agoat/SQLinjectionActivity.java`  
- `artifacts/practica_auditoria/jadx/sources/owasp/sat/agoat/InsecureStorageSQLiteActivity.java`  
- `artifacts/practica_auditoria/jadx/sources/owasp/sat/agoat/InputValidationsOSCMDInjectionMain2Activity.java`  
- `artifacts/practica_auditoria/jadx/sources/owasp/sat/agoat/InputValidationsWebViewURLActivity.java`  
- `artifacts/practica_auditoria/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java`

## Siguientes pasos recomendados  
1. Marcar todos los componentes exportados como **non‑exported** o protegerlos con comprobaciones de permiso e validación de intents.  
2. Sustituir `execSQL`/`rawQuery` por sentencias preparadas con parámetros, y auditar todo el contenido SQL dinámico.  
3. Sanitizar todas las entradas usadas en `Runtime.exec`, restringir los comandos a una lista blanca o eliminar su uso.  
4. Eliminar los endpoints HTTP codificados y forzar HTTPS mediante *Network Security Config* y *certificate pinning*.  
5. Cifrar todos los datos sensibles, almacenarlos en directorios internos y protegidos, deshabilitar `allowBackup` o habilitar cifrado de copia de seguridad, y remover `android:debuggable` en las builds de producción.