package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.webview.HCaptchaWebViewHelper;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: HCaptchaWebViewHelper.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 #2\u00020\u0001:\u0003!\"#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;", "", "handler", "Landroid/os/Handler;", "context", "Landroid/content/Context;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "captchaVerifier", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "webView", "Landroid/webkit/WebView;", "<init>", "(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;Lcom/stripe/hcaptcha/HCaptchaStateListener;Landroid/webkit/WebView;)V", "getConfig$hcaptcha_release", "()Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "getListener$hcaptcha_release", "()Lcom/stripe/hcaptcha/HCaptchaStateListener;", "getWebView$hcaptcha_release", "()Landroid/webkit/WebView;", "setupWebView", "", "destroy", "resetAndExecute", "reset", "shouldRetry", "", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/hcaptcha/HCaptchaException;", "HCaptchaWebClient", "HCaptchaWebChromeClient", "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaWebViewHelper {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "hCaptchaWebView";
    private final IHCaptchaVerifier captchaVerifier;
    private final HCaptchaConfig config;
    private final Context context;
    private final HCaptchaInternalConfig internalConfig;
    private final HCaptchaStateListener listener;
    private final WebView webView;

    public HCaptchaWebViewHelper(Handler handler, Context context, HCaptchaConfig config, HCaptchaInternalConfig internalConfig, IHCaptchaVerifier captchaVerifier, HCaptchaStateListener listener, WebView webView) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(captchaVerifier, "captchaVerifier");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.context = context;
        this.config = config;
        this.internalConfig = internalConfig;
        this.captchaVerifier = captchaVerifier;
        this.listener = listener;
        this.webView = webView;
        setupWebView(handler);
    }

    /* renamed from: getConfig$hcaptcha_release, reason: from getter */
    public final HCaptchaConfig getConfig() {
        return this.config;
    }

    /* renamed from: getListener$hcaptcha_release, reason: from getter */
    public final HCaptchaStateListener getListener() {
        return this.listener;
    }

    /* renamed from: getWebView$hcaptcha_release, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    private final void setupWebView(Handler handler) {
        HCaptchaJSInterface hCaptchaJSInterface = new HCaptchaJSInterface(handler, this.config, this.captchaVerifier);
        HCaptchaDebugInfo hCaptchaDebugInfo = new HCaptchaDebugInfo(this.context);
        WebSettings settings = this.webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(-1);
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        this.webView.setWebViewClient(new HCaptchaWebClient(this, handler, this.listener));
        this.webView.setWebChromeClient(new HCaptchaWebChromeClient());
        this.webView.setBackgroundColor(0);
        if (this.config.getDisableHardwareAcceleration()) {
            this.webView.setLayerType(1, null);
        }
        this.webView.addJavascriptInterface(hCaptchaJSInterface, HCaptchaJSInterface.JS_INTERFACE_TAG);
        this.webView.addJavascriptInterface(hCaptchaDebugInfo, HCaptchaDebugInfo.JS_INTERFACE_TAG);
        this.webView.loadDataWithBaseURL(this.config.getHost(), this.internalConfig.getHtmlProvider().invoke(), "text/html", "UTF-8", null);
    }

    public final void destroy() {
        this.webView.removeJavascriptInterface(HCaptchaJSInterface.JS_INTERFACE_TAG);
        this.webView.removeJavascriptInterface(HCaptchaDebugInfo.JS_INTERFACE_TAG);
        ViewParent parent = this.webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.webView);
        }
        this.webView.destroy();
    }

    public final void resetAndExecute() {
        this.webView.loadUrl("javascript:resetAndExecute();");
    }

    public final void reset() {
        this.webView.loadUrl("javascript:reset();");
    }

    public final boolean shouldRetry(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Function2<HCaptchaConfig, HCaptchaException, Boolean> retryPredicate = this.config.getRetryPredicate();
        if (retryPredicate != null) {
            return retryPredicate.invoke(this.config, exception).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HCaptchaWebViewHelper.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u0014\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0018\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u0019\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper$HCaptchaWebClient;", "Landroid/webkit/WebViewClient;", "handler", "Landroid/os/Handler;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "<init>", "(Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;Landroid/os/Handler;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V", "stripUrl", "", "url", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "onReceivedHttpError", "", "errorResponse", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onLoadResource", "onPageFinished", "onReceivedError", "error", "Landroid/webkit/WebResourceError;", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class HCaptchaWebClient extends WebViewClient {
        private final Handler handler;
        private final HCaptchaStateListener listener;
        final /* synthetic */ HCaptchaWebViewHelper this$0;

        public HCaptchaWebClient(HCaptchaWebViewHelper hCaptchaWebViewHelper, Handler handler, HCaptchaStateListener listener) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.this$0 = hCaptchaWebViewHelper;
            this.handler = handler;
            this.listener = listener;
        }

        private final String stripUrl(String url) {
            List listEmptyList;
            if (url != null) {
                List<String> listSplit = new Regex("[?#]").split(url, 0);
                if (!listSplit.isEmpty()) {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                String str = ((String[]) listEmptyList.toArray(new String[0]))[0] + "...";
                return str == null ? AbstractJsonLexerKt.NULL : str;
            }
            return AbstractJsonLexerKt.NULL;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            final Uri url = request.getUrl();
            if (url != null && url.getScheme() != null && Intrinsics.areEqual(url.getScheme(), "http")) {
                Handler handler = this.handler;
                final HCaptchaWebViewHelper hCaptchaWebViewHelper = this.this$0;
                handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaWebViewHelper$HCaptchaWebClient$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        HCaptchaWebViewHelper.HCaptchaWebClient.shouldInterceptRequest$lambda$2(hCaptchaWebViewHelper, this, url);
                    }
                });
            }
            return super.shouldInterceptRequest(view, request);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void shouldInterceptRequest$lambda$2(HCaptchaWebViewHelper hCaptchaWebViewHelper, HCaptchaWebClient hCaptchaWebClient, Uri uri) {
            hCaptchaWebViewHelper.getWebView().removeJavascriptInterface(HCaptchaJSInterface.JS_INTERFACE_TAG);
            hCaptchaWebViewHelper.getWebView().removeJavascriptInterface(HCaptchaDebugInfo.JS_INTERFACE_TAG);
            hCaptchaWebClient.listener.getOnFailure().invoke(new HCaptchaException(HCaptchaError.INSECURE_HTTP_REQUEST_ERROR, "Insecure resource " + uri + " requested"));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            super.onReceivedHttpError(view, request, errorResponse);
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onReceivedHttpError");
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onPageStarted " + stripUrl(url));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onLoadResource " + stripUrl(url));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onPageFinished " + stripUrl(url));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onReceivedError(view, request, error);
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onReceivedError \"" + ((Object) (error != null ? error.getDescription() : null)) + "\" (" + (error != null ? Integer.valueOf(error.getErrorCode()) : null) + ")");
        }
    }

    /* compiled from: HCaptchaWebViewHelper.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper$HCaptchaWebChromeClient;", "Landroid/webkit/WebChromeClient;", "<init>", "()V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onProgressChanged", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "newProgress", "", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class HCaptchaWebChromeClient extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onConsoleMessage " + consoleMessage.message());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            Intrinsics.checkNotNullParameter(view, "view");
            Log.d(HCaptchaWebViewHelper.LOG_TAG, "[webview] onProgressChanged " + newProgress + "%");
        }
    }

    /* compiled from: HCaptchaWebViewHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper$Companion;", "", "<init>", "()V", "LOG_TAG", "", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
