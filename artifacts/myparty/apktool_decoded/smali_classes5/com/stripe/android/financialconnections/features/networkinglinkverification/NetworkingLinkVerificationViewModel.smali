.class public final Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "NetworkingLinkVerificationViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 .2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.Bs\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u0010\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0008\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "confirmVerification",
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification;",
        "markLinkVerified",
        "Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "analyticsTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "startVerification",
        "Lcom/stripe/android/financialconnections/domain/StartVerification;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "isLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "attachConsumerToLinkAccountSession",
        "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;",
        "consumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "handleError",
        "Lcom/stripe/android/financialconnections/domain/HandleError;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/HandleError;)V",
        "",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "buildPayload",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
        "consumerSession",
        "Lcom/stripe/android/model/ConsumerSession;",
        "initialInstitution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "observeAsyncs",
        "onOTPEntered",
        "Lkotlinx/coroutines/Job;",
        "otp",
        "",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final attachConsumerToLinkAccountSession:Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

.field private final confirmVerification:Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

.field private final consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

.field private final isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final markLinkVerified:Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final startVerification:Lcom/stripe/android/financialconnections/domain/StartVerification;


# direct methods
.method public static synthetic $r8$lambda$MQm5RzeS_i3y8p_Xm985hjpqIUo(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->onOTPEntered$lambda$1(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$NCeutPKvWXWfcySPwrmv8jC9jEc(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->startVerification$lambda$0(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->$stable:I

    .line 182
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/HandleError;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmVerification"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markLinkVerified"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsTracker"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startVerification"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkWithStripe"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachConsumerToLinkAccountSession"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionProvider"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleError"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 49
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 50
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->confirmVerification:Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    .line 51
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->markLinkVerified:Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;

    .line 52
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 53
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 54
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->startVerification:Lcom/stripe/android/financialconnections/domain/StartVerification;

    .line 55
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 56
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    .line 57
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->attachConsumerToLinkAccountSession:Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

    .line 58
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    .line 59
    iput-object p13, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    .line 63
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->observeAsyncs()V

    .line 64
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->startVerification()V

    return-void
.end method

.method public static final synthetic access$buildPayload(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Lcom/stripe/android/model/ConsumerSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->buildPayload(Lcom/stripe/android/model/ConsumerSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsTracker$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->analyticsTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getAttachConsumerToLinkAccountSession$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->attachConsumerToLinkAccountSession:Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

    return-object p0
.end method

.method public static final synthetic access$getConfirmVerification$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/ConfirmVerification;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->confirmVerification:Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    return-object p0
.end method

.method public static final synthetic access$getConsumerSessionProvider$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getHandleError$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/HandleError;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getMarkLinkVerified$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->markLinkVerified:Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 46
    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getStartVerification$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/StartVerification;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->startVerification:Lcom/stripe/android/financialconnections/domain/StartVerification;

    return-object p0
.end method

.method public static final synthetic access$isLinkWithStripe$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    return-object p0
.end method

.method public static final synthetic access$onOTPEntered(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;

    move-result-object p0

    return-object p0
.end method

.method private final buildPayload(Lcom/stripe/android/model/ConsumerSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;
    .locals 8

    .line 90
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-static {p1}, LConsumerSessionExtensionsKt;->getRedactedPhoneNumber(Lcom/stripe/android/model/ConsumerSession;)Ljava/lang/String;

    move-result-object v2

    .line 93
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 94
    new-instance v3, Lcom/stripe/android/uicore/elements/OTPElement;

    .line 95
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v0, "otp"

    invoke-virtual {p1, v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    .line 96
    new-instance v0, Lcom/stripe/android/uicore/elements/OTPController;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v0, v7, v5, v6}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    invoke-direct {v3, p1, v0}, Lcom/stripe/android/uicore/elements/OTPElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/OTPController;)V

    .line 89
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    return-object v0
.end method

.method private final observeAsyncs()V
    .locals 4

    .line 102
    sget-object v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$observeAsyncs$1;

    check-cast v0, Lkotlin/reflect/KProperty1;

    .line 101
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$observeAsyncs$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$observeAsyncs$2;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$observeAsyncs$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$observeAsyncs$3;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0, v0, v1, v3}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method private final onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;
    .locals 6

    .line 119
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 164
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$$ExternalSyntheticLambda1;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method private static final onOTPEntered$lambda$1(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 2

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 164
    invoke-static {p0, v0, p1, v1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object p0

    return-object p0
.end method

.method private final startVerification()V
    .locals 6

    .line 68
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$startVerification$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$startVerification$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 73
    new-instance v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$$ExternalSyntheticLambda0;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final startVerification$lambda$0(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 2

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 74
    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->copy$default(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    .line 80
    sget-object v2, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 82
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 79
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 46
    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
