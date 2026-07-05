.class final Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerAdapterDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->loadCustomerSheetSession(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
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
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
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
    c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2"
    f = "CustomerAdapterDataSource.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x36,
        0x37,
        0x38
    }
    m = "invokeSuspend"
    n = {
        "paymentMethodsResult",
        "savedSelectionResult",
        "savedSelectionResult",
        "elementsSession",
        "elementsSession",
        "paymentMethods"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->$configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->$configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-direct {v0, v1, v2, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 41
    iget v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/model/ElementsSession;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v0

    :goto_0
    move-object v6, v1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/model/ElementsSession;

    iget-object v3, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/Deferred;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/Deferred;

    iget-object v5, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/Deferred;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .line 42
    new-instance p1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    const/4 v11, 0x0

    invoke-direct {p1, v1, v11}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    move-object v8, p1

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object p1

    .line 46
    new-instance v1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2$paymentMethodsResult$1;

    iget-object v6, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-direct {v1, v6, v11}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2$paymentMethodsResult$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v1

    .line 50
    new-instance v6, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1;

    iget-object v7, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-direct {v6, v7, v11}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v5

    .line 54
    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->label:I

    invoke-interface {p1, v6}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v12, v5

    move-object v5, v1

    move-object v1, v12

    :goto_1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/ElementsSession;

    .line 55
    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->label:I

    invoke-interface {v5, v6}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v12, v1

    move-object v1, p1

    move-object p1, v3

    move-object v3, v12

    :goto_2
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/List;

    .line 56
    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->label:I

    invoke-interface {v3, v5}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object v7, p1

    move-object p1, v2

    goto/16 :goto_0

    :goto_4
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, p1

    check-cast v8, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    .line 62
    sget-object p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Legacy;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Legacy;

    .line 65
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;->$configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z

    move-result v0

    .line 64
    new-instance v10, Lcom/stripe/android/customersheet/CustomerPermissions;

    const/4 v1, 0x0

    invoke-direct {v10, v4, v0, v1}, Lcom/stripe/android/customersheet/CustomerPermissions;-><init>(ZZZ)V

    .line 58
    new-instance v5, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    .line 62
    move-object v9, p1

    check-cast v9, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    const/4 v11, 0x0

    .line 58
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;-><init>(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)V

    return-object v5
.end method
