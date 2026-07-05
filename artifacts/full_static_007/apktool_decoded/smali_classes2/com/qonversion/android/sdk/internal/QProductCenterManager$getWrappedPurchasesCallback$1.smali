.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getWrappedPurchasesCallback(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQProductCenterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1124:1\n1855#2,2:1125\n*S KotlinDebug\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1\n*L\n715#1:1125,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1",
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
.field final synthetic $outerCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $trackingPurchases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->$trackingPurchases:Ljava/util/List;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->$outerCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 712
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 722
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->$outerCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 3

    const-string v0, "launchResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 714
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->$trackingPurchases:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->saveHandledPurchases(Ljava/util/Collection;)V

    .line 715
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->$trackingPurchases:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 1125
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    .line 716
    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    goto :goto_0

    .line 718
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;->$outerCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    return-void
.end method
