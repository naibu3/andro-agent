package com.stripe.android.financialconnections.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideUIContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return provideUIContext();
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideUIContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext provideUIContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideUIContext());
    }

    private static final class InstanceHolder {
        static final FinancialConnectionsSheetSharedModule_Companion_ProvideUIContextFactory INSTANCE = new FinancialConnectionsSheetSharedModule_Companion_ProvideUIContextFactory();

        private InstanceHolder() {
        }
    }
}
