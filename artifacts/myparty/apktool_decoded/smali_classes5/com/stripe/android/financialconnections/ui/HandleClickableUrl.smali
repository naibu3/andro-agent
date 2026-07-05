.class public final Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
.super Ljava/lang/Object;
.source "HandleClickableUrl.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;,
        Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;,
        Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$InternalLink;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandleClickableUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandleClickableUrl.kt\ncom/stripe/android/financialconnections/ui/HandleClickableUrl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n295#2,2:61\n1#3:63\n*S KotlinDebug\n*F\n+ 1 HandleClickableUrl.kt\ncom/stripe/android/financialconnections/ui/HandleClickableUrl\n*L\n29#1:61,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJb\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u00112.\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u000f\u0012 \u0012\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00140\u0013H\u0086B\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
        "",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;)V",
        "invoke",
        "",
        "currentPane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "uri",
        "",
        "onNetworkUrlClicked",
        "Lkotlin/Function1;",
        "knownDeeplinkActions",
        "",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;",
        "Lkotlin/coroutines/Continuation;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildPayload",
        "internalLinkToPaneId",
        "DeeplinkPayload",
        "ClickableLinkParameters",
        "InternalLink",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final internalLinkToPaneId:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "uriUtils"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 14
    iput-object p3, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->logger:Lcom/stripe/android/core/Logger;

    .line 44
    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->getValue()Ljava/lang/String;

    move-result-object p1

    const-string p2, "manual-entry"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 43
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->internalLinkToPaneId:Ljava/util/Map;

    return-void
.end method

.method private final buildPayload(Ljava/lang/String;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    .line 39
    const-string v1, "nextPaneOrDrawerOnSecondaryCta"

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/financialconnections/utils/UriUtils;->getQueryParameter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 40
    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->internalLinkToPaneId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    new-instance v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;-><init>(Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p5, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 17
    iget v2, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    iget-object p5, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    const-string v2, "eventName"

    invoke-virtual {p5, p2, v2}, Lcom/stripe/android/financialconnections/utils/UriUtils;->getQueryParameter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    if-eqz p5, :cond_3

    .line 24
    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;

    invoke-direct {v4, p5, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v2, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 27
    :cond_3
    invoke-static {p2}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 29
    :cond_4
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object p5, p3

    check-cast p5, Ljava/util/Map$Entry;

    .line 29
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    .line 30
    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    invoke-virtual {v2, p5, p2}, Lcom/stripe/android/financialconnections/utils/UriUtils;->compareSchemeAuthorityAndPath(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_5

    goto :goto_1

    :cond_6
    move-object p3, p4

    .line 29
    :goto_1
    check-cast p3, Ljava/util/Map$Entry;

    if-eqz p3, :cond_7

    .line 32
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    if-eqz p1, :cond_7

    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->buildPayload(Ljava/lang/String;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;

    move-result-object p3

    iput-object p0, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$invoke$1;->label:I

    invoke-interface {p1, p3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_7
    iget-object p1, p0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->logger:Lcom/stripe/android/core/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p5, "Unrecognized clickable text: "

    invoke-direct {p3, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    invoke-static {p1, p2, p4, p3, p4}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 35
    :cond_8
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
