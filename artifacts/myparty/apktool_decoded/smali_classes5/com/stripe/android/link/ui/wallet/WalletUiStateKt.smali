.class public final Lcom/stripe/android/link/ui/wallet/WalletUiStateKt;
.super Ljava/lang/Object;
.source "WalletUiState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "makeMandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "isSettingUp",
        "",
        "merchantName",
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
.method public static final synthetic access$makeMandateText(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletUiStateKt;->makeMandateText(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final makeMandateText(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    .line 115
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 116
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_wallet_bank_account_terms:I

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 118
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-nez v0, :cond_2

    .line 119
    instance-of p0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-eqz p0, :cond_1

    goto :goto_0

    .line 114
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 121
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_card_mandate:I

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v2
.end method
