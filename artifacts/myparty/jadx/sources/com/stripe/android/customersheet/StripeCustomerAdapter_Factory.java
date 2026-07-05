package com.stripe.android.customersheet;

import android.content.Context;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class StripeCustomerAdapter_Factory implements Factory<StripeCustomerAdapter> {
    private final Provider<Context> contextProvider;
    private final Provider<CustomerEphemeralKeyProvider> customerEphemeralKeyProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<List<String>> paymentMethodTypesProvider;
    private final Provider<Function1<CustomerEphemeralKey, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Provider<SetupIntentClientSecretProvider> setupIntentClientSecretProvider;
    private final Provider<Function0<Long>> timeProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public StripeCustomerAdapter_Factory(Provider<Context> provider, Provider<CustomerEphemeralKeyProvider> provider2, Provider<SetupIntentClientSecretProvider> provider3, Provider<List<String>> provider4, Provider<Function0<Long>> provider5, Provider<CustomerRepository> provider6, Provider<Function1<CustomerEphemeralKey, PrefsRepository>> provider7, Provider<CoroutineContext> provider8) {
        this.contextProvider = provider;
        this.customerEphemeralKeyProvider = provider2;
        this.setupIntentClientSecretProvider = provider3;
        this.paymentMethodTypesProvider = provider4;
        this.timeProvider = provider5;
        this.customerRepositoryProvider = provider6;
        this.prefsRepositoryFactoryProvider = provider7;
        this.workContextProvider = provider8;
    }

    @Override // javax.inject.Provider
    public StripeCustomerAdapter get() {
        return newInstance(this.contextProvider.get(), this.customerEphemeralKeyProvider.get(), this.setupIntentClientSecretProvider.get(), this.paymentMethodTypesProvider.get(), this.timeProvider.get(), this.customerRepositoryProvider.get(), this.prefsRepositoryFactoryProvider.get(), this.workContextProvider.get());
    }

    public static StripeCustomerAdapter_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<CustomerEphemeralKeyProvider> provider2, javax.inject.Provider<SetupIntentClientSecretProvider> provider3, javax.inject.Provider<List<String>> provider4, javax.inject.Provider<Function0<Long>> provider5, javax.inject.Provider<CustomerRepository> provider6, javax.inject.Provider<Function1<CustomerEphemeralKey, PrefsRepository>> provider7, javax.inject.Provider<CoroutineContext> provider8) {
        return new StripeCustomerAdapter_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8));
    }

    public static StripeCustomerAdapter_Factory create(Provider<Context> provider, Provider<CustomerEphemeralKeyProvider> provider2, Provider<SetupIntentClientSecretProvider> provider3, Provider<List<String>> provider4, Provider<Function0<Long>> provider5, Provider<CustomerRepository> provider6, Provider<Function1<CustomerEphemeralKey, PrefsRepository>> provider7, Provider<CoroutineContext> provider8) {
        return new StripeCustomerAdapter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static StripeCustomerAdapter newInstance(Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List<String> list, Function0<Long> function0, CustomerRepository customerRepository, Function1<CustomerEphemeralKey, PrefsRepository> function1, CoroutineContext coroutineContext) {
        return new StripeCustomerAdapter(context, customerEphemeralKeyProvider, setupIntentClientSecretProvider, list, function0, customerRepository, function1, coroutineContext);
    }
}
