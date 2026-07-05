.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->invoke(Ljava/util/List;)V
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
        "com/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1",
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
.field final synthetic $historyRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->$historyRecords:Ljava/util/List;

    .line 420
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 427
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->$historyRecords:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$calculateRestorePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    .line 430
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :goto_0
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 1

    const-string v0, "launchResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 423
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getPermissions$sdk_release()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$executeRestoreBlocksOnSuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/Map;)V

    return-void
.end method
