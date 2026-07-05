.class public final Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;
.super Ljava/lang/Object;
.source "WeakMapInjectorRegistry.kt"

# interfaces
.implements Lcom/stripe/android/core/injection/InjectorRegistry;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeakMapInjectorRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMapInjectorRegistry.kt\ncom/stripe/android/core/injection/WeakMapInjectorRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n295#2,2:58\n*S KotlinDebug\n*F\n+ 1 WeakMapInjectorRegistry.kt\ncom/stripe/android/core/injection/WeakMapInjectorRegistry\n*L\n41#1:58,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0007H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0017J\u0006\u0010\u0018\u001a\u00020\u0011R(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\u0003\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;",
        "Lcom/stripe/android/core/injection/InjectorRegistry;",
        "<init>",
        "()V",
        "staticCacheMap",
        "Ljava/util/WeakHashMap;",
        "Lcom/stripe/android/core/injection/Injector;",
        "",
        "getStaticCacheMap$annotations",
        "getStaticCacheMap",
        "()Ljava/util/WeakHashMap;",
        "CURRENT_REGISTER_KEY",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "getCURRENT_REGISTER_KEY$annotations",
        "getCURRENT_REGISTER_KEY",
        "()Ljava/util/concurrent/atomic/AtomicInteger;",
        "register",
        "",
        "injector",
        "key",
        "retrieve",
        "injectorKey",
        "nextKey",
        "prefix",
        "clear",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CURRENT_REGISTER_KEY:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

.field private static final staticCacheMap:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lcom/stripe/android/core/injection/Injector;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    invoke-direct {v0}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;-><init>()V

    sput-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    .line 24
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->staticCacheMap:Ljava/util/WeakHashMap;

    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->CURRENT_REGISTER_KEY:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getCURRENT_REGISTER_KEY$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getStaticCacheMap$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 52
    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->staticCacheMap:Ljava/util/WeakHashMap;

    monitor-enter v0

    .line 53
    :try_start_0
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 54
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final getCURRENT_REGISTER_KEY()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 30
    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->CURRENT_REGISTER_KEY:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public final getStaticCacheMap()Ljava/util/WeakHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/WeakHashMap<",
            "Lcom/stripe/android/core/injection/Injector;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 22
    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->staticCacheMap:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method public nextKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
    .end annotation

    const-string v0, "prefix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->CURRENT_REGISTER_KEY:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized register(Lcom/stripe/android/core/injection/Injector;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "injector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->staticCacheMap:Ljava/util/WeakHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
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

.method public declared-synchronized retrieve(Ljava/lang/String;)Lcom/stripe/android/core/injection/Injector;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "injectorKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    sget-object v0, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->staticCacheMap:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "<get-entries>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    .line 42
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 41
    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    .line 43
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/core/injection/Injector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :cond_2
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
