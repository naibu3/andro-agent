.class final Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CardAccountRangeService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/cards/CardAccountRangeService;->queryAccountRangeRepository(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V
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
    c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1"
    f = "CardAccountRangeService.kt"
    i = {}
    l = {
        0x59,
        0x5e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $cardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/cards/CardAccountRangeService;


# direct methods
.method constructor <init>(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lcom/stripe/android/cards/CardAccountRangeService;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
            "Lcom/stripe/android/cards/CardAccountRangeService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->$cardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iput-object p2, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->this$0:Lcom/stripe/android/cards/CardAccountRangeService;

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

    new-instance p1, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->$cardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->this$0:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;-><init>(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lcom/stripe/android/cards/CardAccountRangeService;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 85
    iget v1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    iget-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->$cardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 89
    iget-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->this$0:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-static {p1}, Lcom/stripe/android/cards/CardAccountRangeService;->access$getCardAccountRangeRepository$p(Lcom/stripe/android/cards/CardAccountRangeService;)Lcom/stripe/android/cards/CardAccountRangeRepository;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->$cardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->label:I

    invoke-interface {p1, v1, v5}, Lcom/stripe/android/cards/CardAccountRangeRepository;->getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    goto :goto_1

    :cond_4
    move-object p1, v2

    .line 94
    :goto_1
    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->this$0:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-static {v1}, Lcom/stripe/android/cards/CardAccountRangeService;->access$getUiContext$p(Lcom/stripe/android/cards/CardAccountRangeService;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1$1;

    iget-object v5, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->this$0:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-direct {v4, v5, p1, v2}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1$1;-><init>(Lcom/stripe/android/cards/CardAccountRangeService;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;->label:I

    invoke-static {v1, v4, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    .line 97
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
