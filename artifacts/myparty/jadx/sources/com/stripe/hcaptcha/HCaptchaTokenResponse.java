package com.stripe.hcaptcha;

import android.os.Handler;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaTokenResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaTokenResponse;", "", "tokenResult", "", "handler", "Landroid/os/Handler;", "<init>", "(Ljava/lang/String;Landroid/os/Handler;)V", "getTokenResult", "()Ljava/lang/String;", "markUsed", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HCaptchaTokenResponse {
    private final Handler handler;
    private final String tokenResult;

    /* renamed from: component2, reason: from getter */
    private final Handler getHandler() {
        return this.handler;
    }

    public static /* synthetic */ HCaptchaTokenResponse copy$default(HCaptchaTokenResponse hCaptchaTokenResponse, String str, Handler handler, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hCaptchaTokenResponse.tokenResult;
        }
        if ((i & 2) != 0) {
            handler = hCaptchaTokenResponse.handler;
        }
        return hCaptchaTokenResponse.copy(str, handler);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTokenResult() {
        return this.tokenResult;
    }

    public final HCaptchaTokenResponse copy(String tokenResult, Handler handler) {
        Intrinsics.checkNotNullParameter(tokenResult, "tokenResult");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new HCaptchaTokenResponse(tokenResult, handler);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaTokenResponse)) {
            return false;
        }
        HCaptchaTokenResponse hCaptchaTokenResponse = (HCaptchaTokenResponse) other;
        return Intrinsics.areEqual(this.tokenResult, hCaptchaTokenResponse.tokenResult) && Intrinsics.areEqual(this.handler, hCaptchaTokenResponse.handler);
    }

    public int hashCode() {
        return (this.tokenResult.hashCode() * 31) + this.handler.hashCode();
    }

    public String toString() {
        return "HCaptchaTokenResponse(tokenResult=" + this.tokenResult + ", handler=" + this.handler + ")";
    }

    public HCaptchaTokenResponse(String tokenResult, Handler handler) {
        Intrinsics.checkNotNullParameter(tokenResult, "tokenResult");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.tokenResult = tokenResult;
        this.handler = handler;
    }

    public final String getTokenResult() {
        return this.tokenResult;
    }

    public final void markUsed() {
        this.handler.removeCallbacksAndMessages(null);
    }
}
