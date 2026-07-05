package com.qonversion.android.sdk.internal.di.component;

import android.app.Application;
import android.content.SharedPreferences;
import com.qonversion.android.sdk.automations.internal.ActivityProvider;
import com.qonversion.android.sdk.automations.internal.ActivityProvider_Factory;
import com.qonversion.android.sdk.automations.internal.AutomationsEventMapper;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.QHandledPurchasesCache;
import com.qonversion.android.sdk.internal.QIdentityManager;
import com.qonversion.android.sdk.internal.QRemoteConfigManager;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.di.module.AppModule;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideAppStateProviderFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideApplicationFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideConfigFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideFallbackServiceFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideLaunchResultCacheWrapperFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideLoggerFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvidePurchasesCacheFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideSharedPreferencesCacheFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideSharedPreferencesFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideAutomationsEventMapperFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideAutomationsManagerFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideIdentityManagerFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideIncrementalDelayCalculatorFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideUserPropertiesManagerFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideApiHelperFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideHeadersInterceptorFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideMoshiFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideOkHttpClientFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideRateLimiterFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideRetrofitFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideApiErrorMapperFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideEnvironmentFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideHeadersProviderFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvidePropertiesStorageFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideQonversionRepositoryFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideRepositoryFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideTokenStorageFactory;
import com.qonversion.android.sdk.internal.di.module.ServicesModule;
import com.qonversion.android.sdk.internal.di.module.ServicesModule_ProvideUserInfoServiceFactory;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QRemoteConfigService;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import com.squareup.moshi.Moshi;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class DaggerAppComponent implements AppComponent {
    private Provider<ActivityProvider> activityProvider;
    private Provider<ApiErrorMapper> provideApiErrorMapperProvider;
    private Provider<ApiHelper> provideApiHelperProvider;
    private Provider<AppStateProvider> provideAppStateProvider;
    private Provider<Application> provideApplicationProvider;
    private Provider<AutomationsEventMapper> provideAutomationsEventMapperProvider;
    private Provider<QAutomationsManager> provideAutomationsManagerProvider;
    private Provider<InternalConfig> provideConfigProvider;
    private Provider<EnvironmentProvider> provideEnvironmentProvider;
    private Provider<QFallbacksService> provideFallbackServiceProvider;
    private Provider<NetworkInterceptor> provideHeadersInterceptorProvider;
    private Provider<ApiHeadersProvider> provideHeadersProvider;
    private Provider<QIdentityManager> provideIdentityManagerProvider;
    private Provider<IncrementalDelayCalculator> provideIncrementalDelayCalculatorProvider;
    private Provider<LaunchResultCacheWrapper> provideLaunchResultCacheWrapperProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<Moshi> provideMoshiProvider;
    private Provider<OkHttpClient> provideOkHttpClientProvider;
    private Provider<UserPropertiesStorage> providePropertiesStorageProvider;
    private Provider<PurchasesCache> providePurchasesCacheProvider;
    private Provider<DefaultRepository> provideQonversionRepositoryProvider;
    private Provider<RateLimiter> provideRateLimiterProvider;
    private Provider<QRepository> provideRepositoryProvider;
    private Provider<Retrofit> provideRetrofitProvider;
    private Provider<SharedPreferencesCache> provideSharedPreferencesCacheProvider;
    private Provider<SharedPreferences> provideSharedPreferencesProvider;
    private Provider<TokenStorage> provideTokenStorageProvider;
    private Provider<QUserInfoService> provideUserInfoServiceProvider;
    private Provider<QUserPropertiesManager> provideUserPropertiesManagerProvider;

    private DaggerAppComponent(AppModule appModule, RepositoryModule repositoryModule, NetworkModule networkModule, ManagersModule managersModule, ServicesModule servicesModule) {
        initialize(appModule, repositoryModule, networkModule, managersModule, servicesModule);
    }

    public static Builder builder() {
        return new Builder();
    }

    private QRemoteConfigService getQRemoteConfigService() {
        return new QRemoteConfigService(this.provideRepositoryProvider.get());
    }

    private void initialize(AppModule appModule, RepositoryModule repositoryModule, NetworkModule networkModule, ManagersModule managersModule, ServicesModule servicesModule) {
        this.provideApplicationProvider = DoubleCheck.provider(AppModule_ProvideApplicationFactory.create(appModule));
        this.provideConfigProvider = DoubleCheck.provider(AppModule_ProvideConfigFactory.create(appModule));
        Provider<SharedPreferences> provider = DoubleCheck.provider(AppModule_ProvideSharedPreferencesFactory.create(appModule, this.provideApplicationProvider));
        this.provideSharedPreferencesProvider = provider;
        this.provideSharedPreferencesCacheProvider = DoubleCheck.provider(AppModule_ProvideSharedPreferencesCacheFactory.create(appModule, provider));
        Provider<EnvironmentProvider> provider2 = DoubleCheck.provider(RepositoryModule_ProvideEnvironmentFactory.create(repositoryModule, this.provideApplicationProvider));
        this.provideEnvironmentProvider = provider2;
        this.provideHeadersProvider = DoubleCheck.provider(RepositoryModule_ProvideHeadersProviderFactory.create(repositoryModule, this.provideConfigProvider, this.provideSharedPreferencesCacheProvider, provider2));
        Provider<ApiHelper> provider3 = DoubleCheck.provider(NetworkModule_ProvideApiHelperFactory.create(networkModule, this.provideConfigProvider));
        this.provideApiHelperProvider = provider3;
        Provider<NetworkInterceptor> provider4 = DoubleCheck.provider(NetworkModule_ProvideHeadersInterceptorFactory.create(networkModule, this.provideHeadersProvider, this.provideConfigProvider, provider3));
        this.provideHeadersInterceptorProvider = provider4;
        this.provideOkHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideOkHttpClientFactory.create(networkModule, this.provideApplicationProvider, provider4));
        Provider<Moshi> provider5 = DoubleCheck.provider(NetworkModule_ProvideMoshiFactory.create(networkModule));
        this.provideMoshiProvider = provider5;
        this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(networkModule, this.provideOkHttpClientProvider, provider5, this.provideConfigProvider));
        this.provideLoggerProvider = DoubleCheck.provider(AppModule_ProvideLoggerFactory.create(appModule));
        this.provideApiErrorMapperProvider = DoubleCheck.provider(RepositoryModule_ProvideApiErrorMapperFactory.create(repositoryModule, this.provideApiHelperProvider));
        this.provideIncrementalDelayCalculatorProvider = DoubleCheck.provider(ManagersModule_ProvideIncrementalDelayCalculatorFactory.create(managersModule));
        Provider<RateLimiter> provider6 = DoubleCheck.provider(NetworkModule_ProvideRateLimiterFactory.create(networkModule));
        this.provideRateLimiterProvider = provider6;
        this.provideRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideRepositoryFactory.create(repositoryModule, this.provideRetrofitProvider, this.provideEnvironmentProvider, this.provideConfigProvider, this.provideLoggerProvider, this.provideApiErrorMapperProvider, this.provideIncrementalDelayCalculatorProvider, provider6));
        this.provideQonversionRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideQonversionRepositoryFactory.create(repositoryModule, this.provideRetrofitProvider, this.provideEnvironmentProvider, this.provideConfigProvider, this.provideLoggerProvider, this.provideApiErrorMapperProvider, this.provideIncrementalDelayCalculatorProvider));
        this.providePurchasesCacheProvider = DoubleCheck.provider(AppModule_ProvidePurchasesCacheFactory.create(appModule, this.provideSharedPreferencesCacheProvider));
        Provider<QFallbacksService> provider7 = DoubleCheck.provider(AppModule_ProvideFallbackServiceFactory.create(appModule, this.provideApplicationProvider, this.provideMoshiProvider, this.provideLoggerProvider));
        this.provideFallbackServiceProvider = provider7;
        this.provideLaunchResultCacheWrapperProvider = DoubleCheck.provider(AppModule_ProvideLaunchResultCacheWrapperFactory.create(appModule, this.provideMoshiProvider, this.provideSharedPreferencesCacheProvider, provider7));
        this.provideAutomationsEventMapperProvider = DoubleCheck.provider(ManagersModule_ProvideAutomationsEventMapperFactory.create(managersModule, this.provideLoggerProvider));
        ActivityProvider_Factory activityProvider_FactoryCreate = ActivityProvider_Factory.create(this.provideApplicationProvider);
        this.activityProvider = activityProvider_FactoryCreate;
        this.provideAutomationsManagerProvider = DoubleCheck.provider(ManagersModule_ProvideAutomationsManagerFactory.create(managersModule, this.provideRepositoryProvider, this.provideAutomationsEventMapperProvider, this.provideApplicationProvider, activityProvider_FactoryCreate));
        Provider<TokenStorage> provider8 = DoubleCheck.provider(RepositoryModule_ProvideTokenStorageFactory.create(repositoryModule, this.provideSharedPreferencesProvider));
        this.provideTokenStorageProvider = provider8;
        Provider<QUserInfoService> provider9 = DoubleCheck.provider(ServicesModule_ProvideUserInfoServiceFactory.create(servicesModule, this.provideSharedPreferencesCacheProvider, provider8));
        this.provideUserInfoServiceProvider = provider9;
        this.provideIdentityManagerProvider = DoubleCheck.provider(ManagersModule_ProvideIdentityManagerFactory.create(managersModule, this.provideRepositoryProvider, provider9));
        this.providePropertiesStorageProvider = DoubleCheck.provider(RepositoryModule_ProvidePropertiesStorageFactory.create(repositoryModule));
        Provider<AppStateProvider> provider10 = DoubleCheck.provider(AppModule_ProvideAppStateProviderFactory.create(appModule));
        this.provideAppStateProvider = provider10;
        this.provideUserPropertiesManagerProvider = DoubleCheck.provider(ManagersModule_ProvideUserPropertiesManagerFactory.create(managersModule, this.provideApplicationProvider, this.provideRepositoryProvider, this.providePropertiesStorageProvider, this.provideIncrementalDelayCalculatorProvider, provider10, this.provideLoggerProvider));
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QRepository repository() {
        return this.provideRepositoryProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public DefaultRepository qonversionRepository() {
        return this.provideQonversionRepositoryProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public PurchasesCache purchasesCache() {
        return this.providePurchasesCacheProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QHandledPurchasesCache handledPurchasesCache() {
        return new QHandledPurchasesCache();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public LaunchResultCacheWrapper launchResultCacheWrapper() {
        return this.provideLaunchResultCacheWrapperProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QAutomationsManager automationsManager() {
        return this.provideAutomationsManagerProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QIdentityManager identityManager() {
        return this.provideIdentityManagerProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QUserInfoService userInfoService() {
        return this.provideUserInfoServiceProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QUserPropertiesManager userPropertiesManager() {
        return this.provideUserPropertiesManagerProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QRemoteConfigManager remoteConfigManager() {
        return new QRemoteConfigManager(getQRemoteConfigService(), this.provideFallbackServiceProvider.get());
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public InternalConfig internalConfig() {
        return this.provideConfigProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public AppStateProvider appStateProvider() {
        return this.provideAppStateProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public SharedPreferencesCache sharedPreferencesCache() {
        return this.provideSharedPreferencesCacheProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QExceptionManager exceptionManager() {
        return new QExceptionManager(this.provideRepositoryProvider.get(), this.provideConfigProvider.get(), this.provideHeadersProvider.get(), this.provideMoshiProvider.get());
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QFallbacksService fallbacksService() {
        return this.provideFallbackServiceProvider.get();
    }

    public static final class Builder {
        private AppModule appModule;
        private ManagersModule managersModule;
        private NetworkModule networkModule;
        private RepositoryModule repositoryModule;
        private ServicesModule servicesModule;

        private Builder() {
        }

        public Builder appModule(AppModule appModule) {
            this.appModule = (AppModule) Preconditions.checkNotNull(appModule);
            return this;
        }

        public Builder repositoryModule(RepositoryModule repositoryModule) {
            this.repositoryModule = (RepositoryModule) Preconditions.checkNotNull(repositoryModule);
            return this;
        }

        public Builder networkModule(NetworkModule networkModule) {
            this.networkModule = (NetworkModule) Preconditions.checkNotNull(networkModule);
            return this;
        }

        public Builder managersModule(ManagersModule managersModule) {
            this.managersModule = (ManagersModule) Preconditions.checkNotNull(managersModule);
            return this;
        }

        public Builder servicesModule(ServicesModule servicesModule) {
            this.servicesModule = (ServicesModule) Preconditions.checkNotNull(servicesModule);
            return this;
        }

        public AppComponent build() {
            Preconditions.checkBuilderRequirement(this.appModule, AppModule.class);
            if (this.repositoryModule == null) {
                this.repositoryModule = new RepositoryModule();
            }
            if (this.networkModule == null) {
                this.networkModule = new NetworkModule();
            }
            if (this.managersModule == null) {
                this.managersModule = new ManagersModule();
            }
            if (this.servicesModule == null) {
                this.servicesModule = new ServicesModule();
            }
            return new DaggerAppComponent(this.appModule, this.repositoryModule, this.networkModule, this.managersModule, this.servicesModule);
        }
    }
}
