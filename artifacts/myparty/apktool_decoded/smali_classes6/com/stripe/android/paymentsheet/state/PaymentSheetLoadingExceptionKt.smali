.class public final Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingExceptionKt;
.super Ljava/lang/Object;
.source "PaymentSheetLoadingException.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "asPaymentSheetLoadingException",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;",
        "",
        "getAsPaymentSheetLoadingException",
        "(Ljava/lang/Throwable;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;",
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
.method public static final getAsPaymentSheetLoadingException(Ljava/lang/Throwable;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$Unknown;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$Unknown;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    :cond_1
    return-object v0
.end method
