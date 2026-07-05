package com.stripe.hcaptcha.webview;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.encode.EncodeKt;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaJSInterface.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0004\u001a\u00020\n8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;", "Ljava/io/Serializable;", "handler", "Landroid/os/Handler;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "captchaVerifier", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "<init>", "(Landroid/os/Handler;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;)V", "", "getConfig", "()Ljava/lang/String;", "config$delegate", "Lkotlin/Lazy;", "onPass", "", "token", "onError", "errCode", "", "onLoaded", "onOpen", "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaJSInterface implements Serializable {
    public static final String JS_INTERFACE_TAG = "JSInterface";
    private static final long serialVersionUID = -4830797392637553617L;
    private final transient IHCaptchaVerifier captchaVerifier;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final Lazy config;
    private final transient Handler handler;

    public HCaptchaJSInterface(Handler handler, final HCaptchaConfig config, IHCaptchaVerifier captchaVerifier) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(captchaVerifier, "captchaVerifier");
        this.handler = handler;
        this.captchaVerifier = captchaVerifier;
        this.config = LazyKt.lazy(new Function0() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HCaptchaJSInterface.config_delegate$lambda$0(config);
            }
        });
    }

    @JavascriptInterface
    public final String getConfig() {
        return (String) this.config.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String config_delegate$lambda$0(HCaptchaConfig hCaptchaConfig) {
        return EncodeKt.encodeToJson(HCaptchaConfig.INSTANCE.serializer(), hCaptchaConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPass$lambda$1(HCaptchaJSInterface hCaptchaJSInterface, String str) {
        hCaptchaJSInterface.captchaVerifier.onSuccess(str);
    }

    @JavascriptInterface
    public final void onPass(final String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onPass$lambda$1(this.f$0, token);
            }
        });
    }

    @JavascriptInterface
    public final void onError(int errCode) {
        final HCaptchaError hCaptchaErrorFromId = HCaptchaError.INSTANCE.fromId(errCode);
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onError$lambda$2(this.f$0, hCaptchaErrorFromId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$2(HCaptchaJSInterface hCaptchaJSInterface, HCaptchaError hCaptchaError) {
        hCaptchaJSInterface.captchaVerifier.onFailure(new HCaptchaException(hCaptchaError, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoaded$lambda$3(HCaptchaJSInterface hCaptchaJSInterface) {
        hCaptchaJSInterface.captchaVerifier.onLoaded();
    }

    @JavascriptInterface
    public final void onLoaded() {
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onLoaded$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOpen$lambda$4(HCaptchaJSInterface hCaptchaJSInterface) {
        hCaptchaJSInterface.captchaVerifier.onOpen();
    }

    @JavascriptInterface
    public final void onOpen() {
        this.handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaJSInterface$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                HCaptchaJSInterface.onOpen$lambda$4(this.f$0);
            }
        });
    }
}
