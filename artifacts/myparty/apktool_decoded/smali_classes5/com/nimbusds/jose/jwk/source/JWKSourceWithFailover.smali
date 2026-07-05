.class public Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;
.super Ljava/lang/Object;
.source "JWKSourceWithFailover.java"

# interfaces
.implements Lcom/nimbusds/jose/jwk/source/JWKSource;
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jose/jwk/source/JWKSource<",
        "TC;>;",
        "Ljava/io/Closeable;"
    }
.end annotation


# instance fields
.field private final failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;"
        }
    .end annotation
.end field

.field private final jwkSource:Lcom/nimbusds/jose/jwk/source/JWKSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSource;Lcom/nimbusds/jose/jwk/source/JWKSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const-string v0, "The primary JWK source must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->jwkSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    .line 60
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    return-void
.end method

.method private failover(Ljava/lang/Exception;Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Lcom/nimbusds/jose/jwk/JWKSelector;",
            "TC;)",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/jwk/JWK;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    invoke-interface {v0, p2, p3}, Lcom/nimbusds/jose/jwk/source/JWKSource;->get(Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lcom/nimbusds/jose/KeySourceException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    .line 73
    new-instance p3, Lcom/nimbusds/jose/KeySourceException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "; Failover JWK source retrieval failed with: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p2}, Lcom/nimbusds/jose/KeySourceException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Lcom/nimbusds/jose/KeySourceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->jwkSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    instance-of v1, v0, Ljava/io/Closeable;

    if-eqz v1, :cond_0

    .line 95
    check-cast v0, Ljava/io/Closeable;

    invoke-static {v0}, Lcom/nimbusds/jose/util/IOUtils;->closeSilently(Ljava/io/Closeable;)V

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    instance-of v1, v0, Ljava/io/Closeable;

    if-eqz v1, :cond_1

    .line 98
    check-cast v0, Ljava/io/Closeable;

    invoke-static {v0}, Lcom/nimbusds/jose/util/IOUtils;->closeSilently(Ljava/io/Closeable;)V

    :cond_1
    return-void
.end method

.method public get(Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/JWKSelector;",
            "TC;)",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/jwk/JWK;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->jwkSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    invoke-interface {v0, p1, p2}, Lcom/nimbusds/jose/jwk/source/JWKSource;->get(Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 87
    invoke-direct {p0, v0, p1, p2}, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;->failover(Ljava/lang/Exception;Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
