.class public Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$RateLimitedEvent;
.super Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;
.source "RateLimitedJWKSetSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RateLimitedEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent<",
        "Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource<",
        "TC;>;TC;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource<",
            "TC;>;TC;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$1;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource$RateLimitedEvent;-><init>(Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getContext()Lcom/nimbusds/jose/proc/SecurityContext;
    .locals 1

    .line 48
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->getContext()Lcom/nimbusds/jose/proc/SecurityContext;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .locals 1

    .line 48
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    return-object v0
.end method
