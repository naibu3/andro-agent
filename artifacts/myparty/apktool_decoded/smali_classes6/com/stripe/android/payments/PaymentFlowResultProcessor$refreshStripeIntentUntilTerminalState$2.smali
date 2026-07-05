.class final Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentFlowResultProcessor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntentUntilTerminalState-BWLJW6A(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2"
    f = "PaymentFlowResultProcessor.kt"
    i = {}
    l = {
        0xe9,
        0xeb,
        0xf1
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $clientSecret:Ljava/lang/String;

.field final synthetic $maxRetries:I

.field final synthetic $originalIntent:Lcom/stripe/android/model/StripeIntent;

.field final synthetic $remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic $requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field final synthetic $stripeIntentResult:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlin/Result<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/payments/PaymentFlowResultProcessor<",
            "TT;TS;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$IntRef;ILcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/PaymentFlowResultProcessor<",
            "TT;+TS;>;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlin/Result<",
            "TT;>;>;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "I",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    iput-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$stripeIntentResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

    iput p4, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$maxRetries:I

    iput-object p5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$originalIntent:Lcom/stripe/android/model/StripeIntent;

    iput-object p6, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$clientSecret:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;

    iget-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    iget-object v2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$stripeIntentResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

    iget v4, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$maxRetries:I

    iget-object v5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$originalIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v6, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$clientSecret:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;-><init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$IntRef;ILcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 227
    iget v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 228
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    iget-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$stripeIntentResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$shouldRetry(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

    iget p1, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-le p1, v4, :cond_7

    .line 229
    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getRetryDelaySupplier$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/core/networking/RetryDelaySupplier;

    move-result-object p1

    .line 230
    iget v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$maxRetries:I

    .line 231
    iget-object v5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

    iget v5, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 229
    invoke-interface {p1, v1, v5}, Lcom/stripe/android/core/networking/RetryDelaySupplier;->getDelay-3nIYWDw(II)J

    move-result-wide v5

    .line 233
    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->label:I

    invoke-static {v5, v6, p1}, Lkotlinx/coroutines/DelayKt;->delay-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    .line 234
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$stripeIntentResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    iget-object v5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$originalIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-static {p1, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$shouldCallRefreshIntent(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 235
    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    .line 236
    iget-object v5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$clientSecret:Ljava/lang/String;

    .line 237
    iget-object v6, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 238
    sget-object v7, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;->getEXPAND_PAYMENT_METHOD()Ljava/util/List;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    .line 235
    iput-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->label:I

    invoke-virtual {p1, v5, v6, v7, v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    .line 241
    :cond_5
    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    .line 242
    iget-object v5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$clientSecret:Ljava/lang/String;

    .line 243
    iget-object v6, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 244
    sget-object v7, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;->getEXPAND_PAYMENT_METHOD()Ljava/util/List;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    .line 241
    iput-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->label:I

    invoke-virtual {p1, v5, v6, v7, v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retrieveStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    .line 234
    :cond_6
    :goto_4
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 247
    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

    iget p1, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;->$remainingRetries:Lkotlin/jvm/internal/Ref$IntRef;

    add-int/lit8 p1, p1, -0x1

    iput p1, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    goto :goto_1

    .line 249
    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
