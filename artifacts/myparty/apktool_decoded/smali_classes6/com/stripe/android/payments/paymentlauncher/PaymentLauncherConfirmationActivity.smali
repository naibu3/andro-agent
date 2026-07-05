.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "PaymentLauncherConfirmationActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentLauncherConfirmationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncherConfirmationActivity.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,126:1\n75#2,13:127\n*S KotlinDebug\n*F\n+ 1 PaymentLauncherConfirmationActivity.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity\n*L\n35#1:127,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0008\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R$\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000c\u0010\u0003\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R!\u0010\u0011\u001a\u00020\u00128@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\t\u0012\u0004\u0008\u0013\u0010\u0003\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "starterArgs",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "getStarterArgs",
        "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "starterArgs$delegate",
        "Lkotlin/Lazy;",
        "viewModelFactory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "getViewModelFactory$payments_core_release$annotations",
        "getViewModelFactory$payments_core_release",
        "()Landroidx/lifecycle/ViewModelProvider$Factory;",
        "setViewModelFactory$payments_core_release",
        "(Landroidx/lifecycle/ViewModelProvider$Factory;)V",
        "viewModel",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;",
        "getViewModel$payments_core_release$annotations",
        "getViewModel$payments_core_release",
        "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;",
        "viewModel$delegate",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "finish",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;

.field public static final EMPTY_ARG_ERROR:Ljava/lang/String; = "PaymentLauncherConfirmationActivity was started without arguments"


# instance fields
.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;


# direct methods
.method public static synthetic $r8$lambda$Qg77ElQGMZQarU0weoKCY4tL9Xg(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModel_delegate$lambda$2(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SldGL0YCtTtiE4yWwRTX0Q5psSY(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->starterArgs_delegate$lambda$0(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XR7uluZeFPquJOdEYY8RUf6RNco(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory$lambda$1(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zmVMyMAm-XvGZB1mOaKFw2gMMiM(Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->onCreate$lambda$7(Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 24
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 25
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->starterArgs$delegate:Lkotlin/Lazy;

    .line 30
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    iput-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 35
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)V

    .line 135
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 137
    new-instance v4, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 139
    new-instance v5, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 135
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 35
    iput-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finishWithResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V
    .locals 1

    .line 115
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 116
    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;->toBundle$payments_core_release()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 113
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->setResult(ILandroid/content/Intent;)V

    .line 118
    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finish()V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    return-object v0
.end method

.method public static synthetic getViewModel$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getViewModelFactory$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private static final onCreate$lambda$7(Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final starterArgs_delegate$lambda$0(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 2

    .line 26
    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private static final viewModelFactory$lambda$1(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getStarterArgs()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final viewModel_delegate$lambda$2(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object p0
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 104
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->finish()V

    .line 105
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public final getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    return-object v0
.end method

.method public final getViewModelFactory$payments_core_release()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 19

    move-object/from16 v1, p0

    .line 38
    invoke-super/range {p0 .. p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/stripe/android/R$string;->stripe_confirming_transaction_status:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 42
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;

    .line 43
    invoke-direct {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getStarterArgs()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "PaymentLauncherConfirmationActivity was started without arguments"

    .line 43
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    .line 42
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 46
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x2

    const-string v4, "getApplicationContext(...)"

    const/4 v5, 0x0

    if-nez v2, :cond_6

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    .line 56
    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;->validate-d1pmJ48()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 57
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    invoke-direct {v0, v2}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;

    invoke-direct {v1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finishWithResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V

    .line 59
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v5, v3, v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v7

    .line 61
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 62
    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, v2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 60
    invoke-static/range {v7 .. v12}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    .line 67
    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v13

    new-instance v16, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda0;

    invoke-direct/range {v16 .. v16}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda0;-><init>()V

    const/16 v17, 0x3

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 71
    move-object v2, v1

    check-cast v2, Landroidx/lifecycle/LifecycleOwner;

    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    new-instance v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$onCreate$3;

    invoke-direct {v3, v1, v5}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$onCreate$3;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;Lkotlin/coroutines/Continuation;)V

    move-object v9, v3

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 77
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v3

    .line 78
    move-object v4, v1

    check-cast v4, Landroidx/activity/result/ActivityResultCaller;

    .line 77
    invoke-virtual {v3, v4, v2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->register$payments_core_release(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    .line 82
    sget-object v2, Lcom/stripe/android/view/AuthActivityStarterHost;->Companion:Lcom/stripe/android/view/AuthActivityStarterHost$Companion;

    .line 83
    move-object v3, v1

    check-cast v3, Landroidx/activity/ComponentActivity;

    .line 84
    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v4

    .line 82
    invoke-virtual {v2, v3, v4}, Lcom/stripe/android/view/AuthActivityStarterHost$Companion;->create(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)Lcom/stripe/android/view/AuthActivityStarterHost;

    move-result-object v2

    .line 88
    instance-of v3, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    if-eqz v3, :cond_2

    .line 89
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v3

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;->getConfirmStripeIntentParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->confirmStripeIntent$payments_core_release(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    goto :goto_1

    .line 91
    :cond_2
    instance-of v3, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$HashedPaymentIntentNextActionArgs;

    if-eqz v3, :cond_3

    .line 92
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v3

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$HashedPaymentIntentNextActionArgs;

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$HashedPaymentIntentNextActionArgs;->getPaymentIntentClientSecret()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->handleNextActionForStripeIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    goto :goto_1

    .line 94
    :cond_3
    instance-of v3, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;

    if-eqz v3, :cond_4

    .line 95
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v3

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;->getPaymentIntentClientSecret()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->handleNextActionForStripeIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    goto :goto_1

    .line 97
    :cond_4
    instance-of v3, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;

    if-eqz v3, :cond_5

    .line 98
    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v3

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;->getSetupIntentClientSecret()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->handleNextActionForStripeIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    :goto_1
    return-void

    .line 87
    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 47
    :cond_6
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    invoke-direct {v0, v2}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;

    invoke-direct {v1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finishWithResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V

    .line 48
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v5, v3, v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v7

    .line 50
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 51
    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, v2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 49
    invoke-static/range {v7 .. v12}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final setViewModelFactory$payments_core_release(Landroidx/lifecycle/ViewModelProvider$Factory;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method
