package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory implements Factory<FraudDetectionDataRepository> {
    private final Provider<Application> applicationProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public FraudDetectionDataRepository get() {
        return provideFraudDetectionDataRepository$financial_connections_release(this.applicationProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory create(javax.inject.Provider<Application> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory create(Provider<Application> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory(provider);
    }

    public static FraudDetectionDataRepository provideFraudDetectionDataRepository$financial_connections_release(Application application) {
        return (FraudDetectionDataRepository) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideFraudDetectionDataRepository$financial_connections_release(application));
    }
}
