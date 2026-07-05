.class final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;
.super Ljava/lang/Object;
.source "FinancialConnectionsConsumerSessionRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsConsumerSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsConsumerSessionRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n116#2,11:361\n116#2,8:372\n125#2,2:381\n116#2,11:383\n116#2,10:394\n1#3:380\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsConsumerSessionRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl\n*L\n148#1:361,11\n185#1:372,8\n185#1:381,2\n212#1:383,11\n230#1:394,10\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@\u00a2\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\"J6\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010&Jn\u0010\'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00192.\u0010(\u001a*\u0008\u0001\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0-0,\u0012\u0006\u0012\u0004\u0018\u00010.0)H\u0082@\u00a2\u0006\u0002\u0010/J2\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00192\u0008\u00103\u001a\u0004\u0018\u00010\u00192\u0006\u00104\u001a\u0002052\u0008\u00106\u001a\u0004\u0018\u000107H\u0096@\u00a2\u0006\u0002\u00108J&\u00109\u001a\u0002012\u0006\u00102\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0096@\u00a2\u0006\u0002\u0010;J\u001e\u0010<\u001a\u00020=2\u0006\u00102\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010?J(\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0008\u0010C\u001a\u0004\u0018\u00010DH\u0096@\u00a2\u0006\u0002\u0010EJ0\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\u0008\u0010J\u001a\u0004\u0018\u00010\u0019H\u0096@\u00a2\u0006\u0002\u0010KJ.\u0010L\u001a\u0008\u0012\u0004\u0012\u00020M0-2\u0006\u0010N\u001a\u00020\u00192\u0006\u0010H\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0004\u0008O\u0010\"J\u001e\u0010P\u001a\u00020Q2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010?J6\u0010R\u001a\u00020Q2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010S\u001a\u00020T2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010UJ\u0018\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u000201H\u0002J\u0010\u0010Z\u001a\u00020W2\u0006\u0010[\u001a\u00020QH\u0002J\u0010\u0010\\\u001a\u00020W2\u0006\u0010]\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "financialConnectionsConsumersApiService",
        "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;",
        "consumersApiService",
        "Lcom/stripe/android/repository/ConsumersApiService;",
        "consumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;",
        "provideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "locale",
        "Ljava/util/Locale;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "fraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "isLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;)V",
        "mutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "requestSurface",
        "",
        "getCachedConsumerSession",
        "Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "signUp",
        "Lcom/stripe/android/model/ConsumerSessionSignup;",
        "email",
        "phoneNumber",
        "country",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mobileSignUp",
        "verificationToken",
        "appId",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "performSignUp",
        "signupCall",
        "Lkotlin/Function3;",
        "Lcom/stripe/android/model/SignUpParams;",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/Result;",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startConsumerVerification",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerSessionClientSecret",
        "connectionsMerchantName",
        "type",
        "Lcom/stripe/android/model/VerificationType;",
        "customEmailType",
        "Lcom/stripe/android/model/CustomEmailType;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmConsumerVerification",
        "verificationCode",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachLinkConsumerToLinkAccountSession",
        "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;",
        "clientSecret",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "bankAccountId",
        "billingDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sharePaymentDetails",
        "Lcom/stripe/android/model/SharePaymentDetails;",
        "paymentDetailsId",
        "expectedPaymentMethodType",
        "billingPhone",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateAvailableIncentives",
        "Lcom/stripe/android/model/UpdateAvailableIncentives;",
        "sessionId",
        "updateAvailableIncentives-BWLJW6A",
        "postConsumerSession",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "mobileLookupConsumerSession",
        "emailSource",
        "Lcom/stripe/android/model/EmailSource;",
        "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateCachedConsumerSession",
        "",
        "source",
        "consumerSession",
        "updateCachedConsumerSessionFromLookup",
        "lookup",
        "updateCachedConsumerSessionFromSignup",
        "signup",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;

.field private final consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

.field private final elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

.field private final financialConnectionsConsumersApiService:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;

.field private final fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

.field private final locale:Ljava/util/Locale;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:Lkotlinx/coroutines/sync/Mutex;

.field private final provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

.field private final requestSurface:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;)V
    .locals 1

    const-string v0, "financialConnectionsConsumersApiService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumersApiService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkWithStripe"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->financialConnectionsConsumersApiService:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;

    .line 126
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 127
    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;

    .line 128
    iput-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    .line 129
    iput-object p5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->locale:Ljava/util/Locale;

    .line 130
    iput-object p6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    .line 131
    iput-object p7, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    .line 132
    iput-object p8, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 136
    invoke-static {p3, p1, p2}, Lkotlinx/coroutines/sync/MutexKt;->Mutex$default(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 138
    invoke-interface {p9}, Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 139
    const-string p1, "android_instant_debits"

    goto :goto_0

    .line 141
    :cond_0
    const-string p1, "android_connections"

    .line 138
    :goto_0
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 145
    invoke-interface {p7}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->refresh()V

    return-void
.end method

.method public static final synthetic access$performSignUp(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 124
    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->performSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final performSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/stripe/android/model/SignUpParams;",
            "-",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p7

    instance-of v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 178
    iget v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/sync/Mutex;

    iget-object v2, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/sync/Mutex;

    iget-object v6, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$6:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function3;

    iget-object v8, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v0, v11

    move-object v11, v10

    move-object v10, v0

    move-object/from16 v20, v8

    move-object/from16 v19, v9

    move-object v9, v12

    move-object v0, v13

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 185
    iget-object v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 377
    iput-object v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$0:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$1:Ljava/lang/Object;

    move-object/from16 v8, p2

    iput-object v8, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$2:Ljava/lang/Object;

    move-object/from16 v9, p3

    iput-object v9, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$3:Ljava/lang/Object;

    move-object/from16 v10, p4

    iput-object v10, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$4:Ljava/lang/Object;

    move-object/from16 v11, p5

    iput-object v11, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$5:Ljava/lang/Object;

    move-object/from16 v12, p6

    iput-object v12, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$6:Ljava/lang/Object;

    iput-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$7:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->label:I

    invoke-interface {v0, v7, v2}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object/from16 v19, v10

    move-object/from16 v20, v11

    move-object v6, v12

    move-object v10, v8

    move-object v11, v9

    move-object v9, v4

    move-object v4, v0

    move-object v0, v1

    .line 186
    :goto_1
    :try_start_1
    new-instance v8, Lcom/stripe/android/model/SignUpParams;

    .line 191
    iget-object v13, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->locale:Ljava/util/Locale;

    .line 192
    iget-object v12, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v12, :cond_5

    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getAmount()Ljava/lang/Long;

    move-result-object v12

    move-object v14, v12

    goto :goto_2

    :cond_5
    move-object v14, v7

    .line 193
    :goto_2
    iget-object v12, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v12, :cond_6

    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getCurrency()Ljava/lang/String;

    move-result-object v12

    move-object v15, v12

    goto :goto_3

    :cond_6
    move-object v15, v7

    .line 194
    :goto_3
    iget-object v12, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getIncentiveEligibilitySession()Lcom/stripe/android/model/IncentiveEligibilitySession;

    move-result-object v12

    move-object/from16 v16, v12

    goto :goto_4

    :cond_7
    move-object/from16 v16, v7

    .line 195
    :goto_4
    iget-object v12, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 196
    sget-object v18, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->EnteredPhoneNumberClickedSaveToLink:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    move-object/from16 v17, v12

    const/4 v12, 0x0

    .line 186
    invoke-direct/range {v8 .. v20}, Lcom/stripe/android/model/SignUpParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iget-object v9, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v10, 0x0

    invoke-interface {v9, v10}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v9

    iput-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$5:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$6:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->L$7:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1;->label:I

    invoke-interface {v6, v8, v9, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v3, :cond_8

    :goto_5
    return-object v3

    :cond_8
    move-object v3, v2

    move-object v2, v0

    move-object v0, v3

    move-object v3, v4

    :goto_6
    :try_start_2
    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    .line 203
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/model/ConsumerSessionSignup;

    invoke-direct {v2, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->updateCachedConsumerSessionFromSignup(Lcom/stripe/android/model/ConsumerSessionSignup;)V

    .line 204
    :cond_9
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionSignup;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 381
    invoke-interface {v3, v7}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v3, v4

    :goto_7
    invoke-interface {v3, v7}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    throw v0
.end method

.method static synthetic performSignUp$default(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_1

    move-object p5, v0

    .line 178
    :cond_1
    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->performSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final updateCachedConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/ConsumerSession;)V
    .locals 3

    .line 339
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SYNC_CACHE: updating local consumer session from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 340
    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;

    invoke-interface {p1, p2}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;->updateConsumerSession(Lcom/stripe/android/model/ConsumerSession;)V

    return-void
.end method

.method private final updateCachedConsumerSessionFromLookup(Lcom/stripe/android/model/ConsumerSessionLookup;)V
    .locals 2

    .line 346
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "SYNC_CACHE: updating local consumer session from lookupConsumerSession"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getPublishableKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;->storeNewConsumerSession(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V

    return-void
.end method

.method private final updateCachedConsumerSessionFromSignup(Lcom/stripe/android/model/ConsumerSessionSignup;)V
    .locals 2

    .line 353
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "SYNC_CACHE: updating local consumer session from signUp"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 354
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;

    .line 355
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionSignup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object v1

    .line 356
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionSignup;->getPublishableKey()Ljava/lang/String;

    move-result-object p1

    .line 354
    invoke-interface {v0, v1, p1}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;->storeNewConsumerSession(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public attachLinkConsumerToLinkAccountSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 249
    iget-object v3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 250
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 246
    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/repository/ConsumersApiService;->attachLinkConsumerToLinkAccountSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public confirmConsumerVerification(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/VerificationType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p4, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 226
    iget v1, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/sync/Mutex;

    iget-object p2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/sync/Mutex;

    iget-object p2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$3:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lcom/stripe/android/model/VerificationType;

    iget-object p2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v1, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p4, v3

    move-object v3, p2

    move-object p2, p4

    move-object p4, p1

    move-object p1, v1

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 230
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 399
    iput-object p0, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$0:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$1:Ljava/lang/Object;

    iput-object p2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$2:Ljava/lang/Object;

    iput-object p3, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$3:Ljava/lang/Object;

    iput-object p4, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$4:Ljava/lang/Object;

    iput v3, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->label:I

    invoke-interface {p4, v8, v7}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, p2

    move-object p2, p0

    :goto_1
    move-object v5, p3

    .line 231
    :try_start_1
    iget-object v1, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 235
    iget-object v4, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 236
    iget-object p3, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v6, 0x0

    invoke-interface {p3, v6}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    .line 231
    iput-object p2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$0:Ljava/lang/Object;

    iput-object p4, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$1:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$2:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$3:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->L$4:Ljava/lang/Object;

    iput v2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1;->label:I

    move-object v2, p1

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/repository/ConsumersApiService;->confirmConsumerVerification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    move-object v9, p4

    move-object p4, p1

    move-object p1, v9

    .line 237
    :goto_3
    :try_start_2
    move-object p3, p4

    check-cast p3, Lcom/stripe/android/model/ConsumerSession;

    .line 238
    const-string v0, "confirmConsumerVerification"

    invoke-direct {p2, v0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->updateCachedConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/ConsumerSession;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 403
    invoke-interface {p1, v8}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    return-object p4

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, p4

    :goto_4
    invoke-interface {p1, v8}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    throw p2
.end method

.method public createPaymentDetails(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p4, v6, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 254
    iget v1, v6, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 259
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 261
    new-instance p4, Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$BankAccount;

    const/4 v3, 0x0

    if-eqz p3, :cond_3

    .line 263
    invoke-static {p3}, Lcom/stripe/android/financialconnections/utils/BillingDetailsExtensionsKt;->toConsumerBillingAddressParams(Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;)Ljava/util/Map;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v3

    :goto_1
    if-eqz p3, :cond_4

    .line 264
    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v3

    .line 261
    :cond_4
    invoke-direct {p4, p1, v4, v3}, Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$BankAccount;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    move-object v3, p4

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;

    .line 266
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 267
    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v5

    .line 259
    iput v2, v6, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1;->label:I

    move-object v2, p2

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/repository/ConsumersApiService;->createPaymentDetails-yxL6bBk(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    .line 268
    :cond_5
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1
.end method

.method public getCachedConsumerSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 148
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/sync/Mutex;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 366
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1;->label:I

    invoke-interface {p1, v3, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    .line 149
    :goto_1
    :try_start_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    invoke-interface {v1, v3}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v3}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    throw p1
.end method

.method public mobileLookupConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;

    iget v2, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v11, v1

    iget-object v0, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 316
    iget v2, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 322
    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 325
    iget-object v5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 329
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v8

    .line 322
    iput-object p0, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->L$0:Ljava/lang/Object;

    iput v3, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1;->label:I

    const/4 v10, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object/from16 v9, p4

    move-object/from16 v7, p5

    invoke-interface/range {v2 .. v11}, Lcom/stripe/android/repository/ConsumersApiService;->mobileLookupConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 331
    :goto_1
    move-object p2, v0

    check-cast p2, Lcom/stripe/android/model/ConsumerSessionLookup;

    .line 332
    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->updateCachedConsumerSessionFromLookup(Lcom/stripe/android/model/ConsumerSessionLookup;)V

    return-object v0
.end method

.method public mobileSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
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
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 175
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileSignUp$2;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$mobileSignUp$2;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v8, p6

    .line 169
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->performSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public postConsumerSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 305
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

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
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->financialConnectionsConsumersApiService:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;

    .line 311
    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 308
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1;->label:I

    invoke-interface {p3, p1, p2, v2, v0}, Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;->postConsumerSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 312
    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/model/ConsumerSessionLookup;

    .line 313
    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->updateCachedConsumerSessionFromLookup(Lcom/stripe/android/model/ConsumerSessionLookup;)V

    return-object p3
.end method

.method public sharePaymentDetails(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
            "Lcom/stripe/android/model/SharePaymentDetails;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p4, p5, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;

    if-eqz p4, :cond_0

    move-object p4, p5

    check-cast p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;

    iget v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;->label:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget p5, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;->label:I

    sub-int/2addr p5, v1

    iput p5, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;

    invoke-direct {p4, p0, p5}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, p4

    iget-object p4, v8, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p5

    .line 271
    iget v0, v8, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;->label:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 277
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    invoke-interface {p4}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->getCached()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_3

    invoke-virtual {p4}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object p4

    goto :goto_1

    :cond_3
    move-object p4, v0

    :goto_1
    if-nez p4, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p4

    .line 278
    :cond_4
    const-string v2, "payment_method"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "expand"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    move-object v3, v0

    .line 280
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 284
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getBillingDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    move-object v4, v3

    .line 285
    :goto_2
    iget-object v5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 286
    iget-object v3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v6, 0x0

    invoke-interface {v3, v6}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    .line 287
    invoke-static {p4, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    .line 280
    iput v1, v8, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1;->label:I

    move-object v2, p1

    move-object v1, p2

    move-object v3, p3

    invoke-interface/range {v0 .. v8}, Lcom/stripe/android/repository/ConsumersApiService;->sharePaymentDetails-eH_QyT8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_6

    return-object p5

    .line 288
    :cond_6
    :goto_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1
.end method

.method public signUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionSignup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 160
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$signUp$2;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$signUp$2;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v8, p4

    .line 156
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->performSignUp$default(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public startConsumerVerification(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/VerificationType;",
            "Lcom/stripe/android/model/CustomEmailType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p5

    instance-of v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v11, v2

    iget-object v0, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 207
    iget v3, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    iget-object v3, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$5:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/sync/Mutex;

    iget-object v5, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/CustomEmailType;

    iget-object v6, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/model/VerificationType;

    iget-object v7, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v3

    move-object v3, v8

    move-object v0, v9

    move-object v8, v5

    move-object v9, v7

    move-object v7, v6

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 212
    iget-object v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 388
    iput-object v1, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$0:Ljava/lang/Object;

    move-object/from16 v3, p1

    iput-object v3, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$1:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$2:Ljava/lang/Object;

    move-object/from16 v7, p3

    iput-object v7, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$3:Ljava/lang/Object;

    move-object/from16 v8, p4

    iput-object v8, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$4:Ljava/lang/Object;

    iput-object v0, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$5:Ljava/lang/Object;

    iput v5, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->label:I

    invoke-interface {v0, v12, v11}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v13, v0

    move-object v0, v1

    move-object v9, v6

    .line 213
    :goto_1
    :try_start_1
    iget-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 215
    iget-object v6, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->locale:Ljava/util/Locale;

    if-nez v6, :cond_5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v10, v3

    move-object v3, v5

    move-object v5, v6

    .line 217
    iget-object v6, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 220
    iget-object v14, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v15, 0x0

    invoke-interface {v14, v15}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v14

    .line 213
    iput-object v0, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$0:Ljava/lang/Object;

    iput-object v13, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$1:Ljava/lang/Object;

    iput-object v12, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$2:Ljava/lang/Object;

    iput-object v12, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$3:Ljava/lang/Object;

    iput-object v12, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$4:Ljava/lang/Object;

    iput-object v12, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->L$5:Ljava/lang/Object;

    iput v4, v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1;->label:I

    move-object v4, v10

    move-object v10, v14

    invoke-interface/range {v3 .. v11}, Lcom/stripe/android/repository/ConsumersApiService;->startConsumerVerification(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v3, v2, :cond_6

    :goto_2
    return-object v2

    :cond_6
    move-object v2, v3

    move-object v3, v0

    move-object v0, v2

    move-object v2, v13

    .line 221
    :goto_3
    :try_start_2
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/model/ConsumerSession;

    .line 222
    const-string v5, "startConsumerVerification"

    invoke-direct {v3, v5, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->updateCachedConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/ConsumerSession;)V

    .line 221
    check-cast v0, Lcom/stripe/android/model/ConsumerSession;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 392
    invoke-interface {v2, v12}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v13

    :goto_4
    invoke-interface {v2, v12}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    throw v0
.end method

.method public updateAvailableIncentives-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/UpdateAvailableIncentives;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p4, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 291
    iget v1, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

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

    .line 296
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->consumersApiService:Lcom/stripe/android/repository/ConsumersApiService;

    .line 300
    iget-object v5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->requestSurface:Ljava/lang/String;

    .line 301
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v3, 0x0

    invoke-interface {p4, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    .line 296
    iput v2, v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;->label:I

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/repository/ConsumersApiService;->updateAvailableIncentives-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
