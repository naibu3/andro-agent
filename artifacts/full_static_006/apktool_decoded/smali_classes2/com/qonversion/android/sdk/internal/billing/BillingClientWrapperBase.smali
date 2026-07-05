.class public abstract Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;
.super Ljava/lang/Object;
.source "BillingClientWrapperBase.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008 \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eJ;\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\u000c0\u0015H\u0004J\u0018\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0005J\u0018\u0010\u001f\u001a\u00020 *\u00020 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006#"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "",
        "billingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "getBillingClientHolder",
        "()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "getLogger",
        "()Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "acknowledge",
        "",
        "purchaseToken",
        "",
        "consume",
        "handlePurchasesQueryError",
        "billingResult",
        "Lcom/android/billingclient/api/BillingResult;",
        "purchaseType",
        "onQueryFailed",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lkotlin/ParameterName;",
        "name",
        "error",
        "launchBillingFlow",
        "activity",
        "Landroid/app/Activity;",
        "params",
        "Lcom/android/billingclient/api/BillingFlowParams;",
        "setSubscriptionUpdateParams",
        "Lcom/android/billingclient/api/BillingFlowParams$Builder;",
        "info",
        "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    const-string v0, "billingClientHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 13
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-void
.end method

.method public static synthetic setSubscriptionUpdateParams$default(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;ILjava/lang/Object;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 74
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setSubscriptionUpdateParams"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final acknowledge(Ljava/lang/String;)V
    .locals 3

    const-string v0, "purchaseToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-static {}, Lcom/android/billingclient/api/AcknowledgePurchaseParams;->newBuilder()Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;

    move-result-object v0

    .line 35
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;->setPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;

    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;->build()Lcom/android/billingclient/api/AcknowledgePurchaseParams;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;

    invoke-direct {v2, v0, p1, p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;-><init>(Lcom/android/billingclient/api/AcknowledgePurchaseParams;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final consume(Ljava/lang/String;)V
    .locals 2

    const-string v0, "purchaseToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lcom/android/billingclient/api/ConsumeParams;->newBuilder()Lcom/android/billingclient/api/ConsumeParams$Builder;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/ConsumeParams$Builder;->setPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/ConsumeParams$Builder;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/android/billingclient/api/ConsumeParams$Builder;->build()Lcom/android/billingclient/api/ConsumeParams;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;

    invoke-direct {v1, p1, p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;-><init>(Lcom/android/billingclient/api/ConsumeParams;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method protected final getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    return-object v0
.end method

.method protected final getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-object v0
.end method

.method protected final handlePurchasesQueryError(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onQueryFailed"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to query "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v1, " purchases from cache: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 70
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "queryPurchases() -> "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    return-void
.end method

.method protected final launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;

    invoke-direct {v1, p1, p2, p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;-><init>(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method protected final setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)Lcom/android/billingclient/api/BillingFlowParams$Builder;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 78
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;

    move-result-object v0

    const-string v1, "newBuilder(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;->getPurchaseToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;->setOldPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;

    .line 81
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;->getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->toReplacementMode$sdk_release()I

    move-result p2

    .line 82
    invoke-virtual {v0, p2}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;->setSubscriptionReplacementMode(I)Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;

    .line 84
    :cond_0
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams;

    move-result-object p2

    const-string v0, "build(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    :cond_1
    return-object p1
.end method
