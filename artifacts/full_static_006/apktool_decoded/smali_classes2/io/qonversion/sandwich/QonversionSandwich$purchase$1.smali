.class public final Lio/qonversion/sandwich/QonversionSandwich$purchase$1;
.super Ljava/lang/Object;
.source "QonversionSandwich.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/qonversion/sandwich/QonversionSandwich;->purchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "io/qonversion/sandwich/QonversionSandwich$purchase$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "products",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "sandwich_release"
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
.field final synthetic $applyOffer:Ljava/lang/Boolean;

.field final synthetic $contextKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $currentActivity:Landroid/app/Activity;

.field final synthetic $offerId:Ljava/lang/String;

.field final synthetic $oldProductId:Ljava/lang/String;

.field final synthetic $productId:Ljava/lang/String;

.field final synthetic $purchaseCallback:Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

.field final synthetic $updatePolicyKey:Ljava/lang/String;

.field final synthetic this$0:Lio/qonversion/sandwich/QonversionSandwich;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/qonversion/sandwich/QonversionSandwich;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Landroid/app/Activity;Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/qonversion/sandwich/QonversionSandwich;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/app/Activity;",
            "Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$productId:Ljava/lang/String;

    iput-object p2, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$oldProductId:Ljava/lang/String;

    iput-object p3, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->this$0:Lio/qonversion/sandwich/QonversionSandwich;

    iput-object p4, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$offerId:Ljava/lang/String;

    iput-object p5, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$applyOffer:Ljava/lang/Boolean;

    iput-object p6, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$updatePolicyKey:Ljava/lang/String;

    iput-object p7, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$contextKeys:Ljava/util/List;

    iput-object p8, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$currentActivity:Landroid/app/Activity;

    iput-object p9, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$purchaseCallback:Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$purchaseCallback:Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$productId:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 112
    iget-object v1, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$oldProductId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 113
    iget-object v1, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->this$0:Lio/qonversion/sandwich/QonversionSandwich;

    iget-object v2, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$offerId:Ljava/lang/String;

    iget-object v3, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$applyOffer:Ljava/lang/Boolean;

    iget-object v5, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$updatePolicyKey:Ljava/lang/String;

    iget-object v6, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$contextKeys:Ljava/util/List;

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lio/qonversion/sandwich/QonversionSandwich;->access$configurePurchaseOptions(Lio/qonversion/sandwich/QonversionSandwich;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 116
    sget-object p1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p1

    iget-object v2, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$currentActivity:Landroid/app/Activity;

    iget-object v3, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$purchaseCallback:Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    check-cast v3, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {p1, v2, v0, v1, v3}, Lcom/qonversion/android/sdk/Qonversion;->updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 118
    sget-object p1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p1

    iget-object v2, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$currentActivity:Landroid/app/Activity;

    iget-object v3, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$purchaseCallback:Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    check-cast v3, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {p1, v2, v0, v1, v3}, Lcom/qonversion/android/sdk/Qonversion;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    goto :goto_0

    .line 120
    :cond_1
    iget-object p1, p0, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;->$purchaseCallback:Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    new-instance v6, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6}, Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :goto_0
    return-void
.end method
