package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory implements Factory<Function1<GooglePayEnvironment, GooglePayRepository>> {
    private final Provider<Context> appContextProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<Logger> loggerProvider;
    private final GooglePayLauncherModule module;

    public GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(GooglePayLauncherModule googlePayLauncherModule, Provider<Context> provider, Provider<Logger> provider2, Provider<ErrorReporter> provider3) {
        this.module = googlePayLauncherModule;
        this.appContextProvider = provider;
        this.loggerProvider = provider2;
        this.errorReporterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public Function1<GooglePayEnvironment, GooglePayRepository> get() {
        return provideGooglePayRepositoryFactory(this.module, this.appContextProvider.get(), this.loggerProvider.get(), this.errorReporterProvider.get());
    }

    public static GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory create(GooglePayLauncherModule googlePayLauncherModule, javax.inject.Provider<Context> provider, javax.inject.Provider<Logger> provider2, javax.inject.Provider<ErrorReporter> provider3) {
        return new GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(googlePayLauncherModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory create(GooglePayLauncherModule googlePayLauncherModule, Provider<Context> provider, Provider<Logger> provider2, Provider<ErrorReporter> provider3) {
        return new GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(googlePayLauncherModule, provider, provider2, provider3);
    }

    public static Function1<GooglePayEnvironment, GooglePayRepository> provideGooglePayRepositoryFactory(GooglePayLauncherModule googlePayLauncherModule, Context context, Logger logger, ErrorReporter errorReporter) {
        return (Function1) Preconditions.checkNotNullFromProvides(googlePayLauncherModule.provideGooglePayRepositoryFactory(context, logger, errorReporter));
    }
}
