.class public final Lcom/stripe/android/payments/StripeBrowserLauncherActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "StripeBrowserLauncherActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeBrowserLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBrowserLauncherActivity.kt\ncom/stripe/android/payments/StripeBrowserLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,88:1\n75#2,13:89\n*S KotlinDebug\n*F\n+ 1 StripeBrowserLauncherActivity.kt\ncom/stripe/android/payments/StripeBrowserLauncherActivity\n*L\n27#1:89,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/payments/StripeBrowserLauncherActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "viewModel",
        "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "launchBrowser",
        "args",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "finishWithSuccess",
        "finishWithFailure",
        "payments-core_release"
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
.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$LWAcU6wfsPjE4-5BhQxaEYNuVjM(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->launchBrowser$lambda$1(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$tGaHz14vLjO0Qf8snFBt-TJ10B8()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->viewModel_delegate$lambda$0()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 26
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 27
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda1;-><init>()V

    .line 97
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 99
    new-instance v4, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 101
    new-instance v5, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 97
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 27
    iput-object v2, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final finishWithFailure(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->getFailureIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 81
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->setResult(ILandroid/content/Intent;)V

    .line 85
    invoke-virtual {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->finish()V

    return-void
.end method

.method private final finishWithSuccess(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->getResultIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 73
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->setResult(ILandroid/content/Intent;)V

    .line 77
    invoke-virtual {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->finish()V

    return-void
.end method

.method private final getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    return-object v0
.end method

.method private final launchBrowser(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V
    .locals 11

    .line 52
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 53
    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V

    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    .line 57
    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->createLaunchIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;

    move-result-object v1

    .line 60
    :try_start_0
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 61
    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->setHasLaunched(Z)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 63
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v5

    .line 65
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 66
    sget-object v1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 64
    invoke-static/range {v5 .. v10}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 68
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->finishWithFailure(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V

    return-void
.end method

.method private static final launchBrowser$lambda$1(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Landroidx/activity/result/ActivityResult;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->finishWithSuccess(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V

    return-void
.end method

.method private static final viewModel_delegate$lambda$0()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 28
    new-instance v0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Factory;

    invoke-direct {v0}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Factory;-><init>()V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 32
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    sget-object p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract;->Companion:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;->parseArgs$payments_core_release(Landroid/content/Intent;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    .line 36
    invoke-virtual {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->finish()V

    .line 37
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v3

    .line 39
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->BROWSER_LAUNCHER_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 38
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    .line 44
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->getHasLaunched()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->finishWithSuccess(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V

    return-void

    .line 47
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->launchBrowser(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V

    return-void
.end method
