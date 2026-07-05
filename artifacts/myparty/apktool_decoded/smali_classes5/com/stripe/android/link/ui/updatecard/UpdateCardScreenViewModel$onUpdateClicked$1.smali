.class final Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "UpdateCardScreenViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->onUpdateClicked()V
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
    value = "SMAP\nUpdateCardScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCardScreenViewModel.kt\ncom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1\n+ 2 LinkDismissalCoordinator.kt\ncom/stripe/android/link/LinkDismissalCoordinatorKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n20#2,4:246\n25#2:288\n230#3,5:250\n230#3,5:268\n230#3,5:273\n230#3,5:278\n230#3,5:283\n1#4:255\n626#5,12:256\n*S KotlinDebug\n*F\n+ 1 UpdateCardScreenViewModel.kt\ncom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1\n*L\n93#1:246,4\n93#1:288\n95#1:250,5\n126#1:268,5\n129#1:273,5\n134#1:278,5\n139#1:283,5\n112#1:256,12\n*E\n"
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
    c = "com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel$onUpdateClicked$1"
    f = "UpdateCardScreenViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x69,
        0x75
    }
    m = "invokeSuspend"
    n = {
        "$this$withDismissalDisabled$iv",
        "paymentUpdateParams",
        "paymentDetailsId",
        "originalDismissible$iv",
        "$this$withDismissalDisabled$iv",
        "originalDismissible$iv"
    }
    s = {
        "L$0",
        "L$2",
        "L$3",
        "Z$0",
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->this$0:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

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

    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;

    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->this$0:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;-><init>(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 92
    iget v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-boolean v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->Z$0:Z

    iget-object v0, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$1:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    iget-object v0, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$0:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/LinkDismissalCoordinator;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v3

    move-object/from16 v3, p1

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->Z$0:Z

    iget-object v7, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v9, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    iget-object v10, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/link/LinkDismissalCoordinator;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v11, p1

    check-cast v11, Lkotlin/Result;

    invoke-virtual {v11}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v22, v11

    move-object v11, v7

    move-object v7, v9

    :goto_0
    move-object/from16 v9, v22

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v9

    :goto_1
    move-object v4, v10

    goto/16 :goto_c

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .line 93
    iget-object v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->this$0:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    invoke-static {v2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getDismissalCoordinator$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/LinkDismissalCoordinator;

    move-result-object v2

    iget-object v7, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->this$0:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    .line 246
    invoke-interface {v2}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v8

    .line 247
    invoke-interface {v2, v3}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 94
    :try_start_2
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 95
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$get_state$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v9

    .line 251
    :cond_3
    invoke-interface {v9}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v10

    .line 252
    move-object v11, v10

    check-cast v11, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    const/16 v20, 0x3f

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    .line 95
    invoke-static/range {v11 .. v21}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object v11

    .line 253
    invoke-interface {v9, v10, v11}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 96
    invoke-virtual {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v9

    invoke-interface {v9}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v9}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getCardUpdateParams()Lcom/stripe/android/paymentsheet/CardUpdateParams;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const-string v10, "Required value was null."

    if-eqz v9, :cond_17

    .line 97
    :try_start_3
    invoke-virtual {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v11

    invoke-interface {v11}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v11}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getPaymentDetailsId()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_16

    .line 102
    invoke-virtual {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v10

    invoke-interface {v10}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isDefault()Z

    move-result v10

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-ne v12, v5, :cond_4

    goto :goto_2

    :cond_4
    move-object v10, v6

    .line 103
    :goto_2
    invoke-static {v7, v9}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$toApiParams(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v12

    .line 98
    new-instance v13, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;

    invoke-direct {v13, v11, v10, v12}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V

    .line 105
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v10

    .line 107
    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v12

    if-eqz v12, :cond_5

    iget-object v12, v12, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->phone:Ljava/lang/String;

    goto :goto_3

    :cond_5
    move-object v12, v6

    .line 105
    :goto_3
    iput-object v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$0:Ljava/lang/Object;

    iput-object v7, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$1:Ljava/lang/Object;

    iput-object v9, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$2:Ljava/lang/Object;

    iput-object v11, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$3:Ljava/lang/Object;

    iput-boolean v8, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->Z$0:Z

    iput v5, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->label:I

    invoke-interface {v10, v13, v12, v1}, Lcom/stripe/android/link/account/LinkAccountManager;->updatePaymentDetails-0E7RQCE(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-ne v10, v0, :cond_6

    goto/16 :goto_8

    :cond_6
    move-object/from16 v22, v10

    move-object v10, v2

    move v2, v8

    move-object v8, v9

    goto/16 :goto_0

    .line 108
    :goto_4
    :try_start_4
    invoke-static {v9}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v9, Lcom/stripe/android/model/ConsumerPaymentDetails;

    .line 110
    invoke-virtual {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v12

    invoke-interface {v12}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v12}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isBillingDetailsUpdateFlow()Z

    move-result v12

    if-eqz v12, :cond_14

    .line 112
    invoke-virtual {v9}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    .line 258
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v12, v6

    :cond_7
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 259
    move-object v14, v13

    check-cast v14, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 112
    invoke-virtual {v14}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    if-nez v3, :cond_8

    move v3, v5

    move-object v12, v13

    goto :goto_5

    .line 260
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "Collection contains more than one matching element."

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    if-eqz v3, :cond_13

    .line 112
    check-cast v12, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 113
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v3

    invoke-interface {v3}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v3

    if-eqz v3, :cond_12

    .line 117
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getCompleteLinkFlow$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    move-result-object v5

    .line 118
    new-instance v9, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    .line 120
    invoke-virtual {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v11

    invoke-interface {v11}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v11}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getBillingDetailsUpdateFlow()Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-virtual {v11}, Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;->getCvc()Ljava/lang/String;

    move-result-object v11

    goto :goto_6

    :cond_a
    move-object v11, v6

    .line 121
    :goto_6
    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v8

    if-eqz v8, :cond_b

    iget-object v8, v8, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->phone:Ljava/lang/String;

    goto :goto_7

    :cond_b
    move-object v8, v6

    .line 118
    :goto_7
    invoke-direct {v9, v12, v11, v8}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v9, Lcom/stripe/android/link/LinkPaymentMethod;

    .line 117
    iput-object v10, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$0:Ljava/lang/Object;

    iput-object v7, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$1:Ljava/lang/Object;

    iput-object v6, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$2:Ljava/lang/Object;

    iput-object v6, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->L$3:Ljava/lang/Object;

    iput-boolean v2, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->Z$0:Z

    iput v4, v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;->label:I

    invoke-interface {v5, v9, v3, v1}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow;->invoke(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-ne v3, v0, :cond_c

    :goto_8
    return-object v0

    :cond_c
    move-object v4, v10

    .line 92
    :goto_9
    :try_start_5
    check-cast v3, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    .line 126
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$get_state$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 269
    :cond_d
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 270
    move-object v8, v5

    check-cast v8, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    const/16 v17, 0x7f

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 126
    invoke-static/range {v8 .. v18}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object v6

    .line 271
    invoke-interface {v0, v5, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 128
    instance-of v0, v3, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;

    if-nez v0, :cond_11

    .line 129
    instance-of v0, v3, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    if-eqz v0, :cond_f

    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$get_state$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 274
    :cond_e
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 275
    move-object v8, v5

    check-cast v8, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    .line 129
    move-object v6, v3

    check-cast v6, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    invoke-virtual {v6}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v15

    const/16 v17, 0xbf

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v8 .. v18}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object v6

    .line 276
    invoke-interface {v0, v5, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_a

    .line 130
    :cond_f
    instance-of v0, v3, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    if-eqz v0, :cond_10

    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getDismissWithResult$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    check-cast v3, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    invoke-virtual {v3}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;->getLinkActivityResult()Lcom/stripe/android/link/LinkActivityResult;

    move-result-object v3

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 127
    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_11
    :goto_a
    move-object v3, v7

    goto :goto_b

    :catchall_2
    move-exception v0

    move-object v3, v7

    goto :goto_c

    .line 114
    :cond_12
    :try_start_6
    const-string v0, "LinkAccount should not be null in billing details update flow"

    .line 113
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 265
    :cond_13
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v3, "Collection contains no element matching the predicate."

    invoke-direct {v0, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_14
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$get_state$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 279
    :cond_15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 280
    move-object v11, v3

    check-cast v11, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    const/16 v20, 0x3f

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 134
    invoke-static/range {v11 .. v21}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object v4

    .line 281
    invoke-interface {v0, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 135
    invoke-static {v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getNavigationManager$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v4, v10

    goto :goto_a

    .line 137
    :goto_b
    :try_start_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 94
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_d

    :catchall_3
    move-exception v0

    move-object v3, v7

    goto/16 :goto_1

    .line 97
    :cond_16
    :try_start_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    move-object v4, v2

    move-object v3, v7

    move v2, v8

    .line 94
    :goto_c
    :try_start_9
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 137
    :goto_d
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 138
    invoke-static {v3}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$getLogger$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v5

    const-string v6, "Failed to update payment details"

    invoke-interface {v5, v6, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    invoke-static {v3}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->access$get_state$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    .line 284
    :cond_18
    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 285
    move-object v6, v5

    check-cast v6, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    .line 139
    invoke-static {v0}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v13

    const/16 v15, 0x3f

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v6 .. v16}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object v6

    .line 286
    invoke-interface {v3, v5, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 141
    :cond_19
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 288
    invoke-interface {v4, v2}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 142
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :catchall_5
    move-exception v0

    .line 288
    invoke-interface {v4, v2}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    throw v0
.end method
