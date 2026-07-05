.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/ProductDetailsResponseListener;


# instance fields
.field public final synthetic f$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onProductDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$r8$lambda$5ouYVaaZnqimzar5DJVZ8D39P3A(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
