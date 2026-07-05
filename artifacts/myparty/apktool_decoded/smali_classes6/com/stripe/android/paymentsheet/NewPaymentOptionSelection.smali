.class public interface abstract Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;
.super Ljava/lang/Object;
.source "NewPaymentOptionSelection.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$Custom;,
        Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$External;,
        Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012J\u000c\u0010\u0006\u001a\u00060\u0007j\u0002`\u0008H&J\u0008\u0010\t\u001a\u00020\u0007H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\u000c\u001a\u0004\u0018\u00010\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0003\u0013\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;",
        "",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getPaymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "getType",
        "getPaymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodExtraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "getPaymentMethodOptionParams",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
        "New",
        "External",
        "Custom",
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$Custom;",
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$External;",
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getPaymentMethodCode()Ljava/lang/String;
.end method

.method public abstract getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
.end method

.method public abstract getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;
.end method

.method public abstract getPaymentMethodOptionParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;
.end method

.method public abstract getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
.end method

.method public abstract getType()Ljava/lang/String;
.end method
