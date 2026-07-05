.class public final Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;
.super Ljava/lang/Object;
.source "CustomerSessionElementsSessionManager.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001BR\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0008\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0008\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0008\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
        "elementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "prefsRepositoryFactory",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "customerSessionProvider",
        "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "timeProvider",
        "Lkotlin/Function0;",
        "",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;)V",
        "cachedCustomerEphemeralKey",
        "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;",
        "intentConfiguration",
        "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;",
        "fetchCustomerSessionEphemeralKey",
        "Lkotlin/Result;",
        "fetchCustomerSessionEphemeralKey-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchElementsSession",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
        "fetchElementsSession-IoAF18A",
        "createCustomerSessionElementsSession",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "customerSessionClientSecret",
        "reportSuccessfulElementsSessionLoad",
        "",
        "reportFailedElementsSessionLoad",
        "cause",
        "",
        "validateCustomerSessionClientSecret",
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
.field private volatile cachedCustomerEphemeralKey:Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

.field private final customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

.field private final elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private intentConfiguration:Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

.field private final prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final timeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p6    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "elementsSessionRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsRepositoryFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSessionProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    .line 37
    iput-object p2, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 38
    iput-object p3, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    .line 39
    iput-object p4, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 40
    iput-object p5, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->timeProvider:Lkotlin/jvm/functions/Function0;

    .line 41
    iput-object p6, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$createCustomerSessionElementsSession(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lcom/stripe/android/model/ElementsSession;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->createCustomerSessionElementsSession(Lcom/stripe/android/model/ElementsSession;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCachedCustomerEphemeralKey$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->cachedCustomerEphemeralKey:Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

    return-object p0
.end method

.method public static final synthetic access$getCustomerSessionProvider$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    return-object p0
.end method

.method public static final synthetic access$getElementsSessionRepository$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    return-object p0
.end method

.method public static final synthetic access$getIntentConfiguration$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->intentConfiguration:Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    return-object p0
.end method

.method public static final synthetic access$getPrefsRepositoryFactory$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getTimeProvider$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->timeProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$reportFailedElementsSessionLoad(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Ljava/lang/Throwable;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->reportFailedElementsSessionLoad(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$reportSuccessfulElementsSessionLoad(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->reportSuccessfulElementsSessionLoad()V

    return-void
.end method

.method public static final synthetic access$setCachedCustomerEphemeralKey$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->cachedCustomerEphemeralKey:Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

    return-void
.end method

.method public static final synthetic access$setIntentConfiguration$p(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->intentConfiguration:Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    return-void
.end method

.method public static final synthetic access$validateCustomerSessionClientSecret(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->validateCustomerSessionClientSecret(Ljava/lang/String;)V

    return-void
.end method

.method private final createCustomerSessionElementsSession(Lcom/stripe/android/model/ElementsSession;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;
    .locals 6

    .line 111
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v1

    .line 125
    new-instance v2, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    .line 128
    new-instance v3, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

    .line 129
    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getCustomerId()Ljava/lang/String;

    move-result-object v4

    .line 131
    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getApiKey()Ljava/lang/String;

    move-result-object v5

    .line 132
    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getApiKeyExpiry()I

    move-result v1

    .line 128
    invoke-direct {v3, v4, p2, v5, v1}, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 125
    invoke-direct {v2, p1, v0, v3}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;-><init>(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/model/ElementsSession$Customer;Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;)V

    return-object v2

    .line 111
    :cond_0
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    .line 112
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 115
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 112
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 118
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 119
    const-string p2, "`customer` field should be available when using `CustomerSession` in elements/session!"

    .line 118
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final reportFailedElementsSessionLoad(Ljava/lang/Throwable;)V
    .locals 6

    .line 146
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 149
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 150
    sget-object v2, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v2, p1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 146
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final reportSuccessfulElementsSessionLoad()V
    .locals 6

    .line 138
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 141
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 138
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final validateCustomerSessionClientSecret(Ljava/lang/String;)V
    .locals 1

    .line 155
    sget-object v0, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;->INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;

    .line 156
    invoke-virtual {v0, p1}, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;->validate(Ljava/lang/String;)Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;

    move-result-object p1

    .line 159
    instance-of v0, p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$Empty;

    if-eqz v0, :cond_0

    .line 160
    const-string p1, "The provided \'customerSessionClientSecret\' cannot be an empty string."

    goto :goto_0

    .line 162
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$LegacyEphemeralKey;

    if-eqz v0, :cond_1

    .line 163
    const-string p1, "Provided secret looks like an Ephemeral Key secret, but expecting a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create"

    goto :goto_0

    .line 166
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$UnknownKey;

    if-eqz v0, :cond_2

    .line 167
    const-string p1, "Provided secret does not look like a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create"

    goto :goto_0

    .line 170
    :cond_2
    instance-of p1, p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Valid;

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    return-void

    .line 174
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public fetchCustomerSessionEphemeralKey-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;-><init>(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 48
    iget v2, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$2;-><init>(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;-><init>(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 59
    iget v2, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2;-><init>(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager$fetchElementsSession$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
