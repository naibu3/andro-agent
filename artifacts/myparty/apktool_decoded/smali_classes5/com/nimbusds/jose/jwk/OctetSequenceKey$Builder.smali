.class public Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
.super Ljava/lang/Object;
.source "OctetSequenceKey.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/OctetSequenceKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private alg:Lcom/nimbusds/jose/Algorithm;

.field private exp:Ljava/util/Date;

.field private iat:Ljava/util/Date;

.field private final k:Lcom/nimbusds/jose/util/Base64URL;

.field private kid:Ljava/lang/String;

.field private ks:Ljava/security/KeyStore;

.field private nbf:Ljava/util/Date;

.field private ops:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyOperation;",
            ">;"
        }
    .end annotation
.end field

.field private revocation:Lcom/nimbusds/jose/jwk/KeyRevocation;

.field private use:Lcom/nimbusds/jose/jwk/KeyUse;

.field private x5c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/util/Base64;",
            ">;"
        }
    .end annotation
.end field

.field private x5t:Lcom/nimbusds/jose/util/Base64URL;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private x5t256:Lcom/nimbusds/jose/util/Base64URL;

.field private x5u:Ljava/net/URI;


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/OctetSequenceKey;)V
    .locals 1

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    invoke-static {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->access$000(Lcom/nimbusds/jose/jwk/OctetSequenceKey;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->k:Lcom/nimbusds/jose/util/Base64URL;

    .line 228
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getKeyUse()Lcom/nimbusds/jose/jwk/KeyUse;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->use:Lcom/nimbusds/jose/jwk/KeyUse;

    .line 229
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getKeyOperations()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->ops:Ljava/util/Set;

    .line 230
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getAlgorithm()Lcom/nimbusds/jose/Algorithm;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->alg:Lcom/nimbusds/jose/Algorithm;

    .line 231
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getKeyID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->kid:Ljava/lang/String;

    .line 232
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getX509CertURL()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5u:Ljava/net/URI;

    .line 233
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getX509CertThumbprint()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5t:Lcom/nimbusds/jose/util/Base64URL;

    .line 234
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getX509CertSHA256Thumbprint()Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5t256:Lcom/nimbusds/jose/util/Base64URL;

    .line 235
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getX509CertChain()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5c:Ljava/util/List;

    .line 236
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getExpirationTime()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->exp:Ljava/util/Date;

    .line 237
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getNotBeforeTime()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->nbf:Ljava/util/Date;

    .line 238
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getIssueTime()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->iat:Ljava/util/Date;

    .line 239
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getKeyRevocation()Lcom/nimbusds/jose/jwk/KeyRevocation;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->revocation:Lcom/nimbusds/jose/jwk/KeyRevocation;

    .line 240
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;->getKeyStore()Ljava/security/KeyStore;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->ks:Ljava/security/KeyStore;

    return-void
.end method

.method public constructor <init>(Lcom/nimbusds/jose/util/Base64URL;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/util/Base64URL;

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->k:Lcom/nimbusds/jose/util/Base64URL;

    return-void
.end method

.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 0

    .line 215
    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 199
    invoke-static {p1}, Lcom/nimbusds/jose/util/Base64URL;->encode([B)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;-><init>(Lcom/nimbusds/jose/util/Base64URL;)V

    .line 201
    array-length p1, p1

    if-eqz p1, :cond_0

    return-void

    .line 202
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The key must have a positive length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public algorithm(Lcom/nimbusds/jose/Algorithm;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->alg:Lcom/nimbusds/jose/Algorithm;

    return-object p0
.end method

.method public build()Lcom/nimbusds/jose/jwk/OctetSequenceKey;
    .locals 15

    .line 504
    :try_start_0
    new-instance v0, Lcom/nimbusds/jose/jwk/OctetSequenceKey;

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->k:Lcom/nimbusds/jose/util/Base64URL;

    iget-object v2, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->use:Lcom/nimbusds/jose/jwk/KeyUse;

    iget-object v3, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->ops:Ljava/util/Set;

    iget-object v4, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->alg:Lcom/nimbusds/jose/Algorithm;

    iget-object v5, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->kid:Ljava/lang/String;

    iget-object v6, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5u:Ljava/net/URI;

    iget-object v7, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5t:Lcom/nimbusds/jose/util/Base64URL;

    iget-object v8, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5t256:Lcom/nimbusds/jose/util/Base64URL;

    iget-object v9, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5c:Ljava/util/List;

    iget-object v10, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->exp:Ljava/util/Date;

    iget-object v11, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->nbf:Ljava/util/Date;

    iget-object v12, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->iat:Ljava/util/Date;

    iget-object v13, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->revocation:Lcom/nimbusds/jose/jwk/KeyRevocation;

    iget-object v14, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->ks:Ljava/security/KeyStore;

    invoke-direct/range {v0 .. v14}, Lcom/nimbusds/jose/jwk/OctetSequenceKey;-><init>(Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/jwk/KeyUse;Ljava/util/Set;Lcom/nimbusds/jose/Algorithm;Ljava/lang/String;Ljava/net/URI;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/nimbusds/jose/jwk/KeyRevocation;Ljava/security/KeyStore;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 508
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public expirationTime(Ljava/util/Date;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 428
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->exp:Ljava/util/Date;

    return-object p0
.end method

.method public issueTime(Ljava/util/Date;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->iat:Ljava/util/Date;

    return-object p0
.end method

.method public keyID(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 303
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->kid:Ljava/lang/String;

    return-object p0
.end method

.method public keyIDFromThumbprint()Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    .line 324
    const-string v0, "SHA-256"

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->keyIDFromThumbprint(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;

    move-result-object v0

    return-object v0
.end method

.method public keyIDFromThumbprint(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    .line 347
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 348
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->k:Lcom/nimbusds/jose/util/Base64URL;

    invoke-virtual {v1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "k"

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    sget-object v1, Lcom/nimbusds/jose/jwk/KeyType;->OCT:Lcom/nimbusds/jose/jwk/KeyType;

    invoke-virtual {v1}, Lcom/nimbusds/jose/jwk/KeyType;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "kty"

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    invoke-static {p1, v0}, Lcom/nimbusds/jose/jwk/ThumbprintUtils;->compute(Ljava/lang/String;Ljava/util/LinkedHashMap;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->kid:Ljava/lang/String;

    return-object p0
.end method

.method public keyOperations(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyOperation;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;"
        }
    .end annotation

    .line 271
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->ops:Ljava/util/Set;

    return-object p0
.end method

.method public keyRevocation(Lcom/nimbusds/jose/jwk/KeyRevocation;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 473
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->revocation:Lcom/nimbusds/jose/jwk/KeyRevocation;

    return-object p0
.end method

.method public keyStore(Ljava/security/KeyStore;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 488
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->ks:Ljava/security/KeyStore;

    return-object p0
.end method

.method public keyUse(Lcom/nimbusds/jose/jwk/KeyUse;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->use:Lcom/nimbusds/jose/jwk/KeyUse;

    return-object p0
.end method

.method public notBeforeTime(Ljava/util/Date;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 443
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->nbf:Ljava/util/Date;

    return-object p0
.end method

.method public x509CertChain(Ljava/util/List;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/util/Base64;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;"
        }
    .end annotation

    .line 413
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5c:Ljava/util/List;

    return-object p0
.end method

.method public x509CertSHA256Thumbprint(Lcom/nimbusds/jose/util/Base64URL;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5t256:Lcom/nimbusds/jose/util/Base64URL;

    return-object p0
.end method

.method public x509CertThumbprint(Lcom/nimbusds/jose/util/Base64URL;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 382
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5t:Lcom/nimbusds/jose/util/Base64URL;

    return-object p0
.end method

.method public x509CertURL(Ljava/net/URI;)Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/OctetSequenceKey$Builder;->x5u:Ljava/net/URI;

    return-object p0
.end method
