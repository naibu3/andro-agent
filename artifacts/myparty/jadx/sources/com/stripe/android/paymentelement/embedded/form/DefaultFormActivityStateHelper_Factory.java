package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultFormActivityStateHelper_Factory implements Factory<DefaultFormActivityStateHelper> {
    private final Provider<EmbeddedPaymentElement.Configuration> configurationProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<OnClickOverrideDelegate> onClickDelegateProvider;
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public DefaultFormActivityStateHelper_Factory(Provider<PaymentMethodMetadata> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<EmbeddedPaymentElement.Configuration> provider3, Provider<OnClickOverrideDelegate> provider4, Provider<EventReporter> provider5, Provider<CoroutineScope> provider6) {
        this.paymentMethodMetadataProvider = provider;
        this.selectionHolderProvider = provider2;
        this.configurationProvider = provider3;
        this.onClickDelegateProvider = provider4;
        this.eventReporterProvider = provider5;
        this.coroutineScopeProvider = provider6;
    }

    @Override // javax.inject.Provider
    public DefaultFormActivityStateHelper get() {
        return newInstance(this.paymentMethodMetadataProvider.get(), this.selectionHolderProvider.get(), this.configurationProvider.get(), this.onClickDelegateProvider.get(), this.eventReporterProvider.get(), this.coroutineScopeProvider.get());
    }

    public static DefaultFormActivityStateHelper_Factory create(javax.inject.Provider<PaymentMethodMetadata> provider, javax.inject.Provider<EmbeddedSelectionHolder> provider2, javax.inject.Provider<EmbeddedPaymentElement.Configuration> provider3, javax.inject.Provider<OnClickOverrideDelegate> provider4, javax.inject.Provider<EventReporter> provider5, javax.inject.Provider<CoroutineScope> provider6) {
        return new DefaultFormActivityStateHelper_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static DefaultFormActivityStateHelper_Factory create(Provider<PaymentMethodMetadata> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<EmbeddedPaymentElement.Configuration> provider3, Provider<OnClickOverrideDelegate> provider4, Provider<EventReporter> provider5, Provider<CoroutineScope> provider6) {
        return new DefaultFormActivityStateHelper_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultFormActivityStateHelper newInstance(PaymentMethodMetadata paymentMethodMetadata, EmbeddedSelectionHolder embeddedSelectionHolder, EmbeddedPaymentElement.Configuration configuration, OnClickOverrideDelegate onClickOverrideDelegate, EventReporter eventReporter, CoroutineScope coroutineScope) {
        return new DefaultFormActivityStateHelper(paymentMethodMetadata, embeddedSelectionHolder, configuration, onClickOverrideDelegate, eventReporter, coroutineScope);
    }
}
