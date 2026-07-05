.class final Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentElementLoader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->load-BWLJW6A(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
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
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
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
    c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3"
    f = "PaymentElementLoader.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6
    }
    l = {
        0xa7,
        0xa8,
        0xb5,
        0xe7,
        0xf2,
        0xf3,
        0x101
    }
    m = "invokeSuspend"
    n = {
        "$this$runCatching",
        "$this$runCatching",
        "$this$runCatching",
        "elementsSession",
        "customerInfo",
        "elementsSession",
        "customerInfo",
        "customer",
        "initialPaymentSelection",
        "stripeIntent",
        "elementsSession",
        "customerInfo",
        "initialPaymentSelection",
        "stripeIntent",
        "pmMetadata",
        "elementsSession",
        "customerInfo",
        "stripeIntent",
        "pmMetadata",
        "customerInfo",
        "pmMetadata",
        "state"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $configuration:Lcom/stripe/android/common/model/CommonConfiguration;

.field final synthetic $initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

.field final synthetic $metadata:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$metadata:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$metadata:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 164
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-boolean v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->Z$0:Z

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$5:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/ElementsSession;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v11, v1

    move-object v10, v2

    move-object v8, v4

    move-object/from16 v16, v6

    move-object v15, v7

    move-object/from16 v7, p1

    :goto_0
    move-object v9, v3

    goto/16 :goto_9

    :pswitch_1
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$5:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/StripeIntent;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/ElementsSession;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v7, v3

    move-object v3, v8

    move-object v8, v2

    move-object v11, v4

    move-object v2, v5

    move-object v4, v6

    move-object/from16 v5, p1

    goto/16 :goto_7

    :pswitch_2
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$5:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/Deferred;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/ElementsSession;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v6

    move-object v6, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v4, p1

    goto/16 :goto_6

    :pswitch_3
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/Deferred;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/Deferred;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/model/ElementsSession;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v5

    move-object v7, v6

    move-object/from16 v6, p1

    move-object v5, v3

    goto/16 :goto_5

    :pswitch_4
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/ElementsSession;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/CoroutineScope;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    :cond_0
    move-object v8, v2

    move-object v9, v3

    goto/16 :goto_4

    :pswitch_5
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v3

    :cond_1
    move-object v4, v2

    goto :goto_3

    :pswitch_6
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_1

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .line 165
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$getEventReporter$p(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$metadata:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;->getInitializedViaCompose()Z

    move-result v4

    invoke-interface {v3, v4}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onLoadStarted(Z)V

    .line 167
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-static {v3, v4, v5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$retrieveSavedPaymentMethodSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    goto/16 :goto_8

    .line 164
    :cond_2
    :goto_1
    check-cast v3, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    .line 168
    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    .line 169
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 170
    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    invoke-virtual {v6}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v6

    .line 171
    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    invoke-virtual {v7}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object v7

    .line 172
    iget-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    invoke-virtual {v8}, Lcom/stripe/android/common/model/CommonConfiguration;->getExternalPaymentMethods()Ljava/util/List;

    move-result-object v8

    if-eqz v3, :cond_3

    .line 173
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    move-object v9, v3

    move-object v10, v0

    check-cast v10, Lkotlin/coroutines/Continuation;

    .line 168
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$retrieveElementsSession-hUnOzRk(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_1

    goto/16 :goto_8

    .line 174
    :goto_3
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v3, Lcom/stripe/android/model/ElementsSession;

    .line 176
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    .line 177
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    .line 176
    invoke-static {v2, v5, v3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$createCustomerInfo(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    move-result-object v2

    .line 181
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    const/4 v8, 0x3

    iput v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-static {v5, v6, v3, v7}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$isGooglePayReady(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_0

    goto/16 :goto_8

    :goto_4
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move-object v10, v9

    .line 183
    new-instance v9, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$savedSelection$1;

    move-object v13, v10

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$savedSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;ZLcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)V

    move v2, v12

    move-object v3, v13

    move-object v13, v9

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v4

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v4

    move-object v5, v10

    .line 191
    new-instance v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$linkState$1;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    move-object v10, v8

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-object v9, v3

    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$linkState$1;-><init>(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lkotlin/coroutines/Continuation;)V

    move-object v8, v10

    move-object v13, v6

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x0

    move-object v10, v5

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v7

    .line 201
    new-instance v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1;

    move-object v10, v8

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    const/4 v13, 0x0

    move v12, v2

    move-object v11, v10

    move-object v10, v3

    invoke-direct/range {v6 .. v13}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1;-><init>(Lkotlinx/coroutines/Deferred;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;ZLkotlin/coroutines/Continuation;)V

    move-object v8, v11

    move-object v13, v6

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v5

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v9

    .line 211
    new-instance v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$customer$1;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    move-object v10, v4

    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$customer$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)V

    move-object v13, v6

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x0

    move-object v10, v5

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v14

    .line 220
    new-instance v10, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    const/16 v17, 0x0

    move v15, v2

    move-object v12, v4

    move-object/from16 v16, v6

    move-object v13, v9

    invoke-direct/range {v10 .. v17}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3$initialPaymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;ZLcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)V

    move-object v4, v14

    move-object v13, v10

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v5

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v2

    .line 230
    invoke-virtual {v3}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v5

    .line 231
    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    const/4 v7, 0x4

    iput v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-interface {v9, v6}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    goto/16 :goto_8

    :cond_4
    move-object v7, v5

    move-object v5, v2

    move-object v2, v7

    move-object v7, v3

    .line 164
    :goto_5
    check-cast v6, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 233
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {v3, v2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$warnUnactivatedIfNeeded(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/StripeIntent;)V

    .line 235
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {v3, v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$supportsIntent(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 241
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    .line 242
    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$5:Ljava/lang/Object;

    const/4 v10, 0x5

    iput v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-interface {v4, v9}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_5

    goto :goto_8

    .line 164
    :cond_5
    :goto_6
    check-cast v4, Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 243
    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$5:Ljava/lang/Object;

    const/4 v10, 0x6

    iput v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-interface {v5, v9}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    goto :goto_8

    :cond_6
    move-object v11, v7

    move-object v7, v3

    move-object v3, v11

    move-object v11, v8

    move-object v8, v4

    move-object v4, v11

    move-object v11, v6

    .line 164
    :goto_7
    move-object v9, v5

    check-cast v9, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 244
    invoke-static {v2}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidatorKt;->validate(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    move-result-object v10

    .line 240
    new-instance v6, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;-><init>(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    .line 248
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {v2, v3, v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$logLinkExperimentExposures(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V

    .line 253
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    .line 256
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$metadata:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;->isReloadingAfterProcessDeath()Z

    move-result v5

    .line 257
    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$0:Ljava/lang/Object;

    iput-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->L$5:Ljava/lang/Object;

    iput-boolean v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->Z$0:Z

    const/4 v9, 0x7

    iput v9, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->label:I

    invoke-static {v7, v8}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$isGooglePaySupported(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_7

    :goto_8
    return-object v1

    :cond_7
    move-object v8, v2

    move-object v15, v4

    move-object v10, v6

    move-object/from16 v16, v11

    move v11, v5

    move-object v5, v10

    goto/16 :goto_0

    :goto_9
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    .line 258
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$configuration:Lcom/stripe/android/common/model/CommonConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/common/model/CommonConfiguration;->getLink()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->getDisplay$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    move-result-object v13

    .line 259
    iget-object v14, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;->$initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 253
    invoke-static/range {v8 .. v16}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->access$reportSuccessfulLoad(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;ZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    return-object v5

    .line 236
    :cond_8
    invoke-interface {v2}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    const-string v1, ", "

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 237
    new-instance v2, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$NoPaymentMethodTypesAvailable;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$NoPaymentMethodTypesAvailable;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
