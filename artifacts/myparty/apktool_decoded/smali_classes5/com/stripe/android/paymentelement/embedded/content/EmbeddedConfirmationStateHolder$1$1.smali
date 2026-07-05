.class final Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$1$1;
.super Ljava/lang/Object;
.source "EmbeddedConfirmationStateHolder.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 36
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getState()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->copy$default(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->setState(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)V

    .line 37
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 35
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$1$1;->emit(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
