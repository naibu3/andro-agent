.class public final Lcom/stripe/android/link/LinkLaunchMode$DefaultImpls;
.super Ljava/lang/Object;
.source "LinkLaunchMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkLaunchMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static selectedPayment(Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 2

    .line 57
    instance-of v0, p0, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 58
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/link/LinkLaunchMode$Full;

    if-eqz v0, :cond_1

    return-object v1

    .line 59
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p0

    return-object p0

    .line 60
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;->getSelectedPayment()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p0

    return-object p0

    .line 56
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
