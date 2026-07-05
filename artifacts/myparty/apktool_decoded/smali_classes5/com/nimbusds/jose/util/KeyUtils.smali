.class public Lcom/nimbusds/jose/util/KeyUtils;
.super Ljava/lang/Object;
.source "KeyUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static toAESKey(Ljavax/crypto/SecretKey;)Ljavax/crypto/SecretKey;
    .locals 2

    if-eqz p0, :cond_1

    .line 44
    invoke-interface {p0}, Ljavax/crypto/SecretKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AES"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Lcom/nimbusds/jose/util/KeyUtils$1;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/util/KeyUtils$1;-><init>(Ljavax/crypto/SecretKey;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method
