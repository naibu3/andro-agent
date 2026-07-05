.class final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;
.super Ljava/lang/Object;
.source "PrimaryButtonNew.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt;->PrimaryButton(Ljava/lang/String;ZZLandroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrimaryButtonNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonNew.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,413:1\n71#2:414\n69#2,5:415\n74#2:448\n78#2:452\n79#3,6:420\n86#3,4:435\n90#3,2:445\n94#3:451\n368#4,9:426\n377#4:447\n378#4,2:449\n4034#5,6:439\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonNew.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2\n*L\n122#1:414\n122#1:415,5\n122#1:448\n122#1:452\n122#1:420,6\n122#1:435,4\n122#1:445,2\n122#1:451\n122#1:426,9\n122#1:447\n122#1:449,2\n122#1:439,6\n*E\n"
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
.field final synthetic $animatedBackground:J

.field final synthetic $areAnimationsDisabled:Z

.field final synthetic $colors:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

.field final synthetic $enabled:Z

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $locked:Z

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onProcessingCompleted:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

.field final synthetic $shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;


# direct methods
.method constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;JLjava/lang/String;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;",
            "Z",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;",
            "J",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$enabled:Z

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$colors:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    iput-wide p6, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$animatedBackground:J

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$label:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    iput-boolean p10, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$areAnimationsDisabled:Z

    iput-boolean p11, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$locked:Z

    iput-object p12, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$onProcessingCompleted:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 121
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 122
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 122
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous> (PrimaryButtonNew.kt:121)"

    const v4, 0x1157c31a

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 123
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$modifier:Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    const/4 v13, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 124
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v4

    .line 122
    iget-object v14, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    iget-boolean v15, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$enabled:Z

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$colors:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    iget-wide v7, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$animatedBackground:J

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$label:Ljava/lang/String;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    iget-boolean v12, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$areAnimationsDisabled:Z

    move-object/from16 v16, v5

    iget-boolean v5, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$locked:Z

    move/from16 v20, v5

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->$onProcessingCompleted:Lkotlin/jvm/functions/Function0;

    const v2, 0x2bb5b5d7

    const-string v3, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    .line 414
    invoke-static {v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .line 418
    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    const v4, -0x4ee9b9da

    .line 419
    const-string v13, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 420
    invoke-static {v10, v4, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 421
    invoke-static {v10, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 422
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 423
    invoke-static {v10, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 425
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    const v0, -0x2942ffcf

    move/from16 v18, v2

    .line 424
    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 426
    invoke-static {v10, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 427
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 428
    :cond_3
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 429
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 430
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 432
    :cond_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 434
    :goto_1
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 435
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v3, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 436
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 438
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 440
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 441
    :cond_5
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 442
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 445
    :cond_6
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x7ff519f7    # -1.000876E-39f

    .line 447
    const-string v1, "C73@3429L9:Box.kt#2w3rfo"

    .line 448
    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    .line 128
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 129
    const-string v1, "PRIMARY_BUTTON_TEST_TAG"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 130
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 132
    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getHeight-D9Ej5fM()F

    move-result v4

    .line 131
    invoke-static {v0, v2, v4, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 135
    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getCornerRadius-D9Ej5fM()F

    move-result v1

    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroidx/compose/ui/graphics/Shape;

    .line 136
    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getBorderStrokeWidth-D9Ej5fM()F

    move-result v1

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;->getBorder-0d7_KjU()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    move-result-object v22

    .line 137
    sget-object v1, Landroidx/compose/material/ButtonDefaults;->INSTANCE:Landroidx/compose/material/ButtonDefaults;

    .line 139
    sget v2, Landroidx/compose/material/ButtonDefaults;->$stable:I

    shl-int/lit8 v2, v2, 0xc

    move/from16 v19, v12

    const/16 v12, 0xa

    move-object/from16 v21, v5

    const-wide/16 v4, 0x0

    move-object/from16 v17, v9

    move-object/from16 v18, v11

    move v11, v2

    move-wide v2, v7

    const-wide/16 v8, 0x0

    move-wide v6, v2

    .line 137
    invoke-virtual/range {v1 .. v12}, Landroidx/compose/material/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;

    move-result-object v8

    .line 141
    new-instance v16, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLkotlin/jvm/functions/Function0;)V

    move-object/from16 v1, v16

    const/16 v2, 0x36

    const v3, 0x1168011d

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v10, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function3;

    const/high16 v12, 0x30000000

    move-object v6, v13

    const/16 v13, 0x118

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    move-object v11, v10

    move v3, v15

    move-object/from16 v7, v22

    move-object v10, v1

    move-object v1, v14

    .line 126
    invoke-static/range {v1 .. v13}, Landroidx/compose/material/ButtonKt;->TextButton(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 448
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 449
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 426
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 420
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 414
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 452
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
