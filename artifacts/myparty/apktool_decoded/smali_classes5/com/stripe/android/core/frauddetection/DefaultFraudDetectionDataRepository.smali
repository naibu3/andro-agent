.class public final Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;
.super Ljava/lang/Object;
.source "FraudDetectionDataRepository.kt"

# interfaces
.implements Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "localStore",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;",
        "fraudDetectionDataRequestFactory",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "errorReporter",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "fraudDetectionEnabledProvider",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;",
        "<init>",
        "(Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;)V",
        "cachedFraudDetectionData",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        "fraudDetectionEnabled",
        "",
        "getFraudDetectionEnabled",
        "()Z",
        "refresh",
        "",
        "getLatest",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCached",
        "save",
        "fraudDetectionData",
        "stripe-core_release"
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
.field private cachedFraudDetectionData:Lcom/stripe/android/core/frauddetection/FraudDetectionData;

.field private final errorReporter:Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;

.field private final fraudDetectionDataRequestFactory:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;

.field private final fraudDetectionEnabledProvider:Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;

.field private final localStore:Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;)V
    .locals 1

    const-string v0, "localStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionEnabledProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->localStore:Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

    .line 51
    iput-object p2, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->fraudDetectionDataRequestFactory:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;

    .line 52
    iput-object p3, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 53
    iput-object p4, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->errorReporter:Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;

    .line 54
    iput-object p5, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 55
    iput-object p6, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->fraudDetectionEnabledProvider:Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;

    return-void
.end method

.method public static final synthetic access$getCachedFraudDetectionData$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionData;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->cachedFraudDetectionData:Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->errorReporter:Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;

    return-object p0
.end method

.method public static final synthetic access$getFraudDetectionDataRequestFactory$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->fraudDetectionDataRequestFactory:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;

    return-object p0
.end method

.method public static final synthetic access$getLocalStore$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->localStore:Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

    return-object p0
.end method

.method public static final synthetic access$getStripeNetworkClient$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/networking/StripeNetworkClient;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    return-object p0
.end method

.method private final getFraudDetectionEnabled()Z
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->fraudDetectionEnabledProvider:Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;

    invoke-interface {v0}, Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;->provideFraudDetectionEnabled()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public getCached()Lcom/stripe/android/core/frauddetection/FraudDetectionData;
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->cachedFraudDetectionData:Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 100
    invoke-direct {p0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->getFraudDetectionEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;-><init>(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public refresh()V
    .locals 7

    .line 63
    invoke-direct {p0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->getFraudDetectionEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$refresh$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$refresh$1;-><init>(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method

.method public save(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)V
    .locals 1

    const-string v0, "fraudDetectionData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iput-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->cachedFraudDetectionData:Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 106
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->localStore:Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;->save(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)V

    return-void
.end method
