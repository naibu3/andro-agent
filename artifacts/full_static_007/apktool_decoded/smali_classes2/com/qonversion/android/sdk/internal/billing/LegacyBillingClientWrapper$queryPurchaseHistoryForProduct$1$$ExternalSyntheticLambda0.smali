.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/PurchaseHistoryResponseListener;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$1:Lcom/android/billingclient/api/SkuDetails;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/SkuDetails;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$1:Lcom/android/billingclient/api/SkuDetails;

    return-void
.end method


# virtual methods
.method public final onPurchaseHistoryResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$1:Lcom/android/billingclient/api/SkuDetails;

    invoke-static {v0, v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->$r8$lambda$xCEWa3C6UGm3UCyRrRRJQx-t8bs(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/SkuDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
