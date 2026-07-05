.class public final Lcom/stripe/android/paymentsheet/PaymentSheetViewModelKt;
.super Ljava/lang/Object;
.source "PaymentSheetViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "isProcessingPayment",
        "",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z",
        "contentVisible",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;",
        "getContentVisible",
        "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z",
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
.method public static final synthetic access$getContentVisible(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelKt;->getContentVisible(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isProcessingPayment(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelKt;->isProcessingPayment(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z

    move-result p0

    return p0
.end method

.method private static final getContentVisible(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z
    .locals 4

    .line 758
    instance-of v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;

    const/4 v1, 0x1

    if-nez v0, :cond_5

    .line 759
    instance-of v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 762
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    if-eqz v0, :cond_4

    .line 767
    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    .line 763
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;->getOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v0

    .line 766
    instance-of v2, v0, Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    return v3

    .line 767
    :cond_1
    instance-of v0, v0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;->getOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;->getLinkExpressMode()Lcom/stripe/android/link/LinkExpressMode;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/link/LinkExpressMode;->DISABLED:Lcom/stripe/android/link/LinkExpressMode;

    if-eq p0, v0, :cond_2

    return v1

    :cond_2
    return v3

    :cond_3
    return v1

    .line 757
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    return v1
.end method

.method private static final isProcessingPayment(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z
    .locals 1

    .line 749
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 750
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    return p0

    .line 751
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_2

    .line 752
    check-cast p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getMode()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    move-result-object p0

    instance-of p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    return p0

    .line 748
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
