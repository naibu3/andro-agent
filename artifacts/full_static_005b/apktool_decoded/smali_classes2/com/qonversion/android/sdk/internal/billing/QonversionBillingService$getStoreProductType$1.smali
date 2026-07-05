.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
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
        "actualError",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
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

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $storeId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->$storeId:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->$onFailed:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 218
    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 4

    const-string v0, "actualError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getLegacyBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->$storeId:Ljava/lang/String;

    .line 221
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1$1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->$onFailed:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v3, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 224
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    .line 221
    invoke-virtual {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
