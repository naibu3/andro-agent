.class final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LinkAccountPickerViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->onSelectAccountsClick()V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n1557#2:539\n1628#2,3:540\n1611#2,9:543\n1863#2:552\n1864#2:554\n1620#2:555\n1557#2:556\n1628#2,3:557\n1#3:553\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1\n*L\n218#1:539\n218#1:540,3\n220#1:543,9\n220#1:552\n220#1:554\n220#1:555\n244#1:556\n244#1:557,3\n220#1:553\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
    c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onSelectAccountsClick$1"
    f = "LinkAccountPickerViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1
    }
    l = {
        0xdd,
        0xec,
        0x101,
        0x107
    }
    m = "invokeSuspend"
    n = {
        "payload",
        "accounts",
        "selectedAccountDrawers",
        "selectedAccountDrawers"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0"
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
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 215
    iget v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->label:I

    const/16 v2, 0xa

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 216
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    .line 217
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_10

    move-object v8, p1

    check-cast v8, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    .line 218
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccounts()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 539
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 540
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 541
    check-cast v7, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 218
    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v7

    .line 541
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 542
    :cond_5
    move-object v7, v1

    check-cast v7, Ljava/util/List;

    .line 219
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccounts()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 220
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    .line 543
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .line 552
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 551
    check-cast v10, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 220
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v10

    invoke-static {v1, v10, v8}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$computeDrawerPayload(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    move-result-object v10

    if-eqz v10, :cond_6

    .line 551
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 555
    :cond_7
    check-cast v9, Ljava/util/List;

    .line 221
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getUpdateCachedAccounts$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput-object v8, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$0:Ljava/lang/Object;

    iput-object v7, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$1:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$2:Ljava/lang/Object;

    iput v6, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->label:I

    invoke-virtual {p1, v7, v1}, Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;->invoke(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto/16 :goto_7

    :cond_8
    move-object v1, v9

    .line 225
    :goto_3
    move-object p1, v1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    const/4 v9, 0x0

    if-nez p1, :cond_b

    .line 228
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v6, :cond_9

    .line 229
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object p1

    .line 231
    new-instance v2, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;

    const-string v3, "MultipleAccountsSelectedError"

    invoke-direct {v2, v3, v9, v5, v9}, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 232
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getLogger$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v3

    .line 233
    sget-object v4, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v4

    .line 229
    const-string v6, "Multiple accounts with drawers on selection"

    invoke-static {p1, v6, v2, v3, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 236
    :cond_9
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getAcceptConsent$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    move-result-object p1

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$1:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$2:Ljava/lang/Object;

    iput v5, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->label:I

    invoke-virtual {p1, v2}, Lcom/stripe/android/financialconnections/domain/AcceptConsent;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto/16 :goto_7

    :cond_a
    move-object v0, v1

    .line 237
    :goto_4
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$present(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V

    goto/16 :goto_8

    .line 243
    :cond_b
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getNextPaneOnSelection()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    goto :goto_5

    :cond_c
    move-object p1, v9

    .line 244
    :goto_5
    check-cast v7, Ljava/lang/Iterable;

    .line 556
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 557
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 558
    check-cast v5, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    .line 244
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v5

    .line 558
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 559
    :cond_d
    check-cast v1, Ljava/util/List;

    .line 556
    check-cast v1, Ljava/lang/Iterable;

    .line 244
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    .line 246
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v2

    .line 250
    sget-object v5, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v5

    .line 247
    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsSubmitted;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v1, v7}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsSubmitted;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Set;Z)V

    check-cast v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 246
    invoke-interface {v2, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 254
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v2

    new-instance v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;

    sget-object v6, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v6

    const-string v7, "click.link_accounts"

    invoke-direct {v5, v7, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v2, v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 256
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-ne p1, v2, :cond_e

    .line 257
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    .line 258
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getAcquireConsentOnPrimaryCtaClick()Z

    move-result v2

    .line 259
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getConsumerSessionClientSecret()Ljava/lang/String;

    move-result-object v3

    .line 260
    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    .line 257
    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$1:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$2:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->label:I

    invoke-static {p1, v2, v3, v1, v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$selectAccounts(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    goto :goto_7

    .line 263
    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->this$0:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$1:Ljava/lang/Object;

    iput-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;->label:I

    invoke-static {v1, v8, p1, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->access$handleNonSuccessNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    :goto_7
    return-object v0

    .line 267
    :cond_f
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 217
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
