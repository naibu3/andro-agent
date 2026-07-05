package com.stripe.hcaptcha;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaException.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hCaptchaError", "Lcom/stripe/hcaptcha/HCaptchaError;", "hCaptchaMessage", "", "<init>", "(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)V", "getHCaptchaError", "()Lcom/stripe/hcaptcha/HCaptchaError;", "getHCaptchaMessage", "()Ljava/lang/String;", "message", "getMessage", "statusCode", "", "getStatusCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HCaptchaException extends Exception {
    private static final long serialVersionUID = -6219797459363514791L;
    private final HCaptchaError hCaptchaError;
    private final String hCaptchaMessage;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HCaptchaException(HCaptchaError hCaptchaError) {
        this(hCaptchaError, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(hCaptchaError, "hCaptchaError");
    }

    public static /* synthetic */ HCaptchaException copy$default(HCaptchaException hCaptchaException, HCaptchaError hCaptchaError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hCaptchaError = hCaptchaException.hCaptchaError;
        }
        if ((i & 2) != 0) {
            str = hCaptchaException.hCaptchaMessage;
        }
        return hCaptchaException.copy(hCaptchaError, str);
    }

    /* renamed from: component1, reason: from getter */
    public final HCaptchaError getHCaptchaError() {
        return this.hCaptchaError;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHCaptchaMessage() {
        return this.hCaptchaMessage;
    }

    public final HCaptchaException copy(HCaptchaError hCaptchaError, String hCaptchaMessage) {
        Intrinsics.checkNotNullParameter(hCaptchaError, "hCaptchaError");
        return new HCaptchaException(hCaptchaError, hCaptchaMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) other;
        return this.hCaptchaError == hCaptchaException.hCaptchaError && Intrinsics.areEqual(this.hCaptchaMessage, hCaptchaException.hCaptchaMessage);
    }

    public int hashCode() {
        int iHashCode = this.hCaptchaError.hashCode() * 31;
        String str = this.hCaptchaMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HCaptchaException(hCaptchaError=" + this.hCaptchaError + ", hCaptchaMessage=" + this.hCaptchaMessage + ")";
    }

    public /* synthetic */ HCaptchaException(HCaptchaError hCaptchaError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hCaptchaError, (i & 2) != 0 ? null : str);
    }

    public final HCaptchaError getHCaptchaError() {
        return this.hCaptchaError;
    }

    public final String getHCaptchaMessage() {
        return this.hCaptchaMessage;
    }

    public HCaptchaException(HCaptchaError hCaptchaError, String str) {
        Intrinsics.checkNotNullParameter(hCaptchaError, "hCaptchaError");
        this.hCaptchaError = hCaptchaError;
        this.hCaptchaMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.hCaptchaMessage;
        return str == null ? this.hCaptchaError.getMessage() : str;
    }

    public final int getStatusCode() {
        return this.hCaptchaError.getErrorId();
    }
}
