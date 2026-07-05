.class public final Lcom/nimbusds/jose/jwk/source/JWKSetWithTimestamp;
.super Ljava/lang/Object;
.source "JWKSetWithTimestamp.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

.field private final timestamp:Ljava/util/Date;


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/JWKSet;)V
    .locals 1

    .line 50
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/nimbusds/jose/jwk/source/JWKSetWithTimestamp;-><init>(Lcom/nimbusds/jose/jwk/JWKSet;Ljava/util/Date;)V

    return-void
.end method

.method public constructor <init>(Lcom/nimbusds/jose/jwk/JWKSet;Ljava/util/Date;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/jwk/JWKSet;

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSetWithTimestamp;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    .line 62
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSetWithTimestamp;->timestamp:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public getDate()Ljava/util/Date;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetWithTimestamp;->timestamp:Ljava/util/Date;

    return-object v0
.end method

.method public getJWKSet()Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetWithTimestamp;->jwkSet:Lcom/nimbusds/jose/jwk/JWKSet;

    return-object v0
.end method
