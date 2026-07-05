.class public final Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelperKt;
.super Ljava/lang/Object;
.source "EmbeddedConfirmationHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "asEmbeddedResult",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;",
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
.method public static final synthetic access$asEmbeddedResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelperKt;->asEmbeddedResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final asEmbeddedResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;
    .locals 1

    .line 71
    instance-of v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;

    if-eqz v0, :cond_0

    .line 72
    new-instance p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;-><init>()V

    check-cast p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    return-object p0

    .line 74
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    if-eqz v0, :cond_1

    .line 75
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    return-object v0

    .line 77
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;

    if-eqz p0, :cond_2

    .line 78
    new-instance p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;-><init>()V

    check-cast p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    return-object p0

    .line 70
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
