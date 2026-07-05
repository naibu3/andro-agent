package com.stripe.hcaptcha.webview;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.R;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaHeadlessWebView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "activity", "Landroid/app/Activity;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "<init>", "(Landroid/app/Activity;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V", "webViewHelper", "Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;", "webViewLoaded", "", "shouldExecuteOnLoad", "shouldResetOnLoad", "startVerification", "", "Landroidx/fragment/app/FragmentActivity;", "onFailure", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/hcaptcha/HCaptchaException;", "onSuccess", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "onLoaded", "onOpen", "reset", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaHeadlessWebView implements IHCaptchaVerifier {
    private final HCaptchaStateListener listener;
    private boolean shouldExecuteOnLoad;
    private boolean shouldResetOnLoad;
    private final HCaptchaWebViewHelper webViewHelper;
    private boolean webViewLoaded;

    public HCaptchaHeadlessWebView(Activity activity, HCaptchaConfig config, HCaptchaInternalConfig internalConfig, HCaptchaStateListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        Activity activity2 = activity;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activity2);
        hCaptchaWebView.setId(R.id.webView);
        hCaptchaWebView.setVisibility(8);
        if (hCaptchaWebView.getParent() == null) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) rootView).addView(hCaptchaWebView);
        }
        this.webViewHelper = new HCaptchaWebViewHelper(new Handler(Looper.getMainLooper()), activity2, config, internalConfig, this, listener, hCaptchaWebView);
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public void startVerification(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.webViewLoaded) {
            this.webViewHelper.resetAndExecute();
        } else {
            this.shouldExecuteOnLoad = true;
        }
    }

    @Override // com.stripe.hcaptcha.task.OnFailureListener
    public void onFailure(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.webViewHelper.shouldRetry(exception)) {
            this.webViewHelper.resetAndExecute();
        } else {
            this.listener.getOnFailure().invoke(exception);
        }
    }

    @Override // com.stripe.hcaptcha.task.OnSuccessListener
    public void onSuccess(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.listener.getOnSuccess().invoke(result);
    }

    @Override // com.stripe.hcaptcha.task.OnLoadedListener
    public void onLoaded() {
        this.webViewLoaded = true;
        if (this.shouldResetOnLoad) {
            this.shouldResetOnLoad = false;
            reset();
        } else if (this.shouldExecuteOnLoad) {
            this.shouldExecuteOnLoad = false;
            this.webViewHelper.resetAndExecute();
        }
    }

    @Override // com.stripe.hcaptcha.task.OnOpenListener
    public void onOpen() {
        this.listener.getOnOpen().invoke();
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public void reset() {
        if (this.webViewLoaded) {
            this.webViewHelper.reset();
            WebView webView$hcaptcha_release = this.webViewHelper.getWebView();
            if (webView$hcaptcha_release.getParent() != null) {
                ViewParent parent = webView$hcaptcha_release.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(webView$hcaptcha_release);
                return;
            }
            return;
        }
        this.shouldResetOnLoad = true;
    }
}
