.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;
.super Ljava/lang/Object;
.source "WalletScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2;->invoke(Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,835:1\n1225#2,6:836\n149#3:842\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2\n*L\n191#1:836,6\n212#1:842\n*E\n"
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
.method public static synthetic $r8$lambda$32BI1AnwQYdjjHQfWqj_Fqt13zA(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->invoke$lambda$1$lambda$0(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
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

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    iput-object p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onAddPaymentMethodOptionClicked:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p9, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onSetDefaultClicked:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onRemoveClicked:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onUpdateClicked:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onLogoutClicked:Lkotlin/jvm/functions/Function0;

    iput-object p14, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onPayAnotherWayClicked:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 2

    .line 192
    invoke-virtual {p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getAddPaymentMethodOptions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 193
    invoke-virtual {p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getAddPaymentMethodOptions()Ljava/util/List;

    move-result-object p0

    const/4 p2, 0x0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 195
    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2$1$1$1;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2$1$1$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V

    const p0, 0x4a933313    # 4823433.5f

    invoke-static {p0, v1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 177
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "$this$ScrollableTopLevelColumn"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 178
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 218
    :cond_0
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 178
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous> (WalletScreen.kt:177)"

    const v5, -0x23bd548f

    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 179
    :cond_2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 181
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded()Z

    move-result v2

    .line 179
    check-cast v1, Landroidx/compose/ui/Modifier;

    move v4, v3

    move v3, v2

    .line 180
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move v5, v4

    .line 182
    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    move v6, v5

    .line 183
    iget-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    move v7, v6

    .line 184
    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    move v8, v7

    .line 185
    iget-object v7, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    const v9, -0x65033bee

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v9, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onAddPaymentMethodOptionClicked:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    .line 191
    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iget-object v11, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onAddPaymentMethodOptionClicked:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v14, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    .line 836
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v9, :cond_3

    .line 837
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_4

    .line 191
    :cond_3
    new-instance v16, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2$$ExternalSyntheticLambda0;

    move-object/from16 v17, v10

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v8, v16

    .line 839
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 191
    :cond_4
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 190
    iget-object v9, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onSetDefaultClicked:Lkotlin/jvm/functions/Function1;

    .line 187
    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onRemoveClicked:Lkotlin/jvm/functions/Function1;

    .line 188
    iget-object v11, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onUpdateClicked:Lkotlin/jvm/functions/Function1;

    .line 189
    iget-object v12, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onLogoutClicked:Lkotlin/jvm/functions/Function0;

    .line 186
    iget-object v13, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    .line 209
    iget-object v14, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    sget v16, Lcom/stripe/android/ui/core/elements/CvcController;->$stable:I

    shl-int/lit8 v16, v16, 0xc

    const/4 v0, 0x6

    or-int/lit8 v16, v16, 0x6

    const/16 v17, 0x0

    const/16 v0, 0x10

    .line 178
    invoke-static/range {v1 .. v17}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->access$PaymentDetailsSection(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/ui/wallet/WalletUiState;ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 212
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    int-to-float v0, v0

    .line 842
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 212
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v15, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v0, p0

    .line 215
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    .line 216
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    .line 217
    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$2$2;->$onPayAnotherWayClicked:Lkotlin/jvm/functions/Function0;

    const/4 v4, 0x0

    .line 214
    invoke-static {v1, v2, v3, v15, v4}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->access$ActionSection(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
