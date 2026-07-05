.class final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FinancialConnectionsAnalyticsTracker.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
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
    c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl$track$1"
    f = "FinancialConnectionsAnalyticsTracker.kt"
    i = {}
    l = {
        0x66,
        0x69
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->this$0:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->this$0:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 99
    iget v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->this$0:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->access$getRequestFactory$p(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    move-result-object v5

    .line 101
    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->getEventName()Ljava/lang/String;

    move-result-object v4

    .line 102
    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->getParams()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :cond_3
    move-object v1, p1

    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->this$0:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v5, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    invoke-static {p1, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->access$commonParams(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 100
    invoke-virtual {v5, v4, p1, v3}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;->createRequest(Ljava/lang/String;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    .line 105
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->this$0:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->access$getRequestExecutor$p(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    invoke-interface {v1, p1, v3}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;->enqueue(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    .line 106
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
