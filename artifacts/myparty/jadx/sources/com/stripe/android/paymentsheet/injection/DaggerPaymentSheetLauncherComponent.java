package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
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
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationRegistry;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory;
import com.stripe.android.paymentelement.confirmation.challenge.PassiveChallengeConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.injection.ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;
import com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;
import com.stripe.android.paymentelement.confirmation.link.LinkConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory;
import com.stripe.android.paymentelement.confirmation.shoppay.ShopPayConfirmationDefinition;
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
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
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
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository_Factory;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class DaggerPaymentSheetLauncherComponent {
    private DaggerPaymentSheetLauncherComponent() {
    }

    public static PaymentSheetLauncherComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements PaymentSheetLauncherComponent.Builder {
        private Application application;
        private String paymentElementCallbackIdentifier;
        private SavedStateHandle savedStateHandle;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder paymentElementCallbackIdentifier(String str) {
            this.paymentElementCallbackIdentifier = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public PaymentSheetLauncherComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.paymentElementCallbackIdentifier, String.class);
            return new PaymentSheetLauncherComponentImpl(new GooglePayLauncherModule(), new CoroutineContextModule(), new CoreCommonModule(), new MobileSessionIdModule(), new LinkHoldbackExposureModule(), this.application, this.savedStateHandle, this.paymentElementCallbackIdentifier);
        }
    }

    private static final class PaymentSheetViewModelSubcomponentBuilder implements PaymentSheetViewModelSubcomponent.Builder {
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private PaymentSheetViewModelModule paymentSheetViewModelModule;

        private PaymentSheetViewModelSubcomponentBuilder(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl) {
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponentBuilder paymentSheetViewModelModule(PaymentSheetViewModelModule paymentSheetViewModelModule) {
            this.paymentSheetViewModelModule = (PaymentSheetViewModelModule) Preconditions.checkNotNull(paymentSheetViewModelModule);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.paymentSheetViewModelModule, PaymentSheetViewModelModule.class);
            return new PaymentSheetViewModelSubcomponentImpl(this.paymentSheetLauncherComponentImpl, this.paymentSheetViewModelModule);
        }
    }

    private static final class csali2_LinkAnalyticsComponentBuilder implements LinkAnalyticsComponent.Builder {
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private final PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl;

        private csali2_LinkAnalyticsComponentBuilder(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl, PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl) {
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            this.paymentSheetViewModelSubcomponentImpl = paymentSheetViewModelSubcomponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent.Builder
        public LinkAnalyticsComponent build() {
            return new csali2_LinkAnalyticsComponentImpl(this.paymentSheetLauncherComponentImpl, this.paymentSheetViewModelSubcomponentImpl);
        }
    }

    private static final class LinkComponentBuilder implements LinkComponent.Builder {
        private LinkConfiguration configuration;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;

        private LinkComponentBuilder(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl) {
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            return new LinkComponentImpl(this.paymentSheetLauncherComponentImpl, this.configuration);
        }
    }

    private static final class csali_LinkAnalyticsComponentBuilder implements LinkAnalyticsComponent.Builder {
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;

        private csali_LinkAnalyticsComponentBuilder(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl) {
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent.Builder
        public LinkAnalyticsComponent build() {
            return new csali_LinkAnalyticsComponentImpl(this.paymentSheetLauncherComponentImpl);
        }
    }

    private static final class csali2_LinkAnalyticsComponentImpl implements LinkAnalyticsComponent {
        private final csali2_LinkAnalyticsComponentImpl _csali2_LinkAnalyticsComponentImpl;
        private Provider<LinkAnalyticsHelper> bindLinkAnalyticsHelperProvider;
        private Provider<DefaultLinkAnalyticsHelper> defaultLinkAnalyticsHelperProvider;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private final PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl;

        private csali2_LinkAnalyticsComponentImpl(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl, PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl) {
            this._csali2_LinkAnalyticsComponentImpl = this;
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            this.paymentSheetViewModelSubcomponentImpl = paymentSheetViewModelSubcomponentImpl;
            initialize();
        }

        private void initialize() {
            DefaultLinkAnalyticsHelper_Factory defaultLinkAnalyticsHelper_FactoryCreate = DefaultLinkAnalyticsHelper_Factory.create((Provider<LinkEventsReporter>) this.paymentSheetLauncherComponentImpl.bindLinkEventsReporterProvider);
            this.defaultLinkAnalyticsHelperProvider = defaultLinkAnalyticsHelper_FactoryCreate;
            this.bindLinkAnalyticsHelperProvider = DoubleCheck.provider((Provider) defaultLinkAnalyticsHelper_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent
        public LinkAnalyticsHelper getLinkAnalyticsHelper() {
            return this.bindLinkAnalyticsHelperProvider.get();
        }
    }

    private static final class PaymentSheetViewModelSubcomponentImpl implements PaymentSheetViewModelSubcomponent {
        private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private final PaymentSheetViewModelModule paymentSheetViewModelModule;
        private final PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl;
        private Provider<ConfirmCustomPaymentMethodCallback> provideConfirmCustomPaymentMethodCallbackProvider;
        private Provider<CreateIntentCallback> providesCreateIntentCallbackProvider;
        private Provider<ExternalPaymentMethodConfirmHandler> providesExternalPaymentMethodConfirmHandlerProvider;
        private Provider<PreparePaymentMethodHandler> providesPreparePaymentMethodHandlerProvider;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private PaymentSheetViewModelSubcomponentImpl(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl, PaymentSheetViewModelModule paymentSheetViewModelModule) {
            this.paymentSheetViewModelSubcomponentImpl = this;
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            this.paymentSheetViewModelModule = paymentSheetViewModelModule;
            initialize(paymentSheetViewModelModule);
        }

        private PrefsRepository prefsRepository() {
            return PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory.providePrefsRepository(this.paymentSheetViewModelModule, this.paymentSheetLauncherComponentImpl.application, (CoroutineContext) this.paymentSheetLauncherComponentImpl.provideWorkContextProvider.get());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor() {
            return new DefaultIntentConfirmationInterceptor(this.paymentSheetLauncherComponentImpl.stripeApiRepository(), this.paymentSheetLauncherComponentImpl.realErrorReporter(), this.providesCreateIntentCallbackProvider, this.providesPreparePaymentMethodHandlerProvider, ((Boolean) this.paymentSheetLauncherComponentImpl.provideAllowsManualConfirmationProvider.get()).booleanValue(), this.paymentSheetLauncherComponentImpl.namedFunction0OfString(), this.paymentSheetLauncherComponentImpl.namedFunction0OfString2());
        }

        private ConfirmationDefinition<?, ?, ?, ?> providesIntentConfirmationDefinition() {
            return IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory.providesIntentConfirmationDefinition(defaultIntentConfirmationInterceptor(), this.stripePaymentLauncherAssistedFactoryProvider.get(), this.paymentSheetViewModelModule.providesStatusBarColor(), this.paymentSheetLauncherComponentImpl.providePaymentConfigurationProvider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ConfirmationDefinition<?, ?, ?, ?> providesLinkConfirmationDefinition() {
            return LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory.providesLinkConfirmationDefinition((LinkStore) this.paymentSheetLauncherComponentImpl.linkStoreProvider.get(), (LinkConfigurationCoordinator) this.paymentSheetLauncherComponentImpl.realLinkConfigurationCoordinatorProvider.get(), new csali2_LinkAnalyticsComponentBuilder(this.paymentSheetLauncherComponentImpl, this.paymentSheetViewModelSubcomponentImpl));
        }

        private PassiveChallengeConfirmationDefinition passiveChallengeConfirmationDefinition() {
            return new PassiveChallengeConfirmationDefinition(this.paymentSheetLauncherComponentImpl.realErrorReporter());
        }

        private BacsConfirmationDefinition bacsConfirmationDefinition() {
            return new BacsConfirmationDefinition(BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory.providesBacsMandateConfirmationLauncherFactory());
        }

        private ExternalPaymentMethodConfirmationDefinition externalPaymentMethodConfirmationDefinition() {
            return new ExternalPaymentMethodConfirmationDefinition(this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifier, this.providesExternalPaymentMethodConfirmHandlerProvider, this.paymentSheetLauncherComponentImpl.realErrorReporter());
        }

        private CustomPaymentMethodConfirmationDefinition customPaymentMethodConfirmationDefinition() {
            return new CustomPaymentMethodConfirmationDefinition(this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifier, this.provideConfirmCustomPaymentMethodCallbackProvider, this.paymentSheetLauncherComponentImpl.realErrorReporter());
        }

        private GooglePayConfirmationDefinition googlePayConfirmationDefinition() {
            return new GooglePayConfirmationDefinition(this.googlePayPaymentMethodLauncherFactoryProvider.get(), this.paymentSheetLauncherComponentImpl.realUserFacingLogger());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private LinkConfirmationDefinition linkConfirmationDefinition() {
            return new LinkConfirmationDefinition((LinkPaymentLauncher) this.paymentSheetLauncherComponentImpl.linkPaymentLauncherProvider.get(), (LinkStore) this.paymentSheetLauncherComponentImpl.linkStoreProvider.get(), (LinkAccountHolder) this.paymentSheetLauncherComponentImpl.providesLinkAccountHolderProvider.get());
        }

        private ShopPayActivityContract shopPayActivityContract() {
            return new ShopPayActivityContract(this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifier);
        }

        private ShopPayConfirmationDefinition shopPayConfirmationDefinition() {
            return new ShopPayConfirmationDefinition(shopPayActivityContract());
        }

        private Set<ConfirmationDefinition<?, ?, ?, ?>> setOfConfirmationDefinitionOfAndAndAnd() {
            return SetBuilder.newSetBuilder(9).add(providesIntentConfirmationDefinition()).add(providesLinkConfirmationDefinition()).add(passiveChallengeConfirmationDefinition()).add(bacsConfirmationDefinition()).add(externalPaymentMethodConfirmationDefinition()).add(customPaymentMethodConfirmationDefinition()).add(googlePayConfirmationDefinition()).add(linkConfirmationDefinition()).add(shopPayConfirmationDefinition()).build();
        }

        private ConfirmationRegistry confirmationRegistry() {
            return ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory.providesConfirmationRegistry(setOfConfirmationDefinitionOfAndAndAnd());
        }

        private DefaultConfirmationHandler.Factory defaultConfirmationHandlerFactory() {
            return new DefaultConfirmationHandler.Factory(confirmationRegistry(), this.paymentSheetLauncherComponentImpl.savedStateHandle, this.paymentSheetLauncherComponentImpl.realErrorReporter(), (CoroutineContext) this.paymentSheetLauncherComponentImpl.provideWorkContextProvider.get());
        }

        private Function0<Boolean> namedFunction0OfBoolean() {
            return PaymentSheetViewModelModule_IsLiveModeFactory.isLiveMode(this.paymentSheetViewModelModule, this.paymentSheetLauncherComponentImpl.providePaymentConfigurationProvider);
        }

        private void initialize(PaymentSheetViewModelModule paymentSheetViewModelModule) {
            this.providesCreateIntentCallbackProvider = IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.create((Provider<String>) this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifierProvider);
            this.providesPreparePaymentMethodHandlerProvider = IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory.create((Provider<String>) this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifierProvider);
            StripePaymentLauncher_Factory stripePaymentLauncher_FactoryCreate = StripePaymentLauncher_Factory.create((Provider<Boolean>) this.paymentSheetLauncherComponentImpl.provideEnabledLoggingProvider, (Provider<Set<String>>) this.paymentSheetLauncherComponentImpl.provideProductUsageTokensProvider);
            this.stripePaymentLauncherProvider = stripePaymentLauncher_FactoryCreate;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.createFactoryProvider(stripePaymentLauncher_FactoryCreate);
            this.providesExternalPaymentMethodConfirmHandlerProvider = ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory.create((Provider<String>) this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifierProvider);
            this.provideConfirmCustomPaymentMethodCallbackProvider = CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory.create((Provider<String>) this.paymentSheetLauncherComponentImpl.paymentElementCallbackIdentifierProvider);
            GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_FactoryCreate = GooglePayPaymentMethodLauncher_Factory.create((Provider<Context>) this.paymentSheetLauncherComponentImpl.applicationProvider, (Provider<Function1<GooglePayEnvironment, GooglePayRepository>>) this.paymentSheetLauncherComponentImpl.provideGooglePayRepositoryFactoryProvider, (Provider<PaymentAnalyticsRequestFactory>) this.paymentSheetLauncherComponentImpl.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.paymentSheetLauncherComponentImpl.defaultAnalyticsRequestExecutorProvider);
            this.googlePayPaymentMethodLauncherProvider = googlePayPaymentMethodLauncher_FactoryCreate;
            this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.createFactoryProvider(googlePayPaymentMethodLauncher_FactoryCreate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent
        public PaymentSheetViewModel getViewModel() {
            return new PaymentSheetViewModel(PaymentSheetViewModelModule_ProvideArgsFactory.provideArgs(this.paymentSheetViewModelModule), (EventReporter) this.paymentSheetLauncherComponentImpl.bindsEventReporterProvider.get(), (PaymentElementLoader) this.paymentSheetLauncherComponentImpl.defaultPaymentElementLoaderProvider.get(), (CustomerRepository) this.paymentSheetLauncherComponentImpl.customerApiRepositoryProvider.get(), prefsRepository(), (Logger) this.paymentSheetLauncherComponentImpl.provideLoggerProvider.get(), (CoroutineContext) this.paymentSheetLauncherComponentImpl.provideWorkContextProvider.get(), this.paymentSheetLauncherComponentImpl.savedStateHandle, (LinkHandler) this.paymentSheetLauncherComponentImpl.linkHandlerProvider.get(), defaultConfirmationHandlerFactory(), this.paymentSheetLauncherComponentImpl.defaultCardAccountRangeRepositoryFactory(), this.paymentSheetLauncherComponentImpl.realErrorReporter(), (CvcRecollectionHandler) this.paymentSheetLauncherComponentImpl.provideCVCRecollectionHandlerProvider.get(), PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory.providesCvcRecollectionInteractorFactory(), namedFunction0OfBoolean());
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
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private Provider<String> provideApplicationIdProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;

        private LinkComponentImpl(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl, LinkConfiguration linkConfiguration) {
            this.linkComponentImpl = this;
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            this.configuration = linkConfiguration;
            initialize(linkConfiguration);
        }

        private void initialize(LinkConfiguration linkConfiguration) {
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            DefaultLinkAccountManager_Factory defaultLinkAccountManager_FactoryCreate = DefaultLinkAccountManager_Factory.create((Provider<LinkAccountHolder>) this.paymentSheetLauncherComponentImpl.providesLinkAccountHolderProvider, this.configurationProvider, (Provider<LinkRepository>) this.paymentSheetLauncherComponentImpl.bindLinkRepositoryProvider, (Provider<LinkEventsReporter>) this.paymentSheetLauncherComponentImpl.bindLinkEventsReporterProvider, (Provider<ErrorReporter>) this.paymentSheetLauncherComponentImpl.realErrorReporterProvider);
            this.defaultLinkAccountManagerProvider = defaultLinkAccountManager_FactoryCreate;
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) defaultLinkAccountManager_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create((Provider<Application>) this.paymentSheetLauncherComponentImpl.applicationProvider));
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create((Provider<Application>) this.paymentSheetLauncherComponentImpl.applicationProvider);
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, (Provider<ErrorReporter>) this.paymentSheetLauncherComponentImpl.realErrorReporterProvider, this.provideApplicationIdProvider);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            Provider<LinkAuth> provider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.bindsLinkAuthProvider = provider;
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, provider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, (Provider<ErrorReporter>) this.paymentSheetLauncherComponentImpl.realErrorReporterProvider, (Provider<CoroutineContext>) this.paymentSheetLauncherComponentImpl.provideWorkContextProvider);
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_FactoryCreate = C1043InlineSignupViewModel_Factory.create(this.configurationProvider, this.bindLinkAccountManagerProvider, (Provider<LinkEventsReporter>) this.paymentSheetLauncherComponentImpl.bindLinkEventsReporterProvider, (Provider<Logger>) this.paymentSheetLauncherComponentImpl.provideLoggerProvider);
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

    private static final class csali_LinkAnalyticsComponentImpl implements LinkAnalyticsComponent {
        private final csali_LinkAnalyticsComponentImpl _csali_LinkAnalyticsComponentImpl;
        private Provider<LinkAnalyticsHelper> bindLinkAnalyticsHelperProvider;
        private Provider<DefaultLinkAnalyticsHelper> defaultLinkAnalyticsHelperProvider;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;

        private csali_LinkAnalyticsComponentImpl(PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl) {
            this._csali_LinkAnalyticsComponentImpl = this;
            this.paymentSheetLauncherComponentImpl = paymentSheetLauncherComponentImpl;
            initialize();
        }

        private void initialize() {
            DefaultLinkAnalyticsHelper_Factory defaultLinkAnalyticsHelper_FactoryCreate = DefaultLinkAnalyticsHelper_Factory.create((Provider<LinkEventsReporter>) this.paymentSheetLauncherComponentImpl.bindLinkEventsReporterProvider);
            this.defaultLinkAnalyticsHelperProvider = defaultLinkAnalyticsHelper_FactoryCreate;
            this.bindLinkAnalyticsHelperProvider = DoubleCheck.provider((Provider) defaultLinkAnalyticsHelper_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent
        public LinkAnalyticsHelper getLinkAnalyticsHelper() {
            return this.bindLinkAnalyticsHelperProvider.get();
        }
    }

    private static final class PaymentSheetLauncherComponentImpl implements PaymentSheetLauncherComponent {
        private final Application application;
        private Provider<Application> applicationProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<CustomerApiRepository> customerApiRepositoryProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultLinkAccountStatusProvider> defaultLinkAccountStatusProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<DefaultLogLinkHoldbackExperiment> defaultLogLinkHoldbackExperimentProvider;
        private Provider<DefaultPaymentElementLoader> defaultPaymentElementLoaderProvider;
        private Provider<DefaultRetrieveCustomerEmail> defaultRetrieveCustomerEmailProvider;
        private Provider<ExternalPaymentMethodsRepository> externalPaymentMethodsRepositoryProvider;
        private Provider<LinkActivityContract> linkActivityContractProvider;
        private Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
        private Provider<LinkApiRepository> linkApiRepositoryProvider;
        private Provider<LinkComponent.Builder> linkComponentBuilderProvider;
        private Provider<LinkHandler> linkHandlerProvider;
        private Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Provider<LinkStore> linkStoreProvider;
        private Provider<String> mobileSessionIdProvider;
        private Provider<NativeLinkActivityContract> nativeLinkActivityContractProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private final String paymentElementCallbackIdentifier;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private final PaymentSheetLauncherComponentImpl paymentSheetLauncherComponentImpl;
        private Provider<Boolean> provideAllowsManualConfirmationProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<CvcRecollectionHandler> provideCVCRecollectionHandlerProvider;
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
        private final SavedStateHandle savedStateHandle;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<WebLinkActivityContract> webLinkActivityContractProvider;

        private PaymentSheetLauncherComponentImpl(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            this.paymentSheetLauncherComponentImpl = this;
            this.application = application;
            this.savedStateHandle = savedStateHandle;
            this.paymentElementCallbackIdentifier = str;
            initialize(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, application, savedStateHandle, str);
            initialize2(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, application, savedStateHandle, str);
            initialize3(googlePayLauncherModule, coroutineContextModule, coreCommonModule, mobileSessionIdModule, linkHoldbackExposureModule, application, savedStateHandle, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Function0<String> namedFunction0OfString() {
            return PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(this.providePaymentConfigurationProvider);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.application, namedFunction0OfString(), this.provideProductUsageTokensProvider.get());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.application, namedFunction0OfString(), this.provideWorkContextProvider.get(), this.provideProductUsageTokensProvider.get(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RealErrorReporter realErrorReporter() {
            return new RealErrorReporter(defaultAnalyticsRequestExecutor(), paymentAnalyticsRequestFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Function0<String> namedFunction0OfString2() {
            return PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.provideStripeAccountId(this.providePaymentConfigurationProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RealUserFacingLogger realUserFacingLogger() {
            return new RealUserFacingLogger(this.application);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory() {
            return new DefaultCardAccountRangeRepositoryFactory(this.application, this.provideProductUsageTokensProvider.get(), defaultAnalyticsRequestExecutor());
        }

        private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            this.applicationProvider = InstanceFactory.create(application);
            this.provideEventReporterModeProvider = DoubleCheck.provider((Provider) PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory.create());
            Provider<Boolean> provider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = provider;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, provider));
            Provider<CoroutineContext> provider2 = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = provider2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, provider2);
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create((Provider<Context>) this.applicationProvider, this.provideWorkContextProvider, this.provideLoggerProvider);
            PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) this.applicationProvider);
            this.providePaymentConfigurationProvider = paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            Provider<Set<String>> provider3 = DoubleCheck.provider((Provider) PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory.create());
            this.provideProductUsageTokensProvider = provider3;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create((Provider<Context>) this.applicationProvider, this.providePublishableKeyProvider, provider3);
            this.provideDurationProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory.create());
            Factory factoryCreate = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate;
            this.providesAnalyticEventCallbackProvider = PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create((Provider<String>) factoryCreate);
            this.realUserFacingLoggerProvider = RealUserFacingLogger_Factory.create((Provider<Context>) this.applicationProvider);
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create((Provider<Context>) this.applicationProvider, this.provideEventReporterModeProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideDurationProvider, this.providesAnalyticEventCallbackProvider, this.provideWorkContextProvider, (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
            this.providePrefsRepositoryFactoryProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory.create((Provider<Context>) this.applicationProvider, this.provideWorkContextProvider));
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            this.provideGooglePayRepositoryFactoryProvider = GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, (Provider<Context>) this.applicationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) realErrorReporter_FactoryCreate);
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create((Provider<Context>) this.applicationProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.mobileSessionIdProvider = MobileSessionIdModule_MobileSessionIdProviderFactory.create(mobileSessionIdModule);
            ApplicationIdModule_ProvideApplicationIdFactory applicationIdModule_ProvideApplicationIdFactoryCreate = ApplicationIdModule_ProvideApplicationIdFactory.create(this.applicationProvider);
            this.provideApplicationIdProvider = applicationIdModule_ProvideApplicationIdFactoryCreate;
            this.realElementsSessionRepositoryProvider = RealElementsSessionRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideWorkContextProvider, this.mobileSessionIdProvider, (Provider<String>) applicationIdModule_ProvideApplicationIdFactoryCreate);
            this.customerApiRepositoryProvider = DoubleCheck.provider((Provider) CustomerApiRepository_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
        }

        private void initialize2(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            this.defaultRetrieveCustomerEmailProvider = DefaultRetrieveCustomerEmail_Factory.create((Provider<CustomerRepository>) this.customerApiRepositoryProvider);
            Provider<LinkComponent.Builder> provider = new Provider<LinkComponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent.PaymentSheetLauncherComponentImpl.1
                @Override // javax.inject.Provider
                public LinkComponent.Builder get() {
                    return new LinkComponentBuilder(PaymentSheetLauncherComponentImpl.this.paymentSheetLauncherComponentImpl);
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
            this.linkStoreProvider = DoubleCheck.provider((Provider) LinkStore_Factory.create((Provider<Context>) this.applicationProvider));
            this.externalPaymentMethodsRepositoryProvider = ExternalPaymentMethodsRepository_Factory.create((Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.provideCVCRecollectionHandlerProvider = DoubleCheck.provider((Provider) PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory.create());
            this.defaultPaymentElementLoaderProvider = DoubleCheck.provider((Provider) DefaultPaymentElementLoader_Factory.create(this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, (Provider<ElementsSessionRepository>) this.realElementsSessionRepositoryProvider, (Provider<CustomerRepository>) this.customerApiRepositoryProvider, (Provider<LpmRepository>) LpmRepository_Factory.create(), this.provideLoggerProvider, this.bindsEventReporterProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, (Provider<RetrieveCustomerEmail>) this.defaultRetrieveCustomerEmailProvider, (Provider<LinkAccountStatusProvider>) this.defaultLinkAccountStatusProvider, this.providesLogLinkGlobalHoldbackExposureProvider, this.linkStoreProvider, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create(), this.externalPaymentMethodsRepositoryProvider, (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider, this.provideCVCRecollectionHandlerProvider));
            this.linkHandlerProvider = DoubleCheck.provider((Provider) LinkHandler_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider));
            this.provideAllowsManualConfirmationProvider = DoubleCheck.provider((Provider) PaymentSheetLauncherModule_Companion_ProvideAllowsManualConfirmationFactory.create());
            this.linkAnalyticsComponentBuilderProvider = new Provider<LinkAnalyticsComponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent.PaymentSheetLauncherComponentImpl.2
                @Override // javax.inject.Provider
                public LinkAnalyticsComponent.Builder get() {
                    return new csali_LinkAnalyticsComponentBuilder(PaymentSheetLauncherComponentImpl.this.paymentSheetLauncherComponentImpl);
                }
            };
            this.nativeLinkActivityContractProvider = NativeLinkActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            WebLinkActivityContract_Factory webLinkActivityContract_FactoryCreate = WebLinkActivityContract_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.webLinkActivityContractProvider = webLinkActivityContract_FactoryCreate;
            LinkActivityContract_Factory linkActivityContract_FactoryCreate = LinkActivityContract_Factory.create(this.nativeLinkActivityContractProvider, (Provider<WebLinkActivityContract>) webLinkActivityContract_FactoryCreate, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create());
            this.linkActivityContractProvider = linkActivityContract_FactoryCreate;
            this.linkPaymentLauncherProvider = DoubleCheck.provider((Provider) LinkPaymentLauncher_Factory.create(this.linkAnalyticsComponentBuilderProvider, this.paymentElementCallbackIdentifierProvider, (Provider<LinkActivityContract>) linkActivityContract_FactoryCreate, this.linkStoreProvider));
            Factory factoryCreate = InstanceFactory.create(savedStateHandle);
            this.savedStateHandleProvider = factoryCreate;
            this.providesLinkAccountHolderProvider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory.create((Provider<SavedStateHandle>) factoryCreate));
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, this.provideWorkContextProvider, this.provideLoggerProvider, this.provideDurationProvider);
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            this.bindLinkEventsReporterProvider = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
            this.provideConsumersApiServiceProvider = DoubleCheck.provider((Provider) LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, this.provideWorkContextProvider));
        }

        private void initialize3(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, MobileSessionIdModule mobileSessionIdModule, LinkHoldbackExposureModule linkHoldbackExposureModule, Application application, SavedStateHandle savedStateHandle, String str) {
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.provideConsumersApiServiceProvider, this.provideWorkContextProvider, this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent
        public PaymentSheetViewModelSubcomponent.Builder getPaymentSheetViewModelSubcomponentBuilder() {
            return new PaymentSheetViewModelSubcomponentBuilder(this.paymentSheetLauncherComponentImpl);
        }
    }
}
