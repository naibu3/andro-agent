.class final Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;
.super Ljava/lang/Object;
.source "LinkButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLinkButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButton.kt\ncom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,353:1\n149#2:354\n*S KotlinDebug\n*F\n+ 1 LinkButton.kt\ncom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1\n*L\n161#1:354\n*E\n"
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
.field final synthetic $enabled:Z

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

.field final synthetic $state:Lcom/stripe/android/link/ui/LinkButtonState;


# direct methods
.method constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/link/ui/LinkButtonState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lcom/stripe/android/link/ui/LinkButtonState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$enabled:Z

    iput-object p4, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$state:Lcom/stripe/android/link/ui/LinkButtonState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 152
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 153
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 181
    :cond_0
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 153
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous> (LinkButton.kt:152)"

    const v4, 0x2255e3b1

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$modifier:Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    const/4 v13, 0x1

    const/4 v3, 0x0

    .line 156
    invoke-static {v1, v2, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 157
    sget-object v4, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;

    const/4 v10, 0x6

    invoke-virtual {v4, v7, v10}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->getShape(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getHeight-D9Ej5fM()F

    move-result v4

    invoke-static {v1, v2, v4, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 158
    const-string v2, "LinkButtonTestTag"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    .line 160
    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$getLinkButtonShape()Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v15

    .line 161
    sget-object v1, Landroidx/compose/material/ButtonDefaults;->INSTANCE:Landroidx/compose/material/ButtonDefaults;

    const/4 v2, 0x0

    int-to-float v2, v2

    move v3, v2

    .line 354
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    move v4, v3

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    move v5, v4

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    move v6, v5

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    sget v8, Landroidx/compose/material/ButtonDefaults;->$stable:I

    shl-int/lit8 v8, v8, 0xf

    or-int/lit16 v8, v8, 0x6db6

    const/4 v9, 0x0

    .line 161
    invoke-virtual/range {v1 .. v9}, Landroidx/compose/material/ButtonDefaults;->elevation-R_JCAzs(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;

    move-result-object v16

    .line 162
    sget-object v1, Landroidx/compose/material/ButtonDefaults;->INSTANCE:Landroidx/compose/material/ButtonDefaults;

    .line 163
    sget-object v2, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v2, v7, v10}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getButtonBrand-0d7_KjU()J

    move-result-wide v2

    .line 164
    sget-object v4, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v4, v7, v10}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkColors;->getButtonBrand-0d7_KjU()J

    move-result-wide v4

    sget v6, Landroidx/compose/material/ButtonDefaults;->$stable:I

    shl-int/lit8 v11, v6, 0xc

    const/16 v12, 0xa

    move-wide v6, v4

    const-wide/16 v4, 0x0

    const-wide/16 v8, 0x0

    move-object/from16 v10, p1

    .line 162
    invoke-virtual/range {v1 .. v12}, Landroidx/compose/material/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;

    move-result-object v8

    move-object v7, v10

    .line 167
    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$getLinkButtonHorizontalPadding$p()F

    move-result v1

    .line 168
    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$getLinkButtonVerticalPadding$p()F

    move-result v2

    .line 169
    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$getLinkButtonHorizontalPadding$p()F

    move-result v3

    .line 170
    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$getLinkButtonVerticalPadding$p()F

    move-result v4

    .line 166
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4(FFFF)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v9

    .line 154
    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$onClick:Lkotlin/jvm/functions/Function0;

    .line 159
    iget-boolean v3, v0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$enabled:Z

    .line 160
    move-object v6, v15

    check-cast v6, Landroidx/compose/ui/graphics/Shape;

    .line 172
    new-instance v2, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;

    iget-object v4, v0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->$state:Lcom/stripe/android/link/ui/LinkButtonState;

    invoke-direct {v2, v4}, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;-><init>(Lcom/stripe/android/link/ui/LinkButtonState;)V

    const/16 v4, 0x36

    const v5, -0x2ddbea3f

    invoke-static {v5, v13, v2, v7, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function3;

    const/high16 v12, 0x36000000

    const/16 v13, 0x48

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v11, p1

    move-object v2, v14

    move-object/from16 v5, v16

    .line 153
    invoke-static/range {v1 .. v13}, Landroidx/compose/material/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
