.class final Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;
.super Ljava/lang/Object;
.source "MiddleEllipsisText.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt;->MiddleEllipsisText-oiE5lR0(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;CILandroidx/compose/runtime/Composer;III)V
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
    value = "SMAP\nMiddleEllipsisText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiddleEllipsisText.kt\ncom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,213:1\n1225#2,6:214\n*S KotlinDebug\n*F\n+ 1 MiddleEllipsisText.kt\ncom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1\n*L\n100#1:214,6\n*E\n"
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
.field final synthetic $charSplitIndexList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $color:J

.field final synthetic $constraints:Landroidx/compose/ui/unit/Constraints;

.field final synthetic $ellipsisCharCount:I

.field final synthetic $ellipsisText:Ljava/lang/String;

.field final synthetic $fontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field final synthetic $fontSize:J

.field final synthetic $fontStyle:Landroidx/compose/ui/text/font/FontStyle;

.field final synthetic $fontWeight:Landroidx/compose/ui/text/font/FontWeight;

.field final synthetic $letterSpacing:J

.field final synthetic $lineHeight:J

.field final synthetic $onTextLayout:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $softWrap:Z

.field final synthetic $style:Landroidx/compose/ui/text/TextStyle;

.field final synthetic $text:Ljava/lang/String;

.field final synthetic $textAlign:Landroidx/compose/ui/text/style/TextAlign;

.field final synthetic $textDecoration:Landroidx/compose/ui/text/style/TextDecoration;

.field final synthetic $textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Constraints;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;JJ",
            "Landroidx/compose/ui/text/font/FontStyle;",
            "Landroidx/compose/ui/text/font/FontWeight;",
            "Landroidx/compose/ui/text/font/FontFamily;",
            "J",
            "Landroidx/compose/ui/text/style/TextDecoration;",
            "Landroidx/compose/ui/text/style/TextAlign;",
            "JZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/ui/unit/Constraints;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$text:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$ellipsisText:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-wide p4, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$color:J

    iput-wide p6, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontSize:J

    iput-object p8, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontStyle:Landroidx/compose/ui/text/font/FontStyle;

    iput-object p9, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontWeight:Landroidx/compose/ui/text/font/FontWeight;

    iput-object p10, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    iput-wide p11, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$letterSpacing:J

    iput-object p13, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textDecoration:Landroidx/compose/ui/text/style/TextDecoration;

    iput-object p14, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textAlign:Landroidx/compose/ui/text/style/TextAlign;

    move-wide p1, p15

    iput-wide p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$lineHeight:J

    move/from16 p1, p17

    iput-boolean p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$softWrap:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$onTextLayout:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$style:Landroidx/compose/ui/text/TextStyle;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$constraints:Landroidx/compose/ui/unit/Constraints;

    move/from16 p1, p21

    iput p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$ellipsisCharCount:I

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$charSplitIndexList:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 99
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p2

    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 100
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 204
    :cond_0
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 100
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.text.MiddleEllipsisText.<anonymous>.<anonymous> (MiddleEllipsisText.kt:99)"

    const v5, -0x5d96e303

    invoke-static {v5, v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const v0, -0x23d1676e

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$text:Ljava/lang/String;

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$ellipsisText:Ljava/lang/String;

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    iget-object v3, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    iget-object v3, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$text:Ljava/lang/String;

    iget-object v5, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$constraints:Landroidx/compose/ui/unit/Constraints;

    iget v6, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$ellipsisCharCount:I

    iget-object v7, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$charSplitIndexList:Ljava/util/List;

    iget-object v8, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$ellipsisText:Ljava/lang/String;

    .line 214
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_3

    .line 215
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v9, v0, :cond_f

    .line 101
    :cond_3
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    move-object v9, v4

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->getLastIndex(Ljava/lang/CharSequence;)I

    move-result v10

    invoke-virtual {v0, v10}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v0

    invoke-virtual {v5}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v10

    int-to-float v10, v10

    cmpg-float v0, v0, v10

    if-gtz v0, :cond_4

    goto/16 :goto_a

    .line 105
    :cond_4
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    invoke-static {v9}, Lkotlin/text/StringsKt;->getLastIndex(Ljava/lang/CharSequence;)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v0, v10}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v0

    int-to-float v6, v6

    mul-float/2addr v0, v6

    .line 107
    invoke-virtual {v5}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v0

    .line 109
    invoke-static {v9}, Lkotlin/text/StringsKt;->getLastIndex(Ljava/lang/CharSequence;)I

    move-result v0

    .line 113
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v6

    .line 115
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/List;

    .line 116
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/List;

    .line 119
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    move/from16 v16, v5

    move v15, v12

    move/from16 v17, v15

    const/4 v5, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v12, v6

    move v6, v0

    :goto_1
    if-ge v13, v11, :cond_e

    if-lt v5, v6, :cond_5

    goto/16 :goto_9

    .line 125
    :cond_5
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, v5}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    move-object/from16 v18, v0

    .line 127
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, v6}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    cmpg-float v19, v17, v15

    if-gtz v19, :cond_a

    .line 131
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v18

    add-float v18, v17, v18

    add-float v18, v18, v15

    cmpg-float v18, v18, v16

    if-gtz v18, :cond_a

    if-nez v14, :cond_6

    .line 134
    invoke-interface {v7, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_2

    .line 136
    :cond_6
    invoke-interface {v7, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move/from16 v18, v0

    add-int/lit8 v0, v14, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sub-int v0, v18, v0

    :goto_2
    move/from16 v18, v5

    move v5, v0

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move/from16 v19, v6

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    move/from16 v20, v11

    move/from16 v21, v13

    move/from16 v13, v18

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v5, :cond_8

    .line 141
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 142
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, v13}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v0

    add-float v17, v17, v0

    add-int/lit8 v13, v13, 0x1

    .line 147
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 141
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v18, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 147
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_7

    goto/16 :goto_9

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_8
    add-float v0, v17, v15

    cmpg-float v0, v0, v16

    if-gtz v0, :cond_9

    .line 152
    check-cast v6, Ljava/util/Collection;

    invoke-interface {v9, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v14, v14, 0x1

    :cond_9
    move-object/from16 v22, v4

    move v5, v13

    move/from16 v6, v19

    const/4 v4, 0x0

    goto/16 :goto_8

    :cond_a
    move/from16 v18, v5

    move/from16 v19, v6

    move/from16 v20, v11

    move/from16 v21, v13

    cmpl-float v5, v17, v15

    if-ltz v5, :cond_e

    add-float v5, v17, v15

    .line 156
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v0

    add-float/2addr v5, v0

    cmpg-float v0, v5, v16

    if-gtz v0, :cond_e

    .line 159
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/lit8 v5, v12, -0x1

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    sub-int v6, v0, v6

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v0

    check-cast v11, Ljava/util/List;

    move/from16 v13, v19

    move/from16 v19, v5

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v6, :cond_c

    .line 163
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 164
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v22, v4

    const/4 v4, 0x0

    :try_start_2
    invoke-interface {v11, v4, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 166
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {v0, v13}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getWidth()F

    move-result v0

    add-float/2addr v15, v0

    add-int/lit8 v13, v13, -0x1

    .line 169
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 163
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object/from16 v22, v4

    :goto_6
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 169
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_b

    goto :goto_9

    :cond_b
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v4, v22

    goto :goto_5

    :cond_c
    move-object/from16 v22, v4

    add-float v0, v17, v15

    cmpg-float v0, v0, v16

    if-gtz v0, :cond_d

    .line 174
    check-cast v11, Ljava/util/Collection;

    const/4 v4, 0x0

    invoke-interface {v10, v4, v11}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move v6, v13

    move/from16 v5, v18

    move/from16 v12, v19

    goto :goto_8

    :cond_d
    const/4 v4, 0x0

    move v6, v13

    move/from16 v5, v18

    :goto_8
    add-int/lit8 v13, v21, 0x1

    move/from16 v11, v20

    move-object/from16 v4, v22

    goto/16 :goto_1

    .line 183
    :cond_e
    :goto_9
    move-object/from16 v23, v9

    check-cast v23, Ljava/lang/Iterable;

    const-string v0, ""

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/CharSequence;

    const/16 v30, 0x3e

    const/16 v31, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v23 .. v31}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v11, v10

    check-cast v11, Ljava/lang/Iterable;

    .line 185
    move-object v12, v0

    check-cast v12, Ljava/lang/CharSequence;

    const/16 v18, 0x3e

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 184
    invoke-static/range {v11 .. v19}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 217
    :goto_a
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v9, v4

    .line 100
    :cond_f
    check-cast v9, Ljava/lang/String;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 191
    iget-wide v4, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$color:J

    .line 192
    iget-wide v6, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontSize:J

    .line 193
    iget-object v8, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontStyle:Landroidx/compose/ui/text/font/FontStyle;

    move-object v2, v9

    .line 194
    iget-object v9, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontWeight:Landroidx/compose/ui/text/font/FontWeight;

    .line 195
    iget-object v10, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 196
    iget-wide v11, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$letterSpacing:J

    .line 197
    iget-object v13, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textDecoration:Landroidx/compose/ui/text/style/TextDecoration;

    .line 198
    iget-object v14, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$textAlign:Landroidx/compose/ui/text/style/TextAlign;

    move-object/from16 p2, v2

    .line 199
    iget-wide v2, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$lineHeight:J

    .line 200
    iget-boolean v0, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$softWrap:Z

    .line 202
    iget-object v15, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$onTextLayout:Lkotlin/jvm/functions/Function1;

    move/from16 v18, v0

    .line 203
    iget-object v0, v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1;->$style:Landroidx/compose/ui/text/TextStyle;

    const/16 v25, 0xc00

    const/16 v26, 0x4802

    move-object/from16 v21, v15

    move-wide v15, v2

    const/4 v3, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p1

    move-object/from16 v2, p2

    move-object/from16 v22, v0

    .line 189
    invoke-static/range {v2 .. v26}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_10
    return-void
.end method
