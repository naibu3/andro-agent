.class public final Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;
.super Landroidx/work/CoroutineWorker;
.source "SendAnalyticsRequestV2Worker.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSendAnalyticsRequestV2Worker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendAnalyticsRequestV2Worker.kt\ncom/stripe/android/core/networking/SendAnalyticsRequestV2Worker\n*L\n1#1,81:1\n38#1,5:82\n*S KotlinDebug\n*F\n+ 1 SendAnalyticsRequestV2Worker.kt\ncom/stripe/android/core/networking/SendAnalyticsRequestV2Worker\n*L\n20#1:82,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0082H\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;",
        "Landroidx/work/CoroutineWorker;",
        "appContext",
        "Landroid/content/Context;",
        "params",
        "Landroidx/work/WorkerParameters;",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "doWork",
        "Landroidx/work/ListenableWorker$Result;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "withRequest",
        "block",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;

.field public static final TAG:Ljava/lang/String; = "SendAnalyticsRequestV2Worker"

.field private static networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

.field private static storage:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$b6FpNSQS29e-iAEzCIjxjZgdzXo(Landroid/content/Context;)Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->storage$lambda$4(Landroid/content/Context;)Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->Companion:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;

    .line 56
    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/core/networking/StripeNetworkClient;

    sput-object v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 60
    new-instance v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$$ExternalSyntheticLambda0;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->storage:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method

.method public static final synthetic access$getNetworkClient$cp()Lcom/stripe/android/core/networking/StripeNetworkClient;
    .locals 1

    .line 15
    sget-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    return-object v0
.end method

.method public static final synthetic access$getStorage$cp()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 15
    sget-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->storage:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final synthetic access$setNetworkClient$cp(Lcom/stripe/android/core/networking/StripeNetworkClient;)V
    .locals 0

    .line 15
    sput-object p0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    return-void
.end method

.method public static final synthetic access$setStorage$cp(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 15
    sput-object p0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->storage:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method private static final storage$lambda$4(Landroid/content/Context;)Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance v0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Application;

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private final withRequest(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
            "+",
            "Landroidx/work/ListenableWorker$Result;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getInputData()Landroidx/work/Data;

    move-result-object v0

    const-string v1, "data"

    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "failure(...)"

    if-eqz v0, :cond_2

    .line 39
    sget-object v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->Companion:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;->getStorage()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getApplicationContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    invoke-interface {v3, v0, p2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;->retrieve(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    if-eqz v3, :cond_1

    .line 40
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getRunAttemptCount()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->withWorkManagerParams(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object v1

    .line 42
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/work/ListenableWorker$Result;

    .line 43
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->retry()Landroidx/work/ListenableWorker$Result;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 46
    invoke-virtual {v2}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;->getStorage()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    invoke-interface {v2, v0, p2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;->delete(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 49
    :cond_0
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 39
    :cond_1
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->failure()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 38
    :cond_2
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->failure()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;

    iget v1, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;-><init>(Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 20
    iget v2, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->label:I

    const-string v3, "failure(...)"

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    iget-object v5, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getInputData()Landroidx/work/Data;

    move-result-object p1

    const-string v2, "data"

    invoke-virtual {p1, v2}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {}, Landroidx/work/ListenableWorker$Result;->failure()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 83
    :cond_4
    sget-object v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->Companion:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;->getStorage()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getApplicationContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    iput-object p0, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$0:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->label:I

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;->retrieve(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p0

    move-object v5, v2

    :goto_1
    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    if-nez p1, :cond_6

    invoke-static {}, Landroidx/work/ListenableWorker$Result;->failure()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 84
    :cond_6
    invoke-virtual {v2}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getRunAttemptCount()I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->withWorkManagerParams(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    .line 21
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, v5

    check-cast v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    .line 22
    sget-object v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->networkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    iput-object v5, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$doWork$1;->label:I

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object v0, v5

    :goto_3
    :try_start_2
    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    .line 21
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception p1

    move-object v0, v5

    :goto_4
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 23
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_8

    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    .line 25
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->success()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    goto :goto_6

    .line 28
    :cond_8
    invoke-static {v1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2WorkerKt;->access$getShouldRetry(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->getRunAttemptCount()I

    move-result p1

    const/4 v0, 0x4

    if-ge p1, v0, :cond_9

    .line 29
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->retry()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    goto :goto_6

    .line 31
    :cond_9
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->failure()Landroidx/work/ListenableWorker$Result;

    move-result-object p1

    .line 23
    :goto_6
    const-string v0, "fold(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
