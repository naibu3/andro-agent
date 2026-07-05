.class public final Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;
.super Ljava/lang/Object;
.source "DefaultEventReporter.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/analytics/EventReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$Companion;,
        Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 ~2\u00020\u0001:\u0001~Bc\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J7\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\'2\u0006\u00101\u001a\u00020\u001aH\u0016J\u0091\u0001\u00102\u001a\u00020\'2\u0008\u00103\u001a\u0004\u0018\u0001042\u0006\u0010\u001c\u001a\u00020\u001a2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u00105\u001a\u0002062\u0008\u0010 \u001a\u0004\u0018\u00010!2\u0006\u00107\u001a\u0002082\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020!0:2\u0006\u0010;\u001a\u00020\u001a2\u0008\u0010<\u001a\u0004\u0018\u00010\u001a2\u0008\u0010=\u001a\u0004\u0018\u00010\u001a2\u0006\u0010>\u001a\u00020\u001a2\u0008\u0010?\u001a\u0004\u0018\u00010@H\u0016\u00a2\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020\'2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\'2\u0006\u0010C\u001a\u00020DH\u0016J\u0008\u0010F\u001a\u00020\'H\u0016J\u0008\u0010G\u001a\u00020\'H\u0016J\u0008\u0010H\u001a\u00020\'H\u0016J\u0008\u0010I\u001a\u00020\'H\u0016J\u0014\u0010J\u001a\u00020\'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0014\u0010M\u001a\u00020\'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0014\u0010N\u001a\u00020\'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0014\u0010O\u001a\u00020\'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0010\u0010P\u001a\u00020\'2\u0006\u0010K\u001a\u00020!H\u0016J\u0008\u0010Q\u001a\u00020\'H\u0016J\u0010\u0010R\u001a\u00020\'2\u0006\u00103\u001a\u000204H\u0016J\u0010\u0010S\u001a\u00020\'2\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020\'2\u0006\u00103\u001a\u000204H\u0016J\u001a\u0010W\u001a\u00020\'2\u0006\u00103\u001a\u0002042\u0008\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0018\u0010Z\u001a\u00020\'2\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020[H\u0016J\u0012\u0010\\\u001a\u00020\'2\u0008\u0010]\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010^\u001a\u00020\'2\u0006\u0010_\u001a\u00020!H\u0016J\u0008\u0010`\u001a\u00020\'H\u0016J\u0008\u0010a\u001a\u00020\'H\u0016J\u0018\u0010b\u001a\u00020\'2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020UH\u0016J\u0012\u0010f\u001a\u00020\'2\u0008\u0010e\u001a\u0004\u0018\u00010UH\u0016J\u001a\u0010g\u001a\u00020\'2\u0008\u0010e\u001a\u0004\u0018\u00010U2\u0006\u0010C\u001a\u00020DH\u0016J\u0012\u0010h\u001a\u00020\'2\u0008\u0010i\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010j\u001a\u00020\'2\u0006\u0010k\u001a\u00020lH\u0016J\u001a\u0010m\u001a\u00020\'2\u0008\u0010i\u001a\u0004\u0018\u00010!2\u0006\u0010C\u001a\u00020DH\u0016J\u0008\u0010n\u001a\u00020\'H\u0016J\u0010\u0010o\u001a\u00020\'2\u0006\u0010p\u001a\u00020qH\u0016J\u0010\u0010r\u001a\u00020\'2\u0006\u0010p\u001a\u00020sH\u0016J\u0008\u0010t\u001a\u00020\'H\u0016J\u0008\u0010u\u001a\u00020\'H\u0016J\u0010\u0010v\u001a\u00020\'2\u0006\u0010w\u001a\u00020\u001aH\u0016J\u0010\u0010x\u001a\u00020\'2\u0006\u0010p\u001a\u00020yH\u0002J\u0010\u0010z\u001a\u00020\'2\u0006\u0010p\u001a\u00020yH\u0002J\u0010\u0010{\u001a\u00020\'2\u0006\u0010p\u001a\u00020|H\u0002J\u0012\u0010}\u001a\u0004\u0018\u00010!2\u0006\u0010K\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u007f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "context",
        "Landroid/content/Context;",
        "mode",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestV2Executor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "durationProvider",
        "Lcom/stripe/android/core/utils/DurationProvider;",
        "analyticEventCallbackProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "isStripeCardScanAvailable",
        "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
        "logger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/utils/DurationProvider;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;Lcom/stripe/android/core/utils/UserFacingLogger;)V",
        "isDeferred",
        "",
        "isSpt",
        "linkEnabled",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "googlePaySupported",
        "currency",
        "",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "analyticsRequestV2Factory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;",
        "onInit",
        "",
        "commonConfiguration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "primaryButtonColor",
        "configurationSpecificPayload",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V",
        "onLoadStarted",
        "initializedViaCompose",
        "onLoadSucceeded",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "linkDisplay",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "orderedLpms",
        "",
        "requireCvcRecollection",
        "hasDefaultPaymentMethod",
        "setAsDefaultEnabled",
        "paymentMethodOptionsSetupFutureUsage",
        "setupFutureUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V",
        "onLoadFailed",
        "error",
        "",
        "onElementsSessionLoadFailed",
        "onDismiss",
        "onShowExistingPaymentOptions",
        "onShowManageSavedPaymentMethods",
        "onShowNewPaymentOptions",
        "onSelectPaymentMethod",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "onRemoveSavedPaymentMethod",
        "onPaymentMethodFormShown",
        "onPaymentMethodFormInteraction",
        "onPaymentMethodFormCompleted",
        "onCardNumberCompleted",
        "onSelectPaymentOption",
        "onDisallowedCardBrandEntered",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "onPressConfirmButton",
        "onPaymentSuccess",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "onPaymentFailure",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;",
        "onLpmSpecFailure",
        "errorMessage",
        "onAutofill",
        "type",
        "onShowEditablePaymentOption",
        "onHideEditablePaymentOption",
        "onBrandChoiceSelected",
        "source",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;",
        "selectedBrand",
        "onUpdatePaymentMethodSucceeded",
        "onUpdatePaymentMethodFailed",
        "onSetAsDefaultPaymentMethodSucceeded",
        "paymentMethodType",
        "onExperimentExposure",
        "experiment",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;",
        "onSetAsDefaultPaymentMethodFailed",
        "onCannotProperlyReturnFromLinkAndOtherLPMs",
        "onUsBankAccountFormEvent",
        "event",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;",
        "onAnalyticsEvent",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "onShopPayWebViewLoadAttempt",
        "onShopPayWebViewConfirmSuccess",
        "onShopPayWebViewCancelled",
        "didReceiveECEClick",
        "fireEvent",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "fireV2Event",
        "fireAnalyticEvent",
        "Lcom/stripe/android/paymentelement/AnalyticEvent;",
        "determineLinkContextForPaymentMethodType",
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

.field public static final CLIENT_ID:Ljava/lang/String; = "stripe-mobile-sdk"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$Companion;

.field public static final ORIGIN:Ljava/lang/String; = "stripe-mobile-sdk-android"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final analyticEventCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final analyticsRequestV2Executor:Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

.field private final analyticsRequestV2Factory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

.field private currency:Ljava/lang/String;

.field private final durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

.field private financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

.field private googlePaySupported:Z

.field private isDeferred:Z

.field private isSpt:Z

.field private final isStripeCardScanAvailable:Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

.field private linkEnabled:Z

.field private linkMode:Lcom/stripe/android/model/LinkMode;

.field private final logger:Lcom/stripe/android/core/utils/UserFacingLogger;

.field private final mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->Companion:Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/utils/DurationProvider;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;Lcom/stripe/android/core/utils/UserFacingLogger;)V
    .locals 1
    .param p8    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/utils/DurationProvider;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
            "Lcom/stripe/android/core/utils/UserFacingLogger;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestV2Executor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticEventCallbackProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isStripeCardScanAvailable"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 42
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestV2Executor:Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    .line 43
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 44
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    .line 45
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticEventCallbackProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 47
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isStripeCardScanAvailable:Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    .line 48
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->logger:Lcom/stripe/android/core/utils/UserFacingLogger;

    move-object p2, p1

    .line 59
    new-instance p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    const/16 p6, 0x8

    const/4 p7, 0x0

    const-string p3, "stripe-mobile-sdk"

    const-string p4, "stripe-mobile-sdk-android"

    const/4 p5, 0x0

    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestV2Factory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    return-void
.end method

.method public static final synthetic access$getAnalyticEventCallbackProvider$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Ljavax/inject/Provider;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticEventCallbackProvider:Ljavax/inject/Provider;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsRequestV2Executor$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestV2Executor:Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsRequestV2Factory$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestV2Factory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/core/utils/UserFacingLogger;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->logger:Lcom/stripe/android/core/utils/UserFacingLogger;

    return-object p0
.end method

.method public static final synthetic access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method private final determineLinkContextForPaymentMethodType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 675
    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 676
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkMode:Lcom/stripe/android/model/LinkMode;

    sget-object v0, Lcom/stripe/android/model/LinkMode;->LinkCardBrand:Lcom/stripe/android/model/LinkMode;

    if-ne p1, v0, :cond_0

    .line 677
    const-string p1, "link_card_brand"

    return-object p1

    .line 679
    :cond_0
    const-string p1, "instant_debits"

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V
    .locals 7

    .line 661
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireAnalyticEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireAnalyticEvent$1;-><init>(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;Lcom/stripe/android/paymentelement/AnalyticEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V
    .locals 7

    .line 639
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireEvent$1;-><init>(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final fireV2Event(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V
    .locals 7

    .line 650
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireV2Event$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireV2Event$1;-><init>(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 594
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$onAnalyticsEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$onAnalyticsEvent$1;-><init>(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;Lcom/stripe/android/core/networking/AnalyticsEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public onAutofill(Ljava/lang/String;)V
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;

    .line 443
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 444
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 445
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 446
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v2, p1

    .line 441
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;-><init>(Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 440
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onBrandChoiceSelected(Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
    .locals 8

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected;

    .line 476
    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 481
    sget-object p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;->Add:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;

    goto :goto_0

    .line 476
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 478
    :cond_1
    sget-object p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;->Edit:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;

    :goto_0
    move-object v2, p1

    .line 485
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 486
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 487
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 488
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v3, p2

    .line 475
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected;-><init>(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;Lcom/stripe/android/model/CardBrand;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 474
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onCannotProperlyReturnFromLinkAndOtherLPMs()V
    .locals 2

    .line 568
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CannotProperlyReturnFromLinkAndLPMs;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CannotProperlyReturnFromLinkAndLPMs;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onCardNumberCompleted()V
    .locals 5

    .line 315
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardNumberCompleted;

    .line 316
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 317
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 318
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 319
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 315
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardNumberCompleted;-><init>(ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 314
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
    .locals 7

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandDisallowed;

    .line 349
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 350
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 351
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 352
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v2, p1

    .line 347
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandDisallowed;-><init>(Lcom/stripe/android/model/CardBrand;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 346
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onDismiss()V
    .locals 5

    .line 186
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 187
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 188
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 189
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 185
    new-instance v4, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;

    invoke-direct {v4, v0, v2, v1, v3}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;-><init>(ZZZZ)V

    check-cast v4, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 184
    invoke-direct {p0, v4}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onElementsSessionLoadFailed(Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ElementsSessionLoadFailed;

    .line 175
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 176
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 177
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 178
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v2, p1

    .line 173
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ElementsSessionLoadFailed;-><init>(Ljava/lang/Throwable;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 172
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onExperimentExposure(Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V
    .locals 7

    const-string v0, "experiment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 544
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 545
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 546
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 541
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;-><init>(ZZZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 540
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireV2Event(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onHideEditablePaymentOption()V
    .locals 5

    .line 464
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$HideEditablePaymentOption;

    .line 465
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 466
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 467
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 468
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 464
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$HideEditablePaymentOption;-><init>(ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 463
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onInit(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V
    .locals 13

    const-string v0, "commonConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appearance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationSpecificPayload"

    move-object/from16 v6, p4

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v9, p5

    .line 72
    iput-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 76
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 82
    iget-boolean v10, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 83
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 84
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 85
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isStripeCardScanAvailable:Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    invoke-interface {v0}, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;->invoke()Z

    move-result v11

    .line 86
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticEventCallbackProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v12, v0

    .line 75
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;ZZZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 74
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onLoadFailed(Ljava/lang/Throwable;)V
    .locals 10

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v1, Lcom/stripe/android/core/utils/DurationProvider$Key;->Loading:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-interface {v0, v1}, Lcom/stripe/android/core/utils/DurationProvider;->end-LV8wdWc(Lcom/stripe/android/core/utils/DurationProvider$Key;)Lkotlin/time/Duration;

    move-result-object v3

    .line 163
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 164
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 165
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 166
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 160
    new-instance v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadFailed;

    const/4 v9, 0x0

    move-object v4, p1

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadFailed;-><init>(Lkotlin/time/Duration;Ljava/lang/Throwable;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 159
    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onLoadStarted(Z)V
    .locals 11

    .line 92
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v1, Lcom/stripe/android/core/utils/DurationProvider$Key;->Loading:Lcom/stripe/android/core/utils/DurationProvider$Key;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/stripe/android/core/utils/DurationProvider$DefaultImpls;->start$default(Lcom/stripe/android/core/utils/DurationProvider;Lcom/stripe/android/core/utils/DurationProvider$Key;ZILjava/lang/Object;)V

    .line 95
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 96
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 97
    iget-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 98
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 94
    new-instance v5, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadStarted;

    move v10, p1

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadStarted;-><init>(ZZZZZ)V

    check-cast v5, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 93
    invoke-direct {p0, v5}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onLoadSucceeded(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Z",
            "Lcom/stripe/android/model/LinkMode;",
            "Z",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Z",
            "Lcom/stripe/android/model/StripeIntent$Usage;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p7

    const-string v1, "linkDisplay"

    move-object/from16 v11, p5

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "initializationMode"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "orderedLpms"

    move-object/from16 v4, p9

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p6

    .line 120
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    move/from16 v7, p2

    .line 121
    iput-boolean v7, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    move-object/from16 v6, p3

    .line 122
    iput-object v6, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkMode:Lcom/stripe/android/model/LinkMode;

    .line 123
    instance-of v1, v3, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 124
    move-object v1, v3

    check-cast v1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getIntentBehavior$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;

    move-result-object v1

    instance-of v1, v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    .line 123
    :goto_0
    iput-boolean v1, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    move/from16 v10, p4

    .line 126
    iput-boolean v10, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object/from16 v12, p8

    .line 127
    iput-object v12, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 129
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v5, Lcom/stripe/android/core/utils/DurationProvider$Key;->Checkout:Lcom/stripe/android/core/utils/DurationProvider$Key;

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v1, v5, v2, v8, v9}, Lcom/stripe/android/core/utils/DurationProvider$DefaultImpls;->start$default(Lcom/stripe/android/core/utils/DurationProvider;Lcom/stripe/android/core/utils/DurationProvider$Key;ZILjava/lang/Object;)V

    .line 131
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v2, Lcom/stripe/android/core/utils/DurationProvider$Key;->Loading:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-interface {v1, v2}, Lcom/stripe/android/core/utils/DurationProvider;->end-LV8wdWc(Lcom/stripe/android/core/utils/DurationProvider$Key;)Lkotlin/time/Duration;

    move-result-object v5

    .line 137
    iget-boolean v8, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 138
    iget-boolean v9, v0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 134
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;

    const/16 v18, 0x0

    move-object/from16 v2, p1

    move/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move/from16 v17, p13

    move-object/from16 v16, p14

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 133
    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onLpmSpecFailure(Ljava/lang/String;)V
    .locals 6

    .line 427
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;

    .line 428
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 429
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 430
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 431
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v5, p1

    .line 427
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;-><init>(ZZZZLjava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 426
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentFailure(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;)V
    .locals 14

    move-object/from16 v0, p2

    const-string v1, "paymentSelection"

    move-object v6, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "error"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 407
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v2, Lcom/stripe/android/core/utils/DurationProvider$Key;->Checkout:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-interface {v1, v2}, Lcom/stripe/android/core/utils/DurationProvider;->end-LV8wdWc(Lcom/stripe/android/core/utils/DurationProvider$Key;)Lkotlin/time/Duration;

    move-result-object v5

    .line 411
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 414
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;-><init>(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;)V

    .line 415
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 416
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 417
    iget-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 418
    iget-boolean v10, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 419
    iget-boolean v11, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 410
    new-instance v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;

    .line 414
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 410
    invoke-direct/range {v2 .. v13}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 409
    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentMethodFormCompleted(Ljava/lang/String;)V
    .locals 7

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$CompletedPaymentMethodForm;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/AnalyticEvent$CompletedPaymentMethodForm;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    .line 297
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 305
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 306
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 307
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 308
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 303
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentMethodFormCompleted;

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentMethodFormCompleted;-><init>(Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 302
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentMethodFormInteraction(Ljava/lang/String;)V
    .locals 7

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$StartedInteractionWithPaymentMethodForm;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/AnalyticEvent$StartedInteractionWithPaymentMethodForm;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 288
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 289
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 290
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 291
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 286
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentOptionFormInteraction;

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentOptionFormInteraction;-><init>(Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 285
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentMethodFormShown(Ljava/lang/String;)V
    .locals 7

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v1, Lcom/stripe/android/core/utils/DurationProvider$Key;->ConfirmButtonClicked:Lcom/stripe/android/core/utils/DurationProvider$Key;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/stripe/android/core/utils/DurationProvider$DefaultImpls;->start$default(Lcom/stripe/android/core/utils/DurationProvider;Lcom/stripe/android/core/utils/DurationProvider$Key;ZILjava/lang/Object;)V

    .line 271
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$DisplayedPaymentMethodForm;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/AnalyticEvent$DisplayedPaymentMethodForm;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 273
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowPaymentOptionForm;

    .line 275
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 276
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 277
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 278
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v2, p1

    .line 273
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowPaymentOptionForm;-><init>(Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 272
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentSuccess(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V
    .locals 13

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 384
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getWalletType()Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v5, v0

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, p1

    .line 385
    :goto_2
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->Checkout:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-interface {p1, v0}, Lcom/stripe/android/core/utils/DurationProvider;->end-LV8wdWc(Lcom/stripe/android/core/utils/DurationProvider$Key;)Lkotlin/time/Duration;

    move-result-object v4

    .line 389
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 392
    sget-object p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Success;->INSTANCE:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Success;

    .line 393
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    move v7, v0

    .line 395
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 396
    iget-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 397
    iget-boolean v10, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 388
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;

    .line 392
    move-object v3, p1

    check-cast v3, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;

    const/4 v12, 0x0

    move-object v11, p2

    .line 388
    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 387
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPressConfirmButton(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 13

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v1, Lcom/stripe/android/core/utils/DurationProvider$Key;->ConfirmButtonClicked:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-interface {v0, v1}, Lcom/stripe/android/core/utils/DurationProvider;->end-LV8wdWc(Lcom/stripe/android/core/utils/DurationProvider$Key;)Lkotlin/time/Duration;

    move-result-object v4

    .line 360
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$TappedConfirmButton;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->code(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/AnalyticEvent$TappedConfirmButton;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 363
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 365
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->code(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v5

    .line 366
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->linkContext(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v6

    .line 367
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 368
    iget-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 369
    iget-boolean v10, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 370
    iget-boolean v11, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 371
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 362
    new-instance v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;-><init>(Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 361
    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onRemoveSavedPaymentMethod(Ljava/lang/String;)V
    .locals 9

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$RemovedSavedPaymentMethod;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/AnalyticEvent$RemovedSavedPaymentMethod;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 256
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$RemovePaymentOption;

    .line 257
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 259
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 260
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 261
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 262
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 263
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v3, p1

    .line 256
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$RemovePaymentOption;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 255
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onSelectPaymentMethod(Ljava/lang/String;)V
    .locals 10

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$SelectedPaymentMethodType;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/AnalyticEvent$SelectedPaymentMethodType;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 242
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 243
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 244
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 245
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 246
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->determineLinkContextForPaymentMethodType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 247
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 248
    iget-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 240
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentMethod;

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 239
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onSelectPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 10

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->isSaved(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->code(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 329
    new-instance v1, Lcom/stripe/android/paymentelement/AnalyticEvent$SelectedSavedPaymentMethod;

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentelement/AnalyticEvent$SelectedSavedPaymentMethod;-><init>(Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 333
    :cond_0
    new-instance v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;

    .line 334
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 336
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 337
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 338
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 339
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 340
    iget-boolean v9, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v4, p1

    .line 333
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZ)V

    check-cast v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 332
    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onSetAsDefaultPaymentMethodFailed(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodFailed;

    .line 558
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 559
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 560
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 561
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v7, p1

    move-object v2, p2

    .line 556
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodFailed;-><init>(Ljava/lang/Throwable;ZZZZLjava/lang/String;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 555
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onSetAsDefaultPaymentMethodSucceeded(Ljava/lang/String;)V
    .locals 6

    .line 527
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodSucceeded;

    .line 528
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 529
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 530
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 531
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v5, p1

    .line 527
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodSucceeded;-><init>(ZZZZLjava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 526
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShopPayWebViewCancelled(Z)V
    .locals 6

    .line 628
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewCancelled;

    .line 629
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 630
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 631
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 632
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move v5, p1

    .line 628
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewCancelled;-><init>(ZZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 627
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShopPayWebViewConfirmSuccess()V
    .locals 5

    .line 617
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewConfirmSuccess;

    .line 618
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 619
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 620
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 621
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 617
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewConfirmSuccess;-><init>(ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 616
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShopPayWebViewLoadAttempt()V
    .locals 5

    .line 606
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewLoadAttempt;

    .line 607
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 608
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 609
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 610
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 606
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewLoadAttempt;-><init>(ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 605
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShowEditablePaymentOption()V
    .locals 5

    .line 453
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowEditablePaymentOption;

    .line 454
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 455
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 456
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 457
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 453
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowEditablePaymentOption;-><init>(ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 452
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShowExistingPaymentOptions()V
    .locals 8

    .line 195
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$PresentedSheet;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/AnalyticEvent$PresentedSheet;-><init>()V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 198
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 199
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 200
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 201
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 202
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 203
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 197
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 196
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShowManageSavedPaymentMethods()V
    .locals 7

    .line 211
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 212
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 213
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 214
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 215
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 216
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 210
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowManagePaymentMethods;

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowManagePaymentMethods;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 209
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShowNewPaymentOptions()V
    .locals 8

    .line 222
    new-instance v0, Lcom/stripe/android/paymentelement/AnalyticEvent$PresentedSheet;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/AnalyticEvent$PresentedSheet;-><init>()V

    check-cast v0, Lcom/stripe/android/paymentelement/AnalyticEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireAnalyticEvent(Lcom/stripe/android/paymentelement/AnalyticEvent;)V

    .line 225
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 226
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 227
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 228
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->currency:Ljava/lang/String;

    .line 229
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 230
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 224
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptions;

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptions;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 223
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onUpdatePaymentMethodFailed(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionFailed;

    .line 515
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 516
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 517
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 518
    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v2, p1

    move-object v3, p2

    .line 512
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionFailed;-><init>(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;ZZZZ)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 511
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onUpdatePaymentMethodSucceeded(Lcom/stripe/android/model/CardBrand;)V
    .locals 6

    .line 497
    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionSucceeded;

    .line 499
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 500
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 501
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 502
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    move-object v1, p1

    .line 497
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionSucceeded;-><init>(Lcom/stripe/android/model/CardBrand;ZZZZ)V

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 496
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onUsBankAccountFormEvent(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 573
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Started;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorStarted;

    .line 574
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 575
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 576
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 577
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 578
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 573
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorStarted;-><init>(ZZZZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    goto :goto_0

    .line 581
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;

    if-eqz v0, :cond_1

    .line 582
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isDeferred:Z

    .line 583
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->isSpt:Z

    .line 584
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->linkEnabled:Z

    .line 585
    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->googlePaySupported:Z

    .line 586
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;

    .line 587
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 581
    new-instance v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorFinished;

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorFinished;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;ZZZZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;

    .line 590
    :goto_0
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void

    .line 572
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
