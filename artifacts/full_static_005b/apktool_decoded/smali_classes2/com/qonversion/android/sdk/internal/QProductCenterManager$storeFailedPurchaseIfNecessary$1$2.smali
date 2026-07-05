.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QProductCenterManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "type",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;->$purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1078
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;->invoke(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1081
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;->$purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    :cond_0
    return-void
.end method
