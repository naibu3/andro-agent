.class public final Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt;
.super Ljava/lang/Object;
.source "CustomerSheetUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "sortPaymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethods",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
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
.method public static synthetic $r8$lambda$IFWS0skoanp8faXIkWy35N0cNhc(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt;->sortPaymentMethods$lambda$2$lambda$0(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$bJmWr_qZx-ltMbu4-zp83oQWffE(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt;->sortPaymentMethods$lambda$2$lambda$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final sortPaymentMethods(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    .line 15
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/model/PaymentMethod;)V

    new-instance p1, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt$$ExternalSyntheticLambda1;

    invoke-direct {p1, v1}, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method private static final sortPaymentMethods$lambda$2$lambda$0(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethod;)I
    .locals 1

    .line 19
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 20
    :cond_0
    iget-object p1, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final sortPaymentMethods$lambda$2$lambda$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 15
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
