.class public Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;
.super Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;
.source "RefreshAheadCachingJWKSetSource.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$RefreshScheduledEvent;,
        Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$RefreshNotScheduledEvent;,
        Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$UnableToRefreshAheadOfExpirationEvent;,
        Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshCompletedEvent;,
        Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshInitiatedEvent;,
        Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshFailed;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private volatile cacheExpiration:J

.field private final eventListener:Lcom/nimbusds/jose/util/events/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final lazyLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final refreshAheadTime:J

.field private final scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

.field private scheduledRefreshFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private final shutdownExecutorOnClose:Z


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JJJZLcom/nimbusds/jose/util/events/EventListener;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;JJJZ",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;TC;>;)V"
        }
    .end annotation

    .line 189
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v9

    const/4 v10, 0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move-object/from16 v11, p9

    .line 188
    invoke-direct/range {v0 .. v11}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JJJZLjava/util/concurrent/ExecutorService;ZLcom/nimbusds/jose/util/events/EventListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JJJZLjava/util/concurrent/ExecutorService;ZLcom/nimbusds/jose/util/events/EventListener;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;JJJZ",
            "Ljava/util/concurrent/ExecutorService;",
            "Z",
            "Lcom/nimbusds/jose/util/events/EventListener<",
            "Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource<",
            "TC;>;TC;>;)V"
        }
    .end annotation

    move-wide/from16 v7, p6

    move-object/from16 v9, p9

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-object/from16 v6, p11

    .line 226
    invoke-direct/range {v0 .. v6}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;JJLcom/nimbusds/jose/util/events/EventListener;)V

    .line 152
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lazyLock:Ljava/util/concurrent/locks/ReentrantLock;

    add-long v10, v7, v4

    cmp-long p1, v10, p2

    if-gtz p1, :cond_1

    .line 234
    iput-wide v7, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->refreshAheadTime:J

    .line 236
    const-string p1, "The executor service must not be null"

    invoke-static {v9, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 237
    iput-object v9, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->executorService:Ljava/util/concurrent/ExecutorService;

    move/from16 p1, p10

    .line 239
    iput-boolean p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->shutdownExecutorOnClose:Z

    if-eqz p8, :cond_0

    .line 242
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 244
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    :goto_0
    move-object/from16 v6, p11

    .line 247
    iput-object v6, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-void

    .line 229
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "The sum of the refresh-ahead time ("

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "ms) and the cache refresh timeout ("

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "ms) must not exceed the time-to-lived time ("

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, "ms)"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    return-object p0
.end method

.method static synthetic access$302(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;J)J
    .locals 0

    .line 50
    iput-wide p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->cacheExpiration:J

    return-wide p1
.end method


# virtual methods
.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 435
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledRefreshFuture:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 437
    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 440
    :cond_0
    invoke-super {p0}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;->close()V

    .line 442
    iget-boolean v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->shutdownExecutorOnClose:Z

    if-eqz v0, :cond_1

    .line 443
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 445
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->getCacheRefreshTimeout()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 448
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 451
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_2

    .line 452
    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 454
    :try_start_1
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->getCacheRefreshTimeout()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 457
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    :goto_1
    return-void
.end method

.method public getExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 413
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->executorService:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 6
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

    .line 253
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->getCachedJWKSet()Lcom/nimbusds/jose/util/cache/CachedObject;

    move-result-object v1

    if-nez v1, :cond_0

    .line 255
    invoke-static {}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->noRefresh()Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->loadJWKSetBlocking(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p1

    return-object p1

    .line 258
    :cond_0
    invoke-virtual {v1}, Lcom/nimbusds/jose/util/cache/CachedObject;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nimbusds/jose/jwk/JWKSet;

    .line 259
    invoke-virtual {p1, v0}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->requiresRefresh(Lcom/nimbusds/jose/jwk/JWKSet;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 260
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->loadJWKSetBlocking(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p1

    return-object p1

    .line 263
    :cond_1
    invoke-virtual {v1, p2, p3}, Lcom/nimbusds/jose/util/cache/CachedObject;->isExpired(J)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 264
    invoke-static {v0}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->referenceComparison(Lcom/nimbusds/jose/jwk/JWKSet;)Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->loadJWKSetBlocking(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v2, 0x0

    move-object v0, p0

    move-wide v3, p2

    move-object v5, p4

    .line 267
    invoke-virtual/range {v0 .. v5}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->refreshAheadOfExpiration(Lcom/nimbusds/jose/util/cache/CachedObject;ZJLcom/nimbusds/jose/proc/SecurityContext;)V

    .line 269
    invoke-virtual {v1}, Lcom/nimbusds/jose/util/cache/CachedObject;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/jwk/JWKSet;

    return-object p1
.end method

.method getLazyLock()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lazyLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method getScheduledRefreshFuture()Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    .line 428
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledRefreshFuture:Ljava/util/concurrent/ScheduledFuture;

    return-object v0
.end method

.method loadJWKSetNotThreadSafe(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/util/cache/CachedObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;",
            "JTC;)",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 276
    invoke-super {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;->loadJWKSetNotThreadSafe(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/util/cache/CachedObject;

    move-result-object p1

    .line 278
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    .line 279
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduleRefreshAheadOfExpiration(Lcom/nimbusds/jose/util/cache/CachedObject;JLcom/nimbusds/jose/proc/SecurityContext;)V

    :cond_0
    return-object p1
.end method

.method lockedRefresh(Lcom/nimbusds/jose/util/cache/CachedObject;JLcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;JTC;)V"
        }
    .end annotation

    .line 367
    iget-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->cacheExpiration:J

    invoke-virtual {p1}, Lcom/nimbusds/jose/util/cache/CachedObject;->getExpirationTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 370
    invoke-virtual {p1}, Lcom/nimbusds/jose/util/cache/CachedObject;->getExpirationTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->cacheExpiration:J

    .line 374
    new-instance v2, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;

    move-object v4, p0

    move-object v3, p0

    move-wide v6, p2

    move-object v5, p4

    invoke-direct/range {v2 .. v7}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;-><init>(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;J)V

    .line 402
    iget-object p1, v3, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    move-object v3, p0

    return-void
.end method

.method refreshAheadOfExpiration(Lcom/nimbusds/jose/util/cache/CachedObject;ZJLcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;ZJTC;)V"
        }
    .end annotation

    .line 339
    iget-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->refreshAheadTime:J

    add-long/2addr v0, p3

    invoke-virtual {p1, v0, v1}, Lcom/nimbusds/jose/util/cache/CachedObject;->isExpired(J)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    .line 344
    :cond_0
    iget-wide v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->cacheExpiration:J

    invoke-virtual {p1}, Lcom/nimbusds/jose/util/cache/CachedObject;->getExpirationTime()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-gez p2, :cond_1

    .line 346
    iget-object p2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lazyLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 348
    :try_start_0
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lockedRefresh(Lcom/nimbusds/jose/util/cache/CachedObject;JLcom/nimbusds/jose/proc/SecurityContext;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    iget-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lazyLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lazyLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 351
    throw p1

    :cond_1
    return-void
.end method

.method scheduleRefreshAheadOfExpiration(Lcom/nimbusds/jose/util/cache/CachedObject;JLcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/util/cache/CachedObject<",
            "Lcom/nimbusds/jose/jwk/JWKSet;",
            ">;JTC;)V"
        }
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledRefreshFuture:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 292
    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 297
    :cond_0
    invoke-virtual {p1}, Lcom/nimbusds/jose/util/cache/CachedObject;->getExpirationTime()J

    move-result-wide v0

    sub-long/2addr v0, p2

    iget-wide p2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->refreshAheadTime:J

    sub-long/2addr v0, p2

    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->getCacheRefreshTimeout()J

    move-result-wide p2

    sub-long/2addr v0, p2

    const-wide/16 p2, 0x0

    cmp-long p2, v0, p2

    if-lez p2, :cond_1

    .line 300
    new-instance p2, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;

    invoke-direct {p2, p0, p1, p4, p0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;-><init>(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/util/cache/CachedObject;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)V

    .line 315
    iget-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, v0, v1, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduledRefreshFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 317
    iget-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    if-eqz p1, :cond_2

    .line 318
    new-instance p2, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$RefreshScheduledEvent;

    invoke-direct {p2, p0, p4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$RefreshScheduledEvent;-><init>(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    invoke-interface {p1, p2}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    return-void

    .line 322
    :cond_1
    iget-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->eventListener:Lcom/nimbusds/jose/util/events/EventListener;

    if-eqz p1, :cond_2

    .line 323
    new-instance p2, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$RefreshNotScheduledEvent;

    invoke-direct {p2, p0, p4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$RefreshNotScheduledEvent;-><init>(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    invoke-interface {p1, p2}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    :cond_2
    return-void
.end method
