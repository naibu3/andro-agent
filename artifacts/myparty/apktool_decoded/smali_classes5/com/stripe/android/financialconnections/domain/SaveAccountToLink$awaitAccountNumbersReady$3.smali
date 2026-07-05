.class final Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SaveAccountToLink.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->awaitAccountNumbersReady(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$3"
    f = "SaveAccountToLink.kt"
    i = {}
    l = {
        0x6f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $linkedAccountIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Ljava/util/Set;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->$linkedAccountIds:Ljava/util/Set;

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

    new-instance v0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->$linkedAccountIds:Ljava/util/Set;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;-><init>(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Ljava/util/Set;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 111
    iget v1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->label:I

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

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->access$getAccountsRepository$p(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->$linkedAccountIds:Ljava/util/Set;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$awaitAccountNumbersReady$3;->label:I

    invoke-interface {p1, v1, v3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->pollAccountNumbers(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
