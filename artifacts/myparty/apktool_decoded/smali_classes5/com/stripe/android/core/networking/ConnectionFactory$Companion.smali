.class final Lcom/stripe/android/core/networking/ConnectionFactory$Companion;
.super Ljava/lang/Object;
.source "ConnectionFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/ConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ConnectionFactory$Companion;",
        "",
        "<init>",
        "()V",
        "CONNECT_TIMEOUT",
        "",
        "READ_TIMEOUT",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$Companion;

.field private static final CONNECT_TIMEOUT:I

.field private static final READ_TIMEOUT:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->$$INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$Companion;

    .line 96
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->CONNECT_TIMEOUT:I

    .line 97
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x50

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->READ_TIMEOUT:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getCONNECT_TIMEOUT$p()I
    .locals 1

    .line 95
    sget v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->CONNECT_TIMEOUT:I

    return v0
.end method

.method public static final synthetic access$getREAD_TIMEOUT$p()I
    .locals 1

    .line 95
    sget v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->READ_TIMEOUT:I

    return v0
.end method
