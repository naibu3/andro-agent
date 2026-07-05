.class final Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "IDConsentContentViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->onContinueClick()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onContinueClick$1"
    f = "IDConsentContentViewModel.kt"
    i = {}
    l = {
        0x3f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->this$0:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->this$0:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 61
    iget v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->this$0:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object p1

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;->INSTANCE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {p1, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 63
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->this$0:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->access$getAcceptConsent$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->label:I

    invoke-virtual {p1, v1}, Lcom/stripe/android/financialconnections/domain/AcceptConsent;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 61
    :cond_2
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 64
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->CONSENT_ACQUIRED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;->this$0:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object v0

    invoke-static {}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-object p1
.end method
