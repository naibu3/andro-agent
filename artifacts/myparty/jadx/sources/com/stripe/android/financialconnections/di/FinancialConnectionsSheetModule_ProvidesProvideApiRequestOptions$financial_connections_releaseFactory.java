package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory implements Factory<ProvideApiRequestOptions> {
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;

    public FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory(Provider<ApiRequest.Options> provider) {
        this.apiRequestOptionsProvider = provider;
    }

    @Override // javax.inject.Provider
    public ProvideApiRequestOptions get() {
        return providesProvideApiRequestOptions$financial_connections_release(this.apiRequestOptionsProvider.get());
    }

    public static FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory create(javax.inject.Provider<ApiRequest.Options> provider) {
        return new FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory create(Provider<ApiRequest.Options> provider) {
        return new FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory(provider);
    }

    public static ProvideApiRequestOptions providesProvideApiRequestOptions$financial_connections_release(ApiRequest.Options options) {
        return (ProvideApiRequestOptions) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetModule.INSTANCE.providesProvideApiRequestOptions$financial_connections_release(options));
    }
}
