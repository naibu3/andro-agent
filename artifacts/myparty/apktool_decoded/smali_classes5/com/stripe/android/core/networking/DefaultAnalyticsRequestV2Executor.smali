.class public final Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;
.super Ljava/lang/Object;
.source "AnalyticsRequestV2Executor.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnalyticsRequestV2Executor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsRequestV2Executor.kt\ncom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Operation.kt\nandroidx/work/OperationKt\n+ 5 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n100#2:63\n1#3:64\n29#4:65\n40#5,8:66\n48#5:83\n60#5,7:84\n314#6,9:74\n323#6,2:91\n*S KotlinDebug\n*F\n+ 1 AnalyticsRequestV2Executor.kt\ncom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor\n*L\n44#1:63\n50#1:65\n50#1:66,8\n50#1:83\n50#1:84,7\n50#1:74,9\n50#1:91,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
        "context",
        "Landroid/content/Context;",
        "networkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "storage",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;",
        "isWorkManagerAvailable",
        "Lcom/stripe/android/core/utils/IsWorkManagerAvailable;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Lcom/stripe/android/core/utils/IsWorkManagerAvailable;)V",
        "enqueue",
        "",
        "request",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "enqueueRequest",
        "",
        "executeRequest",
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
.field private final context:Landroid/content/Context;

.field private final isWorkManagerAvailable:Lcom/stripe/android/core/utils/IsWorkManagerAvailable;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

.field private final storage:Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Lcom/stripe/android/core/utils/IsWorkManagerAvailable;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isWorkManagerAvailable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->context:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 23
    iput-object p3, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->logger:Lcom/stripe/android/core/Logger;

    .line 24
    iput-object p4, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->storage:Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    .line 25
    iput-object p5, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->isWorkManagerAvailable:Lcom/stripe/android/core/utils/IsWorkManagerAvailable;

    return-void
.end method

.method public static final synthetic access$enqueueRequest(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->enqueueRequest(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$executeRequest(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->executeRequest(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final enqueueRequest(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;

    iget v1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;-><init>(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget v2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$1:Ljava/lang/Object;

    check-cast p1, Landroidx/work/WorkManager;

    iget-object v2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    iget-object p2, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->context:Landroid/content/Context;

    invoke-static {p2}, Landroidx/work/WorkManager;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    move-result-object p2

    const-string v2, "getInstance(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v2, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->storage:Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    iput-object p0, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->label:I

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;->store(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_2

    :cond_4
    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p0

    .line 35
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 38
    sget-object v5, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->Companion:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;

    invoke-virtual {v5, p2}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;->createInputData(Ljava/lang/String;)Landroidx/work/Data;

    move-result-object p2

    .line 40
    new-instance v5, Landroidx/work/Constraints$Builder;

    invoke-direct {v5}, Landroidx/work/Constraints$Builder;-><init>()V

    .line 41
    sget-object v6, Landroidx/work/NetworkType;->CONNECTED:Landroidx/work/NetworkType;

    invoke-virtual {v5, v6}, Landroidx/work/Constraints$Builder;->setRequiredNetworkType(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;

    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroidx/work/Constraints$Builder;->build()Landroidx/work/Constraints;

    move-result-object v5

    .line 63
    new-instance v6, Landroidx/work/OneTimeWorkRequest$Builder;

    const-class v7, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    invoke-direct {v6, v7}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 45
    const-string v7, "SendAnalyticsRequestV2Worker"

    invoke-virtual {v6, v7}, Landroidx/work/OneTimeWorkRequest$Builder;->addTag(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;

    move-result-object v6

    check-cast v6, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 46
    invoke-virtual {v6, p2}, Landroidx/work/OneTimeWorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    move-result-object p2

    check-cast p2, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 47
    invoke-virtual {p2, v5}, Landroidx/work/OneTimeWorkRequest$Builder;->setConstraints(Landroidx/work/Constraints;)Landroidx/work/WorkRequest$Builder;

    move-result-object p2

    check-cast p2, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 48
    invoke-virtual {p2}, Landroidx/work/OneTimeWorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    move-result-object p2

    check-cast p2, Landroidx/work/OneTimeWorkRequest;

    .line 50
    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    check-cast p2, Landroidx/work/WorkRequest;

    invoke-virtual {p1, p2}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    move-result-object p1

    const-string p2, "enqueue(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-interface {p1}, Landroidx/work/Operation;->getResult()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    const-string p2, "result"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-interface {p1}, Lcom/google/common/util/concurrent/ListenableFuture;->isDone()Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_6

    .line 68
    :try_start_2
    invoke-interface {p1}, Lcom/google/common/util/concurrent/ListenableFuture;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 70
    :try_start_3
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_5

    move-object p2, p1

    check-cast p2, Ljava/lang/Throwable;

    :cond_5
    throw p2

    .line 74
    :cond_6
    iput-object v0, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$1;->label:I

    move-object p2, v0

    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 75
    new-instance v2, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p2

    invoke-direct {v2, p2, v4}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 81
    invoke-virtual {v2}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 82
    move-object p2, v2

    check-cast p2, Lkotlinx/coroutines/CancellableContinuation;

    .line 83
    new-instance v3, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$lambda$0$$inlined$await$1;

    invoke-direct {v3, p2, p1}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$lambda$0$$inlined$await$1;-><init>(Lkotlinx/coroutines/CancellableContinuation;Lcom/google/common/util/concurrent/ListenableFuture;)V

    check-cast v3, Ljava/lang/Runnable;

    .line 84
    sget-object v4, Landroidx/work/DirectExecutor;->INSTANCE:Landroidx/work/DirectExecutor;

    check-cast v4, Ljava/util/concurrent/Executor;

    .line 83
    invoke-interface {p1, v3, v4}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 87
    new-instance v3, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$lambda$0$$inlined$await$2;

    invoke-direct {v3, p1}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueueRequest$lambda$0$$inlined$await$2;-><init>(Lcom/google/common/util/concurrent/ListenableFuture;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, v3}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Lkotlin/jvm/functions/Function1;)V

    .line 91
    invoke-virtual {v2}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p2

    .line 74
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_7

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_7
    if-ne p2, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    :goto_3
    move-object p1, p2

    .line 65
    :goto_4
    const-string p2, "result.await()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/work/Operation$State$SUCCESS;

    .line 50
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :goto_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_6
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final executeRequest(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "EVENT: "

    instance-of v1, p2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;

    iget v2, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget p2, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->label:I

    sub-int/2addr p2, v3

    iput p2, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;

    invoke-direct {v1, p0, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;-><init>(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 53
    iget v3, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    iget-object v2, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    .line 55
    iget-object p2, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/core/networking/StripeRequest;

    iput-object p0, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->L$1:Ljava/lang/Object;

    iput-object p0, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->L$2:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$executeRequest$1;->label:I

    invoke-interface {p2, v3, v1}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_3
    move-object v1, p0

    move-object v2, p1

    move-object p1, v1

    .line 56
    :goto_1
    :try_start_2
    iget-object p1, p1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getEventName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 57
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 54
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v1, p0

    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 57
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 58
    iget-object p2, v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->logger:Lcom/stripe/android/core/Logger;

    const-string v0, "Exception while making analytics request"

    invoke-interface {p2, v0, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public enqueue(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;

    iget v1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;-><init>(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 28
    iget v2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    iget-object p2, p0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->isWorkManagerAvailable:Lcom/stripe/android/core/utils/IsWorkManagerAvailable;

    iput-object p0, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    invoke-interface {p2, v0}, Lcom/stripe/android/core/utils/IsWorkManagerAvailable;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    iput-object v2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    invoke-direct {v2, p1, v0}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->enqueueRequest(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v5, 0x0

    :goto_3
    if-nez v5, :cond_9

    const/4 p2, 0x0

    .line 31
    iput-object p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor$enqueue$1;->label:I

    invoke-direct {v2, p1, v0}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;->executeRequest(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    .line 33
    :cond_8
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
