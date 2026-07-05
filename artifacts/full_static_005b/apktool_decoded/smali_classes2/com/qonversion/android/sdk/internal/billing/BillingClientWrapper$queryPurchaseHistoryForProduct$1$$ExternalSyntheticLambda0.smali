.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/PurchaseHistoryResponseListener;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$1:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$1:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    return-void
.end method


# virtual methods
.method public final onPurchaseHistoryResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0;->f$1:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    invoke-static {v0, v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$r8$lambda$cQSAdz4TDkUt1teefjO1DkKzlnk(Lkotlin/jvm/functions/Function2;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
