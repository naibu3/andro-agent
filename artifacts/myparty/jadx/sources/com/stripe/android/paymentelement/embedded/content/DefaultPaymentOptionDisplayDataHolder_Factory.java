package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultPaymentOptionDisplayDataHolder_Factory implements Factory<DefaultPaymentOptionDisplayDataHolder> {
    private final Provider<Function0<EmbeddedConfirmationStateHolder.State>> confirmationStateSupplierProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<PaymentOptionDisplayDataFactory> paymentOptionDisplayDataFactoryProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public DefaultPaymentOptionDisplayDataHolder_Factory(Provider<CoroutineScope> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<Function0<EmbeddedConfirmationStateHolder.State>> provider3, Provider<PaymentOptionDisplayDataFactory> provider4) {
        this.coroutineScopeProvider = provider;
        this.selectionHolderProvider = provider2;
        this.confirmationStateSupplierProvider = provider3;
        this.paymentOptionDisplayDataFactoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public DefaultPaymentOptionDisplayDataHolder get() {
        return newInstance(this.coroutineScopeProvider.get(), this.selectionHolderProvider.get(), this.confirmationStateSupplierProvider.get(), this.paymentOptionDisplayDataFactoryProvider.get());
    }

    public static DefaultPaymentOptionDisplayDataHolder_Factory create(javax.inject.Provider<CoroutineScope> provider, javax.inject.Provider<EmbeddedSelectionHolder> provider2, javax.inject.Provider<Function0<EmbeddedConfirmationStateHolder.State>> provider3, javax.inject.Provider<PaymentOptionDisplayDataFactory> provider4) {
        return new DefaultPaymentOptionDisplayDataHolder_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static DefaultPaymentOptionDisplayDataHolder_Factory create(Provider<CoroutineScope> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<Function0<EmbeddedConfirmationStateHolder.State>> provider3, Provider<PaymentOptionDisplayDataFactory> provider4) {
        return new DefaultPaymentOptionDisplayDataHolder_Factory(provider, provider2, provider3, provider4);
    }

    public static DefaultPaymentOptionDisplayDataHolder newInstance(CoroutineScope coroutineScope, EmbeddedSelectionHolder embeddedSelectionHolder, Function0<EmbeddedConfirmationStateHolder.State> function0, PaymentOptionDisplayDataFactory paymentOptionDisplayDataFactory) {
        return new DefaultPaymentOptionDisplayDataHolder(coroutineScope, embeddedSelectionHolder, function0, paymentOptionDisplayDataFactory);
    }
}
