.class final Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;
.super Ljava/lang/Object;
.source "CompatTextField.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function6;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CommonDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function6<",
        "Ljava/lang/Float;",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroidx/compose/ui/graphics/Color;",
        "Ljava/lang/Float;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
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
.field final synthetic $colors:Landroidx/compose/material/TextFieldColors;

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $enabled:Z

.field final synthetic $innerTextField:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

.field final synthetic $isError:Z

.field final synthetic $label:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $leadingIcon:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shape:Landroidx/compose/ui/graphics/Shape;

.field final synthetic $shouldOverrideTextStyleColor:Z

.field final synthetic $singleLine:Z

.field final synthetic $trailingIcon:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $transformedText:Ljava/lang/String;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/layout/PaddingValues;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Landroidx/compose/material/TextFieldColors;",
            "ZZ",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$label:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$transformedText:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iput-boolean p5, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$enabled:Z

    iput-boolean p6, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$isError:Z

    iput-object p7, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$leadingIcon:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$trailingIcon:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    iput-object p11, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$innerTextField:Lkotlin/jvm/functions/Function2;

    iput-boolean p12, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$singleLine:Z

    iput-object p13, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p14, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$shouldOverrideTextStyleColor:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 470
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    check-cast p2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v2

    check-cast p3, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result v6

    move-object v7, p5

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->invoke-RIQooxk(FJJFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-RIQooxk(FJJFLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p6

    move-object/from16 v5, p7

    move/from16 v2, p8

    and-int/lit8 v3, v2, 0x6

    move/from16 v7, p1

    if-nez v3, :cond_1

    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    move-wide/from16 v12, p2

    if-nez v4, :cond_3

    invoke-interface {v5, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v2, 0x180

    move-wide/from16 v8, p4

    if-nez v4, :cond_5

    invoke-interface {v5, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v2, v2, 0xc00

    if-nez v2, :cond_7

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v3, v2

    :cond_7
    move v14, v3

    and-int/lit16 v2, v14, 0x2493

    const/16 v3, 0x2492

    if-ne v2, v3, :cond_9

    .line 472
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    .line 529
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 472
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:471)"

    const v4, 0x2f20cb9c

    invoke-static {v4, v14, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_a
    iget-object v10, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$label:Lkotlin/jvm/functions/Function2;

    const v2, -0x367c29e7    # -1080003.1f

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v15, 0x0

    const/16 v2, 0x36

    const/4 v3, 0x1

    if-nez v10, :cond_b

    move-object v7, v15

    goto :goto_6

    :cond_b
    iget-boolean v11, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$shouldOverrideTextStyleColor:Z

    .line 473
    new-instance v6, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedLabel$1$1;

    invoke-direct/range {v6 .. v13}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedLabel$1$1;-><init>(FJLkotlin/jvm/functions/Function2;ZJ)V

    const v4, -0x194fe078

    invoke-static {v4, v3, v6, v5, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v7, v4

    .line 472
    :goto_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v4, -0x367bd218    # -1082813.0f

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 488
    iget-object v4, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    if-eqz v4, :cond_c

    iget-object v4, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$transformedText:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_c

    const/4 v4, 0x0

    cmpl-float v4, v1, v4

    if-lez v4, :cond_c

    .line 489
    new-instance v4, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedPlaceholder$1;

    iget-object v6, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v8, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$enabled:Z

    iget-object v9, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$placeholder:Lkotlin/jvm/functions/Function2;

    invoke-direct {v4, v1, v6, v8, v9}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedPlaceholder$1;-><init>(FLandroidx/compose/material/TextFieldColors;ZLkotlin/jvm/functions/Function2;)V

    const v1, 0x9343e0e

    invoke-static {v1, v3, v4, v5, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v8, v1

    goto :goto_7

    :cond_c
    move-object v8, v15

    .line 488
    :goto_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 502
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    move v4, v2

    iget-boolean v2, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$enabled:Z

    move v6, v3

    iget-boolean v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$isError:Z

    move v9, v4

    iget-object v4, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

    move v10, v6

    const/4 v6, 0x0

    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColors;->leadingIconColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    .line 503
    iget-object v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$leadingIcon:Lkotlin/jvm/functions/Function2;

    const v4, -0x367b77ad

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v3, :cond_d

    move-object v11, v15

    goto :goto_8

    .line 504
    :cond_d
    new-instance v4, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedLeading$1$1;

    invoke-direct {v4, v1, v2, v3}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedLeading$1$1;-><init>(JLkotlin/jvm/functions/Function2;)V

    const v1, 0x2a03f0da

    invoke-static {v1, v10, v4, v5, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v11, v1

    .line 503
    :goto_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 509
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v2, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$enabled:Z

    iget-boolean v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$isError:Z

    iget-object v4, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

    const/4 v6, 0x0

    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColors;->trailingIconColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    .line 510
    iget-object v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$trailingIcon:Lkotlin/jvm/functions/Function2;

    const v4, -0x367b51ac

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v3, :cond_e

    goto :goto_9

    .line 511
    :cond_e
    new-instance v4, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedTrailing$1$1;

    invoke-direct {v4, v1, v2, v3}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3$decoratedTrailing$1$1;-><init>(JLkotlin/jvm/functions/Function2;)V

    const v1, -0x67d673be

    invoke-static {v1, v10, v4, v5, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lkotlin/jvm/functions/Function2;

    :goto_9
    move-object v6, v15

    .line 510
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 517
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iget-boolean v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$enabled:Z

    const/4 v4, 0x0

    invoke-interface {v2, v3, v5, v4}, Landroidx/compose/material/TextFieldColors;->backgroundColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v2

    iget-object v4, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$shape:Landroidx/compose/ui/graphics/Shape;

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 521
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$innerTextField:Lkotlin/jvm/functions/Function2;

    move-object v3, v7

    .line 526
    iget-boolean v7, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$singleLine:Z

    .line 528
    iget-object v9, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    shl-int/lit8 v4, v14, 0x15

    const/high16 v10, 0x1c00000

    and-int/2addr v4, v10

    move-object v10, v5

    move-object v5, v11

    move v11, v4

    move-object v4, v8

    move/from16 v8, p1

    .line 519
    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/elements/compat/TextFieldLayoutKt;->TextFieldLayout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_f
    return-void
.end method
