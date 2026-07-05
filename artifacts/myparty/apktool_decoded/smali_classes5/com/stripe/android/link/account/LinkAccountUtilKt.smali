.class public final Lcom/stripe/android/link/account/LinkAccountUtilKt;
.super Ljava/lang/Object;
.source "LinkAccountUtil.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountUtil.kt\ncom/stripe/android/link/account/LinkAccountUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n295#2,2:23\n*S KotlinDebug\n*F\n+ 1 LinkAccountUtil.kt\ncom/stripe/android/link/account/LinkAccountUtilKt\n*L\n19#1:23,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0008H\u0000\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002H\u0080@\u00a2\u0006\u0002\u0010\u000b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u000c"
    }
    d2 = {
        "linkAccountUpdate",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "getLinkAccountUpdate",
        "(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;",
        "updateLinkAccount",
        "",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "loadDefaultShippingAddress",
        "Lcom/stripe/android/model/ConsumerShippingAddress;",
        "(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public static final getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/LinkAccountUpdate;

    return-object p0
.end method

.method public static final loadDefaultShippingAddress(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerShippingAddress;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 16
    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    invoke-interface {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->getCachedShippingAddresses()Lcom/stripe/android/model/ConsumerShippingAddresses;

    move-result-object p1

    if-nez p1, :cond_5

    iput-object p0, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountUtilKt$loadDefaultShippingAddress$1;->label:I

    invoke-interface {p0, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->listShippingAddresses-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object p1, v4

    :cond_4
    check-cast p1, Lcom/stripe/android/model/ConsumerShippingAddresses;

    if-nez p1, :cond_5

    return-object v4

    .line 18
    :cond_5
    invoke-interface {p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager;->setCachedShippingAddresses(Lcom/stripe/android/model/ConsumerShippingAddresses;)V

    .line 19
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerShippingAddresses;->getAddresses()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/model/ConsumerShippingAddress;

    .line 19
    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerShippingAddress;->isDefault()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_7
    move-object v1, v4

    :goto_2
    check-cast v1, Lcom/stripe/android/model/ConsumerShippingAddress;

    if-nez v1, :cond_8

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerShippingAddresses;->getAddresses()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/ConsumerShippingAddress;

    :cond_8
    move-object v5, v1

    if-eqz v5, :cond_a

    .line 20
    invoke-interface {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lcom/stripe/android/link/model/LinkAccount;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object v4

    :cond_9
    move-object v9, v4

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lcom/stripe/android/model/ConsumerShippingAddress;->copy$default(Lcom/stripe/android/model/ConsumerShippingAddress;Ljava/lang/String;ZLcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerShippingAddress;

    move-result-object p0

    return-object p0

    :cond_a
    return-object v4
.end method

.method public static final updateLinkAccount(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/account/LinkAccountHolder;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    instance-of v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p1, p0}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    return-void

    .line 12
    :cond_0
    sget-object p1, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    .line 10
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
