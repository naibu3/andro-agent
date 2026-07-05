package com.stripe.hcaptcha.config;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.hcaptcha.HCaptchaHtmlKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaInternalConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "Ljava/io/Serializable;", "htmlProvider", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getHtmlProvider", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HCaptchaInternalConfig implements Serializable {
    private static final long serialVersionUID = -7902994431534465881L;
    private final Function0<String> htmlProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public HCaptchaInternalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HCaptchaInternalConfig copy$default(HCaptchaInternalConfig hCaptchaInternalConfig, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = hCaptchaInternalConfig.htmlProvider;
        }
        return hCaptchaInternalConfig.copy(function0);
    }

    public final Function0<String> component1() {
        return this.htmlProvider;
    }

    public final HCaptchaInternalConfig copy(Function0<String> htmlProvider) {
        Intrinsics.checkNotNullParameter(htmlProvider, "htmlProvider");
        return new HCaptchaInternalConfig(htmlProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HCaptchaInternalConfig) && Intrinsics.areEqual(this.htmlProvider, ((HCaptchaInternalConfig) other).htmlProvider);
    }

    public int hashCode() {
        return this.htmlProvider.hashCode();
    }

    public String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + this.htmlProvider + ")";
    }

    public HCaptchaInternalConfig(Function0<String> htmlProvider) {
        Intrinsics.checkNotNullParameter(htmlProvider, "htmlProvider");
        this.htmlProvider = htmlProvider;
    }

    public /* synthetic */ HCaptchaInternalConfig(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HCaptchaHtmlKt.getHCAPTCHA_WEBVIEW_HTML_PROVIDER() : function0);
    }

    public final Function0<String> getHtmlProvider() {
        return this.htmlProvider;
    }
}
