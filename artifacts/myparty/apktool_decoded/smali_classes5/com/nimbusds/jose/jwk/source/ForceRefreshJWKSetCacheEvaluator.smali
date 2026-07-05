.class Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;
.super Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;
.source "ForceRefreshJWKSetCacheEvaluator.java"


# static fields
.field private static final INSTANCE:Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;

    invoke-direct {v0}, Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;->INSTANCE:Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;
    .locals 1

    .line 43
    sget-object v0, Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;->INSTANCE:Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 58
    instance-of p1, p1, Lcom/nimbusds/jose/jwk/source/ForceRefreshJWKSetCacheEvaluator;

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public requiresRefresh(Lcom/nimbusds/jose/jwk/JWKSet;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
