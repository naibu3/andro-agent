.class final Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;
.super Ljava/lang/Object;
.source "DaggerStripeCustomerAdapterComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "StripeCustomerAdapterComponentImpl"
.end annotation


# instance fields
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

.field private customerApiRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

.field private defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
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

.field private final paymentMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
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

.field private provideWorkContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
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

.field private final setupIntentClientSecretProvider:Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;

.field private stripeApiRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/StripeApiRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeCustomerAdapterComponentImpl:Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/content/Context;",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;",
            "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p0, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->stripeCustomerAdapterComponentImpl:Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;

    .line 137
    iput-object p3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->context:Landroid/content/Context;

    .line 138
    iput-object p4, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    .line 139
    iput-object p5, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->setupIntentClientSecretProvider:Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;

    .line 140
    iput-object p6, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->paymentMethodTypes:Ljava/util/List;

    .line 141
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;)V

    return-void
.end method

.method private function1OfCustomerEphemeralKeyAndPrefsRepository()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKey;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterModule_Companion_ProvidePrefsRepositoryFactoryFactory;->providePrefsRepositoryFactory(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/content/Context;",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;",
            "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 156
    invoke-static {p3}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->contextProvider:Ldagger/internal/Provider;

    .line 157
    invoke-static {p3}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    .line 158
    invoke-static {p3}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    .line 159
    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    .line 160
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    move-result-object p4

    invoke-static {p1, p3, p4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 161
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 162
    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    .line 163
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->contextProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/networking/StripeApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/StripeApiRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    .line 164
    iget-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;

    move-result-object v3

    iput-object v3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->realErrorReporterProvider:Ldagger/internal/Provider;

    .line 165
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    return-void
.end method


# virtual methods
.method public getStripeCustomerAdapter()Lcom/stripe/android/customersheet/StripeCustomerAdapter;
    .locals 9

    .line 170
    new-instance v0, Lcom/stripe/android/customersheet/StripeCustomerAdapter;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->customerEphemeralKeyProvider:Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    iget-object v3, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->setupIntentClientSecretProvider:Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;

    iget-object v4, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->paymentMethodTypes:Ljava/util/List;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;->provideTimeProvider()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    iget-object v6, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v6}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->function1OfCustomerEphemeralKeyAndPrefsRepository()Lkotlin/jvm/functions/Function1;

    move-result-object v7

    iget-object v8, p0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v8}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/customersheet/StripeCustomerAdapter;-><init>(Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method
