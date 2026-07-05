package com.stripe.android.customersheet.data;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class CustomerSessionInitializationDataSource_Factory implements Factory<CustomerSessionInitializationDataSource> {
    private final Provider<CustomerSessionElementsSessionManager> elementsSessionManagerProvider;
    private final Provider<CustomerSheetSavedSelectionDataSource> savedSelectionDataSourceProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public CustomerSessionInitializationDataSource_Factory(Provider<CustomerSessionElementsSessionManager> provider, Provider<CustomerSheetSavedSelectionDataSource> provider2, Provider<CoroutineContext> provider3) {
        this.elementsSessionManagerProvider = provider;
        this.savedSelectionDataSourceProvider = provider2;
        this.workContextProvider = provider3;
    }

    @Override // javax.inject.Provider
    public CustomerSessionInitializationDataSource get() {
        return newInstance(this.elementsSessionManagerProvider.get(), this.savedSelectionDataSourceProvider.get(), this.workContextProvider.get());
    }

    public static CustomerSessionInitializationDataSource_Factory create(javax.inject.Provider<CustomerSessionElementsSessionManager> provider, javax.inject.Provider<CustomerSheetSavedSelectionDataSource> provider2, javax.inject.Provider<CoroutineContext> provider3) {
        return new CustomerSessionInitializationDataSource_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static CustomerSessionInitializationDataSource_Factory create(Provider<CustomerSessionElementsSessionManager> provider, Provider<CustomerSheetSavedSelectionDataSource> provider2, Provider<CoroutineContext> provider3) {
        return new CustomerSessionInitializationDataSource_Factory(provider, provider2, provider3);
    }

    public static CustomerSessionInitializationDataSource newInstance(CustomerSessionElementsSessionManager customerSessionElementsSessionManager, CustomerSheetSavedSelectionDataSource customerSheetSavedSelectionDataSource, CoroutineContext coroutineContext) {
        return new CustomerSessionInitializationDataSource(customerSessionElementsSessionManager, customerSheetSavedSelectionDataSource, coroutineContext);
    }
}
