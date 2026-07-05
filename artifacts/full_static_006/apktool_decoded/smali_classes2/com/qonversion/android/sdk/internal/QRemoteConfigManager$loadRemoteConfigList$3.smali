.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;
.super Ljava/lang/Object;
.source "QRemoteConfigManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3",
        "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;",
        "onComplete",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 5

    .line 160
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getRemoteConfigService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getRemoteConfigListCallbackWrapper(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->loadRemoteConfigs(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method
