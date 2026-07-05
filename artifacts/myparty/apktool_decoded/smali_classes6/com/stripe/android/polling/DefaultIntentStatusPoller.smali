.class public final Lcom/stripe/android/polling/DefaultIntentStatusPoller;
.super Ljava/lang/Object;
.source "DefaultIntentStatusPoller.kt"

# interfaces
.implements Lcom/stripe/android/polling/IntentStatusPoller;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0013H\u0082@\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0002\u0010!J\u0008\u0010#\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/polling/DefaultIntentStatusPoller;",
        "Lcom/stripe/android/polling/IntentStatusPoller;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "paymentConfigProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "config",
        "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
        "dispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/polling/IntentStatusPoller$Config;Lkotlinx/coroutines/CoroutineDispatcher;)V",
        "attempts",
        "",
        "pollingJob",
        "Lkotlinx/coroutines/Job;",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "startPolling",
        "",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "performPoll",
        "force",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchIntentStatus",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "forcePoll",
        "stopPolling",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation
.end field

.field private attempts:I

.field private final config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

.field private final dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

.field private final paymentConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private pollingJob:Lkotlinx/coroutines/Job;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static synthetic $r8$lambda$T9T1pKnwHfXNJR5WGnW6WCi5sfk(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus$lambda$0(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$uPLcomwCDvolUYnveX-2t447lDQ(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus$lambda$1(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/polling/IntentStatusPoller$Config;Lkotlinx/coroutines/CoroutineDispatcher;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentConfigProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 24
    iput-object p2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->paymentConfigProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p3, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    .line 26
    iput-object p4, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    const/4 p1, 0x0

    .line 32
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 33
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$fetchIntentStatus(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performPoll(Lcom/stripe/android/polling/DefaultIntentStatusPoller;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->performPoll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;

    iget v1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;-><init>(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v0

    iget-object p1, v5, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 55
    iget v1, v5, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    iget-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->paymentConfigProvider:Ljavax/inject/Provider;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentConfiguration;

    .line 57
    iget-object v1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 58
    iget-object v3, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    invoke-virtual {v3}, Lcom/stripe/android/polling/IntentStatusPoller$Config;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    move v4, v2

    move-object v2, v3

    .line 59
    new-instance v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 57
    new-instance v6, Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda0;

    invoke-direct {v6, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/PaymentConfiguration;)V

    new-instance v7, Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda1;

    invoke-direct {v7, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/PaymentConfiguration;)V

    .line 59
    invoke-direct {v3, v6, v7}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 57
    iput v4, v5, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/networking/StripeRepository$DefaultImpls;->retrievePaymentIntent-BWLJW6A$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 64
    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object p1, v1

    :cond_4
    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v1
.end method

.method private static final fetchIntentStatus$lambda$0(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;
    .locals 0

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final fetchIntentStatus$lambda$1(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;
    .locals 0

    .line 61
    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final performPoll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;

    iget v1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;-><init>(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 41
    iget v2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-nez p1, :cond_5

    .line 42
    iget p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    iget-object p2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    invoke-virtual {p2}, Lcom/stripe/android/polling/IntentStatusPoller$Config;->getMaxAttempts()I

    move-result p2

    if-ge p1, p2, :cond_9

    .line 43
    :cond_5
    iget p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    add-int/2addr p1, v6

    iput p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    .line 45
    iget-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    iput-object p0, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v2, p0

    :goto_1
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 47
    iget p1, v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    iget-object p2, v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    invoke-virtual {p2}, Lcom/stripe/android/polling/IntentStatusPoller$Config;->getMaxAttempts()I

    move-result p2

    if-ge p1, p2, :cond_9

    .line 49
    iget p1, v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    invoke-static {p1}, Lcom/stripe/android/polling/DefaultIntentStatusPollerKt;->calculateDelay(I)J

    move-result-wide p1

    iput-object v2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/DelayKt;->delay-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v2

    .line 50
    :goto_2
    iput-object v5, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    const/4 p2, 0x0

    invoke-static {p1, p2, v0, v6, v5}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->performPoll$default(Lcom/stripe/android/polling/DefaultIntentStatusPoller;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    .line 53
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method static synthetic performPoll$default(Lcom/stripe/android/polling/DefaultIntentStatusPoller;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 41
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->performPoll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public forcePoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 68
    invoke-direct {p0, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public startPolling(Lkotlinx/coroutines/CoroutineScope;)V
    .locals 7

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$startPolling$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$startPolling$1;-><init>(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->pollingJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public stopPolling()V
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->pollingJob:Lkotlinx/coroutines/Job;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 73
    :cond_0
    iput-object v1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->pollingJob:Lkotlinx/coroutines/Job;

    return-void
.end method
