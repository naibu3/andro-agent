.class final Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;
.super Ljava/lang/Object;
.source "CompatTextField.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CompatTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V
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

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

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

.field final synthetic $value:Landroidx/compose/ui/text/input/TextFieldValue;

.field final synthetic $visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;


# direct methods
.method constructor <init>(Landroidx/compose/ui/text/input/TextFieldValue;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Z",
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
            ">;Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$label:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$placeholder:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$leadingIcon:Lkotlin/jvm/functions/Function2;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$trailingIcon:Lkotlin/jvm/functions/Function2;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$isError:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    iput-boolean p9, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$singleLine:Z

    iput-object p10, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p11, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$shape:Landroidx/compose/ui/graphics/Shape;

    iput-object p12, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$colors:Landroidx/compose/material/TextFieldColors;

    iput-object p13, p0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 320
    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 19
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

    move-object/from16 v2, p1

    const-string v1, "innerTextField"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    move-object/from16 v15, p2

    if-nez v1, :cond_1

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    .line 321
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 336
    :cond_2
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 321
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:320)"

    const v5, 0x5f7d38f7

    invoke-static {v5, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 322
    :cond_4
    iget-object v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    invoke-virtual {v3}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object v3

    move v4, v1

    move-object v1, v3

    .line 330
    iget-boolean v3, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$enabled:Z

    move v5, v4

    .line 326
    iget-object v4, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$label:Lkotlin/jvm/functions/Function2;

    move v6, v5

    .line 325
    iget-object v5, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$placeholder:Lkotlin/jvm/functions/Function2;

    move v7, v6

    .line 327
    iget-object v6, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$leadingIcon:Lkotlin/jvm/functions/Function2;

    move v8, v7

    .line 328
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$trailingIcon:Lkotlin/jvm/functions/Function2;

    move v9, v8

    .line 331
    iget-boolean v8, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$isError:Z

    move v10, v9

    .line 323
    iget-object v9, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    move v11, v10

    .line 329
    iget-boolean v10, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$singleLine:Z

    move v12, v11

    .line 332
    iget-object v11, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move v13, v12

    .line 334
    iget-object v12, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$shape:Landroidx/compose/ui/graphics/Shape;

    move v14, v13

    .line 333
    iget-object v13, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$colors:Landroidx/compose/material/TextFieldColors;

    move/from16 v16, v14

    .line 335
    iget-object v14, v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    shl-int/lit8 v16, v16, 0x3

    and-int/lit8 v16, v16, 0x70

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 321
    invoke-static/range {v1 .. v18}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->access$InsetDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
