package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory implements Factory<String> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;

    public FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory(Provider<FinancialConnectionsSheetConfiguration> provider) {
        this.configurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesStripeAccountId(this.configurationProvider.get());
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory create(Provider<FinancialConnectionsSheetConfiguration> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory(provider);
    }

    public static String providesStripeAccountId(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return FinancialConnectionsSheetConfigurationModule.INSTANCE.providesStripeAccountId(financialConnectionsSheetConfiguration);
    }
}
