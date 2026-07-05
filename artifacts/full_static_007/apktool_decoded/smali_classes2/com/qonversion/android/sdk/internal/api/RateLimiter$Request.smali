.class final Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;
.super Ljava/lang/Object;
.source "RateLimiter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/api/RateLimiter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Request"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;",
        "",
        "hash",
        "",
        "timestamp",
        "",
        "(IJ)V",
        "getHash",
        "()I",
        "getTimestamp",
        "()J",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final hash:I

.field private final timestamp:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput p1, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;->hash:I

    .line 51
    iput-wide p2, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;->timestamp:J

    return-void
.end method


# virtual methods
.method public final getHash()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;->hash:I

    return v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;->timestamp:J

    return-wide v0
.end method
