.class final Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;
.super Ljava/lang/Object;
.source "DaggerNativeLinkComponent.java"

# interfaces
.implements Lcom/stripe/android/link/injection/NativeLinkComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerNativeLinkComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NativeLinkComponentImpl"
.end annotation


# instance fields
.field private applicationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private bindLinkAccountManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;"
        }
    .end annotation
.end field

.field private bindLinkEventsReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;"
        }
    .end annotation
.end field

.field private bindLinkRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/repositories/LinkRepository;",
            ">;"
        }
    .end annotation
.end field

.field private bindsCardAccountRangeRepositoryFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private bindsDismissalCoordinatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private bindsErrorReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;"
        }
    .end annotation
.end field

.field private bindsEventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private bindsLinkAttestationCheckProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
            ">;"
        }
    .end annotation
.end field

.field private bindsLinkAuthProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAuth;",
            ">;"
        }
    .end annotation
.end field

.field private bindsLinkGateProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate;",
            ">;"
        }
    .end annotation
.end field

.field private bindsNavigationManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private configurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private contextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private defaultCardAccountRangeRepositoryFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;",
            ">;"
        }
    .end annotation
.end field

.field private defaultEventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private defaultIntentConfirmationInterceptorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLinkAccountManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/DefaultLinkAccountManager;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLinkAttestationCheckProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLinkAuthProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/DefaultLinkAuth;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLinkEventsReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLinkGateProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/DefaultLinkGate;",
            ">;"
        }
    .end annotation
.end field

.field private factoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private factoryProvider2:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private ioContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private linkAccountUpdateProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ">;"
        }
    .end annotation
.end field

.field private linkApiRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/repositories/LinkApiRepository;",
            ">;"
        }
    .end annotation
.end field

.field private linkExpressModeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkExpressMode;",
            ">;"
        }
    .end annotation
.end field

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private linkLaunchModeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;"
        }
    .end annotation
.end field

.field private linkPassthroughConfirmationDefinitionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;",
            ">;"
        }
    .end annotation
.end field

.field private final nativeLinkComponentImpl:Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;

.field private nativeLinkComponentProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/NativeLinkComponent;",
            ">;"
        }
    .end annotation
.end field

.field private passiveChallengeConfirmationDefinitionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/challenge/PassiveChallengeConfirmationDefinition;",
            ">;"
        }
    .end annotation
.end field

.field private paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;"
        }
    .end annotation
.end field

.field private paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private provideAllowsManualConfirmationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private provideApplicationIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private provideAutocompleteLauncherProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
            ">;"
        }
    .end annotation
.end field

.field private provideConsumersApiServiceProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            ">;"
        }
    .end annotation
.end field

.field private provideDurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/utils/DurationProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideEventReporterModeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
            ">;"
        }
    .end annotation
.end field

.field private provideIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/attestation/IntegrityRequestManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideLinkActivityViewModelProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkActivityViewModel;",
            ">;"
        }
    .end annotation
.end field

.field private provideLinkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private provideLocaleProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field

.field private provideLoggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private providePaymentConfigurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private provideProductUsageTokensProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private providesAnalyticEventCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
            ">;"
        }
    .end annotation
.end field

.field private providesAnalyticsRequestV2ExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
            ">;"
        }
    .end annotation
.end field

.field private providesConfirmationRegistryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private providesCreateIntentCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            ">;"
        }
    .end annotation
.end field

.field private providesEnableLoggingProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private providesIntentConfirmationDefinitionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;>;"
        }
    .end annotation
.end field

.field private providesLinkAccountHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;"
        }
    .end annotation
.end field

.field private providesLinkPassthroughConfirmationDefinitionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;>;"
        }
    .end annotation
.end field

.field private providesPreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;"
        }
    .end annotation
.end field

.field private publishableKeyProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider2:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private realErrorReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;",
            ">;"
        }
    .end annotation
.end field

.field private realUserFacingLoggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/utils/RealUserFacingLogger;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private savedStateHandleProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;"
        }
    .end annotation
.end field

.field private setOfConfirmationDefinitionOfAndAndAndProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;>;>;"
        }
    .end annotation
.end field

.field private statusBarColorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private stripeAccountIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private stripeApiRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/StripeApiRepository;",
            ">;"
        }
    .end annotation
.end field

.field private stripePaymentLauncherAssistedFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation
.end field

.field private stripePaymentLauncherProvider:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Ljava/lang/Integer;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/link/LinkExpressMode;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ")V"
        }
    .end annotation

    .line 378
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 236
    iput-object p0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->nativeLinkComponentImpl:Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;

    .line 379
    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 380
    iput-object p5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->context:Landroid/content/Context;

    .line 381
    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider2:Lkotlin/jvm/functions/Function0;

    .line 382
    iput-object p6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 383
    iput-object p10, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 384
    invoke-direct/range {p0 .. p11}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->initialize(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    .line 385
    invoke-direct/range {p0 .. p11}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->initialize2(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    .line 386
    invoke-direct/range {p0 .. p11}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->initialize3(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/injection/DaggerNativeLinkComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    return-void
.end method

.method private defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;
    .locals 3

    .line 395
    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private initialize(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Ljava/lang/Integer;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/link/LinkExpressMode;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ")V"
        }
    .end annotation

    .line 411
    invoke-static {p6}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    .line 412
    invoke-static {p11}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkAccountUpdateProvider:Ldagger/internal/Provider;

    .line 413
    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    invoke-static {p6, p4}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory;

    move-result-object p4

    invoke-static {p4}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesLinkAccountHolderProvider:Ldagger/internal/Provider;

    .line 414
    invoke-static {p1}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    .line 415
    invoke-static {p8}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    .line 416
    invoke-static {p2}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider:Ldagger/internal/Provider;

    .line 417
    invoke-static {p3}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeAccountIdProvider:Ldagger/internal/Provider;

    .line 418
    invoke-static {p5}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    .line 419
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    .line 420
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideProductUsageTokensProvider:Ldagger/internal/Provider;

    .line 421
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 422
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesEnableLoggingProvider:Ldagger/internal/Provider;

    .line 423
    invoke-static {p1}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLoggerFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 424
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p8

    iput-object p8, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    .line 425
    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider:Ldagger/internal/Provider;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideProductUsageTokensProvider:Ldagger/internal/Provider;

    iget-object p7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object p9, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {p3 .. p9}, Lcom/stripe/android/networking/StripeApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/StripeApiRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    .line 426
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideConsumersApiServiceFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideConsumersApiServiceFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideConsumersApiServiceProvider:Ldagger/internal/Provider;

    .line 427
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLocaleProvider:Ldagger/internal/Provider;

    .line 428
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->realErrorReporterProvider:Ldagger/internal/Provider;

    .line 429
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p9

    iput-object p9, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    .line 430
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeAccountIdProvider:Ldagger/internal/Provider;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideConsumersApiServiceProvider:Ldagger/internal/Provider;

    iget-object p7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    iget-object p8, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLocaleProvider:Ldagger/internal/Provider;

    invoke-static/range {p2 .. p9}, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkApiRepositoryProvider:Ldagger/internal/Provider;

    .line 431
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkRepositoryProvider:Ldagger/internal/Provider;

    .line 432
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideDurationProviderFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideDurationProviderFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p7

    iput-object p7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideDurationProvider:Ldagger/internal/Provider;

    .line 433
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {p2 .. p7}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkEventsReporterProvider:Ldagger/internal/Provider;

    .line 434
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkEventsReporterProvider:Ldagger/internal/Provider;

    .line 435
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesLinkAccountHolderProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkRepositoryProvider:Ldagger/internal/Provider;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p4, p1, p5}, Lcom/stripe/android/link/account/DefaultLinkAccountManager_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/account/DefaultLinkAccountManager_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkAccountManagerProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private initialize2(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Ljava/lang/Integer;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/link/LinkExpressMode;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ")V"
        }
    .end annotation

    .line 447
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkAccountManagerProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkAccountManagerProvider:Ldagger/internal/Provider;

    .line 448
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->factoryProvider:Ldagger/internal/Provider;

    .line 449
    invoke-static {p1}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLinkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    .line 450
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideProductUsageTokensProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2, p3}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultCardAccountRangeRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 451
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsCardAccountRangeRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 452
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/link/gate/DefaultLinkGate_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/gate/DefaultLinkGate_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkGateProvider:Ldagger/internal/Provider;

    .line 453
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkGateProvider:Ldagger/internal/Provider;

    .line 454
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;

    .line 455
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/common/di/ApplicationIdModule_ProvideApplicationIdFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/common/di/ApplicationIdModule_ProvideApplicationIdFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideApplicationIdProvider:Ldagger/internal/Provider;

    .line 456
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkGateProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkAccountManagerProvider:Ldagger/internal/Provider;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p5, p6, p1}, Lcom/stripe/android/link/account/DefaultLinkAuth_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/account/DefaultLinkAuth_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkAuthProvider:Ldagger/internal/Provider;

    .line 457
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkAuthProvider:Ldagger/internal/Provider;

    .line 458
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->nativeLinkComponentImpl:Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;

    invoke-static {p1}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->nativeLinkComponentProvider:Ldagger/internal/Provider;

    .line 459
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkAccountManagerProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesLinkPassthroughConfirmationDefinitionProvider:Ldagger/internal/Provider;

    .line 460
    invoke-static {p4}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    .line 461
    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesCreateIntentCallbackProvider:Ldagger/internal/Provider;

    .line 462
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesPreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;

    .line 463
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object v4

    iput-object v4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideAllowsManualConfirmationProvider:Ldagger/internal/Provider;

    .line 464
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesCreateIntentCallbackProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesPreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeAccountIdProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultIntentConfirmationInterceptorProvider:Ldagger/internal/Provider;

    .line 465
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesEnableLoggingProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideProductUsageTokensProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripePaymentLauncherProvider:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    .line 466
    invoke-static {p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->createFactoryProvider(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripePaymentLauncherAssistedFactoryProvider:Ldagger/internal/Provider;

    .line 467
    invoke-static {p7}, Ldagger/internal/InstanceFactory;->createNullable(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->statusBarColorProvider:Ldagger/internal/Provider;

    .line 468
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidePaymentConfigurationFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidePaymentConfigurationFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    .line 469
    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultIntentConfirmationInterceptorProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripePaymentLauncherAssistedFactoryProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->statusBarColorProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p4, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesIntentConfirmationDefinitionProvider:Ldagger/internal/Provider;

    .line 470
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/challenge/PassiveChallengeConfirmationDefinition_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/challenge/PassiveChallengeConfirmationDefinition_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->passiveChallengeConfirmationDefinitionProvider:Ldagger/internal/Provider;

    .line 471
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkAccountManagerProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkPassthroughConfirmationDefinitionProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private initialize3(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Ljava/lang/Integer;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/link/LinkExpressMode;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ")V"
        }
    .end annotation

    const/4 p1, 0x4

    const/4 v0, 0x0

    .line 483
    invoke-static {p1, v0}, Ldagger/internal/SetFactory;->builder(II)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesLinkPassthroughConfirmationDefinitionProvider:Ldagger/internal/Provider;

    invoke-virtual {p1, v0}, Ldagger/internal/SetFactory$Builder;->addProvider(Ldagger/internal/Provider;)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesIntentConfirmationDefinitionProvider:Ldagger/internal/Provider;

    invoke-virtual {p1, v0}, Ldagger/internal/SetFactory$Builder;->addProvider(Ldagger/internal/Provider;)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->passiveChallengeConfirmationDefinitionProvider:Ldagger/internal/Provider;

    invoke-virtual {p1, v0}, Ldagger/internal/SetFactory$Builder;->addProvider(Ldagger/internal/Provider;)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkPassthroughConfirmationDefinitionProvider:Ldagger/internal/Provider;

    invoke-virtual {p1, v0}, Ldagger/internal/SetFactory$Builder;->addProvider(Ldagger/internal/Provider;)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    invoke-virtual {p1}, Ldagger/internal/SetFactory$Builder;->build()Ldagger/internal/SetFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->setOfConfirmationDefinitionOfAndAndAndProvider:Ldagger/internal/Provider;

    .line 484
    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesConfirmationRegistryProvider:Ldagger/internal/Provider;

    .line 485
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    invoke-static {p1, v0, v1, v2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler_Factory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler_Factory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->factoryProvider2:Ldagger/internal/Provider;

    .line 486
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideEventReporterModeFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideEventReporterModeFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideEventReporterModeProvider:Ldagger/internal/Provider;

    .line 487
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static {p1, v0, v1}, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/injection/StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesAnalyticsRequestV2ExecutorProvider:Ldagger/internal/Provider;

    .line 488
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesAnalyticEventCallbackFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesAnalyticEventCallbackFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesAnalyticEventCallbackProvider:Ldagger/internal/Provider;

    .line 489
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/core/utils/RealUserFacingLogger_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/core/utils/RealUserFacingLogger_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->realUserFacingLoggerProvider:Ldagger/internal/Provider;

    .line 490
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideEventReporterModeProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesAnalyticsRequestV2ExecutorProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideDurationProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesAnalyticEventCallbackProvider:Ldagger/internal/Provider;

    iget-object v7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;->create()Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;

    move-result-object v8

    iget-object v9, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->realUserFacingLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultEventReporterProvider:Ldagger/internal/Provider;

    .line 491
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    .line 492
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkGateProvider:Ldagger/internal/Provider;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkAuthProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkAccountManagerProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    move-object p2, p1

    move-object/from16 p3, v0

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    invoke-static/range {p2 .. p8}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultLinkAttestationCheckProvider:Ldagger/internal/Provider;

    .line 493
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkAttestationCheckProvider:Ldagger/internal/Provider;

    .line 494
    invoke-static {}, Lcom/stripe/android/uicore/navigation/NavigationManagerImpl_Factory;->create()Lcom/stripe/android/uicore/navigation/NavigationManagerImpl_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsNavigationManagerProvider:Ldagger/internal/Provider;

    .line 495
    invoke-static/range {p10 .. p10}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkLaunchModeProvider:Ldagger/internal/Provider;

    .line 496
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;->create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideAutocompleteLauncherProvider:Ldagger/internal/Provider;

    .line 497
    invoke-static/range {p9 .. p9}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object v12

    iput-object v12, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkExpressModeProvider:Ldagger/internal/Provider;

    .line 498
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->nativeLinkComponentProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->factoryProvider2:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkAccountManagerProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->providesLinkAccountHolderProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkAttestationCheckProvider:Ldagger/internal/Provider;

    iget-object v7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLinkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    iget-object v8, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsNavigationManagerProvider:Ldagger/internal/Provider;

    iget-object v9, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    iget-object v10, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkLaunchModeProvider:Ldagger/internal/Provider;

    iget-object v11, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideAutocompleteLauncherProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v12}, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLinkActivityViewModelProvider:Ldagger/internal/Provider;

    .line 499
    invoke-static {}, Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;->create()Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsDismissalCoordinatorProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 4

    .line 391
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideProductUsageTokensProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v0
.end method

.method private stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;
    .locals 8

    .line 399
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->publishableKeyProvider2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->ioContextProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideProductUsageTokensProvider:Ldagger/internal/Provider;

    invoke-interface {v4}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v5

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v6

    iget-object v7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v7}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/core/Logger;

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public getAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;
    .locals 1

    .line 579
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideAutocompleteLauncherProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;

    return-object v0
.end method

.method public getCardAccountRangeRepositoryFactory()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;
    .locals 1

    .line 539
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsCardAccountRangeRepositoryFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    return-object v0
.end method

.method public getConfiguration()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    .line 509
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object v0
.end method

.method public getDismissalCoordinator()Lcom/stripe/android/link/LinkDismissalCoordinator;
    .locals 1

    .line 569
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsDismissalCoordinatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkDismissalCoordinator;

    return-object v0
.end method

.method public getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    .line 519
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object v0
.end method

.method public getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 1

    .line 559
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-object v0
.end method

.method public getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 1

    .line 504
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkAccountManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager;

    return-object v0
.end method

.method public getLinkAuth()Lcom/stripe/android/link/account/LinkAuth;
    .locals 1

    .line 544
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsLinkAuthProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/account/LinkAuth;

    return-object v0
.end method

.method public getLinkConfirmationHandlerFactory()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;
    .locals 1

    .line 529
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLinkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    return-object v0
.end method

.method public getLinkEventsReporter()Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .locals 1

    .line 514
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindLinkEventsReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    return-object v0
.end method

.method public getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    .line 574
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object v0
.end method

.method public getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 524
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public getNavigationManager()Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 1

    .line 564
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsNavigationManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object v0
.end method

.method public getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;
    .locals 1

    .line 549
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-object v0
.end method

.method public getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 1

    .line 554
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->provideLinkActivityViewModelProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel;

    return-object v0
.end method

.method public getWebLinkActivityContract()Lcom/stripe/android/link/WebLinkActivityContract;
    .locals 3

    .line 534
    new-instance v0, Lcom/stripe/android/link/WebLinkActivityContract;

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;->bindsErrorReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/WebLinkActivityContract;-><init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    return-object v0
.end method
