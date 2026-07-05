.class final Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;
.super Ljava/lang/Object;
.source "Flow.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/accompanist/flowlayout/FlowKt;->Flow-F4y8cZ0(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/flowlayout/LayoutOrientation;Lcom/google/accompanist/flowlayout/SizeMode;Lcom/google/accompanist/flowlayout/MainAxisAlignment;FLcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "outerConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $crossAxisAlignment:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

.field final synthetic $crossAxisSpacing:F

.field final synthetic $lastLineMainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field final synthetic $mainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field final synthetic $mainAxisSize:Lcom/google/accompanist/flowlayout/SizeMode;

.field final synthetic $mainAxisSpacing:F

.field final synthetic $orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;


# direct methods
.method constructor <init>(Lcom/google/accompanist/flowlayout/LayoutOrientation;FLcom/google/accompanist/flowlayout/SizeMode;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lcom/google/accompanist/flowlayout/MainAxisAlignment;Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;)V
    .locals 0

    iput-object p1, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    iput p2, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisSpacing:F

    iput-object p3, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisSize:Lcom/google/accompanist/flowlayout/SizeMode;

    iput p4, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$crossAxisSpacing:F

    iput-object p5, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iput-object p6, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$lastLineMainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iput-object p7, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$crossAxisAlignment:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final measure_3p2s80s$canAddToCurrentSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLcom/google/accompanist/flowlayout/OrientationIndependentConstraints;Lcom/google/accompanist/flowlayout/LayoutOrientation;Landroidx/compose/ui/layout/Placeable;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "F",
            "Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;",
            "Lcom/google/accompanist/flowlayout/LayoutOrientation;",
            "Landroidx/compose/ui/layout/Placeable;",
            ")Z"
        }
    .end annotation

    .line 212
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1

    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result p1

    add-int/2addr p0, p1

    .line 213
    invoke-static {p6, p5}, Lcom/google/accompanist/flowlayout/FlowKt;->access$Flow_F4y8cZ0$mainAxisSize(Landroidx/compose/ui/layout/Placeable;Lcom/google/accompanist/flowlayout/LayoutOrientation;)I

    move-result p1

    add-int/2addr p0, p1

    invoke-virtual {p4}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getMainAxisMax()I

    move-result p1

    if-gt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final measure_3p2s80s$startNewSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "F",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            ")V"
        }
    .end annotation

    .line 217
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result p2

    add-int/2addr v0, p2

    iput v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 220
    :cond_0
    move-object p2, p4

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 221
    check-cast p5, Ljava/util/Collection;

    iget p0, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 222
    check-cast p7, Ljava/util/Collection;

    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 224
    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget p2, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr p0, p2

    iput p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 225
    iget p0, p8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget p1, p9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    iput p0, p8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 227
    invoke-interface {p4}, Ljava/util/List;->clear()V

    const/4 p0, 0x0

    .line 228
    iput p0, p9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 229
    iput p0, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    const-string v1, "$this$Layout"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v1

    check-cast v8, Ljava/util/List;

    .line 192
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v10, v1

    check-cast v10, Ljava/util/List;

    .line 193
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v1

    check-cast v11, Ljava/util/List;

    .line 195
    new-instance v9, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 196
    new-instance v12, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v12}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 198
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v5, v1

    check-cast v5, Ljava/util/List;

    .line 199
    new-instance v2, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 200
    new-instance v13, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v1, v5

    .line 202
    new-instance v5, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;

    iget-object v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    const/4 v6, 0x0

    move-wide/from16 v14, p3

    invoke-direct {v5, v14, v15, v4, v6}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;-><init>(JLcom/google/accompanist/flowlayout/LayoutOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 204
    iget-object v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    sget-object v6, Lcom/google/accompanist/flowlayout/LayoutOrientation;->Horizontal:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    if-ne v4, v6, :cond_0

    .line 205
    invoke-virtual {v5}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getMainAxisMax()I

    move-result v15

    const/16 v18, 0xd

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v6

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {v5}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getMainAxisMax()I

    move-result v17

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v6

    :goto_0
    move-wide v14, v6

    .line 232
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 234
    invoke-interface {v4, v14, v15}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v7

    .line 237
    iget v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisSpacing:F

    iget-object v6, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    invoke-static/range {v1 .. v7}, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->measure_3p2s80s$canAddToCurrentSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLcom/google/accompanist/flowlayout/OrientationIndependentConstraints;Lcom/google/accompanist/flowlayout/LayoutOrientation;Landroidx/compose/ui/layout/Placeable;)Z

    move-result v4

    move-object/from16 v17, v5

    if-nez v4, :cond_1

    iget v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$crossAxisSpacing:F

    move-object/from16 v3, p1

    move-object v5, v1

    move-object v1, v8

    move-object v6, v10

    move-object v8, v11

    move-object v10, v2

    move-object v11, v7

    move-object v2, v12

    move-object v7, v13

    invoke-static/range {v1 .. v10}, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->measure_3p2s80s$startNewSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    goto :goto_2

    :cond_1
    move-object/from16 v3, p1

    move-object v5, v1

    move-object v1, v8

    move-object v6, v10

    move-object v8, v11

    move-object v10, v2

    move-object v11, v7

    move-object v2, v12

    move-object v7, v13

    .line 240
    :goto_2
    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 241
    iget v4, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v12, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisSpacing:F

    invoke-interface {v3, v12}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v12

    add-int/2addr v4, v12

    iput v4, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 243
    :cond_2
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    iget v4, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v12, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    invoke-static {v11, v12}, Lcom/google/accompanist/flowlayout/FlowKt;->access$Flow_F4y8cZ0$mainAxisSize(Landroidx/compose/ui/layout/Placeable;Lcom/google/accompanist/flowlayout/LayoutOrientation;)I

    move-result v12

    add-int/2addr v4, v12

    iput v4, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 245
    iget v4, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v12, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    invoke-static {v11, v12}, Lcom/google/accompanist/flowlayout/FlowKt;->access$Flow_F4y8cZ0$crossAxisSize(Landroidx/compose/ui/layout/Placeable;Lcom/google/accompanist/flowlayout/LayoutOrientation;)I

    move-result v11

    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v12, v2

    move-object v13, v7

    move-object v11, v8

    move-object v2, v10

    move-object v8, v1

    move-object v1, v5

    move-object v10, v6

    move-object/from16 v5, v17

    goto :goto_1

    :cond_3
    move-object/from16 v17, v5

    move-object v6, v10

    move-object v7, v13

    move-object v5, v1

    move-object v10, v2

    move-object v1, v8

    move-object v8, v11

    move-object v2, v12

    .line 248
    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    iget v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$crossAxisSpacing:F

    invoke-static/range {v1 .. v10}, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->measure_3p2s80s$startNewSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    .line 250
    :cond_4
    invoke-virtual/range {v17 .. v17}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getMainAxisMax()I

    move-result v3

    const v4, 0x7fffffff

    if-eq v3, v4, :cond_5

    .line 251
    iget-object v3, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisSize:Lcom/google/accompanist/flowlayout/SizeMode;

    sget-object v4, Lcom/google/accompanist/flowlayout/SizeMode;->Expand:Lcom/google/accompanist/flowlayout/SizeMode;

    if-ne v3, v4, :cond_5

    .line 253
    invoke-virtual/range {v17 .. v17}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getMainAxisMax()I

    move-result v3

    goto :goto_3

    .line 255
    :cond_5
    iget v3, v9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual/range {v17 .. v17}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getMainAxisMin()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 257
    :goto_3
    iget v2, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual/range {v17 .. v17}, Lcom/google/accompanist/flowlayout/OrientationIndependentConstraints;->getCrossAxisMin()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 259
    iget-object v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    sget-object v5, Lcom/google/accompanist/flowlayout/LayoutOrientation;->Horizontal:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    if-ne v4, v5, :cond_6

    move v12, v3

    goto :goto_4

    :cond_6
    move v12, v2

    .line 264
    :goto_4
    iget-object v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    sget-object v5, Lcom/google/accompanist/flowlayout/LayoutOrientation;->Horizontal:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    if-ne v4, v5, :cond_7

    move v13, v2

    goto :goto_5

    :cond_7
    move v13, v3

    :goto_5
    move-object v2, v1

    .line 270
    new-instance v1, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;

    iget v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisSpacing:F

    iget-object v5, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$mainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    move-object v10, v6

    iget-object v6, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$lastLineMainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iget-object v7, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    iget-object v9, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->$crossAxisAlignment:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    move-object v11, v8

    move v8, v3

    move-object/from16 v3, p1

    invoke-direct/range {v1 .. v11}, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;-><init>(Ljava/util/List;Landroidx/compose/ui/layout/MeasureScope;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lcom/google/accompanist/flowlayout/MainAxisAlignment;Lcom/google/accompanist/flowlayout/LayoutOrientation;ILcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;Ljava/util/List;Ljava/util/List;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move v2, v12

    move v3, v13

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v1

    return-object v1
.end method
