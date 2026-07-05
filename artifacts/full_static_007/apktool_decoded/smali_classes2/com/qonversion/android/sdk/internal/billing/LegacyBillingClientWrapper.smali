.class public final Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
.super Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;
.source "LegacyBillingClientWrapper.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper<",
        "Ljava/lang/String;",
        "Lcom/android/billingclient/api/SkuDetails;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLegacyBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyBillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n819#2:230\n847#2,2:231\n1855#2,2:234\n1#3:233\n*S KotlinDebug\n*F\n+ 1 LegacyBillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper\n*L\n25#1:230\n25#1:231,2\n223#1:234,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u00012\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004H\u0016JV\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00120\u00142!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001a\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u001b\u0012\u0004\u0012\u00020\u00120\u0014H\u0016JH\u0010\u001c\u001a\u00020\u00122\u0010\u0010\u001d\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0018\u0010 \u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J(\u0010!\u001a\u00020\u00122\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u001e2\u0010\u0010#\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u001eH\u0002J^\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010\u00032\u0008\u0010*\u001a\u0004\u0018\u00010+2\u0008\u0010,\u001a\u0004\u0018\u00010-2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0016\u00a2\u0006\u0002\u0010.J2\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001a2 \u00101\u001a\u001c\u0012\u0004\u0012\u000203\u0012\u000c\u0012\n\u0012\u0004\u0012\u000204\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001202H\u0016J,\u00105\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020(2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u001202H\u0016JT\u00106\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00120\u00142\'\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002070\u001e\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(8\u0012\u0004\u0012\u00020\u00120\u0014H\u0016JP\u00109\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00032\u0010\u0010#\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u001e2\u0018\u0010 \u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0002JK\u0010:\u001a\u00020\u00122\u0010\u0010;\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u001e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00120\u00142\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00120=H\u0016R$\u0010\u000b\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u000cX\u0082\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\r\u0010\u000e\u00a8\u0006>"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyStoreId;",
        "Lcom/android/billingclient/api/SkuDetails;",
        "billingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "skuDetails",
        "",
        "getSkuDetails$annotations",
        "()V",
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
        "onQuerySkuFailed",
        "onQuerySkuCompleted",
        "logSkuDetails",
        "skuDetailsList",
        "skuList",
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
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "queryPurchaseHistoryForProduct",
        "queryPurchases",
        "Lcom/android/billingclient/api/Purchase;",
        "purchases",
        "querySkuDetailsAsync",
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


# instance fields
.field private skuDetails:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/android/billingclient/api/SkuDetails;",
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

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 18
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getSkuDetails$p(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)Ljava/util/Map;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$logSkuDetails(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->logSkuDetails(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$querySkuDetailsAsync(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$setSkuDetails$p(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/Map;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    return-void
.end method

.method private static synthetic getSkuDetails$annotations()V
    .locals 0

    return-void
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
            "+",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 156
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$loadProducts$1;

    invoke-direct {v0, p1, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$loadProducts$1;-><init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const-string p3, "subs"

    invoke-direct {p0, p3, p1, v0, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final logSkuDetails(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 222
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

    .line 234
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/SkuDetails;

    .line 224
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "querySkuDetailsAsync() -> "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 235
    :cond_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v1, :cond_3

    .line 226
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "querySkuDetailsAsync() -> SkuDetails list for "

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

.method private final querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
            "+",
            "Lcom/android/billingclient/api/SkuDetails;",
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

    .line 189
    invoke-static {}, Lcom/android/billingclient/api/SkuDetailsParams;->newBuilder()Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object v0

    .line 190
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setType(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object p1

    .line 191
    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setSkusList(Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object p1

    .line 192
    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->build()Lcom/android/billingclient/api/SkuDetailsParams;

    move-result-object v1

    const-string p1, "build(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object p1

    new-instance v6, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$querySkuDetailsAsync$1;

    move-object v0, v6

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$querySkuDetailsAsync$1;-><init>(Lcom/android/billingclient/api/SkuDetailsParams;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v6}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public getStoreData(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;
    .locals 1

    const-string v0, "storeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method public bridge synthetic getStoreData(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getStoreData(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;

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

    .line 134
    const-string v0, "storeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFailed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/SkuDetails;

    if-eqz v0, :cond_0

    .line 135
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    move-result-object p2

    const-string v0, "getType(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;->fromSkuType(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 139
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$getStoreProductType$2;

    invoke-direct {v1, p2, p1, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$getStoreProductType$2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2, v1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->loadProducts(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V
    .locals 1
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

    const-string p3, "activity"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "product"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "onFailed"

    invoke-static {p6, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 55
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p3

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object p4

    new-instance p6, Ljava/lang/StringBuilder;

    const-string v0, "makePurchase() -> Purchasing the sku: "

    invoke-direct {p6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p3, p4}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 57
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p3

    .line 58
    invoke-virtual {p3, p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p2

    const-string p3, "setSkuDetails(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0, p2, p5}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p2

    .line 58
    const-string p3, "build(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)V

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

    .line 92
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistory$1;

    invoke-direct {v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistory$1;-><init>(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function2;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Lkotlin/jvm/functions/Function2;)V
    .locals 2
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

    .line 70
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/SkuDetails;Lkotlin/jvm/functions/Function2;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

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

    .line 102
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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
            "Ljava/lang/String;",
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

    .line 25
    check-cast p1, Ljava/lang/Iterable;

    .line 230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 231
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    .line 25
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 231
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 232
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 26
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 27
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 31
    :cond_2
    new-instance p1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$withStoreDataLoaded$1;

    invoke-direct {p1, p0, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$withStoreDataLoaded$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function0;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->loadProducts(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
