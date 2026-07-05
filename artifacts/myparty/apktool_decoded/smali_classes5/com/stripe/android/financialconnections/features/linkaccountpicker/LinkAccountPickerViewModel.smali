.class public final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "LinkAccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Factory;,
        Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n295#2,2:539\n1#3:541\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel\n*L\n381#1:539,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 D2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002CDBs\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0008\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u0008\u0010*\u001a\u00020\"H\u0002J\u0006\u0010+\u001a\u00020\'J\u0006\u0010,\u001a\u00020\"J,\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020)2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020)02H\u0082@\u00a2\u0006\u0002\u00103J \u00104\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0008\u00105\u001a\u0004\u0018\u000106H\u0082@\u00a2\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020:H\u0002J\u000e\u0010;\u001a\u00020\"2\u0006\u00109\u001a\u00020:J\u0016\u0010<\u001a\u0004\u0018\u00010=*\u00020:2\u0006\u0010$\u001a\u00020%H\u0002J\u000c\u0010>\u001a\u00020\"*\u00020=H\u0002J\u0010\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "consumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "handleClickableUrl",
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;",
        "fetchNetworkedAccounts",
        "Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;",
        "selectNetworkedAccounts",
        "Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;",
        "updateCachedAccounts",
        "Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;",
        "getSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "acceptConsent",
        "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
        "presentSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "observeAsyncs",
        "",
        "skipToNextPane",
        "payload",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;",
        "onClickableTextClick",
        "Lkotlinx/coroutines/Job;",
        "uri",
        "",
        "presentDataAccessBottomSheet",
        "onNewBankAccountClick",
        "onSelectAccountsClick",
        "selectAccounts",
        "acquireConsentOnPrimaryCtaClick",
        "",
        "consumerSessionClientSecret",
        "accountIds",
        "",
        "(ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleNonSuccessNextPane",
        "nextPane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logAccountClick",
        "partnerAccount",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "onAccountClick",
        "computeDrawerPayload",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        "present",
        "logUpdateRequired",
        "type",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

.field private final consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final fetchNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;

.field private final getSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

.field private final selectNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

.field private final updateCachedAccounts:Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;


# direct methods
.method public static synthetic $r8$lambda$8OlA0Gq2_q3s3jYpBYld3jfMcbI(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Ljava/util/List;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->onAccountClick$lambda$2(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Ljava/util/List;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BLYYnuXpmspMsUFNOzsERd1ZJX0(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FTGRf1zvMPudnV9xILxZmhHRhsQ(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->onSelectAccountsClick$lambda$1(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oPD4WUFytGjAzKHZkpssZ_Nak-Y(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->onViewEffectLaunched$lambda$6(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->$stable:I

    .line 442
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
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

    const-string v0, "handleClickableUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchNetworkedAccounts"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectNetworkedAccounts"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateCachedAccounts"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getSync"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presentSheet"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 68
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 69
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    .line 70
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    .line 71
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->fetchNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;

    .line 72
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->selectNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

    .line 73
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->updateCachedAccounts:Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;

    .line 74
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->getSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 75
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 76
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 77
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    .line 78
    iput-object p13, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 82
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->observeAsyncs()V

    .line 83
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 126
    new-instance p4, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda2;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda2;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
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

    .line 127
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$computeDrawerPayload(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->computeDrawerPayload(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAcceptConsent$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    return-object p0
.end method

.method public static final synthetic access$getConsumerSessionProvider$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getFetchNetworkedAccounts$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->fetchNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;

    return-object p0
.end method

.method public static final synthetic access$getGetSync$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->getSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->handleClickableUrl:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 65
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getUpdateCachedAccounts$p(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->updateCachedAccounts:Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;

    return-object p0
.end method

.method public static final synthetic access$handleNonSuccessNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->handleNonSuccessNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$present(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->present(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V

    return-void
.end method

.method public static final synthetic access$presentDataAccessBottomSheet(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->presentDataAccessBottomSheet()V

    return-void
.end method

.method public static final synthetic access$selectAccounts(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->selectAccounts(ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$skipToNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->skipToNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)V

    return-void
.end method

.method private final computeDrawerPayload(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;
    .locals 5

    .line 381
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getAccounts()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 539
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 381
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    if-eqz v1, :cond_2

    .line 382
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getDisplay()Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;->getDrawerOnSelection()LFinancialConnectionsGenericInfoScreen;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_9

    .line 385
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModelKt;->access$withIcon(LFinancialConnectionsGenericInfoScreen;Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 387
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getNextPaneOnSelection()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    if-nez v3, :cond_4

    const/4 v3, -0x1

    goto :goto_3

    :cond_4
    sget-object v4, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ordinal()I

    move-result v3

    aget v3, v4, v3

    :goto_3
    const/4 v4, 0x1

    if-eq v3, v4, :cond_8

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    const/4 p1, 0x3

    if-eq v3, p1, :cond_5

    goto :goto_5

    .line 401
    :cond_5
    new-instance p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    .line 403
    new-instance p2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;

    invoke-direct {p2, v2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    check-cast p2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;

    .line 401
    invoke-direct {p1, v1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;-><init>(LFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V

    goto :goto_6

    .line 391
    :cond_6
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAuthorization()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getPartnerToCoreAuths()Ljava/util/Map;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-static {p2, v3}, Lkotlin/collections/MapsKt;->getValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object p2, v2

    .line 392
    :goto_4
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object p1

    .line 390
    new-instance v3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;

    invoke-direct {v3, p2, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    check-cast v3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;

    .line 388
    new-instance p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    invoke-direct {p1, v1, v3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;-><init>(LFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V

    goto :goto_6

    .line 395
    :cond_8
    new-instance p2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    .line 397
    new-instance v3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;

    .line 398
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object p1

    .line 397
    invoke-direct {v3, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    check-cast v3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;

    .line 395
    invoke-direct {p2, v1, v3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;-><init>(LFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V

    move-object p1, p2

    goto :goto_6

    :cond_9
    :goto_5
    move-object p1, v2

    :goto_6
    if-eqz p1, :cond_a

    .line 414
    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    return-object p1

    :cond_a
    if-eqz v0, :cond_b

    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Generic;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Generic;-><init>(LFinancialConnectionsGenericInfoScreen;)V

    :cond_b
    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    return-object v2
.end method

.method private final handleNonSuccessNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;

    iget v4, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 286
    iget v5, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->label:I

    const/4 v6, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-nez v1, :cond_3

    move v2, v6

    goto :goto_1

    .line 287
    :cond_3
    sget-object v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ordinal()I

    move-result v5

    aget v2, v2, v5

    :goto_1
    if-eq v2, v6, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v8, :cond_4

    goto :goto_2

    .line 297
    :cond_4
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 299
    new-instance v5, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;

    const-string v10, "ConnectRepairAccountError"

    invoke-direct {v5, v10, v9, v8, v9}, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v5, Ljava/lang/Throwable;

    .line 300
    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 301
    sget-object v11, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 297
    const-string v12, "Connecting a repair account, but user shouldn\'t be able to."

    invoke-static {v2, v12, v5, v10, v11}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    goto :goto_2

    .line 289
    :cond_5
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 291
    new-instance v5, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;

    const-string v10, "ConnectSupportabilityAccountError"

    invoke-direct {v5, v10, v9, v8, v9}, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v5, Ljava/lang/Throwable;

    .line 292
    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 293
    sget-object v11, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 289
    const-string v12, "Connecting a supportability account, but user shouldn\'t be able to."

    invoke-static {v2, v12, v5, v10, v11}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    goto :goto_2

    .line 305
    :cond_6
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 307
    new-instance v5, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;

    const-string v10, "ConnectUnselectedAccountError"

    invoke-direct {v5, v10, v9, v8, v9}, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v5, Ljava/lang/Throwable;

    .line 308
    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 309
    sget-object v11, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 305
    const-string v12, "Selected connect account, but next pane is NULL."

    invoke-static {v2, v12, v5, v10, v11}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 317
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getAcquireConsentOnPrimaryCtaClick()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 318
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    iput-object v0, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->L$1:Ljava/lang/Object;

    iput v7, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$handleNonSuccessNextPane$1;->label:I

    invoke-virtual {v2, v3}, Lcom/stripe/android/financialconnections/domain/AcceptConsent;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    return-object v4

    :cond_7
    move-object v3, v0

    :goto_3
    if-nez v1, :cond_8

    move v2, v6

    goto :goto_4

    .line 321
    :cond_8
    sget-object v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ordinal()I

    move-result v4

    aget v2, v2, v4

    :goto_4
    if-eq v2, v6, :cond_a

    if-eq v2, v7, :cond_9

    if-eq v2, v8, :cond_9

    goto :goto_5

    .line 325
    :cond_9
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_5

    .line 327
    :cond_a
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 331
    :goto_5
    invoke-static {v1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-static {v1, v2, v9, v8, v9}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 332
    iget-object v10, v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 333
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final logAccountClick(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V
    .locals 4

    .line 336
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    .line 337
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    if-nez v0, :cond_0

    return-void

    .line 338
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccountIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    .line 340
    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountSelected;

    .line 341
    sget-object v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 343
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSingleAccount()Z

    move-result v0

    .line 344
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    .line 340
    invoke-direct {v2, v3, v1, v0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountSelected;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZZLjava/lang/String;)V

    .line 347
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {p1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-void
.end method

.method private final logUpdateRequired(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V
    .locals 3

    .line 424
    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;

    if-eqz v0, :cond_0

    const-string p1, "click.supportability_account"

    goto :goto_0

    .line 425
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;

    if-eqz p1, :cond_1

    const-string p1, "click.repair_accounts"

    .line 428
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;

    sget-object v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-void

    .line 423
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final observeAsyncs()V
    .locals 10

    .line 141
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 140
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$2;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$3;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 157
    move-object v4, p0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 158
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$4;

    move-object v5, v0

    check-cast v5, Lkotlin/reflect/KProperty1;

    .line 157
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$5;

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$5;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onAccountClick$lambda$2(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Ljava/util/List;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 18

    const-string v0, "$this$setState"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 373
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/16 v16, 0x1ffb

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v5, p1

    invoke-static/range {v2 .. v17}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->copy$default(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v5, 0x6

    .line 372
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object v0

    return-object v0
.end method

.method private static final onSelectAccountsClick$lambda$1(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
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

    .line 267
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private static final onViewEffectLaunched$lambda$6(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 7

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 432
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method private final present(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V
    .locals 2

    .line 418
    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;->getType()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logUpdateRequired(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V

    .line 419
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    sget-object v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-interface {v0, p1, v1}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    return-void
.end method

.method private final presentDataAccessBottomSheet()V
    .locals 4

    .line 200
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->getActiveDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 201
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;

    sget-object v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 202
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 203
    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 202
    invoke-interface {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    return-void
.end method

.method private final selectAccounts(ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 270
    iget v2, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 275
    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->selectNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

    .line 278
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 275
    iput-object p0, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$selectAccounts$1;->label:I

    invoke-virtual {p4, p2, p3, p1, v0}, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->invoke(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 270
    :goto_1
    check-cast p4, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;

    .line 280
    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p2

    if-nez p2, :cond_4

    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 282
    :cond_4
    sget-object p3, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object p4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ACCOUNTS_SELECTED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p3, p4, v0, v1, v0}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    .line 283
    iget-object v2, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-static {p2}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-static {p1, p2, v0, v1, v0}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 284
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final skipToNextPane(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)V
    .locals 6

    .line 171
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getNextPaneOnNewAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 174
    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p1

    sget-object v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v3, v2, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 177
    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/Destination;->getFullRoute()Ljava/lang/String;

    move-result-object p1

    .line 175
    new-instance v2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;-><init>(ZLjava/lang/String;)V

    check-cast v2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 173
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final onAccountClick(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V
    .locals 3

    const-string v0, "partnerAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->logAccountClick(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V

    .line 353
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    .line 357
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getAcquireConsentOnPrimaryCtaClick()Z

    move-result v1

    if-nez v1, :cond_0

    .line 358
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->computeDrawerPayload(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 360
    invoke-direct {p0, v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->present(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V

    return-void

    .line 366
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSingleAccount()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 367
    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccountIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccountIds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 368
    :cond_2
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccountIds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 371
    :goto_0
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Ljava/util/List;)V

    invoke-virtual {p0, v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 353
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final onNewBankAccountClick()Lkotlinx/coroutines/Job;
    .locals 7

    .line 208
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onNewBankAccountClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onNewBankAccountClick$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method public final onSelectAccountsClick()V
    .locals 6

    .line 215
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$onSelectAccountsClick$1;-><init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 267
    new-instance v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda1;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 432
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 133
    sget-object v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 135
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 132
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 65
    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
