package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class CreateFinancialConnectionsSession_Factory implements Factory<CreateFinancialConnectionsSession> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public CreateFinancialConnectionsSession_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public CreateFinancialConnectionsSession get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }

    public static CreateFinancialConnectionsSession_Factory create(javax.inject.Provider<StripeRepository> provider) {
        return new CreateFinancialConnectionsSession_Factory(Providers.asDaggerProvider(provider));
    }

    public static CreateFinancialConnectionsSession_Factory create(Provider<StripeRepository> provider) {
        return new CreateFinancialConnectionsSession_Factory(provider);
    }

    public static CreateFinancialConnectionsSession newInstance(StripeRepository stripeRepository) {
        return new CreateFinancialConnectionsSession(stripeRepository);
    }
}
