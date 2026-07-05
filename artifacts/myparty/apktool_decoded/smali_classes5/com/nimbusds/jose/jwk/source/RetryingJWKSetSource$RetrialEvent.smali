.class public Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource$RetrialEvent;
.super Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;
.source "RetryingJWKSetSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RetrialEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent<",
        "Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource<",
        "TC;>;TC;>;"
    }
.end annotation


# instance fields
.field private final exception:Ljava/lang/Exception;


# direct methods
.method private constructor <init>(Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource;Ljava/lang/Exception;Lcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource<",
            "TC;>;",
            "Ljava/lang/Exception;",
            "TC;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p3}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    .line 53
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource$RetrialEvent;->exception:Ljava/lang/Exception;

    return-void
.end method

.method synthetic constructor <init>(Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource;Ljava/lang/Exception;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource$1;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource$RetrialEvent;-><init>(Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource;Ljava/lang/Exception;Lcom/nimbusds/jose/proc/SecurityContext;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getContext()Lcom/nimbusds/jose/proc/SecurityContext;
    .locals 1

    .line 45
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->getContext()Lcom/nimbusds/jose/proc/SecurityContext;

    move-result-object v0

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource$RetrialEvent;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public bridge synthetic getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .locals 1

    .line 45
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    return-object v0
.end method
