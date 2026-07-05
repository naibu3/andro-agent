.class final Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Stripe3ds2ChallengeResultProcessor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->process(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
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
    c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2"
    f = "Stripe3ds2ChallengeResultProcessor.kt"
    i = {
        0x0
    }
    l = {
        0x61
    }
    m = "invokeSuspend"
    n = {
        "requestOptions"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;


# direct methods
.method constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
            "Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

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

    new-instance p1, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 39
    iget v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    .line 41
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    if-eqz v1, :cond_2

    .line 42
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 43
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    .line 44
    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 45
    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    .line 43
    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 42
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto/16 :goto_0

    .line 49
    :cond_2
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    if-eqz v1, :cond_3

    .line 50
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 51
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    .line 52
    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 53
    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    .line 51
    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 50
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto/16 :goto_0

    .line 57
    :cond_3
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    if-eqz v1, :cond_4

    .line 58
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 59
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    .line 60
    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 61
    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    .line 59
    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 58
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto :goto_0

    .line 65
    :cond_4
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    if-eqz v1, :cond_5

    .line 66
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 67
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 66
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto :goto_0

    .line 70
    :cond_5
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    if-eqz v1, :cond_6

    .line 71
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 72
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 71
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto :goto_0

    .line 75
    :cond_6
    instance-of p1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    if-eqz p1, :cond_11

    .line 76
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 77
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    .line 78
    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 79
    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    .line 77
    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 76
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 85
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    .line 86
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    .line 87
    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 88
    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getInitialUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/UiType;->getCode()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_7
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_8

    const-string v4, ""

    .line 86
    :cond_8
    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 85
    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 92
    new-instance v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 93
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 94
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->getAccountId()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 92
    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 97
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->label:I

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v5, v3

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->complete3ds2Auth$default(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, v5

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    move-object v0, v3

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x2

    if-eqz p1, :cond_10

    .line 99
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    .line 100
    instance-of v3, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    if-eqz v3, :cond_a

    goto :goto_4

    .line 103
    :cond_a
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    if-eqz v2, :cond_b

    goto :goto_3

    .line 106
    :cond_b
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    if-eqz v2, :cond_c

    const/4 v2, 0x3

    goto :goto_4

    .line 109
    :cond_c
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    if-eqz v2, :cond_d

    goto :goto_3

    .line 112
    :cond_d
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    if-eqz v2, :cond_e

    goto :goto_3

    .line 115
    :cond_e
    instance-of p1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    if-eqz p1, :cond_f

    const/4 v2, 0x4

    goto :goto_4

    .line 99
    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_10
    :goto_3
    move v2, v1

    .line 124
    :goto_4
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    .line 125
    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getStripeAccount()Ljava/lang/String;

    move-result-object v7

    .line 123
    new-instance v0, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 40
    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
