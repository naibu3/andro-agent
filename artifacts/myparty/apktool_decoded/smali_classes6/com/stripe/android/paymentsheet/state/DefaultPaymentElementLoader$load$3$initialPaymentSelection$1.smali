.class final Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentElementLoader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
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
    c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3$initialPaymentSelection$1"
    f = "PaymentElementLoader.kt"
    i = {}
    l = {
        0xdf,
        0xe0,
        0xdd
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $configuration:Lcom/stripe/android/common/model/CommonConfiguration;

.field final synthetic $customer:Lkotlinx/coroutines/Deferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/Deferred<",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isGooglePayReady:Z

.field final synthetic $paymentMethodMetadata:Lkotlinx/coroutines/Deferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/Deferred<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $savedSelection:Lkotlinx/coroutines/Deferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/Deferred<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;ZLcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;",
            "Lkotlinx/coroutines/Deferred<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;",
            "Lkotlinx/coroutines/Deferred<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;",
            "Lkotlinx/coroutines/Deferred<",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;Z",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$savedSelection:Lkotlinx/coroutines/Deferred;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$paymentMethodMetadata:Lkotlinx/coroutines/Deferred;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$customer:Lkotlinx/coroutines/Deferred;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$isGooglePayReady:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$savedSelection:Lkotlinx/coroutines/Deferred;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$paymentMethodMetadata:Lkotlinx/coroutines/Deferred;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$customer:Lkotlinx/coroutines/Deferred;

    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$isGooglePayReady:Z

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;ZLcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 220
    iget v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/Deferred;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/Deferred;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 221
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    .line 222
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$savedSelection:Lkotlinx/coroutines/Deferred;

    .line 223
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$paymentMethodMetadata:Lkotlinx/coroutines/Deferred;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$1:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->label:I

    invoke-interface {v5, v6}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v10, v4

    move-object v4, p1

    move-object p1, v10

    .line 220
    :goto_0
    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 224
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$customer:Lkotlinx/coroutines/Deferred;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$1:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->label:I

    invoke-interface {v5, v6}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, p1

    move-object p1, v3

    move-object v3, v4

    move-object v4, v1

    .line 220
    :goto_1
    move-object v6, p1

    check-cast v6, Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 225
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$isGooglePayReady:Z

    .line 226
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getWalletButtons()Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;->getWillDisplayExternally()Z

    move-result p1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    move v8, p1

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    const/4 p1, 0x0

    .line 221
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$1:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->L$2:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;->label:I

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$retrieveInitialPaymentSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    return-object p1
.end method
