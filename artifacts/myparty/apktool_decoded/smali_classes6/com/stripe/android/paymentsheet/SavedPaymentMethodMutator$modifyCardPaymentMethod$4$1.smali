.class final Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavedPaymentMethodMutator.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->modifyCardPaymentMethod-BWLJW6A(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nSavedPaymentMethodMutator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedPaymentMethodMutator.kt\ncom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,473:1\n1557#2:474\n1628#2,3:475\n*S KotlinDebug\n*F\n+ 1 SavedPaymentMethodMutator.kt\ncom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1\n*L\n295#1:474\n295#1:475,3\n*E\n"
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
    c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1"
    f = "SavedPaymentMethodMutator.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $currentCustomer:Lcom/stripe/android/paymentsheet/state/CustomerState;

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $updatedMethod:Lcom/stripe/android/model/PaymentMethod;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/state/CustomerState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$currentCustomer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

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

    new-instance v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$currentCustomer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/state/CustomerState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 291
    iget v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 292
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->access$getCustomerStateHolder$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->updateMostRecentlySelectedSavedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    .line 293
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->access$getCustomerStateHolder$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    move-result-object p1

    .line 294
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$currentCustomer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 295
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    .line 474
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 475
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 476
    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    .line 296
    iget-object v5, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    .line 297
    iget-object v6, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-eqz v6, :cond_0

    if-eqz v5, :cond_0

    .line 299
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v4, v2

    .line 476
    :cond_0
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 477
    :cond_1
    move-object v4, v3

    check-cast v4, Ljava/util/List;

    const/16 v6, 0x17

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 294
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/state/CustomerState;->copy$default(Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v0

    .line 293
    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->setCustomerState(Lcom/stripe/android/paymentsheet/state/CustomerState;)V

    .line 307
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->access$isSelectedPaymentMethod(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 308
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->this$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->access$getSetSelection$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;->$updatedMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 291
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
