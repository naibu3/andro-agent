.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ManualEntryViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->onSubmit()V
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
    c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$onSubmit$1"
    f = "ManualEntryViewModel.kt"
    i = {
        0x1,
        0x2,
        0x2
    }
    l = {
        0x90,
        0x91,
        0x99
    }
    m = "invokeSuspend"
    n = {
        "sync",
        "sync",
        "it"
    }
    s = {
        "L$0",
        "L$0",
        "L$3"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 143
    iget v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$1:Ljava/lang/Object;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 144
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v6

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    .line 143
    :cond_4
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 145
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    move-result-object v1

    .line 148
    new-instance v3, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;

    .line 149
    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getRouting()Ljava/lang/String;

    move-result-object v6

    .line 150
    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getAccount()Ljava/lang/String;

    move-result-object v7

    .line 148
    invoke-direct {v3, v6, v7}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    .line 145
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    invoke-virtual {v1, p1, v5, v3, v6}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->invoke(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v3, p1

    move-object p1, v1

    .line 152
    :goto_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    move-object v6, p1

    check-cast v6, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    .line 153
    iput-object v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$3:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    invoke-static {v1, p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$clearCachedAccounts(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v2, p1

    move-object v0, v6

    .line 154
    :goto_3
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getManualEntryUsesMicrodeposits()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 155
    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getSuccessContentRepository$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    move-result-object p1

    .line 156
    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    .line 157
    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_title_microdeposits:I

    .line 156
    invoke-direct {v3, v6, v5, v4, v5}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 159
    new-instance v6, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    .line 160
    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_microdeposits:I

    .line 161
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getAccount()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x4

    invoke-static {v8, v9}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 159
    invoke-direct {v6, v7, v8}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;)V

    check-cast v6, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 156
    check-cast v3, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 155
    invoke-virtual {p1, v6, v3}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;->set(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V

    .line 165
    :cond_7
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    if-nez p1, :cond_8

    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY_SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    :cond_8
    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    invoke-static {p1, v0, v5, v4, v5}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 166
    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v6

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-object v2
.end method
