.class final Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;
.super Ljava/lang/Object;
.source "RemoveButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nRemoveButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoveButton.kt\ncom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,110:1\n149#2:111\n206#2:112\n*S KotlinDebug\n*F\n+ 1 RemoveButton.kt\ncom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1\n*L\n65#1:111\n65#1:112\n*E\n"
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
.field final synthetic $borderColor:J

.field final synthetic $idle:Z

.field final synthetic $onRemove:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $removing:Z

.field final synthetic $shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

.field final synthetic $this_Box:Landroidx/compose/foundation/layout/BoxScope;

.field final synthetic $title:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/BoxScope;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;JZZLkotlin/jvm/functions/Function0;Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/BoxScope;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;",
            "JZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$this_Box:Landroidx/compose/foundation/layout/BoxScope;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    iput-wide p3, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$borderColor:J

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$idle:Z

    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$removing:Z

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$onRemove:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$title:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 58
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 59
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 59
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous> (RemoveButton.kt:58)"

    const v5, 0x766d8752

    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$this_Box:Landroidx/compose/foundation/layout/BoxScope;

    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    .line 61
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 62
    invoke-static {v1, v2, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 63
    iget-object v6, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getHeight-D9Ej5fM()F

    move-result v6

    invoke-static {v1, v2, v6, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 65
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getBorderStrokeWidth-D9Ej5fM()F

    move-result v1

    int-to-float v2, v3

    .line 111
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 112
    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 66
    iget-wide v2, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$borderColor:J

    .line 64
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    move-result-object v13

    .line 68
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$shape:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getCornerRadius-D9Ej5fM()F

    move-result v1

    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    .line 69
    iget-boolean v2, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$idle:Z

    if-eqz v2, :cond_3

    iget-boolean v2, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$removing:Z

    if-nez v2, :cond_3

    move v9, v4

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    move v9, v2

    .line 70
    :goto_1
    iget-object v7, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$onRemove:Lkotlin/jvm/functions/Function0;

    .line 68
    move-object v12, v1

    check-cast v12, Landroidx/compose/ui/graphics/Shape;

    .line 71
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1$1;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1;->$title:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/ui/RemoveButtonKt$RemoveButton$1$1$1$1;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    const/16 v2, 0x36

    const v3, -0x5281f31

    move-object/from16 v5, p1

    invoke-static {v3, v4, v1, v5, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lkotlin/jvm/functions/Function3;

    const/high16 v18, 0x30000000

    const/16 v19, 0x198

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v5

    .line 59
    invoke-static/range {v7 .. v19}, Landroidx/compose/material/ButtonKt;->TextButton(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method
