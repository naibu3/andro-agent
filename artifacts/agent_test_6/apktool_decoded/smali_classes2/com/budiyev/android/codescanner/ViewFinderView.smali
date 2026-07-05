.class final Lcom/budiyev/android/codescanner/ViewFinderView;
.super Landroid/view/View;
.source "ViewFinderView.java"


# instance fields
.field private mFrameCornersRadius:I

.field private mFrameCornersSize:I

.field private final mFramePaint:Landroid/graphics/Paint;

.field private mFrameRatioHeight:F

.field private mFrameRatioWidth:F

.field private mFrameRect:Lcom/budiyev/android/codescanner/Rect;

.field private mFrameSize:F

.field private mFrameVerticalBias:F

.field private final mMaskPaint:Landroid/graphics/Paint;

.field private final mPath:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .line 52
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersSize:I

    .line 45
    iput v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersRadius:I

    .line 46
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioWidth:F

    .line 47
    iput v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioHeight:F

    .line 48
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameSize:F

    .line 49
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameVerticalBias:F

    .line 53
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mMaskPaint:Landroid/graphics/Paint;

    .line 54
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mMaskPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 55
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    .line 56
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 57
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 58
    .local v0, "path":Landroid/graphics/Path;
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 59
    iput-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mPath:Landroid/graphics/Path;

    .line 60
    return-void
.end method

.method private invalidateFrameRect()V
    .locals 2

    .line 286
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect(II)V

    .line 287
    return-void
.end method

.method private invalidateFrameRect(II)V
    .locals 10
    .param p1, "width"    # I
    .param p2, "height"    # I

    .line 290
    if-lez p1, :cond_1

    if-lez p2, :cond_1

    .line 291
    int-to-float v0, p1

    int-to-float v1, p2

    div-float/2addr v0, v1

    .line 292
    .local v0, "viewAR":F
    iget v1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioWidth:F

    iget v2, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioHeight:F

    div-float/2addr v1, v2

    .line 293
    .local v1, "frameAR":F
    iget v2, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameSize:F

    .line 296
    .local v2, "frameSize":F
    cmpg-float v3, v0, v1

    if-gtz v3, :cond_0

    .line 297
    int-to-float v3, p1

    mul-float v3, v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 298
    .local v3, "frameWidth":I
    int-to-float v4, v3

    div-float/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .local v4, "frameHeight":I
    goto :goto_0

    .line 300
    .end local v3    # "frameWidth":I
    .end local v4    # "frameHeight":I
    :cond_0
    int-to-float v3, p2

    mul-float v3, v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 301
    .restart local v4    # "frameHeight":I
    int-to-float v3, v4

    mul-float v3, v3, v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 303
    .restart local v3    # "frameWidth":I
    :goto_0
    sub-int v5, p1, v3

    div-int/lit8 v5, v5, 0x2

    .line 304
    .local v5, "frameLeft":I
    sub-int v6, p2, v4

    int-to-float v6, v6

    iget v7, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameVerticalBias:F

    mul-float v6, v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 305
    .local v6, "frameTop":I
    new-instance v7, Lcom/budiyev/android/codescanner/Rect;

    add-int v8, v5, v3

    add-int v9, v6, v4

    invoke-direct {v7, v5, v6, v8, v9}, Lcom/budiyev/android/codescanner/Rect;-><init>(IIII)V

    iput-object v7, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRect:Lcom/budiyev/android/codescanner/Rect;

    .line 308
    .end local v0    # "viewAR":F
    .end local v1    # "frameAR":F
    .end local v2    # "frameSize":F
    .end local v3    # "frameWidth":I
    .end local v4    # "frameHeight":I
    .end local v5    # "frameLeft":I
    .end local v6    # "frameTop":I
    :cond_1
    return-void
.end method


# virtual methods
.method getFrameAspectRatioHeight()F
    .locals 1

    .line 187
    iget v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioHeight:F

    return v0
.end method

.method getFrameAspectRatioWidth()F
    .locals 1

    .line 173
    iget v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioWidth:F

    return v0
.end method

.method getFrameColor()I
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method getFrameCornersRadius()I
    .locals 1

    .line 249
    iget v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersRadius:I

    return v0
.end method

.method getFrameCornersSize()I
    .locals 1

    .line 237
    iget v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersSize:I

    return v0
.end method

.method getFrameRect()Lcom/budiyev/android/codescanner/Rect;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRect:Lcom/budiyev/android/codescanner/Rect;

    return-object v0
.end method

.method public getFrameSize()F
    .locals 1

    .line 261
    iget v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameSize:F

    return v0
.end method

.method getFrameThickness()I
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public getFrameVerticalBias()F
    .locals 1

    .line 274
    iget v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameVerticalBias:F

    return v0
.end method

.method getMaskColor()I
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mMaskPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 14
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .line 76
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRect:Lcom/budiyev/android/codescanner/Rect;

    .line 77
    .local v0, "frame":Lcom/budiyev/android/codescanner/Rect;
    if-nez v0, :cond_0

    .line 78
    return-void

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->getWidth()I

    move-result v1

    .line 81
    .local v1, "width":I
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->getHeight()I

    move-result v2

    .line 82
    .local v2, "height":I
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getTop()I

    move-result v3

    int-to-float v3, v3

    .line 83
    .local v3, "top":F
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getLeft()I

    move-result v4

    int-to-float v4, v4

    .line 84
    .local v4, "left":F
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getRight()I

    move-result v5

    int-to-float v5, v5

    .line 85
    .local v5, "right":F
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getBottom()I

    move-result v6

    int-to-float v6, v6

    .line 86
    .local v6, "bottom":F
    iget v7, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersSize:I

    int-to-float v7, v7

    .line 87
    .local v7, "frameCornersSize":F
    iget v8, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersRadius:I

    int-to-float v8, v8

    .line 88
    .local v8, "frameCornersRadius":F
    iget-object v9, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mPath:Landroid/graphics/Path;

    .line 89
    .local v9, "path":Landroid/graphics/Path;
    const/4 v10, 0x0

    cmpl-float v11, v8, v10

    if-lez v11, :cond_1

    .line 90
    const/high16 v11, 0x3f800000    # 1.0f

    sub-float v11, v7, v11

    .line 91
    invoke-static {v11, v10}, Ljava/lang/Math;->max(FF)F

    move-result v11

    invoke-static {v8, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    .line 92
    .local v11, "normalizedRadius":F
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 93
    add-float v12, v3, v11

    invoke-virtual {v9, v4, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 94
    add-float v12, v4, v11

    invoke-virtual {v9, v4, v3, v12, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 95
    sub-float v12, v5, v11

    invoke-virtual {v9, v12, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 96
    add-float v12, v3, v11

    invoke-virtual {v9, v5, v3, v5, v12}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 97
    sub-float v12, v6, v11

    invoke-virtual {v9, v5, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 98
    sub-float v12, v5, v11

    invoke-virtual {v9, v5, v6, v12, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 99
    add-float v12, v4, v11

    invoke-virtual {v9, v12, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 100
    sub-float v12, v6, v11

    invoke-virtual {v9, v4, v6, v4, v12}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 101
    add-float v12, v3, v11

    invoke-virtual {v9, v4, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 102
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 103
    int-to-float v12, v1

    invoke-virtual {v9, v12, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 104
    int-to-float v12, v1

    int-to-float v13, v2

    invoke-virtual {v9, v12, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 105
    int-to-float v12, v2

    invoke-virtual {v9, v10, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 106
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 107
    iget-object v10, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mMaskPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 108
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 109
    add-float v10, v3, v7

    invoke-virtual {v9, v4, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 110
    add-float v10, v3, v11

    invoke-virtual {v9, v4, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 111
    add-float v10, v4, v11

    invoke-virtual {v9, v4, v3, v10, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 112
    add-float v10, v4, v7

    invoke-virtual {v9, v10, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 113
    sub-float v10, v5, v7

    invoke-virtual {v9, v10, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 114
    sub-float v10, v5, v11

    invoke-virtual {v9, v10, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 115
    add-float v10, v3, v11

    invoke-virtual {v9, v5, v3, v5, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 116
    add-float v10, v3, v7

    invoke-virtual {v9, v5, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 117
    sub-float v10, v6, v7

    invoke-virtual {v9, v5, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 118
    sub-float v10, v6, v11

    invoke-virtual {v9, v5, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 119
    sub-float v10, v5, v11

    invoke-virtual {v9, v5, v6, v10, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 120
    sub-float v10, v5, v7

    invoke-virtual {v9, v10, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 121
    add-float v10, v4, v7

    invoke-virtual {v9, v10, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 122
    add-float v10, v4, v11

    invoke-virtual {v9, v10, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 123
    sub-float v10, v6, v11

    invoke-virtual {v9, v4, v6, v4, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 124
    sub-float v10, v6, v7

    invoke-virtual {v9, v4, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 125
    iget-object v10, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 126
    .end local v11    # "normalizedRadius":F
    goto :goto_0

    .line 127
    :cond_1
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 128
    invoke-virtual {v9, v4, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 129
    invoke-virtual {v9, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 130
    invoke-virtual {v9, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 131
    invoke-virtual {v9, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 132
    invoke-virtual {v9, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 133
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 134
    int-to-float v11, v1

    invoke-virtual {v9, v11, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 135
    int-to-float v11, v1

    int-to-float v12, v2

    invoke-virtual {v9, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 136
    int-to-float v11, v2

    invoke-virtual {v9, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 137
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 138
    iget-object v10, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mMaskPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 139
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 140
    add-float v10, v3, v7

    invoke-virtual {v9, v4, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 141
    invoke-virtual {v9, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 142
    add-float v10, v4, v7

    invoke-virtual {v9, v10, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 143
    sub-float v10, v5, v7

    invoke-virtual {v9, v10, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 144
    invoke-virtual {v9, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 145
    add-float v10, v3, v7

    invoke-virtual {v9, v5, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 146
    sub-float v10, v6, v7

    invoke-virtual {v9, v5, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 147
    invoke-virtual {v9, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 148
    sub-float v10, v5, v7

    invoke-virtual {v9, v10, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 149
    add-float v10, v4, v7

    invoke-virtual {v9, v10, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 150
    invoke-virtual {v9, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 151
    sub-float v10, v6, v7

    invoke-virtual {v9, v4, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 152
    iget-object v10, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 154
    :goto_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .line 71
    sub-int v0, p4, p2

    sub-int v1, p5, p3

    invoke-direct {p0, v0, v1}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect(II)V

    .line 72
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .line 64
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 65
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->getMeasuredHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect(II)V

    .line 66
    return-void
.end method

.method setFrameAspectRatio(FF)V
    .locals 1
    .param p1, "ratioWidth"    # F
    .param p2, "ratioHeight"    # F

    .line 163
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioWidth:F

    .line 164
    iput p2, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioHeight:F

    .line 165
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect()V

    .line 166
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 169
    :cond_0
    return-void
.end method

.method setFrameAspectRatioHeight(F)V
    .locals 1
    .param p1, "ratioHeight"    # F

    .line 192
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioHeight:F

    .line 193
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect()V

    .line 194
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 197
    :cond_0
    return-void
.end method

.method setFrameAspectRatioWidth(F)V
    .locals 1
    .param p1, "ratioWidth"    # F

    .line 178
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameRatioWidth:F

    .line 179
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect()V

    .line 180
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 183
    :cond_0
    return-void
.end method

.method setFrameColor(I)V
    .locals 1
    .param p1, "color"    # I

    .line 217
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 218
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 221
    :cond_0
    return-void
.end method

.method setFrameCornersRadius(I)V
    .locals 1
    .param p1, "radius"    # I

    .line 253
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersRadius:I

    .line 254
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 257
    :cond_0
    return-void
.end method

.method setFrameCornersSize(I)V
    .locals 1
    .param p1, "size"    # I

    .line 241
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameCornersSize:I

    .line 242
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 245
    :cond_0
    return-void
.end method

.method setFrameSize(F)V
    .locals 1
    .param p1, "size"    # F

    .line 265
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameSize:F

    .line 266
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect()V

    .line 267
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 270
    :cond_0
    return-void
.end method

.method setFrameThickness(I)V
    .locals 2
    .param p1, "thickness"    # I

    .line 229
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFramePaint:Landroid/graphics/Paint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 230
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 233
    :cond_0
    return-void
.end method

.method public setFrameVerticalBias(F)V
    .locals 1
    .param p1, "bias"    # F

    .line 278
    iput p1, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mFrameVerticalBias:F

    .line 279
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidateFrameRect()V

    .line 280
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 283
    :cond_0
    return-void
.end method

.method setMaskColor(I)V
    .locals 1
    .param p1, "color"    # I

    .line 205
    iget-object v0, p0, Lcom/budiyev/android/codescanner/ViewFinderView;->mMaskPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 206
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    invoke-virtual {p0}, Lcom/budiyev/android/codescanner/ViewFinderView;->invalidate()V

    .line 209
    :cond_0
    return-void
.end method
