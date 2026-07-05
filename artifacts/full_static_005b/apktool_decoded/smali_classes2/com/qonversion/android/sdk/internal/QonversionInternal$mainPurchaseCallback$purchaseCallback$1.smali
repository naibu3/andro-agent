.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;
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
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    .line 399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 1
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

    .line 401
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V
    .locals 0
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

    .line 399
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback$DefaultImpls;->onSuccess(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    return-void
.end method
