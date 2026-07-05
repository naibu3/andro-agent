.class public abstract Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;
.super Ljava/lang/Throwable;
.source "PaymentSheetConfirmationError.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$ExternalPaymentMethod;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$InvalidState;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$Stripe;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0004\n\u000b\u000c\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;",
        "",
        "<init>",
        "()V",
        "analyticsValue",
        "",
        "getAnalyticsValue",
        "()Ljava/lang/String;",
        "errorCode",
        "getErrorCode",
        "Stripe",
        "GooglePay",
        "ExternalPaymentMethod",
        "InvalidState",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$ExternalPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$InvalidState;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$Stripe;",
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


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAnalyticsValue()Ljava/lang/String;
.end method

.method public abstract getErrorCode()Ljava/lang/String;
.end method
