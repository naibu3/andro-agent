.class final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AttachPaymentViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;)V
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
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAttachPaymentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachPaymentViewModel.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n*L\n1#1,150:1\n6#2,4:151\n*S KotlinDebug\n*F\n+ 1 AttachPaymentViewModel.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1\n*L\n60#1:151,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"
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
    c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1"
    f = "AttachPaymentViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x36,
        0x3a,
        0x3d
    }
    m = "invokeSuspend"
    n = {
        "sync",
        "manifest",
        "authSession",
        "activeInstitution",
        "manifest",
        "authSession",
        "accounts",
        "startTime$iv"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "J$0"
    }
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 53
    iget v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, "Required value was null."

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-wide v1, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->J$0:J

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide v14, v1

    move/from16 v16, v6

    move-object/from16 v2, p1

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v11, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v8

    move-object v11, v0

    check-cast v11, Lkotlin/coroutines/Continuation;

    iput v6, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->label:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x3

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    .line 53
    :cond_4
    :goto_0
    move-object v10, v2

    check-cast v10, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 55
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 56
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v8

    if-eqz v8, :cond_b

    .line 57
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v9

    if-eqz v9, :cond_a

    .line 58
    iget-object v11, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v11}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getGetCachedAccounts$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    move-result-object v11

    move-object v12, v0

    check-cast v12, Lkotlin/coroutines/Continuation;

    iput-object v10, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->label:I

    invoke-virtual {v11, v12}, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v17, v9

    move-object v9, v2

    move-object/from16 v2, v17

    .line 53
    :goto_1
    check-cast v11, Ljava/util/List;

    .line 59
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->single(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;

    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;->getLinkedAccountId()Ljava/lang/String;

    move-result-object v12

    .line 60
    iget-object v13, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 61
    invoke-static {v13}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    move-result-object v13

    move/from16 v16, v6

    .line 64
    new-instance v6, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;

    if-eqz v12, :cond_9

    invoke-direct {v6, v12}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;-><init>(Ljava/lang/String;)V

    check-cast v6, Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    .line 61
    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->L$3:Ljava/lang/Object;

    iput-wide v14, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->J$0:J

    iput v3, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->label:I

    invoke-virtual {v13, v10, v2, v6, v0}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->invoke(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v7, v8

    move-object v8, v9

    move-object v3, v11

    .line 53
    :goto_3
    check-cast v2, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    .line 154
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v14

    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    .line 67
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->getNetworkingSuccessful()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 68
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v1, v8, v3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$setSuccessMessageIfNecessary(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/util/List;)V

    .line 70
    :cond_7
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v1

    .line 71
    new-instance v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAttachPaymentsSucceeded;

    .line 72
    invoke-static {}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v6

    .line 73
    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v7

    .line 71
    invoke-direct {v3, v6, v7, v9, v10}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAttachPaymentsSucceeded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;J)V

    check-cast v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 70
    invoke-interface {v1, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 77
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    if-nez v1, :cond_8

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 78
    :cond_8
    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v6

    invoke-static {v1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object v1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    invoke-static {v1, v3, v4, v5, v4}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-object v2

    .line 64
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 57
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 56
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 55
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
