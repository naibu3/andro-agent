.class final Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;
.super Ljava/lang/Object;
.source "DaggerShopPayComponent.java"

# interfaces
.implements Lcom/stripe/android/shoppay/di/ShopPayComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/di/DaggerShopPayComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ShopPayComponentImpl"
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final paymentElementCallbackIdentifier:Ljava/lang/String;

.field private paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private provideAnalyticEventCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
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

.field private providePreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;"
        }
    .end annotation
.end field

.field private provideUIContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
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

.field private final publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

.field private final shopPayComponentImpl:Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;

.field private final stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/stripe/android/shoppay/ShopPayArgs;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/shoppay/ShopPayArgs;",
            ")V"
        }
    .end annotation

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->shopPayComponentImpl:Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;

    .line 151
    iput-object p8, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

    .line 152
    iput-object p7, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 153
    iput-object p3, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->context:Landroid/content/Context;

    .line 154
    iput-object p6, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    .line 155
    iput-object p5, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    .line 156
    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/stripe/android/shoppay/ShopPayArgs;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/stripe/android/shoppay/ShopPayArgs;Lcom/stripe/android/shoppay/di/DaggerShopPayComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/stripe/android/shoppay/ShopPayArgs;)V

    return-void
.end method

.method private analyticsRequestV2Executor()Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;
    .locals 3

    .line 193
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;->providesAnalyticsRequestV2Executor(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    move-result-object v0

    return-object v0
.end method

.method private confirmationRequestJsonParser()Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;
    .locals 2

    .line 165
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;

    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;-><init>()V

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;-><init>(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V

    return-object v0
.end method

.method private defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;
    .locals 3

    .line 181
    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    iget-object v2, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private defaultEventReporter()Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;
    .locals 11

    .line 201
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->context:Landroid/content/Context;

    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideEventReporterModeFactory;->provideEventReporterMode()Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    move-result-object v2

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v3

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->analyticsRequestV2Executor()Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v5

    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory;->provideDurationProvider()Lcom/stripe/android/core/utils/DurationProvider;

    move-result-object v6

    iget-object v7, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideAnalyticEventCallbackProvider:Ldagger/internal/Provider;

    iget-object v8, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v8}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;->provideIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    move-result-object v9

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->realUserFacingLogger()Lcom/stripe/android/core/utils/RealUserFacingLogger;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;-><init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/utils/DurationProvider;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;Lcom/stripe/android/core/utils/UserFacingLogger;)V

    return-object v0
.end method

.method private defaultShopPayBridgeHandler()Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;
    .locals 7

    .line 173
    new-instance v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    new-instance v1, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;-><init>()V

    new-instance v2, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;-><init>()V

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->shippingRateChangeRequestJsonParser()Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;

    move-result-object v3

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->confirmationRequestJsonParser()Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->shopPayHandlers()Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;-><init>(Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/shoppay/ShopPayArgs;Lcom/stripe/android/paymentsheet/ShopPayHandlers;)V

    return-object v0
.end method

.method private errorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 2

    .line 205
    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->providesErrorReporter$paymentsheet_release(Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v0

    return-object v0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/stripe/android/shoppay/ShopPayArgs;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/shoppay/ShopPayArgs;",
            ")V"
        }
    .end annotation

    .line 214
    invoke-static {p2}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    .line 215
    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 216
    invoke-static {p7}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    .line 217
    invoke-static {p1}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->providePreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;

    .line 218
    iget-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideAnalyticEventCallbackFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideAnalyticEventCallbackFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideAnalyticEventCallbackProvider:Ldagger/internal/Provider;

    .line 219
    invoke-static {p2}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideUIContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideUIContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideUIContextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method private options()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 3

    .line 189
    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method private paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 4

    .line 177
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideProductUsageTokensFactory;->provideProductUsageTokens()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v0
.end method

.method private realUserFacingLogger()Lcom/stripe/android/core/utils/RealUserFacingLogger;
    .locals 2

    .line 197
    new-instance v0, Lcom/stripe/android/core/utils/RealUserFacingLogger;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/stripe/android/core/utils/RealUserFacingLogger;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private shippingRateChangeRequestJsonParser()Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;
    .locals 2

    .line 161
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;

    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;-><init>()V

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;-><init>(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V

    return-object v0
.end method

.method private shopPayHandlers()Lcom/stripe/android/paymentsheet/ShopPayHandlers;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentElementCallbackIdentifier:Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideShopPayHandlersFactory;->provideShopPayHandlers(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    move-result-object v0

    return-object v0
.end method

.method private stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;
    .locals 8

    .line 185
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository;

    iget-object v1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideProductUsageTokensFactory;->provideProductUsageTokens()Ljava/util/Set;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v5

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v6

    iget-object v7, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v7}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/core/Logger;

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public getViewModel()Lcom/stripe/android/shoppay/ShopPayViewModel;
    .locals 8

    .line 224
    new-instance v0, Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->defaultShopPayBridgeHandler()Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;

    move-result-object v2

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->options()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->providePreparePaymentMethodHandlerProvider:Ldagger/internal/Provider;

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->defaultEventReporter()Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;

    move-result-object v5

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->errorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v6

    iget-object v7, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;->provideUIContextProvider:Ldagger/internal/Provider;

    invoke-interface {v7}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/coroutines/CoroutineContext;

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/shoppay/ShopPayViewModel;-><init>(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method
