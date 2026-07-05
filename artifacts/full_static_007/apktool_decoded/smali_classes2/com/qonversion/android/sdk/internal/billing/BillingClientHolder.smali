.class public final Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
.super Ljava/lang/Object;
.source "BillingClientHolder.kt"

# interfaces
.implements Lcom/android/billingclient/api/BillingClientStateListener;
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBillingClientHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientHolder.kt\ncom/qonversion/android/sdk/internal/billing/BillingClientHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0002J\u001f\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u001f\u00a2\u0006\u0002\u0008 R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000c\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "Lcom/android/billingclient/api/BillingClientStateListener;",
        "Lcom/android/billingclient/api/PurchasesUpdatedListener;",
        "mainHandler",
        "Landroid/os/Handler;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "billingClient",
        "Lcom/android/billingclient/api/BillingClient;",
        "connectionListener",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;",
        "isConnected",
        "",
        "()Z",
        "purchasesUpdatedListener",
        "onBillingServiceDisconnected",
        "",
        "onBillingSetupFinished",
        "billingResult",
        "Lcom/android/billingclient/api/BillingResult;",
        "onPurchasesUpdated",
        "purchases",
        "",
        "Lcom/android/billingclient/api/Purchase;",
        "setBillingClient",
        "startConnection",
        "listener",
        "subscribeOnPurchasesUpdates",
        "withReadyClient",
        "billingFunction",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "ConnectionListener",
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
.field private billingClient:Lcom/android/billingclient/api/BillingClient;

.field private connectionListener:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

.field private final mainHandler:Landroid/os/Handler;

.field private purchasesUpdatedListener:Lcom/android/billingclient/api/PurchasesUpdatedListener;


# direct methods
.method public static synthetic $r8$lambda$h8zeON-xoAB2CLcJASsnMOH93HU(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)V
    .locals 0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->startConnection$lambda$1(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    const-string v0, "mainHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->mainHandler:Landroid/os/Handler;

    .line 13
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-void
.end method

.method private static final startConnection$lambda$1(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)V
    .locals 4

    const-string v0, "startConnection() -> for "

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    monitor-enter p0

    .line 29
    :try_start_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v1, :cond_0

    move-object v2, p0

    check-cast v2, Lcom/android/billingclient/api/BillingClientStateListener;

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/BillingClient;->startConnection(Lcom/android/billingclient/api/BillingClientStateListener;)V

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 31
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final isConnected()Z
    .locals 3

    .line 22
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->isReady()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public onBillingServiceDisconnected()V
    .locals 4

    .line 54
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onBillingServiceDisconnected() -> for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public onBillingSetupFinished(Lcom/android/billingclient/api/BillingResult;)V
    .locals 4

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    .line 76
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onBillingSetupFinished with error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onBillingSetupFinished() -> successfully for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 61
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->connectionListener:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;->onBillingClientConnected()V

    goto :goto_0

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onBillingSetupFinished() -> with error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 66
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    .line 67
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v1

    .line 68
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Billing is not available on this device. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 66
    invoke-direct {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 70
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->connectionListener:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;->onBillingClientUnavailable(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->purchasesUpdatedListener:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final setBillingClient(Lcom/android/billingclient/api/BillingClient;)V
    .locals 1

    const-string v0, "billingClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    return-void
.end method

.method public final startConnection(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->connectionListener:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;

    .line 27
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->mainHandler:Landroid/os/Handler;

    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final subscribeOnPurchasesUpdates(Lcom/android/billingclient/api/PurchasesUpdatedListener;)V
    .locals 1

    const-string v0, "purchasesUpdatedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->purchasesUpdatedListener:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    return-void
.end method

.method public final withReadyClient(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/android/billingclient/api/BillingClient;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->billingClient:Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->isConnected()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 37
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v2, :cond_2

    .line 38
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    const-string v0, "Connection to the BillingClient was lost"

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
