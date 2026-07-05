.class final Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentMethodViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->onPayClicked()V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1\n+ 2 LinkDismissalCoordinator.kt\ncom/stripe/android/link/LinkDismissalCoordinatorKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,215:1\n20#2,4:216\n25#2:225\n230#3,5:220\n*S KotlinDebug\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1\n*L\n92#1:216,4\n92#1:225\n117#1:220,5\n*E\n"
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
    c = "com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel$onPayClicked$1"
    f = "PaymentMethodViewModel.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x5d,
        0x63,
        0x6d
    }
    m = "invokeSuspend"
    n = {
        "$this$withDismissalDisabled$iv",
        "originalDismissible$iv",
        "$this$withDismissalDisabled$iv",
        "originalDismissible$iv",
        "$this$withDismissalDisabled$iv",
        "originalDismissible$iv"
    }
    s = {
        "L$0",
        "Z$0",
        "L$0",
        "Z$0",
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field final synthetic $paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

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

    new-instance p1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;-><init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 88
    iget v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_0

    iget-boolean v2, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->Z$0:Z

    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    iget-object v3, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/link/LinkDismissalCoordinator;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_f

    :catchall_0
    move-exception v0

    goto/16 :goto_11

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v4, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->Z$0:Z

    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$2:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$1:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$0:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/link/LinkDismissalCoordinator;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    move-object v9, v7

    move-object v7, v8

    move-object v8, v5

    move v5, v4

    goto/16 :goto_5

    :cond_2
    iget-boolean v5, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->Z$0:Z

    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v7, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    iget-object v8, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/link/LinkDismissalCoordinator;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    check-cast v9, Lkotlin/Result;

    invoke-virtual {v9}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v19, v8

    move-object v8, v0

    move-object v0, v9

    move-object v9, v7

    move-object/from16 v7, v19

    goto :goto_0

    :catchall_2
    move-exception v0

    move v2, v5

    move-object v3, v8

    goto/16 :goto_11

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    invoke-static {v0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$clearErrorMessage(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)V

    .line 90
    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    sget-object v7, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-static {v0, v7}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$updateButtonState(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    .line 92
    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    invoke-static {v0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$getDismissalCoordinator$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/LinkDismissalCoordinator;

    move-result-object v7

    iget-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->this$0:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    iget-object v8, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    .line 216
    invoke-interface {v7}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v9

    const/4 v10, 0x0

    .line 217
    invoke-interface {v7, v10}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 93
    :try_start_3
    invoke-static {v0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v10

    iput-object v7, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$2:Ljava/lang/Object;

    iput-boolean v9, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->Z$0:Z

    iput v5, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->label:I

    invoke-interface {v10, v8, v1}, Lcom/stripe/android/link/account/LinkAccountManager;->createCardPaymentDetails-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    if-ne v5, v2, :cond_4

    goto/16 :goto_e

    :cond_4
    move/from16 v19, v9

    move-object v9, v0

    move-object v0, v5

    move/from16 v5, v19

    .line 94
    :goto_0
    :try_start_4
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v10, :cond_9

    :try_start_5
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/link/LinkPaymentDetails$New;

    .line 95
    invoke-static {v9}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$getConfiguration$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result v10

    if-eqz v10, :cond_8

    .line 96
    invoke-static {v9}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$getLinkLaunchMode$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object v10

    instance-of v11, v10, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz v11, :cond_5

    check-cast v10, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    goto :goto_1

    :cond_5
    move-object v10, v6

    :goto_1
    if-eqz v10, :cond_6

    .line 97
    invoke-virtual {v10}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;->getSharePaymentDetailsImmediatelyAfterCreation()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_3

    .line 99
    :cond_6
    invoke-static {v9}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v10

    iput-object v7, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$2:Ljava/lang/Object;

    iput-boolean v5, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->Z$0:Z

    iput v4, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->label:I

    invoke-interface {v10, v0, v1}, Lcom/stripe/android/link/account/LinkAccountManager;->shareCardPaymentDetails-gIAlu-s(Lcom/stripe/android/link/LinkPaymentDetails$New;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-ne v0, v2, :cond_7

    goto/16 :goto_e

    :cond_7
    move v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v9

    :goto_2
    :try_start_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/link/LinkPaymentDetails;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    .line 101
    :cond_8
    :goto_3
    :try_start_7
    check-cast v0, Lcom/stripe/android/link/LinkPaymentDetails;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v9

    .line 94
    :goto_4
    :try_start_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object/from16 v19, v8

    move-object v8, v5

    move-object/from16 v5, v19

    goto :goto_7

    :catchall_3
    move-exception v0

    :goto_5
    :try_start_9
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_9
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    move v2, v5

    move-object v3, v7

    goto/16 :goto_11

    :goto_6
    move v4, v5

    move-object v5, v7

    move-object v7, v9

    .line 104
    :goto_7
    :try_start_a
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    if-nez v9, :cond_11

    check-cast v0, Lcom/stripe/android/link/LinkPaymentDetails;

    .line 106
    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v8

    .line 107
    const-string v9, "card"

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/util/Map;

    if-eqz v10, :cond_a

    check-cast v9, Ljava/util/Map;

    goto :goto_8

    :cond_a
    move-object v9, v6

    .line 108
    :goto_8
    const-string v10, "billing_details"

    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v10, v8, Ljava/util/Map;

    if-eqz v10, :cond_b

    check-cast v8, Ljava/util/Map;

    goto :goto_9

    :cond_b
    move-object v8, v6

    :goto_9
    if-eqz v9, :cond_c

    .line 111
    const-string v10, "cvc"

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_a

    :cond_c
    move-object v9, v6

    :goto_a
    instance-of v10, v9, Ljava/lang/String;

    if-eqz v10, :cond_d

    check-cast v9, Ljava/lang/String;

    goto :goto_b

    :cond_d
    move-object v9, v6

    :goto_b
    if-eqz v8, :cond_e

    .line 112
    const-string v10, "phone"

    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_c

    :cond_e
    move-object v8, v6

    :goto_c
    instance-of v10, v8, Ljava/lang/String;

    if-eqz v10, :cond_f

    check-cast v8, Ljava/lang/String;

    goto :goto_d

    :cond_f
    move-object v8, v6

    .line 109
    :goto_d
    iput-object v5, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$0:Ljava/lang/Object;

    iput-object v7, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$1:Ljava/lang/Object;

    iput-object v6, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->L$2:Ljava/lang/Object;

    iput-boolean v4, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->Z$0:Z

    iput v3, v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;->label:I

    invoke-static {v7, v0, v9, v8, v1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$attemptCompletion(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    if-ne v0, v2, :cond_10

    :goto_e
    return-object v2

    :cond_10
    move v2, v4

    move-object v3, v5

    move-object v0, v7

    .line 114
    :goto_f
    :try_start_b
    sget-object v4, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-static {v0, v4}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$updateButtonState(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/link/ui/PrimaryButtonState;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_10

    .line 117
    :cond_11
    :try_start_c
    invoke-static {v7}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$get_state$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 221
    :cond_12
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 222
    move-object v10, v2

    check-cast v10, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    .line 119
    invoke-static {v9}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v16

    const/16 v17, 0x1f

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 118
    invoke-static/range {v10 .. v18}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->copy$default(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    move-result-object v3

    .line 223
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 122
    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-static {v7, v0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$updateButtonState(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    .line 123
    invoke-static {v7}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->access$getLogger$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v0

    .line 124
    const-string v2, "PaymentMethodViewModel: Failed to create card payment details"

    .line 123
    invoke-interface {v0, v2, v9}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    move v2, v4

    move-object v3, v5

    .line 129
    :goto_10
    :try_start_d
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 225
    invoke-interface {v3, v2}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 130
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :catchall_5
    move-exception v0

    move v2, v4

    move-object v3, v5

    goto :goto_11

    :catchall_6
    move-exception v0

    move-object v3, v7

    move v2, v9

    .line 225
    :goto_11
    invoke-interface {v3, v2}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    throw v0
.end method
