.class public final Lcom/nimbusds/jose/util/cache/CachedObject;
.super Ljava/lang/Object;
.source "CachedObject.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final expirationTime:J

.field private final object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private final timestamp:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;JJ)V"
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->object:Ljava/lang/Object;

    .line 75
    iput-wide p2, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->timestamp:J

    .line 76
    iput-wide p4, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->expirationTime:J

    return-void
.end method

.method public static computeExpirationTime(JJ)J
    .locals 0

    add-long/2addr p0, p2

    const-wide/16 p2, 0x0

    cmp-long p2, p0, p2

    if-gez p2, :cond_0

    const-wide p0, 0x7fffffffffffffffL

    :cond_0
    return-wide p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->object:Ljava/lang/Object;

    return-object v0
.end method

.method public getExpirationTime()J
    .locals 2

    .line 106
    iget-wide v0, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->expirationTime:J

    return-wide v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->timestamp:J

    return-wide v0
.end method

.method public isExpired(J)Z
    .locals 0

    .line 134
    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/util/cache/CachedObject;->isValid(J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public isValid(J)Z
    .locals 2

    .line 120
    iget-wide v0, p0, Lcom/nimbusds/jose/util/cache/CachedObject;->expirationTime:J

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
