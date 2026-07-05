.class Lcom/horcrux/svg/RectView;
.super Lcom/horcrux/svg/RenderableView;
.source "RectView.java"


# instance fields
.field private mH:Lcom/horcrux/svg/SVGLength;

.field private mRx:Lcom/horcrux/svg/SVGLength;

.field private mRy:Lcom/horcrux/svg/SVGLength;

.field private mW:Lcom/horcrux/svg/SVGLength;

.field private mX:Lcom/horcrux/svg/SVGLength;

.field private mY:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 19

    move-object/from16 v0, p0

    .line 66
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 67
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->mX:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v9

    .line 68
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->mY:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v11

    .line 69
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->mW:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v13

    .line 70
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->mH:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v15

    .line 72
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->mRx:Lcom/horcrux/svg/SVGLength;

    if-nez v2, :cond_1

    iget-object v3, v0, Lcom/horcrux/svg/RectView;->mRy:Lcom/horcrux/svg/SVGLength;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    double-to-float v2, v9

    double-to-float v3, v11

    add-double v4, v9, v13

    double-to-float v4, v4

    add-double v5, v11, v15

    double-to-float v5, v5

    .line 110
    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 111
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    goto :goto_3

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 76
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->mRy:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v2

    :goto_1
    move-wide v4, v2

    goto :goto_2

    .line 78
    :cond_2
    iget-object v3, v0, Lcom/horcrux/svg/RectView;->mRy:Lcom/horcrux/svg/SVGLength;

    if-nez v3, :cond_3

    .line 79
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v2

    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/RectView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v2

    .line 83
    iget-object v4, v0, Lcom/horcrux/svg/RectView;->mRy:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v4}, Lcom/horcrux/svg/RectView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v4

    :goto_2
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double v17, v13, v6

    cmpl-double v8, v2, v17

    if-lez v8, :cond_4

    move-wide/from16 v2, v17

    :cond_4
    div-double v6, v15, v6

    cmpl-double v8, v4, v6

    if-lez v8, :cond_5

    move-wide v4, v6

    :cond_5
    double-to-float v6, v9

    double-to-float v7, v11

    move v8, v6

    move/from16 v17, v7

    add-double v6, v9, v13

    double-to-float v6, v6

    move/from16 v18, v6

    add-double v6, v11, v15

    double-to-float v6, v6

    double-to-float v2, v2

    double-to-float v7, v4

    move v5, v6

    move v6, v2

    move v2, v8

    .line 94
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move/from16 v3, v17

    move/from16 v4, v18

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    .line 115
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/horcrux/svg/RectView;->elements:Ljava/util/ArrayList;

    .line 116
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->elements:Ljava/util/ArrayList;

    new-instance v3, Lcom/horcrux/svg/PathElement;

    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementMoveToPoint:Lcom/horcrux/svg/ElementType;

    const/4 v5, 0x1

    new-array v6, v5, [Lcom/horcrux/svg/Point;

    new-instance v7, Lcom/horcrux/svg/Point;

    invoke-direct {v7, v9, v10, v11, v12}, Lcom/horcrux/svg/Point;-><init>(DD)V

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-direct {v3, v4, v6}, Lcom/horcrux/svg/PathElement;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/Point;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->elements:Ljava/util/ArrayList;

    new-instance v3, Lcom/horcrux/svg/PathElement;

    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    new-array v6, v5, [Lcom/horcrux/svg/Point;

    new-instance v7, Lcom/horcrux/svg/Point;

    add-double/2addr v13, v9

    invoke-direct {v7, v13, v14, v11, v12}, Lcom/horcrux/svg/Point;-><init>(DD)V

    aput-object v7, v6, v8

    invoke-direct {v3, v4, v6}, Lcom/horcrux/svg/PathElement;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/Point;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->elements:Ljava/util/ArrayList;

    new-instance v3, Lcom/horcrux/svg/PathElement;

    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    new-array v6, v5, [Lcom/horcrux/svg/Point;

    new-instance v7, Lcom/horcrux/svg/Point;

    move-wide/from16 p1, v9

    move v10, v8

    add-double v8, v11, v15

    invoke-direct {v7, v13, v14, v8, v9}, Lcom/horcrux/svg/Point;-><init>(DD)V

    aput-object v7, v6, v10

    invoke-direct {v3, v4, v6}, Lcom/horcrux/svg/PathElement;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/Point;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->elements:Ljava/util/ArrayList;

    new-instance v3, Lcom/horcrux/svg/PathElement;

    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    new-array v6, v5, [Lcom/horcrux/svg/Point;

    new-instance v7, Lcom/horcrux/svg/Point;

    move-wide/from16 v13, p1

    invoke-direct {v7, v13, v14, v8, v9}, Lcom/horcrux/svg/Point;-><init>(DD)V

    aput-object v7, v6, v10

    invoke-direct {v3, v4, v6}, Lcom/horcrux/svg/PathElement;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/Point;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->elements:Ljava/util/ArrayList;

    new-instance v3, Lcom/horcrux/svg/PathElement;

    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    new-array v5, v5, [Lcom/horcrux/svg/Point;

    new-instance v6, Lcom/horcrux/svg/Point;

    invoke-direct {v6, v13, v14, v11, v12}, Lcom/horcrux/svg/Point;-><init>(DD)V

    aput-object v6, v5, v10

    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/PathElement;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/Point;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 50
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RectView;->mH:Lcom/horcrux/svg/SVGLength;

    .line 51
    invoke-virtual {p0}, Lcom/horcrux/svg/RectView;->invalidate()V

    return-void
.end method

.method public setRx(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 55
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RectView;->mRx:Lcom/horcrux/svg/SVGLength;

    .line 56
    invoke-virtual {p0}, Lcom/horcrux/svg/RectView;->invalidate()V

    return-void
.end method

.method public setRy(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 60
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RectView;->mRy:Lcom/horcrux/svg/SVGLength;

    .line 61
    invoke-virtual {p0}, Lcom/horcrux/svg/RectView;->invalidate()V

    return-void
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 45
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RectView;->mW:Lcom/horcrux/svg/SVGLength;

    .line 46
    invoke-virtual {p0}, Lcom/horcrux/svg/RectView;->invalidate()V

    return-void
.end method

.method public setX(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 35
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RectView;->mX:Lcom/horcrux/svg/SVGLength;

    .line 36
    invoke-virtual {p0}, Lcom/horcrux/svg/RectView;->invalidate()V

    return-void
.end method

.method public setY(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 40
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/RectView;->mY:Lcom/horcrux/svg/SVGLength;

    .line 41
    invoke-virtual {p0}, Lcom/horcrux/svg/RectView;->invalidate()V

    return-void
.end method
