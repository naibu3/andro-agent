.class final Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultConfirmationHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;)V
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
    c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$onResult$confirmationResult$1"
    f = "DefaultConfirmationHandler.kt"
    i = {}
    l = {
        0xc4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $result:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->$result:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

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

    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->$result:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 193
    iget v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 194
    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->$result:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;->getParameters()Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;

    move-result-object p1

    .line 196
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->this$0:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

    .line 198
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    .line 199
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v8

    .line 200
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v6

    .line 201
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v7

    .line 202
    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->$result:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;->getConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v5

    .line 197
    new-instance v3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    .line 196
    iput v2, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;->label:I

    invoke-static {v1, v3, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->access$confirm(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 205
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
