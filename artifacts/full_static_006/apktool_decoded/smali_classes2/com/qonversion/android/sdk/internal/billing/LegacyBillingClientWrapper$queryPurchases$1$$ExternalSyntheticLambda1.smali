.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesResponseListener;


# instance fields
.field public final synthetic f$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Lcom/android/billingclient/api/BillingClient;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingClient;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$2:Lcom/android/billingclient/api/BillingClient;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$3:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$2:Lcom/android/billingclient/api/BillingClient;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;->f$3:Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->$r8$lambda$NbFphooUXT840oZjYN21oJPcdQo(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingClient;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
