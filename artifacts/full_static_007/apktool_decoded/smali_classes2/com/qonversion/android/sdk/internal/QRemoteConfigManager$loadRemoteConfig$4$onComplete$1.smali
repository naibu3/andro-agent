.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;
.super Ljava/lang/Object;
.source "QRemoteConfigManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "remoteConfig",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
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
.field final synthetic $contextKey:Ljava/lang/String;

.field final synthetic $loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$1;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$1;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getFallbackData(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/dto/QFallbackObject;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getRemoteConfigList()Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 109
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 110
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigForEmptyContextKey()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v0

    goto :goto_0

    .line 112
    :cond_2
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigForContextKey(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    .line 116
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 115
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    .line 117
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    return-void

    .line 104
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    move-object v2, p0

    check-cast v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;

    .line 105
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$baseRemoteConfigList$1$1;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$baseRemoteConfigList$1$1;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V
    .locals 3

    const-string v0, "remoteConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 95
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
