.class public final Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;
.super Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;
.source "AccountUpdateRequiredViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Companion;,
        Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel<",
        "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 %2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BK\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0008\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0006\u0010\u0019\u001a\u00020\u0015J$\u0010\u001a\u001a\u00020\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001a\u0010!\u001a\u00020\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010\"\u001a\u00020\u0015J\u0008\u0010#\u001a\u00020\u0015H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;",
        "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;",
        "initialState",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "updateRequiredContentRepository",
        "Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;",
        "pendingRepairRepository",
        "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "updateLocalManifest",
        "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;)V",
        "loadContent",
        "",
        "updateTopAppBar",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "state",
        "handleContinue",
        "openBankAuthRepair",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "authorization",
        "",
        "referrer",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "openPartnerAuth",
        "handleCancel",
        "onCleared",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Companion;

.field private static final PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

.field private final updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

.field private final updateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;


# direct methods
.method public static synthetic $r8$lambda$AFCZGuKIPfz9m0KP-R75Q6UvHeE(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->openBankAuthRepair$lambda$1(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gPOxIE3ZSlPH488uNJbhFYseiLs(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->openPartnerAuth$lambda$2(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$i0UClGvRC4tyrECfkS0D2mg3fLc(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->loadContent$lambda$0(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->Companion:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->$stable:I

    .line 143
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_UPDATE_REQUIRED:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sput-object v0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p1    # Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateRequiredContentRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingRepairRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateLocalManifest"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;-><init>(Ljava/lang/Object;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V

    .line 36
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;

    .line 37
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

    .line 38
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 39
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 40
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

    .line 41
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 48
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->loadContent()V

    return-void
.end method

.method public static final synthetic access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 33
    sget-object v0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public static final synthetic access$getUpdateRequiredContentRepository$p(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;)Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;

    return-object p0
.end method

.method public static final synthetic access$openBankAuthRepair(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->openBankAuthRepair(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    return-void
.end method

.method public static final synthetic access$openPartnerAuth(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->openPartnerAuth(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    return-void
.end method

.method private final loadContent()V
    .locals 6

    .line 52
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$loadContent$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$loadContent$1;-><init>(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda1;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->execute$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final loadContent$lambda$0(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;
    .locals 2

    const-string v0, "$this$execute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 52
    invoke-static {p0, v0, p1, v1, v0}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;->copy$default(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;

    move-result-object p0

    return-object p0
.end method

.method private final openBankAuthRepair(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 11

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 80
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

    new-instance v3, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v3, p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    invoke-virtual {v2, v3}, Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;->invoke(Lkotlin/jvm/functions/Function1;)V

    .line 84
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;->set(Ljava/lang/String;)V

    .line 85
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object p1, Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p1, p3, v1, v0, v1}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p2, :cond_1

    move p2, v2

    goto :goto_0

    :cond_1
    move p2, v3

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    .line 89
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 91
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to open repair flow (missing auth: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v3, ", missing institution: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, ")."

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 92
    new-instance v2, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;

    const-string v3, "UpdateRepairAccountError"

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/stripe/android/financialconnections/exception/UnclassifiedError;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 93
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 94
    sget-object v4, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 89
    invoke-static {p1, p2, v2, v3, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 97
    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object p1, Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p1, p3, v1, v0, v1}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final openBankAuthRepair$lambda$1(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 51

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v49, 0x3fff

    const/16 v50, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const v48, -0x1000001

    move-object/from16 v26, p0

    .line 81
    invoke-static/range {v1 .. v50}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    return-object v0
.end method

.method private final openPartnerAuth(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 12

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    .line 106
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

    new-instance v5, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v5, p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    invoke-virtual {v4, v5}, Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;->invoke(Lkotlin/jvm/functions/Function1;)V

    .line 109
    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {v0, p2, v3, v2, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v4, Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;

    check-cast v4, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {v4, p2, v3, v2, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final openPartnerAuth$lambda$2(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 51

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v49, 0x3fff

    const/16 v50, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const v48, -0x1000001

    move-object/from16 v26, p0

    .line 107
    invoke-static/range {v1 .. v50}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final handleCancel()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-interface {v0}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    return-void
.end method

.method public final handleContinue()V
    .locals 7

    .line 60
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;-><init>(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method protected onCleared()V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;->clear()V

    .line 122
    invoke-super {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;->onCleared()V

    return-void
.end method

.method public updateTopAppBar(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic updateTopAppBar(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;
    .locals 0

    .line 33
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->updateTopAppBar(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;

    move-result-object p1

    return-object p1
.end method
