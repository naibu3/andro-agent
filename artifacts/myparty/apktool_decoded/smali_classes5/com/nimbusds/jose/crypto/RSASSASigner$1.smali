.class Lcom/nimbusds/jose/crypto/RSASSASigner$1;
.super Ljava/lang/Object;
.source "RSASSASigner.java"

# interfaces
.implements Lcom/nimbusds/jose/CompletableJWSObjectSigning;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nimbusds/jose/crypto/RSASSASigner;->sign(Lcom/nimbusds/jose/JWSHeader;[B)Lcom/nimbusds/jose/util/Base64URL;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nimbusds/jose/crypto/RSASSASigner;

.field final synthetic val$signer:Ljava/security/Signature;

.field final synthetic val$signingInput:[B


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/crypto/RSASSASigner;Ljava/security/Signature;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 263
    iput-object p1, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->this$0:Lcom/nimbusds/jose/crypto/RSASSASigner;

    iput-object p2, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->val$signer:Ljava/security/Signature;

    iput-object p3, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->val$signingInput:[B

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

    .line 272
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->this$0:Lcom/nimbusds/jose/crypto/RSASSASigner;

    iget-object v1, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->val$signingInput:[B

    iget-object v2, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->val$signer:Ljava/security/Signature;

    invoke-static {v0, v1, v2}, Lcom/nimbusds/jose/crypto/RSASSASigner;->access$000(Lcom/nimbusds/jose/crypto/RSASSASigner;[BLjava/security/Signature;)Lcom/nimbusds/jose/util/Base64URL;

    move-result-object v0

    return-object v0
.end method

.method public getInitializedSignature()Ljava/security/Signature;
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/RSASSASigner$1;->val$signer:Ljava/security/Signature;

    return-object v0
.end method
