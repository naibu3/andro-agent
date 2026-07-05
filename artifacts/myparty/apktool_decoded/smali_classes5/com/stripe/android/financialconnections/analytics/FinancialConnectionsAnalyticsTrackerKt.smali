.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsAnalyticsTracker.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "logError",
        "",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "extraMessage",
        "",
        "error",
        "",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "emitPublicClientErrorEventIfNeeded",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final emitPublicClientErrorEventIfNeeded(Ljava/lang/Throwable;)V
    .locals 7

    .line 56
    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 57
    invoke-virtual {v0}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 58
    const-string v1, "events_to_emit"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 59
    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    return-void

    .line 65
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/financialconnections/exception/AppInitializationError;

    if-eqz p0, :cond_2

    sget-object p0, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    .line 66
    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 67
    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    .line 68
    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->WEB_BROWSER_UNAVAILABLE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 67
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;

    return-void

    .line 73
    :cond_2
    sget-object p0, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    .line 74
    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 75
    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    .line 76
    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 75
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;

    return-void
.end method

.method public static final logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pane"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;

    invoke-direct {v0, p4, p2, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 35
    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 43
    invoke-interface {p3, p1, p2}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    invoke-static {p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->emitPublicClientErrorEventIfNeeded(Ljava/lang/Throwable;)V

    return-void
.end method
