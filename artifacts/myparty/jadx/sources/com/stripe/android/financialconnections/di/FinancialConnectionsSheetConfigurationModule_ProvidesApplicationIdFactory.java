package com.stripe.android.financialconnections.di;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory implements Factory<String> {
    private final Provider<Application> applicationProvider;

    public FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesApplicationId(this.applicationProvider.get());
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory create(javax.inject.Provider<Application> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory create(Provider<Application> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory(provider);
    }

    public static String providesApplicationId(Application application) {
        return (String) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesApplicationId(application));
    }
}
