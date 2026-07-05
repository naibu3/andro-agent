.class public final Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;
.super Ljava/lang/Object;
.source "ElementsSessionRepository.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nElementsSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementsSessionRepository.kt\ncom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository\n+ 2 ElementsSessionRepository.kt\ncom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt\n*L\n1#1,250:1\n248#2:251\n*S KotlinDebug\n*F\n+ 1 ElementsSessionRepository.kt\ncom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository\n*L\n77#1:251\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001BC\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0001\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJN\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001a2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ&\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@\u00a2\u0006\u0004\u0008%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "lazyPaymentConfig",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "mobileSessionIdProvider",
        "",
        "appId",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Ljavax/inject/Provider;Ljava/lang/String;)V",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getRequestOptions",
        "()Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "get",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/ElementsSession;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "customer",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "customPaymentMethods",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
        "externalPaymentMethods",
        "savedPaymentMethodSelectionId",
        "get-hUnOzRk",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fallback",
        "params",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "elementsSessionFailure",
        "",
        "fallback-0E7RQCE",
        "(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentsheet_release"
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
.field private final appId:Ljava/lang/String;

.field private final lazyPaymentConfig:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final mobileSessionIdProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Ljavax/inject/Provider;Ljava/lang/String;)V
    .locals 1
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p4    # Ljavax/inject/Provider;
        .annotation runtime Ljavax/inject/Named;
            value = "mobile_session_id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "application_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazyPaymentConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileSessionIdProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    .line 43
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 44
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->mobileSessionIdProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->appId:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$fallback-0E7RQCE(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->fallback-0E7RQCE(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRequestOptions(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;)Lcom/stripe/android/networking/StripeRepository;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method private final fallback-0E7RQCE(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 82
    iget v2, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$2;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p0, p2, v4}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$2;-><init>(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$fallback$1;->label:I

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 6

    .line 51
    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 52
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 51
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public get-hUnOzRk(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;

    iget v2, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 56
    iget v3, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ElementsSessionParams;

    iget-object p2, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->mobileSessionIdProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v3, "get(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 69
    iget-object v12, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->appId:Ljava/lang/String;

    move-object v6, p1

    move-object v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    .line 63
    invoke-static/range {v6 .. v12}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toElementsSessionParams(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ElementsSessionParams;

    move-result-object p1

    .line 72
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 74
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->getRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v0

    .line 72
    iput-object p0, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->L$1:Ljava/lang/Object;

    iput v5, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->label:I

    invoke-interface {p2, p1, v0, v1}, Lcom/stripe/android/networking/StripeRepository;->retrieveElementsSession-0E7RQCE(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, p0

    .line 251
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_6

    const/4 v0, 0x0

    .line 78
    iput-object v0, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->L$1:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository$get$1;->label:I

    invoke-direct {p2, p1, v3, v1}, Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;->fallback-0E7RQCE(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_2
    return-object v2

    :cond_5
    return-object p1

    :cond_6
    return-object v0
.end method
