.class public final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "NetworkingLinkSignupViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkingLinkSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkSignupViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,425:1\n49#2:426\n51#2:430\n46#3:427\n51#3:429\n105#4:428\n*S KotlinDebug\n*F\n+ 1 NetworkingLinkSignupViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel\n*L\n308#1:426\n308#1:430\n308#1:427\n308#1:429\n308#1:428\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 <2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;<Bm\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0002H\u0016J\u0008\u0010%\u001a\u00020&H\u0002J\u0008\u0010\'\u001a\u00020&H\u0002J\u0008\u0010(\u001a\u00020&H\u0002J\u0008\u0010)\u001a\u00020&H\u0002J\u0012\u0010*\u001a\u00020&2\u0008\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020&J\u0008\u00102\u001a\u00020&H\u0002J\u0008\u00103\u001a\u00020&H\u0002J\u000e\u00104\u001a\u0002002\u0006\u00105\u001a\u00020,J\u0008\u00106\u001a\u00020&H\u0002J\u0014\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,08*\u000209H\u0002J\u0006\u0010:\u001a\u00020&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "lookupAccount",
        "Lcom/stripe/android/financialconnections/domain/LookupAccount;",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "presentSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "linkSignupHandler",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "handleError",
        "Lcom/stripe/android/financialconnections/domain/HandleError;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/HandleError;)V",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "searchJob",
        "Lcom/stripe/android/financialconnections/utils/ConflatedJob;",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "observeAsyncs",
        "",
        "observeLookupAccountResult",
        "observeSaveAccountResult",
        "observePayloadResult",
        "onEmailEntered",
        "validEmail",
        "",
        "getLookupDelayMs",
        "",
        "onSkipClick",
        "Lkotlinx/coroutines/Job;",
        "onSaveAccount",
        "saveNewAccount",
        "navigateToLinkVerification",
        "onClickableTextClick",
        "uri",
        "presentLegalDetailsBottomSheet",
        "validFormFieldState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/InputController;",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Companion;

.field private static final SEARCH_DEBOUNCE_FINISHED_EMAIL_MS:J = 0x12cL

.field private static final SEARCH_DEBOUNCE_MS:J = 0x3e8L


# instance fields
.field private final elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

.field private final linkSignupHandler:Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final lookupAccount:Lcom/stripe/android/financialconnections/domain/LookupAccount;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

.field private searchJob:Lcom/stripe/android/financialconnections/utils/ConflatedJob;

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method public static synthetic $r8$lambda$BOApO2lSDtfuFQh-psupKtBSwFU(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onEmailEntered$lambda$2(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DRe0VPQTW8z73WapubCNfu_LtUQ(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onEmailEntered$lambda$3(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DxI2yZUm1NPKuRXBwJuCE9CePlQ(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->saveNewAccount$lambda$5(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$HrDhD7QnFWg2GDh1YxZhzniQtlg(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onViewEffectLaunched$lambda$8(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$P3XCDU6jESq5chvt4lOFBivbX2g(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gxus59Q1Hr5oZGFg4wNQNwW1NWs(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onEmailEntered$lambda$1(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kVs62SAvNnn3D0J2VfqJsVGSPz4(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onSaveAccount$lambda$4(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/HandleError;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupAccount"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriUtils"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presentSheet"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkSignupHandler"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleError"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 69
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->lookupAccount:Lcom/stripe/android/financialconnections/domain/LookupAccount;

    .line 70
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    .line 71
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 72
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 73
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 74
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 75
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 76
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->linkSignupHandler:Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;

    .line 77
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    .line 78
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    .line 84
    new-instance p2, Lcom/stripe/android/financialconnections/utils/ConflatedJob;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/utils/ConflatedJob;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->searchJob:Lcom/stripe/android/financialconnections/utils/ConflatedJob;

    .line 87
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->observeAsyncs()V

    .line 88
    move-object p3, p0

    check-cast p3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;

    const/4 p4, 0x0

    invoke-direct {p2, p1, p0, p4}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    move-object p4, p2

    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 128
    new-instance p6, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda6;

    invoke-direct {p6}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda6;-><init>()V

    const/4 p7, 0x1

    const/4 p8, 0x0

    const/4 p5, 0x0

    invoke-static/range {p3 .. p8}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 11

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 128
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getElementsSessionContext$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleError$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/domain/HandleError;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    return-object p0
.end method

.method public static final synthetic access$getLinkSignupHandler$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->linkSignupHandler:Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getLookupAccount$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/domain/LookupAccount;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->lookupAccount:Lcom/stripe/android/financialconnections/domain/LookupAccount;

    return-object p0
.end method

.method public static final synthetic access$getLookupDelayMs(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;)J
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getLookupDelayMs(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPane(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUriUtils$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    return-object p0
.end method

.method public static final synthetic access$navigateToLinkVerification(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->navigateToLinkVerification()V

    return-void
.end method

.method public static final synthetic access$onEmailEntered(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onEmailEntered(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$presentLegalDetailsBottomSheet(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->presentLegalDetailsBottomSheet()V

    return-void
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 66
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$validFormFieldState(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/uicore/elements/InputController;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->validFormFieldState(Lcom/stripe/android/uicore/elements/InputController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method private final getLookupDelayMs(Ljava/lang/String;)J
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 241
    const-string v2, ".com"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x12c

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x3e8

    return-wide v0
.end method

.method private final getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 82
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    return-object v0
.end method

.method private final navigateToLinkVerification()V
    .locals 1

    .line 271
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->linkSignupHandler:Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;

    invoke-interface {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;->navigateToVerification()V

    return-void
.end method

.method private final observeAsyncs()V
    .locals 0

    .line 140
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->observePayloadResult()V

    .line 141
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->observeSaveAccountResult()V

    .line 142
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->observeLookupAccountResult()V

    return-void
.end method

.method private final observeLookupAccountResult()V
    .locals 4

    .line 147
    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeLookupAccountResult$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeLookupAccountResult$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 146
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeLookupAccountResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeLookupAccountResult$2;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeLookupAccountResult$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeLookupAccountResult$3;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method private final observePayloadResult()V
    .locals 4

    .line 181
    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 180
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$3;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method private final observeSaveAccountResult()V
    .locals 4

    .line 170
    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeSaveAccountResult$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeSaveAccountResult$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 169
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeSaveAccountResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeSaveAccountResult$2;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeSaveAccountResult$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observeSaveAccountResult$3;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method private final onEmailEntered(Ljava/lang/String;)V
    .locals 7

    .line 212
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    if-eqz p1, :cond_0

    .line 214
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "VALID EMAIL ADDRESS "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->searchJob:Lcom/stripe/android/financialconnections/utils/ConflatedJob;

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$onEmailEntered$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$onEmailEntered$2;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 227
    new-instance v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v4}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda2;-><init>()V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    .line 215
    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->plusAssign(Lkotlinx/coroutines/Job;)V

    return-void

    .line 229
    :cond_0
    new-instance p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda3;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final onEmailEntered$lambda$1(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7d

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v1, p1

    .line 212
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method private static final onEmailEntered$lambda$2(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 10

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->isCancellationError(Lcom/stripe/android/financialconnections/presentation/Async;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    move-object v5, p1

    const/16 v8, 0x6f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method private static final onEmailEntered$lambda$3(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    sget-object v0, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v9, 0x6f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method private static final onSaveAccount$lambda$4(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lkotlin/Unit;
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;

    const-string v2, "click.save_to_link"

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 252
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getLookupAccount()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/ConsumerSessionLookup;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 254
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->navigateToLinkVerification()V

    goto :goto_0

    .line 256
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->saveNewAccount()V

    .line 258
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onViewEffectLaunched$lambda$8(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 11

    const-string v0, "$this$setState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x5f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    .line 312
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method private final presentLegalDetailsBottomSheet()V
    .locals 3

    .line 296
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;->getContent()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;->getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 297
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->presentSheet:Lcom/stripe/android/financialconnections/features/notice/PresentSheet;

    .line 298
    new-instance v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;-><init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    check-cast v2, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 299
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    .line 297
    invoke-interface {v1, v2, v0}, Lcom/stripe/android/financialconnections/features/notice/PresentSheet;->invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final saveNewAccount()V
    .locals 6

    .line 262
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$saveNewAccount$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$saveNewAccount$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 265
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda5;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final saveNewAccount$lambda$5(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 11

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x77

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v5, p1

    .line 266
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method

.method private final validFormFieldState(Lcom/stripe/android/uicore/elements/InputController;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/InputController;",
            ")",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 307
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 428
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 309
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    sget-object v1, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    invoke-virtual {v1}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getLazily()Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$onClickableTextClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final onSaveAccount()V
    .locals 1

    .line 249
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onSkipClick()Lkotlinx/coroutines/Job;
    .locals 7

    .line 243
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$onSkipClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$onSkipClick$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

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

    .line 312
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda4;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$$ExternalSyntheticLambda4;-><init>()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 133
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    .line 134
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits()Z

    move-result v3

    .line 135
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 132
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 66
    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
