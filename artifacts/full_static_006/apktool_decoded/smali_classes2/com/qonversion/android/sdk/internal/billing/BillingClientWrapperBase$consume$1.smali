.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BillingClientWrapperBase.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->consume(Ljava/lang/String;)V
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
.field final synthetic $params:Lcom/android/billingclient/api/ConsumeParams;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;


# direct methods
.method public static synthetic $r8$lambda$aoKvA5iEkj8Z4DWsNMhv59D7iA0(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->invoke$lambda$0(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Lcom/android/billingclient/api/ConsumeParams;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->$params:Lcom/android/billingclient/api/ConsumeParams;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to consume purchase with token "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "consume() -> "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 3

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->$params:Lcom/android/billingclient/api/ConsumeParams;

    .line 21
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V

    invoke-virtual {p1, v0, v2}, Lcom/android/billingclient/api/BillingClient;->consumeAsync(Lcom/android/billingclient/api/ConsumeParams;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    return-void
.end method
