.class public final Lcom/stripe/android/repository/ConsumersApiServiceImpl;
.super Ljava/lang/Object;
.source "ConsumersApiService.kt"

# interfaces
.implements Lcom/stripe/android/repository/ConsumersApiService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsumersApiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumersApiService.kt\ncom/stripe/android/repository/ConsumersApiServiceImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,500:1\n503#2,7:501\n503#2,7:508\n503#2,7:515\n*S KotlinDebug\n*F\n+ 1 ConsumersApiService.kt\ncom/stripe/android/repository/ConsumersApiServiceImpl\n*L\n202#1:501,7\n235#1:508,7\n268#1:515,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 V2\u00020\u0001:\u0001VB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ&\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J&\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J8\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010 \u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010!JP\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u00052\u0008\u0010 \u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010(JJ\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/2\u0008\u00100\u001a\u0004\u0018\u0001012\u0008\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u00103J6\u00104\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u00106J.\u00107\u001a\u0002082\u0006\u0010+\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010:J6\u0010;\u001a\u0008\u0012\u0004\u0012\u00020<0\u00102\u0006\u0010+\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008?\u0010@J^\u0010A\u001a\u0008\u0012\u0004\u0012\u00020B0\u00102\u0006\u0010+\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\u0008\u0010E\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010H0GH\u0096@\u00a2\u0006\u0004\u0008I\u0010JJ>\u0010K\u001a\u0008\u0012\u0004\u0012\u00020L0\u00102\u0006\u0010\'\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008M\u0010NJB\u0010O\u001a\u0008\u0012\u0004\u0012\u00020P0\u00102\u0006\u0010+\u001a\u00020\u00052\u0008\u0010Q\u001a\u0004\u0018\u00010\u00052\u0008\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008T\u0010UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"
    }
    d2 = {
        "Lcom/stripe/android/repository/ConsumersApiServiceImpl;",
        "Lcom/stripe/android/repository/ConsumersApiService;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "apiVersion",
        "",
        "sdkVersion",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "<init>",
        "(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V",
        "stripeErrorJsonParser",
        "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "signUp",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/ConsumerSessionSignup;",
        "params",
        "Lcom/stripe/android/model/SignUpParams;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "signUp-0E7RQCE",
        "(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileSignUp",
        "mobileSignUp-0E7RQCE",
        "lookupConsumerSession",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "email",
        "requestSurface",
        "doNotLogConsumerFunnelEvent",
        "",
        "customerId",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileLookupConsumerSession",
        "emailSource",
        "Lcom/stripe/android/model/EmailSource;",
        "verificationToken",
        "appId",
        "sessionId",
        "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startConsumerVerification",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerSessionClientSecret",
        "locale",
        "Ljava/util/Locale;",
        "type",
        "Lcom/stripe/android/model/VerificationType;",
        "customEmailType",
        "Lcom/stripe/android/model/CustomEmailType;",
        "connectionsMerchantName",
        "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmConsumerVerification",
        "verificationCode",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachLinkConsumerToLinkAccountSession",
        "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;",
        "clientSecret",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "paymentDetailsCreateParams",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;",
        "createPaymentDetails-yxL6bBk",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sharePaymentDetails",
        "Lcom/stripe/android/model/SharePaymentDetails;",
        "paymentDetailsId",
        "expectedPaymentMethodType",
        "billingPhone",
        "extraParams",
        "",
        "",
        "sharePaymentDetails-eH_QyT8",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateAvailableIncentives",
        "Lcom/stripe/android/model/UpdateAvailableIncentives;",
        "updateAvailableIncentives-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkAccountSession",
        "Lcom/stripe/android/model/LinkAccountSession;",
        "intentToken",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "createLinkAccountSession-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "payments-model_release"
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
.field public static final Companion:Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;

.field private static final attachLinkConsumerToLinkAccountSession:Ljava/lang/String;

.field private static final confirmConsumerVerificationUrl:Ljava/lang/String;

.field private static final consumerAccountsSignUpUrl:Ljava/lang/String;

.field private static final consumerMobileSignUpUrl:Ljava/lang/String;

.field private static final consumerSessionLookupUrl:Ljava/lang/String;

.field private static final createLinkAccountSession:Ljava/lang/String;

.field private static final createPaymentDetails:Ljava/lang/String;

.field private static final mobileConsumerSessionLookupUrl:Ljava/lang/String;

.field private static final sharePaymentDetails:Ljava/lang/String;

.field private static final startConsumerVerificationUrl:Ljava/lang/String;

.field private static final updateAvailableIncentivesUrl:Ljava/lang/String;


# instance fields
.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->Companion:Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;

    .line 437
    const-string v1, "consumers/accounts/sign_up"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerAccountsSignUpUrl:Ljava/lang/String;

    .line 443
    const-string v1, "consumers/mobile/sign_up"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerMobileSignUpUrl:Ljava/lang/String;

    .line 449
    const-string v1, "consumers/sessions/lookup"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerSessionLookupUrl:Ljava/lang/String;

    .line 455
    const-string v1, "consumers/mobile/sessions/lookup"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->mobileConsumerSessionLookupUrl:Ljava/lang/String;

    .line 461
    const-string v1, "consumers/sessions/start_verification"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->startConsumerVerificationUrl:Ljava/lang/String;

    .line 467
    const-string v1, "consumers/sessions/confirm_verification"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->confirmConsumerVerificationUrl:Ljava/lang/String;

    .line 473
    const-string v1, "consumers/attach_link_consumer_to_link_account_session"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->attachLinkConsumerToLinkAccountSession:Ljava/lang/String;

    .line 478
    const-string v1, "consumers/payment_details"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->createPaymentDetails:Ljava/lang/String;

    .line 483
    const-string v1, "consumers/link_account_sessions"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->createLinkAccountSession:Ljava/lang/String;

    .line 488
    const-string v1, "consumers/payment_details/share"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->sharePaymentDetails:Ljava/lang/String;

    .line 493
    const-string v1, "consumers/incentives/update_available"

    invoke-static {v0, v1}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->access$getApiUrl(Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->updateAvailableIncentivesUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V
    .locals 1

    const-string v0, "stripeNetworkClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 134
    new-instance p1, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 136
    new-instance p1, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-direct {p1, p4, p2, p3}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 130
    const-string p3, "AndroidBindings/21.22.2"

    .line 127
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;-><init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V

    return-void
.end method

.method public static final synthetic access$getAttachLinkConsumerToLinkAccountSession$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->attachLinkConsumerToLinkAccountSession:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getConfirmConsumerVerificationUrl$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->confirmConsumerVerificationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getConsumerAccountsSignUpUrl$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerAccountsSignUpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getConsumerMobileSignUpUrl$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerMobileSignUpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getConsumerSessionLookupUrl$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerSessionLookupUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getMobileConsumerSessionLookupUrl$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->mobileConsumerSessionLookupUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getStartConsumerVerificationUrl$cp()Ljava/lang/String;
    .locals 1

    .line 126
    sget-object v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->startConsumerVerificationUrl:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public attachLinkConsumerToLinkAccountSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 308
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 309
    iget-object v1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 310
    iget-object v2, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 311
    sget-object v3, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->attachLinkConsumerToLinkAccountSession:Ljava/lang/String;

    const/4 v4, 0x3

    .line 314
    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "request_surface"

    invoke-static {v5, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v5, 0x0

    aput-object p3, v4, v5

    .line 316
    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 315
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string p3, "credentials"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x1

    aput-object p1, v4, p3

    .line 318
    const-string p1, "link_account_session"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v4, p2

    .line 313
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, p4

    .line 310
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 321
    sget-object p2, Lcom/stripe/android/model/parsers/AttachConsumerToLinkAccountSessionJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/AttachConsumerToLinkAccountSessionJsonParser;

    .line 310
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 321
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 307
    invoke-static {v1, v0, p1, p2, p5}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithModelJsonParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public confirmConsumerVerification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/VerificationType;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 284
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 285
    iget-object v1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 286
    iget-object v2, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 287
    sget-object v3, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->confirmConsumerVerificationUrl:Ljava/lang/String;

    const/4 v4, 0x4

    .line 290
    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "request_surface"

    invoke-static {v5, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v5, 0x0

    aput-object p3, v4, v5

    .line 292
    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 291
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string p3, "credentials"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x1

    aput-object p1, v4, p3

    .line 294
    const-string p1, "type"

    invoke-virtual {p4}, Lcom/stripe/android/model/VerificationType;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x2

    aput-object p1, v4, p3

    .line 295
    const-string p1, "code"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v4, p2

    .line 289
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, p5

    .line 286
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 298
    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;-><init>()V

    .line 286
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 298
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 283
    invoke-static {v1, v0, p1, p2, p6}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithModelJsonParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createLinkAccountSession-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/LinkMode;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/LinkAccountSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;

    iget v2, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;-><init>(Lcom/stripe/android/repository/ConsumersApiServiceImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 405
    iget v3, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 414
    iget-object v3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 415
    iget-object v5, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 416
    sget-object v6, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->createLinkAccountSession:Ljava/lang/String;

    const/4 v7, 0x4

    .line 419
    new-array v7, v7, [Lkotlin/Pair;

    .line 420
    const-string v8, "consumer_session_client_secret"

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 419
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v8, "credentials"

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v8, 0x0

    aput-object p1, v7, v8

    .line 422
    const-string p1, "intent_token"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v7, v4

    if-eqz p3, :cond_3

    .line 423
    invoke-virtual {p3}, Lcom/stripe/android/model/LinkMode;->getValue()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    const-string p2, "link_mode"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v7, p2

    .line 424
    const-string p1, "request_surface"

    move-object/from16 p2, p4

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v7, p2

    .line 418
    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p5

    .line 415
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 427
    sget-object p2, Lcom/stripe/android/model/parsers/LinkAccountSessionJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/LinkAccountSessionJsonParser;

    .line 415
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 427
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 412
    iput v4, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createLinkAccountSession$1;->label:I

    invoke-static {v3, v0, p1, p2, v1}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithResultParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    return-object v2

    :cond_4
    return-object p1
.end method

.method public createPaymentDetails-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;

    iget v2, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;-><init>(Lcom/stripe/android/repository/ConsumersApiServiceImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 325
    iget v3, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 333
    iget-object v3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 334
    iget-object v5, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 335
    sget-object v6, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->createPaymentDetails:Ljava/lang/String;

    const/4 v7, 0x2

    .line 338
    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "request_surface"

    invoke-static {v8, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v8, 0x0

    aput-object p3, v7, v8

    .line 340
    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 339
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string p3, "credentials"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v7, v4

    .line 337
    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 343
    invoke-interface {p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object p2

    .line 342
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 334
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 346
    sget-object p2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    .line 334
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 346
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 331
    iput v4, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$createPaymentDetails$1;->label:I

    invoke-static {v3, v0, p1, p2, v1}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithResultParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public lookupConsumerSession(Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    .line 188
    const-string p3, "do_not_log_consumer_funnel_event"

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    goto :goto_0

    .line 190
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    .line 193
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 194
    iget-object v2, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 195
    iget-object v3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 196
    sget-object v4, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerSessionLookupUrl:Ljava/lang/String;

    const/4 v5, 0x3

    .line 199
    new-array v5, v5, [Lkotlin/Pair;

    const-string v6, "request_surface"

    invoke-static {v6, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v6, 0x0

    aput-object p2, v5, v6

    .line 200
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toLowerCase(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "email_address"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v0

    .line 201
    const-string p1, "customer_id"

    invoke-static {p1, p5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v5, p2

    .line 198
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 501
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 502
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 503
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 504
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v5, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 507
    :cond_2
    check-cast p2, Ljava/util/Map;

    .line 198
    invoke-static {p2, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v5, p4

    .line 195
    invoke-static/range {v3 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 204
    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerSessionLookupJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerSessionLookupJsonParser;-><init>()V

    .line 195
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 204
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    move-object/from16 p3, p6

    .line 192
    invoke-static {v2, v1, p1, p2, p3}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithModelJsonParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public mobileLookupConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 223
    iget-object v1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-object v2, p1

    .line 224
    iget-object p1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    move-object v3, p2

    .line 225
    sget-object p2, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->mobileConsumerSessionLookupUrl:Ljava/lang/String;

    const/4 v4, 0x7

    .line 228
    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "request_surface"

    invoke-static {v5, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v5, 0x0

    aput-object p3, v4, v5

    .line 229
    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "toLowerCase(...)"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "email_address"

    invoke-static {v2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v2, 0x1

    aput-object p3, v4, v2

    .line 230
    const-string p3, "android_verification_token"

    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x2

    aput-object p3, v4, p4

    .line 231
    const-string p3, "session_id"

    invoke-static {p3, p7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x3

    aput-object p3, v4, p4

    .line 232
    const-string p3, "email_source"

    invoke-virtual {v3}, Lcom/stripe/android/model/EmailSource;->getBackendValue()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x4

    aput-object p3, v4, p4

    .line 233
    const-string p3, "app_id"

    invoke-static {p3, p5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x5

    aput-object p3, v4, p4

    .line 234
    const-string p3, "customer_id"

    invoke-static {p3, p8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x6

    aput-object p3, v4, p4

    .line 227
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    .line 508
    new-instance p4, Ljava/util/LinkedHashMap;

    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 509
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/Map$Entry;

    .line 510
    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ljava/lang/String;

    if-eqz p7, :cond_0

    .line 511
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p7

    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p4, p7, p5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 514
    :cond_1
    check-cast p4, Ljava/util/Map;

    move-object p3, p6

    const/16 p6, 0x8

    const/4 p7, 0x0

    const/4 p5, 0x0

    .line 224
    invoke-static/range {p1 .. p7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 237
    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerSessionLookupJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerSessionLookupJsonParser;-><init>()V

    .line 224
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 237
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 221
    invoke-static {v1, v0, p1, p2, p9}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithModelJsonParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public mobileSignUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SignUpParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;

    iget v1, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;-><init>(Lcom/stripe/android/repository/ConsumersApiServiceImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 161
    iget v2, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;->label:I

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

    .line 166
    iget-object p3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 167
    iget-object v2, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 168
    iget-object v4, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 169
    sget-object v5, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerMobileSignUpUrl:Ljava/lang/String;

    .line 171
    invoke-virtual {p1}, Lcom/stripe/android/model/SignUpParams;->toParamMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 168
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 173
    sget-object p2, Lcom/stripe/android/model/parsers/ConsumerSessionSignupJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerSessionSignupJsonParser;

    .line 168
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 173
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 165
    iput v3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$mobileSignUp$1;->label:I

    invoke-static {v2, p3, p1, p2, v0}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithResultParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public sharePaymentDetails-eH_QyT8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SharePaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p8

    instance-of v1, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;

    iget v2, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;-><init>(Lcom/stripe/android/repository/ConsumersApiServiceImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 350
    iget v3, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 361
    iget-object v3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 362
    iget-object v5, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 363
    sget-object v6, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->sharePaymentDetails:Ljava/lang/String;

    const/4 v7, 0x5

    .line 366
    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "request_surface"

    move-object/from16 v9, p5

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 367
    const-string v8, "id"

    invoke-static {v8, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v7, v4

    .line 368
    const-string p2, "expected_payment_method_type"

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x2

    aput-object p2, v7, p3

    .line 370
    const-string p2, "consumer_session_client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 369
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "credentials"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v7, p2

    .line 372
    const-string p1, "billing_phone"

    move-object/from16 p2, p4

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v7, p2

    .line 365
    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    move-object/from16 p2, p7

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    move-object/from16 v7, p6

    .line 362
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 375
    sget-object p2, Lcom/stripe/android/model/parsers/SharePaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/SharePaymentDetailsJsonParser;

    .line 362
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 375
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 359
    iput v4, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$sharePaymentDetails$1;->label:I

    invoke-static {v3, v0, p1, p2, v1}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithResultParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public signUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SignUpParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;

    iget v1, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;-><init>(Lcom/stripe/android/repository/ConsumersApiServiceImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 142
    iget v2, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;->label:I

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

    .line 147
    iget-object p3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 148
    iget-object v2, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 149
    iget-object v4, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 150
    sget-object v5, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->consumerAccountsSignUpUrl:Ljava/lang/String;

    .line 152
    invoke-virtual {p1}, Lcom/stripe/android/model/SignUpParams;->toParamMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 149
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 154
    sget-object p2, Lcom/stripe/android/model/parsers/ConsumerSessionSignupJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerSessionSignupJsonParser;

    .line 149
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 154
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 146
    iput v3, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$signUp$1;->label:I

    invoke-static {v2, p3, p1, p2, v0}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithResultParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public startConsumerVerification(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/VerificationType;",
            "Lcom/stripe/android/model/CustomEmailType;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 254
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 255
    iget-object v1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-object v2, p1

    .line 256
    iget-object p1, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    move-object v3, p2

    .line 257
    sget-object p2, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->startConsumerVerificationUrl:Ljava/lang/String;

    const/4 v4, 0x6

    .line 260
    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "request_surface"

    invoke-static {v5, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v5, 0x0

    aput-object p3, v4, v5

    .line 262
    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    .line 261
    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    const-string v2, "credentials"

    invoke-static {v2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v2, 0x1

    aput-object p3, v4, v2

    .line 264
    const-string p3, "type"

    invoke-virtual {p4}, Lcom/stripe/android/model/VerificationType;->getValue()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x2

    aput-object p3, v4, p4

    if-eqz p5, :cond_0

    .line 265
    invoke-virtual {p5}, Lcom/stripe/android/model/CustomEmailType;->getValue()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-string p4, "custom_email_type"

    invoke-static {p4, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x3

    aput-object p3, v4, p4

    .line 266
    const-string p3, "connections_merchant_name"

    invoke-static {p3, p6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x4

    aput-object p3, v4, p4

    .line 267
    const-string p3, "locale"

    invoke-virtual {v3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x5

    aput-object p3, v4, p4

    .line 259
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    .line 515
    new-instance p4, Ljava/util/LinkedHashMap;

    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 516
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/Map$Entry;

    .line 517
    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p6

    if-eqz p6, :cond_1

    .line 518
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p6

    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p4, p6, p5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 521
    :cond_2
    check-cast p4, Ljava/util/Map;

    const/16 p6, 0x8

    move-object p3, p7

    const/4 p7, 0x0

    const/4 p5, 0x0

    .line 256
    invoke-static/range {p1 .. p7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 270
    new-instance p2, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;-><init>()V

    .line 256
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 270
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 253
    invoke-static {v1, v0, p1, p2, p8}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithModelJsonParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateAvailableIncentives-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/UpdateAvailableIncentives;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;

    iget v2, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;-><init>(Lcom/stripe/android/repository/ConsumersApiServiceImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 379
    iget v3, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 387
    iget-object v0, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeErrorJsonParser:Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    .line 388
    iget-object v3, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 389
    iget-object v5, p0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 390
    sget-object v6, Lcom/stripe/android/repository/ConsumersApiServiceImpl;->updateAvailableIncentivesUrl:Ljava/lang/String;

    const/4 v7, 0x4

    .line 393
    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "request_surface"

    move-object/from16 v9, p4

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 394
    const-string v8, "session_id"

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v7, v4

    .line 395
    const-string p1, "payment_details_id"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v7, p2

    .line 397
    const-string p1, "consumer_session_client_secret"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 396
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "credentials"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v7, p2

    .line 392
    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    move-object/from16 v7, p5

    .line 389
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 401
    sget-object p2, Lcom/stripe/android/model/parsers/UpdateAvailableIncentivesJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/UpdateAvailableIncentivesJsonParser;

    .line 389
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 401
    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 386
    iput v4, v1, Lcom/stripe/android/repository/ConsumersApiServiceImpl$updateAvailableIncentives$1;->label:I

    invoke-static {v3, v0, p1, p2, v1}, Lcom/stripe/android/core/networking/RequestExecutorKt;->executeRequestWithResultParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method
