.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;
.super Ljava/lang/Object;
.source "OTPElementUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputDecorationBox(Ljava/lang/String;ZLjava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "Landroidx/compose/runtime/Composer;",
        "-",
        "Ljava/lang/Integer;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n1225#2,6:312\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1\n*L\n275#1:312,6\n*E\n"
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
.field final synthetic $colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

.field final synthetic $enabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $placeholder:Ljava/lang/String;

.field final synthetic $value:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$isSelected:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$value:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$enabled:Z

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$placeholder:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 261
    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 55
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v1, p2

    const-string v2, "innerTextField"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    .line 262
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    .line 288
    :cond_2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 262
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous> (OTPElementUI.kt:261)"

    const v6, 0x5d1b9611

    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    sget-object v52, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    .line 264
    sget-object v4, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v53

    const v4, -0x5c60ab8d

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 312
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 313
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_5

    .line 275
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v4

    .line 315
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 275
    :cond_5
    move-object/from16 v54, v4

    check-cast v54, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 276
    sget-object v4, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    .line 277
    sget-object v5, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v6, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v5, v1, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v5

    .line 278
    iget-boolean v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$isSelected:Z

    if-eqz v7, :cond_6

    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getSelectedBackground-0d7_KjU()J

    move-result-wide v7

    goto :goto_3

    :cond_6
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getBackground-0d7_KjU()J

    move-result-wide v7

    :goto_3
    move-wide v9, v7

    .line 279
    sget-object v7, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v8, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v7, v1, v8}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/uicore/StripeColors;->getTextCursor-0d7_KjU()J

    move-result-wide v11

    .line 280
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getBackground-0d7_KjU()J

    move-result-wide v15

    .line 281
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getBackground-0d7_KjU()J

    move-result-wide v19

    .line 282
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getBackground-0d7_KjU()J

    move-result-wide v17

    .line 283
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getPlaceholder-0d7_KjU()J

    move-result-wide v43

    .line 284
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getPlaceholder-0d7_KjU()J

    move-result-wide v45

    const/16 v50, 0x30

    const v51, 0x7ff12

    const-wide/16 v7, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    move-object/from16 v47, v1

    .line 276
    invoke-virtual/range {v4 .. v51}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v14

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x3

    .line 287
    invoke-static {v5, v5, v6, v4}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v15

    move v4, v2

    .line 263
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$value:Ljava/lang/String;

    move v5, v4

    .line 274
    iget-boolean v4, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$enabled:Z

    .line 275
    move-object/from16 v7, v54

    check-cast v7, Landroidx/compose/foundation/interaction/InteractionSource;

    .line 266
    new-instance v8, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1$2;

    iget-boolean v9, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$isSelected:Z

    iget-object v10, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;->$placeholder:Ljava/lang/String;

    invoke-direct {v8, v9, v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1$2;-><init>(ZLjava/lang/String;)V

    const/16 v9, 0x36

    const v10, -0x57c203ec

    const/4 v11, 0x1

    invoke-static {v10, v11, v8, v1, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lkotlin/jvm/functions/Function2;

    shl-int/2addr v5, v6

    and-int/lit8 v5, v5, 0x70

    const v6, 0x6036c00

    or-int v17, v5, v6

    const/16 v18, 0x6c00

    const/16 v19, 0xec0

    const/4 v5, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v1

    move-object/from16 v1, v52

    move-object/from16 v6, v53

    .line 262
    invoke-virtual/range {v1 .. v19}, Landroidx/compose/material/TextFieldDefaults;->TextFieldDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
