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
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.customersheet.data.CustomerAdapterDataSource;
import com.stripe.android.customersheet.data.CustomerAdapterDataSource_Factory;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;
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

/* loaded from: classes5.dex */
public final class DaggerCustomerAdapterDataSourceComponent {
    private DaggerCustomerAdapterDataSourceComponent() {
    }

    public static CustomerAdapterDataSourceComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements CustomerAdapterDataSourceComponent.Builder {
        private CustomerAdapter adapter;
        private Application application;

        private Builder() {
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent.Builder
        public Builder adapter(CustomerAdapter customerAdapter) {
            this.adapter = (CustomerAdapter) Preconditions.checkNotNull(customerAdapter);
            return this;
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent.Builder
        public CustomerAdapterDataSourceComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.adapter, CustomerAdapter.class);
            return new CustomerAdapterDataSourceComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), new MobileSessionIdModule(), this.application, this.adapter);
        }
    }

    private static final class CustomerAdapterDataSourceComponentImpl implements CustomerAdapterDataSourceComponent {
        private Provider<CustomerAdapter> adapterProvider;
        private Provider<Application> applicationProvider;
        private final CustomerAdapterDataSourceComponentImpl customerAdapterDataSourceComponentImpl;
        private Provider<CustomerAdapterDataSource> customerAdapterDataSourceProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<String> mobileSessionIdProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<RealElementsSessionRepository> realElementsSessionRepositoryProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;

        private CustomerAdapterDataSourceComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, Application application, CustomerAdapter customerAdapter) {
            this.customerAdapterDataSourceComponentImpl = this;
            initialize(coroutineContextModule, coreCommonModule, mobileSessionIdModule, application, customerAdapter);
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, Application application, CustomerAdapter customerAdapter) {
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
            this.adapterProvider = InstanceFactory.create(customerAdapter);
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            this.customerAdapterDataSourceProvider = DoubleCheck.provider((Provider) CustomerAdapterDataSource_Factory.create((Provider<ElementsSessionRepository>) this.realElementsSessionRepositoryProvider, this.adapterProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate, this.provideWorkContextProvider));
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent
        public CustomerSheetPaymentMethodDataSource getCustomerSheetPaymentMethodDataSource() {
            return this.customerAdapterDataSourceProvider.get();
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent
        public CustomerSheetSavedSelectionDataSource getCustomerSheetSavedSelectionDataSource() {
            return this.customerAdapterDataSourceProvider.get();
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent
        public CustomerSheetIntentDataSource getCustomerSheetIntentDataSource() {
            return this.customerAdapterDataSourceProvider.get();
        }

        @Override // com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent
        public CustomerSheetInitializationDataSource getCustomerSheetInitializationDataSource() {
            return this.customerAdapterDataSourceProvider.get();
        }
    }
}
