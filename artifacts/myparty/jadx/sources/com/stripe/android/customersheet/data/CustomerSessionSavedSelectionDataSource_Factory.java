package com.stripe.android.customersheet.data;

import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class CustomerSessionSavedSelectionDataSource_Factory implements Factory<CustomerSessionSavedSelectionDataSource> {
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<CustomerSessionElementsSessionManager> elementsSessionManagerProvider;
    private final Provider<Function1<String, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public CustomerSessionSavedSelectionDataSource_Factory(Provider<CustomerSessionElementsSessionManager> provider, Provider<CustomerRepository> provider2, Provider<Function1<String, PrefsRepository>> provider3, Provider<CoroutineContext> provider4) {
        this.elementsSessionManagerProvider = provider;
        this.customerRepositoryProvider = provider2;
        this.prefsRepositoryFactoryProvider = provider3;
        this.workContextProvider = provider4;
    }

    @Override // javax.inject.Provider
    public CustomerSessionSavedSelectionDataSource get() {
        return newInstance(this.elementsSessionManagerProvider.get(), this.customerRepositoryProvider.get(), this.prefsRepositoryFactoryProvider.get(), this.workContextProvider.get());
    }

    public static CustomerSessionSavedSelectionDataSource_Factory create(javax.inject.Provider<CustomerSessionElementsSessionManager> provider, javax.inject.Provider<CustomerRepository> provider2, javax.inject.Provider<Function1<String, PrefsRepository>> provider3, javax.inject.Provider<CoroutineContext> provider4) {
        return new CustomerSessionSavedSelectionDataSource_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static CustomerSessionSavedSelectionDataSource_Factory create(Provider<CustomerSessionElementsSessionManager> provider, Provider<CustomerRepository> provider2, Provider<Function1<String, PrefsRepository>> provider3, Provider<CoroutineContext> provider4) {
        return new CustomerSessionSavedSelectionDataSource_Factory(provider, provider2, provider3, provider4);
    }

    public static CustomerSessionSavedSelectionDataSource newInstance(CustomerSessionElementsSessionManager customerSessionElementsSessionManager, CustomerRepository customerRepository, Function1<String, PrefsRepository> function1, CoroutineContext coroutineContext) {
        return new CustomerSessionSavedSelectionDataSource(customerSessionElementsSessionManager, customerRepository, function1, coroutineContext);
    }
}
