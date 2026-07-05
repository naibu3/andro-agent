package com.stripe.android.paymentelement.embedded.form;

import android.app.Application;
import android.content.Context;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory_Factory;
import com.stripe.android.common.di.ApplicationIdModule_ProvideApplicationIdFactory;
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
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
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
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_IoContextFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideDurationProviderFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvideStripeAccountIdFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory_Factory;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder_Factory;
import com.stripe.android.paymentelement.embedded.form.FormActivitySubcomponent;
import com.stripe.android.paymentelement.embedded.form.FormActivityViewModelComponent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationLauncherFactory;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncherFactory;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.shoppay.ShopPayActivityContract;
import com.stripe.android.shoppay.ShopPayActivityContract_Factory;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
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

/* loaded from: classes5.dex */
public final class DaggerFormActivityViewModelComponent {
    private DaggerFormActivityViewModelComponent() {
    }

    public static FormActivityViewModelComponent.Factory factory() {
        return new Factory();
    }

    private static final class Factory implements FormActivityViewModelComponent.Factory {
        private Factory() {
        }

        @Override // com.stripe.android.paymentelement.embedded.form.FormActivityViewModelComponent.Factory
        public FormActivityViewModelComponent build(PaymentMethodMetadata paymentMethodMetadata, String str, boolean z, Integer num, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String str2, Application application, SavedStateHandle savedStateHandle) {
            Preconditions.checkNotNull(paymentMethodMetadata);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(Boolean.valueOf(z));
            Preconditions.checkNotNull(configuration);
            Preconditions.checkNotNull(initializationMode);
            Preconditions.checkNotNull(str2);
            Preconditions.checkNotNull(application);
            Preconditions.checkNotNull(savedStateHandle);
            return new FormActivityViewModelComponentImpl(new CoreCommonModule(), new GooglePayLauncherModule(), paymentMethodMetadata, str, Boolean.valueOf(z), num, configuration, initializationMode, str2, application, savedStateHandle);
        }
    }

    private static final class FormActivitySubcomponentFactory implements FormActivitySubcomponent.Factory {
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;

        private FormActivitySubcomponentFactory(FormActivityViewModelComponentImpl formActivityViewModelComponentImpl) {
            this.formActivityViewModelComponentImpl = formActivityViewModelComponentImpl;
        }

        @Override // com.stripe.android.paymentelement.embedded.form.FormActivitySubcomponent.Factory
        public FormActivitySubcomponent build(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
            Preconditions.checkNotNull(activityResultCaller);
            Preconditions.checkNotNull(lifecycleOwner);
            return new FormActivitySubcomponentImpl(this.formActivityViewModelComponentImpl, activityResultCaller, lifecycleOwner);
        }
    }

    private static final class LinkComponentBuilder implements LinkComponent.Builder {
        private LinkConfiguration configuration;
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;

        private LinkComponentBuilder(FormActivityViewModelComponentImpl formActivityViewModelComponentImpl) {
            this.formActivityViewModelComponentImpl = formActivityViewModelComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponentBuilder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkComponent.Builder
        public LinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            return new LinkComponentImpl(this.formActivityViewModelComponentImpl, this.configuration);
        }
    }

    private static final class LinkAnalyticsComponentBuilder implements LinkAnalyticsComponent.Builder {
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;

        private LinkAnalyticsComponentBuilder(FormActivityViewModelComponentImpl formActivityViewModelComponentImpl) {
            this.formActivityViewModelComponentImpl = formActivityViewModelComponentImpl;
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent.Builder
        public LinkAnalyticsComponent build() {
            return new LinkAnalyticsComponentImpl(this.formActivityViewModelComponentImpl);
        }
    }

    private static final class FormActivitySubcomponentImpl implements FormActivitySubcomponent {
        private Provider<ActivityResultCaller> activityResultCallerProvider;
        private Provider<DefaultFormActivityConfirmationHelper> defaultFormActivityConfirmationHelperProvider;
        private final FormActivitySubcomponentImpl formActivitySubcomponentImpl;
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;
        private Provider<LifecycleOwner> lifecycleOwnerProvider;

        private FormActivitySubcomponentImpl(FormActivityViewModelComponentImpl formActivityViewModelComponentImpl, ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
            this.formActivitySubcomponentImpl = this;
            this.formActivityViewModelComponentImpl = formActivityViewModelComponentImpl;
            initialize(activityResultCaller, lifecycleOwner);
        }

        private void initialize(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
            this.lifecycleOwnerProvider = InstanceFactory.create(lifecycleOwner);
            this.activityResultCallerProvider = InstanceFactory.create(activityResultCaller);
            this.defaultFormActivityConfirmationHelperProvider = DoubleCheck.provider((Provider) DefaultFormActivityConfirmationHelper_Factory.create((Provider<PaymentElementLoader.InitializationMode>) this.formActivityViewModelComponentImpl.initializationModeProvider, (Provider<PaymentMethodMetadata>) this.formActivityViewModelComponentImpl.paymentMethodMetadataProvider, (Provider<ConfirmationHandler>) this.formActivityViewModelComponentImpl.provideConfirmationHandlerProvider, (Provider<EmbeddedPaymentElement.Configuration>) this.formActivityViewModelComponentImpl.configurationProvider, (Provider<EmbeddedSelectionHolder>) this.formActivityViewModelComponentImpl.embeddedSelectionHolderProvider, (Provider<FormActivityStateHelper>) this.formActivityViewModelComponentImpl.defaultFormActivityStateHelperProvider, (Provider<OnClickOverrideDelegate>) this.formActivityViewModelComponentImpl.provideOnClickOverrideDelegateProvider, (Provider<EventReporter>) this.formActivityViewModelComponentImpl.bindsEventReporterProvider, this.lifecycleOwnerProvider, this.activityResultCallerProvider, (Provider<CoroutineScope>) this.formActivityViewModelComponentImpl.provideViewModelScopeProvider));
        }

        @Override // com.stripe.android.paymentelement.embedded.form.FormActivitySubcomponent
        public void inject(FormActivity formActivity) {
            injectFormActivity(formActivity);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private FormActivity injectFormActivity(FormActivity formActivity) {
            FormActivity_MembersInjector.injectFormInteractor(formActivity, (DefaultVerticalModeFormInteractor) this.formActivityViewModelComponentImpl.provideFormInteractorProvider.get());
            FormActivity_MembersInjector.injectEventReporter(formActivity, (EventReporter) this.formActivityViewModelComponentImpl.bindsEventReporterProvider.get());
            FormActivity_MembersInjector.injectFormActivityStateHelper(formActivity, (FormActivityStateHelper) this.formActivityViewModelComponentImpl.defaultFormActivityStateHelperProvider.get());
            FormActivity_MembersInjector.injectConfirmationHelper(formActivity, this.defaultFormActivityConfirmationHelperProvider.get());
            return formActivity;
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
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;
        private C1043InlineSignupViewModel_Factory inlineSignupViewModelProvider;
        private final LinkComponentImpl linkComponentImpl;
        private Provider<LinkInlineSignupAssistedViewModelFactory> linkInlineSignupAssistedViewModelFactoryProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;

        private LinkComponentImpl(FormActivityViewModelComponentImpl formActivityViewModelComponentImpl, LinkConfiguration linkConfiguration) {
            this.linkComponentImpl = this;
            this.formActivityViewModelComponentImpl = formActivityViewModelComponentImpl;
            this.configuration = linkConfiguration;
            initialize(linkConfiguration);
        }

        private void initialize(LinkConfiguration linkConfiguration) {
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            DefaultLinkAccountManager_Factory defaultLinkAccountManager_FactoryCreate = DefaultLinkAccountManager_Factory.create((Provider<LinkAccountHolder>) this.formActivityViewModelComponentImpl.providesLinkAccountHolderProvider, this.configurationProvider, (Provider<LinkRepository>) this.formActivityViewModelComponentImpl.bindLinkRepositoryProvider, (Provider<LinkEventsReporter>) this.formActivityViewModelComponentImpl.bindLinkEventsReporterProvider, (Provider<ErrorReporter>) this.formActivityViewModelComponentImpl.realErrorReporterProvider);
            this.defaultLinkAccountManagerProvider = defaultLinkAccountManager_FactoryCreate;
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) defaultLinkAccountManager_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create((Provider<Application>) this.formActivityViewModelComponentImpl.applicationProvider));
            this.provideApplicationIdProvider = ApplicationIdModule_ProvideApplicationIdFactory.create((Provider<Application>) this.formActivityViewModelComponentImpl.applicationProvider);
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, (Provider<ErrorReporter>) this.formActivityViewModelComponentImpl.realErrorReporterProvider, this.provideApplicationIdProvider);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            Provider<LinkAuth> provider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.bindsLinkAuthProvider = provider;
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, provider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, (Provider<ErrorReporter>) this.formActivityViewModelComponentImpl.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_FactoryCreate = C1043InlineSignupViewModel_Factory.create(this.configurationProvider, this.bindLinkAccountManagerProvider, (Provider<LinkEventsReporter>) this.formActivityViewModelComponentImpl.bindLinkEventsReporterProvider, (Provider<Logger>) this.formActivityViewModelComponentImpl.provideLoggerProvider);
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
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;
        private final LinkAnalyticsComponentImpl linkAnalyticsComponentImpl;

        private LinkAnalyticsComponentImpl(FormActivityViewModelComponentImpl formActivityViewModelComponentImpl) {
            this.linkAnalyticsComponentImpl = this;
            this.formActivityViewModelComponentImpl = formActivityViewModelComponentImpl;
            initialize();
        }

        private void initialize() {
            DefaultLinkAnalyticsHelper_Factory defaultLinkAnalyticsHelper_FactoryCreate = DefaultLinkAnalyticsHelper_Factory.create((Provider<LinkEventsReporter>) this.formActivityViewModelComponentImpl.bindLinkEventsReporterProvider);
            this.defaultLinkAnalyticsHelperProvider = defaultLinkAnalyticsHelper_FactoryCreate;
            this.bindLinkAnalyticsHelperProvider = DoubleCheck.provider((Provider) defaultLinkAnalyticsHelper_FactoryCreate);
        }

        @Override // com.stripe.android.link.injection.LinkAnalyticsComponent
        public LinkAnalyticsHelper getLinkAnalyticsHelper() {
            return this.bindLinkAnalyticsHelperProvider.get();
        }
    }

    private static final class FormActivityViewModelComponentImpl implements FormActivityViewModelComponent {
        private Provider<Application> applicationProvider;
        private Provider<BacsConfirmationDefinition> bacsConfirmationDefinitionProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<EmbeddedPaymentElement.Configuration> configurationProvider;
        private Provider<CustomPaymentMethodConfirmationDefinition> customPaymentMethodConfirmationDefinitionProvider;
        private Provider<CvcRecollectionConfirmationDefinition> cvcRecollectionConfirmationDefinitionProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultCardAccountRangeRepositoryFactory> defaultCardAccountRangeRepositoryFactoryProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultFormActivityStateHelper> defaultFormActivityStateHelperProvider;
        private Provider<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<EmbeddedFormHelperFactory> embeddedFormHelperFactoryProvider;
        private Provider<EmbeddedFormInteractorFactory> embeddedFormInteractorFactoryProvider;
        private Provider<EmbeddedSelectionHolder> embeddedSelectionHolderProvider;
        private Provider<ExternalPaymentMethodConfirmationDefinition> externalPaymentMethodConfirmationDefinitionProvider;
        private Provider<DefaultConfirmationHandler.Factory> factoryProvider;
        private final FormActivityViewModelComponentImpl formActivityViewModelComponentImpl;
        private Provider<GooglePayConfirmationDefinition> googlePayConfirmationDefinitionProvider;
        private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private Provider<Boolean> hasSavedPaymentMethodsProvider;
        private Provider<PaymentElementLoader.InitializationMode> initializationModeProvider;
        private Provider<LinkActivityContract> linkActivityContractProvider;
        private Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
        private Provider<LinkApiRepository> linkApiRepositoryProvider;
        private Provider<LinkComponent.Builder> linkComponentBuilderProvider;
        private Provider<LinkConfirmationDefinition> linkConfirmationDefinitionProvider;
        private Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
        private Provider<LinkStore> linkStoreProvider;
        private Provider<NativeLinkActivityContract> nativeLinkActivityContractProvider;
        private Provider<PassiveChallengeConfirmationDefinition> passiveChallengeConfirmationDefinitionProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
        private Provider<Boolean> provideAllowsManualConfirmationProvider;
        private Provider<ConfirmCustomPaymentMethodCallback> provideConfirmCustomPaymentMethodCallbackProvider;
        private Provider<ConfirmationHandler> provideConfirmationHandlerProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<DefaultVerticalModeFormInteractor> provideFormInteractorProvider;
        private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
        private Provider<Locale> provideLocaleProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<OnClickOverrideDelegate> provideOnClickOverrideDelegateProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<Function0<String>> provideStripeAccountIdProvider;
        private Provider<CoroutineScope> provideViewModelScopeProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<ConfirmationRegistry> providesConfirmationRegistryProvider;
        private Provider<Context> providesContextProvider;
        private Provider<CreateIntentCallback> providesCreateIntentCallbackProvider;
        private Provider<ExternalPaymentMethodConfirmHandler> providesExternalPaymentMethodConfirmHandlerProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesIntentConfirmationDefinitionProvider;
        private Provider<LinkAccountHolder> providesLinkAccountHolderProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesLinkConfirmationDefinitionProvider;
        private Provider<PreparePaymentMethodHandler> providesPreparePaymentMethodHandlerProvider;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealLinkConfigurationCoordinator> realLinkConfigurationCoordinatorProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<String> selectedPaymentMethodCodeProvider;
        private Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> setOfConfirmationDefinitionOfAndAndAndProvider;
        private Provider<ShopPayActivityContract> shopPayActivityContractProvider;
        private Provider<ShopPayConfirmationDefinition> shopPayConfirmationDefinitionProvider;
        private Provider<Integer> statusBarColorProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;
        private Provider<WebLinkActivityContract> webLinkActivityContractProvider;

        private FormActivityViewModelComponentImpl(CoreCommonModule coreCommonModule, GooglePayLauncherModule googlePayLauncherModule, PaymentMethodMetadata paymentMethodMetadata, String str, Boolean bool, Integer num, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String str2, Application application, SavedStateHandle savedStateHandle) {
            this.formActivityViewModelComponentImpl = this;
            initialize(coreCommonModule, googlePayLauncherModule, paymentMethodMetadata, str, bool, num, configuration, initializationMode, str2, application, savedStateHandle);
            initialize2(coreCommonModule, googlePayLauncherModule, paymentMethodMetadata, str, bool, num, configuration, initializationMode, str2, application, savedStateHandle);
            initialize3(coreCommonModule, googlePayLauncherModule, paymentMethodMetadata, str, bool, num, configuration, initializationMode, str2, application, savedStateHandle);
        }

        private void initialize(CoreCommonModule coreCommonModule, GooglePayLauncherModule googlePayLauncherModule, PaymentMethodMetadata paymentMethodMetadata, String str, Boolean bool, Integer num, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String str2, Application application, SavedStateHandle savedStateHandle) {
            this.provideViewModelScopeProvider = DoubleCheck.provider((Provider) FormActivityViewModelModule_Companion_ProvideViewModelScopeFactory.create());
            dagger.internal.Factory factoryCreate = InstanceFactory.create(savedStateHandle);
            this.savedStateHandleProvider = factoryCreate;
            this.embeddedSelectionHolderProvider = DoubleCheck.provider((Provider) EmbeddedSelectionHolder_Factory.create((Provider<SavedStateHandle>) factoryCreate));
            this.paymentMethodMetadataProvider = InstanceFactory.create(paymentMethodMetadata);
            this.selectedPaymentMethodCodeProvider = InstanceFactory.create(str);
            this.hasSavedPaymentMethodsProvider = InstanceFactory.create(bool);
            Provider<LinkComponent.Builder> provider = new Provider<LinkComponent.Builder>() { // from class: com.stripe.android.paymentelement.embedded.form.DaggerFormActivityViewModelComponent.FormActivityViewModelComponentImpl.1
                @Override // javax.inject.Provider
                public LinkComponent.Builder get() {
                    return new LinkComponentBuilder(FormActivityViewModelComponentImpl.this.formActivityViewModelComponentImpl);
                }
            };
            this.linkComponentBuilderProvider = provider;
            this.realLinkConfigurationCoordinatorProvider = DoubleCheck.provider((Provider) RealLinkConfigurationCoordinator_Factory.create(provider));
            dagger.internal.Factory factoryCreate2 = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate2;
            this.providesContextProvider = FormActivityViewModelModule_Companion_ProvidesContextFactory.create((Provider<Application>) factoryCreate2);
            Provider<Logger> provider2 = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory.create()));
            this.provideLoggerProvider = provider2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provider2, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            DefaultCardAccountRangeRepositoryFactory_Factory defaultCardAccountRangeRepositoryFactory_FactoryCreate = DefaultCardAccountRangeRepositoryFactory_Factory.create(this.providesContextProvider, (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create(), (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.defaultCardAccountRangeRepositoryFactoryProvider = defaultCardAccountRangeRepositoryFactory_FactoryCreate;
            this.embeddedFormHelperFactoryProvider = EmbeddedFormHelperFactory_Factory.create((Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, this.embeddedSelectionHolderProvider, (Provider<CardAccountRangeRepository.Factory>) defaultCardAccountRangeRepositoryFactory_FactoryCreate, this.savedStateHandleProvider);
            this.configurationProvider = InstanceFactory.create(configuration);
            this.provideOnClickOverrideDelegateProvider = DoubleCheck.provider((Provider) FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory.create());
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.providesContextProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLoggerProvider);
            EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory.create(this.providesContextProvider);
            this.providePaymentConfigurationProvider = embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate = EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) embeddedCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            this.providePublishableKeyProvider = embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.providesContextProvider, (Provider<Function0<String>>) embeddedCommonModule_Companion_ProvidePublishableKeyFactoryCreate, (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create());
            dagger.internal.Factory factoryCreate3 = InstanceFactory.create(str2);
            this.paymentElementCallbackIdentifierProvider = factoryCreate3;
            this.providesAnalyticEventCallbackProvider = EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory.create((Provider<String>) factoryCreate3);
            this.realUserFacingLoggerProvider = RealUserFacingLogger_Factory.create(this.providesContextProvider);
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create(this.providesContextProvider, (Provider<EventReporter.Mode>) EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory.create(), (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<DurationProvider>) EmbeddedCommonModule_Companion_ProvideDurationProviderFactory.create(), this.providesAnalyticEventCallbackProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
        }

        private void initialize2(CoreCommonModule coreCommonModule, GooglePayLauncherModule googlePayLauncherModule, PaymentMethodMetadata paymentMethodMetadata, String str, Boolean bool, Integer num, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String str2, Application application, SavedStateHandle savedStateHandle) {
            Provider<DefaultFormActivityStateHelper> provider = DoubleCheck.provider((Provider) DefaultFormActivityStateHelper_Factory.create(this.paymentMethodMetadataProvider, this.embeddedSelectionHolderProvider, this.configurationProvider, this.provideOnClickOverrideDelegateProvider, this.bindsEventReporterProvider, this.provideViewModelScopeProvider));
            this.defaultFormActivityStateHelperProvider = provider;
            EmbeddedFormInteractorFactory_Factory embeddedFormInteractorFactory_FactoryCreate = EmbeddedFormInteractorFactory_Factory.create(this.paymentMethodMetadataProvider, this.selectedPaymentMethodCodeProvider, this.hasSavedPaymentMethodsProvider, this.embeddedSelectionHolderProvider, this.embeddedFormHelperFactoryProvider, this.provideViewModelScopeProvider, (Provider<FormActivityStateHelper>) provider, this.bindsEventReporterProvider);
            this.embeddedFormInteractorFactoryProvider = embeddedFormInteractorFactory_FactoryCreate;
            this.provideFormInteractorProvider = DoubleCheck.provider((Provider) FormActivityViewModelModule_Companion_ProvideFormInteractorFactory.create((Provider<EmbeddedFormInteractorFactory>) embeddedFormInteractorFactory_FactoryCreate));
            this.initializationModeProvider = InstanceFactory.create(initializationMode);
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.providesContextProvider, this.providePublishableKeyProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), (Provider<Set<String>>) EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory.create(), this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
            this.realErrorReporterProvider = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.providesCreateIntentCallbackProvider = IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
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
            Provider<LinkAnalyticsComponent.Builder> provider2 = new Provider<LinkAnalyticsComponent.Builder>() { // from class: com.stripe.android.paymentelement.embedded.form.DaggerFormActivityViewModelComponent.FormActivityViewModelComponentImpl.2
                @Override // javax.inject.Provider
                public LinkAnalyticsComponent.Builder get() {
                    return new LinkAnalyticsComponentBuilder(FormActivityViewModelComponentImpl.this.formActivityViewModelComponentImpl);
                }
            };
            this.linkAnalyticsComponentBuilderProvider = provider2;
            this.providesLinkConfirmationDefinitionProvider = LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory.create(this.linkStoreProvider, (Provider<LinkConfigurationCoordinator>) this.realLinkConfigurationCoordinatorProvider, provider2);
            this.cvcRecollectionConfirmationDefinitionProvider = CvcRecollectionConfirmationDefinition_Factory.create((Provider<CvcRecollectionHandler>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory.create(), (Provider<CvcRecollectionLauncherFactory>) CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory.create());
            this.passiveChallengeConfirmationDefinitionProvider = PassiveChallengeConfirmationDefinition_Factory.create((Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.bacsConfirmationDefinitionProvider = BacsConfirmationDefinition_Factory.create((Provider<BacsMandateConfirmationLauncherFactory>) BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory.create());
            ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory externalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactoryCreate = ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.providesExternalPaymentMethodConfirmHandlerProvider = externalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactoryCreate;
            this.externalPaymentMethodConfirmationDefinitionProvider = ExternalPaymentMethodConfirmationDefinition_Factory.create(this.paymentElementCallbackIdentifierProvider, (Provider<ExternalPaymentMethodConfirmHandler>) externalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactoryCreate, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory customPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactoryCreate = CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.provideConfirmCustomPaymentMethodCallbackProvider = customPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactoryCreate;
            this.customPaymentMethodConfirmationDefinitionProvider = CustomPaymentMethodConfirmationDefinition_Factory.create(this.paymentElementCallbackIdentifierProvider, (Provider<ConfirmCustomPaymentMethodCallback>) customPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactoryCreate, (Provider<ErrorReporter>) this.realErrorReporterProvider);
        }

        private void initialize3(CoreCommonModule coreCommonModule, GooglePayLauncherModule googlePayLauncherModule, PaymentMethodMetadata paymentMethodMetadata, String str, Boolean bool, Integer num, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String str2, Application application, SavedStateHandle savedStateHandle) {
            GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate = GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.providesContextProvider, this.provideLoggerProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.provideGooglePayRepositoryFactoryProvider = googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate;
            GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_FactoryCreate = GooglePayPaymentMethodLauncher_Factory.create(this.providesContextProvider, (Provider<Function1<GooglePayEnvironment, GooglePayRepository>>) googlePayLauncherModule_ProvideGooglePayRepositoryFactoryFactoryCreate, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.googlePayPaymentMethodLauncherProvider = googlePayPaymentMethodLauncher_FactoryCreate;
            Provider<GooglePayPaymentMethodLauncherFactory> providerCreateFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.createFactoryProvider(googlePayPaymentMethodLauncher_FactoryCreate);
            this.googlePayPaymentMethodLauncherFactoryProvider = providerCreateFactoryProvider;
            this.googlePayConfirmationDefinitionProvider = GooglePayConfirmationDefinition_Factory.create(providerCreateFactoryProvider, (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.nativeLinkActivityContractProvider = NativeLinkActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            WebLinkActivityContract_Factory webLinkActivityContract_FactoryCreate = WebLinkActivityContract_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.webLinkActivityContractProvider = webLinkActivityContract_FactoryCreate;
            LinkActivityContract_Factory linkActivityContract_FactoryCreate = LinkActivityContract_Factory.create(this.nativeLinkActivityContractProvider, (Provider<WebLinkActivityContract>) webLinkActivityContract_FactoryCreate, (Provider<LinkGate.Factory>) DefaultLinkGate_Factory_Factory.create());
            this.linkActivityContractProvider = linkActivityContract_FactoryCreate;
            this.linkPaymentLauncherProvider = DoubleCheck.provider((Provider) LinkPaymentLauncher_Factory.create(this.linkAnalyticsComponentBuilderProvider, this.paymentElementCallbackIdentifierProvider, (Provider<LinkActivityContract>) linkActivityContract_FactoryCreate, this.linkStoreProvider));
            Provider<LinkAccountHolder> provider = DoubleCheck.provider((Provider) FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory.create(this.savedStateHandleProvider));
            this.providesLinkAccountHolderProvider = provider;
            this.linkConfirmationDefinitionProvider = LinkConfirmationDefinition_Factory.create(this.linkPaymentLauncherProvider, this.linkStoreProvider, provider);
            ShopPayActivityContract_Factory shopPayActivityContract_FactoryCreate = ShopPayActivityContract_Factory.create(this.paymentElementCallbackIdentifierProvider);
            this.shopPayActivityContractProvider = shopPayActivityContract_FactoryCreate;
            this.shopPayConfirmationDefinitionProvider = ShopPayConfirmationDefinition_Factory.create((Provider<ShopPayActivityContract>) shopPayActivityContract_FactoryCreate);
            SetFactory setFactoryBuild = SetFactory.builder(10, 0).addProvider((Provider) this.providesIntentConfirmationDefinitionProvider).addProvider((Provider) this.providesLinkConfirmationDefinitionProvider).addProvider((Provider) this.cvcRecollectionConfirmationDefinitionProvider).addProvider((Provider) this.passiveChallengeConfirmationDefinitionProvider).addProvider((Provider) this.bacsConfirmationDefinitionProvider).addProvider((Provider) this.externalPaymentMethodConfirmationDefinitionProvider).addProvider((Provider) this.customPaymentMethodConfirmationDefinitionProvider).addProvider((Provider) this.googlePayConfirmationDefinitionProvider).addProvider((Provider) this.linkConfirmationDefinitionProvider).addProvider((Provider) this.shopPayConfirmationDefinitionProvider).build();
            this.setOfConfirmationDefinitionOfAndAndAndProvider = setFactoryBuild;
            ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate = ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory.create((Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>>) setFactoryBuild);
            this.providesConfirmationRegistryProvider = confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate;
            DefaultConfirmationHandler_Factory_Factory defaultConfirmationHandler_Factory_FactoryCreate = DefaultConfirmationHandler_Factory_Factory.create((Provider<ConfirmationRegistry>) confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate, this.savedStateHandleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create());
            this.factoryProvider = defaultConfirmationHandler_Factory_FactoryCreate;
            this.provideConfirmationHandlerProvider = DoubleCheck.provider((Provider) FormActivityViewModelModule_Companion_ProvideConfirmationHandlerFactory.create((Provider<ConfirmationHandler.Factory>) defaultConfirmationHandler_Factory_FactoryCreate, this.provideViewModelScopeProvider));
            this.provideConsumersApiServiceProvider = DoubleCheck.provider((Provider) LinkCommonModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create()));
            this.provideLocaleProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLocaleFactory.create(coreCommonModule));
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideStripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.provideConsumersApiServiceProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLocaleProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<ErrorReporter>) this.realErrorReporterProvider, (Provider<CoroutineContext>) EmbeddedCommonModule_Companion_IoContextFactory.create(), this.provideLoggerProvider, (Provider<DurationProvider>) EmbeddedCommonModule_Companion_ProvideDurationProviderFactory.create());
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            this.bindLinkEventsReporterProvider = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
        }

        @Override // com.stripe.android.paymentelement.embedded.form.FormActivityViewModelComponent
        public FormActivityViewModel getViewModel() {
            return new FormActivityViewModel(this, this.provideViewModelScopeProvider.get());
        }

        @Override // com.stripe.android.paymentelement.embedded.form.FormActivityViewModelComponent
        public EmbeddedSelectionHolder getSelectionHolder() {
            return this.embeddedSelectionHolderProvider.get();
        }

        @Override // com.stripe.android.paymentelement.embedded.form.FormActivityViewModelComponent
        public FormActivitySubcomponent.Factory getSubcomponentFactory() {
            return new FormActivitySubcomponentFactory(this.formActivityViewModelComponentImpl);
        }
    }
}
