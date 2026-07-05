package com.stripe.android.financialconnections.repository.api;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealProvideApiRequestOptions_Factory implements Factory<RealProvideApiRequestOptions> {
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<IsLinkWithStripe> isLinkWithStripeProvider;

    public RealProvideApiRequestOptions_Factory(Provider<ConsumerSessionProvider> provider, Provider<IsLinkWithStripe> provider2, Provider<ApiRequest.Options> provider3) {
        this.consumerSessionProvider = provider;
        this.isLinkWithStripeProvider = provider2;
        this.apiRequestOptionsProvider = provider3;
    }

    @Override // javax.inject.Provider
    public RealProvideApiRequestOptions get() {
        return newInstance(this.consumerSessionProvider.get(), this.isLinkWithStripeProvider.get(), this.apiRequestOptionsProvider.get());
    }

    public static RealProvideApiRequestOptions_Factory create(javax.inject.Provider<ConsumerSessionProvider> provider, javax.inject.Provider<IsLinkWithStripe> provider2, javax.inject.Provider<ApiRequest.Options> provider3) {
        return new RealProvideApiRequestOptions_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static RealProvideApiRequestOptions_Factory create(Provider<ConsumerSessionProvider> provider, Provider<IsLinkWithStripe> provider2, Provider<ApiRequest.Options> provider3) {
        return new RealProvideApiRequestOptions_Factory(provider, provider2, provider3);
    }

    public static RealProvideApiRequestOptions newInstance(ConsumerSessionProvider consumerSessionProvider, IsLinkWithStripe isLinkWithStripe, ApiRequest.Options options) {
        return new RealProvideApiRequestOptions(consumerSessionProvider, isLinkWithStripe, options);
    }
}
