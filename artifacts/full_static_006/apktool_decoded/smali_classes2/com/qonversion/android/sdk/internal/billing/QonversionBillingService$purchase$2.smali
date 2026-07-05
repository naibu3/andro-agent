.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V
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
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
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
        "it",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
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
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic $purchaseModel:Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->$purchaseModel:Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->$activity:Landroid/app/Activity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 123
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->$purchaseModel:Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;->$activity:Landroid/app/Activity;

    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    return-void
.end method
