package com.stripe.android.paymentelement.embedded.content;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory_Factory;
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
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.lpmfoundations.luxe.LpmRepository_Factory;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.EmbeddedPaymentElement_Factory;
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
import com.stripe.android.paymentelement.embedded.DefaultEmbeddedResultCallbackHelper;
import com.stripe.android.paymentelement.embedded.DefaultEmbeddedResultCallbackHelper_Factory;
import com.stripe.android.paymentelement.embedded.DefaultEmbeddedRowSelectionImmediateActionHandler;
import com.stripe.android.paymentelement.embedded.DefaultEmbeddedRowSelectionImmediateActionHandler_Factory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_IoContextFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideDurationProviderFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideStripeAccountIdFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideUiContextFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory_Factory;
import com.stripe.android.paymentelement.embedded.EmbeddedResultCallbackHelper;
import com.stripe.android.paymentelement.embedded.EmbeddedRowSelectionImmediateActionHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder_Factory;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementViewModelComponent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.LinkHandler_Factory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory;
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
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.shoppay.ShopPayActivityContract;
import com.stripe.android.shoppay.ShopPayActivityContract_Factory;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository_Factory;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetFactory;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class DaggerEmbeddedPaymentElementViewModelComponent {
    private DaggerEmbeddedPaymentElementViewModelComponent() {
    }

    public static EmbeddedPaymentElementViewModelComponent.Factory factory() {
        return new Factory();
    }

    private static final class Factory implements EmbeddedPaymentElementViewModelComponent.Factory {
        private Factory() {
        }

        @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementViewModelComponent.Factory
        public EmbeddedPaymentElementViewModelComponent build(SavedStateHandle savedStateHandle, Application application, String str, Integer num) {
            Preconditions.checkNotNull(savedStateHandle);
            Preconditions.checkNotNull(application);
            Preconditions.checkNotNull(str);
            return new EmbeddedPaymentElementViewModelComponentImpl(new GooglePayLauncherModule(), new CoreCommonModule(), new MobileSessionIdModule(), new LinkHoldbackExposureModule(), savedStateHandle, application, str, num);
        }
    }

    private static final class EmbeddedPaymentElementSubcomponentFactory implements EmbeddedPaymentElementSubcomponent.Factory {
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;

        private EmbeddedPaymentElementSubcomponentFactory(EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl) {
            this.embeddedPaymentElementViewModelComponentImpl = embeddedPaymentElementViewModelComponentImpl;
        }

        @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent.Factory
        public EmbeddedPaymentElementSubcomponent build(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner, EmbeddedPaymentElement.ResultCallback resultCallback) {
            Preconditions.checkNotNull(activityResultCaller);
            Preconditions.checkNotNull(lifecycleOwner);
            Preconditions.checkNotNull(resultCallback);
            return new EmbeddedPaymentElementSubcomponentImpl(this.embeddedPaymentElementViewModelComponentImpl, activityResultCaller, lifecycleOwner, resultCallback);
        }
    }

    private static final class LinkComponentBuilder implements LinkComponent.Builder {
        private LinkConfiguration configuration;
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;

        private LinkComponentBuilder(EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl) {
            this.embeddedPaymentElementViewModelComponentImpl = embeddedPaymentElementViewModelComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            return new LinkComponentImpl(this.embeddedPaymentElementViewModelComponentImpl, this.configuration);
        }
    }

    private static final class LinkAnalyticsComponentBuilder implements LinkAnalyticsComponent.Builder {
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;

        private LinkAnalyticsComponentBuilder(EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl) {
            this.embeddedPaymentElementViewModelComponentImpl = embeddedPaymentElementViewModelComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent.Builder
        public LinkAnalyticsComponent build() {
            return new LinkAnalyticsComponentImpl(this.embeddedPaymentElementViewModelComponentImpl);
        }
    }

    private static final class EmbeddedPaymentElementSubcomponentImpl implements EmbeddedPaymentElementSubcomponent {
        private Provider<ActivityResultCaller> activityResultCallerProvider;
        private Provider<DefaultEmbeddedConfirmationHelper> defaultEmbeddedConfirmationHelperProvider;
        private Provider<DefaultEmbeddedResultCallbackHelper> defaultEmbeddedResultCallbackHelperProvider;
        private Provider<DefaultEmbeddedSheetLauncher> defaultEmbeddedSheetLauncherProvider;
        private Provider<EmbeddedPaymentElementInitializer> embeddedPaymentElementInitializerProvider;
        private Provider<EmbeddedPaymentElement> embeddedPaymentElementProvider;
        private final EmbeddedPaymentElementSubcomponentImpl embeddedPaymentElementSubcomponentImpl;
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;
        private Provider<LifecycleOwner> lifecycleOwnerProvider;
        private Provider<EmbeddedPaymentElement.ResultCallback> resultCallbackProvider;

        private EmbeddedPaymentElementSubcomponentImpl(EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl, ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner, EmbeddedPaymentElement.ResultCallback resultCallback) {
            this.embeddedPaymentElementSubcomponentImpl = this;
            this.embeddedPaymentElementViewModelComponentImpl = embeddedPaymentElementViewModelComponentImpl;
            initialize(activityResultCaller, lifecycleOwner, resultCallback);
        }

        private void initialize(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner, EmbeddedPaymentElement.ResultCallback resultCallback) {
            this.activityResultCallerProvider = InstanceFactory.create(activityResultCaller);
            this.lifecycleOwnerProvider = InstanceFactory.create(lifecycleOwner);
            dagger.internal.Factory factoryCreate = InstanceFactory.create(resultCallback);
            this.resultCallbackProvider = factoryCreate;
            this.defaultEmbeddedResultCallbackHelperProvider = DoubleCheck.provider((Provider) DefaultEmbeddedResultCallbackHelper_Factory.create((Provider<EmbeddedPaymentElement.ResultCallback>) factoryCreate, (Provider<EmbeddedStateHelper>) this.embeddedPaymentElementViewModelComponentImpl.defaultEmbeddedStateHelperProvider));
            Provider<DefaultEmbeddedConfirmationHelper> provider = DoubleCheck.provider((Provider) DefaultEmbeddedConfirmationHelper_Factory.create((Provider<EmbeddedConfirmationStarter>) this.embeddedPaymentElementViewModelComponentImpl.embeddedConfirmationStarterProvider, this.activityResultCallerProvider, this.lifecycleOwnerProvider, (Provider<EmbeddedConfirmationStateHolder>) this.embeddedPaymentElementViewModelComponentImpl.embeddedConfirmationStateHolderProvider, (Provider<EventReporter>) this.embeddedPaymentElementViewModelComponentImpl.bindsEventReporterProvider, (Provider<EmbeddedResultCallbackHelper>) this.defaultEmbeddedResultCallbackHelperProvider));
            this.defaultEmbeddedConfirmationHelperProvider = provider;
            this.embeddedPaymentElementProvider = DoubleCheck.provider((Provider) EmbeddedPaymentElement_Factory.create((Provider<EmbeddedConfirmationHelper>) provider, (Provider<EmbeddedContentHelper>) this.embeddedPaymentElementViewModelComponentImpl.defaultEmbeddedContentHelperProvider, (Provider<EmbeddedSelectionHolder>) this.embeddedPaymentElementViewModelComponentImpl.embeddedSelectionHolderProvider, (Provider<PaymentOptionDisplayDataHolder>) this.embeddedPaymentElementViewModelComponentImpl.defaultPaymentOptionDisplayDataHolderProvider, (Provider<EmbeddedConfigurationCoordinator>) this.embeddedPaymentElementViewModelComponentImpl.defaultEmbeddedConfigurationCoordinatorProvider, (Provider<EmbeddedStateHelper>) this.embeddedPaymentElementViewModelComponentImpl.defaultEmbeddedStateHelperProvider));
            Provider<DefaultEmbeddedSheetLauncher> provider2 = DoubleCheck.provider((Provider) DefaultEmbeddedSheetLauncher_Factory.create(this.activityResultCallerProvider, this.lifecycleOwnerProvider, (Provider<EmbeddedSelectionHolder>) this.embeddedPaymentElementViewModelComponentImpl.embeddedSelectionHolderProvider, (Provider<EmbeddedRowSelectionImmediateActionHandler>) this.embeddedPaymentElementViewModelComponentImpl.defaultEmbeddedRowSelectionImmediateActionHandlerProvider, (Provider<CustomerStateHolder>) this.embeddedPaymentElementViewModelComponentImpl.provideCustomerStateHolderProvider, (Provider<SheetStateHolder>) this.embeddedPaymentElementViewModelComponentImpl.sheetStateHolderProvider, (Provider<ErrorReporter>) this.embeddedPaymentElementViewModelComponentImpl.realErrorReporterProvider, (Provider<Integer>) this.embeddedPaymentElementViewModelComponentImpl.statusBarColorProvider, (Provider<String>) this.embeddedPaymentElementViewModelComponentImpl.paymentElementCallbackIdentifierProvider, (Provider<EmbeddedResultCallbackHelper>) this.defaultEmbeddedResultCallbackHelperProvider));
            this.defaultEmbeddedSheetLauncherProvider = provider2;
            this.embeddedPaymentElementInitializerProvider = DoubleCheck.provider((Provider) EmbeddedPaymentElementInitializer_Factory.create((Provider<EmbeddedSheetLauncher>) provider2, (Provider<EmbeddedContentHelper>) this.embeddedPaymentElementViewModelComponentImpl.defaultEmbeddedContentHelperProvider, this.lifecycleOwnerProvider, (Provider<SavedStateHandle>) this.embeddedPaymentElementViewModelComponentImpl.savedStateHandleProvider, (Provider<EventReporter>) this.embeddedPaymentElementViewModelComponentImpl.bindsEventReporterProvider, (Provider<String>) this.embeddedPaymentElementViewModelComponentImpl.paymentElementCallbackIdentifierProvider));
        }

        @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent
        public EmbeddedPaymentElement getEmbeddedPaymentElement() {
            return this.embeddedPaymentElementProvider.get();
        }

        @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent
        public EmbeddedPaymentElementInitializer getInitializer() {
            return this.embeddedPaymentElementInitializerProvider.get();
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
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;
        private C1043InlineSignupViewModel_Factory inlineSignupViewModelProvider;
        private final LinkComponentImpl linkComponentImpl;
        private Provider<LinkInlineSignupAssistedViewModelFactory> linkInlineSignupAssistedViewModelFactoryProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;

        private LinkComponentImpl(EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl, LinkConfiguration linkConfiguration) {
            this.linkComponentImpl = this;
            this.embeddedPaymentElementViewModelComponentImpl = embeddedPaymentElementViewModelComponentImpl;
            this.configuration = linkConfiguration;
            initialize(linkConfiguration);
        }

        private void initialize(LinkConfiguration linkConfiguration) {
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            DefaultLinkAccountManager_Factory defaultLinkAccountManager_FactoryCreate = DefaultLinkAccountManager_Factory.create((Provider<LinkAccountHolder>) this.embeddedPaymentElementViewModelComponentImpl.providesLinkAccountHolderProvider, this.configurationProvider, (Provider<LinkRepository>) this.embeddedPaymentElementViewModelComponentImpl.bindLinkRepositoryProvider, (Provider<LinkEventsReporter>) this.embeddedPaymentElementViewModelComponentImpl.bindLinkEventsReporterProvider, (Provider<ErrorReporter>) this.embeddedPaymentElementViewModelComponentImpl.realErrorReporterProvider);
            this.defaultLinkAccountManagerProvider = defaultLinkAccountManager_FactoryCreate;
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) defaultLinkAccountManager_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create((Provider<Application>) this.embeddedPaymentElementViewModelComponentImpl.applicationProvider));
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create((Provider<Application>) this.embeddedPaymentElementViewModelComponentImpl.applicationProvider);
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, (Provider<ErrorReporter>) this.embeddedPaymentElementViewModelComponentImpl.realErrorReporterProvider, this.provideApplicationIdProvider);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            Provider<LinkAuth> provider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.bindsLinkAuthProvider = provider;
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, provider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, (Provider<ErrorReporter>) this.embeddedPaymentElementViewModelComponentImpl.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_FactoryCreate = C1043InlineSignupViewModel_Factory.create(this.configurationProvider, this.bindLinkAccountManagerProvider, (Provider<LinkEventsReporter>) this.embeddedPaymentElementViewModelComponentImpl.bindLinkEventsReporterProvider, (Provider<Logger>) this.embeddedPaymentElementViewModelComponentImpl.provideLoggerProvider);
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
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;
        private final LinkAnalyticsComponentImpl linkAnalyticsComponentImpl;

        private LinkAnalyticsComponentImpl(EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl) {
            this.linkAnalyticsComponentImpl = this;
            this.embeddedPaymentElementViewModelComponentImpl = embeddedPaymentElementViewModelComponentImpl;
            initialize();
        }

        private void initialize() {
            DefaultLinkAnalyticsHelper_Factory defaultLinkAnalyticsHelper_FactoryCreate = DefaultLinkAnalyticsHelper_Factory.create((Provider<LinkEventsReporter>) this.embeddedPaymentElementViewModelComponentImpl.bindLinkEventsReporterProvider);
            this.defaultLinkAnalyticsHelperProvider = defaultLinkAnalyticsHelper_FactoryCreate;
            this.bindLinkAnalyticsHelperProvider = DoubleCheck.provider((Provider) defaultLinkAnalyticsHelper_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent
        public LinkAnalyticsHelper getLinkAnalyticsHelper() {
            return this.bindLinkAnalyticsHelperProvider.get();
        }
    }

    private static final class EmbeddedPaymentElementViewModelComponentImpl implements EmbeddedPaymentElementViewModelComponent {
        private Provider<Application> applicationProvider;
        private Provider<BacsConfirmationDefinition> bacsConfirmationDefinitionProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<CustomPaymentMethodConfirmationDefinition> customPaymentMethodConfirmationDefinitionProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private Provider<CvcRecollectionConfirmationDefinition> cvcRecollectionConfirmationDefinitionProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultCardAccountRangeRepositoryFactory> defaultCardAccountRangeRepositoryFactoryProvider;
        private Provider<DefaultEmbeddedConfigurationCoordinator> defaultEmbeddedConfigurationCoordinatorProvider;
        private Provider<DefaultEmbeddedConfigurationHandler> defaultEmbeddedConfigurationHandlerProvider;
        private Provider<DefaultEmbeddedContentHelper> defaultEmbeddedContentHelperProvider;
        private Provider<DefaultEmbeddedLinkHelper> defaultEmbeddedLinkHelperProvider;
        private Provider<DefaultEmbeddedRowSelectionImmediateActionHandler> defaultEmbeddedRowSelectionImmediateActionHandlerProvider;
        private Provider<DefaultEmbeddedSelectionChooser> defaultEmbeddedSelectionChooserProvider;
        private Provider<DefaultEmbeddedStateHelper> defaultEmbeddedStateHelperProvider;
        private Provider<DefaultEmbeddedWalletsHelper> defaultEmbeddedWalletsHelperProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Provider<DefaultLinkAccountStatusProvider> defaultLinkAccountStatusProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<DefaultLogLinkHoldbackExperiment> defaultLogLinkHoldbackExperimentProvider;
        private Provider<DefaultPaymentElementLoader> defaultPaymentElementLoaderProvider;
        private Provider<DefaultPaymentOptionDisplayDataHolder> defaultPaymentOptionDisplayDataHolderProvider;
        private Provider<DefaultRetrieveCustomerEmail> defaultRetrieveCustomerEmailProvider;
        private Provider<EmbeddedConfirmationStarter> embeddedConfirmationStarterProvider;
        private Provider<EmbeddedConfirmationStateHolder> embeddedConfirmationStateHolderProvider;
        private Provider<EmbeddedFormHelperFactory> embeddedFormHelperFactoryProvider;
        private Provider<EmbeddedPaymentElementSubcomponent.Factory> embeddedPaymentElementSubcomponentFactoryProvider;
        private final EmbeddedPaymentElementViewModelComponentImpl embeddedPaymentElementViewModelComponentImpl;
        private Provider<EmbeddedPaymentElementViewModel> embeddedPaymentElementViewModelProvider;
        private Provider<EmbeddedSelectionHolder> embeddedSelectionHolderProvider;
        private Provider<ExternalPaymentMethodConfirmationDefinition> externalPaymentMethodConfirmationDefinitionProvider;
        private Provider<ExternalPaymentMethodsRepository> externalPaymentMethodsRepositoryProvider;
        private Provider<DefaultConfirmationHandler.Factory> factoryProvider;
        private Provider<GooglePayConfirmationDefinition> googlePayConfirmationDefinitionProvider;
        private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private Provider<PaymentSelection.IconLoader> iconLoaderProvider;
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
        private Provider<PaymentOptionDisplayDataFactory> paymentOptionDisplayDataFactoryProvider;
        private Provider<Boolean> provideAllowsManualConfirmationProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<ConfirmCustomPaymentMethodCallback> provideConfirmCustomPaymentMethodCallbackProvider;
        private Provider<ConfirmationHandler> provideConfirmationHandlerProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<CustomerStateHolder> provideCustomerStateHolderProvider;
        private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
        private Provider<Locale> provideLocaleProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<StateFlow<PaymentMethodMetadata>> providePaymentMethodMetadataProvider;
        private Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<Resources> provideResourcesProvider;
        private Provider<Function0<String>> provideStripeAccountIdProvider;
        private Provider<StripeImageLoader> provideStripeImageLoaderProvider;
        private Provider<CoroutineContext> provideUiContextProvider;
        private Provider<CoroutineScope> provideViewModelScopeProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<ConfirmationRegistry> providesConfirmationRegistryProvider;
        private Provider<Function0<EmbeddedConfirmationStateHolder.State>> providesConfirmationStateSupplierProvider;
        private Provider<Context> providesContextProvider;
        private Provider<CreateIntentCallback> providesCreateIntentCallbackProvider;
        private Provider<ExternalPaymentMethodConfirmHandler> providesExternalPaymentMethodConfirmHandlerProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesIntentConfirmationDefinitionProvider;
        private Provider<Function0<Unit>> providesInternalRowSelectionCallbackProvider;
        private Provider<Function0<Boolean>> providesIsLiveModeProvider;
        private Provider<LinkAccountHolder> providesLinkAccountHolderProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesLinkConfirmationDefinitionProvider;
        private Provider<LinkRepository> providesLinkRepositoryProvider;
        private Provider<LogLinkHoldbackExperiment> providesLogLinkGlobalHoldbackExposureProvider;
        private Provider<PreparePaymentMethodHandler> providesPreparePaymentMethodHandlerProvider;
        private Provider<RealElementsSessionRepository> realElementsSessionRepositoryProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealLinkConfigurationCoordinator> realLinkConfigurationCoordinatorProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> setOfConfirmationDefinitionOfAndAndAndProvider;
        private Provider<SheetStateHolder> sheetStateHolderProvider;
        private Provider<ShopPayActivityContract> shopPayActivityContractProvider;
        private Provider<ShopPayConfirmationDefinition> shopPayConfirmationDefinitionProvider;
        private Provider<Integer> statusBarColorProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;
        private Provider<WebLinkActivityContract> webLinkActivityContractProvider;

        private EmbeddedPaymentElementViewModelComponentImpl(GooglePayLauncherModule googlePayLauncherModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, SavedStateHandle savedStateHandle, Application application, String str, Integer num) {
            this.embeddedPaymentElementViewModelComponentImpl = this;
            initialize(googlePayLauncherModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, savedStateHandle, application, str, num);
            initialize2(googlePayLauncherModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, savedStateHandle, application, str, num);
            initialize3(googlePayLauncherModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, savedStateHandle, application, str, num);
            initialize4(googlePayLauncherModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, savedStateHandle, application, str, num);
        }

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, SavedStateHandle savedStateHandle, Application application, String str, Integer num) {
            this.embeddedPaymentElementSubcomponentFactoryProvider = new Provider<EmbeddedPaymentElementSubcomponent.Factory>() { // from class: com.stripe.android.paymentelement.embedded.content.DaggerEmbeddedPaymentElementViewModelComponent.EmbeddedPaymentElementViewModelComponentImpl.1
                @Override // javax.inject.Provider
                public EmbeddedPaymentElementSubcomponent.Factory get() {
                    return new EmbeddedPaymentElementSubcomponentFactory(EmbeddedPaymentElementViewModelComponentImpl.this.embeddedPaymentElementViewModelComponentImpl);
                }
            };
            Provider<CoroutineScope> provider = DoubleCheck.provider((Provider) EmbeddedPaymentElementViewModelModule_Companion_ProvideViewModelScopeFactory.create());
            this.provideViewModelScopeProvider = provider;
            this.embeddedPaymentElementViewModelProvider = DoubleCheck.provider((Provider) C1083EmbeddedPaymentElementViewModel_Factory.create(this.embeddedPaymentElementSubcomponentFactoryProvider, provider));
            dagger.internal.Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            EmbeddedPaymentElementViewModelModule_Companion_ProvidesContextFactory embeddedPaymentElementViewModelModule_Companion_ProvidesContextFactoryCreate = EmbeddedPaymentElementViewModelModule_Companion_ProvidesContextFactory.create((Provider<Application>) factoryCreate);
            this.providesContextProvider = embeddedPaymentElementViewModelModule_Companion_ProvidesContextFactoryCreate;
            EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) embeddedPaymentElementViewModelModule_Companion_ProvidesContextFactoryCreate);
            this.providePaymentConfigurationProvider = embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate = EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.providePublishableKeyProvider = embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.providesContextProvider, (Provider<Function0<String>>) embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate, (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create());
            Provider<Logger> provider2 = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory.create()));
            this.provideLoggerProvider = provider2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provider2, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.providesContextProvider, this.providePublishableKeyProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create(), this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.realErrorReporterProvider = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            dagger.internal.Factory factoryCreate2 = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate2;
            this.providesCreateIntentCallbackProvider = IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.create((Provider<String>) factoryCreate2);
            this.providesPreparePaymentMethodHandlerProvider = IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.provideAllowsManualConfirmationProvider = DoubleCheck.provider((Provider) EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory.create());
            EmbeddedCommonModule_Companion_ProvideStripeAccountIdFactory embeddedCommonModule_Companion_ProvideStripeAccountIdFactoryCreate = EmbeddedCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
            this.provideStripeAccountIdProvider = embeddedCommonModule_Companion_ProvideStripeAccountIdFactoryCreate;
            this.defaultIntentConfirmationInterceptorProvider = DefaultIntentConfirmationInterceptor_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.providesCreateIntentCallbackProvider, this.providesPreparePaymentMethodHandlerProvider, this.provideAllowsManualConfirmationProvider, this.providePublishableKeyProvider, (Provider<Function0<String>>) embeddedCommonModule_Companion_ProvideStripeAccountIdFactoryCreate);
            StripePaymentLauncher_Factory stripePaymentLauncher_FactoryCreate = StripePaymentLauncher_Factory.create((Provider<Boolean>) EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory.create(), (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create());
            this.stripePaymentLauncherProvider = stripePaymentLauncher_FactoryCreate;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.createFactoryProvider(stripePaymentLauncher_FactoryCreate);
            dagger.internal.Factory factoryCreateNullable = InstanceFactory.createNullable(num);
            this.statusBarColorProvider = factoryCreateNullable;
            this.providesIntentConfirmationDefinitionProvider = IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory.create((Provider<IntentConfirmationInterceptor>) this.defaultIntentConfirmationInterceptorProvider, this.stripePaymentLauncherAssistedFactoryProvider, (Provider<Integer>) factoryCreateNullable, this.providePaymentConfigurationProvider);
            this.linkStoreProvider = DoubleCheck.provider((Provider) LinkStore_Factory.create(this.providesContextProvider));
            Provider<LinkComponent.Builder> provider3 = new Provider<LinkComponent.Builder>() { // from class: com.stripe.android.paymentelement.embedded.content.DaggerEmbeddedPaymentElementViewModelComponent.EmbeddedPaymentElementViewModelComponentImpl.2
                @Override // javax.inject.Provider
                public LinkComponent.Builder get() {
                    return new LinkComponentBuilder(EmbeddedPaymentElementViewModelComponentImpl.this.embeddedPaymentElementViewModelComponentImpl);
                }
            };
            this.linkComponentBuilderProvider = provider3;
            this.realLinkConfigurationCoordinatorProvider = DoubleCheck.provider((Provider) RealLinkConfigurationCoordinator_Factory.create(provider3));
        }

        private void initialize2(GooglePayLauncherModule googlePayLauncherModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, SavedStateHandle savedStateHandle, Application application, String str, Integer num) {
            Provider<LinkAnalyticsComponent.Builder> provider = new Provider<LinkAnalyticsComponent.Builder>() { // from class: com.stripe.android.paymentelement.embedded.content.DaggerEmbeddedPaymentElementViewModelComponent.EmbeddedPaymentElementViewModelComponentImpl.3
                @Override // javax.inject.Provider
                public LinkAnalyticsComponent.Builder get() {
                    return new LinkAnalyticsComponentBuilder(EmbeddedPaymentElementViewModelComponentImpl.this.embeddedPaymentElementViewModelComponentImpl);
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
            GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate = GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.providesContextProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.provideGooglePayRepositoryFactoryProvider = googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate;
            GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_FactoryCreate = GooglePayPaymentMethodLauncher_Factory.create(this.providesContextProvider, (Provider<Function1<GooglePayEnvironment, GooglePayRepository>>) googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.googlePayPaymentMethodLauncherProvider = googlePayPaymentMethodLauncher_FactoryCreate;
            this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.createFactoryProvider(googlePayPaymentMethodLauncher_FactoryCreate);
            RealUserFacingLogger_Factory realUserFacingLogger_FactoryCreate = RealUserFacingLogger_Factory.create(this.providesContextProvider);
            this.realUserFacingLoggerProvider = realUserFacingLogger_FactoryCreate;
            this.googlePayConfirmationDefinitionProvider = GooglePayConfirmationDefinition_Factory.create(this.googlePayPaymentMethodLauncherFactoryProvider, (Provider<UserFacingLogger>) realUserFacingLogger_FactoryCreate);
            this.nativeLinkActivityContractProvider = NativeLinkActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            WebLinkActivityContract_Factory webLinkActivityContract_FactoryCreate = WebLinkActivityContract_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.webLinkActivityContractProvider = webLinkActivityContract_FactoryCreate;
            LinkActivityContract_Factory linkActivityContract_FactoryCreate = LinkActivityContract_Factory.create(this.nativeLinkActivityContractProvider, (Provider<WebLinkActivityContract>) webLinkActivityContract_FactoryCreate, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create());
            this.linkActivityContractProvider = linkActivityContract_FactoryCreate;
            this.linkPaymentLauncherProvider = DoubleCheck.provider((Provider) LinkPaymentLauncher_Factory.create(this.linkAnalyticsComponentBuilderProvider, this.paymentElementCallbackIdentifierProvider, (Provider<LinkActivityContract>) linkActivityContract_FactoryCreate, this.linkStoreProvider));
            dagger.internal.Factory factoryCreate = InstanceFactory.create(savedStateHandle);
            this.savedStateHandleProvider = factoryCreate;
            Provider<LinkAccountHolder> provider2 = DoubleCheck.provider((Provider) EmbeddedPaymentElementViewModelModule_Companion_ProvidesLinkAccountHolderFactory.create((Provider<SavedStateHandle>) factoryCreate));
            this.providesLinkAccountHolderProvider = provider2;
            this.linkConfirmationDefinitionProvider = LinkConfirmationDefinition_Factory.create(this.linkPaymentLauncherProvider, this.linkStoreProvider, provider2);
            ShopPayActivityContract_Factory shopPayActivityContract_FactoryCreate = ShopPayActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            this.shopPayActivityContractProvider = shopPayActivityContract_FactoryCreate;
            this.shopPayConfirmationDefinitionProvider = ShopPayConfirmationDefinition_Factory.create((Provider<ShopPayActivityContract>) shopPayActivityContract_FactoryCreate);
            SetFactory setFactoryBuild = SetFactory.builder(10, 0).addProvider((Provider) this.providesIntentConfirmationDefinitionProvider).addProvider((Provider) this.providesLinkConfirmationDefinitionProvider).addProvider((Provider) this.cvcRecollectionConfirmationDefinitionProvider).addProvider((Provider) this.passiveChallengeConfirmationDefinitionProvider).addProvider((Provider) this.bacsConfirmationDefinitionProvider).addProvider((Provider) this.externalPaymentMethodConfirmationDefinitionProvider).addProvider((Provider) this.customPaymentMethodConfirmationDefinitionProvider).addProvider((Provider) this.googlePayConfirmationDefinitionProvider).addProvider((Provider) this.linkConfirmationDefinitionProvider).addProvider((Provider) this.shopPayConfirmationDefinitionProvider).build();
            this.setOfConfirmationDefinitionOfAndAndAndProvider = setFactoryBuild;
            this.providesConfirmationRegistryProvider = ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory.create((Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>>) setFactoryBuild);
        }

        private void initialize3(GooglePayLauncherModule googlePayLauncherModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, SavedStateHandle savedStateHandle, Application application, String str, Integer num) {
            DefaultConfirmationHandler_Factory_Factory defaultConfirmationHandler_Factory_FactoryCreate = DefaultConfirmationHandler_Factory_Factory.create(this.providesConfirmationRegistryProvider, this.savedStateHandleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.factoryProvider = defaultConfirmationHandler_Factory_FactoryCreate;
            Provider<ConfirmationHandler> provider = DoubleCheck.provider((Provider) EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory.create((Provider<ConfirmationHandler.Factory>) defaultConfirmationHandler_Factory_FactoryCreate, this.provideViewModelScopeProvider));
            this.provideConfirmationHandlerProvider = provider;
            this.embeddedConfirmationStarterProvider = DoubleCheck.provider((Provider) EmbeddedConfirmationStarter_Factory.create(provider, this.provideViewModelScopeProvider));
            Provider<EmbeddedSelectionHolder> provider2 = DoubleCheck.provider((Provider) EmbeddedSelectionHolder_Factory.create(this.savedStateHandleProvider));
            this.embeddedSelectionHolderProvider = provider2;
            this.embeddedConfirmationStateHolderProvider = DoubleCheck.provider((Provider) EmbeddedConfirmationStateHolder_Factory.create(this.savedStateHandleProvider, provider2, this.provideViewModelScopeProvider));
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.providesContextProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLoggerProvider);
            this.providesAnalyticEventCallbackProvider = EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create(this.providesContextProvider, (Provider<EventReporter.Mode>) EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory.create(), (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<DurationProvider>) EmbeddedCommonModule_Companion_ProvideDurationProviderFactory.create(), this.providesAnalyticEventCallbackProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
            EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory embeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactoryCreate = EmbeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactory.create(this.embeddedConfirmationStateHolderProvider);
            this.providePaymentMethodMetadataProvider = embeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactoryCreate;
            this.provideCustomerStateHolderProvider = DoubleCheck.provider((Provider) EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory.create(this.savedStateHandleProvider, this.embeddedSelectionHolderProvider, (Provider<StateFlow<PaymentMethodMetadata>>) embeddedPaymentElementViewModelModule_Companion_ProvidePaymentMethodMetadataFactoryCreate));
            this.provideUiContextProvider = DoubleCheck.provider((Provider) EmbeddedCommonModule_Companion_ProvideUiContextFactory.create());
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create()));
            Provider<LinkHandler> provider3 = DoubleCheck.provider((Provider) LinkHandler_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider));
            this.linkHandlerProvider = provider3;
            this.defaultEmbeddedLinkHelperProvider = DefaultEmbeddedLinkHelper_Factory.create(provider3);
            EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory embeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactoryCreate = EmbeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.providesInternalRowSelectionCallbackProvider = embeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactoryCreate;
            this.defaultEmbeddedRowSelectionImmediateActionHandlerProvider = DefaultEmbeddedRowSelectionImmediateActionHandler_Factory.create(this.provideViewModelScopeProvider, (Provider<Function0<Unit>>) embeddedPaymentElementViewModelModule_Companion_ProvidesInternalRowSelectionCallbackFactoryCreate);
            this.defaultEmbeddedWalletsHelperProvider = DefaultEmbeddedWalletsHelper_Factory.create(this.linkHandlerProvider);
            DefaultCardAccountRangeRepositoryFactory_Factory defaultCardAccountRangeRepositoryFactory_FactoryCreate = DefaultCardAccountRangeRepositoryFactory_Factory.create(this.providesContextProvider, (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create(), (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.defaultCardAccountRangeRepositoryFactoryProvider = defaultCardAccountRangeRepositoryFactory_FactoryCreate;
            this.embeddedFormHelperFactoryProvider = EmbeddedFormHelperFactory_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, this.embeddedSelectionHolderProvider, (Provider<CardAccountRangeRepository.Factory>) defaultCardAccountRangeRepositoryFactory_FactoryCreate, this.savedStateHandleProvider);
            Provider<DefaultEmbeddedContentHelper> provider4 = DoubleCheck.provider((Provider) DefaultEmbeddedContentHelper_Factory.create(this.provideViewModelScopeProvider, this.savedStateHandleProvider, this.bindsEventReporterProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideUiContextProvider, (Provider<CustomerRepository>) this.customerApiRepositoryProvider, this.embeddedSelectionHolderProvider, (Provider<EmbeddedLinkHelper>) this.defaultEmbeddedLinkHelperProvider, (Provider<EmbeddedRowSelectionImmediateActionHandler>) this.defaultEmbeddedRowSelectionImmediateActionHandlerProvider, this.providesInternalRowSelectionCallbackProvider, (Provider<EmbeddedWalletsHelper>) this.defaultEmbeddedWalletsHelperProvider, this.provideCustomerStateHolderProvider, this.embeddedFormHelperFactoryProvider, this.provideConfirmationHandlerProvider, this.embeddedConfirmationStateHolderProvider, this.linkPaymentLauncherProvider, this.providesLinkAccountHolderProvider));
            this.defaultEmbeddedContentHelperProvider = provider4;
            this.defaultEmbeddedStateHelperProvider = DefaultEmbeddedStateHelper_Factory.create(this.embeddedSelectionHolderProvider, this.provideCustomerStateHolderProvider, this.embeddedConfirmationStateHolderProvider, (Provider<EmbeddedContentHelper>) provider4, this.providesInternalRowSelectionCallbackProvider);
            this.providesConfirmationStateSupplierProvider = EmbeddedPaymentElementViewModelModule_Companion_ProvidesConfirmationStateSupplierFactory.create(this.embeddedConfirmationStateHolderProvider);
            this.provideResourcesProvider = EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory.create(this.providesContextProvider);
            this.provideStripeImageLoaderProvider = DoubleCheck.provider((Provider) EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory.create(this.providesContextProvider));
        }

        private void initialize4(GooglePayLauncherModule googlePayLauncherModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, SavedStateHandle savedStateHandle, Application application, String str, Integer num) {
            PaymentSelection_IconLoader_Factory paymentSelection_IconLoader_FactoryCreate = PaymentSelection_IconLoader_Factory.create(this.provideResourcesProvider, this.provideStripeImageLoaderProvider);
            this.iconLoaderProvider = paymentSelection_IconLoader_FactoryCreate;
            PaymentOptionDisplayDataFactory_Factory paymentOptionDisplayDataFactory_FactoryCreate = PaymentOptionDisplayDataFactory_Factory.create((Provider<PaymentSelection.IconLoader>) paymentSelection_IconLoader_FactoryCreate, this.providesContextProvider);
            this.paymentOptionDisplayDataFactoryProvider = paymentOptionDisplayDataFactory_FactoryCreate;
            this.defaultPaymentOptionDisplayDataHolderProvider = DoubleCheck.provider((Provider) DefaultPaymentOptionDisplayDataHolder_Factory.create(this.provideViewModelScopeProvider, this.embeddedSelectionHolderProvider, this.providesConfirmationStateSupplierProvider, (Provider<PaymentOptionDisplayDataFactory>) paymentOptionDisplayDataFactory_FactoryCreate));
            this.providePrefsRepositoryFactoryProvider = EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory.create(this.providesContextProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.mobileSessionIdProvider = MobileSessionIdModule_MobileSessionIdProviderFactory.create(mobileSessionIdModule);
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create(this.applicationProvider);
            this.realElementsSessionRepositoryProvider = RealElementsSessionRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.mobileSessionIdProvider, this.provideApplicationIdProvider);
            this.defaultRetrieveCustomerEmailProvider = DefaultRetrieveCustomerEmail_Factory.create((Provider<CustomerRepository>) this.customerApiRepositoryProvider);
            this.defaultLinkAccountStatusProvider = DefaultLinkAccountStatusProvider_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider);
            this.provideLocaleProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate = LinkHoldbackExposureModule_ProvidesLinkRepositoryFactory.create(linkHoldbackExposureModule, this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLoggerProvider, this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.providesLinkRepositoryProvider = linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate;
            DefaultLogLinkHoldbackExperiment_Factory defaultLogLinkHoldbackExperiment_FactoryCreate = DefaultLogLinkHoldbackExperiment_Factory.create(this.bindsEventReporterProvider, (Provider<LinkRepository>) linkHoldbackExposureModule_ProvidesLinkRepositoryFactoryCreate, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, (Provider<EventReporter.Mode>) EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory.create(), this.provideLoggerProvider);
            this.defaultLogLinkHoldbackExperimentProvider = defaultLogLinkHoldbackExperiment_FactoryCreate;
            this.providesLogLinkGlobalHoldbackExposureProvider = LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory.create(linkHoldbackExposureModule, (Provider<DefaultLogLinkHoldbackExperiment>) defaultLogLinkHoldbackExperiment_FactoryCreate);
            this.externalPaymentMethodsRepositoryProvider = ExternalPaymentMethodsRepository_Factory.create((Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.defaultPaymentElementLoaderProvider = DoubleCheck.provider((Provider) DefaultPaymentElementLoader_Factory.create(this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, (Provider<ElementsSessionRepository>) this.realElementsSessionRepositoryProvider, (Provider<CustomerRepository>) this.customerApiRepositoryProvider, (Provider<LpmRepository>) LpmRepository_Factory.create(), this.provideLoggerProvider, this.bindsEventReporterProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkAccountStatusProvider>) this.defaultLinkAccountStatusProvider, this.providesLogLinkGlobalHoldbackExposureProvider, this.linkStoreProvider, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create(), this.externalPaymentMethodsRepositoryProvider, (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider, (Provider<CvcRecollectionHandler>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory.create()));
            this.sheetStateHolderProvider = DoubleCheck.provider((Provider) SheetStateHolder_Factory.create(this.savedStateHandleProvider));
            EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory embeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactoryCreate = EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory.create(this.providePaymentConfigurationProvider);
            this.providesIsLiveModeProvider = embeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactoryCreate;
            this.defaultEmbeddedConfigurationHandlerProvider = DefaultEmbeddedConfigurationHandler_Factory.create((Provider<PaymentElementLoader>) this.defaultPaymentElementLoaderProvider, this.savedStateHandleProvider, this.sheetStateHolderProvider, this.bindsEventReporterProvider, this.providesInternalRowSelectionCallbackProvider, (Provider<Function0<Boolean>>) embeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactoryCreate);
            DefaultEmbeddedSelectionChooser_Factory defaultEmbeddedSelectionChooser_FactoryCreate = DefaultEmbeddedSelectionChooser_Factory.create(this.savedStateHandleProvider, this.embeddedFormHelperFactoryProvider, this.bindsEventReporterProvider, this.provideViewModelScopeProvider, this.providesInternalRowSelectionCallbackProvider);
            this.defaultEmbeddedSelectionChooserProvider = defaultEmbeddedSelectionChooser_FactoryCreate;
            this.defaultEmbeddedConfigurationCoordinatorProvider = DoubleCheck.provider((Provider) DefaultEmbeddedConfigurationCoordinator_Factory.create(this.embeddedConfirmationStateHolderProvider, (Provider<EmbeddedConfigurationHandler>) this.defaultEmbeddedConfigurationHandlerProvider, this.embeddedSelectionHolderProvider, (Provider<EmbeddedSelectionChooser>) defaultEmbeddedSelectionChooser_FactoryCreate, (Provider<EmbeddedStateHelper>) this.defaultEmbeddedStateHelperProvider, this.provideViewModelScopeProvider));
            Provider<ConsumersApiService> provider = DoubleCheck.provider((Provider) LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create()));
            this.provideConsumersApiServiceProvider = provider;
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, provider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLoggerProvider, (Provider<DurationProvider>) EmbeddedCommonModule_Companion_ProvideDurationProviderFactory.create());
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            this.bindLinkEventsReporterProvider = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
        }

        @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementViewModelComponent
        public EmbeddedPaymentElementViewModel getViewModel() {
            return this.embeddedPaymentElementViewModelProvider.get();
        }
    }
}
