package com.stripe.android.financialconnections.di;

import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.networking.ApiRequest;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory implements Factory<ApiRequest.Factory> {
    private final Provider<ApiVersion> apiVersionProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory(Provider<ApiVersion> provider) {
        this.apiVersionProvider = provider;
    }

    @Override // javax.inject.Provider
    public ApiRequest.Factory get() {
        return providesApiRequestFactory(this.apiVersionProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory create(javax.inject.Provider<ApiVersion> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory create(Provider<ApiVersion> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory(provider);
    }

    public static ApiRequest.Factory providesApiRequestFactory(ApiVersion apiVersion) {
        return (ApiRequest.Factory) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesApiRequestFactory(apiVersion));
    }
}
