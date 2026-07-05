package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class RepositoryModule_ProvideQonversionRepositoryFactory implements Factory<DefaultRepository> {
    private final Provider<ApiErrorMapper> apiErrorMapperProvider;
    private final Provider<InternalConfig> configProvider;
    private final Provider<IncrementalDelayCalculator> delayCalculatorProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final Provider<Logger> loggerProvider;
    private final RepositoryModule module;
    private final Provider<Retrofit> retrofitProvider;

    public RepositoryModule_ProvideQonversionRepositoryFactory(RepositoryModule repositoryModule, Provider<Retrofit> provider, Provider<EnvironmentProvider> provider2, Provider<InternalConfig> provider3, Provider<Logger> provider4, Provider<ApiErrorMapper> provider5, Provider<IncrementalDelayCalculator> provider6) {
        this.module = repositoryModule;
        this.retrofitProvider = provider;
        this.environmentProvider = provider2;
        this.configProvider = provider3;
        this.loggerProvider = provider4;
        this.apiErrorMapperProvider = provider5;
        this.delayCalculatorProvider = provider6;
    }

    @Override // javax.inject.Provider
    public DefaultRepository get() {
        return provideQonversionRepository(this.module, this.retrofitProvider.get(), this.environmentProvider.get(), this.configProvider.get(), this.loggerProvider.get(), this.apiErrorMapperProvider.get(), this.delayCalculatorProvider.get());
    }

    public static RepositoryModule_ProvideQonversionRepositoryFactory create(RepositoryModule repositoryModule, Provider<Retrofit> provider, Provider<EnvironmentProvider> provider2, Provider<InternalConfig> provider3, Provider<Logger> provider4, Provider<ApiErrorMapper> provider5, Provider<IncrementalDelayCalculator> provider6) {
        return new RepositoryModule_ProvideQonversionRepositoryFactory(repositoryModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultRepository provideQonversionRepository(RepositoryModule repositoryModule, Retrofit retrofit, EnvironmentProvider environmentProvider, InternalConfig internalConfig, Logger logger, ApiErrorMapper apiErrorMapper, IncrementalDelayCalculator incrementalDelayCalculator) {
        return (DefaultRepository) Preconditions.checkNotNull(repositoryModule.provideQonversionRepository(retrofit, environmentProvider, internalConfig, logger, apiErrorMapper, incrementalDelayCalculator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
