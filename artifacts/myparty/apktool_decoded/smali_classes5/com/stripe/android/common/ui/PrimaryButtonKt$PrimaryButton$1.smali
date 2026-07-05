.class final Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;
.super Ljava/lang/Object;
.source "PrimaryButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/common/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V
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
    value = "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n71#2:147\n69#2,5:148\n74#2:181\n78#2:186\n79#3,6:153\n86#3,4:168\n90#3,2:178\n94#3:185\n368#4,9:159\n377#4:180\n378#4,2:183\n4034#5,6:172\n169#6:182\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1\n*L\n60#1:147\n60#1:148,5\n60#1:181\n60#1:186\n60#1:153,6\n60#1:168,4\n60#1:178,2\n60#1:185\n60#1:159,9\n60#1:180\n60#1:183,2\n60#1:172,6\n69#1:182\n*E\n"
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
.field final synthetic $background:J

.field final synthetic $borderStroke:Landroidx/compose/foundation/BorderStroke;

.field final synthetic $displayLockIcon:Z

.field final synthetic $isEnabled:Z

.field final synthetic $isLoading:Z

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onBackground:J

.field final synthetic $onButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shape:Landroidx/compose/foundation/shape/RoundedCornerShape;

.field final synthetic $textStyle:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/foundation/BorderStroke;JLjava/lang/String;JLandroidx/compose/ui/text/TextStyle;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/foundation/shape/RoundedCornerShape;",
            "Landroidx/compose/foundation/BorderStroke;",
            "J",
            "Ljava/lang/String;",
            "J",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZZ)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iput-boolean p3, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$isEnabled:Z

    iput-object p4, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$shape:Landroidx/compose/foundation/shape/RoundedCornerShape;

    iput-object p5, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$borderStroke:Landroidx/compose/foundation/BorderStroke;

    iput-wide p6, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$background:J

    iput-object p8, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$label:Ljava/lang/String;

    iput-wide p9, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$onBackground:J

    iput-object p11, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    iput-boolean p12, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$isLoading:Z

    iput-boolean p13, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$displayLockIcon:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 59
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 60
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 60
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.common.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:59)"

    const v4, -0x53a47dd4

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 61
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$modifier:Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    const/4 v13, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 62
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v4

    .line 60
    iget-object v14, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iget-boolean v15, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$isEnabled:Z

    iget-object v5, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$shape:Landroidx/compose/foundation/shape/RoundedCornerShape;

    iget-object v6, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$borderStroke:Landroidx/compose/foundation/BorderStroke;

    iget-wide v7, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$background:J

    iget-object v9, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$label:Ljava/lang/String;

    iget-wide v11, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$onBackground:J

    move-object/from16 p2, v5

    iget-object v5, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    move-object/from16 v16, v5

    iget-boolean v5, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$isLoading:Z

    move/from16 v17, v5

    iget-boolean v5, v0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->$displayLockIcon:Z

    const v2, 0x2bb5b5d7

    const-string v3, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    .line 147
    invoke-static {v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .line 151
    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    const v4, -0x4ee9b9da

    .line 152
    const-string v13, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 153
    invoke-static {v10, v4, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 154
    invoke-static {v10, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 155
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 156
    invoke-static {v10, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 158
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    const v0, -0x2942ffcf

    move/from16 v20, v2

    .line 157
    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 159
    invoke-static {v10, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 160
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 161
    :cond_3
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 162
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 163
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 165
    :cond_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 167
    :goto_1
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 168
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v3, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 169
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 173
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 174
    :cond_5
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 175
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    :cond_6
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x7ff519f7    # -1.000876E-39f

    .line 180
    const-string v1, "C73@3429L9:Box.kt#2w3rfo"

    .line 181
    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    .line 66
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 67
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 69
    sget-object v4, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getHeight()F

    move-result v4

    .line 182
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 68
    invoke-static {v0, v2, v4, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 72
    move-object/from16 v13, p2

    check-cast v13, Landroidx/compose/ui/graphics/Shape;

    .line 74
    sget-object v1, Landroidx/compose/material/ButtonDefaults;->INSTANCE:Landroidx/compose/material/ButtonDefaults;

    .line 76
    sget v2, Landroidx/compose/material/ButtonDefaults;->$stable:I

    shl-int/lit8 v2, v2, 0xc

    move-wide v3, v11

    const/16 v12, 0xa

    move-wide/from16 v18, v3

    move v3, v5

    const-wide/16 v4, 0x0

    move/from16 v20, v2

    move v11, v3

    move-wide v2, v7

    move-object v7, v9

    const-wide/16 v8, 0x0

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    move-wide v6, v2

    move/from16 v23, v20

    move/from16 v20, v11

    move/from16 v11, v23

    .line 74
    invoke-virtual/range {v1 .. v12}, Landroidx/compose/material/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;

    move-result-object v1

    move-object v2, v10

    .line 78
    new-instance v5, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;

    move v10, v15

    move-object/from16 v9, v16

    move/from16 v11, v17

    move-wide/from16 v7, v18

    move/from16 v12, v20

    move-object/from16 v6, v22

    invoke-direct/range {v5 .. v12}, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;-><init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;ZZZ)V

    move v3, v10

    const/16 v4, 0x36

    const v6, -0x933c0d1

    const/4 v7, 0x1

    invoke-static {v6, v7, v5, v2, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lkotlin/jvm/functions/Function3;

    const/high16 v12, 0x30000000

    move-object v6, v13

    const/16 v13, 0x118

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v8, v1

    move-object v11, v2

    move-object v1, v14

    move-object/from16 v7, v21

    move-object v2, v0

    .line 64
    invoke-static/range {v1 .. v13}, Landroidx/compose/material/ButtonKt;->TextButton(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 181
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 183
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 159
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 153
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 147
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
