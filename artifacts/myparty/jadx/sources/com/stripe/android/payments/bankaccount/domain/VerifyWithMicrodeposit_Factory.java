package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class VerifyWithMicrodeposit_Factory implements Factory<VerifyWithMicrodeposit> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public VerifyWithMicrodeposit_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyWithMicrodeposit get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }

    public static VerifyWithMicrodeposit_Factory create(javax.inject.Provider<StripeRepository> provider) {
        return new VerifyWithMicrodeposit_Factory(Providers.asDaggerProvider(provider));
    }

    public static VerifyWithMicrodeposit_Factory create(Provider<StripeRepository> provider) {
        return new VerifyWithMicrodeposit_Factory(provider);
    }

    public static VerifyWithMicrodeposit newInstance(StripeRepository stripeRepository) {
        return new VerifyWithMicrodeposit(stripeRepository);
    }
}
