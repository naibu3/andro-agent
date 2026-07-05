.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchasesHistory(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
        "subsPurchasesList",
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
.field final synthetic $onCompleted:Lkotlin/jvm/functions/Function1;
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

.field final synthetic $onFailed:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
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

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onCompleted:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onFailed:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 181
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "subsPurchasesList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 185
    sget-object v1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 184
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onCompleted:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v3, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance p1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$2;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onFailed:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-direct {p1, v3, v4}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
