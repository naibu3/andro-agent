package com.stripe.android.financialconnections.di;

import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory implements Factory<Logger> {
    private final Provider<Boolean> enableLoggingProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory(Provider<Boolean> provider) {
        this.enableLoggingProvider = provider;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger$financial_connections_release(this.enableLoggingProvider.get().booleanValue());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory create(javax.inject.Provider<Boolean> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory create(Provider<Boolean> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory(provider);
    }

    public static Logger provideLogger$financial_connections_release(boolean z) {
        return (Logger) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideLogger$financial_connections_release(z));
    }
}
