package com.stripe.android.paymentelement.embedded.content;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory implements Factory<Function0<Unit>> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<Unit> get() {
        return providesInternalRowSelectionCallback(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory create(javax.inject.Provider<String> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory create(Provider<String> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory(provider);
    }

    public static Function0<Unit> providesInternalRowSelectionCallback(String str) {
        return EmbeddedPaymentElementViewModelModule.INSTANCE.providesInternalRowSelectionCallback(str);
    }
}
