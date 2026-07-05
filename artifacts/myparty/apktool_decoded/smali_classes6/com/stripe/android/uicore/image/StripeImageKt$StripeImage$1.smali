.class final Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;
.super Ljava/lang/Object;
.source "StripeImage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeImage.kt\ncom/stripe/android/uicore/image/StripeImageKt$StripeImage$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,152:1\n77#2:153\n1225#3,6:154\n1225#3,6:160\n1225#3,6:166\n*S KotlinDebug\n*F\n+ 1 StripeImage.kt\ncom/stripe/android/uicore/image/StripeImageKt$StripeImage$1\n*L\n62#1:153\n64#1:154,6\n76#1:160,6\n92#1:166,6\n*E\n"
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
.field final synthetic $alignment:Landroidx/compose/ui/Alignment;

.field final synthetic $colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $contentScale:Landroidx/compose/ui/layout/ContentScale;

.field final synthetic $debugPainter:Landroidx/compose/ui/graphics/painter/Painter;

.field final synthetic $disableAnimations:Z

.field final synthetic $errorContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $loadingContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $url:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$c8pLqKaPTkEWfC9BysF0RcS_BgQ(ZLcom/stripe/android/uicore/image/StripeImageState;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->invoke$lambda$3$lambda$2(ZLcom/stripe/android/uicore/image/StripeImageState;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLandroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/ColorFilter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Z",
            "Landroidx/compose/ui/graphics/painter/Painter;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Alignment;",
            "Landroidx/compose/ui/layout/ContentScale;",
            "Landroidx/compose/ui/graphics/ColorFilter;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$disableAnimations:Z

    iput-object p4, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$debugPainter:Landroidx/compose/ui/graphics/painter/Painter;

    iput-object p5, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$errorContent:Lkotlin/jvm/functions/Function3;

    iput-object p6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p8, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentDescription:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$alignment:Landroidx/compose/ui/Alignment;

    iput-object p10, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    iput-object p11, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$3$lambda$2(ZLcom/stripe/android/uicore/image/StripeImageState;)Ljava/lang/Object;
    .locals 1

    const-string v0, "targetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 61
    check-cast p1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v10, p2

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v4, v1, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    .line 62
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    .line 114
    :cond_2
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 62
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:61)"

    const v6, 0x406c079b

    invoke-static {v6, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/InspectionModeKt;->getLocalInspectionMode()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    const v4, 0x789c5f52

    const-string v5, "CC:CompositionLocal.kt#9igjgp"

    .line 153
    invoke-static {v10, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 62
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 63
    invoke-static {v3}, Lcom/stripe/android/uicore/image/StripeImageKt;->access$calculateBoxSize(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v15

    const v4, -0x183d2764

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 64
    iget-object v4, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$debugPainter:Landroidx/compose/ui/graphics/painter/Painter;

    .line 154
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 155
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_6

    const/4 v5, 0x0

    if-eqz v1, :cond_5

    if-eqz v4, :cond_5

    .line 66
    new-instance v6, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    invoke-direct {v6, v4}, Lcom/stripe/android/uicore/image/StripeImageState$Success;-><init>(Landroidx/compose/ui/graphics/painter/Painter;)V

    invoke-static {v6, v5, v2, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    goto :goto_3

    .line 68
    :cond_5
    sget-object v4, Lcom/stripe/android/uicore/image/StripeImageState$Loading;->INSTANCE:Lcom/stripe/android/uicore/image/StripeImageState$Loading;

    invoke-static {v4, v5, v2, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    :goto_3
    move-object v5, v2

    .line 157
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 64
    :cond_6
    move-object/from16 v16, v5

    check-cast v16, Landroidx/compose/runtime/MutableState;

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v2, -0x183cf020

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v1, :cond_9

    .line 76
    iget-object v1, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$url:Ljava/lang/String;

    const v2, -0x183cea1c

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$url:Ljava/lang/String;

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v12, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v13, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$url:Ljava/lang/String;

    .line 160
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_7

    .line 161
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_8

    .line 76
    :cond_7
    new-instance v11, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$1$1;

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$1$1;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;IILandroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object v4, v11

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 163
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 76
    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v2, 0x0

    invoke-static {v1, v4, v10, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    :cond_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 90
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v11

    const v1, -0x183ca5a5

    .line 91
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-boolean v1, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$disableAnimations:Z

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    .line 92
    iget-boolean v2, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$disableAnimations:Z

    .line 166
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_a

    .line 167
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_b

    .line 92
    :cond_a
    new-instance v4, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v2}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$$ExternalSyntheticLambda0;-><init>(Z)V

    .line 169
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 92
    :cond_b
    move-object v12, v4

    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 101
    new-instance v1, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;

    iget-object v2, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$errorContent:Lkotlin/jvm/functions/Function3;

    iget-object v4, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iget-object v5, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v6, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentDescription:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$alignment:Landroidx/compose/ui/Alignment;

    iget-object v8, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    iget-object v9, v0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/ColorFilter;)V

    const/16 v2, 0x36

    const v3, -0x13e711e1

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v10, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function4;

    const v9, 0x186000

    const/16 v10, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 89
    const-string v5, "loading_image_animation"

    move-object/from16 v8, p2

    move-object v1, v11

    move-object v6, v12

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/AnimatedContentKt;->AnimatedContent(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_c
    return-void
.end method
