.class public final Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt;
.super Ljava/lang/Object;
.source "PaymentNextActionHandler.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentNextActionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentNextActionHandler.kt\ncom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt\n+ 2 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n1#1,51:1\n138#2,2:52\n155#2,8:54\n141#2:62\n*S KotlinDebug\n*F\n+ 1 PaymentNextActionHandler.kt\ncom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt\n*L\n48#1:52,2\n48#1:54,8\n48#1:62\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "awaitResumed",
        "",
        "Landroidx/lifecycle/LifecycleOwner;",
        "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "payments-core_release"
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
.method public static final synthetic access$awaitResumed(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt;->awaitResumed(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final awaitResumed(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LifecycleOwner;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;

    iget v1, v0, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p1, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 46
    iget v1, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->label:I

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lkotlinx/coroutines/CompletableDeferred;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    invoke-static {v8, v2, v8}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    .line 52
    invoke-interface {p0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v1

    move p0, v2

    .line 53
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    .line 54
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v3

    invoke-virtual {v3}, Lkotlinx/coroutines/MainCoroutineDispatcher;->getImmediate()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v3

    .line 55
    invoke-interface {v6}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkotlinx/coroutines/MainCoroutineDispatcher;->isDispatchNeeded(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 57
    invoke-virtual {v1}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v5

    sget-object v9, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    if-eq v5, v9, :cond_4

    .line 58
    invoke-virtual {v1}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v5

    move-object v9, v2

    check-cast v9, Ljava/lang/Enum;

    invoke-virtual {v5, v9}, Landroidx/lifecycle/Lifecycle$State;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-ltz v5, :cond_5

    .line 48
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p1, p0}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    goto :goto_2

    .line 57
    :cond_4
    new-instance p0, Landroidx/lifecycle/LifecycleDestroyedException;

    invoke-direct {p0}, Landroidx/lifecycle/LifecycleDestroyedException;-><init>()V

    throw p0

    .line 61
    :cond_5
    check-cast v3, Lkotlinx/coroutines/CoroutineDispatcher;

    new-instance v5, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1;

    invoke-direct {v5, p1}, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1;-><init>(Lkotlinx/coroutines/CompletableDeferred;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    iput-object p1, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->L$0:Ljava/lang/Object;

    iput p0, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->label:I

    move v10, v4

    move-object v4, v3

    move v3, v10

    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/WithLifecycleStateKt;->suspendWithStateAtLeastUnchecked(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_6

    goto :goto_3

    :cond_6
    move-object p0, p1

    :goto_1
    move-object p1, p0

    .line 49
    :goto_2
    iput-object v8, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->L$0:Ljava/lang/Object;

    iput v7, v6, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerKt$awaitResumed$1;->label:I

    invoke-interface {p1, v6}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_7

    :goto_3
    return-object v0

    .line 50
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
