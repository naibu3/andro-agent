package com.stripe.android.customersheet.injection;

import android.content.Context;
import com.stripe.android.customersheet.CustomerEphemeralKey;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory implements Factory<Function1<CustomerEphemeralKey, PrefsRepository>> {
    private final Provider<Context> appContextProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Function1<CustomerEphemeralKey, PrefsRepository> get() {
        return providePrefsRepositoryFactory(this.appContextProvider.get(), this.workContextProvider.get());
    }

    public static StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory create(javax.inject.Provider<Context> provider, javax.inject.Provider<CoroutineContext> provider2) {
        return new StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory create(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory(provider, provider2);
    }

    public static Function1<CustomerEphemeralKey, PrefsRepository> providePrefsRepositoryFactory(Context context, CoroutineContext coroutineContext) {
        return (Function1) Preconditions.checkNotNullFromProvides(StripeCustomerAdapterModule.INSTANCE.providePrefsRepositoryFactory(context, coroutineContext));
    }
}
