.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;
.super Landroid/webkit/WebViewClient;
.source "ScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->configureWebClient()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0008\u001a\u00020\t2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017\u00a8\u0006\n"
    }
    d2 = {
        "com/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1",
        "Landroid/webkit/WebViewClient;",
        "onPageFinished",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "url",
        "",
        "shouldOverrideUrlLoading",
        "",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    .line 180
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->access$getBinding$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 188
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated since API 24"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    .line 183
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getPresenter$sdk_release()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->shouldOverrideUrlLoading(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
