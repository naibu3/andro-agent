.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;
.super Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;
.source "FinancialConnectionsAnalyticsEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Error"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "exception",
        "",
        "extraMessage",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;)V",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 8

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "exception"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    instance-of v1, p2, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;

    if-nez v1, :cond_1

    .line 337
    instance-of v1, p2, Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;

    if-nez v1, :cond_1

    .line 338
    instance-of v1, p2, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 340
    :cond_0
    const-string v1, "error.unexpected"

    goto :goto_1

    .line 338
    :cond_1
    :goto_0
    const-string v1, "error.expected"

    :goto_1
    move-object v3, v1

    .line 343
    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;->INSTANCE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;

    invoke-virtual {v1, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;->getAnalyticsValue$financial_connections_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 344
    invoke-static {p2, p3}, Lcom/stripe/android/financialconnections/analytics/AnalyticsMappersKt;->toEventParams(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 345
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    .line 334
    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 330
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
