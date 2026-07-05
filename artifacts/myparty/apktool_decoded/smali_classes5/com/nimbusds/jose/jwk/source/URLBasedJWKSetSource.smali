.class public Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;
.super Ljava/lang/Object;
.source "URLBasedJWKSetSource.java"

# interfaces
.implements Lcom/nimbusds/jose/jwk/source/JWKSetSource;


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

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
.field private final resourceRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

.field private final url:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const-string v0, "The URL must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;->url:Ljava/net/URL;

    .line 59
    const-string p1, "The resource retriever must not be null"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;->resourceRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;",
            "JTC;)",
            "Lcom/nimbusds/jose/jwk/JWKSet;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 69
    :try_start_0
    iget-object p1, p0, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;->resourceRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

    iget-object p2, p0, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;->url:Ljava/net/URL;

    invoke-interface {p1, p2}, Lcom/nimbusds/jose/util/ResourceRetriever;->retrieveResource(Ljava/net/URL;)Lcom/nimbusds/jose/util/Resource;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 80
    :try_start_1
    invoke-virtual {p1}, Lcom/nimbusds/jose/util/Resource;->getContent()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/nimbusds/jose/jwk/JWKSet;->parse(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 84
    new-instance p2, Lcom/nimbusds/jose/jwk/source/JWKSetParseException;

    const-string p3, "Unable to parse JWK set"

    invoke-direct {p2, p3, p1}, Lcom/nimbusds/jose/jwk/source/JWKSetParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 71
    new-instance p2, Lcom/nimbusds/jose/jwk/source/JWKSetRetrievalException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Couldn\'t retrieve JWK set from URL: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lcom/nimbusds/jose/jwk/source/JWKSetRetrievalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
