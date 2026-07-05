.class Lcom/horcrux/svg/TextLayoutAlgorithm;
.super Ljava/lang/Object;
.source "TextLayoutAlgorithm.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/TextLayoutAlgorithm$LayoutInput;,
        Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getSubTreeTypographicCharacterPositions(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/StringBuilder;Landroid/view/View;Lcom/horcrux/svg/TextPathView;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/horcrux/svg/TextPathView;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/horcrux/svg/TextView;",
            ">;",
            "Ljava/lang/StringBuilder;",
            "Landroid/view/View;",
            "Lcom/horcrux/svg/TextPathView;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p4

    .line 52
    instance-of v1, v0, Lcom/horcrux/svg/TSpanView;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 53
    check-cast v0, Lcom/horcrux/svg/TSpanView;

    .line 54
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 56
    :goto_0
    invoke-virtual {v0}, Lcom/horcrux/svg/TSpanView;->getChildCount()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 58
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/TSpanView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    .line 57
    invoke-direct/range {v3 .. v8}, Lcom/horcrux/svg/TextLayoutAlgorithm;->getSubTreeTypographicCharacterPositions(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/StringBuilder;Landroid/view/View;Lcom/horcrux/svg/TextPathView;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 61
    :cond_0
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    move-object/from16 v10, p2

    .line 62
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, p5

    .line 63
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v11, p3

    .line 65
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v8, p5

    .line 68
    instance-of v1, v0, Lcom/horcrux/svg/TextPathView;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/horcrux/svg/TextPathView;

    move-object v13, v0

    goto :goto_2

    :cond_3
    move-object v13, v8

    .line 69
    :goto_2
    invoke-virtual {v13}, Lcom/horcrux/svg/TextPathView;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 71
    invoke-virtual {v13, v2}, Lcom/horcrux/svg/TextPathView;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    move-object v8, p0

    move-object v9, p1

    .line 70
    invoke-direct/range {v8 .. v13}, Lcom/horcrux/svg/TextLayoutAlgorithm;->getSubTreeTypographicCharacterPositions(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/StringBuilder;Landroid/view/View;Lcom/horcrux/svg/TextPathView;)V

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    goto :goto_2

    :cond_4
    return-void
.end method


# virtual methods
.method layoutText(Lcom/horcrux/svg/TextLayoutAlgorithm$LayoutInput;)[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;
    .locals 28

    move-object/from16 v0, p1

    .line 88
    iget-object v4, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$LayoutInput;->text:Lcom/horcrux/svg/TextView;

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    move-object/from16 v0, p0

    .line 92
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/TextLayoutAlgorithm;->getSubTreeTypographicCharacterPositions(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/StringBuilder;Landroid/view/View;Lcom/horcrux/svg/TextPathView;)V

    move-object v9, v1

    move-object v8, v4

    .line 93
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 98
    array-length v10, v1

    .line 114
    new-array v2, v10, [Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    const/4 v11, 0x0

    move v3, v11

    :goto_0
    if-ge v3, v10, :cond_0

    .line 116
    new-instance v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-char v5, v1, v3

    invoke-direct {v4, v0, v3, v5}, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;-><init>(Lcom/horcrux/svg/TextLayoutAlgorithm;IC)V

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v10, :cond_1

    goto/16 :goto_16

    .line 132
    :cond_1
    new-array v12, v10, [Landroid/graphics/PointF;

    move v1, v11

    :goto_1
    const/4 v13, 0x0

    if-ge v1, v10, :cond_2

    .line 134
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, v13, v13}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v3, v12, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_2
    const/4 v14, 0x1

    if-ge v1, v10, :cond_6

    .line 180
    aget-object v3, v2, v1

    iput-boolean v14, v3, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->addressable:Z

    .line 186
    aget-object v3, v2, v1

    iput-boolean v11, v3, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->middle:Z

    .line 195
    aget-object v3, v2, v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    move v14, v11

    :goto_3
    iput-boolean v14, v3, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    .line 206
    aget-object v3, v2, v1

    iget-boolean v3, v3, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->addressable:Z

    if-eqz v3, :cond_4

    aget-object v3, v2, v1

    iget-boolean v3, v3, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->middle:Z

    if-nez v3, :cond_4

    .line 207
    aget-object v3, v12, v1

    invoke-virtual {v3, v13, v13}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_4

    :cond_4
    if-lez v1, :cond_5

    .line 209
    aget-object v3, v12, v1

    add-int/lit8 v4, v1, -0x1

    aget-object v4, v12, v4

    invoke-virtual {v3, v4}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    :cond_5
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 231
    :cond_6
    new-array v3, v10, [Ljava/lang/String;

    .line 232
    new-array v4, v10, [Ljava/lang/String;

    .line 233
    new-array v5, v10, [Ljava/lang/String;

    .line 234
    new-array v6, v10, [Ljava/lang/String;

    .line 501
    new-instance v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1CharacterPositioningResolver;

    const/4 v7, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/horcrux/svg/TextLayoutAlgorithm$1CharacterPositioningResolver;-><init>(Lcom/horcrux/svg/TextLayoutAlgorithm;[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Lcom/horcrux/svg/TextLayoutAlgorithm-IA;)V

    move-object v0, v1

    .line 515
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v13, v13}, Landroid/graphics/PointF;-><init>(FF)V

    move v5, v11

    :goto_5
    if-ge v5, v10, :cond_9

    .line 524
    aget-object v6, v3, v5

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v15, "0"

    if-eqz v6, :cond_7

    .line 525
    aput-object v15, v3, v5

    .line 527
    :cond_7
    aget-object v6, v4, v5

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 528
    aput-object v15, v4, v5

    .line 534
    :cond_8
    iget v6, v1, Landroid/graphics/PointF;->x:F

    aget-object v7, v3, v5

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    add-float/2addr v6, v7

    iput v6, v1, Landroid/graphics/PointF;->x:F

    .line 535
    iget v6, v1, Landroid/graphics/PointF;->y:F

    aget-object v7, v4, v5

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    add-float/2addr v6, v7

    iput v6, v1, Landroid/graphics/PointF;->y:F

    .line 540
    aget-object v6, v2, v5

    aget-object v7, v12, v5

    iget v7, v7, Landroid/graphics/PointF;->x:F

    iget v15, v1, Landroid/graphics/PointF;->x:F

    add-float/2addr v7, v15

    float-to-double v14, v7

    iput-wide v14, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 541
    aget-object v6, v2, v5

    aget-object v7, v12, v5

    iget v7, v7, Landroid/graphics/PointF;->y:F

    iget v14, v1, Landroid/graphics/PointF;->y:F

    add-float/2addr v7, v14

    float-to-double v14, v7

    iput-wide v14, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    add-int/lit8 v5, v5, 0x1

    const/4 v14, 0x1

    goto :goto_5

    .line 741
    :cond_9
    new-instance v5, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;

    invoke-direct {v5, v0, v2}, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;-><init>(Lcom/horcrux/svg/TextLayoutAlgorithm;[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;)V

    .line 742
    invoke-static {v5, v8}, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->-$$Nest$mresolveTextLength(Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;Lcom/horcrux/svg/TextView;)V

    .line 757
    invoke-virtual {v1, v13, v13}, Landroid/graphics/PointF;->set(FF)V

    const/4 v5, 0x1

    :cond_a
    :goto_6
    if-ge v5, v10, :cond_e

    .line 769
    aget-object v6, v3, v5

    if-eqz v6, :cond_b

    .line 770
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    aget-object v8, v2, v5

    iget-wide v14, v8, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    sub-double/2addr v6, v14

    double-to-float v6, v6

    iput v6, v1, Landroid/graphics/PointF;->x:F

    .line 778
    :cond_b
    aget-object v6, v4, v5

    if-eqz v6, :cond_c

    .line 779
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    aget-object v8, v2, v5

    iget-wide v14, v8, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    sub-double/2addr v6, v14

    double-to-float v6, v6

    iput v6, v1, Landroid/graphics/PointF;->y:F

    .line 787
    :cond_c
    aget-object v6, v2, v5

    iget-wide v7, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    iget v12, v1, Landroid/graphics/PointF;->x:F

    float-to-double v14, v12

    add-double/2addr v7, v14

    iput-wide v7, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 788
    aget-object v6, v2, v5

    iget-wide v7, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    iget v12, v1, Landroid/graphics/PointF;->y:F

    float-to-double v14, v12

    add-double/2addr v7, v14

    iput-wide v7, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    .line 793
    aget-object v6, v2, v5

    iget-boolean v6, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->middle:Z

    if-eqz v6, :cond_d

    aget-object v6, v2, v5

    iget-boolean v6, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    if-eqz v6, :cond_d

    .line 798
    aget-object v6, v2, v5

    iput-boolean v11, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    :cond_d
    add-int/lit8 v5, v5, 0x1

    if-ge v5, v10, :cond_a

    .line 807
    aget-object v6, v2, v5

    const/4 v7, 0x1

    iput-boolean v7, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    goto :goto_6

    :cond_e
    move v1, v11

    move v12, v1

    const-wide/high16 v7, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    const-wide/high16 v14, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    const-wide/high16 v16, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    const-wide/high16 v18, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    :goto_7
    const-wide/high16 v21, 0x4000000000000000L    # 2.0

    if-ge v1, v10, :cond_1c

    const-wide/high16 v23, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 850
    aget-object v5, v2, v1

    iget-boolean v5, v5, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->addressable:Z

    if-nez v5, :cond_f

    goto/16 :goto_b

    .line 853
    :cond_f
    aget-object v5, v2, v1

    iget-boolean v5, v5, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    if-eqz v5, :cond_10

    move-wide/from16 v16, v7

    move-wide/from16 v18, v14

    move-wide/from16 v7, v23

    const-wide/high16 v14, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 877
    :cond_10
    aget-object v5, v2, v1

    iget-wide v5, v5, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 878
    aget-object v11, v2, v1

    iget-wide v3, v11, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->advance:D

    add-double/2addr v3, v5

    move-wide/from16 v26, v14

    .line 879
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v13

    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->min(DD)D

    move-result-wide v7

    .line 880
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    move-wide/from16 v14, v26

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v14

    if-lez v1, :cond_11

    .line 901
    aget-object v3, v2, v1

    iget-boolean v3, v3, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    if-eqz v3, :cond_11

    cmpl-double v3, v16, v23

    if-nez v3, :cond_12

    :cond_11
    add-int/lit8 v3, v10, -0x1

    if-ne v1, v3, :cond_1b

    .line 903
    :cond_12
    sget-object v3, Lcom/horcrux/svg/TextProperties$TextAnchor;->start:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 904
    sget-object v4, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    add-int/lit8 v5, v10, -0x1

    if-ne v1, v5, :cond_13

    move-wide/from16 v16, v7

    move-wide/from16 v18, v14

    .line 911
    :cond_13
    aget-object v6, v2, v12

    move v13, v12

    iget-wide v11, v6, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 912
    sget-object v6, Lcom/horcrux/svg/TextLayoutAlgorithm$1;->$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor:[I

    invoke-virtual {v3}, Lcom/horcrux/svg/TextProperties$TextAnchor;->ordinal()I

    move-result v3

    aget v3, v6, v3

    const/4 v6, 0x1

    if-eq v3, v6, :cond_16

    const/4 v6, 0x2

    if-eq v3, v6, :cond_15

    const/4 v6, 0x3

    if-eq v3, v6, :cond_14

    goto :goto_9

    .line 930
    :cond_14
    sget-object v3, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    if-ne v4, v3, :cond_17

    goto :goto_8

    .line 922
    :cond_15
    sget-object v3, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    add-double v3, v16, v18

    div-double v3, v3, v21

    sub-double/2addr v11, v3

    goto :goto_9

    .line 914
    :cond_16
    sget-object v3, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    if-ne v4, v3, :cond_18

    :cond_17
    sub-double v11, v11, v16

    goto :goto_9

    :cond_18
    :goto_8
    sub-double v11, v11, v18

    :goto_9
    if-ne v1, v5, :cond_19

    move v3, v1

    goto :goto_a

    :cond_19
    add-int/lit8 v3, v1, -0x1

    :goto_a
    if-gt v13, v3, :cond_1a

    .line 947
    aget-object v4, v2, v13

    iget-wide v5, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    add-double/2addr v5, v11

    iput-wide v5, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    add-int/lit8 v13, v13, 0x1

    goto :goto_a

    :cond_1a
    move v12, v1

    goto :goto_b

    :cond_1b
    move v13, v12

    :goto_b
    add-int/lit8 v1, v1, 0x1

    const/4 v11, 0x0

    const/4 v13, 0x0

    goto/16 :goto_7

    :cond_1c
    move v13, v12

    .line 974
    new-instance v1, Landroid/graphics/PointF;

    const/4 v11, 0x0

    invoke-direct {v1, v11, v11}, Landroid/graphics/PointF;-><init>(FF)V

    .line 976
    new-instance v3, Landroid/graphics/PathMeasure;

    invoke-direct {v3}, Landroid/graphics/PathMeasure;-><init>()V

    const/4 v4, 0x0

    move-object v8, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_c
    if-ge v6, v10, :cond_33

    .line 984
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/horcrux/svg/TextPathView;

    if-eqz v11, :cond_2e

    .line 985
    aget-object v12, v2, v6

    iget-boolean v12, v12, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->addressable:Z

    if-eqz v12, :cond_2e

    .line 986
    invoke-virtual {v11, v4, v4}, Lcom/horcrux/svg/TextPathView;->getTextPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object v8

    .line 993
    aget-object v7, v2, v6

    iget-boolean v7, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->middle:Z

    if-nez v7, :cond_2c

    .line 1008
    invoke-virtual {v11}, Lcom/horcrux/svg/TextPathView;->getSide()Lcom/horcrux/svg/TextProperties$TextPathSide;

    sget-object v7, Lcom/horcrux/svg/TextProperties$TextPathSide;->right:Lcom/horcrux/svg/TextProperties$TextPathSide;

    const/4 v7, 0x0

    .line 1014
    invoke-virtual {v3, v8, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 1015
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v7

    float-to-double v14, v7

    .line 1024
    invoke-virtual {v11}, Lcom/horcrux/svg/TextPathView;->getStartOffset()Lcom/horcrux/svg/SVGLength;

    move-result-object v7

    move/from16 v16, v5

    iget-wide v4, v7, Lcom/horcrux/svg/SVGLength;->value:D

    .line 1031
    aget-object v7, v2, v6

    move/from16 v17, v13

    iget-wide v12, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->advance:D

    .line 1037
    aget-object v7, v2, v6

    move-wide/from16 v19, v4

    iget-wide v4, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 1038
    aget-object v7, v2, v6

    move-wide/from16 v23, v4

    iget-wide v4, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    .line 1039
    aget-object v4, v2, v6

    iget-wide v4, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->rotate:D

    div-double v12, v12, v21

    add-double v4, v23, v12

    add-double v4, v4, v19

    .line 1066
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->isClosed()Z

    move-result v7

    const-wide/16 v12, 0x0

    if-nez v7, :cond_1e

    cmpg-double v7, v4, v12

    if-ltz v7, :cond_1d

    cmpl-double v7, v4, v14

    if-lez v7, :cond_1e

    .line 1067
    :cond_1d
    aget-object v7, v2, v6

    move-wide/from16 v19, v12

    const/4 v12, 0x1

    iput-boolean v12, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    goto :goto_d

    :cond_1e
    move-wide/from16 v19, v12

    .line 1074
    :goto_d
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->isClosed()Z

    move-result v7

    if-eqz v7, :cond_29

    .line 1098
    sget-object v7, Lcom/horcrux/svg/TextProperties$TextAnchor;->start:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 1099
    sget-object v12, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    .line 1101
    aget-object v13, v2, v17

    move-wide/from16 v23, v4

    iget-wide v4, v13, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 1102
    sget-object v4, Lcom/horcrux/svg/TextLayoutAlgorithm$1;->$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor:[I

    invoke-virtual {v7}, Lcom/horcrux/svg/TextProperties$TextAnchor;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v7, 0x1

    if-eq v4, v7, :cond_25

    const/4 v5, 0x2

    if-eq v4, v5, :cond_23

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1f

    goto :goto_e

    .line 1122
    :cond_1f
    sget-object v4, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    if-ne v12, v4, :cond_21

    neg-double v12, v14

    cmpg-double v4, v23, v12

    if-ltz v4, :cond_20

    cmpl-double v4, v23, v19

    if-lez v4, :cond_2a

    .line 1124
    :cond_20
    aget-object v4, v2, v6

    const/4 v7, 0x1

    iput-boolean v7, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    goto :goto_f

    :cond_21
    const/4 v7, 0x1

    cmpg-double v4, v23, v19

    if-ltz v4, :cond_22

    cmpl-double v4, v23, v14

    if-lez v4, :cond_2b

    .line 1128
    :cond_22
    aget-object v4, v2, v6

    iput-boolean v7, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    goto :goto_f

    :cond_23
    const/4 v5, 0x3

    neg-double v12, v14

    div-double v12, v12, v21

    cmpg-double v4, v23, v12

    if-ltz v4, :cond_24

    div-double v12, v14, v21

    cmpl-double v4, v23, v12

    if-lez v4, :cond_2a

    .line 1117
    :cond_24
    aget-object v4, v2, v6

    const/4 v7, 0x1

    iput-boolean v7, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    goto :goto_f

    :cond_25
    const/4 v5, 0x3

    .line 1104
    sget-object v4, Lcom/horcrux/svg/TextProperties$Direction;->ltr:Lcom/horcrux/svg/TextProperties$Direction;

    if-ne v12, v4, :cond_27

    cmpg-double v4, v23, v19

    if-ltz v4, :cond_26

    cmpl-double v4, v23, v14

    if-lez v4, :cond_2a

    .line 1106
    :cond_26
    aget-object v4, v2, v6

    const/4 v7, 0x1

    iput-boolean v7, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    goto :goto_f

    :cond_27
    const/4 v7, 0x1

    neg-double v12, v14

    cmpg-double v4, v23, v12

    if-ltz v4, :cond_28

    cmpl-double v4, v23, v19

    if-lez v4, :cond_2b

    .line 1110
    :cond_28
    aget-object v4, v2, v6

    iput-boolean v7, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    goto :goto_f

    :cond_29
    move-wide/from16 v23, v4

    const/4 v5, 0x3

    :cond_2a
    :goto_e
    const/4 v7, 0x1

    :cond_2b
    :goto_f
    rem-double v12, v23, v14

    .line 1141
    aget-object v4, v2, v6

    iget-boolean v4, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->hidden:Z

    if-nez v4, :cond_2d

    const/4 v4, 0x2

    .line 1148
    new-array v14, v4, [F

    .line 1149
    new-array v15, v4, [F

    double-to-float v4, v12

    .line 1150
    invoke-virtual {v3, v4, v14, v15}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 1153
    aget v4, v15, v7

    float-to-double v12, v4

    const/16 v25, 0x0

    aget v4, v15, v25

    float-to-double v14, v4

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v12

    const-wide v14, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v12, v14

    const-wide v14, 0x4056800000000000L    # 90.0

    add-double/2addr v14, v12

    .line 1165
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 1185
    aget-object v4, v2, v6

    iget-wide v14, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->rotate:D

    add-double/2addr v14, v12

    iput-wide v14, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->rotate:D

    goto :goto_10

    :cond_2c
    move/from16 v16, v5

    move/from16 v17, v13

    const/4 v5, 0x3

    .line 1228
    aget-object v4, v2, v6

    add-int/lit8 v7, v6, -0x1

    aget-object v12, v2, v7

    iget-wide v12, v12, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    iput-wide v12, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 1229
    aget-object v4, v2, v6

    aget-object v12, v2, v7

    iget-wide v12, v12, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    iput-wide v12, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    .line 1230
    aget-object v4, v2, v6

    aget-object v7, v2, v7

    iget-wide v12, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->rotate:D

    iput-wide v12, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->rotate:D

    :cond_2d
    :goto_10
    const/4 v7, 0x1

    goto :goto_11

    :cond_2e
    move/from16 v16, v5

    move/from16 v17, v13

    const/4 v5, 0x3

    :goto_11
    if-nez v11, :cond_32

    .line 1240
    aget-object v4, v2, v6

    iget-boolean v4, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->addressable:Z

    if-eqz v4, :cond_32

    const/4 v4, 0x0

    if-eqz v7, :cond_2f

    .line 1255
    invoke-virtual {v3, v8, v4}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    const/4 v11, 0x2

    .line 1256
    new-array v7, v11, [F

    .line 1257
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v12

    const/4 v13, 0x0

    invoke-virtual {v3, v12, v7, v13}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 1258
    aget v12, v7, v4

    const/4 v14, 0x1

    aget v7, v7, v14

    invoke-virtual {v1, v12, v7}, Landroid/graphics/PointF;->set(FF)V

    move v12, v4

    move v7, v14

    goto :goto_12

    :cond_2f
    const/4 v11, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    move v12, v7

    move/from16 v7, v16

    :goto_12
    if-eqz v7, :cond_31

    .line 1275
    aget-object v15, v2, v6

    iget-boolean v15, v15, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->anchoredChunk:Z

    if-eqz v15, :cond_30

    move-object v11, v1

    move v5, v4

    goto :goto_14

    .line 1278
    :cond_30
    aget-object v15, v2, v6

    iget-wide v4, v15, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    iget v11, v1, Landroid/graphics/PointF;->x:F

    float-to-double v13, v11

    add-double/2addr v4, v13

    iput-wide v4, v15, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 1279
    aget-object v4, v2, v6

    iget-wide v13, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    iget v5, v1, Landroid/graphics/PointF;->y:F

    move-object v11, v1

    float-to-double v0, v5

    add-double/2addr v13, v0

    iput-wide v13, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->y:D

    goto :goto_13

    :cond_31
    move-object v11, v1

    :goto_13
    move v5, v7

    :goto_14
    move v7, v12

    goto :goto_15

    :cond_32
    move-object v11, v1

    move/from16 v5, v16

    :goto_15
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move-object v1, v11

    move/from16 v13, v17

    const/4 v4, 0x0

    goto/16 :goto_c

    :cond_33
    :goto_16
    return-object v2
.end method
