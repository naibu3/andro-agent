.class public final Lcom/stripe/android/core/exception/ExceptionUtilsKt;
.super Ljava/lang/Object;
.source "ExceptionUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "IO_EXCEPTION_ANALYTICS_MESSAGE",
        "",
        "DEFAULT_ANALYTICS_MESSAGE",
        "safeAnalyticsMessage",
        "",
        "getSafeAnalyticsMessage",
        "(Ljava/lang/Throwable;)Ljava/lang/String;",
        "stripe-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DEFAULT_ANALYTICS_MESSAGE:Ljava/lang/String; = "unknown"

.field private static final IO_EXCEPTION_ANALYTICS_MESSAGE:Ljava/lang/String; = "ioException"


# direct methods
.method public static final getSafeAnalyticsMessage(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {p0}, Lcom/stripe/android/core/exception/StripeException;->analyticsValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 15
    :cond_0
    instance-of p0, p0, Ljava/io/IOException;

    if-eqz p0, :cond_1

    const-string p0, "ioException"

    return-object p0

    .line 16
    :cond_1
    const-string p0, "unknown"

    return-object p0
.end method
