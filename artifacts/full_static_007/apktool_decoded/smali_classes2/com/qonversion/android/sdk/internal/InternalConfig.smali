.class public final Lcom/qonversion/android/sdk/internal/InternalConfig;
.super Ljava/lang/Object;
.source "InternalConfig.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/provider/EnvironmentProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/PrimaryConfigProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/UidProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/EntitlementsUpdateListenerProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00011B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u001f\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR*\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\'R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\'R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R&\u0010-\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00118V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010\u0013\"\u0004\u0008/\u00100\u00a8\u00062"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "Lcom/qonversion/android/sdk/internal/provider/EnvironmentProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/PrimaryConfigProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/UidProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/EntitlementsUpdateListenerProvider;",
        "qonversionConfig",
        "Lcom/qonversion/android/sdk/QonversionConfig;",
        "(Lcom/qonversion/android/sdk/QonversionConfig;)V",
        "primaryConfig",
        "Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;",
        "cacheConfig",
        "Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "apiUrl",
        "",
        "getApiUrl",
        "()Ljava/lang/String;",
        "getCacheConfig",
        "()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "getEntitlementsUpdateListener",
        "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "setEntitlementsUpdateListener",
        "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "environment",
        "Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "getEnvironment",
        "()Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "<set-?>",
        "Lcom/qonversion/android/sdk/internal/HttpError;",
        "fatalError",
        "getFatalError",
        "()Lcom/qonversion/android/sdk/internal/HttpError;",
        "setFatalError",
        "(Lcom/qonversion/android/sdk/internal/HttpError;)V",
        "isAnalyticsMode",
        "",
        "()Z",
        "isSandbox",
        "getPrimaryConfig",
        "()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;",
        "setPrimaryConfig",
        "(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;)V",
        "uid",
        "getUid",
        "setUid",
        "(Ljava/lang/String;)V",
        "Companion",
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


# static fields
.field private static final BASE_URL:Ljava/lang/String; = "https://api.qonversion.io/"

.field public static final Companion:Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;


# instance fields
.field private final cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

.field private entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

.field private volatile fatalError:Lcom/qonversion/android/sdk/internal/HttpError;

.field private primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

.field private volatile uid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/InternalConfig;->Companion:Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/QonversionConfig;)V
    .locals 2

    const-string v0, "qonversionConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getPrimaryConfig$sdk_release()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getCacheConfig$sdk_release()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    move-result-object v1

    .line 39
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getEntitlementsUpdateListener$sdk_release()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    move-result-object p1

    .line 36
    invoke-direct {p0, v0, v1, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;-><init>(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1

    const-string v0, "primaryConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 18
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 19
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 32
    const-string p1, ""

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->uid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getApiUrl()Ljava/lang/String;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getProxyUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "https://api.qonversion.io/"

    :cond_0
    return-object v0
.end method

.method public getCacheConfig()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    return-object v0
.end method

.method public getEntitlementsUpdateListener()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    return-object v0
.end method

.method public getEnvironment()Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getEnvironment()Lcom/qonversion/android/sdk/dto/QEnvironment;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized getFatalError()Lcom/qonversion/android/sdk/internal/HttpError;
    .locals 1

    monitor-enter p0

    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->fatalError:Lcom/qonversion/android/sdk/internal/HttpError;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    return-object v0
.end method

.method public declared-synchronized getUid()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->uid:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final isAnalyticsMode()Z
    .locals 2

    .line 50
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getLaunchMode()Lcom/qonversion/android/sdk/dto/QLaunchMode;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/dto/QLaunchMode;->Analytics:Lcom/qonversion/android/sdk/dto/QLaunchMode;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSandbox()Z
    .locals 2

    .line 48
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getEnvironment()Lcom/qonversion/android/sdk/dto/QEnvironment;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    return-void
.end method

.method public final declared-synchronized setFatalError(Lcom/qonversion/android/sdk/internal/HttpError;)V
    .locals 0

    monitor-enter p0

    .line 28
    :try_start_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->fatalError:Lcom/qonversion/android/sdk/internal/HttpError;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method public setPrimaryConfig(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    return-void
.end method

.method public declared-synchronized setUid(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->uid:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
