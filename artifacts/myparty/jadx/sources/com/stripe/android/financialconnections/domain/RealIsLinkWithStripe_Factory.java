package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealIsLinkWithStripe_Factory implements Factory<RealIsLinkWithStripe> {
    private final Provider<FinancialConnectionsSheetNativeState> initialStateProvider;

    public RealIsLinkWithStripe_Factory(Provider<FinancialConnectionsSheetNativeState> provider) {
        this.initialStateProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealIsLinkWithStripe get() {
        return newInstance(this.initialStateProvider.get());
    }

    public static RealIsLinkWithStripe_Factory create(javax.inject.Provider<FinancialConnectionsSheetNativeState> provider) {
        return new RealIsLinkWithStripe_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealIsLinkWithStripe_Factory create(Provider<FinancialConnectionsSheetNativeState> provider) {
        return new RealIsLinkWithStripe_Factory(provider);
    }

    public static RealIsLinkWithStripe newInstance(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return new RealIsLinkWithStripe(financialConnectionsSheetNativeState);
    }
}
