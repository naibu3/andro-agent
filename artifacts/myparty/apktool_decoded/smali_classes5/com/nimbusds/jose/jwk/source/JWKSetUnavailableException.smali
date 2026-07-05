.class public Lcom/nimbusds/jose/jwk/source/JWKSetUnavailableException;
.super Lcom/nimbusds/jose/KeySourceException;
.source "JWKSetUnavailableException.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/nimbusds/jose/KeySourceException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/nimbusds/jose/KeySourceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
