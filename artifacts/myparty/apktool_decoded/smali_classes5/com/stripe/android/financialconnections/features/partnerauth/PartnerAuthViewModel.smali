.class public final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "PartnerAuthViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;,
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPartnerAuthViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,551:1\n29#2:552\n*S KotlinDebug\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel\n*L\n255#1:552\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0001\u0018\u0000 Y2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0003WXYB\u00a5\u0001\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0008\u0008\u0001\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u0002H\u0016J\u0008\u00101\u001a\u000202H\u0002J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0082@\u00a2\u0006\u0002\u00107J\u0016\u00108\u001a\u0002042\u0006\u00105\u001a\u000206H\u0082@\u00a2\u0006\u0002\u00107J\u0008\u00109\u001a\u00020:H\u0002J\u0008\u0010;\u001a\u000202H\u0002J\u0008\u0010<\u001a\u000202H\u0002J\u0006\u0010=\u001a\u000202J\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020\u000eH\u0002J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u0004\u0018\u00010\u000e*\u00020BH\u0002J\u000e\u0010D\u001a\u0002022\u0006\u0010E\u001a\u00020FJ(\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000e2\u0008\u0010J\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0002\u0010KJ\u0018\u0010L\u001a\u0002022\u0008\u0010H\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u0002022\u0006\u0010A\u001a\u00020BH\u0082@\u00a2\u0006\u0002\u0010OJ\u0016\u0010\u0003\u001a\u0002022\u0006\u0010H\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0002\u0010MJ\u000e\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u000eJ\u0008\u0010R\u001a\u000202H\u0002J\u0006\u0010S\u001a\u000202J\u0006\u0010T\u001a\u000202J\u0008\u0010U\u001a\u000202H\u0002J\u0008\u0010V\u001a\u000202H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
        "completeAuthorizationSession",
        "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;",
        "createAuthorizationSession",
        "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
        "cancelAuthorizationSession",
        "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
        "retrieveAuthorizationSession",
        "Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "applicationId",
        "",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "postAuthSessionEvent",
        "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "browserManager",
        "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
        "handleError",
        "Lcom/stripe/android/financialconnections/domain/HandleError;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "pollAuthorizationSessionOAuthResults",
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "presentSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "pendingRepairRepository",
        "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;",
        "repairAuthSession",
        "Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/domain/HandleError;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "initializeState",
        "",
        "initializeBankAuthRepair",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
        "sync",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "initializePartnerAuth",
        "recreateAuthSession",
        "Lkotlinx/coroutines/Job;",
        "launchBrowserIfNonOauth",
        "handleErrors",
        "onLaunchAuthClick",
        "reportOAuthLaunched",
        "sessionId",
        "launchAuthInBrowser",
        "authSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "browserReadyUrl",
        "onWebAuthFlowFinished",
        "webStatus",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;",
        "onAuthFailed",
        "url",
        "message",
        "reason",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onAuthCancelled",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancelAuthSessionAndContinue",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onClickableTextClick",
        "uri",
        "presentDataAccessBottomSheet",
        "onViewEffectLaunched",
        "onCancelClick",
        "cancelInModal",
        "cancelInFullscreen",
        "Args",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;


# instance fields
.field private final applicationId:Ljava/lang/String;

.field private final browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

.field private final cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

.field private final completeAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

.field private final createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

.field private final initialState:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

.field private final pollAuthorizationSessionOAuthResults:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

.field private final postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

.field private final presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

.field private final repairAuthSession:Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;

.field private final retrieveAuthorizationSession:Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method public static synthetic $r8$lambda$2Z4ld5U006K2BmLjggNDGCzrNL8(Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthFailed$lambda$8$lambda$7(Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3h5BeMsARF47t4aRILrEOcBq_yw(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onLaunchAuthClick$lambda$2(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$56-O5JpF94UDtDVN2yIL6ekIqho(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->initializeState$lambda$0(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GfnBXtGxONpSttSiOqVjS9q3SKY(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onViewEffectLaunched$lambda$19(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ORbd53Z0wBHFHf5agPFnkbM519c(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthSessionAndContinue$lambda$14(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TR5AemAKVikeDmJ1LPShiSzYweA(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession$lambda$18$lambda$17(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UnRA5JSSDJIXth2Dkm19HRR3Yck(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthCancelled$lambda$13$lambda$12(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$cYZsJrFmBJjQhzNznUGIa2oHqn0(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession$lambda$16$lambda$15(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$na0q5Yf-yC-6-Venv0zaGwkIMig(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onCancelClick$lambda$20(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tWjwLAF-qEseTYmTIkJx_9yTwpA(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->launchAuthInBrowser$lambda$6$lambda$5(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vdOzBxO9R6gSb7TG6Rq-_2yQbNA(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->recreateAuthSession$lambda$1(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wJ1R7HpB--w5Vn26V2ozfOOpUfE(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthCancelled$lambda$11$lambda$10(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xhXFhBX6jAvwnOkTjrj1UFggV8c(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onLaunchAuthClick$lambda$4(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->Companion:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/domain/HandleError;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V
    .locals 16
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "applicationId"
        .end annotation
    .end param
    .param p18    # Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
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

    const-string v0, "completeAuthorizationSession"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createAuthorizationSession"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelAuthorizationSession"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveAuthorizationSession"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriUtils"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postAuthSessionEvent"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "browserManager"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleError"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAuthorizationSessionOAuthResults"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presentSheet"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingRepairRepository"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repairAuthSession"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    move-object/from16 v14, p19

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    .line 97
    invoke-direct {v0, v15, v14}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 78
    iput-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

    .line 79
    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    .line 80
    iput-object v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    .line 81
    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->retrieveAuthorizationSession:Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;

    .line 82
    iput-object v5, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 83
    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->applicationId:Ljava/lang/String;

    .line 84
    iput-object v7, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    .line 85
    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    .line 86
    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 87
    iput-object v10, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

    .line 88
    iput-object v11, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    .line 89
    iput-object v12, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 90
    iput-object v13, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->pollAuthorizationSessionOAuthResults:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    move-object/from16 v14, p14

    .line 91
    iput-object v14, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    move-object/from16 v1, p15

    .line 92
    iput-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    move-object/from16 v1, p16

    .line 93
    iput-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

    move-object/from16 v1, p17

    .line 94
    iput-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->repairAuthSession:Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;

    .line 95
    iput-object v15, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->initialState:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    .line 103
    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->handleErrors()V

    .line 104
    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->launchBrowserIfNonOauth()V

    .line 105
    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->initializeState()V

    return-void
.end method

.method public static final synthetic access$cancelAuthSessionAndContinue(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthSessionAndContinue(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$cancelInFullscreen(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelInFullscreen()V

    return-void
.end method

.method public static final synthetic access$cancelInModal(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelInModal()V

    return-void
.end method

.method public static final synthetic access$completeAuthorizationSession(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCancelAuthorizationSession$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    return-object p0
.end method

.method public static final synthetic access$getCreateAuthorizationSession$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleError$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/HandleError;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPane(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPostAuthSessionEvent$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    return-object p0
.end method

.method public static final synthetic access$getUriUtils$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    return-object p0
.end method

.method public static final synthetic access$initializeBankAuthRepair(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->initializeBankAuthRepair(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$initializePartnerAuth(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->initializePartnerAuth(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$launchAuthInBrowser(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->launchAuthInBrowser(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-void
.end method

.method public static final synthetic access$onAuthCancelled(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthCancelled(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onAuthFailed(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthFailed(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$presentDataAccessBottomSheet(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->presentDataAccessBottomSheet()V

    return-void
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 77
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final browserReadyUrl(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)Ljava/lang/String;
    .locals 6

    .line 265
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->applicationId:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stripe-auth://native-redirect/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final cancelAuthSessionAndContinue(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 393
    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 396
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v2

    iput-object p0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$cancelAuthSessionAndContinue$1;->label:I

    invoke-virtual {p2, v2, v0}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 393
    :goto_1
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 397
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->isOAuth()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 399
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Creating a new session for this OAuth institution"

    invoke-interface {p2, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 401
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;-><init>(Ljava/util/Date;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    invoke-virtual {p2, p1, v1}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;)V

    .line 404
    new-instance p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda6;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda6;-><init>()V

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 405
    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->recreateAuthSession()Lkotlinx/coroutines/Job;

    goto :goto_2

    .line 408
    :cond_4
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-direct {v2, v4}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;-><init>(Ljava/util/Date;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    invoke-virtual {v1, p1, v2}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;)V

    .line 409
    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 410
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p1

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v0, v1}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 411
    new-instance p1, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;

    invoke-direct {p1, v3}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;-><init>(Z)V

    move-object v6, p1

    check-cast v6, Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 409
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 414
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final cancelAuthSessionAndContinue$lambda$14(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    sget-object v0, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final cancelInFullscreen()V
    .locals 6

    .line 526
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 527
    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 528
    new-instance v2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;-><init>(Z)V

    check-cast v2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 526
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method private final cancelInModal()V
    .locals 1

    .line 522
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-interface {v0}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    return-void
.end method

.method private final completeAuthorizationSession(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p2, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 416
    iget v1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    const/4 v7, 0x3

    const/4 v2, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    if-eq v1, v8, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v11, v1

    move-object v1, p1

    move-object p1, v11

    goto/16 :goto_3

    :cond_3
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v11, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v11

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, v1

    goto/16 :goto_8

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 417
    :try_start_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 418
    new-instance p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda1;-><init>()V

    invoke-virtual {p0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 419
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 420
    sget-object p2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;->INSTANCE:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;

    check-cast p2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    .line 419
    iput-object p0, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v2, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p2, v0, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v1, p2

    move-object p2, p1

    move-object p1, p0

    .line 416
    :goto_1
    :try_start_4
    check-cast v1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 421
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v1

    .line 422
    iget-object v2, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 424
    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    if-eqz v1, :cond_6

    .line 426
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_6
    move-object v5, v9

    .line 423
    :goto_2
    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;

    .line 427
    const-string v10, "success"

    .line 423
    invoke-direct {v6, v3, p2, v10, v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 422
    invoke-interface {v2, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    if-eqz v1, :cond_a

    .line 431
    iget-object p2, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-direct {v3, v5}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;-><init>(Ljava/util/Date;)V

    check-cast v3, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    invoke-virtual {p2, v2, v3}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;)V

    .line 432
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->isOAuth()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 433
    iget-object p2, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Web AuthFlow completed! waiting for oauth results"

    invoke-interface {p2, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 434
    iget-object p2, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->pollAuthorizationSessionOAuthResults:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v8, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    invoke-virtual {p2, v1, v4}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    goto :goto_4

    .line 416
    :cond_7
    :goto_3
    check-cast p2, Lcom/stripe/android/financialconnections/model/MixedOAuthParams;

    .line 435
    iget-object v2, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v3, "OAuth results received! completing session"

    invoke-interface {v2, v3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 436
    iget-object v2, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

    .line 437
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v1

    .line 438
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/MixedOAuthParams;->getPublicToken()Ljava/lang/String;

    move-result-object p2

    .line 436
    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object v9, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    invoke-virtual {v2, v1, p2, v4}, Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;->invoke(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_8

    :goto_4
    return-object v0

    .line 416
    :cond_8
    :goto_5
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 440
    iget-object v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Session authorized!"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 441
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p2

    invoke-static {p2}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p2

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    invoke-static {p2, v0, v9, v8, v9}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_6
    move-object v1, p2

    goto :goto_7

    .line 443
    :cond_9
    sget-object p2, Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;

    check-cast p2, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    invoke-static {p2, v0, v9, v8, v9}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_6

    .line 445
    :goto_7
    sget-object p2, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->INSTITUTION_AUTHORIZED:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    invoke-static {p2, v0, v9, v8, v9}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;

    .line 446
    iget-object v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 447
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 417
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_9

    .line 430
    :cond_a
    const-string p2, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_2
    move-exception v0

    move-object p2, v0

    move-object p1, p0

    .line 417
    :goto_8
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 447
    :goto_9
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_b

    .line 448
    iget-object v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 451
    iget-object v1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 452
    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    .line 448
    const-string v3, "failed authorizing session"

    invoke-static {v0, v3, p2, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 454
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda2;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 456
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final completeAuthorizationSession$lambda$16$lambda$15(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;

    sget-object v2, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;->AUTHENTICATING:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v9, 0x17

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private static final completeAuthorizationSession$lambda$18$lambda$17(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->initialState:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    return-object v0
.end method

.method private final handleErrors()V
    .locals 10

    .line 205
    sget-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 204
    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 216
    move-object v4, p0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 217
    sget-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$4;

    move-object v5, v0

    check-cast v5, Lkotlin/reflect/KProperty1;

    .line 216
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$5;

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$handleErrors$5;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final initializeBankAuthRepair(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 133
    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p1

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 136
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;->get()Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;->getCoreAuthorization()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    const-string v2, "Required value was null."

    if-eqz p2, :cond_7

    .line 137
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 139
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->repairAuthSession:Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeBankAuthRepair$1;->label:I

    invoke-virtual {v2, p2, v0}, Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    .line 133
    :cond_4
    :goto_2
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 141
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    .line 142
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    .line 141
    :goto_3
    invoke-direct {v0, p1, v4, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;-><init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object v0

    .line 137
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 136
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final initializePartnerAuth(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 148
    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->label:I

    const-string v3, "Required value was null."

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p2

    .line 152
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    .line 153
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 152
    iput-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializePartnerAuth$1;->label:I

    invoke-virtual {v2, v5, p1, v0}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    .line 148
    :goto_1
    move-object v2, p2

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object p2, p1

    goto :goto_2

    .line 153
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 156
    :cond_5
    :goto_2
    new-instance p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    .line 157
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    .line 158
    :goto_3
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 156
    invoke-direct {p1, v0, p2, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;-><init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p1

    .line 158
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final initializeState()V
    .locals 6

    .line 121
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeState$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$initializeState$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 128
    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda5;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final initializeState$lambda$0(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    .line 129
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final launchAuthInBrowser(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V
    .locals 5

    .line 248
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->browserReadyUrl(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 249
    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda12;

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda12;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 250
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 252
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v2

    .line 253
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    .line 254
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getFlow()Ljava/lang/String;

    move-result-object p1

    .line 255
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

    .line 552
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 255
    invoke-virtual {v4, v0}, Lcom/stripe/android/financialconnections/browser/BrowserManager;->getPackageToHandleUri(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 251
    new-instance v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionOpened;

    invoke-direct {v4, v3, p1, v0, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionOpened;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 250
    invoke-interface {v1, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    :cond_0
    return-void
.end method

.method private static final launchAuthInBrowser$lambda$6$lambda$5(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect$OpenPartnerAuth;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect$OpenPartnerAuth;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    const/16 v7, 0x1b

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final launchBrowserIfNonOauth()V
    .locals 6

    .line 192
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 193
    sget-object v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchBrowserIfNonOauth$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchBrowserIfNonOauth$1;

    check-cast v1, Lkotlin/reflect/KProperty1;

    .line 192
    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchBrowserIfNonOauth$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchBrowserIfNonOauth$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final onAuthCancelled(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v2

    iget-object v0, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 339
    iget v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v4, 0x1

    const/4 v11, 0x2

    const/4 v12, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v4, :cond_4

    if-eq v3, v11, :cond_3

    if-eq v3, v10, :cond_2

    if-ne v3, v9, :cond_1

    iget-object v2, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :goto_1
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object v13, v2

    goto/16 :goto_9

    :cond_3
    iget-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v4, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v13, v4

    move-object v4, v3

    move-object v3, v5

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    move-object v13, v4

    move-object v3, v5

    goto/16 :goto_9

    :cond_4
    iget-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v13, v3

    move-object v3, v4

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v13, v3

    move-object v3, v4

    goto/16 :goto_9

    :cond_5
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 340
    :try_start_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 341
    iget-object v0, v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v3, "Auth cancelled, cancelling AuthSession"

    invoke-interface {v0, v3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 342
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda7;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda7;-><init>()V

    invoke-virtual {v1, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 343
    iget-object v3, v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 344
    sget-object v0, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;->INSTANCE:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;

    check-cast v0, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    .line 343
    iput-object v1, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    move-object/from16 v13, p1

    :try_start_4
    iput-object v13, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    iput v4, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v4, v0

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v0, v2, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object v3, v1

    .line 339
    :goto_2
    :try_start_5
    check-cast v0, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 345
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    .line 346
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v4

    .line 347
    iget-object v5, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 349
    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v7

    if-nez v13, :cond_7

    .line 350
    const-string v8, "none"

    goto :goto_3

    :cond_7
    move-object v8, v13

    :goto_3
    if-eqz v4, :cond_8

    .line 351
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v14

    goto :goto_4

    :cond_8
    move-object v14, v12

    .line 348
    :goto_4
    new-instance v15, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;

    .line 352
    const-string v9, "cancelled"

    .line 348
    invoke-direct {v15, v7, v8, v9, v14}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v15, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 347
    invoke-interface {v5, v15}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    if-eqz v4, :cond_d

    .line 356
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->enableRetrieveAuthSession(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 360
    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->retrieveAuthorizationSession:Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v5

    iput-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    iput-object v13, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    iput-object v4, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$2:Ljava/lang/Object;

    iput v11, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {v0, v5, v6}, Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    goto :goto_6

    .line 339
    :cond_9
    :goto_5
    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 361
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v5

    .line 362
    iget-object v7, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 364
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v8

    .line 363
    new-instance v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionRetrieved;

    invoke-direct {v9, v5, v8}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionRetrieved;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;)V

    check-cast v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 362
    invoke-interface {v7, v9}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 368
    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v7

    if-ne v5, v7, :cond_a

    .line 370
    iput-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    iput-object v13, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    iput-object v12, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$2:Ljava/lang/Object;

    iput v10, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-direct {v3, v0, v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthSessionAndContinue(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_b

    goto :goto_6

    .line 373
    :cond_a
    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-direct {v4, v6}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;-><init>(Ljava/util/Date;)V

    check-cast v4, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    invoke-virtual {v0, v2, v4}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;)V

    .line 374
    iget-object v14, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-static {v5}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object v0

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    invoke-static {v0, v2, v12, v11, v12}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    :cond_b
    move-object v2, v13

    goto :goto_7

    .line 377
    :cond_c
    iput-object v3, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    iput-object v13, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-direct {v3, v4, v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthSessionAndContinue(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-ne v0, v2, :cond_b

    :goto_6
    return-object v2

    .line 379
    :goto_7
    :try_start_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 340
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_a

    .line 355
    :cond_d
    :try_start_7
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_9

    :catchall_4
    move-exception v0

    goto :goto_8

    :catchall_5
    move-exception v0

    move-object/from16 v13, p1

    :goto_8
    move-object v3, v1

    .line 340
    :goto_9
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v13

    .line 379
    :goto_a
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 380
    iget-object v4, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 381
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "failed cancelling session after cancelled web flow. url: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 383
    iget-object v5, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 384
    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v6

    .line 380
    invoke-static {v4, v2, v0, v5, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 386
    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda8;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda8;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v3, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 388
    :cond_e
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final onAuthCancelled$lambda$11$lambda$10(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;

    sget-object v2, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;->AUTHENTICATING:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v9, 0x17

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private static final onAuthCancelled$lambda$13$lambda$12(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final onAuthFailed(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p4, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 298
    iget v1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;

    iget-object p2, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;

    iget-object p2, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p3, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    check-cast p3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_1
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v9, p4

    move-object p4, p1

    move-object p1, p2

    move-object p2, p3

    move-object p3, v9

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object p2, p3

    goto/16 :goto_6

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 303
    new-instance p4, Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;

    invoke-direct {p4, p2, p3}, Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 305
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object p0, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    iput-object p4, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$2:Ljava/lang/Object;

    iput v2, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object p3, p2

    move-object p2, p0

    :goto_1
    :try_start_3
    check-cast p3, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p3

    .line 306
    iget-object v1, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 308
    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p3, :cond_5

    .line 310
    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v3

    .line 307
    :goto_2
    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;

    .line 311
    const-string v8, "failed"

    .line 307
    invoke-direct {v6, v2, p1, v8, v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 306
    invoke-interface {v1, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 314
    iget-object p1, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 315
    const-string v1, "Auth failed, cancelling AuthSession"

    .line 316
    move-object v2, p4

    check-cast v2, Ljava/lang/Throwable;

    .line 317
    iget-object v5, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 318
    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v6

    .line 314
    invoke-static {p1, v1, v2, v5, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    if-eqz p3, :cond_7

    .line 322
    iget-object p1, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    move-object v6, p4

    check-cast v6, Ljava/lang/Throwable;

    invoke-direct {v2, v5, v6}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;-><init>(Ljava/util/Date;Ljava/lang/Throwable;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    invoke-virtual {p1, v1, v2}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;)V

    .line 323
    iget-object p1, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object p3

    iput-object p2, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    iput-object p4, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    iput-object v3, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$2:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    invoke-virtual {p1, p3, v4}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object p1, p4

    :goto_4
    move-object p4, p1

    goto :goto_5

    .line 326
    :cond_7
    iget-object p1, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string p3, "Could not find AuthSession to cancel."

    invoke-interface {p1, p3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 328
    :goto_5
    new-instance p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda4;

    invoke-direct {p1, p4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;)V

    invoke-virtual {p2, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 329
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 304
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object p1, v0

    move-object p2, p0

    :goto_6
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 329
    :goto_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 330
    iget-object p3, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 333
    iget-object p4, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 334
    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p2

    .line 330
    const-string v0, "failed cancelling session after failed web flow"

    invoke-static {p3, v0, p1, p4, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 337
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final onAuthFailed$lambda$8$lambda$7(Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    check-cast p0, Ljava/lang/Throwable;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private static final onCancelClick$lambda$20(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lkotlin/Unit;
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getInModal()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickCancel;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickCancel;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    goto :goto_0

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickChooseAnotherBank;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickChooseAnotherBank;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 504
    :goto_0
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onCancelClick$1$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onCancelClick$1$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 519
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onLaunchAuthClick$lambda$2(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;

    sget-object v2, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;->AUTHENTICATING:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v9, 0x17

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private static final onLaunchAuthClick$lambda$4(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->getAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 237
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->reportOAuthLaunched(Ljava/lang/String;)V

    .line 238
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->launchAuthInBrowser(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    .line 239
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 233
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Payload shouldn\'t be null when the user launches the auth flow"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final onViewEffectLaunched$lambda$19(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1b

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    .line 493
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final presentDataAccessBottomSheet()V
    .locals 3

    .line 483
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->getAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 484
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getDisplay()Lcom/stripe/android/financialconnections/model/Display;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Display;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 485
    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 486
    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 487
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    .line 485
    invoke-interface {v1, v2, v0}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private final recreateAuthSession()Lkotlinx/coroutines/Job;
    .locals 3

    .line 163
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$recreateAuthSession$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$recreateAuthSession$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 186
    sget-object v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$recreateAuthSession$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$recreateAuthSession$2;

    check-cast v1, Lkotlin/reflect/KProperty1;

    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda0;-><init>()V

    .line 184
    invoke-virtual {p0, v0, v1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->execute(Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method private static final recreateAuthSession$lambda$1(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 9

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    .line 188
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method

.method private final reportOAuthLaunched(Ljava/lang/String;)V
    .locals 3

    .line 243
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;-><init>(Ljava/util/Date;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;)V

    .line 244
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickContinue;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickContinue;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {p1, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-void
.end method


# virtual methods
.method public final onCancelClick()V
    .locals 1

    .line 497
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda11;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda11;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final onLaunchAuthClick()V
    .locals 1

    .line 230
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda9;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda9;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    .line 232
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda10;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda10;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    .line 492
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onWebAuthFlowFinished(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V
    .locals 7

    const-string v0, "webStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Web AuthFlow status received "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 271
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;-><init>(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getInModal()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 112
    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 113
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    .line 114
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getCanNavigateBack()Z

    move-result v2

    .line 115
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v3

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 112
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 77
    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
