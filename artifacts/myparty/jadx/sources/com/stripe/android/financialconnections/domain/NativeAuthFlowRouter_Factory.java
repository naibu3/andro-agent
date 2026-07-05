package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NativeAuthFlowRouter_Factory implements Factory<NativeAuthFlowRouter> {
    private final Provider<DebugConfiguration> debugConfigurationProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;

    public NativeAuthFlowRouter_Factory(Provider<FinancialConnectionsAnalyticsTracker> provider, Provider<DebugConfiguration> provider2) {
        this.eventTrackerProvider = provider;
        this.debugConfigurationProvider = provider2;
    }

    @Override // javax.inject.Provider
    public NativeAuthFlowRouter get() {
        return newInstance(this.eventTrackerProvider.get(), this.debugConfigurationProvider.get());
    }

    public static NativeAuthFlowRouter_Factory create(javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider, javax.inject.Provider<DebugConfiguration> provider2) {
        return new NativeAuthFlowRouter_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static NativeAuthFlowRouter_Factory create(Provider<FinancialConnectionsAnalyticsTracker> provider, Provider<DebugConfiguration> provider2) {
        return new NativeAuthFlowRouter_Factory(provider, provider2);
    }

    public static NativeAuthFlowRouter newInstance(FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, DebugConfiguration debugConfiguration) {
        return new NativeAuthFlowRouter(financialConnectionsAnalyticsTracker, debugConfiguration);
    }
}
