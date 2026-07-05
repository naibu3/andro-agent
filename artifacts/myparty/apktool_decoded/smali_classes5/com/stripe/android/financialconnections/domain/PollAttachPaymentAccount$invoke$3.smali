.class final Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PollAttachPaymentAccount.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->invoke(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$3"
    f = "PollAttachPaymentAccount.kt"
    i = {}
    l = {
        0x29
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field final synthetic $params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

.field final synthetic $sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
            "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;-><init>(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 39
    iget v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    :try_start_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    move-result-object p1

    .line 42
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v1

    .line 43
    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    .line 45
    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    invoke-static {v4}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$getConsumerSessionProvider$p(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    move-result-object v4

    invoke-interface {v4}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    .line 41
    iput v2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->label:I

    invoke-interface {p1, v1, v3, v4, v5}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->postAttachPaymentAccountToLinkAccountSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 46
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    .line 47
    invoke-static {v0}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$getAttachedPaymentAccountRepository$p(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;)Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;->set(Lcom/stripe/android/financialconnections/model/PaymentAccountParams;)V

    .line 46
    check-cast p1, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    .line 50
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    .line 51
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    .line 52
    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->showManualEntryInErrors(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z

    move-result v2

    .line 50
    invoke-static {v0, p1, v1, v2}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$toDomainException(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method
