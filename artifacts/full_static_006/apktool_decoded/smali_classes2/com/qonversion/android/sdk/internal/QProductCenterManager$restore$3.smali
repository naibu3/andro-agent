.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;
.super Lkotlin/jvm/internal/Lambda;
.source "QProductCenterManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "historyRecords",
        "",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
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
.field final synthetic $requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 413
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "historyRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->consumeHistoryRecords(Ljava/util/List;)V

    .line 417
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRepository$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v1

    .line 418
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInstallDate$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)J

    move-result-wide v2

    .line 420
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-direct {v0, v4, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V

    move-object v5, v0

    check-cast v5, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 434
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    move-object v4, p1

    .line 417
    invoke-interface/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->restore(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method
