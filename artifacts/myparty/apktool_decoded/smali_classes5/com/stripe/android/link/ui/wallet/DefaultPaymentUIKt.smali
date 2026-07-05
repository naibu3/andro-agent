.class public final Lcom/stripe/android/link/ui/wallet/DefaultPaymentUIKt;
.super Ljava/lang/Object;
.source "DefaultPaymentUI.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "toDefaultPaymentUI",
        "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "enableDefaultValuesInECE",
        "",
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
.method public static final toDefaultPaymentUI(Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getLast4()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getDefaultPaymentType()Ljava/lang/String;

    move-result-object p1

    .line 42
    const-string v1, "CARD"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 43
    sget-object p1, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getDefaultCardBrand()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getCardBrandIconForVerticalMode(Lcom/stripe/android/model/CardBrand;)I

    move-result p1

    .line 44
    new-instance v1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;-><init>(I)V

    check-cast v1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;

    goto :goto_0

    .line 46
    :cond_2
    const-string v1, "BANK_ACCOUNT"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 49
    new-instance p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;

    invoke-direct {p1, v0}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    return-object v0

    .line 57
    :cond_4
    new-instance p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    .line 59
    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getLast4()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 57
    invoke-direct {p1, v1, p0}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;-><init>(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;Ljava/lang/String;)V

    return-object p1

    .line 59
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
