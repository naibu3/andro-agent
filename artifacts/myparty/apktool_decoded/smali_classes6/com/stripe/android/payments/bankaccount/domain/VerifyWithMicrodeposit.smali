.class public final Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;
.super Ljava/lang/Object;
.source "VerifyWithMicrodeposit.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J6\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J.\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J6\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0010J.\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;",
        "",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;)V",
        "forPaymentIntent",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/PaymentIntent;",
        "publishableKey",
        "",
        "clientSecret",
        "firstAmount",
        "",
        "secondAmount",
        "forPaymentIntent-yxL6bBk",
        "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "descriptorCode",
        "forPaymentIntent-BWLJW6A",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "forSetupIntent",
        "Lcom/stripe/android/model/SetupIntent;",
        "forSetupIntent-yxL6bBk",
        "forSetupIntent-BWLJW6A",
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
.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-void
.end method


# virtual methods
.method public final forPaymentIntent-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;

    iget v1, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;-><init>(Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 36
    iget v2, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    iget-object p4, p0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 43
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    iput v3, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$2;->label:I

    invoke-interface {p4, p2, p3, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->verifyPaymentIntentWithMicrodeposits-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final forPaymentIntent-yxL6bBk(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;

    iget v2, v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v1

    iget-object v0, v7, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 18
    iget v2, v7, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 27
    new-instance v6, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, p1

    move-object v8, v6

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    iput v3, v7, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forPaymentIntent$1;->label:I

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-interface/range {v2 .. v7}, Lcom/stripe/android/networking/StripeRepository;->verifyPaymentIntentWithMicrodeposits-yxL6bBk(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final forSetupIntent-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;

    iget v1, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;-><init>(Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 70
    iget v2, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    iget-object p4, p0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 77
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 74
    iput v3, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$2;->label:I

    invoke-interface {p4, p2, p3, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->verifySetupIntentWithMicrodeposits-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final forSetupIntent-yxL6bBk(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;

    iget v2, v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v1

    iget-object v0, v7, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 52
    iget v2, v7, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 61
    new-instance v6, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, p1

    move-object v8, v6

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    iput v3, v7, Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit$forSetupIntent$1;->label:I

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-interface/range {v2 .. v7}, Lcom/stripe/android/networking/StripeRepository;->verifySetupIntentWithMicrodeposits-yxL6bBk(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
