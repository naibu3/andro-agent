.class public final Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;
.super Ljava/lang/Object;
.source "DefaultLinkEventsReporter.kt"

# interfaces
.implements Lcom/stripe/android/link/analytics/LinkEventsReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$Companion;,
        Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\r\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 82\u00020\u0001:\u00018B;\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0011H\u0016J\u0008\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0008\u0010\u001e\u001a\u00020\u0011H\u0016J\u0008\u0010\u001f\u001a\u00020\u0011H\u0016J\u0008\u0010 \u001a\u00020\u0011H\u0016J\u0008\u0010!\u001a\u00020\u0011H\u0016J\u0008\u0010\"\u001a\u00020\u0011H\u0016J\u0008\u0010#\u001a\u00020\u0011H\u0016J\u0008\u0010$\u001a\u00020\u0011H\u0016J\u0008\u0010%\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0008\u0010\'\u001a\u00020\u0011H\u0016J\u0008\u0010(\u001a\u00020\u0011H\u0016J%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0018\u00010*2\u0008\u0010-\u001a\u0004\u0018\u00010.H\u0002\u00a2\u0006\u0002\u0008/J(\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0016\u0008\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u000204\u0018\u00010*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u00105\u001a\u00020+*\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u00a8\u00069"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "durationProvider",
        "Lcom/stripe/android/core/utils/DurationProvider;",
        "<init>",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/utils/DurationProvider;)V",
        "onInvalidSessionState",
        "",
        "state",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;",
        "onInlineSignupCheckboxChecked",
        "onSignupFlowPresented",
        "onSignupStarted",
        "isInline",
        "",
        "onSignupCompleted",
        "onSignupFailure",
        "error",
        "",
        "onAccountLookupFailure",
        "on2FAStart",
        "on2FAStartFailure",
        "on2FAComplete",
        "on2FAFailure",
        "on2FACancel",
        "onPopupShow",
        "onPopupSuccess",
        "onPopupCancel",
        "onPopupError",
        "onPopupLogout",
        "onPopupSkipped",
        "durationInSecondsFromStart",
        "",
        "",
        "",
        "duration",
        "Lkotlin/time/Duration;",
        "durationInSecondsFromStart-BwNAW2A",
        "fireEvent",
        "event",
        "Lcom/stripe/android/link/analytics/LinkEvent;",
        "additionalParams",
        "",
        "analyticsValue",
        "getAnalyticsValue",
        "(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)Ljava/lang/String;",
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

.field private static final Companion:Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$Companion;

.field private static final FIELD_ERROR_MESSAGE:Ljava/lang/String; = "error_message"

.field private static final FIELD_SESSION_STATE:Ljava/lang/String; = "sessionState"

.field private static final VALUE_REQUIRES_SIGN_UP:Ljava/lang/String; = "requiresSignUp"

.field private static final VALUE_REQUIRES_VERIFICATION:Ljava/lang/String; = "requiresVerification"

.field private static final VALUE_VERIFIED:Ljava/lang/String; = "verified"


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->Companion:Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/utils/DurationProvider;)V
    .locals 1
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 20
    iput-object p2, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 21
    iput-object p3, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 22
    iput-object p4, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 23
    iput-object p5, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->logger:Lcom/stripe/android/core/Logger;

    .line 24
    iput-object p6, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method private final durationInSecondsFromStart-BwNAW2A(Lkotlin/time/Duration;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/time/Duration;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    .line 122
    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p1}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string v0, "duration"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/analytics/LinkEvent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 130
    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/link/analytics/LinkEvent;->getEventName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Link event: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$fireEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, p2, v2}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$fireEvent$1;-><init>(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method static synthetic fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 126
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method

.method private final getAnalyticsValue(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)Ljava/lang/String;
    .locals 1

    .line 142
    sget-object v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 145
    const-string p1, "verified"

    return-object p1

    .line 142
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 144
    :cond_1
    const-string p1, "requiresVerification"

    return-object p1

    .line 143
    :cond_2
    const-string p1, "requiresSignUp"

    return-object p1
.end method


# virtual methods
.method public on2FACancel()V
    .locals 3

    .line 91
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAComplete()V
    .locals 3

    .line 83
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAFailure()V
    .locals 3

    .line 87
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAStart()V
    .locals 3

    .line 75
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAStartFailure()V
    .locals 3

    .line 79
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onAccountLookupFailure(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    const-string v0, "error_message"

    invoke-static {p1}, Lcom/stripe/android/core/exception/ExceptionUtilsKt;->getSafeAnalyticsMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 68
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->getAdditionalParamsFromError(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    .line 67
    invoke-static {v0, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 71
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method

.method public onInlineSignupCheckboxChecked()V
    .locals 3

    .line 34
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onInvalidSessionState(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)V
    .locals 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const-string v0, "sessionState"

    invoke-direct {p0, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->getAnalyticsValue(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_INVALID_SESSION_STATE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 30
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailureInvalidSessionState;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailureInvalidSessionState;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method

.method public onPopupCancel()V
    .locals 3

    .line 103
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$PopupCancel;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$PopupCancel;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onPopupError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    const-string v0, "error_message"

    invoke-static {p1}, Lcom/stripe/android/core/exception/ExceptionUtilsKt;->getSafeAnalyticsMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 109
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$PopupError;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$PopupError;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method

.method public onPopupLogout()V
    .locals 3

    .line 113
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$PopupLogout;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$PopupLogout;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onPopupShow()V
    .locals 3

    .line 95
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$PopupShow;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$PopupShow;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onPopupSkipped()V
    .locals 3

    .line 117
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$PopupSkipped;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$PopupSkipped;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onPopupSuccess()V
    .locals 3

    .line 99
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$PopupSuccess;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$PopupSuccess;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onSignupCompleted(Z)V
    .locals 1

    .line 47
    iget-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->LinkSignup:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-interface {p1, v0}, Lcom/stripe/android/core/utils/DurationProvider;->end-LV8wdWc(Lcom/stripe/android/core/utils/DurationProvider$Key;)Lkotlin/time/Duration;

    move-result-object p1

    .line 48
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->durationInSecondsFromStart-BwNAW2A(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method

.method public onSignupFailure(ZLjava/lang/Throwable;)V
    .locals 2

    const-string p1, "error"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    instance-of p1, p2, Lcom/stripe/android/core/exception/APIException;

    const-string v0, "error_message"

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 53
    move-object p1, p2

    check-cast p1, Lcom/stripe/android/core/exception/APIException;

    invoke-virtual {p1}, Lcom/stripe/android/core/exception/APIException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 54
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    .line 60
    invoke-static {p2}, Lcom/stripe/android/core/exception/ExceptionUtilsKt;->getSafeAnalyticsMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 61
    :cond_1
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->getAdditionalParamsFromError(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 63
    sget-object p2, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;

    check-cast p2, Lcom/stripe/android/link/analytics/LinkEvent;

    invoke-direct {p0, p2, p1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method

.method public onSignupFlowPresented()V
    .locals 3

    .line 38
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEvent;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onSignupStarted(Z)V
    .locals 4

    .line 42
    iget-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->durationProvider:Lcom/stripe/android/core/utils/DurationProvider;

    sget-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->LinkSignup:Lcom/stripe/android/core/utils/DurationProvider$Key;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lcom/stripe/android/core/utils/DurationProvider$DefaultImpls;->start$default(Lcom/stripe/android/core/utils/DurationProvider;Lcom/stripe/android/core/utils/DurationProvider$Key;ZILjava/lang/Object;)V

    .line 43
    sget-object p1, Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;

    check-cast p1, Lcom/stripe/android/link/analytics/LinkEvent;

    invoke-static {p0, p1, v3, v2, v3}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
