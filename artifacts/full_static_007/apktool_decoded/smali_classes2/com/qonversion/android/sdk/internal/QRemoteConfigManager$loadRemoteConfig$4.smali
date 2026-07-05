.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;
.super Ljava/lang/Object;
.source "QRemoteConfigManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
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
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4",
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
.field final synthetic $contextKey:Ljava/lang/String;

.field final synthetic $loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$contextKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 6

    .line 92
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getRemoteConfigService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$contextKey:Ljava/lang/String;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$contextKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;)V

    check-cast v2, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method
