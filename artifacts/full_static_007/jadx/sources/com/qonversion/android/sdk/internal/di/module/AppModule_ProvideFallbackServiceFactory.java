package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class AppModule_ProvideFallbackServiceFactory implements Factory<QFallbacksService> {
    private final Provider<Application> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final AppModule module;
    private final Provider<Moshi> moshiProvider;

    public AppModule_ProvideFallbackServiceFactory(AppModule appModule, Provider<Application> provider, Provider<Moshi> provider2, Provider<Logger> provider3) {
        this.module = appModule;
        this.contextProvider = provider;
        this.moshiProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public QFallbacksService get() {
        return provideFallbackService(this.module, this.contextProvider.get(), this.moshiProvider.get(), this.loggerProvider.get());
    }

    public static AppModule_ProvideFallbackServiceFactory create(AppModule appModule, Provider<Application> provider, Provider<Moshi> provider2, Provider<Logger> provider3) {
        return new AppModule_ProvideFallbackServiceFactory(appModule, provider, provider2, provider3);
    }

    public static QFallbacksService provideFallbackService(AppModule appModule, Application application, Moshi moshi, Logger logger) {
        return (QFallbacksService) Preconditions.checkNotNull(appModule.provideFallbackService(application, moshi, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
