package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AttachFinancialConnectionsSession_Factory implements Factory<AttachFinancialConnectionsSession> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public AttachFinancialConnectionsSession_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public AttachFinancialConnectionsSession get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }

    public static AttachFinancialConnectionsSession_Factory create(javax.inject.Provider<StripeRepository> provider) {
        return new AttachFinancialConnectionsSession_Factory(Providers.asDaggerProvider(provider));
    }

    public static AttachFinancialConnectionsSession_Factory create(Provider<StripeRepository> provider) {
        return new AttachFinancialConnectionsSession_Factory(provider);
    }

    public static AttachFinancialConnectionsSession newInstance(StripeRepository stripeRepository) {
        return new AttachFinancialConnectionsSession(stripeRepository);
    }
}
