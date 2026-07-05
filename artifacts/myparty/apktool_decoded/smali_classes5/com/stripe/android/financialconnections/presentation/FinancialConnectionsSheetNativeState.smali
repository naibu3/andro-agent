.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetNativeViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008&\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u0000 F2\u00020\u0001:\u0001FBs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\u001b\u0008\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0017\u0010\u001dJ\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\t\u0010;\u001a\u00020\u0012H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u008f\u0001\u0010?\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00072\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\u0013\u0010@\u001a\u00020\u00072\u0008\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020CH\u00d6\u0001J\t\u0010D\u001a\u00020EH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010#R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010#R\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "",
        "flowType",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;",
        "webAuthFlow",
        "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;",
        "firstInit",
        "",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "reducedBranding",
        "testMode",
        "viewEffect",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;",
        "completed",
        "initialPane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "theme",
        "Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "isLinkWithStripe",
        "manualEntryUsesMicrodeposits",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)V",
        "args",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;",
        "savedState",
        "Landroid/os/Bundle;",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;Landroid/os/Bundle;)V",
        "getFlowType",
        "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;",
        "getWebAuthFlow",
        "()Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;",
        "getFirstInit",
        "()Z",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "getReducedBranding",
        "getTestMode",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;",
        "getCompleted",
        "getInitialPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getTheme",
        "()Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "getManualEntryUsesMicrodeposits",
        "getElementsSessionContext",
        "()Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState$Companion;

.field public static final KEY_FIRST_INIT:Ljava/lang/String; = "firstInit"

.field public static final KEY_SAVED_STATE:Ljava/lang/String; = "FinancialConnectionsSheetNativeState"

.field public static final KEY_WEB_AUTH_FLOW:Ljava/lang/String; = "webAuthFlow"


# instance fields
.field private final completed:Z

.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

.field private final elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

.field private final firstInit:Z

.field private final flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

.field private final initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final isLinkWithStripe:Z

.field private final manualEntryUsesMicrodeposits:Z

.field private final reducedBranding:Z

.field private final testMode:Z

.field private final theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

.field private final viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

.field private final webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)V
    .locals 1

    const-string v0, "flowType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webAuthFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialPane"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 521
    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    .line 522
    iput-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    .line 526
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    .line 527
    iput-object p4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    .line 528
    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    .line 529
    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    .line 530
    iput-object p7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    .line 531
    iput-boolean p8, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    .line 532
    iput-object p9, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 533
    iput-object p10, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 534
    iput-boolean p11, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    .line 535
    iput-boolean p12, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    .line 536
    iput-object p13, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;Landroid/os/Bundle;)V
    .locals 16

    move-object/from16 v0, p2

    const-string v1, "args"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getFlowType()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    move-result-object v3

    if-eqz v0, :cond_0

    .line 547
    const-string v1, "webAuthFlow"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    if-nez v1, :cond_1

    .line 548
    :cond_0
    sget-object v1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState$Uninitialized;

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    :cond_1
    move-object v4, v1

    .line 549
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getVisual()Lcom/stripe/android/financialconnections/model/VisualUpdate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/VisualUpdate;->getReducedBranding()Z

    move-result v7

    .line 550
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getLivemode()Z

    move-result v1

    const/4 v5, 0x1

    xor-int/lit8 v8, v1, 0x1

    if-eqz v0, :cond_2

    .line 551
    const-string v1, "firstInit"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 553
    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v11

    .line 554
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v6

    .line 555
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getTheme()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->toLocalTheme(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->Companion:Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;->getDefault()Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object v0

    :cond_4
    move-object v12, v0

    .line 557
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    move v13, v0

    .line 558
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getManualEntryUsesMicrodeposits()Z

    move-result v14

    .line 559
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v15

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p0

    .line 545
    invoke-direct/range {v2 .. v15}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    goto :goto_3

    :cond_4
    move/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-boolean v5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    goto :goto_4

    :cond_5
    move/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-boolean v7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    goto :goto_6

    :cond_7
    move/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-boolean v10, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    goto :goto_9

    :cond_a
    move/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-boolean v11, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    goto :goto_a

    :cond_b
    move/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-object/from16 p15, v0

    goto :goto_b

    :cond_c
    move-object/from16 p15, p13

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move/from16 p5, v2

    move-object/from16 p6, v3

    move/from16 p7, v4

    move/from16 p8, v5

    move-object/from16 p9, v6

    move/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move/from16 p13, v10

    move/from16 p14, v11

    invoke-virtual/range {p2 .. p15}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->copy(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    return v0
.end method

.method public final component13()Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    return v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    return v0
.end method

.method public final component7()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    return v0
.end method

.method public final component9()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 15

    const-string v0, "flowType"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webAuthFlow"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialPane"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getCompleted()Z
    .locals 1

    .line 531
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    return v0
.end method

.method public final getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 1

    .line 527
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object v0
.end method

.method public final getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1

    .line 536
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-object v0
.end method

.method public final getFirstInit()Z
    .locals 1

    .line 526
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    return v0
.end method

.method public final getFlowType()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;
    .locals 1

    .line 521
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    return-object v0
.end method

.method public final getInitialPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getManualEntryUsesMicrodeposits()Z
    .locals 1

    .line 535
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    return v0
.end method

.method public final getReducedBranding()Z
    .locals 1

    .line 528
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    return v0
.end method

.method public final getTestMode()Z
    .locals 1

    .line 529
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    return v0
.end method

.method public final getTheme()Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    .line 533
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;
    .locals 1

    .line 530
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    return-object v0
.end method

.method public final getWebAuthFlow()Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;
    .locals 1

    .line 522
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/theme/Theme;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isLinkWithStripe()Z
    .locals 1

    .line 534
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->flowType:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->webAuthFlow:Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->firstInit:Z

    iget-object v3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->reducedBranding:Z

    iget-boolean v5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->testMode:Z

    iget-object v6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->viewEffect:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;

    iget-boolean v7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->completed:Z

    iget-object v8, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->initialPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v9, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    iget-boolean v10, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe:Z

    iget-boolean v11, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->manualEntryUsesMicrodeposits:Z

    iget-object v12, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "FinancialConnectionsSheetNativeState(flowType="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v13, ", webAuthFlow="

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstInit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", configuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reducedBranding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", testMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", viewEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", completed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", initialPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isLinkWithStripe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manualEntryUsesMicrodeposits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", elementsSessionContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
