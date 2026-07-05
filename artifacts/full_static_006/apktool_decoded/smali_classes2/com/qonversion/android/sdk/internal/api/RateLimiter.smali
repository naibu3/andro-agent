.class public final Lcom/qonversion/android/sdk/internal/api/RateLimiter;
.super Ljava/lang/Object;
.source "RateLimiter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRateLimiter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateLimiter.kt\ncom/qonversion/android/sdk/internal/api/RateLimiter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n766#2:55\n857#2,2:56\n*S KotlinDebug\n*F\n+ 1 RateLimiter.kt\ncom/qonversion/android/sdk/internal/api/RateLimiter\n*L\n45#1:55\n45#1:56,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0007H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
        "",
        "maxRequestsPerSecond",
        "",
        "(I)V",
        "requests",
        "",
        "Lcom/qonversion/android/sdk/internal/api/RequestType;",
        "",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;",
        "isRateLimitExceeded",
        "",
        "requestType",
        "hash",
        "removeOutdatedRequests",
        "",
        "saveRequest",
        "Request",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final maxRequestsPerSecond:I

.field private final requests:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/qonversion/android/sdk/internal/api/RequestType;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->maxRequestsPerSecond:I

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    return-void
.end method

.method private final declared-synchronized removeOutdatedRequests(Lcom/qonversion/android/sdk/internal/api/RequestType;)V
    .locals 10

    monitor-enter p0

    .line 42
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 43
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 44
    :cond_0
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    check-cast v2, Ljava/lang/Iterable;

    .line 55
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 56
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;

    .line 45
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;->getTimestamp()J

    move-result-wide v6

    sub-long v6, v0, v6

    const-wide/16 v8, 0x3e8

    cmp-long v6, v6, v8

    if-gez v6, :cond_1

    .line 56
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 57
    :cond_2
    check-cast v4, Ljava/util/List;

    .line 55
    check-cast v4, Ljava/util/Collection;

    .line 46
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 44
    invoke-interface {v3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized isRateLimitExceeded(Lcom/qonversion/android/sdk/internal/api/RequestType;I)Z
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "requestType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->removeOutdatedRequests(Lcom/qonversion/android/sdk/internal/api/RequestType;)V

    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;

    .line 30
    iget v4, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->maxRequestsPerSecond:I

    if-lt v1, v4, :cond_1

    goto :goto_2

    .line 34
    :cond_1
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;->getHash()I

    move-result v2

    if-ne v2, p2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toInt(Z)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    .line 37
    :cond_3
    :goto_2
    iget p1, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->maxRequestsPerSecond:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, p1, :cond_4

    move v0, v3

    :cond_4
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized saveRequest(Lcom/qonversion/android/sdk/internal/api/RequestType;I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "requestType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 14
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 15
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    :cond_0
    new-instance v2, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;

    invoke-direct {v2, p2, v0, v1}, Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;-><init>(IJ)V

    .line 19
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->requests:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
