.class Lcom/nimbusds/jose/crypto/ECDSASigner$1;
.super Ljava/lang/Object;
.source "ECDSASigner.java"

# interfaces
.implements Lcom/nimbusds/jose/CompletableJWSObjectSigning;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nimbusds/jose/crypto/ECDSASigner;->sign(Lcom/nimbusds/jose/JWSHeader;[B)Lcom/nimbusds/jose/util/Base64URL;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nimbusds/jose/crypto/ECDSASigner;

.field final synthetic val$dsa:Ljava/security/Signature;

.field final synthetic val$header:Lcom/nimbusds/jose/JWSHeader;

.field final synthetic val$signingInput:[B


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/crypto/ECDSASigner;Ljava/security/Signature;[BLcom/nimbusds/jose/JWSHeader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 259
    iput-object p1, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->this$0:Lcom/nimbusds/jose/crypto/ECDSASigner;

    iput-object p2, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$dsa:Ljava/security/Signature;

    iput-object p3, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$signingInput:[B

    iput-object p4, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$header:Lcom/nimbusds/jose/JWSHeader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public complete()Lcom/nimbusds/jose/util/Base64URL;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    .line 269
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$dsa:Ljava/security/Signature;

    iget-object v1, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$signingInput:[B

    invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V

    .line 270
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$dsa:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    .line 271
    iget-object v1, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$header:Lcom/nimbusds/jose/JWSHeader;

    invoke-virtual {v1}, Lcom/nimbusds/jose/JWSHeader;->getAlgorithm()Lcom/nimbusds/jose/JWSAlgorithm;

    move-result-object v1

    invoke-static {v1}, Lcom/nimbusds/jose/crypto/impl/ECDSA;->getSignatureByteArrayLength(Lcom/nimbusds/jose/JWSAlgorithm;)I

    move-result v1

    .line 272
    invoke-static {v0, v1}, Lcom/nimbusds/jose/crypto/impl/ECDSA;->transcodeSignatureToConcat([BI)[B

    move-result-object v0

    .line 273
    invoke-static {v0}, Lcom/nimbusds/jose/util/Base64URL;->encode([B)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 276
    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/security/SignatureException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getInitializedSignature()Ljava/security/Signature;
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/ECDSASigner$1;->val$dsa:Ljava/security/Signature;

    return-object v0
.end method
