package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.logger.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideLoggerFactory implements Factory<Logger> {
    private final AppModule module;

    public AppModule_ProvideLoggerFactory(AppModule appModule) {
        this.module = appModule;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger(this.module);
    }

    public static AppModule_ProvideLoggerFactory create(AppModule appModule) {
        return new AppModule_ProvideLoggerFactory(appModule);
    }

    public static Logger provideLogger(AppModule appModule) {
        return (Logger) Preconditions.checkNotNull(appModule.provideLogger(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
