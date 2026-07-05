.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$DefaultImpls;
.super Ljava/lang/Object;
.source "PaymentSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;
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
.method public static getAnalyticsValue(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;)Ljava/lang/String;
    .locals 1

    .line 468
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Success;

    if-eqz v0, :cond_0

    const-string p0, "success"

    return-object p0

    .line 469
    :cond_0
    instance-of p0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;

    if-eqz p0, :cond_1

    const-string p0, "failure"

    return-object p0

    .line 467
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
