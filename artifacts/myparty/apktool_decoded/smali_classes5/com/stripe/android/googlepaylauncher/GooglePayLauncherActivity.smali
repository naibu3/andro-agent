.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "GooglePayLauncherActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGooglePayLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,169:1\n75#2,13:170\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherActivity\n*L\n41#1:170,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0008\u0010\u0015\u001a\u00020\u0012H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "viewModel",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "getErrorReporter",
        "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "errorReporter$delegate",
        "args",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "finish",
        "onGooglePayResult",
        "taskResult",
        "Lcom/google/android/gms/wallet/contract/ApiTaskResult;",
        "Lcom/google/android/gms/wallet/PaymentData;",
        "onActivityResult",
        "requestCode",
        "",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
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
.field private args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

.field private final errorReporter$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$UdCib36oSasvFdB-5Y3iikbNlVU(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->errorReporter_delegate$lambda$1(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_qUgfznXVJOTcCNWIJlSEyalNGU(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->onCreate$lambda$5(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$h_tNuxATnWo700ho-S_iUkToErI(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->viewModel_delegate$lambda$0(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 40
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 41
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)V

    .line 178
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 180
    new-instance v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 182
    new-instance v5, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 178
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 41
    iput-object v2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    .line 45
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->errorReporter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p0

    return-object p0
.end method

.method private static final errorReporter_delegate$lambda$1(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 3

    .line 46
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    check-cast p0, Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2, v1}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object p0

    return-object p0
.end method

.method private final finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 3

    .line 161
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x1

    .line 163
    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "extra_result"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object p1

    .line 162
    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 159
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->setResult(ILandroid/content/Intent;)V

    .line 166
    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finish()V

    return-void
.end method

.method private final getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->errorReporter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    return-object v0
.end method

.method private static final onCreate$lambda$5(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V
    .locals 0

    .line 72
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->onGooglePayResult(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V

    return-void
.end method

.method private final onGooglePayResult(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wallet/contract/ApiTaskResult<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;)V"
        }
    .end annotation

    .line 93
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_3

    const/16 v2, 0x10

    if-eq v0, v2, :cond_2

    .line 120
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    const-string v0, "getStatus(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_0

    move-object v0, v2

    .line 122
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 124
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v4

    .line 125
    sget-object v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GOOGLE_PAY_FAILED:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 127
    new-array v1, v1, [Lkotlin/Pair;

    const-string v6, "status_message"

    invoke-static {v6, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v6, 0x0

    aput-object v0, v1, v6

    .line 128
    const-string v0, "status_code"

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v1, v3

    .line 126
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    .line 124
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 132
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object v0

    .line 133
    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    .line 134
    new-instance v3, Ljava/lang/RuntimeException;

    .line 135
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p1

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v5, "Google Pay failed with error "

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v4, ": "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 134
    invoke-direct {v3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Throwable;

    .line 133
    invoke-direct {v1, v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    .line 132
    invoke-virtual {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void

    .line 114
    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    .line 115
    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    .line 114
    invoke-virtual {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void

    .line 95
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wallet/PaymentData;

    if-eqz p1, :cond_4

    .line 97
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/google/android/gms/wallet/PaymentData;->toJson()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 98
    sget-object p1, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createFromGooglePay(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    .line 99
    sget-object v0, Lcom/stripe/android/view/AuthActivityStarterHost;->Companion:Lcom/stripe/android/view/AuthActivityStarterHost$Companion;

    move-object v2, p0

    check-cast v2, Landroidx/activity/ComponentActivity;

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, v3}, Lcom/stripe/android/view/AuthActivityStarterHost$Companion;->create$default(Lcom/stripe/android/view/AuthActivityStarterHost$Companion;Landroidx/activity/ComponentActivity;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/view/AuthActivityStarterHost;

    move-result-object v0

    .line 100
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->confirmStripeIntent(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    return-void

    .line 102
    :cond_4
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v2

    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_MISSING_INTENT_DATA:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 103
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    .line 104
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    .line 105
    new-instance v1, Ljava/lang/RuntimeException;

    .line 106
    const-string v2, "Google Pay missing result data."

    .line 105
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    .line 104
    invoke-direct {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    .line 103
    invoke-virtual {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method

.method private static final viewModel_delegate$lambda$0(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 6

    .line 42
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    if-nez p0, :cond_0

    const-string p0, "args"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    move-object v1, p0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 88
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->finish()V

    .line 89
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

    .line 149
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    packed-switch p1, :pswitch_data_0

    return-void

    .line 151
    :pswitch_0
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p2

    if-nez p3, :cond_0

    .line 153
    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3}, Landroid/content/Intent;-><init>()V

    .line 151
    :cond_0
    invoke-virtual {p2, p1, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->onConfirmResult(ILandroid/content/Intent;)V

    return-void

    :pswitch_data_0
    .packed-switch 0xc350
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 52
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    .line 55
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;->fromIntent$payments_core_release(Landroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 54
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 56
    :cond_0
    const-string p1, "GooglePayLauncherActivity was started without arguments."

    .line 55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 54
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 58
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    .line 62
    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    .line 54
    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    .line 65
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/LifecycleOwner;

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$3;

    const/4 v7, 0x0

    invoke-direct {v0, p0, v7}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$3;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 71
    new-instance v0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentDataResult;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentDataResult;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)V

    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    .line 75
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$4;

    invoke-direct {p1, p0, v0, v7}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$4;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Landroidx/activity/result/ActivityResultLauncher;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void

    .line 60
    :cond_1
    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    invoke-direct {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    .line 59
    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method
