.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;
.super Landroidx/fragment/app/Fragment;
.source "ScreenFragment.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0008\u0010\u001f\u001a\u00020\u001bH\u0002J\u0008\u0010 \u001a\u00020\u001bH\u0002J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020#H\u0002J\"\u0010%\u001a\u00020\u001b2\u0008\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0008\u0010)\u001a\u00020\u001bH\u0002J\u0008\u0010*\u001a\u00020\u001bH\u0002J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0008\u0010/\u001a\u0004\u0018\u0001002\u0008\u00101\u001a\u0004\u0018\u000102H\u0016J\u0008\u00103\u001a\u00020\u001bH\u0016J\u0018\u00104\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(2\u0006\u00105\u001a\u000206H\u0016J\u001a\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020,2\u0008\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020#H\u0016J\u0010\u0010;\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020#H\u0016J\u0018\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J\u0010\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020#H\u0016J\u0008\u0010A\u001a\u00020\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006C"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;",
        "Landroidx/fragment/app/Fragment;",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
        "()V",
        "automationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "getAutomationsManager$sdk_release",
        "()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "setAutomationsManager$sdk_release",
        "(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V",
        "binding",
        "Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "presenter",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "getPresenter$sdk_release",
        "()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "setPresenter$sdk_release",
        "(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V",
        "screenProcessor",
        "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "getScreenProcessor$sdk_release",
        "()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "setScreenProcessor$sdk_release",
        "(Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V",
        "close",
        "",
        "actionResult",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "closeAll",
        "configureWebClient",
        "confirmScreenView",
        "getActionResultMap",
        "",
        "",
        "value",
        "handleOnErrorCallback",
        "functionName",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "injectDependencies",
        "loadWebView",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroyView",
        "onError",
        "shouldCloseScreen",
        "",
        "onViewCreated",
        "view",
        "openDeepLink",
        "url",
        "openLink",
        "openScreen",
        "screenId",
        "htmlPage",
        "purchase",
        "productId",
        "restore",
        "Companion",
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


# static fields
.field private static final ACTION_MAP_KEY:Ljava/lang/String; = "value"

.field public static final Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

.field private static final ENCODING:Ljava/lang/String; = "UTF-8"

.field private static final EX_HTML_PAGE:Ljava/lang/String; = "htmlPage"

.field private static final EX_SCREEN_ID:Ljava/lang/String; = "screenId"

.field private static final MIME_TYPE:Ljava/lang/String; = "text/html"


# instance fields
.field public automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

.field public presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$NrlNzOdNNgUnjlGGVTmPgK_CwgA(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->onError$lambda$1(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 43
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-object p0
.end method

.method public static final synthetic access$handleOnErrorCallback(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->handleOnErrorCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    return-void
.end method

.method private final configureWebClient()V
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->webView:Landroid/webkit/WebView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;

    invoke-direct {v1, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    check-cast v1, Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    :goto_1
    return-void
.end method

.method private final confirmScreenView()V
    .locals 3

    .line 224
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "screenId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 227
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidShowScreen(Ljava/lang/String;)V

    .line 228
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getPresenter$sdk_release()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->confirmScreenView(Ljava/lang/String;)V

    .line 226
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v1, :cond_2

    .line 229
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    const-string v1, "confirmScreenView() -> Failed to confirm screen view"

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private final getActionResultMap(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 233
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "value"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final handleOnErrorCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 3

    .line 240
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

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

    .line 241
    :goto_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ScreenActivity "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " -> "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, ".description"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 242
    invoke-virtual {p3, p2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->setError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 243
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    return-void
.end method

.method private final injectDependencies()V
    .locals 3

    .line 194
    invoke-static {}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    move-result-object v0

    .line 195
    sget-object v1, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent(Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    move-result-object v0

    .line 196
    new-instance v1, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    move-object v2, p0

    check-cast v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-direct {v1, v2}, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    move-result-object v0

    .line 197
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->build()Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;->inject(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    return-void
.end method

.method private final loadWebView()V
    .locals 8

    .line 201
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "htmlPage"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 204
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getScreenProcessor$sdk_release()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    move-result-object v1

    new-instance v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$2;

    invoke-direct {v3, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$2;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v0, v2, v3}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->processScreen(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 203
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v1, :cond_2

    .line 217
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    .line 218
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    const-string v1, "loadWebView() -> Failed to fetch html page for the app screen"

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 219
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V

    :cond_2
    return-void
.end method

.method private static final onError$lambda$1(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 173
    check-cast p1, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    const/4 p0, 0x1

    const/4 p2, 0x0

    invoke-static {p1, p2, p0, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;->close$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 3

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 152
    :goto_1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v2, v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->goBack$sdk_release()Z

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    .line 153
    :goto_2
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    if-eqz v0, :cond_4

    .line 156
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsFinished()V

    :cond_4
    return-void
.end method

.method public closeAll(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

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

    .line 162
    :goto_1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->finish()V

    .line 163
    :cond_2
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 164
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsFinished()V

    return-void
.end method

.method public final getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "automationsManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPresenter$sdk_release()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getScreenProcessor$sdk_release()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "screenProcessor"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 50
    invoke-static {p1, p2, p3}, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 52
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->getRoot()Landroid/widget/RelativeLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 68
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    return-void
.end method

.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 169
    const-string v1, "Failed to show the in-app screen"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 170
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getDescription()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 171
    new-instance p1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$$ExternalSyntheticLambda0;

    invoke-direct {p1, p2, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$$ExternalSyntheticLambda0;-><init>(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    const p2, 0x104000a

    invoke-virtual {v0, p2, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 176
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 58
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->injectDependencies()V

    .line 60
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->configureWebClient()V

    .line 62
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->loadWebView()V

    .line 64
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->confirmScreenView()V

    return-void
.end method

.method public openDeepLink(Ljava/lang/String;)V
    .locals 4

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->DeepLink:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 100
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 103
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 104
    invoke-virtual {p0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->startActivity(Landroid/content/Intent;)V

    .line 105
    new-instance v1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object v2, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->DeepLink:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    invoke-virtual {p0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 107
    :catch_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t find any Activity to handle the Intent with deeplink "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    :goto_0
    return-void
.end method

.method public openLink(Ljava/lang/String;)V
    .locals 4

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Url:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 86
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 89
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 90
    invoke-virtual {p0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->startActivity(Landroid/content/Intent;)V

    .line 91
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 93
    :catch_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t find any Activity to handle the Intent with url "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    :goto_0
    return-void
.end method

.method public openScreen(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "htmlPage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Navigation:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 74
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 77
    :try_start_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.qonversion.android.sdk.automations.mvp.ScreenActivity"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v3 .. v8}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->showScreen$sdk_release$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 78
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 80
    :catch_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    :goto_0
    return-void
.end method

.method public purchase(Ljava/lang/String;)V
    .locals 6

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Purchase:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 114
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 115
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 117
    :goto_1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 118
    sget-object v3, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v3

    .line 119
    check-cast v1, Landroid/app/Activity;

    .line 120
    new-instance v4, Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    const/4 v5, 0x2

    invoke-direct {v4, p1, v2, v5, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    new-instance p1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$purchase$1$1;

    invoke-direct {p1, p0, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$purchase$1$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    .line 118
    invoke-interface {v3, v1, v4, p1}, Lcom/qonversion/android/sdk/Qonversion;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    :cond_2
    return-void
.end method

.method public restore()V
    .locals 4

    .line 135
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Restore:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 136
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 137
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    if-eqz v1, :cond_0

    iget-object v3, v1, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    :cond_0
    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 139
    :goto_0
    sget-object v1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v1

    new-instance v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;

    invoke-direct {v2, p0, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    check-cast v2, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {v1, v2}, Lcom/qonversion/android/sdk/Qonversion;->restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method public final setAutomationsManager$sdk_release(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    return-void
.end method

.method public final setPresenter$sdk_release(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    return-void
.end method

.method public final setScreenProcessor$sdk_release(Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    return-void
.end method
