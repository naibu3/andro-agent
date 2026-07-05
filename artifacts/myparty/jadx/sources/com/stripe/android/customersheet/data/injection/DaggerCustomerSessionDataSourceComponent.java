package com.stripe.android.customersheet.data.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.common.di.ApplicationIdModule_ProvideApplicationIdFactory;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.common.di.MobileSessionIdModule_MobileSessionIdProviderFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.data.CustomerSessionInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSessionIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager;
import com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager_Factory;
import com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class DaggerCustomerSessionDataSourceComponent {
    private DaggerCustomerSessionDataSourceComponent() {
    }

    public static CustomerSessionDataSourceComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements CustomerSessionDataSourceComponent.Builder {
        private Application application;
        private CustomerSheet.CustomerSessionProvider customerSessionProvider;

        private Builder() {
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent.Builder
        public Builder customerSessionProvider(CustomerSheet.CustomerSessionProvider customerSessionProvider) {
            this.customerSessionProvider = (CustomerSheet.CustomerSessionProvider) Preconditions.checkNotNull(customerSessionProvider);
            return this;
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent.Builder
        public CustomerSessionDataSourceComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.customerSessionProvider, CustomerSheet.CustomerSessionProvider.class);
            return new CustomerSessionDataSourceComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), new MobileSessionIdModule(), this.application, this.customerSessionProvider);
        }
    }

    private static final class CustomerSessionDataSourceComponentImpl implements CustomerSessionDataSourceComponent {
        private final Application application;
        private Provider<Application> applicationProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private final CustomerSessionDataSourceComponentImpl customerSessionDataSourceComponentImpl;
        private Provider<CustomerSheet.CustomerSessionProvider> customerSessionProvider;
        private final CustomerSheet.CustomerSessionProvider customerSessionProvider2;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultCustomerSessionElementsSessionManager> defaultCustomerSessionElementsSessionManagerProvider;
        private Provider<String> mobileSessionIdProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function1<String, PrefsRepository>> providePrefsRepositoryFactoryProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<RealElementsSessionRepository> realElementsSessionRepositoryProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;

        private CustomerSessionDataSourceComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, Application application, CustomerSheet.CustomerSessionProvider customerSessionProvider) {
            this.customerSessionDataSourceComponentImpl = this;
            this.application = application;
            this.customerSessionProvider2 = customerSessionProvider;
            initialize(coroutineContextModule, coreCommonModule, mobileSessionIdModule, application, customerSessionProvider);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private Function0<String> namedFunction0OfString() {
            return CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(this.providePaymentConfigurationProvider);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.application, namedFunction0OfString(), CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.providesProductUsage());
        }

        private RealErrorReporter realErrorReporter() {
            return new RealErrorReporter(defaultAnalyticsRequestExecutor(), paymentAnalyticsRequestFactory());
        }

        private CustomerSessionPaymentMethodDataSource customerSessionPaymentMethodDataSource() {
            return new CustomerSessionPaymentMethodDataSource(this.defaultCustomerSessionElementsSessionManagerProvider.get(), this.customerApiRepositoryProvider.get(), realErrorReporter(), this.provideWorkContextProvider.get());
        }

        private Function1<String, PrefsRepository> function1OfStringAndPrefsRepository() {
            return CustomerSessionDataSourceModule_Companion_ProvidePrefsRepositoryFactoryFactory.providePrefsRepositoryFactory(this.application, this.provideWorkContextProvider.get());
        }

        private CustomerSessionSavedSelectionDataSource customerSessionSavedSelectionDataSource() {
            return new CustomerSessionSavedSelectionDataSource(this.defaultCustomerSessionElementsSessionManagerProvider.get(), this.customerApiRepositoryProvider.get(), function1OfStringAndPrefsRepository(), this.provideWorkContextProvider.get());
        }

        private CustomerSessionIntentDataSource customerSessionIntentDataSource() {
            return new CustomerSessionIntentDataSource(this.defaultCustomerSessionElementsSessionManagerProvider.get(), this.customerSessionProvider2);
        }

        private CustomerSessionInitializationDataSource customerSessionInitializationDataSource() {
            return new CustomerSessionInitializationDataSource(this.defaultCustomerSessionElementsSessionManagerProvider.get(), customerSessionSavedSelectionDataSource(), this.provideWorkContextProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, Application application, CustomerSheet.CustomerSessionProvider customerSessionProvider) {
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory customerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) factoryCreate);
            this.providePaymentConfigurationProvider = customerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) customerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create((Provider<Context>) this.applicationProvider, this.providePublishableKeyProvider, (Provider<Set<String>>) CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.create());
            Provider<Logger> provider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory.create()));
            this.provideLoggerProvider = provider;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provider, this.provideWorkContextProvider);
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create((Provider<Context>) this.applicationProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, (Provider<Set<String>>) CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.create(), this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.mobileSessionIdProvider = MobileSessionIdModule_MobileSessionIdProviderFactory.create(mobileSessionIdModule);
            ApplicationIdModule_ProvideApplicationIdFactory applicationIdModule_ProvideApplicationIdFactoryCreate = ApplicationIdModule_ProvideApplicationIdFactory.create(this.applicationProvider);
            this.provideApplicationIdProvider = applicationIdModule_ProvideApplicationIdFactoryCreate;
            this.realElementsSessionRepositoryProvider = RealElementsSessionRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideWorkContextProvider, this.mobileSessionIdProvider, (Provider<String>) applicationIdModule_ProvideApplicationIdFactoryCreate);
            this.providePrefsRepositoryFactoryProvider = CustomerSessionDataSourceModule_Companion_ProvidePrefsRepositoryFactoryFactory.create((Provider<Context>) this.applicationProvider, this.provideWorkContextProvider);
            this.customerSessionProvider = InstanceFactory.create(customerSessionProvider);
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            this.defaultCustomerSessionElementsSessionManagerProvider = DoubleCheck.provider((Provider) DefaultCustomerSessionElementsSessionManager_Factory.create((Provider<ElementsSessionRepository>) this.realElementsSessionRepositoryProvider, this.providePrefsRepositoryFactoryProvider, this.customerSessionProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate, (Provider<Function0<Long>>) CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory.create(), this.provideWorkContextProvider));
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, (Provider<Set<String>>) CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.create()));
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent
        public CustomerSheetPaymentMethodDataSource getCustomerSheetPaymentMethodDataSource() {
            return customerSessionPaymentMethodDataSource();
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent
        public CustomerSheetSavedSelectionDataSource getCustomerSheetSavedSelectionDataSource() {
            return customerSessionSavedSelectionDataSource();
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent
        public CustomerSheetIntentDataSource getCustomerSheetIntentDataSource() {
            return customerSessionIntentDataSource();
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent
        public CustomerSheetInitializationDataSource getCustomerSheetInitializationDataSource() {
            return customerSessionInitializationDataSource();
        }
    }
}
