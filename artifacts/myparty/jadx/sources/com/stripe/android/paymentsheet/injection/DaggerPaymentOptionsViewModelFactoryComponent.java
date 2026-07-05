package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.common.di.ApplicationIdModule_ProvideApplicationIdFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLocaleFactory;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.RealUserFacingLogger_Factory;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityContract_Factory;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentLauncher_Factory;
import com.stripe.android.link.NativeLinkActivityContract;
import com.stripe.android.link.NativeLinkActivityContract_Factory;
import com.stripe.android.link.RealLinkConfigurationCoordinator;
import com.stripe.android.link.RealLinkConfigurationCoordinator_Factory;
import com.stripe.android.link.WebLinkActivityContract;
import com.stripe.android.link.WebLinkActivityContract_Factory;
import com.stripe.android.link.account.DefaultLinkAccountManager;
import com.stripe.android.link.account.DefaultLinkAccountManager_Factory;
import com.stripe.android.link.account.DefaultLinkAuth;
import com.stripe.android.link.account.DefaultLinkAuth_Factory;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.account.LinkStore_Factory;
import com.stripe.android.link.analytics.DefaultLinkAnalyticsHelper;
import com.stripe.android.link.analytics.DefaultLinkAnalyticsHelper_Factory;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter_Factory;
import com.stripe.android.link.analytics.LinkAnalyticsHelper;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck_Factory;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.gate.C1038DefaultLinkGate_Factory;
import com.stripe.android.link.gate.DefaultLinkGate;
import com.stripe.android.link.gate.DefaultLinkGate_Factory_Factory;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.link.injection.LinkCommonModule_Companion_ProvideConsumersApiServiceFactory;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.injection.LinkInlineSignupAssistedViewModelFactory;
import com.stripe.android.link.injection.LinkInlineSignupAssistedViewModelFactory_Impl;
import com.stripe.android.link.injection.LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkApiRepository_Factory;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.inline.C1043InlineSignupViewModel_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.LinkHandler_Factory;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DaggerPaymentOptionsViewModelFactoryComponent {
    private DaggerPaymentOptionsViewModelFactoryComponent() {
    }

    public static PaymentOptionsViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements PaymentOptionsViewModelFactoryComponent.Builder {
        private Application application;
        private Context context;
        private String paymentElementCallbackIdentifier;
        private Set<String> productUsage;
        private SavedStateHandle savedStateHandle;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentOptionsViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder paymentElementCallbackIdentifier(String str) {
            this.paymentElementCallbackIdentifier = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public PaymentOptionsViewModelFactoryComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            Preconditions.checkBuilderRequirement(this.paymentElementCallbackIdentifier, String.class);
            return new PaymentOptionsViewModelFactoryComponentImpl(new PaymentOptionsViewModelModule(), new CoroutineContextModule(), new CoreCommonModule(), this.context, this.application, this.savedStateHandle, this.productUsage, this.paymentElementCallbackIdentifier);
        }
    }

    private static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
        private Application application;
        private PaymentOptionContract.Args args;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;

        private PaymentOptionsViewModelSubcomponentBuilder(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl) {
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder args(PaymentOptionContract.Args args) {
            this.args = (PaymentOptionContract.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.args, PaymentOptionContract.Args.class);
            return new PaymentOptionsViewModelSubcomponentImpl(this.paymentOptionsViewModelFactoryComponentImpl, this.application, this.args);
        }
    }

    private static final class LinkAnalyticsComponentBuilder implements LinkAnalyticsComponent.Builder {
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;

        private LinkAnalyticsComponentBuilder(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl) {
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent.Builder
        public LinkAnalyticsComponent build() {
            return new LinkAnalyticsComponentImpl(this.paymentOptionsViewModelFactoryComponentImpl);
        }
    }

    private static final class LinkComponentBuilder implements LinkComponent.Builder {
        private LinkConfiguration configuration;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;

        private LinkComponentBuilder(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl) {
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            return new LinkComponentImpl(this.paymentOptionsViewModelFactoryComponentImpl, this.configuration);
        }
    }

    private static final class PaymentOptionsViewModelSubcomponentImpl implements PaymentOptionsViewModelSubcomponent {
        private final PaymentOptionContract.Args args;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl;

        private PaymentOptionsViewModelSubcomponentImpl(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl, Application application, PaymentOptionContract.Args args) {
            this.paymentOptionsViewModelSubcomponentImpl = this;
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
            this.args = args;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent
        public PaymentOptionsViewModel getViewModel() {
            return new PaymentOptionsViewModel(this.args, (LinkAccountHolder) this.paymentOptionsViewModelFactoryComponentImpl.providesLinkAccountHolderProvider.get(), new DefaultLinkGate.Factory(), (LinkPaymentLauncher) this.paymentOptionsViewModelFactoryComponentImpl.linkPaymentLauncherProvider.get(), (EventReporter) this.paymentOptionsViewModelFactoryComponentImpl.bindsEventReporterProvider.get(), (CustomerRepository) this.paymentOptionsViewModelFactoryComponentImpl.customerApiRepositoryProvider.get(), (CoroutineContext) this.paymentOptionsViewModelFactoryComponentImpl.provideWorkContextProvider.get(), this.paymentOptionsViewModelFactoryComponentImpl.savedStateHandle, (LinkHandler) this.paymentOptionsViewModelFactoryComponentImpl.linkHandlerProvider.get(), this.paymentOptionsViewModelFactoryComponentImpl.defaultCardAccountRangeRepositoryFactory());
        }
    }

    private static final class LinkAnalyticsComponentImpl implements LinkAnalyticsComponent {
        private Provider<LinkAnalyticsHelper> bindLinkAnalyticsHelperProvider;
        private Provider<DefaultLinkAnalyticsHelper> defaultLinkAnalyticsHelperProvider;
        private final LinkAnalyticsComponentImpl linkAnalyticsComponentImpl;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;

        private LinkAnalyticsComponentImpl(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl) {
            this.linkAnalyticsComponentImpl = this;
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
            initialize();
        }

        private void initialize() {
            DefaultLinkAnalyticsHelper_Factory defaultLinkAnalyticsHelper_FactoryCreate = DefaultLinkAnalyticsHelper_Factory.create((Provider<LinkEventsReporter>) this.paymentOptionsViewModelFactoryComponentImpl.bindLinkEventsReporterProvider);
            this.defaultLinkAnalyticsHelperProvider = defaultLinkAnalyticsHelper_FactoryCreate;
            this.bindLinkAnalyticsHelperProvider = DoubleCheck.provider((Provider) defaultLinkAnalyticsHelper_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent
        public LinkAnalyticsHelper getLinkAnalyticsHelper() {
            return this.bindLinkAnalyticsHelperProvider.get();
        }
    }

    private static final class LinkComponentImpl extends LinkComponent {
        private Provider<LinkAccountManager> bindLinkAccountManagerProvider;
        private Provider<LinkAttestationCheck> bindsLinkAttestationCheckProvider;
        private Provider<LinkAuth> bindsLinkAuthProvider;
        private Provider<LinkGate> bindsLinkGateProvider;
        private final LinkConfiguration configuration;
        private Provider<LinkConfiguration> configurationProvider;
        private Provider<DefaultLinkAccountManager> defaultLinkAccountManagerProvider;
        private Provider<DefaultLinkAttestationCheck> defaultLinkAttestationCheckProvider;
        private Provider<DefaultLinkAuth> defaultLinkAuthProvider;
        private Provider<DefaultLinkGate> defaultLinkGateProvider;
        private C1043InlineSignupViewModel_Factory inlineSignupViewModelProvider;
        private final LinkComponentImpl linkComponentImpl;
        private Provider<LinkInlineSignupAssistedViewModelFactory> linkInlineSignupAssistedViewModelFactoryProvider;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private Provider<String> provideApplicationIdProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;

        private LinkComponentImpl(PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl, LinkConfiguration linkConfiguration) {
            this.linkComponentImpl = this;
            this.paymentOptionsViewModelFactoryComponentImpl = paymentOptionsViewModelFactoryComponentImpl;
            this.configuration = linkConfiguration;
            initialize(linkConfiguration);
        }

        private void initialize(LinkConfiguration linkConfiguration) {
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            DefaultLinkAccountManager_Factory defaultLinkAccountManager_FactoryCreate = DefaultLinkAccountManager_Factory.create((Provider<LinkAccountHolder>) this.paymentOptionsViewModelFactoryComponentImpl.providesLinkAccountHolderProvider, this.configurationProvider, (Provider<LinkRepository>) this.paymentOptionsViewModelFactoryComponentImpl.bindLinkRepositoryProvider, (Provider<LinkEventsReporter>) this.paymentOptionsViewModelFactoryComponentImpl.bindLinkEventsReporterProvider, (Provider<ErrorReporter>) this.paymentOptionsViewModelFactoryComponentImpl.realErrorReporterProvider);
            this.defaultLinkAccountManagerProvider = defaultLinkAccountManager_FactoryCreate;
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) defaultLinkAccountManager_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create((Provider<Application>) this.paymentOptionsViewModelFactoryComponentImpl.applicationProvider));
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create((Provider<Application>) this.paymentOptionsViewModelFactoryComponentImpl.applicationProvider);
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, (Provider<ErrorReporter>) this.paymentOptionsViewModelFactoryComponentImpl.realErrorReporterProvider, this.provideApplicationIdProvider);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            Provider<LinkAuth> provider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.bindsLinkAuthProvider = provider;
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, provider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, (Provider<ErrorReporter>) this.paymentOptionsViewModelFactoryComponentImpl.realErrorReporterProvider, (Provider<CoroutineContext>) this.paymentOptionsViewModelFactoryComponentImpl.provideWorkContextProvider);
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_FactoryCreate = C1043InlineSignupViewModel_Factory.create(this.configurationProvider, this.bindLinkAccountManagerProvider, (Provider<LinkEventsReporter>) this.paymentOptionsViewModelFactoryComponentImpl.bindLinkEventsReporterProvider, (Provider<Logger>) this.paymentOptionsViewModelFactoryComponentImpl.provideLoggerProvider);
            this.inlineSignupViewModelProvider = c1043InlineSignupViewModel_FactoryCreate;
            this.linkInlineSignupAssistedViewModelFactoryProvider = LinkInlineSignupAssistedViewModelFactory_Impl.createFactoryProvider(c1043InlineSignupViewModel_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public LinkAccountManager getLinkAccountManager$paymentsheet_release() {
            return this.bindLinkAccountManagerProvider.get();
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public LinkConfiguration getConfiguration$paymentsheet_release() {
            return this.configuration;
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public LinkGate getLinkGate$paymentsheet_release() {
            return this.bindsLinkGateProvider.get();
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public LinkAttestationCheck getLinkAttestationCheck$paymentsheet_release() {
            return this.bindsLinkAttestationCheckProvider.get();
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public LinkInlineSignupAssistedViewModelFactory getInlineSignupViewModelFactory$paymentsheet_release() {
            return this.linkInlineSignupAssistedViewModelFactoryProvider.get();
        }

        @Override // com.stripe.android.link.injection.LinkComponent
        public LinkAuth getLinkAuth$paymentsheet_release() {
            return this.bindsLinkAuthProvider.get();
        }
    }

    private static final class PaymentOptionsViewModelFactoryComponentImpl implements PaymentOptionsViewModelFactoryComponent {
        private Provider<Application> applicationProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<LinkActivityContract> linkActivityContractProvider;
        private Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
        private Provider<LinkApiRepository> linkApiRepositoryProvider;
        private Provider<LinkComponent.Builder> linkComponentBuilderProvider;
        private Provider<LinkHandler> linkHandlerProvider;
        private Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Provider<LinkStore> linkStoreProvider;
        private Provider<NativeLinkActivityContract> nativeLinkActivityContractProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private final PaymentOptionsViewModelFactoryComponentImpl paymentOptionsViewModelFactoryComponentImpl;
        private final Set<String> productUsage;
        private Provider<Set<String>> productUsageProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<DurationProvider> provideDurationProvider;
        private Provider<Boolean> provideEnabledLoggingProvider;
        private Provider<EventReporter.Mode> provideEventReporterModeProvider;
        private Provider<Locale> provideLocaleProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<Function0<String>> provideStripeAccountIdProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<LinkAccountHolder> providesLinkAccountHolderProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealLinkConfigurationCoordinator> realLinkConfigurationCoordinatorProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private final SavedStateHandle savedStateHandle;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<WebLinkActivityContract> webLinkActivityContractProvider;

        private PaymentOptionsViewModelFactoryComponentImpl(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Application application, SavedStateHandle savedStateHandle, Set<String> set, String str) {
            this.paymentOptionsViewModelFactoryComponentImpl = this;
            this.savedStateHandle = savedStateHandle;
            this.context = context;
            this.productUsage = set;
            initialize(paymentOptionsViewModelModule, coroutineContextModule, coreCommonModule, context, application, savedStateHandle, set, str);
            initialize2(paymentOptionsViewModelModule, coroutineContextModule, coreCommonModule, context, application, savedStateHandle, set, str);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory() {
            return new DefaultCardAccountRangeRepositoryFactory(this.context, this.productUsage, defaultAnalyticsRequestExecutor());
        }

        private void initialize(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Application application, SavedStateHandle savedStateHandle, Set<String> set, String str) {
            Factory factoryCreate = InstanceFactory.create(savedStateHandle);
            this.savedStateHandleProvider = factoryCreate;
            this.providesLinkAccountHolderProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory.create((Provider<SavedStateHandle>) factoryCreate));
            this.linkAnalyticsComponentBuilderProvider = new Provider<LinkAnalyticsComponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent.PaymentOptionsViewModelFactoryComponentImpl.1
                @Override // javax.inject.Provider
                public LinkAnalyticsComponent.Builder get() {
                    return new LinkAnalyticsComponentBuilder(PaymentOptionsViewModelFactoryComponentImpl.this.paymentOptionsViewModelFactoryComponentImpl);
                }
            };
            Factory factoryCreate2 = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate2;
            this.nativeLinkActivityContractProvider = NativeLinkActivityContract_Factory.create((Provider<String>) factoryCreate2);
            Factory factoryCreate3 = InstanceFactory.create(context);
            this.contextProvider = factoryCreate3;
            PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) factoryCreate3);
            this.providePaymentConfigurationProvider = paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Factory factoryCreate4 = InstanceFactory.create(set);
            this.productUsageProvider = factoryCreate4;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.providePublishableKeyProvider, (Provider<Set<String>>) factoryCreate4);
            Provider<Boolean> provider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = provider;
            Provider<Logger> provider2 = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, provider));
            this.provideLoggerProvider = provider2;
            DefaultAnalyticsRequestExecutor_Factory defaultAnalyticsRequestExecutor_FactoryCreate = DefaultAnalyticsRequestExecutor_Factory.create(provider2, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutor_FactoryCreate;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) defaultAnalyticsRequestExecutor_FactoryCreate, this.provideLoggerProvider);
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            WebLinkActivityContract_Factory webLinkActivityContract_FactoryCreate = WebLinkActivityContract_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate);
            this.webLinkActivityContractProvider = webLinkActivityContract_FactoryCreate;
            this.linkActivityContractProvider = LinkActivityContract_Factory.create(this.nativeLinkActivityContractProvider, (Provider<WebLinkActivityContract>) webLinkActivityContract_FactoryCreate, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create());
            Provider<LinkStore> provider3 = DoubleCheck.provider((Provider) LinkStore_Factory.create(this.contextProvider));
            this.linkStoreProvider = provider3;
            this.linkPaymentLauncherProvider = DoubleCheck.provider((Provider) LinkPaymentLauncher_Factory.create(this.linkAnalyticsComponentBuilderProvider, this.paymentElementCallbackIdentifierProvider, this.linkActivityContractProvider, provider3));
            this.provideEventReporterModeProvider = DoubleCheck.provider((Provider) PaymentOptionsViewModelModule_ProvideEventReporterModeFactory.create(paymentOptionsViewModelModule));
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.contextProvider, this.provideWorkContextProvider, this.provideLoggerProvider);
            this.provideDurationProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory.create());
            this.providesAnalyticEventCallbackProvider = PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.realUserFacingLoggerProvider = RealUserFacingLogger_Factory.create(this.contextProvider);
        }

        private void initialize2(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Context context, Application application, SavedStateHandle savedStateHandle, Set<String> set, String str) {
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create(this.contextProvider, this.provideEventReporterModeProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideDurationProvider, this.providesAnalyticEventCallbackProvider, this.provideWorkContextProvider, (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.productUsageProvider));
            Provider<LinkComponent.Builder> provider = new Provider<LinkComponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent.PaymentOptionsViewModelFactoryComponentImpl.2
                @Override // javax.inject.Provider
                public LinkComponent.Builder get() {
                    return new LinkComponentBuilder(PaymentOptionsViewModelFactoryComponentImpl.this.paymentOptionsViewModelFactoryComponentImpl);
                }
            };
            this.linkComponentBuilderProvider = provider;
            Provider<RealLinkConfigurationCoordinator> provider2 = DoubleCheck.provider((Provider) RealLinkConfigurationCoordinator_Factory.create(provider));
            this.realLinkConfigurationCoordinatorProvider = provider2;
            this.linkHandlerProvider = DoubleCheck.provider((Provider) LinkHandler_Factory.create((Provider<LinkConfigurationCoordinator>) provider2));
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideLoggerProvider, this.provideDurationProvider);
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            this.bindLinkEventsReporterProvider = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
            this.applicationProvider = InstanceFactory.create(application);
            this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            this.provideConsumersApiServiceProvider = DoubleCheck.provider((Provider) LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, this.provideWorkContextProvider));
            Provider<Locale> provider3 = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            this.provideLocaleProvider = provider3;
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.provideConsumersApiServiceProvider, this.provideWorkContextProvider, provider3, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent
        public PaymentOptionsViewModelSubcomponent.Builder getPaymentOptionsViewModelSubcomponentBuilder() {
            return new PaymentOptionsViewModelSubcomponentBuilder(this.paymentOptionsViewModelFactoryComponentImpl);
        }
    }
}
