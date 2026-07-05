package com.qonversion.android.sdk.internal.di.module;

import android.content.SharedPreferences;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class AppModule_ProvideSharedPreferencesCacheFactory implements Factory<SharedPreferencesCache> {
    private final AppModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public AppModule_ProvideSharedPreferencesCacheFactory(AppModule appModule, Provider<SharedPreferences> provider) {
        this.module = appModule;
        this.sharedPreferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public SharedPreferencesCache get() {
        return provideSharedPreferencesCache(this.module, this.sharedPreferencesProvider.get());
    }

    public static AppModule_ProvideSharedPreferencesCacheFactory create(AppModule appModule, Provider<SharedPreferences> provider) {
        return new AppModule_ProvideSharedPreferencesCacheFactory(appModule, provider);
    }

    public static SharedPreferencesCache provideSharedPreferencesCache(AppModule appModule, SharedPreferences sharedPreferences) {
        return (SharedPreferencesCache) Preconditions.checkNotNull(appModule.provideSharedPreferencesCache(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
