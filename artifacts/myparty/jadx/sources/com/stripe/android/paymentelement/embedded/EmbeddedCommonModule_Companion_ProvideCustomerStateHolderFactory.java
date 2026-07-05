package com.stripe.android.paymentelement.embedded;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory implements Factory<CustomerStateHolder> {
    private final Provider<StateFlow<PaymentMethodMetadata>> paymentMethodMetadataFlowProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory(Provider<SavedStateHandle> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<StateFlow<PaymentMethodMetadata>> provider3) {
        this.savedStateHandleProvider = provider;
        this.selectionHolderProvider = provider2;
        this.paymentMethodMetadataFlowProvider = provider3;
    }

    @Override // javax.inject.Provider
    public CustomerStateHolder get() {
        return provideCustomerStateHolder(this.savedStateHandleProvider.get(), this.selectionHolderProvider.get(), this.paymentMethodMetadataFlowProvider.get());
    }

    public static EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory create(javax.inject.Provider<SavedStateHandle> provider, javax.inject.Provider<EmbeddedSelectionHolder> provider2, javax.inject.Provider<StateFlow<PaymentMethodMetadata>> provider3) {
        return new EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory create(Provider<SavedStateHandle> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<StateFlow<PaymentMethodMetadata>> provider3) {
        return new EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory(provider, provider2, provider3);
    }

    public static CustomerStateHolder provideCustomerStateHolder(SavedStateHandle savedStateHandle, EmbeddedSelectionHolder embeddedSelectionHolder, StateFlow<PaymentMethodMetadata> stateFlow) {
        return (CustomerStateHolder) Preconditions.checkNotNullFromProvides(EmbeddedCommonModule.INSTANCE.provideCustomerStateHolder(savedStateHandle, embeddedSelectionHolder, stateFlow));
    }
}
