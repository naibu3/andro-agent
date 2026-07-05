package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NetworkModule_ProvideApiHelperFactory implements Factory<ApiHelper> {
    private final Provider<InternalConfig> internalConfigProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideApiHelperFactory(NetworkModule networkModule, Provider<InternalConfig> provider) {
        this.module = networkModule;
        this.internalConfigProvider = provider;
    }

    @Override // javax.inject.Provider
    public ApiHelper get() {
        return provideApiHelper(this.module, this.internalConfigProvider.get());
    }

    public static NetworkModule_ProvideApiHelperFactory create(NetworkModule networkModule, Provider<InternalConfig> provider) {
        return new NetworkModule_ProvideApiHelperFactory(networkModule, provider);
    }

    public static ApiHelper provideApiHelper(NetworkModule networkModule, InternalConfig internalConfig) {
        return (ApiHelper) Preconditions.checkNotNull(networkModule.provideApiHelper(internalConfig), "Cannot return null from a non-@Nullable @Provides method");
    }
}
