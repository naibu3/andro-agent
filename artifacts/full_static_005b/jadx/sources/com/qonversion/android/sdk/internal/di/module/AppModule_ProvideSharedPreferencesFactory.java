package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
    private final Provider<Application> contextProvider;
    private final AppModule module;

    public AppModule_ProvideSharedPreferencesFactory(AppModule appModule, Provider<Application> provider) {
        this.module = appModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return provideSharedPreferences(this.module, this.contextProvider.get());
    }

    public static AppModule_ProvideSharedPreferencesFactory create(AppModule appModule, Provider<Application> provider) {
        return new AppModule_ProvideSharedPreferencesFactory(appModule, provider);
    }

    public static SharedPreferences provideSharedPreferences(AppModule appModule, Application application) {
        return (SharedPreferences) Preconditions.checkNotNull(appModule.provideSharedPreferences(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
