package com.stripe.android.paymentelement.embedded.content;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvideViewModelScopeFactory implements Factory<CoroutineScope> {
    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return provideViewModelScope();
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideViewModelScopeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineScope provideViewModelScope() {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.provideViewModelScope());
    }

    private static final class InstanceHolder {
        static final EmbeddedPaymentElementViewModelModule_Companion_ProvideViewModelScopeFactory INSTANCE = new EmbeddedPaymentElementViewModelModule_Companion_ProvideViewModelScopeFactory();

        private InstanceHolder() {
        }
    }
}
