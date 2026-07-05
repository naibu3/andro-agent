.class final Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ExitViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;-><init>(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V
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
        "Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExitViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExitViewModel.kt\ncom/stripe/android/financialconnections/features/exit/ExitViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;"
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
    c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$1"
    f = "ExitViewModel.kt"
    i = {}
    l = {
        0x2a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 41
    iget v1, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v6, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;

    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v3

    iput v2, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v6, p0

    :try_start_2
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v6, p0

    :goto_1
    move-object p1, v0

    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    move-object p1, v1

    :cond_3
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    if-eqz p1, :cond_4

    .line 43
    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->getBusinessName(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    const/4 v3, 0x0

    if-eqz p1, :cond_5

    .line 45
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_5

    :cond_5
    move p1, v3

    :goto_5
    if-eqz p1, :cond_6

    iget-object p1, v6, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/exit/ExitState;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/exit/ExitState;->getReferrer()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-ne p1, v4, :cond_6

    goto :goto_6

    :cond_6
    move v2, v3

    :goto_6
    const/4 p1, 0x2

    if-eqz v2, :cond_8

    if-nez v0, :cond_7

    .line 48
    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_close_dialog_networking_desc_no_business:I

    invoke-direct {v0, v2, v1, p1, v1}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    .line 49
    :cond_7
    new-instance p1, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    .line 50
    sget v1, Lcom/stripe/android/financialconnections/R$string;->stripe_close_dialog_networking_desc:I

    .line 51
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 49
    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;)V

    goto :goto_7

    :cond_8
    if-nez v0, :cond_9

    .line 56
    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_exit_modal_desc_no_business:I

    invoke-direct {v0, v2, v1, p1, v1}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    .line 57
    :cond_9
    new-instance p1, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    .line 58
    sget v1, Lcom/stripe/android/financialconnections/R$string;->stripe_exit_modal_desc:I

    .line 59
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 57
    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;)V

    :goto_7
    move-object v0, p1

    .line 63
    :goto_8
    new-instance p1, Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;

    .line 64
    check-cast v0, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 63
    invoke-direct {p1, v0}, Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;)V

    return-object p1
.end method
