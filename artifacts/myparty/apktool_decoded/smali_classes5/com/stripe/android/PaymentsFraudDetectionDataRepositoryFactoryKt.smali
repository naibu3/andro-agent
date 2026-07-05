.class public final Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;
.super Ljava/lang/Object;
.source "PaymentsFraudDetectionDataRepositoryFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "DefaultFraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;",
        "context",
        "Landroid/content/Context;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$cj9f4-0VqLIC5jz5p33sl9_o0mA()Z
    .locals 1

    invoke-static {}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;->DefaultFraudDetectionDataRepository$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static final DefaultFraudDetectionDataRepository(Landroid/content/Context;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;->DefaultFraudDetectionDataRepository$default(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    move-result-object p0

    return-object p0
.end method

.method public static final DefaultFraudDetectionDataRepository(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;
    .locals 12

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v1, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    .line 22
    new-instance v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

    .line 23
    new-instance v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;-><init>(Landroid/content/Context;)V

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;

    .line 24
    new-instance v4, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 25
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance(Landroid/content/Context;Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;

    .line 27
    new-instance v7, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt$$ExternalSyntheticLambda0;

    invoke-direct {v7}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt$$ExternalSyntheticLambda0;-><init>()V

    move-object v6, v5

    move-object v5, p0

    .line 21
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;-><init>(Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;)V

    return-object v1
.end method

.method public static synthetic DefaultFraudDetectionDataRepository$default(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    .line 19
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    .line 15
    :cond_0
    invoke-static {p0, p1}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;->DefaultFraudDetectionDataRepository(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final DefaultFraudDetectionDataRepository$lambda$0()Z
    .locals 1

    .line 27
    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result v0

    return v0
.end method
