package com.stripe.android.customersheet.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.customersheet.C0828CustomerSheetViewModel_Factory;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.CustomerSheetLoader;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import com.stripe.android.customersheet.DefaultCustomerSheetLoader;
import com.stripe.android.customersheet.DefaultCustomerSheetLoader_Factory;
import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter;
import com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter_Factory;
import com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.lpmfoundations.luxe.LpmRepository_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationRegistry;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler_Factory_Factory;
import com.stripe.android.paymentelement.confirmation.challenge.PassiveChallengeConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.challenge.PassiveChallengeConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.injection.ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;
import com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor;
import com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor_Factory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsSdkAvailable;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetFactory;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class DaggerCustomerSheetViewModelComponent {
    private DaggerCustomerSheetViewModelComponent() {
    }

    public static CustomerSheetViewModelComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements CustomerSheetViewModelComponent.Builder {
        private Application application;
        private CustomerSheet.Configuration configuration;
        private CustomerSheetIntegration.Type integrationType;
        private SavedStateHandle savedStateHandle;
        private Integer statusBarColor;

        private Builder() {
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent.Builder
        public Builder configuration(CustomerSheet.Configuration configuration) {
            this.configuration = (CustomerSheet.Configuration) Preconditions.checkNotNull(configuration);
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent.Builder
        public Builder statusBarColor(Integer num) {
            this.statusBarColor = num;
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent.Builder
        public Builder integrationType(CustomerSheetIntegration.Type type) {
            this.integrationType = (CustomerSheetIntegration.Type) Preconditions.checkNotNull(type);
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent.Builder
        public CustomerSheetViewModelComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.configuration, CustomerSheet.Configuration.class);
            Preconditions.checkBuilderRequirement(this.integrationType, CustomerSheetIntegration.Type.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            return new CustomerSheetViewModelComponentImpl(new GooglePayLauncherModule(), this.application, this.configuration, this.statusBarColor, this.integrationType, this.savedStateHandle);
        }
    }

    private static final class CustomerSheetViewModelComponentImpl implements CustomerSheetViewModelComponent {
        private Provider<Application> applicationProvider;
        private Provider<CustomerSheet.Configuration> configurationProvider;
        private Provider<Context> contextProvider;
        private final CustomerSheetViewModelComponentImpl customerSheetViewModelComponentImpl;
        private Provider<CustomerSheetViewModel> customerSheetViewModelProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultCustomerSheetEventReporter> defaultCustomerSheetEventReporterProvider;
        private Provider<DefaultCustomerSheetLoader> defaultCustomerSheetLoaderProvider;
        private Provider<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Provider<DefaultConfirmationHandler.Factory> factoryProvider;
        private Provider<CustomerSheetIntegration.Type> integrationTypeProvider;
        private Provider<Function0<Boolean>> isLiveModeProvider;
        private Provider<PassiveChallengeConfirmationDefinition> passiveChallengeConfirmationDefinitionProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<PaymentConfiguration> paymentConfigurationProvider;
        private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<Function0<String>> provideStripeAccountIdProvider;
        private Provider<ConfirmationRegistry> providesConfirmationRegistryProvider;
        private Provider<CreateIntentCallback> providesCreateIntentCallbackProvider;
        private Provider<ErrorReporter> providesErrorReporter$paymentsheet_releaseProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesIntentConfirmationDefinitionProvider;
        private Provider<PreparePaymentMethodHandler> providesPreparePaymentMethodHandlerProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> setOfConfirmationDefinitionOfAndAndAndProvider;
        private Provider<Integer> statusBarColorProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private CustomerSheetViewModelComponentImpl(GooglePayLauncherModule googlePayLauncherModule, Application application, CustomerSheet.Configuration configuration, Integer num, CustomerSheetIntegration.Type type, SavedStateHandle savedStateHandle) {
            this.customerSheetViewModelComponentImpl = this;
            initialize(googlePayLauncherModule, application, configuration, num, type, savedStateHandle);
            initialize2(googlePayLauncherModule, application, configuration, num, type, savedStateHandle);
        }

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, Application application, CustomerSheet.Configuration configuration, Integer num, CustomerSheetIntegration.Type type, SavedStateHandle savedStateHandle) {
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            this.paymentConfigurationProvider = CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory.create((Provider<Application>) factoryCreate);
            this.configurationProvider = InstanceFactory.create(configuration);
            this.integrationTypeProvider = InstanceFactory.create(type);
            this.provideLoggerProvider = CustomerSheetViewModelModule_Companion_ProvideLoggerFactory.create((Provider<Boolean>) CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory.create());
            this.contextProvider = CustomerSheetViewModelModule_Companion_ContextFactory.create(this.applicationProvider);
            CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory customerSheetViewModelModule_Companion_ProvidePublishableKeyFactoryCreate = CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory.create(this.paymentConfigurationProvider);
            this.providePublishableKeyProvider = customerSheetViewModelModule_Companion_ProvidePublishableKeyFactoryCreate;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, (Provider<Function0<String>>) customerSheetViewModelModule_Companion_ProvidePublishableKeyFactoryCreate, (Provider<Set<String>>) CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory.create());
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, (Provider<CoroutineContext>) CustomerSheetViewModelModule_Companion_IoContextFactory.create());
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.providePublishableKeyProvider, (Provider<CoroutineContext>) CustomerSheetViewModelModule_Companion_IoContextFactory.create(), (Provider<Set<String>>) CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory.create(), this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.defaultCustomerSheetEventReporterProvider = DefaultCustomerSheetEventReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider, (Provider<CoroutineContext>) CustomerSheetViewModelModule_Companion_IoContextFactory.create());
            this.isLiveModeProvider = CustomerSheetViewModelModule_Companion_IsLiveModeFactory.create(this.paymentConfigurationProvider);
            this.providesErrorReporter$paymentsheet_releaseProvider = CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory.create((Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.providesCreateIntentCallbackProvider = IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.create((Provider<String>) CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory.create());
            this.providesPreparePaymentMethodHandlerProvider = IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory.create((Provider<String>) CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory.create());
            this.provideStripeAccountIdProvider = CustomerSheetViewModelModule_Companion_ProvideStripeAccountIdFactory.create(this.paymentConfigurationProvider);
            this.defaultIntentConfirmationInterceptorProvider = DefaultIntentConfirmationInterceptor_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providesErrorReporter$paymentsheet_releaseProvider, this.providesCreateIntentCallbackProvider, this.providesPreparePaymentMethodHandlerProvider, (Provider<Boolean>) CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory.create(), this.providePublishableKeyProvider, this.provideStripeAccountIdProvider);
            StripePaymentLauncher_Factory stripePaymentLauncher_FactoryCreate = StripePaymentLauncher_Factory.create((Provider<Boolean>) CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory.create(), (Provider<Set<String>>) CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory.create());
            this.stripePaymentLauncherProvider = stripePaymentLauncher_FactoryCreate;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.createFactoryProvider(stripePaymentLauncher_FactoryCreate);
            Factory factoryCreateNullable = InstanceFactory.createNullable(num);
            this.statusBarColorProvider = factoryCreateNullable;
            this.providesIntentConfirmationDefinitionProvider = IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory.create((Provider<IntentConfirmationInterceptor>) this.defaultIntentConfirmationInterceptorProvider, this.stripePaymentLauncherAssistedFactoryProvider, (Provider<Integer>) factoryCreateNullable, this.paymentConfigurationProvider);
            this.passiveChallengeConfirmationDefinitionProvider = PassiveChallengeConfirmationDefinition_Factory.create(this.providesErrorReporter$paymentsheet_releaseProvider);
            SetFactory setFactoryBuild = SetFactory.builder(2, 0).addProvider((Provider) this.providesIntentConfirmationDefinitionProvider).addProvider((Provider) this.passiveChallengeConfirmationDefinitionProvider).build();
            this.setOfConfirmationDefinitionOfAndAndAndProvider = setFactoryBuild;
            this.providesConfirmationRegistryProvider = ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory.create((Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>>) setFactoryBuild);
            this.savedStateHandleProvider = InstanceFactory.create(savedStateHandle);
        }

        private void initialize2(GooglePayLauncherModule googlePayLauncherModule, Application application, CustomerSheet.Configuration configuration, Integer num, CustomerSheetIntegration.Type type, SavedStateHandle savedStateHandle) {
            this.factoryProvider = DefaultConfirmationHandler_Factory_Factory.create(this.providesConfirmationRegistryProvider, this.savedStateHandleProvider, this.providesErrorReporter$paymentsheet_releaseProvider, (Provider<CoroutineContext>) CustomerSheetViewModelModule_Companion_IoContextFactory.create());
            GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate = GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.contextProvider, this.provideLoggerProvider, this.providesErrorReporter$paymentsheet_releaseProvider);
            this.provideGooglePayRepositoryFactoryProvider = googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate;
            this.defaultCustomerSheetLoaderProvider = DefaultCustomerSheetLoader_Factory.create(this.isLiveModeProvider, (Provider<Function1<GooglePayEnvironment, GooglePayRepository>>) googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate, (Provider<IsFinancialConnectionsSdkAvailable>) CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory.create(), (Provider<LpmRepository>) LpmRepository_Factory.create(), (Provider<CustomerSheetEventReporter>) this.defaultCustomerSheetEventReporterProvider, this.providesErrorReporter$paymentsheet_releaseProvider, (Provider<CoroutineContext>) CustomerSheetViewModelModule_Companion_IoContextFactory.create());
            this.customerSheetViewModelProvider = DoubleCheck.provider((Provider) C0828CustomerSheetViewModel_Factory.create(this.applicationProvider, (Provider<PaymentSelection>) CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory.create(), this.paymentConfigurationProvider, this.configurationProvider, this.integrationTypeProvider, this.provideLoggerProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<CustomerSheetEventReporter>) this.defaultCustomerSheetEventReporterProvider, (Provider<CoroutineContext>) CustomerSheetViewModelModule_Companion_IoContextFactory.create(), this.isLiveModeProvider, (Provider<Set<String>>) CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory.create(), (Provider<ConfirmationHandler.Factory>) this.factoryProvider, (Provider<CustomerSheetLoader>) this.defaultCustomerSheetLoaderProvider, this.providesErrorReporter$paymentsheet_releaseProvider));
        }

        @Override // com.stripe.android.customersheet.injection.CustomerSheetViewModelComponent
        public CustomerSheetViewModel getViewModel() {
            return this.customerSheetViewModelProvider.get();
        }
    }
}
