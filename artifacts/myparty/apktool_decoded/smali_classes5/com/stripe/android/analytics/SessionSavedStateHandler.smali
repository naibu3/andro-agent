.class public final Lcom/stripe/android/analytics/SessionSavedStateHandler;
.super Ljava/lang/Object;
.source "SessionSavedStateHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0008\u0010\u0013\u001a\u00020\u000bH\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/analytics/SessionSavedStateHandler;",
        "",
        "<init>",
        "()V",
        "SESSION_KEY",
        "",
        "getSESSION_KEY$payments_core_release$annotations",
        "sessionLocked",
        "",
        "attachTo",
        "Lkotlin/Function0;",
        "",
        "viewModel",
        "Landroidx/lifecycle/ViewModel;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "startSession",
        "restartSession",
        "clearSession",
        "clear",
        "payments-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/analytics/SessionSavedStateHandler;

.field public static final SESSION_KEY:Ljava/lang/String; = "STRIPE_ANALYTICS_LOCAL_SESSION"

.field private static sessionLocked:Z


# direct methods
.method public static synthetic $r8$lambda$S7pP4z8SqriLrO1qYkhNTqvEQtI(Landroidx/lifecycle/SavedStateHandle;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/analytics/SessionSavedStateHandler;->attachTo$lambda$1(Landroidx/lifecycle/SavedStateHandle;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hz1HtgkOI1mKFOmdSqW-xyv_i5Y(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/analytics/SessionSavedStateHandler;->attachTo$lambda$0(Landroidx/lifecycle/SavedStateHandle;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/analytics/SessionSavedStateHandler;

    invoke-direct {v0}, Lcom/stripe/android/analytics/SessionSavedStateHandler;-><init>()V

    sput-object v0, Lcom/stripe/android/analytics/SessionSavedStateHandler;->INSTANCE:Lcom/stripe/android/analytics/SessionSavedStateHandler;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/analytics/SessionSavedStateHandler;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final attachTo$lambda$0(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1

    .line 30
    sget-object v0, Lcom/stripe/android/analytics/SessionSavedStateHandler;->INSTANCE:Lcom/stripe/android/analytics/SessionSavedStateHandler;

    invoke-direct {v0, p0}, Lcom/stripe/android/analytics/SessionSavedStateHandler;->clearSession(Landroidx/lifecycle/SavedStateHandle;)V

    return-void
.end method

.method private static final attachTo$lambda$1(Landroidx/lifecycle/SavedStateHandle;)Lkotlin/Unit;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/analytics/SessionSavedStateHandler;->INSTANCE:Lcom/stripe/android/analytics/SessionSavedStateHandler;

    invoke-direct {v0, p0}, Lcom/stripe/android/analytics/SessionSavedStateHandler;->restartSession(Landroidx/lifecycle/SavedStateHandle;)V

    .line 35
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final clearSession(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1

    .line 84
    const-string v0, "STRIPE_ANALYTICS_LOCAL_SESSION"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/analytics/Session;

    if-eqz p1, :cond_2

    .line 87
    instance-of v0, p1, Lcom/stripe/android/analytics/Session$Owner;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 88
    sput-boolean p1, Lcom/stripe/android/analytics/SessionSavedStateHandler;->sessionLocked:Z

    return-void

    .line 90
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/analytics/Session$Observer;

    if-eqz p1, :cond_1

    goto :goto_0

    .line 86
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic getSESSION_KEY$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final restartSession(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 4

    .line 67
    const-string v0, "STRIPE_ANALYTICS_LOCAL_SESSION"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/analytics/Session;

    if-eqz v1, :cond_2

    .line 70
    instance-of v2, v1, Lcom/stripe/android/analytics/Session$Owner;

    if-eqz v2, :cond_0

    .line 71
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    .line 73
    sget-object v2, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;->setSessionId(Ljava/util/UUID;)V

    .line 75
    new-instance v2, Lcom/stripe/android/analytics/Session$Owner;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1}, Lcom/stripe/android/analytics/Session$Owner;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 77
    :cond_0
    instance-of p1, v1, Lcom/stripe/android/analytics/Session$Observer;

    if-eqz p1, :cond_1

    goto :goto_0

    .line 69
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method private final startSession(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 4

    .line 39
    const-string v0, "STRIPE_ANALYTICS_LOCAL_SESSION"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/analytics/Session;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 42
    instance-of p1, v1, Lcom/stripe/android/analytics/Session$Owner;

    if-eqz p1, :cond_0

    .line 43
    sget-object p1, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;

    check-cast v1, Lcom/stripe/android/analytics/Session$Owner;

    invoke-virtual {v1}, Lcom/stripe/android/analytics/Session$Owner;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;->setSessionId(Ljava/util/UUID;)V

    .line 44
    sput-boolean v2, Lcom/stripe/android/analytics/SessionSavedStateHandler;->sessionLocked:Z

    return-void

    .line 46
    :cond_0
    instance-of p1, v1, Lcom/stripe/android/analytics/Session$Observer;

    if-eqz p1, :cond_1

    return-void

    .line 41
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 49
    :cond_2
    move-object v1, p0

    check-cast v1, Lcom/stripe/android/analytics/SessionSavedStateHandler;

    .line 50
    sget-boolean v1, Lcom/stripe/android/analytics/SessionSavedStateHandler;->sessionLocked:Z

    if-nez v1, :cond_3

    .line 51
    sput-boolean v2, Lcom/stripe/android/analytics/SessionSavedStateHandler;->sessionLocked:Z

    .line 53
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    .line 55
    sget-object v2, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;->setSessionId(Ljava/util/UUID;)V

    .line 57
    new-instance v2, Lcom/stripe/android/analytics/Session$Owner;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1}, Lcom/stripe/android/analytics/Session$Owner;-><init>(Ljava/lang/String;)V

    check-cast v2, Lcom/stripe/android/analytics/Session;

    goto :goto_0

    .line 59
    :cond_3
    sget-object v1, Lcom/stripe/android/analytics/Session$Observer;->INSTANCE:Lcom/stripe/android/analytics/Session$Observer;

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/analytics/Session;

    .line 62
    :goto_0
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final attachTo(Landroidx/lifecycle/ViewModel;Landroidx/lifecycle/SavedStateHandle;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/ViewModel;",
            "Landroidx/lifecycle/SavedStateHandle;",
            ")",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p2}, Lcom/stripe/android/analytics/SessionSavedStateHandler;->startSession(Landroidx/lifecycle/SavedStateHandle;)V

    .line 29
    new-instance v0, Lcom/stripe/android/analytics/SessionSavedStateHandler$$ExternalSyntheticLambda0;

    invoke-direct {v0, p2}, Lcom/stripe/android/analytics/SessionSavedStateHandler$$ExternalSyntheticLambda0;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/ViewModel;->addCloseable(Ljava/lang/AutoCloseable;)V

    .line 33
    new-instance p1, Lcom/stripe/android/analytics/SessionSavedStateHandler$$ExternalSyntheticLambda1;

    invoke-direct {p1, p2}, Lcom/stripe/android/analytics/SessionSavedStateHandler$$ExternalSyntheticLambda1;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    return-object p1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 98
    sput-boolean v0, Lcom/stripe/android/analytics/SessionSavedStateHandler;->sessionLocked:Z

    return-void
.end method
