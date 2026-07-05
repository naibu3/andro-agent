package com.qonversion.android.sdk.internal.api;

import com.qonversion.android.sdk.internal.InternalConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NetworkInterceptor_Factory implements Factory<NetworkInterceptor> {
    private final Provider<ApiHelper> apiHelperProvider;
    private final Provider<InternalConfig> configProvider;
    private final Provider<ApiHeadersProvider> headersProvider;

    public NetworkInterceptor_Factory(Provider<ApiHeadersProvider> provider, Provider<ApiHelper> provider2, Provider<InternalConfig> provider3) {
        this.headersProvider = provider;
        this.apiHelperProvider = provider2;
        this.configProvider = provider3;
    }

    @Override // javax.inject.Provider
    public NetworkInterceptor get() {
        return new NetworkInterceptor(this.headersProvider.get(), this.apiHelperProvider.get(), this.configProvider.get());
    }

    public static NetworkInterceptor_Factory create(Provider<ApiHeadersProvider> provider, Provider<ApiHelper> provider2, Provider<InternalConfig> provider3) {
        return new NetworkInterceptor_Factory(provider, provider2, provider3);
    }

    public static NetworkInterceptor newInstance(ApiHeadersProvider apiHeadersProvider, ApiHelper apiHelper, InternalConfig internalConfig) {
        return new NetworkInterceptor(apiHeadersProvider, apiHelper, internalConfig);
    }
}
