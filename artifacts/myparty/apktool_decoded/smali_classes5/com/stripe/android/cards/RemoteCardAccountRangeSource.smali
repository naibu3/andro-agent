.class public final Lcom/stripe/android/cards/RemoteCardAccountRangeSource;
.super Ljava/lang/Object;
.source "RemoteCardAccountRangeSource.kt"

# interfaces
.implements Lcom/stripe/android/cards/CardAccountRangeSource;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRemoteCardAccountRangeSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteCardAccountRangeSource.kt\ncom/stripe/android/cards/RemoteCardAccountRangeSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n64#1,8:75\n1755#2,3:83\n*S KotlinDebug\n*F\n+ 1 RemoteCardAccountRangeSource.kt\ncom/stripe/android/cards/RemoteCardAccountRangeSource\n*L\n31#1:75,8\n44#1:83,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0008\u0010\u001b\u001a\u00020\u001cH\u0002J6\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u001e0 H\u0082H\u00a2\u0006\u0004\u0008!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/cards/RemoteCardAccountRangeSource;",
        "Lcom/stripe/android/cards/CardAccountRangeSource;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "cardAccountRangeStore",
        "Lcom/stripe/android/cards/CardAccountRangeStore;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/cards/CardAccountRangeStore;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V",
        "_loading",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "loading",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getLoading",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "getAccountRanges",
        "",
        "Lcom/stripe/android/model/AccountRange;",
        "cardNumber",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onCardMetadataMissingRange",
        "",
        "withLoading",
        "Lkotlin/Result;",
        "block",
        "Lkotlin/Function0;",
        "withLoading-gIAlu-s",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final _loading:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final cardAccountRangeStore:Lcom/stripe/android/cards/CardAccountRangeStore;

.field private final loading:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/cards/CardAccountRangeStore;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->cardAccountRangeStore:Lcom/stripe/android/cards/CardAccountRangeStore;

    .line 19
    iput-object p4, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 20
    iput-object p5, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const/4 p1, 0x0

    .line 23
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->_loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 25
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->loading:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$get_loading$p(Lcom/stripe/android/cards/RemoteCardAccountRangeSource;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->_loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method private final onCardMetadataMissingRange()V
    .locals 10

    .line 56
    iget-object v0, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 57
    iget-object v1, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    .line 56
    invoke-interface {v0, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method private final withLoading-gIAlu-s(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;>;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 64
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$2;-><init>(Lcom/stripe/android/cards/RemoteCardAccountRangeSource;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    .line 68
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$3;

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$3;-><init>(Lcom/stripe/android/cards/RemoteCardAccountRangeSource;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    return-object p1
.end method


# virtual methods
.method public getAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/AccountRange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 15
    invoke-static {p0, p1, p2}, Lcom/stripe/android/cards/CardAccountRangeSource$DefaultImpls;->getAccountRange(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;

    iget v1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;-><init>(Lcom/stripe/android/cards/RemoteCardAccountRangeSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 27
    iget v2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$3:Ljava/lang/Object;

    iget-object v1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/cards/Bin;

    iget-object v2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v0, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;

    iget-object v2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;

    iget-object v4, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/cards/Bin;

    iget-object v5, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v7, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_2

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;

    iget-object v2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;

    iget-object v5, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/cards/Bin;

    iget-object v7, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v8, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v7

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p2

    if-eqz p2, :cond_e

    .line 75
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$2;

    invoke-direct {v7, p0, v6}, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$2;-><init>(Lcom/stripe/android/cards/RemoteCardAccountRangeSource;Lkotlin/coroutines/Continuation;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$2:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$3:Ljava/lang/Object;

    iput-object v0, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$4:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    invoke-static {v2, v7, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p0

    move-object v8, v2

    move-object v5, p2

    move-object p2, v0

    .line 32
    :goto_1
    iget-object v7, v8, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 34
    iget-object v9, v8, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 32
    iput-object v8, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$3:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$4:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    invoke-interface {v7, v5, v9, v0}, Lcom/stripe/android/networking/StripeRepository;->getCardMetadata-0E7RQCE(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v7, v5

    move-object v5, p1

    move-object p1, p2

    move-object p2, v4

    move-object v4, v7

    move-object v7, v8

    .line 35
    :goto_2
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/model/CardMetadata;

    .line 36
    invoke-virtual {p2}, Lcom/stripe/android/model/CardMetadata;->getAccountRanges()Ljava/util/List;

    move-result-object p2

    .line 35
    :cond_7
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 79
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v8

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    new-instance v9, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$3;

    invoke-direct {v9, v2, v6}, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$withLoading$3;-><init>(Lcom/stripe/android/cards/RemoteCardAccountRangeSource;Lkotlin/coroutines/Continuation;)V

    check-cast v9, Lkotlin/jvm/functions/Function2;

    iput-object v7, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->L$4:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource$getAccountRanges$1;->label:I

    invoke-static {v8, v9, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object p1, p2

    move-object v1, v4

    move-object v2, v5

    move-object v0, v7

    .line 40
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    move-object p2, p1

    check-cast p2, Ljava/util/List;

    .line 41
    iget-object v3, v0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->cardAccountRangeStore:Lcom/stripe/android/cards/CardAccountRangeStore;

    invoke-interface {v3, v1, p2}, Lcom/stripe/android/cards/CardAccountRangeStore;->save(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V

    .line 43
    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    .line 44
    check-cast p2, Ljava/lang/Iterable;

    .line 83
    instance-of v1, p2, Ljava/util/Collection;

    if-eqz v1, :cond_9

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_5

    .line 84
    :cond_9
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/AccountRange;

    .line 44
    invoke-virtual {v1}, Lcom/stripe/android/model/AccountRange;->getBinRange()Lcom/stripe/android/model/BinRange;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/BinRange;->matches(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_6

    .line 45
    :cond_b
    :goto_5
    invoke-virtual {v2}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isValidLuhn()Z

    move-result p2

    if-eqz p2, :cond_c

    .line 46
    invoke-direct {v0}, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->onCardMetadataMissingRange()V

    .line 51
    :cond_c
    :goto_6
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_d

    goto :goto_7

    :cond_d
    move-object v6, p1

    :goto_7
    check-cast v6, Ljava/util/List;

    :cond_e
    return-object v6
.end method

.method public getLoading()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/stripe/android/cards/RemoteCardAccountRangeSource;->loading:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method
