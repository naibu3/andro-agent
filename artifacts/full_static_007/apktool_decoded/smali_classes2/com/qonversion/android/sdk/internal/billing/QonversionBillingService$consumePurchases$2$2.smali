.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->consumePurchases(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "productType",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
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
.field final synthetic $purchase:Lcom/android/billingclient/api/Purchase;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/android/billingclient/api/Purchase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 141
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->invoke(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V
    .locals 2

    const-string v0, "productType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    sget-object v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, "getPurchaseToken(...)"

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->isAcknowledged()Z

    move-result p1

    if-nez p1, :cond_2

    .line 151
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$acknowledge(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    goto :goto_0

    .line 147
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$consume(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
