.class public Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$RefreshCompletedEvent;
.super Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;
.source "CachingJWKSetSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RefreshCompletedEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private final jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;


# direct methods
.method private constructor <init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Lcom/nimbusds/jose/jwk/JWKSet;ILcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            "ITC;)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0, p1, p3, p4}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;-><init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;ILcom/nimbusds/jose/proc/SecurityContext;)V

    .line 91
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$RefreshCompletedEvent;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    return-void
.end method

.method synthetic constructor <init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Lcom/nimbusds/jose/jwk/JWKSet;ILcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$1;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$RefreshCompletedEvent;-><init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Lcom/nimbusds/jose/jwk/JWKSet;ILcom/nimbusds/jose/proc/SecurityContext;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getContext()Lcom/nimbusds/jose/proc/SecurityContext;
    .locals 1

    .line 82
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;->getContext()Lcom/nimbusds/jose/proc/SecurityContext;

    move-result-object v0

    return-object v0
.end method

.method public getJWKSet()Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$RefreshCompletedEvent;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    return-object v0
.end method

.method public bridge synthetic getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .locals 1

    .line 82
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getThreadQueueLength()I
    .locals 1

    .line 82
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource$AbstractCachingJWKSetSourceEvent;->getThreadQueueLength()I

    move-result v0

    return v0
.end method
