package com.stripe.android.paymentelement.embedded.form;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class FormActivityViewModelModule_Companion_ProvideViewModelScopeFactory implements Factory<CoroutineScope> {
    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return provideViewModelScope();
    }

    public static FormActivityViewModelModule_Companion_ProvideViewModelScopeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineScope provideViewModelScope() {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(FormActivityViewModelModule.INSTANCE.provideViewModelScope());
    }

    private static final class InstanceHolder {
        static final FormActivityViewModelModule_Companion_ProvideViewModelScopeFactory INSTANCE = new FormActivityViewModelModule_Companion_ProvideViewModelScopeFactory();

        private InstanceHolder() {
        }
    }
}
