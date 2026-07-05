package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory implements Factory<String> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;

    public FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory(Provider<FinancialConnectionsSheetConfiguration> provider) {
        this.configurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesPublishableKey(this.configurationProvider.get());
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory create(Provider<FinancialConnectionsSheetConfiguration> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory(provider);
    }

    public static String providesPublishableKey(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return (String) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesPublishableKey(financialConnectionsSheetConfiguration));
    }
}
