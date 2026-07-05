package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory implements Factory<StateFlow<PaymentMethodMetadata>> {
    private final Provider<EmbeddedConfirmationStateHolder> confirmationStateHolderProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory(Provider<EmbeddedConfirmationStateHolder> provider) {
        this.confirmationStateHolderProvider = provider;
    }

    @Override // javax.inject.Provider
    public StateFlow<PaymentMethodMetadata> get() {
        return providePaymentMethodMetadata(this.confirmationStateHolderProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory create(javax.inject.Provider<EmbeddedConfirmationStateHolder> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory create(Provider<EmbeddedConfirmationStateHolder> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory(provider);
    }

    public static StateFlow<PaymentMethodMetadata> providePaymentMethodMetadata(EmbeddedConfirmationStateHolder embeddedConfirmationStateHolder) {
        return (StateFlow) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.providePaymentMethodMetadata(embeddedConfirmationStateHolder));
    }
}
