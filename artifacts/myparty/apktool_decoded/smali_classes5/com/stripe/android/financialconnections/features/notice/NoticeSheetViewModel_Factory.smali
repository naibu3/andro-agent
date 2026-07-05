.class public final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;
.super Ljava/lang/Object;
.source "NoticeSheetViewModel_Factory.java"


# instance fields
.field private final handleClickableUrlProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
            ">;"
        }
    .end annotation
.end field

.field private final nativeAuthFlowCoordinatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final noticeSheetContentRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->nativeAuthFlowCoordinatorProvider:Ldagger/internal/Provider;

    .line 45
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->navigationManagerProvider:Ldagger/internal/Provider;

    .line 46
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->noticeSheetContentRepositoryProvider:Ldagger/internal/Provider;

    .line 47
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->handleClickableUrlProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;"
        }
    .end annotation

    .line 67
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;"
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;
    .locals 6

    .line 74
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;)V

    return-object v0
.end method


# virtual methods
.method public get(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;
    .locals 4

    .line 51
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->nativeAuthFlowCoordinatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->navigationManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/navigation/NavigationManager;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->noticeSheetContentRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->handleClickableUrlProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    move-result-object p1

    return-object p1
.end method
