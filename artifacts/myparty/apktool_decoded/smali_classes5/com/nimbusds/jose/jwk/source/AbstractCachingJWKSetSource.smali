.class abstract Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;
.super Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;
.source "AbstractCachingJWKSetSource.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
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
.field private volatile cachedJWKSet:Lcom/nimbusds/jose/util/cache/CachedObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;"
        }
    .end annotation
.end field

.field private final timeToLive:J


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;J)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1}, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    .line 50
    iput-wide p2, p0, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->timeToLive:J

    return-void
.end method


# virtual methods
.method cacheJWKSet(Lcom/nimbusds/jose/jwk/JWKSet;J)Lcom/nimbusds/jose/util/cache/CachedObject;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            "J)",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;"
        }
    .end annotation

    .line 111
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->currentTimeMillis()J

    move-result-wide v2

    .line 112
    new-instance v0, Lcom/nimbusds/jose/util/cache/CachedObject;

    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->getTimeToLive()J

    move-result-wide v4

    invoke-static {p2, p3, v4, v5}, Lcom/nimbusds/jose/util/cache/CachedObject;->computeExpirationTime(JJ)J

    move-result-wide v4

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/nimbusds/jose/util/cache/CachedObject;-><init>(Ljava/lang/Object;JJ)V

    .line 113
    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->setCachedJWKSet(Lcom/nimbusds/jose/util/cache/CachedObject;)V

    return-object v0
.end method

.method currentTimeMillis()J
    .locals 2

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method getCachedJWKSet()Lcom/nimbusds/jose/util/cache/CachedObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->cachedJWKSet:Lcom/nimbusds/jose/util/cache/CachedObject;

    return-object v0
.end method

.method getCachedJWKSetIfValid(J)Lcom/nimbusds/jose/util/cache/CachedObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;"
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->getCachedJWKSet()Lcom/nimbusds/jose/util/cache/CachedObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {v0, p1, p2}, Lcom/nimbusds/jose/util/cache/CachedObject;->isValid(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getTimeToLive()J
    .locals 2

    .line 97
    iget-wide v0, p0, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->timeToLive:J

    return-wide v0
.end method

.method setCachedJWKSet(Lcom/nimbusds/jose/util/cache/CachedObject;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;)V"
        }
    .end annotation

    .line 70
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->cachedJWKSet:Lcom/nimbusds/jose/util/cache/CachedObject;

    return-void
.end method
