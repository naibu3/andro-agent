package com.stripe.android.shoppay.webview;

import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.shoppay.bridge.ShopPayBridgeHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EceWebView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/shoppay/webview/EceWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "bridgeHandler", "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;", "webViewClient", "Landroid/webkit/WebViewClient;", "webChromeClient", "Landroid/webkit/WebChromeClient;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroid/webkit/WebViewClient;Landroid/webkit/WebChromeClient;)V", "evaluateJavascript", "", "script", "", "resultCallback", "Landroid/webkit/ValueCallback;", "configureDefaultSettings", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EceWebView extends WebView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EceWebView(Context context, ShopPayBridgeHandler bridgeHandler, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(webChromeClient, "webChromeClient");
        configureDefaultSettings(bridgeHandler);
        setWebViewClient(webViewClient);
        setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String script, ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        super.evaluateJavascript(script, resultCallback);
    }

    private final void configureDefaultSettings(ShopPayBridgeHandler bridgeHandler) {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setSupportMultipleWindows(true);
        getSettings().setUserAgentString("Mozilla/5.0 (iPhone; CPU iPhone OS 18_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.1.1 Mobile/15E148 Safari/604.1");
        addJavascriptInterface(bridgeHandler, EceWebViewKt.BRIDGE_NAME);
    }
}
