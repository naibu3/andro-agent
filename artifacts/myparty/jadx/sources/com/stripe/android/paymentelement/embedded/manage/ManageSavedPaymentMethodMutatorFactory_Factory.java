package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class ManageSavedPaymentMethodMutatorFactory_Factory implements Factory<ManageSavedPaymentMethodMutatorFactory> {
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<CustomerStateHolder> customerStateHolderProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<ManageNavigator> manageNavigatorProvider;
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;
    private final Provider<CoroutineContext> uiContextProvider;
    private final Provider<EmbeddedUpdateScreenInteractorFactory> updateScreenInteractorFactoryProvider;
    private final Provider<CoroutineScope> viewModelScopeProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public ManageSavedPaymentMethodMutatorFactory_Factory(Provider<EventReporter> provider, Provider<CustomerRepository> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<CustomerStateHolder> provider4, Provider<ManageNavigator> provider5, Provider<PaymentMethodMetadata> provider6, Provider<CoroutineContext> provider7, Provider<CoroutineContext> provider8, Provider<CoroutineScope> provider9, Provider<EmbeddedUpdateScreenInteractorFactory> provider10) {
        this.eventReporterProvider = provider;
        this.customerRepositoryProvider = provider2;
        this.selectionHolderProvider = provider3;
        this.customerStateHolderProvider = provider4;
        this.manageNavigatorProvider = provider5;
        this.paymentMethodMetadataProvider = provider6;
        this.workContextProvider = provider7;
        this.uiContextProvider = provider8;
        this.viewModelScopeProvider = provider9;
        this.updateScreenInteractorFactoryProvider = provider10;
    }

    @Override // javax.inject.Provider
    public ManageSavedPaymentMethodMutatorFactory get() {
        return newInstance(this.eventReporterProvider.get(), this.customerRepositoryProvider.get(), this.selectionHolderProvider.get(), this.customerStateHolderProvider.get(), this.manageNavigatorProvider, this.paymentMethodMetadataProvider.get(), this.workContextProvider.get(), this.uiContextProvider.get(), this.viewModelScopeProvider.get(), this.updateScreenInteractorFactoryProvider);
    }

    public static ManageSavedPaymentMethodMutatorFactory_Factory create(javax.inject.Provider<EventReporter> provider, javax.inject.Provider<CustomerRepository> provider2, javax.inject.Provider<EmbeddedSelectionHolder> provider3, javax.inject.Provider<CustomerStateHolder> provider4, javax.inject.Provider<ManageNavigator> provider5, javax.inject.Provider<PaymentMethodMetadata> provider6, javax.inject.Provider<CoroutineContext> provider7, javax.inject.Provider<CoroutineContext> provider8, javax.inject.Provider<CoroutineScope> provider9, javax.inject.Provider<EmbeddedUpdateScreenInteractorFactory> provider10) {
        return new ManageSavedPaymentMethodMutatorFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static ManageSavedPaymentMethodMutatorFactory_Factory create(Provider<EventReporter> provider, Provider<CustomerRepository> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<CustomerStateHolder> provider4, Provider<ManageNavigator> provider5, Provider<PaymentMethodMetadata> provider6, Provider<CoroutineContext> provider7, Provider<CoroutineContext> provider8, Provider<CoroutineScope> provider9, Provider<EmbeddedUpdateScreenInteractorFactory> provider10) {
        return new ManageSavedPaymentMethodMutatorFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static ManageSavedPaymentMethodMutatorFactory newInstance(EventReporter eventReporter, CustomerRepository customerRepository, EmbeddedSelectionHolder embeddedSelectionHolder, CustomerStateHolder customerStateHolder, javax.inject.Provider<ManageNavigator> provider, PaymentMethodMetadata paymentMethodMetadata, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineScope coroutineScope, javax.inject.Provider<EmbeddedUpdateScreenInteractorFactory> provider2) {
        return new ManageSavedPaymentMethodMutatorFactory(eventReporter, customerRepository, embeddedSelectionHolder, customerStateHolder, provider, paymentMethodMetadata, coroutineContext, coroutineContext2, coroutineScope, provider2);
    }
}
