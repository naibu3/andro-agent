.class public final Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "IDConsentContentViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBK\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\u0008\u0010\u001d\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "acceptConsent",
        "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "handleClickableUrl",
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
        "presentSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "onContinueClick",
        "",
        "onClickableTextClick",
        "uri",
        "",
        "onViewEffectLaunched",
        "presentLegalDetailsBottomSheet",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;


# direct methods
.method public static synthetic $r8$lambda$3m_lX4qAGCbwxStyN5ZaZsnsfd8(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->onViewEffectLaunched$lambda$2(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$F88wG_Q8REWSww8QpES5SLTr7MY(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UYN-fg_HvtyaBDU0g7kWSE3QDjI(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->presentLegalDetailsBottomSheet$lambda$3(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WjG2mnqNtWxqxD7jECHiJTNrH-Y(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->onContinueClick$lambda$1(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->Companion:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->$stable:I

    .line 107
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ID_CONSENT_CONTENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleClickableUrl"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presentSheet"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 34
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    .line 35
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 36
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 37
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 38
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    .line 39
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 43
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 48
    new-instance p4, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda3;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda3;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 7

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 48
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->copy$default(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAcceptConsent$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 31
    sget-object v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$presentLegalDetailsBottomSheet(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->presentLegalDetailsBottomSheet()V

    return-void
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final onContinueClick$lambda$1(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
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

    .line 67
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->copy$default(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method

.method private static final onViewEffectLaunched$lambda$2(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 7

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 87
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->copy$default(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method

.method private final presentLegalDetailsBottomSheet()V
    .locals 1

    .line 91
    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;)V

    invoke-static {p0, v0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModelKt;->access$withPayload(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final presentLegalDetailsBottomSheet$lambda$3(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;->getIdConsentContentPane()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/IDConsentContentPane;->getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    move-result-object p1

    .line 93
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 94
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;-><init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    check-cast v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 95
    sget-object p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 93
    invoke-interface {p0, v0, p1}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 97
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final onClickableTextClick(Ljava/lang/String;)V
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onContinueClick()V
    .locals 6

    .line 61
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$onContinueClick$1;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 67
    new-instance v3, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda2;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 87
    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    sget-object v2, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 56
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    .line 52
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    const/4 p1, 0x0

    .line 54
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v8, 0x28

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 52
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 31
    check-cast p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
