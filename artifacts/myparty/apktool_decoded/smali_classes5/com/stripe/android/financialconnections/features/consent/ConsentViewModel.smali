.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "ConsentViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 32\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u000223Bm\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020 J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0082@\u00a2\u0006\u0002\u0010&J\u001e\u0010\'\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0082@\u00a2\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020*J\u0008\u0010/\u001a\u00020 H\u0002J\u0008\u00100\u001a\u00020 H\u0002J\u0006\u00101\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
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
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "presentSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "lookupAccount",
        "Lcom/stripe/android/financialconnections/domain/LookupAccount;",
        "isLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "prefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "logErrors",
        "",
        "onContinueClick",
        "determineNavigationDestination",
        "Lcom/stripe/android/financialconnections/navigation/Destination;",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "hasExistingLinkAccount",
        "",
        "email",
        "",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onClickableTextClick",
        "Lkotlinx/coroutines/Job;",
        "uri",
        "presentDataAccessBottomSheet",
        "presentLegalDetailsBottomSheet",
        "onViewEffectLaunched",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;


# instance fields
.field private final acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

.field private final isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final lookupAccount:Lcom/stripe/android/financialconnections/domain/LookupAccount;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final prefillDetails:Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

.field private final presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;


# direct methods
.method public static synthetic $r8$lambda$1Eb7wT44umcXyamdINifyPFu_5Q(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->onContinueClick$lambda$1(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$f4supKSrJC_8JgfBwhRaIJR364I(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$idWIXKxi5T_C6BQKlfFx4I_NnHw(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->onViewEffectLaunched$lambda$3(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/consent/ConsentState;
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

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presentSheet"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupAccount"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkWithStripe"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 51
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    .line 52
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 53
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 54
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 55
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    .line 56
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 57
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 58
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->lookupAccount:Lcom/stripe/android/financialconnections/domain/LookupAccount;

    .line 59
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    .line 60
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->prefillDetails:Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    .line 64
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logErrors()V

    .line 65
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 77
    new-instance p4, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 8

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 77
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->copy$default(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$determineNavigationDestination(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->determineNavigationDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAcceptConsent$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$hasExistingLinkAccount(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->hasExistingLinkAccount(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$presentDataAccessBottomSheet(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->presentDataAccessBottomSheet()V

    return-void
.end method

.method public static final synthetic access$presentLegalDetailsBottomSheet(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->presentLegalDetailsBottomSheet()V

    return-void
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 48
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final determineNavigationDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/navigation/Destination;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 119
    iget v2, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p2

    invoke-static {p2}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p2

    .line 124
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->prefillDetails:Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getEmail()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 125
    :goto_1
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    invoke-interface {v4}, Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;->invoke()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 126
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAccountholderCustomerEmailAddress()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    if-nez v2, :cond_4

    goto :goto_3

    .line 133
    :cond_4
    iput-object p2, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$determineNavigationDestination$1;->label:I

    invoke-direct {p0, p1, v2, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->hasExistingLinkAccount(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 135
    sget-object p1, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    :cond_6
    return-object p1

    :cond_7
    :goto_3
    return-object p2
.end method

.method private final hasExistingLinkAccount(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v0

    iget-object p3, v9, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 141
    iget v1, v9, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 145
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    .line 146
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->lookupAccount:Lcom/stripe/android/financialconnections/domain/LookupAccount;

    .line 147
    sget-object p3, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v8

    .line 151
    sget-object v5, Lcom/stripe/android/model/EmailSource;->CUSTOMER_OBJECT:Lcom/stripe/android/model/EmailSource;

    .line 152
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getId()Ljava/lang/String;

    move-result-object v7

    .line 153
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAppVerificationEnabled()Z

    move-result v6

    .line 146
    iput v2, v9, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$hasExistingLinkAccount$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p2

    invoke-virtual/range {v1 .. v9}, Lcom/stripe/android/financialconnections/domain/LookupAccount;->invoke(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    .line 154
    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/model/ConsumerSessionLookup;

    invoke-virtual {p3}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 145
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    const/4 p2, 0x0

    .line 155
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    move-object p1, p2

    :cond_4
    return-object p1
.end method

.method private final logErrors()V
    .locals 10

    .line 92
    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 91
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 96
    move-object v4, p0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$4;

    move-object v5, v0

    check-cast v5, Lkotlin/reflect/KProperty1;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$5;

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$5;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onContinueClick$lambda$1(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 8

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p1

    .line 116
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->copy$default(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method private static final onViewEffectLaunched$lambda$3(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 8

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .line 213
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->copy$default(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method private final presentDataAccessBottomSheet()V
    .locals 3

    .line 197
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getConsent()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 198
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 199
    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 200
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 198
    invoke-interface {v1, v2, v0}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final presentLegalDetailsBottomSheet()V
    .locals 3

    .line 205
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getConsent()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 206
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 207
    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;-><init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 208
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 206
    invoke-interface {v1, v2, v0}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final onContinueClick()V
    .locals 6

    .line 107
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onContinueClick$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onContinueClick$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 116
    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda2;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 213
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 83
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getConsent()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getShouldShowMerchantLogos()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 85
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getConsent()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    .line 81
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 83
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 81
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 48
    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
