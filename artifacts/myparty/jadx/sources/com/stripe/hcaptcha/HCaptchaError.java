package com.stripe.hcaptcha;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HCaptchaError.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0018\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001a"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaError;", "Ljava/io/Serializable;", "", "errorId", "", "message", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorId", "()I", "getMessage", "()Ljava/lang/String;", "NETWORK_ERROR", "INVALID_DATA", "CHALLENGE_ERROR", "INTERNAL_ERROR", "SESSION_TIMEOUT", "TOKEN_TIMEOUT", "CHALLENGE_CLOSED", "RATE_LIMITED", "INVALID_CUSTOM_THEME", "INSECURE_HTTP_REQUEST_ERROR", "ERROR", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaError implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HCaptchaError[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int errorId;
    private final String message;
    public static final HCaptchaError NETWORK_ERROR = new HCaptchaError("NETWORK_ERROR", 0, 7, "No internet connection");
    public static final HCaptchaError INVALID_DATA = new HCaptchaError("INVALID_DATA", 1, 8, "Invalid data is not accepted by endpoints");
    public static final HCaptchaError CHALLENGE_ERROR = new HCaptchaError("CHALLENGE_ERROR", 2, 9, "Challenge encountered error on setup");
    public static final HCaptchaError INTERNAL_ERROR = new HCaptchaError("INTERNAL_ERROR", 3, 10, "hCaptcha client encountered an internal error");
    public static final HCaptchaError SESSION_TIMEOUT = new HCaptchaError("SESSION_TIMEOUT", 4, 15, "Session Timeout");
    public static final HCaptchaError TOKEN_TIMEOUT = new HCaptchaError("TOKEN_TIMEOUT", 5, 16, "Token Timeout");
    public static final HCaptchaError CHALLENGE_CLOSED = new HCaptchaError("CHALLENGE_CLOSED", 6, 30, "Challenge Closed");
    public static final HCaptchaError RATE_LIMITED = new HCaptchaError("RATE_LIMITED", 7, 31, "Rate Limited");
    public static final HCaptchaError INVALID_CUSTOM_THEME = new HCaptchaError("INVALID_CUSTOM_THEME", 8, 32, "Invalid custom theme");
    public static final HCaptchaError INSECURE_HTTP_REQUEST_ERROR = new HCaptchaError("INSECURE_HTTP_REQUEST_ERROR", 9, 33, "Insecure resource requested");
    public static final HCaptchaError ERROR = new HCaptchaError("ERROR", 10, 29, "Unknown error");

    private static final /* synthetic */ HCaptchaError[] $values() {
        return new HCaptchaError[]{NETWORK_ERROR, INVALID_DATA, CHALLENGE_ERROR, INTERNAL_ERROR, SESSION_TIMEOUT, TOKEN_TIMEOUT, CHALLENGE_CLOSED, RATE_LIMITED, INVALID_CUSTOM_THEME, INSECURE_HTTP_REQUEST_ERROR, ERROR};
    }

    public static EnumEntries<HCaptchaError> getEntries() {
        return $ENTRIES;
    }

    private HCaptchaError(String str, int i, int i2, String str2) {
        this.errorId = i2;
        this.message = str2;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final String getMessage() {
        return this.message;
    }

    static {
        HCaptchaError[] hCaptchaErrorArr$values = $values();
        $VALUES = hCaptchaErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(hCaptchaErrorArr$values);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.message;
    }

    /* compiled from: HCaptchaError.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaError$Companion;", "", "<init>", "()V", "fromId", "Lcom/stripe/hcaptcha/HCaptchaError;", "errorId", "", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HCaptchaError fromId(int errorId) {
            for (HCaptchaError hCaptchaError : HCaptchaError.getEntries()) {
                if (hCaptchaError.getErrorId() == errorId) {
                    return hCaptchaError;
                }
            }
            throw new RuntimeException("Unsupported error id: " + errorId);
        }
    }

    public static HCaptchaError valueOf(String str) {
        return (HCaptchaError) Enum.valueOf(HCaptchaError.class, str);
    }

    public static HCaptchaError[] values() {
        return (HCaptchaError[]) $VALUES.clone();
    }
}
