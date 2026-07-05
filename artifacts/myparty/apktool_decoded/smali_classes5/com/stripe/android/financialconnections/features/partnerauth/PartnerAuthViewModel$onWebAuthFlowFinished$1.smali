.class final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PartnerAuthViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onWebAuthFlowFinished(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1"
    f = "PartnerAuthViewModel.kt"
    i = {}
    l = {
        0x112,
        0x116,
        0x122
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;


# direct methods
.method public static synthetic $r8$lambda$RYOatM5nzY9uuBRB7OBJEVIOUzM(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->invokeSuspend$lambda$0(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->$webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 11

    .line 284
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;

    sget-object v2, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;->AUTHENTICATING:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v9, 0x17

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    .line 283
    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->$webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;-><init>(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 271
    iget v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 272
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->$webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    .line 273
    instance-of v1, p1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;

    if-eqz v1, :cond_3

    .line 274
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;->getUrl()Ljava/lang/String;

    move-result-object p1

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->label:I

    invoke-static {v1, p1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->access$onAuthCancelled(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_1

    .line 277
    :cond_3
    instance-of v1, p1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;

    if-eqz v1, :cond_4

    .line 278
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;->getUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->$webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;->getMessage()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->$webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;->getReason()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->label:I

    invoke-static {v1, p1, v2, v4, v5}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->access$onAuthFailed(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_1

    .line 281
    :cond_4
    sget-object v1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$InProgress;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$InProgress;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 282
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 289
    :cond_5
    instance-of v1, p1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;

    if-eqz v1, :cond_6

    .line 290
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->this$0:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->$webStatus:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;->getUrl()Ljava/lang/String;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;->label:I

    invoke-static {p1, v1, v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->access$completeAuthorizationSession(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_1
    return-object v0

    .line 293
    :cond_6
    sget-object v0, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Uninitialized;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 295
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 272
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
