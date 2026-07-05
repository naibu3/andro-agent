.class public final Lcom/stripe/android/customersheet/CustomerSheetViewStateKt;
.super Ljava/lang/Object;
.source "CustomerSheetViewState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "isModifiable",
        "",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "cbcEligibility",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "canUpdateFullPaymentMethodDetails",
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
.method public static final isModifiable(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Z)Z
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cbcEligibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 148
    iget-object p2, p0, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz p2, :cond_0

    return v0

    .line 149
    :cond_0
    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    const/4 p2, 0x0

    if-eqz p0, :cond_1

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$Card;->networks:Lcom/stripe/android/model/PaymentMethod$Card$Networks;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethod$Card$Networks;->getAvailable()Ljava/util/Set;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 150
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    if-le p0, v0, :cond_1

    move p0, v0

    goto :goto_0

    :cond_1
    move p0, p2

    .line 153
    :goto_0
    instance-of p1, p1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    if-eqz p1, :cond_2

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return p2
.end method
