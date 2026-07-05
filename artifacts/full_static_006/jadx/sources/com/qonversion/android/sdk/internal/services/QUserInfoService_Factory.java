package com.qonversion.android.sdk.internal.services;

import com.qonversion.android.sdk.internal.storage.Cache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QUserInfoService_Factory implements Factory<QUserInfoService> {
    private final Provider<Cache> preferencesProvider;
    private final Provider<TokenStorage> tokenStorageProvider;

    public QUserInfoService_Factory(Provider<Cache> provider, Provider<TokenStorage> provider2) {
        this.preferencesProvider = provider;
        this.tokenStorageProvider = provider2;
    }

    @Override // javax.inject.Provider
    public QUserInfoService get() {
        return new QUserInfoService(this.preferencesProvider.get(), this.tokenStorageProvider.get());
    }

    public static QUserInfoService_Factory create(Provider<Cache> provider, Provider<TokenStorage> provider2) {
        return new QUserInfoService_Factory(provider, provider2);
    }

    public static QUserInfoService newInstance(Cache cache, TokenStorage tokenStorage) {
        return new QUserInfoService(cache, tokenStorage);
    }
}
