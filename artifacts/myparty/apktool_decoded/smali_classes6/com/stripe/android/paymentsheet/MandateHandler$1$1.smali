.class final Lcom/stripe/android/paymentsheet/MandateHandler$1$1;
.super Ljava/lang/Object;
.source "MandateHandler.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/MandateHandler$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/MandateHandler;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/MandateHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/MandateHandler$1$1;->this$0:Lcom/stripe/android/paymentsheet/MandateHandler;

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

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 29
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/MandateHandler$1$1;->this$0:Lcom/stripe/android/paymentsheet/MandateHandler;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/MandateHandler;->access$getMerchantDisplayName$p(Lcom/stripe/android/paymentsheet/MandateHandler;)Ljava/lang/String;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/MandateHandler$1$1;->this$0:Lcom/stripe/android/paymentsheet/MandateHandler;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/MandateHandler;->access$isSetupFlowProvider$p(Lcom/stripe/android/paymentsheet/MandateHandler;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 28
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->mandateText(Ljava/lang/String;Z)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    .line 33
    :goto_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v1, :cond_1

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    :cond_1
    const/4 p1, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getShowMandateAbovePrimaryButton()Z

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    move p1, v1

    .line 34
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/MandateHandler$1$1;->this$0:Lcom/stripe/android/paymentsheet/MandateHandler;

    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/paymentsheet/MandateHandler;->updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V

    .line 35
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/MandateHandler$1$1;->emit(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
