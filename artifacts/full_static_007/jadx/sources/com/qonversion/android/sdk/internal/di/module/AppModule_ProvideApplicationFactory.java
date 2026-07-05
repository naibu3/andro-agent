package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideApplicationFactory implements Factory<Application> {
    private final AppModule module;

    public AppModule_ProvideApplicationFactory(AppModule appModule) {
        this.module = appModule;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.module);
    }

    public static AppModule_ProvideApplicationFactory create(AppModule appModule) {
        return new AppModule_ProvideApplicationFactory(appModule);
    }

    public static Application provideApplication(AppModule appModule) {
        return (Application) Preconditions.checkNotNull(appModule.getApplication(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
