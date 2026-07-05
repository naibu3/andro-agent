package com.stripe.android.financialconnections.di;

import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.repository.ConsumersApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory implements Factory<ConsumersApiService> {
    private final Provider<ApiVersion> apiVersionProvider;
    private final Provider<StripeNetworkClient> stripeNetworkClientProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory(Provider<ApiVersion> provider, Provider<StripeNetworkClient> provider2) {
        this.apiVersionProvider = provider;
        this.stripeNetworkClientProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ConsumersApiService get() {
        return provideConsumersApiService(this.apiVersionProvider.get(), this.stripeNetworkClientProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory create(javax.inject.Provider<ApiVersion> provider, javax.inject.Provider<StripeNetworkClient> provider2) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory create(Provider<ApiVersion> provider, Provider<StripeNetworkClient> provider2) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory(provider, provider2);
    }

    public static ConsumersApiService provideConsumersApiService(ApiVersion apiVersion, StripeNetworkClient stripeNetworkClient) {
        return (ConsumersApiService) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.provideConsumersApiService(apiVersion, stripeNetworkClient));
    }
}
