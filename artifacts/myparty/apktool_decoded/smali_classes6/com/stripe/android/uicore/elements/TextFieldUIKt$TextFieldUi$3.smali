.class final Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;
.super Ljava/lang/Object;
.source "TextFieldUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldUi(Landroidx/compose/ui/text/input/TextFieldValue;ZZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldIcon;ZZLjava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $enabled:Z

.field final synthetic $errorMessage:Ljava/lang/String;

.field final synthetic $keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

.field final synthetic $keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $loading:Z

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onDropdownItemClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onValueChange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Ljava/lang/String;

.field final synthetic $shouldAnnounceLabel:Z

.field final synthetic $shouldShowError:Z

.field final synthetic $showOptionalLabel:Z

.field final synthetic $textFieldInsets:Lcom/stripe/android/uicore/FormInsets;

.field final synthetic $trailingIcon:Lcom/stripe/android/uicore/elements/TextFieldIcon;

.field final synthetic $value:Landroidx/compose/ui/text/input/TextFieldValue;

.field final synthetic $visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;


# direct methods
.method constructor <init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldIcon;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material/TextFieldColors;Lcom/stripe/android/uicore/FormInsets;ZLjava/lang/String;ZZLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "Landroidx/compose/material/TextFieldColors;",
            "Lcom/stripe/android/uicore/FormInsets;",
            "Z",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$onValueChange:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$modifier:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$enabled:Z

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$placeholder:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$trailingIcon:Lcom/stripe/android/uicore/elements/TextFieldIcon;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$shouldShowError:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$errorMessage:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    iput-object p10, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    iput-object p11, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    iput-object p12, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iput-object p13, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$textFieldInsets:Lcom/stripe/android/uicore/FormInsets;

    iput-boolean p14, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$showOptionalLabel:Z

    iput-object p15, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$label:Ljava/lang/String;

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$shouldAnnounceLabel:Z

    move/from16 p1, p17

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$loading:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$onDropdownItemClicked:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 288
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 289
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 325
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 289
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous> (TextFieldUI.kt:288)"

    const v5, 0x7b757eda

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 290
    :cond_2
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    move-object v3, v2

    .line 291
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$onValueChange:Lkotlin/jvm/functions/Function1;

    .line 292
    iget-object v4, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$modifier:Landroidx/compose/ui/Modifier;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v5, v3

    move-object v3, v4

    .line 293
    iget-boolean v4, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$enabled:Z

    .line 294
    new-instance v8, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3$1;

    iget-boolean v9, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$showOptionalLabel:Z

    iget-object v10, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$label:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$shouldAnnounceLabel:Z

    invoke-direct {v8, v9, v10, v11}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3$1;-><init>(ZLjava/lang/String;Z)V

    const v9, 0x39a1c254

    const/16 v10, 0x36

    invoke-static {v9, v6, v8, v1, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v8

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 307
    iget-object v9, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$placeholder:Ljava/lang/String;

    const v11, 0x171c23d3

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v9, :cond_3

    move-object v9, v7

    goto :goto_1

    .line 308
    :cond_3
    new-instance v11, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3$2$1;

    invoke-direct {v11, v9}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3$2$1;-><init>(Ljava/lang/String;)V

    const v9, -0x16c54022

    invoke-static {v9, v6, v11, v1, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v9

    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 307
    :goto_1
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 312
    iget-object v11, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$trailingIcon:Lcom/stripe/android/uicore/elements/TextFieldIcon;

    const v12, 0x171c3594

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v11, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v7, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$loading:Z

    iget-object v12, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$onDropdownItemClicked:Lkotlin/jvm/functions/Function1;

    .line 313
    new-instance v13, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3$3$1;

    invoke-direct {v13, v11, v7, v12}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3$3$1;-><init>(Lcom/stripe/android/uicore/elements/TextFieldIcon;ZLkotlin/jvm/functions/Function1;)V

    const v7, 0xd62cd81

    invoke-static {v7, v6, v13, v1, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lkotlin/jvm/functions/Function2;

    :goto_2
    move-object v10, v7

    .line 312
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 317
    iget-boolean v11, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$shouldShowError:Z

    .line 318
    iget-object v12, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$errorMessage:Ljava/lang/String;

    .line 319
    iget-object v13, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    .line 320
    iget-object v14, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 321
    iget-object v15, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$keyboardActions:Landroidx/compose/foundation/text/KeyboardActions;

    .line 323
    iget-object v6, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$colors:Landroidx/compose/material/TextFieldColors;

    .line 324
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextFieldUi$3;->$textFieldInsets:Lcom/stripe/android/uicore/FormInsets;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/FormInsets;->asPaddingValues()Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v22

    const/16 v26, 0x0

    const v27, 0xf0130

    move-object v1, v5

    const/4 v5, 0x0

    move-object/from16 v21, v6

    const/4 v6, 0x0

    move-object v7, v8

    move-object v8, v9

    const/4 v9, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/high16 v24, 0x180000

    const/high16 v25, 0x30000

    move-object/from16 v23, p1

    .line 289
    invoke-static/range {v1 .. v27}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CompatTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
