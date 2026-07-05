.class public final Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;
.super Ljava/lang/Object;
.source "DefaultFinancialConnectionsEventReporter.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;,
        Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B#\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V",
        "onPresented",
        "",
        "onResult",
        "sessionId",
        "",
        "financialConnectionsSheetResult",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "fireEvent",
        "event",
        "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;",
        "Event",
        "Companion",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;

.field public static final PARAM_SESSION_ID:Ljava/lang/String; = "las_id"

.field public static final PARAM_SESSION_RESULT:Ljava/lang/String; = "session_result"


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->Companion:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    .line 17
    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsRequestFactory$p(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    return-object p0
.end method

.method private final fireEvent(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;)V
    .locals 7

    .line 65
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public onPresented()V
    .locals 4

    .line 21
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;->SheetPresented:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->fireEvent(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;)V

    return-void
.end method

.method public onResult(Ljava/lang/String;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 7

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsSheetResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    instance-of v0, p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const-string v1, "session_result"

    const/4 v2, 0x1

    const-string v3, "las_id"

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v0, :cond_0

    .line 30
    new-instance p2, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    .line 31
    sget-object v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;->SheetClosed:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    .line 33
    new-array v5, v5, [Lkotlin/Pair;

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v4

    .line 34
    const-string p1, "completed"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v2

    .line 32
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 30
    invoke-direct {p2, v0, p1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V

    goto :goto_0

    .line 38
    :cond_0
    instance-of v0, p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;

    if-eqz v0, :cond_1

    .line 39
    new-instance p2, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    .line 40
    sget-object v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;->SheetClosed:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    .line 42
    new-array v5, v5, [Lkotlin/Pair;

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v4

    .line 43
    const-string p1, "cancelled"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v2

    .line 41
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 39
    invoke-direct {p2, v0, p1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V

    goto :goto_0

    .line 47
    :cond_1
    instance-of v0, p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    if-eqz v0, :cond_2

    .line 48
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    .line 49
    sget-object v6, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;->SheetFailed:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    .line 51
    new-array v5, v5, [Lkotlin/Pair;

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v4

    .line 52
    const-string p1, "failure"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v2

    .line 50
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 54
    check-cast p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p2

    const/4 v1, 0x0

    .line 55
    invoke-static {p2, v1}, Lcom/stripe/android/financialconnections/analytics/AnalyticsMappersKt;->toEventParams(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    .line 56
    invoke-static {p2}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    .line 53
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 48
    invoke-direct {v0, v6, p1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V

    move-object p2, v0

    .line 61
    :goto_0
    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->fireEvent(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;)V

    return-void

    .line 28
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
