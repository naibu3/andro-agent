package com.stripe.android.paymentelement.embedded.manage;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class ManageModule_Companion_ProvideViewModelScopeFactory implements Factory<CoroutineScope> {
    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return provideViewModelScope();
    }

    public static ManageModule_Companion_ProvideViewModelScopeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineScope provideViewModelScope() {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(ManageModule.INSTANCE.provideViewModelScope());
    }

    private static final class InstanceHolder {
        static final ManageModule_Companion_ProvideViewModelScopeFactory INSTANCE = new ManageModule_Companion_ProvideViewModelScopeFactory();

        private InstanceHolder() {
        }
    }
}
