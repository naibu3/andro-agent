package com.stripe.android.paymentelement.confirmation.challenge;

import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class PassiveChallengeConfirmationDefinition_Factory implements Factory<PassiveChallengeConfirmationDefinition> {
    private final Provider<ErrorReporter> errorReporterProvider;

    public PassiveChallengeConfirmationDefinition_Factory(Provider<ErrorReporter> provider) {
        this.errorReporterProvider = provider;
    }

    @Override // javax.inject.Provider
    public PassiveChallengeConfirmationDefinition get() {
        return newInstance(this.errorReporterProvider.get());
    }

    public static PassiveChallengeConfirmationDefinition_Factory create(javax.inject.Provider<ErrorReporter> provider) {
        return new PassiveChallengeConfirmationDefinition_Factory(Providers.asDaggerProvider(provider));
    }

    public static PassiveChallengeConfirmationDefinition_Factory create(Provider<ErrorReporter> provider) {
        return new PassiveChallengeConfirmationDefinition_Factory(provider);
    }

    public static PassiveChallengeConfirmationDefinition newInstance(ErrorReporter errorReporter) {
        return new PassiveChallengeConfirmationDefinition(errorReporter);
    }
}
