package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory implements Factory<FinancialConnectionsEventReporter> {
    private final Provider<DefaultFinancialConnectionsEventReporter> defaultFinancialConnectionsEventReporterProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory(Provider<DefaultFinancialConnectionsEventReporter> provider) {
        this.defaultFinancialConnectionsEventReporterProvider = provider;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsEventReporter get() {
        return provideEventReporter(this.defaultFinancialConnectionsEventReporterProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory create(javax.inject.Provider<DefaultFinancialConnectionsEventReporter> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory create(Provider<DefaultFinancialConnectionsEventReporter> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory(provider);
    }

    public static FinancialConnectionsEventReporter provideEventReporter(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter) {
        return (FinancialConnectionsEventReporter) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideEventReporter(defaultFinancialConnectionsEventReporter));
    }
}
