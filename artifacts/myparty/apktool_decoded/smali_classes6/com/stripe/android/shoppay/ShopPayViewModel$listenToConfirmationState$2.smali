.class final Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ShopPayViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/shoppay/ShopPayViewModel;->listenToConfirmationState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "confirmationState",
        "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;"
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
    c = "com.stripe.android.shoppay.ShopPayViewModel$listenToConfirmationState$2"
    f = "ShopPayViewModel.kt"
    i = {}
    l = {
        0x4c,
        0x50,
        0x54
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/ShopPayViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

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

    new-instance v0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;

    iget-object v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->invoke(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 73
    iget v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;

    .line 75
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Failure;

    if-eqz v1, :cond_4

    .line 76
    iget-object v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-static {v1}, Lcom/stripe/android/shoppay/ShopPayViewModel;->access$get_paymentResult$p(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Failure;

    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->label:I

    invoke-interface {v1, v2, p1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_2

    .line 78
    :cond_4
    sget-object v1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Pending;->INSTANCE:Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Pending;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 79
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;

    if-eqz v1, :cond_7

    .line 80
    iget-object v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->label:I

    invoke-static {v1, p1, v4}, Lcom/stripe/android/shoppay/ShopPayViewModel;->access$handleSuccessfulPayment(Lcom/stripe/android/shoppay/ShopPayViewModel;Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    .line 73
    :cond_5
    :goto_1
    check-cast p1, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    .line 81
    instance-of v1, p1, Lcom/stripe/android/shoppay/ShopPayActivityResult$Completed;

    if-eqz v1, :cond_6

    .line 82
    iget-object v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-static {v1}, Lcom/stripe/android/shoppay/ShopPayViewModel;->access$getEventReporter$p(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShopPayWebViewConfirmSuccess()V

    .line 84
    :cond_6
    iget-object v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-static {v1}, Lcom/stripe/android/shoppay/ShopPayViewModel;->access$get_paymentResult$p(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;->label:I

    invoke-interface {v1, p1, v3}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    .line 74
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 87
    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
