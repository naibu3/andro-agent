package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.serialization.json.Json;

/* loaded from: classes5.dex */
public final class FinancialConnectionsResponseEventEmitter_Factory implements Factory<FinancialConnectionsResponseEventEmitter> {
    private final Provider<Json> jsonProvider;
    private final Provider<Logger> loggerProvider;

    public FinancialConnectionsResponseEventEmitter_Factory(Provider<Json> provider, Provider<Logger> provider2) {
        this.jsonProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsResponseEventEmitter get() {
        return newInstance(this.jsonProvider.get(), this.loggerProvider.get());
    }

    public static FinancialConnectionsResponseEventEmitter_Factory create(javax.inject.Provider<Json> provider, javax.inject.Provider<Logger> provider2) {
        return new FinancialConnectionsResponseEventEmitter_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FinancialConnectionsResponseEventEmitter_Factory create(Provider<Json> provider, Provider<Logger> provider2) {
        return new FinancialConnectionsResponseEventEmitter_Factory(provider, provider2);
    }

    public static FinancialConnectionsResponseEventEmitter newInstance(Json json, Logger logger) {
        return new FinancialConnectionsResponseEventEmitter(json, logger);
    }
}
