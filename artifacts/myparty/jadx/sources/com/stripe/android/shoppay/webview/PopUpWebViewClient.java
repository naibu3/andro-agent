package com.stripe.android.shoppay.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewAssetLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PopUpWebViewClient.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\"\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/shoppay/webview/PopUpWebViewClient;", "Landroid/webkit/WebViewClient;", "assetLoader", "Landroidx/webkit/WebViewAssetLoader;", "onPageLoaded", "Lkotlin/Function2;", "Landroid/webkit/WebView;", "", "", "<init>", "(Landroidx/webkit/WebViewAssetLoader;Lkotlin/jvm/functions/Function2;)V", "logger", "Lcom/stripe/android/core/Logger;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", ViewHierarchyConstants.VIEW_KEY, "request", "Landroid/webkit/WebResourceRequest;", "onPageFinished", "url", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopUpWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    private final WebViewAssetLoader assetLoader;
    private final Logger logger;
    private final Function2<WebView, String, Unit> onPageLoaded;

    /* JADX WARN: Multi-variable type inference failed */
    public PopUpWebViewClient(WebViewAssetLoader assetLoader, Function2<? super WebView, ? super String, Unit> onPageLoaded) {
        Intrinsics.checkNotNullParameter(assetLoader, "assetLoader");
        Intrinsics.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        this.assetLoader = assetLoader;
        this.onPageLoaded = onPageLoaded;
        this.logger = Logger.INSTANCE.getInstance(false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        if (request == null) {
            return null;
        }
        return this.assetLoader.shouldInterceptRequest(request.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        this.logger.info("✅ Navigation finished: " + url);
        this.onPageLoaded.invoke(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageStarted(view, url, favicon);
        this.logger.info("🚀 Navigation started: " + url);
    }
}
