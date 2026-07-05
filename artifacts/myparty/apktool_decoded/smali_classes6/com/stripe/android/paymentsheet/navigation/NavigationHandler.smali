.class public final Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;
.super Ljava/lang/Object;
.source "NavigationHandler.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNavigationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationHandler.kt\ncom/stripe/android/paymentsheet/navigation/NavigationHandler\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n230#2,5:124\n230#2,5:131\n1863#3,2:129\n1863#3,2:136\n*S KotlinDebug\n*F\n+ 1 NavigationHandler.kt\ncom/stripe/android/paymentsheet/navigation/NavigationHandler\n*L\n52#1:124,5\n86#1:131,5\n67#1:129,2\n100#1:136,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0014\u0010!\u001a\u00020\n2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u0008\u0010%\u001a\u00020\nH\u0002J\u0006\u0010&\u001a\u00020\nJ\u0011\u0010\'\u001a\u00020\n*\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010(\u001a\u00020\n2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\n0*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;",
        "T",
        "",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "initialScreen",
        "shouldRemoveInitialScreenOnTransition",
        "",
        "poppedScreenHandler",
        "Lkotlin/Function1;",
        "",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V",
        "Ljava/lang/Object;",
        "isTransitioning",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "backStack",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "currentScreen",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getCurrentScreen",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "previousScreen",
        "getPreviousScreen",
        "canGoBack",
        "getCanGoBack",
        "()Z",
        "transitionTo",
        "target",
        "(Ljava/lang/Object;)V",
        "transitionToWithDelay",
        "transitionToInternal",
        "resetTo",
        "screens",
        "pop",
        "popWithDelay",
        "popInternal",
        "closeScreens",
        "onClose",
        "navigateWithDelay",
        "action",
        "Lkotlin/Function0;",
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
.field private final backStack:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final currentScreen:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final initialScreen:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final poppedScreenHandler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final previousScreen:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final shouldRemoveInitialScreenOnTransition:Z


# direct methods
.method public static synthetic $r8$lambda$1CcGA6QKknYqiB9Ru71gZLq5q88(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->previousScreen$lambda$1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$8SlO9LMVbbXPUQtW4nK9QPjYaT4(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->currentScreen$lambda$0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XlVlWnMbDdbHTj_KoyThuF63R6c(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->transitionToWithDelay$lambda$2(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oqHt4K1Y7QanRtSe5XHjxANMSg0(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->popWithDelay$lambda$5(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "TT;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialScreen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poppedScreenHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->initialScreen:Ljava/lang/Object;

    .line 17
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->shouldRemoveInitialScreenOnTransition:Z

    .line 18
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->poppedScreenHandler:Lkotlin/jvm/functions/Function1;

    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 22
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 26
    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p3, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda1;

    invoke-direct {p3}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda1;-><init>()V

    .line 27
    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->currentScreen:Lkotlinx/coroutines/flow/StateFlow;

    .line 29
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p2, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda2;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->previousScreen:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x1

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;-><init>(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$isTransitioning$p(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private static final currentScreen$lambda$0(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final navigateWithDelay(Lkotlin/jvm/functions/Function0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$navigateWithDelay$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$navigateWithDelay$1;-><init>(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method

.method private final onClose(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 107
    instance-of v0, p1, Ljava/io/Closeable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/io/Closeable;

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    :cond_0
    return-void
.end method

.method private final popInternal()V
    .locals 5

    .line 86
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 132
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 133
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 87
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 89
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    .line 91
    invoke-direct {p0, v3}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->onClose(Ljava/lang/Object;)V

    .line 93
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->poppedScreenHandler:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 134
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private static final popWithDelay$lambda$5(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)Lkotlin/Unit;
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->popInternal()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final previousScreen$lambda$1(Ljava/util/List;)Ljava/lang/Object;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final transitionToInternal(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 125
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 126
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 53
    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->shouldRemoveInitialScreenOnTransition:Z

    if-eqz v3, :cond_1

    .line 54
    check-cast v2, Ljava/lang/Iterable;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->initialScreen:Ljava/lang/Object;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 56
    :cond_1
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 127
    :goto_0
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private static final transitionToWithDelay$lambda$2(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->transitionToInternal(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final closeScreens()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 136
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 101
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->onClose(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getCanGoBack()Z
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getCurrentScreen()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TT;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->currentScreen:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getPreviousScreen()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TT;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->previousScreen:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final pop()V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->popInternal()V

    :cond_0
    return-void
.end method

.method public final popWithDelay()V
    .locals 1

    .line 82
    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->navigateWithDelay(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final resetTo(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "screens"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 65
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 67
    check-cast v0, Ljava/lang/Iterable;

    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 69
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->onClose(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final transitionTo(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->isTransitioning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->transitionToInternal(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final transitionToWithDelay(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->navigateWithDelay(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
