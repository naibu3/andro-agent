.class final Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;
.super Ljava/lang/Object;
.source "ShapedIcon.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ShapedIconKt;->ShapedIcon(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/runtime/Composer;II)V
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
    value = "SMAP\nShapedIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapedIcon.kt\ncom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,135:1\n77#2:136\n*S KotlinDebug\n*F\n+ 1 ShapedIcon.kt\ncom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3\n*L\n81#1:136\n*E\n"
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
.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $errorPainter:Landroidx/compose/ui/graphics/painter/Painter;

.field final synthetic $flushed:Z

.field final synthetic $iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

.field final synthetic $url:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLcom/stripe/android/financialconnections/features/common/IconSize;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$flushed:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$url:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$contentDescription:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$errorPainter:Landroidx/compose/ui/graphics/painter/Painter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 75
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 76
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 94
    :cond_0
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 76
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:75)"

    const v4, -0x478a32e1

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    :cond_2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 78
    iget-boolean v2, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$flushed:Z

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/common/IconSize;->getSize-D9Ej5fM()F

    move-result v2

    goto :goto_1

    :cond_3
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/common/IconSize;->getPaddedSize-D9Ej5fM()F

    move-result v2

    .line 77
    :goto_1
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 81
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    const v2, 0x789c5f52

    const-string v3, "CC:CompositionLocal.kt#9igjgp"

    .line 136
    invoke-static {v12, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 81
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/uicore/image/StripeImageLoader;

    .line 82
    sget v1, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_person:I

    const/4 v3, 0x0

    invoke-static {v1, v12, v3}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v7

    .line 93
    sget-object v1, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/ContentScale$Companion;->getCrop()Landroidx/compose/ui/layout/ContentScale;

    move-result-object v5

    .line 80
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$url:Ljava/lang/String;

    .line 83
    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$contentDescription:Ljava/lang/String;

    .line 84
    new-instance v6, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$errorPainter:Landroidx/compose/ui/graphics/painter/Painter;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->$contentDescription:Ljava/lang/String;

    invoke-direct {v6, v8, v9, v10}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Lcom/stripe/android/financialconnections/features/common/IconSize;Ljava/lang/String;)V

    const/16 v8, 0x36

    const v9, -0x4690bdda

    const/4 v10, 0x1

    invoke-static {v9, v10, v6, v12, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function3;

    sget v6, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    const v8, 0x30006000

    or-int v13, v6, v8

    const/4 v14, 0x0

    const/16 v15, 0x5a0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    .line 76
    invoke-static/range {v1 .. v15}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method
