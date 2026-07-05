.class final Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;
.super Ljava/lang/Object;
.source "DaggerManageComponent.java"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ManageComponentImpl"
.end annotation


# instance fields
.field private bindsEventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
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

.field private customerApiRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;",
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

.field private defaultEmbeddedManageScreenInteractorFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory;",
            ">;"
        }
    .end annotation
.end field

.field private defaultEmbeddedUpdateScreenInteractorFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory;",
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

.field private embeddedSelectionHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;"
        }
    .end annotation
.end field

.field private initialManageScreenFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final manageComponentImpl:Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;

.field private manageSavedPaymentMethodMutatorFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;",
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

.field private paymentMethodMetadataProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;"
        }
    .end annotation
.end field

.field private provideCustomerStateHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
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

.field private provideManageNavigatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
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

.field private providePaymentMethodMetadataProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;>;"
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

.field private provideSavedPaymentMethodMutatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;",
            ">;"
        }
    .end annotation
.end field

.field private provideUiContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private provideViewModelScopeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;"
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

.field private savedStateHandleProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
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


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->manageComponentImpl:Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;

    .line 153
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)V

    .line 154
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->initialize2(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    .line 163
    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideViewModelScopeFactory;->create()Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideViewModelScopeFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideViewModelScopeProvider:Ldagger/internal/Provider;

    .line 164
    invoke-static {p2}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    .line 165
    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder_Factory;

    move-result-object p2

    invoke-static {p2}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    .line 166
    invoke-static {p3}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentMethodMetadataProvider:Ldagger/internal/Provider;

    .line 167
    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvidePaymentMethodMetadataFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvidePaymentMethodMetadataFactory;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providePaymentMethodMetadataProvider:Ldagger/internal/Provider;

    .line 168
    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->savedStateHandleProvider:Ldagger/internal/Provider;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    invoke-static {p3, v0, p2}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideCustomerStateHolderFactory;

    move-result-object p2

    invoke-static {p2}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    .line 169
    invoke-static {p4}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    .line 170
    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 171
    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    .line 172
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;

    move-result-object p2

    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2, p3}, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/injection/StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providesAnalyticsRequestV2ExecutorProvider:Ldagger/internal/Provider;

    .line 173
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    .line 174
    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvidePublishableKeyFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    .line 175
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 176
    invoke-static {p5}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    .line 177
    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvidesAnalyticEventCallbackFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providesAnalyticEventCallbackProvider:Ldagger/internal/Provider;

    .line 178
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/core/utils/RealUserFacingLogger_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/core/utils/RealUserFacingLogger_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->realUserFacingLoggerProvider:Ldagger/internal/Provider;

    .line 179
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideEventReporterModeFactory;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providesAnalyticsRequestV2ExecutorProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideDurationProviderFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideDurationProviderFactory;

    move-result-object v5

    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providesAnalyticEventCallbackProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;

    move-result-object v7

    invoke-static {}, Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;->create()Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;

    move-result-object v8

    iget-object v9, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->realUserFacingLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultEventReporterProvider:Ldagger/internal/Provider;

    .line 180
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    .line 181
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;

    move-result-object v2

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/networking/StripeApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/StripeApiRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    .line 182
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;

    move-result-object v3

    iput-object v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->realErrorReporterProvider:Ldagger/internal/Provider;

    .line 183
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;

    move-result-object v4

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideProductUsageTokensFactory;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    .line 184
    new-instance p1, Ldagger/internal/DelegateFactory;

    invoke-direct {p1}, Ldagger/internal/DelegateFactory;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideManageNavigatorProvider:Ldagger/internal/Provider;

    .line 185
    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideUiContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_ProvideUiContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideUiContextProvider:Ldagger/internal/Provider;

    .line 186
    new-instance p1, Ldagger/internal/DelegateFactory;

    invoke-direct {p1}, Ldagger/internal/DelegateFactory;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultEmbeddedUpdateScreenInteractorFactoryProvider:Ldagger/internal/Provider;

    .line 187
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideManageNavigatorProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentMethodMetadataProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;->create()Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule_Companion_IoContextFactory;

    move-result-object v6

    iget-object v7, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideUiContextProvider:Ldagger/internal/Provider;

    iget-object v8, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideViewModelScopeProvider:Ldagger/internal/Provider;

    iget-object v9, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultEmbeddedUpdateScreenInteractorFactoryProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->manageSavedPaymentMethodMutatorFactoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private initialize2(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 195
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->manageSavedPaymentMethodMutatorFactoryProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideSavedPaymentMethodMutatorProvider:Ldagger/internal/Provider;

    .line 196
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultEmbeddedUpdateScreenInteractorFactoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentMethodMetadataProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideManageNavigatorProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory_Factory;

    move-result-object p2

    invoke-static {p1, p2}, Ldagger/internal/DelegateFactory;->setDelegate(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    .line 197
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentMethodMetadataProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideSavedPaymentMethodMutatorProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideManageNavigatorProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultEmbeddedManageScreenInteractorFactoryProvider:Ldagger/internal/Provider;

    .line 198
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->paymentMethodMetadataProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->defaultEmbeddedUpdateScreenInteractorFactoryProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p4, p1}, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->initialManageScreenFactoryProvider:Ldagger/internal/Provider;

    .line 199
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideManageNavigatorProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideViewModelScopeProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->bindsEventReporterProvider:Ldagger/internal/Provider;

    invoke-static {p1, p3, p4}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2, p1}, Ldagger/internal/DelegateFactory;->setDelegate(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-void
.end method

.method private injectManageActivity(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectCustomerStateHolder(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V

    .line 224
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideManageNavigatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;)V

    .line 225
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectSelectionHolder(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;)V

    return-object p1
.end method


# virtual methods
.method public getCustomerStateHolder()Lcom/stripe/android/paymentsheet/CustomerStateHolder;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideCustomerStateHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    return-object v0
.end method

.method public getSelectionHolder()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->embeddedSelectionHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    return-object v0
.end method

.method public getViewModel()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;
    .locals 2

    .line 204
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->provideViewModelScopeProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)V

    return-object v0
.end method

.method public inject(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V
    .locals 0

    .line 219
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;->injectManageActivity(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    return-void
.end method
