package com.stripe.android.core.networking;

import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeRequest.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/stripe/android/core/networking/StripeRequest;", "", "<init>", "()V", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "", "getUrl", "()Ljava/lang/String;", "headers", "", "getHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "shouldCache", "", "getShouldCache", "()Z", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "Method", "MimeType", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class StripeRequest {
    private Map<String, String> postHeaders;
    private final boolean shouldCache;

    public abstract Map<String, String> getHeaders();

    public abstract Method getMethod();

    public abstract MimeType getMimeType();

    public abstract Iterable<Integer> getRetryResponseCodes();

    public abstract String getUrl();

    public void writePostBody(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
    }

    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    public boolean getShouldCache() {
        return this.shouldCache;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/core/networking/StripeRequest$Method;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "GET", ShareTarget.METHOD_POST, "DELETE", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Method {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        private final String code;
        public static final Method GET = new Method("GET", 0, "GET");
        public static final Method POST = new Method(ShareTarget.METHOD_POST, 1, ShareTarget.METHOD_POST);
        public static final Method DELETE = new Method("DELETE", 2, "DELETE");

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{GET, POST, DELETE};
        }

        public static EnumEntries<Method> getEntries() {
            return $ENTRIES;
        }

        private Method(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Method[] methodArr$values = $values();
            $VALUES = methodArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(methodArr$values);
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Form", "MultipartForm", "Json", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MimeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MimeType[] $VALUES;
        private final String code;
        public static final MimeType Form = new MimeType("Form", 0, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        public static final MimeType MultipartForm = new MimeType("MultipartForm", 1, ShareTarget.ENCODING_TYPE_MULTIPART);
        public static final MimeType Json = new MimeType("Json", 2, "application/json");

        private static final /* synthetic */ MimeType[] $values() {
            return new MimeType[]{Form, MultipartForm, Json};
        }

        public static EnumEntries<MimeType> getEntries() {
            return $ENTRIES;
        }

        private MimeType(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            MimeType[] mimeTypeArr$values = $values();
            $VALUES = mimeTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mimeTypeArr$values);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        public static MimeType valueOf(String str) {
            return (MimeType) Enum.valueOf(MimeType.class, str);
        }

        public static MimeType[] values() {
            return (MimeType[]) $VALUES.clone();
        }
    }
}
