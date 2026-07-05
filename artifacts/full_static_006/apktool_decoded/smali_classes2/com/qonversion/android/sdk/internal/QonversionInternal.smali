.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal;
.super Ljava/lang/Object;
.source "QonversionInternal.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/Qonversion;
.implements Lcom/qonversion/android/sdk/internal/LifecycleDelegate;
.implements Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020&2\u0006\u0010(\u001a\u00020,H\u0016J$\u0010-\u001a\u00020$2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u0010(\u001a\u000204H\u0016J\u001e\u00105\u001a\u00020$2\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020&072\u0006\u0010(\u001a\u000208H\u0016J\u0018\u00109\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010:\u001a\u00020$2\u0006\u0010+\u001a\u00020&2\u0006\u0010(\u001a\u00020,H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020&H\u0016J\u0018\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020&2\u0006\u0010(\u001a\u00020=H\u0016J\u0008\u0010>\u001a\u00020?H\u0016J\u001a\u0010@\u001a\u00020$2\u0008\u0010A\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020BH\u0002J\u0008\u0010C\u001a\u00020$H\u0016J\u0010\u0010D\u001a\u0002042\u0006\u0010(\u001a\u000204H\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010(\u001a\u000204H\u0002J\u0010\u0010G\u001a\u00020=2\u0006\u0010(\u001a\u00020=H\u0002J\u0010\u0010H\u001a\u00020$2\u0006\u0010(\u001a\u00020IH\u0016J\u0008\u0010J\u001a\u00020$H\u0016J\u0008\u0010K\u001a\u00020$H\u0016J\u0016\u0010L\u001a\u00020$2\u000c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020$0NH\u0002J\u0010\u0010O\u001a\u00020$2\u0006\u0010(\u001a\u00020PH\u0016J \u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010(\u001a\u000204H\u0017J(\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010(\u001a\u000204H\u0016J \u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020W2\u0006\u0010(\u001a\u000204H\u0016J\u0010\u0010Z\u001a\u00020$2\u0006\u0010(\u001a\u00020BH\u0016J\u0018\u0010Z\u001a\u00020$2\u0006\u0010A\u001a\u00020&2\u0006\u0010(\u001a\u00020BH\u0016J\u0010\u0010[\u001a\u00020$2\u0006\u0010(\u001a\u00020\\H\u0016J&\u0010[\u001a\u00020$2\u000c\u0010]\u001a\u0008\u0012\u0004\u0012\u00020&072\u0006\u0010^\u001a\u00020?2\u0006\u0010(\u001a\u00020\\H\u0016J\u0010\u0010_\u001a\u00020$2\u0006\u0010(\u001a\u000204H\u0016J\u0018\u0010`\u001a\u00020$2\u0006\u0010a\u001a\u00020&2\u0006\u0010b\u001a\u00020&H\u0016J\u0010\u0010c\u001a\u00020$2\u0006\u0010d\u001a\u00020eH\u0016J\u0018\u0010f\u001a\u00020$2\u0006\u0010a\u001a\u00020g2\u0006\u0010b\u001a\u00020&H\u0016J\u0008\u0010h\u001a\u00020$H\u0016J\u0008\u0010i\u001a\u00020$H\u0016J \u0010j\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010k\u001a\u00020l2\u0006\u0010(\u001a\u000204H\u0017J(\u0010j\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010(\u001a\u000204H\u0016J\u0010\u0010m\u001a\u00020$2\u0006\u0010(\u001a\u00020=H\u0016J\u0010\u0010n\u001a\u00020$2\u0006\u0010(\u001a\u00020oH\u0016R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006p"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QonversionInternal;",
        "Lcom/qonversion/android/sdk/Qonversion;",
        "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "application",
        "Landroid/app/Application;",
        "(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V",
        "appState",
        "Lcom/qonversion/android/sdk/internal/AppState;",
        "getAppState",
        "()Lcom/qonversion/android/sdk/internal/AppState;",
        "setAppState",
        "(Lcom/qonversion/android/sdk/internal/AppState;)V",
        "attributionManager",
        "Lcom/qonversion/android/sdk/internal/QAttributionManager;",
        "automationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "exceptionManager",
        "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;",
        "fallbackService",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "handler",
        "Landroid/os/Handler;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "productCenterManager",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "remoteConfigManager",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "userPropertiesManager",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "attachUserToExperiment",
        "",
        "experimentId",
        "",
        "groupId",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "attribution",
        "data",
        "",
        "",
        "provider",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "checkEntitlements",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "checkTrialIntroEligibility",
        "productIds",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "identify",
        "userID",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "isFallbackFileAccessible",
        "",
        "loadRemoteConfig",
        "contextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "logout",
        "mainEntitlementsCallback",
        "mainPurchaseCallback",
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "mainUserCallback",
        "offerings",
        "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;",
        "onAppBackground",
        "onAppForeground",
        "postToMainThread",
        "runnable",
        "Lkotlin/Function0;",
        "products",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "purchase",
        "context",
        "Landroid/app/Activity;",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "options",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "remoteConfig",
        "remoteConfigList",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "includeEmptyContextKey",
        "restore",
        "setCustomUserProperty",
        "key",
        "value",
        "setEntitlementsUpdateListener",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "setUserProperty",
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        "syncHistoricalData",
        "syncPurchases",
        "updatePurchase",
        "purchaseUpdateModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "userInfo",
        "userProperties",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;",
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
.field private appState:Lcom/qonversion/android/sdk/internal/AppState;

.field private attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

.field private automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

.field private exceptionManager:Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;

.field private fallbackService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

.field private final handler:Landroid/os/Handler;

.field private logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

.field private productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

.field private remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

.field private sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

.field private userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;


# direct methods
.method public static synthetic $r8$lambda$DuIrvJy57znGZzV1qbgGA7aUUGg(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->postToMainThread$lambda$2(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V
    .locals 11

    const-string v0, "internalConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "application"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 55
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->handler:Landroid/os/Handler;

    .line 61
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->appState:Lcom/qonversion/android/sdk/internal/AppState;

    .line 64
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    move-object v9, p0

    check-cast v9, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    invoke-virtual {v0, p2, p1, v9}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->buildAppComponent$sdk_release(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 66
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->exceptionManager()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    move-result-object v0

    .line 67
    move-object v1, p2

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->initialize(Landroid/content/Context;)V

    .line 66
    check-cast v0, Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->exceptionManager:Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;

    .line 70
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v2

    .line 71
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->purchasesCache()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object v3

    .line 72
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->handledPurchasesCache()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    move-result-object v4

    .line 73
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->launchResultCacheWrapper()Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    move-result-object v5

    .line 74
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->userInfoService()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v6

    .line 75
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->identityManager()Lcom/qonversion/android/sdk/internal/QIdentityManager;

    move-result-object v7

    .line 76
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->sharedPreferencesCache()Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 78
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setUid(Ljava/lang/String;)V

    .line 82
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->fallbacksService()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->fallbackService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 84
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 86
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->userPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 88
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->remoteConfigManager()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    move-result-object v0

    .line 90
    new-instance v1, Lcom/qonversion/android/sdk/internal/QAttributionManager;

    invoke-direct {v1, v2, v9}, Lcom/qonversion/android/sdk/internal/QAttributionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V

    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

    .line 92
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionFactory;

    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    check-cast v8, Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-direct {v1, p2, v8}, Lcom/qonversion/android/sdk/internal/QonversionFactory;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    move-object v8, p1

    move-object v10, v0

    .line 94
    invoke-virtual/range {v1 .. v10}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createProductCenterManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    move-result-object p2

    .line 105
    move-object v1, p2

    check-cast v1, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->setUserStateProvider(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V

    .line 94
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 108
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 110
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {v0, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setProductCenterManager$sdk_release(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 111
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getSendFbAttribution()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 112
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendFacebookAttribution()V

    .line 115
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->setUserPropertiesManager(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 117
    new-instance p1, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;

    move-object p2, p0

    check-cast p2, Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    invoke-direct {p1, p2}, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;-><init>(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V

    .line 118
    new-instance p2, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;

    invoke-direct {p2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;-><init>(Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;)V

    check-cast p2, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->postToMainThread(Lkotlin/jvm/functions/Function0;)V

    .line 120
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    sget-object p2, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/QonversionInternal;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-object p0
.end method

.method public static final synthetic access$getSharedPreferencesCache$p(Lcom/qonversion/android/sdk/internal/QonversionInternal;)Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    return-object p0
.end method

.method public static final synthetic access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->postToMainThread(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private final loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$loadRemoteConfig$1;

    invoke-direct {v1, p0, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal$loadRemoteConfig$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-virtual {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method

.method private final mainEntitlementsCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
    .locals 1

    .line 387
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainEntitlementsCallback$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainEntitlementsCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    return-object v0
.end method

.method private final mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;
    .locals 1

    .line 396
    instance-of v0, p1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    if-eqz v0, :cond_0

    .line 397
    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    goto :goto_0

    .line 399
    :cond_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    move-object p1, v0

    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 410
    :goto_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    return-object v0
.end method

.method private final mainUserCallback(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
    .locals 1

    .line 424
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    return-object v0
.end method

.method private final postToMainThread(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 433
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 434
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method private static final postToMainThread$lambda$2(Lkotlin/jvm/functions/Function0;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 1

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 1

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QAttributionManager;->attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V

    return-void
.end method

.method public checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainEntitlementsCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method public checkTrialIntroEligibility(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "productIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 322
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;

    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    .line 320
    invoke-virtual {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->checkTrialIntroEligibilityForProductIds(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 1

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 1

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public getAppState()Lcom/qonversion/android/sdk/internal/AppState;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->appState:Lcom/qonversion/android/sdk/internal/AppState;

    return-object v0
.end method

.method public identify(Ljava/lang/String;)V
    .locals 3

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 1

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method public isFallbackFileAccessible()Z
    .locals 1

    .line 376
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->fallbackService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->obtainFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public logout()V
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logout()V

    return-void
.end method

.method public offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$offerings$1;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$offerings$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    return-void
.end method

.method public onAppBackground()V
    .locals 1

    .line 124
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->setAppState(Lcom/qonversion/android/sdk/internal/AppState;)V

    .line 126
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->onAppBackground()V

    return-void
.end method

.method public onAppForeground()V
    .locals 1

    .line 130
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Foreground:Lcom/qonversion/android/sdk/internal/AppState;

    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->setAppState(Lcom/qonversion/android/sdk/internal/AppState;)V

    .line 132
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->onAppForeground()V

    .line 133
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->onAppForeground()V

    .line 134
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QAttributionManager;->onAppForeground()V

    return-void
.end method

.method public products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the new purchase() method"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "purchase(context, TODO(\"pass product here\"), callback)"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 163
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/QPurchaseModel;)V

    .line 164
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 161
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 176
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2, p3}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    .line 177
    invoke-direct {p0, p4}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 174
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 188
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, p2, v2, v3, v2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 189
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 186
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public remoteConfig(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 240
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 1

    const-string v0, "contextKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method

.method public remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$2;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 267
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;

    invoke-direct {v1, p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 264
    invoke-virtual {v0, p1, p2, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainEntitlementsCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method public setAppState(Lcom/qonversion/android/sdk/internal/AppState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->appState:Lcom/qonversion/android/sdk/internal/AppState;

    return-void
.end method

.method public setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1

    const-string v0, "entitlementsUpdateListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    return-void
.end method

.method public setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V

    return-void
.end method

.method public syncHistoricalData()V
    .locals 5

    .line 139
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/Cache;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "com.qonversion.keys.is_historical_data_synced"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache$DefaultImpls;->getBool$default(Lcom/qonversion/android/sdk/internal/storage/Cache;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QonversionInternal$syncHistoricalData$1;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal$syncHistoricalData$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;)V

    check-cast v2, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method public syncPurchases()V
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->syncPurchases()V

    return-void
.end method

.method public updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the new updatePurchase() method"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "updatePurchase(context, TODO(\"pass product here\"), TODO(\"pass purchase options here\"), callback)"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseUpdateModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 214
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;)V

    .line 215
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 212
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 201
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2, p3}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    .line 202
    invoke-direct {p0, p4}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 199
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public userInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainUserCallback(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method public userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    return-void
.end method
