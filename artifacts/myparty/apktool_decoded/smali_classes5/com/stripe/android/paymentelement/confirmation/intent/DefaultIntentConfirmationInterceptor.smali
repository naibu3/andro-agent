.class public final Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;
.super Ljava/lang/Object;
.source "IntentConfirmationInterceptor.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 S2\u00020\u0001:\u0001SBe\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\u000e\u0008\u0001\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0010\u0008\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JL\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0002\u0010&JD\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0096@\u00a2\u0006\u0002\u0010)JD\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0002\u0010-JD\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010\'\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0002\u0010/JD\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010\'\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0002\u0010/J \u00101\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020(2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0082@\u00a2\u0006\u0002\u00102J\u001e\u00103\u001a\u0008\u0012\u0004\u0012\u00020(042\u0006\u00105\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u0004\u0018\u00010\u0008H\u0082@\u00a2\u0006\u0002\u00109J\u0010\u0010:\u001a\u0004\u0018\u00010\nH\u0082@\u00a2\u0006\u0002\u00109J\n\u0010;\u001a\u0004\u0018\u00010\u0008H\u0002J\n\u0010<\u001a\u0004\u0018\u00010\nH\u0002JL\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u00082\u0006\u0010+\u001a\u00020,2\u0006\u0010\'\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010.\u001a\u00020\u000c2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0082@\u00a2\u0006\u0002\u0010?JD\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,2\u0006\u0010\'\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0082@\u00a2\u0006\u0002\u0010BJ \u0010C\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(H\u0002J\u001e\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u001c042\u0006\u0010A\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008E\u0010FJF\u0010G\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\'\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010H\u001a\u00020\u000cH\u0002JB\u0010G\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u001c\u0010I\u001a\u00020J2\n\u0010K\u001a\u00060Lj\u0002`M2\u0006\u0010N\u001a\u00020\u000fH\u0002J\u0012\u0010O\u001a\u00020P2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u000c\u0010Q\u001a\u00020R*\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006T"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "intentCreationCallbackProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "preparePaymentMethodHandlerProvider",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "allowsManualConfirmation",
        "",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "stripeAccountIdProvider",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljavax/inject/Provider;Ljavax/inject/Provider;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getRequestOptions",
        "()Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "intercept",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "paymentMethodOptionsParams",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
        "paymentMethodExtraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "shippingValues",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
        "customerRequestedSave",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleDeferred",
        "intentConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "shouldSavePaymentMethod",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleDeferredIntent",
        "handlePreparePaymentMethod",
        "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethod",
        "Lkotlin/Result;",
        "params",
        "createPaymentMethod-gIAlu-s",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "waitForIntentCallback",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "waitForPreparePaymentMethodHandler",
        "retrieveCallback",
        "retrievePreparePaymentMethodHandler",
        "handleDeferredIntentCreationFromPaymentMethod",
        "createIntentCallback",
        "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleDeferredIntentCreationSuccess",
        "clientSecret",
        "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createHandleNextActionStep",
        "retrieveStripeIntent",
        "retrieveStripeIntent-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createConfirmStep",
        "isDeferred",
        "createFailStep",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;",
        "exception",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "message",
        "failIfSetAsDefaultFeatureIsEnabled",
        "",
        "toAddressDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
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

.field private static final Companion:Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$Companion;

.field private static final PROVIDER_FETCH_INTERVAL:J = 0x5L

.field private static final PROVIDER_FETCH_TIMEOUT:I = 0x2


# instance fields
.field private final allowsManualConfirmation:Z

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final intentCreationCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final preparePaymentMethodHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
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

.field private final stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->Companion:Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljavax/inject/Provider;Ljavax/inject/Provider;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p5    # Z
        .annotation runtime Ljavax/inject/Named;
            value = "ALLOWS_MANUAL_CONFIRMATION"
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "publishableKey"
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "stripeAccountId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;Z",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentCreationCallbackProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preparePaymentMethodHandlerProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 153
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 154
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->intentCreationCallbackProvider:Ljavax/inject/Provider;

    .line 155
    iput-object p4, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->preparePaymentMethodHandlerProvider:Ljavax/inject/Provider;

    .line 156
    iput-boolean p5, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->allowsManualConfirmation:Z

    .line 157
    iput-object p6, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    .line 158
    iput-object p7, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final synthetic access$createPaymentMethod-gIAlu-s(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleDeferred(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleDeferred(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleDeferredIntent(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferredIntent(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleDeferredIntentCreationFromPaymentMethod(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferredIntentCreationFromPaymentMethod(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleDeferredIntentCreationSuccess(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferredIntentCreationSuccess(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handlePreparePaymentMethod(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handlePreparePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveCallback(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;)Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 0

    .line 150
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->retrieveCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrievePreparePaymentMethodHandler(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;)Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 0

    .line 150
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->retrievePreparePaymentMethodHandler()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveStripeIntent-gIAlu-s(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->retrieveStripeIntent-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$waitForIntentCallback(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->waitForIntentCallback(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$waitForPreparePaymentMethodHandler(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->waitForPreparePaymentMethodHandler(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Z)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;
    .locals 1

    .line 588
    sget-object v0, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->Companion:Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;->createFactory(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/ConfirmStripeIntentParamsFactory;

    move-result-object p3

    if-nez p3, :cond_0

    .line 592
    move-object p3, p0

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    .line 593
    new-instance p3, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;-><init>(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    .line 595
    move-object p1, p3

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createFailStep(Ljava/lang/Exception;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p1

    .line 598
    :cond_0
    invoke-virtual {p3, p4, p5, p6}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p1

    .line 603
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-direct {p2, p1, p7}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;-><init>(Lcom/stripe/android/model/ConfirmStripeIntentParams;Z)V

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p2
.end method

.method private final createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;
    .locals 1

    .line 617
    sget-object v0, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->Companion:Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;->createFactory(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/ConfirmStripeIntentParamsFactory;

    move-result-object p3

    if-nez p3, :cond_0

    .line 621
    move-object p3, p0

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    .line 622
    new-instance p3, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;-><init>(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    .line 624
    move-object p1, p3

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createFailStep(Ljava/lang/Exception;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p1

    .line 627
    :cond_0
    invoke-virtual {p3, p4, p5, p6}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p1

    .line 633
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;-><init>(Lcom/stripe/android/model/ConfirmStripeIntentParams;Z)V

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p2
.end method

.method static synthetic createConfirmStep$default(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;
    .locals 1

    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1

    move-object p6, v0

    .line 609
    :cond_1
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p0

    return-object p0
.end method

.method private final createFailStep(Ljava/lang/Exception;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;
    .locals 2

    .line 643
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 644
    check-cast p1, Ljava/lang/Throwable;

    .line 645
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 646
    sget p2, Lcom/stripe/android/R$string;->stripe_internal_error:I

    invoke-static {p2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    goto :goto_0

    .line 648
    :cond_0
    invoke-static {p2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    .line 643
    :goto_0
    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    return-object v0
.end method

.method private final createHandleNextActionStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;
    .locals 3

    .line 561
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    .line 562
    sget-object v0, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->INSTANCE:Lcom/stripe/android/paymentsheet/DeferredIntentValidator;

    invoke-virtual {v0, p2, p3}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->validatePaymentMethod(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;)V

    .line 563
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    invoke-direct {p2, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;-><init>(Ljava/lang/String;)V

    .line 561
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 564
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    .line 565
    :cond_0
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 566
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;

    invoke-direct {p2}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;-><init>()V

    check-cast p2, Ljava/lang/Throwable;

    .line 567
    sget p3, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_invalid_deferred_intent_usage:I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p3, v0, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    .line 565
    invoke-direct {p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    .line 564
    :goto_1
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p1
.end method

.method private final createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 422
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 425
    iget-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 427
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v2

    .line 425
    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$createPaymentMethod$1;->label:I

    invoke-interface {p2, p1, v2, v0}, Lcom/stripe/android/networking/StripeRepository;->createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method private final failIfSetAsDefaultFeatureIsEnabled(Lcom/stripe/android/model/PaymentMethodExtraParams;)V
    .locals 2

    .line 660
    instance-of v0, p1, Lcom/stripe/android/model/PaymentMethodExtraParams$Card;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/model/PaymentMethodExtraParams$Card;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodExtraParams$Card;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    .line 661
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    .line 662
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/model/PaymentMethodExtraParams$Link;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/stripe/android/model/PaymentMethodExtraParams$Link;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodExtraParams$Link;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    .line 663
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;->getSetAsDefault()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    .line 664
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/model/PaymentMethodExtraParams$BacsDebit;

    if-nez v0, :cond_5

    if-nez p1, :cond_4

    goto :goto_0

    .line 659
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_7

    .line 667
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    .line 668
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 669
    const-string v0, "(Test-mode only error) The default payment methods feature is not yet supported with deferred server-side confirmation. Please contact us if you\'d like to use this feature via a Github issue on stripe-android."

    .line 668
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    return-void
.end method

.method private final getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 6

    .line 161
    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 162
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 163
    iget-object v2, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 161
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 310
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getIntentBehavior$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;

    move-result-object v0

    .line 311
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$Default;

    if-eqz v1, :cond_0

    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferredIntent(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p0

    return-object p1

    :cond_0
    move-object p1, p2

    move-object p2, p0

    .line 319
    instance-of p3, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;

    if-eqz p3, :cond_1

    invoke-direct {p0, p1, p5, p7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handlePreparePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 310
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    instance-of v2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;

    iget v3, v2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v10, v2

    iget-object v1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 262
    iget v3, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v3, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->Z$0:Z

    iget-object v5, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object v6, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/model/PaymentMethodExtraParams;

    iget-object v7, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    iget-object v8, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    iget-object v9, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v36, v9

    move v9, v3

    move-object/from16 v3, v36

    move-object/from16 v36, v7

    move-object v7, v6

    move-object/from16 v6, v36

    goto/16 :goto_1

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 270
    invoke-static {}, Lkotlin/collections/SetsKt;->createSetBuilder()Ljava/util/Set;

    move-result-object v1

    .line 271
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getAttribution()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 272
    const-string v3, "deferred-intent"

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 273
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 274
    const-string v3, "autopm"

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 270
    :cond_4
    invoke-static {v1}, Lkotlin/collections/SetsKt;->build(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v32

    const v34, 0x2fffff

    const/16 v35, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v11, p2

    .line 278
    invoke-static/range {v11 .. v35}, Lcom/stripe/android/model/PaymentMethodCreateParams;->copy$default(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;Lcom/stripe/android/model/PaymentMethodCreateParams$ShopPay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Lcom/stripe/android/model/RadarOptions;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 282
    iput-object v0, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$0:Ljava/lang/Object;

    move-object/from16 v3, p1

    iput-object v3, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$1:Ljava/lang/Object;

    move-object/from16 v6, p3

    iput-object v6, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$2:Ljava/lang/Object;

    move-object/from16 v7, p4

    iput-object v7, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$3:Ljava/lang/Object;

    move-object/from16 v8, p5

    iput-object v8, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$4:Ljava/lang/Object;

    move/from16 v9, p6

    iput-boolean v9, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->Z$0:Z

    iput v5, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->label:I

    invoke-direct {v0, v1, v10}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    goto :goto_2

    :cond_5
    move-object v5, v8

    move-object v8, v3

    move-object v3, v0

    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v11

    if-nez v11, :cond_7

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    const/4 v11, 0x0

    .line 284
    iput-object v11, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$0:Ljava/lang/Object;

    iput-object v11, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$1:Ljava/lang/Object;

    iput-object v11, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$2:Ljava/lang/Object;

    iput-object v11, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$3:Ljava/lang/Object;

    iput-object v11, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->L$4:Ljava/lang/Object;

    iput v4, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferred$1;->label:I

    move-object v4, v8

    move-object v8, v5

    move-object v5, v1

    invoke-direct/range {v3 .. v10}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    :goto_2
    return-object v2

    .line 262
    :cond_6
    :goto_3
    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object v1

    .line 294
    :cond_7
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 296
    invoke-static {v11}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    .line 294
    invoke-direct {v1, v11, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object v1
.end method

.method private final handleDeferredIntent(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p7

    instance-of v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;

    iget v2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v10, v1

    iget-object v0, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 326
    iget v2, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->Z$0:Z

    iget-object p2, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$5:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object v2, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/PaymentMethodExtraParams;

    iget-object v4, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    iget-object v5, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/PaymentMethod;

    iget-object v6, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    iget-object v7, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v7, v2

    move-object v2, v8

    move-object v8, v6

    move-object v6, v4

    move-object v4, v8

    move v8, p1

    move-object v9, p2

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 334
    iput-object p0, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$0:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$1:Ljava/lang/Object;

    iput-object p2, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$2:Ljava/lang/Object;

    iput-object p3, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$3:Ljava/lang/Object;

    iput-object p4, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$4:Ljava/lang/Object;

    move-object/from16 v5, p5

    iput-object v5, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$5:Ljava/lang/Object;

    move/from16 v6, p6

    iput-boolean v6, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->Z$0:Z

    iput v4, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->label:I

    invoke-direct {p0, v10}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->waitForIntentCallback(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    move-object v7, p4

    move-object v0, v4

    move-object v9, v5

    move v8, v6

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    .line 326
    :goto_1
    check-cast v0, Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    if-eqz v0, :cond_6

    const/4 p1, 0x0

    .line 336
    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$0:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$1:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$2:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$3:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$4:Ljava/lang/Object;

    iput-object p1, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->L$5:Ljava/lang/Object;

    iput v3, v10, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntent$1;->label:I

    move-object v3, v0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferredIntentCreationFromPaymentMethod(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    .line 348
    :cond_6
    const-class p1, Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    .line 351
    iget-object p2, v2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CREATE_INTENT_CALLBACK_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    check-cast p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object p3, p1

    move/from16 p6, v0

    move-object/from16 p7, v1

    move-object p4, v3

    move-object/from16 p5, v4

    invoke-static/range {p2 .. p7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 353
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 354
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "CreateIntentCallback must be implemented when using IntentConfiguration with PaymentSheet"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 355
    invoke-direct {v2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 356
    sget v0, Lcom/stripe/android/R$string;->stripe_internal_error:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    goto :goto_3

    .line 358
    :cond_7
    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 353
    :goto_3
    invoke-direct {p1, p2, v0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p1
.end method

.method private final handleDeferredIntentCreationFromPaymentMethod(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Z",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p8

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p8, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->label:I

    sub-int/2addr p8, v2

    iput p8, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;

    invoke-direct {v0, p0, p8}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p8, v0

    iget-object v0, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 481
    iget v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$5:Ljava/lang/Object;

    move-object p7, p1

    check-cast p7, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object p1, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$4:Ljava/lang/Object;

    move-object p5, p1

    check-cast p5, Lcom/stripe/android/model/PaymentMethodExtraParams;

    iget-object p1, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$3:Ljava/lang/Object;

    move-object p4, p1

    check-cast p4, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    iget-object p1, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$2:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/model/PaymentMethod;

    iget-object p1, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    iget-object p1, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :goto_1
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 490
    iput-object p0, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object p2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object p3, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput-object p4, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$3:Ljava/lang/Object;

    iput-object p5, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$4:Ljava/lang/Object;

    iput-object p7, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$5:Ljava/lang/Object;

    iput v4, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->label:I

    invoke-interface {p1, p3, p6, p8}, Lcom/stripe/android/paymentsheet/CreateIntentCallback;->onCreateIntent(Lcom/stripe/android/model/PaymentMethod;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object p1, p0

    goto :goto_1

    .line 481
    :goto_2
    check-cast v0, Lcom/stripe/android/paymentsheet/CreateIntentResult;

    .line 496
    instance-of p2, v0, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;

    if-eqz p2, :cond_7

    .line 497
    check-cast v0, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;->getClientSecret$paymentsheet_release()Ljava/lang/String;

    move-result-object p2

    const-string v2, "COMPLETE_WITHOUT_CONFIRMING_INTENT"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    .line 498
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;

    const/4 p2, 0x0

    invoke-direct {p1, v4, p2, v3, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p1

    .line 501
    :cond_5
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;->getClientSecret$paymentsheet_release()Ljava/lang/String;

    move-result-object p2

    .line 500
    iput-object v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput-object v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$3:Ljava/lang/Object;

    iput-object v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$4:Ljava/lang/Object;

    iput-object v2, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->L$5:Ljava/lang/Object;

    iput v3, p8, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1;->label:I

    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferredIntentCreationSuccess(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    return-object p1

    .line 511
    :cond_7
    instance-of p1, v0, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;

    if-eqz p1, :cond_a

    .line 512
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentCallbackFailureException;

    check-cast v0, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;->getCause$paymentsheet_release()Ljava/lang/Exception;

    move-result-object p2

    check-cast p2, Ljava/lang/Throwable;

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentCallbackFailureException;-><init>(Ljava/lang/Throwable;)V

    .line 513
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 514
    check-cast p1, Ljava/lang/Throwable;

    .line 515
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;->getDisplayMessage$paymentsheet_release()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_8

    invoke-static {p3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    if-nez p3, :cond_9

    .line 516
    :cond_8
    invoke-static {p1}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    .line 513
    :cond_9
    invoke-direct {p2, p1, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    return-object p2

    .line 495
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final handleDeferredIntentCreationSuccess(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p7

    instance-of v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;

    iget v2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 522
    iget v3, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$6:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object p2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$5:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/PaymentMethodExtraParams;

    iget-object p3, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$4:Ljava/lang/Object;

    check-cast p3, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    iget-object v2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    iget-object v4, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v1, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    move-object v6, p1

    move-object v9, p2

    move-object v8, p3

    move-object v7, v2

    move-object p2, v3

    move-object v3, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 530
    iput-object p0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$1:Ljava/lang/Object;

    iput-object p2, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$2:Ljava/lang/Object;

    iput-object p3, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$3:Ljava/lang/Object;

    iput-object p4, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$4:Ljava/lang/Object;

    move-object/from16 v3, p5

    iput-object v3, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$5:Ljava/lang/Object;

    move-object/from16 v5, p6

    iput-object v5, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->L$6:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1;->label:I

    invoke-direct {p0, p1, v1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->retrieveStripeIntent-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v4, p1

    move-object v7, p3

    move-object v8, p4

    move-object v0, v1

    move-object v9, v3

    move-object v6, v5

    move-object v3, p0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/model/StripeIntent;

    .line 531
    invoke-interface {v5}, Lcom/stripe/android/model/StripeIntent;->isConfirmed()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 532
    invoke-direct {v3, v9}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->failIfSetAsDefaultFeatureIsEnabled(Lcom/stripe/android/model/PaymentMethodExtraParams;)V

    .line 533
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    goto :goto_2

    .line 534
    :cond_4
    invoke-interface {v5}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 535
    invoke-direct {v3, v4, v5, v7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createHandleNextActionStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p1

    goto :goto_2

    .line 537
    :cond_5
    sget-object p1, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->INSTANCE:Lcom/stripe/android/paymentsheet/DeferredIntentValidator;

    iget-boolean p3, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->allowsManualConfirmation:Z

    invoke-virtual {p1, v5, p2, p3}, Lcom/stripe/android/paymentsheet/DeferredIntentValidator;->validate(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Z)Lcom/stripe/android/model/StripeIntent;

    const/4 v10, 0x1

    .line 538
    invoke-direct/range {v3 .. v10}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Z)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p1

    .line 530
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 548
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_4

    .line 549
    :cond_7
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 551
    invoke-static {p2}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    .line 549
    invoke-direct {p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    :goto_4
    return-object p1
.end method

.method private final handlePreparePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    instance-of v3, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;

    iget v4, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v0, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    sub-int/2addr v0, v5

    iput v0, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 365
    iget v5, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object v5, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/PaymentMethod;

    iget-object v7, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object v2, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    iget-object v5, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/PaymentMethod;

    iget-object v9, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v10, v2

    move-object v2, v5

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v10, v2

    move-object v2, v5

    goto :goto_3

    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 369
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    .line 370
    iget-object v0, v1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 371
    iget-object v5, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-eqz v5, :cond_6

    .line 378
    invoke-direct {v1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v9

    .line 370
    iput-object v1, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$1:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v10, p2

    :try_start_3
    iput-object v10, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v8, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    invoke-interface {v0, v5, v9, v3}, Lcom/stripe/android/networking/StripeRepository;->createSavedPaymentMethodRadarSession-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v4, :cond_5

    goto/16 :goto_7

    :cond_5
    move-object v9, v1

    .line 379
    :goto_1
    :try_start_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/RadarSessionWithHCaptcha;

    .line 369
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_6
    move-object/from16 v10, p2

    .line 372
    :try_start_5
    new-instance v0, Lcom/stripe/android/core/exception/GenericStripeException;

    .line 373
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 374
    const-string v9, "No payment method ID was found for provided \'PaymentMethod\' object!"

    .line 373
    invoke-direct {v5, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Throwable;

    .line 376
    const-string v9, "noPaymentMethodId"

    .line 372
    invoke-direct {v0, v5, v9}, Lcom/stripe/android/core/exception/GenericStripeException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object/from16 v10, p2

    :goto_2
    move-object v9, v1

    .line 369
    :goto_3
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    move-object v5, v2

    move-object v2, v10

    .line 380
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 381
    iget-object v10, v9, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 382
    sget-object v11, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    check-cast v11, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 383
    sget-object v12, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v12, v0}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    .line 381
    invoke-static/range {v10 .. v15}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 387
    :cond_7
    iput-object v9, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v7, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    invoke-direct {v9, v3}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->waitForPreparePaymentMethodHandler(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_8

    goto :goto_7

    :cond_8
    move-object v7, v9

    .line 365
    :goto_5
    check-cast v0, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    if-eqz v0, :cond_b

    const/4 v9, 0x0

    if-eqz v2, :cond_9

    .line 392
    :try_start_6
    invoke-direct {v7, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->toAddressDetails(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v2

    goto :goto_6

    :cond_9
    move-object v2, v9

    .line 390
    :goto_6
    iput-object v9, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1;->label:I

    invoke-interface {v0, v5, v2, v3}, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;->onPreparePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_a

    :goto_7
    return-object v4

    .line 395
    :cond_a
    :goto_8
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;

    const/4 v2, 0x0

    invoke-direct {v0, v8, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;-><init>(ZZ)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_b

    .line 397
    :goto_9
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 398
    check-cast v0, Ljava/lang/Throwable;

    .line 399
    invoke-static {v0}, Lcom/stripe/android/link/utils/ErrorsKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    .line 397
    invoke-direct {v2, v0, v3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    move-object v0, v2

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    goto :goto_b

    .line 405
    :cond_b
    const-class v0, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    .line 408
    iget-object v8, v7, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PREPARE_PAYMENT_METHOD_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 410
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    .line 411
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "PreparePaymentMethodHandler must be implemented when using IntentConfiguration with shared payment tokens!"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 412
    invoke-direct {v7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 413
    sget v3, Lcom/stripe/android/R$string;->stripe_internal_error:I

    invoke-static {v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    goto :goto_a

    .line 415
    :cond_c
    invoke-static {v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    .line 410
    :goto_a
    invoke-direct {v0, v2, v3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    :goto_b
    return-object v0
.end method

.method private final retrieveCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    .line 474
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->intentCreationCallbackProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-object v0
.end method

.method private final retrievePreparePaymentMethodHandler()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 1

    .line 478
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->preparePaymentMethodHandlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    return-object v0
.end method

.method private final retrieveStripeIntent-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v0

    iget-object p2, v5, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 572
    iget v1, v5, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 573
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 575
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v3

    .line 573
    iput v2, v5, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1;->label:I

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/networking/StripeRepository$DefaultImpls;->retrieveStripeIntent-BWLJW6A$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method

.method private final toAddressDetails(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 11

    .line 678
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;->getName()Ljava/lang/String;

    move-result-object v1

    .line 679
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;->getPhone()Ljava/lang/String;

    move-result-object v3

    .line 680
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object p1

    .line 682
    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v7

    .line 683
    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object v8

    .line 684
    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object v5

    .line 685
    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v6

    .line 686
    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v9

    .line 687
    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object v10

    .line 681
    new-instance v2, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 677
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final waitForIntentCallback(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 431
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 432
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->retrieveCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object p1

    if-nez p1, :cond_4

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    .line 433
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x2

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v4

    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$2$callback$1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$2$callback$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForIntentCallback$1;->label:I

    invoke-static {v4, v5, p1, v0}, Lkotlinx/coroutines/TimeoutKt;->withTimeoutOrNull-KLykuaI(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 431
    :goto_1
    check-cast p1, Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    if-eqz p1, :cond_4

    .line 445
    iget-object v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_4
    return-object p1
.end method

.method private final waitForPreparePaymentMethodHandler(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 452
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 453
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->retrievePreparePaymentMethodHandler()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object p1

    if-nez p1, :cond_4

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;

    .line 454
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x2

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v4

    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1;->label:I

    invoke-static {v4, v5, p1, v0}, Lkotlinx/coroutines/TimeoutKt;->withTimeoutOrNull-KLykuaI(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 452
    :goto_1
    check-cast p1, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    if-eqz p1, :cond_4

    .line 466
    iget-object v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_4
    return-object p1
.end method


# virtual methods
.method public intercept(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 224
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_2

    .line 225
    sget-object p2, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->OffSession:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    .line 227
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v1

    if-eqz p4, :cond_0

    .line 232
    invoke-static {p4}, Lcom/stripe/android/model/PaymentMethodOptionsParamsKt;->setupFutureUsage(Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    move-object v0, p0

    move v6, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v7, p7

    .line 226
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v3, p6

    .line 236
    instance-of p3, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    if-eqz p3, :cond_3

    .line 238
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v2, p2

    .line 237
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Z)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p1

    return-object p1

    :cond_3
    move-object v2, p2

    .line 248
    instance-of p2, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    if-eqz p2, :cond_4

    .line 250
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    move-object v0, p0

    .line 249
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Z)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p1

    return-object p1

    .line 223
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public intercept(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
            "Lcom/stripe/android/model/PaymentMethodExtraParams;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 176
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_0

    .line 183
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v1

    move-object v0, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    .line 182
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->handleDeferred(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 192
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    if-eqz v0, :cond_1

    .line 194
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v3, p6

    .line 193
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createConfirmStep(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p1

    return-object p1

    .line 203
    :cond_1
    instance-of p4, p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    if-eqz p4, :cond_2

    .line 205
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v3, p6

    .line 204
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;->createConfirmStep$default(Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    move-result-object p1

    return-object p1

    .line 175
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
