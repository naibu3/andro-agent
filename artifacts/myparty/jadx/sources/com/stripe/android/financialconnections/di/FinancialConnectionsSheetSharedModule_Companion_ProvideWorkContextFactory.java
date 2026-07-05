package com.stripe.android.financialconnections.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideWorkContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return provideWorkContext();
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideWorkContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext provideWorkContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideWorkContext());
    }

    private static final class InstanceHolder {
        static final FinancialConnectionsSheetSharedModule_Companion_ProvideWorkContextFactory INSTANCE = new FinancialConnectionsSheetSharedModule_Companion_ProvideWorkContextFactory();

        private InstanceHolder() {
        }
    }
}
