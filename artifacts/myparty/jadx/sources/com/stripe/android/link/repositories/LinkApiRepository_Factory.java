package com.stripe.android.link.repositories;

import android.app.Application;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.repository.ConsumersApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class LinkApiRepository_Factory implements Factory<LinkApiRepository> {
    private final Provider<Application> applicationProvider;
    private final Provider<ConsumersApiService> consumersApiServiceProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<Function0<String>> stripeAccountIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public LinkApiRepository_Factory(Provider<Application> provider, Provider<Function0<String>> provider2, Provider<Function0<String>> provider3, Provider<StripeRepository> provider4, Provider<ConsumersApiService> provider5, Provider<CoroutineContext> provider6, Provider<Locale> provider7, Provider<ErrorReporter> provider8) {
        this.applicationProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeAccountIdProvider = provider3;
        this.stripeRepositoryProvider = provider4;
        this.consumersApiServiceProvider = provider5;
        this.workContextProvider = provider6;
        this.localeProvider = provider7;
        this.errorReporterProvider = provider8;
    }

    @Override // javax.inject.Provider
    public LinkApiRepository get() {
        return newInstance(this.applicationProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.stripeRepositoryProvider.get(), this.consumersApiServiceProvider.get(), this.workContextProvider.get(), this.localeProvider.get(), this.errorReporterProvider.get());
    }

    public static LinkApiRepository_Factory create(javax.inject.Provider<Application> provider, javax.inject.Provider<Function0<String>> provider2, javax.inject.Provider<Function0<String>> provider3, javax.inject.Provider<StripeRepository> provider4, javax.inject.Provider<ConsumersApiService> provider5, javax.inject.Provider<CoroutineContext> provider6, javax.inject.Provider<Locale> provider7, javax.inject.Provider<ErrorReporter> provider8) {
        return new LinkApiRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8));
    }

    public static LinkApiRepository_Factory create(Provider<Application> provider, Provider<Function0<String>> provider2, Provider<Function0<String>> provider3, Provider<StripeRepository> provider4, Provider<ConsumersApiService> provider5, Provider<CoroutineContext> provider6, Provider<Locale> provider7, Provider<ErrorReporter> provider8) {
        return new LinkApiRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static LinkApiRepository newInstance(Application application, Function0<String> function0, Function0<String> function02, StripeRepository stripeRepository, ConsumersApiService consumersApiService, CoroutineContext coroutineContext, Locale locale, ErrorReporter errorReporter) {
        return new LinkApiRepository(application, function0, function02, stripeRepository, consumersApiService, coroutineContext, locale, errorReporter);
    }
}
