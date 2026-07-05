.class public final Lcom/nimbusds/jose/JWECryptoParts;
.super Ljava/lang/Object;
.source "JWECryptoParts.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation


# instance fields
.field private final authenticationTag:Lcom/nimbusds/jose/util/Base64URL;

.field private final cipherText:Lcom/nimbusds/jose/util/Base64URL;

.field private final encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

.field private final header:Lcom/nimbusds/jose/JWEHeader;

.field private final iv:Lcom/nimbusds/jose/util/Base64URL;


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/JWEHeader;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/nimbusds/jose/JWECryptoParts;->header:Lcom/nimbusds/jose/JWEHeader;

    .line 111
    iput-object p2, p0, Lcom/nimbusds/jose/JWECryptoParts;->encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

    .line 112
    iput-object p3, p0, Lcom/nimbusds/jose/JWECryptoParts;->iv:Lcom/nimbusds/jose/util/Base64URL;

    .line 113
    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/util/Base64URL;

    iput-object p1, p0, Lcom/nimbusds/jose/JWECryptoParts;->cipherText:Lcom/nimbusds/jose/util/Base64URL;

    .line 114
    iput-object p5, p0, Lcom/nimbusds/jose/JWECryptoParts;->authenticationTag:Lcom/nimbusds/jose/util/Base64URL;

    return-void
.end method

.method public constructor <init>(Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 85
    invoke-direct/range {v0 .. v5}, Lcom/nimbusds/jose/JWECryptoParts;-><init>(Lcom/nimbusds/jose/JWEHeader;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;Lcom/nimbusds/jose/util/Base64URL;)V

    return-void
.end method


# virtual methods
.method public getAuthenticationTag()Lcom/nimbusds/jose/util/Base64URL;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/nimbusds/jose/JWECryptoParts;->authenticationTag:Lcom/nimbusds/jose/util/Base64URL;

    return-object v0
.end method

.method public getCipherText()Lcom/nimbusds/jose/util/Base64URL;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/nimbusds/jose/JWECryptoParts;->cipherText:Lcom/nimbusds/jose/util/Base64URL;

    return-object v0
.end method

.method public getEncryptedKey()Lcom/nimbusds/jose/util/Base64URL;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/nimbusds/jose/JWECryptoParts;->encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

    return-object v0
.end method

.method public getHeader()Lcom/nimbusds/jose/JWEHeader;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/nimbusds/jose/JWECryptoParts;->header:Lcom/nimbusds/jose/JWEHeader;

    return-object v0
.end method

.method public getInitializationVector()Lcom/nimbusds/jose/util/Base64URL;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/nimbusds/jose/JWECryptoParts;->iv:Lcom/nimbusds/jose/util/Base64URL;

    return-object v0
.end method
