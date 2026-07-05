package com.stripe.android.shoppay.webview;

import android.content.Context;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.webkit.WebViewAssetLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.shoppay.bridge.ShopPayBridgeHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PopUpWebChromeClient.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J,\u0010\u001f\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;", "Landroid/webkit/WebChromeClient;", "context", "Landroid/content/Context;", "bridgeHandler", "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;", "assetLoader", "Landroidx/webkit/WebViewAssetLoader;", "setPopUpView", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "closeWebView", "Lkotlin/Function0;", "onPageLoaded", "Lkotlin/Function2;", "", "<init>", "(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroidx/webkit/WebViewAssetLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "logger", "Lcom/stripe/android/core/Logger;", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onJsAlert", ViewHierarchyConstants.VIEW_KEY, "url", "message", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Landroid/webkit/JsResult;", "onCreateWindow", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "onCloseWindow", "window", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopUpWebChromeClient extends WebChromeClient {
    public static final int $stable = 8;
    private final WebViewAssetLoader assetLoader;
    private final ShopPayBridgeHandler bridgeHandler;
    private final Function0<Unit> closeWebView;
    private final Context context;
    private final Logger logger;
    private final Function2<WebView, String, Unit> onPageLoaded;
    private final Function1<WebView, Unit> setPopUpView;

    /* JADX WARN: Multi-variable type inference failed */
    public PopUpWebChromeClient(Context context, ShopPayBridgeHandler bridgeHandler, WebViewAssetLoader assetLoader, Function1<? super WebView, Unit> setPopUpView, Function0<Unit> closeWebView, Function2<? super WebView, ? super String, Unit> onPageLoaded) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Intrinsics.checkNotNullParameter(assetLoader, "assetLoader");
        Intrinsics.checkNotNullParameter(setPopUpView, "setPopUpView");
        Intrinsics.checkNotNullParameter(closeWebView, "closeWebView");
        Intrinsics.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        this.context = context;
        this.bridgeHandler = bridgeHandler;
        this.assetLoader = assetLoader;
        this.setPopUpView = setPopUpView;
        this.closeWebView = closeWebView;
        this.onPageLoaded = onPageLoaded;
        this.logger = Logger.INSTANCE.getInstance(false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        this.logger.debug(PopUpWebChromeClientKt.getEmojiForLogLevel(consoleMessage.messageLevel().toString()) + " [" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + "] " + consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        if (result == null) {
            return true;
        }
        result.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        if (resultMsg == null) {
            return false;
        }
        Object obj = resultMsg.obj;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        EceWebView eceWebView = new EceWebView(this.context, this.bridgeHandler, new PopUpWebViewClient(this.assetLoader, this.onPageLoaded), new PopUpWebChromeClient(this.context, this.bridgeHandler, this.assetLoader, this.setPopUpView, this.closeWebView, this.onPageLoaded));
        webViewTransport.setWebView(eceWebView);
        resultMsg.sendToTarget();
        this.setPopUpView.invoke(eceWebView);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView window) {
        super.onCloseWindow(window);
        this.closeWebView.invoke();
    }
}
