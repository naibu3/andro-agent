.class public final Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;
.super Ljava/lang/Object;
.source "LinearRetryDelaySupplier.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/RetryDelaySupplier;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\t\u0008\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "delay",
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
.field private static final Companion:Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;

.field private static final DEFAULT_DELAY:J = 0x3L


# instance fields
.field private final delay:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;->Companion:Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-wide/16 v0, 0x3

    .line 17
    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(J)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-wide p1, p0, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;->delay:J

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;-><init>(J)V

    return-void
.end method


# virtual methods
.method public getDelay-3nIYWDw(II)J
    .locals 0

    .line 32
    iget-wide p1, p0, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;->delay:J

    return-wide p1
.end method

.method public maxDuration-5sfh64U(I)J
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;->delay:J

    invoke-static {v0, v1, p1}, Lkotlin/time/Duration;->times-UwyO8pc(JI)J

    move-result-wide v0

    return-wide v0
.end method
