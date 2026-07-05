.class public final Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "SuccessViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBC\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
        "initialState",
        "getCachedAccounts",
        "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "successContentRepository",
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "observeAsyncs",
        "",
        "onDoneClick",
        "Lkotlinx/coroutines/Job;",
        "completeSession",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Factory",
        "Companion",
        "financial-connections_release"
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;


# direct methods
.method public static synthetic $r8$lambda$CUnZ4G_RUx7qyQJCCz6WGKhAsHc(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/success/SuccessState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/success/SuccessState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->Companion:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->$stable:I

    .line 116
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/success/SuccessState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCachedAccounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successContentRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0, p1, p7}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 37
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    .line 38
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 39
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 40
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->observeAsyncs()V

    .line 45
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p4, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;

    const/4 p5, 0x0

    invoke-direct {p4, p3, p2, p0, p5}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;-><init>(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    move-object p2, p4

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 62
    new-instance p4, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    const/4 p3, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/success/SuccessState;
    .locals 2

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 63
    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/financialconnections/features/success/SuccessState;->copy$default(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/success/SuccessState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$completeSession(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->completeSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 33
    sget-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getSuccessContentRepository$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final completeSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->invoke()Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete;-><init>(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final observeAsyncs()V
    .locals 4

    .line 78
    sget-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 77
    new-instance v1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$2;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$3;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method


# virtual methods
.method public final onDoneClick()Lkotlinx/coroutines/Job;
    .locals 7

    .line 92
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onDoneClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onDoneClick$1;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/success/SuccessState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 69
    sget-object v2, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 71
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/success/SuccessState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 68
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 33
    check-cast p1, Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/success/SuccessState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
