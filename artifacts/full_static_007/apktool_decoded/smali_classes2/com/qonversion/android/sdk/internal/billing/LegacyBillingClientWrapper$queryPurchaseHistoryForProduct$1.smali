.class final Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LegacyBillingClientWrapper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Lkotlin/jvm/functions/Function2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/android/billingclient/api/BillingClient;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLegacyBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyBillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n288#2,2:230\n*S KotlinDebug\n*F\n+ 1 LegacyBillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1\n*L\n81#1:230,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/android/billingclient/api/BillingClient;",
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
.field final synthetic $onCompleted:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/android/billingclient/api/BillingResult;",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $skuDetails:Lcom/android/billingclient/api/SkuDetails;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;


# direct methods
.method public static synthetic $r8$lambda$xCEWa3C6UGm3UCyRrRRJQx-t8bs(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/SkuDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->invoke$lambda$1(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/SkuDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/SkuDetails;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
            "Lcom/android/billingclient/api/SkuDetails;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/android/billingclient/api/BillingResult;",
            "-",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$skuDetails:Lcom/android/billingclient/api/SkuDetails;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$onCompleted:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$1(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/SkuDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 5

    const-string v0, "$onCompleted"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$skuDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    .line 81
    check-cast p3, Ljava/lang/Iterable;

    .line 230
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 81
    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getSkus()Ljava/util/ArrayList;

    move-result-object v2

    const-string v4, "getSkus(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 231
    :cond_1
    check-cast v0, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 79
    :cond_2
    invoke-interface {p0, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 72
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 5

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$skuDetails:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v1}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$skuDetails:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "queryPurchaseHistoryForProduct() -> Querying purchase history for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " with type "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$skuDetails:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$onCompleted:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$skuDetails:Lcom/android/billingclient/api/SkuDetails;

    new-instance v3, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/SkuDetails;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/BillingClient;->queryPurchaseHistoryAsync(Ljava/lang/String;Lcom/android/billingclient/api/PurchaseHistoryResponseListener;)V

    return-void
.end method
