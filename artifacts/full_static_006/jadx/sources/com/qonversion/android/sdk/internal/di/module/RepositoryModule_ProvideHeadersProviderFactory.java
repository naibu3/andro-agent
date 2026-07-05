package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class RepositoryModule_ProvideHeadersProviderFactory implements Factory<ApiHeadersProvider> {
    private final Provider<InternalConfig> configProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final RepositoryModule module;
    private final Provider<SharedPreferencesCache> sharedPreferencesCacheProvider;

    public RepositoryModule_ProvideHeadersProviderFactory(RepositoryModule repositoryModule, Provider<InternalConfig> provider, Provider<SharedPreferencesCache> provider2, Provider<EnvironmentProvider> provider3) {
        this.module = repositoryModule;
        this.configProvider = provider;
        this.sharedPreferencesCacheProvider = provider2;
        this.environmentProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ApiHeadersProvider get() {
        return provideHeadersProvider(this.module, this.configProvider.get(), this.sharedPreferencesCacheProvider.get(), this.environmentProvider.get());
    }

    public static RepositoryModule_ProvideHeadersProviderFactory create(RepositoryModule repositoryModule, Provider<InternalConfig> provider, Provider<SharedPreferencesCache> provider2, Provider<EnvironmentProvider> provider3) {
        return new RepositoryModule_ProvideHeadersProviderFactory(repositoryModule, provider, provider2, provider3);
    }

    public static ApiHeadersProvider provideHeadersProvider(RepositoryModule repositoryModule, InternalConfig internalConfig, SharedPreferencesCache sharedPreferencesCache, EnvironmentProvider environmentProvider) {
        return (ApiHeadersProvider) Preconditions.checkNotNull(repositoryModule.provideHeadersProvider(internalConfig, sharedPreferencesCache, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
