package com.stripe.android.customersheet.data;

import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class CustomerAdapterDataSource_Factory implements Factory<CustomerAdapterDataSource> {
    private final Provider<CustomerAdapter> customerAdapterProvider;
    private final Provider<ElementsSessionRepository> elementsSessionRepositoryProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public CustomerAdapterDataSource_Factory(Provider<ElementsSessionRepository> provider, Provider<CustomerAdapter> provider2, Provider<ErrorReporter> provider3, Provider<CoroutineContext> provider4) {
        this.elementsSessionRepositoryProvider = provider;
        this.customerAdapterProvider = provider2;
        this.errorReporterProvider = provider3;
        this.workContextProvider = provider4;
    }

    @Override // javax.inject.Provider
    public CustomerAdapterDataSource get() {
        return newInstance(this.elementsSessionRepositoryProvider.get(), this.customerAdapterProvider.get(), this.errorReporterProvider.get(), this.workContextProvider.get());
    }

    public static CustomerAdapterDataSource_Factory create(javax.inject.Provider<ElementsSessionRepository> provider, javax.inject.Provider<CustomerAdapter> provider2, javax.inject.Provider<ErrorReporter> provider3, javax.inject.Provider<CoroutineContext> provider4) {
        return new CustomerAdapterDataSource_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static CustomerAdapterDataSource_Factory create(Provider<ElementsSessionRepository> provider, Provider<CustomerAdapter> provider2, Provider<ErrorReporter> provider3, Provider<CoroutineContext> provider4) {
        return new CustomerAdapterDataSource_Factory(provider, provider2, provider3, provider4);
    }

    public static CustomerAdapterDataSource newInstance(ElementsSessionRepository elementsSessionRepository, CustomerAdapter customerAdapter, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        return new CustomerAdapterDataSource(elementsSessionRepository, customerAdapter, errorReporter, coroutineContext);
    }
}
