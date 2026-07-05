.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;
.super Ljava/lang/Object;
.source "RepositoryModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0008H\u0007J\u0008\u0010\u0012\u001a\u00020\u0013H\u0007J8\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J@\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007\u00a8\u0006%"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
        "",
        "()V",
        "provideApiErrorMapper",
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        "apiHelper",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "provideEnvironment",
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        "context",
        "Landroid/app/Application;",
        "provideHeadersProvider",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "environmentProvider",
        "providePropertiesStorage",
        "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
        "provideQonversionRepository",
        "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
        "retrofit",
        "Lretrofit2/Retrofit;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "apiErrorMapper",
        "delayCalculator",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "provideRepository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "rateLimiter",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
        "provideTokenStorage",
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
        "preferences",
        "Landroid/content/SharedPreferences;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideApiErrorMapper(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "apiHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V

    return-object v0
.end method

.method public final provideEnvironment(Landroid/app/Application;)Lcom/qonversion/android/sdk/internal/EnvironmentProvider;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final provideHeadersProvider(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPreferencesCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environmentProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;-><init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V

    return-object v0
.end method

.method public final providePropertiesStorage()Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 81
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;-><init>()V

    return-object v0
.end method

.method public final provideQonversionRepository(Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 8
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "retrofit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environmentProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiErrorMapper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delayCalculator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 63
    const-class v1, Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-virtual {p1, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "create(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Lcom/qonversion/android/sdk/internal/api/Api;

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 62
    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;-><init>(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V

    return-object v0
.end method

.method public final provideRepository(Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "retrofit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environmentProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiErrorMapper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delayCalculator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rateLimiter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    .line 40
    invoke-virtual/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideQonversionRepository(Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 39
    invoke-direct {v0, p1, p7}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V

    check-cast v0, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    return-object v0
.end method

.method public final provideTokenStorage(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/TokenStorage;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "preferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;-><init>(Landroid/content/SharedPreferences;)V

    return-object v0
.end method
