package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory implements Factory<Function0<EmbeddedConfirmationStateHolder.State>> {
    private final Provider<EmbeddedConfirmationStateHolder> confirmationStateHolderProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory(Provider<EmbeddedConfirmationStateHolder> provider) {
        this.confirmationStateHolderProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<EmbeddedConfirmationStateHolder.State> get() {
        return providesConfirmationStateSupplier(this.confirmationStateHolderProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory create(javax.inject.Provider<EmbeddedConfirmationStateHolder> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory create(Provider<EmbeddedConfirmationStateHolder> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory(provider);
    }

    public static Function0<EmbeddedConfirmationStateHolder.State> providesConfirmationStateSupplier(EmbeddedConfirmationStateHolder embeddedConfirmationStateHolder) {
        return (Function0) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.providesConfirmationStateSupplier(embeddedConfirmationStateHolder));
    }
}
