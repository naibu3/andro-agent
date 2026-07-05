.class public final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "AttachPaymentViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 &2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B[\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 H\u0002J\u0008\u0010\"\u001a\u00020\u001cH\u0002J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "successContentRepository",
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;",
        "pollAttachPaymentAccount",
        "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "getCachedAccounts",
        "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "isNetworkingRelinkSession",
        "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "setSuccessMessageIfNecessary",
        "",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "accounts",
        "",
        "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
        "logErrors",
        "onEnterDetailsManually",
        "onSelectAnotherBank",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final isNetworkingRelinkSession:Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

.field private final successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;


# direct methods
.method public static synthetic $r8$lambda$7eGlpAnsUDj5rQkxqbhkkUPmvPo(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->Companion:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->$stable:I

    .line 140
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ATTACH_LINKED_PAYMENT_ACCOUNT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successContentRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAttachPaymentAccount"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCachedAccounts"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isNetworkingRelinkSession"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 41
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    .line 42
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    .line 43
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 44
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    .line 45
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 46
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 47
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 48
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->isNetworkingRelinkSession:Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;

    .line 52
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->logErrors()V

    .line 53
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 80
    new-instance p4, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;
    .locals 1

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;->copy(Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetCachedAccounts$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    return-object p0
.end method

.method public static final synthetic access$setSuccessMessageIfNecessary(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/util/List;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->setSuccessMessageIfNecessary(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/util/List;)V

    return-void
.end method

.method private final logErrors()V
    .locals 6

    .line 107
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 108
    sget-object v1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 107
    new-instance v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final setSuccessMessageIfNecessary(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
            ">;)V"
        }
    .end annotation

    .line 95
    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModelKt;->access$getCanSetCustomLinkSuccessMessage(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->isNetworkingRelinkSession:Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;->invoke()Z

    move-result p1

    if-nez p1, :cond_0

    .line 96
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    .line 97
    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;

    .line 98
    sget v1, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_link_success_singular:I

    .line 99
    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_link_success_plural:I

    .line 100
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 97
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;-><init>(IIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/financialconnections/ui/TextResource;

    const/4 p2, 0x2

    const/4 v1, 0x0

    .line 96
    invoke-static {p1, v0, v1, p2, v1}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;->set$default(Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onEnterDetailsManually()V
    .locals 6

    .line 121
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method public final onSelectAnotherBank()V
    .locals 6

    .line 124
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$Reset;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Reset;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 85
    sget-object v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 87
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;->getLinkPaymentAccount()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 84
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 38
    check-cast p1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
