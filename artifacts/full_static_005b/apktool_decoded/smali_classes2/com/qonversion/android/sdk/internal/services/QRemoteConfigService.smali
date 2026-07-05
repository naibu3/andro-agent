.class public final Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
.super Ljava/lang/Object;
.source "QRemoteConfigService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0015J$\u0010\u0014\u001a\u00020\u00062\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
        "",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;)V",
        "attachUserToExperiment",
        "",
        "experimentId",
        "",
        "groupId",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "loadRemoteConfig",
        "contextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "loadRemoteConfigs",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "",
        "includeEmptyContextKey",
        "",
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
.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    return-void
.end method


# virtual methods
.method public final attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 1

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public final attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 1

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public final detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 1

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public final detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 1

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public final loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method

.method public final loadRemoteConfigs(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public final loadRemoteConfigs(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method
