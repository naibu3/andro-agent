.class public final Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdaterKt;
.super Ljava/lang/Object;
.source "PaymentSelectionUpdater.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "customerAcknowledgedMandate",
        "",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "getCustomerAcknowledgedMandate",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Z",
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
.method public static final synthetic access$getCustomerAcknowledgedMandate(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdaterKt;->getCustomerAcknowledgedMandate(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Z

    move-result p0

    return p0
.end method

.method private static final getCustomerAcknowledgedMandate(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Z
    .locals 0

    .line 141
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->requiresMandate()Z

    move-result p0

    return p0
.end method
