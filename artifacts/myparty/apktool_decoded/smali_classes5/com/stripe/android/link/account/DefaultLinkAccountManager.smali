.class public final Lcom/stripe/android/link/account/DefaultLinkAccountManager;
.super Ljava/lang/Object;
.source "DefaultLinkAccountManager.kt"

# interfaces
.implements Lcom/stripe/android/link/account/LinkAccountManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/account/DefaultLinkAccountManager$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultLinkAccountManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLinkAccountManager.kt\ncom/stripe/android/link/account/DefaultLinkAccountManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n49#2:541\n51#2:545\n46#3:542\n51#3:544\n105#4:543\n1#5:546\n*S KotlinDebug\n*F\n+ 1 DefaultLinkAccountManager.kt\ncom/stripe/android/link/account/DefaultLinkAccountManager\n*L\n65#1:541\n65#1:545\n65#1:542\n65#1:544\n65#1:543\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ2\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010\'H\u0096@\u00a2\u0006\u0004\u0008+\u0010,JJ\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\'2\u0006\u00101\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010\'H\u0096@\u00a2\u0006\u0004\u00082\u00103J\u0016\u00104\u001a\u0008\u0012\u0004\u0012\u0002050$H\u0096@\u00a2\u0006\u0004\u00086\u00107J\u001e\u00108\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u00109\u001a\u00020:H\u0096@\u00a2\u0006\u0004\u0008;\u0010<J\u0016\u0010=\u001a\u0008\u0012\u0004\u0012\u00020>0$H\u0096@\u00a2\u0006\u0004\u0008?\u00107JD\u0010@\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'2\u0008\u0010A\u001a\u0004\u0018\u00010\'2\u0008\u0010B\u001a\u0004\u0018\u00010\'2\u0008\u0010C\u001a\u0004\u0018\u00010\'2\u0006\u0010D\u001a\u00020EH\u0082@\u00a2\u0006\u0004\u0008F\u0010GJD\u0010H\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'2\u0008\u0010A\u001a\u0004\u0018\u00010\'2\u0008\u0010B\u001a\u0004\u0018\u00010\'2\u0008\u0010C\u001a\u0004\u0018\u00010\'2\u0006\u0010D\u001a\u00020EH\u0096@\u00a2\u0006\u0004\u0008I\u0010GJP\u0010J\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010A\u001a\u00020\'2\u0006\u0010B\u001a\u00020\'2\u0008\u0010C\u001a\u0004\u0018\u00010\'2\u0006\u00100\u001a\u00020\'2\u0006\u00101\u001a\u00020\'2\u0006\u0010D\u001a\u00020EH\u0096@\u00a2\u0006\u0004\u0008K\u0010LJ\u001e\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0$2\u0006\u0010O\u001a\u00020PH\u0096@\u00a2\u0006\u0004\u0008Q\u0010RJ\u001e\u0010S\u001a\u0008\u0012\u0004\u0012\u00020T0$2\u0006\u0010U\u001a\u00020VH\u0096@\u00a2\u0006\u0004\u0008W\u0010XJ\u001e\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020Z0$2\u0006\u0010[\u001a\u00020TH\u0096@\u00a2\u0006\u0004\u0008\\\u0010]J\u001e\u0010^\u001a\u0008\u0012\u0004\u0012\u00020_0$2\u0006\u0010`\u001a\u00020\'H\u0096@\u00a2\u0006\u0004\u0008a\u0010bJ:\u0010c\u001a\u0008\u0012\u0004\u0012\u00020d0$2\u0006\u0010e\u001a\u00020\'2\u0006\u0010f\u001a\u00020\'2\u0008\u0010g\u001a\u0004\u0018\u00010\'2\u0008\u0010h\u001a\u0004\u0018\u00010\'H\u0096@\u00a2\u0006\u0004\u0008i\u0010jJ*\u0010k\u001a\u00020%2\u0006\u0010l\u001a\u00020>2\u0008\u0010m\u001a\u0004\u0018\u00010\'2\u0008\u0010n\u001a\u0004\u0018\u00010oH\u0082@\u00a2\u0006\u0002\u0010pJ \u0010q\u001a\u0004\u0018\u00010%2\u0006\u0010r\u001a\u00020s2\u0006\u0010(\u001a\u00020)H\u0096@\u00a2\u0006\u0002\u0010tJ\u0016\u0010u\u001a\u0008\u0012\u0004\u0012\u00020%0$H\u0096@\u00a2\u0006\u0004\u0008v\u00107J\u001e\u0010w\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010x\u001a\u00020\'H\u0096@\u00a2\u0006\u0004\u0008y\u0010bJ$\u0010z\u001a\u0008\u0012\u0004\u0012\u00020{0$2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\'0}H\u0096@\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u0018\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00190$H\u0096@\u00a2\u0006\u0005\u0008\u0081\u0001\u00107J!\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010$2\u0006\u0010e\u001a\u00020\'H\u0096@\u00a2\u0006\u0005\u0008\u0084\u0001\u0010bJ-\u0010\u0085\u0001\u001a\u0008\u0012\u0004\u0012\u00020{0$2\u0008\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0008\u0010A\u001a\u0004\u0018\u00010\'H\u0096@\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J#\u0010!\u001a\u00020 2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010%2\u0007\u0010\u008b\u0001\u001a\u00020)H\u0082@\u00a2\u0006\u0003\u0010\u008c\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u001c\u0010\u008d\u0001\u001a\u00030\u008e\u0001*\u00020E8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001\u00a8\u0006\u0091\u0001"
    }
    d2 = {
        "Lcom/stripe/android/link/account/DefaultLinkAccountManager;",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "config",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkRepository",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "<init>",
        "(Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "linkAccountInfo",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "getLinkAccountInfo",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_consumerState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/ConsumerState;",
        "consumerState",
        "getConsumerState",
        "cachedShippingAddresses",
        "Lcom/stripe/android/model/ConsumerShippingAddresses;",
        "getCachedShippingAddresses",
        "()Lcom/stripe/android/model/ConsumerShippingAddresses;",
        "setCachedShippingAddresses",
        "(Lcom/stripe/android/model/ConsumerShippingAddresses;)V",
        "accountStatus",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "getAccountStatus",
        "()Lkotlinx/coroutines/flow/Flow;",
        "lookupConsumer",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "email",
        "",
        "startSession",
        "",
        "customerId",
        "lookupConsumer-BWLJW6A",
        "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileLookupConsumer",
        "emailSource",
        "Lcom/stripe/android/model/EmailSource;",
        "verificationToken",
        "appId",
        "mobileLookupConsumer-bMdYcbs",
        "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkAccountSession",
        "Lcom/stripe/android/model/LinkAccountSession;",
        "createLinkAccountSession-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "signInWithUserInput",
        "userInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "signInWithUserInput-gIAlu-s",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logOut",
        "Lcom/stripe/android/model/ConsumerSession;",
        "logOut-IoAF18A",
        "signUpIfValidSessionState",
        "phone",
        "country",
        "name",
        "consentAction",
        "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
        "signUpIfValidSessionState-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "signUp",
        "signUp-hUnOzRk",
        "mobileSignUp",
        "mobileSignUp-eH_QyT8",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "linkPaymentMethod",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "createPaymentMethod-gIAlu-s",
        "(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createCardPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "createCardPaymentDetails-gIAlu-s",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "shareCardPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentDetails$Saved;",
        "cardPaymentDetails",
        "shareCardPaymentDetails-gIAlu-s",
        "(Lcom/stripe/android/link/LinkPaymentDetails$New;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createBankAccountPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "bankAccountId",
        "createBankAccountPaymentDetails-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sharePaymentDetails",
        "Lcom/stripe/android/model/SharePaymentDetails;",
        "paymentDetailsId",
        "expectedPaymentMethodType",
        "billingPhone",
        "cvc",
        "sharePaymentDetails-yxL6bBk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setAccount",
        "consumerSession",
        "publishableKey",
        "displayablePaymentDetails",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setLinkAccountFromLookupResult",
        "lookup",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "(Lcom/stripe/android/model/ConsumerSessionLookup;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startVerification",
        "startVerification-IoAF18A",
        "confirmVerification",
        "code",
        "confirmVerification-gIAlu-s",
        "listPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "paymentMethodTypes",
        "",
        "listPaymentDetails-gIAlu-s",
        "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "listShippingAddresses",
        "listShippingAddresses-IoAF18A",
        "deletePaymentDetails",
        "",
        "deletePaymentDetails-gIAlu-s",
        "updatePaymentDetails",
        "updateParams",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
        "updatePaymentDetails-0E7RQCE",
        "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "linkAccount",
        "canLookupCustomerEmail",
        "(Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "consumerAction",
        "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
        "getConsumerAction",
        "(Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
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
.field private final _consumerState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ConsumerState;",
            ">;"
        }
    .end annotation
.end field

.field private final accountStatus:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation
.end field

.field private cachedShippingAddresses:Lcom/stripe/android/model/ConsumerShippingAddresses;

.field private final config:Lcom/stripe/android/link/LinkConfiguration;

.field private final consumerState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ConsumerState;",
            ">;"
        }
    .end annotation
.end field

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkAccountHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 49
    iput-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    .line 50
    iput-object p3, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 51
    iput-object p4, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    .line 52
    iput-object p5, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    const/4 p2, 0x0

    .line 58
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->_consumerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 59
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->consumerState:Lkotlinx/coroutines/flow/StateFlow;

    .line 64
    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 543
    new-instance p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$special$$inlined$map$1;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/stripe/android/link/account/DefaultLinkAccountManager;)V

    check-cast p2, Lkotlinx/coroutines/flow/Flow;

    .line 65
    iput-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->accountStatus:Lkotlinx/coroutines/flow/Flow;

    return-void
.end method

.method public static final synthetic access$getAccountStatus(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->getAccountStatus(Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Lcom/stripe/android/link/account/DefaultLinkAccountManager;)Lcom/stripe/android/link/LinkConfiguration;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountHolder$p(Lcom/stripe/android/link/account/DefaultLinkAccountManager;)Lcom/stripe/android/link/account/LinkAccountHolder;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    return-object p0
.end method

.method public static final synthetic access$setAccount(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$signUpIfValidSessionState-hUnOzRk(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->signUpIfValidSessionState-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getAccountStatus(Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 494
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

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

    if-eqz p1, :cond_3

    .line 500
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object p1

    return-object p1

    .line 503
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v3

    :goto_1
    if-eqz p1, :cond_9

    .line 508
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerIdForEceDefaultValues()Ljava/lang/String;

    move-result-object p2

    .line 505
    iput v4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$getAccountStatus$1;->label:I

    invoke-virtual {p0, p1, v4, p2, v0}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->lookupConsumer-BWLJW6A(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    .line 510
    :cond_5
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v3

    :cond_6
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_7
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 511
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_8

    goto :goto_4

    :cond_8
    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    :goto_4
    check-cast p1, Lcom/stripe/android/link/model/AccountStatus;

    if-eqz p1, :cond_9

    return-object p1

    .line 513
    :cond_9
    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    return-object p1
.end method

.method private final getConsumerAction(Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)Lcom/stripe/android/model/ConsumerSignUpConsentAction;
    .locals 1

    .line 517
    sget-object v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 537
    :pswitch_0
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->SignUpOptInMobilePrechecked:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 535
    :pswitch_1
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->SignUpOptInMobileChecked:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 533
    :pswitch_2
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->PrecheckedOptInBoxPrefilledNone:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 531
    :pswitch_3
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->PrecheckedOptInBoxPrefilledSome:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 529
    :pswitch_4
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->PrecheckedOptInBoxPrefilledAll:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 527
    :pswitch_5
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->ImpliedWithPrefilledEmail:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 525
    :pswitch_6
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->Implied:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 523
    :pswitch_7
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->CheckboxWithPrefilledEmailAndPhone:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 521
    :pswitch_8
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->CheckboxWithPrefilledEmail:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    .line 519
    :pswitch_9
    sget-object p1, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->Checkbox:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerSession;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/DisplayablePaymentDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 356
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 361
    iget-object p4, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p4}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    invoke-interface {p4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p4}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p4

    const/4 v2, 0x0

    if-nez p2, :cond_4

    if-eqz p4, :cond_3

    .line 363
    invoke-virtual {p4}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 364
    invoke-virtual {p4}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    move-object p2, v2

    :cond_4
    :goto_1
    if-nez p3, :cond_6

    if-eqz p4, :cond_5

    .line 366
    invoke-virtual {p4}, Lcom/stripe/android/link/model/LinkAccount;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object p3

    if-eqz p3, :cond_5

    .line 367
    invoke-virtual {p4}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v4

    invoke-static {p4, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_5

    goto :goto_2

    :cond_5
    move-object p3, v2

    .line 369
    :cond_6
    :goto_2
    new-instance p4, Lcom/stripe/android/link/model/LinkAccount;

    invoke-direct {p4, p1, p2, p3}, Lcom/stripe/android/link/model/LinkAccount;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V

    .line 374
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/coroutines/MainCoroutineDispatcher;->getImmediate()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    new-instance p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$2;

    invoke-direct {p2, p0, p4, v2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$2;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function2;

    iput-object p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$setAccount$1;->label:I

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    return-object p4
.end method

.method private final signUpIfValidSessionState-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p6, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->label:I

    sub-int/2addr p6, v2

    iput p6, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;

    invoke-direct {v0, p0, p6}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p6, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 174
    iget v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->label:I

    const/4 v2, 0x2

    const/4 v8, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v8, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p6, Lkotlin/Result;

    invoke-virtual {p6}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$5:Ljava/lang/Object;

    move-object p5, p2

    check-cast p5, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    iget-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$4:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Ljava/lang/String;

    iget-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$3:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/lang/String;

    iget-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v3

    move-object v3, p2

    move p2, v2

    move-object v2, v1

    move-object v1, v4

    :goto_1
    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    goto :goto_2

    :cond_3
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 181
    iget-object p6, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p6}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p6

    invoke-interface {p6}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p6}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p6

    if-eqz p6, :cond_4

    .line 182
    invoke-virtual {p6}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v1

    .line 184
    :cond_5
    iput-object p0, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$0:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$1:Ljava/lang/Object;

    iput-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$2:Ljava/lang/Object;

    iput-object p3, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$3:Ljava/lang/Object;

    iput-object p4, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$4:Ljava/lang/Object;

    iput-object p5, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$5:Ljava/lang/Object;

    iput-object v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$6:Ljava/lang/Object;

    iput v8, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->label:I

    invoke-direct {p0, p6, v8, v7}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->getAccountStatus(Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v3, p2

    move p2, v2

    move-object v2, p1

    move-object p1, v1

    move-object v1, p0

    goto :goto_1

    :goto_2
    check-cast p6, Lcom/stripe/android/link/model/AccountStatus;

    sget-object p3, Lcom/stripe/android/link/account/DefaultLinkAccountManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p6}, Lcom/stripe/android/link/model/AccountStatus;->ordinal()I

    move-result p4

    aget p3, p3, p4

    if-eq p3, v8, :cond_d

    if-eq p3, p2, :cond_c

    const/4 p4, 0x3

    if-eq p3, p4, :cond_c

    const/4 p1, 0x4

    if-eq p3, p1, :cond_8

    const/4 p1, 0x5

    if-ne p3, p1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 208
    :cond_8
    :goto_3
    iput-object v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$1:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$2:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$3:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$4:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$5:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->L$6:Ljava/lang/Object;

    iput p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUpIfValidSessionState$1;->label:I

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->signUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_9

    :goto_4
    return-object v0

    :cond_9
    move-object p1, v1

    .line 214
    :goto_5
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    move-object p3, p2

    check-cast p3, Lcom/stripe/android/link/model/LinkAccount;

    .line 215
    iget-object p3, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p3, v8}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupCompleted(Z)V

    .line 216
    :cond_a
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_b

    .line 217
    iget-object p1, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1, v8, p3}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupFailure(ZLjava/lang/Throwable;)V

    :cond_b
    return-object p2

    .line 197
    :cond_c
    iget-object p2, v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    sget-object p3, Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;->RequiresVerification:Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;

    invoke-interface {p2, p3}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onInvalidSessionState(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)V

    .line 199
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 200
    new-instance p2, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;

    invoke-direct {p2, p1, p6}, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;-><init>(Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 199
    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 186
    :cond_d
    iget-object p2, v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    sget-object p3, Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;->Verified:Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;

    invoke-interface {p2, p3}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onInvalidSessionState(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)V

    .line 188
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 189
    new-instance p2, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;

    invoke-direct {p2, p1, p6}, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;-><init>(Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 188
    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public confirmVerification-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 420
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 421
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-nez p2, :cond_4

    .line 422
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 423
    :cond_4
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 425
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 426
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p2

    .line 423
    iput-object p0, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->label:I

    invoke-interface {v2, p1, v5, p2, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->confirmVerification-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, p0

    .line 428
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/ConsumerSession;

    .line 429
    iget-object v2, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v2}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAComplete()V

    .line 430
    :cond_6
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 431
    iget-object v2, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v2}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAFailure()V

    .line 432
    :cond_7
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/model/ConsumerSession;

    const/4 v2, 0x0

    .line 433
    iput-object v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$confirmVerification$1;->label:I

    invoke-direct {p1, p2, v2, v2, v0}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    :goto_2
    return-object v1

    .line 420
    :cond_8
    :goto_3
    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    .line 432
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createBankAccountPaymentDetails-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 319
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;->label:I

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

    .line 322
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 324
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 326
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v4

    .line 327
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 324
    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    invoke-interface {v2, p1, v4, p2, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->createBankAccountPaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    .line 330
    :cond_4
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 331
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 332
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "A non-null Link account is needed to create payment details"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 331
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createCardPaymentDetails-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 279
    iget v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 282
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 285
    iget-object v1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 287
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v3

    .line 288
    iget-object v4, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    .line 289
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 290
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p2

    iget-object v6, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    move-object v6, p2

    .line 285
    iput-object p0, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->L$0:Ljava/lang/Object;

    iput v2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createCardPaymentDetails$1;->label:I

    move-object v2, p1

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/link/repositories/LinkRepository;->createCardPaymentDetails-hUnOzRk(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    move-object p1, p0

    .line 291
    :goto_2
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/LinkPaymentDetails$New;

    .line 292
    iget-object v1, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->LINK_CREATE_CARD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_5
    return-object p2

    .line 296
    :cond_6
    iget-object v7, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_ATTACH_CARD_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v8, p1

    check-cast v8, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 297
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 298
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "A non-null Link account is needed to create payment details"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 297
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createLinkAccountSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/LinkAccountSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p1, v6, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 117
    iget v1, v6, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 118
    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    .line 119
    iget-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 120
    iget-object v1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    move v3, v2

    .line 121
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    .line 122
    iget-object v4, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    .line 123
    iget-object v5, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/link/LinkConfiguration;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v5

    .line 124
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p1

    .line 120
    iput v3, v6, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createLinkAccountSession$1;->label:I

    move-object v3, v4

    move-object v4, v5

    move-object v5, p1

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/link/repositories/LinkRepository;->createLinkAccountSession-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 125
    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/LinkAccountSession;

    .line 118
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 119
    :cond_4
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 118
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createPaymentMethod-gIAlu-s(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 268
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 269
    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    .line 270
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 269
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    .line 270
    :cond_3
    const-string p2, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    .line 269
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 271
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    .line 272
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 273
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 272
    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$createPaymentMethod$1;->label:I

    invoke-interface {v2, p2, p1, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->createPaymentMethod-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 275
    :cond_4
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    .line 271
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_5
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public deletePaymentDetails-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 464
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;->label:I

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

    .line 465
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-nez p2, :cond_3

    .line 466
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 467
    :cond_3
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 469
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 470
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p2

    .line 467
    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$deletePaymentDetails$1;->label:I

    invoke-interface {v2, p1, v4, p2, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->deletePaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public getAccountStatus()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->accountStatus:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public getCachedShippingAddresses()Lcom/stripe/android/model/ConsumerShippingAddresses;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->cachedShippingAddresses:Lcom/stripe/android/model/ConsumerShippingAddresses;

    return-object v0
.end method

.method public getConsumerState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ConsumerState;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->consumerState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public listPaymentDetails-gIAlu-s(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 441
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 442
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-nez p2, :cond_3

    .line 443
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 444
    :cond_3
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 446
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 447
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p2

    .line 444
    iput-object p0, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listPaymentDetails$1;->label:I

    invoke-interface {v2, p1, v4, p2, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->listPaymentDetails-BWLJW6A(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    .line 448
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails;

    .line 449
    iget-object p1, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->_consumerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/ConsumerState;

    if-eqz v1, :cond_5

    .line 450
    invoke-virtual {v1, v0}, Lcom/stripe/android/link/ConsumerState;->withPaymentDetailsResponse(Lcom/stripe/android/model/ConsumerPaymentDetails;)Lcom/stripe/android/link/ConsumerState;

    move-result-object v1

    if-eqz v1, :cond_5

    goto :goto_2

    .line 451
    :cond_5
    sget-object v1, Lcom/stripe/android/link/ConsumerState;->Companion:Lcom/stripe/android/link/ConsumerState$Companion;

    invoke-virtual {v1, v0}, Lcom/stripe/android/link/ConsumerState$Companion;->fromResponse(Lcom/stripe/android/model/ConsumerPaymentDetails;)Lcom/stripe/android/link/ConsumerState;

    move-result-object v1

    .line 449
    :goto_2
    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    :cond_6
    return-object p2
.end method

.method public listShippingAddresses-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerShippingAddresses;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 455
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 456
    iget-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    if-nez p1, :cond_3

    .line 457
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 458
    :cond_3
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 459
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 460
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p1

    .line 458
    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$listShippingAddresses$1;->label:I

    invoke-interface {v2, v4, p1, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->listShippingAddresses-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public logOut-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v1, "Failed to log out of Link: "

    instance-of v0, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;

    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->label:I

    sub-int/2addr p1, v3

    iput p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p1, v0

    iget-object v0, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 149
    iget v3, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 150
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    .line 151
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 150
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    .line 151
    :cond_3
    const-string v0, "Required value was null."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    .line 150
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 152
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :try_start_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 153
    :try_start_3
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v3, p0

    check-cast v3, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    .line 154
    iget-object v3, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 155
    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 156
    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object v0

    .line 154
    iput-object p0, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->L$0:Ljava/lang/Object;

    iput v4, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$logOut$1;->label:I

    invoke-interface {v3, v5, v0, p1}, Lcom/stripe/android/link/repositories/LinkRepository;->logOut-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v2, :cond_4

    return-object v2

    :cond_4
    move-object p1, p0

    .line 157
    :goto_2
    :try_start_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/ConsumerSession;

    .line 153
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object p1, p0

    :goto_3
    :try_start_5
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 158
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/model/ConsumerSession;

    .line 159
    iget-object v4, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->LINK_LOG_OUT_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 160
    sget-object v2, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v2, v3}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v2

    const-string v4, "Logged out of Link successfully"

    invoke-interface {v2, v4}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 161
    :cond_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 162
    iget-object v4, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 163
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_LOG_OUT_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v5, p1

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 164
    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, v2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 162
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 166
    sget-object p1, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {p1, v3}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    .line 167
    :cond_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/ConsumerSession;

    .line 152
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object p1, v0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_5

    :cond_7
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method public lookupConsumer-BWLJW6A(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 77
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->Z$0:Z

    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    iget-object p4, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    iput-object p0, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->Z$0:Z

    iput v4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->label:I

    invoke-interface {p4, p1, p3, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->lookupConsumer-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    .line 83
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p4

    if-eqz p4, :cond_5

    .line 84
    iget-object v2, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v2, p4}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onAccountLookupFailure(Ljava/lang/Throwable;)V

    .line 85
    :cond_5
    invoke-static {p3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_7

    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p3, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/4 p4, 0x0

    .line 86
    iput-object p4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$lookupConsumer$1;->label:I

    invoke-virtual {p1, p3, p2, v0}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setLinkAccountFromLookupResult(Lcom/stripe/android/model/ConsumerSessionLookup;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_6

    :goto_2
    return-object v1

    .line 77
    :cond_6
    :goto_3
    check-cast p4, Lcom/stripe/android/link/model/LinkAccount;

    .line 85
    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public mobileLookupConsumer-bMdYcbs(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p7

    instance-of v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;

    iget v2, v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v1

    iget-object v0, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 92
    iget v2, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->label:I

    const/4 v10, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v10, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->Z$0:Z

    iget-object p2, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 104
    iget-object v0, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getElementsSessionId()Ljava/lang/String;

    move-result-object v7

    .line 100
    iput-object p0, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->L$0:Ljava/lang/Object;

    move/from16 v0, p5

    iput-boolean v0, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->Z$0:Z

    iput v3, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->label:I

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v8, p6

    invoke-interface/range {v2 .. v9}, Lcom/stripe/android/link/repositories/LinkRepository;->mobileLookupConsumer-bMdYcbs(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, p0

    move p1, v0

    .line 107
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 108
    iget-object v2, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v2, v0}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onAccountLookupFailure(Ljava/lang/Throwable;)V

    .line 109
    :cond_5
    invoke-static {p3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p3, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/4 v0, 0x0

    .line 110
    iput-object v0, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->L$0:Ljava/lang/Object;

    iput v10, v9, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileLookupConsumer$1;->label:I

    invoke-virtual {p2, p3, p1, v9}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setLinkAccountFromLookupResult(Lcom/stripe/android/model/ConsumerSessionLookup;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    :goto_2
    return-object v1

    .line 92
    :cond_6
    :goto_3
    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    .line 109
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public mobileSignUp-eH_QyT8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p8

    instance-of v2, v1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;

    iget v3, v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v14, v2

    iget-object v1, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 239
    iget v3, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->label:I

    const/4 v15, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v15, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 248
    iget-object v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    move-object/from16 v1, p7

    .line 253
    invoke-direct {v0, v1}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->getConsumerAction(Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    move-result-object v8

    .line 256
    iget-object v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getAmount(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Long;

    move-result-object v9

    .line 257
    iget-object v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v10

    .line 248
    iput-object v0, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->L$0:Ljava/lang/Object;

    iput v4, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->label:I

    const/4 v11, 0x0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v4, p4

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    invoke-interface/range {v3 .. v14}, Lcom/stripe/android/link/repositories/LinkRepository;->mobileSignUp-5p_uFSQ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, v0

    .line 259
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v1, Lcom/stripe/android/model/ConsumerSessionSignup;

    .line 261
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSessionSignup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object v4

    .line 262
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSessionSignup;->getPublishableKey()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    .line 260
    iput-object v5, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->L$0:Ljava/lang/Object;

    iput v15, v14, Lcom/stripe/android/link/account/DefaultLinkAccountManager$mobileSignUp$1;->label:I

    invoke-direct {v3, v4, v1, v5, v14}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_2
    return-object v2

    .line 239
    :cond_5
    :goto_3
    check-cast v1, Lcom/stripe/android/link/model/LinkAccount;

    .line 259
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_6
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public setCachedShippingAddresses(Lcom/stripe/android/model/ConsumerShippingAddresses;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->cachedShippingAddresses:Lcom/stripe/android/model/ConsumerShippingAddresses;

    return-void
.end method

.method public setLinkAccountFromLookupResult(Lcom/stripe/android/model/ConsumerSessionLookup;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 384
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 388
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getPublishableKey()Ljava/lang/String;

    move-result-object p2

    .line 389
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object p1

    .line 386
    invoke-direct {p0, v0, p2, p1, p3}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    return-object p1

    .line 392
    :cond_1
    new-instance p2, Lcom/stripe/android/link/model/LinkAccount;

    .line 394
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getPublishableKey()Ljava/lang/String;

    move-result-object p3

    .line 395
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object p1

    .line 392
    invoke-direct {p2, v0, p3, p1}, Lcom/stripe/android/link/model/LinkAccount;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V

    return-object p2

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public shareCardPaymentDetails-gIAlu-s(Lcom/stripe/android/link/LinkPaymentDetails$New;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$Saved;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 303
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 306
    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    .line 307
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 306
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    .line 307
    :cond_3
    const-string p2, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    .line 306
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 308
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    .line 309
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    .line 310
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getOriginalParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    .line 311
    iget-object v4, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 312
    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v2

    .line 313
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 311
    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$shareCardPaymentDetails$1;->label:I

    invoke-interface {v4, p1, v2, p2, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->shareCardPaymentDetails-BWLJW6A(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 315
    :cond_4
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/link/LinkPaymentDetails$Saved;

    .line 308
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_5
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public sharePaymentDetails-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    instance-of v0, p5, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p5, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    .line 337
    iget v0, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;->label:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    :try_start_0
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 343
    :try_start_1
    sget-object p5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p5, p0

    check-cast p5, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    .line 344
    iget-object p5, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p5}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p5

    invoke-interface {p5}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p5}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p5

    if-eqz p5, :cond_3

    .line 343
    invoke-static {p5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    goto :goto_1

    .line 344
    :cond_3
    const-string p5, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-direct {v0, p5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object p5, v0

    .line 343
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p5}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p5

    invoke-static {p5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    .line 345
    :goto_1
    invoke-static {p5}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p5, Lcom/stripe/android/link/model/LinkAccount;

    move v2, v1

    .line 346
    iget-object v1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 348
    invoke-virtual {p5}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p5

    .line 346
    iput v2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$sharePaymentDetails$1;->label:I

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v2, p5

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/link/repositories/LinkRepository;->sharePaymentDetails-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_4

    return-object v8

    .line 352
    :cond_4
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/SharePaymentDetails;

    .line 345
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_5
    invoke-static {p5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public signInWithUserInput-gIAlu-s(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 129
    iget v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

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

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 133
    instance-of p2, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz p2, :cond_7

    .line 134
    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;->getEmail()Ljava/lang/String;

    move-result-object p1

    .line 136
    iget-object p2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerIdForEceDefaultValues()Ljava/lang/String;

    move-result-object p2

    .line 133
    iput v3, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->label:I

    invoke-virtual {p0, p1, v3, p2, v7}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->lookupConsumer-BWLJW6A(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    .line 137
    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    :try_start_0
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    .line 138
    :cond_5
    const-string p1, "Error fetching user account"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 137
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 140
    :cond_7
    instance-of p2, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    if-eqz p2, :cond_9

    .line 141
    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    move p2, v2

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getEmail()Ljava/lang/String;

    move-result-object v2

    .line 142
    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 143
    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getPhone()Ljava/lang/String;

    move-result-object v3

    .line 144
    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getName()Ljava/lang/String;

    move-result-object v5

    .line 145
    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getConsentAction()Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    move-result-object v6

    .line 140
    iput p2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signInWithUserInput$1;->label:I

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->signUpIfValidSessionState-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    return-object p1

    .line 132
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public signUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p6, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->label:I

    sub-int/2addr p6, v2

    iput p6, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;

    invoke-direct {v0, p0, p6}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p6, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 223
    iget v1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->label:I

    const/4 v8, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p6, Lkotlin/Result;

    invoke-virtual {p6}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_3
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 230
    iget-object v1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    invoke-direct {p0, p5}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->getConsumerAction(Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    move-result-object v6

    iput-object p0, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    iput v2, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->label:I

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/link/repositories/LinkRepository;->consumerSignUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    .line 231
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/model/ConsumerSessionSignup;

    .line 233
    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionSignup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object p3

    .line 234
    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionSignup;->getPublishableKey()Ljava/lang/String;

    move-result-object p2

    const/4 p4, 0x0

    .line 232
    iput-object p4, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    iput v8, v7, Lcom/stripe/android/link/account/DefaultLinkAccountManager$signUp$1;->label:I

    invoke-direct {p1, p3, p2, p4, v7}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v0, :cond_5

    :goto_2
    return-object v0

    .line 223
    :cond_5
    :goto_3
    check-cast p6, Lcom/stripe/android/link/model/LinkAccount;

    .line 231
    invoke-static {p6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public startVerification-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 401
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 402
    iget-object p1, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    if-nez p1, :cond_4

    .line 403
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 404
    :cond_4
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v2}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAStart()V

    .line 405
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 406
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 407
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p1

    .line 405
    iput-object p0, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->label:I

    invoke-interface {v2, v5, p1, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->startVerification-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p0

    .line 409
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 410
    iget-object v4, v2, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v4}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAStartFailure()V

    .line 411
    :cond_6
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/model/ConsumerSession;

    const/4 v4, 0x0

    .line 412
    iput-object v4, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$startVerification$1;->label:I

    invoke-direct {v2, p1, v4, v4, v0}, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    .line 401
    :cond_7
    :goto_3
    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    .line 411
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updatePaymentDetails-0E7RQCE(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;-><init>(Lcom/stripe/android/link/account/DefaultLinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 474
    iget v2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 478
    iget-object p3, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p3}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    invoke-interface {p3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p3

    if-nez p3, :cond_3

    .line 479
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 480
    :cond_3
    iget-object v2, p0, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 482
    invoke-virtual {p3}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 483
    invoke-virtual {p3}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p3

    .line 480
    iput-object p0, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/DefaultLinkAccountManager$updatePaymentDetails$1;->label:I

    invoke-interface {v2, p1, v4, p3, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->updatePaymentDetails-BWLJW6A(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    .line 484
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p3, Lcom/stripe/android/model/ConsumerPaymentDetails;

    .line 486
    iget-object p1, p1, Lcom/stripe/android/link/account/DefaultLinkAccountManager;->_consumerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ConsumerState;

    if-eqz v0, :cond_5

    .line 487
    invoke-virtual {p3}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 486
    invoke-virtual {v0, v1, p2}, Lcom/stripe/android/link/ConsumerState;->withUpdatedPaymentDetail(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;)Lcom/stripe/android/link/ConsumerState;

    move-result-object p2

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    :goto_2
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 484
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
