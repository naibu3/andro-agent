.class public abstract Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
.super Ljava/lang/Object;
.source "JWKSetCacheRefreshEvaluator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static forceRefresh()Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
    .locals 1

    .line 22
    invoke-static {}, Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;->getInstance()Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;

    move-result-object v0

    return-object v0
.end method

.method public static noRefresh()Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
    .locals 1

    .line 32
    invoke-static {}, Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;->getInstance()Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;

    move-result-object v0

    return-object v0
.end method

.method public static referenceComparison(Lcom/nimbusds/jose/jwk/JWKSet;)Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
    .locals 1

    .line 44
    new-instance v0, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;-><init>(Lcom/nimbusds/jose/jwk/JWKSet;)V

    return-object v0
.end method


# virtual methods
.method public abstract requiresRefresh(Lcom/nimbusds/jose/jwk/JWKSet;)Z
.end method
