.class final Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter$1$1;
.super Ljava/lang/Object;
.source "EmbeddedConfirmationStarter.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 23
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    if-nez v0, :cond_3

    .line 24
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    if-eqz v0, :cond_2

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;->access$get_result$p(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;)Lkotlinx/coroutines/channels/Channel;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;->getResult()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/channels/Channel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 22
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 29
    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter$1$1;->emit(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
