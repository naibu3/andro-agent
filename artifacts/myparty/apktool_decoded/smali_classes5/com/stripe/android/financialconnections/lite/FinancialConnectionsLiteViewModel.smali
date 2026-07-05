.class public final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "FinancialConnectionsLiteViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$Factory;,
        Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;,
        Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;,
        Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0003678B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0008\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0002J)\u0010-\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 0/H\u0002\u00a2\u0006\u0004\u00080\u00101J\u0018\u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u00069"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "repository",
        "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;",
        "workContext",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "applicationId",
        "",
        "<init>",
        "(Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)V",
        "args",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "_viewEffects",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;",
        "viewEffects",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getViewEffects",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "handleUrl",
        "Lkotlin/Result;",
        "",
        "uri",
        "handleUrl-IoAF18A",
        "(Ljava/lang/String;)Ljava/lang/Object;",
        "onSuccessFromTokenFlow",
        "userCancelled",
        "",
        "onSuccessFromDataFlow",
        "onSuccessFromInstantDebits",
        "Lkotlinx/coroutines/Job;",
        "url",
        "onAuthFlowCanceled",
        "launchInBrowser",
        "withState",
        "block",
        "Lkotlin/Function1;",
        "withState-IoAF18A",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "handleError",
        "error",
        "",
        "message",
        "State",
        "ViewEffect",
        "Factory",
        "financial-connections-lite_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;",
            ">;"
        }
    .end annotation
.end field

.field private final _viewEffects:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final repository:Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;",
            ">;"
        }
    .end annotation
.end field

.field private final viewEffects:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;",
            ">;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlinx/coroutines/CoroutineDispatcher;


# direct methods
.method public static synthetic $r8$lambda$uCw2mTfCj-Rs88qLK7aaRtvzDMo(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->handleUrl_IoAF18A$lambda$0(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)V
    .locals 6

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 40
    iput-object p3, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->repository:Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;

    .line 41
    iput-object p4, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->workContext:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 46
    const-string p1, "FinancialConnectionsSheetActivityArgs"

    invoke-virtual {p2, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->args:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 48
    invoke-static {p2, p2, p3, p1, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->_viewEffects:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 49
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->viewEffects:Lkotlinx/coroutines/flow/SharedFlow;

    .line 51
    invoke-static {p3}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 52
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 55
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    move-object v1, p4

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$1;

    invoke-direct {p1, p0, p5, p3}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing arguments"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->args:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;)Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->repository:Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_viewEffects$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->_viewEffects:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$handleError(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->handleError(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private final handleError(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 6

    .line 170
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {v0, p2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    move-object p2, p0

    check-cast p2, Landroidx/lifecycle/ViewModel;

    invoke-static {p2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance p2, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$handleError$1;

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$handleError$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final handleUrl_IoAF18A$lambda$0(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;)Lkotlin/Unit;
    .locals 7

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;->getSuccessUrl()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v1, :cond_3

    .line 78
    iget-object p2, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->args:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    invoke-static {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;->getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object p2

    sget-object v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    if-eq p2, v6, :cond_2

    if-eq p2, v3, :cond_1

    if-ne p2, v5, :cond_0

    .line 81
    invoke-direct {p1, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onSuccessFromInstantDebits(Ljava/lang/String;)Lkotlinx/coroutines/Job;

    goto :goto_0

    .line 78
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 80
    :cond_1
    invoke-direct {p1, v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onSuccessFromTokenFlow(Z)V

    goto :goto_0

    .line 79
    :cond_2
    invoke-direct {p1, v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onSuccessFromDataFlow(Z)V

    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;->getCancelUrl()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {v0, p2, v2, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 85
    iget-object p0, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->args:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    invoke-static {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;->getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object p0

    sget-object p2, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ordinal()I

    move-result p0

    aget p0, p2, p0

    if-eq p0, v6, :cond_6

    if-eq p0, v3, :cond_5

    if-ne p0, v5, :cond_4

    .line 88
    invoke-direct {p1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onAuthFlowCanceled()V

    goto :goto_0

    .line 85
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 87
    :cond_5
    invoke-direct {p1, v6}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onSuccessFromTokenFlow(Z)V

    goto :goto_0

    .line 86
    :cond_6
    invoke-direct {p1, v6}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onSuccessFromDataFlow(Z)V

    goto :goto_0

    .line 92
    :cond_7
    invoke-direct {p1, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->launchInBrowser(Ljava/lang/String;)V

    .line 95
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final launchInBrowser(Ljava/lang/String;)V
    .locals 7

    .line 158
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$launchInBrowser$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$launchInBrowser$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final onAuthFlowCanceled()V
    .locals 7

    .line 152
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onAuthFlowCanceled$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onAuthFlowCanceled$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final onSuccessFromDataFlow(Z)V
    .locals 7

    .line 120
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->workContext:Lkotlinx/coroutines/CoroutineDispatcher;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;ZLkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final onSuccessFromInstantDebits(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 7

    .line 134
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method private final onSuccessFromTokenFlow(Z)V
    .locals 7

    .line 98
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->workContext:Lkotlinx/coroutines/CoroutineDispatcher;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromTokenFlow$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromTokenFlow$1;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;ZLkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final withState-IoAF18A(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 163
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    .line 164
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 163
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 164
    :cond_0
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    .line 163
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 165
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 166
    const-string v1, "State is null"

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->handleError(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getViewEffects()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->viewEffects:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final handleUrl-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->withState-IoAF18A(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
