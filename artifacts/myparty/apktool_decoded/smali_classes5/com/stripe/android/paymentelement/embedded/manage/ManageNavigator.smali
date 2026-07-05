.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;
.super Ljava/lang/Object;
.source "ManageNavigator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;,
        Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0002!\"B\u001f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B!\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u000cJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
        "",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "navigationHandler",
        "Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)V",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "initialScreen",
        "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V",
        "screen",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getScreen",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "canGoBack",
        "",
        "getCanGoBack",
        "()Z",
        "_result",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "result",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getResult",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "performAction",
        "",
        "action",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;",
        "onScreenShown",
        "onScreenHidden",
        "Screen",
        "Action",
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
.field private final _result:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final navigationHandler:Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/paymentsheet/navigation/NavigationHandler<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
            ">;"
        }
    .end annotation
.end field

.field private final result:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final screen:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$xd8tgd5dPb7inlRnqEcGIao1EzU(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->_init_$lambda$0(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/paymentsheet/navigation/NavigationHandler<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 27
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->navigationHandler:Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    .line 43
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->getCurrentScreen()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->screen:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p2, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 48
    invoke-static {v1, v2, p2, v0, p2}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 49
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->result:Lkotlinx/coroutines/flow/SharedFlow;

    .line 52
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->onScreenShown(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V
    .locals 3

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialScreen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    .line 38
    new-instance v1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$$ExternalSyntheticLambda0;-><init>()V

    const/4 v2, 0x0

    .line 35
    invoke-direct {v0, p1, p2, v2, v1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;-><init>(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V

    .line 33
    invoke-direct {p0, p3, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final onScreenHidden(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V
    .locals 1

    .line 85
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;

    if-nez v0, :cond_1

    .line 86
    instance-of p1, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$Update;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onHideEditablePaymentOption()V

    return-void

    .line 84
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    return-void
.end method

.method private final onScreenShown(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V
    .locals 1

    .line 78
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowManageSavedPaymentMethods()V

    return-void

    .line 79
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$Update;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowEditablePaymentOption()V

    return-void

    .line 77
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getCanGoBack()Z
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->navigationHandler:Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->getCanGoBack()Z

    move-result v0

    return v0
.end method

.method public final getResult()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->result:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getScreen()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->screen:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final performAction(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;)V
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;

    if-eqz v0, :cond_1

    .line 58
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->screen:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->onScreenHidden(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V

    .line 59
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->navigationHandler:Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->getCanGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 60
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->navigationHandler:Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->pop()V

    return-void

    .line 62
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 65
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Close;

    if-eqz v0, :cond_2

    .line 66
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->screen:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->onScreenHidden(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V

    .line 67
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Close;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Close;->getShouldInvokeRowSelectionCallback()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 69
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$GoToScreen;

    if-eqz v0, :cond_3

    .line 70
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->navigationHandler:Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$GoToScreen;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$GoToScreen;->getScreen()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->transitionToWithDelay(Ljava/lang/Object;)V

    .line 71
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$GoToScreen;->getScreen()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->onScreenShown(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V

    return-void

    .line 56
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
