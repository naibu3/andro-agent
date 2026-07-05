package com.stripe.android.financialconnections.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.serialization.json.Json;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory implements Factory<Json> {
    @Override // javax.inject.Provider
    public Json get() {
        return providesJson$financial_connections_release();
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Json providesJson$financial_connections_release() {
        return (Json) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesJson$financial_connections_release());
    }

    /* compiled from: FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory.java */
    private static final class InstanceHolder {
        static final FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory INSTANCE = new FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory();

        private InstanceHolder() {
        }
    }
}
