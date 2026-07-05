.class final Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSheet.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/CustomerSheet;->retrievePaymentOptionSelection(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/customersheet/CustomerSheetResult;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/customersheet/CustomerSheetResult;",
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
    c = "com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2"
    f = "CustomerSheet.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x8e,
        0x8f
    }
    m = "invokeSuspend"
    n = {
        "paymentMethodsDeferred",
        "savedSelection"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $request:Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/CustomerSheet;


# direct methods
.method public static synthetic $r8$lambda$pbVdMHWeT8rGyUQhPGVAgcWhmgo(Ljava/lang/Object;Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->invokeSuspend$lambda$3$lambda$2(Ljava/lang/Object;Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheet;Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheet;",
            "Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheet;

    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->$request:Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$3$lambda$2(Ljava/lang/Object;Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;
    .locals 3

    .line 149
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move-object p0, v0

    :cond_0
    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_3

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 150
    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, p2

    .line 149
    :cond_2
    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheet;

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->$request:Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    invoke-direct {v0, v1, v2, p2}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheet;Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/customersheet/CustomerSheetResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 133
    iget v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/Deferred;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->L$0:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .line 134
    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1;

    invoke-direct {p1, v4}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v8, p1

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object p1

    .line 139
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2$paymentMethodsDeferred$1;

    invoke-direct {v1, v4}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2$paymentMethodsDeferred$1;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v1

    .line 142
    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->label:I

    invoke-interface {p1, v5}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    .line 143
    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->label:I

    invoke-interface {v1, v3}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    .line 145
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    if-eqz v0, :cond_5

    .line 146
    sget-object v1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;

    invoke-virtual {v1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;->toPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/SavedSelection;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    move-result-object v0

    goto :goto_3

    :cond_5
    move-object v0, v4

    .line 145
    :cond_6
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 147
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheet;

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;->$request:Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    if-eqz v0, :cond_7

    .line 148
    new-instance v3, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2$$ExternalSyntheticLambda0;

    invoke-direct {v3, p1, v0}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2$$ExternalSyntheticLambda0;-><init>(Ljava/lang/Object;Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;)V

    invoke-virtual {v0, v3}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->toPaymentSelection$paymentsheet_release(Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    .line 152
    invoke-static {v1}, Lcom/stripe/android/customersheet/CustomerSheet;->access$getPaymentOptionFactory$p(Lcom/stripe/android/customersheet/CustomerSheet;)Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;->getConfiguration()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getGooglePayEnabled()Z

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;->toPaymentOptionSelection$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Z)Lcom/stripe/android/customersheet/PaymentOptionSelection;

    move-result-object v4

    .line 147
    :cond_7
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 155
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_9

    check-cast p1, Lcom/stripe/android/customersheet/PaymentOptionSelection;

    .line 157
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;-><init>(Lcom/stripe/android/customersheet/PaymentOptionSelection;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetResult;

    goto :goto_5

    .line 160
    :cond_9
    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;

    invoke-direct {p1, v0}, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetResult;

    :goto_5
    return-object v0
.end method
