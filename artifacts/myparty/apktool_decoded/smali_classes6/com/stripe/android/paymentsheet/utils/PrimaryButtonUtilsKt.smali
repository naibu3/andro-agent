.class public final Lcom/stripe/android/paymentsheet/utils/PrimaryButtonUtilsKt;
.super Ljava/lang/Object;
.source "PrimaryButtonUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0012\u0010\u0008\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u00a8\u0006\t"
    }
    d2 = {
        "buyButtonLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "amount",
        "Lcom/stripe/android/ui/core/Amount;",
        "primaryButtonLabel",
        "",
        "isForPaymentIntent",
        "",
        "continueButtonLabel",
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
.method public static final buyButtonLabel(Lcom/stripe/android/ui/core/Amount;Ljava/lang/String;Z)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    if-eqz p1, :cond_1

    .line 14
    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    if-eqz p2, :cond_4

    .line 16
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_pay_button_label:I

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    if-eqz p0, :cond_3

    .line 17
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/Amount;->buildPayButtonLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    return-object p1

    .line 19
    :cond_4
    sget p0, Lcom/stripe/android/ui/core/R$string;->stripe_setup_button_label:I

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static final continueButtonLabel(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    if-eqz p0, :cond_1

    .line 25
    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    .line 26
    :cond_1
    :goto_0
    sget p0, Lcom/stripe/android/ui/core/R$string;->stripe_continue_button_label:I

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method
