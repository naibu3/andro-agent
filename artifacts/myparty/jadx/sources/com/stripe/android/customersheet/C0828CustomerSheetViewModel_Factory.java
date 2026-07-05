package com.stripe.android.customersheet;

import android.app.Application;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0828CustomerSheetViewModel_Factory implements Factory<CustomerSheetViewModel> {
    private final Provider<Application> applicationProvider;
    private final Provider<CustomerSheet.Configuration> configurationProvider;
    private final Provider<ConfirmationHandler.Factory> confirmationHandlerFactoryProvider;
    private final Provider<CustomerSheetLoader> customerSheetLoaderProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<CustomerSheetEventReporter> eventReporterProvider;
    private final Provider<CustomerSheetIntegration.Type> integrationTypeProvider;
    private final Provider<Function0<Boolean>> isLiveModeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PaymentSelection> originalPaymentSelectionProvider;
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public C0828CustomerSheetViewModel_Factory(Provider<Application> provider, Provider<PaymentSelection> provider2, Provider<PaymentConfiguration> provider3, Provider<CustomerSheet.Configuration> provider4, Provider<CustomerSheetIntegration.Type> provider5, Provider<Logger> provider6, Provider<StripeRepository> provider7, Provider<CustomerSheetEventReporter> provider8, Provider<CoroutineContext> provider9, Provider<Function0<Boolean>> provider10, Provider<Set<String>> provider11, Provider<ConfirmationHandler.Factory> provider12, Provider<CustomerSheetLoader> provider13, Provider<ErrorReporter> provider14) {
        this.applicationProvider = provider;
        this.originalPaymentSelectionProvider = provider2;
        this.paymentConfigurationProvider = provider3;
        this.configurationProvider = provider4;
        this.integrationTypeProvider = provider5;
        this.loggerProvider = provider6;
        this.stripeRepositoryProvider = provider7;
        this.eventReporterProvider = provider8;
        this.workContextProvider = provider9;
        this.isLiveModeProvider = provider10;
        this.productUsageProvider = provider11;
        this.confirmationHandlerFactoryProvider = provider12;
        this.customerSheetLoaderProvider = provider13;
        this.errorReporterProvider = provider14;
    }

    @Override // javax.inject.Provider
    public CustomerSheetViewModel get() {
        return newInstance(this.applicationProvider.get(), this.originalPaymentSelectionProvider.get(), this.paymentConfigurationProvider, this.configurationProvider.get(), this.integrationTypeProvider.get(), this.loggerProvider.get(), this.stripeRepositoryProvider.get(), this.eventReporterProvider.get(), this.workContextProvider.get(), this.isLiveModeProvider.get(), this.productUsageProvider.get(), this.confirmationHandlerFactoryProvider.get(), this.customerSheetLoaderProvider.get(), this.errorReporterProvider.get());
    }

    public static C0828CustomerSheetViewModel_Factory create(javax.inject.Provider<Application> provider, javax.inject.Provider<PaymentSelection> provider2, javax.inject.Provider<PaymentConfiguration> provider3, javax.inject.Provider<CustomerSheet.Configuration> provider4, javax.inject.Provider<CustomerSheetIntegration.Type> provider5, javax.inject.Provider<Logger> provider6, javax.inject.Provider<StripeRepository> provider7, javax.inject.Provider<CustomerSheetEventReporter> provider8, javax.inject.Provider<CoroutineContext> provider9, javax.inject.Provider<Function0<Boolean>> provider10, javax.inject.Provider<Set<String>> provider11, javax.inject.Provider<ConfirmationHandler.Factory> provider12, javax.inject.Provider<CustomerSheetLoader> provider13, javax.inject.Provider<ErrorReporter> provider14) {
        return new C0828CustomerSheetViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14));
    }

    public static C0828CustomerSheetViewModel_Factory create(Provider<Application> provider, Provider<PaymentSelection> provider2, Provider<PaymentConfiguration> provider3, Provider<CustomerSheet.Configuration> provider4, Provider<CustomerSheetIntegration.Type> provider5, Provider<Logger> provider6, Provider<StripeRepository> provider7, Provider<CustomerSheetEventReporter> provider8, Provider<CoroutineContext> provider9, Provider<Function0<Boolean>> provider10, Provider<Set<String>> provider11, Provider<ConfirmationHandler.Factory> provider12, Provider<CustomerSheetLoader> provider13, Provider<ErrorReporter> provider14) {
        return new C0828CustomerSheetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static CustomerSheetViewModel newInstance(Application application, PaymentSelection paymentSelection, javax.inject.Provider<PaymentConfiguration> provider, CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type type, Logger logger, StripeRepository stripeRepository, CustomerSheetEventReporter customerSheetEventReporter, CoroutineContext coroutineContext, Function0<Boolean> function0, Set<String> set, ConfirmationHandler.Factory factory, CustomerSheetLoader customerSheetLoader, ErrorReporter errorReporter) {
        return new CustomerSheetViewModel(application, paymentSelection, provider, configuration, type, logger, stripeRepository, customerSheetEventReporter, coroutineContext, function0, set, factory, customerSheetLoader, errorReporter);
    }
}
