.class public final Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "ErrorViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/error/ErrorState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 !2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !BC\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\u0008\u0010\u0018\u001a\u00020\u0016H\u0002J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0008\u0010\u001f\u001a\u00020\u0016H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/error/ErrorState;",
        "initialState",
        "coordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "errorRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/error/ErrorState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "logErrors",
        "",
        "onManualEntryClick",
        "reset",
        "close",
        "error",
        "",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onSelectAnotherBank",
        "Lkotlinx/coroutines/Job;",
        "onCleared",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final errorRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;


# direct methods
.method public static synthetic $r8$lambda$rKCJoj5t54PyJ25gl_qzEI5zH28(Lcom/stripe/android/financialconnections/features/error/ErrorState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/error/ErrorState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->Companion:Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->$stable:I

    .line 134
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/error/ErrorState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/error/ErrorState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 31
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    .line 32
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 33
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->errorRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;

    .line 34
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 35
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 36
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->logErrors()V

    .line 41
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 51
    new-instance p4, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/error/ErrorState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/error/ErrorState;
    .locals 1

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;->copy(Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/error/ErrorState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCoordinator$p(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getErrorRepository$p(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->errorRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 29
    sget-object v0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$reset(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->reset()V

    return-void
.end method

.method private final logErrors()V
    .locals 6

    .line 67
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 68
    sget-object v1, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$logErrors$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 67
    new-instance v2, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$logErrors$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final reset()V
    .locals 6

    .line 92
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 93
    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$Reset;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Reset;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 94
    new-instance v2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;-><init>(Z)V

    check-cast v2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 92
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final close(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->invoke()Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$CloseWithError;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$CloseWithError;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1, p2}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method protected onCleared()V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->errorRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsErrorRepository;->clear()V

    .line 117
    invoke-super {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onCleared()V

    return-void
.end method

.method public final onManualEntryClick()V
    .locals 6

    .line 86
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 87
    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 86
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method public final onSelectAnotherBank()Lkotlinx/coroutines/Job;
    .locals 7

    .line 102
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$onSelectAnotherBank$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$onSelectAnotherBank$1;-><init>(Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/error/ErrorState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->getError()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/error/ErrorState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v0

    :cond_1
    move-object v4, v0

    .line 59
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 60
    sget-object v2, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 59
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 29
    check-cast p1, Lcom/stripe/android/financialconnections/features/error/ErrorState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/error/ErrorViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/error/ErrorState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
