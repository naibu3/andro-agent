.class public final Lcom/nimbusds/jose/jwk/KeyRevocation;
.super Ljava/lang/Object;
.source "KeyRevocation.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;
    }
.end annotation


# instance fields
.field private final reason:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

.field private final revokedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/util/Date;Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/KeyRevocation;->revokedAt:Ljava/util/Date;

    .line 151
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/KeyRevocation;->reason:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    return-void
.end method

.method public static parse(Ljava/util/Map;)Lcom/nimbusds/jose/jwk/KeyRevocation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/nimbusds/jose/jwk/KeyRevocation;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 216
    const-string v0, "revoked_at"

    invoke-static {p0, v0}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getLong(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/nimbusds/jwt/util/DateUtils;->fromSecondsSinceEpoch(J)Ljava/util/Date;

    move-result-object v0

    .line 218
    const-string v1, "reason"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 219
    invoke-static {p0, v1}, Lcom/nimbusds/jose/util/JSONObjectUtils;->getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->parse(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 221
    :goto_0
    new-instance v1, Lcom/nimbusds/jose/jwk/KeyRevocation;

    invoke-direct {v1, v0, p0}, Lcom/nimbusds/jose/jwk/KeyRevocation;-><init>(Ljava/util/Date;Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;)V

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 178
    :cond_0
    instance-of v1, p1, Lcom/nimbusds/jose/jwk/KeyRevocation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 179
    :cond_1
    check-cast p1, Lcom/nimbusds/jose/jwk/KeyRevocation;

    .line 180
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/KeyRevocation;->revokedAt:Ljava/util/Date;

    iget-object v3, p1, Lcom/nimbusds/jose/jwk/KeyRevocation;->revokedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation;->getReason()Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    move-result-object v1

    invoke-virtual {p1}, Lcom/nimbusds/jose/jwk/KeyRevocation;->getReason()Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public getReason()Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/KeyRevocation;->reason:Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    return-object v0
.end method

.method public getRevocationTime()Ljava/util/Date;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/KeyRevocation;->revokedAt:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 186
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/KeyRevocation;->revokedAt:Ljava/util/Date;

    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation;->getReason()Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toJSONObject()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 196
    invoke-static {}, Lcom/nimbusds/jose/util/JSONObjectUtils;->newJSONObject()Ljava/util/Map;

    move-result-object v0

    .line 197
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation;->getRevocationTime()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lcom/nimbusds/jwt/util/DateUtils;->toSecondsSinceEpoch(Ljava/util/Date;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "revoked_at"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation;->getReason()Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 199
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/KeyRevocation;->getReason()Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nimbusds/jose/jwk/KeyRevocation$Reason;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, "reason"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
