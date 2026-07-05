.class public final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1;
.super Ljava/lang/Object;
.source "QUserPropertiesManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
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
        "com/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "launchResult",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
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
.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryPropertiesRequest()V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 1

    const-string v0, "launchResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryPropertiesRequest()V

    return-void
.end method
