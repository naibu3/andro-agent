.class public Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;
.super Lcom/nimbusds/jose/jwk/gen/JWKGenerator;
.source "RSAKeyGenerator.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nimbusds/jose/jwk/gen/JWKGenerator<",
        "Lcom/nimbusds/jose/jwk/RSAKey;",
        ">;"
    }
.end annotation


# static fields
.field public static final MIN_KEY_SIZE_BITS:I = 0x800


# instance fields
.field private final size:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/nimbusds/jose/jwk/gen/JWKGenerator;-><init>()V

    if-nez p2, :cond_1

    const/16 p2, 0x800

    if-lt p1, p2, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The key size must be at least 2048 bits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 77
    :cond_1
    :goto_0
    iput p1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->size:I

    return-void
.end method


# virtual methods
.method public bridge synthetic generate()Lcom/nimbusds/jose/jwk/JWK;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    .line 37
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->generate()Lcom/nimbusds/jose/jwk/RSAKey;

    move-result-object v0

    return-object v0
.end method

.method public generate()Lcom/nimbusds/jose/jwk/RSAKey;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->keyStore:Ljava/security/KeyStore;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "RSA"

    if-eqz v0, :cond_0

    .line 89
    :try_start_1
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->keyStore:Ljava/security/KeyStore;

    invoke-virtual {v0}, Ljava/security/KeyStore;->getProvider()Ljava/security/Provider;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    goto :goto_0

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->provider:Ljava/security/Provider;

    if-eqz v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->provider:Ljava/security/Provider;

    invoke-static {v1, v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    goto :goto_0

    .line 93
    :cond_1
    invoke-static {v1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    .line 95
    :goto_0
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->secureRandom:Ljava/security/SecureRandom;

    if-eqz v1, :cond_2

    .line 96
    iget v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->size:I

    iget-object v2, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->secureRandom:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v2}, Ljava/security/KeyPairGenerator;->initialize(ILjava/security/SecureRandom;)V

    goto :goto_1

    .line 99
    :cond_2
    iget v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->size:I

    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(I)V
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0

    .line 105
    :goto_1
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    .line 107
    new-instance v1, Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v2

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    invoke-direct {v1, v2}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;-><init>(Ljava/security/interfaces/RSAPublicKey;)V

    .line 108
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->privateKey(Ljava/security/PrivateKey;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->use:Lcom/nimbusds/jose/jwk/KeyUse;

    .line 109
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->keyUse(Lcom/nimbusds/jose/jwk/KeyUse;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->ops:Ljava/util/Set;

    .line 110
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->keyOperations(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->alg:Lcom/nimbusds/jose/Algorithm;

    .line 111
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->algorithm(Lcom/nimbusds/jose/Algorithm;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->exp:Ljava/util/Date;

    .line 112
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->expirationTime(Ljava/util/Date;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->nbf:Ljava/util/Date;

    .line 113
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->notBeforeTime(Ljava/util/Date;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->iat:Ljava/util/Date;

    .line 114
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->issueTime(Ljava/util/Date;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->keyStore:Ljava/security/KeyStore;

    .line 115
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->keyStore(Ljava/security/KeyStore;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    move-result-object v0

    .line 117
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->x5tKid:Z

    if-eqz v1, :cond_3

    .line 118
    invoke-virtual {v0}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->keyIDFromThumbprint()Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    goto :goto_2

    .line 120
    :cond_3
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/gen/RSAKeyGenerator;->kid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->keyID(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/RSAKey$Builder;

    .line 123
    :goto_2
    invoke-virtual {v0}, Lcom/nimbusds/jose/jwk/RSAKey$Builder;->build()Lcom/nimbusds/jose/jwk/RSAKey;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 102
    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
