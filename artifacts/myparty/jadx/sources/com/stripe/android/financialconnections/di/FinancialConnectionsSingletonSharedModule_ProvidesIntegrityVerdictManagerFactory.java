package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory implements Factory<IntegrityVerdictManager> {
    private final FinancialConnectionsSingletonSharedModule module;

    public FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule) {
        this.module = financialConnectionsSingletonSharedModule;
    }

    @Override // javax.inject.Provider
    public IntegrityVerdictManager get() {
        return providesIntegrityVerdictManager(this.module);
    }

    public static FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory create(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule) {
        return new FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory(financialConnectionsSingletonSharedModule);
    }

    public static IntegrityVerdictManager providesIntegrityVerdictManager(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule) {
        return (IntegrityVerdictManager) Preconditions.checkNotNullFromProvides(financialConnectionsSingletonSharedModule.providesIntegrityVerdictManager());
    }
}
