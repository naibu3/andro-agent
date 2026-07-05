.class public final Lcom/stripe/android/networking/DefaultAlipayRepository;
.super Ljava/lang/Object;
.source "DefaultAlipayRepository.kt"

# interfaces
.implements Lcom/stripe/android/networking/AlipayRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/networking/DefaultAlipayRepository;",
        "Lcom/stripe/android/networking/AlipayRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;)V",
        "authenticate",
        "Lcom/stripe/android/model/AlipayAuthResult;",
        "paymentIntent",
        "Lcom/stripe/android/model/PaymentIntent;",
        "authenticator",
        "Lcom/stripe/android/AlipayAuthenticator;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "pingAlipayEndpointBeforeRetrievingPaymentIntentStatus",
        "",
        "redirect",
        "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;",
        "(Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
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
.field public static final $stable:I

.field private static final ALIPAY_RESULT_FIELD:Ljava/lang/String; = "resultStatus"

.field private static final Companion:Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;


# instance fields
.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/DefaultAlipayRepository;->Companion:Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/networking/DefaultAlipayRepository;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/networking/DefaultAlipayRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-void
.end method

.method public static final synthetic access$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(Lcom/stripe/android/networking/DefaultAlipayRepository;Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/networking/DefaultAlipayRepository;->pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;

    iget v1, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;-><init>(Lcom/stripe/android/networking/DefaultAlipayRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 50
    iget v2, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;->getAuthCompleteUrl()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_4

    .line 57
    iget-object p3, p0, Lcom/stripe/android/networking/DefaultAlipayRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;->getAuthCompleteUrl()Ljava/lang/String;

    move-result-object p1

    iput v3, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lcom/stripe/android/networking/StripeRepository;->retrieveObject-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 59
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public authenticate(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentIntent;",
            "Lcom/stripe/android/AlipayAuthenticator;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/AlipayAuthResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;

    iget v1, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;-><init>(Lcom/stripe/android/networking/DefaultAlipayRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 14
    iget v2, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    const-string v3, "9000"

    const-string v4, "resultStatus"

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p4

    if-eqz p4, :cond_4

    iget-boolean p4, p4, Lcom/stripe/android/model/PaymentMethod;->liveMode:Z

    if-eqz p4, :cond_3

    goto :goto_1

    .line 20
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    const-string p2, "Attempted to authenticate test mode PaymentIntent with the Alipay SDK.\nThe Alipay SDK does not support test mode payments."

    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    .line 29
    instance-of p4, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;

    if-eqz p4, :cond_d

    .line 30
    check-cast p1, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;

    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;->getData()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p4}, Lcom/stripe/android/AlipayAuthenticator;->onAuthenticationRequest(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    .line 31
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 33
    invoke-static {p4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_6

    .line 34
    iput-object p2, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    invoke-direct {p0, p1, p3, v0}, Lcom/stripe/android/networking/DefaultAlipayRepository;->pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p2

    :goto_2
    move-object p2, p1

    .line 37
    :cond_6
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const p3, 0x185d7c

    if-eq p2, p3, :cond_a

    const p3, 0x19463b

    if-eq p2, p3, :cond_8

    const p3, 0x1aa357

    if-eq p2, p3, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_4

    :cond_8
    const-string p2, "6001"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_3

    :cond_9
    const/4 v5, 0x3

    goto :goto_4

    :cond_a
    const-string p2, "4000"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_3

    :cond_b
    const/4 v5, 0x2

    goto :goto_4

    :cond_c
    :goto_3
    const/4 v5, 0x0

    .line 44
    :goto_4
    new-instance p1, Lcom/stripe/android/model/AlipayAuthResult;

    invoke-direct {p1, v5}, Lcom/stripe/android/model/AlipayAuthResult;-><init>(I)V

    return-object p1

    .line 46
    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unable to authenticate Payment Intent with Alipay SDK"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
