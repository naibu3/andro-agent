.class final Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "InputAddressViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->clickBillingSameAsShipping(Z)V
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
    c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$clickBillingSameAsShipping$1"
    f = "InputAddressViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $newValue:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->$newValue:Z

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

    new-instance p1, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->$newValue:Z

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;ZLkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 207
    iget v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->label:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 208
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$get_shippingSameAsBillingState$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;

    .line 210
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;

    if-eqz p1, :cond_3

    .line 211
    new-instance p1, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->$newValue:Z

    invoke-direct {p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;-><init>(Z)V

    .line 213
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$setSetShippingSameAsShippingAtLeastOnce$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Z)V

    .line 215
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 216
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$getParsedBillingAddress$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$getUnparsedBillingAddress$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Ljava/util/Map;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    .line 217
    invoke-static {v0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$getEventListener$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;

    invoke-direct {v1, p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;-><init>(Ljava/util/Map;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 220
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$getEventListener$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 221
    new-instance v0, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;

    .line 222
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$getPreviousUserInput$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 221
    :cond_2
    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;-><init>(Ljava/util/Map;)V

    .line 220
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 207
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
