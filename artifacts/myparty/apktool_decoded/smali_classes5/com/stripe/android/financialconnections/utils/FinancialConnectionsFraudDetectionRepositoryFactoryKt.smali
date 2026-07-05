.class public final Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsFraudDetectionRepositoryFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "DefaultFraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;",
        "application",
        "Landroid/app/Application;",
        "financial-connections_release"
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
.method public static synthetic $r8$lambda$HhBf4xjelZfn56TaddwhTRomQHM()Z
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt;->DefaultFraudDetectionDataRepository$lambda$1()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$MFQV1w_2wV8funqjzVNZ7KyiNKg(Lcom/stripe/android/core/exception/StripeException;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt;->DefaultFraudDetectionDataRepository$lambda$0(Lcom/stripe/android/core/exception/StripeException;)V

    return-void
.end method

.method public static final DefaultFraudDetectionDataRepository(Landroid/app/Application;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;
    .locals 11

    const-string v0, "application"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    .line 15
    new-instance v1, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    .line 16
    new-instance v2, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;

    check-cast p0, Landroid/content/Context;

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v2, p0, v4}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V

    check-cast v2, Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

    .line 17
    new-instance v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;-><init>(Landroid/content/Context;)V

    check-cast v0, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;

    .line 18
    new-instance v3, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 19
    new-instance v5, Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt$$ExternalSyntheticLambda0;

    invoke-direct {v5}, Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt$$ExternalSyntheticLambda0;-><init>()V

    .line 21
    new-instance v7, Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt$$ExternalSyntheticLambda1;

    invoke-direct {v7}, Lcom/stripe/android/financialconnections/utils/FinancialConnectionsFraudDetectionRepositoryFactoryKt$$ExternalSyntheticLambda1;-><init>()V

    move-object v6, v4

    move-object v4, v3

    move-object v3, v0

    .line 15
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;-><init>(Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;)V

    return-object v1
.end method

.method private static final DefaultFraudDetectionDataRepository$lambda$0(Lcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static final DefaultFraudDetectionDataRepository$lambda$1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
