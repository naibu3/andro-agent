.class final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1$1;
.super Ljava/lang/Object;
.source "EmbeddedConfirmationHelper.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 37
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;

    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->access$getEventReporter$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->access$getConfirmationStateHolder$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getState()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p2, p1, v0}, Lcom/stripe/android/paymentsheet/utils/ConfirmationReportingUtilsKt;->reportPaymentResult(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 38
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;

    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->access$getEmbeddedResultCallbackHelper$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

    move-result-object p2

    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelperKt;->access$asEmbeddedResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;->setResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    .line 39
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 36
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1$1;->emit(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
