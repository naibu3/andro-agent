.class public final Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "ExitViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/exit/ExitState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBC\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0008\u0010\u0018\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/exit/ExitState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "coordinator",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "onCloseConfirm",
        "Lkotlinx/coroutines/Job;",
        "onCloseDismiss",
        "",
        "logErrors",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;


# direct methods
.method public static synthetic $r8$lambda$2R-A88PFgujnRDWGMSDXfDS_3Zs(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/exit/ExitState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/exit/ExitState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->Companion:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->$stable:I

    .line 109
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->EXIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/exit/ExitState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 32
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 33
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    .line 34
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 35
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 36
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->logErrors()V

    .line 41
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 66
    new-instance p4, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/exit/ExitState;
    .locals 7

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    .line 66
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/exit/ExitState;->copy$default(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/exit/ExitState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCoordinator$p(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 29
    sget-object v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final logErrors()V
    .locals 6

    .line 83
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 84
    sget-object v1, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$logErrors$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 83
    new-instance v2, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$logErrors$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final onCloseConfirm()Lkotlinx/coroutines/Job;
    .locals 7

    .line 73
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$onCloseConfirm$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$onCloseConfirm$1;-><init>(Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method public final onCloseDismiss()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-interface {v0}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/exit/ExitState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 29
    check-cast p1, Lcom/stripe/android/financialconnections/features/exit/ExitState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/exit/ExitState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
