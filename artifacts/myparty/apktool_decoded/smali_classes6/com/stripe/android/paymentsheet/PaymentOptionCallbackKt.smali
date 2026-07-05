.class public final Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt;
.super Ljava/lang/Object;
.source "PaymentOptionCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;",
        "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
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
.method public static synthetic $r8$lambda$DX8jquM79ZLcpo1Kk-LDxChHIXg(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt;->toResultCallback$lambda$0(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V

    return-void
.end method

.method public static final toResultCallback(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V

    return-object v0
.end method

.method private static final toResultCallback$lambda$0(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentOptionResult;->getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionCallback;->onPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V

    return-void
.end method
