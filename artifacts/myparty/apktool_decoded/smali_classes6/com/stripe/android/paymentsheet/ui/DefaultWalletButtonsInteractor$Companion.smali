.class public final Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;
.super Ljava/lang/Object;
.source "WalletButtonsInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;",
        "flowControllerViewModel",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
        "walletsButtonLinkLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkInlineInteractor",
        "Lcom/stripe/android/link/verification/LinkInlineInteractor;",
        "embeddedLinkHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;",
        "confirmationStateHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "linkPaymentLauncher",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
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


# direct methods
.method public static synthetic $r8$lambda$-V5sbCw8A3Blzfpv6DOaEJ4wZds(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->create$lambda$1(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$M2nb6S92OtZkZLzIbzPnM9Ig6CM(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Ljava/lang/String;Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->create$lambda$0(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Ljava/lang/String;Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RY_f7z7gK__xHih2CvrAC-G_0z0(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->create$lambda$4(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Yn_wS6bS7ZqRo2jov2y79MTDPYM(Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->create$lambda$3(Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;-><init>()V

    return-void
.end method

.method private static final create$lambda$0(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Ljava/lang/String;Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;
    .locals 9

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 305
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;->getPaymentSheetState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getConfig()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v4

    .line 306
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;->getPaymentSheetState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v3

    .line 307
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;->getConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v5

    .line 308
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v6

    .line 310
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;->getConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object p2

    .line 311
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getWalletButtons$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;

    move-result-object p2

    .line 312
    invoke-static {p2}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->getAllowedWalletTypes(Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;)Ljava/util/List;

    move-result-object v7

    .line 313
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v8

    .line 303
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;-><init>(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-object v1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final create$lambda$1(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Z)Lkotlin/Unit;
    .locals 0

    .line 325
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setWalletButtonsRendered(Z)V

    .line 326
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final create$lambda$3(Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;
    .locals 9

    if-eqz p1, :cond_0

    .line 349
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/common/model/CommonConfigurationKt;->asCommonConfiguration(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v4

    .line 350
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v3

    .line 351
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getAppearance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v5

    .line 352
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v6

    .line 353
    invoke-static {}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    .line 354
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v8

    .line 347
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;

    .line 353
    move-object v7, v0

    check-cast v7, Ljava/util/List;

    move-object v2, p0

    .line 347
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;-><init>(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-object v1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final create$lambda$4(Z)Lkotlin/Unit;
    .locals 0

    .line 365
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;
    .locals 10

    const-string v0, "linkInlineInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedLinkHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationStateHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkPaymentLauncher"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    invoke-interface {p2}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;->getLinkEmail()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    .line 344
    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda0;-><init>()V

    .line 342
    invoke-static {p2, p3, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    .line 340
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;

    .line 362
    new-instance v9, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v9}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda1;-><init>()V

    move-object v6, p1

    move-object v3, p4

    move-object v4, p5

    .line 340
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    return-object v1
.end method

.method public final create(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/link/LinkPaymentLauncher;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;
    .locals 11

    const-string v0, "flowControllerViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walletsButtonLinkLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    .line 296
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;->getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v6

    .line 298
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkConfigurationCoordinator()Lcom/stripe/android/link/LinkConfigurationCoordinator;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->getEmailFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    .line 299
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 300
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getConfigureRequest()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    .line 297
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v3, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 319
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;->getConfirmationHandler()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    move-result-object v4

    .line 320
    move-object v0, p1

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    .line 321
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;->getLinkInlineInteractor()Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    move-result-object v0

    .line 323
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;->getLinkAccountHolder()Lcom/stripe/android/link/account/LinkAccountHolder;

    move-result-object v9

    .line 295
    new-instance v2, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;

    .line 321
    move-object v7, v0

    check-cast v7, Lcom/stripe/android/link/verification/LinkInlineInteractor;

    .line 324
    new-instance v10, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda3;

    invoke-direct {v10, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V

    move-object v8, p2

    .line 295
    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    return-object v2
.end method
