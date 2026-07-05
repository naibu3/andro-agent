.class final Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSessionElementsSessionManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Result<",
        "+",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSessionElementsSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSessionElementsSessionManager.kt\ncom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Result;",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
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
    c = "com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2"
    f = "CustomerSessionElementsSessionManager.kt"
    i = {
        0x1,
        0x2,
        0x2,
        0x3
    }
    l = {
        0x3f,
        0x44,
        0x4b,
        0x50
    }
    m = "invokeSuspend"
    n = {
        "intentConfiguration",
        "customerSessionClientSecret",
        "intentConfiguration",
        "customerSessionClientSecret"
    }
    s = {
        "L$1",
        "L$1",
        "L$2",
        "L$1"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->this$0:Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

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

    new-instance v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->this$0:Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;-><init>(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v6, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 60
    iget v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->label:I

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x3

    if-eqz v0, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;

    iget-object v1, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    iget-object v2, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;

    iget-object v3, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v5, p1

    move-object v8, v2

    move-object v9, v3

    goto/16 :goto_2

    :cond_2
    iget-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    iget-object v2, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_3
    iget-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 61
    iget-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->this$0:Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    :try_start_4
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 62
    invoke-static {v0}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$getIntentConfiguration$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    move-result-object v5

    if-nez v5, :cond_7

    .line 63
    invoke-static {v0}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$getCustomerSessionProvider$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    move-result-object v5

    iput-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    iput v3, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->label:I

    invoke-virtual {v5, v6}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;->intentConfiguration-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_5

    goto/16 :goto_5

    .line 64
    :cond_5
    :goto_0
    invoke-static {v3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    invoke-static {v0, v5}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$setIntentConfiguration$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;)V

    .line 65
    :cond_6
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    .line 67
    :cond_7
    invoke-static {v0}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$getCustomerSessionProvider$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    move-result-object v3

    .line 68
    iput-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    iput-object v5, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$1:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->label:I

    invoke-virtual {v3, v6}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;->providesCustomerSessionClientSecret-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_8

    goto/16 :goto_5

    :cond_8
    move-object v2, v0

    move-object v0, v5

    .line 69
    :goto_1
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v3, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;

    .line 71
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->getClientSecret$paymentsheet_release()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$validateCustomerSessionClientSecret(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Ljava/lang/String;)V

    .line 73
    invoke-static {v2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$getPrefsRepositoryFactory$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lkotlin/jvm/functions/Function1;

    move-result-object v5

    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->getCustomerId$paymentsheet_release()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/paymentsheet/PrefsRepository;

    .line 75
    iput-object v2, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    iput-object v3, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$1:Ljava/lang/Object;

    iput-object v0, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$2:Ljava/lang/Object;

    iput v4, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->label:I

    const/4 v8, 0x0

    invoke-interface {v5, v8, v8, v6}, Lcom/stripe/android/paymentsheet/PrefsRepository;->getSavedSelection(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_9

    goto :goto_5

    :cond_9
    move-object v9, v2

    move-object v8, v3

    :goto_2
    instance-of v2, v5, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    const/4 v3, 0x0

    if-eqz v2, :cond_a

    check-cast v5, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    goto :goto_3

    :cond_a
    move-object v5, v3

    :goto_3
    move-object v2, v0

    .line 80
    invoke-static {v9}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$getElementsSessionRepository$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    move-result-object v0

    .line 81
    new-instance v10, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    .line 82
    new-instance v11, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    .line 83
    new-instance v12, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    invoke-direct {v12, v3, v3, v4, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v12, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    .line 84
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;->getPaymentMethodTypes$paymentsheet_release()Ljava/util/List;

    move-result-object v13

    const/16 v17, 0x1c

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 82
    invoke-direct/range {v11 .. v18}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    invoke-direct {v10, v11}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V

    if-eqz v5, :cond_b

    .line 87
    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    goto :goto_4

    :cond_b
    move-object v5, v3

    .line 88
    :goto_4
    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration$Companion;

    .line 89
    invoke-virtual {v8}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->getCustomerId$paymentsheet_release()Ljava/lang/String;

    move-result-object v4

    .line 90
    invoke-virtual {v8}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->getClientSecret$paymentsheet_release()Ljava/lang/String;

    move-result-object v11

    .line 88
    invoke-virtual {v2, v4, v11}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration$Companion;->createWithCustomerSession(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v2

    .line 92
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    move-object v11, v4

    .line 93
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 81
    check-cast v10, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 80
    iput-object v9, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$0:Ljava/lang/Object;

    iput-object v8, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$1:Ljava/lang/Object;

    iput-object v3, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->L$2:Ljava/lang/Object;

    iput v1, v6, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;->label:I

    move-object v1, v10

    move-object v3, v11

    invoke-interface/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;->get-hUnOzRk(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_c

    :goto_5
    return-object v7

    :cond_c
    move-object v0, v8

    move-object v1, v9

    .line 94
    :goto_6
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/ElementsSession;

    .line 95
    invoke-static {v1}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$reportSuccessfulElementsSessionLoad(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)V

    .line 96
    :cond_d
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 97
    invoke-static {v1, v3}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$reportFailedElementsSessionLoad(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Ljava/lang/Throwable;)V

    .line 98
    :cond_e
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v3, :cond_f

    :try_start_5
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v2, Lcom/stripe/android/model/ElementsSession;

    .line 99
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->getClientSecret$paymentsheet_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$createCustomerSessionElementsSession(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lcom/stripe/android/model/ElementsSession;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    move-result-object v0

    .line 98
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    :try_start_6
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_7

    :cond_f
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 100
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    .line 101
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;->getEphemeralKey()Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->access$setCachedCustomerEphemeralKey$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;)V

    .line 102
    :cond_10
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    .line 61
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v0

    return-object v0
.end method
