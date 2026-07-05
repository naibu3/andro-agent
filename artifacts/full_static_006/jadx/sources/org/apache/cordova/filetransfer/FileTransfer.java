package org.apache.cordova.filetransfer;

import android.net.Uri;
import android.webkit.CookieManager;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import org.apache.cordova.AllowList;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;
import org.apache.cordova.file.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FileTransfer extends CordovaPlugin {
    public static int ABORTED_ERR = 4;
    private static final String BOUNDARY = "+++++";
    public static int CONNECTION_ERR = 3;
    public static int FILE_NOT_FOUND_ERR = 1;
    public static int INVALID_URL_ERR = 2;
    private static final String LINE_END = "\r\n";
    private static final String LINE_START = "--";
    private static final String LOG_TAG = "FileTransfer";
    private static final int MAX_BUFFER_SIZE = 16384;
    public static int NOT_MODIFIED_ERR = 5;
    private static HashMap<String, RequestContext> activeRequests = new HashMap<>();

    private static final class RequestContext {
        boolean aborted;
        CallbackContext callbackContext;
        HttpURLConnection connection;
        String source;
        String target;
        File targetFile;

        RequestContext(String str, String str2, CallbackContext callbackContext) {
            this.source = str;
            this.target = str2;
            this.callbackContext = callbackContext;
        }

        void sendPluginResult(PluginResult pluginResult) {
            synchronized (this) {
                if (!this.aborted) {
                    this.callbackContext.sendPluginResult(pluginResult);
                }
            }
        }
    }

    private static abstract class TrackingInputStream extends FilterInputStream {
        public abstract long getTotalRawBytesRead();

        public TrackingInputStream(InputStream inputStream) {
            super(inputStream);
        }
    }

    private static class ExposedGZIPInputStream extends GZIPInputStream {
        public ExposedGZIPInputStream(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        public Inflater getInflater() {
            return this.inf;
        }
    }

    private static class TrackingGZIPInputStream extends TrackingInputStream {
        private ExposedGZIPInputStream gzin;

        public TrackingGZIPInputStream(ExposedGZIPInputStream exposedGZIPInputStream) throws IOException {
            super(exposedGZIPInputStream);
            this.gzin = exposedGZIPInputStream;
        }

        @Override // org.apache.cordova.filetransfer.FileTransfer.TrackingInputStream
        public long getTotalRawBytesRead() {
            return this.gzin.getInflater().getBytesRead();
        }
    }

    private static class SimpleTrackingInputStream extends TrackingInputStream {
        private long bytesRead;

        public SimpleTrackingInputStream(InputStream inputStream) {
            super(inputStream);
            this.bytesRead = 0L;
        }

        private int updateBytesRead(int i) {
            if (i != -1) {
                this.bytesRead += i;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            return updateBytesRead(super.read());
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return updateBytesRead(super.read(bArr, i, i2));
        }

        @Override // org.apache.cordova.filetransfer.FileTransfer.TrackingInputStream
        public long getTotalRawBytesRead() {
            return this.bytesRead;
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (str.equals("upload") || str.equals("download")) {
            String string = jSONArray.getString(0);
            String string2 = jSONArray.getString(1);
            if (str.equals("upload")) {
                upload(string, string2, jSONArray, callbackContext);
            } else {
                download(string, string2, jSONArray, callbackContext);
            }
            return true;
        }
        if (!str.equals("abort")) {
            return false;
        }
        abort(jSONArray.getString(0));
        callbackContext.success();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addHeadersToRequest(URLConnection uRLConnection, JSONObject jSONObject) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                String strReplaceAll = string.replaceAll("\\n", "").replaceAll("\\s+", "").replaceAll(":", "").replaceAll("[^\\x20-\\x7E]+", "");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(string);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(jSONObject.getString(string).replaceAll("\\s+", " ").replaceAll("\\n", " ").replaceAll("[^\\x20-\\x7E]+", " "));
                }
                uRLConnection.setRequestProperty(strReplaceAll, jSONArrayOptJSONArray.getString(0));
                for (int i = 1; i < jSONArrayOptJSONArray.length(); i++) {
                    uRLConnection.addRequestProperty(string, jSONArrayOptJSONArray.getString(i));
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCookies(String str) throws NoSuchMethodException, SecurityException {
        String str2;
        boolean z = false;
        try {
            Method method = this.webView.getClass().getMethod("getCookieManager", new Class[0]);
            Class<?> returnType = method.getReturnType();
            str2 = (String) returnType.getMethod("getCookie", String.class).invoke(returnType.cast(method.invoke(this.webView, new Object[0])), str);
            z = true;
        } catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            str2 = null;
        }
        return (z || CookieManager.getInstance() == null) ? str2 : CookieManager.getInstance().getCookie(str);
    }

    private void upload(final String str, final String str2, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        int i;
        boolean z;
        LOG.d(LOG_TAG, "upload " + str + " to " + str2);
        final String argument = getArgument(jSONArray, 2, "file");
        final String argument2 = getArgument(jSONArray, 3, "image.jpg");
        final String argument3 = getArgument(jSONArray, 4, "image/jpeg");
        final JSONObject jSONObject = jSONArray.optJSONObject(5) == null ? new JSONObject() : jSONArray.optJSONObject(5);
        final boolean z2 = jSONArray.optBoolean(7) || jSONArray.isNull(7);
        final JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(8) == null ? jSONObject.optJSONObject("headers") : jSONArray.optJSONObject(8);
        final String string = jSONArray.getString(9);
        final String argument4 = getArgument(jSONArray, 10, ShareTarget.METHOD_POST);
        final CordovaResourceApi resourceApi = this.webView.getResourceApi();
        LOG.d(LOG_TAG, "fileKey: " + argument);
        LOG.d(LOG_TAG, "fileName: " + argument2);
        LOG.d(LOG_TAG, "mimeType: " + argument3);
        LOG.d(LOG_TAG, "params: " + jSONObject);
        LOG.d(LOG_TAG, "chunkedMode: " + z2);
        LOG.d(LOG_TAG, "headers: " + jSONObjectOptJSONObject);
        LOG.d(LOG_TAG, "objectId: " + string);
        LOG.d(LOG_TAG, "httpMethod: " + argument4);
        final Uri uriRemapUri = resourceApi.remapUri(Uri.parse(str2));
        int uriType = CordovaResourceApi.getUriType(uriRemapUri);
        if (uriType == 6) {
            i = 5;
            z = true;
        } else {
            i = 5;
            z = false;
        }
        if (uriType != i && !z) {
            JSONObject jSONObjectCreateFileTransferError = createFileTransferError(INVALID_URL_ERR, str, str2, null, 0, null);
            LOG.e(LOG_TAG, "Unsupported URI: " + uriRemapUri);
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError));
        } else {
            final RequestContext requestContext = new RequestContext(str, str2, callbackContext);
            synchronized (activeRequests) {
                activeRequests.put(string, requestContext);
            }
            final boolean z3 = z;
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: org.apache.cordova.filetransfer.FileTransfer.1
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:188:0x03c6
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: IOException -> 0x0059, all -> 0x03e2, FileNotFoundException -> 0x03ec, JSONException -> 0x0429, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0429, blocks: (B:10:0x0029, B:12:0x003c, B:14:0x004e, B:22:0x005f, B:23:0x0066, B:25:0x0070, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:41:0x00ea, B:44:0x015b, B:48:0x0161, B:53:0x016d, B:58:0x018e, B:60:0x0195, B:63:0x01a7, B:70:0x01b8, B:101:0x027b, B:102:0x0285, B:105:0x028c, B:112:0x02f4, B:113:0x02f6, B:116:0x02fd, B:129:0x0317, B:137:0x033f, B:138:0x0341, B:141:0x0348, B:154:0x0396, B:163:0x03a1, B:164:0x03a3, B:167:0x03aa, B:168:0x03ad, B:172:0x03b1, B:176:0x03b5, B:196:0x03d2, B:197:0x03da, B:62:0x019d, B:40:0x00e1), top: B:274:0x0029, outer: #5 }] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: IOException -> 0x0059, all -> 0x03e2, FileNotFoundException -> 0x03ec, JSONException -> 0x0429, TRY_ENTER, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0429, blocks: (B:10:0x0029, B:12:0x003c, B:14:0x004e, B:22:0x005f, B:23:0x0066, B:25:0x0070, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:41:0x00ea, B:44:0x015b, B:48:0x0161, B:53:0x016d, B:58:0x018e, B:60:0x0195, B:63:0x01a7, B:70:0x01b8, B:101:0x027b, B:102:0x0285, B:105:0x028c, B:112:0x02f4, B:113:0x02f6, B:116:0x02fd, B:129:0x0317, B:137:0x033f, B:138:0x0341, B:141:0x0348, B:154:0x0396, B:163:0x03a1, B:164:0x03a3, B:167:0x03aa, B:168:0x03ad, B:172:0x03b1, B:176:0x03b5, B:196:0x03d2, B:197:0x03da, B:62:0x019d, B:40:0x00e1), top: B:274:0x0029, outer: #5 }] */
                /* JADX WARN: Removed duplicated region for block: B:277:0x04a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:283:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: IOException -> 0x0059, all -> 0x03e2, FileNotFoundException -> 0x03ec, JSONException -> 0x0429, TRY_ENTER, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0429, blocks: (B:10:0x0029, B:12:0x003c, B:14:0x004e, B:22:0x005f, B:23:0x0066, B:25:0x0070, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:41:0x00ea, B:44:0x015b, B:48:0x0161, B:53:0x016d, B:58:0x018e, B:60:0x0195, B:63:0x01a7, B:70:0x01b8, B:101:0x027b, B:102:0x0285, B:105:0x028c, B:112:0x02f4, B:113:0x02f6, B:116:0x02fd, B:129:0x0317, B:137:0x033f, B:138:0x0341, B:141:0x0348, B:154:0x0396, B:163:0x03a1, B:164:0x03a3, B:167:0x03aa, B:168:0x03ad, B:172:0x03b1, B:176:0x03b5, B:196:0x03d2, B:197:0x03da, B:62:0x019d, B:40:0x00e1), top: B:274:0x0029, outer: #5 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: IOException -> 0x0059, JSONException -> 0x00df, all -> 0x03e2, FileNotFoundException -> 0x03ec, TryCatch #14 {IOException -> 0x0059, blocks: (B:14:0x004e, B:22:0x005f, B:25:0x0070, B:28:0x0079, B:31:0x0083, B:32:0x0089, B:34:0x008f, B:36:0x009f, B:44:0x015b), top: B:287:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x015b A[Catch: IOException -> 0x0059, all -> 0x03e2, FileNotFoundException -> 0x03ec, JSONException -> 0x0429, TRY_ENTER, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0429, blocks: (B:10:0x0029, B:12:0x003c, B:14:0x004e, B:22:0x005f, B:23:0x0066, B:25:0x0070, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:41:0x00ea, B:44:0x015b, B:48:0x0161, B:53:0x016d, B:58:0x018e, B:60:0x0195, B:63:0x01a7, B:70:0x01b8, B:101:0x027b, B:102:0x0285, B:105:0x028c, B:112:0x02f4, B:113:0x02f6, B:116:0x02fd, B:129:0x0317, B:137:0x033f, B:138:0x0341, B:141:0x0348, B:154:0x0396, B:163:0x03a1, B:164:0x03a3, B:167:0x03aa, B:168:0x03ad, B:172:0x03b1, B:176:0x03b5, B:196:0x03d2, B:197:0x03da, B:62:0x019d, B:40:0x00e1), top: B:274:0x0029, outer: #5 }] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x016c  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x018b A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x019d A[Catch: IOException -> 0x03db, all -> 0x03e2, FileNotFoundException -> 0x03ec, JSONException -> 0x0429, TRY_ENTER, TryCatch #10 {JSONException -> 0x0429, blocks: (B:10:0x0029, B:12:0x003c, B:14:0x004e, B:22:0x005f, B:23:0x0066, B:25:0x0070, B:26:0x0075, B:28:0x0079, B:29:0x007c, B:41:0x00ea, B:44:0x015b, B:48:0x0161, B:53:0x016d, B:58:0x018e, B:60:0x0195, B:63:0x01a7, B:70:0x01b8, B:101:0x027b, B:102:0x0285, B:105:0x028c, B:112:0x02f4, B:113:0x02f6, B:116:0x02fd, B:129:0x0317, B:137:0x033f, B:138:0x0341, B:141:0x0348, B:154:0x0396, B:163:0x03a1, B:164:0x03a3, B:167:0x03aa, B:168:0x03ad, B:172:0x03b1, B:176:0x03b5, B:196:0x03d2, B:197:0x03da, B:62:0x019d, B:40:0x00e1), top: B:274:0x0029, outer: #5 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 1282
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.filetransfer.FileTransfer.AnonymousClass1.run():void");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void safeClose(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TrackingInputStream getInputStream(URLConnection uRLConnection) throws IOException {
        String contentEncoding = uRLConnection.getContentEncoding();
        if (contentEncoding != null && contentEncoding.equalsIgnoreCase("gzip")) {
            return new TrackingGZIPInputStream(new ExposedGZIPInputStream(uRLConnection.getInputStream()));
        }
        return new SimpleTrackingInputStream(uRLConnection.getInputStream());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject createFileTransferError(int i, String str, String str2, URLConnection uRLConnection, Throwable th) {
        StringBuilder sb = new StringBuilder();
        int responseCode = 0;
        String str3 = null;
        if (uRLConnection != null) {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    responseCode = ((HttpURLConnection) uRLConnection).getResponseCode();
                    InputStream errorStream = ((HttpURLConnection) uRLConnection).getErrorStream();
                    if (errorStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                        try {
                            String line = bufferedReader.readLine();
                            while (line != null) {
                                sb.append(line);
                                line = bufferedReader.readLine();
                                if (line != null) {
                                    sb.append('\n');
                                }
                            }
                            String string = sb.toString();
                            try {
                                str3 = string;
                            } catch (Throwable th2) {
                                th = th2;
                                str3 = string;
                                LOG.w(LOG_TAG, "Error getting HTTP status code from connection.", th);
                                return createFileTransferError(i, str, str2, str3, Integer.valueOf(responseCode), th);
                            }
                        } finally {
                            bufferedReader.close();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return createFileTransferError(i, str, str2, str3, Integer.valueOf(responseCode), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject createFileTransferError(int i, String str, String str2, String str3, Integer num, Throwable th) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", i);
                jSONObject2.put(Constants.ScionAnalytics.PARAM_SOURCE, str);
                jSONObject2.put(TypedValues.AttributesType.S_TARGET, str2);
                if (str3 != null) {
                    jSONObject2.put("body", str3);
                }
                if (num != null) {
                    jSONObject2.put("http_status", num);
                }
                if (th == null) {
                    return jSONObject2;
                }
                String message = th.getMessage();
                if (message == null || "".equals(message)) {
                    message = th.toString();
                }
                jSONObject2.put("exception", message);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                LOG.e(LOG_TAG, e.getMessage(), e);
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    private static String getArgument(JSONArray jSONArray, int i, String str) {
        String strOptString;
        return (jSONArray.length() <= i || (strOptString = jSONArray.optString(i)) == null || "null".equals(strOptString)) ? str : strOptString;
    }

    private void download(final String str, final String str2, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        LOG.d(LOG_TAG, "download " + str + " to " + str2);
        final CordovaResourceApi resourceApi = this.webView.getResourceApi();
        final String string = jSONArray.getString(3);
        final JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(4);
        final Uri uriRemapUri = resourceApi.remapUri(Uri.parse(str));
        int uriType = CordovaResourceApi.getUriType(uriRemapUri);
        boolean z = (uriType == 6 || uriType == 5) ? false : true;
        if (uriType == -1) {
            JSONObject jSONObjectCreateFileTransferError = createFileTransferError(INVALID_URL_ERR, str, str2, null, 0, null);
            LOG.e(LOG_TAG, "Unsupported URI: " + uriRemapUri);
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError));
            return;
        }
        Boolean boolValueOf = z ? true : null;
        if (boolValueOf == null) {
            try {
                boolValueOf = Boolean.valueOf(((AllowList) this.webView.getClass().getMethod("getWhitelist", new Class[0]).invoke(this.webView, new Object[0])).isUrlAllowListed(str));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        if (boolValueOf == null) {
            try {
                PluginManager pluginManager = (PluginManager) this.webView.getClass().getMethod("getPluginManager", new Class[0]).invoke(this.webView, new Object[0]);
                boolValueOf = (Boolean) pluginManager.getClass().getMethod("shouldAllowRequest", String.class).invoke(pluginManager, str);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
        if (!Boolean.TRUE.equals(boolValueOf)) {
            LOG.w(LOG_TAG, "Source URL is not in white list: '" + str + "'");
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.IO_EXCEPTION, createFileTransferError(CONNECTION_ERR, str, str2, null, Integer.valueOf(TypedValues.CycleType.TYPE_CURVE_FIT), null)));
            return;
        }
        final RequestContext requestContext = new RequestContext(str, str2, callbackContext);
        synchronized (activeRequests) {
            activeRequests.put(string, requestContext);
        }
        final boolean z2 = z;
        this.f9cordova.getThreadPool().execute(new Runnable() { // from class: org.apache.cordova.filetransfer.FileTransfer.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:190:0x034b A[PHI: r0 r3 r4 r5 r6 r8
              0x034b: PHI (r0v20 org.apache.cordova.PluginResult) = 
              (r0v12 org.apache.cordova.PluginResult)
              (r0v15 org.apache.cordova.PluginResult)
              (r0v18 org.apache.cordova.PluginResult)
              (r0v23 org.apache.cordova.PluginResult)
             binds: [B:173:0x0312, B:189:0x0349, B:206:0x0393, B:222:0x03d4] A[DONT_GENERATE, DONT_INLINE]
              0x034b: PHI (r3v6 boolean) = (r3v3 boolean), (r3v4 boolean), (r3v5 boolean), (r3v8 boolean) binds: [B:173:0x0312, B:189:0x0349, B:206:0x0393, B:222:0x03d4] A[DONT_GENERATE, DONT_INLINE]
              0x034b: PHI (r4v6 java.lang.Throwable) = (r4v23 java.lang.Throwable), (r4v24 java.lang.Throwable), (r4v25 java.lang.Throwable), (r4v26 java.lang.Throwable) binds: [B:173:0x0312, B:189:0x0349, B:206:0x0393, B:222:0x03d4] A[DONT_GENERATE, DONT_INLINE]
              0x034b: PHI (r5v12 java.io.File) = (r5v9 java.io.File), (r5v10 java.io.File), (r5v11 java.io.File), (r5v14 java.io.File) binds: [B:173:0x0312, B:189:0x0349, B:206:0x0393, B:222:0x03d4] A[DONT_GENERATE, DONT_INLINE]
              0x034b: PHI (r6v12 org.apache.cordova.PluginResult) = 
              (r6v48 org.apache.cordova.PluginResult)
              (r6v49 org.apache.cordova.PluginResult)
              (r6v50 org.apache.cordova.PluginResult)
              (r6v51 org.apache.cordova.PluginResult)
             binds: [B:173:0x0312, B:189:0x0349, B:206:0x0393, B:222:0x03d4] A[DONT_GENERATE, DONT_INLINE]
              0x034b: PHI (r8v10 org.apache.cordova.PluginResult) = 
              (r8v7 org.apache.cordova.PluginResult)
              (r8v8 org.apache.cordova.PluginResult)
              (r8v9 org.apache.cordova.PluginResult)
              (r8v12 org.apache.cordova.PluginResult)
             binds: [B:173:0x0312, B:189:0x0349, B:206:0x0393, B:222:0x03d4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:263:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:265:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:267:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:272:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap] */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashMap] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.HashMap] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.util.HashMap] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v11, types: [java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r6v13, types: [java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r6v14, types: [java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r6v23, types: [java.net.HttpURLConnection, java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r6v24, types: [java.net.HttpURLConnection, java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r6v28 */
            /* JADX WARN: Type inference failed for: r6v29 */
            /* JADX WARN: Type inference failed for: r6v30 */
            /* JADX WARN: Type inference failed for: r6v31 */
            /* JADX WARN: Type inference failed for: r6v32 */
            /* JADX WARN: Type inference failed for: r6v33 */
            /* JADX WARN: Type inference failed for: r6v34 */
            /* JADX WARN: Type inference failed for: r6v35 */
            /* JADX WARN: Type inference failed for: r6v36 */
            /* JADX WARN: Type inference failed for: r6v37 */
            /* JADX WARN: Type inference failed for: r6v38 */
            /* JADX WARN: Type inference failed for: r6v39 */
            /* JADX WARN: Type inference failed for: r6v40 */
            /* JADX WARN: Type inference failed for: r6v41 */
            /* JADX WARN: Type inference failed for: r6v42 */
            /* JADX WARN: Type inference failed for: r6v43 */
            /* JADX WARN: Type inference failed for: r6v44 */
            /* JADX WARN: Type inference failed for: r6v45 */
            /* JADX WARN: Type inference failed for: r6v46 */
            /* JADX WARN: Type inference failed for: r6v47 */
            /* JADX WARN: Type inference failed for: r6v52 */
            /* JADX WARN: Type inference failed for: r6v53 */
            /* JADX WARN: Type inference failed for: r6v54 */
            /* JADX WARN: Type inference failed for: r6v55 */
            /* JADX WARN: Type inference failed for: r6v60 */
            /* JADX WARN: Type inference failed for: r6v61 */
            /* JADX WARN: Type inference failed for: r6v62 */
            /* JADX WARN: Type inference failed for: r6v63 */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.net.URLConnection] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                File fileMapUriToFile;
                PluginResult pluginResult;
                PluginResult pluginResult2;
                PluginResult pluginResult3;
                PluginResult pluginResult4;
                PluginResult pluginResult5;
                ?? r6;
                PluginResult pluginResult6;
                ?? r4;
                PluginResult pluginResult7;
                ?? r42;
                ?? r62;
                ?? r43;
                PluginResult pluginResult8;
                Throwable th;
                ?? r63;
                ?? r64;
                ?? r44;
                TrackingInputStream inputStream;
                boolean z3;
                ?? r65;
                OutputStream outputStreamOpenOutputStream;
                PluginManager pluginManager2;
                PluginResult pluginResult9;
                if (requestContext.aborted) {
                    return;
                }
                Uri uriFromFile = Uri.parse(str2);
                CordovaResourceApi cordovaResourceApi = resourceApi;
                if (uriFromFile.getScheme() == null) {
                    uriFromFile = Uri.fromFile(new File(str2));
                }
                Uri uriRemapUri2 = cordovaResourceApi.remapUri(uriFromFile);
                boolean z4 = false;
                Throwable th2 = null;
                try {
                    try {
                        fileMapUriToFile = resourceApi.mapUriToFile(uriRemapUri2);
                    } catch (Throwable th3) {
                        synchronized (FileTransfer.activeRequests) {
                            FileTransfer.activeRequests.remove(string);
                            if (pluginResult5 == null) {
                                pluginResult5 = new PluginResult(PluginResult.Status.ERROR, FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r63, th2));
                            }
                            if (!z4 && pluginResult5.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                                fileMapUriToFile.delete();
                            }
                            requestContext.sendPluginResult(pluginResult5);
                            throw th3;
                        }
                    }
                } catch (FileNotFoundException e) {
                    e = e;
                    fileMapUriToFile = null;
                    pluginResult4 = null;
                } catch (IOException e2) {
                    e = e2;
                    fileMapUriToFile = null;
                    pluginResult3 = null;
                } catch (JSONException e3) {
                    e = e3;
                    fileMapUriToFile = null;
                    pluginResult2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileMapUriToFile = null;
                    pluginResult = null;
                }
                try {
                    requestContext.targetFile = fileMapUriToFile;
                    LOG.d(FileTransfer.LOG_TAG, "Download file:" + uriRemapUri);
                    FileProgressResult fileProgressResult = new FileProgressResult();
                    if (z2) {
                        CordovaResourceApi.OpenForReadResult openForReadResultOpenForRead = resourceApi.openForRead(uriRemapUri);
                        if (openForReadResultOpenForRead.length != -1) {
                            fileProgressResult.setLengthComputable(true);
                            fileProgressResult.setTotal(openForReadResultOpenForRead.length);
                        }
                        z3 = false;
                        pluginResult5 = null;
                        inputStream = new SimpleTrackingInputStream(openForReadResultOpenForRead.inputStream);
                        r65 = 0;
                    } else {
                        ?? CreateHttpConnection = resourceApi.createHttpConnection(uriRemapUri);
                        try {
                            CreateHttpConnection.setRequestMethod(ShareTarget.METHOD_GET);
                            String cookies = FileTransfer.this.getCookies(uriRemapUri.toString());
                            if (cookies != null) {
                                CreateHttpConnection.setRequestProperty("cookie", cookies);
                            }
                            CreateHttpConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                            JSONObject jSONObject = jSONObjectOptJSONObject;
                            if (jSONObject != null) {
                                FileTransfer.addHeadersToRequest(CreateHttpConnection, jSONObject);
                            }
                            CreateHttpConnection.connect();
                            if (CreateHttpConnection.getResponseCode() == 304) {
                                try {
                                    CreateHttpConnection.disconnect();
                                    LOG.d(FileTransfer.LOG_TAG, "Resource not modified: " + str);
                                    pluginResult5 = new PluginResult(PluginResult.Status.ERROR, FileTransfer.createFileTransferError(FileTransfer.NOT_MODIFIED_ERR, str, str2, CreateHttpConnection, null));
                                    inputStream = null;
                                    z3 = true;
                                    r65 = CreateHttpConnection;
                                } catch (FileNotFoundException e4) {
                                    e = e4;
                                    pluginResult5 = null;
                                    z4 = true;
                                    r64 = CreateHttpConnection;
                                    JSONObject jSONObjectCreateFileTransferError2 = FileTransfer.createFileTransferError(FileTransfer.FILE_NOT_FOUND_ERR, str, str2, r64, e);
                                    LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError2.toString(), e);
                                    pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError2);
                                    synchronized (FileTransfer.activeRequests) {
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                    pluginResult5 = null;
                                    z4 = true;
                                    r62 = CreateHttpConnection;
                                    JSONObject jSONObjectCreateFileTransferError3 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r62, e);
                                    LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError3.toString(), e);
                                    pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError3);
                                    synchronized (FileTransfer.activeRequests) {
                                    }
                                } catch (JSONException e6) {
                                    e = e6;
                                    pluginResult5 = null;
                                    z4 = true;
                                    pluginResult7 = CreateHttpConnection;
                                    LOG.e(FileTransfer.LOG_TAG, e.getMessage(), e);
                                    pluginResult6 = new PluginResult(PluginResult.Status.JSON_EXCEPTION);
                                    synchronized (FileTransfer.activeRequests) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    pluginResult5 = null;
                                    z4 = true;
                                    r6 = CreateHttpConnection;
                                    JSONObject jSONObjectCreateFileTransferError4 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r6, th);
                                    LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError4.toString(), th);
                                    pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError4);
                                    synchronized (FileTransfer.activeRequests) {
                                    }
                                }
                            } else {
                                if ((CreateHttpConnection.getContentEncoding() == null || CreateHttpConnection.getContentEncoding().equalsIgnoreCase("gzip")) && CreateHttpConnection.getContentLength() != -1) {
                                    fileProgressResult.setLengthComputable(true);
                                    fileProgressResult.setTotal(CreateHttpConnection.getContentLength());
                                }
                                inputStream = FileTransfer.getInputStream(CreateHttpConnection);
                                z3 = false;
                                pluginResult5 = null;
                                r65 = CreateHttpConnection;
                            }
                        } catch (FileNotFoundException e7) {
                            e = e7;
                            pluginResult5 = null;
                            r64 = CreateHttpConnection;
                        } catch (IOException e8) {
                            e = e8;
                            pluginResult5 = null;
                            r62 = CreateHttpConnection;
                        } catch (JSONException e9) {
                            e = e9;
                            pluginResult5 = null;
                            pluginResult7 = CreateHttpConnection;
                        } catch (Throwable th6) {
                            th = th6;
                            pluginResult5 = null;
                            r6 = CreateHttpConnection;
                        }
                    }
                    try {
                        if (!z3) {
                            try {
                                synchronized (requestContext) {
                                    if (requestContext.aborted) {
                                        synchronized (requestContext) {
                                            requestContext.connection = null;
                                        }
                                        FileTransfer.safeClose(inputStream);
                                        FileTransfer.safeClose(null);
                                        synchronized (FileTransfer.activeRequests) {
                                            FileTransfer.activeRequests.remove(string);
                                        }
                                        if (pluginResult5 == null) {
                                            pluginResult5 = new PluginResult(PluginResult.Status.ERROR, FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r65, null));
                                        }
                                        if (!z3 && pluginResult5.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                                            fileMapUriToFile.delete();
                                        }
                                        requestContext.sendPluginResult(pluginResult5);
                                        return;
                                    }
                                    requestContext.connection = r65;
                                    byte[] bArr = new byte[16384];
                                    outputStreamOpenOutputStream = resourceApi.openOutputStream(uriRemapUri2);
                                    while (true) {
                                        try {
                                            int i = inputStream.read(bArr);
                                            if (i <= 0) {
                                                break;
                                            }
                                            outputStreamOpenOutputStream.write(bArr, 0, i);
                                            fileProgressResult.setLoaded(inputStream.getTotalRawBytesRead());
                                            PluginResult pluginResult10 = new PluginResult(PluginResult.Status.OK, fileProgressResult.toJSONObject());
                                            pluginResult10.setKeepCallback(true);
                                            requestContext.sendPluginResult(pluginResult10);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            synchronized (requestContext) {
                                                requestContext.connection = null;
                                            }
                                            FileTransfer.safeClose(inputStream);
                                            FileTransfer.safeClose(outputStreamOpenOutputStream);
                                            throw th;
                                        }
                                    }
                                    synchronized (requestContext) {
                                        requestContext.connection = null;
                                    }
                                    FileTransfer.safeClose(inputStream);
                                    FileTransfer.safeClose(outputStreamOpenOutputStream);
                                    LOG.d(FileTransfer.LOG_TAG, "Saved file: " + str2);
                                    Class<?> cls = FileTransfer.this.webView.getClass();
                                    try {
                                        pluginManager2 = (PluginManager) cls.getMethod("getPluginManager", new Class[0]).invoke(FileTransfer.this.webView, new Object[0]);
                                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                                        pluginManager2 = null;
                                    }
                                    if (pluginManager2 == null) {
                                        try {
                                            pluginManager2 = (PluginManager) cls.getField("pluginManager").get(FileTransfer.this.webView);
                                        } catch (IllegalAccessException | NoSuchFieldException unused4) {
                                        }
                                    }
                                    fileMapUriToFile = resourceApi.mapUriToFile(uriRemapUri2);
                                    requestContext.targetFile = fileMapUriToFile;
                                    FileUtils fileUtils = (FileUtils) pluginManager2.getPlugin("File");
                                    if (fileUtils != null) {
                                        JSONObject entryForFile = fileUtils.getEntryForFile(fileMapUriToFile);
                                        if (entryForFile != null) {
                                            pluginResult9 = new PluginResult(PluginResult.Status.OK, entryForFile);
                                        } else {
                                            JSONObject jSONObjectCreateFileTransferError5 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r65, null);
                                            LOG.e(FileTransfer.LOG_TAG, "File plugin cannot represent download path");
                                            pluginResult9 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError5);
                                        }
                                        pluginResult5 = pluginResult9;
                                    } else {
                                        LOG.e(FileTransfer.LOG_TAG, "File plugin not found; cannot save downloaded file");
                                        pluginResult5 = new PluginResult(PluginResult.Status.ERROR, "File plugin not found; cannot save downloaded file");
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                outputStreamOpenOutputStream = null;
                            }
                        }
                        synchronized (FileTransfer.activeRequests) {
                            FileTransfer.activeRequests.remove(string);
                        }
                        if (pluginResult5 == null) {
                            pluginResult5 = new PluginResult(PluginResult.Status.ERROR, FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r65, null));
                        }
                        if (!z3 && pluginResult5.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                            fileMapUriToFile.delete();
                        }
                        requestContext.sendPluginResult(pluginResult5);
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        z4 = z3;
                        r64 = r65;
                        JSONObject jSONObjectCreateFileTransferError22 = FileTransfer.createFileTransferError(FileTransfer.FILE_NOT_FOUND_ERR, str, str2, r64, e);
                        LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError22.toString(), e);
                        pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError22);
                        synchronized (FileTransfer.activeRequests) {
                            ?? r2 = FileTransfer.activeRequests;
                            r44 = string;
                            r2.remove(r44);
                            th2 = r44;
                            r63 = r64;
                        }
                        if (!z4) {
                            th2 = r44;
                            th2 = r44;
                            r63 = r64;
                            r63 = r64;
                            th = r44;
                            pluginResult8 = r64;
                            if (pluginResult6.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                                fileMapUriToFile.delete();
                                th2 = th;
                                r63 = pluginResult8;
                            }
                        }
                        requestContext.sendPluginResult(pluginResult6);
                    } catch (IOException e11) {
                        e = e11;
                        z4 = z3;
                        r62 = r65;
                        JSONObject jSONObjectCreateFileTransferError32 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r62, e);
                        LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError32.toString(), e);
                        pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError32);
                        synchronized (FileTransfer.activeRequests) {
                            ?? r22 = FileTransfer.activeRequests;
                            r43 = string;
                            r22.remove(r43);
                            th2 = r43;
                            r63 = r62;
                        }
                        if (!z4) {
                            th2 = r43;
                            th2 = r43;
                            r63 = r62;
                            r63 = r62;
                            th = r43;
                            pluginResult8 = r62;
                            if (pluginResult6.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                            }
                        }
                        requestContext.sendPluginResult(pluginResult6);
                    } catch (JSONException e12) {
                        e = e12;
                        z4 = z3;
                        pluginResult7 = r65;
                        LOG.e(FileTransfer.LOG_TAG, e.getMessage(), e);
                        pluginResult6 = new PluginResult(PluginResult.Status.JSON_EXCEPTION);
                        synchronized (FileTransfer.activeRequests) {
                            ?? r23 = FileTransfer.activeRequests;
                            r42 = string;
                            r23.remove(r42);
                            th2 = r42;
                            r63 = pluginResult7;
                        }
                        if (!z4) {
                            th2 = r42;
                            th2 = r42;
                            r63 = pluginResult7;
                            r63 = pluginResult7;
                            th = r42;
                            pluginResult8 = pluginResult7;
                            if (pluginResult6.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                            }
                        }
                        requestContext.sendPluginResult(pluginResult6);
                    } catch (Throwable th9) {
                        th = th9;
                        z4 = z3;
                        r6 = r65;
                        JSONObject jSONObjectCreateFileTransferError42 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r6, th);
                        LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError42.toString(), th);
                        pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError42);
                        synchronized (FileTransfer.activeRequests) {
                            ?? r24 = FileTransfer.activeRequests;
                            r4 = string;
                            r24.remove(r4);
                            th2 = r4;
                            r63 = r6;
                        }
                        if (!z4) {
                            th2 = r4;
                            th2 = r4;
                            r63 = r6;
                            r63 = r6;
                            th = r4;
                            pluginResult8 = r6;
                            if (pluginResult6.getStatus() != PluginResult.Status.OK.ordinal() && fileMapUriToFile != null) {
                            }
                        }
                        requestContext.sendPluginResult(pluginResult6);
                    }
                } catch (FileNotFoundException e13) {
                    e = e13;
                    pluginResult4 = null;
                    pluginResult5 = pluginResult4;
                    r64 = pluginResult4;
                    JSONObject jSONObjectCreateFileTransferError222 = FileTransfer.createFileTransferError(FileTransfer.FILE_NOT_FOUND_ERR, str, str2, r64, e);
                    LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError222.toString(), e);
                    pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError222);
                    synchronized (FileTransfer.activeRequests) {
                    }
                } catch (IOException e14) {
                    e = e14;
                    pluginResult3 = null;
                    pluginResult5 = pluginResult3;
                    r62 = pluginResult3;
                    JSONObject jSONObjectCreateFileTransferError322 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r62, e);
                    LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError322.toString(), e);
                    pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError322);
                    synchronized (FileTransfer.activeRequests) {
                    }
                } catch (JSONException e15) {
                    e = e15;
                    pluginResult2 = null;
                    pluginResult5 = pluginResult2;
                    pluginResult7 = pluginResult2;
                    LOG.e(FileTransfer.LOG_TAG, e.getMessage(), e);
                    pluginResult6 = new PluginResult(PluginResult.Status.JSON_EXCEPTION);
                    synchronized (FileTransfer.activeRequests) {
                    }
                } catch (Throwable th10) {
                    th = th10;
                    pluginResult = null;
                    pluginResult5 = pluginResult;
                    r6 = pluginResult;
                    JSONObject jSONObjectCreateFileTransferError422 = FileTransfer.createFileTransferError(FileTransfer.CONNECTION_ERR, str, str2, r6, th);
                    LOG.e(FileTransfer.LOG_TAG, jSONObjectCreateFileTransferError422.toString(), th);
                    pluginResult6 = new PluginResult(PluginResult.Status.IO_EXCEPTION, jSONObjectCreateFileTransferError422);
                    synchronized (FileTransfer.activeRequests) {
                    }
                }
            }
        });
    }

    private void abort(String str) {
        final RequestContext requestContextRemove;
        synchronized (activeRequests) {
            requestContextRemove = activeRequests.remove(str);
        }
        if (requestContextRemove != null) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: org.apache.cordova.filetransfer.FileTransfer.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (requestContextRemove) {
                        File file = requestContextRemove.targetFile;
                        if (file != null) {
                            file.delete();
                        }
                        requestContextRemove.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, FileTransfer.createFileTransferError(FileTransfer.ABORTED_ERR, requestContextRemove.source, requestContextRemove.target, null, -1, null)));
                        requestContextRemove.aborted = true;
                        if (requestContextRemove.connection != null) {
                            try {
                                requestContextRemove.connection.disconnect();
                            } catch (Exception e) {
                                LOG.e(FileTransfer.LOG_TAG, "CB-8431 Catch workaround for fatal exception", e);
                            }
                        }
                    }
                }
            });
        }
    }
}
