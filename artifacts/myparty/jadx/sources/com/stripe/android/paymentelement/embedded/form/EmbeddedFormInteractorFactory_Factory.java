package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class EmbeddedFormInteractorFactory_Factory implements Factory<EmbeddedFormInteractorFactory> {
    private final Provider<EmbeddedFormHelperFactory> embeddedFormHelperFactoryProvider;
    private final Provider<EmbeddedSelectionHolder> embeddedSelectionHolderProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<FormActivityStateHelper> formActivityStateHelperProvider;
    private final Provider<Boolean> hasSavedPaymentMethodsProvider;
    private final Provider<String> paymentMethodCodeProvider;
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
    private final Provider<CoroutineScope> viewModelScopeProvider;

    public EmbeddedFormInteractorFactory_Factory(Provider<PaymentMethodMetadata> provider, Provider<String> provider2, Provider<Boolean> provider3, Provider<EmbeddedSelectionHolder> provider4, Provider<EmbeddedFormHelperFactory> provider5, Provider<CoroutineScope> provider6, Provider<FormActivityStateHelper> provider7, Provider<EventReporter> provider8) {
        this.paymentMethodMetadataProvider = provider;
        this.paymentMethodCodeProvider = provider2;
        this.hasSavedPaymentMethodsProvider = provider3;
        this.embeddedSelectionHolderProvider = provider4;
        this.embeddedFormHelperFactoryProvider = provider5;
        this.viewModelScopeProvider = provider6;
        this.formActivityStateHelperProvider = provider7;
        this.eventReporterProvider = provider8;
    }

    @Override // javax.inject.Provider
    public EmbeddedFormInteractorFactory get() {
        return newInstance(this.paymentMethodMetadataProvider.get(), this.paymentMethodCodeProvider.get(), this.hasSavedPaymentMethodsProvider.get().booleanValue(), this.embeddedSelectionHolderProvider.get(), this.embeddedFormHelperFactoryProvider.get(), this.viewModelScopeProvider.get(), this.formActivityStateHelperProvider.get(), this.eventReporterProvider.get());
    }

    public static EmbeddedFormInteractorFactory_Factory create(javax.inject.Provider<PaymentMethodMetadata> provider, javax.inject.Provider<String> provider2, javax.inject.Provider<Boolean> provider3, javax.inject.Provider<EmbeddedSelectionHolder> provider4, javax.inject.Provider<EmbeddedFormHelperFactory> provider5, javax.inject.Provider<CoroutineScope> provider6, javax.inject.Provider<FormActivityStateHelper> provider7, javax.inject.Provider<EventReporter> provider8) {
        return new EmbeddedFormInteractorFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8));
    }

    public static EmbeddedFormInteractorFactory_Factory create(Provider<PaymentMethodMetadata> provider, Provider<String> provider2, Provider<Boolean> provider3, Provider<EmbeddedSelectionHolder> provider4, Provider<EmbeddedFormHelperFactory> provider5, Provider<CoroutineScope> provider6, Provider<FormActivityStateHelper> provider7, Provider<EventReporter> provider8) {
        return new EmbeddedFormInteractorFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static EmbeddedFormInteractorFactory newInstance(PaymentMethodMetadata paymentMethodMetadata, String str, boolean z, EmbeddedSelectionHolder embeddedSelectionHolder, EmbeddedFormHelperFactory embeddedFormHelperFactory, CoroutineScope coroutineScope, FormActivityStateHelper formActivityStateHelper, EventReporter eventReporter) {
        return new EmbeddedFormInteractorFactory(paymentMethodMetadata, str, z, embeddedSelectionHolder, embeddedFormHelperFactory, coroutineScope, formActivityStateHelper, eventReporter);
    }
}
