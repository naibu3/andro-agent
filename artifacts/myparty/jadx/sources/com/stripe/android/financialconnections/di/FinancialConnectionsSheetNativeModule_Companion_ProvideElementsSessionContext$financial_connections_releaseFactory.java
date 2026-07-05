package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory implements Factory<ElementsSessionContext> {
    private final Provider<FinancialConnectionsSheetNativeState> initialStateProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory(Provider<FinancialConnectionsSheetNativeState> provider) {
        this.initialStateProvider = provider;
    }

    @Override // javax.inject.Provider
    public ElementsSessionContext get() {
        return provideElementsSessionContext$financial_connections_release(this.initialStateProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory create(javax.inject.Provider<FinancialConnectionsSheetNativeState> provider) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory create(Provider<FinancialConnectionsSheetNativeState> provider) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory(provider);
    }

    public static ElementsSessionContext provideElementsSessionContext$financial_connections_release(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return FinancialConnectionsSheetNativeModule.INSTANCE.provideElementsSessionContext$financial_connections_release(financialConnectionsSheetNativeState);
    }
}
