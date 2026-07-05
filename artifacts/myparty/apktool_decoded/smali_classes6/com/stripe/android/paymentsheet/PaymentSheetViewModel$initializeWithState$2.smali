.class final Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentSheetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->initializeWithState(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$2"
    f = "PaymentSheetViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x11b,
        0x12a
    }
    m = "invokeSuspend"
    n = {
        "shouldLaunchEagerly"
    }
    s = {
        "Z$0"
    }
.end annotation


# instance fields
.field final synthetic $state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 282
    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->Z$0:Z

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

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

    .line 283
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v1

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->label:I

    invoke-virtual {p1, v1, v4}, Lcom/stripe/android/paymentsheet/LinkHandler;->setupLinkWithEagerLaunch(Lcom/stripe/android/paymentsheet/state/LinkState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 285
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$checkoutWithLinkExpress(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    .line 288
    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getCustomerStateHolder()Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getCustomer()Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->setCustomerState(Lcom/stripe/android/paymentsheet/state/CustomerState;)V

    .line 290
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    .line 291
    instance-of v3, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v3, :cond_6

    .line 292
    instance-of v1, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v1, :cond_5

    goto :goto_1

    .line 293
    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 296
    :cond_6
    :goto_1
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$setPaymentMethodMetadata(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    .line 298
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$getConfirmationHandler$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->Z$0:Z

    iput v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->label:I

    invoke-interface {v1, v3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->awaitResult(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    move v0, p1

    move-object p1, v1

    :goto_3
    nop

    instance-of v1, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    goto :goto_4

    :cond_8
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_9

    .line 300
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {p1}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    :cond_9
    if-nez v0, :cond_a

    .line 303
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    .line 304
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$initializeWithState$2;->$state:Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v0

    .line 303
    invoke-static {p1, v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$initializeNavigationStateIfNeeded(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/core/strings/ResolvableString;)V

    .line 308
    :cond_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
