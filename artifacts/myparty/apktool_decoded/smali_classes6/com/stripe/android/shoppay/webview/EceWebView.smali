.class public final Lcom/stripe/android/shoppay/webview/EceWebView;
.super Landroid/webkit/WebView;
.source "EceWebView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/webview/EceWebView;",
        "Landroid/webkit/WebView;",
        "context",
        "Landroid/content/Context;",
        "bridgeHandler",
        "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
        "webViewClient",
        "Landroid/webkit/WebViewClient;",
        "webChromeClient",
        "Landroid/webkit/WebChromeClient;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroid/webkit/WebViewClient;Landroid/webkit/WebChromeClient;)V",
        "evaluateJavascript",
        "",
        "script",
        "",
        "resultCallback",
        "Landroid/webkit/ValueCallback;",
        "configureDefaultSettings",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroid/webkit/WebViewClient;Landroid/webkit/WebChromeClient;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bridgeHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webChromeClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-direct {p0, p2}, Lcom/stripe/android/shoppay/webview/EceWebView;->configureDefaultSettings(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;)V

    .line 20
    invoke-virtual {p0, p3}, Lcom/stripe/android/shoppay/webview/EceWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 21
    invoke-virtual {p0, p4}, Lcom/stripe/android/shoppay/webview/EceWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method private final configureDefaultSettings(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;)V
    .locals 2

    .line 30
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/webview/EceWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 31
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/webview/EceWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 32
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/webview/EceWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 33
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/webview/EceWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v1, "Mozilla/5.0 (iPhone; CPU iPhone OS 18_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.1.1 Mobile/15E148 Safari/604.1"

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 35
    const-string v0, "androidBridge"

    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/shoppay/webview/EceWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "script"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method
