.class public final Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "PopUpWebChromeClient.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0019\u001a\u00020\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J,\u0010\u001f\u001a\u00020\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u000b2\u0008\u0010%\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;",
        "Landroid/webkit/WebChromeClient;",
        "context",
        "Landroid/content/Context;",
        "bridgeHandler",
        "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
        "assetLoader",
        "Landroidx/webkit/WebViewAssetLoader;",
        "setPopUpView",
        "Lkotlin/Function1;",
        "Landroid/webkit/WebView;",
        "",
        "closeWebView",
        "Lkotlin/Function0;",
        "onPageLoaded",
        "Lkotlin/Function2;",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroidx/webkit/WebViewAssetLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "onConsoleMessage",
        "",
        "consoleMessage",
        "Landroid/webkit/ConsoleMessage;",
        "onJsAlert",
        "view",
        "url",
        "message",
        "result",
        "Landroid/webkit/JsResult;",
        "onCreateWindow",
        "isDialog",
        "isUserGesture",
        "resultMsg",
        "Landroid/os/Message;",
        "onCloseWindow",
        "window",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final assetLoader:Landroidx/webkit/WebViewAssetLoader;

.field private final bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

.field private final closeWebView:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final onPageLoaded:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final setPopUpView:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroidx/webkit/WebViewAssetLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
            "Landroidx/webkit/WebViewAssetLoader;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/webkit/WebView;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bridgeHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assetLoader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setPopUpView"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeWebView"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPageLoaded"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->context:Landroid/content/Context;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

    .line 17
    iput-object p3, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->assetLoader:Landroidx/webkit/WebViewAssetLoader;

    .line 18
    iput-object p4, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->setPopUpView:Lkotlin/jvm/functions/Function1;

    .line 19
    iput-object p5, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->closeWebView:Lkotlin/jvm/functions/Function0;

    .line 20
    iput-object p6, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->onPageLoaded:Lkotlin/jvm/functions/Function2;

    .line 22
    sget-object p1, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method


# virtual methods
.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 0

    .line 74
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 75
    iget-object p1, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->closeWebView:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 5

    const-string v0, "consoleMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->logger:Lcom/stripe/android/core/Logger;

    .line 25
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/ConsoleMessage$MessageLevel;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClientKt;->access$getEmojiForLogLevel(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    move-result v3

    .line 27
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " ["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 9

    const/4 p1, 0x0

    if-nez p4, :cond_0

    return p1

    .line 49
    :cond_0
    iget-object p2, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of p3, p2, Landroid/webkit/WebView$WebViewTransport;

    if-eqz p3, :cond_1

    check-cast p2, Landroid/webkit/WebView$WebViewTransport;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    return p1

    .line 50
    :cond_2
    new-instance p1, Lcom/stripe/android/shoppay/webview/EceWebView;

    .line 51
    iget-object p3, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->context:Landroid/content/Context;

    .line 52
    iget-object v0, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

    .line 53
    new-instance v1, Lcom/stripe/android/shoppay/webview/PopUpWebViewClient;

    .line 54
    iget-object v2, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->assetLoader:Landroidx/webkit/WebViewAssetLoader;

    .line 55
    iget-object v3, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->onPageLoaded:Lkotlin/jvm/functions/Function2;

    .line 53
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/shoppay/webview/PopUpWebViewClient;-><init>(Landroidx/webkit/WebViewAssetLoader;Lkotlin/jvm/functions/Function2;)V

    check-cast v1, Landroid/webkit/WebViewClient;

    .line 57
    new-instance v2, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;

    .line 58
    iget-object v3, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->context:Landroid/content/Context;

    .line 59
    iget-object v4, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

    .line 60
    iget-object v5, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->assetLoader:Landroidx/webkit/WebViewAssetLoader;

    .line 61
    iget-object v6, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->setPopUpView:Lkotlin/jvm/functions/Function1;

    .line 62
    iget-object v7, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->closeWebView:Lkotlin/jvm/functions/Function0;

    .line 63
    iget-object v8, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->onPageLoaded:Lkotlin/jvm/functions/Function2;

    .line 57
    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;-><init>(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroidx/webkit/WebViewAssetLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V

    check-cast v2, Landroid/webkit/WebChromeClient;

    .line 50
    invoke-direct {p1, p3, v0, v1, v2}, Lcom/stripe/android/shoppay/webview/EceWebView;-><init>(Landroid/content/Context;Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Landroid/webkit/WebViewClient;Landroid/webkit/WebChromeClient;)V

    .line 67
    move-object p3, p1

    check-cast p3, Landroid/webkit/WebView;

    invoke-virtual {p2, p3}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 68
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 69
    iget-object p2, p0, Lcom/stripe/android/shoppay/webview/PopUpWebChromeClient;->setPopUpView:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0

    if-eqz p4, :cond_0

    .line 38
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
