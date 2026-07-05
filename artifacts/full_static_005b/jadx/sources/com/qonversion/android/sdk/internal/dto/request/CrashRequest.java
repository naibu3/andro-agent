package com.qonversion.android.sdk.internal.dto.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashRequest.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "", "log", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "deviceInfo", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V", "getDeviceInfo", "()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "getLog", "()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DeviceInfo", "ExceptionInfo", "ExceptionTrace", "ExceptionTraceElement", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class CrashRequest {
    private final DeviceInfo deviceInfo;
    private final ExceptionInfo log;

    public static /* synthetic */ CrashRequest copy$default(CrashRequest crashRequest, ExceptionInfo exceptionInfo, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            exceptionInfo = crashRequest.log;
        }
        if ((i & 2) != 0) {
            deviceInfo = crashRequest.deviceInfo;
        }
        return crashRequest.copy(exceptionInfo, deviceInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final ExceptionInfo getLog() {
        return this.log;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final CrashRequest copy(@Json(name = "exception") ExceptionInfo log, @Json(name = "device") DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new CrashRequest(log, deviceInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashRequest)) {
            return false;
        }
        CrashRequest crashRequest = (CrashRequest) other;
        return Intrinsics.areEqual(this.log, crashRequest.log) && Intrinsics.areEqual(this.deviceInfo, crashRequest.deviceInfo);
    }

    public int hashCode() {
        return (this.log.hashCode() * 31) + this.deviceInfo.hashCode();
    }

    public String toString() {
        return "CrashRequest(log=" + this.log + ", deviceInfo=" + this.deviceInfo + ")";
    }

    public CrashRequest(@Json(name = "exception") ExceptionInfo log, @Json(name = "device") DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.log = log;
        this.deviceInfo = deviceInfo;
    }

    public final ExceptionInfo getLog() {
        return this.log;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* compiled from: CrashRequest.kt */
    @JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "", "title", "", "place", "traces", "", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPlace", "()Ljava/lang/String;", "getTitle", "getTraces", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ExceptionInfo {
        private final String place;
        private final String title;
        private final List<ExceptionTrace> traces;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExceptionInfo copy$default(ExceptionInfo exceptionInfo, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exceptionInfo.title;
            }
            if ((i & 2) != 0) {
                str2 = exceptionInfo.place;
            }
            if ((i & 4) != 0) {
                list = exceptionInfo.traces;
            }
            return exceptionInfo.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        public final List<ExceptionTrace> component3() {
            return this.traces;
        }

        public final ExceptionInfo copy(@Json(name = "title") String title, @Json(name = "place") String place, @Json(name = "traces") List<ExceptionTrace> traces) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(place, "place");
            Intrinsics.checkNotNullParameter(traces, "traces");
            return new ExceptionInfo(title, place, traces);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceptionInfo)) {
                return false;
            }
            ExceptionInfo exceptionInfo = (ExceptionInfo) other;
            return Intrinsics.areEqual(this.title, exceptionInfo.title) && Intrinsics.areEqual(this.place, exceptionInfo.place) && Intrinsics.areEqual(this.traces, exceptionInfo.traces);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.place.hashCode()) * 31) + this.traces.hashCode();
        }

        public String toString() {
            return "ExceptionInfo(title=" + this.title + ", place=" + this.place + ", traces=" + this.traces + ")";
        }

        public ExceptionInfo(@Json(name = "title") String title, @Json(name = "place") String place, @Json(name = "traces") List<ExceptionTrace> traces) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(place, "place");
            Intrinsics.checkNotNullParameter(traces, "traces");
            this.title = title;
            this.place = place;
            this.traces = traces;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPlace() {
            return this.place;
        }

        public final List<ExceptionTrace> getTraces() {
            return this.traces;
        }
    }

    /* compiled from: CrashRequest.kt */
    @JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;", "", "rawStackTrace", "", "className", "message", "elements", "", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getClassName", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "getMessage", "getRawStackTrace", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ExceptionTrace {
        private final String className;
        private final List<ExceptionTraceElement> elements;
        private final String message;
        private final String rawStackTrace;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExceptionTrace copy$default(ExceptionTrace exceptionTrace, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exceptionTrace.rawStackTrace;
            }
            if ((i & 2) != 0) {
                str2 = exceptionTrace.className;
            }
            if ((i & 4) != 0) {
                str3 = exceptionTrace.message;
            }
            if ((i & 8) != 0) {
                list = exceptionTrace.elements;
            }
            return exceptionTrace.copy(str, str2, str3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRawStackTrace() {
            return this.rawStackTrace;
        }

        /* renamed from: component2, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<ExceptionTraceElement> component4() {
            return this.elements;
        }

        public final ExceptionTrace copy(@Json(name = "rawStackTrace") String rawStackTrace, @Json(name = "class") String className, @Json(name = "message") String message, @Json(name = "elements") List<ExceptionTraceElement> elements) {
            Intrinsics.checkNotNullParameter(rawStackTrace, "rawStackTrace");
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new ExceptionTrace(rawStackTrace, className, message, elements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceptionTrace)) {
                return false;
            }
            ExceptionTrace exceptionTrace = (ExceptionTrace) other;
            return Intrinsics.areEqual(this.rawStackTrace, exceptionTrace.rawStackTrace) && Intrinsics.areEqual(this.className, exceptionTrace.className) && Intrinsics.areEqual(this.message, exceptionTrace.message) && Intrinsics.areEqual(this.elements, exceptionTrace.elements);
        }

        public int hashCode() {
            return (((((this.rawStackTrace.hashCode() * 31) + this.className.hashCode()) * 31) + this.message.hashCode()) * 31) + this.elements.hashCode();
        }

        public String toString() {
            return "ExceptionTrace(rawStackTrace=" + this.rawStackTrace + ", className=" + this.className + ", message=" + this.message + ", elements=" + this.elements + ")";
        }

        public ExceptionTrace(@Json(name = "rawStackTrace") String rawStackTrace, @Json(name = "class") String className, @Json(name = "message") String message, @Json(name = "elements") List<ExceptionTraceElement> elements) {
            Intrinsics.checkNotNullParameter(rawStackTrace, "rawStackTrace");
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.rawStackTrace = rawStackTrace;
            this.className = className;
            this.message = message;
            this.elements = elements;
        }

        public final String getRawStackTrace() {
            return this.rawStackTrace;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<ExceptionTraceElement> getElements() {
            return this.elements;
        }
    }

    /* compiled from: CrashRequest.kt */
    @JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;", "", "className", "", "fileName", "methodName", "line", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getClassName", "()Ljava/lang/String;", "getFileName", "getLine", "()I", "getMethodName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ExceptionTraceElement {
        private final String className;
        private final String fileName;
        private final int line;
        private final String methodName;

        public static /* synthetic */ ExceptionTraceElement copy$default(ExceptionTraceElement exceptionTraceElement, String str, String str2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = exceptionTraceElement.className;
            }
            if ((i2 & 2) != 0) {
                str2 = exceptionTraceElement.fileName;
            }
            if ((i2 & 4) != 0) {
                str3 = exceptionTraceElement.methodName;
            }
            if ((i2 & 8) != 0) {
                i = exceptionTraceElement.line;
            }
            return exceptionTraceElement.copy(str, str2, str3, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLine() {
            return this.line;
        }

        public final ExceptionTraceElement copy(@Json(name = "class") String className, @Json(name = "file") String fileName, @Json(name = "method") String methodName, @Json(name = "line") int line) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return new ExceptionTraceElement(className, fileName, methodName, line);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceptionTraceElement)) {
                return false;
            }
            ExceptionTraceElement exceptionTraceElement = (ExceptionTraceElement) other;
            return Intrinsics.areEqual(this.className, exceptionTraceElement.className) && Intrinsics.areEqual(this.fileName, exceptionTraceElement.fileName) && Intrinsics.areEqual(this.methodName, exceptionTraceElement.methodName) && this.line == exceptionTraceElement.line;
        }

        public int hashCode() {
            return (((((this.className.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.methodName.hashCode()) * 31) + Integer.hashCode(this.line);
        }

        public String toString() {
            return "ExceptionTraceElement(className=" + this.className + ", fileName=" + this.fileName + ", methodName=" + this.methodName + ", line=" + this.line + ")";
        }

        public ExceptionTraceElement(@Json(name = "class") String className, @Json(name = "file") String fileName, @Json(name = "method") String methodName, @Json(name = "line") int i) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.className = className;
            this.fileName = fileName;
            this.methodName = methodName;
            this.line = i;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getMethodName() {
            return this.methodName;
        }

        public final int getLine() {
            return this.line;
        }
    }

    /* compiled from: CrashRequest.kt */
    @JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "", "platform", "", "platformVersion", Constants.ScionAnalytics.PARAM_SOURCE, "sourceVersion", "projectKey", "uid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getPlatformVersion", "getProjectKey", "getSource", "getSourceVersion", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DeviceInfo {
        private final String platform;
        private final String platformVersion;
        private final String projectKey;
        private final String source;
        private final String sourceVersion;
        private final String uid;

        public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceInfo.platform;
            }
            if ((i & 2) != 0) {
                str2 = deviceInfo.platformVersion;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = deviceInfo.source;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = deviceInfo.sourceVersion;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = deviceInfo.projectKey;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = deviceInfo.uid;
            }
            return deviceInfo.copy(str, str7, str8, str9, str10, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlatformVersion() {
            return this.platformVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSourceVersion() {
            return this.sourceVersion;
        }

        /* renamed from: component5, reason: from getter */
        public final String getProjectKey() {
            return this.projectKey;
        }

        /* renamed from: component6, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        public final DeviceInfo copy(@Json(name = "platform") String platform, @Json(name = "platform_version") String platformVersion, @Json(name = Constants.ScionAnalytics.PARAM_SOURCE) String source, @Json(name = "source_version") String sourceVersion, @Json(name = "project_key") String projectKey, @Json(name = "uid") String uid) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(platformVersion, "platformVersion");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sourceVersion, "sourceVersion");
            Intrinsics.checkNotNullParameter(projectKey, "projectKey");
            Intrinsics.checkNotNullParameter(uid, "uid");
            return new DeviceInfo(platform, platformVersion, source, sourceVersion, projectKey, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) other;
            return Intrinsics.areEqual(this.platform, deviceInfo.platform) && Intrinsics.areEqual(this.platformVersion, deviceInfo.platformVersion) && Intrinsics.areEqual(this.source, deviceInfo.source) && Intrinsics.areEqual(this.sourceVersion, deviceInfo.sourceVersion) && Intrinsics.areEqual(this.projectKey, deviceInfo.projectKey) && Intrinsics.areEqual(this.uid, deviceInfo.uid);
        }

        public int hashCode() {
            return (((((((((this.platform.hashCode() * 31) + this.platformVersion.hashCode()) * 31) + this.source.hashCode()) * 31) + this.sourceVersion.hashCode()) * 31) + this.projectKey.hashCode()) * 31) + this.uid.hashCode();
        }

        public String toString() {
            return "DeviceInfo(platform=" + this.platform + ", platformVersion=" + this.platformVersion + ", source=" + this.source + ", sourceVersion=" + this.sourceVersion + ", projectKey=" + this.projectKey + ", uid=" + this.uid + ")";
        }

        public DeviceInfo(@Json(name = "platform") String platform, @Json(name = "platform_version") String platformVersion, @Json(name = Constants.ScionAnalytics.PARAM_SOURCE) String source, @Json(name = "source_version") String sourceVersion, @Json(name = "project_key") String projectKey, @Json(name = "uid") String uid) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(platformVersion, "platformVersion");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sourceVersion, "sourceVersion");
            Intrinsics.checkNotNullParameter(projectKey, "projectKey");
            Intrinsics.checkNotNullParameter(uid, "uid");
            this.platform = platform;
            this.platformVersion = platformVersion;
            this.source = source;
            this.sourceVersion = sourceVersion;
            this.projectKey = projectKey;
            this.uid = uid;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getPlatformVersion() {
            return this.platformVersion;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getSourceVersion() {
            return this.sourceVersion;
        }

        public final String getProjectKey() {
            return this.projectKey;
        }

        public final String getUid() {
            return this.uid;
        }
    }
}
