.class public final Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;
.super Ljava/lang/Object;
.source "PaymentElementLoader.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;,
        Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentElementLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentElementLoader.kt\ncom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,941:1\n774#2:942\n865#2,2:943\n774#2:945\n865#2,2:946\n295#2,2:949\n1557#2:951\n1628#2,3:952\n1557#2:955\n1628#2,3:956\n808#2,11:959\n1#3:948\n*S KotlinDebug\n*F\n+ 1 PaymentElementLoader.kt\ncom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader\n*L\n443#1:942\n443#1:943,2\n467#1:945\n467#1:946,2\n685#1:949,2\n819#1:951\n819#1:952,3\n847#1:955\n847#1:956,3\n871#1:959,11\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00cc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0002\u0089\u0001B\u00b7\u0001\u0008\u0007\u0012\u0019\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0008\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\u0008\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J.\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0096@\u00a2\u0006\u0004\u00083\u00104J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020,H\u0002JN\u0010:\u001a\u0008\u0012\u0004\u0012\u0002080+2\u0006\u0010-\u001a\u00020.2\u0008\u0010;\u001a\u0004\u0018\u00010\u00042\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020>0=2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020@0=2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u0082@\u00a2\u0006\u0004\u0008B\u0010CJ4\u0010D\u001a\u00020E2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u0002082\u0008\u0010F\u001a\u0004\u0018\u00010G2\u0008\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020KH\u0002J\"\u0010L\u001a\u00020M2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u0002082\u0008\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010N\u001a\u00020K2\u0006\u00107\u001a\u000208H\u0002J\u001a\u0010O\u001a\u0004\u0018\u00010G2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u000208H\u0002J8\u0010P\u001a\u0004\u0018\u00010Q2\u0008\u0010F\u001a\u0004\u0018\u00010G2\u0006\u00101\u001a\u00020E2\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020VH\u0082@\u00a2\u0006\u0002\u0010WJ$\u0010X\u001a\u0008\u0012\u0004\u0012\u00020Y0=2\u0006\u00101\u001a\u00020E2\u0006\u0010Z\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0002\u0010[J<\u0010\\\u001a\u0004\u0018\u00010I2\u0006\u00107\u001a\u0002082\u0006\u0010/\u001a\u0002002\u0008\u0010;\u001a\u0004\u0018\u00010G2\u0006\u0010-\u001a\u00020.2\u0008\u0010]\u001a\u0004\u0018\u00010^H\u0082@\u00a2\u0006\u0002\u0010_J.\u0010`\u001a\u00020I2\u0006\u0010/\u001a\u0002002\u0006\u0010a\u001a\u00020b2\u0006\u00107\u001a\u0002082\u0006\u0010c\u001a\u00020KH\u0082@\u00a2\u0006\u0002\u0010dJ<\u0010e\u001a\u0004\u0018\u00010b2\u0006\u0010/\u001a\u0002002\u0008\u0010;\u001a\u0004\u0018\u00010G2\u0006\u00107\u001a\u0002082\u0006\u0010-\u001a\u00020.2\u0008\u0010]\u001a\u0004\u0018\u00010^H\u0082@\u00a2\u0006\u0002\u0010fJ\u001e\u0010J\u001a\u00020K2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u000208H\u0082@\u00a2\u0006\u0002\u0010gJ\u0012\u0010J\u001a\u00020K*\u000200H\u0082@\u00a2\u0006\u0002\u0010hJ\u000e\u0010i\u001a\u00020KH\u0082@\u00a2\u0006\u0002\u0010jJ@\u0010k\u001a\u0004\u0018\u00010l2\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020T0S2\u0006\u00101\u001a\u00020E2\u0008\u0010;\u001a\u0004\u0018\u00010Q2\u0006\u0010J\u001a\u00020K2\u0006\u0010m\u001a\u00020KH\u0082@\u00a2\u0006\u0002\u0010nJ&\u0010o\u001a\u00020T2\u0006\u0010/\u001a\u0002002\u0006\u0010J\u001a\u00020K2\u0006\u00107\u001a\u000208H\u0082@\u00a2\u0006\u0002\u0010pJ\u0018\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010/\u001a\u000200H\u0082@\u00a2\u0006\u0002\u0010hJ&\u0010o\u001a\u00020T2\u0006\u0010/\u001a\u0002002\u0006\u0010J\u001a\u00020K2\u0006\u0010s\u001a\u00020KH\u0082@\u00a2\u0006\u0002\u0010tJ\u0010\u0010u\u001a\u0002062\u0006\u0010v\u001a\u00020wH\u0002J\u0010\u0010x\u001a\u00020K2\u0006\u00101\u001a\u00020EH\u0002JJ\u0010y\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020,2\u0006\u0010z\u001a\u00020K2\u0006\u0010i\u001a\u00020K2\u0006\u0010{\u001a\u00020|2\u0006\u0010-\u001a\u00020.2\u0008\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010}\u001a\u00020EH\u0002J\u0011\u0010~\u001a\u0002062\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J,\u0010\u0081\u0001\u001a\u0002062\u000f\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010=2\u0010\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010=H\u0002J\u0018\u0010\u0085\u0001\u001a\u0002062\r\u0010<\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010=H\u0002J\u000e\u0010\u0087\u0001\u001a\u00030\u0088\u0001*\u00020GH\u0002R!\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0008\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\u0008\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
        "prefsRepositoryFactory",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "googlePayRepositoryFactory",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "elementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "lpmRepository",
        "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "retrieveCustomerEmail",
        "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
        "accountStatusProvider",
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "logLinkHoldbackExperiment",
        "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
        "linkStore",
        "Lcom/stripe/android/link/account/LinkStore;",
        "linkGateFactory",
        "Lcom/stripe/android/link/gate/LinkGate$Factory;",
        "externalPaymentMethodsRepository",
        "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;",
        "userFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "cvcRecollectionHandler",
        "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;Lcom/stripe/android/core/utils/UserFacingLogger;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;)V",
        "load",
        "Lkotlin/Result;",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "configuration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "metadata",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;",
        "load-BWLJW6A",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logLinkExperimentExposures",
        "",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "state",
        "retrieveElementsSession",
        "customer",
        "customPaymentMethods",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
        "externalPaymentMethods",
        "",
        "savedPaymentMethodSelectionId",
        "retrieveElementsSession-hUnOzRk",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "customerInfo",
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;",
        "linkState",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "isGooglePayReady",
        "",
        "getCustomerMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
        "getDefaultPaymentMethodsEnabled",
        "createCustomerInfo",
        "createCustomerState",
        "Lcom/stripe/android/paymentsheet/state/CustomerState;",
        "savedSelection",
        "Lkotlinx/coroutines/Deferred;",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "cardBrandFilter",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;",
        "(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveCustomerPaymentMethods",
        "Lcom/stripe/android/model/PaymentMethod;",
        "customerConfig",
        "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkState",
        "linkAppearance",
        "Lcom/stripe/android/link/model/LinkAppearance;",
        "(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadLinkState",
        "linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkSignUpDisabled",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ElementsSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkConfiguration",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isGooglePaySupported",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveInitialPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "isUsingWalletButtons",
        "(Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveSavedSelection",
        "(Lcom/stripe/android/common/model/CommonConfiguration;ZLcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveSavedPaymentMethodSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;",
        "isLinkAvailable",
        "(Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "warnUnactivatedIfNeeded",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "supportsIntent",
        "reportSuccessfulLoad",
        "isReloadingAfterProcessDeath",
        "linkDisplay",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "paymentMethodMetadata",
        "reportFailedLoad",
        "error",
        "",
        "logIfMissingExternalPaymentMethods",
        "requestedExternalPaymentMethods",
        "actualExternalPaymentMethods",
        "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
        "logCustomPaymentMethodErrors",
        "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;",
        "toCustomerInfo",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
        "CustomerInfo",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final accountStatusProvider:Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

.field private final cvcRecollectionHandler:Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

.field private final elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final externalPaymentMethodsRepository:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;

.field private final googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final linkGateFactory:Lcom/stripe/android/link/gate/LinkGate$Factory;

.field private final linkStore:Lcom/stripe/android/link/account/LinkStore;

.field private final logLinkHoldbackExperiment:Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final lpmRepository:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

.field private final prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final retrieveCustomerEmail:Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

.field private final userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;Lcom/stripe/android/core/utils/UserFacingLogger;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;)V
    .locals 16
    .param p9    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
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
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "prefsRepositoryFactory"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepositoryFactory"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsSessionRepository"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmRepository"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveCustomerEmail"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountStatusProvider"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logLinkHoldbackExperiment"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkGateFactory"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalPaymentMethodsRepository"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userFacingLogger"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcRecollectionHandler"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 140
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 141
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 142
    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    .line 143
    iput-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 144
    iput-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->lpmRepository:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    .line 145
    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logger:Lcom/stripe/android/core/Logger;

    .line 146
    iput-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 147
    iput-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 148
    iput-object v9, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 149
    iput-object v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveCustomerEmail:Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

    .line 150
    iput-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->accountStatusProvider:Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

    .line 151
    iput-object v12, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logLinkHoldbackExperiment:Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;

    .line 152
    iput-object v13, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    .line 153
    iput-object v14, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->linkGateFactory:Lcom/stripe/android/link/gate/LinkGate$Factory;

    move-object/from16 v1, p15

    .line 154
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->externalPaymentMethodsRepository:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;

    move-object/from16 v1, p16

    .line 155
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

    .line 156
    iput-object v15, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->cvcRecollectionHandler:Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    return-void
.end method

.method public static final synthetic access$createCustomerInfo(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->createCustomerInfo(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createCustomerState(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->createCustomerState(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createLinkConfiguration(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->createLinkConfiguration(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createLinkState(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->createLinkState(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createPaymentMethodMetadata(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/LinkState;Z)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->createPaymentMethodMetadata(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/LinkState;Z)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventReporter$p(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 0

    .line 137
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-object p0
.end method

.method public static final synthetic access$isGooglePayReady(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->isGooglePayReady(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isGooglePayReady(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->isGooglePayReady(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isGooglePaySupported(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->isGooglePaySupported(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadLinkState(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ElementsSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->loadLinkState(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ElementsSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$logLinkExperimentExposures(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logLinkExperimentExposures(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V

    return-void
.end method

.method public static final synthetic access$reportFailedLoad(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Ljava/lang/Throwable;)V
    .locals 0

    .line 137
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->reportFailedLoad(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$reportSuccessfulLoad(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;ZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->reportSuccessfulLoad(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;ZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    return-void
.end method

.method public static final synthetic access$retrieveCustomerPaymentMethods(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveCustomerPaymentMethods(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveElementsSession-hUnOzRk(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveElementsSession-hUnOzRk(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveInitialPaymentSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveInitialPaymentSelection(Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveSavedPaymentMethodSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveSavedPaymentMethodSelection(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveSavedSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;ZLcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveSavedSelection(Lcom/stripe/android/common/model/CommonConfiguration;ZLcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveSavedSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveSavedSelection(Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$supportsIntent(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z
    .locals 0

    .line 137
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->supportsIntent(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$warnUnactivatedIfNeeded(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/model/StripeIntent;)V
    .locals 0

    .line 137
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->warnUnactivatedIfNeeded(Lcom/stripe/android/model/StripeIntent;)V

    return-void
.end method

.method private final createCustomerInfo(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;
    .locals 8

    .line 374
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 376
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 377
    :goto_0
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    if-eqz v2, :cond_3

    .line 378
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 379
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;-><init>(Lcom/stripe/android/model/ElementsSession$Customer;Ljava/lang/String;)V

    goto :goto_1

    .line 380
    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    .line 381
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 382
    const-string v1, "Excepted \'customer\' attribute as part of \'elements_session\' response!"

    .line 381
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 385
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 386
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 387
    sget-object v1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    move-object v4, p1

    check-cast v4, Ljava/lang/Throwable;

    invoke-virtual {v1, v4}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 385
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 390
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p2

    invoke-interface {p2}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 380
    :goto_1
    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    return-object v0

    .line 391
    :cond_2
    throw p1

    .line 397
    :cond_3
    instance-of p2, v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    if-eqz p2, :cond_4

    .line 398
    new-instance p2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;

    .line 400
    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    .line 398
    invoke-direct {p2, p1, v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;)V

    check-cast p2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;

    return-object p2

    :cond_4
    return-object v0
.end method

.method private final createCustomerState(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lkotlinx/coroutines/Deferred<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    instance-of v4, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;

    iget v5, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->label:I

    const/high16 v6, -0x80000000

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    iget v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->label:I

    sub-int/2addr v3, v6

    iput v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;

    invoke-direct {v4, v0, v3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 407
    iget v6, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->label:I

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v10, 0x0

    if-eqz v6, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v1, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v2, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :goto_1
    move-object v9, v1

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    iget-object v2, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v6, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/state/CustomerState$Companion;

    iget-object v8, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    iget-object v9, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/Deferred;

    iget-object v11, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v8

    goto :goto_2

    :cond_3
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 414
    instance-of v3, v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    if-eqz v3, :cond_4

    .line 415
    sget-object v3, Lcom/stripe/android/paymentsheet/state/CustomerState;->Companion:Lcom/stripe/android/paymentsheet/state/CustomerState$Companion;

    .line 416
    check-cast v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;->getElementsSessionCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v6

    .line 417
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedSavedPaymentMethodTypes()Ljava/util/List;

    move-result-object v8

    .line 418
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v1

    .line 415
    invoke-virtual {v3, v6, v8, v1}, Lcom/stripe/android/paymentsheet/state/CustomerState$Companion;->createForCustomerSession$paymentsheet_release(Lcom/stripe/android/model/ElementsSession$Customer;Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v1

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    goto :goto_3

    .line 421
    :cond_4
    instance-of v3, v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;

    if-eqz v3, :cond_6

    .line 422
    sget-object v6, Lcom/stripe/android/paymentsheet/state/CustomerState;->Companion:Lcom/stripe/android/paymentsheet/state/CustomerState$Companion;

    .line 423
    check-cast v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;->getId()Ljava/lang/String;

    move-result-object v3

    .line 424
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;->getAccessType()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    move-result-object v9

    .line 427
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;->getCustomerConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v1

    .line 425
    iput-object v2, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$0:Ljava/lang/Object;

    move-object/from16 v11, p3

    iput-object v11, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$1:Ljava/lang/Object;

    move-object/from16 v12, p4

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$2:Ljava/lang/Object;

    iput-object v6, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$3:Ljava/lang/Object;

    iput-object v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$4:Ljava/lang/Object;

    iput-object v9, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$5:Ljava/lang/Object;

    iput v8, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->label:I

    invoke-direct {v0, v2, v1, v4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveCustomerPaymentMethods(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v17, v3

    move-object v3, v1

    move-object v1, v9

    move-object v9, v11

    move-object v11, v2

    move-object/from16 v2, v17

    .line 407
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 422
    invoke-virtual {v6, v2, v1, v3}, Lcom/stripe/android/paymentsheet/state/CustomerState$Companion;->createForLegacyEphemeralKey$paymentsheet_release(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;Ljava/util/List;)Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v1

    move-object v2, v11

    move-object v11, v9

    goto :goto_3

    :cond_6
    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object v1, v10

    :goto_3
    if-eqz v1, :cond_b

    .line 436
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v3

    .line 439
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getDefaultPaymentMethodId()Ljava/lang/String;

    move-result-object v6

    .line 440
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 441
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result v2

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    .line 437
    :goto_4
    iput-object v12, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$1:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$2:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$3:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$4:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->L$5:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createCustomerState$1;->label:I

    invoke-static {v3, v11, v2, v6, v4}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->access$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(Ljava/util/List;Lkotlinx/coroutines/Deferred;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_8

    :goto_5
    return-object v5

    :cond_8
    move-object v2, v12

    goto/16 :goto_1

    .line 407
    :goto_6
    check-cast v3, Ljava/lang/Iterable;

    .line 942
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 943
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/model/PaymentMethod;

    .line 443
    invoke-virtual {v2, v5}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;->isAccepted(Lcom/stripe/android/model/PaymentMethod;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 943
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 944
    :cond_a
    move-object v13, v1

    check-cast v13, Ljava/util/List;

    const/16 v15, 0x17

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v11, v10

    move-object v12, v10

    .line 435
    invoke-static/range {v9 .. v16}, Lcom/stripe/android/paymentsheet/state/CustomerState;->copy$default(Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v1

    return-object v1

    :cond_b
    return-object v10
.end method

.method private final createLinkConfiguration(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/link/model/LinkAppearance;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    instance-of v4, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;

    iget v5, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->label:I

    const/high16 v6, -0x80000000

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    iget v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->label:I

    sub-int/2addr v3, v6

    iput v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;

    invoke-direct {v4, v0, v3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 541
    iget v6, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->label:I

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    if-ne v6, v7, :cond_1

    iget v1, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->I$0:I

    iget-object v2, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object v6, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$5:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/CardBrandFilter;

    iget-object v9, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$4:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/link/model/LinkAppearance;

    iget-object v10, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    iget-object v11, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/model/ElementsSession;

    iget-object v12, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v4, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v22, v6

    move-object/from16 v38, v9

    move-object/from16 v29, v10

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 549
    invoke-virtual {v1}, Lcom/stripe/android/common/model/CommonConfiguration;->getLink()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->getShouldDisplay$paymentsheet_release()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/model/ElementsSession;->isLinkEnabled()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_c

    .line 554
    :cond_3
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/model/ElementsSession;->getLinkPassthroughModeEnabled()Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_4

    .line 555
    invoke-virtual {v1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v3

    sget-object v9, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    move v3, v7

    goto :goto_1

    :cond_4
    move v3, v6

    :goto_1
    if-eqz v3, :cond_5

    .line 559
    new-instance v9, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-virtual {v1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    check-cast v9, Lcom/stripe/android/CardBrandFilter;

    goto :goto_2

    .line 561
    :cond_5
    sget-object v9, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast v9, Lcom/stripe/android/CardBrandFilter;

    .line 564
    :goto_2
    invoke-virtual {v1}, Lcom/stripe/android/common/model/CommonConfiguration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v10

    if-eqz v10, :cond_6

    .line 566
    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->isCheckboxSelected()Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    :cond_6
    if-eqz v6, :cond_7

    .line 567
    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getPhoneNumber()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    .line 569
    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_8
    move-object v6, v8

    .line 572
    :goto_3
    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveCustomerEmail:Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

    if-eqz v2, :cond_9

    .line 574
    invoke-direct {v0, v2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->toCustomerInfo(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;)Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    move-result-object v2

    goto :goto_4

    :cond_9
    move-object v2, v8

    .line 572
    :goto_4
    iput-object v0, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$1:Ljava/lang/Object;

    move-object/from16 v12, p3

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$2:Ljava/lang/Object;

    move-object/from16 v13, p4

    iput-object v13, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$3:Ljava/lang/Object;

    move-object/from16 v14, p5

    iput-object v14, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$4:Ljava/lang/Object;

    iput-object v9, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$5:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$6:Ljava/lang/Object;

    iput-object v6, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->L$7:Ljava/lang/Object;

    iput v3, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->I$0:I

    iput v7, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkConfiguration$1;->label:I

    invoke-interface {v11, v1, v2, v4}, Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;->invoke(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_a

    return-object v5

    :cond_a
    move-object v4, v0

    move-object/from16 v22, v9

    move-object v5, v10

    move-object v11, v12

    move-object/from16 v29, v13

    move-object/from16 v38, v14

    move-object v12, v1

    move v1, v3

    move-object v3, v2

    move-object v2, v6

    .line 541
    :goto_5
    check-cast v3, Ljava/lang/String;

    .line 577
    new-instance v6, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    .line 578
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_b
    move-object v9, v8

    .line 581
    :goto_6
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v10

    goto :goto_7

    :cond_c
    move-object v10, v8

    .line 577
    :goto_7
    invoke-direct {v6, v9, v3, v2, v10}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getCardBrandChoice()Lcom/stripe/android/model/ElementsSession$CardBrandChoice;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 585
    new-instance v3, Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    .line 586
    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$CardBrandChoice;->getEligible()Z

    move-result v9

    .line 587
    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$CardBrandChoice;->getPreferredNetworks()Ljava/util/List;

    move-result-object v2

    .line 585
    invoke-direct {v3, v9, v2}, Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;-><init>(ZLjava/util/List;)V

    move-object/from16 v21, v3

    goto :goto_8

    :cond_d
    move-object/from16 v21, v8

    .line 592
    :goto_8
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v14

    .line 593
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v15

    .line 594
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getMerchantCountry()Ljava/lang/String;

    move-result-object v16

    if-eqz v5, :cond_e

    .line 596
    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->isCheckboxSelected()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move-object/from16 v18, v5

    goto :goto_9

    :cond_e
    move-object/from16 v18, v8

    .line 597
    :goto_9
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkPassthroughModeEnabled()Z

    move-result v19

    .line 600
    sget-object v2, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    const/4 v3, 0x2

    invoke-static {v2, v11, v8, v3, v8}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v23

    .line 601
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkFlags()Ljava/util/Map;

    move-result-object v20

    .line 602
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getUseAttestationEndpointsForLink()Z

    move-result v26

    .line 603
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getSuppressLink2faModal()Z

    move-result v27

    .line 604
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getDisableRuxInFlowController()Z

    move-result v28

    .line 605
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkEnableDisplayableDefaultValuesInEce()Z

    move-result v36

    .line 606
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkSignUpOptInFeatureEnabled()Z

    move-result v39

    .line 607
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkSignUpOptInInitialValue()Z

    move-result v40

    .line 608
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getElementsSessionId()Ljava/lang/String;

    move-result-object v30

    .line 610
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkSettings()Lcom/stripe/android/model/ElementsSession$LinkSettings;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$LinkSettings;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v2

    move-object/from16 v31, v2

    goto :goto_a

    :cond_f
    move-object/from16 v31, v8

    .line 611
    :goto_a
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v24

    .line 612
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v25

    .line 613
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getAllowLinkDefaultOptIn()Z

    move-result v32

    .line 614
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v33

    .line 616
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getLink()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->getCollectMissingBillingDetailsForExistingPaymentMethods$paymentsheet_release()Z

    move-result v34

    .line 617
    invoke-virtual {v12}, Lcom/stripe/android/common/model/CommonConfiguration;->getLink()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->getAllowUserEmailEdits$paymentsheet_release()Z

    move-result v35

    .line 618
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getLinkMobileSkipWalletInFlowController()Z

    move-result v37

    .line 619
    invoke-virtual {v11}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getCustomerId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v41, v2

    goto :goto_b

    :cond_10
    move-object/from16 v41, v8

    .line 591
    :goto_b
    new-instance v13, Lcom/stripe/android/link/LinkConfiguration;

    move-object/from16 v17, v6

    invoke-direct/range {v13 .. v41}, Lcom/stripe/android/link/LinkConfiguration;-><init>(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)V

    .line 624
    iget-object v2, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->linkGateFactory:Lcom/stripe/android/link/gate/LinkGate$Factory;

    invoke-interface {v2, v13}, Lcom/stripe/android/link/gate/LinkGate$Factory;->create(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/gate/LinkGate;

    move-result-object v2

    invoke-interface {v2}, Lcom/stripe/android/link/gate/LinkGate;->getUseNativeLink()Z

    move-result v2

    if-eqz v1, :cond_11

    if-nez v2, :cond_11

    return-object v8

    :cond_11
    return-object v13

    :cond_12
    :goto_c
    return-object v8
.end method

.method private final createLinkState(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/link/model/LinkAppearance;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v2, p6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;

    if-eqz v2, :cond_0

    move-object v2, p6

    check-cast v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;

    iget v3, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;

    invoke-direct {v2, p0, p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v2

    iget-object v1, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 472
    iget v2, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->label:I

    const/4 v8, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v8, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v3, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/ElementsSession;

    iget-object v4, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v0, v4

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 480
    iput-object p0, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$0:Ljava/lang/Object;

    iput-object p1, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$1:Ljava/lang/Object;

    iput-object p2, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$2:Ljava/lang/Object;

    iput v3, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->label:I

    move-object v0, p0

    move-object v3, p1

    move-object v1, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->createLinkConfiguration(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, p0

    move-object v3, p1

    move-object v1, v2

    move-object v2, p2

    :goto_1
    check-cast v1, Lcom/stripe/android/link/LinkConfiguration;

    const/4 v4, 0x0

    if-nez v1, :cond_5

    return-object v4

    .line 491
    :cond_5
    invoke-virtual {v3}, Lcom/stripe/android/model/ElementsSession;->getDisableLinkSignup()Z

    move-result v5

    .line 487
    iput-object v4, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$0:Ljava/lang/Object;

    iput-object v4, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$1:Ljava/lang/Object;

    iput-object v4, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->L$2:Ljava/lang/Object;

    iput v8, v6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$createLinkState$1;->label:I

    move-object p1, v0

    move-object p3, v1

    move-object p2, v2

    move-object p4, v3

    move p5, v5

    move-object p6, v6

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->loadLinkState(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ElementsSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    :goto_2
    return-object v7

    :cond_6
    return-object v0
.end method

.method private final createPaymentMethodMetadata(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/LinkState;Z)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 11

    .line 307
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->lpmRepository:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    .line 308
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    .line 309
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->getPaymentMethodSpecs()Ljava/lang/String;

    move-result-object v2

    .line 307
    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;->getSharedDataSpecs(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;

    move-result-object v0

    .line 312
    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;->getFailedToParseServerResponse()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 313
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;->getFailedToParseServerErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onLpmSpecFailure(Ljava/lang/String;)V

    .line 316
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->externalPaymentMethodsRepository:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;

    .line 317
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->getExternalPaymentMethodData()Ljava/lang/String;

    move-result-object v2

    .line 316
    invoke-virtual {v1, v2}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;->getExternalPaymentMethodSpecs(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 321
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getExternalPaymentMethods()Ljava/util/List;

    move-result-object v1

    .line 320
    invoke-direct {p0, v1, v7}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logIfMissingExternalPaymentMethods(Ljava/util/List;Ljava/util/List;)V

    .line 325
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logCustomPaymentMethodErrors(Ljava/util/List;)V

    .line 327
    sget-object v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;

    .line 330
    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;->getSharedDataSpecs()Ljava/util/List;

    move-result-object v6

    .line 334
    invoke-direct/range {p0 .. p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->getCustomerMetadata(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object v10

    move-object v5, p1

    move-object v4, p2

    move-object v9, p4

    move/from16 v8, p5

    .line 327
    invoke-virtual/range {v3 .. v10}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;->createForPaymentElement$paymentsheet_release(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Ljava/util/List;Ljava/util/List;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object p1

    return-object p1
.end method

.method private final getCustomerMetadata(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 3

    .line 347
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    .line 348
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 349
    :goto_0
    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->getDefaultPaymentMethodsEnabled(Lcom/stripe/android/model/ElementsSession;)Z

    move-result p2

    .line 350
    instance-of v2, p3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    if-eqz v2, :cond_1

    .line 351
    sget-object v2, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;

    .line 353
    check-cast p3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;->getElementsSessionCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p3

    .line 351
    invoke-virtual {v2, p1, p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;->createForPaymentSheetCustomerSession$paymentsheet_release(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession$Customer;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    move-result-object p1

    goto :goto_1

    .line 356
    :cond_1
    sget-object p3, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;

    invoke-virtual {p3, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;->createForPaymentSheetLegacyEphemeralKey$paymentsheet_release(Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    move-result-object p1

    .line 347
    :goto_1
    invoke-direct {v0, v1, p2, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;-><init>(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V

    return-object v0
.end method

.method private final getDefaultPaymentMethodsEnabled(Lcom/stripe/android/model/ElementsSession;)Z
    .locals 2

    .line 364
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getMobilePaymentElement()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    :cond_1
    if-eqz v0, :cond_2

    .line 366
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private final isGooglePayReady(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 632
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ElementsSession;

    iget-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 636
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->isGooglePayEnabled()Z

    move-result p3

    if-nez p3, :cond_4

    .line 637
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

    .line 638
    const-string v2, "Google Pay is not enabled for this session."

    .line 637
    invoke-interface {p3, v2}, Lcom/stripe/android/core/utils/UserFacingLogger;->logWarningWithoutPii(Ljava/lang/String;)V

    goto :goto_1

    .line 640
    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getGooglePay()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object p3

    if-nez p3, :cond_5

    .line 641
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

    .line 642
    const-string v2, "GooglePayConfiguration is not set."

    .line 641
    invoke-interface {p3, v2}, Lcom/stripe/android/core/utils/UserFacingLogger;->logWarningWithoutPii(Ljava/lang/String;)V

    :goto_1
    move-object v2, p0

    goto :goto_3

    .line 644
    :cond_5
    iput-object p0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->isGooglePayReady(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, p0

    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_7

    .line 646
    iget-object p3, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

    .line 653
    const-string v4, "Google Pay API check failed.\nPossible reasons:\n- Google Play service is not available on this device.\n- Google account is not signed in on this device.\nSee https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient#public-taskboolean-isreadytopay-isreadytopayrequest-request for more details."

    .line 646
    invoke-interface {p3, v4}, Lcom/stripe/android/core/utils/UserFacingLogger;->logWarningWithoutPii(Ljava/lang/String;)V

    .line 656
    :cond_7
    :goto_3
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession;->isGooglePayEnabled()Z

    move-result p2

    if-eqz p2, :cond_9

    const/4 p2, 0x0

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$1;->label:I

    invoke-direct {v2, p1, v0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->isGooglePayReady(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    return-object p1

    :cond_9
    const/4 p1, 0x0

    .line 657
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final isGooglePayReady(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 659
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 660
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getGooglePay()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getEnvironment()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 661
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 662
    sget-object v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v3, :cond_4

    const/4 v2, 0x2

    if-ne p1, v2, :cond_3

    .line 666
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Test:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    goto :goto_1

    .line 662
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 664
    :cond_4
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    .line 661
    :goto_1
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    if-eqz p1, :cond_6

    .line 669
    invoke-interface {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->isReady()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    if-eqz p1, :cond_6

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$isGooglePayReady$2;->label:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    :goto_3
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final isGooglePaySupported(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 673
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    invoke-interface {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->isReady()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final loadLinkState(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ElementsSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/model/ElementsSession;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 495
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->Z$0:Z

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$3:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/model/ElementsSession;

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/link/LinkConfiguration;

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/common/model/CommonConfiguration;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 501
    iget-object p5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->accountStatusProvider:Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->L$3:Ljava/lang/Object;

    iput-boolean p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->Z$0:Z

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$loadLinkState$1;->label:I

    invoke-interface {p5, p2, v0}, Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;->invoke(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 495
    :goto_1
    check-cast p5, Lcom/stripe/android/link/model/AccountStatus;

    .line 503
    invoke-static {p5}, Lcom/stripe/android/link/model/AccountStatusKt;->toLoginState(Lcom/stripe/android/link/model/AccountStatus;)Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    move-result-object v1

    .line 506
    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 507
    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    .line 508
    invoke-static {p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadataKtxKt;->toPaymentSheetSaveConsentBehavior(Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-result-object v5

    .line 509
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p1

    const/4 v6, 0x0

    if-eqz p1, :cond_4

    move p1, v3

    goto :goto_2

    :cond_4
    move p1, v6

    .line 505
    :goto_2
    invoke-static {v2, v5, v4, p1}, Lcom/stripe/android/lpmfoundations/luxe/SaveForFutureUseHelperKt;->isSaveForFutureUseValueChangeable(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/StripeIntent;Z)Z

    move-result p1

    .line 511
    iget-object v0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkStore;->hasUsedLink()Z

    move-result v0

    .line 512
    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSession;->getLinkSignUpOptInFeatureEnabled()Z

    move-result p3

    const/4 v2, 0x0

    if-eqz p3, :cond_6

    .line 516
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    if-eqz p3, :cond_6

    invoke-static {p3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_3

    .line 517
    :cond_5
    sget-object p1, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->InsteadOfSaveForFutureUse:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    goto :goto_5

    :cond_6
    :goto_3
    if-nez p4, :cond_9

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    if-eqz p1, :cond_8

    .line 522
    sget-object p1, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->AlongsideSaveForFutureUse:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    goto :goto_5

    .line 524
    :cond_8
    sget-object p1, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->InsteadOfSaveForFutureUse:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    goto :goto_5

    :cond_9
    :goto_4
    move-object p1, v2

    .line 531
    :goto_5
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p3

    invoke-interface {p3}, Lcom/stripe/android/model/StripeIntent;->getLinkFundingSources()Ljava/util/List;

    move-result-object p3

    .line 532
    sget-object p4, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p4, p4, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    .line 534
    sget-object p4, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    if-ne p5, p4, :cond_a

    goto :goto_6

    :cond_a
    move v3, v6

    :goto_6
    if-eqz p3, :cond_b

    if-eqz v3, :cond_b

    move-object v2, p1

    .line 527
    :cond_b
    new-instance p1, Lcom/stripe/android/paymentsheet/state/LinkState;

    invoke-direct {p1, p2, v1, v2}, Lcom/stripe/android/paymentsheet/state/LinkState;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)V

    return-object p1
.end method

.method private final logCustomPaymentMethodErrors(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;",
            ">;)V"
        }
    .end annotation

    .line 866
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 870
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 959
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 968
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 969
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 873
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;

    .line 874
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

    .line 875
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;->getType()Ljava/lang/String;

    move-result-object v2

    .line 876
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;->getError()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Requested custom payment method "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " contained an error \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\"!"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 874
    invoke-interface {v1, v0}, Lcom/stripe/android/core/utils/UserFacingLogger;->logWarningWithoutPii(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method private final logIfMissingExternalPaymentMethods(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;)V"
        }
    .end annotation

    .line 844
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    if-eqz p2, :cond_2

    .line 847
    check-cast p2, Ljava/lang/Iterable;

    .line 955
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 956
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 957
    check-cast v1, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    .line 847
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getType()Ljava/lang/String;

    move-result-object v1

    .line 957
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 958
    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 848
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 849
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 853
    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->userFacingLogger:Lcom/stripe/android/core/utils/UserFacingLogger;

    .line 854
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Requested external payment method "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 853
    invoke-interface {v1, p2}, Lcom/stripe/android/core/utils/UserFacingLogger;->logWarningWithoutPii(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    :goto_3
    return-void
.end method

.method private final logLinkExperimentExposures(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V
    .locals 2

    .line 271
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logLinkHoldbackExperiment:Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;

    .line 272
    sget-object v1, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;->LINK_GLOBAL_HOLD_BACK:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    .line 271
    invoke-interface {v0, v1, p1, p2}, Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;->invoke(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V

    .line 277
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logLinkHoldbackExperiment:Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;

    .line 280
    sget-object v1, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;->LINK_AB_TEST:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    .line 277
    invoke-interface {v0, v1, p1, p2}, Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;->invoke(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V

    return-void
.end method

.method private final reportFailedLoad(Ljava/lang/Throwable;)V
    .locals 2

    .line 836
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Failure loading PaymentSheetState"

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 837
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onLoadFailed(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final reportSuccessfulLoad(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;ZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V
    .locals 22

    move-object/from16 v0, p0

    .line 790
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getSessionsError()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 791
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v2, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onElementsSessionLoadFailed(Ljava/lang/Throwable;)V

    .line 794
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/model/StripeIntent;->isConfirmed()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v4, v3

    :goto_1
    move-object/from16 v1, p7

    .line 799
    instance-of v1, v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    const/4 v5, 0x0

    if-eqz v1, :cond_6

    .line 800
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$Customer;->getDefaultPaymentMethod()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v5

    :goto_2
    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    move v1, v2

    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 801
    invoke-virtual/range {p8 .. p8}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result v6

    if-ne v6, v3, :cond_5

    move v6, v3

    goto :goto_4

    :cond_5
    move v6, v2

    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    move-object/from16 v18, v1

    move-object/from16 v19, v6

    goto :goto_5

    :cond_6
    move-object/from16 v18, v5

    move-object/from16 v19, v18

    .line 807
    :goto_5
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getValidationError()Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    move-result-object v1

    if-eqz v1, :cond_7

    if-eqz v4, :cond_7

    .line 808
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getValidationError()Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-interface {v1, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onLoadFailed(Ljava/lang/Throwable;)V

    return-void

    .line 810
    :cond_7
    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 811
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v1

    if-eqz v1, :cond_8

    move v9, v3

    goto :goto_6

    :cond_8
    move v9, v2

    .line 812
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getLinkSettings()Lcom/stripe/android/model/ElementsSession$LinkSettings;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$LinkSettings;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v1

    move-object v10, v1

    goto :goto_7

    :cond_9
    move-object v10, v5

    .line 815
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v13

    .line 816
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v8

    .line 818
    sget-object v1, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    const/4 v2, 0x2

    move-object/from16 v3, p1

    invoke-static {v1, v3, v5, v2, v5}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v15

    .line 819
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sortedSupportedPaymentMethods()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 951
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 952
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 953
    check-cast v4, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    .line 819
    invoke-virtual {v4}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v4

    .line 953
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 954
    :cond_a
    move-object/from16 v16, v2

    check-cast v16, Ljava/util/List;

    .line 820
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->cvcRecollectionHandler:Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    .line 821
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v2

    move-object/from16 v14, p6

    .line 820
    invoke-interface {v1, v2, v14}, Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;->cvcRecollectionEnabled(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z

    move-result v17

    .line 826
    invoke-virtual {v3}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->access$setupFutureUsage(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v21

    .line 827
    invoke-virtual {v3}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    .line 828
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->access$paymentMethodOptionsSetupFutureUsageMap(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v20

    move/from16 v11, p4

    move-object/from16 v12, p5

    .line 810
    invoke-interface/range {v7 .. v21}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onLoadSucceeded(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V

    return-void
.end method

.method private final retrieveCustomerPaymentMethods(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 448
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 452
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedSavedPaymentMethodTypes()Ljava/util/List;

    move-result-object p3

    .line 454
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object v2

    instance-of v4, v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    goto :goto_1

    :cond_3
    move-object v2, v5

    :goto_1
    if-eqz v2, :cond_4

    .line 455
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 457
    :cond_4
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 458
    new-instance v4, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 459
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getId()Ljava/lang/String;

    move-result-object v6

    .line 460
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object p2

    .line 458
    invoke-direct {v4, v6, p2, v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result p1

    .line 457
    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1;->label:I

    invoke-interface {v2, v4, p3, p1, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->getPaymentMethods-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    .line 465
    :cond_5
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/List;

    .line 467
    check-cast p1, Ljava/lang/Iterable;

    .line 945
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/Collection;

    .line 946
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    .line 468
    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod;->hasExpectedDetails()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 946
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 947
    :cond_7
    check-cast p2, Ljava/util/List;

    return-object p2
.end method

.method private final retrieveElementsSession-hUnOzRk(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;->label:I

    sub-int/2addr p6, v2

    iput p6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;

    invoke-direct {v0, p0, p6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p6, v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 284
    iget v1, v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p6, Lkotlin/Result;

    invoke-virtual {p6}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 291
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iput v2, v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveElementsSession$1;->label:I

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;->get-hUnOzRk(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method

.method private final retrieveInitialPaymentSelection(Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/Deferred<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            "ZZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p6

    instance-of v2, v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;

    iget v3, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;

    invoke-direct {v2, p0, v1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 676
    iget v5, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->label:I

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-boolean v0, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->Z$1:Z

    iget-boolean v4, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->Z$0:Z

    iget-object v2, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/CustomerState;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v5, v0

    move-object v0, v2

    move-object v2, v1

    move v1, v4

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 683
    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result v1

    goto :goto_1

    :cond_3
    move v1, v6

    :goto_1
    if-eqz v1, :cond_8

    if-eqz v0, :cond_7

    .line 685
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_7

    check-cast v1, Ljava/lang/Iterable;

    .line 949
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    .line 686
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getDefaultPaymentMethodId()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getDefaultPaymentMethodId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v7

    goto :goto_2

    :cond_5
    move v4, v6

    :goto_2
    if-eqz v4, :cond_4

    goto :goto_3

    :cond_6
    move-object v2, v8

    .line 685
    :goto_3
    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v2, :cond_7

    .line 687
    invoke-static {v2}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->access$toPaymentSelection(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    move-result-object v1

    goto :goto_4

    :cond_7
    move-object v1, v8

    .line 685
    :goto_4
    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move/from16 v5, p5

    move-object v2, v1

    move/from16 v1, p4

    goto/16 :goto_b

    .line 689
    :cond_8
    iput-object v0, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->L$0:Ljava/lang/Object;

    move/from16 v1, p4

    iput-boolean v1, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->Z$0:Z

    move/from16 v5, p5

    iput-boolean v5, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->Z$1:Z

    iput v7, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1;->label:I

    invoke-interface {p1, v2}, Lkotlinx/coroutines/Deferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_9

    return-object v4

    .line 676
    :cond_9
    :goto_5
    check-cast v2, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    .line 690
    instance-of v4, v2, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    if-eqz v4, :cond_c

    sget-object v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v5, :cond_a

    if-eqz v1, :cond_a

    move v4, v7

    goto :goto_6

    :cond_a
    move v4, v6

    :goto_6
    if-eqz v4, :cond_b

    goto :goto_7

    :cond_b
    move-object v2, v8

    :goto_7
    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    goto/16 :goto_b

    .line 693
    :cond_c
    instance-of v4, v2, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    if-eqz v4, :cond_e

    new-instance v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    const/4 v4, 0x7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object p1, v2

    move/from16 p5, v4

    move-object/from16 p6, v9

    move-object p2, v10

    move-object/from16 p3, v11

    move-object/from16 p4, v12

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;-><init>(Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-nez v5, :cond_d

    goto :goto_8

    :cond_d
    move-object v2, v8

    :goto_8
    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    goto :goto_b

    .line 696
    :cond_e
    instance-of v4, v2, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    if-eqz v4, :cond_12

    if-eqz v0, :cond_11

    .line 697
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_11

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/stripe/android/model/PaymentMethod;

    iget-object v10, v10, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    move-object v11, v2

    check-cast v11, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-virtual {v11}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_9

    :cond_10
    move-object v9, v8

    :goto_9
    check-cast v9, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v9, :cond_11

    invoke-static {v9}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->access$toPaymentSelection(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    move-result-object v2

    goto :goto_a

    :cond_11
    move-object v2, v8

    :goto_a
    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    goto :goto_b

    .line 699
    :cond_12
    instance-of v2, v2, Lcom/stripe/android/paymentsheet/model/SavedSelection$None;

    if-eqz v2, :cond_18

    move-object v2, v8

    :goto_b
    if-nez v2, :cond_17

    if-eqz v0, :cond_13

    .line 704
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v0, :cond_13

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoaderKt;->access$toPaymentSelection(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    move-result-object v0

    goto :goto_c

    :cond_13
    move-object v0, v8

    :goto_c
    if-eqz v0, :cond_14

    .line 703
    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0

    .line 705
    :cond_14
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v5, :cond_15

    if-eqz v1, :cond_15

    move v6, v7

    :cond_15
    if-eqz v6, :cond_16

    move-object v8, v0

    :cond_16
    check-cast v8, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v8

    :cond_17
    return-object v2

    .line 689
    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final retrieveSavedPaymentMethodSelection(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 722
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 725
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v4

    .line 726
    :goto_1
    instance-of v2, p2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    if-eqz v2, :cond_6

    .line 734
    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1;->label:I

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p2, v0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveSavedSelection(Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    instance-of p1, p2, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    if-eqz p1, :cond_5

    check-cast p2, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    return-object p2

    :cond_5
    return-object v4

    .line 740
    :cond_6
    instance-of p1, p2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    if-nez p1, :cond_8

    if-nez p2, :cond_7

    goto :goto_3

    .line 725
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_3
    return-object v4
.end method

.method private final retrieveSavedSelection(Lcom/stripe/android/common/model/CommonConfiguration;ZLcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Z",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 718
    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSession;->isLinkEnabled()Z

    move-result p3

    .line 715
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->retrieveSavedSelection(Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final retrieveSavedSelection(Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "ZZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 750
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p1

    .line 751
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/PrefsRepository;

    .line 753
    invoke-interface {p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/PrefsRepository;->getSavedSelection(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final supportsIntent(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z
    .locals 0

    .line 777
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodTypes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final toCustomerInfo(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;)Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;
    .locals 5

    .line 902
    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 903
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;->getId()Ljava/lang/String;

    move-result-object v1

    .line 904
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v2

    .line 905
    instance-of v3, p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 902
    :cond_1
    invoke-direct {v0, v1, v2, v4}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final warnUnactivatedIfNeeded(Lcom/stripe/android/model/StripeIntent;)V
    .locals 2

    .line 760
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getUnactivatedPaymentMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 766
    :cond_0
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getUnactivatedPaymentMethods()Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 771
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public load-BWLJW6A(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 159
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 164
    iget-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$2;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$2;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v8, p1

    move-object v7, p2

    move-object v6, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$3;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$load$1;->label:I

    invoke-static {p4, v2, v4, v0}, Lcom/stripe/android/common/coroutines/CoroutinesKtxKt;->runCatching(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
