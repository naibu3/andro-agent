.class public Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;
.super Ljava/lang/Object;
.source "DefaultJWTClaimsVerifier.java"

# interfaces
.implements Lcom/nimbusds/jwt/proc/JWTClaimsSetVerifier;
.implements Lcom/nimbusds/jwt/proc/ClockSkewAware;


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jwt/proc/JWTClaimsSetVerifier<",
        "TC;>;",
        "Lcom/nimbusds/jwt/proc/ClockSkewAware;"
    }
.end annotation


# static fields
.field public static final DEFAULT_MAX_CLOCK_SKEW_SECONDS:I = 0x3c


# instance fields
.field private final acceptedAudienceValues:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final exactMatchClaims:Lcom/nimbusds/jwt/JWTClaimsSet;

.field private maxClockSkew:I

.field private final prohibitedClaims:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final requiredClaims:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 140
    invoke-direct {p0, v0, v0, v0, v0}, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;-><init>(Ljava/util/Set;Lcom/nimbusds/jwt/JWTClaimsSet;Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Lcom/nimbusds/jwt/JWTClaimsSet;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jwt/JWTClaimsSet;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 159
    invoke-direct {p0, v0, p1, p2, v0}, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;-><init>(Ljava/util/Set;Lcom/nimbusds/jwt/JWTClaimsSet;Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/nimbusds/jwt/JWTClaimsSet;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/nimbusds/jwt/JWTClaimsSet;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 180
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;-><init>(Ljava/util/Set;Lcom/nimbusds/jwt/JWTClaimsSet;Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/nimbusds/jwt/JWTClaimsSet;Ljava/util/Set;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/nimbusds/jwt/JWTClaimsSet;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3c

    .line 100
    iput v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->maxClockSkew:I

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 209
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->acceptedAudienceValues:Ljava/util/Set;

    if-eqz p2, :cond_1

    goto :goto_1

    .line 211
    :cond_1
    new-instance p2, Lcom/nimbusds/jwt/JWTClaimsSet$Builder;

    invoke-direct {p2}, Lcom/nimbusds/jwt/JWTClaimsSet$Builder;-><init>()V

    invoke-virtual {p2}, Lcom/nimbusds/jwt/JWTClaimsSet$Builder;->build()Lcom/nimbusds/jwt/JWTClaimsSet;

    move-result-object p2

    :goto_1
    iput-object p2, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->exactMatchClaims:Lcom/nimbusds/jwt/JWTClaimsSet;

    .line 213
    new-instance v1, Ljava/util/HashSet;

    invoke-virtual {p2}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaims()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-direct {v1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_2

    .line 214
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 216
    const-string p1, "aud"

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p3, :cond_3

    .line 219
    invoke-interface {v1, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 221
    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->requiredClaims:Ljava/util/Set;

    if-eqz p4, :cond_4

    .line 223
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->prohibitedClaims:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method protected currentTime()Ljava/util/Date;
    .locals 1

    .line 368
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public getAcceptedAudienceValues()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 235
    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->acceptedAudienceValues:Ljava/util/Set;

    return-object v0
.end method

.method public getExactMatchClaims()Lcom/nimbusds/jwt/JWTClaimsSet;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->exactMatchClaims:Lcom/nimbusds/jwt/JWTClaimsSet;

    return-object v0
.end method

.method public getMaxClockSkew()I
    .locals 1

    .line 274
    iget v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->maxClockSkew:I

    return v0
.end method

.method public getProhibitedClaims()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 268
    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->prohibitedClaims:Ljava/util/Set;

    return-object v0
.end method

.method public getRequiredClaims()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 257
    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->requiredClaims:Ljava/util/Set;

    return-object v0
.end method

.method public setMaxClockSkew(I)V
    .locals 0

    .line 280
    iput p1, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->maxClockSkew:I

    return-void
.end method

.method public verify(Lcom/nimbusds/jwt/JWTClaimsSet;Lcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jwt/JWTClaimsSet;",
            "TC;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jwt/proc/BadJWTException;
        }
    .end annotation

    .line 289
    iget-object p2, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->acceptedAudienceValues:Ljava/util/Set;

    if-eqz p2, :cond_4

    .line 290
    invoke-virtual {p1}, Lcom/nimbusds/jwt/JWTClaimsSet;->getAudience()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 291
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 293
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 294
    iget-object v2, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->acceptedAudienceValues:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 300
    :cond_1
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JWT audience rejected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 302
    :cond_2
    iget-object p2, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->acceptedAudienceValues:Ljava/util/Set;

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    .line 303
    :cond_3
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    const-string p2, "JWT missing required audience"

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 308
    :cond_4
    :goto_0
    invoke-virtual {p1}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaims()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->requiredClaims:Ljava/util/Set;

    invoke-interface {p2, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p2

    if-eqz p2, :cond_e

    .line 315
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    .line 316
    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->prohibitedClaims:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 317
    invoke-virtual {p1}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaims()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 318
    invoke-interface {p2, v1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 321
    :cond_6
    invoke-interface {p2}, Ljava/util/SortedSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 326
    iget-object p2, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->exactMatchClaims:Lcom/nimbusds/jwt/JWTClaimsSet;

    invoke-virtual {p2}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaims()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 327
    invoke-virtual {p1, v0}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaim(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 328
    iget-object v2, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->exactMatchClaims:Lcom/nimbusds/jwt/JWTClaimsSet;

    invoke-virtual {v2, v0}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaim(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 329
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    .line 330
    :cond_7
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "JWT "

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " claim has value "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, ", must be "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 335
    :cond_8
    invoke-virtual {p0}, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->currentTime()Ljava/util/Date;

    move-result-object p2

    if-eqz p2, :cond_c

    .line 338
    invoke-virtual {p1}, Lcom/nimbusds/jwt/JWTClaimsSet;->getExpirationTime()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 341
    iget v1, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->maxClockSkew:I

    int-to-long v1, v1

    invoke-static {v0, p2, v1, v2}, Lcom/nimbusds/jwt/util/DateUtils;->isAfter(Ljava/util/Date;Ljava/util/Date;J)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_3

    .line 342
    :cond_9
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    const-string p2, "Expired JWT"

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 346
    :cond_a
    :goto_3
    invoke-virtual {p1}, Lcom/nimbusds/jwt/JWTClaimsSet;->getNotBeforeTime()Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 349
    iget v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->maxClockSkew:I

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Lcom/nimbusds/jwt/util/DateUtils;->isBefore(Ljava/util/Date;Ljava/util/Date;J)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_4

    .line 350
    :cond_b
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    const-string p2, "JWT before use time"

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_4
    return-void

    .line 322
    :cond_d
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JWT has prohibited claims: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 309
    :cond_e
    new-instance p2, Ljava/util/TreeSet;

    iget-object v0, p0, Lcom/nimbusds/jwt/proc/DefaultJWTClaimsVerifier;->requiredClaims:Ljava/util/Set;

    invoke-direct {p2, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 310
    invoke-virtual {p1}, Lcom/nimbusds/jwt/JWTClaimsSet;->getClaims()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/SortedSet;->removeAll(Ljava/util/Collection;)Z

    .line 311
    new-instance p1, Lcom/nimbusds/jwt/proc/BadJWTException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JWT missing required claims: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jwt/proc/BadJWTException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
