package com.qonversion.android.sdk.internal.logger;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.BuildConfig;
import com.qonversion.android.sdk.internal.Constants;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.Thread;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExceptionHandler.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\u0011\u001a\u00020\u0003*\u00020\u000bH\u0002J\f\u0010\u0012\u001a\u00020\u0013*\u00020\u000bH\u0002J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/internal/logger/ExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "appPackageName", "", "defaultExceptionHandler", "reportsDir", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/io/File;)V", "isQonversionException", "", "exception", "", "storeException", "", "uncaughtException", "thread", "Ljava/lang/Thread;", "rawStackTrace", "toJSON", "Lorg/json/JSONObject;", "traceJSON", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final String appPackageName;
    private final Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private final File reportsDir;

    public ExceptionHandler(String appPackageName, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, File reportsDir) {
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        Intrinsics.checkNotNullParameter(reportsDir, "reportsDir");
        this.appPackageName = appPackageName;
        this.defaultExceptionHandler = uncaughtExceptionHandler;
        this.reportsDir = reportsDir;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable exception) throws Throwable {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (isQonversionException(exception)) {
            storeException(exception);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, exception);
        }
    }

    private final void storeException(Throwable exception) throws Throwable {
        BufferedWriter bufferedWriter;
        JSONObject json = toJSON(exception);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File file = new File(this.reportsDir, string + "-" + System.currentTimeMillis() + Constants.CRASH_LOG_FILE_SUFFIX);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                } catch (IOException e) {
                    Log.e("QExceptionHandler", "Failed to finish saving exception info to a file", e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(json.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            Log.e("QExceptionHandler", "Failed to save exception info to a file", e);
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e4) {
                    Log.e("QExceptionHandler", "Failed to finish saving exception info to a file", e4);
                }
            }
            throw th;
        }
    }

    private final JSONObject toJSON(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Throwable cause = th;
        do {
            if (cause != null) {
                jSONArray.put(traceJSON(cause));
            }
            cause = cause != null ? cause.getCause() : null;
        } while (cause != null);
        jSONObject.put("traces", jSONArray);
        jSONObject.put("title", th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        Serializable serializable = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
        if (serializable == null) {
            serializable = "";
        }
        jSONObject.put("place", serializable);
        return jSONObject;
    }

    private final JSONObject traceJSON(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = ArrayIteratorKt.iterator(th.getStackTrace());
        while (it.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", stackTraceElement.getClassName());
            jSONObject2.put("file", stackTraceElement.getFileName());
            jSONObject2.put("method", stackTraceElement.getMethodName());
            jSONObject2.put("line", stackTraceElement.getLineNumber());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("rawStackTrace", rawStackTrace(th));
        jSONObject.put("class", th.getClass().getName());
        jSONObject.put("message", th.getMessage());
        jSONObject.put("elements", jSONArray);
        return jSONObject;
    }

    private final String rawStackTrace(Throwable th) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            th.printStackTrace(printStream);
            printStream.close();
            byteArrayOutputStream.close();
            String string = byteArrayOutputStream.toString("UTF-8");
            Intrinsics.checkNotNull(string);
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final boolean isQonversionException(Throwable exception) {
        StackTraceElement[] stackTrace = exception.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.contains$default((CharSequence) className, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                return true;
            }
            String className2 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (StringsKt.contains$default((CharSequence) className2, (CharSequence) this.appPackageName, false, 2, (Object) null)) {
                return false;
            }
        }
        return false;
    }
}
