.class public final Lcom/stripe/android/link/ui/wallet/WalletViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "WalletViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/wallet/WalletViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 LinkDismissalCoordinator.kt\ncom/stripe/android/link/LinkDismissalCoordinatorKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,667:1\n230#2,5:668\n230#2,5:673\n230#2,5:680\n230#2,5:685\n230#2,5:690\n230#2,5:695\n230#2,5:700\n230#2,5:705\n230#2,5:728\n230#2,5:734\n230#2,5:739\n230#2,5:744\n230#2,5:749\n230#2,5:754\n230#2,5:759\n230#2,5:764\n230#2,5:769\n230#2,5:774\n230#2,5:779\n295#3,2:678\n626#3,12:716\n20#4,6:710\n1#5:733\n*S KotlinDebug\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n*L\n124#1:668,5\n174#1:673,5\n212#1:680,5\n216#1:685,5\n222#1:690,5\n248#1:695,5\n257#1:700,5\n279#1:705,5\n306#1:728,5\n353#1:734,5\n356#1:739,5\n379#1:744,5\n411#1:749,5\n464#1:754,5\n493#1:759,5\n499#1:764,5\n546#1:769,5\n559#1:774,5\n576#1:779,5\n210#1:678,2\n298#1:716,12\n289#1:710,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 g2\u00020\u0001:\u0001gB\u0080\u0001\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(\u0017\u0012\u0004\u0012\u00020\u00180\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0013\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\"\u00106\u001a\u00020\u00182\u0008\u0010%\u001a\u0004\u0018\u00010!2\u0008\u0008\u0002\u00107\u001a\u000208H\u0082@\u00a2\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<H\u0002J\u0008\u0010=\u001a\u000208H\u0002J\u001c\u0010>\u001a\u00020\u00182\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020A0@H\u0082@\u00a2\u0006\u0002\u0010BJ\u000c\u0010C\u001a\u000208*\u00020DH\u0002J\u000e\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010G\u001a\u00020\u00182\u0006\u0010H\u001a\u000208J\u0006\u0010I\u001a\u00020\u0018J\u001c\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u0002082\n\u0008\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0002J\u0016\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020DH\u0082@\u00a2\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u00020\u00182\u0006\u0010R\u001a\u00020<H\u0002J\u0016\u0010S\u001a\u00020\u00182\u0006\u0010T\u001a\u00020DH\u0082@\u00a2\u0006\u0002\u0010PJ\u0006\u0010U\u001a\u00020\u0018J\u000e\u0010V\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010W\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010X\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020[J\u0008\u0010\\\u001a\u00020\u0018H\u0002J\u000e\u0010]\u001a\u00020\u00182\u0006\u0010^\u001a\u000208J\u000e\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020\u0018J\u0018\u0010c\u001a\u00020\u00182\u0006\u0010R\u001a\u00020<2\u0006\u0010d\u001a\u00020!H\u0002J\u0018\u0010e\u001a\u00020\u00182\u0006\u0010R\u001a\u00020<2\u0006\u0010d\u001a\u00020!H\u0002J\u000e\u0010f\u001a\u0008\u0012\u0004\u0012\u00020[0@H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(\u0017\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\u0004\u0018\u00010!*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u001a\u0010(\u001a\u0004\u0018\u00010!*\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\'R\u0017\u0010*\u001a\u0008\u0012\u0004\u0012\u00020$0+\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010.\u001a\u00020/\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u00102\u001a\u000203\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105\u00a8\u0006h"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "completeLinkFlow",
        "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "dismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "navigateAndClearStack",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkScreen;",
        "Lkotlin/ParameterName;",
        "name",
        "route",
        "",
        "dismissWithResult",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "supportedPaymentMethodTypes",
        "",
        "",
        "_uiState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
        "selectedItemId",
        "getSelectedItemId",
        "(Lcom/stripe/android/link/LinkLaunchMode;)Ljava/lang/String;",
        "paymentSelectionHint",
        "getPaymentSelectionHint",
        "uiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getUiState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "expiryDateController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getExpiryDateController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "cvcController",
        "Lcom/stripe/android/ui/core/elements/CvcController;",
        "getCvcController",
        "()Lcom/stripe/android/ui/core/elements/CvcController;",
        "loadPaymentDetails",
        "isAfterAdding",
        "",
        "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onFatal",
        "fatalError",
        "",
        "shouldAutoSelectDefaultPaymentMethod",
        "handleAutoSelection",
        "paymentDetails",
        "",
        "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isReadyForUse",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "onItemSelected",
        "item",
        "onExpandedChanged",
        "expanded",
        "onPrimaryButtonClicked",
        "setProcessingState",
        "isProcessing",
        "errorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "handleExpiredCard",
        "paymentDetail",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleUpdateError",
        "error",
        "performPaymentConfirmation",
        "selectedPaymentDetails",
        "onPayAnotherWayClicked",
        "onRemoveClicked",
        "onUpdateClicked",
        "onSetDefaultClicked",
        "onAddPaymentMethodOptionClicked",
        "option",
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
        "onAddBankAccountClicked",
        "onPresentFinancialConnections",
        "success",
        "onFinancialConnectionsResult",
        "result",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "onDismissAlert",
        "updateErrorMessageAndStopProcessing",
        "loggerMessage",
        "onAddBankAccountError",
        "getAddPaymentMethodOptions",
        "Companion",
        "paymentsheet_release"
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

.field public static final Companion:Lcom/stripe/android/link/ui/wallet/WalletViewModel$Companion;


# instance fields
.field private final _uiState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;"
        }
    .end annotation
.end field

.field private final completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

.field private final dismissWithResult:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

.field private final expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigateAndClearStack:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkScreen;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private final supportedPaymentMethodTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final uiState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$P6EFZROUfFDyAjPxKnVLpeBz1o0(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController$lambda$1(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->Companion:Lcom/stripe/android/link/ui/wallet/WalletViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkScreen;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v0, p0

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

    const-string v11, "configuration"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkAccount"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkAccountManager"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "completeLinkFlow"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "logger"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "navigationManager"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkLaunchMode"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "dismissalCoordinator"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "navigateAndClearStack"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "dismissWithResult"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 60
    iput-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 61
    iput-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 62
    iput-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 63
    iput-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    .line 64
    iput-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 65
    iput-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 66
    iput-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 67
    iput-object v8, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 68
    iput-object v9, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigateAndClearStack:Lkotlin/jvm/functions/Function1;

    .line 69
    iput-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 71
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    .line 73
    invoke-static {v3, v2}, Lcom/stripe/android/link/model/SupportedPaymentMethodTypesKt;->supportedPaymentMethodTypes(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/model/LinkAccount;)Ljava/util/Set;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->supportedPaymentMethodTypes:Ljava/util/Set;

    .line 77
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    .line 78
    invoke-virtual {v2}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result v4

    invoke-static {v3, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->isSetupForFutureUsage(Lcom/stripe/android/model/StripeIntent;Z)Z

    move-result v11

    .line 80
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getMerchantName()Ljava/lang/String;

    move-result-object v12

    .line 82
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object v8

    .line 84
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCollectMissingBillingDetailsForExistingPaymentMethods()Z

    move-result v17

    .line 88
    invoke-virtual {v0, v7}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getSelectedItemId(Lcom/stripe/android/link/LinkLaunchMode;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 89
    :goto_0
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    invoke-static {v4, v7}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->completePaymentButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v13

    .line 90
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-static {v1, v7}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->access$secondaryButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v14

    .line 91
    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getAddPaymentMethodOptions()Ljava/util/List;

    move-result-object v16

    .line 92
    invoke-direct {v0, v7}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getPaymentSelectionHint(Lcom/stripe/android/link/LinkLaunchMode;)Ljava/lang/String;

    move-result-object v25

    .line 93
    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->shouldAutoSelectDefaultPaymentMethod()Z

    move-result v26

    .line 76
    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 88
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    const v28, 0x27e000

    const/16 v29, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object v7, v2

    .line 76
    invoke-direct/range {v5 .. v29}, Lcom/stripe/android/link/ui/wallet/WalletUiState;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 75
    invoke-static {v5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 112
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:Lkotlinx/coroutines/flow/StateFlow;

    .line 114
    new-instance v3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 115
    new-instance v4, Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-direct {v4}, Lcom/stripe/android/uicore/elements/DateConfig;-><init>()V

    check-cast v4, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move/from16 p6, v5

    move-object/from16 p7, v6

    move/from16 p3, v7

    move-object/from16 p4, v8

    move-object/from16 p5, v9

    .line 114
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 117
    new-instance v3, Lcom/stripe/android/ui/core/elements/CvcController;

    .line 118
    new-instance v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v2, v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    const/16 v4, 0xd

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p3, v2

    move-object/from16 p1, v3

    move/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p2, v6

    move-object/from16 p4, v7

    move/from16 p5, v8

    .line 117
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/ui/core/elements/CvcController;-><init>(Lcom/stripe/android/ui/core/elements/CvcConfig;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, p1

    iput-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    .line 669
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 670
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const v26, 0x3fffef

    const/16 v27, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

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

    .line 125
    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 671
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 128
    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$2;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p1, v2

    move-object/from16 p4, v3

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p2, v7

    move-object/from16 p3, v8

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 132
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$3;

    invoke-direct {v3, v0, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$3;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object/from16 p1, v2

    move-object/from16 p4, v3

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 149
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4;

    invoke-direct {v3, v0, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object/from16 p1, v2

    move-object/from16 p4, v3

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 157
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$5;

    invoke-direct {v2, v0, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$5;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x3

    const/4 v5, 0x0

    move-object/from16 p1, v1

    move-object/from16 p4, v2

    move/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getLinkAccount$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getLinkLaunchMode$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/LinkLaunchMode;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object p0
.end method

.method public static final synthetic access$getNavigateAndClearStack$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigateAndClearStack:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$get_uiState$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$handleAutoSelection(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->handleAutoSelection(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleExpiredCard(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->handleExpiredCard(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadPaymentDetails(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->loadPaymentDetails(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onAddBankAccountError(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onAddBankAccountError(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$performPaymentConfirmation(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldAutoSelectDefaultPaymentMethod(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Z
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->shouldAutoSelectDefaultPaymentMethod()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$updateErrorMessageAndStopProcessing(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->updateErrorMessageAndStopProcessing(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private static final cvcController$lambda$1(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/CardBrand;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p0

    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    sget-object p0, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    return-object p0
.end method

.method private final getAddPaymentMethodOptions()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
            ">;"
        }
    .end annotation

    .line 585
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v0

    .line 587
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAccount;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 588
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 589
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->supportedPaymentMethodTypes:Ljava/util/Set;

    const-string v2, "bank_account"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 591
    new-instance v1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;

    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkConfiguration;->getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;-><init>(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 593
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->supportedPaymentMethodTypes:Ljava/util/Set;

    const-string v2, "card"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 594
    sget-object v1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;->INSTANCE:Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 585
    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final getPaymentSelectionHint(Lcom/stripe/android/link/LinkLaunchMode;)Ljava/lang/String;
    .locals 2

    .line 106
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;->getHint()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 108
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getEnableLinkPaymentSelectionHint()Z

    move-result v0

    if-nez v0, :cond_2

    .line 109
    sget-object v0, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlags;->getForceEnableLinkPaymentSelectionHint()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlag;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    return-object p1

    :cond_3
    return-object v1
.end method

.method private final handleAutoSelection(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 210
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .line 678
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    .line 210
    invoke-virtual {v4}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    check-cast v2, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    if-nez v2, :cond_2

    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v3

    .line 212
    :cond_3
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 681
    :goto_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 682
    move-object v4, v2

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const v27, 0x1fffff

    const/16 v28, 0x0

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

    const/16 v26, 0x1

    .line 212
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 683
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-eqz v3, :cond_6

    .line 214
    invoke-direct {v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->isReadyForUse(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    .line 216
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 686
    :goto_2
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 687
    move-object v4, v2

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 217
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v8

    const v27, 0x3ffff7

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const/16 v26, 0x0

    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 688
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v2, p2

    .line 219
    invoke-direct {v0, v3, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4

    return-object v1

    :cond_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_5
    move-object/from16 v2, p2

    goto :goto_2

    .line 222
    :cond_6
    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 691
    :cond_7
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 692
    move-object v5, v1

    check-cast v5, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const v28, 0x2fffff

    const/16 v29, 0x0

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

    const/16 v26, 0x0

    const/16 v27, 0x0

    .line 223
    invoke-static/range {v5 .. v29}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    .line 693
    invoke-interface {v4, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 226
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_8
    move-object/from16 v2, p2

    goto/16 :goto_1
.end method

.method private final handleExpiredCard(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;

    iget v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p2, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 287
    iget v1, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->label:I

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v9, :cond_2

    if-ne v1, v8, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->Z$0:Z

    iget-object v1, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/LinkDismissalCoordinator;

    iget-object v2, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-object v3, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_5

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 288
    iget-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-static {p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->access$toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p2

    .line 289
    iget-object v10, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 710
    invoke-interface {v10}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v11

    .line 711
    invoke-interface {v10, v7}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 290
    :try_start_1
    new-instance v2, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;

    .line 291
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v1

    .line 292
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 293
    invoke-virtual {p2}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object p2

    .line 290
    invoke-direct {v2, v1, v3, p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V

    .line 295
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p0, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$0:Ljava/lang/Object;

    iput-object p1, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$1:Ljava/lang/Object;

    iput-object v10, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$2:Ljava/lang/Object;

    iput-boolean v11, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->Z$0:Z

    iput v9, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager$DefaultImpls;->updatePaymentDetails-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, p0

    move-object v2, p1

    move-object v1, v10

    move p1, v11

    .line 715
    :goto_1
    invoke-interface {v1, p1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 296
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_9

    check-cast p2, Lcom/stripe/android/model/ConsumerPaymentDetails;

    .line 298
    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 718
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move-object v1, p2

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 719
    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 298
    invoke-virtual {v6}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    if-nez v7, :cond_6

    move-object v1, v5

    move v7, v9

    goto :goto_2

    .line 720
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Collection contains more than one matching element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-eqz v7, :cond_8

    .line 298
    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 299
    iput-object p2, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$0:Ljava/lang/Object;

    iput-object p2, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$1:Ljava/lang/Object;

    iput-object p2, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->L$2:Ljava/lang/Object;

    iput v8, v4, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleExpiredCard$1;->label:I

    invoke-direct {v3, v1, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_3
    return-object v0

    .line 725
    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Collection contains no element matching the predicate."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 301
    :cond_9
    invoke-direct {v3, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->handleUpdateError(Ljava/lang/Throwable;)V

    .line 303
    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object v1, v10

    move p1, v11

    .line 715
    :goto_5
    invoke-interface {v1, p1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    throw p2
.end method

.method private final handleUpdateError(Ljava/lang/Throwable;)V
    .locals 28

    move-object/from16 v0, p0

    .line 306
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 729
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 730
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 308
    invoke-static/range {p1 .. p1}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v22

    const v26, 0x3bffef

    const/16 v27, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 307
    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 731
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method private final isReadyForUse(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z
    .locals 5

    .line 230
    instance-of v0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 231
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getRequiresCardDetailsRecollection()Z

    move-result v0

    if-ne v0, v1, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    .line 235
    :goto_1
    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v3

    .line 236
    iget-object v4, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 234
    invoke-static {p1, v3, v4}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->supports(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 237
    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getCollectMissingBillingDetailsForExistingPaymentMethods()Z

    move-result p1

    if-eqz p1, :cond_2

    move p1, v1

    goto :goto_2

    :cond_2
    move p1, v2

    :goto_2
    if-nez v0, :cond_3

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v2
.end method

.method private final loadPaymentDetails(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;

    iget v3, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 166
    iget v4, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v3, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->Z$0:Z

    iget-object v4, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v4

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 170
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 171
    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {v4, v6}, Lcom/stripe/android/link/model/SupportedPaymentMethodTypesKt;->supportedPaymentMethodTypes(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/model/LinkAccount;)Ljava/util/Set;

    move-result-object v4

    .line 170
    iput-object v0, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->L$0:Ljava/lang/Object;

    move-object/from16 v6, p1

    iput-object v6, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->L$1:Ljava/lang/Object;

    move/from16 v7, p2

    iput-boolean v7, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->Z$0:Z

    iput v5, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$1;->label:I

    invoke-interface {v1, v4, v2}, Lcom/stripe/android/link/account/LinkAccountManager;->listPaymentDetails-gIAlu-s(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v0

    move-object v8, v6

    move v3, v7

    .line 172
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_8

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails;

    .line 174
    iget-object v4, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 674
    :goto_2
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v4

    .line 675
    move-object v4, v5

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    if-eqz v3, :cond_4

    const/4 v7, 0x0

    .line 177
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getUserSetIsExpanded()Ljava/lang/Boolean;

    move-result-object v7

    :goto_3
    move-object/from16 v17, v7

    if-eqz v3, :cond_5

    const/4 v7, 0x0

    goto :goto_4

    .line 178
    :cond_5
    invoke-virtual {v4}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v7

    :goto_4
    move-object/from16 v19, v7

    if-eqz v3, :cond_6

    .line 179
    sget-object v7, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;->INSTANCE:Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;

    check-cast v7, Lcom/stripe/android/link/ui/wallet/AddBankAccountState;

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getAddBankAccountState()Lcom/stripe/android/link/ui/wallet/AddBankAccountState;

    move-result-object v7

    :goto_5
    move-object/from16 v22, v7

    const v27, 0x3daff7

    const/16 v28, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move-object/from16 p1, v1

    move-object/from16 v1, v29

    move-object/from16 v0, v30

    .line 175
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 676
    invoke-interface {v0, v1, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 183
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 184
    iget-object v0, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigateAndClearStack:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcom/stripe/android/link/LinkScreen$PaymentMethod;->INSTANCE:Lcom/stripe/android/link/LinkScreen$PaymentMethod;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_7
    move-object/from16 v1, p1

    move-object v4, v0

    move-object/from16 v0, p0

    goto/16 :goto_2

    .line 188
    :cond_8
    invoke-direct {v2, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onFatal(Ljava/lang/Throwable;)V

    .line 190
    :cond_9
    :goto_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static synthetic loadPaymentDetails$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 166
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->loadPaymentDetails(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final onAddBankAccountClicked()V
    .locals 29

    move-object/from16 v0, p0

    .line 464
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 755
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 756
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 465
    new-instance v4, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Processing;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5, v6}, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Processing;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v4

    check-cast v21, Lcom/stripe/android/link/ui/wallet/AddBankAccountState;

    const v26, 0x3dffff

    const/16 v27, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v6

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 757
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 467
    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onAddBankAccountClicked$2;

    const/4 v7, 0x0

    invoke-direct {v1, v0, v7}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onAddBankAccountClicked$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final onAddBankAccountError(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 29

    move-object/from16 v0, p0

    .line 572
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 573
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WalletViewModel: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p1

    .line 572
    invoke-interface {v1, v2, v3}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 576
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 780
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 781
    move-object v4, v2

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 578
    invoke-static {v3}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v23

    .line 579
    sget-object v5, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;->INSTANCE:Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;

    move-object/from16 v22, v5

    check-cast v22, Lcom/stripe/android/link/ui/wallet/AddBankAccountState;

    const v27, 0x39ffff

    const/16 v28, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 577
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 782
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method private final onFatal(Ljava/lang/Throwable;)V
    .locals 3

    .line 193
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "WalletViewModel Fatal error: "

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 195
    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    .line 197
    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v2}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v2

    .line 195
    invoke-direct {v1, p1, v2}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 194
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;

    iget v4, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 314
    iget v5, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 319
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v2

    .line 320
    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 318
    invoke-static {v1, v2, v5}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->supports(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_5

    .line 321
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getCollectMissingBillingDetailsForExistingPaymentMethods()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 324
    invoke-static {v0, v2, v5, v3, v5}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->setProcessingState$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    .line 325
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/CvcController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v5

    :goto_1
    check-cast v2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 326
    :cond_4
    new-instance v2, Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    invoke-direct {v2, v5}, Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;-><init>(Ljava/lang/String;)V

    .line 328
    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 329
    sget-object v3, Lcom/stripe/android/link/LinkScreen$UpdateCard;->INSTANCE:Lcom/stripe/android/link/LinkScreen$UpdateCard;

    .line 330
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v1

    .line 329
    invoke-virtual {v3, v1, v2}, Lcom/stripe/android/link/LinkScreen$UpdateCard;->invoke(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 328
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 334
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 337
    :cond_5
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/CvcController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, v5

    :goto_2
    check-cast v2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_7
    move-object v2, v5

    .line 340
    :goto_3
    iget-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {v7}, Lcom/stripe/android/link/account/LinkAccountManager;->getConsumerState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v7

    invoke-interface {v7}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/link/ConsumerState;

    if-eqz v7, :cond_a

    .line 341
    invoke-virtual {v7}, Lcom/stripe/android/link/ConsumerState;->getPaymentDetails()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 340
    check-cast v7, Ljava/lang/Iterable;

    .line 341
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {v9}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move-object v5, v8

    :cond_9
    check-cast v5, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    .line 342
    :cond_a
    iget-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    .line 343
    new-instance v8, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    if-eqz v5, :cond_b

    .line 346
    invoke-virtual {v5}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_c

    :cond_b
    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    invoke-virtual {v5}, Lcom/stripe/android/link/model/LinkAccount;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object v5

    .line 343
    :cond_c
    invoke-direct {v8, v1, v2, v5}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v8, Lcom/stripe/android/link/LinkPaymentMethod;

    .line 348
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 342
    iput-object v0, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    invoke-interface {v7, v8, v1, v3}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow;->invoke(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_d

    return-object v4

    :cond_d
    move-object v1, v0

    .line 314
    :goto_4
    check-cast v2, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    .line 352
    instance-of v3, v2, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;

    if-eqz v3, :cond_f

    .line 353
    iget-object v3, v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 735
    :cond_e
    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 736
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const v27, 0x3fffef

    const/16 v28, 0x0

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

    const/16 v26, 0x0

    .line 353
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    .line 737
    invoke-interface {v3, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_5

    .line 355
    :cond_f
    instance-of v3, v2, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    if-eqz v3, :cond_11

    .line 356
    iget-object v3, v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 740
    :cond_10
    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 741
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 358
    move-object v5, v2

    check-cast v5, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    invoke-virtual {v5}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v19

    const v27, 0x3fbfef

    const/16 v28, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 357
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 742
    invoke-interface {v3, v1, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_5

    .line 363
    :cond_11
    instance-of v3, v2, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    if-eqz v3, :cond_12

    .line 364
    iget-object v1, v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    check-cast v2, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    invoke-virtual {v2}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;->getLinkActivityResult()Lcom/stripe/android/link/LinkActivityResult;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 351
    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final setProcessingState(ZLcom/stripe/android/core/strings/ResolvableString;)V
    .locals 28

    move-object/from16 v0, p0

    .line 279
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 706
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 707
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const v26, 0x3fbfef

    const/16 v27, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move/from16 v8, p1

    move-object/from16 v18, p2

    .line 280
    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 708
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method static synthetic setProcessingState$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 278
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->setProcessingState(ZLcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method private final shouldAutoSelectDefaultPaymentMethod()Z
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    instance-of v1, v0, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz v1, :cond_0

    .line 204
    check-cast v0, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;->getSelectedPayment()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    if-nez v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getSkipWalletInFlowController()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final updateErrorMessageAndStopProcessing(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 29

    move-object/from16 v0, p0

    .line 555
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 556
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WalletViewModel: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p1

    .line 555
    invoke-interface {v1, v2, v3}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 559
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 775
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 776
    move-object v4, v2

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 561
    invoke-static {v3}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v23

    const v27, 0x3bdfef

    const/16 v28, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 560
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 777
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method


# virtual methods
.method public final getCvcController()Lcom/stripe/android/ui/core/elements/CvcController;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    return-object v0
.end method

.method public final getExpiryDateController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getSelectedItemId(Lcom/stripe/android/link/LinkLaunchMode;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Full;

    const/4 v1, 0x0

    if-nez v0, :cond_4

    .line 100
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;->getSelectedPayment()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1

    .line 102
    :cond_2
    instance-of p1, p1, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz p1, :cond_3

    return-object v1

    .line 98
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    return-object v1
.end method

.method public final getUiState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onAddPaymentMethodOptionClicked(Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;)V
    .locals 6

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    instance-of v0, p1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;

    if-eqz v0, :cond_0

    .line 455
    invoke-direct {p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onAddBankAccountClicked()V

    return-void

    .line 457
    :cond_0
    sget-object v0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;->INSTANCE:Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 458
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object p1, Lcom/stripe/android/link/LinkScreen$PaymentMethod;->INSTANCE:Lcom/stripe/android/link/LinkScreen$PaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkScreen$PaymentMethod;->getRoute()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void

    .line 453
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onDismissAlert()V
    .locals 28

    move-object/from16 v0, p0

    .line 546
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 770
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 771
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const v26, 0x3bffff

    const/16 v27, 0x0

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

    .line 547
    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 772
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final onExpandedChanged(Z)V
    .locals 28

    move-object/from16 v0, p0

    .line 257
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 701
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 702
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 258
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    const v26, 0x3fefff

    const/16 v27, 0x0

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 703
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final onFinancialConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onFinancialConnectionsResult$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onFinancialConnectionsResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onItemSelected(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "item"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 244
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    const-string v3, ""

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    .line 245
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    invoke-virtual {v2, v3}, Lcom/stripe/android/ui/core/elements/CvcController;->onRawValueChange(Ljava/lang/String;)V

    .line 248
    :cond_0
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 696
    :cond_1
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 697
    move-object v4, v3

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 250
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v8

    const v27, 0x3feff7

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const/16 v26, 0x0

    .line 249
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 698
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-void
.end method

.method public final onPayAnotherWayClicked()V
    .locals 4

    .line 370
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 371
    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 372
    sget-object v2, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->PayAnotherWay:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    .line 373
    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v3}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v3

    .line 371
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 370
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onPresentFinancialConnections(Z)V
    .locals 28

    move-object/from16 v0, p0

    if-eqz p1, :cond_1

    .line 493
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 760
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 761
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 494
    new-instance v4, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Processing;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Processing;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V

    move-object/from16 v21, v4

    check-cast v21, Lcom/stripe/android/link/ui/wallet/AddBankAccountState;

    const v26, 0x3dffff

    const/16 v27, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 762
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 498
    :cond_1
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "WalletViewModel: Failed to present Financial Connections"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    .line 499
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 765
    :cond_2
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 766
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 500
    sget-object v4, Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;->INSTANCE:Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;

    move-object/from16 v21, v4

    check-cast v21, Lcom/stripe/android/link/ui/wallet/AddBankAccountState;

    const v26, 0x3dffff

    const/16 v27, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    .line 767
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    return-void
.end method

.method public final onPrimaryButtonClicked()V
    .locals 10

    .line 263
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 265
    invoke-static {p0, v2, v3, v1, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->setProcessingState$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    .line 267
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    const/4 v4, 0x0

    if-eqz v1, :cond_2

    .line 268
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v1

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    .line 270
    :goto_1
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onPrimaryButtonClicked$1;

    invoke-direct {v1, v2, p0, v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onPrimaryButtonClicked$1;-><init>(ZLcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)V

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onRemoveClicked(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "item"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 745
    :cond_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 746
    move-object v4, v3

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 380
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v18

    const v27, 0x3fdfff

    const/16 v28, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 747
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 382
    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/ViewModel;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onRemoveClicked$2;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v1, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onRemoveClicked$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onSetDefaultClicked(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "item"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 750
    :cond_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 751
    move-object v4, v3

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 413
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v18

    const v27, 0x3fdfff

    const/16 v28, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 412
    invoke-static/range {v4 .. v28}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    .line 752
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 416
    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/ViewModel;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onSetDefaultClicked$2;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v0, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onSetDefaultClicked$2;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onUpdateClicked(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 7

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 402
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 403
    sget-object v0, Lcom/stripe/android/link/LinkScreen$UpdateCard;->INSTANCE:Lcom/stripe/android/link/LinkScreen$UpdateCard;

    .line 404
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    .line 403
    invoke-virtual {v0, p1, v2}, Lcom/stripe/android/link/LinkScreen$UpdateCard;->invoke(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 402
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method
