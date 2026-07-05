.class public final Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;
.super Ljava/lang/Object;
.source "ConfirmStripeIntentParamsFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00082\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0007*\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "mandateData",
        "Lcom/stripe/android/model/MandateDataParams;",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "paymentMethodType",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "canSetupFutureUsage",
        "",
        "Lcom/stripe/android/model/PaymentIntent;",
        "paymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "extractSetAsDefaultPaymentMethodFromExtraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;",
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
.method public static final synthetic access$extractSetAsDefaultPaymentMethodFromExtraParams(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;->extractSetAsDefaultPaymentMethodFromExtraParams(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mandateData(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/MandateDataParams;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;->mandateData(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/MandateDataParams;

    move-result-object p0

    return-object p0
.end method

.method private static final canSetupFutureUsage(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)Z
    .locals 0

    .line 154
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/PaymentIntent;->isSetupFutureUsageSet(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final extractSetAsDefaultPaymentMethodFromExtraParams(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;
    .locals 1

    .line 159
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodExtraParams$Card;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/model/PaymentMethodExtraParams$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodExtraParams$Card;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 160
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 161
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final mandateData(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/MandateDataParams;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 142
    instance-of v1, p0, Lcom/stripe/android/model/PaymentIntent;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 143
    check-cast p0, Lcom/stripe/android/model/PaymentIntent;

    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/stripe/android/ConfirmStripeIntentParamsFactoryKt;->canSetupFutureUsage(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod$Type;->getRequiresMandateForPaymentIntent$payments_core_release()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 144
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/model/SetupIntent;

    if-eqz p0, :cond_4

    .line 147
    :cond_2
    :goto_0
    new-instance p0, Lcom/stripe/android/model/MandateDataParams;

    sget-object v1, Lcom/stripe/android/model/MandateDataParams$Type$Online;->Companion:Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;->getDEFAULT()Lcom/stripe/android/model/MandateDataParams$Type$Online;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/MandateDataParams$Type;

    invoke-direct {p0, v1}, Lcom/stripe/android/model/MandateDataParams;-><init>(Lcom/stripe/android/model/MandateDataParams$Type;)V

    if-eqz v2, :cond_3

    .line 148
    iget-boolean p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->requiresMandate:Z

    if-eqz p1, :cond_3

    return-object p0

    :cond_3
    return-object v0

    .line 141
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    return-object v0
.end method
