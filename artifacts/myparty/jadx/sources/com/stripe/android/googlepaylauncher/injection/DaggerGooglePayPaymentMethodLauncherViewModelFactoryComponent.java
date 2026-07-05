package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent {
    private DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent() {
    }

    public static GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder {
        private CardBrandFilter cardBrandFilter;
        private Context context;
        private Boolean enableLogging;
        private GooglePayPaymentMethodLauncher.Config googlePayConfig;
        private Set<String> productUsage;
        private Function0<String> publishableKeyProvider;
        private Function0<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z) {
            this.enableLogging = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
            this.googlePayConfig = (GooglePayPaymentMethodLauncher.Config) Preconditions.checkNotNull(config);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder cardBrandFilter(CardBrandFilter cardBrandFilter) {
            this.cardBrandFilter = (CardBrandFilter) Preconditions.checkNotNull(cardBrandFilter);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public GooglePayPaymentMethodLauncherViewModelFactoryComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.enableLogging, Boolean.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.stripeAccountIdProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            Preconditions.checkBuilderRequirement(this.googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
            Preconditions.checkBuilderRequirement(this.cardBrandFilter, CardBrandFilter.class);
            return new GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.googlePayConfig, this.cardBrandFilter);
        }
    }

    private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
        private GooglePayPaymentMethodLauncherContractV2.Args args;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private SavedStateHandle savedStateHandle;

        private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder args(GooglePayPaymentMethodLauncherContractV2.Args args) {
            this.args = (GooglePayPaymentMethodLauncherContractV2.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.args, GooglePayPaymentMethodLauncherContractV2.Args.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl, this.args, this.savedStateHandle);
        }
    }

    private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentImpl implements GooglePayPaymentMethodLauncherViewModelSubcomponent {
        private final GooglePayPaymentMethodLauncherContractV2.Args args;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl;
        private final SavedStateHandle savedStateHandle;

        private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl, GooglePayPaymentMethodLauncherContractV2.Args args, SavedStateHandle savedStateHandle) {
            this.googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
            this.args = args;
            this.savedStateHandle = savedStateHandle;
        }

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.publishableKeyProvider, this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.stripeAccountIdProvider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent
        public GooglePayPaymentMethodLauncherViewModel getViewModel() {
            return new GooglePayPaymentMethodLauncherViewModel((PaymentsClient) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.providePaymentsClientProvider.get(), options(), this.args, this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.stripeApiRepository(), (GooglePayJsonFactory) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.googlePayJsonFactoryProvider.get(), (GooglePayRepository) this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl.defaultGooglePayRepositoryProvider.get(), this.savedStateHandle);
        }
    }

    private static final class GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl implements GooglePayPaymentMethodLauncherViewModelFactoryComponent {
        private Provider<AnalyticsRequestFactory> bindsAnalyticsRequestFactoryProvider;
        private Provider<ErrorReporter> bindsErrorReporterProvider;
        private Provider<PaymentsClientFactory> bindsPaymentsClientFactoryProvider;
        private Provider<CardBrandFilter> cardBrandFilterProvider;
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;
        private Provider<DefaultPaymentsClientFactory> defaultPaymentsClientFactoryProvider;
        private Provider<Boolean> enableLoggingProvider;
        private Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
        private Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;
        private final GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl googlePayPaymentMethodLauncherViewModelFactoryComponentImpl;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final Set<String> productUsage;
        private Provider<Set<String>> productUsageProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentsClient> providePaymentsClientProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private Provider<Function0<String>> publishableKeyProvider2;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private final Function0<String> stripeAccountIdProvider;
        private Provider<Function0<String>> stripeAccountIdProvider2;

        private GooglePayPaymentMethodLauncherViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, GooglePayPaymentMethodLauncher.Config config, CardBrandFilter cardBrandFilter) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl = this;
            this.publishableKeyProvider = function0;
            this.stripeAccountIdProvider = function02;
            this.context = context;
            this.productUsage = set;
            initialize(coroutineContextModule, coreCommonModule, context, bool, function0, function02, set, config, cardBrandFilter);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Boolean bool, Function0<String> function0, Function0<String> function02, Set<String> set, GooglePayPaymentMethodLauncher.Config config, CardBrandFilter cardBrandFilter) {
            this.googlePayConfigProvider = InstanceFactory.create(config);
            Factory factoryCreate = InstanceFactory.create(context);
            this.contextProvider = factoryCreate;
            DefaultPaymentsClientFactory_Factory defaultPaymentsClientFactory_FactoryCreate = DefaultPaymentsClientFactory_Factory.create((Provider<Context>) factoryCreate);
            this.defaultPaymentsClientFactoryProvider = defaultPaymentsClientFactory_FactoryCreate;
            Provider<PaymentsClientFactory> provider = DoubleCheck.provider((Provider) defaultPaymentsClientFactory_FactoryCreate);
            this.bindsPaymentsClientFactoryProvider = provider;
            this.providePaymentsClientProvider = DoubleCheck.provider((Provider) GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory.create(this.googlePayConfigProvider, provider));
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Factory factoryCreate2 = InstanceFactory.create(bool);
            this.enableLoggingProvider = factoryCreate2;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) factoryCreate2));
            this.publishableKeyProvider2 = InstanceFactory.create(function0);
            this.stripeAccountIdProvider2 = InstanceFactory.create(function02);
            Factory factoryCreate3 = InstanceFactory.create(cardBrandFilter);
            this.cardBrandFilterProvider = factoryCreate3;
            this.googlePayJsonFactoryProvider = DoubleCheck.provider((Provider) GooglePayJsonFactory_Factory.create(this.publishableKeyProvider2, this.stripeAccountIdProvider2, this.googlePayConfigProvider, (Provider<CardBrandFilter>) factoryCreate3));
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            Factory factoryCreate4 = InstanceFactory.create(set);
            this.productUsageProvider = factoryCreate4;
            PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_FactoryCreate = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, (Provider<Set<String>>) factoryCreate4);
            this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactory_FactoryCreate;
            Provider<AnalyticsRequestFactory> provider2 = DoubleCheck.provider((Provider) paymentAnalyticsRequestFactory_FactoryCreate);
            this.bindsAnalyticsRequestFactoryProvider = provider2;
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, provider2);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            Provider<ErrorReporter> provider3 = DoubleCheck.provider((Provider) realErrorReporter_FactoryCreate);
            this.bindsErrorReporterProvider = provider3;
            this.defaultGooglePayRepositoryProvider = DoubleCheck.provider((Provider) DefaultGooglePayRepository_Factory.create(this.contextProvider, this.googlePayConfigProvider, this.provideLoggerProvider, provider3, this.cardBrandFilterProvider));
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent
        public GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder getSubcomponentBuilder() {
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(this.googlePayPaymentMethodLauncherViewModelFactoryComponentImpl);
        }
    }
}
