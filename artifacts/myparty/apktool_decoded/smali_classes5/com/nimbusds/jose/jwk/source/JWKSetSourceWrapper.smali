.class public abstract Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;
.super Ljava/lang/Object;
.source "JWKSetSourceWrapper.java"

# interfaces
.implements Lcom/nimbusds/jose/jwk/source/JWKSetSource;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private final source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    invoke-interface {v0}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->close()V

    return-void
.end method

.method public getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    return-object v0
.end method
