.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BillingClientWrapper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->queryProductDetailsAsync(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
.field final synthetic $onQuerySkuCompleted:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onQuerySkuFailed:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $params:Lcom/android/billingclient/api/QueryProductDetailsParams;

.field final synthetic $productIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;


# direct methods
.method public static synthetic $r8$lambda$5ouYVaaZnqimzar5DJVZ8D39P3A(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->invoke$lambda$0(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/android/billingclient/api/QueryProductDetailsParams;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/QueryProductDetailsParams;",
            "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
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

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$params:Lcom/android/billingclient/api/QueryProductDetailsParams;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$productIds:Ljava/util/List;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$onQuerySkuCompleted:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$onQuerySkuFailed:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$productIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onQuerySkuCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onQuerySkuFailed"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productDetailsList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    invoke-static {p4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    invoke-static {p0, p5, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->access$logProductDetails(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Ljava/util/List;)V

    .line 260
    invoke-interface {p2, p5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 263
    :cond_0
    new-instance p0, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    .line 264
    invoke-virtual {p4}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    .line 265
    invoke-static {p4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Failed to fetch products. "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 263
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 262
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 256
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 6

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$params:Lcom/android/billingclient/api/QueryProductDetailsParams;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$productIds:Ljava/util/List;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$onQuerySkuCompleted:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->$onQuerySkuFailed:Lkotlin/jvm/functions/Function1;

    new-instance v5, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v5}, Lcom/android/billingclient/api/BillingClient;->queryProductDetailsAsync(Lcom/android/billingclient/api/QueryProductDetailsParams;Lcom/android/billingclient/api/ProductDetailsResponseListener;)V

    return-void
.end method
