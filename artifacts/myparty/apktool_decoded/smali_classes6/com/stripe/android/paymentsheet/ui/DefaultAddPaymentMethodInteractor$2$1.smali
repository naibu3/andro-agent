.class final Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;
.super Ljava/lang/Object;
.source "AddPaymentMethodInteractor.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 143
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 144
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->access$getCreateFormArguments$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    .line 145
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->access$getFormElementsForCode$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 146
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->access$getCreateUSBankAccountFormArguments$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v8, p2

    check-cast v8, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    .line 148
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->access$get_state$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->access$get_state$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    const/16 v9, 0x72

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->copy$default(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 154
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
