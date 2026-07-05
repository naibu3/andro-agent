.class public final Lcom/nimbusds/jose/JWEObjectJSON$Recipient;
.super Ljava/lang/Object;
.source "JWEObjectJSON.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/JWEObjectJSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Recipient"
.end annotation


# instance fields
.field private final encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

.field private final unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    .line 81
    iput-object p2, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

    return-void
.end method

.method public static parse(Ljava/util/Map;)Lcom/nimbusds/jose/JWEObjectJSON$Recipient;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/nimbusds/jose/JWEObjectJSON$Recipient;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 139
    const-string v0, "header"

    invoke-static {p0, v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getJSONObject(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/UnprotectedHeader;->parse(Ljava/util/Map;)Lcom/nimbusds/jose/UnprotectedHeader;

    move-result-object v0

    .line 140
    const-string v1, "encrypted_key"

    invoke-static {p0, v1}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getBase64URL(Ljava/util/Map;Ljava/lang/String;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object p0

    .line 142
    new-instance v1, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;

    invoke-direct {v1, v0, p0}, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;-><init>(Lcom/nimbusds/jose/UnprotectedHeader;Lcom/nimbusds/jose/util/Base64URL;)V

    return-object v1
.end method


# virtual methods
.method public getEncryptedKey()Lcom/nimbusds/jose/util/Base64URL;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

    return-object v0
.end method

.method public getUnprotectedHeader()Lcom/nimbusds/jose/UnprotectedHeader;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    return-object v0
.end method

.method public toJSONObject()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 113
    invoke-static {}, Lcom/nimbusds/jose/util/JSONObjectUtils;->newJSONObject()Ljava/util/Map;

    move-result-object v0

    .line 115
    iget-object v1, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/nimbusds/jose/UnprotectedHeader;->getIncludedParams()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 116
    iget-object v1, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->unprotectedHeader:Lcom/nimbusds/jose/UnprotectedHeader;

    invoke-virtual {v1}, Lcom/nimbusds/jose/UnprotectedHeader;->toJSONObject()Ljava/util/Map;

    move-result-object v1

    const-string v2, "header"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    :cond_0
    iget-object v1, p0, Lcom/nimbusds/jose/JWEObjectJSON$Recipient;->encryptedKey:Lcom/nimbusds/jose/util/Base64URL;

    if-eqz v1, :cond_1

    .line 119
    const-string v2, "encrypted_key"

    invoke-virtual {v1}, Lcom/nimbusds/jose/util/Base64URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method
