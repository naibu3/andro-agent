.class public final Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;
.super Ljava/lang/Object;
.source "ExponentialBackoffRetryDelaySupplier.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/RetryDelaySupplier;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\t\u0008\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "incrementDuration",
        "Lkotlin/time/Duration;",
        "<init>",
        "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "()V",
        "J",
        "maxDuration",
        "maxRetries",
        "",
        "maxDuration-5sfh64U",
        "(I)J",
        "getDelay",
        "remainingRetries",
        "getDelay-3nIYWDw",
        "(II)J",
        "Companion",
        "stripe-core_release"
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
.field private static final Companion:Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;

.field private static final DEFAULT_INCREMENT_SECONDS:J = 0x2L


# instance fields
.field private final incrementDuration:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;->Companion:Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-wide/16 v0, 0x2

    .line 19
    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(J)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p1, p0, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;->incrementDuration:J

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;-><init>(J)V

    return-void
.end method


# virtual methods
.method public getDelay-3nIYWDw(II)J
    .locals 2

    const/4 v0, 0x1

    .line 46
    invoke-static {p2, v0, p1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p2

    sub-int/2addr p1, p2

    add-int/2addr p1, v0

    .line 48
    iget-wide v0, p0, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;->incrementDuration:J

    .line 49
    sget-object p2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    int-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    .line 51
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, v0}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide p1

    return-wide p1
.end method

.method public maxDuration-5sfh64U(I)J
    .locals 5

    .line 22
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x0

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    move v2, p1

    :goto_0
    if-lez v2, :cond_0

    .line 24
    invoke-virtual {p0, p1, v2}, Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;->getDelay-3nIYWDw(II)J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lkotlin/time/Duration;->plus-LRDsOJo(JJ)J

    move-result-wide v0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method
