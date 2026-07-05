package com.stripe.android.paymentsheet.state;

import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class DefaultRetrieveCustomerEmail_Factory implements Factory<DefaultRetrieveCustomerEmail> {
    private final Provider<CustomerRepository> customerRepositoryProvider;

    public DefaultRetrieveCustomerEmail_Factory(Provider<CustomerRepository> provider) {
        this.customerRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultRetrieveCustomerEmail get() {
        return newInstance(this.customerRepositoryProvider.get());
    }

    public static DefaultRetrieveCustomerEmail_Factory create(javax.inject.Provider<CustomerRepository> provider) {
        return new DefaultRetrieveCustomerEmail_Factory(Providers.asDaggerProvider(provider));
    }

    public static DefaultRetrieveCustomerEmail_Factory create(Provider<CustomerRepository> provider) {
        return new DefaultRetrieveCustomerEmail_Factory(provider);
    }

    public static DefaultRetrieveCustomerEmail newInstance(CustomerRepository customerRepository) {
        return new DefaultRetrieveCustomerEmail(customerRepository);
    }
}
