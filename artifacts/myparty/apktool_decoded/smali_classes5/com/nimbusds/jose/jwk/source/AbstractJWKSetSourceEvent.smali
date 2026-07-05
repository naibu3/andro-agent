.class Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;
.super Ljava/lang/Object;
.source "AbstractJWKSetSourceEvent.java"

# interfaces
.implements Lcom/nimbusds/jose/util/events/Event;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S::",
        "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
        "TC;>;C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jose/util/events/Event<",
        "TS;TC;>;"
    }
.end annotation


# instance fields
.field private final context:Lcom/nimbusds/jose/proc/SecurityContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field

.field private final source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;TC;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    .line 50
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->context:Lcom/nimbusds/jose/proc/SecurityContext;

    return-void
.end method


# virtual methods
.method public getContext()Lcom/nimbusds/jose/proc/SecurityContext;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->context:Lcom/nimbusds/jose/proc/SecurityContext;

    return-object v0
.end method

.method public getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->source:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    return-object v0
.end method

.method public bridge synthetic getSource()Ljava/lang/Object;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/AbstractJWKSetSourceEvent;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    return-object v0
.end method
