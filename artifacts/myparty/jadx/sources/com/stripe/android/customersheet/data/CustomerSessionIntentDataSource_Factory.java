package com.stripe.android.customersheet.data;

import com.stripe.android.customersheet.CustomerSheet;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSessionIntentDataSource_Factory implements Factory<CustomerSessionIntentDataSource> {
    private final Provider<CustomerSheet.CustomerSessionProvider> customerSessionProvider;
    private final Provider<CustomerSessionElementsSessionManager> elementsSessionManagerProvider;

    public CustomerSessionIntentDataSource_Factory(Provider<CustomerSessionElementsSessionManager> provider, Provider<CustomerSheet.CustomerSessionProvider> provider2) {
        this.elementsSessionManagerProvider = provider;
        this.customerSessionProvider = provider2;
    }

    @Override // javax.inject.Provider
    public CustomerSessionIntentDataSource get() {
        return newInstance(this.elementsSessionManagerProvider.get(), this.customerSessionProvider.get());
    }

    public static CustomerSessionIntentDataSource_Factory create(javax.inject.Provider<CustomerSessionElementsSessionManager> provider, javax.inject.Provider<CustomerSheet.CustomerSessionProvider> provider2) {
        return new CustomerSessionIntentDataSource_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static CustomerSessionIntentDataSource_Factory create(Provider<CustomerSessionElementsSessionManager> provider, Provider<CustomerSheet.CustomerSessionProvider> provider2) {
        return new CustomerSessionIntentDataSource_Factory(provider, provider2);
    }

    public static CustomerSessionIntentDataSource newInstance(CustomerSessionElementsSessionManager customerSessionElementsSessionManager, CustomerSheet.CustomerSessionProvider customerSessionProvider) {
        return new CustomerSessionIntentDataSource(customerSessionElementsSessionManager, customerSessionProvider);
    }
}
