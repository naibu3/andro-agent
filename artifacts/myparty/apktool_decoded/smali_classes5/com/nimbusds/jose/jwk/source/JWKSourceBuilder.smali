.class public Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
.super Ljava/lang/Object;
.source "JWKSourceBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final DEFAULT_CACHE_REFRESH_TIMEOUT:J = 0x3a98L

.field public static final DEFAULT_CACHE_TIME_TO_LIVE:J = 0x493e0L

.field public static final DEFAULT_HTTP_CONNECT_TIMEOUT:I = 0x1f4

.field public static final DEFAULT_HTTP_READ_TIMEOUT:I = 0x1f4

.field public static final DEFAULT_HTTP_SIZE_LIMIT:I = 0xc800

.field public static final DEFAULT_RATE_LIMIT_MIN_INTERVAL:J = 0x7530L

.field public static final DEFAULT_REFRESH_AHEAD_TIME:J = 0x7530L


# instance fields
.field private cacheRefreshTimeout:J

.field private cacheTimeToLive:J

.field private caching:Z

.field private cachingEventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field

.field protected failover:Lcom/nimbusds/jose/jwk/source/JWKSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;"
        }
    .end annotation
.end field

.field private healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/health/HealthReportListener<",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field

.field private final jwkSetSource:Lcom/nimbusds/jose/jwk/source/JWKSetSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;"
        }
    .end annotation
.end field

.field private minTimeInterval:J

.field private outageCacheTimeToLive:J

.field private outageEventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field

.field private outageTolerant:Z

.field private rateLimited:Z

.field private rateLimitedEventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field

.field private refreshAhead:Z

.field private refreshAheadScheduled:Z

.field private refreshAheadTime:J

.field private retrying:Z

.field private retryingEventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;)V"
        }
    .end annotation

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 147
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    const-wide/32 v1, 0x493e0

    .line 148
    iput-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    const-wide/16 v1, 0x3a98

    .line 149
    iput-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheRefreshTimeout:J

    .line 152
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    const-wide/16 v1, 0x7530

    .line 153
    iput-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadTime:J

    const/4 v3, 0x0

    .line 154
    iput-boolean v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadScheduled:Z

    .line 157
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    .line 158
    iput-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->minTimeInterval:J

    .line 162
    iput-boolean v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->retrying:Z

    .line 166
    iput-boolean v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    const-wide/16 v0, -0x1

    .line 167
    iput-wide v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    .line 184
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->jwkSetSource:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    return-void
.end method

.method public static create(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/nimbusds/jose/proc/SecurityContext;",
            ">(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 140
    new-instance v0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    return-object v0
.end method

.method public static create(Ljava/net/URL;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/nimbusds/jose/proc/SecurityContext;",
            ">(",
            "Ljava/net/URL;",
            ")",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 111
    new-instance v0, Lcom/nimbusds/jose/util/DefaultResourceRetriever;

    const/16 v1, 0x1f4

    const v2, 0xc800

    invoke-direct {v0, v1, v1, v2}, Lcom/nimbusds/jose/util/DefaultResourceRetriever;-><init>(III)V

    .line 116
    new-instance v1, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;

    invoke-direct {v1, p0, v0}, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;-><init>(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;)V

    .line 118
    new-instance p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;

    invoke-direct {p0, v1}, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    return-object p0
.end method

.method public static create(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/nimbusds/jose/proc/SecurityContext;",
            ">(",
            "Ljava/net/URL;",
            "Lcom/nimbusds/jose/util/ResourceRetriever;",
            ")",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 130
    new-instance v0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;

    new-instance v1, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;

    invoke-direct {v1, p0, p1}, Lcom/nimbusds/jose/jwk/source/URLBasedJWKSetSource;-><init>(Ljava/net/URL;Lcom/nimbusds/jose/util/ResourceRetriever;)V

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    return-object v0
.end method


# virtual methods
.method public build()Lcom/nimbusds/jose/jwk/source/JWKSource;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;"
        }
    .end annotation

    .line 488
    iget-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    if-nez v0, :cond_1

    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 489
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Rate limiting requires caching"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-nez v0, :cond_3

    .line 490
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    if-nez v1, :cond_2

    goto :goto_1

    .line 491
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Refresh-ahead caching requires general caching"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    if-eqz v0, :cond_5

    .line 494
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    if-eqz v1, :cond_5

    iget-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    iget-wide v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->minTimeInterval:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_4

    goto :goto_2

    .line 495
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The rate limiting min time interval between requests must be less than the cache time-to-live"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    const-wide v1, 0x7fffffffffffffffL

    if-eqz v0, :cond_7

    .line 498
    iget-boolean v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    if-eqz v3, :cond_7

    iget-wide v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    cmp-long v3, v3, v1

    if-nez v3, :cond_7

    iget-wide v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    cmp-long v3, v3, v1

    if-eqz v3, :cond_6

    goto :goto_3

    .line 500
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Outage tolerance not necessary with a non-expiring cache"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    if-eqz v0, :cond_9

    .line 503
    iget-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    if-eqz v0, :cond_9

    iget-wide v3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_8

    goto :goto_4

    .line 505
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Refresh-ahead caching not necessary with a non-expiring cache"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 508
    :cond_9
    :goto_4
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->jwkSetSource:Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    .line 510
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->retrying:Z

    if-eqz v1, :cond_a

    .line 511
    new-instance v1, Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource;

    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->retryingEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    invoke-direct {v1, v0, v2}, Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/util/events/EventListener;)V

    move-object v0, v1

    .line 514
    :cond_a
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    if-eqz v1, :cond_d

    .line 515
    iget-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_c

    .line 516
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    if-eqz v1, :cond_b

    .line 517
    iget-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    const-wide/16 v3, 0xa

    mul-long/2addr v1, v3

    iput-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    goto :goto_5

    :cond_b
    const-wide/32 v1, 0x2dc6c0

    .line 519
    iput-wide v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    .line 522
    :cond_c
    :goto_5
    new-instance v1, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;

    iget-wide v2, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    iget-object v4, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JLcom/nimbusds/jose/util/events/EventListener;)V

    move-object v0, v1

    .line 525
    :cond_d
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;

    if-eqz v1, :cond_e

    .line 526
    new-instance v1, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;

    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;

    invoke-direct {v1, v0, v2}, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/util/health/HealthReportListener;)V

    move-object v0, v1

    .line 529
    :cond_e
    iget-boolean v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    if-eqz v1, :cond_f

    .line 530
    new-instance v1, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;

    iget-wide v2, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->minTimeInterval:J

    iget-object v4, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimitedEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JLcom/nimbusds/jose/util/events/EventListener;)V

    move-object v6, v1

    goto :goto_6

    :cond_f
    move-object v6, v0

    .line 533
    :goto_6
    iget-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    if-eqz v0, :cond_10

    .line 534
    new-instance v5, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iget-wide v7, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    iget-wide v9, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheRefreshTimeout:J

    iget-wide v11, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadTime:J

    iget-boolean v13, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadScheduled:Z

    iget-object v14, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cachingEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    invoke-direct/range {v5 .. v14}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JJJZLcom/nimbusds/jose/util/events/EventListener;)V

    :goto_7
    move-object v6, v5

    goto :goto_8

    .line 535
    :cond_10
    iget-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    if-eqz v0, :cond_11

    .line 536
    new-instance v5, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;

    iget-wide v7, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    iget-wide v9, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheRefreshTimeout:J

    iget-object v11, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cachingEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    invoke-direct/range {v5 .. v11}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JJLcom/nimbusds/jose/util/events/EventListener;)V

    goto :goto_7

    .line 539
    :cond_11
    :goto_8
    new-instance v0, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;

    invoke-direct {v0, v6}, Lcom/nimbusds/jose/jwk/source/JWKSetBasedJWKSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    .line 540
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->failover:Lcom/nimbusds/jose/jwk/source/JWKSource;

    if-eqz v1, :cond_12

    .line 541
    new-instance v1, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;

    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->failover:Lcom/nimbusds/jose/jwk/source/JWKSource;

    invoke-direct {v1, v0, v2}, Lcom/nimbusds/jose/jwk/source/JWKSourceWithFailover;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSource;Lcom/nimbusds/jose/jwk/source/JWKSource;)V

    return-object v1

    :cond_12
    return-object v0
.end method

.method public cache(JJ)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 213
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    .line 214
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    .line 215
    iput-wide p3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheRefreshTimeout:J

    return-object p0
.end method

.method public cache(JJLcom/nimbusds/jose/util/events/EventListener;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 235
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    .line 236
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    .line 237
    iput-wide p3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheRefreshTimeout:J

    .line 238
    iput-object p5, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cachingEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-object p0
.end method

.method public cache(Z)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 197
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    return-object p0
.end method

.method public cacheForever()Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 249
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    const-wide v0, 0x7fffffffffffffffL

    .line 250
    iput-wide v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cacheTimeToLive:J

    const/4 v0, 0x0

    .line 251
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    return-object p0
.end method

.method public failover(Lcom/nimbusds/jose/jwk/source/JWKSource;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSource<",
            "TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 369
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->failover:Lcom/nimbusds/jose/jwk/source/JWKSource;

    return-object p0
.end method

.method public healthReporting(Lcom/nimbusds/jose/util/health/HealthReportListener;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/util/health/HealthReportListener<",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting<",
            "TC;>;TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 413
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;

    return-object p0
.end method

.method public outageTolerant(J)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 455
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    .line 456
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    return-object p0
.end method

.method public outageTolerant(JLcom/nimbusds/jose/util/events/EventListener;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/OutageTolerantJWKSetSource<",
            "TC;>;TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 474
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    .line 475
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    .line 476
    iput-object p3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-object p0
.end method

.method public outageTolerant(Z)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 427
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    return-object p0
.end method

.method public outageTolerantForever()Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 439
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageTolerant:Z

    const-wide v0, 0x7fffffffffffffffL

    .line 440
    iput-wide v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->outageCacheTimeToLive:J

    return-object p0
.end method

.method public rateLimited(J)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 336
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    .line 337
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->minTimeInterval:J

    return-object p0
.end method

.method public rateLimited(JLcom/nimbusds/jose/util/events/EventListener;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/RateLimitedJWKSetSource<",
            "TC;>;TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 354
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    .line 355
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->minTimeInterval:J

    .line 356
    iput-object p3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimitedEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-object p0
.end method

.method public rateLimited(Z)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 322
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->rateLimited:Z

    return-object p0
.end method

.method public refreshAheadCache(JZ)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 283
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    .line 284
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    .line 285
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadTime:J

    .line 286
    iput-boolean p3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadScheduled:Z

    return-object p0
.end method

.method public refreshAheadCache(JZLcom/nimbusds/jose/util/events/EventListener;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 305
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    .line 306
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    .line 307
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadTime:J

    .line 308
    iput-boolean p3, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAheadScheduled:Z

    .line 309
    iput-object p4, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->cachingEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-object p0
.end method

.method public refreshAheadCache(Z)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 266
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->caching:Z

    .line 268
    :cond_0
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->refreshAhead:Z

    return-object p0
.end method

.method public retrying(Lcom/nimbusds/jose/util/events/EventListener;)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/RetryingJWKSetSource<",
            "TC;>;TC;>;)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 398
    iput-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->retrying:Z

    .line 399
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->retryingEventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-object p0
.end method

.method public retrying(Z)Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder<",
            "TC;>;"
        }
    .end annotation

    .line 383
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/source/JWKSourceBuilder;->retrying:Z

    return-object p0
.end method
