.class public Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;
.super Ljava/lang/Object;
.source "RemoteJWKSet.java"

# interfaces
.implements Lcom/nimbusds/jose/jwk/source/JWKSource;


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
        "TC;>;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final DEFAULT_HTTP_CONNECT_TIMEOUT:I = 0x1f4

.field public static final DEFAULT_HTTP_READ_TIMEOUT:I = 0x1f4

.field public static final DEFAULT_HTTP_SIZE_LIMIT:I = 0xc800


# instance fields
.field private final failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;"
        }
    .end annotation
.end field

.field private final jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

.field private final jwkSetRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

.field private final jwkSetURL:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/net/URL;)V
    .locals 2

    const/4 v0, 0x0

    .line 194
    move-object v1, v0

    check-cast v1, Lcom/nimbusds/jose/jwk/source/JWKSource;

    invoke-direct {p0, p1, v0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;-><init>(Ljava/net/URL;Lcom/nimbusds/jose/jwk/source/JWKSource;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lcom/nimbusds/jose/jwk/source/JWKSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 209
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;-><init>(Ljava/net/URL;Lcom/nimbusds/jose/jwk/source/JWKSource;Lcom/nimbusds/jose/util/ResourceRetriever;Lcom/nimbusds/jose/jwk/source/JWKSetCache;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lcom/nimbusds/jose/jwk/source/JWKSource;Lcom/nimbusds/jose/util/ResourceRetriever;Lcom/nimbusds/jose/jwk/source/JWKSetCache;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;",
            "Lcom/nimbusds/jose/util/ResourceRetriever;",
            "Lcom/nimbusds/jose/jwk/source/JWKSetCache;",
            ")V"
        }
    .end annotation

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 272
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/URL;

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetURL:Ljava/net/URL;

    .line 274
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    if-eqz p3, :cond_0

    .line 277
    iput-object p3, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

    goto :goto_0

    .line 279
    :cond_0
    new-instance p1, Lcom/nimbusds/jose/util/DefaultResourceRetriever;

    .line 280
    invoke-static {}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->resolveDefaultHTTPConnectTimeout()I

    move-result p2

    .line 281
    invoke-static {}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->resolveDefaultHTTPReadTimeout()I

    move-result p3

    .line 282
    invoke-static {}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->resolveDefaultHTTPSizeLimit()I

    move-result v0

    invoke-direct {p1, p2, p3, v0}, Lcom/nimbusds/jose/util/DefaultResourceRetriever;-><init>(III)V

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

    :goto_0
    if-eqz p4, :cond_1

    .line 286
    iput-object p4, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    return-void

    .line 288
    :cond_1
    new-instance p1, Lcom/nimbusds/jose/jwk/source/DefaultJWKSetCache;

    invoke-direct {p1}, Lcom/nimbusds/jose/jwk/source/DefaultJWKSetCache;-><init>()V

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;)V
    .locals 1

    const/4 v0, 0x0

    .line 226
    invoke-direct {p0, p1, p2, v0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;-><init>(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;Lcom/nimbusds/jose/jwk/source/JWKSetCache;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;Lcom/nimbusds/jose/jwk/source/JWKSetCache;)V
    .locals 1

    const/4 v0, 0x0

    .line 247
    invoke-direct {p0, p1, v0, p2, p3}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;-><init>(Ljava/net/URL;Lcom/nimbusds/jose/jwk/source/JWKSource;Lcom/nimbusds/jose/util/ResourceRetriever;Lcom/nimbusds/jose/jwk/source/JWKSetCache;)V

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
            Lcom/nimbusds/jose/RemoteKeySourceException;
        }
    .end annotation

    .line 404
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->getFailoverJWKSource()Lcom/nimbusds/jose/jwk/source/JWKSource;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 409
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->getFailoverJWKSource()Lcom/nimbusds/jose/jwk/source/JWKSource;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lcom/nimbusds/jose/jwk/source/JWKSource;->get(Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lcom/nimbusds/jose/KeySourceException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    .line 411
    new-instance p3, Lcom/nimbusds/jose/RemoteKeySourceException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 412
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "; Failover JWK source retrieval failed with: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 413
    invoke-virtual {p2}, Lcom/nimbusds/jose/KeySourceException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Lcom/nimbusds/jose/RemoteKeySourceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method protected static getFirstSpecifiedKeyID(Lcom/nimbusds/jose/jwk/JWKMatcher;)Ljava/lang/String;
    .locals 2

    .line 383
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getKeyIDs()Ljava/util/Set;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 385
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 389
    :cond_0
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method private static resolveDefault(Ljava/lang/String;I)I
    .locals 0

    .line 147
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return p1

    .line 154
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p1
.end method

.method public static resolveDefaultHTTPConnectTimeout()I
    .locals 2

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".defaultHttpConnectTimeout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1f4

    invoke-static {v0, v1}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->resolveDefault(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static resolveDefaultHTTPReadTimeout()I
    .locals 2

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".defaultHttpReadTimeout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1f4

    invoke-static {v0, v1}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->resolveDefault(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static resolveDefaultHTTPSizeLimit()I
    .locals 2

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".defaultHttpSizeLimit"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0xc800

    invoke-static {v0, v1}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->resolveDefault(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private updateJWKSetFromURL()Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/RemoteKeySourceException;
        }
    .end annotation

    .line 304
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetURL:Ljava/net/URL;

    invoke-interface {v0, v1}, Lcom/nimbusds/jose/util/ResourceRetriever;->retrieveResource(Ljava/net/URL;)Lcom/nimbusds/jose/util/Resource;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 310
    :try_start_1
    invoke-virtual {v0}, Lcom/nimbusds/jose/util/Resource;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/jwk/JWKSet;->parse(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 314
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v1, v0}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->put(Lcom/nimbusds/jose/jwk/JWKSet;)V

    return-object v0

    :catch_0
    move-exception v0

    .line 312
    new-instance v1, Lcom/nimbusds/jose/RemoteKeySourceException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t parse remote JWK set: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/nimbusds/jose/RemoteKeySourceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 306
    new-instance v1, Lcom/nimbusds/jose/RemoteKeySourceException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t retrieve remote JWK set: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/nimbusds/jose/RemoteKeySourceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public get(Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;
    .locals 3
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
            Lcom/nimbusds/jose/RemoteKeySourceException;
        }
    .end annotation

    .line 425
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v0}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->get()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    .line 427
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v1}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->requiresRefresh()Z

    move-result v1

    if-nez v1, :cond_0

    if-nez v0, :cond_4

    .line 432
    :cond_0
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 433
    :try_start_1
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v1}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->get()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    .line 434
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v1}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->requiresRefresh()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez v0, :cond_2

    .line 436
    :cond_1
    invoke-direct {p0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->updateJWKSetFromURL()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    .line 438
    :cond_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v1

    .line 441
    invoke-direct {p0, v1, p1, p2}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->failover(Ljava/lang/Exception;Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    if-eqz v0, :cond_b

    .line 456
    :cond_4
    :goto_0
    invoke-virtual {p1, v0}, Lcom/nimbusds/jose/jwk/JWKSelector;->select(Lcom/nimbusds/jose/jwk/JWKSet;)Ljava/util/List;

    move-result-object v1

    .line 458
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    return-object v1

    .line 466
    :cond_5
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKSelector;->getMatcher()Lcom/nimbusds/jose/jwk/JWKMatcher;

    move-result-object v1

    invoke-static {v1}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->getFirstSpecifiedKeyID(Lcom/nimbusds/jose/jwk/JWKMatcher;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    .line 469
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 472
    :cond_6
    invoke-virtual {v0, v1}, Lcom/nimbusds/jose/jwk/JWKSet;->getKeyByKeyId(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/JWK;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 475
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 482
    :cond_7
    :try_start_3
    monitor-enter p0
    :try_end_3
    .catch Lcom/nimbusds/jose/KeySourceException; {:try_start_3 .. :try_end_3} :catch_1

    .line 483
    :try_start_4
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v1}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->get()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v1

    if-ne v0, v1, :cond_8

    .line 485
    invoke-direct {p0}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->updateJWKSetFromURL()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    goto :goto_1

    .line 488
    :cond_8
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v0}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->get()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    .line 490
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v0, :cond_9

    .line 504
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 508
    :cond_9
    invoke-virtual {p1, v0}, Lcom/nimbusds/jose/jwk/JWKSelector;->select(Lcom/nimbusds/jose/jwk/JWKSet;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception v0

    .line 490
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catch Lcom/nimbusds/jose/KeySourceException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    move-exception v0

    .line 493
    invoke-direct {p0, v0, p1, p2}, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->failover(Ljava/lang/Exception;Lcom/nimbusds/jose/jwk/JWKSelector;Lcom/nimbusds/jose/proc/SecurityContext;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    return-object p1

    .line 498
    :cond_a
    throw v0

    .line 448
    :cond_b
    throw v1
.end method

.method public getCachedJWKSet()Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    invoke-interface {v0}, Lcom/nimbusds/jose/jwk/source/JWKSetCache;->get()Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    return-object v0
.end method

.method public getFailoverJWKSource()Lcom/nimbusds/jose/jwk/source/JWKSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;"
        }
    .end annotation

    .line 337
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->failoverJWKSource:Lcom/nimbusds/jose/jwk/source/JWKSource;

    return-object v0
.end method

.method public getJWKSetCache()Lcom/nimbusds/jose/jwk/source/JWKSetCache;
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetCache:Lcom/nimbusds/jose/jwk/source/JWKSetCache;

    return-object v0
.end method

.method public getJWKSetURL()Ljava/net/URL;
    .locals 1

    .line 326
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetURL:Ljava/net/URL;

    return-object v0
.end method

.method public getResourceRetriever()Lcom/nimbusds/jose/util/ResourceRetriever;
    .locals 1

    .line 348
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RemoteJWKSet;->jwkSetRetriever:Lcom/nimbusds/jose/util/ResourceRetriever;

    return-object v0
.end method
