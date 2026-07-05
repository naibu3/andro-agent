.class Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;
.super Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
.source "ReferenceComparisonRefreshJWKSetEvaluator.java"


# instance fields
.field private final jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/JWKSet;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 64
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 66
    :cond_2
    check-cast p1, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;

    .line 67
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    iget-object p1, p1, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public requiresRefresh(Lcom/nimbusds/jose/jwk/JWKSet;)Z
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/ReferenceComparisonRefreshJWKSetEvaluator;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
