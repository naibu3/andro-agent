.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "FinancialConnectionsSheetViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;,
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;,
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel\n+ 2 Intent.kt\ncom/stripe/android/financialconnections/utils/IntentKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,622:1\n10#2:623\n35#3:624\n77#3,2:625\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel\n*L\n310#1:623\n595#1:624\n596#1:625,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \\2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002[\\B\u0085\u0001\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0004\u0008 \u0010!J\u000c\u0010$\u001a\u00020%*\u00020\u0006H\u0002J\u0008\u0010&\u001a\u00020%H\u0002J\u000e\u0010\'\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0002J\u0008\u0010-\u001a\u00020%H\u0002J\r\u0010.\u001a\u00020%H\u0000\u00a2\u0006\u0002\u0008/J\u0006\u00100\u001a\u00020%J\r\u00101\u001a\u00020%H\u0000\u00a2\u0006\u0002\u00082J\r\u00103\u001a\u00020%H\u0000\u00a2\u0006\u0002\u00084J\u0015\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0000\u00a2\u0006\u0002\u00088J\u0010\u0010\r\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\u0017\u0010;\u001a\u00020%2\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0000\u00a2\u0006\u0002\u0008>J\u0010\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0002J\u001a\u0010D\u001a\u00020%2\u0006\u00109\u001a\u00020\u00022\u0008\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020CH\u0002J\u0010\u0010G\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\r\u0010H\u001a\u00020%H\u0000\u00a2\u0006\u0002\u0008IJ\u000e\u0010J\u001a\u0004\u0018\u00010C*\u00020\u0004H\u0002J+\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020M2\u0008\u0008\u0002\u0010N\u001a\u00020O2\n\u0008\u0003\u0010P\u001a\u0004\u0018\u00010QH\u0002\u00a2\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020%2\u0006\u0010L\u001a\u00020MH\u0002J\u0012\u0010T\u001a\u00020%2\u0008\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u001a\u0010T\u001a\u00020%2\u0006\u0010W\u001a\u00020X2\u0008\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u0012\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u00109\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        "applicationId",
        "",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "integrityRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "integrityVerdictManager",
        "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
        "fetchFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
        "fetchFinancialConnectionsSessionForToken",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "browserManager",
        "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
        "eventReporter",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "analyticsTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "nativeRouter",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "initialState",
        "ioDispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "<init>",
        "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)V",
        "mutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "registerSavedStateProvider",
        "",
        "initAuthFlow",
        "prepareStandardRequestManager",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "openAuthFlow",
        "sync",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "logNoBrowserAvailableAndFinish",
        "onActivityRecreated",
        "onActivityRecreated$financial_connections_release",
        "onDismissed",
        "onResume",
        "onResume$financial_connections_release",
        "onBrowserActivityResult",
        "onBrowserActivityResult$financial_connections_release",
        "onNativeAuthFlowResult",
        "activityResult",
        "Landroidx/activity/result/ActivityResult;",
        "onNativeAuthFlowResult$financial_connections_release",
        "state",
        "onUserCancel",
        "handleOnNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "handleOnNewIntent$financial_connections_release",
        "onStartApp2App",
        "unwrappedUriString",
        "onFinishApp2App",
        "receivedUrl",
        "Landroid/net/Uri;",
        "onFlowSuccess",
        "onSuccessFromInstantDebits",
        "url",
        "onFlowCancelled",
        "onViewEffectLaunched",
        "onViewEffectLaunched$financial_connections_release",
        "toUriOrNull",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "fromNative",
        "",
        "finishMessage",
        "",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;)V",
        "reportResult",
        "switchToWebFlow",
        "prefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "AttestationInitResult",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;

.field private static final Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

.field public static final MAX_ACCOUNTS:I = 0x64


# instance fields
.field private final analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final applicationId:Ljava/lang/String;

.field private final browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

.field private final eventReporter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

.field private final fetchFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

.field private final fetchFinancialConnectionsSessionForToken:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final initialState:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

.field private final integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

.field private final integrityVerdictManager:Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

.field private final ioDispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:Lkotlinx/coroutines/sync/Mutex;

.field private final nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;


# direct methods
.method public static synthetic $r8$lambda$AXh8PH4hVMy6jc4FZkZzqDMdNgM(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BZwGtpzzi6xR7ihM6R0kUeGw6ac(Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onStartApp2App$lambda$8(Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FLSzjAwgkaz-pJlh2BcOKnkoEiI(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$lambda$17(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$JJ9vuY8H17lKp-Q5jABWfb80CgU(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onActivityRecreated$lambda$7(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$LsPFv6WR0Eh5PsI4ghKgtZK4W1Y(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onViewEffectLaunched$lambda$14(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WgXW9VNaGMPaNZWfGOeyCMohV18(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->switchToWebFlow$lambda$18(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XofjzlgleDDiagD_bJ9Icu3bnBI(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->openAuthFlow$lambda$5(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$f28iq85jPpkdy7iPf-4ynjWPUIk(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->Factory$lambda$20$lambda$19(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hHWP8kJFjpfo65fPMGaQbI3vtpM(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFlowSuccess$lambda$10(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ioOBa1S9pW28nxeDBJqBXzM1aQA(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFlowCancelled$lambda$13(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pKj8cVdUfdYYHAKjVMxyxPJFamU(Landroid/net/Uri;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFinishApp2App$lambda$9(Landroid/net/Uri;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$w5DI02xw-Dd56AKAC4vXh0h_dyg(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->registerSavedStateProvider$lambda$2(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wYYi0R5KsTOMBvcXcpgfd983Z4Y(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->openAuthFlow$lambda$6(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->$stable:I

    .line 624
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 596
    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda12;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda12;-><init>()V

    .line 625
    const-class v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 624
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    .line 595
    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)V
    .locals 16
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "applicationId"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "applicationId"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrityRequestManager"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrityVerdictManager"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchFinancialConnectionsSession"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchFinancialConnectionsSessionForToken"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "browserManager"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsTracker"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeRouter"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    .line 90
    invoke-direct {v0, v14, v13}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 75
    iput-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->applicationId:Ljava/lang/String;

    .line 77
    iput-object v3, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 78
    iput-object v4, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    .line 79
    iput-object v5, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->integrityVerdictManager:Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    .line 80
    iput-object v6, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    .line 81
    iput-object v7, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSessionForToken:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

    .line 82
    iput-object v8, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 83
    iput-object v9, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

    .line 84
    iput-object v10, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->eventReporter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

    .line 85
    iput-object v11, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 86
    iput-object v12, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    .line 88
    iput-object v14, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->initialState:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    .line 89
    iput-object v15, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->ioDispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 92
    invoke-static {v4, v1, v3}, Lkotlinx/coroutines/sync/MutexKt;->Mutex$default(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 95
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->registerSavedStateProvider(Landroidx/lifecycle/SavedStateHandle;)V

    .line 96
    invoke-virtual {v14}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->isValid()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 97
    invoke-interface {v10}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;->onPresented()V

    .line 99
    invoke-virtual {v14}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    if-nez v1, :cond_0

    .line 100
    invoke-direct {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->initAuthFlow()V

    :cond_0
    return-void

    .line 103
    :cond_1
    new-instance v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    .line 104
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Invalid configuration provided when instantiating activity"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 103
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 106
    new-instance v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda8;

    invoke-direct {v2, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda8;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;)V

    invoke-virtual {v0, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p16

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    .line 89
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_0

    :cond_0
    move-object/from16 v16, p15

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    .line 74
    invoke-direct/range {v1 .. v16}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;-><init>(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)V

    return-void
.end method

.method private static final Factory$lambda$20$lambda$19(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 4

    const-string v0, "$this$initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    invoke-static {p0}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object v0

    .line 599
    const-string v1, "financial_connections_sheet_state"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 600
    sget-object v2, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;->APPLICATION_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {p0, v2}, Landroidx/lifecycle/viewmodel/CreationExtras;->get(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Application;

    .line 602
    sget-object v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Companion;->getArgs(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 603
    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-direct {v3, v2, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Landroid/os/Bundle;)V

    .line 605
    invoke-static {}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent;->builder()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object v1

    .line 606
    invoke-interface {v1, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object v1

    .line 607
    invoke-interface {v1, v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object v0

    .line 608
    sget-object v1, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;

    invoke-virtual {v1, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->getComponent(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->sharedComponent(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object p0

    .line 609
    invoke-interface {p0, v3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->initialState(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object p0

    .line 610
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->configuration(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object p0

    .line 611
    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->build()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;

    move-result-object p0

    invoke-interface {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p0

    return-object p0

    .line 602
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    check-cast p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsTracker$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getApplicationId$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Ljava/lang/String;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->applicationId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getEventReporter$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->eventReporter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

    return-object p0
.end method

.method public static final synthetic access$getFactory$cp()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 74
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method public static final synthetic access$getFetchFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getFetchFinancialConnectionsSessionForToken$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSessionForToken:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getMutex$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lkotlinx/coroutines/sync/Mutex;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->mutex:Lkotlinx/coroutines/sync/Mutex;

    return-object p0
.end method

.method public static final synthetic access$onFinishApp2App(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/net/Uri;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFinishApp2App(Landroid/net/Uri;)V

    return-void
.end method

.method public static final synthetic access$onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-void
.end method

.method public static final synthetic access$onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V

    return-void
.end method

.method public static final synthetic access$onStartApp2App(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onStartApp2App(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$openAuthFlow(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->openAuthFlow(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    return-void
.end method

.method public static final synthetic access$prepareStandardRequestManager(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->prepareStandardRequestManager(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 74
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$switchToWebFlow(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->switchToWebFlow(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V

    return-void
.end method

.method public static final synthetic access$toUriOrNull(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->toUriOrNull(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method private final fetchFinancialConnectionsSession(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 7

    .line 326
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final fetchFinancialConnectionsSessionForToken(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 7

    .line 348
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;)V
    .locals 7

    .line 516
    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;

    if-eqz v2, :cond_0

    .line 517
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;

    .line 518
    iget-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->integrityVerdictManager:Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;->setVerdictFailed()V

    .line 519
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;->getPrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->switchToWebFlow(Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V

    return-void

    .line 522
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->reportResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    if-nez p2, :cond_4

    .line 526
    instance-of p2, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    sget-object p2, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->SUCCESS:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-static {p2, v0, v2, v1, v2}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 527
    :cond_1
    instance-of p2, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;

    if-eqz p2, :cond_2

    sget-object p2, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->CANCEL:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-static {p2, v0, v2, v1, v2}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    .line 528
    sget-object p2, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    .line 529
    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 530
    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 528
    invoke-virtual {p2, v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;

    goto :goto_0

    .line 525
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 534
    :cond_4
    :goto_0
    new-instance p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda9;

    invoke-direct {p2, p1, p3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda9;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V

    invoke-virtual {p0, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method static synthetic finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 511
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;)V

    return-void
.end method

.method private static final finishWithResult$lambda$17(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final initAuthFlow()V
    .locals 7

    .line 124
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$initAuthFlow$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$initAuthFlow$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final logNoBrowserAvailableAndFinish()V
    .locals 8

    .line 216
    new-instance v0, Lcom/stripe/android/financialconnections/exception/AppInitializationError;

    const-string v1, "No Web browser available to launch AuthFlow"

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/exception/AppInitializationError;-><init>(Ljava/lang/String;)V

    .line 217
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 219
    iget-object v2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 220
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 221
    check-cast v0, Ljava/lang/Throwable;

    .line 217
    const-string v4, "error Launching the Auth Flow"

    invoke-static {v1, v4, v0, v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 223
    new-instance v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onActivityRecreated$lambda$7(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    .line 246
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final onFinishApp2App(Landroid/net/Uri;)V
    .locals 1

    .line 451
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda10;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda10;-><init>(Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final onFinishApp2App$lambda$9(Landroid/net/Uri;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 8

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getHostedAuthUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&startPolling=true&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 455
    sget-object v4, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->INTERMEDIATE_DEEPLINK:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    .line 457
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    .line 454
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 1

    .line 494
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda7;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda7;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 495
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onUserCancel(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-void
.end method

.method private static final onFlowCancelled$lambda$13(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    sget-object v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->NONE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V
    .locals 6

    if-nez p2, :cond_0

    .line 465
    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance p2, Ljava/lang/Exception;

    const-string v0, "Intent url received from web flow is null"

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 464
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void

    :cond_0
    move-object v0, p0

    .line 468
    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda3;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-virtual {p0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 469
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;->getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 p1, 0x3

    if-ne v1, p1, :cond_1

    .line 472
    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onSuccessFromInstantDebits(Landroid/net/Uri;)V

    return-void

    .line 469
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 471
    :cond_2
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSessionForToken(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-void

    .line 470
    :cond_3
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSession(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-void
.end method

.method private static final onFlowSuccess$lambda$10(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    sget-object v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->NONE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final onStartApp2App(Ljava/lang/String;)V
    .locals 1

    .line 441
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final onStartApp2App$lambda$8(Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    sget-object v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->INTERMEDIATE_DEEPLINK:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    .line 445
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 442
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final onSuccessFromInstantDebits(Landroid/net/Uri;)V
    .locals 16

    .line 478
    sget-object v0, Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;->fromUri-IoAF18A(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v0

    .line 479
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;

    .line 481
    new-instance v2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v3}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;-><init>(Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, p0

    .line 480
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    .line 487
    :cond_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object/from16 v4, p0

    .line 488
    iget-object v1, v4, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Could not retrieve payment method parameters from success url"

    invoke-interface {v1, v2, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 489
    new-instance v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v4

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final onUserCancel(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 7

    .line 372
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onUserCancel$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onUserCancel$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final onViewEffectLaunched$lambda$14(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    .line 499
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final openAuthFlow(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 9

    .line 169
    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/browser/BrowserManager;->canOpenHttpsUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logNoBrowserAvailableAndFinish()V

    return-void

    .line 174
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    .line 175
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    invoke-virtual {v1, v0}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeAuthFlowEnabled(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v1

    .line 176
    iget-object v2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    invoke-virtual {v2, v0}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->logExposure(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    .line 178
    sget-object v3, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;

    .line 179
    iget-object v2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->initialState:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v4

    .line 180
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getHostedAuthUrl()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 178
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->create$default(Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    .line 185
    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "hostedAuthUrl is required!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {p1, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 184
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    move-object v3, v1

    return-void

    :cond_1
    move-object v3, p0

    .line 188
    sget-object v4, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->OPEN:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v4, v5, v6, v7, v6}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_2

    .line 190
    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v1, v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    invoke-virtual {p0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 203
    :cond_2
    sget-object p1, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->FLOW_LAUNCHED_IN_BROWSER:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-static {p1, v1, v6, v7, v6}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    .line 204
    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda6;

    invoke-direct {p1, v0, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final openAuthFlow$lambda$5(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    sget-object v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->NONE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    .line 194
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;

    .line 195
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;->getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object v1

    .line 196
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v2

    .line 198
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v3

    .line 194
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p0

    move-object v1, p2

    .line 191
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private static final openAuthFlow$lambda$6(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    sget-object v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->ON_EXTERNAL_ACTIVITY:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    .line 208
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p0

    move-object v1, p2

    .line 205
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final prepareStandardRequestManager(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 150
    iget v2, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 153
    iget-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->integrityVerdictManager:Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;->verdictFailed()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 154
    sget-object p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Skipped;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Skipped;

    return-object p1

    .line 156
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->integrityRequestManager:Lcom/stripe/attestation/IntegrityRequestManager;

    iput v3, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/attestation/IntegrityRequestManager;->prepare-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    check-cast p1, Lkotlin/Unit;

    .line 157
    sget-object p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Success;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Success;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;

    return-object p1

    .line 158
    :cond_5
    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Failure;

    invoke-direct {p1, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Failure;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;

    return-object p1
.end method

.method private final registerSavedStateProvider(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 2

    .line 111
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)V

    const-string v1, "financial_connections_sheet_state"

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->setSavedStateProvider(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V

    return-void
.end method

.method private static final registerSavedStateProvider$lambda$2(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Landroid/os/Bundle;
    .locals 3

    .line 112
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    .line 113
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 114
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "financial_connections_sheet_manifest"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 115
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getWebAuthFlowStatus()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    move-result-object p0

    check-cast p0, Ljava/io/Serializable;

    const-string v1, "financial_connections_sheet_web_auth_flow_status"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-object v0
.end method

.method private final reportResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 7

    .line 541
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->ioDispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$reportResult$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$reportResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final switchToWebFlow(Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V
    .locals 7

    .line 552
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$switchToWebFlow$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$switchToWebFlow$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final switchToWebFlow(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V
    .locals 6

    .line 565
    sget-object v0, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;

    .line 566
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->initialState:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v1

    .line 567
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getHostedAuthUrl()Ljava/lang/String;

    move-result-object v2

    .line 565
    invoke-virtual {v0, v1, v2, p2}, Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;->create(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 572
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 582
    :cond_0
    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "hostedAuthUrl is required to switch to web flow!"

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 581
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void
.end method

.method private static final switchToWebFlow$lambda$18(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    sget-object v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->INTERMEDIATE_DEEPLINK:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    .line 577
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p0

    move-object v1, p2

    .line 573
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private final toUriOrNull(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 503
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 504
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 505
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 506
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 507
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Could not parse web flow url"

    invoke-interface {v1, v2, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 508
    :cond_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    check-cast p1, Landroid/net/Uri;

    return-object p1
.end method


# virtual methods
.method public final handleOnNewIntent$financial_connections_release(Landroid/content/Intent;)V
    .locals 7

    .line 398
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onActivityRecreated$financial_connections_release()V
    .locals 1

    .line 245
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda4;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda4;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onBrowserActivityResult$financial_connections_release()V
    .locals 7

    .line 288
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onBrowserActivityResult$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onBrowserActivityResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onDismissed()V
    .locals 7

    .line 253
    sget-object v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;->INSTANCE:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void
.end method

.method public final onNativeAuthFlowResult$financial_connections_release(Landroidx/activity/result/ActivityResult;)V
    .locals 14

    const-string v0, "activityResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 310
    const-string v2, "result"

    .line 623
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    instance-of v2, v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    check-cast v1, Landroid/os/Parcelable;

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    :cond_1
    move-object v3, v1

    .line 311
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    if-eqz v3, :cond_2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v2, p0

    .line 312
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void

    .line 314
    :cond_2
    sget-object p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;->INSTANCE:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;

    move-object v9, p1

    check-cast v9, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v8, p0

    invoke-static/range {v8 .. v13}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void
.end method

.method public final onResume$financial_connections_release()V
    .locals 7

    .line 262
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onResume$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onResume$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onViewEffectLaunched$financial_connections_release()V
    .locals 1

    .line 499
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 74
    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
