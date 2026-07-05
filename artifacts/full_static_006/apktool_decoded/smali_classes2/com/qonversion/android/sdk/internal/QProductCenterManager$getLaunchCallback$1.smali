.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getLaunchCallback(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
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
        "com/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 728
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 751
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setLaunchError$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 753
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$handlePendingRequests(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 755
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$loadStoreProductsIfPossible(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 757
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 3

    const-string v0, "launchResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 730
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 732
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setLaunchError$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 734
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    .line 736
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$loadStoreProductsIfPossible(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 738
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 739
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->saveHandledPurchases(Ljava/util/Collection;)V

    .line 741
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->consumePurchases(Ljava/util/List;)V

    .line 742
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V

    .line 745
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$handleCachedPurchases(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 747
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    :cond_1
    return-void
.end method
