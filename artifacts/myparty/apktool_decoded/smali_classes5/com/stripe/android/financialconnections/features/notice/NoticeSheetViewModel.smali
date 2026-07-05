.class public final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "NoticeSheetViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB3\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0008\u0010\u0018\u001a\u00020\u000fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "noticeSheetContentRepository",
        "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;",
        "handleClickableUrl",
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;)V",
        "loadNoticeSheetContent",
        "",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "handleClickableTextClick",
        "uri",
        "",
        "handleConfirmModalClick",
        "onViewEffectLaunched",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;


# instance fields
.field private final handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;


# direct methods
.method public static synthetic $r8$lambda$8L-09rDQoZj9YAemFtnyyEzgIJA(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->onViewEffectLaunched$lambda$0(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->Companion:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noticeSheetContentRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleClickableUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 32
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 33
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    .line 34
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    .line 41
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->loadNoticeSheetContent()V

    return-void
.end method

.method public static final synthetic access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getNoticeSheetContentRepository$p(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;)Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final loadNoticeSheetContent()V
    .locals 7

    .line 45
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final onViewEffectLaunched$lambda$0(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 7

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 83
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->copy$default(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final handleClickableTextClick(Ljava/lang/String;)V
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final handleConfirmModalClick()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-interface {v0}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    return-void
.end method

.method protected onCleared()V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;->clear()V

    .line 89
    invoke-super {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onCleared()V

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 82
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 29
    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
