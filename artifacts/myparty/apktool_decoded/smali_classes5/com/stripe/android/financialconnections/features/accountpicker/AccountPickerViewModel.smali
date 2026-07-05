.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "AccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Factory;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,458:1\n2632#2,3:459\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel\n*L\n157#1:459,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 @2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002?@Bk\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0002J\u0008\u0010!\u001a\u00020 H\u0002J\u001e\u0010\"\u001a\u00020 2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'H\u0002J\u0008\u0010(\u001a\u00020 H\u0002J\u0008\u0010)\u001a\u00020 H\u0002J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020%J,\u0010,\u001a\u00020 2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u000202H\u0002J\u0006\u00103\u001a\u00020 J\u001e\u00104\u001a\u00020 2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0006\u00106\u001a\u000202H\u0002J\u0006\u00107\u001a\u00020 J\u0006\u00108\u001a\u00020 J\u0006\u00109\u001a\u00020 J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020/J\u0008\u0010=\u001a\u00020 H\u0002J\u0006\u0010>\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "consumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "saveAccountToLink",
        "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;",
        "selectAccounts",
        "Lcom/stripe/android/financialconnections/domain/SelectAccounts;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "handleClickableUrl",
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "pollAuthorizationSessionAccounts",
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
        "presentSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "loadInstitution",
        "",
        "loadAccounts",
        "throwErrorIfNoSelectableAccounts",
        "accounts",
        "",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "onPayloadLoaded",
        "logErrors",
        "onAccountClicked",
        "account",
        "logAccountSelectionChanges",
        "idsBefore",
        "",
        "",
        "idsAfter",
        "isSingleAccount",
        "",
        "onSubmit",
        "submitAccounts",
        "selectedIds",
        "isSkipAccountSelection",
        "selectAnotherBank",
        "onEnterDetailsManually",
        "onLoadAccountsAgain",
        "onClickableTextClick",
        "Lkotlinx/coroutines/Job;",
        "uri",
        "presentDataAccessBottomSheet",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final pollAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

.field private final presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

.field private final saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

.field private final selectAccounts:Lcom/stripe/android/financialconnections/domain/SelectAccounts;


# direct methods
.method public static synthetic $r8$lambda$2bcC54_Qd3Fob4aoYkVAA0SVGJs(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onViewEffectLaunched$lambda$12(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3a1hg6DkgNmP2R8brg89xomYCdo(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->submitAccounts$lambda$10(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$KO2B_rqwBQxpgWJJgDUSVj7Ixq4(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts$lambda$1(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SIyXhMbVYXyGZv65boIyNxG5Yqo(Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onAccountClicked$lambda$6$lambda$4$lambda$3(Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fpXW8arpGXN0Dv82HV_bsgmjoUw(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onSubmit$lambda$9(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$jyIjSrzYeBiiaOzJE-uP2r-viz0(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadInstitution$lambda$0(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nDKDMSS9O_LhhG3Lv1MnG9VfOWQ(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onAccountClicked$lambda$6(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$t0TEm3Taq76tkEKpEh1Swm8LmAE(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onLoadAccountsAgain$lambda$11(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->$stable:I

    .line 405
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveAccountToLink"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectAccounts"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleClickableUrl"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAuthorizationSessionAccounts"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presentSheet"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 63
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 64
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    .line 65
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    .line 66
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->selectAccounts:Lcom/stripe/android/financialconnections/domain/SelectAccounts;

    .line 67
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 68
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 69
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    .line 70
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 71
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->pollAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    .line 72
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 76
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logErrors()V

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onPayloadLoaded()V

    .line 78
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadInstitution()V

    .line 79
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts()V

    return-void
.end method

.method public static final synthetic access$getConsumerSessionProvider$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 60
    sget-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getPollAuthorizationSessionAccounts$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->pollAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    return-object p0
.end method

.method public static final synthetic access$getSaveAccountToLink$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    return-object p0
.end method

.method public static final synthetic access$getSelectAccounts$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/SelectAccounts;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->selectAccounts:Lcom/stripe/android/financialconnections/domain/SelectAccounts;

    return-object p0
.end method

.method public static final synthetic access$presentDataAccessBottomSheet(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->presentDataAccessBottomSheet()V

    return-void
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$submitAccounts(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/util/Set;Z)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->submitAccounts(Ljava/util/Set;Z)V

    return-void
.end method

.method public static final synthetic access$throwErrorIfNoSelectableAccounts(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->throwErrorIfNoSelectableAccounts(Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-void
.end method

.method private final loadAccounts()V
    .locals 6

    .line 101
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 150
    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda4;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda4;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final loadAccounts$lambda$1(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 10

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    .line 150
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private final loadInstitution()V
    .locals 6

    .line 91
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadInstitution$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadInstitution$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 95
    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda1;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final loadInstitution$lambda$0(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 10

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 96
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private final logAccountSelectionChanges(Ljava/util/Set;Ljava/util/Set;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 271
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logAccountSelectionChanges$1;

    const/4 v7, 0x0

    move-object v5, p0

    move-object v4, p1

    move-object v3, p2

    move v6, p3

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logAccountSelectionChanges$1;-><init>(Ljava/util/Set;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;ZLkotlin/coroutines/Continuation;)V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final logErrors()V
    .locals 7

    .line 220
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 221
    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 220
    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$2;

    const/4 v6, 0x0

    invoke-direct {v2, p0, v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 232
    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$3;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 231
    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$4;

    invoke-direct {v2, p0, v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$4;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onAccountClicked$lambda$6(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;
    .locals 4

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v1, 0x2

    if-eqz v0, :cond_3

    .line 246
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getSelectedIds()Ljava/util/Set;

    move-result-object p2

    .line 247
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->getSelectionMode()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    if-ne v2, v1, :cond_1

    .line 249
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 250
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    .line 252
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    .line 247
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 248
    :cond_2
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    .line 255
    :goto_0
    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda0;-><init>(Ljava/util/Set;)V

    invoke-virtual {p0, v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 259
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->getSingleAccount()Z

    move-result v0

    .line 256
    invoke-direct {p0, p2, p1, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logAccountSelectionChanges(Ljava/util/Set;Ljava/util/Set;Z)V

    goto :goto_1

    .line 262
    :cond_3
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string p1, "account clicked without available payload."

    const/4 p2, 0x0

    invoke-static {p0, p1, p2, v1, p2}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 264
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onAccountClicked$lambda$6$lambda$4$lambda$3(Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 10

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x2f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, p0

    move-object v1, p1

    .line 255
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private static final onLoadAccountsAgain$lambda$11(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 10

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    .line 358
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private final onPayloadLoaded()V
    .locals 6

    .line 171
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onSubmit$lambda$9(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    if-eqz v0, :cond_0

    .line 305
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getSelectedIds()Ljava/util/Set;

    move-result-object p1

    const/4 v0, 0x0

    .line 304
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->submitAccounts(Ljava/util/Set;Z)V

    goto :goto_0

    .line 309
    :cond_0
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string p1, "account clicked without available payload."

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 311
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onViewEffectLaunched$lambda$12(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 10

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    .line 388
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private final presentDataAccessBottomSheet()V
    .locals 4

    .line 379
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 380
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;

    sget-object v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 381
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 382
    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 381
    invoke-interface {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final submitAccounts(Ljava/util/Set;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 318
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$submitAccounts$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$submitAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/util/Set;ZLkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 346
    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda2;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final submitAccounts$lambda$10(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 10

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v5, p1

    .line 347
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private final throwErrorIfNoSelectableAccounts(Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ")V"
        }
    .end annotation

    .line 157
    check-cast p1, Ljava/lang/Iterable;

    .line 459
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 460
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    .line 157
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 158
    :cond_2
    :goto_0
    new-instance p1, Lcom/stripe/android/financialconnections/exception/AccountLoadError;

    .line 159
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result v0

    .line 161
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object p2

    if-nez p2, :cond_3

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 162
    :cond_3
    new-instance v1, Lcom/stripe/android/core/exception/LocalStripeException;

    .line 163
    const-string v2, "No accounts available to select."

    const/4 v3, 0x0

    .line 162
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/core/exception/StripeException;

    const/4 v2, 0x1

    .line 158
    invoke-direct {p1, v0, v2, p2, v1}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;-><init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V

    throw p1
.end method


# virtual methods
.method public final onAccountClicked(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V
    .locals 1

    const-string v0, "account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final onEnterDetailsManually()V
    .locals 6

    .line 355
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

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

.method public final onLoadAccountsAgain()V
    .locals 1

    .line 358
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda5;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 359
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts()V

    return-void
.end method

.method public final onSubmit()V
    .locals 8

    .line 298
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSubmit$1;

    const/4 v7, 0x0

    invoke-direct {v0, p0, v7}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 301
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ACCOUNTS_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v2, 0x2

    invoke-static {v0, v1, v7, v2, v7}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    .line 302
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 388
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final selectAnotherBank()V
    .locals 6

    .line 352
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$Reset;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Reset;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

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

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 84
    sget-object v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 86
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 83
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 60
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
