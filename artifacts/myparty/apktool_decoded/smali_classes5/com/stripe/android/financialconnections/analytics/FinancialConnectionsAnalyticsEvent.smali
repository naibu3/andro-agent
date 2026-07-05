.class public abstract Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;
.super Ljava/lang/Object;
.source "FinancialConnectionsAnalyticsEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountSelected;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsAutoSelected;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsSubmitted;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AppBackgrounded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitFailed;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitSkipped;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestFailed;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionOpened;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionRetrieved;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickDone;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLinkAccounts;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarBack;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarClose;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Complete;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Exposure;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$FeaturedInstitutionsLoaded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$InstitutionSelected;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingNewConsumer;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingReturningConsumer;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLaunched;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAccountsSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAttachPaymentsSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickCancel;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickChooseAnotherBank;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickContinue;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchScroll;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchSucceeded;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpSuccess;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationSuccess;,
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\'\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:;<=>B3\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u0013\u001a\u00020\u0003H\u0016J\u0013\u0010\u0014\u001a\u00020\u00072\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0003*\u00020\u00108@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0001&?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcd\u00a8\u0006e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;",
        "",
        "name",
        "",
        "params",
        "",
        "includePrefix",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Map;Z)V",
        "getParams",
        "()Ljava/util/Map;",
        "eventName",
        "getEventName",
        "()Ljava/lang/String;",
        "analyticsValue",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getAnalyticsValue$financial_connections_release",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Ljava/lang/String;",
        "toString",
        "equals",
        "other",
        "hashCode",
        "",
        "PaneLaunched",
        "AppBackgrounded",
        "PaneLoaded",
        "ClickNavBarBack",
        "ClickNavBarClose",
        "Complete",
        "ClickLearnMoreDataAccess",
        "Click",
        "FeaturedInstitutionsLoaded",
        "SearchScroll",
        "InstitutionSelected",
        "SearchSucceeded",
        "PollAccountsSucceeded",
        "AccountSelected",
        "AccountsSubmitted",
        "AccountsAutoSelected",
        "PollAttachPaymentsSucceeded",
        "ClickLinkAccounts",
        "NetworkingNewConsumer",
        "NetworkingReturningConsumer",
        "VerificationSuccess",
        "VerificationError",
        "VerificationStepUpSuccess",
        "VerificationStepUpError",
        "ClickDone",
        "Error",
        "Exposure",
        "AuthSessionUrlReceived",
        "AuthSessionRetrieved",
        "ConsentAgree",
        "PrepaneClickContinue",
        "PrepaneClickCancel",
        "PrepaneClickChooseAnotherBank",
        "AuthSessionOpened",
        "AttestationInitSkipped",
        "AttestationInitFailed",
        "AttestationRequestSucceeded",
        "AttestationRequestFailed",
        "AttestationEndpoint",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountSelected;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsAutoSelected;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsSubmitted;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AppBackgrounded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitFailed;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitSkipped;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestFailed;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestSucceeded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionOpened;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionRetrieved;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickDone;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLinkAccounts;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarBack;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarClose;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Complete;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Exposure;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$FeaturedInstitutionsLoaded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$InstitutionSelected;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingNewConsumer;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingReturningConsumer;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLaunched;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAccountsSucceeded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAttachPaymentsSucceeded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickCancel;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickChooseAnotherBank;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickContinue;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchScroll;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchSucceeded;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpSuccess;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationSuccess;",
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
.field private final eventName:Ljava/lang/String;

.field private final includePrefix:Z

.field private final name:Ljava/lang/String;

.field private final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->name:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->params:Ljava/util/Map;

    .line 17
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->includePrefix:Z

    if-eqz p3, :cond_0

    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "linked_accounts."

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->eventName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x1

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Ljava/lang/String;Ljava/util/Map;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 484
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 486
    :cond_2
    const-string v1, "null cannot be cast to non-null type com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 488
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 489
    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->params:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->params:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    .line 490
    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->includePrefix:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->includePrefix:Z

    if-eq v1, v3, :cond_5

    return v2

    .line 491
    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->eventName:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->eventName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnalyticsValue$financial_connections_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 475
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 474
    :cond_0
    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getEventName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->params:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 497
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 498
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->params:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 499
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->includePrefix:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 500
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->eventName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 479
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->params:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FinancialConnectionsEvent(name=\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\', params="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
