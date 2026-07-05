.class public Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;
.super Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;
.source "RateLimitedJWKSetSource.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$RateLimitedEvent;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private counter:I

.field private final eventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field

.field private final minTimeInterval:J

.field private nextOpeningTime:J


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JLcom/nimbusds/jose/util/events/EventListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;J",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource<",
            "TC;>;TC;>;)V"
        }
    .end annotation

    .line 75
    invoke-direct {p0, p1}, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    const-wide/16 v0, -0x1

    .line 57
    iput-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->nextOpeningTime:J

    const/4 p1, 0x0

    .line 58
    iput p1, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->counter:I

    .line 76
    iput-wide p2, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->minTimeInterval:J

    .line 77
    iput-object p4, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-void
.end method


# virtual methods
.method public getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;",
            "JTC;)",
            "Lcom/nimbusds/jose/jwk/JWKSet;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 89
    monitor-enter p0

    .line 90
    :try_start_0
    iget-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->nextOpeningTime:J

    cmp-long v0, v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gtz v0, :cond_0

    .line 91
    iget-wide v3, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->minTimeInterval:J

    add-long/2addr v3, p2

    iput-wide v3, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->nextOpeningTime:J

    .line 92
    iput v2, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->counter:I

    goto :goto_0

    .line 95
    :cond_0
    iget v0, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->counter:I

    if-gtz v0, :cond_1

    move v1, v2

    :cond_1
    if-nez v1, :cond_2

    sub-int/2addr v0, v2

    .line 97
    iput v0, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->counter:I

    .line 100
    :cond_2
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    .line 102
    iget-object p1, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    if-eqz p1, :cond_3

    .line 103
    new-instance p2, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$RateLimitedEvent;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p4, p3}, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$RateLimitedEvent;-><init>(Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$1;)V

    invoke-interface {p1, p2}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    .line 105
    :cond_3
    new-instance p1, Lcom/nimbusds/jose/jwk/source/RateLimitReachedException;

    invoke-direct {p1}, Lcom/nimbusds/jose/jwk/source/RateLimitReachedException;-><init>()V

    throw p1

    .line 107
    :cond_4
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 100
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getMinTimeInterval()J
    .locals 2

    .line 119
    iget-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;->minTimeInterval:J

    return-wide v0
.end method
