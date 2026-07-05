.class public final Lcom/nimbusds/jose/crypto/bc/BouncyCastleFIPSProviderSingleton;
.super Ljava/lang/Object;
.source "BouncyCastleFIPSProviderSingleton.java"


# static fields
.field private static bouncyCastleFIPSProvider:Ljava/security/Provider;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Ljava/security/Provider;
    .locals 1

    .line 69
    sget-object v0, Lcom/nimbusds/jose/crypto/bc/BouncyCastleFIPSProviderSingleton;->bouncyCastleFIPSProvider:Ljava/security/Provider;

    if-nez v0, :cond_0

    .line 70
    const-string v0, "BCFIPS"

    invoke-static {v0}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v0

    sput-object v0, Lcom/nimbusds/jose/crypto/bc/BouncyCastleFIPSProviderSingleton;->bouncyCastleFIPSProvider:Ljava/security/Provider;

    .line 72
    :cond_0
    sget-object v0, Lcom/nimbusds/jose/crypto/bc/BouncyCastleFIPSProviderSingleton;->bouncyCastleFIPSProvider:Ljava/security/Provider;

    return-object v0
.end method
