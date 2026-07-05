.class public final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;
.super Landroidx/activity/ComponentActivity;
.source "FinancialConnectionsSheetLiteActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;,
        Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSheetLiteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetLiteActivity.kt\ncom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,171:1\n75#2,13:172\n1#3:185\n256#4,2:186\n29#5:188\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetLiteActivity.kt\ncom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity\n*L\n39#1:172,13\n99#1:186,2\n128#1:188\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015J\u0008\u0010\u0012\u001a\u00020\u000fH\u0002J\u0008\u0010\u0013\u001a\u00020\u000fH\u0002J\u0008\u0010\u0014\u001a\u00020\u0005H\u0003J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "webView",
        "Landroid/webkit/WebView;",
        "progressBar",
        "Landroid/widget/ProgressBar;",
        "viewModel",
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setupBackButtonHandling",
        "setupProgressBar",
        "setupWebView",
        "openCustomTab",
        "uri",
        "",
        "handleUrl",
        "",
        "Landroid/net/Uri;",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "Companion",
        "financial-connections-lite_release"
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
.field public static final Companion:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;


# instance fields
.field private progressBar:Landroid/widget/ProgressBar;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private webView:Landroid/webkit/WebView;


# direct methods
.method public static synthetic $r8$lambda$Xo0d3uHo2SOL0IZwezNNLdutlCE()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->viewModel_delegate$lambda$0()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->Companion:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 34
    sget v0, Lcom/stripe/android/financialconnections/lite/R$layout;->stripe_activity_lite:I

    invoke-direct {p0, v0}, Landroidx/activity/ComponentActivity;-><init>(I)V

    .line 39
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$$ExternalSyntheticLambda0;-><init>()V

    .line 180
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 182
    new-instance v4, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 184
    new-instance v5, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 180
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 39
    iput-object v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getProgressBar$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)Landroid/widget/ProgressBar;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->getViewModel()Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getWebView$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)Landroid/webkit/WebView;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->webView:Landroid/webkit/WebView;

    return-object p0
.end method

.method public static final synthetic access$handleUrl(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Landroid/net/Uri;)Z
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->handleUrl(Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$openCustomTab(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->openCustomTab(Ljava/lang/String;)V

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 1

    .line 140
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->setResult(ILandroid/content/Intent;)V

    .line 141
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->finish()V

    return-void
.end method

.method private final getViewModel()Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    return-object v0
.end method

.method private final handleUrl(Landroid/net/Uri;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 133
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->getViewModel()Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "toString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->handleUrl-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final openCustomTab(Ljava/lang/String;)V
    .locals 2

    .line 123
    new-instance v0, Landroidx/browser/customtabs/CustomTabsIntent$Builder;

    invoke-direct {v0}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;-><init>()V

    const/4 v1, 0x1

    .line 124
    invoke-virtual {v0, v1}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;->setShowTitle(Z)Landroidx/browser/customtabs/CustomTabsIntent$Builder;

    move-result-object v0

    const/4 v1, 0x2

    .line 125
    invoke-virtual {v0, v1}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;->setShareState(I)Landroidx/browser/customtabs/CustomTabsIntent$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 126
    invoke-virtual {v0, v1}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;->setBookmarksButtonEnabled(Z)Landroidx/browser/customtabs/CustomTabsIntent$Builder;

    move-result-object v0

    .line 127
    invoke-virtual {v0}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;->build()Landroidx/browser/customtabs/CustomTabsIntent;

    move-result-object v0

    .line 128
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 188
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 128
    invoke-virtual {v0, v1, p1}, Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method

.method private final setupBackButtonHandling()V
    .locals 3

    .line 66
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    .line 67
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 68
    new-instance v2, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V

    check-cast v2, Landroidx/activity/OnBackPressedCallback;

    .line 66
    invoke-virtual {v0, v1, v2}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    return-void
.end method

.method private final setupProgressBar()V
    .locals 4

    .line 89
    sget-object v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->Companion:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "getIntent(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;->getArgs(Landroid/content/Intent;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;->getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, -0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    sget-object v3, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ordinal()I

    move-result v0

    aget v0, v3, v0

    :goto_1
    if-eq v0, v2, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    .line 95
    sget v0, Lcom/stripe/android/financialconnections/lite/R$color;->stripe_link:I

    goto :goto_2

    .line 89
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 93
    :cond_3
    sget v0, Lcom/stripe/android/financialconnections/lite/R$color;->stripe_financial_connections:I

    .line 96
    :goto_2
    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 97
    iget-object v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->progressBar:Landroid/widget/ProgressBar;

    const-string v3, "progressBar"

    if-nez v2, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_4
    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 98
    iget-object v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->progressBar:Landroid/widget/ProgressBar;

    if-nez v2, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_5
    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 99
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->progressBar:Landroid/widget/ProgressBar;

    if-nez v0, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object v1, v0

    :goto_3
    check-cast v1, Landroid/view/View;

    const/4 v0, 0x0

    .line 186
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setupWebView()Landroid/webkit/WebView;
    .locals 3

    .line 104
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->webView:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    const-string v0, "webView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 105
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 106
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 107
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 108
    new-instance v1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupWebView$1$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupWebView$1$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V

    check-cast v1, Landroid/webkit/WebChromeClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 114
    new-instance v1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupWebView$1$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupWebView$1$2;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V

    check-cast v1, Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-object v0
.end method

.method private static final viewModel_delegate$lambda$0()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 40
    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$Factory;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$Factory;-><init>()V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 45
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    sget p1, Lcom/stripe/android/financialconnections/lite/R$layout;->stripe_activity_lite:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->setContentView(I)V

    .line 48
    sget p1, Lcom/stripe/android/financialconnections/lite/R$id;->webView:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->webView:Landroid/webkit/WebView;

    .line 49
    sget p1, Lcom/stripe/android/financialconnections/lite/R$id;->progressBar:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->progressBar:Landroid/widget/ProgressBar;

    .line 50
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->setupProgressBar()V

    .line 51
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->setupWebView()Landroid/webkit/WebView;

    .line 52
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->setupBackButtonHandling()V

    .line 54
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/LifecycleOwner;

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    new-instance p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$onCreate$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
