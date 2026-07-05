package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class AppModule_ProvideLaunchResultCacheWrapperFactory implements Factory<LaunchResultCacheWrapper> {
    private final Provider<QFallbacksService> fallbacksServiceProvider;
    private final AppModule module;
    private final Provider<Moshi> moshiProvider;
    private final Provider<SharedPreferencesCache> sharedPreferencesCacheProvider;

    public AppModule_ProvideLaunchResultCacheWrapperFactory(AppModule appModule, Provider<Moshi> provider, Provider<SharedPreferencesCache> provider2, Provider<QFallbacksService> provider3) {
        this.module = appModule;
        this.moshiProvider = provider;
        this.sharedPreferencesCacheProvider = provider2;
        this.fallbacksServiceProvider = provider3;
    }

    @Override // javax.inject.Provider
    public LaunchResultCacheWrapper get() {
        return provideLaunchResultCacheWrapper(this.module, this.moshiProvider.get(), this.sharedPreferencesCacheProvider.get(), this.fallbacksServiceProvider.get());
    }

    public static AppModule_ProvideLaunchResultCacheWrapperFactory create(AppModule appModule, Provider<Moshi> provider, Provider<SharedPreferencesCache> provider2, Provider<QFallbacksService> provider3) {
        return new AppModule_ProvideLaunchResultCacheWrapperFactory(appModule, provider, provider2, provider3);
    }

    public static LaunchResultCacheWrapper provideLaunchResultCacheWrapper(AppModule appModule, Moshi moshi, SharedPreferencesCache sharedPreferencesCache, QFallbacksService qFallbacksService) {
        return (LaunchResultCacheWrapper) Preconditions.checkNotNull(appModule.provideLaunchResultCacheWrapper(moshi, sharedPreferencesCache, qFallbacksService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
