package com.stripe.android.customersheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.customersheet.CustomerEphemeralKey;
import com.stripe.android.customersheet.CustomerEphemeralKeyProvider;
import com.stripe.android.customersheet.SetupIntentClientSecretProvider;
import com.stripe.android.customersheet.StripeCustomerAdapter;
import com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent;
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
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class DaggerStripeCustomerAdapterComponent {
    private DaggerStripeCustomerAdapterComponent() {
    }

    public static StripeCustomerAdapterComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements StripeCustomerAdapterComponent.Builder {
        private Context context;
        private CustomerEphemeralKeyProvider customerEphemeralKeyProvider;
        private List<String> paymentMethodTypes;
        private SetupIntentClientSecretProvider setupIntentClientSecretProvider;

        private Builder() {
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent.Builder
        public /* bridge */ /* synthetic */ StripeCustomerAdapterComponent.Builder paymentMethodTypes(List list) {
            return paymentMethodTypes((List<String>) list);
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent.Builder
        public Builder customerEphemeralKeyProvider(CustomerEphemeralKeyProvider customerEphemeralKeyProvider) {
            this.customerEphemeralKeyProvider = (CustomerEphemeralKeyProvider) Preconditions.checkNotNull(customerEphemeralKeyProvider);
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent.Builder
        public Builder setupIntentClientSecretProvider(SetupIntentClientSecretProvider setupIntentClientSecretProvider) {
            this.setupIntentClientSecretProvider = setupIntentClientSecretProvider;
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent.Builder
        public Builder paymentMethodTypes(List<String> list) {
            this.paymentMethodTypes = list;
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent.Builder
        public StripeCustomerAdapterComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.customerEphemeralKeyProvider, CustomerEphemeralKeyProvider.class);
            return new StripeCustomerAdapterComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.customerEphemeralKeyProvider, this.setupIntentClientSecretProvider, this.paymentMethodTypes);
        }
    }

    private static final class StripeCustomerAdapterComponentImpl implements StripeCustomerAdapterComponent {
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private final CustomerEphemeralKeyProvider customerEphemeralKeyProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final List<String> paymentMethodTypes;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private final SetupIntentClientSecretProvider setupIntentClientSecretProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private final StripeCustomerAdapterComponentImpl stripeCustomerAdapterComponentImpl;

        private StripeCustomerAdapterComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List<String> list) {
            this.stripeCustomerAdapterComponentImpl = this;
            this.context = context;
            this.customerEphemeralKeyProvider = customerEphemeralKeyProvider;
            this.setupIntentClientSecretProvider = setupIntentClientSecretProvider;
            this.paymentMethodTypes = list;
            initialize(coroutineContextModule, coreCommonModule, context, customerEphemeralKeyProvider, setupIntentClientSecretProvider, list);
        }

        private Function1<CustomerEphemeralKey, PrefsRepository> function1OfCustomerEphemeralKeyAndPrefsRepository() {
            return StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory.providePrefsRepositoryFactory(this.context, this.provideWorkContextProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List<String> list) {
            Factory factoryCreate = InstanceFactory.create(context);
            this.contextProvider = factoryCreate;
            CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory customerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) factoryCreate);
            this.providePaymentConfigurationProvider = customerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) customerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.providePublishableKeyProvider, (Provider<Set<String>>) CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.create());
            Provider<Logger> provider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory.create()));
            this.provideLoggerProvider = provider;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provider, this.provideWorkContextProvider);
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, (Provider<Set<String>>) CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.create(), this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate, this.provideWorkContextProvider, (Provider<Set<String>>) CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.create()));
        }

        @Override // com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent
        public StripeCustomerAdapter getStripeCustomerAdapter() {
            return new StripeCustomerAdapter(this.context, this.customerEphemeralKeyProvider, this.setupIntentClientSecretProvider, this.paymentMethodTypes, CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory.provideTimeProvider(), this.customerApiRepositoryProvider.get(), function1OfCustomerEphemeralKeyAndPrefsRepository(), this.provideWorkContextProvider.get());
        }
    }
}
