.class public Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;
.super Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;
.source "OutageTolerantJWKSetSource.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource$OutageEvent;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private final eventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JLcom/nimbusds/jose/util/events/EventListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;J",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource<",
            "TC;>;TC;>;)V"
        }
    .end annotation

    .line 104
    invoke-direct {p0, p1, p2, p3}, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;J)V

    .line 105
    iput-object p4, p0, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-void
.end method


# virtual methods
.method public getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 8
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

    .line 113
    :try_start_0
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    .line 114
    invoke-virtual {p0, v0, p2, p3}, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;->cacheJWKSet(Lcom/nimbusds/jose/jwk/JWKSet;J)Lcom/nimbusds/jose/util/cache/CachedObject;
    :try_end_0
    .catch Lcom/nimbusds/jose/jwk/source/JWKSetUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 119
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;->getCachedJWKSet()Lcom/nimbusds/jose/util/cache/CachedObject;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 120
    invoke-virtual {v0, p2, p3}, Lcom/nimbusds/jose/util/cache/CachedObject;->isValid(J)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 121
    invoke-virtual {v0}, Lcom/nimbusds/jose/util/cache/CachedObject;->getExpirationTime()J

    move-result-wide v1

    sub-long v4, v1, p2

    .line 122
    iget-object p2, p0, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    if-eqz p2, :cond_0

    .line 123
    new-instance v1, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource$OutageEvent;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource$OutageEvent;-><init>(Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;Ljava/lang/Exception;JLcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource$1;)V

    invoke-interface {p2, v1}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    .line 125
    :cond_0
    invoke-virtual {v0}, Lcom/nimbusds/jose/util/cache/CachedObject;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/nimbusds/jose/jwk/JWKSet;

    .line 130
    new-instance p3, Lcom/nimbusds/jose/jwk/JWKSet;

    invoke-virtual {p2}, Lcom/nimbusds/jose/jwk/JWKSet;->getKeys()Ljava/util/List;

    move-result-object p2

    invoke-direct {p3, p2}, Lcom/nimbusds/jose/jwk/JWKSet;-><init>(Ljava/util/List;)V

    .line 131
    invoke-virtual {p1, p3}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->requiresRefresh(Lcom/nimbusds/jose/jwk/JWKSet;)Z

    move-result p1

    if-nez p1, :cond_1

    return-object p3

    .line 139
    :cond_1
    throw v3
.end method

.method public bridge synthetic getTimeToLive()J
    .locals 2

    .line 43
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/AbstractCachingJWKSetSource;->getTimeToLive()J

    move-result-wide v0

    return-wide v0
.end method
