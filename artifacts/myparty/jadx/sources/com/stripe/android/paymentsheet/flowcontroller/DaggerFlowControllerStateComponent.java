package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.activity.result.ActivityResultCaller;
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
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
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
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory_Impl;
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
import com.stripe.android.link.verification.DefaultLinkInlineInteractor;
import com.stripe.android.link.verification.DefaultLinkInlineInteractor_Factory;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.lpmfoundations.luxe.LpmRepository_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationRegistry;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler_Factory_Factory;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory;
import com.stripe.android.paymentelement.confirmation.challenge.PassiveChallengeConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.challenge.PassiveChallengeConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory;
import com.stripe.android.paymentelement.confirmation.cvc.CvcRecollectionConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.cvc.CvcRecollectionConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.cvc.CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;
import com.stripe.android.paymentelement.confirmation.cvc.CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.injection.ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;
import com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor;
import com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor_Factory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;
import com.stripe.android.paymentelement.confirmation.link.LinkConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.link.LinkConfirmationDefinition_Factory;
import com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory;
import com.stripe.android.paymentelement.confirmation.shoppay.ShopPayConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.shoppay.ShopPayConfirmationDefinition_Factory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.LinkHandler_Factory;
import com.stripe.android.paymentsheet.PaymentOptionResultCallback;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent;
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
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory_Factory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelection_IconLoader_Factory;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationLauncherFactory;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncherFactory;
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
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.shoppay.ShopPayActivityContract;
import com.stripe.android.shoppay.ShopPayActivityContract_Factory;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository_Factory;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule_ProvideResourcesFactory;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetFactory;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class DaggerFlowControllerStateComponent {
    private DaggerFlowControllerStateComponent() {
    }

    public static FlowControllerStateComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements FlowControllerStateComponent.Builder {
        private Application application;
        private FlowControllerViewModel flowControllerViewModel;
        private String paymentElementCallbackIdentifier;
        private Integer statusBarColor;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public Builder statusBarColor(Integer num) {
            this.statusBarColor = num;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public Builder paymentElementCallbackIdentifier(String str) {
            this.paymentElementCallbackIdentifier = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public Builder flowControllerViewModel(FlowControllerViewModel flowControllerViewModel) {
            this.flowControllerViewModel = (FlowControllerViewModel) Preconditions.checkNotNull(flowControllerViewModel);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent.Builder
        public FlowControllerStateComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.paymentElementCallbackIdentifier, String.class);
            Preconditions.checkBuilderRequirement(this.flowControllerViewModel, FlowControllerViewModel.class);
            return new FlowControllerStateComponentImpl(new GooglePayLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), new MobileSessionIdModule(), new LinkHoldbackExposureModule(), this.statusBarColor, this.application, this.paymentElementCallbackIdentifier, this.flowControllerViewModel);
        }
    }

    private static final class FlowControllerComponentBuilder implements FlowControllerComponent.Builder {
        private ActivityResultCaller activityResultCaller;
        private ActivityResultRegistryOwner activityResultRegistryOwner;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private Boolean initializedViaCompose;
        private LifecycleOwner lifeCycleOwner;
        private PaymentOptionResultCallback paymentOptionResultCallback;
        private PaymentSheetResultCallback paymentResultCallback;

        private FlowControllerComponentBuilder(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder lifeCycleOwner(LifecycleOwner lifecycleOwner) {
            this.lifeCycleOwner = (LifecycleOwner) Preconditions.checkNotNull(lifecycleOwner);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder activityResultCaller(ActivityResultCaller activityResultCaller) {
            this.activityResultCaller = (ActivityResultCaller) Preconditions.checkNotNull(activityResultCaller);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder activityResultRegistryOwner(ActivityResultRegistryOwner activityResultRegistryOwner) {
            this.activityResultRegistryOwner = (ActivityResultRegistryOwner) Preconditions.checkNotNull(activityResultRegistryOwner);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder paymentOptionResultCallback(PaymentOptionResultCallback paymentOptionResultCallback) {
            this.paymentOptionResultCallback = (PaymentOptionResultCallback) Preconditions.checkNotNull(paymentOptionResultCallback);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder paymentResultCallback(PaymentSheetResultCallback paymentSheetResultCallback) {
            this.paymentResultCallback = (PaymentSheetResultCallback) Preconditions.checkNotNull(paymentSheetResultCallback);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponentBuilder initializedViaCompose(boolean z) {
            this.initializedViaCompose = (Boolean) Preconditions.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent.Builder
        public FlowControllerComponent build() {
            Preconditions.checkBuilderRequirement(this.lifeCycleOwner, LifecycleOwner.class);
            Preconditions.checkBuilderRequirement(this.activityResultCaller, ActivityResultCaller.class);
            Preconditions.checkBuilderRequirement(this.activityResultRegistryOwner, ActivityResultRegistryOwner.class);
            Preconditions.checkBuilderRequirement(this.paymentOptionResultCallback, PaymentOptionResultCallback.class);
            Preconditions.checkBuilderRequirement(this.paymentResultCallback, PaymentSheetResultCallback.class);
            Preconditions.checkBuilderRequirement(this.initializedViaCompose, Boolean.class);
            return new FlowControllerComponentImpl(this.flowControllerStateComponentImpl, this.lifeCycleOwner, this.activityResultCaller, this.activityResultRegistryOwner, this.paymentOptionResultCallback, this.paymentResultCallback, this.initializedViaCompose);
        }
    }

    private static final class LinkComponentBuilder implements LinkComponent.Builder {
        private LinkConfiguration configuration;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;

        private LinkComponentBuilder(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            return new LinkComponentImpl(this.flowControllerStateComponentImpl, this.configuration);
        }
    }

    private static final class LinkAnalyticsComponentBuilder implements LinkAnalyticsComponent.Builder {
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;

        private LinkAnalyticsComponentBuilder(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent.Builder
        public LinkAnalyticsComponent build() {
            return new LinkAnalyticsComponentImpl(this.flowControllerStateComponentImpl);
        }
    }

    private static final class FlowControllerComponentImpl implements FlowControllerComponent {
        private Provider<ActivityResultCaller> activityResultCallerProvider;
        private Provider<ActivityResultRegistryOwner> activityResultRegistryOwnerProvider;
        private Provider<DefaultFlowController> defaultFlowControllerProvider;
        private final FlowControllerComponentImpl flowControllerComponentImpl;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private Provider<PaymentSelection.IconLoader> iconLoaderProvider;
        private Provider<Boolean> initializedViaComposeProvider;
        private Provider<LifecycleOwner> lifeCycleOwnerProvider;
        private Provider<PaymentOptionFactory> paymentOptionFactoryProvider;
        private Provider<PaymentOptionResultCallback> paymentOptionResultCallbackProvider;
        private Provider<PaymentSheetResultCallback> paymentResultCallbackProvider;

        private FlowControllerComponentImpl(FlowControllerStateComponentImpl flowControllerStateComponentImpl, LifecycleOwner lifecycleOwner, ActivityResultCaller activityResultCaller, ActivityResultRegistryOwner activityResultRegistryOwner, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentSheetResultCallback, Boolean bool) {
            this.flowControllerComponentImpl = this;
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
            initialize(lifecycleOwner, activityResultCaller, activityResultRegistryOwner, paymentOptionResultCallback, paymentSheetResultCallback, bool);
        }

        private void initialize(LifecycleOwner lifecycleOwner, ActivityResultCaller activityResultCaller, ActivityResultRegistryOwner activityResultRegistryOwner, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentSheetResultCallback, Boolean bool) {
            this.lifeCycleOwnerProvider = InstanceFactory.create(lifecycleOwner);
            PaymentSelection_IconLoader_Factory paymentSelection_IconLoader_FactoryCreate = PaymentSelection_IconLoader_Factory.create((Provider<Resources>) this.flowControllerStateComponentImpl.provideResourcesProvider, (Provider<StripeImageLoader>) this.flowControllerStateComponentImpl.provideStripeImageLoaderProvider);
            this.iconLoaderProvider = paymentSelection_IconLoader_FactoryCreate;
            this.paymentOptionFactoryProvider = PaymentOptionFactory_Factory.create((Provider<PaymentSelection.IconLoader>) paymentSelection_IconLoader_FactoryCreate, (Provider<Context>) this.flowControllerStateComponentImpl.providesAppContextProvider);
            this.paymentOptionResultCallbackProvider = InstanceFactory.create(paymentOptionResultCallback);
            this.paymentResultCallbackProvider = InstanceFactory.create(paymentSheetResultCallback);
            this.activityResultCallerProvider = InstanceFactory.create(activityResultCaller);
            this.activityResultRegistryOwnerProvider = InstanceFactory.create(activityResultRegistryOwner);
            this.initializedViaComposeProvider = InstanceFactory.create(bool);
            this.defaultFlowControllerProvider = DoubleCheck.provider((Provider) DefaultFlowController_Factory.create((Provider<CoroutineScope>) this.flowControllerStateComponentImpl.provideViewModelScopeProvider, this.lifeCycleOwnerProvider, this.paymentOptionFactoryProvider, this.paymentOptionResultCallbackProvider, this.paymentResultCallbackProvider, (Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>>) this.flowControllerStateComponentImpl.providePrefsRepositoryFactoryProvider, this.activityResultCallerProvider, this.activityResultRegistryOwnerProvider, (Provider<Context>) this.flowControllerStateComponentImpl.providesAppContextProvider, (Provider<EventReporter>) this.flowControllerStateComponentImpl.bindsEventReporterProvider, (Provider<FlowControllerViewModel>) this.flowControllerStateComponentImpl.flowControllerViewModelProvider, (Provider<ConfirmationHandler>) this.flowControllerStateComponentImpl.providesConfirmationHandlerProvider, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create(), (Provider<LinkHandler>) this.flowControllerStateComponentImpl.linkHandlerProvider, (Provider<LinkAccountHolder>) this.flowControllerStateComponentImpl.providesLinkAccountHolderProvider, (Provider<LinkPaymentLauncher>) this.flowControllerStateComponentImpl.provideFlowControllerLinkLauncherProvider, (Provider<LinkPaymentLauncher>) this.flowControllerStateComponentImpl.provideWalletsButtonLinkLauncherProvider, (Provider<Boolean>) this.flowControllerStateComponentImpl.provideEnabledLoggingProvider, (Provider<Set<String>>) this.flowControllerStateComponentImpl.provideProductUsageTokensProvider, (Provider<FlowControllerConfigurationHandler>) this.flowControllerStateComponentImpl.flowControllerConfigurationHandlerProvider, (Provider<ErrorReporter>) this.flowControllerStateComponentImpl.realErrorReporterProvider, this.initializedViaComposeProvider, (Provider<String>) this.flowControllerStateComponentImpl.paymentElementCallbackIdentifierProvider));
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent
        public DefaultFlowController getFlowController() {
            return this.defaultFlowControllerProvider.get();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent
        public FlowControllerStateComponent getStateComponent() {
            return this.flowControllerStateComponentImpl;
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
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private C1043InlineSignupViewModel_Factory inlineSignupViewModelProvider;
        private final LinkComponentImpl linkComponentImpl;
        private Provider<LinkInlineSignupAssistedViewModelFactory> linkInlineSignupAssistedViewModelFactoryProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;

        private LinkComponentImpl(FlowControllerStateComponentImpl flowControllerStateComponentImpl, LinkConfiguration linkConfiguration) {
            this.linkComponentImpl = this;
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
            this.configuration = linkConfiguration;
            initialize(linkConfiguration);
        }

        private void initialize(LinkConfiguration linkConfiguration) {
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            DefaultLinkAccountManager_Factory defaultLinkAccountManager_FactoryCreate = DefaultLinkAccountManager_Factory.create((Provider<LinkAccountHolder>) this.flowControllerStateComponentImpl.providesLinkAccountHolderProvider, this.configurationProvider, (Provider<LinkRepository>) this.flowControllerStateComponentImpl.bindLinkRepositoryProvider, (Provider<LinkEventsReporter>) this.flowControllerStateComponentImpl.bindLinkEventsReporterProvider, (Provider<ErrorReporter>) this.flowControllerStateComponentImpl.realErrorReporterProvider);
            this.defaultLinkAccountManagerProvider = defaultLinkAccountManager_FactoryCreate;
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) defaultLinkAccountManager_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create((Provider<Application>) this.flowControllerStateComponentImpl.applicationProvider));
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create((Provider<Application>) this.flowControllerStateComponentImpl.applicationProvider);
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, (Provider<ErrorReporter>) this.flowControllerStateComponentImpl.realErrorReporterProvider, this.provideApplicationIdProvider);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            Provider<LinkAuth> provider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.bindsLinkAuthProvider = provider;
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, provider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, (Provider<ErrorReporter>) this.flowControllerStateComponentImpl.realErrorReporterProvider, (Provider<CoroutineContext>) this.flowControllerStateComponentImpl.provideWorkContextProvider);
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_FactoryCreate = C1043InlineSignupViewModel_Factory.create(this.configurationProvider, this.bindLinkAccountManagerProvider, (Provider<LinkEventsReporter>) this.flowControllerStateComponentImpl.bindLinkEventsReporterProvider, (Provider<Logger>) this.flowControllerStateComponentImpl.provideLoggerProvider);
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

    private static final class LinkAnalyticsComponentImpl implements LinkAnalyticsComponent {
        private Provider<LinkAnalyticsHelper> bindLinkAnalyticsHelperProvider;
        private Provider<DefaultLinkAnalyticsHelper> defaultLinkAnalyticsHelperProvider;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private final LinkAnalyticsComponentImpl linkAnalyticsComponentImpl;

        private LinkAnalyticsComponentImpl(FlowControllerStateComponentImpl flowControllerStateComponentImpl) {
            this.linkAnalyticsComponentImpl = this;
            this.flowControllerStateComponentImpl = flowControllerStateComponentImpl;
            initialize();
        }

        private void initialize() {
            DefaultLinkAnalyticsHelper_Factory defaultLinkAnalyticsHelper_FactoryCreate = DefaultLinkAnalyticsHelper_Factory.create((Provider<LinkEventsReporter>) this.flowControllerStateComponentImpl.bindLinkEventsReporterProvider);
            this.defaultLinkAnalyticsHelperProvider = defaultLinkAnalyticsHelper_FactoryCreate;
            this.bindLinkAnalyticsHelperProvider = DoubleCheck.provider((Provider) defaultLinkAnalyticsHelper_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent
        public LinkAnalyticsHelper getLinkAnalyticsHelper() {
            return this.bindLinkAnalyticsHelperProvider.get();
        }
    }

    private static final class FlowControllerStateComponentImpl implements FlowControllerStateComponent {
        private Provider<Application> applicationProvider;
        private Provider<BacsConfirmationDefinition> bacsConfirmationDefinitionProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<CustomPaymentMethodConfirmationDefinition> customPaymentMethodConfirmationDefinitionProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private Provider<CvcRecollectionConfirmationDefinition> cvcRecollectionConfirmationDefinitionProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Provider<DefaultLinkAccountStatusProvider> defaultLinkAccountStatusProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<DefaultLinkInlineInteractor> defaultLinkInlineInteractorProvider;
        private Provider<DefaultLogLinkHoldbackExperiment> defaultLogLinkHoldbackExperimentProvider;
        private Provider<DefaultPaymentElementLoader> defaultPaymentElementLoaderProvider;
        private Provider<DefaultRetrieveCustomerEmail> defaultRetrieveCustomerEmailProvider;
        private Provider<ExternalPaymentMethodConfirmationDefinition> externalPaymentMethodConfirmationDefinitionProvider;
        private Provider<ExternalPaymentMethodsRepository> externalPaymentMethodsRepositoryProvider;
        private Provider<DefaultConfirmationHandler.Factory> factoryProvider;
        private Provider<FlowControllerConfigurationHandler> flowControllerConfigurationHandlerProvider;
        private final FlowControllerStateComponentImpl flowControllerStateComponentImpl;
        private Provider<FlowControllerViewModel> flowControllerViewModelProvider;
        private Provider<GooglePayConfirmationDefinition> googlePayConfirmationDefinitionProvider;
        private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private Provider<LinkActivityContract> linkActivityContractProvider;
        private Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
        private Provider<LinkApiRepository> linkApiRepositoryProvider;
        private Provider<LinkComponent.Builder> linkComponentBuilderProvider;
        private Provider<LinkConfirmationDefinition> linkConfirmationDefinitionProvider;
        private Provider<LinkHandler> linkHandlerProvider;
        private Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Provider<LinkStore> linkStoreProvider;
        private Provider<String> mobileSessionIdProvider;
        private Provider<NativeLinkActivityContract> nativeLinkActivityContractProvider;
        private Provider<PassiveChallengeConfirmationDefinition> passiveChallengeConfirmationDefinitionProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private Provider<Boolean> provideAllowsManualConfirmationProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<ConfirmCustomPaymentMethodCallback> provideConfirmCustomPaymentMethodCallbackProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<DurationProvider> provideDurationProvider;
        private Provider<Boolean> provideEnabledLoggingProvider;
        private Provider<EventReporter.Mode> provideEventReporterModeProvider;
        private Provider<LinkPaymentLauncher> provideFlowControllerLinkLauncherProvider;
        private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
        private Provider<Function0<Boolean>> provideIsLiveModeProvider;
        private Provider<Locale> provideLocaleProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
        private Provider<Set<String>> provideProductUsageTokensProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<Resources> provideResourcesProvider;
        private Provider<Function0<String>> provideStripeAccountIdProvider;
        private Provider<StripeImageLoader> provideStripeImageLoaderProvider;
        private Provider<CoroutineContext> provideUIContextProvider;
        private Provider<CoroutineScope> provideViewModelScopeProvider;
        private Provider<LinkPaymentLauncher> provideWalletsButtonLinkLauncherProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<Context> providesAppContextProvider;
        private Provider<ConfirmationHandler> providesConfirmationHandlerProvider;
        private Provider<ConfirmationRegistry> providesConfirmationRegistryProvider;
        private Provider<CreateIntentCallback> providesCreateIntentCallbackProvider;
        private Provider<ExternalPaymentMethodConfirmHandler> providesExternalPaymentMethodConfirmHandlerProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesIntentConfirmationDefinitionProvider;
        private Provider<LinkAccountHolder> providesLinkAccountHolderProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesLinkConfirmationDefinitionProvider;
        private Provider<LinkRepository> providesLinkRepositoryProvider;
        private Provider<LogLinkHoldbackExperiment> providesLogLinkGlobalHoldbackExposureProvider;
        private Provider<PreparePaymentMethodHandler> providesPreparePaymentMethodHandlerProvider;
        private Provider<SavedStateHandle> providesSavedStateHandleProvider;
        private Provider<WalletButtonsContent> providesWalletButtonsContentProvider;
        private Provider<RealElementsSessionRepository> realElementsSessionRepositoryProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealLinkConfigurationCoordinator> realLinkConfigurationCoordinatorProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> setOfConfirmationDefinitionOfAndAndAndProvider;
        private Provider<ShopPayActivityContract> shopPayActivityContractProvider;
        private Provider<ShopPayConfirmationDefinition> shopPayConfirmationDefinitionProvider;
        private Provider<Integer> statusBarColorProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;
        private Provider<WebLinkActivityContract> webLinkActivityContractProvider;

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public void inject(PaymentOptionsViewModel.Factory factory) {
        }

        private FlowControllerStateComponentImpl(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Integer num, Application application, String str, FlowControllerViewModel flowControllerViewModel) {
            this.flowControllerStateComponentImpl = this;
            initialize(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, num, application, str, flowControllerViewModel);
            initialize2(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, num, application, str, flowControllerViewModel);
            initialize3(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, num, application, str, flowControllerViewModel);
            initialize4(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, num, application, str, flowControllerViewModel);
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private Function0<String> namedFunction0OfString() {
            return PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(this.providePaymentConfigurationProvider);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.providesAppContextProvider.get(), namedFunction0OfString(), this.provideProductUsageTokensProvider.get());
        }

        private RealErrorReporter realErrorReporter() {
            return new RealErrorReporter(defaultAnalyticsRequestExecutor(), paymentAnalyticsRequestFactory());
        }

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Integer num, Application application, String str, FlowControllerViewModel flowControllerViewModel) {
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            Provider<Context> provider = DoubleCheck.provider((Provider) FlowControllerModule_ProvidesAppContextFactory.create((Provider<Application>) factoryCreate));
            this.providesAppContextProvider = provider;
            PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(provider);
            this.providePaymentConfigurationProvider = paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            Provider<Set<String>> provider2 = DoubleCheck.provider((Provider) FlowControllerModule_ProvideProductUsageTokensFactory.create());
            this.provideProductUsageTokensProvider = provider2;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.providesAppContextProvider, this.providePublishableKeyProvider, provider2);
            Provider<Boolean> provider3 = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = provider3;
            Provider<Logger> provider4 = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, provider3));
            this.provideLoggerProvider = provider4;
            DefaultAnalyticsRequestExecutor_Factory defaultAnalyticsRequestExecutor_FactoryCreate = DefaultAnalyticsRequestExecutor_Factory.create(provider4, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutor_FactoryCreate;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.providesAppContextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) defaultAnalyticsRequestExecutor_FactoryCreate, this.provideLoggerProvider);
            this.realErrorReporterProvider = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            Factory factoryCreate2 = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate2;
            this.providesCreateIntentCallbackProvider = IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.create((Provider<String>) factoryCreate2);
            this.providesPreparePaymentMethodHandlerProvider = IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.provideAllowsManualConfirmationProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvideAllowsManualConfirmationFactory.create());
            PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory paymentSheetCommonModule_Companion_ProvideStripeAccountIdFactoryCreate = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            this.provideStripeAccountIdProvider = paymentSheetCommonModule_Companion_ProvideStripeAccountIdFactoryCreate;
            this.defaultIntentConfirmationInterceptorProvider = DefaultIntentConfirmationInterceptor_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.providesCreateIntentCallbackProvider, this.providesPreparePaymentMethodHandlerProvider, this.provideAllowsManualConfirmationProvider, this.providePublishableKeyProvider, (Provider<Function0<String>>) paymentSheetCommonModule_Companion_ProvideStripeAccountIdFactoryCreate);
            StripePaymentLauncher_Factory stripePaymentLauncher_FactoryCreate = StripePaymentLauncher_Factory.create(this.provideEnabledLoggingProvider, this.provideProductUsageTokensProvider);
            this.stripePaymentLauncherProvider = stripePaymentLauncher_FactoryCreate;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.createFactoryProvider(stripePaymentLauncher_FactoryCreate);
            Factory factoryCreateNullable = InstanceFactory.createNullable(num);
            this.statusBarColorProvider = factoryCreateNullable;
            this.providesIntentConfirmationDefinitionProvider = IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory.create((Provider<IntentConfirmationInterceptor>) this.defaultIntentConfirmationInterceptorProvider, this.stripePaymentLauncherAssistedFactoryProvider, (Provider<Integer>) factoryCreateNullable, this.providePaymentConfigurationProvider);
            this.linkStoreProvider = DoubleCheck.provider((Provider) LinkStore_Factory.create(this.providesAppContextProvider));
            Provider<LinkComponent.Builder> provider5 = new Provider<LinkComponent.Builder>() { // from class: com.stripe.android.paymentsheet.flowcontroller.DaggerFlowControllerStateComponent.FlowControllerStateComponentImpl.1
                @Override // javax.inject.Provider
                public LinkComponent.Builder get() {
                    return new LinkComponentBuilder(FlowControllerStateComponentImpl.this.flowControllerStateComponentImpl);
                }
            };
            this.linkComponentBuilderProvider = provider5;
            this.realLinkConfigurationCoordinatorProvider = DoubleCheck.provider((Provider) RealLinkConfigurationCoordinator_Factory.create(provider5));
        }

        private void initialize2(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Integer num, Application application, String str, FlowControllerViewModel flowControllerViewModel) {
            Provider<LinkAnalyticsComponent.Builder> provider = new Provider<LinkAnalyticsComponent.Builder>() { // from class: com.stripe.android.paymentsheet.flowcontroller.DaggerFlowControllerStateComponent.FlowControllerStateComponentImpl.2
                @Override // javax.inject.Provider
                public LinkAnalyticsComponent.Builder get() {
                    return new LinkAnalyticsComponentBuilder(FlowControllerStateComponentImpl.this.flowControllerStateComponentImpl);
                }
            };
            this.linkAnalyticsComponentBuilderProvider = provider;
            this.providesLinkConfirmationDefinitionProvider = LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory.create(this.linkStoreProvider, (Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, provider);
            this.cvcRecollectionConfirmationDefinitionProvider = CvcRecollectionConfirmationDefinition_Factory.create((Provider<CvcRecollectionHandler>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory.create(), (Provider<CvcRecollectionLauncherFactory>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory.create());
            this.passiveChallengeConfirmationDefinitionProvider = PassiveChallengeConfirmationDefinition_Factory.create((Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.bacsConfirmationDefinitionProvider = BacsConfirmationDefinition_Factory.create((Provider<BacsMandateConfirmationLauncherFactory>) BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory.create());
            ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory externalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactoryCreate = ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.providesExternalPaymentMethodConfirmHandlerProvider = externalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactoryCreate;
            this.externalPaymentMethodConfirmationDefinitionProvider = ExternalPaymentMethodConfirmationDefinition_Factory.create(this.paymentElementCallbackIdentifierProvider, (Provider<ExternalPaymentMethodConfirmHandler>) externalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactoryCreate, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory customPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactoryCreate = CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.provideConfirmCustomPaymentMethodCallbackProvider = customPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactoryCreate;
            this.customPaymentMethodConfirmationDefinitionProvider = CustomPaymentMethodConfirmationDefinition_Factory.create(this.paymentElementCallbackIdentifierProvider, (Provider<ConfirmCustomPaymentMethodCallback>) customPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactoryCreate, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate = GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.providesAppContextProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.provideGooglePayRepositoryFactoryProvider = googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate;
            GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_FactoryCreate = GooglePayPaymentMethodLauncher_Factory.create(this.providesAppContextProvider, (Provider<Function1<GooglePayEnvironment, GooglePayRepository>>) googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.googlePayPaymentMethodLauncherProvider = googlePayPaymentMethodLauncher_FactoryCreate;
            this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.createFactoryProvider(googlePayPaymentMethodLauncher_FactoryCreate);
            RealUserFacingLogger_Factory realUserFacingLogger_FactoryCreate = RealUserFacingLogger_Factory.create(this.providesAppContextProvider);
            this.realUserFacingLoggerProvider = realUserFacingLogger_FactoryCreate;
            this.googlePayConfirmationDefinitionProvider = GooglePayConfirmationDefinition_Factory.create(this.googlePayPaymentMethodLauncherFactoryProvider, (Provider<UserFacingLogger>) realUserFacingLogger_FactoryCreate);
            this.nativeLinkActivityContractProvider = NativeLinkActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            WebLinkActivityContract_Factory webLinkActivityContract_FactoryCreate = WebLinkActivityContract_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.webLinkActivityContractProvider = webLinkActivityContract_FactoryCreate;
            LinkActivityContract_Factory linkActivityContract_FactoryCreate = LinkActivityContract_Factory.create(this.nativeLinkActivityContractProvider, (Provider<WebLinkActivityContract>) webLinkActivityContract_FactoryCreate, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create());
            this.linkActivityContractProvider = linkActivityContract_FactoryCreate;
            this.linkPaymentLauncherProvider = DoubleCheck.provider((Provider) LinkPaymentLauncher_Factory.create(this.linkAnalyticsComponentBuilderProvider, this.paymentElementCallbackIdentifierProvider, (Provider<LinkActivityContract>) linkActivityContract_FactoryCreate, this.linkStoreProvider));
            Factory factoryCreate = InstanceFactory.create(flowControllerViewModel);
            this.flowControllerViewModelProvider = factoryCreate;
            Provider<SavedStateHandle> provider2 = DoubleCheck.provider((Provider) FlowControllerModule_ProvidesSavedStateHandleFactory.create((Provider<FlowControllerViewModel>) factoryCreate));
            this.providesSavedStateHandleProvider = provider2;
            Provider<LinkAccountHolder> provider3 = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory.create(provider2));
            this.providesLinkAccountHolderProvider = provider3;
            this.linkConfirmationDefinitionProvider = LinkConfirmationDefinition_Factory.create(this.linkPaymentLauncherProvider, this.linkStoreProvider, provider3);
            ShopPayActivityContract_Factory shopPayActivityContract_FactoryCreate = ShopPayActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            this.shopPayActivityContractProvider = shopPayActivityContract_FactoryCreate;
            this.shopPayConfirmationDefinitionProvider = ShopPayConfirmationDefinition_Factory.create((Provider<ShopPayActivityContract>) shopPayActivityContract_FactoryCreate);
            this.setOfConfirmationDefinitionOfAndAndAndProvider = SetFactory.builder(10, 0).addProvider((Provider) this.providesIntentConfirmationDefinitionProvider).addProvider((Provider) this.providesLinkConfirmationDefinitionProvider).addProvider((Provider) this.cvcRecollectionConfirmationDefinitionProvider).addProvider((Provider) this.passiveChallengeConfirmationDefinitionProvider).addProvider((Provider) this.bacsConfirmationDefinitionProvider).addProvider((Provider) this.externalPaymentMethodConfirmationDefinitionProvider).addProvider((Provider) this.customPaymentMethodConfirmationDefinitionProvider).addProvider((Provider) this.googlePayConfirmationDefinitionProvider).addProvider((Provider) this.linkConfirmationDefinitionProvider).addProvider((Provider) this.shopPayConfirmationDefinitionProvider).build();
        }

        private void initialize3(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Integer num, Application application, String str, FlowControllerViewModel flowControllerViewModel) {
            ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate = ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory.create(this.setOfConfirmationDefinitionOfAndAndAndProvider);
            this.providesConfirmationRegistryProvider = confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate;
            DefaultConfirmationHandler_Factory_Factory defaultConfirmationHandler_Factory_FactoryCreate = DefaultConfirmationHandler_Factory_Factory.create((Provider<ConfirmationRegistry>) confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate, this.providesSavedStateHandleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider);
            this.factoryProvider = defaultConfirmationHandler_Factory_FactoryCreate;
            this.providesConfirmationHandlerProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvidesConfirmationHandlerFactory.create((Provider<ConfirmationHandler.Factory>) defaultConfirmationHandler_Factory_FactoryCreate, this.flowControllerViewModelProvider));
            this.linkHandlerProvider = DoubleCheck.provider((Provider) LinkHandler_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider));
            Provider<LinkPaymentLauncher> provider = DoubleCheck.provider((Provider) FlowControllerModule_ProvideWalletsButtonLinkLauncherFactory.create(this.linkAnalyticsComponentBuilderProvider, this.linkActivityContractProvider, this.paymentElementCallbackIdentifierProvider, this.linkStoreProvider));
            this.provideWalletsButtonLinkLauncherProvider = provider;
            this.providesWalletButtonsContentProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvidesWalletButtonsContentFactory.create(this.flowControllerViewModelProvider, provider));
            Provider<CoroutineScope> provider2 = DoubleCheck.provider((Provider) FlowControllerModule_ProvideViewModelScopeFactory.create(this.flowControllerViewModelProvider));
            this.provideViewModelScopeProvider = provider2;
            this.defaultLinkInlineInteractorProvider = DoubleCheck.provider((Provider) DefaultLinkInlineInteractor_Factory.create(provider2, (Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, this.provideWalletsButtonLinkLauncherProvider, this.provideLoggerProvider, this.providesSavedStateHandleProvider));
            this.provideResourcesProvider = DoubleCheck.provider((Provider) ResourceRepositoryModule_ProvideResourcesFactory.create(this.providesAppContextProvider));
            this.provideStripeImageLoaderProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvideStripeImageLoaderFactory.create(this.providesAppContextProvider));
            this.providePrefsRepositoryFactoryProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory.create(this.providesAppContextProvider, this.provideWorkContextProvider));
            this.provideEventReporterModeProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvideEventReporterModeFactory.create());
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.providesAppContextProvider, this.provideWorkContextProvider, this.provideLoggerProvider);
            this.provideDurationProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory.create());
            PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory paymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactoryCreate = PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.providesAnalyticEventCallbackProvider = paymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactoryCreate;
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create(this.providesAppContextProvider, this.provideEventReporterModeProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideDurationProvider, (Provider<AnalyticEventCallback>) paymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactoryCreate, this.provideWorkContextProvider, (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
            this.provideFlowControllerLinkLauncherProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvideFlowControllerLinkLauncherFactory.create(this.linkAnalyticsComponentBuilderProvider, this.linkActivityContractProvider, this.paymentElementCallbackIdentifierProvider, this.linkStoreProvider));
            this.mobileSessionIdProvider = MobileSessionIdModule_MobileSessionIdProviderFactory.create(mobileSessionIdModule);
            ApplicationIdModule_ProvideApplicationIdFactory applicationIdModule_ProvideApplicationIdFactoryCreate = ApplicationIdModule_ProvideApplicationIdFactory.create(this.applicationProvider);
            this.provideApplicationIdProvider = applicationIdModule_ProvideApplicationIdFactoryCreate;
            this.realElementsSessionRepositoryProvider = RealElementsSessionRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideWorkContextProvider, this.mobileSessionIdProvider, (Provider<String>) applicationIdModule_ProvideApplicationIdFactoryCreate);
            Provider<CustomerApiRepository> provider3 = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
            this.customerApiRepositoryProvider = provider3;
            this.defaultRetrieveCustomerEmailProvider = DefaultRetrieveCustomerEmail_Factory.create((Provider<CustomerRepository>) provider3);
            this.defaultLinkAccountStatusProvider = DefaultLinkAccountStatusProvider_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider);
            this.provideLocaleProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
        }

        private void initialize4(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Integer num, Application application, String str, FlowControllerViewModel flowControllerViewModel) {
            LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate = LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory.create(linkHoldbackExposureModule, this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.provideWorkContextProvider, this.provideLoggerProvider, this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.providesLinkRepositoryProvider = linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate;
            DefaultLogLinkHoldbackExperiment_Factory defaultLogLinkHoldbackExperiment_FactoryCreate = DefaultLogLinkHoldbackExperiment_Factory.create(this.bindsEventReporterProvider, (Provider<LinkRepository>) linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate, this.provideWorkContextProvider, (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, this.provideEventReporterModeProvider, this.provideLoggerProvider);
            this.defaultLogLinkHoldbackExperimentProvider = defaultLogLinkHoldbackExperiment_FactoryCreate;
            this.providesLogLinkGlobalHoldbackExposureProvider = LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory.create(linkHoldbackExposureModule, (Provider<DefaultLogLinkHoldbackExperiment>) defaultLogLinkHoldbackExperiment_FactoryCreate);
            this.externalPaymentMethodsRepositoryProvider = ExternalPaymentMethodsRepository_Factory.create((Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.defaultPaymentElementLoaderProvider = DoubleCheck.provider((Provider) DefaultPaymentElementLoader_Factory.create(this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, (Provider<ElementsSessionRepository>) this.realElementsSessionRepositoryProvider, (Provider<CustomerRepository>) this.customerApiRepositoryProvider, (Provider<LpmRepository>) LpmRepository_Factory.create(), this.provideLoggerProvider, this.bindsEventReporterProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkAccountStatusProvider>) this.defaultLinkAccountStatusProvider, this.providesLogLinkGlobalHoldbackExposureProvider, this.linkStoreProvider, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create(), this.externalPaymentMethodsRepositoryProvider, (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider, (Provider<CvcRecollectionHandler>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory.create()));
            this.provideUIContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
            this.provideIsLiveModeProvider = DoubleCheck.provider((Provider) FlowControllerModule_ProvideIsLiveModeFactory.create(this.providePaymentConfigurationProvider));
            this.flowControllerConfigurationHandlerProvider = DoubleCheck.provider((Provider) FlowControllerConfigurationHandler_Factory.create((Provider<PaymentElementLoader>) this.defaultPaymentElementLoaderProvider, this.provideUIContextProvider, this.bindsEventReporterProvider, this.flowControllerViewModelProvider, (Provider<PaymentSelectionUpdater>) DefaultPaymentSelectionUpdater_Factory.create(), this.provideIsLiveModeProvider));
            Provider<ConsumersApiService> provider = DoubleCheck.provider((Provider) LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, this.provideWorkContextProvider));
            this.provideConsumersApiServiceProvider = provider;
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, provider, this.provideWorkContextProvider, this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideLoggerProvider, this.provideDurationProvider);
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            this.bindLinkEventsReporterProvider = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public FlowControllerComponent.Builder getFlowControllerComponentBuilder() {
            return new FlowControllerComponentBuilder(this.flowControllerStateComponentImpl);
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public ConfirmationHandler getConfirmationHandler() {
            return this.providesConfirmationHandlerProvider.get();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public LinkHandler getLinkHandler() {
            return this.linkHandlerProvider.get();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public ErrorReporter getErrorReporter() {
            return realErrorReporter();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public WalletButtonsContent getWalletButtonsContent() {
            return this.providesWalletButtonsContentProvider.get();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public DefaultLinkInlineInteractor getLinkInlineInteractor() {
            return this.defaultLinkInlineInteractorProvider.get();
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerStateComponent
        public LinkAccountHolder getLinkAccountHolder() {
            return this.providesLinkAccountHolderProvider.get();
        }
    }
}
