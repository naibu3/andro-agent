.class public final Lcom/nimbusds/jose/crypto/impl/AuthenticatedCipherText;
.super Ljava/lang/Object;
.source "AuthenticatedCipherText.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation


# instance fields
.field private final authenticationTag:[B

.field private final cipherText:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/nimbusds/jose/crypto/impl/AuthenticatedCipherText;->cipherText:[B

    .line 58
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/nimbusds/jose/crypto/impl/AuthenticatedCipherText;->authenticationTag:[B

    return-void
.end method


# virtual methods
.method public getAuthenticationTag()[B
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/impl/AuthenticatedCipherText;->authenticationTag:[B

    return-object v0
.end method

.method public getCipherText()[B
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/nimbusds/jose/crypto/impl/AuthenticatedCipherText;->cipherText:[B

    return-object v0
.end method
