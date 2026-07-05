.class final Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Flow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,379:1\n1864#2,2:380\n1864#2,3:382\n1866#2:385\n*S KotlinDebug\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1\n*L\n271#1:380,2\n287#1:382,3\n271#1:385\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "invoke"
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

.field final synthetic $crossAxisPositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $crossAxisSizes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $lastLineMainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field final synthetic $mainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field final synthetic $mainAxisLayoutSize:I

.field final synthetic $mainAxisSpacing:F

.field final synthetic $orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

.field final synthetic $sequences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $this_Layout:Landroidx/compose/ui/layout/MeasureScope;


# direct methods
.method constructor <init>(Ljava/util/List;Landroidx/compose/ui/layout/MeasureScope;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lcom/google/accompanist/flowlayout/MainAxisAlignment;Lcom/google/accompanist/flowlayout/LayoutOrientation;ILcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "F",
            "Lcom/google/accompanist/flowlayout/MainAxisAlignment;",
            "Lcom/google/accompanist/flowlayout/MainAxisAlignment;",
            "Lcom/google/accompanist/flowlayout/LayoutOrientation;",
            "I",
            "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$sequences:Ljava/util/List;

    iput-object p2, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$this_Layout:Landroidx/compose/ui/layout/MeasureScope;

    iput p3, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$mainAxisSpacing:F

    iput-object p4, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$mainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iput-object p5, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$lastLineMainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iput-object p6, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    iput p7, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$mainAxisLayoutSize:I

    iput-object p8, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$crossAxisAlignment:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    iput-object p9, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$crossAxisSizes:Ljava/util/List;

    iput-object p10, p0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$crossAxisPositions:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 270
    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "$this$layout"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    iget-object v1, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$sequences:Ljava/util/List;

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    iget-object v9, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$this_Layout:Landroidx/compose/ui/layout/MeasureScope;

    iget v10, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$mainAxisSpacing:F

    iget-object v11, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$mainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iget-object v12, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$lastLineMainAxisAlignment:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    iget-object v13, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$orientation:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    iget v14, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$mainAxisLayoutSize:I

    iget-object v15, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$crossAxisAlignment:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    iget-object v4, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$crossAxisSizes:Ljava/util/List;

    iget-object v5, v0, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1;->$crossAxisPositions:Ljava/util/List;

    .line 381
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v6, 0x0

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v17, v6, 0x1

    if-gez v6, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v7, Ljava/util/List;

    .line 272
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/16 v18, 0x0

    new-array v3, v8, [I

    move/from16 v0, v18

    :goto_1
    if-ge v0, v8, :cond_2

    .line 273
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v1

    move-object/from16 v1, v19

    check-cast v1, Landroidx/compose/ui/layout/Placeable;

    invoke-static {v1, v13}, Lcom/google/accompanist/flowlayout/FlowKt;->access$Flow_F4y8cZ0$mainAxisSize(Landroidx/compose/ui/layout/Placeable;Lcom/google/accompanist/flowlayout/LayoutOrientation;)I

    move-result v1

    move/from16 v19, v1

    .line 274
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {v9, v10}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    goto :goto_2

    :cond_1
    move/from16 v1, v18

    :goto_2
    add-int v1, v19, v1

    .line 273
    aput v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, v20

    goto :goto_1

    :cond_2
    move-object/from16 v20, v1

    .line 276
    invoke-static/range {v20 .. v20}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 277
    invoke-virtual {v11}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->getArrangement$flowlayout_release()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    goto :goto_3

    .line 279
    :cond_3
    invoke-virtual {v12}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->getArrangement$flowlayout_release()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    .line 283
    :goto_3
    new-array v1, v8, [I

    move/from16 v2, v18

    :goto_4
    if-ge v2, v8, :cond_4

    aput v18, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 285
    :cond_4
    move-object v2, v9

    check-cast v2, Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v2, v14, v3, v1}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 287
    check-cast v7, Ljava/lang/Iterable;

    .line 383
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v2, v18

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v19, v2, 0x1

    if-gez v2, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_5
    check-cast v3, Landroidx/compose/ui/layout/Placeable;

    .line 288
    sget-object v7, Lcom/google/accompanist/flowlayout/FlowKt$Flow$1$1$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v15}, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->ordinal()I

    move-result v8

    aget v7, v7, v8

    const/4 v8, 0x1

    if-eq v7, v8, :cond_8

    const/4 v8, 0x2

    if-eq v7, v8, :cond_7

    const/4 v8, 0x3

    if-ne v7, v8, :cond_6

    .line 293
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v21

    .line 294
    sget-object v7, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v22

    .line 297
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v3, v13}, Lcom/google/accompanist/flowlayout/FlowKt;->access$Flow_F4y8cZ0$crossAxisSize(Landroidx/compose/ui/layout/Placeable;Lcom/google/accompanist/flowlayout/LayoutOrientation;)I

    move-result v8

    sub-int/2addr v7, v8

    move/from16 v8, v18

    .line 295
    invoke-static {v8, v7}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v24

    .line 299
    sget-object v26, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 293
    invoke-interface/range {v21 .. v26}, Landroidx/compose/ui/Alignment;->align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    move-result-wide v21

    .line 300
    invoke-static/range {v21 .. v22}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v7

    goto :goto_6

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    move/from16 v8, v18

    .line 291
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v3, v13}, Lcom/google/accompanist/flowlayout/FlowKt;->access$Flow_F4y8cZ0$crossAxisSize(Landroidx/compose/ui/layout/Placeable;Lcom/google/accompanist/flowlayout/LayoutOrientation;)I

    move-result v18

    sub-int v7, v7, v18

    goto :goto_6

    :cond_8
    move/from16 v8, v18

    move v7, v8

    .line 302
    :goto_6
    sget-object v8, Lcom/google/accompanist/flowlayout/LayoutOrientation;->Horizontal:Lcom/google/accompanist/flowlayout/LayoutOrientation;

    if-ne v13, v8, :cond_9

    move-object v8, v4

    .line 304
    aget v4, v1, v2

    .line 305
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/2addr v2, v7

    const/4 v7, 0x4

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move/from16 v22, v6

    const/4 v6, 0x0

    move/from16 v18, v22

    move-object/from16 v22, v1

    move/from16 v1, v18

    move-object/from16 v18, v0

    move-object v0, v5

    const/16 v23, 0x0

    move v5, v2

    move-object/from16 v2, p1

    .line 303
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    goto :goto_7

    :cond_9
    move-object/from16 v18, v0

    move-object/from16 v22, v1

    move-object/from16 v21, v4

    move-object v0, v5

    move v1, v6

    const/16 v23, 0x0

    .line 309
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    add-int/2addr v4, v7

    .line 310
    aget v5, v22, v2

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    .line 308
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    :goto_7
    move-object v5, v0

    move v6, v1

    move-object/from16 v0, v18

    move/from16 v2, v19

    move-object/from16 v4, v21

    move-object/from16 v1, v22

    move/from16 v18, v23

    goto/16 :goto_5

    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move/from16 v6, v17

    move-object/from16 v1, v20

    goto/16 :goto_0

    :cond_b
    return-void
.end method
