.class public final Lcom/qonversion/android/sdk/internal/QonversionFactory;
.super Ljava/lang/Object;
.source "QonversionFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0003J\u0008\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000cH\u0002JN\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QonversionFactory;",
        "",
        "context",
        "Landroid/app/Application;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "createBillingClient",
        "Lcom/android/billingclient/api/BillingClient;",
        "listener",
        "Lcom/android/billingclient/api/PurchasesUpdatedListener;",
        "createBillingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "createBillingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
        "billingClientHolder",
        "createBillingService",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "isAnalyticsMode",
        "",
        "createLegacyBillingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "createProductCenterManager",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "purchasesCache",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "handledPurchasesCache",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        "launchResultCacheWrapper",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "identityManager",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "remoteConfigManager",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
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
.field private final context:Landroid/app/Application;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 23
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-void
.end method

.method private final createBillingClient(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient;
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/android/billingclient/api/BillingClient;->newBuilder(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object v0

    const-string v1, "newBuilder(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-static {}, Lcom/android/billingclient/api/PendingPurchasesParams;->newBuilder()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->enableOneTimeProducts()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    move-result-object v1

    .line 102
    invoke-virtual {v1}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->enablePrepaidPlans()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    move-result-object v1

    .line 103
    invoke-virtual {v1}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->build()Lcom/android/billingclient/api/PendingPurchasesParams;

    move-result-object v1

    .line 99
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient$Builder;->enablePendingPurchases(Lcom/android/billingclient/api/PendingPurchasesParams;)Lcom/android/billingclient/api/BillingClient$Builder;

    .line 105
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingClient$Builder;->setListener(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    .line 106
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient$Builder;->build()Lcom/android/billingclient/api/BillingClient;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final createBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
    .locals 3

    .line 73
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 74
    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/app/Application;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 75
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 73
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;-><init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 78
    move-object v1, v0

    check-cast v1, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingClient(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->setBillingClient(Lcom/android/billingclient/api/BillingClient;)V

    return-object v0
.end method

.method private final createBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
    .locals 2

    .line 93
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v0
.end method

.method private final createBillingService(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Z)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;
    .locals 9

    .line 60
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-result-object v5

    .line 61
    new-instance v8, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 62
    new-instance v1, Landroid/os/Handler;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 64
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 67
    invoke-direct {p0, v5}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    move-result-object v6

    .line 68
    invoke-direct {p0, v5}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createLegacyBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    move-result-object v7

    move-object v0, v8

    move-object v2, p1

    move v4, p2

    .line 61
    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;-><init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V

    return-object v8
.end method

.method private final createLegacyBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
    .locals 2

    .line 87
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v0
.end method


# virtual methods
.method public final createProductCenterManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/QProductCenterManager;
    .locals 15

    move-object v0, p0

    const-string v1, "repository"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "purchasesCache"

    move-object/from16 v6, p2

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "handledPurchasesCache"

    move-object/from16 v7, p3

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "launchResultCacheWrapper"

    move-object/from16 v8, p4

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "userInfoService"

    move-object/from16 v9, p5

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "identityManager"

    move-object/from16 v10, p6

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "config"

    move-object/from16 v14, p7

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appStateProvider"

    move-object/from16 v12, p8

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "remoteConfigManager"

    move-object/from16 v13, p9

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 37
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 39
    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-object v2, v1

    move-object/from16 v11, p7

    .line 36
    invoke-direct/range {v2 .. v13}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V

    .line 49
    move-object v2, v1

    check-cast v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    invoke-virtual/range {p7 .. p7}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isAnalyticsMode()Z

    move-result v3

    invoke-direct {p0, v2, v3}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingService(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Z)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    move-result-object v2

    .line 51
    check-cast v2, Lcom/qonversion/android/sdk/internal/billing/BillingService;

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->setBillingService(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V

    return-object v1
.end method
