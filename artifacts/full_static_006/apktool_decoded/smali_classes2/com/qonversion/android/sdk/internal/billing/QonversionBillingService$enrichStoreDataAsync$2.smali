.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionBillingService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->enrichStoreDataAsync(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQonversionBillingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QonversionBillingService.kt\ncom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n1603#2,9:457\n1855#2:466\n1856#2:468\n1612#2:469\n1#3:467\n*S KotlinDebug\n*F\n+ 1 QonversionBillingService.kt\ncom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2\n*L\n73#1:457,9\n73#1:466\n73#1:468\n73#1:469\n73#1:467\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "billingSetupError",
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
.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
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

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$products:Ljava/util/List;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onEnriched:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 65
    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 7

    if-eqz p1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "enrichStoreDataAsync() -> "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 73
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$products:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 457
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 466
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 465
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 73
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 465
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 469
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 74
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getLegacyBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    move-result-object p1

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$products:Ljava/util/List;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onEnriched:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$1;-><init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$products:Ljava/util/List;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->$onEnriched:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;-><init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-virtual {p1, v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->withStoreDataLoaded(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
