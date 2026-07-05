.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;
.super Ljava/lang/Object;
.source "FinancialConnectionsAnalyticsTracker.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0082@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "locale",
        "Ljava/util/Locale;",
        "context",
        "Landroid/content/Context;",
        "requestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/util/Locale;Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;)V",
        "requestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;",
        "track",
        "",
        "event",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;",
        "commonParams",
        "",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field public static final CLIENT_ID:Ljava/lang/String; = "mobile-clients-linked-accounts"

.field public static final Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;

.field public static final ORIGIN:Ljava/lang/String; = "stripe-linked-accounts-android"


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final locale:Ljava/util/Locale;

.field private final requestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

.field private final requestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/util/Locale;Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;)V
    .locals 8

    const-string v0, "getOrFetchSync"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestExecutor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 85
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    .line 86
    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->locale:Ljava/util/Locale;

    .line 88
    iput-object p5, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->requestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    .line 91
    new-instance v1, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v3, "mobile-clients-linked-accounts"

    const-string v4, "stripe-linked-accounts-android"

    const/4 v5, 0x0

    move-object v2, p4

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->requestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    return-void
.end method

.method public static final synthetic access$commonParams(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->commonParams(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRequestExecutor$p(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->requestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    return-object p0
.end method

.method public static final synthetic access$getRequestFactory$p(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->requestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    return-object p0
.end method

.method private final commonParams(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p1, v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 109
    iget v1, v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    const/4 v7, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v7, :cond_1

    iget-object v0, v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 110
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object p0, v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->L$0:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    const/16 v1, 0xc

    .line 112
    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "las_id"

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 113
    iget-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    const-string v3, "key"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v7

    .line 114
    iget-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "stripe_account"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 115
    iget-object v0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    const-string v2, "navigator_language"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    .line 116
    const-string v0, "is_webview"

    const-string v2, "false"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, v1, v2

    .line 117
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getLivemode()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "livemode"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x5

    aput-object v0, v1, v2

    .line 118
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getProduct()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v2, "product"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x6

    aput-object v0, v1, v2

    .line 119
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "is_stripe_direct"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x7

    aput-object v0, v1, v2

    .line 120
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "single_account"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8

    aput-object v0, v1, v2

    .line 121
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "allow_manual_entry"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9

    aput-object v0, v1, v2

    .line 122
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAppVerificationEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "app_verification_enabled"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa

    aput-object v0, v1, v2

    .line 123
    const-string v0, "account_holder_id"

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAccountholderToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 v0, 0xb

    aput-object p1, v1, v0

    .line 111
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
