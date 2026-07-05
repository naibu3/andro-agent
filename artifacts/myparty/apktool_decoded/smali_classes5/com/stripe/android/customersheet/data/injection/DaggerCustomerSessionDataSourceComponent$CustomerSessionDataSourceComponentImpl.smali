.class final Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;
.super Ljava/lang/Object;
.source "DaggerCustomerSessionDataSourceComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CustomerSessionDataSourceComponentImpl"
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private applicationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
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

.field private final customerSessionDataSourceComponentImpl:Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;

.field private customerSessionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final customerSessionProvider2:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

.field private defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private defaultCustomerSessionElementsSessionManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;",
            ">;"
        }
    .end annotation
.end field

.field private mobileSessionIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
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

.field private provideApplicationIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
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

.field private providePrefsRepositoryFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
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

.field private provideWorkContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private realElementsSessionRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;",
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
.method private constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionDataSourceComponentImpl:Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;

    .line 143
    iput-object p4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->application:Landroid/app/Application;

    .line 144
    iput-object p5, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionProvider2:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    .line 145
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)V

    return-void
.end method

.method private customerSessionInitializationDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;
    .locals 4

    .line 182
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultCustomerSessionElementsSessionManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionSavedSelectionDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private customerSessionIntentDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;
    .locals 3

    .line 178
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultCustomerSessionElementsSessionManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionProvider2:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)V

    return-object v0
.end method

.method private customerSessionPaymentMethodDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;
    .locals 5

    .line 166
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultCustomerSessionElementsSessionManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->realErrorReporter()Lcom/stripe/android/payments/core/analytics/RealErrorReporter;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v4}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private customerSessionSavedSelectionDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;
    .locals 5

    .line 174
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultCustomerSessionElementsSessionManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->function1OfStringAndPrefsRepository()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v4}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;
    .locals 3

    .line 150
    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private function1OfStringAndPrefsRepository()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->application:Landroid/app/Application;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule_Companion_ProvidePrefsRepositoryFactoryFactory;->providePrefsRepositoryFactory(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)V
    .locals 7

    .line 190
    invoke-static {p4}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    .line 191
    invoke-static {p4}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    .line 192
    invoke-static {p4}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    .line 193
    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    .line 194
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    move-result-object v0

    invoke-static {p1, p4, v0}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 195
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 196
    iget-object p2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    .line 197
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePublishableKeyProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object v6, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/networking/StripeApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/StripeApiRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    .line 198
    invoke-static {p3}, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;->create(Lcom/stripe/android/common/di/MobileSessionIdModule;)Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->mobileSessionIdProvider:Ldagger/internal/Provider;

    .line 199
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/common/di/ApplicationIdModule_ProvideApplicationIdFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/common/di/ApplicationIdModule_ProvideApplicationIdFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideApplicationIdProvider:Ldagger/internal/Provider;

    .line 200
    iget-object p2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    iget-object p4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->mobileSessionIdProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p4, v0, p1}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->realElementsSessionRepositoryProvider:Ldagger/internal/Provider;

    .line 201
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule_Companion_ProvidePrefsRepositoryFactoryFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule_Companion_ProvidePrefsRepositoryFactoryFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePrefsRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 202
    invoke-static {p5}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionProvider:Ldagger/internal/Provider;

    .line 203
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-static {p1, p2}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/analytics/RealErrorReporter_Factory;

    move-result-object v3

    iput-object v3, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->realErrorReporterProvider:Ldagger/internal/Provider;

    .line 204
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->realElementsSessionRepositoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePrefsRepositoryFactoryProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultCustomerSessionElementsSessionManagerProvider:Ldagger/internal/Provider;

    .line 205
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->stripeApiRepositoryProvider:Ldagger/internal/Provider;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->realErrorReporterProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerApiRepositoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private namedFunction0OfString()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 154
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->providePaymentConfigurationProvider:Ldagger/internal/Provider;

    invoke-static {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidePublishableKeyFactory;->providePublishableKey(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method private paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 4

    .line 158
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->application:Landroid/app/Application;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->namedFunction0OfString()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->providesProductUsage()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v0
.end method

.method private realErrorReporter()Lcom/stripe/android/payments/core/analytics/RealErrorReporter;
    .locals 3

    .line 162
    new-instance v0, Lcom/stripe/android/payments/core/analytics/RealErrorReporter;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter;-><init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;)V

    return-object v0
.end method


# virtual methods
.method public getCustomerSheetInitializationDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;
    .locals 1

    .line 225
    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionInitializationDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    move-result-object v0

    return-object v0
.end method

.method public getCustomerSheetIntentDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;
    .locals 1

    .line 220
    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionIntentDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;

    move-result-object v0

    return-object v0
.end method

.method public getCustomerSheetPaymentMethodDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;
    .locals 1

    .line 210
    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionPaymentMethodDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;

    move-result-object v0

    return-object v0
.end method

.method public getCustomerSheetSavedSelectionDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;
    .locals 1

    .line 215
    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;->customerSessionSavedSelectionDataSource()Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    move-result-object v0

    return-object v0
.end method
