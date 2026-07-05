.class public final Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "LinkStepUpVerificationViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 ,2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,Bk\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0008\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020$J\u000e\u0010\n\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "startVerification",
        "Lcom/stripe/android/financialconnections/domain/StartVerification;",
        "consumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "confirmVerification",
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification;",
        "selectNetworkedAccounts",
        "Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;",
        "getCachedAccounts",
        "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;",
        "markLinkStepUpVerified",
        "Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "buildPayload",
        "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;",
        "consumerSession",
        "Lcom/stripe/android/model/ConsumerSession;",
        "logErrors",
        "",
        "onOTPEntered",
        "Lkotlinx/coroutines/Job;",
        "otp",
        "",
        "onResendCodeClick",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final confirmVerification:Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

.field private final consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final markLinkStepUpVerified:Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final selectNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

.field private final startVerification:Lcom/stripe/android/financialconnections/domain/StartVerification;


# direct methods
.method public static synthetic $r8$lambda$6S1ri650_BjofoW5_VVgzTENNWg(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->onResendCodeClick$lambda$2(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XxYu8JljjoKrYuf3NoXGq8ehpwE(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->_init_$lambda$0(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fTsqC8uCDOW3ze60_4XYteeJpiU(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->onOTPEntered$lambda$1(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->$stable:I

    .line 199
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_STEP_UP_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
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

    const-string v0, "getOrFetchSync"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startVerification"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmVerification"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectNetworkedAccounts"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCachedAccounts"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markLinkStepUpVerified"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 47
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 49
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->startVerification:Lcom/stripe/android/financialconnections/domain/StartVerification;

    .line 50
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    .line 51
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->confirmVerification:Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    .line 52
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->selectNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

    .line 53
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    .line 54
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->markLinkStepUpVerified:Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;

    .line 55
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 56
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 60
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->logErrors()V

    .line 61
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance p2, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 63
    new-instance p4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$$ExternalSyntheticLambda2;

    invoke-direct {p4}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$$ExternalSyntheticLambda2;-><init>()V

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
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

    .line 64
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;->copy$default(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$buildPayload(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->buildPayload(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConfirmVerification$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/ConfirmVerification;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->confirmVerification:Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetCachedAccounts$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getMarkLinkStepUpVerified$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->markLinkStepUpVerified:Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 44
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getSelectNetworkedAccounts$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->selectNetworkedAccounts:Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

    return-object p0
.end method

.method public static final synthetic access$onOTPEntered(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$startVerification(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->startVerification(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final buildPayload(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;
    .locals 8

    .line 77
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v0

    .line 78
    invoke-static {p1}, LConsumerSessionExtensionsKt;->getRedactedPhoneNumber(Lcom/stripe/android/model/ConsumerSession;)Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    .line 80
    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElement;

    .line 81
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v4, "otp"

    invoke-virtual {v3, v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    .line 82
    new-instance v4, Lcom/stripe/android/uicore/elements/OTPController;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v4, v7, v5, v6}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    invoke-direct {v2, v3, v4}, Lcom/stripe/android/uicore/elements/OTPElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/OTPController;)V

    .line 76
    new-instance v3, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    invoke-direct {v3, v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)V

    return-object v3
.end method

.method private final logErrors()V
    .locals 10

    .line 88
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 87
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 104
    move-object v4, p0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    .line 105
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$4;

    move-object v5, v0

    check-cast v5, Lkotlin/reflect/KProperty1;

    .line 104
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$5;

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$5;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 117
    sget-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$6;->INSTANCE:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$6;

    move-object v5, v0

    check-cast v5, Lkotlin/reflect/KProperty1;

    .line 116
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$7;

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$logErrors$7;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onAsync$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 6

    .line 129
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 162
    new-instance v3, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$$ExternalSyntheticLambda1;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method private static final onOTPEntered$lambda$1(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
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

    .line 162
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;->copy$default(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    move-result-object p0

    return-object p0
.end method

.method private static final onResendCodeClick$lambda$2(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
    .locals 7

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    .line 169
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;->copy$default(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    move-result-object p0

    return-object p0
.end method

.method private final startVerification(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 173
    iget v1, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->label:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 174
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object p0, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->L$0:Ljava/lang/Object;

    iput v2, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    .line 176
    iget-object v2, v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    invoke-interface {v2}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    .line 178
    iget-object v1, v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->startVerification:Lcom/stripe/android/financialconnections/domain/StartVerification;

    .line 180
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getBusinessName()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    .line 178
    iput-object v3, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->L$0:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$startVerification$1;->label:I

    invoke-virtual {v1, v2, p1, v4}, Lcom/stripe/android/financialconnections/domain/StartVerification;->email(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    .line 173
    :cond_5
    :goto_3
    check-cast p1, Lcom/stripe/android/model/ConsumerSession;

    return-object p1

    .line 176
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final onResendCodeClick()V
    .locals 6

    .line 165
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onResendCodeClick$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onResendCodeClick$1;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 168
    new-instance v3, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 70
    sget-object v2, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 72
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 69
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 44
    check-cast p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
