.class public Lcom/nimbusds/jose/proc/JOSEMatcher;
.super Ljava/lang/Object;
.source "JOSEMatcher.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/proc/JOSEMatcher$Builder;
    }
.end annotation


# instance fields
.field private final algs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/Algorithm;",
            ">;"
        }
    .end annotation
.end field

.field private final classes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/nimbusds/jose/JOSEObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private final encs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/EncryptionMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final jkus:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/net/URI;",
            ">;"
        }
    .end annotation
.end field

.field private final kids:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/nimbusds/jose/JOSEObject;",
            ">;>;",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/Algorithm;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/EncryptionMethod;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/net/URI;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 390
    iput-object p1, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->classes:Ljava/util/Set;

    .line 391
    iput-object p2, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->algs:Ljava/util/Set;

    .line 392
    iput-object p3, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->encs:Ljava/util/Set;

    .line 393
    iput-object p4, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->jkus:Ljava/util/Set;

    .line 394
    iput-object p5, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->kids:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getAlgorithms()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/Algorithm;",
            ">;"
        }
    .end annotation

    .line 416
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->algs:Ljava/util/Set;

    return-object v0
.end method

.method public getEncryptionMethods()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/EncryptionMethod;",
            ">;"
        }
    .end annotation

    .line 427
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->encs:Ljava/util/Set;

    return-object v0
.end method

.method public getJOSEClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/nimbusds/jose/JOSEObject;",
            ">;>;"
        }
    .end annotation

    .line 405
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->classes:Ljava/util/Set;

    return-object v0
.end method

.method public getJWKURLs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/net/URI;",
            ">;"
        }
    .end annotation

    .line 438
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->jkus:Ljava/util/Set;

    return-object v0
.end method

.method public getKeyIDs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 449
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->kids:Ljava/util/Set;

    return-object v0
.end method

.method public matches(Lcom/nimbusds/jose/JOSEObject;)Z
    .locals 4

    .line 462
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->classes:Ljava/util/Set;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 465
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    if-eqz v2, :cond_0

    .line 466
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    return v1

    .line 477
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->algs:Ljava/util/Set;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/nimbusds/jose/JOSEObject;->getHeader()Lcom/nimbusds/jose/Header;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nimbusds/jose/Header;->getAlgorithm()Lcom/nimbusds/jose/Algorithm;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    .line 480
    :cond_3
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->encs:Ljava/util/Set;

    if-eqz v0, :cond_5

    .line 482
    instance-of v2, p1, Lcom/nimbusds/jose/JWEObject;

    if-nez v2, :cond_4

    return v1

    .line 485
    :cond_4
    move-object v2, p1

    check-cast v2, Lcom/nimbusds/jose/JWEObject;

    .line 487
    invoke-virtual {v2}, Lcom/nimbusds/jose/JWEObject;->getHeader()Lcom/nimbusds/jose/JWEHeader;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nimbusds/jose/JWEHeader;->getEncryptionMethod()Lcom/nimbusds/jose/EncryptionMethod;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    return v1

    .line 491
    :cond_5
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->jkus:Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    .line 495
    instance-of v0, p1, Lcom/nimbusds/jose/JWSObject;

    if-eqz v0, :cond_6

    .line 496
    move-object v0, p1

    check-cast v0, Lcom/nimbusds/jose/JWSObject;

    invoke-virtual {v0}, Lcom/nimbusds/jose/JWSObject;->getHeader()Lcom/nimbusds/jose/JWSHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nimbusds/jose/JWSHeader;->getJWKURL()Ljava/net/URI;

    move-result-object v0

    goto :goto_1

    .line 497
    :cond_6
    instance-of v0, p1, Lcom/nimbusds/jose/JWEObject;

    if-eqz v0, :cond_7

    .line 498
    move-object v0, p1

    check-cast v0, Lcom/nimbusds/jose/JWEObject;

    invoke-virtual {v0}, Lcom/nimbusds/jose/JWEObject;->getHeader()Lcom/nimbusds/jose/JWEHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nimbusds/jose/JWEHeader;->getJWKURL()Ljava/net/URI;

    move-result-object v0

    goto :goto_1

    :cond_7
    move-object v0, v2

    .line 504
    :goto_1
    iget-object v3, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->jkus:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    return v1

    .line 508
    :cond_8
    iget-object v0, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->kids:Ljava/util/Set;

    if-eqz v0, :cond_b

    .line 512
    instance-of v0, p1, Lcom/nimbusds/jose/JWSObject;

    if-eqz v0, :cond_9

    .line 513
    check-cast p1, Lcom/nimbusds/jose/JWSObject;

    invoke-virtual {p1}, Lcom/nimbusds/jose/JWSObject;->getHeader()Lcom/nimbusds/jose/JWSHeader;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nimbusds/jose/JWSHeader;->getKeyID()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 514
    :cond_9
    instance-of v0, p1, Lcom/nimbusds/jose/JWEObject;

    if-eqz v0, :cond_a

    .line 515
    check-cast p1, Lcom/nimbusds/jose/JWEObject;

    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEObject;->getHeader()Lcom/nimbusds/jose/JWEHeader;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nimbusds/jose/JWEHeader;->getKeyID()Ljava/lang/String;

    move-result-object v2

    .line 521
    :cond_a
    :goto_2
    iget-object p1, p0, Lcom/nimbusds/jose/proc/JOSEMatcher;->kids:Ljava/util/Set;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_b
    const/4 p1, 0x1

    return p1
.end method
