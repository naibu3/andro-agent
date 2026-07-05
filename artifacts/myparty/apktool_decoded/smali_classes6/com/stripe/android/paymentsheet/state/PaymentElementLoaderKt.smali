.class public final Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;
.super Ljava/lang/Object;
.source "PaymentElementLoader.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentElementLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentElementLoader.kt\ncom/stripe/android/paymentsheet/state/PaymentElementLoaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,941:1\n295#2,2:942\n188#3,3:944\n*S KotlinDebug\n*F\n+ 1 PaymentElementLoader.kt\ncom/stripe/android/paymentsheet/state/PaymentElementLoaderKt\n*L\n920#1:942,2\n932#1:944,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0082@\u00a2\u0006\u0002\u0010\n\u001a\u000c\u0010\u000b\u001a\u00020\u000c*\u00020\u0002H\u0002\u001a\u000c\u0010\r\u001a\u00020\u0007*\u00020\u000eH\u0002\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u000eH\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "withDefaultPaymentMethodOrLastUsedPaymentMethodFirst",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "savedSelection",
        "Lkotlinx/coroutines/Deferred;",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "isPaymentMethodSetAsDefaultEnabled",
        "",
        "defaultPaymentMethodId",
        "",
        "(Ljava/util/List;Lkotlinx/coroutines/Deferred;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
        "paymentMethodOptionsSetupFutureUsageMap",
        "Lcom/stripe/android/model/StripeIntent;",
        "setupFutureUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "paymentsheet_release"
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
.method public static final synthetic access$paymentMethodOptionsSetupFutureUsageMap(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->paymentMethodOptionsSetupFutureUsageMap(Lcom/stripe/android/model/StripeIntent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setupFutureUsage(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->setupFutureUsage(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toPaymentSelection(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->toPaymentSelection(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(Ljava/util/List;Lkotlinx/coroutines/Deferred;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(Ljava/util/List;Lkotlinx/coroutines/Deferred;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final paymentMethodOptionsSetupFutureUsageMap(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 4

    .line 932
    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodOptions()Ljava/util/Map;

    move-result-object p0

    .line 944
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 945
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 932
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 933
    instance-of v2, v0, Ljava/util/Map;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    check-cast v0, Ljava/util/Map;

    goto :goto_0

    :cond_2
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_3

    const-string v2, "setup_future_usage"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :cond_3
    if-eqz v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_4
    return v1
.end method

.method private static final setupFutureUsage(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    .line 938
    instance-of v0, p0, Lcom/stripe/android/model/SetupIntent;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/model/SetupIntent;

    invoke-virtual {p0}, Lcom/stripe/android/model/SetupIntent;->getUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p0

    return-object p0

    .line 939
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p0

    return-object p0

    .line 937
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toPaymentSelection(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;
    .locals 6

    .line 928
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(Ljava/util/List;Lkotlinx/coroutines/Deferred;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lkotlinx/coroutines/Deferred<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;

    invoke-direct {v0, p4}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 909
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->L$0:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p2, :cond_3

    goto :goto_3

    .line 917
    :cond_3
    iput-object p0, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    instance-of p1, p4, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    if-eqz p1, :cond_5

    check-cast p4, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    goto :goto_2

    :cond_5
    move-object p4, v4

    :goto_2
    if-eqz p4, :cond_6

    invoke-virtual {p4}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object p3

    goto :goto_3

    :cond_6
    move-object p3, v4

    .line 920
    :goto_3
    move-object p1, p0

    check-cast p1, Ljava/lang/Iterable;

    .line 942
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    .line 920
    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move-object v4, p4

    :cond_8
    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v4, :cond_a

    .line 923
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p1, v4}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    return-object p1

    :cond_a
    :goto_4
    return-object p0
.end method
