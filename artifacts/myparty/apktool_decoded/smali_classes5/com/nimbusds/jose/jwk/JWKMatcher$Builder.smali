.class public Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
.super Ljava/lang/Object;
.source "JWKMatcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nimbusds/jose/jwk/JWKMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private algs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/Algorithm;",
            ">;"
        }
    .end annotation
.end field

.field private curves:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/Curve;",
            ">;"
        }
    .end annotation
.end field

.field private ids:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private maxSizeBits:I

.field private minSizeBits:I

.field private nonRevokedOnly:Z

.field private ops:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyOperation;",
            ">;"
        }
    .end annotation
.end field

.field private privateOnly:Z

.field private publicOnly:Z

.field private revokedOnly:Z

.field private sizesBits:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private types:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyType;",
            ">;"
        }
    .end annotation
.end field

.field private uses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyUse;",
            ">;"
        }
    .end annotation
.end field

.field private withIDOnly:Z

.field private withUseOnly:Z

.field private withX5COnly:Z

.field private x5tS256s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/util/Base64URL;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 217
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withUseOnly:Z

    .line 223
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withIDOnly:Z

    .line 229
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->privateOnly:Z

    .line 235
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->publicOnly:Z

    .line 241
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->nonRevokedOnly:Z

    .line 247
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->revokedOnly:Z

    .line 254
    iput v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->minSizeBits:I

    .line 261
    iput v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->maxSizeBits:I

    .line 286
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withX5COnly:Z

    return-void
.end method

.method public constructor <init>(Lcom/nimbusds/jose/jwk/JWKMatcher;)V
    .locals 1

    .line 303
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 217
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withUseOnly:Z

    .line 223
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withIDOnly:Z

    .line 229
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->privateOnly:Z

    .line 235
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->publicOnly:Z

    .line 241
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->nonRevokedOnly:Z

    .line 247
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->revokedOnly:Z

    .line 254
    iput v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->minSizeBits:I

    .line 261
    iput v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->maxSizeBits:I

    .line 286
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withX5COnly:Z

    .line 304
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getKeyTypes()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->types:Ljava/util/Set;

    .line 305
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getKeyUses()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->uses:Ljava/util/Set;

    .line 306
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getKeyOperations()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ops:Ljava/util/Set;

    .line 307
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getAlgorithms()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->algs:Ljava/util/Set;

    .line 308
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getKeyIDs()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ids:Ljava/util/Set;

    .line 309
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isWithKeyUseOnly()Z

    move-result v0

    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withUseOnly:Z

    .line 310
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isWithKeyIDOnly()Z

    move-result v0

    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withIDOnly:Z

    .line 311
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isPrivateOnly()Z

    move-result v0

    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->privateOnly:Z

    .line 312
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isPublicOnly()Z

    move-result v0

    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->publicOnly:Z

    .line 313
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isNonRevokedOnly()Z

    move-result v0

    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->nonRevokedOnly:Z

    .line 314
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isNonRevokedOnly()Z

    move-result v0

    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->revokedOnly:Z

    .line 315
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getMinKeySize()I

    move-result v0

    iput v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->minSizeBits:I

    .line 316
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getMaxKeySize()I

    move-result v0

    iput v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->maxSizeBits:I

    .line 317
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getKeySizes()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->sizesBits:Ljava/util/Set;

    .line 318
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getCurves()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->curves:Ljava/util/Set;

    .line 319
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->getX509CertSHA256Thumbprints()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->x5tS256s:Ljava/util/Set;

    .line 320
    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/JWKMatcher;->isWithX509CertChainOnly()Z

    move-result p1

    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withX5COnly:Z

    return-void
.end method


# virtual methods
.method public algorithm(Lcom/nimbusds/jose/Algorithm;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 477
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->algs:Ljava/util/Set;

    return-object p0

    .line 479
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->algs:Ljava/util/Set;

    return-object p0
.end method

.method public algorithms(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/Algorithm;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 509
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->algs:Ljava/util/Set;

    return-object p0
.end method

.method public varargs algorithms([Lcom/nimbusds/jose/Algorithm;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 494
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->algorithms(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public build()Lcom/nimbusds/jose/jwk/JWKMatcher;
    .locals 20

    move-object/from16 v0, p0

    .line 886
    new-instance v1, Lcom/nimbusds/jose/jwk/JWKMatcher;

    iget-object v2, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->types:Ljava/util/Set;

    iget-object v3, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->uses:Ljava/util/Set;

    iget-object v4, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ops:Ljava/util/Set;

    iget-object v5, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->algs:Ljava/util/Set;

    iget-object v6, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ids:Ljava/util/Set;

    iget-boolean v7, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withUseOnly:Z

    iget-boolean v8, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withIDOnly:Z

    iget-boolean v9, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->privateOnly:Z

    iget-boolean v10, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->publicOnly:Z

    iget-boolean v11, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->nonRevokedOnly:Z

    iget-boolean v12, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->revokedOnly:Z

    iget v13, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->minSizeBits:I

    iget v14, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->maxSizeBits:I

    iget-object v15, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->sizesBits:Ljava/util/Set;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->curves:Ljava/util/Set;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->x5tS256s:Ljava/util/Set;

    move-object/from16 v18, v1

    iget-boolean v1, v0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withX5COnly:Z

    move-object/from16 v19, v18

    move/from16 v18, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v19

    invoke-direct/range {v1 .. v18}, Lcom/nimbusds/jose/jwk/JWKMatcher;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZZZIILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Z)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public curve(Lcom/nimbusds/jose/jwk/Curve;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 766
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->curves:Ljava/util/Set;

    return-object p0

    .line 768
    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->curves:Ljava/util/Set;

    return-object p0
.end method

.method public curves(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/Curve;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 797
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->curves:Ljava/util/Set;

    return-object p0
.end method

.method public varargs curves([Lcom/nimbusds/jose/jwk/Curve;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 783
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->curves(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public hasKeyID(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 601
    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withKeyIDOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    move-result-object p1

    return-object p1
.end method

.method public hasKeyUse(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 571
    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withKeyUseOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    move-result-object p1

    return-object p1
.end method

.method public hasX509CertChain(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 860
    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withX509CertChainOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    move-result-object p1

    return-object p1
.end method

.method public keyID(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 524
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ids:Ljava/util/Set;

    return-object p0

    .line 526
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ids:Ljava/util/Set;

    return-object p0
.end method

.method public keyIDs(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 555
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ids:Ljava/util/Set;

    return-object p0
.end method

.method public varargs keyIDs([Ljava/lang/String;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 541
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->keyIDs(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public keyOperation(Lcom/nimbusds/jose/jwk/KeyOperation;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 429
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ops:Ljava/util/Set;

    return-object p0

    .line 431
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ops:Ljava/util/Set;

    return-object p0
.end method

.method public keyOperations(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyOperation;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 461
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->ops:Ljava/util/Set;

    return-object p0
.end method

.method public varargs keyOperations([Lcom/nimbusds/jose/jwk/KeyOperation;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 446
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->keyOperations(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public keySize(I)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    .line 717
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->sizesBits:Ljava/util/Set;

    return-object p0

    .line 719
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->sizesBits:Ljava/util/Set;

    return-object p0
.end method

.method public keySizes(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 751
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->sizesBits:Ljava/util/Set;

    return-object p0
.end method

.method public varargs keySizes([I)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 4

    .line 733
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 734
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p1, v2

    .line 735
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 737
    :cond_0
    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->keySizes(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public keyType(Lcom/nimbusds/jose/jwk/KeyType;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 334
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->types:Ljava/util/Set;

    return-object p0

    .line 336
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->types:Ljava/util/Set;

    return-object p0
.end method

.method public keyTypes(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyType;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 366
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->types:Ljava/util/Set;

    return-object p0
.end method

.method public varargs keyTypes([Lcom/nimbusds/jose/jwk/KeyType;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 352
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->keyTypes(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public keyUse(Lcom/nimbusds/jose/jwk/KeyUse;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 382
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->uses:Ljava/util/Set;

    return-object p0

    .line 384
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->uses:Ljava/util/Set;

    return-object p0
.end method

.method public keyUses(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/jwk/KeyUse;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 414
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->uses:Ljava/util/Set;

    return-object p0
.end method

.method public varargs keyUses([Lcom/nimbusds/jose/jwk/KeyUse;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 399
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->keyUses(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    return-object p0
.end method

.method public maxKeySize(I)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 702
    iput p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->maxSizeBits:I

    return-object p0
.end method

.method public minKeySize(I)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 687
    iput p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->minSizeBits:I

    return-object p0
.end method

.method public nonRevokedOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 658
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->nonRevokedOnly:Z

    return-object p0
.end method

.method public privateOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 629
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->privateOnly:Z

    return-object p0
.end method

.method public publicOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 643
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->publicOnly:Z

    return-object p0
.end method

.method public revokedOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 672
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->revokedOnly:Z

    return-object p0
.end method

.method public withKeyIDOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 615
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withIDOnly:Z

    return-object p0
.end method

.method public withKeyUseOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 585
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withUseOnly:Z

    return-object p0
.end method

.method public withX509CertChainOnly(Z)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    .line 874
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->withX5COnly:Z

    return-object p0
.end method

.method public x509CertSHA256Thumbprint(Lcom/nimbusds/jose/util/Base64URL;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 813
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->x5tS256s:Ljava/util/Set;

    return-object p0

    .line 815
    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->x5tS256s:Ljava/util/Set;

    return-object p0
.end method

.method public x509CertSHA256Thumbprints(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/nimbusds/jose/util/Base64URL;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;"
        }
    .end annotation

    .line 844
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->x5tS256s:Ljava/util/Set;

    return-object p0
.end method

.method public varargs x509CertSHA256Thumbprints([Lcom/nimbusds/jose/util/Base64URL;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;
    .locals 1

    .line 830
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;->x509CertSHA256Thumbprints(Ljava/util/Set;)Lcom/nimbusds/jose/jwk/JWKMatcher$Builder;

    move-result-object p1

    return-object p1
.end method
