.class final Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "UpdatePaymentMethodInteractor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->removePaymentMethod()V
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
    c = "com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1"
    f = "UpdatePaymentMethodInteractor.kt"
    i = {
        0x3
    }
    l = {
        0x107,
        0x108,
        0x10a,
        0x10c,
        0x10d
    }
    m = "invokeSuspend"
    n = {
        "removeError"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 262
    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->label:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 263
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getError$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getInitialError(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->label:I

    invoke-interface {p1, v1, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    .line 264
    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getStatus$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Removing:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->label:I

    invoke-interface {p1, v1, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    .line 266
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getRemoveExecutor$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlin/jvm/functions/Function2;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    iput v4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->label:I

    invoke-interface {p1, v1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    .line 262
    :cond_8
    :goto_2
    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 268
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getStatus$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    sget-object v4, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Idle:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->label:I

    invoke-interface {p1, v4, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    .line 269
    :cond_9
    :goto_3
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getError$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    if-eqz v1, :cond_a

    invoke-static {v1}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    if-nez v1, :cond_b

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getInitialError(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    :cond_b
    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;->label:I

    invoke-interface {p1, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_4
    return-object v0

    .line 270
    :cond_c
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
