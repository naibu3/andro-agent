.class public interface abstract Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;
.super Ljava/lang/Object;
.source "QonversionCallback.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "onSuccess",
        "",
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


# virtual methods
.method public abstract onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V
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
.end method
