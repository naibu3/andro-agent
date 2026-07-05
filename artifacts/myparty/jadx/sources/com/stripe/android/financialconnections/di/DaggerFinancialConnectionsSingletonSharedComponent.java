package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponent;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes5.dex */
public final class DaggerFinancialConnectionsSingletonSharedComponent {
    private DaggerFinancialConnectionsSingletonSharedComponent() {
    }

    public static FinancialConnectionsSingletonSharedComponent.Factory factory() {
        return new Factory();
    }

    private static final class Factory implements FinancialConnectionsSingletonSharedComponent.Factory {
        private Factory() {
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponent.Factory
        public FinancialConnectionsSingletonSharedComponent create(Application application) {
            Preconditions.checkNotNull(application);
            return new FinancialConnectionsSingletonSharedComponentImpl(new FinancialConnectionsSingletonSharedModule(), application);
        }
    }

    private static final class FinancialConnectionsSingletonSharedComponentImpl implements FinancialConnectionsSingletonSharedComponent {
        private Provider<Application> applicationProvider;
        private final FinancialConnectionsSingletonSharedComponentImpl financialConnectionsSingletonSharedComponentImpl;
        private Provider<IntegrityRequestManager> providesIntegrityStandardRequestManagerProvider;
        private Provider<IntegrityVerdictManager> providesIntegrityVerdictManagerProvider;

        private FinancialConnectionsSingletonSharedComponentImpl(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule, Application application) {
            this.financialConnectionsSingletonSharedComponentImpl = this;
            initialize(financialConnectionsSingletonSharedModule, application);
        }

        private void initialize(FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule, Application application) {
            dagger.internal.Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            this.providesIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory.create(financialConnectionsSingletonSharedModule, (Provider<Application>) factoryCreate));
            this.providesIntegrityVerdictManagerProvider = DoubleCheck.provider((Provider) FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory.create(financialConnectionsSingletonSharedModule));
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponent
        public IntegrityRequestManager integrityRequestManager() {
            return this.providesIntegrityStandardRequestManagerProvider.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponent
        public IntegrityVerdictManager integrityVerdictManager() {
            return this.providesIntegrityVerdictManagerProvider.get();
        }
    }
}
