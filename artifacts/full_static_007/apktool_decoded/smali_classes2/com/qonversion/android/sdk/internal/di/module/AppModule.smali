.class public final Lcom/qonversion/android/sdk/internal/di/module/AppModule;
.super Ljava/lang/Object;
.source "AppModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\t\u001a\u00020\u0007H\u0007J\u0008\u0010\n\u001a\u00020\u0003H\u0007J\u0008\u0010\u000b\u001a\u00020\u0005H\u0007J \u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0007J\u0008\u0010\u0018\u001a\u00020\u0012H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u0003H\u0007J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001dH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
        "",
        "application",
        "Landroid/app/Application;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V",
        "provideAppStateProvider",
        "provideApplication",
        "provideConfig",
        "provideFallbackService",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "context",
        "moshi",
        "Lcom/squareup/moshi/Moshi;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "provideLaunchResultCacheWrapper",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "fallbacksService",
        "provideLogger",
        "providePurchasesCache",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "sharedPreferences",
        "provideSharedPreferences",
        "Landroid/content/SharedPreferences;",
        "provideSharedPreferencesCache",
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
.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

.field private final application:Landroid/app/Application;

.field private final internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStateProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->application:Landroid/app/Application;

    .line 22
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 23
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    return-void
.end method


# virtual methods
.method public final provideAppStateProvider()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    return-object v0
.end method

.method public final provideApplication()Landroid/app/Application;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->application:Landroid/app/Application;

    return-object v0
.end method

.method public final provideConfig()Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    return-object v0
.end method

.method public final provideFallbackService(Landroid/app/Application;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moshi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    check-cast v1, Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v0
.end method

.method public final provideLaunchResultCacheWrapper(Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPreferencesCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbacksService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    check-cast v1, Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

    invoke-direct {v0, p1, p2, v1, p3}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;-><init>(Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V

    return-object v0
.end method

.method public final provideLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 60
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    check-cast v0, Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-object v0
.end method

.method public final providePurchasesCache(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;-><init>(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V

    return-object v0
.end method

.method public final provideSharedPreferences(Landroid/app/Application;)Landroid/content/SharedPreferences;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getDefaultSharedPreferences(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final provideSharedPreferencesCache(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method
