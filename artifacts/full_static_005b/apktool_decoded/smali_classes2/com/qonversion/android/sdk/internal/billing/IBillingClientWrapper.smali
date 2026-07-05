.class public interface abstract Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;
.super Ljava/lang/Object;
.source "IBillingClientWrapper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<StoreId:",
        "Ljava/lang/Object;",
        "StoreData:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008`\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u0000*\u0006\u0008\u0001\u0010\u0002 \u00012\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJV\u0010\u000c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u00050\u000eH&J`\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00050\u000eH&\u00a2\u0006\u0002\u0010 J2\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00142 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020%\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010&\u0012\u0004\u0012\u00020\u00050$H&J,\u0010(\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00050$H&JT\u0010)\u001a\u00020\u00052!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00050\u000e2\'\u0010#\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020*0&\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(+\u0012\u0004\u0012\u00020\u00050\u000eH&JG\u0010,\u001a\u00020\u00052\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000&2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00050\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00050/H&\u00a8\u00060"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "StoreId",
        "StoreData",
        "",
        "acknowledge",
        "",
        "purchaseToken",
        "",
        "consume",
        "getStoreData",
        "storeId",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "getStoreProductType",
        "onFailed",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lkotlin/ParameterName;",
        "name",
        "error",
        "onSuccess",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "type",
        "makePurchase",
        "activity",
        "Landroid/app/Activity;",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "offerId",
        "applyOffer",
        "",
        "updatePurchaseInfo",
        "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V",
        "queryPurchaseHistory",
        "productType",
        "onCompleted",
        "Lkotlin/Function2;",
        "Lcom/android/billingclient/api/BillingResult;",
        "",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "queryPurchaseHistoryForProduct",
        "queryPurchases",
        "Lcom/android/billingclient/api/Purchase;",
        "purchases",
        "withStoreDataLoaded",
        "storeIds",
        "onReady",
        "Lkotlin/Function0;",
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
.method public abstract acknowledge(Ljava/lang/String;)V
.end method

.method public abstract consume(Ljava/lang/String;)V
.end method

.method public abstract getStoreData(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStoreId;)TStoreData;"
        }
    .end annotation
.end method

.method public abstract getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract queryPurchaseHistory(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/android/billingclient/api/BillingResult;",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Lkotlin/jvm/functions/Function2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/android/billingclient/api/BillingResult;",
            "-",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract queryPurchases(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract withStoreDataLoaded(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TStoreId;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
