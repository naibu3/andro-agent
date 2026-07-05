package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<Application> contextProvider;
    private final Provider<NetworkInterceptor> interceptorProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideOkHttpClientFactory(NetworkModule networkModule, Provider<Application> provider, Provider<NetworkInterceptor> provider2) {
        this.module = networkModule;
        this.contextProvider = provider;
        this.interceptorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideOkHttpClient(this.module, this.contextProvider.get(), this.interceptorProvider.get());
    }

    public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule networkModule, Provider<Application> provider, Provider<NetworkInterceptor> provider2) {
        return new NetworkModule_ProvideOkHttpClientFactory(networkModule, provider, provider2);
    }

    public static OkHttpClient provideOkHttpClient(NetworkModule networkModule, Application application, NetworkInterceptor networkInterceptor) {
        return (OkHttpClient) Preconditions.checkNotNull(networkModule.provideOkHttpClient(application, networkInterceptor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
