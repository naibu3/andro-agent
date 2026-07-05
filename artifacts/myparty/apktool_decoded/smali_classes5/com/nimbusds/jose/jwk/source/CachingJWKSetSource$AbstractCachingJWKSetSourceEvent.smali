.class Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;
.super Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;
.source "CachingJWKSetSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AbstractCachingJWKSetSourceEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent<",
        "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
        "TC;>;TC;>;"
    }
.end annotation


# instance fields
.field private final threadQueueLength:I


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;ILcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;ITC;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p3}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    .line 53
    iput p2, p0, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;->threadQueueLength:I

    return-void
.end method


# virtual methods
.method public getThreadQueueLength()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;->threadQueueLength:I

    return v0
.end method
