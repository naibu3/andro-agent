package com.stripe.android.common.analytics.experiment;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.state.RetrieveCustomerEmail;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class DefaultLogLinkHoldbackExperiment_Factory implements Factory<DefaultLogLinkHoldbackExperiment> {
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<LinkConfigurationCoordinator> linkConfigurationCoordinatorProvider;
    private final Provider<LinkRepository> linkDisabledApiRepositoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<EventReporter.Mode> modeProvider;
    private final Provider<RetrieveCustomerEmail> retrieveCustomerEmailProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultLogLinkHoldbackExperiment_Factory(Provider<EventReporter> provider, Provider<LinkRepository> provider2, Provider<CoroutineContext> provider3, Provider<RetrieveCustomerEmail> provider4, Provider<LinkConfigurationCoordinator> provider5, Provider<EventReporter.Mode> provider6, Provider<Logger> provider7) {
        this.eventReporterProvider = provider;
        this.linkDisabledApiRepositoryProvider = provider2;
        this.workContextProvider = provider3;
        this.retrieveCustomerEmailProvider = provider4;
        this.linkConfigurationCoordinatorProvider = provider5;
        this.modeProvider = provider6;
        this.loggerProvider = provider7;
    }

    @Override // javax.inject.Provider
    public DefaultLogLinkHoldbackExperiment get() {
        return newInstance(this.eventReporterProvider.get(), this.linkDisabledApiRepositoryProvider.get(), this.workContextProvider.get(), this.retrieveCustomerEmailProvider.get(), this.linkConfigurationCoordinatorProvider.get(), this.modeProvider.get(), this.loggerProvider.get());
    }

    public static DefaultLogLinkHoldbackExperiment_Factory create(javax.inject.Provider<EventReporter> provider, javax.inject.Provider<LinkRepository> provider2, javax.inject.Provider<CoroutineContext> provider3, javax.inject.Provider<RetrieveCustomerEmail> provider4, javax.inject.Provider<LinkConfigurationCoordinator> provider5, javax.inject.Provider<EventReporter.Mode> provider6, javax.inject.Provider<Logger> provider7) {
        return new DefaultLogLinkHoldbackExperiment_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static DefaultLogLinkHoldbackExperiment_Factory create(Provider<EventReporter> provider, Provider<LinkRepository> provider2, Provider<CoroutineContext> provider3, Provider<RetrieveCustomerEmail> provider4, Provider<LinkConfigurationCoordinator> provider5, Provider<EventReporter.Mode> provider6, Provider<Logger> provider7) {
        return new DefaultLogLinkHoldbackExperiment_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DefaultLogLinkHoldbackExperiment newInstance(EventReporter eventReporter, LinkRepository linkRepository, CoroutineContext coroutineContext, RetrieveCustomerEmail retrieveCustomerEmail, LinkConfigurationCoordinator linkConfigurationCoordinator, EventReporter.Mode mode, Logger logger) {
        return new DefaultLogLinkHoldbackExperiment(eventReporter, linkRepository, coroutineContext, retrieveCustomerEmail, linkConfigurationCoordinator, mode, logger);
    }
}
