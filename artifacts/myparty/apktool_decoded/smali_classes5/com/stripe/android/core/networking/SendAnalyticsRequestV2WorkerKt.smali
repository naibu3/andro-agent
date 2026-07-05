.class public final Lcom/stripe/android/core/networking/SendAnalyticsRequestV2WorkerKt;
.super Ljava/lang/Object;
.source "SendAnalyticsRequestV2Worker.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "DataKey",
        "",
        "MaxAttempts",
        "",
        "shouldRetry",
        "",
        "",
        "getShouldRetry",
        "(Ljava/lang/Throwable;)Z",
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
.field private static final DataKey:Ljava/lang/String; = "data"

.field private static final MaxAttempts:I = 0x5


# direct methods
.method public static final synthetic access$getShouldRetry(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2WorkerKt;->getShouldRetry(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method private static final getShouldRetry(Ljava/lang/Throwable;)Z
    .locals 0

    .line 80
    instance-of p0, p0, Lcom/stripe/android/core/exception/InvalidRequestException;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
