.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$DefaultImpls;
.super Ljava/lang/Object;
.source "PaymentMethodSaveConsentBehavior.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;
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
.method public static allowRedisplay(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;
    .locals 1

    const-string v0, "customerRequestedSave"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 39
    invoke-static {p0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$DefaultImpls;->allowRedisplayForSetupIntent(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object p0

    return-object p0

    .line 41
    :cond_0
    invoke-static {p0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$DefaultImpls;->allowRedisplayForPaymentIntent(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object p0

    return-object p0
.end method

.method private static allowRedisplayForPaymentIntent(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;
    .locals 1

    .line 65
    instance-of v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Legacy;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->UNSPECIFIED:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 66
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->UNSPECIFIED:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 67
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Enabled;

    if-eqz p0, :cond_3

    .line 68
    sget-object p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    if-ne p1, p0, :cond_2

    .line 69
    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->ALWAYS:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 71
    :cond_2
    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->UNSPECIFIED:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 64
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static allowRedisplayForSetupIntent(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;
    .locals 1

    .line 49
    instance-of v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Legacy;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->UNSPECIFIED:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 50
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;

    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;->getOverrideAllowRedisplay()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object p0

    if-nez p0, :cond_1

    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->LIMITED:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    :cond_1
    return-object p0

    .line 51
    :cond_2
    instance-of p0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Enabled;

    if-eqz p0, :cond_4

    .line 52
    sget-object p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    if-ne p1, p0, :cond_3

    .line 53
    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->ALWAYS:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 55
    :cond_3
    sget-object p0, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->LIMITED:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object p0

    .line 48
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
