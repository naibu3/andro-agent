package com.stripe.android.paymentelement.confirmation.epms;

import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class ExternalPaymentMethodConfirmationDefinition_Factory implements Factory<ExternalPaymentMethodConfirmationDefinition> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<ExternalPaymentMethodConfirmHandler> externalPaymentMethodConfirmHandlerProvider;
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public ExternalPaymentMethodConfirmationDefinition_Factory(Provider<String> provider, Provider<ExternalPaymentMethodConfirmHandler> provider2, Provider<ErrorReporter> provider3) {
        this.paymentElementCallbackIdentifierProvider = provider;
        this.externalPaymentMethodConfirmHandlerProvider = provider2;
        this.errorReporterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ExternalPaymentMethodConfirmationDefinition get() {
        return newInstance(this.paymentElementCallbackIdentifierProvider.get(), this.externalPaymentMethodConfirmHandlerProvider, this.errorReporterProvider.get());
    }

    public static ExternalPaymentMethodConfirmationDefinition_Factory create(javax.inject.Provider<String> provider, javax.inject.Provider<ExternalPaymentMethodConfirmHandler> provider2, javax.inject.Provider<ErrorReporter> provider3) {
        return new ExternalPaymentMethodConfirmationDefinition_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static ExternalPaymentMethodConfirmationDefinition_Factory create(Provider<String> provider, Provider<ExternalPaymentMethodConfirmHandler> provider2, Provider<ErrorReporter> provider3) {
        return new ExternalPaymentMethodConfirmationDefinition_Factory(provider, provider2, provider3);
    }

    public static ExternalPaymentMethodConfirmationDefinition newInstance(String str, javax.inject.Provider<ExternalPaymentMethodConfirmHandler> provider, ErrorReporter errorReporter) {
        return new ExternalPaymentMethodConfirmationDefinition(str, provider, errorReporter);
    }
}
