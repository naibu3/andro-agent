package com.stripe.android.link;

import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class WebLinkActivityContract_Factory implements Factory<WebLinkActivityContract> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public WebLinkActivityContract_Factory(Provider<StripeRepository> provider, Provider<ErrorReporter> provider2) {
        this.stripeRepositoryProvider = provider;
        this.errorReporterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public WebLinkActivityContract get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.errorReporterProvider.get());
    }

    public static WebLinkActivityContract_Factory create(javax.inject.Provider<StripeRepository> provider, javax.inject.Provider<ErrorReporter> provider2) {
        return new WebLinkActivityContract_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static WebLinkActivityContract_Factory create(Provider<StripeRepository> provider, Provider<ErrorReporter> provider2) {
        return new WebLinkActivityContract_Factory(provider, provider2);
    }

    public static WebLinkActivityContract newInstance(StripeRepository stripeRepository, ErrorReporter errorReporter) {
        return new WebLinkActivityContract(stripeRepository, errorReporter);
    }
}
