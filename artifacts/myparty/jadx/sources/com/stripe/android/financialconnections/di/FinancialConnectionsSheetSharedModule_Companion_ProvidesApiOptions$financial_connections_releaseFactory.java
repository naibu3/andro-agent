package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.ApiRequest;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory implements Factory<ApiRequest.Options> {
    private final Provider<String> publishableKeyProvider;
    private final Provider<String> stripeAccountIdProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory(Provider<String> provider, Provider<String> provider2) {
        this.publishableKeyProvider = provider;
        this.stripeAccountIdProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ApiRequest.Options get() {
        return providesApiOptions$financial_connections_release(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory create(javax.inject.Provider<String> provider, javax.inject.Provider<String> provider2) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory create(Provider<String> provider, Provider<String> provider2) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory(provider, provider2);
    }

    public static ApiRequest.Options providesApiOptions$financial_connections_release(String str, String str2) {
        return (ApiRequest.Options) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesApiOptions$financial_connections_release(str, str2));
    }
}
