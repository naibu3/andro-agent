package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class RetrieveStripeIntent_Factory implements Factory<RetrieveStripeIntent> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public RetrieveStripeIntent_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public RetrieveStripeIntent get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }

    public static RetrieveStripeIntent_Factory create(javax.inject.Provider<StripeRepository> provider) {
        return new RetrieveStripeIntent_Factory(Providers.asDaggerProvider(provider));
    }

    public static RetrieveStripeIntent_Factory create(Provider<StripeRepository> provider) {
        return new RetrieveStripeIntent_Factory(provider);
    }

    public static RetrieveStripeIntent newInstance(StripeRepository stripeRepository) {
        return new RetrieveStripeIntent(stripeRepository);
    }
}
