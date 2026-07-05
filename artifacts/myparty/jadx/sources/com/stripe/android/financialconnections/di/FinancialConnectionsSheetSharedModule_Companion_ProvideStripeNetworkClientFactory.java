package com.stripe.android.financialconnections.di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.StripeNetworkClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory implements Factory<StripeNetworkClient> {
    private final Provider<CoroutineContext> contextProvider;
    private final Provider<Logger> loggerProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory(Provider<CoroutineContext> provider, Provider<Logger> provider2) {
        this.contextProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public StripeNetworkClient get() {
        return provideStripeNetworkClient(this.contextProvider.get(), this.loggerProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory create(javax.inject.Provider<CoroutineContext> provider, javax.inject.Provider<Logger> provider2) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory create(Provider<CoroutineContext> provider, Provider<Logger> provider2) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory(provider, provider2);
    }

    public static StripeNetworkClient provideStripeNetworkClient(CoroutineContext coroutineContext, Logger logger) {
        return (StripeNetworkClient) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideStripeNetworkClient(coroutineContext, logger));
    }
}
