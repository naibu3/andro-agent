.class public final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
.super Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;
.source "BillingClientWrapper.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper<",
        "Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;",
        "Lcom/android/billingclient/api/ProductDetails;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/BillingClientWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1549#2:295\n1620#2,3:296\n819#2:299\n847#2,2:300\n1549#2:302\n1620#2,3:303\n1855#2,2:307\n1#3:306\n*S KotlinDebug\n*F\n+ 1 BillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/BillingClientWrapper\n*L\n33#1:295\n33#1:296,3\n35#1:299\n35#1:300,2\n245#1:302\n245#1:303,3\n279#1:307,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0016JV\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00100\u00122!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0018\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\u00100\u0012H\u0016JD\u0010\u001a\u001a\u00020\u00102\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001c2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0004\u0012\u00020\u00100\u0012H\u0002J$\u0010\u001e\u001a\u00020\u00102\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001c2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001cH\u0002J^\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010\u000c2\u0008\u0010&\u001a\u0004\u0018\u00010\'2\u0008\u0010(\u001a\u0004\u0018\u00010)2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00100\u0012H\u0016\u00a2\u0006\u0002\u0010*JL\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u000c2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001c2\u0018\u0010-\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0004\u0012\u00020\u00100\u00122\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012H\u0002J2\u0010/\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00182 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u000201\u0012\u000c\u0012\n\u0012\u0004\u0012\u000202\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001000H\u0016J,\u00103\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001000H\u0016JT\u00104\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00100\u00122\'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002050\u001c\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u00100\u0012H\u0016JG\u00107\u001a\u00020\u00102\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00100\u00122\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00100:H\u0016J\u0016\u0010&\u001a\u00020;*\u00020;2\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;",
        "Lcom/android/billingclient/api/ProductDetails;",
        "billingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "productDetails",
        "",
        "",
        "getStoreData",
        "storeId",
        "getStoreProductType",
        "",
        "onFailed",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lkotlin/ParameterName;",
        "name",
        "error",
        "onSuccess",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "type",
        "loadProducts",
        "productIds",
        "",
        "onCompleted",
        "logProductDetails",
        "productDetailsList",
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
        "queryProductDetailsAsync",
        "productType",
        "onQuerySkuCompleted",
        "onQuerySkuFailed",
        "queryPurchaseHistory",
        "Lkotlin/Function2;",
        "Lcom/android/billingclient/api/BillingResult;",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "queryPurchaseHistoryForProduct",
        "queryPurchases",
        "Lcom/android/billingclient/api/Purchase;",
        "purchases",
        "withStoreDataLoaded",
        "storeIds",
        "onReady",
        "Lkotlin/Function0;",
        "Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;",
        "offer",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
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
.field private productDetails:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    const-string v0, "billingClientHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 26
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->productDetails:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getProductDetails$p(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;)Ljava/util/Map;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->productDetails:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$logProductDetails(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->logProductDetails(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$queryProductDetailsAsync(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->queryProductDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$setProductDetails$p(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/Map;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->productDetails:Ljava/util/Map;

    return-void
.end method

.method private final applyOffer(Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;
    .locals 0

    if-eqz p2, :cond_0

    .line 289
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferToken()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->setOfferToken(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    :cond_0
    return-object p1
.end method

.method private final loadProducts(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 215
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;

    invoke-direct {v0, p1, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;-><init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const-string p3, "subs"

    invoke-direct {p0, p3, p1, v0, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->queryProductDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final logProductDetails(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 278
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    .line 307
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/ProductDetails;

    .line 280
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "queryProductDetailsAsync() -> "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 308
    :cond_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v1, :cond_3

    .line 282
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "queryProductDetailsAsync() -> ProductDetails list for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " is empty."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->warn(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private static final makePurchase$fireError(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 62
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final queryProductDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 245
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .line 302
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 303
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 304
    check-cast v2, Ljava/lang/String;

    .line 246
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;->newBuilder()Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;

    move-result-object v3

    .line 247
    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;->setProductId(Ljava/lang/String;)Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;

    move-result-object v2

    .line 248
    invoke-virtual {v2, p1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;

    move-result-object v2

    .line 249
    invoke-virtual {v2}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;->build()Lcom/android/billingclient/api/QueryProductDetailsParams$Product;

    move-result-object v2

    .line 304
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 305
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 252
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams;->newBuilder()Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;

    move-result-object p1

    .line 253
    invoke-virtual {p1, v1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;->setProductList(Ljava/util/List;)Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;

    move-result-object p1

    .line 254
    invoke-virtual {p1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;->build()Lcom/android/billingclient/api/QueryProductDetailsParams;

    move-result-object v1

    const-string p1, "build(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object p1

    new-instance v6, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;

    move-object v0, v6

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;-><init>(Lcom/android/billingclient/api/QueryProductDetailsParams;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v6}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public getStoreData(Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;)Lcom/android/billingclient/api/ProductDetails;
    .locals 1

    const-string v0, "storeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->productDetails:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;->getProductId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/ProductDetails;

    return-object p1
.end method

.method public bridge synthetic getStoreData(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getStoreData(Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;)Lcom/android/billingclient/api/ProductDetails;

    move-result-object p1

    return-object p1
.end method

.method public getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
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

    .line 193
    const-string v0, "storeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFailed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->productDetails:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/ProductDetails;

    if-eqz v0, :cond_0

    .line 194
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails;->getProductType()Ljava/lang/String;

    move-result-object p2

    const-string v0, "getProductType(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;->fromProductType(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 198
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$getStoreProductType$2;

    invoke-direct {v1, p2, p1, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$getStoreProductType$2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->loadProducts(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V
    .locals 5
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

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFailed"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object v0

    if-nez v0, :cond_0

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 67
    new-instance p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    const/4 p2, 0x4

    .line 69
    const-string p3, "Store details not found for purchase"

    .line 67
    invoke-direct {p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 66
    invoke-interface {p6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 75
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v1

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "makePurchase() -> Purchasing the product: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p2, 0x0

    goto/16 :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 79
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_3

    .line 80
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object p3

    if-nez p3, :cond_2

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 81
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Failed to find base plan offer for Qonversion product "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p6, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->makePurchase$fireError(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    return-void

    :cond_2
    move-object p2, p3

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_5

    .line 85
    move-object p4, p3

    check-cast p4, Ljava/lang/CharSequence;

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_5

    .line 86
    invoke-virtual {v0, p3}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->findOffer(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object p4

    if-nez p4, :cond_4

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 87
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Failed to find offer "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, " for Qonversion product "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p6, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->makePurchase$fireError(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    return-void

    :cond_4
    move-object p2, p4

    goto :goto_0

    .line 92
    :cond_5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object p3

    if-nez p3, :cond_2

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 93
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "No offer found for purchasing Qonversion subscription product "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p6, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->makePurchase$fireError(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    return-void

    .line 99
    :goto_0
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    move-result-object p3

    .line 100
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getOriginalProductDetails()Lcom/android/billingclient/api/ProductDetails;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->setProductDetails(Lcom/android/billingclient/api/ProductDetails;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    move-result-object p3

    const-string p4, "setProductDetails(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-direct {p0, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->applyOffer(Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    move-result-object p2

    .line 102
    invoke-virtual {p2}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;

    move-result-object p2

    .line 100
    const-string p3, "build(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p4

    .line 105
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p4, p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setProductDetailsParamsList(Ljava/util/List;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p2

    const-string p4, "setProductDetailsParamsList(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0, p2, p5}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p2

    .line 107
    invoke-virtual {p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p2

    .line 105
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)V

    return-void
.end method

.method public queryPurchaseHistory(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function2;)V
    .locals 2
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

    const-string v0, "productType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1;

    invoke-direct {v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1;-><init>(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function2;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Lkotlin/jvm/functions/Function2;)V
    .locals 3
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

    const-string v0, "product"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 117
    :cond_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getOriginalProductDetails()Lcom/android/billingclient/api/ProductDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails;->getProductType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getProductType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v1

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;

    invoke-direct {v2, p0, p1, v0, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public queryPurchases(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
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

    const-string v0, "onFailed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public withStoreDataLoaded(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;",
            ">;",
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

    const-string v0, "storeIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFailed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReady"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    check-cast p1, Ljava/lang/Iterable;

    .line 295
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 296
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 297
    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;

    .line 33
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;->getProductId()Ljava/lang/String;

    move-result-object v1

    .line 297
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 298
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 35
    check-cast v0, Ljava/lang/Iterable;

    .line 299
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 300
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    .line 35
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->productDetails:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 300
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 301
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 36
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 37
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 41
    :cond_3
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$withStoreDataLoaded$1;

    invoke-direct {v0, p0, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$withStoreDataLoaded$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p1, p2, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->loadProducts(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
