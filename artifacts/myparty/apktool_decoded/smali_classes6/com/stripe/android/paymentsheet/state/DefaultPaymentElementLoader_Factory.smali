.class public final Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;
.super Ljava/lang/Object;
.source "DefaultPaymentElementLoader_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;",
        ">;"
    }
.end annotation


# instance fields
.field private final accountStatusProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final customerRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final cvcRecollectionHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final elementsSessionRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final errorReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final externalPaymentMethodsRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePayRepositoryFactoryProvider:Ldagger/internal/Provider;
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

.field private final linkGateFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final linkStoreProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;"
        }
    .end annotation
.end field

.field private final logLinkHoldbackExperimentProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final lpmRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final prefsRepositoryFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;"
        }
    .end annotation
.end field

.field private final retrieveCustomerEmailProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
            ">;"
        }
    .end annotation
.end field

.field private final userFacingLoggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/utils/UserFacingLogger;",
            ">;"
        }
    .end annotation
.end field

.field private final workContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/utils/UserFacingLogger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
            ">;)V"
        }
    .end annotation

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->prefsRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 96
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->googlePayRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 97
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->elementsSessionRepositoryProvider:Ldagger/internal/Provider;

    .line 98
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->customerRepositoryProvider:Ldagger/internal/Provider;

    .line 99
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->lpmRepositoryProvider:Ldagger/internal/Provider;

    .line 100
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->loggerProvider:Ldagger/internal/Provider;

    .line 101
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->eventReporterProvider:Ldagger/internal/Provider;

    .line 102
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->errorReporterProvider:Ldagger/internal/Provider;

    .line 103
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->workContextProvider:Ldagger/internal/Provider;

    .line 104
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->retrieveCustomerEmailProvider:Ldagger/internal/Provider;

    .line 105
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->accountStatusProvider:Ldagger/internal/Provider;

    .line 106
    iput-object p12, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->logLinkHoldbackExperimentProvider:Ldagger/internal/Provider;

    .line 107
    iput-object p13, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->linkStoreProvider:Ldagger/internal/Provider;

    .line 108
    iput-object p14, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->linkGateFactoryProvider:Ldagger/internal/Provider;

    .line 109
    iput-object p15, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->externalPaymentMethodsRepositoryProvider:Ldagger/internal/Provider;

    move-object/from16 p1, p16

    .line 110
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->userFacingLoggerProvider:Ldagger/internal/Provider;

    move-object/from16 p1, p17

    .line 111
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->cvcRecollectionHandlerProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/utils/UserFacingLogger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;"
        }
    .end annotation

    .line 155
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/utils/UserFacingLogger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;"
        }
    .end annotation

    .line 137
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;

    invoke-static/range {p0 .. p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v3

    invoke-static/range {p3 .. p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v4

    invoke-static/range {p4 .. p4}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v5

    invoke-static/range {p5 .. p5}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v6

    invoke-static/range {p6 .. p6}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v7

    invoke-static/range {p7 .. p7}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v8

    invoke-static/range {p8 .. p8}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v9

    invoke-static/range {p9 .. p9}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v10

    invoke-static/range {p10 .. p10}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v11

    invoke-static/range {p11 .. p11}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v12

    invoke-static/range {p12 .. p12}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v13

    invoke-static/range {p13 .. p13}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v14

    invoke-static/range {p14 .. p14}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v15

    invoke-static/range {p15 .. p15}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v16

    invoke-static/range {p16 .. p16}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v17

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;Lcom/stripe/android/core/utils/UserFacingLogger;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
            "Lcom/stripe/android/link/account/LinkStore;",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;",
            "Lcom/stripe/android/core/utils/UserFacingLogger;",
            "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
            ")",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;"
        }
    .end annotation

    .line 169
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;Lcom/stripe/android/core/utils/UserFacingLogger;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;
    .locals 19

    move-object/from16 v0, p0

    .line 116
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->prefsRepositoryFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->googlePayRepositoryFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->elementsSessionRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->customerRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->lpmRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/core/Logger;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->eventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->errorReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->workContextProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/coroutines/CoroutineContext;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->retrieveCustomerEmailProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->accountStatusProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->logLinkHoldbackExperimentProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->linkStoreProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/stripe/android/link/account/LinkStore;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->linkGateFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/stripe/android/link/gate/LinkGate$Factory;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->externalPaymentMethodsRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->userFacingLoggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lcom/stripe/android/core/utils/UserFacingLogger;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->cvcRecollectionHandlerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    invoke-static/range {v2 .. v18}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->newInstance(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;Lcom/stripe/android/core/utils/UserFacingLogger;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader_Factory;->get()Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    move-result-object v0

    return-object v0
.end method
