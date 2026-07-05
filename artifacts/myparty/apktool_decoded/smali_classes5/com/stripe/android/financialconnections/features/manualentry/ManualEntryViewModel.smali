.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "ManualEntryViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManualEntryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryViewModel.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n81#2:215\n107#2,2:216\n81#2:218\n107#2,2:219\n81#2:221\n107#2,2:222\n434#3:224\n507#3,5:225\n434#3:230\n507#3,5:231\n434#3:236\n507#3,5:237\n1#4:242\n*S KotlinDebug\n*F\n+ 1 ManualEntryViewModel.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel\n*L\n57#1:215\n57#1:216,2\n58#1:218\n58#1:219,2\n59#1:221\n59#1:222,2\n131#1:224\n131#1:225,5\n135#1:230\n135#1:231,5\n139#1:236\n139#1:237,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u0000 @2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002?@BS\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0002H\u0016J\u0008\u00105\u001a\u000206H\u0002J\u000e\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0017J\u000e\u00109\u001a\u0002062\u0006\u00108\u001a\u00020\u0017J\u000e\u0010:\u001a\u0002062\u0006\u00108\u001a\u00020\u0017J\u0006\u0010;\u001a\u000206J\u000e\u0010<\u001a\u000206H\u0082@\u00a2\u0006\u0002\u0010=J\u0006\u0010>\u001a\u000206R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR/\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008 \u0010\u001a\"\u0004\u0008!\u0010\u001cR/\u0010#\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008&\u0010\u001e\u001a\u0004\u0008$\u0010\u001a\"\u0004\u0008%\u0010\u001cR\u0011\u0010\'\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u001aR\u0011\u0010)\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u001aR\u0011\u0010+\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u001aR\u0017\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "pollAttachPaymentAccount",
        "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
        "successContentRepository",
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;",
        "updateCachedAccounts",
        "Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V",
        "<set-?>",
        "",
        "_routing",
        "get_routing",
        "()Ljava/lang/String;",
        "set_routing",
        "(Ljava/lang/String;)V",
        "_routing$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "_account",
        "get_account",
        "set_account",
        "_account$delegate",
        "_accountConfirm",
        "get_accountConfirm",
        "set_accountConfirm",
        "_accountConfirm$delegate",
        "routing",
        "getRouting",
        "account",
        "getAccount",
        "accountConfirm",
        "getAccountConfirm",
        "form",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;",
        "getForm",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "observeAsyncs",
        "",
        "onRoutingEntered",
        "input",
        "onAccountEntered",
        "onAccountConfirmEntered",
        "onSubmit",
        "clearCachedAccounts",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onTestFill",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final _account$delegate:Landroidx/compose/runtime/MutableState;

.field private final _accountConfirm$delegate:Landroidx/compose/runtime/MutableState;

.field private final _routing$delegate:Landroidx/compose/runtime/MutableState;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final form:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;",
            ">;"
        }
    .end annotation
.end field

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

.field private final successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

.field private final updateCachedAccounts:Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;


# direct methods
.method public static synthetic $r8$lambda$54DM4oIoS6jInYvSgDaqa0_ha9U(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->form$lambda$1(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$CKCcK8D-X1xtPX4KrdNiCVVMx30(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->onSubmit$lambda$8(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$L5Yz8CMm0Y_toSCIi3-ot45TEMg(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->form$lambda$0(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UFlaArfo8eHjivZ0JQ3wv8BGjPw(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->form$lambda$2(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$iS88WUKJHQK1mbPtxHFtOMjH3lE(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_init_$lambda$4(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->Companion:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->$stable:I

    .line 199
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V
    .locals 7
    .param p1    # Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    move-object/from16 v3, p9

    const-string v4, "initialState"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nativeAuthFlowCoordinator"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "pollAttachPaymentAccount"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "successContentRepository"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "updateCachedAccounts"

    invoke-static {p5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "eventTracker"

    invoke-static {p6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "getOrFetchSync"

    invoke-static {p7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "navigationManager"

    invoke-static {p8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "logger"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct/range {p0 .. p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 46
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    .line 47
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    .line 49
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->updateCachedAccounts:Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;

    .line 50
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 51
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 52
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 53
    iput-object v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->logger:Lcom/stripe/android/core/Logger;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 57
    invoke-static {p1, p1, p2, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_routing$delegate:Landroidx/compose/runtime/MutableState;

    .line 58
    invoke-static {p1, p1, p2, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_account$delegate:Landroidx/compose/runtime/MutableState;

    .line 59
    invoke-static {p1, p1, p2, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_accountConfirm$delegate:Landroidx/compose/runtime/MutableState;

    .line 66
    new-instance p2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda1;

    invoke-direct {p2, p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)V

    invoke-static {p2}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p2

    .line 67
    new-instance p3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda2;

    invoke-direct {p3, p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)V

    invoke-static {p3}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p3

    .line 68
    new-instance p4, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda3;

    invoke-direct {p4, p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)V

    invoke-static {p4}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p4

    .line 69
    sget-object p5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$form$6;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$form$6;

    check-cast p5, Lkotlin/jvm/functions/Function4;

    .line 65
    invoke-static {p2, p3, p4, p5}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p2

    .line 71
    move-object p3, p0

    check-cast p3, Landroidx/lifecycle/ViewModel;

    invoke-static {p3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p3

    .line 72
    sget-object v0, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v1, 0x1388

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object p4

    .line 73
    new-instance p5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;

    invoke-direct {p5, p1, p1, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    invoke-static {p2, p3, p4, p5}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->form:Lkotlinx/coroutines/flow/StateFlow;

    .line 81
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->observeAsyncs()V

    .line 82
    move-object p3, p0

    check-cast p3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$1;

    invoke-direct {p2, p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    move-object p4, p2

    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 91
    new-instance p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda4;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda4;-><init>()V

    const/4 p2, 0x1

    const/4 p5, 0x0

    const/4 v0, 0x0

    move-object p6, p1

    move p7, p2

    move-object p8, p5

    move-object p5, v0

    invoke-static/range {p3 .. p8}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$4(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 2

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 92
    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->copy$default(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$clearCachedAccounts(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->clearCachedAccounts(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$form$lambda$3(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->form$lambda$3(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 44
    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    return-object p0
.end method

.method public static final synthetic access$getSuccessContentRepository$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    return-object p0
.end method

.method private final clearCachedAccounts(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 174
    iget v2, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 175
    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->updateCachedAccounts:Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    iput v3, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$clearCachedAccounts$1;->label:I

    invoke-virtual {p1, v2, v0}, Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;->invoke(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final form$lambda$0(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->get_routing()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final form$lambda$1(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->get_account()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final form$lambda$2(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Ljava/lang/String;
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->get_accountConfirm()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic form$lambda$3(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 69
    new-instance p3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;

    invoke-direct {p3, p0, p1, p2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method

.method private final get_account()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_account$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 218
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final get_accountConfirm()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_accountConfirm$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 221
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final get_routing()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_routing$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 215
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final observeAsyncs()V
    .locals 7

    .line 105
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 106
    sget-object v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 105
    new-instance v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$2;

    const/4 v6, 0x0

    invoke-direct {v2, p0, v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$2;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 118
    sget-object v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$3;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 117
    new-instance v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$4;

    invoke-direct {v2, p0, v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeAsyncs$4;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onSubmit$lambda$8(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;
    .locals 2

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 168
    invoke-static {p0, v0, p1, v1, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->copy$default(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    move-result-object p0

    return-object p0
.end method

.method private final set_account(Ljava/lang/String;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_account$delegate:Landroidx/compose/runtime/MutableState;

    .line 219
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final set_accountConfirm(Ljava/lang/String;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_accountConfirm$delegate:Landroidx/compose/runtime/MutableState;

    .line 222
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final set_routing(Ljava/lang/String;)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->_routing$delegate:Landroidx/compose/runtime/MutableState;

    .line 216
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getAccount()Ljava/lang/String;
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->get_account()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final getAccountConfirm()Ljava/lang/String;
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->get_accountConfirm()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final getForm()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->form:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getRouting()Ljava/lang/String;
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->get_routing()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final onAccountConfirmEntered(Ljava/lang/String;)V
    .locals 5

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 237
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 238
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 139
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 239
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 241
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 139
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->set_accountConfirm(Ljava/lang/String;)V

    return-void
.end method

.method public final onAccountEntered(Ljava/lang/String;)V
    .locals 5

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 231
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 232
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 135
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 233
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 235
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 135
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->set_account(Ljava/lang/String;)V

    return-void
.end method

.method public final onRoutingEntered(Ljava/lang/String;)V
    .locals 5

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 225
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 226
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 131
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 227
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 229
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 131
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->set_routing(Ljava/lang/String;)V

    return-void
.end method

.method public final onSubmit()V
    .locals 6

    .line 143
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 168
    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onTestFill()V
    .locals 1

    .line 179
    const-string v0, "110000000"

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->set_routing(Ljava/lang/String;)V

    .line 180
    const-string v0, "000123456789"

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->set_account(Ljava/lang/String;)V

    .line 181
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->set_accountConfirm(Ljava/lang/String;)V

    .line 182
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->onSubmit()V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 98
    sget-object v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 100
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 97
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 44
    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
