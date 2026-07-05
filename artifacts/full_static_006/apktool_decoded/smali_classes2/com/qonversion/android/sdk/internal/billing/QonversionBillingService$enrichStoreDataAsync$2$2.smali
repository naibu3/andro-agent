.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $onEnriched:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
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

.field final synthetic $products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$products:Ljava/util/List;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onEnriched:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 78
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$products:Ljava/util/List;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onEnriched:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
