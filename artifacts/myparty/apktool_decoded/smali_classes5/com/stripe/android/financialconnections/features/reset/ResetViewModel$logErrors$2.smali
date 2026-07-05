.class final Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ResetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->logErrors()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Throwable;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "error",
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
    c = "com.stripe.android.financialconnections.features.reset.ResetViewModel$logErrors$2"
    f = "ResetViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->invoke(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 58
    iget v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    .line 59
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->access$getLogger$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v1

    .line 63
    sget-object v2, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->Companion:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    .line 59
    const-string v3, "Error linking more accounts"

    invoke-static {v0, v3, p1, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
