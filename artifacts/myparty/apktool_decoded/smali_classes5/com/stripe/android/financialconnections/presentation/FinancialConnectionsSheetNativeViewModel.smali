.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "FinancialConnectionsSheetNativeViewModel.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;


# annotations
.annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        ">;",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSheetNativeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,646:1\n1#2:647\n35#3:648\n77#3,2:649\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel\n*L\n487#1:648\n488#1:649,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 e2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001eBc\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000c\u00103\u001a\u000204*\u00020\u0007H\u0002J\u0010\u00105\u001a\u0002062\u0008\u00107\u001a\u0004\u0018\u000108J\u0006\u00109\u001a\u000204J\u001a\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\u00172\u0008\u0010<\u001a\u0004\u0018\u00010\u0017H\u0002J\u0006\u0010=\u001a\u000206J\u000e\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020\u0017J\u0006\u0010@\u001a\u000204J\u0010\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020,H\u0002J\u0010\u0010C\u001a\u0002042\u0008\u0010B\u001a\u0004\u0018\u00010,J\u0010\u0010D\u001a\u0002042\u0006\u0010B\u001a\u00020,H\u0002J\u000e\u0010E\u001a\u0002042\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u000204J \u0010I\u001a\u0002062\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\u0008\u0002\u0010L\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020OH\u0002J\u0016\u0010P\u001a\u0002042\u0006\u0010N\u001a\u00020OH\u0082@\u00a2\u0006\u0002\u0010QJ\u0010\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020TH\u0002J\u000c\u0010U\u001a\u00020V*\u00020OH\u0002J\u0018\u0010W\u001a\u0002042\u0006\u0010B\u001a\u00020,2\u0008\u0010X\u001a\u0004\u0018\u00010,J\u0006\u0010Y\u001a\u000204J\u0006\u0010Z\u001a\u000204J\u0010\u0010[\u001a\u0002042\u0006\u0010\\\u001a\u00020VH\u0002J\u0010\u0010]\u001a\u0002042\u0006\u0010^\u001a\u00020VH\u0016J\u0012\u0010_\u001a\u0002042\u0008\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u000e\u0010b\u001a\u0002042\u0006\u0010B\u001a\u00020,J\u0012\u0010c\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008&\u0010\'R\u0014\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020%0.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010/\u001a\u0008\u0012\u0004\u0012\u00020%00\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102\u00a8\u0006f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;",
        "activityRetainedComponent",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "completeFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "createInstantDebitsResult",
        "Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "applicationId",
        "",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V",
        "getActivityRetainedComponent",
        "()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "mutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "navigationFlow",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "getNavigationFlow",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "defaultTopAppBarState",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;",
        "getDefaultTopAppBarState",
        "()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;",
        "defaultTopAppBarState$delegate",
        "Lkotlin/Lazy;",
        "currentPane",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "topAppBarStateUpdatesByPane",
        "",
        "topAppBarState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getTopAppBarState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "registerSavedStateProvider",
        "",
        "handleOnNewIntent",
        "Lkotlinx/coroutines/Job;",
        "intent",
        "Landroid/content/Intent;",
        "handleOnCloseClick",
        "onUrlReceived",
        "receivedUrl",
        "status",
        "onResume",
        "openPartnerAuthFlowInBrowser",
        "url",
        "onViewEffectLaunched",
        "onCloseWithConfirmationClick",
        "pane",
        "onBackClick",
        "onCloseNoConfirmationClick",
        "onCloseFromErrorClick",
        "error",
        "",
        "onBackPressed",
        "closeAuthFlow",
        "earlyTerminationCause",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;",
        "closeAuthFlowError",
        "handleFinancialConnectionsCompletion",
        "session",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "handleInstantDebitsCompletion",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "hasAValidAccount",
        "",
        "onPaneLaunched",
        "referrer",
        "onBackgrounded",
        "onForegrounded",
        "trackBackgroundStateChanged",
        "backgrounded",
        "updateTopAppBarElevation",
        "isElevated",
        "updateTopAppBarState",
        "update",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "handlePaneChanged",
        "updateTopAppBar",
        "state",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

.field private static final Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

.field private static final PARAM_CODE:Ljava/lang/String; = "code"

.field private static final PARAM_ERROR_REASON:Ljava/lang/String; = "error_reason"

.field private static final PARAM_STATUS:Ljava/lang/String; = "status"

.field private static final STATUS_FAILURE:Ljava/lang/String; = "failure"

.field private static final STATUS_SUCCESS:Ljava/lang/String; = "success"


# instance fields
.field private final activityRetainedComponent:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

.field private final applicationId:Ljava/lang/String;

.field private final completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

.field private final createInstantDebitsResult:Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;

.field private final currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultTopAppBarState$delegate:Lkotlin/Lazy;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:Lkotlinx/coroutines/sync/Mutex;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final topAppBarState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;",
            ">;"
        }
    .end annotation
.end field

.field private final topAppBarStateUpdatesByPane:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/Map<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;",
            ">;>;"
        }
    .end annotation
.end field

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method public static synthetic $r8$lambda$1lFE1xZy-dPz6v5SGdRuMqagzsQ(ZLcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->updateTopAppBarElevation$lambda$11(ZLcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3vkCIBv8S-_XH5K32eC4H481XqM(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->finishWithResult$lambda$10(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$5MI5FJtD0K8WsM-jypHSHRVf5oI(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onUrlReceived$lambda$4(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BrqrrYiGR90GIpCLvOco0Ysj3go(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->openPartnerAuthFlowInBrowser$lambda$7(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$L3VWQFLyvCCybwuc8d54MZfURCQ(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->_init_$lambda$1(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$MTiPB7XYnscVm8NlB4WJcXMv7bQ(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onViewEffectLaunched$lambda$8(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Omka21eySYz6j1FlKKXLKmldrgY(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->registerSavedStateProvider$lambda$3(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kIcFMrkef5D6uVrIEDkIRpJWWag(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->defaultTopAppBarState_delegate$lambda$0(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lNdEDRHVNwiSlokFeSbpKU3Hhlw(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->Factory$lambda$14$lambda$13(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qrnVnXPy4gdE2wmt36_edDklkLY(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onUrlReceived$lambda$5(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tg_Ceh8BvIgeUHnHxSddofRqpQk(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onUrlReceived$lambda$6(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->$stable:I

    .line 648
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 488
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda7;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda7;-><init>()V

    .line 649
    const-class v2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 648
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    .line 487
    sput-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V
    .locals 9
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "applicationId"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    const-string v8, "activityRetainedComponent"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "savedStateHandle"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "nativeAuthFlowCoordinator"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "uriUtils"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "completeFinancialConnectionsSession"

    invoke-static {p5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "createInstantDebitsResult"

    invoke-static {p6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "eventTracker"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "logger"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "navigationManager"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "applicationId"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "initialState"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-direct {p0, v7, p3}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 87
    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->activityRetainedComponent:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    .line 89
    iput-object p3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    .line 90
    iput-object p4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    .line 91
    iput-object p5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    .line 92
    iput-object p6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->createInstantDebitsResult:Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;

    .line 93
    iput-object v3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 94
    iput-object v4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 95
    iput-object v5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 96
    iput-object v6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->applicationId:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p3, 0x1

    const/4 v0, 0x0

    .line 104
    invoke-static {p1, p3, v0}, Lkotlinx/coroutines/sync/MutexKt;->Mutex$default(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 105
    invoke-interface {v5}, Lcom/stripe/android/uicore/navigation/NavigationManager;->getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;

    .line 107
    new-instance p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda10;

    invoke-direct {p1, v7}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda10;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->defaultTopAppBarState$delegate:Lkotlin/Lazy;

    .line 113
    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getInitialPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 115
    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getInitialPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p3

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getDefaultTopAppBarState()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object v1

    invoke-static {p3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    .line 114
    invoke-static {p3}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->topAppBarStateUpdatesByPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 118
    check-cast p3, Lkotlinx/coroutines/flow/Flow;

    .line 119
    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 118
    invoke-static {p3, p1}, Lcom/stripe/android/financialconnections/utils/FlowsKt;->get(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    .line 121
    move-object p3, p0

    check-cast p3, Landroidx/lifecycle/ViewModel;

    invoke-static {p3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    .line 122
    sget-object v2, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-wide/16 v5, 0x1388

    const-wide/16 v7, 0x0

    move-object p4, v2

    move/from16 p9, v3

    move-object/from16 p10, v4

    move-wide p5, v5

    move-wide/from16 p7, v7

    invoke-static/range {p4 .. p10}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v2

    .line 123
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getDefaultTopAppBarState()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object v3

    .line 120
    invoke-static {p1, v1, v2, v3}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->topAppBarState:Lkotlinx/coroutines/flow/StateFlow;

    .line 127
    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->registerSavedStateProvider(Landroidx/lifecycle/SavedStateHandle;)V

    .line 128
    new-instance p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda1;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 129
    invoke-static {p3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$2;

    invoke-direct {p2, p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$2;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function2;

    const/4 p3, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object p4, p1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move-object/from16 p9, v0

    move-object p5, v1

    move-object p6, v2

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final Factory$lambda$14$lambda$13(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 5

    const-string v0, "$this$initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    invoke-static {p0}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object v0

    .line 490
    sget-object v1, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;->APPLICATION_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {p0, v1}, Landroidx/lifecycle/viewmodel/CreationExtras;->get(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Application;

    .line 493
    sget-object v1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->Companion:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;

    invoke-virtual {v1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;->getArgs(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 495
    const-string v2, "FinancialConnectionsSheetNativeState"

    invoke-virtual {v0, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    .line 496
    new-instance v3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-direct {v3, v1, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;Landroid/os/Bundle;)V

    .line 501
    invoke-static {}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent;->builder()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object v2

    .line 502
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getFirstInit()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v2, v1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->initialSyncResponse(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object v1

    .line 503
    invoke-interface {v1, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object v1

    .line 504
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->configuration(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object v1

    .line 505
    sget-object v2, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;

    invoke-virtual {v2, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->getComponent(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;

    move-result-object p0

    invoke-interface {v1, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->sharedComponent(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object p0

    .line 506
    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object p0

    .line 507
    invoke-interface {p0, v3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->initialState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object p0

    .line 508
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->build()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    move-result-object p0

    .line 509
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object p0

    return-object p0

    .line 493
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 17

    const-string v0, "$this$setState"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x1ffb

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 128
    invoke-static/range {v1 .. v16}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getApplicationId$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->applicationId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getCompleteFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getCurrentPane$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getFactory$cp()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 81
    sget-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getMutex$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lkotlinx/coroutines/sync/Mutex;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->mutex:Lkotlinx/coroutines/sync/Mutex;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getUriUtils$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    return-object p0
.end method

.method public static final synthetic access$handleFinancialConnectionsCompletion(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->handleFinancialConnectionsCompletion(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-void
.end method

.method public static final synthetic access$handleInstantDebitsCompletion(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->handleInstantDebitsCompletion(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$hasAValidAccount(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Z
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->hasAValidAccount(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$onUrlReceived(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onUrlReceived(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$updateTopAppBarState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->updateTopAppBarState(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;)V

    return-void
.end method

.method private final closeAuthFlow(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;)Lkotlinx/coroutines/Job;
    .locals 7

    .line 304
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p2, p1, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method static synthetic closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 301
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;)Lkotlinx/coroutines/Job;

    move-result-object p0

    return-object p0
.end method

.method private static final defaultTopAppBarState_delegate$lambda$0(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 1

    const/4 v0, 0x1

    .line 110
    invoke-static {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->access$toTopAppBarState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Z)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object p0

    return-object p0
.end method

.method private final finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 1

    .line 420
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda4;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final finishWithResult$lambda$10(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 17

    const-string v0, "$this$setState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$Finish;

    move-object/from16 v2, p0

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$Finish;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    const/16 v15, 0x1fbf

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method private final getDefaultTopAppBarState()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->defaultTopAppBarState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    return-object v0
.end method

.method private final handleFinancialConnectionsCompletion(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 8

    .line 378
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    .line 379
    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->SUCCESS:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 380
    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    .line 381
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v3

    instance-of v3, v3, Lcom/stripe/android/financialconnections/model/BankAccount;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 380
    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 378
    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;

    .line 385
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getManualEntryUsesMicrodeposits()Z

    move-result v0

    .line 386
    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionExtensionsKt;->update(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Z)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v3

    .line 389
    new-instance v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    .line 391
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getParsedToken()Lcom/stripe/android/model/Token;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 389
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;-><init>(Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    .line 388
    invoke-direct {p0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    return-void
.end method

.method private final handleInstantDebitsCompletion(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 396
    iget v2, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 397
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 398
    iget-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->createInstantDebitsResult:Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PaymentAccount;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p0, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p2, Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    move-object p1, p0

    :goto_2
    move-object v1, p2

    if-eqz v1, :cond_5

    .line 402
    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;-><init>(Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    goto :goto_3

    .line 406
    :cond_5
    new-instance p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    .line 407
    new-instance v0, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;

    .line 408
    const-string v1, "InstantDebitsCompletionError"

    .line 409
    const-string v2, "Unable to complete Instant Debits flow due to missing PaymentAccount"

    .line 407
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 406
    invoke-direct {p2, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    .line 414
    :goto_3
    invoke-direct {p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    .line 415
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final hasAValidAccount(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Z
    .locals 1

    .line 424
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 425
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v0

    if-nez v0, :cond_1

    .line 426
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getBankAccountToken()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final onCloseNoConfirmationClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 8

    .line 273
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1;

    const/4 v7, 0x0

    invoke-direct {v0, p0, p1, v7}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    const/4 p1, 0x1

    .line 276
    invoke-static {p0, v7, v7, p1, v7}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final onCloseWithConfirmationClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lkotlinx/coroutines/Job;
    .locals 7

    .line 261
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method private final onUrlReceived(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 210
    const-string v0, "success"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p2, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 214
    :cond_0
    const-string v0, "failure"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 215
    iget-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    const-string v0, "error_reason"

    invoke-virtual {p2, p1, v0}, Lcom/stripe/android/financialconnections/utils/UriUtils;->getQueryParameter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 216
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 228
    :cond_1
    new-instance p2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda3;

    invoke-direct {p2, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final onUrlReceived$lambda$4(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 17

    const-string v0, "$this$setState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;

    move-object/from16 v2, p0

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Success;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    const/16 v15, 0x1ffd

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method private static final onUrlReceived$lambda$5(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "$this$setState"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;

    .line 220
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received return_url with failed status: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p1

    .line 218
    invoke-direct {v1, v0, v3, v4}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Failed;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    const/16 v16, 0x1ffd

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

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

    .line 217
    invoke-static/range {v2 .. v17}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method private static final onUrlReceived$lambda$6(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 17

    const-string v0, "$this$setState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;

    move-object/from16 v2, p0

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Canceled;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    const/16 v15, 0x1ffd

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v1 .. v16}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method private static final onViewEffectLaunched$lambda$8(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 17

    const-string v0, "$this$setState"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x1fbf

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 258
    invoke-static/range {v1 .. v16}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method private static final openPartnerAuthFlowInBrowser$lambda$7(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 17

    const-string v0, "$this$setState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    sget-object v0, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$InProgress;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$InProgress;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    .line 252
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$OpenUrl;

    move-object/from16 v2, p0

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$OpenUrl;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    const/16 v15, 0x1fbd

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 250
    invoke-static/range {v1 .. v16}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object v0

    return-object v0
.end method

.method private final registerSavedStateProvider(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 2

    .line 153
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    const-string v1, "FinancialConnectionsSheetNativeState"

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->setSavedStateProvider(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V

    return-void
.end method

.method private static final registerSavedStateProvider$lambda$3(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Landroid/os/Bundle;
    .locals 3

    .line 154
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    .line 155
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 156
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getWebAuthFlow()Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "webAuthFlow"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 157
    const-string v1, "firstInit"

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getFirstInit()Z

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private final trackBackgroundStateChanged(Z)V
    .locals 3

    .line 450
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 451
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 452
    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AppBackgrounded;

    invoke-direct {v2, v0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AppBackgrounded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Z)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 451
    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-void
.end method

.method private static final updateTopAppBarElevation$lambda$11(ZLcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 13

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v8, p0

    move-object v1, p1

    .line 461
    invoke-static/range {v1 .. v12}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->copy$default(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object p0

    return-object p0
.end method

.method private final updateTopAppBarState(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 467
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getDefaultTopAppBarState()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->apply(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object v0

    .line 468
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->topAppBarStateUpdatesByPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/stripe/android/financialconnections/utils/FlowsKt;->updateWithNewEntry(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/Pair;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getActivityRetainedComponent()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->activityRetainedComponent:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    return-object v0
.end method

.method public final getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getTopAppBarState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;",
            ">;"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->topAppBarState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final handleOnCloseClick()V
    .locals 3

    .line 196
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 197
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->topAppBarState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    .line 199
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->getError()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 200
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->getError()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onCloseFromErrorClick(Ljava/lang/Throwable;)V

    return-void

    .line 201
    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->getCanCloseWithoutConfirmation()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 202
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onCloseNoConfirmationClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    return-void

    .line 204
    :cond_1
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->onCloseWithConfirmationClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final handleOnNewIntent(Landroid/content/Intent;)Lkotlinx/coroutines/Job;
    .locals 7

    .line 169
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final handlePaneChanged(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 1

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final onBackClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 7

    .line 267
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onBackClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onBackClick$1;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onBackPressed()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 291
    invoke-static {p0, v0, v0, v1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onBackgrounded()V
    .locals 1

    const/4 v0, 0x1

    .line 442
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->trackBackgroundStateChanged(Z)V

    return-void
.end method

.method public final onCloseFromErrorClick(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    instance-of v0, p1, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;->getStripeException()Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p1, v0

    check-cast p1, Ljava/lang/Throwable;

    :cond_1
    const/4 v0, 0x1

    .line 283
    invoke-static {p0, v1, p1, v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onForegrounded()V
    .locals 1

    const/4 v0, 0x0

    .line 446
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->trackBackgroundStateChanged(Z)V

    return-void
.end method

.method public final onPaneLaunched(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 7

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/navigation/Destination;->getLogPaneLaunched()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, p2, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method

.method public final onResume()Lkotlinx/coroutines/Job;
    .locals 7

    .line 239
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onResume$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onResume$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 258
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda9;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda9;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final openPartnerAuthFlowInBrowser(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda5;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 81
    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method

.method public updateTopAppBarElevation(Z)V
    .locals 3

    .line 460
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->topAppBarStateUpdatesByPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->currentPane:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda8;

    invoke-direct {v2, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda8;-><init>(Z)V

    invoke-static {v0, v1, v2}, Lcom/stripe/android/financialconnections/utils/FlowsKt;->updateWithNewEntry(Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
