.class public final Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;
.super Ljava/lang/Object;
.source "LogLinkHoldbackExperiment.kt"

# interfaces
.implements Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLogLinkHoldbackExperiment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogLinkHoldbackExperiment.kt\ncom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001BE\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J&\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0002\u0010\u001bJ\u000c\u0010\u001c\u001a\u00020\u001d*\u00020\u0019H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u001f*\u00020\u00172\u0006\u0010$\u001a\u00020\u001fH\u0002J\u0014\u0010%\u001a\u0004\u0018\u00010!*\u00020\u0019H\u0082@\u00a2\u0006\u0002\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;",
        "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "linkDisabledApiRepository",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "retrieveCustomerEmail",
        "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "mode",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/repositories/LinkRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/Logger;)V",
        "invoke",
        "",
        "experimentAssignment",
        "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "state",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
        "logExposure",
        "(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getDefaultValues",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;",
        "isReturningUser",
        "",
        "email",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isSpmEnabled",
        "linkEnabled",
        "getEmail",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

.field private final linkDisabledApiRepository:Lcom/stripe/android/link/repositories/LinkRepository;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field private final retrieveCustomerEmail:Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/repositories/LinkRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p2    # Lcom/stripe/android/link/repositories/LinkRepository;
        .annotation runtime Lcom/stripe/android/paymentsheet/injection/LinkDisabledApiRepository;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "eventReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkDisabledApiRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveCustomerEmail"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 41
    iput-object p2, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->linkDisabledApiRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 42
    iput-object p3, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 43
    iput-object p4, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->retrieveCustomerEmail:Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

    .line 44
    iput-object p5, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 45
    iput-object p6, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    .line 46
    iput-object p7, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public static final synthetic access$getEmail(Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->getEmail(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$logExposure(Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->logExposure(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getDefaultValues(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;
    .locals 5

    .line 114
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getConfig()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 116
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    if-eqz p1, :cond_2

    .line 117
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    if-eqz v4, :cond_3

    move v4, v2

    goto :goto_3

    :cond_3
    move v4, v3

    :goto_3
    if-eqz p1, :cond_4

    .line 118
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    move v2, v3

    .line 115
    :goto_4
    new-instance p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    invoke-direct {p1, v1, v2, v4}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;-><init>(ZZZ)V

    return-object p1
.end method

.method private final getEmail(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 155
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->retrieveCustomerEmail:Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;

    .line 156
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getConfig()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v1

    .line 157
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getCustomer()Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 158
    new-instance v2, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 159
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getId()Ljava/lang/String;

    move-result-object v3

    .line 160
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v4

    .line 161
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    .line 158
    invoke-direct {v2, v3, v4, p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 155
    :goto_1
    invoke-interface {v0, v1, v2, p2}, Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;->invoke(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final isSpmEnabled(Lcom/stripe/android/model/ElementsSession;Z)Z
    .locals 4

    .line 145
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getMobilePaymentElement()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 149
    :goto_0
    instance-of v1, v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    check-cast v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;->isPaymentMethodSaveEnabled()Z

    move-result v0

    if-ne v0, v3, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz p2, :cond_3

    .line 150
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getFlags()Ljava/util/Map;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_ENABLE_LINK_SPM:Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move p1, v2

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v3

    :goto_3
    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    return v3

    :cond_4
    return v2
.end method

.method private final logExposure(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;

    iget v5, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->label:I

    const/high16 v6, -0x80000000

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    iget v3, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->label:I

    sub-int/2addr v3, v6

    iput v3, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;

    invoke-direct {v4, v0, v3}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;-><init>(Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v3, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 63
    iget v6, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->label:I

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v1, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$7:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    iget-object v2, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$6:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/model/ElementsSession$ExperimentsData;

    iget-object v7, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    iget-object v10, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$2:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    iget-object v11, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$1:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/model/ElementsSession;

    iget-object v4, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/ElementsSession$ExperimentsData;

    iget-object v6, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    iget-object v10, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$2:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    iget-object v11, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$1:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/model/ElementsSession;

    iget-object v12, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v25, v6

    move-object v6, v1

    move-object v1, v10

    move-object v10, v2

    move-object/from16 v2, v25

    goto :goto_1

    :cond_3
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getFlags()Ljava/util/Map;

    move-result-object v3

    sget-object v6, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP:Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 70
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 74
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getExperimentsData()Lcom/stripe/android/model/ElementsSession$ExperimentsData;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ElementsSession;->getExperimentsData()Lcom/stripe/android/model/ElementsSession$ExperimentsData;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 77
    invoke-virtual {v6}, Lcom/stripe/android/model/ElementsSession$ExperimentsData;->getExperimentAssignments()Ljava/util/Map;

    move-result-object v6

    .line 76
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_6

    .line 77
    :cond_5
    const-string v6, "control"

    .line 79
    :cond_6
    iput-object v0, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$0:Ljava/lang/Object;

    move-object/from16 v10, p1

    iput-object v10, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$1:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$3:Ljava/lang/Object;

    iput-object v3, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$4:Ljava/lang/Object;

    iput-object v6, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$5:Ljava/lang/Object;

    iput v9, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->label:I

    invoke-direct {v0, v1, v4}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->getEmail(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v5, :cond_7

    goto :goto_2

    :cond_7
    move-object v12, v10

    move-object v10, v3

    move-object v3, v11

    move-object v11, v12

    move-object v12, v0

    .line 63
    :goto_1
    check-cast v3, Ljava/lang/String;

    .line 81
    invoke-direct {v12, v1}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->getDefaultValues(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    move-result-object v13

    if-eqz v3, :cond_a

    .line 83
    iput-object v12, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$0:Ljava/lang/Object;

    iput-object v11, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$1:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$3:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$4:Ljava/lang/Object;

    iput-object v6, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$5:Ljava/lang/Object;

    iput-object v3, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$6:Ljava/lang/Object;

    iput-object v13, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->L$7:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$logExposure$1;->label:I

    invoke-virtual {v12, v3, v4}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->isReturningUser(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_8

    :goto_2
    return-object v5

    :cond_8
    move-object v7, v2

    move-object v2, v3

    move-object v3, v4

    move-object v5, v6

    move-object v6, v10

    move-object v4, v12

    move-object v10, v1

    move-object v1, v13

    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_9

    move-object/from16 v21, v1

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    move/from16 v18, v9

    goto :goto_4

    :cond_9
    move-object v13, v1

    move-object v3, v2

    move-object v12, v4

    move-object v2, v7

    move-object v1, v10

    move-object v10, v6

    move-object v6, v5

    :cond_a
    move-object/from16 v17, v2

    move-object v2, v3

    move-object/from16 v16, v6

    move/from16 v18, v8

    move-object v6, v10

    move-object v4, v12

    move-object/from16 v21, v13

    move-object v10, v1

    .line 85
    :goto_4
    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 86
    iget-object v3, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    invoke-interface {v3, v1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->linkGate(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/gate/LinkGate;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/link/gate/LinkGate;->getUseNativeLink()Z

    move-result v1

    if-ne v1, v9, :cond_b

    move/from16 v19, v9

    goto :goto_5

    :cond_b
    move/from16 v19, v8

    .line 89
    :goto_5
    sget-object v1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;->EMAIL:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    const/4 v1, 0x0

    :goto_6
    move-object/from16 v20, v1

    .line 91
    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v1

    if-eqz v1, :cond_d

    move v8, v9

    .line 93
    :cond_d
    iget-object v1, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->getCode()Ljava/lang/String;

    move-result-object v23

    .line 95
    invoke-direct {v4, v11, v8}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->isSpmEnabled(Lcom/stripe/android/model/ElementsSession;Z)Z

    move-result v22

    .line 97
    iget-object v1, v4, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 99
    invoke-virtual {v6}, Lcom/stripe/android/model/ElementsSession$ExperimentsData;->getArbId()Ljava/lang/String;

    move-result-object v15

    .line 98
    new-instance v14, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;

    move/from16 v24, v8

    invoke-direct/range {v14 .. v24}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)V

    check-cast v14, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;

    .line 97
    invoke-interface {v1, v14}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onExperimentExposure(Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V

    .line 111
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 73
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Experiments data required to log exposures"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public invoke(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V
    .locals 8

    const-string v0, "experimentAssignment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$invoke$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$invoke$1;-><init>(Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lkotlin/coroutines/Continuation;)V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final isReturningUser(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;

    iget v1, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;-><init>(Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 127
    iget v2, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;

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

    .line 130
    iget-object p2, p0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->linkDisabledApiRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    .line 131
    iput-object p0, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment$isReturningUser$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 132
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/model/ConsumerSessionLookup;

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result p2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p2

    :cond_4
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 133
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 134
    iget-object p1, p1, Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Failed to check if user is returning"

    invoke-interface {p1, v1, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2
.end method
