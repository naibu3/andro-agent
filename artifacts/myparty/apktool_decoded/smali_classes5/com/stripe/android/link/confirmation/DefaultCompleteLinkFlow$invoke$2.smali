.class final Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CompleteLinkFlow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->invoke(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/link/confirmation/Result;",
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
        "Lcom/stripe/android/link/confirmation/Result;"
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
    c = "com.stripe.android.link.confirmation.DefaultCompleteLinkFlow$invoke$2"
    f = "CompleteLinkFlow.kt"
    i = {}
    l = {
        0x44,
        0x4a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field final synthetic $selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    iput-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    iput-object p3, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;

    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v2, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    iget-object v3, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;-><init>(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/link/confirmation/Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 66
    iget v1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    .line 68
    instance-of v1, p1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    invoke-static {p1}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->access$getLinkConfirmationHandler$p(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    move-result-object v4

    .line 69
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v5

    .line 70
    iget-object v6, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 71
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getCollectedCvc()Ljava/lang/String;

    move-result-object v7

    .line 72
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object v8

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    .line 68
    iput v3, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->label:I

    invoke-interface/range {v4 .. v9}, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;->confirm(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/stripe/android/link/confirmation/Result;

    return-object p1

    .line 74
    :cond_4
    instance-of p1, p1, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    invoke-static {p1}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->access$getLinkConfirmationHandler$p(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    move-result-object v3

    .line 75
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;->getLinkPaymentDetails()Lcom/stripe/android/link/LinkPaymentDetails;

    move-result-object v4

    .line 76
    iget-object v5, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 77
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;->getCollectedCvc()Ljava/lang/String;

    move-result-object v6

    .line 78
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->$selectedPaymentDetails:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    .line 74
    iput v2, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;->label:I

    invoke-interface/range {v3 .. v8}, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;->confirm(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lcom/stripe/android/link/confirmation/Result;

    return-object p1

    .line 67
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
