package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideAppStateProviderFactory implements Factory<AppStateProvider> {
    private final AppModule module;

    public AppModule_ProvideAppStateProviderFactory(AppModule appModule) {
        this.module = appModule;
    }

    @Override // javax.inject.Provider
    public AppStateProvider get() {
        return provideAppStateProvider(this.module);
    }

    public static AppModule_ProvideAppStateProviderFactory create(AppModule appModule) {
        return new AppModule_ProvideAppStateProviderFactory(appModule);
    }

    public static AppStateProvider provideAppStateProvider(AppModule appModule) {
        return (AppStateProvider) Preconditions.checkNotNull(appModule.getAppStateProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
