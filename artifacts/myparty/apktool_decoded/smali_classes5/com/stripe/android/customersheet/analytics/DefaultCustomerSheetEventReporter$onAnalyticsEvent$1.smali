.class final Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultCustomerSheetEventReporter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V
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
    c = "com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter$onAnalyticsEvent$1"
    f = "DefaultCustomerSheetEventReporter.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $event:Lcom/stripe/android/core/networking/AnalyticsEvent;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;Lcom/stripe/android/core/networking/AnalyticsEvent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;",
            "Lcom/stripe/android/core/networking/AnalyticsEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->this$0:Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;

    iput-object p2, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->$event:Lcom/stripe/android/core/networking/AnalyticsEvent;

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

    new-instance p1, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;

    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->this$0:Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;

    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->$event:Lcom/stripe/android/core/networking/AnalyticsEvent;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;-><init>(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;Lcom/stripe/android/core/networking/AnalyticsEvent;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 233
    iget v0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 234
    iget-object p1, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->this$0:Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;

    invoke-static {p1}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 235
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->this$0:Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;

    invoke-static {v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->access$getAnalyticsRequestFactory$p(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    move-result-object v0

    .line 236
    iget-object v1, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;->$event:Lcom/stripe/android/core/networking/AnalyticsEvent;

    .line 237
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    .line 235
    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->createRequest(Lcom/stripe/android/core/networking/AnalyticsEvent;Ljava/util/Map;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    .line 234
    invoke-interface {p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 240
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 233
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
