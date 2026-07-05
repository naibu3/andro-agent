package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
    private final Provider<OkHttpClient> clientProvider;
    private final Provider<InternalConfig> internalConfigProvider;
    private final NetworkModule module;
    private final Provider<Moshi> moshiProvider;

    public NetworkModule_ProvideRetrofitFactory(NetworkModule networkModule, Provider<OkHttpClient> provider, Provider<Moshi> provider2, Provider<InternalConfig> provider3) {
        this.module = networkModule;
        this.clientProvider = provider;
        this.moshiProvider = provider2;
        this.internalConfigProvider = provider3;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideRetrofit(this.module, this.clientProvider.get(), this.moshiProvider.get(), this.internalConfigProvider.get());
    }

    public static NetworkModule_ProvideRetrofitFactory create(NetworkModule networkModule, Provider<OkHttpClient> provider, Provider<Moshi> provider2, Provider<InternalConfig> provider3) {
        return new NetworkModule_ProvideRetrofitFactory(networkModule, provider, provider2, provider3);
    }

    public static Retrofit provideRetrofit(NetworkModule networkModule, OkHttpClient okHttpClient, Moshi moshi, InternalConfig internalConfig) {
        return (Retrofit) Preconditions.checkNotNull(networkModule.provideRetrofit(okHttpClient, moshi, internalConfig), "Cannot return null from a non-@Nullable @Provides method");
    }
}
