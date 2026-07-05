.class public interface abstract Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
.super Ljava/lang/Object;
.source "AppComponent.kt"


# annotations
.annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
.end annotation

.annotation runtime Ldagger/Component;
    modules = {
        Lcom/qonversion/android/sdk/internal/di/module/AppModule;,
        Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;,
        Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;,
        Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;,
        Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\u000bH&J\u0008\u0010\u000c\u001a\u00020\rH&J\u0008\u0010\u000e\u001a\u00020\u000fH&J\u0008\u0010\u0010\u001a\u00020\u0011H&J\u0008\u0010\u0012\u001a\u00020\u0013H&J\u0008\u0010\u0014\u001a\u00020\u0015H&J\u0008\u0010\u0016\u001a\u00020\u0017H&J\u0008\u0010\u0018\u001a\u00020\u0019H&J\u0008\u0010\u001a\u001a\u00020\u001bH&J\u0008\u0010\u001c\u001a\u00020\u001dH&J\u0008\u0010\u001e\u001a\u00020\u001fH&\u00a8\u0006 "
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/component/AppComponent;",
        "",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "automationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "exceptionManager",
        "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;",
        "fallbacksService",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "handledPurchasesCache",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        "identityManager",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "launchResultCacheWrapper",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "purchasesCache",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "qonversionRepository",
        "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
        "remoteConfigManager",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "userPropertiesManager",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
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


# virtual methods
.method public abstract appStateProvider()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
.end method

.method public abstract automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
.end method

.method public abstract exceptionManager()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
.end method

.method public abstract fallbacksService()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
.end method

.method public abstract handledPurchasesCache()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
.end method

.method public abstract identityManager()Lcom/qonversion/android/sdk/internal/QIdentityManager;
.end method

.method public abstract internalConfig()Lcom/qonversion/android/sdk/internal/InternalConfig;
.end method

.method public abstract launchResultCacheWrapper()Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
.end method

.method public abstract purchasesCache()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
.end method

.method public abstract qonversionRepository()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
.end method

.method public abstract remoteConfigManager()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
.end method

.method public abstract repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;
.end method

.method public abstract sharedPreferencesCache()Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
.end method

.method public abstract userInfoService()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
.end method

.method public abstract userPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
.end method
