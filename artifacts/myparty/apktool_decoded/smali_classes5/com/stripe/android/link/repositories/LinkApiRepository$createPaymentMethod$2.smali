.class final Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LinkApiRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/repositories/LinkApiRepository;->createPaymentMethod-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Result<",
        "+",
        "Lcom/stripe/android/model/PaymentMethod;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/PaymentMethod;",
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
    c = "com.stripe.android.link.repositories.LinkApiRepository$createPaymentMethod$2"
    f = "LinkApiRepository.kt"
    i = {}
    l = {
        0x13b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $consumerSessionClientSecret:Ljava/lang/String;

.field final synthetic $paymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/repositories/LinkApiRepository;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/LinkPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/repositories/LinkApiRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    iput-object p2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$consumerSessionClientSecret:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->this$0:Lcom/stripe/android/link/repositories/LinkApiRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$consumerSessionClientSecret:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->this$0:Lcom/stripe/android/link/repositories/LinkApiRepository;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;-><init>(Lcom/stripe/android/link/LinkPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/repositories/LinkApiRepository;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 308
    iget v1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 310
    iget-object p1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    .line 311
    iget-object v1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$consumerSessionClientSecret:Ljava/lang/String;

    .line 312
    iget-object v3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkPaymentMethod;->getCollectedCvc()Ljava/lang/String;

    move-result-object v3

    .line 313
    iget-object v4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/link/LinkPaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkPaymentMethod;->getBillingPhone()Ljava/lang/String;

    move-result-object v4

    .line 309
    invoke-static {p1, v1, v3, v4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt;->createPaymentMethodCreateParams(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    .line 315
    iget-object v1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->this$0:Lcom/stripe/android/link/repositories/LinkApiRepository;

    invoke-static {v1}, Lcom/stripe/android/link/repositories/LinkApiRepository;->access$getStripeRepository$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object v1

    .line 317
    new-instance v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 318
    iget-object v4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->this$0:Lcom/stripe/android/link/repositories/LinkApiRepository;

    invoke-static {v4}, Lcom/stripe/android/link/repositories/LinkApiRepository;->access$getPublishableKeyProvider$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lkotlin/jvm/functions/Function0;

    move-result-object v4

    .line 319
    iget-object v5, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->this$0:Lcom/stripe/android/link/repositories/LinkApiRepository;

    invoke-static {v5}, Lcom/stripe/android/link/repositories/LinkApiRepository;->access$getStripeAccountIdProvider$p(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lkotlin/jvm/functions/Function0;

    move-result-object v5

    .line 317
    invoke-direct {v3, v4, v5}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    .line 315
    iput v2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository$createPaymentMethod$2;->label:I

    invoke-interface {v1, p1, v3, v4}, Lcom/stripe/android/networking/StripeRepository;->createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    return-object p1
.end method
