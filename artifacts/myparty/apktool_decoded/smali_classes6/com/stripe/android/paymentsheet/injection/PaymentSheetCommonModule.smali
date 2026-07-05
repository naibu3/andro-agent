.class public abstract Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;
.super Ljava/lang/Object;
.source "PaymentSheetCommonModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/link/injection/LinkCommonModule;
    }
    subcomponents = {
        Lcom/stripe/android/link/injection/LinkAnalyticsComponent;,
        Lcom/stripe/android/link/injection/LinkComponent;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008!\u0018\u0000 22\u00020\u0001:\u00012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0019H\'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u001fH\'J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020%H\'J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\'J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\'J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\'\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;",
        "",
        "<init>",
        "()V",
        "bindsEventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        "bindsCustomerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "repository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;",
        "bindsErrorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;",
        "bindsStripeIntentRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "impl",
        "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;",
        "bindsPaymentSheetLoader",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;",
        "bindsRetrieveCustomerEmail",
        "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
        "Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;",
        "bindsUserFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "Lcom/stripe/android/core/utils/RealUserFacingLogger;",
        "bindsLinkAccountStatusProvider",
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;",
        "bindsPaymentSheetUpdater",
        "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;",
        "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultPaymentSelectionUpdater;",
        "bindsLinkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "Lcom/stripe/android/link/RealLinkConfigurationCoordinator;",
        "bindsAnalyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "bindLinkGateFactory",
        "Lcom/stripe/android/link/gate/LinkGate$Factory;",
        "linkGateFactory",
        "Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;",
        "bindsCardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "defaultCardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;->Companion:Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract bindLinkGateFactory(Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;)Lcom/stripe/android/link/gate/LinkGate$Factory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsAnalyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCardAccountRangeRepositoryFactory(Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;)Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerRepository(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsErrorReporter(Lcom/stripe/android/payments/core/analytics/RealErrorReporter;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEventReporter(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation
.end method

.method public abstract bindsLinkAccountStatusProvider(Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;)Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkConfigurationCoordinator(Lcom/stripe/android/link/RealLinkConfigurationCoordinator;)Lcom/stripe/android/link/LinkConfigurationCoordinator;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsPaymentSheetLoader(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;)Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsPaymentSheetUpdater(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultPaymentSelectionUpdater;)Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsRetrieveCustomerEmail(Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;)Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsStripeIntentRepository(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsUserFacingLogger(Lcom/stripe/android/core/utils/RealUserFacingLogger;)Lcom/stripe/android/core/utils/UserFacingLogger;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
