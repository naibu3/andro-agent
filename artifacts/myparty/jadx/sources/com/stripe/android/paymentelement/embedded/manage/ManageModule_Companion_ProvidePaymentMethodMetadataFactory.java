package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class ManageModule_Companion_ProvidePaymentMethodMetadataFactory implements Factory<StateFlow<PaymentMethodMetadata>> {
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;

    public ManageModule_Companion_ProvidePaymentMethodMetadataFactory(Provider<PaymentMethodMetadata> provider) {
        this.paymentMethodMetadataProvider = provider;
    }

    @Override // javax.inject.Provider
    public StateFlow<PaymentMethodMetadata> get() {
        return providePaymentMethodMetadata(this.paymentMethodMetadataProvider.get());
    }

    public static ManageModule_Companion_ProvidePaymentMethodMetadataFactory create(javax.inject.Provider<PaymentMethodMetadata> provider) {
        return new ManageModule_Companion_ProvidePaymentMethodMetadataFactory(Providers.asDaggerProvider(provider));
    }

    public static ManageModule_Companion_ProvidePaymentMethodMetadataFactory create(Provider<PaymentMethodMetadata> provider) {
        return new ManageModule_Companion_ProvidePaymentMethodMetadataFactory(provider);
    }

    public static StateFlow<PaymentMethodMetadata> providePaymentMethodMetadata(PaymentMethodMetadata paymentMethodMetadata) {
        return (StateFlow) Preconditions.checkNotNullFromProvides(ManageModule.INSTANCE.providePaymentMethodMetadata(paymentMethodMetadata));
    }
}
