package com.stripe.android.customersheet;

import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsSdkAvailable;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class DefaultCustomerSheetLoader_Factory implements Factory<DefaultCustomerSheetLoader> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<CustomerSheetEventReporter> eventReporterProvider;
    private final Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Provider<IsFinancialConnectionsSdkAvailable> isFinancialConnectionsAvailableProvider;
    private final Provider<Function0<Boolean>> isLiveModeProvider;
    private final Provider<LpmRepository> lpmRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultCustomerSheetLoader_Factory(Provider<Function0<Boolean>> provider, Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<IsFinancialConnectionsSdkAvailable> provider3, Provider<LpmRepository> provider4, Provider<CustomerSheetEventReporter> provider5, Provider<ErrorReporter> provider6, Provider<CoroutineContext> provider7) {
        this.isLiveModeProvider = provider;
        this.googlePayRepositoryFactoryProvider = provider2;
        this.isFinancialConnectionsAvailableProvider = provider3;
        this.lpmRepositoryProvider = provider4;
        this.eventReporterProvider = provider5;
        this.errorReporterProvider = provider6;
        this.workContextProvider = provider7;
    }

    @Override // javax.inject.Provider
    public DefaultCustomerSheetLoader get() {
        return newInstance(this.isLiveModeProvider.get(), this.googlePayRepositoryFactoryProvider.get(), this.isFinancialConnectionsAvailableProvider.get(), this.lpmRepositoryProvider.get(), this.eventReporterProvider.get(), this.errorReporterProvider.get(), this.workContextProvider.get());
    }

    public static DefaultCustomerSheetLoader_Factory create(javax.inject.Provider<Function0<Boolean>> provider, javax.inject.Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, javax.inject.Provider<IsFinancialConnectionsSdkAvailable> provider3, javax.inject.Provider<LpmRepository> provider4, javax.inject.Provider<CustomerSheetEventReporter> provider5, javax.inject.Provider<ErrorReporter> provider6, javax.inject.Provider<CoroutineContext> provider7) {
        return new DefaultCustomerSheetLoader_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static DefaultCustomerSheetLoader_Factory create(Provider<Function0<Boolean>> provider, Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<IsFinancialConnectionsSdkAvailable> provider3, Provider<LpmRepository> provider4, Provider<CustomerSheetEventReporter> provider5, Provider<ErrorReporter> provider6, Provider<CoroutineContext> provider7) {
        return new DefaultCustomerSheetLoader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DefaultCustomerSheetLoader newInstance(Function0<Boolean> function0, Function1<GooglePayEnvironment, GooglePayRepository> function1, IsFinancialConnectionsSdkAvailable isFinancialConnectionsSdkAvailable, LpmRepository lpmRepository, CustomerSheetEventReporter customerSheetEventReporter, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        return new DefaultCustomerSheetLoader(function0, function1, isFinancialConnectionsSdkAvailable, lpmRepository, customerSheetEventReporter, errorReporter, coroutineContext);
    }
}
