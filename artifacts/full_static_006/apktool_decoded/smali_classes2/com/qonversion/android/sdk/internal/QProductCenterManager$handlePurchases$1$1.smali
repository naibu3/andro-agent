.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePurchases(Ljava/util/List;)V
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
        "com/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1",
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
.field final synthetic $product:Lcom/qonversion/android/sdk/dto/products/QProduct;

.field final synthetic $purchase:Lcom/android/billingclient/api/Purchase;

.field final synthetic $purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

.field final synthetic $purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 1029
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1045
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$storeFailedPurchaseIfNecessary(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V

    .line 1047
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 1049
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1050
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 1051
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    .line 1052
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 1050
    invoke-static {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$calculatePurchasePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_1

    .line 1056
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 2

    const-string v0, "launchResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1031
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 1033
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getPermissions$sdk_release()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 1035
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 1036
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    move-object v1, p0

    check-cast v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;

    .line 1037
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInternalConfig$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/InternalConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getEntitlementsUpdateListener()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;->onEntitlementsUpdated(Ljava/util/Map;)V

    .line 1041
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    move-result-object p1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->saveHandledPurchase(Lcom/android/billingclient/api/Purchase;)V

    return-void
.end method
