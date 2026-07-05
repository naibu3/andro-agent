.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QProductCenterManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
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
        "Lcom/android/billingclient/api/Purchase;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQProductCenterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1124:1\n766#2:1125\n857#2,2:1126\n*S KotlinDebug\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2\n*L\n688#1:1125\n688#1:1126,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "purchases",
        "",
        "Lcom/android/billingclient/api/Purchase;",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 679
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "purchases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 683
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void

    .line 688
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 1125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 1126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    .line 688
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 1126
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1127
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 690
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V

    .line 692
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getConverter$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    move-result-object p1

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;->convertPurchases(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v6

    .line 695
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getWrappedPurchasesCallback(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move-result-object v7

    .line 697
    new-instance p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 698
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInstallDate$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)J

    move-result-wide v3

    .line 699
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/lang/String;

    move-result-object v5

    .line 702
    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    move-object v2, p1

    .line 697
    invoke-direct/range {v2 .. v8}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 704
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$processInit(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    return-void
.end method
