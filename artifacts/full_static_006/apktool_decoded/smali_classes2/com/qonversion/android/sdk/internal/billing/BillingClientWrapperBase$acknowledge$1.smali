.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BillingClientWrapperBase.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->acknowledge(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/android/billingclient/api/BillingClient;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/android/billingclient/api/BillingClient;",
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
.field final synthetic $params:Lcom/android/billingclient/api/AcknowledgePurchaseParams;

.field final synthetic $purchaseToken:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;


# direct methods
.method public static synthetic $r8$lambda$gRX__IMd7kD_dVamkaXq6npfrng(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->invoke$lambda$0(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;)V

    return-void
.end method

.method constructor <init>(Lcom/android/billingclient/api/AcknowledgePurchaseParams;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->$params:Lcom/android/billingclient/api/AcknowledgePurchaseParams;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->$purchaseToken:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$0(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;)V
    .locals 2

    const-string v0, "$purchaseToken"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-static {p2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    invoke-static {p2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to acknowledge purchase with token "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, " "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 45
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "acknowledge() -> "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 4

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->$params:Lcom/android/billingclient/api/AcknowledgePurchaseParams;

    .line 39
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->$purchaseToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    new-instance v3, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/BillingClient;->acknowledgePurchase(Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;)V

    return-void
.end method
