.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;
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
        "error",
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

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 181
    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;->$onFailed:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$queryPurchasesHistory$fireOnFailed(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    return-void
.end method
