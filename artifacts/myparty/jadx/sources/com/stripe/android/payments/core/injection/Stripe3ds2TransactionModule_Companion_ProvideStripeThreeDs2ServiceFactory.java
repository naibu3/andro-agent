package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory implements Factory<StripeThreeDs2Service> {
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3) {
        this.contextProvider = provider;
        this.enableLoggingProvider = provider2;
        this.workContextProvider = provider3;
    }

    @Override // javax.inject.Provider
    public StripeThreeDs2Service get() {
        return provideStripeThreeDs2Service(this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.workContextProvider.get());
    }

    public static Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory create(javax.inject.Provider<Context> provider, javax.inject.Provider<Boolean> provider2, javax.inject.Provider<CoroutineContext> provider3) {
        return new Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory create(Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3) {
        return new Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(provider, provider2, provider3);
    }

    public static StripeThreeDs2Service provideStripeThreeDs2Service(Context context, boolean z, CoroutineContext coroutineContext) {
        return (StripeThreeDs2Service) Preconditions.checkNotNullFromProvides(Stripe3ds2TransactionModule.INSTANCE.provideStripeThreeDs2Service(context, z, coroutineContext));
    }
}
