.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;
.super Ljava/lang/Object;
.source "QonversionInternal.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016J$\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "entitlements",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "purchase",
        "Lcom/android/billingclient/api/Purchase;",
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
.field final synthetic $purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 410
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onError$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onError$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    const-string v0, "entitlements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Ljava/util/Map;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;",
            "Lcom/android/billingclient/api/Purchase;",
            ")V"
        }
    .end annotation

    const-string v0, "entitlements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    invoke-direct {v1, v2, p1, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
