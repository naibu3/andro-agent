.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/PurchaseHistoryResponseListener;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final onPurchaseHistoryResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1;->$r8$lambda$f9OENi99re-vpEOIDhnXAVSzbFA(Lkotlin/jvm/functions/Function2;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
