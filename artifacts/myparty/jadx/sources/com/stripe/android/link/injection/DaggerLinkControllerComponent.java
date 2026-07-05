package com.stripe.android.link.injection;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment;
import com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment_Factory;
import com.stripe.android.common.analytics.experiment.LogLinkHoldbackExperiment;
import com.stripe.android.common.di.ApplicationIdModule_ProvideApplicationIdFactory;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.common.di.MobileSessionIdModule_MobileSessionIdProviderFactory;
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
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;
import com.stripe.android.link.DefaultLinkConfigurationLoader;
import com.stripe.android.link.DefaultLinkConfigurationLoader_Factory;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.LinkConfigurationLoader;
import com.stripe.android.link.LinkController;
import com.stripe.android.link.LinkControllerCoordinator;
import com.stripe.android.link.LinkControllerCoordinator_Factory;
import com.stripe.android.link.LinkControllerInteractor;
import com.stripe.android.link.LinkControllerInteractor_Factory;
import com.stripe.android.link.LinkController_Factory;
import com.stripe.android.link.NativeLinkActivityContract;
import com.stripe.android.link.NativeLinkActivityContract_Factory;
import com.stripe.android.link.RealLinkConfigurationCoordinator;
import com.stripe.android.link.RealLinkConfigurationCoordinator_Factory;
import com.stripe.android.link.account.DefaultLinkAccountManager;
import com.stripe.android.link.account.DefaultLinkAccountManager_Factory;
import com.stripe.android.link.account.DefaultLinkAuth;
import com.stripe.android.link.account.DefaultLinkAuth_Factory;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.account.LinkStore_Factory;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter_Factory;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck_Factory;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.gate.C1038DefaultLinkGate_Factory;
import com.stripe.android.link.gate.DefaultLinkGate;
import com.stripe.android.link.gate.DefaultLinkGate_Factory_Factory;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.injection.LinkControllerComponent;
import com.stripe.android.link.injection.LinkControllerPresenterComponent;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkApiRepository_Factory;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.inline.C1043InlineSignupViewModel_Factory;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.lpmfoundations.luxe.LpmRepository_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.confirmation.cvc.CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository_Factory;
import com.stripe.android.paymentsheet.state.DefaultLinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.DefaultLinkAccountStatusProvider_Factory;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader_Factory;
import com.stripe.android.paymentsheet.state.DefaultRetrieveCustomerEmail;
import com.stripe.android.paymentsheet.state.DefaultRetrieveCustomerEmail_Factory;
import com.stripe.android.paymentsheet.state.LinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.RetrieveCustomerEmail;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository_Factory;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class DaggerLinkControllerComponent {
    private DaggerLinkControllerComponent() {
    }

    public static LinkControllerComponent.Factory factory() {
        return new Factory();
    }

    private static final class Factory implements LinkControllerComponent.Factory {
        private Factory() {
        }

        @Override // com.stripe.android.link.injection.LinkControllerComponent.Factory
        public LinkControllerComponent build(Application application, SavedStateHandle savedStateHandle, String str) {
            Preconditions.checkNotNull(application);
            Preconditions.checkNotNull(savedStateHandle);
            Preconditions.checkNotNull(str);
            return new LinkControllerComponentImpl(new GooglePayLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), new MobileSessionIdModule(), new LinkHoldbackExposureModule(), application, savedStateHandle, str);
        }
    }

    private static final class LinkComponentBuilder implements LinkComponent.Builder {
        private LinkConfiguration configuration;
        private final LinkControllerComponentImpl linkControllerComponentImpl;

        private LinkComponentBuilder(LinkControllerComponentImpl linkControllerComponentImpl) {
            this.linkControllerComponentImpl = linkControllerComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            return new LinkComponentImpl(this.linkControllerComponentImpl, this.configuration);
        }
    }

    private static final class LinkControllerPresenterComponentFactory implements LinkControllerPresenterComponent.Factory {
        private final LinkControllerComponentImpl linkControllerComponentImpl;

        private LinkControllerPresenterComponentFactory(LinkControllerComponentImpl linkControllerComponentImpl) {
            this.linkControllerComponentImpl = linkControllerComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkControllerPresenterComponent.Factory
        public LinkControllerPresenterComponent build(Activity activity, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback, LinkController.AuthenticationCallback authenticationCallback) {
            Preconditions.checkNotNull(activity);
            Preconditions.checkNotNull(lifecycleOwner);
            Preconditions.checkNotNull(activityResultRegistryOwner);
            Preconditions.checkNotNull(presentPaymentMethodsCallback);
            Preconditions.checkNotNull(authenticationCallback);
            return new LinkControllerPresenterComponentImpl(this.linkControllerComponentImpl, activity, lifecycleOwner, activityResultRegistryOwner, presentPaymentMethodsCallback, authenticationCallback);
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
        private final LinkControllerComponentImpl linkControllerComponentImpl;
        private Provider<LinkInlineSignupAssistedViewModelFactory> linkInlineSignupAssistedViewModelFactoryProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;

        private LinkComponentImpl(LinkControllerComponentImpl linkControllerComponentImpl, LinkConfiguration linkConfiguration) {
            this.linkComponentImpl = this;
            this.linkControllerComponentImpl = linkControllerComponentImpl;
            this.configuration = linkConfiguration;
            initialize(linkConfiguration);
        }

        private void initialize(LinkConfiguration linkConfiguration) {
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            DefaultLinkAccountManager_Factory defaultLinkAccountManager_FactoryCreate = DefaultLinkAccountManager_Factory.create((Provider<LinkAccountHolder>) this.linkControllerComponentImpl.providesLinkAccountHolderProvider, this.configurationProvider, (Provider<LinkRepository>) this.linkControllerComponentImpl.bindLinkRepositoryProvider, (Provider<LinkEventsReporter>) this.linkControllerComponentImpl.bindLinkEventsReporterProvider, (Provider<ErrorReporter>) this.linkControllerComponentImpl.realErrorReporterProvider);
            this.defaultLinkAccountManagerProvider = defaultLinkAccountManager_FactoryCreate;
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) defaultLinkAccountManager_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create((Provider<Application>) this.linkControllerComponentImpl.applicationProvider));
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create((Provider<Application>) this.linkControllerComponentImpl.applicationProvider);
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, (Provider<ErrorReporter>) this.linkControllerComponentImpl.realErrorReporterProvider, this.provideApplicationIdProvider);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            Provider<LinkAuth> provider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.bindsLinkAuthProvider = provider;
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, provider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, (Provider<ErrorReporter>) this.linkControllerComponentImpl.realErrorReporterProvider, (Provider<CoroutineContext>) this.linkControllerComponentImpl.provideWorkContextProvider);
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_FactoryCreate = C1043InlineSignupViewModel_Factory.create(this.configurationProvider, this.bindLinkAccountManagerProvider, (Provider<LinkEventsReporter>) this.linkControllerComponentImpl.bindLinkEventsReporterProvider, (Provider<Logger>) this.linkControllerComponentImpl.provideLoggerProvider);
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

    private static final class LinkControllerPresenterComponentImpl implements LinkControllerPresenterComponent {
        private Provider<ActivityResultRegistryOwner> activityResultRegistryOwnerProvider;
        private Provider<LinkController.AuthenticationCallback> authenticationCallbackProvider;
        private Provider<LifecycleOwner> lifecycleOwnerProvider;
        private final LinkControllerComponentImpl linkControllerComponentImpl;
        private Provider<LinkControllerCoordinator> linkControllerCoordinatorProvider;
        private final LinkControllerPresenterComponentImpl linkControllerPresenterComponentImpl;
        private Provider<NativeLinkActivityContract> nativeLinkActivityContractProvider;
        private Provider<LinkController.PresentPaymentMethodsCallback> presentPaymentMethodsCallbackProvider;

        private LinkControllerPresenterComponentImpl(LinkControllerComponentImpl linkControllerComponentImpl, Activity activity, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback, LinkController.AuthenticationCallback authenticationCallback) {
            this.linkControllerPresenterComponentImpl = this;
            this.linkControllerComponentImpl = linkControllerComponentImpl;
            initialize(activity, lifecycleOwner, activityResultRegistryOwner, presentPaymentMethodsCallback, authenticationCallback);
        }

        private void initialize(Activity activity, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback, LinkController.AuthenticationCallback authenticationCallback) {
            this.lifecycleOwnerProvider = InstanceFactory.create(lifecycleOwner);
            this.activityResultRegistryOwnerProvider = InstanceFactory.create(activityResultRegistryOwner);
            this.nativeLinkActivityContractProvider = NativeLinkActivityContract_Factory.create((Provider<String>) this.linkControllerComponentImpl.paymentElementCallbackIdentifierProvider);
            this.presentPaymentMethodsCallbackProvider = InstanceFactory.create(presentPaymentMethodsCallback);
            this.authenticationCallbackProvider = InstanceFactory.create(authenticationCallback);
            this.linkControllerCoordinatorProvider = DoubleCheck.provider((Provider) LinkControllerCoordinator_Factory.create((Provider<LinkControllerInteractor>) this.linkControllerComponentImpl.linkControllerInteractorProvider, this.lifecycleOwnerProvider, this.activityResultRegistryOwnerProvider, this.nativeLinkActivityContractProvider, this.presentPaymentMethodsCallbackProvider, this.authenticationCallbackProvider));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.link.injection.LinkControllerPresenterComponent
        public LinkController.Presenter getPresenter() {
            return new LinkController.Presenter(this.linkControllerCoordinatorProvider.get(), (LinkControllerInteractor) this.linkControllerComponentImpl.linkControllerInteractorProvider.get());
        }
    }

    private static final class LinkControllerComponentImpl implements LinkControllerComponent {
        private Provider<Application> applicationProvider;
        private Provider<LinkConfigurationLoader> bindLinkConfigurationLoaderProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultLinkAccountStatusProvider> defaultLinkAccountStatusProvider;
        private Provider<DefaultLinkConfigurationLoader> defaultLinkConfigurationLoaderProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<DefaultLogLinkHoldbackExperiment> defaultLogLinkHoldbackExperimentProvider;
        private Provider<DefaultPaymentElementLoader> defaultPaymentElementLoaderProvider;
        private Provider<DefaultRetrieveCustomerEmail> defaultRetrieveCustomerEmailProvider;
        private Provider<ExternalPaymentMethodsRepository> externalPaymentMethodsRepositoryProvider;
        private Provider<LinkApiRepository> linkApiRepositoryProvider;
        private Provider<LinkComponent.Builder> linkComponentBuilderProvider;
        private final LinkControllerComponentImpl linkControllerComponentImpl;
        private Provider<LinkControllerInteractor> linkControllerInteractorProvider;
        private Provider<LinkControllerPresenterComponent.Factory> linkControllerPresenterComponentFactoryProvider;
        private Provider<LinkController> linkControllerProvider;
        private Provider<LinkStore> linkStoreProvider;
        private Provider<String> mobileSessionIdProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private Provider<Context> provideAppContextProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<DurationProvider> provideDurationProvider;
        private Provider<Boolean> provideEnabledLoggingProvider;
        private Provider<EventReporter.Mode> provideEventReporterModeProvider;
        private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
        private Provider<Locale> provideLocaleProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
        private Provider<Set<String>> provideProductUsageTokensProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<Function0<String>> provideStripeAccountIdProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<LinkAccountHolder> providesLinkAccountHolderProvider;
        private Provider<LinkRepository> providesLinkRepositoryProvider;
        private Provider<LogLinkHoldbackExperiment> providesLogLinkGlobalHoldbackExposureProvider;
        private Provider<RealElementsSessionRepository> realElementsSessionRepositoryProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealLinkConfigurationCoordinator> realLinkConfigurationCoordinatorProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;

        private LinkControllerComponentImpl(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            this.linkControllerComponentImpl = this;
            initialize(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, application, savedStateHandle, str);
            initialize2(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, application, savedStateHandle, str);
        }

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            Provider<Boolean> provider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = provider;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, provider));
            dagger.internal.Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            this.provideAppContextProvider = DoubleCheck.provider((Provider) LinkControllerModule_Companion_ProvideAppContextFactory.create((Provider<Application>) factoryCreate));
            Provider<CoroutineContext> provider2 = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = provider2;
            this.providePrefsRepositoryFactoryProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory.create(this.provideAppContextProvider, provider2));
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
            PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(this.provideAppContextProvider);
            this.providePaymentConfigurationProvider = paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            Provider<Set<String>> provider3 = DoubleCheck.provider((Provider) LinkControllerModule_Companion_ProvideProductUsageTokensFactory.create());
            this.provideProductUsageTokensProvider = provider3;
            PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_FactoryCreate = PaymentAnalyticsRequestFactory_Factory.create(this.provideAppContextProvider, this.providePublishableKeyProvider, provider3);
            this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactory_FactoryCreate;
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) paymentAnalyticsRequestFactory_FactoryCreate);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            this.provideGooglePayRepositoryFactoryProvider = GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.provideAppContextProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate);
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.provideAppContextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.mobileSessionIdProvider = MobileSessionIdModule_MobileSessionIdProviderFactory.create(mobileSessionIdModule);
            ApplicationIdModule_ProvideApplicationIdFactory applicationIdModule_ProvideApplicationIdFactoryCreate = ApplicationIdModule_ProvideApplicationIdFactory.create(this.applicationProvider);
            this.provideApplicationIdProvider = applicationIdModule_ProvideApplicationIdFactoryCreate;
            this.realElementsSessionRepositoryProvider = RealElementsSessionRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideWorkContextProvider, this.mobileSessionIdProvider, (Provider<String>) applicationIdModule_ProvideApplicationIdFactoryCreate);
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
            this.provideEventReporterModeProvider = DoubleCheck.provider((Provider) LinkControllerModule_Companion_ProvideEventReporterModeFactory.create());
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.provideAppContextProvider, this.provideWorkContextProvider, this.provideLoggerProvider);
            this.provideDurationProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory.create());
            dagger.internal.Factory factoryCreate2 = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate2;
            this.providesAnalyticEventCallbackProvider = PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create((Provider<String>) factoryCreate2);
            this.realUserFacingLoggerProvider = RealUserFacingLogger_Factory.create(this.provideAppContextProvider);
            this.defaultEventReporterProvider = DefaultEventReporter_Factory.create(this.provideAppContextProvider, this.provideEventReporterModeProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideDurationProvider, this.providesAnalyticEventCallbackProvider, this.provideWorkContextProvider, (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
        }

        private void initialize2(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) this.defaultEventReporterProvider);
            this.defaultRetrieveCustomerEmailProvider = DefaultRetrieveCustomerEmail_Factory.create((Provider<CustomerRepository>) this.customerApiRepositoryProvider);
            Provider<LinkComponent.Builder> provider = new Provider<LinkComponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkControllerComponent.LinkControllerComponentImpl.1
                @Override // javax.inject.Provider
                public LinkComponent.Builder get() {
                    return new LinkComponentBuilder(LinkControllerComponentImpl.this.linkControllerComponentImpl);
                }
            };
            this.linkComponentBuilderProvider = provider;
            Provider<RealLinkConfigurationCoordinator> provider2 = DoubleCheck.provider((Provider) RealLinkConfigurationCoordinator_Factory.create(provider));
            this.realLinkConfigurationCoordinatorProvider = provider2;
            this.defaultLinkAccountStatusProvider = DefaultLinkAccountStatusProvider_Factory.create((Provider<LinkConfigurationCoordinator>) provider2);
            this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            Provider<Locale> provider3 = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            this.provideLocaleProvider = provider3;
            LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate = LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory.create(linkHoldbackExposureModule, this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.provideWorkContextProvider, this.provideLoggerProvider, provider3, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.providesLinkRepositoryProvider = linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate;
            DefaultLogLinkHoldbackExperiment_Factory defaultLogLinkHoldbackExperiment_FactoryCreate = DefaultLogLinkHoldbackExperiment_Factory.create(this.bindsEventReporterProvider, (Provider<LinkRepository>) linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate, this.provideWorkContextProvider, (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, this.provideEventReporterModeProvider, this.provideLoggerProvider);
            this.defaultLogLinkHoldbackExperimentProvider = defaultLogLinkHoldbackExperiment_FactoryCreate;
            this.providesLogLinkGlobalHoldbackExposureProvider = LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory.create(linkHoldbackExposureModule, (Provider<DefaultLogLinkHoldbackExperiment>) defaultLogLinkHoldbackExperiment_FactoryCreate);
            this.linkStoreProvider = DoubleCheck.provider((Provider) LinkStore_Factory.create(this.provideAppContextProvider));
            this.externalPaymentMethodsRepositoryProvider = ExternalPaymentMethodsRepository_Factory.create((Provider<ErrorReporter>) this.realErrorReporterProvider);
            Provider<DefaultPaymentElementLoader> provider4 = DoubleCheck.provider((Provider) DefaultPaymentElementLoader_Factory.create(this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, (Provider<ElementsSessionRepository>) this.realElementsSessionRepositoryProvider, (Provider<CustomerRepository>) this.customerApiRepositoryProvider, (Provider<LpmRepository>) LpmRepository_Factory.create(), this.provideLoggerProvider, this.bindsEventReporterProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkAccountStatusProvider>) this.defaultLinkAccountStatusProvider, this.providesLogLinkGlobalHoldbackExposureProvider, this.linkStoreProvider, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create(), this.externalPaymentMethodsRepositoryProvider, (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider, (Provider<CvcRecollectionHandler>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory.create()));
            this.defaultPaymentElementLoaderProvider = provider4;
            DefaultLinkConfigurationLoader_Factory defaultLinkConfigurationLoader_FactoryCreate = DefaultLinkConfigurationLoader_Factory.create(this.provideLoggerProvider, (Provider<PaymentElementLoader>) provider4, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create());
            this.defaultLinkConfigurationLoaderProvider = defaultLinkConfigurationLoader_FactoryCreate;
            this.bindLinkConfigurationLoaderProvider = DoubleCheck.provider((Provider) defaultLinkConfigurationLoader_FactoryCreate);
            dagger.internal.Factory factoryCreate = InstanceFactory.create(savedStateHandle);
            this.savedStateHandleProvider = factoryCreate;
            Provider<LinkAccountHolder> provider5 = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory.create((Provider<SavedStateHandle>) factoryCreate));
            this.providesLinkAccountHolderProvider = provider5;
            this.linkControllerInteractorProvider = DoubleCheck.provider((Provider) LinkControllerInteractor_Factory.create(this.provideLoggerProvider, this.bindLinkConfigurationLoaderProvider, provider5, this.linkComponentBuilderProvider));
            Provider<LinkControllerPresenterComponent.Factory> provider6 = new Provider<LinkControllerPresenterComponent.Factory>() { // from class: com.stripe.android.link.injection.DaggerLinkControllerComponent.LinkControllerComponentImpl.2
                @Override // javax.inject.Provider
                public LinkControllerPresenterComponent.Factory get() {
                    return new LinkControllerPresenterComponentFactory(LinkControllerComponentImpl.this.linkControllerComponentImpl);
                }
            };
            this.linkControllerPresenterComponentFactoryProvider = provider6;
            this.linkControllerProvider = DoubleCheck.provider((Provider) LinkController_Factory.create(this.linkControllerInteractorProvider, provider6));
            Provider<ConsumersApiService> provider7 = DoubleCheck.provider((Provider) LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, this.provideWorkContextProvider));
            this.provideConsumersApiServiceProvider = provider7;
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, provider7, this.provideWorkContextProvider, this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideLoggerProvider, this.provideDurationProvider);
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            this.bindLinkEventsReporterProvider = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkControllerComponent
        public LinkController getLinkController() {
            return this.linkControllerProvider.get();
        }
    }
}
