.class public final Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;
.super Ljava/lang/Object;
.source "RequestIntegrityToken.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0086B\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;",
        "",
        "integrityRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "analyticsTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "<init>",
        "(Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;)V",
        "invoke",
        "",
        "endpoint",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;)V
    .locals 1
    .annotation runtime Ljakarta/inject/Inject;
    .end annotation

    const-string v0, "integrityRequestManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsTracker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 15
    iget v2, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 18
    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken$invoke$1;->label:I

    const/4 v2, 0x0

    invoke-static {p3, v2, v0, v3, v2}, Lcom/stripe/attestation/IntegrityRequestManager$DefaultImpls;->requestToken-gIAlu-s$default(Lcom/stripe/attestation/IntegrityRequestManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 19
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    .line 20
    iget-object v1, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 21
    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestSucceeded;

    invoke-direct {v2, p2, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestSucceeded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 20
    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 27
    :cond_4
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 28
    iget-object v0, v0, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 29
    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestFailed;

    invoke-direct {v2, p2, p1, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestFailed;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Ljava/lang/Throwable;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 28
    invoke-interface {v0, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 36
    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p3
.end method
