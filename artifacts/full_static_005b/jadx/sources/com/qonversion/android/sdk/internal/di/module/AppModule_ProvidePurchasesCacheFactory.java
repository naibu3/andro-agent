package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class AppModule_ProvidePurchasesCacheFactory implements Factory<PurchasesCache> {
    private final AppModule module;
    private final Provider<SharedPreferencesCache> sharedPreferencesProvider;

    public AppModule_ProvidePurchasesCacheFactory(AppModule appModule, Provider<SharedPreferencesCache> provider) {
        this.module = appModule;
        this.sharedPreferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public PurchasesCache get() {
        return providePurchasesCache(this.module, this.sharedPreferencesProvider.get());
    }

    public static AppModule_ProvidePurchasesCacheFactory create(AppModule appModule, Provider<SharedPreferencesCache> provider) {
        return new AppModule_ProvidePurchasesCacheFactory(appModule, provider);
    }

    public static PurchasesCache providePurchasesCache(AppModule appModule, SharedPreferencesCache sharedPreferencesCache) {
        return (PurchasesCache) Preconditions.checkNotNull(appModule.providePurchasesCache(sharedPreferencesCache), "Cannot return null from a non-@Nullable @Provides method");
    }
}
