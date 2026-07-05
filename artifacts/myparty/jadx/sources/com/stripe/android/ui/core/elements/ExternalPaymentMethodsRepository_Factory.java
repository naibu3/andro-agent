package com.stripe.android.ui.core.elements;

import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ExternalPaymentMethodsRepository_Factory implements Factory<ExternalPaymentMethodsRepository> {
    private final Provider<ErrorReporter> errorReporterProvider;

    public ExternalPaymentMethodsRepository_Factory(Provider<ErrorReporter> provider) {
        this.errorReporterProvider = provider;
    }

    @Override // javax.inject.Provider
    public ExternalPaymentMethodsRepository get() {
        return newInstance(this.errorReporterProvider.get());
    }

    public static ExternalPaymentMethodsRepository_Factory create(javax.inject.Provider<ErrorReporter> provider) {
        return new ExternalPaymentMethodsRepository_Factory(Providers.asDaggerProvider(provider));
    }

    public static ExternalPaymentMethodsRepository_Factory create(Provider<ErrorReporter> provider) {
        return new ExternalPaymentMethodsRepository_Factory(provider);
    }

    public static ExternalPaymentMethodsRepository newInstance(ErrorReporter errorReporter) {
        return new ExternalPaymentMethodsRepository(errorReporter);
    }
}
