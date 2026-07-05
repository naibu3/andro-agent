.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;
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
        "it",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 679
    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method
