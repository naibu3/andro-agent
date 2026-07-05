.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;
.super Ljava/lang/Object;
.source "PaymentOptionsStateFactory.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentOptionsStateFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n295#2,2:108\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt\n*L\n79#1:108,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0001H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "findSelectedItem",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "toPaymentSelection",
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
.method public static final synthetic access$findSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->findSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object p0

    return-object p0
.end method

.method private static final findSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ")",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;"
        }
    .end annotation

    .line 79
    check-cast p0, Ljava/lang/Iterable;

    .line 108
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    .line 81
    instance-of v2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz v2, :cond_1

    instance-of v1, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    goto :goto_1

    .line 82
    :cond_1
    instance-of v2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v2, :cond_2

    instance-of v1, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    goto :goto_1

    .line 83
    :cond_2
    instance-of v2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 85
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v2, :cond_5

    .line 86
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    .line 91
    :cond_3
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-nez v1, :cond_5

    .line 92
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-nez v1, :cond_5

    .line 93
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-nez v1, :cond_5

    .line 94
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-eqz v1, :cond_4

    goto :goto_0

    .line 80
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    move v1, v3

    :goto_1
    if-eqz v1, :cond_0

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    .line 109
    :goto_2
    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    return-object v0
.end method

.method public static final toPaymentSelection(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 102
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object p0

    .line 103
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;-><init>(Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v1

    .line 104
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v0, :cond_3

    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v1

    .line 100
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
