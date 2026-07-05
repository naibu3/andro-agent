.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/billingclient/api/BillingResult;",
        "Ljava/util/List<",
        "+",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "billingResult",
        "Lcom/android/billingclient/api/BillingResult;",
        "purchaseHistoryRecords",
        "",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
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
.field final synthetic $onQueryHistoryCompleted:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onQueryHistoryFailed:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
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

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$onQueryHistoryCompleted:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$onQueryHistoryFailed:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 335
    check-cast p1, Lcom/android/billingclient/api/BillingResult;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->invoke(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 337
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 338
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 337
    invoke-static {p1, v0, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 341
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$onQueryHistoryCompleted:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    .line 345
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to retrieve purchase history. Purchase history for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " is null. "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 344
    :cond_1
    const-string p2, "Failed to retrieve purchase history. "

    .line 348
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;->$onQueryHistoryFailed:Lkotlin/jvm/functions/Function1;

    .line 349
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    .line 350
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v2

    .line 351
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v3, " "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 349
    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 348
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method
