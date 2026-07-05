package com.stripe.android.financialconnections.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesIoDispatcher$financial_connections_releaseFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesIoDispatcher$financial_connections_release();
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesIoDispatcher$financial_connections_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher providesIoDispatcher$financial_connections_release() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesIoDispatcher$financial_connections_release());
    }

    /* compiled from: FinancialConnectionsSheetSharedModule_Companion_ProvidesIoDispatcher$financial_connections_releaseFactory.java */
    private static final class InstanceHolder {
        static final FinancialConnectionsSheetSharedModule_Companion_ProvidesIoDispatcher$financial_connections_releaseFactory INSTANCE = new FinancialConnectionsSheetSharedModule_Companion_ProvidesIoDispatcher$financial_connections_releaseFactory();

        private InstanceHolder() {
        }
    }
}
