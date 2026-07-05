.class final Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PollAuthorizationSessionOAuthResults.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;",
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
        "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;"
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
    c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$3"
    f = "PollAuthorizationSessionOAuthResults.kt"
    i = {}
    l = {
        0x22
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $session:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->$session:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->$session:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;-><init>(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 33
    iget v1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    move-result-object p1

    .line 35
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v1

    .line 36
    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->$session:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    .line 34
    iput v2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;->label:I

    invoke-interface {p1, v1, v3, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->postAuthorizationSessionOAuthResults(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
