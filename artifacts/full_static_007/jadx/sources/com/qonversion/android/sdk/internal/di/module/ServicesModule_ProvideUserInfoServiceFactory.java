package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ServicesModule_ProvideUserInfoServiceFactory implements Factory<QUserInfoService> {
    private final Provider<SharedPreferencesCache> cacheStorageProvider;
    private final ServicesModule module;
    private final Provider<TokenStorage> tokenStorageProvider;

    public ServicesModule_ProvideUserInfoServiceFactory(ServicesModule servicesModule, Provider<SharedPreferencesCache> provider, Provider<TokenStorage> provider2) {
        this.module = servicesModule;
        this.cacheStorageProvider = provider;
        this.tokenStorageProvider = provider2;
    }

    @Override // javax.inject.Provider
    public QUserInfoService get() {
        return provideUserInfoService(this.module, this.cacheStorageProvider.get(), this.tokenStorageProvider.get());
    }

    public static ServicesModule_ProvideUserInfoServiceFactory create(ServicesModule servicesModule, Provider<SharedPreferencesCache> provider, Provider<TokenStorage> provider2) {
        return new ServicesModule_ProvideUserInfoServiceFactory(servicesModule, provider, provider2);
    }

    public static QUserInfoService provideUserInfoService(ServicesModule servicesModule, SharedPreferencesCache sharedPreferencesCache, TokenStorage tokenStorage) {
        return (QUserInfoService) Preconditions.checkNotNull(servicesModule.provideUserInfoService(sharedPreferencesCache, tokenStorage), "Cannot return null from a non-@Nullable @Provides method");
    }
}
