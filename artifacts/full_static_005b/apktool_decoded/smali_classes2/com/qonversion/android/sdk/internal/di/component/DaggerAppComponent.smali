.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;
.super Ljava/lang/Object;
.source "DaggerAppComponent.java"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/di/component/AppComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    }
.end annotation


# instance fields
.field private activityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiErrorMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideApiHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideAppStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideApplicationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private provideAutomationsEventMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideAutomationsManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;"
        }
    .end annotation
.end field

.field private provideEnvironmentProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideFallbackServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
            ">;"
        }
    .end annotation
.end field

.field private provideHeadersInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private provideHeadersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideIdentityManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideIncrementalDelayCalculatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
            ">;"
        }
    .end annotation
.end field

.field private provideLaunchResultCacheWrapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private provideLoggerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private provideMoshiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;"
        }
    .end annotation
.end field

.field private provideOkHttpClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field private providePropertiesStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
            ">;"
        }
    .end annotation
.end field

.field private providePurchasesCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
            ">;"
        }
    .end annotation
.end field

.field private provideQonversionRepositoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
            ">;"
        }
    .end annotation
.end field

.field private provideRateLimiterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
            ">;"
        }
    .end annotation
.end field

.field private provideRepositoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;"
        }
    .end annotation
.end field

.field private provideRetrofitProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lretrofit2/Retrofit;",
            ">;"
        }
    .end annotation
.end field

.field private provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;"
        }
    .end annotation
.end field

.field private provideSharedPreferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private provideTokenStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;"
        }
    .end annotation
.end field

.field private provideUserInfoServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
            ">;"
        }
    .end annotation
.end field

.field private provideUserPropertiesManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->initialize(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V

    return-void
.end method

.method public static builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 2

    .line 150
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;-><init>(Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent-IA;)V

    return-object v0
.end method

.method private getQRemoteConfigService()Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
    .locals 2

    .line 154
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;)V

    return-object v0
.end method

.method private initialize(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V
    .locals 8

    .line 160
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideApplicationFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideApplicationFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    .line 161
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    .line 162
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesProvider:Ljavax/inject/Provider;

    .line 163
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesCacheFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesCacheFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;

    .line 164
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    invoke-static {p2, v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideEnvironmentProvider:Ljavax/inject/Provider;

    .line 165
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-static {p2, v1, v2, v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersProvider:Ljavax/inject/Provider;

    .line 166
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    invoke-static {p3, v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideApiHelperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideApiHelperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiHelperProvider:Ljavax/inject/Provider;

    .line 167
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    invoke-static {p3, v1, v2, v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersInterceptorProvider:Ljavax/inject/Provider;

    .line 168
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    invoke-static {p3, v1, v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideOkHttpClientProvider:Ljavax/inject/Provider;

    .line 169
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideMoshiFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideMoshiFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ljavax/inject/Provider;

    .line 170
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideOkHttpClientProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    invoke-static {p3, v1, v0, v2}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRetrofitProvider:Ljavax/inject/Provider;

    .line 171
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLoggerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLoggerFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ljavax/inject/Provider;

    .line 172
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiHelperProvider:Ljavax/inject/Provider;

    invoke-static {p2, v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideApiErrorMapperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideApiErrorMapperFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiErrorMapperProvider:Ljavax/inject/Provider;

    .line 173
    invoke-static {p4}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ljavax/inject/Provider;

    .line 174
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v7

    iput-object v7, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRateLimiterProvider:Ljavax/inject/Provider;

    .line 175
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRetrofitProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideEnvironmentProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiErrorMapperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ljavax/inject/Provider;

    move-object v0, p2

    invoke-static/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    .line 176
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRetrofitProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideEnvironmentProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiErrorMapperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideQonversionRepositoryProvider:Ljavax/inject/Provider;

    .line 177
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-static {p1, p3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePurchasesCacheProvider:Ljavax/inject/Provider;

    .line 178
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ljavax/inject/Provider;

    invoke-static {p1, p3, v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideFallbackServiceProvider:Ljavax/inject/Provider;

    .line 179
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-static {p1, v0, v1, p3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLaunchResultCacheWrapperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLaunchResultCacheWrapperFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLaunchResultCacheWrapperProvider:Ljavax/inject/Provider;

    .line 180
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ljavax/inject/Provider;

    invoke-static {p4, p3}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsEventMapperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsEventMapperFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsEventMapperProvider:Ljavax/inject/Provider;

    .line 181
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    invoke-static {p3}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->create(Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->activityProvider:Ljavax/inject/Provider;

    .line 182
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsEventMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    invoke-static {p4, v0, v1, v2, p3}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsManagerProvider:Ljavax/inject/Provider;

    .line 183
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesProvider:Ljavax/inject/Provider;

    invoke-static {p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideTokenStorageProvider:Ljavax/inject/Provider;

    .line 184
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-static {p5, v0, p3}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserInfoServiceProvider:Ljavax/inject/Provider;

    .line 185
    iget-object p5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    invoke-static {p4, p5, p3}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIdentityManagerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIdentityManagerFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIdentityManagerProvider:Ljavax/inject/Provider;

    .line 186
    invoke-static {p2}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;

    move-result-object p2

    invoke-static {p2}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p2

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePropertiesStorageProvider:Ljavax/inject/Provider;

    .line 187
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideAppStateProviderFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideAppStateProviderFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v5

    iput-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAppStateProvider:Ljavax/inject/Provider;

    .line 188
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePropertiesStorageProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ljavax/inject/Provider;

    move-object v0, p4

    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserPropertiesManagerProvider:Ljavax/inject/Provider;

    return-void
.end method


# virtual methods
.method public appStateProvider()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAppStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    return-object v0
.end method

.method public automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    return-object v0
.end method

.method public exceptionManager()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
    .locals 5

    .line 245
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/squareup/moshi/Moshi;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)V

    return-object v0
.end method

.method public fallbacksService()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideFallbackServiceProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    return-object v0
.end method

.method public handledPurchasesCache()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 1

    .line 205
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;-><init>()V

    return-object v0
.end method

.method public identityManager()Lcom/qonversion/android/sdk/internal/QIdentityManager;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIdentityManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QIdentityManager;

    return-object v0
.end method

.method public internalConfig()Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/InternalConfig;

    return-object v0
.end method

.method public launchResultCacheWrapper()Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLaunchResultCacheWrapperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    return-object v0
.end method

.method public purchasesCache()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePurchasesCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    return-object v0
.end method

.method public qonversionRepository()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideQonversionRepositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    return-object v0
.end method

.method public remoteConfigManager()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .locals 3

    .line 229
    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->getQRemoteConfigService()Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    move-result-object v1

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideFallbackServiceProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;-><init>(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V

    return-object v0
.end method

.method public repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    return-object v0
.end method

.method public sharedPreferencesCache()Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    return-object v0
.end method

.method public userInfoService()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserInfoServiceProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    return-object v0
.end method

.method public userPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserPropertiesManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    return-object v0
.end method
