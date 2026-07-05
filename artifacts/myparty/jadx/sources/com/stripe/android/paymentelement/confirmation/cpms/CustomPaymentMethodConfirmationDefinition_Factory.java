package com.stripe.android.paymentelement.confirmation.cpms;

import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomPaymentMethodConfirmationDefinition_Factory implements Factory<CustomPaymentMethodConfirmationDefinition> {
    private final Provider<ConfirmCustomPaymentMethodCallback> confirmCustomPaymentMethodCallbackProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public CustomPaymentMethodConfirmationDefinition_Factory(Provider<String> provider, Provider<ConfirmCustomPaymentMethodCallback> provider2, Provider<ErrorReporter> provider3) {
        this.paymentElementCallbackIdentifierProvider = provider;
        this.confirmCustomPaymentMethodCallbackProvider = provider2;
        this.errorReporterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public CustomPaymentMethodConfirmationDefinition get() {
        return newInstance(this.paymentElementCallbackIdentifierProvider.get(), this.confirmCustomPaymentMethodCallbackProvider, this.errorReporterProvider.get());
    }

    public static CustomPaymentMethodConfirmationDefinition_Factory create(javax.inject.Provider<String> provider, javax.inject.Provider<ConfirmCustomPaymentMethodCallback> provider2, javax.inject.Provider<ErrorReporter> provider3) {
        return new CustomPaymentMethodConfirmationDefinition_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static CustomPaymentMethodConfirmationDefinition_Factory create(Provider<String> provider, Provider<ConfirmCustomPaymentMethodCallback> provider2, Provider<ErrorReporter> provider3) {
        return new CustomPaymentMethodConfirmationDefinition_Factory(provider, provider2, provider3);
    }

    public static CustomPaymentMethodConfirmationDefinition newInstance(String str, javax.inject.Provider<ConfirmCustomPaymentMethodCallback> provider, ErrorReporter errorReporter) {
        return new CustomPaymentMethodConfirmationDefinition(str, provider, errorReporter);
    }
}
