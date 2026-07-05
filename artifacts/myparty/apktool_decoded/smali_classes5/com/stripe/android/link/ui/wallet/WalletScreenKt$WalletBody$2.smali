.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;
.super Ljava/lang/Object;
.source "WalletScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "Ljava/lang/Boolean;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,835:1\n77#2:836\n1225#3,6:837\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2\n*L\n169#1:836\n171#1:837,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

.field final synthetic $expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $hideBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onAddPaymentMethodOptionClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDismissAlert:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onExpandedChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLogoutClicked:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPayAnotherWayClicked:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onRemoveClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSetDefaultClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onUpdateClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/link/ui/wallet/WalletUiState;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/ui/core/elements/CvcController;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onDismissAlert:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    iput-object p5, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onAddPaymentMethodOptionClicked:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p10, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onSetDefaultClicked:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onRemoveClicked:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onUpdateClicked:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onLogoutClicked:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onPayAnotherWayClicked:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 158
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->invoke(Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "$this$AnimatedContent"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous> (WalletScreen.kt:158)"

    const v4, -0x1c8e05e1

    move/from16 v5, p4

    .line 159
    invoke-static {v4, v5, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const v3, 0x3f749cbe

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 160
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const-string v4, "wallet_screen_loader_tag"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x6

    const/4 v5, 0x2

    invoke-static {v3, v2, v1, v4, v5}, Lcom/stripe/android/link/ui/LinkLoadingScreenKt;->LinkLoadingScreen-hXAe_Q4(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;II)V

    .line 159
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_0

    :cond_1
    const v3, 0x3f771040

    .line 161
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const v3, 0x6d66e880

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 162
    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getAlertMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 164
    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getAlertMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    .line 165
    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onDismissAlert:Lkotlin/jvm/functions/Function0;

    .line 163
    invoke-static {v3, v5, v1, v4}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->access$AlertMessage(Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    :cond_2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 169
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFocusManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    const v5, 0x789c5f52

    const-string v6, "CC:CompositionLocal.kt#9igjgp"

    .line 836
    invoke-static {v1, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 169
    check-cast v3, Landroidx/compose/ui/focus/FocusManager;

    .line 171
    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const v6, 0x6d670ecf

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    iget-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 837
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_3

    .line 838
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_4

    .line 171
    :cond_3
    new-instance v6, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$1$1;

    invoke-direct {v6, v7, v3, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$1$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Landroidx/compose/ui/focus/FocusManager;Lkotlin/coroutines/Continuation;)V

    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 840
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 171
    :cond_4
    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v5, v8, v1, v4}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 177
    new-instance v9, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iget-object v11, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v12, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    iget-object v13, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onAddPaymentMethodOptionClicked:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onSetDefaultClicked:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onRemoveClicked:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onUpdateClicked:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onLogoutClicked:Lkotlin/jvm/functions/Function0;

    move-object/from16 v22, v2

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    move-object/from16 v23, v2

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->$onPayAnotherWayClicked:Lkotlin/jvm/functions/Function0;

    move-object/from16 v24, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    invoke-direct/range {v9 .. v24}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    const/16 v2, 0x36

    const v3, -0x23bd548f

    const/4 v4, 0x1

    invoke-static {v3, v4, v9, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function3;

    const/16 v3, 0x30

    const/4 v5, 0x0

    invoke-static {v5, v2, v1, v3, v4}, Lcom/stripe/android/link/ui/ScrollableTopLevelColumnKt;->ScrollableTopLevelColumn(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 161
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
