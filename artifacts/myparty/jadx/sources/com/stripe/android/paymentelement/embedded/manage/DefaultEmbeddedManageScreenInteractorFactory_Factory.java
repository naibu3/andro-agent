package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedManageScreenInteractorFactory_Factory implements Factory<DefaultEmbeddedManageScreenInteractorFactory> {
    private final Provider<CustomerStateHolder> customerStateHolderProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<ManageNavigator> manageNavigatorProvider;
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
    private final Provider<SavedPaymentMethodMutator> savedPaymentMethodMutatorProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public DefaultEmbeddedManageScreenInteractorFactory_Factory(Provider<PaymentMethodMetadata> provider, Provider<CustomerStateHolder> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<SavedPaymentMethodMutator> provider4, Provider<EventReporter> provider5, Provider<ManageNavigator> provider6) {
        this.paymentMethodMetadataProvider = provider;
        this.customerStateHolderProvider = provider2;
        this.selectionHolderProvider = provider3;
        this.savedPaymentMethodMutatorProvider = provider4;
        this.eventReporterProvider = provider5;
        this.manageNavigatorProvider = provider6;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedManageScreenInteractorFactory get() {
        return newInstance(this.paymentMethodMetadataProvider.get(), this.customerStateHolderProvider.get(), this.selectionHolderProvider.get(), this.savedPaymentMethodMutatorProvider.get(), this.eventReporterProvider.get(), this.manageNavigatorProvider);
    }

    public static DefaultEmbeddedManageScreenInteractorFactory_Factory create(javax.inject.Provider<PaymentMethodMetadata> provider, javax.inject.Provider<CustomerStateHolder> provider2, javax.inject.Provider<EmbeddedSelectionHolder> provider3, javax.inject.Provider<SavedPaymentMethodMutator> provider4, javax.inject.Provider<EventReporter> provider5, javax.inject.Provider<ManageNavigator> provider6) {
        return new DefaultEmbeddedManageScreenInteractorFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static DefaultEmbeddedManageScreenInteractorFactory_Factory create(Provider<PaymentMethodMetadata> provider, Provider<CustomerStateHolder> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<SavedPaymentMethodMutator> provider4, Provider<EventReporter> provider5, Provider<ManageNavigator> provider6) {
        return new DefaultEmbeddedManageScreenInteractorFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultEmbeddedManageScreenInteractorFactory newInstance(PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, EmbeddedSelectionHolder embeddedSelectionHolder, SavedPaymentMethodMutator savedPaymentMethodMutator, EventReporter eventReporter, javax.inject.Provider<ManageNavigator> provider) {
        return new DefaultEmbeddedManageScreenInteractorFactory(paymentMethodMetadata, customerStateHolder, embeddedSelectionHolder, savedPaymentMethodMutator, eventReporter, provider);
    }
}
