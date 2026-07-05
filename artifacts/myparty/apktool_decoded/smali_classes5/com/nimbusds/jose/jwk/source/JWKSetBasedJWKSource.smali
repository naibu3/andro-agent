.class public Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;
.super Ljava/lang/Object;
.source "JWKSetBasedJWKSource.java"

# interfaces
.implements Lcom/nimbusds/jose/jwk/source/JWKSource;
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jose/jwk/source/JWKSource<",
        "TC;>;",
        "Ljava/io/Closeable;"
    }
.end annotation


# instance fields
.field private final source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;)V"
        }
    .end annotation

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    invoke-interface {v0}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->close()V

    return-void
.end method

.method public get(Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/JWKSelector;",
            "TC;)",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/jwk/JWK;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 76
    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    invoke-static {}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->noRefresh()Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;

    move-result-object v3

    invoke-interface {v2, v3, v0, v1, p2}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v2

    .line 78
    invoke-virtual {p1, v2}, Lcom/nimbusds/jose/jwk/JWKSelector;->select(Lcom/nimbusds/jose/jwk/JWKSet;)Ljava/util/List;

    move-result-object v3

    .line 79
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 80
    iget-object v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    invoke-static {v2}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->referenceComparison(Lcom/nimbusds/jose/jwk/JWKSet;)Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;

    move-result-object v2

    invoke-interface {v3, v2, v0, v1, p2}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p2

    .line 81
    invoke-virtual {p1, p2}, Lcom/nimbusds/jose/jwk/JWKSelector;->select(Lcom/nimbusds/jose/jwk/JWKSet;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v3
.end method

.method public getJWKSetSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    return-object v0
.end method
