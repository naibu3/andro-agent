.class final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LinkAccountPickerViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V
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
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n1611#2,9:539\n1863#2:548\n295#2,2:549\n1864#2:552\n1620#2:553\n295#2,2:554\n1#3:551\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1\n*L\n93#1:539,9\n93#1:548\n94#1:549,2\n93#1:552\n93#1:553\n103#1:554,2\n93#1:551\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;"
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
    c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$1"
    f = "LinkAccountPickerViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1
    }
    l = {
        0x54,
        0x57
    }
    m = "invokeSuspend"
    n = {
        "sync",
        "manifest",
        "consumerSession"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 83
    iget v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, "Required value was null."

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v3

    move-object/from16 v3, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getGetSync$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v6

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->label:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_1

    .line 83
    :cond_3
    :goto_0
    check-cast v2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 85
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v4

    .line 86
    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v6}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getConsumerSessionProvider$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    move-result-object v6

    invoke-interface {v6}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object v6

    if-eqz v6, :cond_12

    .line 87
    iget-object v7, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v7}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getFetchNetworkedAccounts$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;

    move-result-object v7

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->label:I

    invoke-virtual {v7, v8, v9}, Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move-object v1, v4

    move-object v4, v2

    move-object v2, v1

    move-object v1, v6

    .line 83
    :goto_2
    check-cast v3, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;

    .line 90
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->getDisplay()Lcom/stripe/android/financialconnections/model/Display;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/Display;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getReturningNetworkingUserAccountPicker()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v6

    goto :goto_3

    :cond_5
    move-object v6, v7

    :goto_3
    if-eqz v6, :cond_11

    .line 93
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAccounts()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    .line 539
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .line 548
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 547
    check-cast v10, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    .line 94
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->getData()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .line 549
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    .line 94
    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_5

    :cond_8
    move-object v12, v7

    :goto_5
    check-cast v12, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    if-eqz v12, :cond_9

    .line 96
    new-instance v11, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    invoke-direct {v11, v12, v10}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    goto :goto_6

    :cond_9
    move-object v11, v7

    :goto_6
    if-eqz v11, :cond_6

    .line 547
    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 553
    :cond_a
    move-object v14, v9

    check-cast v14, Ljava/util/List;

    .line 102
    move-object v8, v14

    check-cast v8, Ljava/lang/Iterable;

    .line 554
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 104
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getDisplay()Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    move-result-object v11

    invoke-virtual {v11}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;->getAllowSelection()Z

    move-result v11

    if-eqz v11, :cond_b

    .line 105
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getDisplay()Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;->getDrawerOnSelection()LFinancialConnectionsGenericInfoScreen;

    move-result-object v10

    if-nez v10, :cond_b

    goto :goto_7

    :cond_c
    move-object v9, v7

    .line 103
    :goto_7
    check-cast v9, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    if-eqz v9, :cond_d

    .line 107
    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v8

    if-eqz v8, :cond_d

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_8

    :cond_d
    move-object v8, v7

    .line 101
    :goto_8
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    .line 110
    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v8}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;

    sget-object v10, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v8, v9}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 112
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->getPartnerToCoreAuths()Ljava/util/Map;

    move-result-object v20

    .line 114
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAboveCta()Ljava/lang/String;

    move-result-object v23

    .line 115
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v7

    :cond_e
    move-object/from16 v24, v7

    .line 116
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->getNextPaneOnAddAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v19

    .line 117
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getMultipleAccountTypesSelectedDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v22

    .line 118
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;

    move-result-object v16

    if-eqz v16, :cond_10

    .line 119
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getTitle()Ljava/lang/String;

    move-result-object v13

    .line 120
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getDefaultCta()Ljava/lang/String;

    move-result-object v18

    .line 121
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v17

    .line 122
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v21

    .line 123
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->getAcquireConsentOnPrimaryCtaClick()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_9

    :cond_f
    const/4 v1, 0x0

    :goto_9
    move/from16 v25, v1

    .line 111
    new-instance v12, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    invoke-direct/range {v12 .. v25}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V

    return-object v12

    .line 118
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 88
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 86
    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
