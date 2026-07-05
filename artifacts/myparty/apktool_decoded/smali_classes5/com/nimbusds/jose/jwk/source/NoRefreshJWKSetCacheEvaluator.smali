.class Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;
.super Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
.source "NoRefreshJWKSetCacheEvaluator.java"


# static fields
.field private static final INSTANCE:Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;

    invoke-direct {v0}, Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;->INSTANCE:Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;
    .locals 1

    .line 43
    sget-object v0, Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;->INSTANCE:Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 58
    instance-of p1, p1, Lcom/nimbusds/jose/jwk/source/NoRefreshJWKSetCacheEvaluator;

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public requiresRefresh(Lcom/nimbusds/jose/jwk/JWKSet;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
