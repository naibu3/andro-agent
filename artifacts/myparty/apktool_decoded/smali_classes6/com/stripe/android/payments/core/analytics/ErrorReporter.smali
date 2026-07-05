.class public interface abstract Lcom/stripe/android/payments/core/analytics/ErrorReporter;
.super Ljava/lang/Object;
.source "ErrorReporter.kt"

# interfaces
.implements Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;,
        Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;,
        Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;,
        Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;,
        Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;,
        Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008g\u0018\u0000 \r2\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0007H\u0016\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;",
        "report",
        "",
        "errorEvent",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "additionalNonPiiParams",
        "",
        "",
        "reportFraudDetectionError",
        "error",
        "Companion",
        "ErrorEvent",
        "ExpectedErrorEvent",
        "UnexpectedErrorEvent",
        "SuccessEvent",
        "payments-core_release"
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
.field public static final Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->$$INSTANCE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    return-void
.end method


# virtual methods
.method public abstract report(Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;",
            "Lcom/stripe/android/core/exception/StripeException;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract reportFraudDetectionError(Lcom/stripe/android/core/exception/StripeException;)V
.end method
