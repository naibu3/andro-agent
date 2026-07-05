package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RequestIntegrityToken_Factory implements Factory<RequestIntegrityToken> {
    private final Provider<FinancialConnectionsAnalyticsTracker> analyticsTrackerProvider;
    private final Provider<IntegrityRequestManager> integrityRequestManagerProvider;

    public RequestIntegrityToken_Factory(Provider<IntegrityRequestManager> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2) {
        this.integrityRequestManagerProvider = provider;
        this.analyticsTrackerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RequestIntegrityToken get() {
        return newInstance(this.integrityRequestManagerProvider.get(), this.analyticsTrackerProvider.get());
    }

    public static RequestIntegrityToken_Factory create(javax.inject.Provider<IntegrityRequestManager> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2) {
        return new RequestIntegrityToken_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static RequestIntegrityToken_Factory create(Provider<IntegrityRequestManager> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2) {
        return new RequestIntegrityToken_Factory(provider, provider2);
    }

    public static RequestIntegrityToken newInstance(IntegrityRequestManager integrityRequestManager, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker) {
        return new RequestIntegrityToken(integrityRequestManager, financialConnectionsAnalyticsTracker);
    }
}
