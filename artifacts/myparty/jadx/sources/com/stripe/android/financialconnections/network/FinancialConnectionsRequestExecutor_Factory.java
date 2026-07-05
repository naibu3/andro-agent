package com.stripe.android.financialconnections.network;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsResponseEventEmitter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.serialization.json.Json;

/* loaded from: classes5.dex */
public final class FinancialConnectionsRequestExecutor_Factory implements Factory<FinancialConnectionsRequestExecutor> {
    private final Provider<FinancialConnectionsResponseEventEmitter> eventEmitterProvider;
    private final Provider<Json> jsonProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<StripeNetworkClient> stripeNetworkClientProvider;

    public FinancialConnectionsRequestExecutor_Factory(Provider<StripeNetworkClient> provider, Provider<FinancialConnectionsResponseEventEmitter> provider2, Provider<Json> provider3, Provider<Logger> provider4) {
        this.stripeNetworkClientProvider = provider;
        this.eventEmitterProvider = provider2;
        this.jsonProvider = provider3;
        this.loggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsRequestExecutor get() {
        return newInstance(this.stripeNetworkClientProvider.get(), this.eventEmitterProvider.get(), this.jsonProvider.get(), this.loggerProvider.get());
    }

    public static FinancialConnectionsRequestExecutor_Factory create(javax.inject.Provider<StripeNetworkClient> provider, javax.inject.Provider<FinancialConnectionsResponseEventEmitter> provider2, javax.inject.Provider<Json> provider3, javax.inject.Provider<Logger> provider4) {
        return new FinancialConnectionsRequestExecutor_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static FinancialConnectionsRequestExecutor_Factory create(Provider<StripeNetworkClient> provider, Provider<FinancialConnectionsResponseEventEmitter> provider2, Provider<Json> provider3, Provider<Logger> provider4) {
        return new FinancialConnectionsRequestExecutor_Factory(provider, provider2, provider3, provider4);
    }

    public static FinancialConnectionsRequestExecutor newInstance(StripeNetworkClient stripeNetworkClient, FinancialConnectionsResponseEventEmitter financialConnectionsResponseEventEmitter, Json json, Logger logger) {
        return new FinancialConnectionsRequestExecutor(stripeNetworkClient, financialConnectionsResponseEventEmitter, json, logger);
    }
}
