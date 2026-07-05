.class public final Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;
.super Ljava/lang/Object;
.source "CoalescingOrchestrator.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002BM\u0012\u001c\u0010\u0003\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000e\u0010\u0014\u001a\u00028\u0000H\u0086P\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R&\u0010\u0003\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;",
        "T",
        "",
        "factory",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "keepDataInMemory",
        "",
        "awaitListener",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V",
        "Lkotlin/jvm/functions/Function1;",
        "data",
        "Ljava/lang/Object;",
        "dataInitialized",
        "deferred",
        "Lkotlinx/coroutines/Deferred;",
        "lock",
        "get",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadDataAsync",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
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
.field private final awaitListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private volatile data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private volatile dataInitialized:Z

.field private volatile deferred:Lkotlinx/coroutines/Deferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/Deferred<",
            "+TT;>;"
        }
    .end annotation
.end field

.field private final factory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final keepDataInMemory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;


# direct methods
.method public static synthetic $r8$lambda$xm5fNLlxeYMyw39Oy6Row5qbPA0(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->_init_$lambda$0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keepDataInMemory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->factory:Lkotlin/jvm/functions/Function1;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->keepDataInMemory:Lkotlin/jvm/functions/Function1;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->awaitListener:Lkotlin/jvm/functions/Function0;

    .line 28
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->lock:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 16
    new-instance p2, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$$ExternalSyntheticLambda0;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final synthetic access$getAwaitListener$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->awaitListener:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getData$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Ljava/lang/Object;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->data:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic access$getDataInitialized$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Z
    .locals 0

    .line 14
    iget-boolean p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->dataInitialized:Z

    return p0
.end method

.method public static final synthetic access$getDeferred$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Lkotlinx/coroutines/Deferred;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->deferred:Lkotlinx/coroutines/Deferred;

    return-object p0
.end method

.method public static final synthetic access$getFactory$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->factory:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getKeepDataInMemory$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->keepDataInMemory:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getLock$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;)Ljava/lang/Object;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->lock:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic access$loadDataAsync(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Deferred;
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->loadDataAsync(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Deferred;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setData$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->data:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$setDataInitialized$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;Z)V
    .locals 0

    .line 14
    iput-boolean p1, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->dataInitialized:Z

    return-void
.end method

.method public static final synthetic access$setDeferred$p(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;Lkotlinx/coroutines/Deferred;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->deferred:Lkotlinx/coroutines/Deferred;

    return-void
.end method

.method private final loadDataAsync(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Deferred;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            ")",
            "Lkotlinx/coroutines/Deferred<",
            "TT;>;"
        }
    .end annotation

    .line 64
    sget-object v2, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    new-instance v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$loadDataAsync$local$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$loadDataAsync$local$1;-><init>(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;Lkotlin/coroutines/Continuation;)V

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object p1

    .line 76
    iput-object p1, p0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->deferred:Lkotlinx/coroutines/Deferred;

    return-object p1
.end method


# virtual methods
.method public final get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;

    iget v1, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;-><init>(Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 30
    iget v2, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v2, p1

    .line 31
    :goto_1
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;

    iget-boolean p1, p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->dataInitialized:Z

    if-eqz p1, :cond_4

    .line 32
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;

    iget-object p1, p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;->data:Ljava/lang/Object;

    if-nez p1, :cond_3

    const-string p1, "data"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    return-object p1

    .line 35
    :cond_4
    new-instance p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$result$1;

    const/4 v4, 0x0

    invoke-direct {p1, v2, v4}, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$result$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iput-object v2, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator$get$1;->label:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    return-object p1

    .line 60
    :cond_6
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;

    iput-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_1
.end method
