package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import com.stripe.android.core.Logger;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory implements Factory<LinkRepository> {
    private final Provider<Application> applicationProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<Logger> loggerProvider;
    private final LinkHoldbackExposureModule module;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<Function0<String>> stripeAccountIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory(LinkHoldbackExposureModule linkHoldbackExposureModule, Provider<Application> provider, Provider<Function0<String>> provider2, Provider<Function0<String>> provider3, Provider<StripeRepository> provider4, Provider<CoroutineContext> provider5, Provider<Logger> provider6, Provider<Locale> provider7, Provider<ErrorReporter> provider8) {
        this.module = linkHoldbackExposureModule;
        this.applicationProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeAccountIdProvider = provider3;
        this.stripeRepositoryProvider = provider4;
        this.workContextProvider = provider5;
        this.loggerProvider = provider6;
        this.localeProvider = provider7;
        this.errorReporterProvider = provider8;
    }

    @Override // javax.inject.Provider
    public LinkRepository get() {
        return providesLinkRepository(this.module, this.applicationProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.stripeRepositoryProvider.get(), this.workContextProvider.get(), this.loggerProvider.get(), this.localeProvider.get(), this.errorReporterProvider.get());
    }

    public static LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory create(LinkHoldbackExposureModule linkHoldbackExposureModule, javax.inject.Provider<Application> provider, javax.inject.Provider<Function0<String>> provider2, javax.inject.Provider<Function0<String>> provider3, javax.inject.Provider<StripeRepository> provider4, javax.inject.Provider<CoroutineContext> provider5, javax.inject.Provider<Logger> provider6, javax.inject.Provider<Locale> provider7, javax.inject.Provider<ErrorReporter> provider8) {
        return new LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory(linkHoldbackExposureModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8));
    }

    public static LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory create(LinkHoldbackExposureModule linkHoldbackExposureModule, Provider<Application> provider, Provider<Function0<String>> provider2, Provider<Function0<String>> provider3, Provider<StripeRepository> provider4, Provider<CoroutineContext> provider5, Provider<Logger> provider6, Provider<Locale> provider7, Provider<ErrorReporter> provider8) {
        return new LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory(linkHoldbackExposureModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static LinkRepository providesLinkRepository(LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, Function0<String> function0, Function0<String> function02, StripeRepository stripeRepository, CoroutineContext coroutineContext, Logger logger, Locale locale, ErrorReporter errorReporter) {
        return (LinkRepository) Preconditions.checkNotNullFromProvides(linkHoldbackExposureModule.providesLinkRepository(application, function0, function02, stripeRepository, coroutineContext, logger, locale, errorReporter));
    }
}
