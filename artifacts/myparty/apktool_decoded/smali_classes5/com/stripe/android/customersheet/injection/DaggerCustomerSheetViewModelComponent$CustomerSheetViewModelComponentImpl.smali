.class final Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;
.super Ljava/lang/Object;
.source "DaggerCustomerSheetViewModelComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CustomerSheetViewModelComponentImpl"
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

.field private configurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private contextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final customerSheetViewModelComponentImpl:Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;

.field private customerSheetViewModelProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
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

.field private defaultCustomerSheetEventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private defaultCustomerSheetLoaderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;",
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

.field private factoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private integrationTypeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
            ">;"
        }
    .end annotation
.end field

.field private isLiveModeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
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

.field private paymentConfigurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private provideGooglePayRepositoryFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;"
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

.field private providePublishableKeyProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideStripeAccountIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
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

.field private providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
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

.field private providesPreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;"
        }
    .end annotation
.end field

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
.method private constructor <init>(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->customerSheetViewModelComponentImpl:Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;

    .line 196
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->initialize(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;)V

    .line 197
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->initialize2(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;-><init>(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;)V

    return-void
.end method

.method private initialize(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 7

    .line 206
    invoke-static {p2}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    .line 207
    invoke-static {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentConfigurationProvider:Ldagger/internal/Provider;

    .line 208
    invoke-static {p3}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    .line 209
    invoke-static {p5}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->integrationTypeProvider:Ldagger/internal/Provider;

    .line 210
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideLoggerFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideLoggerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 211
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ContextFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ContextFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->contextProvider:Ldagger/internal/Provider;

    .line 212
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentConfigurationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    .line 213
    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 214
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    .line 215
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;

    move-result-object v2

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/networking/StripeApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/StripeApiRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    .line 216
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultCustomerSheetEventReporterProvider:Ldagger/internal/Provider;

    .line 217
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentConfigurationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IsLiveModeFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IsLiveModeFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->isLiveModeProvider:Ldagger/internal/Provider;

    .line 218
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    .line 219
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesCreateIntentCallbackProvider:Ldagger/internal/Provider;

    .line 220
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesPreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;

    .line 221
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentConfigurationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideStripeAccountIdFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideStripeAccountIdFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideStripeAccountIdProvider:Ldagger/internal/Provider;

    .line 222
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesCreateIntentCallbackProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesPreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideStripeAccountIdProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultIntentConfirmationInterceptorProvider:Ldagger/internal/Provider;

    .line 223
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->stripePaymentLauncherProvider:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    .line 224
    invoke-static {p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->createFactoryProvider(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->stripePaymentLauncherAssistedFactoryProvider:Ldagger/internal/Provider;

    .line 225
    invoke-static {p4}, Ldagger/internal/InstanceFactory;->createNullable(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->statusBarColorProvider:Ldagger/internal/Provider;

    .line 226
    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultIntentConfirmationInterceptorProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->stripePaymentLauncherAssistedFactoryProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentConfigurationProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p1, p4}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesIntentConfirmationDefinitionProvider:Ldagger/internal/Provider;

    .line 227
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/challenge/PassiveChallengeConfirmationDefinition_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/challenge/PassiveChallengeConfirmationDefinition_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->passiveChallengeConfirmationDefinitionProvider:Ldagger/internal/Provider;

    const/4 p1, 0x2

    const/4 p2, 0x0

    .line 228
    invoke-static {p1, p2}, Ldagger/internal/SetFactory;->builder(II)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesIntentConfirmationDefinitionProvider:Ldagger/internal/Provider;

    invoke-virtual {p1, p2}, Ldagger/internal/SetFactory$Builder;->addProvider(Ldagger/internal/Provider;)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->passiveChallengeConfirmationDefinitionProvider:Ldagger/internal/Provider;

    invoke-virtual {p1, p2}, Ldagger/internal/SetFactory$Builder;->addProvider(Ldagger/internal/Provider;)Ldagger/internal/SetFactory$Builder;

    move-result-object p1

    invoke-virtual {p1}, Ldagger/internal/SetFactory$Builder;->build()Ldagger/internal/SetFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->setOfConfirmationDefinitionOfAndAndAndProvider:Ldagger/internal/Provider;

    .line 229
    invoke-static {p1}, Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesConfirmationRegistryProvider:Ldagger/internal/Provider;

    .line 230
    invoke-static {p6}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private initialize2(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 16

    move-object/from16 v0, p0

    .line 238
    iget-object v1, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesConfirmationRegistryProvider:Ldagger/internal/Provider;

    iget-object v2, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    iget-object v3, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler_Factory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler_Factory_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->factoryProvider:Ldagger/internal/Provider;

    .line 239
    iget-object v1, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object v2, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    iget-object v3, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    move-object/from16 v4, p1

    invoke-static {v4, v1, v2, v3}, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;->create(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideGooglePayRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 240
    iget-object v4, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->isLiveModeProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;

    move-result-object v6

    invoke-static {}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;->create()Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;

    move-result-object v7

    iget-object v8, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultCustomerSheetEventReporterProvider:Ldagger/internal/Provider;

    iget-object v9, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;

    move-result-object v10

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultCustomerSheetLoaderProvider:Ldagger/internal/Provider;

    .line 241
    iget-object v2, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->paymentConfigurationProvider:Ldagger/internal/Provider;

    iget-object v5, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->configurationProvider:Ldagger/internal/Provider;

    iget-object v6, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->integrationTypeProvider:Ldagger/internal/Provider;

    iget-object v7, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    iget-object v8, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v9, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultCustomerSheetEventReporterProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_IoContextFactory;

    move-result-object v10

    iget-object v11, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->isLiveModeProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object v12

    iget-object v13, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->factoryProvider:Ldagger/internal/Provider;

    iget-object v14, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->defaultCustomerSheetLoaderProvider:Ldagger/internal/Provider;

    iget-object v15, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->providesErrorReporter$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    invoke-static/range {v2 .. v15}, Lcom/stripe/android/customersheet/CustomerSheetViewModel_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/CustomerSheetViewModel_Factory;

    move-result-object v1

    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->customerSheetViewModelProvider:Ldagger/internal/Provider;

    return-void
.end method


# virtual methods
.method public getViewModel()Lcom/stripe/android/customersheet/CustomerSheetViewModel;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;->customerSheetViewModelProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    return-object v0
.end method
