.class final Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FraudDetectionDataRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFraudDetectionDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataRepository.kt\ncom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$getLatest$2"
    f = "FraudDetectionDataRepository.kt"
    i = {
        0x0
    }
    l = {
        0x47,
        0x4d
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;


# direct methods
.method constructor <init>(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;

    iget-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;-><init>(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 70
    iget v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 71
    iget-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    invoke-static {v1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->access$getLocalStore$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;

    move-result-object v1

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->label:I

    invoke-interface {v1, v4}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 70
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    check-cast p1, Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    if-eqz p1, :cond_4

    .line 73
    invoke-static {}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepositoryKt;->access$getTimestampSupplier$p()Lkotlin/jvm/functions/Function0;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->isExpired(J)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 76
    :cond_4
    :try_start_1
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 77
    invoke-static {v1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->access$getStripeNetworkClient$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-result-object v3

    .line 78
    invoke-static {v1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->access$getFraudDetectionDataRequestFactory$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;->create(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 77
    iput-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->label:I

    invoke-interface {v3, p1, p0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    move-object v0, v1

    .line 70
    :goto_2
    :try_start_2
    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    .line 81
    invoke-static {p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepositoryKt;->access$fraudDetectionData(Lcom/stripe/android/core/networking/StripeResponse;)Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object p1

    .line 76
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_3
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 82
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 83
    sget-object v2, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v2, v1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    .line 84
    invoke-static {v0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->access$getErrorReporter$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;->reportFraudDetectionError(Lcom/stripe/android/core/exception/StripeException;)V

    .line 85
    :cond_6
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 p1, 0x0

    :cond_7
    check-cast p1, Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 91
    :cond_8
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    invoke-static {v0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->access$getCachedFraudDetectionData$p(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    if-eqz p1, :cond_9

    .line 92
    iget-object v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->save(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)V

    :cond_9
    return-object p1
.end method
