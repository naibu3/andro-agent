.class final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AccountPickerViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts()V
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
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,458:1\n6#2,4:459\n1053#3:463\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1\n*L\n107#1:459,4\n123#1:463\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;"
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
    c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1"
    f = "AccountPickerViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x67,
        0x6c
    }
    m = "invokeSuspend"
    n = {
        "state",
        "sync",
        "dataAccessNotice",
        "manifest",
        "activeAuthSession",
        "startTime$iv"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
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

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 101
    iget v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-wide v1, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->J$0:J

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide v11, v1

    move-object/from16 v2, p1

    :goto_0
    move-object/from16 v17, v7

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    .line 103
    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v7

    move-object v10, v0

    check-cast v10, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x3

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_3

    goto :goto_3

    .line 101
    :cond_3
    :goto_1
    move-object v8, v6

    check-cast v8, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 104
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v6

    move-object v7, v6

    goto :goto_2

    :cond_4
    move-object v7, v3

    .line 105
    :goto_2
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v6

    .line 106
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v9

    if-eqz v9, :cond_d

    .line 107
    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    .line 459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 108
    invoke-static {v10}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getPollAuthorizationSessionAccounts$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    move-result-object v10

    .line 110
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getCanRetry()Z

    move-result v2

    .line 108
    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$3:Ljava/lang/Object;

    iput-wide v11, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->J$0:J

    iput v4, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    invoke-virtual {v10, v2, v8, v0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->invoke(ZLcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v4, v9

    goto :goto_0

    .line 111
    :goto_4
    check-cast v2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    .line 462
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v11

    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 107
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    .line 113
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 114
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v1

    .line 115
    new-instance v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAccountsSucceeded;

    .line 116
    invoke-static {}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v11

    .line 117
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v12

    .line 115
    invoke-direct {v7, v11, v12, v9, v10}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAccountsSucceeded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;J)V

    check-cast v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 114
    invoke-interface {v1, v7}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 123
    :cond_6
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 463
    new-instance v7, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1$invokeSuspend$$inlined$sortedBy$1;

    invoke-direct {v7}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1$invokeSuspend$$inlined$sortedBy$1;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v15

    .line 124
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getAccountPicker()Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AccountPickerPane;->getDataAccessNotice()Ljava/lang/String;

    move-result-object v3

    :cond_7
    move-object/from16 v16, v3

    .line 127
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v1, v15, v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$throwErrorIfNoSelectableAccounts(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    .line 134
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    :goto_5
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move v14, v1

    goto :goto_6

    .line 135
    :cond_8
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    move v14, v2

    .line 138
    :goto_6
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->Single:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    goto :goto_7

    :cond_a
    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->Multiple:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    :goto_7
    move-object/from16 v18, v1

    .line 141
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v19

    .line 142
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 143
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getInstitutionSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 144
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v5, :cond_b

    move/from16 v22, v5

    goto :goto_8

    :cond_b
    move/from16 v22, v2

    .line 145
    :goto_8
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getBusinessName()Ljava/lang/String;

    move-result-object v21

    .line 146
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_c
    move/from16 v20, v2

    .line 129
    new-instance v13, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    invoke-direct/range {v13 .. v22}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V

    .line 147
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    .line 148
    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;

    invoke-static {}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-object v13

    .line 106
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
