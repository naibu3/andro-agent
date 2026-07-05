.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;
.super Ljava/lang/Object;
.source "GooglePayLauncherViewModel.kt"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ-\u0010\n\u001a\u0002H\u000b\"\u0008\u0008\u0000\u0010\u000b*\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "args",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "enableLogging",
        "",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "extras",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;",
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
.field private final args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

.field private final enableLogging:Z

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$AJ0q6KHW1Kq9YINIhmUqYuipcis(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->create$lambda$1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$The9i6NJrMeLQPL916rq7PQFw_Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->create$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    .line 267
    iput-boolean p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->enableLogging:Z

    .line 268
    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 268
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    .line 265
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method private static final create$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method private static final create$lambda$1(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "modelClass"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extras"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    invoke-static {v2}, Lcom/stripe/android/core/utils/CreationExtrasKtxKt;->requireApplication(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroid/app/Application;

    move-result-object v1

    .line 275
    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getEnvironment()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    move-result-object v3

    .line 276
    sget-object v4, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    iget-boolean v5, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->enableLogging:Z

    invoke-virtual {v4, v5}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v14

    .line 278
    sget-object v4, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    move-object v7, v1

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v4, v7}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v1

    .line 279
    invoke-virtual {v1}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 280
    invoke-virtual {v1}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v1

    .line 281
    const-string v5, "GooglePayLauncher"

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    .line 283
    new-instance v5, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-direct {v5, v7, v4, v12}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V

    .line 289
    new-instance v6, Lcom/stripe/android/networking/StripeApiRepository;

    new-instance v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$$ExternalSyntheticLambda0;

    invoke-direct {v8, v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    .line 293
    iget-object v11, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/16 v22, 0x7bc4

    const/16 v23, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v5

    .line 289
    invoke-direct/range {v6 .. v23}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v6

    .line 298
    sget-object v6, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {v6, v7, v12}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance(Landroid/content/Context;Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v13

    .line 303
    new-instance v6, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    .line 305
    iget-object v8, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v8}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getEnvironment()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    move-result-object v8

    .line 306
    iget-object v9, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v9}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v9

    invoke-static {v9}, Lcom/stripe/android/googlepaylauncher/ConvertKt;->convert(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;)Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    move-result-object v9

    .line 307
    iget-object v11, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v11}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v11

    invoke-virtual {v11}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getExistingPaymentMethodRequired()Z

    move-result v11

    .line 308
    iget-object v12, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v12}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getAllowCreditCards()Z

    move-result v12

    const/16 v16, 0x120

    const/16 v17, 0x0

    move-object v14, v10

    move v10, v11

    move v11, v12

    const/4 v12, 0x0

    .line 303
    invoke-direct/range {v6 .. v17}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v6

    move-object v6, v13

    .line 313
    new-instance v27, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    .line 314
    new-instance v8, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;

    invoke-direct {v8, v7}, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v3}, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;->create(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)Lcom/google/android/gms/wallet/PaymentsClient;

    move-result-object v3

    .line 315
    new-instance v15, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v10, v1

    move-object v9, v4

    move-object v8, v15

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 319
    iget-object v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    .line 320
    move-object/from16 v17, v5

    check-cast v17, Lcom/stripe/android/networking/StripeRepository;

    .line 321
    new-instance v15, Lcom/stripe/android/StripePaymentController;

    .line 323
    new-instance v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$$ExternalSyntheticLambda1;

    invoke-direct {v4, v9}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    .line 325
    iget-boolean v5, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->enableLogging:Z

    .line 326
    iget-object v11, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/16 v25, 0x1e0

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move/from16 v19, v5

    move-object/from16 v16, v7

    move-object/from16 v20, v11

    move-object/from16 v18, v17

    move-object/from16 v17, v4

    .line 321
    invoke-direct/range {v15 .. v26}, Lcom/stripe/android/StripePaymentController;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v18

    move-object/from16 v18, v15

    check-cast v18, Lcom/stripe/android/PaymentController;

    .line 328
    new-instance v4, Lcom/stripe/android/GooglePayJsonFactory;

    .line 329
    new-instance v5, Lcom/stripe/android/GooglePayConfig;

    invoke-direct {v5, v9, v10}, Lcom/stripe/android/GooglePayConfig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    iget-object v7, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v7}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->isJcbEnabled$payments_core_release()Z

    move-result v7

    .line 328
    invoke-direct {v4, v5, v7}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Lcom/stripe/android/GooglePayConfig;Z)V

    .line 332
    move-object/from16 v20, v14

    check-cast v20, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    .line 333
    invoke-static {v2}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object v21

    .line 335
    iget-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;->workContext:Lkotlin/coroutines/CoroutineContext;

    move-object/from16 v16, v1

    move-object/from16 v23, v2

    move-object v14, v3

    move-object/from16 v19, v4

    move-object/from16 v22, v6

    move-object v15, v8

    move-object/from16 v13, v27

    .line 313
    invoke-direct/range {v13 .. v23}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;-><init>(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    move-object/from16 v27, v13

    check-cast v27, Landroidx/lifecycle/ViewModel;

    return-object v27
.end method
