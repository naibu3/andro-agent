package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory implements Factory<IntegrityRequestManager> {
    private final Provider<Application> contextProvider;
    private final FinancialConnectionsSingletonSharedModule module;

    public FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule, Provider<Application> provider) {
        this.module = financialConnectionsSingletonSharedModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public IntegrityRequestManager get() {
        return providesIntegrityStandardRequestManager(this.module, this.contextProvider.get());
    }

    public static FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory create(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule, javax.inject.Provider<Application> provider) {
        return new FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory(financialConnectionsSingletonSharedModule, Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory create(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule, Provider<Application> provider) {
        return new FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory(financialConnectionsSingletonSharedModule, provider);
    }

    public static IntegrityRequestManager providesIntegrityStandardRequestManager(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule, Application application) {
        return (IntegrityRequestManager) Preconditions.checkNotNullFromProvides(financialConnectionsSingletonSharedModule.providesIntegrityStandardRequestManager(application));
    }
}
