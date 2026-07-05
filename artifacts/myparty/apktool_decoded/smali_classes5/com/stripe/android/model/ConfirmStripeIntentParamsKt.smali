.class public final Lcom/stripe/android/model/ConfirmStripeIntentParamsKt;
.super Ljava/lang/Object;
.source "ConfirmStripeIntentParams.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\" \u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u00038@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "paymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "getPaymentMethodCode",
        "(Lcom/stripe/android/model/ConfirmStripeIntentParams;)Ljava/lang/String;",
        "payments-core_release"
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
.method public static final getPaymentMethodCode(Lcom/stripe/android/model/ConfirmStripeIntentParams;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    instance-of v0, p0, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    if-eqz v0, :cond_0

    .line 35
    check-cast p0, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCode$payments_core_release()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 37
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    if-eqz v0, :cond_1

    .line 38
    check-cast p0, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodCode$payments_core_release()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 33
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
