package com.qonversion.android.sdk.internal.api;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ApiHeadersProvider_Factory implements Factory<ApiHeadersProvider> {
    private final Provider<InternalConfig> configProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final Provider<SharedPreferencesCache> sharedPreferencesCacheProvider;

    public ApiHeadersProvider_Factory(Provider<InternalConfig> provider, Provider<SharedPreferencesCache> provider2, Provider<EnvironmentProvider> provider3) {
        this.configProvider = provider;
        this.sharedPreferencesCacheProvider = provider2;
        this.environmentProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ApiHeadersProvider get() {
        return new ApiHeadersProvider(this.configProvider.get(), this.sharedPreferencesCacheProvider.get(), this.environmentProvider.get());
    }

    public static ApiHeadersProvider_Factory create(Provider<InternalConfig> provider, Provider<SharedPreferencesCache> provider2, Provider<EnvironmentProvider> provider3) {
        return new ApiHeadersProvider_Factory(provider, provider2, provider3);
    }

    public static ApiHeadersProvider newInstance(InternalConfig internalConfig, SharedPreferencesCache sharedPreferencesCache, EnvironmentProvider environmentProvider) {
        return new ApiHeadersProvider(internalConfig, sharedPreferencesCache, environmentProvider);
    }
}
