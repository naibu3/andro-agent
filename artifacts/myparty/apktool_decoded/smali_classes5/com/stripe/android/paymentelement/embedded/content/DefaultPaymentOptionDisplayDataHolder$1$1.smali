.class final Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;
.super Ljava/lang/Object;
.source "PaymentOptionDisplayDataHolder.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 31
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;

    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->access$getConfirmationStateSupplier$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lkotlin/jvm/functions/Function0;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    if-nez p2, :cond_0

    .line 33
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->access$get_paymentOption$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->access$get_paymentOption$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;

    invoke-static {v1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->access$getPaymentOptionDisplayDataFactory$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;

    move-result-object v1

    .line 37
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object p2

    .line 35
    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;->create(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 40
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 30
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1$1;->emit(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
