.class final Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultFormHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/DefaultFormHelper;-><init>(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkConfigurationCoordinator;ZLcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlin/Pair<",
        "+",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "formValues",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "",
        "inlineSignupViewState",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;"
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
    c = "com.stripe.android.paymentsheet.DefaultFormHelper$paymentSelection$1"
    f = "DefaultFormHelper.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/DefaultFormHelper;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/DefaultFormHelper;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/DefaultFormHelper;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    check-cast p2, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->invoke(Lkotlin/Pair;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/DefaultFormHelper;

    invoke-direct {v0, v1, p3}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 100
    iget v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->label:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlin/Pair;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 101
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 102
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/DefaultFormHelper;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->access$supportedPaymentMethodForCode(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    .line 103
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/DefaultFormHelper;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->access$getPaymentMethodMetadata$p(Lcom/stripe/android/paymentsheet/DefaultFormHelper;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v3

    .line 101
    invoke-static {v1, p1, v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentSelection(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    if-eqz v0, :cond_3

    .line 110
    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getUseLink()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 111
    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getUserInput()Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 115
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v4

    .line 116
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v7

    .line 117
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v8

    .line 118
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getCustomerRequestedSave()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v6

    .line 119
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v5

    .line 114
    new-instance v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;)V

    move-object v2, v3

    .line 123
    :cond_2
    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v2

    .line 126
    :cond_3
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object p1

    :cond_4
    :goto_0
    return-object v2

    .line 100
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
