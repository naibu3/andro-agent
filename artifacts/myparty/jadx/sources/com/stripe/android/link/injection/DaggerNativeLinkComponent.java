package com.stripe.android.link.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory_Factory;
import com.stripe.android.common.di.ApplicationIdModule_ProvideApplicationIdFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.RealUserFacingLogger_Factory;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.RealLinkDismissalCoordinator_Factory;
import com.stripe.android.link.WebLinkActivityContract;
import com.stripe.android.link.account.DefaultLinkAccountManager;
import com.stripe.android.link.account.DefaultLinkAccountManager_Factory;
import com.stripe.android.link.account.DefaultLinkAuth;
import com.stripe.android.link.account.DefaultLinkAuth_Factory;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter_Factory;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck_Factory;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler;
import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler_Factory_Factory;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.link.gate.C1038DefaultLinkGate_Factory;
import com.stripe.android.link.gate.DefaultLinkGate;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkApiRepository_Factory;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
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
import com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationDefinition_Factory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter_Factory;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher;
import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.di.CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.NavigationManagerImpl_Factory;
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

/* loaded from: classes5.dex */
public final class DaggerNativeLinkComponent {
    private DaggerNativeLinkComponent() {
    }

    public static NativeLinkComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements NativeLinkComponent.Builder {
        private Application application;
        private LinkConfiguration configuration;
        private Context context;
        private LinkAccountUpdate.Value linkAccountUpdate;
        private LinkExpressMode linkExpressMode;
        private LinkLaunchMode linkLaunchMode;
        private String paymentElementCallbackIdentifier;
        private Function0<String> publishableKeyProvider;
        private SavedStateHandle savedStateHandle;
        private Integer statusBarColor;
        private Function0<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public /* bridge */ /* synthetic */ NativeLinkComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public /* bridge */ /* synthetic */ NativeLinkComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder configuration(LinkConfiguration linkConfiguration) {
            this.configuration = (LinkConfiguration) Preconditions.checkNotNull(linkConfiguration);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder paymentElementCallbackIdentifier(String str) {
            this.paymentElementCallbackIdentifier = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder statusBarColor(Integer num) {
            this.statusBarColor = num;
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder linkExpressMode(LinkExpressMode linkExpressMode) {
            this.linkExpressMode = (LinkExpressMode) Preconditions.checkNotNull(linkExpressMode);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder linkLaunchMode(LinkLaunchMode linkLaunchMode) {
            this.linkLaunchMode = (LinkLaunchMode) Preconditions.checkNotNull(linkLaunchMode);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public Builder linkAccountUpdate(LinkAccountUpdate.Value value) {
            this.linkAccountUpdate = (LinkAccountUpdate.Value) Preconditions.checkNotNull(value);
            return this;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent.Builder
        public NativeLinkComponent build() {
            Preconditions.checkBuilderRequirement(this.configuration, LinkConfiguration.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.stripeAccountIdProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.paymentElementCallbackIdentifier, String.class);
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.linkExpressMode, LinkExpressMode.class);
            Preconditions.checkBuilderRequirement(this.linkLaunchMode, LinkLaunchMode.class);
            Preconditions.checkBuilderRequirement(this.linkAccountUpdate, LinkAccountUpdate.Value.class);
            return new NativeLinkComponentImpl(this.configuration, this.publishableKeyProvider, this.stripeAccountIdProvider, this.paymentElementCallbackIdentifier, this.context, this.savedStateHandle, this.statusBarColor, this.application, this.linkExpressMode, this.linkLaunchMode, this.linkAccountUpdate);
        }
    }

    private static final class NativeLinkComponentImpl implements NativeLinkComponent {
        private Provider<Application> applicationProvider;
        private Provider<LinkAccountManager> bindLinkAccountManagerProvider;
        private Provider<LinkEventsReporter> bindLinkEventsReporterProvider;
        private Provider<LinkRepository> bindLinkRepositoryProvider;
        private Provider<CardAccountRangeRepository.Factory> bindsCardAccountRangeRepositoryFactoryProvider;
        private Provider<LinkDismissalCoordinator> bindsDismissalCoordinatorProvider;
        private Provider<ErrorReporter> bindsErrorReporterProvider;
        private Provider<EventReporter> bindsEventReporterProvider;
        private Provider<LinkAttestationCheck> bindsLinkAttestationCheckProvider;
        private Provider<LinkAuth> bindsLinkAuthProvider;
        private Provider<LinkGate> bindsLinkGateProvider;
        private Provider<NavigationManager> bindsNavigationManagerProvider;
        private final LinkConfiguration configuration;
        private Provider<LinkConfiguration> configurationProvider;
        private final Context context;
        private Provider<Context> contextProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultCardAccountRangeRepositoryFactory> defaultCardAccountRangeRepositoryFactoryProvider;
        private Provider<DefaultEventReporter> defaultEventReporterProvider;
        private Provider<DefaultIntentConfirmationInterceptor> defaultIntentConfirmationInterceptorProvider;
        private Provider<DefaultLinkAccountManager> defaultLinkAccountManagerProvider;
        private Provider<DefaultLinkAttestationCheck> defaultLinkAttestationCheckProvider;
        private Provider<DefaultLinkAuth> defaultLinkAuthProvider;
        private Provider<DefaultLinkEventsReporter> defaultLinkEventsReporterProvider;
        private Provider<DefaultLinkGate> defaultLinkGateProvider;
        private Provider<DefaultLinkConfirmationHandler.Factory> factoryProvider;
        private Provider<DefaultConfirmationHandler.Factory> factoryProvider2;
        private Provider<CoroutineContext> ioContextProvider;
        private Provider<LinkAccountUpdate.Value> linkAccountUpdateProvider;
        private Provider<LinkApiRepository> linkApiRepositoryProvider;
        private Provider<LinkExpressMode> linkExpressModeProvider;
        private final LinkLaunchMode linkLaunchMode;
        private Provider<LinkLaunchMode> linkLaunchModeProvider;
        private Provider<LinkPassthroughConfirmationDefinition> linkPassthroughConfirmationDefinitionProvider;
        private final NativeLinkComponentImpl nativeLinkComponentImpl;
        private Provider<NativeLinkComponent> nativeLinkComponentProvider;
        private Provider<PassiveChallengeConfirmationDefinition> passiveChallengeConfirmationDefinitionProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private Provider<Boolean> provideAllowsManualConfirmationProvider;
        private Provider<String> provideApplicationIdProvider;
        private Provider<DefaultAutocompleteLauncher> provideAutocompleteLauncherProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<DurationProvider> provideDurationProvider;
        private Provider<EventReporter.Mode> provideEventReporterModeProvider;
        private Provider<IntegrityRequestManager> provideIntegrityStandardRequestManagerProvider;
        private Provider<LinkActivityViewModel> provideLinkActivityViewModelProvider;
        private Provider<LinkConfirmationHandler.Factory> provideLinkConfirmationHandlerFactoryProvider;
        private Provider<Locale> provideLocaleProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Set<String>> provideProductUsageTokensProvider;
        private Provider<AnalyticEventCallback> providesAnalyticEventCallbackProvider;
        private Provider<AnalyticsRequestV2Executor> providesAnalyticsRequestV2ExecutorProvider;
        private Provider<ConfirmationRegistry> providesConfirmationRegistryProvider;
        private Provider<CreateIntentCallback> providesCreateIntentCallbackProvider;
        private Provider<Boolean> providesEnableLoggingProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesIntentConfirmationDefinitionProvider;
        private Provider<LinkAccountHolder> providesLinkAccountHolderProvider;
        private Provider<ConfirmationDefinition<?, ?, ?, ?>> providesLinkPassthroughConfirmationDefinitionProvider;
        private Provider<PreparePaymentMethodHandler> providesPreparePaymentMethodHandlerProvider;
        private Provider<Function0<String>> publishableKeyProvider;
        private final Function0<String> publishableKeyProvider2;
        private Provider<RealErrorReporter> realErrorReporterProvider;
        private Provider<RealUserFacingLogger> realUserFacingLoggerProvider;
        private final SavedStateHandle savedStateHandle;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> setOfConfirmationDefinitionOfAndAndAndProvider;
        private Provider<Integer> statusBarColorProvider;
        private Provider<Function0<String>> stripeAccountIdProvider;
        private Provider<StripeApiRepository> stripeApiRepositoryProvider;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private NativeLinkComponentImpl(LinkConfiguration linkConfiguration, Function0<String> function0, Function0<String> function02, String str, Context context, SavedStateHandle savedStateHandle, Integer num, Application application, LinkExpressMode linkExpressMode, LinkLaunchMode linkLaunchMode, LinkAccountUpdate.Value value) {
            this.nativeLinkComponentImpl = this;
            this.configuration = linkConfiguration;
            this.context = context;
            this.publishableKeyProvider2 = function0;
            this.savedStateHandle = savedStateHandle;
            this.linkLaunchMode = linkLaunchMode;
            initialize(linkConfiguration, function0, function02, str, context, savedStateHandle, num, application, linkExpressMode, linkLaunchMode, value);
            initialize2(linkConfiguration, function0, function02, str, context, savedStateHandle, num, application, linkExpressMode, linkLaunchMode, value);
            initialize3(linkConfiguration, function0, function02, str, context, savedStateHandle, num, application, linkExpressMode, linkLaunchMode, value);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider2, this.provideProductUsageTokensProvider.get());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.ioContextProvider.get());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider2, this.ioContextProvider.get(), this.provideProductUsageTokensProvider.get(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        private void initialize(LinkConfiguration linkConfiguration, Function0<String> function0, Function0<String> function02, String str, Context context, SavedStateHandle savedStateHandle, Integer num, Application application, LinkExpressMode linkExpressMode, LinkLaunchMode linkLaunchMode, LinkAccountUpdate.Value value) {
            this.savedStateHandleProvider = InstanceFactory.create(savedStateHandle);
            Factory factoryCreate = InstanceFactory.create(value);
            this.linkAccountUpdateProvider = factoryCreate;
            this.providesLinkAccountHolderProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory.create(this.savedStateHandleProvider, (Provider<LinkAccountUpdate.Value>) factoryCreate));
            this.configurationProvider = InstanceFactory.create(linkConfiguration);
            this.applicationProvider = InstanceFactory.create(application);
            this.publishableKeyProvider = InstanceFactory.create(function0);
            this.stripeAccountIdProvider = InstanceFactory.create(function02);
            this.contextProvider = InstanceFactory.create(context);
            this.ioContextProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_IoContextFactory.create());
            Provider<Set<String>> provider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideProductUsageTokensFactory.create());
            this.provideProductUsageTokensProvider = provider;
            this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider, provider);
            Provider<Boolean> provider2 = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvidesEnableLoggingFactory.create());
            this.providesEnableLoggingProvider = provider2;
            Provider<Logger> provider3 = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideLoggerFactory.create(provider2));
            this.provideLoggerProvider = provider3;
            DefaultAnalyticsRequestExecutor_Factory defaultAnalyticsRequestExecutor_FactoryCreate = DefaultAnalyticsRequestExecutor_Factory.create(provider3, this.ioContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutor_FactoryCreate;
            this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider, this.ioContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, (Provider<AnalyticsRequestExecutor>) defaultAnalyticsRequestExecutor_FactoryCreate, this.provideLoggerProvider);
            this.provideConsumersApiServiceProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideConsumersApiServiceFactory.create(this.provideLoggerProvider, this.ioContextProvider));
            this.provideLocaleProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideLocaleFactory.create());
            RealErrorReporter_Factory realErrorReporter_FactoryCreate = RealErrorReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) this.paymentAnalyticsRequestFactoryProvider);
            this.realErrorReporterProvider = realErrorReporter_FactoryCreate;
            Provider<ErrorReporter> provider4 = DoubleCheck.provider((Provider) realErrorReporter_FactoryCreate);
            this.bindsErrorReporterProvider = provider4;
            LinkApiRepository_Factory linkApiRepository_FactoryCreate = LinkApiRepository_Factory.create(this.applicationProvider, this.publishableKeyProvider, this.stripeAccountIdProvider, (Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.provideConsumersApiServiceProvider, this.ioContextProvider, this.provideLocaleProvider, provider4);
            this.linkApiRepositoryProvider = linkApiRepository_FactoryCreate;
            this.bindLinkRepositoryProvider = DoubleCheck.provider((Provider) linkApiRepository_FactoryCreate);
            Provider<DurationProvider> provider5 = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideDurationProviderFactory.create());
            this.provideDurationProvider = provider5;
            DefaultLinkEventsReporter_Factory defaultLinkEventsReporter_FactoryCreate = DefaultLinkEventsReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.bindsErrorReporterProvider, this.ioContextProvider, this.provideLoggerProvider, provider5);
            this.defaultLinkEventsReporterProvider = defaultLinkEventsReporter_FactoryCreate;
            Provider<LinkEventsReporter> provider6 = DoubleCheck.provider((Provider) defaultLinkEventsReporter_FactoryCreate);
            this.bindLinkEventsReporterProvider = provider6;
            this.defaultLinkAccountManagerProvider = DefaultLinkAccountManager_Factory.create(this.providesLinkAccountHolderProvider, this.configurationProvider, this.bindLinkRepositoryProvider, provider6, this.bindsErrorReporterProvider);
        }

        private void initialize2(LinkConfiguration linkConfiguration, Function0<String> function0, Function0<String> function02, String str, Context context, SavedStateHandle savedStateHandle, Integer num, Application application, LinkExpressMode linkExpressMode, LinkLaunchMode linkLaunchMode, LinkAccountUpdate.Value value) {
            this.bindLinkAccountManagerProvider = DoubleCheck.provider((Provider) this.defaultLinkAccountManagerProvider);
            DefaultLinkConfirmationHandler_Factory_Factory defaultLinkConfirmationHandler_Factory_FactoryCreate = DefaultLinkConfirmationHandler_Factory_Factory.create(this.configurationProvider, this.provideLoggerProvider);
            this.factoryProvider = defaultLinkConfirmationHandler_Factory_FactoryCreate;
            this.provideLinkConfirmationHandlerFactoryProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory.create((Provider<DefaultLinkConfirmationHandler.Factory>) defaultLinkConfirmationHandler_Factory_FactoryCreate));
            DefaultCardAccountRangeRepositoryFactory_Factory defaultCardAccountRangeRepositoryFactory_FactoryCreate = DefaultCardAccountRangeRepositoryFactory_Factory.create(this.contextProvider, this.provideProductUsageTokensProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider);
            this.defaultCardAccountRangeRepositoryFactoryProvider = defaultCardAccountRangeRepositoryFactory_FactoryCreate;
            this.bindsCardAccountRangeRepositoryFactoryProvider = DoubleCheck.provider((Provider) defaultCardAccountRangeRepositoryFactory_FactoryCreate);
            C1038DefaultLinkGate_Factory c1038DefaultLinkGate_FactoryCreate = C1038DefaultLinkGate_Factory.create(this.configurationProvider);
            this.defaultLinkGateProvider = c1038DefaultLinkGate_FactoryCreate;
            this.bindsLinkGateProvider = DoubleCheck.provider((Provider) c1038DefaultLinkGate_FactoryCreate);
            this.provideIntegrityStandardRequestManagerProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory.create(this.applicationProvider));
            ApplicationIdModule_ProvideApplicationIdFactory applicationIdModule_ProvideApplicationIdFactoryCreate = ApplicationIdModule_ProvideApplicationIdFactory.create(this.applicationProvider);
            this.provideApplicationIdProvider = applicationIdModule_ProvideApplicationIdFactoryCreate;
            DefaultLinkAuth_Factory defaultLinkAuth_FactoryCreate = DefaultLinkAuth_Factory.create(this.bindsLinkGateProvider, this.bindLinkAccountManagerProvider, this.provideIntegrityStandardRequestManagerProvider, this.bindsErrorReporterProvider, (Provider<String>) applicationIdModule_ProvideApplicationIdFactoryCreate);
            this.defaultLinkAuthProvider = defaultLinkAuth_FactoryCreate;
            this.bindsLinkAuthProvider = DoubleCheck.provider((Provider) defaultLinkAuth_FactoryCreate);
            this.nativeLinkComponentProvider = InstanceFactory.create(this.nativeLinkComponentImpl);
            this.providesLinkPassthroughConfirmationDefinitionProvider = NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory.create(this.defaultLinkAccountManagerProvider);
            Factory factoryCreate = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate;
            this.providesCreateIntentCallbackProvider = IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory.create((Provider<String>) factoryCreate);
            this.providesPreparePaymentMethodHandlerProvider = IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory.create(this.paymentElementCallbackIdentifierProvider);
            Provider<Boolean> provider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory.create());
            this.provideAllowsManualConfirmationProvider = provider;
            this.defaultIntentConfirmationInterceptorProvider = DefaultIntentConfirmationInterceptor_Factory.create((Provider<StripeRepository>) this.stripeApiRepositoryProvider, this.bindsErrorReporterProvider, this.providesCreateIntentCallbackProvider, this.providesPreparePaymentMethodHandlerProvider, provider, this.publishableKeyProvider, this.stripeAccountIdProvider);
            StripePaymentLauncher_Factory stripePaymentLauncher_FactoryCreate = StripePaymentLauncher_Factory.create(this.providesEnableLoggingProvider, this.provideProductUsageTokensProvider);
            this.stripePaymentLauncherProvider = stripePaymentLauncher_FactoryCreate;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.createFactoryProvider(stripePaymentLauncher_FactoryCreate);
            this.statusBarColorProvider = InstanceFactory.createNullable(num);
            Provider<PaymentConfiguration> provider2 = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvidePaymentConfigurationFactory.create(this.contextProvider));
            this.providePaymentConfigurationProvider = provider2;
            this.providesIntentConfirmationDefinitionProvider = IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory.create((Provider<IntentConfirmationInterceptor>) this.defaultIntentConfirmationInterceptorProvider, this.stripePaymentLauncherAssistedFactoryProvider, this.statusBarColorProvider, provider2);
            this.passiveChallengeConfirmationDefinitionProvider = PassiveChallengeConfirmationDefinition_Factory.create(this.bindsErrorReporterProvider);
            this.linkPassthroughConfirmationDefinitionProvider = LinkPassthroughConfirmationDefinition_Factory.create(this.bindLinkAccountManagerProvider);
        }

        private void initialize3(LinkConfiguration linkConfiguration, Function0<String> function0, Function0<String> function02, String str, Context context, SavedStateHandle savedStateHandle, Integer num, Application application, LinkExpressMode linkExpressMode, LinkLaunchMode linkLaunchMode, LinkAccountUpdate.Value value) {
            SetFactory setFactoryBuild = SetFactory.builder(4, 0).addProvider((Provider) this.providesLinkPassthroughConfirmationDefinitionProvider).addProvider((Provider) this.providesIntentConfirmationDefinitionProvider).addProvider((Provider) this.passiveChallengeConfirmationDefinitionProvider).addProvider((Provider) this.linkPassthroughConfirmationDefinitionProvider).build();
            this.setOfConfirmationDefinitionOfAndAndAndProvider = setFactoryBuild;
            ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate = ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory.create((Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>>) setFactoryBuild);
            this.providesConfirmationRegistryProvider = confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate;
            this.factoryProvider2 = DefaultConfirmationHandler_Factory_Factory.create((Provider<ConfirmationRegistry>) confirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactoryCreate, this.savedStateHandleProvider, this.bindsErrorReporterProvider, this.ioContextProvider);
            this.provideEventReporterModeProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideEventReporterModeFactory.create());
            this.providesAnalyticsRequestV2ExecutorProvider = StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.create(this.contextProvider, this.ioContextProvider, this.provideLoggerProvider);
            this.providesAnalyticEventCallbackProvider = NativeLinkModule_Companion_ProvidesAnalyticEventCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.realUserFacingLoggerProvider = RealUserFacingLogger_Factory.create(this.contextProvider);
            DefaultEventReporter_Factory defaultEventReporter_FactoryCreate = DefaultEventReporter_Factory.create(this.contextProvider, this.provideEventReporterModeProvider, (Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, this.providesAnalyticsRequestV2ExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideDurationProvider, this.providesAnalyticEventCallbackProvider, this.ioContextProvider, (Provider<IsStripeCardScanAvailable>) CardScanModule_ProvidesIsStripeCardScanAvailableFactory.create(), (Provider<UserFacingLogger>) this.realUserFacingLoggerProvider);
            this.defaultEventReporterProvider = defaultEventReporter_FactoryCreate;
            this.bindsEventReporterProvider = DoubleCheck.provider((Provider) defaultEventReporter_FactoryCreate);
            DefaultLinkAttestationCheck_Factory defaultLinkAttestationCheck_FactoryCreate = DefaultLinkAttestationCheck_Factory.create(this.bindsLinkGateProvider, this.bindsLinkAuthProvider, this.provideIntegrityStandardRequestManagerProvider, this.bindLinkAccountManagerProvider, this.configurationProvider, this.bindsErrorReporterProvider, this.ioContextProvider);
            this.defaultLinkAttestationCheckProvider = defaultLinkAttestationCheck_FactoryCreate;
            this.bindsLinkAttestationCheckProvider = DoubleCheck.provider((Provider) defaultLinkAttestationCheck_FactoryCreate);
            this.bindsNavigationManagerProvider = DoubleCheck.provider((Provider) NavigationManagerImpl_Factory.create());
            this.linkLaunchModeProvider = InstanceFactory.create(linkLaunchMode);
            this.provideAutocompleteLauncherProvider = DoubleCheck.provider((Provider) NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory.create());
            Factory factoryCreate = InstanceFactory.create(linkExpressMode);
            this.linkExpressModeProvider = factoryCreate;
            this.provideLinkActivityViewModelProvider = DoubleCheck.provider((Provider) LinkViewModelModule_ProvideLinkActivityViewModelFactory.create(this.nativeLinkComponentProvider, this.factoryProvider2, this.bindLinkAccountManagerProvider, this.providesLinkAccountHolderProvider, this.bindsEventReporterProvider, this.configurationProvider, this.bindsLinkAttestationCheckProvider, this.provideLinkConfirmationHandlerFactoryProvider, this.bindsNavigationManagerProvider, this.savedStateHandleProvider, this.linkLaunchModeProvider, this.provideAutocompleteLauncherProvider, (Provider<LinkExpressMode>) factoryCreate));
            this.bindsDismissalCoordinatorProvider = DoubleCheck.provider((Provider) RealLinkDismissalCoordinator_Factory.create());
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkAccountManager getLinkAccountManager() {
            return this.bindLinkAccountManagerProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkEventsReporter getLinkEventsReporter() {
            return this.bindLinkEventsReporterProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public ErrorReporter getErrorReporter() {
            return this.bindsErrorReporterProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public Logger getLogger() {
            return this.provideLoggerProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkConfirmationHandler.Factory getLinkConfirmationHandlerFactory() {
            return this.provideLinkConfirmationHandlerFactoryProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public WebLinkActivityContract getWebLinkActivityContract() {
            return new WebLinkActivityContract(stripeApiRepository(), this.bindsErrorReporterProvider.get());
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public CardAccountRangeRepository.Factory getCardAccountRangeRepositoryFactory() {
            return this.bindsCardAccountRangeRepositoryFactoryProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkAuth getLinkAuth() {
            return this.bindsLinkAuthProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public SavedStateHandle getSavedStateHandle() {
            return this.savedStateHandle;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkActivityViewModel getViewModel() {
            return this.provideLinkActivityViewModelProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public EventReporter getEventReporter() {
            return this.bindsEventReporterProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public NavigationManager getNavigationManager() {
            return this.bindsNavigationManagerProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkDismissalCoordinator getDismissalCoordinator() {
            return this.bindsDismissalCoordinatorProvider.get();
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public LinkLaunchMode getLinkLaunchMode() {
            return this.linkLaunchMode;
        }

        @Override // com.stripe.android.link.injection.NativeLinkComponent
        public AutocompleteLauncher getAutocompleteLauncher() {
            return this.provideAutocompleteLauncherProvider.get();
        }
    }
}
