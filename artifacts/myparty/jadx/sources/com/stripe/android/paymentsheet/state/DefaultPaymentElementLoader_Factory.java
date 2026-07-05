package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.analytics.experiment.LogLinkHoldbackExperiment;
import com.stripe.android.core.Logger;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class DefaultPaymentElementLoader_Factory implements Factory<DefaultPaymentElementLoader> {
    private final Provider<LinkAccountStatusProvider> accountStatusProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<CvcRecollectionHandler> cvcRecollectionHandlerProvider;
    private final Provider<ElementsSessionRepository> elementsSessionRepositoryProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<ExternalPaymentMethodsRepository> externalPaymentMethodsRepositoryProvider;
    private final Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Provider<LinkGate.Factory> linkGateFactoryProvider;
    private final Provider<LinkStore> linkStoreProvider;
    private final Provider<LogLinkHoldbackExperiment> logLinkHoldbackExperimentProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<LpmRepository> lpmRepositoryProvider;
    private final Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Provider<RetrieveCustomerEmail> retrieveCustomerEmailProvider;
    private final Provider<UserFacingLogger> userFacingLoggerProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultPaymentElementLoader_Factory(Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider, Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<ElementsSessionRepository> provider3, Provider<CustomerRepository> provider4, Provider<LpmRepository> provider5, Provider<Logger> provider6, Provider<EventReporter> provider7, Provider<ErrorReporter> provider8, Provider<CoroutineContext> provider9, Provider<RetrieveCustomerEmail> provider10, Provider<LinkAccountStatusProvider> provider11, Provider<LogLinkHoldbackExperiment> provider12, Provider<LinkStore> provider13, Provider<LinkGate.Factory> provider14, Provider<ExternalPaymentMethodsRepository> provider15, Provider<UserFacingLogger> provider16, Provider<CvcRecollectionHandler> provider17) {
        this.prefsRepositoryFactoryProvider = provider;
        this.googlePayRepositoryFactoryProvider = provider2;
        this.elementsSessionRepositoryProvider = provider3;
        this.customerRepositoryProvider = provider4;
        this.lpmRepositoryProvider = provider5;
        this.loggerProvider = provider6;
        this.eventReporterProvider = provider7;
        this.errorReporterProvider = provider8;
        this.workContextProvider = provider9;
        this.retrieveCustomerEmailProvider = provider10;
        this.accountStatusProvider = provider11;
        this.logLinkHoldbackExperimentProvider = provider12;
        this.linkStoreProvider = provider13;
        this.linkGateFactoryProvider = provider14;
        this.externalPaymentMethodsRepositoryProvider = provider15;
        this.userFacingLoggerProvider = provider16;
        this.cvcRecollectionHandlerProvider = provider17;
    }

    @Override // javax.inject.Provider
    public DefaultPaymentElementLoader get() {
        return newInstance(this.prefsRepositoryFactoryProvider.get(), this.googlePayRepositoryFactoryProvider.get(), this.elementsSessionRepositoryProvider.get(), this.customerRepositoryProvider.get(), this.lpmRepositoryProvider.get(), this.loggerProvider.get(), this.eventReporterProvider.get(), this.errorReporterProvider.get(), this.workContextProvider.get(), this.retrieveCustomerEmailProvider.get(), this.accountStatusProvider.get(), this.logLinkHoldbackExperimentProvider.get(), this.linkStoreProvider.get(), this.linkGateFactoryProvider.get(), this.externalPaymentMethodsRepositoryProvider.get(), this.userFacingLoggerProvider.get(), this.cvcRecollectionHandlerProvider.get());
    }

    public static DefaultPaymentElementLoader_Factory create(javax.inject.Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider, javax.inject.Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, javax.inject.Provider<ElementsSessionRepository> provider3, javax.inject.Provider<CustomerRepository> provider4, javax.inject.Provider<LpmRepository> provider5, javax.inject.Provider<Logger> provider6, javax.inject.Provider<EventReporter> provider7, javax.inject.Provider<ErrorReporter> provider8, javax.inject.Provider<CoroutineContext> provider9, javax.inject.Provider<RetrieveCustomerEmail> provider10, javax.inject.Provider<LinkAccountStatusProvider> provider11, javax.inject.Provider<LogLinkHoldbackExperiment> provider12, javax.inject.Provider<LinkStore> provider13, javax.inject.Provider<LinkGate.Factory> provider14, javax.inject.Provider<ExternalPaymentMethodsRepository> provider15, javax.inject.Provider<UserFacingLogger> provider16, javax.inject.Provider<CvcRecollectionHandler> provider17) {
        return new DefaultPaymentElementLoader_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14), Providers.asDaggerProvider(provider15), Providers.asDaggerProvider(provider16), Providers.asDaggerProvider(provider17));
    }

    public static DefaultPaymentElementLoader_Factory create(Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider, Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<ElementsSessionRepository> provider3, Provider<CustomerRepository> provider4, Provider<LpmRepository> provider5, Provider<Logger> provider6, Provider<EventReporter> provider7, Provider<ErrorReporter> provider8, Provider<CoroutineContext> provider9, Provider<RetrieveCustomerEmail> provider10, Provider<LinkAccountStatusProvider> provider11, Provider<LogLinkHoldbackExperiment> provider12, Provider<LinkStore> provider13, Provider<LinkGate.Factory> provider14, Provider<ExternalPaymentMethodsRepository> provider15, Provider<UserFacingLogger> provider16, Provider<CvcRecollectionHandler> provider17) {
        return new DefaultPaymentElementLoader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static DefaultPaymentElementLoader newInstance(Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> function1, Function1<GooglePayEnvironment, GooglePayRepository> function12, ElementsSessionRepository elementsSessionRepository, CustomerRepository customerRepository, LpmRepository lpmRepository, Logger logger, EventReporter eventReporter, ErrorReporter errorReporter, CoroutineContext coroutineContext, RetrieveCustomerEmail retrieveCustomerEmail, LinkAccountStatusProvider linkAccountStatusProvider, LogLinkHoldbackExperiment logLinkHoldbackExperiment, LinkStore linkStore, LinkGate.Factory factory, ExternalPaymentMethodsRepository externalPaymentMethodsRepository, UserFacingLogger userFacingLogger, CvcRecollectionHandler cvcRecollectionHandler) {
        return new DefaultPaymentElementLoader(function1, function12, elementsSessionRepository, customerRepository, lpmRepository, logger, eventReporter, errorReporter, coroutineContext, retrieveCustomerEmail, linkAccountStatusProvider, logLinkHoldbackExperiment, linkStore, factory, externalPaymentMethodsRepository, userFacingLogger, cvcRecollectionHandler);
    }
}
