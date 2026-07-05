.class public final Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;
.super Ljava/lang/Object;
.source "HCaptchaHeadlessWebView.kt"

# interfaces
.implements Lcom/stripe/hcaptcha/IHCaptchaVerifier;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0008\u0010\u001b\u001a\u00020\u0013H\u0016J\u0008\u0010\u001c\u001a\u00020\u0013H\u0016J\u0008\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;",
        "Lcom/stripe/hcaptcha/IHCaptchaVerifier;",
        "activity",
        "Landroid/app/Activity;",
        "config",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "internalConfig",
        "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;",
        "listener",
        "Lcom/stripe/hcaptcha/HCaptchaStateListener;",
        "<init>",
        "(Landroid/app/Activity;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V",
        "webViewHelper",
        "Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;",
        "webViewLoaded",
        "",
        "shouldExecuteOnLoad",
        "shouldResetOnLoad",
        "startVerification",
        "",
        "Landroidx/fragment/app/FragmentActivity;",
        "onFailure",
        "exception",
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "onSuccess",
        "result",
        "",
        "onLoaded",
        "onOpen",
        "reset",
        "hcaptcha_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final listener:Lcom/stripe/hcaptcha/HCaptchaStateListener;

.field private shouldExecuteOnLoad:Z

.field private shouldResetOnLoad:Z

.field private final webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

.field private webViewLoaded:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V
    .locals 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p4, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->listener:Lcom/stripe/hcaptcha/HCaptchaStateListener;

    .line 31
    new-instance v0, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    move-object v3, p1

    check-cast v3, Landroid/content/Context;

    invoke-direct {v0, v3}, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;-><init>(Landroid/content/Context;)V

    move-object v8, v0

    check-cast v8, Landroid/webkit/WebView;

    .line 32
    sget v0, Lcom/stripe/hcaptcha/R$id;->webView:I

    invoke-virtual {v8, v0}, Landroid/webkit/WebView;->setId(I)V

    const/16 v0, 0x8

    .line 33
    invoke-virtual {v8, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 35
    invoke-virtual {v8}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    .line 37
    move-object v0, v8

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    :cond_0
    new-instance v1, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    .line 41
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    move-object v6, p0

    check-cast v6, Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    move-object v4, p2

    move-object v5, p3

    move-object v7, p4

    .line 40
    invoke-direct/range {v1 .. v8}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;Lcom/stripe/hcaptcha/HCaptchaStateListener;Landroid/webkit/WebView;)V

    iput-object v1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    invoke-virtual {v0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->shouldRetry(Lcom/stripe/hcaptcha/HCaptchaException;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    invoke-virtual {p1}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->resetAndExecute()V

    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->listener:Lcom/stripe/hcaptcha/HCaptchaStateListener;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnFailure()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onLoaded()V
    .locals 2

    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewLoaded:Z

    .line 75
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->shouldResetOnLoad:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 76
    iput-boolean v1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->shouldResetOnLoad:Z

    .line 77
    invoke-virtual {p0}, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->reset()V

    return-void

    .line 78
    :cond_0
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->shouldExecuteOnLoad:Z

    if-eqz v0, :cond_1

    .line 79
    iput-boolean v1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->shouldExecuteOnLoad:Z

    .line 80
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->resetAndExecute()V

    :cond_1
    return-void
.end method

.method public onOpen()V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->listener:Lcom/stripe/hcaptcha/HCaptchaStateListener;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnOpen()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->onSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->listener:Lcom/stripe/hcaptcha/HCaptchaStateListener;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaStateListener;->getOnSuccess()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public reset()V
    .locals 3

    .line 89
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewLoaded:Z

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->reset()V

    .line 91
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->getWebView$hcaptcha_release()Landroid/webkit/WebView;

    move-result-object v0

    .line 92
    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 93
    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    .line 96
    iput-boolean v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->shouldResetOnLoad:Z

    return-void
.end method

.method public startVerification(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-boolean p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewLoaded:Z

    if-eqz p1, :cond_0

    .line 54
    iget-object p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->webViewHelper:Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;

    invoke-virtual {p1}, Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;->resetAndExecute()V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaHeadlessWebView;->shouldExecuteOnLoad:Z

    return-void
.end method
