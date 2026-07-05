package com.stripe.android.paymentelement.embedded.manage;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.RealUserFacingLogger_Factory;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_IoContextFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideDurationProviderFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideUiContextFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder_Factory;
import com.stripe.android.paymentelement.embedded.manage.ManageComponent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class DaggerManageComponent {
    private DaggerManageComponent() {
    }

    public static ManageComponent.Factory factory() {
        return new Factory();
    }

    private static final class Factory implements ManageComponent.Factory {
        private Factory() {
        }

        @Override // com.stripe.android.paymentelement.embedded.manage.ManageComponent.Factory
        public ManageComponent build(SavedStateHandle savedStateHandle, PaymentMethodMetadata paymentMethodMetadata, Context context, String str) {
            Preconditions.checkNotNull(savedStateHandle);
            Preconditions.checkNotNull(paymentMethodMetadata);
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(str);
            return new ManageComponentImpl(new CoreCommonModule(), savedStateHandle, paymentMethodMetadata, context, str);
        }
    }

    private static final class ManageComponentImpl implements ManageComponent {
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<Context> contextProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultEmbeddedManageScreenInteractorFactory> defaultEmbeddedManageScreenInteractorFactoryProvider;
        private Provider<DefaultEmbeddedUpdateScreenInteractorFactory> defaultEmbeddedUpdateScreenInteractorFactoryProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<EmbeddedSelectionHolder> embeddedSelectionHolderProvider;
        private Provider<InitialManageScreenFactory> initialManageScreenFactoryProvider;
        private final ManageComponentImpl manageComponentImpl;
        private Provider<ManageSavedPaymentMethodMutatorFactory> manageSavedPaymentMethodMutatorFactoryProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
        private Provider<CustomerStateHolder> provideCustomerStateHolderProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<ManageNavigator> provideManageNavigatorProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<StateFlow<PaymentMethodMetadata>> providePaymentMethodMetadataProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<SavedPaymentMethodMutator> provideSavedPaymentMethodMutatorProvider;
        private Provider<CoroutineContext> provideUiContextProvider;
        private Provider<CoroutineScope> provideViewModelScopeProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;

        private ManageComponentImpl(CoreCommonModule coreCommonModule, SavedStateHandle savedStateHandle, PaymentMethodMetadata paymentMethodMetadata, Context context, String str) {
            this.manageComponentImpl = this;
            initialize(coreCommonModule, savedStateHandle, paymentMethodMetadata, context, str);
            initialize2(coreCommonModule, savedStateHandle, paymentMethodMetadata, context, str);
        }

        private void initialize(CoreCommonModule coreCommonModule, SavedStateHandle savedStateHandle, PaymentMethodMetadata paymentMethodMetadata, Context context, String str) {
            this.provideViewModelScopeProvider = DoubleCheck.provider((Provider) ManageModule_Companion_ProvideViewModelScopeFactory.create());
            dagger.internal.Factory factoryCreate = InstanceFactory.create(savedStateHandle);
            this.savedStateHandleProvider = factoryCreate;
            this.embeddedSelectionHolderProvider = DoubleCheck.provider((Provider) EmbeddedSelectionHolder_Factory.create((Provider<SavedStateHandle>) factoryCreate));
            dagger.internal.Factory factoryCreate2 = InstanceFactory.create(paymentMethodMetadata);
            this.paymentMethodMetadataProvider = factoryCreate2;
            ManageModule_Companion_ProvidePaymentMethodMetadataFactory manageModule_Companion_ProvidePaymentMethodMetadataFactoryCreate = ManageModule_Companion_ProvidePaymentMethodMetadataFactory.create((Provider<PaymentMethodMetadata>) factoryCreate2);
            this.providePaymentMethodMetadataProvider = manageModule_Companion_ProvidePaymentMethodMetadataFactoryCreate;
            this.provideCustomerStateHolderProvider = DoubleCheck.provider((Provider) EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory.create(this.savedStateHandleProvider, this.embeddedSelectionHolderProvider, (Provider<StateFlow<PaymentMethodMetadata>>) manageModule_Companion_ProvidePaymentMethodMetadataFactoryCreate));
            this.contextProvider = InstanceFactory.create(context);
            Provider<Logger> provider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory.create()));
            this.provideLoggerProvider = provider;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.contextProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLoggerProvider);
            EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory.create(this.contextProvider);
            this.providePaymentConfigurationProvider = embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate = EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.providePublishableKeyProvider = embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, (Provider<Function0<String>>) embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate, (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create());
            dagger.internal.Factory factoryCreate3 = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate3;
            this.providesAnalyticEventCallbackProvider = EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create((Provider<String>) factoryCreate3);
            this.realUserFacingLoggerProvider = RealUserFacingLogger_Factory.create(this.contextProvider);
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create(this.contextProvider, (Provider<EventReporter.Mode>) EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory.create(), (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<DurationProvider>) EmbeddedCommonModule_Companion_ProvideDurationProviderFactory.create(), this.providesAnalyticEventCallbackProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.providePublishableKeyProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create(), this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create()));
            this.provideManageNavigatorProvider = new DelegateFactory();
            this.provideUiContextProvider = DoubleCheck.provider((Provider) EmbeddedCommonModule_Companion_ProvideUiContextFactory.create());
            this.defaultEmbeddedUpdateScreenInteractorFactoryProvider = new DelegateFactory();
            this.manageSavedPaymentMethodMutatorFactoryProvider = ManageSavedPaymentMethodMutatorFactory_Factory.create(this.bindsEventReporterProvider, (Provider<CustomerRepository>) this.customerApiRepositoryProvider, this.embeddedSelectionHolderProvider, this.provideCustomerStateHolderProvider, this.provideManageNavigatorProvider, this.paymentMethodMetadataProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideUiContextProvider, this.provideViewModelScopeProvider, (Provider<EmbeddedUpdateScreenInteractorFactory>) this.defaultEmbeddedUpdateScreenInteractorFactoryProvider);
        }

        private void initialize2(CoreCommonModule coreCommonModule, SavedStateHandle savedStateHandle, PaymentMethodMetadata paymentMethodMetadata, Context context, String str) {
            Provider<SavedPaymentMethodMutator> provider = DoubleCheck.provider((Provider) ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory.create(this.manageSavedPaymentMethodMutatorFactoryProvider));
            this.provideSavedPaymentMethodMutatorProvider = provider;
            DelegateFactory.setDelegate((Provider) this.defaultEmbeddedUpdateScreenInteractorFactoryProvider, (Provider) DefaultEmbeddedUpdateScreenInteractorFactory_Factory.create(provider, this.paymentMethodMetadataProvider, this.provideCustomerStateHolderProvider, this.embeddedSelectionHolderProvider, this.bindsEventReporterProvider, this.provideManageNavigatorProvider));
            DefaultEmbeddedManageScreenInteractorFactory_Factory defaultEmbeddedManageScreenInteractorFactory_FactoryCreate = DefaultEmbeddedManageScreenInteractorFactory_Factory.create(this.paymentMethodMetadataProvider, this.provideCustomerStateHolderProvider, this.embeddedSelectionHolderProvider, this.provideSavedPaymentMethodMutatorProvider, this.bindsEventReporterProvider, this.provideManageNavigatorProvider);
            this.defaultEmbeddedManageScreenInteractorFactoryProvider = defaultEmbeddedManageScreenInteractorFactory_FactoryCreate;
            InitialManageScreenFactory_Factory initialManageScreenFactory_FactoryCreate = InitialManageScreenFactory_Factory.create(this.provideCustomerStateHolderProvider, this.paymentMethodMetadataProvider, (Provider<EmbeddedUpdateScreenInteractorFactory>) this.defaultEmbeddedUpdateScreenInteractorFactoryProvider, (Provider<EmbeddedManageScreenInteractorFactory>) defaultEmbeddedManageScreenInteractorFactory_FactoryCreate);
            this.initialManageScreenFactoryProvider = initialManageScreenFactory_FactoryCreate;
            DelegateFactory.setDelegate((Provider) this.provideManageNavigatorProvider, DoubleCheck.provider((Provider) ManageModule_Companion_ProvideManageNavigatorFactory.create((Provider<InitialManageScreenFactory>) initialManageScreenFactory_FactoryCreate, this.provideViewModelScopeProvider, this.bindsEventReporterProvider)));
        }

        @Override // com.stripe.android.paymentelement.embedded.manage.ManageComponent
        public ManageViewModel getViewModel() {
            return new ManageViewModel(this, this.provideViewModelScopeProvider.get());
        }

        @Override // com.stripe.android.paymentelement.embedded.manage.ManageComponent
        public CustomerStateHolder getCustomerStateHolder() {
            return this.provideCustomerStateHolderProvider.get();
        }

        @Override // com.stripe.android.paymentelement.embedded.manage.ManageComponent
        public EmbeddedSelectionHolder getSelectionHolder() {
            return this.embeddedSelectionHolderProvider.get();
        }

        @Override // com.stripe.android.paymentelement.embedded.manage.ManageComponent
        public void inject(ManageActivity manageActivity) {
            injectManageActivity(manageActivity);
        }

        private ManageActivity injectManageActivity(ManageActivity manageActivity) {
            ManageActivity_MembersInjector.injectCustomerStateHolder(manageActivity, this.provideCustomerStateHolderProvider.get());
            ManageActivity_MembersInjector.injectManageNavigator(manageActivity, this.provideManageNavigatorProvider.get());
            ManageActivity_MembersInjector.injectSelectionHolder(manageActivity, this.embeddedSelectionHolderProvider.get());
            return manageActivity;
        }
    }
}
