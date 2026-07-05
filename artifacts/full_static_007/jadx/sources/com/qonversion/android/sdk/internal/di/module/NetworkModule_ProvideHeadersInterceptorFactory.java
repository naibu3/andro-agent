package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NetworkModule_ProvideHeadersInterceptorFactory implements Factory<NetworkInterceptor> {
    private final Provider<ApiHeadersProvider> apiHeadersProvider;
    private final Provider<ApiHelper> apiHelperProvider;
    private final Provider<InternalConfig> configProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideHeadersInterceptorFactory(NetworkModule networkModule, Provider<ApiHeadersProvider> provider, Provider<InternalConfig> provider2, Provider<ApiHelper> provider3) {
        this.module = networkModule;
        this.apiHeadersProvider = provider;
        this.configProvider = provider2;
        this.apiHelperProvider = provider3;
    }

    @Override // javax.inject.Provider
    public NetworkInterceptor get() {
        return provideHeadersInterceptor(this.module, this.apiHeadersProvider.get(), this.configProvider.get(), this.apiHelperProvider.get());
    }

    public static NetworkModule_ProvideHeadersInterceptorFactory create(NetworkModule networkModule, Provider<ApiHeadersProvider> provider, Provider<InternalConfig> provider2, Provider<ApiHelper> provider3) {
        return new NetworkModule_ProvideHeadersInterceptorFactory(networkModule, provider, provider2, provider3);
    }

    public static NetworkInterceptor provideHeadersInterceptor(NetworkModule networkModule, ApiHeadersProvider apiHeadersProvider, InternalConfig internalConfig, ApiHelper apiHelper) {
        return (NetworkInterceptor) Preconditions.checkNotNull(networkModule.provideHeadersInterceptor(apiHeadersProvider, internalConfig, apiHelper), "Cannot return null from a non-@Nullable @Provides method");
    }
}
