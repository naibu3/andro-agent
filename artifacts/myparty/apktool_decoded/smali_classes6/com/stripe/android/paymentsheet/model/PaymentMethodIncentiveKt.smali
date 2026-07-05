.class public final Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentiveKt;
.super Ljava/lang/Object;
.source "PaymentMethodIncentive.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toPaymentMethodIncentive",
        "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
        "Lcom/stripe/android/model/LinkConsumerIncentive;",
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
.method public static final toPaymentMethodIncentive(Lcom/stripe/android/model/LinkConsumerIncentive;)Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lcom/stripe/android/model/LinkConsumerIncentive;->getIncentiveDisplayText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 24
    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    .line 25
    invoke-virtual {p0}, Lcom/stripe/android/model/LinkConsumerIncentive;->getIncentiveParams()Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;->getPaymentMethod()Ljava/lang/String;

    move-result-object p0

    .line 24
    invoke-direct {v1, p0, v0}, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
