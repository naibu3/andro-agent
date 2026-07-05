.class public final Lcom/stripe/android/link/repositories/LinkApiRepository;
.super Ljava/lang/Object;
.source "LinkApiRepository.kt"

# interfaces
.implements Lcom/stripe/android/link/repositories/LinkRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkApiRepository.kt\ncom/stripe/android/link/repositories/LinkApiRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,482:1\n1#2:483\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u007f2\u00020\u0001:\u0001\u007fB_\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0008\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J(\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJH\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008&\u0010\'JD\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0008\u0010*\u001a\u0004\u0018\u00010\u00062\u0008\u0010+\u001a\u0004\u0018\u00010\u00062\u0008\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008/\u00100Jn\u00101\u001a\u0008\u0012\u0004\u0012\u00020)0\u00172\u0008\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\u0008\u00103\u001a\u0004\u0018\u0001042\u0008\u00105\u001a\u0004\u0018\u00010\u00062\u0008\u00106\u001a\u0004\u0018\u0001072\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u00088\u00109J@\u0010:\u001a\u0008\u0012\u0004\u0012\u00020;0\u00172\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008C\u0010DJ.\u0010E\u001a\u0008\u0012\u0004\u0012\u00020F0\u00172\u0006\u0010G\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008H\u0010IJ.\u0010J\u001a\u0008\u0012\u0004\u0012\u00020K0\u00172\u0006\u0010<\u001a\u00020=2\u0006\u0010L\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008M\u0010NJB\u0010O\u001a\u0008\u0012\u0004\u0012\u00020P0\u00172\u0006\u0010A\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u00062\u0008\u0010S\u001a\u0004\u0018\u00010\u00062\u0008\u0010T\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008U\u0010VJ&\u0010W\u001a\u0008\u0012\u0004\u0012\u00020X0\u00172\u0006\u0010A\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020ZH\u0096@\u00a2\u0006\u0004\u0008[\u0010\\J(\u0010]\u001a\u0008\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010A\u001a\u00020\u00062\u0008\u0010_\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008`\u0010\u001cJ(\u0010a\u001a\u0008\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008b\u0010\u001cJ0\u0010c\u001a\u0008\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010d\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008e\u0010IJ6\u0010f\u001a\u0008\u0012\u0004\u0012\u00020g0\u00172\u000c\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u00060i2\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008j\u0010kJ(\u0010l\u001a\u0008\u0012\u0004\u0012\u00020m0\u00172\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008n\u0010\u001cJ0\u0010o\u001a\u0008\u0012\u0004\u0012\u00020p0\u00172\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008q\u0010IJ0\u0010r\u001a\u0008\u0012\u0004\u0012\u00020g0\u00172\u0006\u0010s\u001a\u00020t2\u0006\u0010A\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008u\u0010vJ:\u0010w\u001a\u0008\u0012\u0004\u0012\u00020x0\u00172\u0006\u0010A\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@2\u0008\u0010y\u001a\u0004\u0018\u00010z2\u0008\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008{\u0010|J\u0014\u0010}\u001a\u00020~2\n\u0008\u0002\u0010_\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lcom/stripe/android/link/repositories/LinkApiRepository;",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "application",
        "Landroid/app/Application;",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "stripeAccountIdProvider",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "consumersApiService",
        "Lcom/stripe/android/repository/ConsumersApiService;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "locale",
        "Ljava/util/Locale;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "<init>",
        "(Landroid/app/Application;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "fraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "lookupConsumer",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "email",
        "customerId",
        "lookupConsumer-0E7RQCE",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "lookupConsumerWithoutBackendLoggingForExposure",
        "lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileLookupConsumer",
        "emailSource",
        "Lcom/stripe/android/model/EmailSource;",
        "verificationToken",
        "appId",
        "sessionId",
        "mobileLookupConsumer-bMdYcbs",
        "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "consumerSignUp",
        "Lcom/stripe/android/model/ConsumerSessionSignup;",
        "phone",
        "country",
        "name",
        "consentAction",
        "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
        "consumerSignUp-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileSignUp",
        "phoneNumber",
        "amount",
        "",
        "currency",
        "incentiveEligibilitySession",
        "Lcom/stripe/android/model/IncentiveEligibilitySession;",
        "mobileSignUp-5p_uFSQ",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createCardPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "userEmail",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "consumerSessionClientSecret",
        "consumerPublishableKey",
        "createCardPaymentDetails-hUnOzRk",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createBankAccountPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "bankAccountId",
        "createBankAccountPaymentDetails-BWLJW6A",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "shareCardPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentDetails$Saved;",
        "id",
        "shareCardPaymentDetails-BWLJW6A",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sharePaymentDetails",
        "Lcom/stripe/android/model/SharePaymentDetails;",
        "paymentDetailsId",
        "expectedPaymentMethodType",
        "billingPhone",
        "cvc",
        "sharePaymentDetails-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethod",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "createPaymentMethod-0E7RQCE",
        "(Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logOut",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerAccountPublishableKey",
        "logOut-0E7RQCE",
        "startVerification",
        "startVerification-0E7RQCE",
        "confirmVerification",
        "verificationCode",
        "confirmVerification-BWLJW6A",
        "listPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "paymentMethodTypes",
        "",
        "listPaymentDetails-BWLJW6A",
        "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "listShippingAddresses",
        "Lcom/stripe/android/model/ConsumerShippingAddresses;",
        "listShippingAddresses-0E7RQCE",
        "deletePaymentDetails",
        "",
        "deletePaymentDetails-BWLJW6A",
        "updatePaymentDetails",
        "updateParams",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
        "updatePaymentDetails-BWLJW6A",
        "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkAccountSession",
        "Lcom/stripe/android/model/LinkAccountSession;",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "createLinkAccountSession-yxL6bBk",
        "(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildRequestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
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

.field public static final ALLOW_REDISPLAY_PARAM:Ljava/lang/String; = "allow_redisplay"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;

.field public static final REQUEST_SURFACE:Ljava/lang/String; = "android_payment_element"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

.field private final locale:Ljava/util/Locale;

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

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/repositories/LinkApiRepository;->Companion:Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/repositories/LinkApiRepository;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 1
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "publishableKey"
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "stripeAccountId"
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Locale;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumersApiService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    .line 50
    iput-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    .line 51
    iput-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 52
    iput-object p5, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 53
    iput-object p6, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 54
    iput-object p7, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->locale:Ljava/util/Locale;

    .line 55
    iput-object p8, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 59
    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p6}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;->DefaultFraudDetectionDataRepository(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    iput-object p1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    .line 62
    invoke-interface {p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->refresh()V

    return-void
.end method

.method public static final synthetic access$buildRequestOptions(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/link/repositories/LinkApiRepository;->buildRequestOptions(Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConsumersApiService$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/repository/ConsumersApiService;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object p0
.end method

.method public static final synthetic access$getFraudDetectionDataRepository$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    return-object p0
.end method

.method public static final synthetic access$getLocale$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Ljava/util/Locale;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->locale:Ljava/util/Locale;

    return-object p0
.end method

.method public static final synthetic access$getPublishableKeyProvider$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getStripeAccountIdProvider$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getStripeRepository$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/networking/StripeRepository;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method private final buildRequestOptions(Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 7

    if-nez p1, :cond_0

    .line 472
    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    .line 473
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    :cond_1
    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 471
    new-instance v1, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method static synthetic buildRequestOptions$default(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 468
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/link/repositories/LinkApiRepository;->buildRequestOptions(Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public confirmVerification-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    instance-of v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v2

    iget-object v0, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 359
    iget v3, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 364
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository;

    .line 366
    iget-object v3, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 369
    const-string v6, "android_payment_element"

    .line 370
    sget-object v7, Lcom/stripe/android/model/VerificationType;->SMS:Lcom/stripe/android/model/VerificationType;

    if-eqz p3, :cond_3

    .line 372
    new-instance v10, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p3

    invoke-direct/range {v10 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v8, v10

    goto :goto_2

    .line 373
    :cond_3
    new-instance v10, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 374
    iget-object v0, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 375
    iget-object v0, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    .line 373
    invoke-direct/range {v10 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    .line 366
    :goto_2
    iput v4, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$confirmVerification$1;->label:I

    move-object/from16 v5, p1

    move-object/from16 v4, p2

    invoke-interface/range {v3 .. v9}, Lcom/stripe/android/repository/ConsumersApiService;->confirmConsumerVerification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_4

    return-object v2

    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    .line 365
    check-cast v0, Lcom/stripe/android/model/ConsumerSession;

    .line 364
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 365
    :cond_5
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 364
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public consumerSignUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v2

    iget-object v0, v8, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v9

    .line 120
    iget v2, v8, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;->label:I

    const/4 v10, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v10, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 126
    iget-object v11, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$2;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    iput v10, v8, Lcom/stripe/android/link/repositories/LinkApiRepository$consumerSignUp$1;->label:I

    invoke-static {v11, v0, v8}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    return-object v9

    :cond_3
    :goto_1
    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public createBankAccountPaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 214
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 218
    iget-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$2;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v7, p1

    move-object v8, p2

    move-object v6, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createBankAccountPaymentDetails$1;->label:I

    invoke-static {p4, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createCardPaymentDetails-hUnOzRk(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 p3, p6

    instance-of v0, p3, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 175
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 181
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$2;

    const/4 v10, 0x0

    move-object v5, p0

    move-object v7, p1

    move-object v8, p2

    move-object v6, p4

    move-object/from16 v9, p5

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createCardPaymentDetails$1;->label:I

    invoke-static {p3, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createLinkAccountSession-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/model/LinkMode;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/LinkAccountSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v2

    iget-object v1, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 448
    iget v3, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 454
    iget-object v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 456
    invoke-interface/range {p2 .. p2}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    if-eqz p4, :cond_3

    .line 460
    new-instance v10, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p4

    invoke-direct/range {v10 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v10

    goto :goto_1

    .line 461
    :cond_3
    new-instance v11, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 462
    iget-object v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ljava/lang/String;

    .line 463
    iget-object v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ljava/lang/String;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    .line 461
    invoke-direct/range {v11 .. v16}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v11

    .line 454
    :goto_1
    iput v4, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$createLinkAccountSession$1;->label:I

    const-string v7, "android_payment_element"

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    invoke-interface/range {v3 .. v9}, Lcom/stripe/android/repository/ConsumersApiService;->createLinkAccountSession-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    return-object v1
.end method

.method public createPaymentMethod-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 305
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 308
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;

    const/4 v4, 0x0

    invoke-direct {v2, p2, p1, p0, v4}, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;-><init>(Lcom/stripe/android/link/LinkPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$1;->label:I

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deletePaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 414
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;->label:I

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

    .line 419
    iget-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    if-eqz p3, :cond_3

    .line 423
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    .line 424
    :cond_3
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 425
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    check-cast v6, Ljava/lang/String;

    .line 426
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 424
    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v5

    .line 419
    :goto_1
    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$deletePaymentDetails$1;->label:I

    invoke-interface {p4, p2, p1, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->deletePaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public listPaymentDetails-BWLJW6A(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 382
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;->label:I

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

    .line 387
    iget-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    if-eqz p3, :cond_3

    .line 391
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    .line 392
    :cond_3
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 393
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    check-cast v6, Ljava/lang/String;

    .line 394
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 392
    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v5

    .line 387
    :goto_1
    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listPaymentDetails$1;->label:I

    invoke-interface {p4, p2, p1, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->listPaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public listShippingAddresses-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerShippingAddresses;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 399
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 403
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    if-eqz p2, :cond_3

    .line 406
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    .line 407
    :cond_3
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 408
    iget-object p2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    .line 409
    iget-object p2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    move-object v7, p2

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 407
    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v5

    .line 403
    :goto_1
    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$listShippingAddresses$1;->label:I

    invoke-interface {p3, p1, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->listShippingAddresses-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public logOut-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 324
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 327
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, p2, v4}, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$logOut$1;->label:I

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public lookupConsumer-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 65
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, p2, v4}, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumer$1;->label:I

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 82
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    iget-object p2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;->label:I

    invoke-static {p2, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public mobileLookupConsumer-bMdYcbs(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p7

    instance-of v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v2

    iget-object v0, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v10

    .line 98
    iget v2, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;->label:I

    const/4 v11, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v11, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    iget-object v12, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$2;

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    iput v11, v9, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileLookupConsumer$1;->label:I

    invoke-static {v12, v0, v9}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_3

    return-object v10

    :cond_3
    :goto_1
    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public mobileSignUp-5p_uFSQ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/IncentiveEligibilitySession;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p11

    instance-of v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v13, v2

    iget-object v0, v13, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v14

    .line 144
    iget v2, v13, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;->label:I

    const/4 v15, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v15, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 155
    iget-object v0, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    move-object v2, v0

    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$2;

    const/4 v12, 0x0

    move-object/from16 v5, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v9, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v16, v2

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v12}, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    iput v15, v13, Lcom/stripe/android/link/repositories/LinkApiRepository$mobileSignUp$1;->label:I

    move-object/from16 v2, v16

    invoke-static {v2, v0, v13}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_3

    return-object v14

    :cond_3
    :goto_1
    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public shareCardPaymentDetails-BWLJW6A(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$Saved;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 238
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 242
    iget-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$2;

    const/4 v9, 0x0

    move-object v6, p0

    move-object v5, p1

    move-object v8, p2

    move-object v7, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$2;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$shareCardPaymentDetails$1;->label:I

    invoke-static {p4, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public sharePaymentDetails-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SharePaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v2

    iget-object v0, v8, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v9

    .line 281
    iget v2, v8, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;->label:I

    const/4 v10, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v10, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 287
    iget-object v11, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$2;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v2, p5

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$2;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    iput v10, v8, Lcom/stripe/android/link/repositories/LinkApiRepository$sharePaymentDetails$1;->label:I

    invoke-static {v11, v0, v8}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    return-object v9

    :cond_3
    :goto_1
    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public startVerification-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;

    iget v3, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v11, v2

    iget-object v0, v11, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 335
    iget v3, v11, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 339
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository;

    .line 341
    iget-object v3, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 343
    iget-object v0, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->locale:Ljava/util/Locale;

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    :cond_3
    move-object v5, v0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 344
    const-string v6, "android_payment_element"

    .line 345
    sget-object v7, Lcom/stripe/android/model/VerificationType;->SMS:Lcom/stripe/android/model/VerificationType;

    if-eqz p2, :cond_4

    .line 349
    new-instance v12, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v13, p2

    invoke-direct/range {v12 .. v17}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v10, v12

    goto :goto_2

    .line 350
    :cond_4
    new-instance v12, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 351
    iget-object v0, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 352
    iget-object v0, v1, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    .line 350
    invoke-direct/range {v12 .. v17}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    .line 341
    :goto_2
    iput v4, v11, Lcom/stripe/android/link/repositories/LinkApiRepository$startVerification$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p1

    invoke-interface/range {v3 .. v11}, Lcom/stripe/android/repository/ConsumersApiService;->startConsumerVerification(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    return-object v2

    :cond_5
    :goto_3
    if-eqz v0, :cond_6

    .line 340
    check-cast v0, Lcom/stripe/android/model/ConsumerSession;

    .line 339
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 340
    :cond_6
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 339
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public updatePaymentDetails-BWLJW6A(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;-><init>(Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 431
    iget v2, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;->label:I

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

    .line 436
    iget-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    if-eqz p3, :cond_3

    .line 440
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    .line 441
    :cond_3
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 442
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    check-cast v6, Ljava/lang/String;

    .line 443
    iget-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 441
    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v5

    .line 436
    :goto_1
    iput v3, v0, Lcom/stripe/android/link/repositories/LinkApiRepository$updatePaymentDetails$1;->label:I

    invoke-interface {p4, p2, p1, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->updatePaymentDetails-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method
