package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory implements Factory<AnalyticsRequestExecutor> {
    private final Provider<DefaultAnalyticsRequestExecutor> executorProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory(Provider<DefaultAnalyticsRequestExecutor> provider) {
        this.executorProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsRequestExecutor get() {
        return providesAnalyticsRequestExecutor$financial_connections_release(this.executorProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory create(javax.inject.Provider<DefaultAnalyticsRequestExecutor> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory create(Provider<DefaultAnalyticsRequestExecutor> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory(provider);
    }

    public static AnalyticsRequestExecutor providesAnalyticsRequestExecutor$financial_connections_release(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor) {
        return (AnalyticsRequestExecutor) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesAnalyticsRequestExecutor$financial_connections_release(defaultAnalyticsRequestExecutor));
    }
}
