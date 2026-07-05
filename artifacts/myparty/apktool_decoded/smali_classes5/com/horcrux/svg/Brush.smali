.class Lcom/horcrux/svg/Brush;
.super Ljava/lang/Object;
.source "Brush.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/Brush$BrushType;,
        Lcom/horcrux/svg/Brush$BrushUnits;
    }
.end annotation


# instance fields
.field private mColors:Lcom/facebook/react/bridge/ReadableArray;

.field private mMatrix:Landroid/graphics/Matrix;

.field private mPattern:Lcom/horcrux/svg/PatternView;

.field private final mPoints:[Lcom/horcrux/svg/SVGLength;

.field private final mType:Lcom/horcrux/svg/Brush$BrushType;

.field private mUseContentObjectBoundingBoxUnits:Z

.field private final mUseObjectBoundingBox:Z

.field private mUserSpaceBoundingBox:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/Brush$BrushType;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/Brush$BrushUnits;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->mType:Lcom/horcrux/svg/Brush$BrushType;

    .line 41
    iput-object p2, p0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    .line 42
    sget-object p1, Lcom/horcrux/svg/Brush$BrushUnits;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/Brush$BrushUnits;

    if-ne p3, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/horcrux/svg/Brush;->mUseObjectBoundingBox:Z

    return-void
.end method

.method private getPaintRect(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 4

    .line 89
    iget-boolean v0, p0, Lcom/horcrux/svg/Brush;->mUseObjectBoundingBox:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/horcrux/svg/Brush;->mUserSpaceBoundingBox:Landroid/graphics/Rect;

    invoke-direct {p1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 90
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    .line 91
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    .line 95
    iget-boolean v2, p0, Lcom/horcrux/svg/Brush;->mUseObjectBoundingBox:Z

    if-eqz v2, :cond_1

    .line 96
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 97
    iget p1, p1, Landroid/graphics/RectF;->top:F

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    move p1, v2

    .line 100
    :goto_1
    new-instance v3, Landroid/graphics/RectF;

    add-float/2addr v0, v2

    add-float/2addr v1, p1

    invoke-direct {v3, v2, p1, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v3
.end method

.method private getVal(Lcom/horcrux/svg/SVGLength;DFF)D
    .locals 10

    .line 108
    iget-boolean v0, p0, Lcom/horcrux/svg/Brush;->mUseObjectBoundingBox:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/horcrux/svg/SVGLength;->unit:Lcom/horcrux/svg/SVGLength$UnitType;

    sget-object v2, Lcom/horcrux/svg/SVGLength$UnitType;->NUMBER:Lcom/horcrux/svg/SVGLength$UnitType;

    if-ne v0, v2, :cond_0

    move-wide v6, p2

    goto :goto_0

    :cond_0
    float-to-double v2, p4

    move-wide v6, v2

    :goto_0
    move v0, p5

    float-to-double v8, v0

    const-wide/16 v4, 0x0

    move-object v1, p1

    move-wide v2, p2

    .line 104
    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/PropHelper;->fromRelative(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v0

    return-wide v0
.end method

.method private static parseGradientStops(Lcom/facebook/react/bridge/ReadableArray;I[F[IF)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    mul-int/lit8 v1, v0, 0x2

    .line 68
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    aput v2, p2, v0

    add-int/lit8 v1, v1, 0x1

    .line 69
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    ushr-int/lit8 v2, v1, 0x18

    int-to-float v2, v2

    mul-float/2addr v2, p4

    .line 71
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    const v3, 0xffffff

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 72
    aput v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method setContentUnits(Lcom/horcrux/svg/Brush$BrushUnits;)V
    .locals 1

    .line 46
    sget-object v0, Lcom/horcrux/svg/Brush$BrushUnits;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/Brush$BrushUnits;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/horcrux/svg/Brush;->mUseContentObjectBoundingBoxUnits:Z

    return-void
.end method

.method setGradientColors(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->mColors:Lcom/facebook/react/bridge/ReadableArray;

    return-void
.end method

.method setGradientTransform(Landroid/graphics/Matrix;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->mMatrix:Landroid/graphics/Matrix;

    return-void
.end method

.method setPattern(Lcom/horcrux/svg/PatternView;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->mPattern:Lcom/horcrux/svg/PatternView;

    return-void
.end method

.method setUserSpaceBoundingBox(Landroid/graphics/Rect;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->mUserSpaceBoundingBox:Landroid/graphics/Rect;

    return-void
.end method

.method setupPaint(Landroid/graphics/Paint;Landroid/graphics/RectF;FF)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v1, p2

    move/from16 v7, p4

    .line 113
    invoke-direct {v0, v1}, Lcom/horcrux/svg/Brush;->getPaintRect(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    .line 114
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v8

    .line 115
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v9

    .line 116
    iget v10, v1, Landroid/graphics/RectF;->left:F

    .line 117
    iget v11, v1, Landroid/graphics/RectF;->top:F

    .line 119
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    .line 120
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mType:Lcom/horcrux/svg/Brush$BrushType;

    sget-object v2, Lcom/horcrux/svg/Brush$BrushType;->PATTERN:Lcom/horcrux/svg/Brush$BrushType;

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-ne v1, v2, :cond_4

    .line 121
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v15

    float-to-double v2, v8

    move/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v10

    move-wide v15, v2

    .line 122
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v14

    float-to-double v2, v9

    const/16 p2, 0x3

    const/16 v17, 0x2

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v12

    move-wide/from16 v18, v2

    .line 123
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v17

    move-wide v2, v15

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v14

    .line 124
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, p2

    move-wide/from16 v2, v18

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpl-double v5, v14, v3

    if-lez v5, :cond_c

    cmpl-double v3, v1, v3

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    double-to-int v3, v14

    double-to-int v4, v1

    .line 130
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 131
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 133
    iget-object v5, v0, Lcom/horcrux/svg/Brush;->mPattern:Lcom/horcrux/svg/PatternView;

    invoke-virtual {v5}, Lcom/horcrux/svg/PatternView;->getViewBox()Landroid/graphics/RectF;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 134
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v16

    const/16 v17, 0x0

    cmpl-float v16, v16, v17

    if-lez v16, :cond_1

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v16

    cmpl-float v16, v16, v17

    if-lez v16, :cond_1

    move/from16 v16, v9

    .line 135
    new-instance v9, Landroid/graphics/RectF;

    double-to-float v10, v10

    double-to-float v11, v12

    double-to-float v12, v14

    double-to-float v1, v1

    invoke-direct {v9, v10, v11, v12, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 136
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPattern:Lcom/horcrux/svg/PatternView;

    iget-object v1, v1, Lcom/horcrux/svg/PatternView;->mAlign:Ljava/lang/String;

    iget-object v2, v0, Lcom/horcrux/svg/Brush;->mPattern:Lcom/horcrux/svg/PatternView;

    iget v2, v2, Lcom/horcrux/svg/PatternView;->mMeetOrSlice:I

    .line 137
    invoke-static {v5, v9, v1, v2}, Lcom/horcrux/svg/ViewBox;->getTransform(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;

    move-result-object v1

    .line 138
    invoke-virtual {v4, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_1
    move/from16 v16, v9

    .line 141
    :goto_0
    iget-boolean v1, v0, Lcom/horcrux/svg/Brush;->mUseContentObjectBoundingBoxUnits:Z

    if-eqz v1, :cond_2

    div-float v8, v8, p3

    div-float v9, v16, p3

    .line 142
    invoke-virtual {v4, v8, v9}, Landroid/graphics/Canvas;->scale(FF)V

    .line 145
    :cond_2
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPattern:Lcom/horcrux/svg/PatternView;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v1, v4, v2, v7}, Lcom/horcrux/svg/PatternView;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 147
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 148
    iget-object v2, v0, Lcom/horcrux/svg/Brush;->mMatrix:Landroid/graphics/Matrix;

    if-eqz v2, :cond_3

    .line 149
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 152
    :cond_3
    new-instance v2, Landroid/graphics/BitmapShader;

    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    sget-object v5, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v2, v3, v4, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 154
    invoke-virtual {v2, v1}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 155
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :cond_4
    move/from16 v16, v9

    const/16 p2, 0x3

    const/16 v17, 0x2

    .line 159
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mColors:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    .line 160
    const-string v2, "ReactNative"

    if-nez v1, :cond_5

    .line 161
    const-string v1, "Gradient contains no stops"

    invoke-static {v2, v1}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 164
    :cond_5
    div-int/lit8 v1, v1, 0x2

    .line 165
    new-array v3, v1, [I

    .line 166
    new-array v4, v1, [F

    .line 167
    iget-object v9, v0, Lcom/horcrux/svg/Brush;->mColors:Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v9, v1, v4, v3, v7}, Lcom/horcrux/svg/Brush;->parseGradientStops(Lcom/facebook/react/bridge/ReadableArray;I[F[IF)V

    if-ne v1, v14, :cond_6

    move/from16 v1, v17

    .line 175
    new-array v7, v1, [I

    aget v9, v3, v15

    aput v9, v7, v15

    aget v3, v3, v15

    aput v3, v7, v14

    .line 176
    new-array v3, v1, [F

    aget v1, v4, v15

    aput v1, v3, v15

    aget v1, v4, v15

    aput v1, v3, v14

    .line 177
    const-string v1, "Gradient contains only one stop"

    invoke-static {v2, v1}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v24, v3

    move-object/from16 v23, v7

    goto :goto_1

    :cond_6
    move-object/from16 v23, v3

    move-object/from16 v24, v4

    .line 180
    :goto_1
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mType:Lcom/horcrux/svg/Brush$BrushType;

    sget-object v2, Lcom/horcrux/svg/Brush$BrushType;->LINEAR_GRADIENT:Lcom/horcrux/svg/Brush$BrushType;

    if-ne v1, v2, :cond_8

    .line 181
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v15

    float-to-double v2, v8

    move/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v7

    move-wide v12, v2

    float-to-double v9, v10

    add-double/2addr v7, v9

    .line 182
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v14

    move/from16 v2, v16

    float-to-double v2, v2

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v14

    move-wide/from16 v18, v2

    float-to-double v1, v11

    add-double/2addr v14, v1

    .line 183
    iget-object v3, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    const/16 v17, 0x2

    aget-object v3, v3, v17

    move-wide/from16 v31, v1

    move-object v1, v3

    move-wide v2, v12

    move-wide/from16 v11, v31

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    add-double/2addr v9, v1

    .line 184
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, p2

    move-wide/from16 v2, v18

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    add-double/2addr v1, v11

    .line 186
    new-instance v18, Landroid/graphics/LinearGradient;

    double-to-float v3, v7

    double-to-float v4, v14

    double-to-float v5, v9

    double-to-float v1, v1

    sget-object v25, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move/from16 v22, v1

    move/from16 v19, v3

    move/from16 v20, v4

    move/from16 v21, v5

    invoke-direct/range {v18 .. v25}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v1, v18

    .line 196
    iget-object v2, v0, Lcom/horcrux/svg/Brush;->mMatrix:Landroid/graphics/Matrix;

    if-eqz v2, :cond_7

    .line 197
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 198
    iget-object v3, v0, Lcom/horcrux/svg/Brush;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 199
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 202
    :cond_7
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :cond_8
    move/from16 v2, v16

    move-object/from16 v7, v23

    move-object/from16 v9, v24

    .line 203
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mType:Lcom/horcrux/svg/Brush$BrushType;

    sget-object v3, Lcom/horcrux/svg/Brush$BrushType;->RADIAL_GRADIENT:Lcom/horcrux/svg/Brush$BrushType;

    if-ne v1, v3, :cond_c

    .line 204
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    const/16 v17, 0x2

    aget-object v1, v1, v17

    float-to-double v3, v8

    move v8, v2

    move-wide v2, v3

    move/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v12

    move-wide/from16 v18, v2

    .line 205
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, p2

    float-to-double v2, v8

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v20

    move-wide/from16 v22, v2

    const-wide/16 v1, 0x0

    cmpg-double v3, v12, v1

    if-lez v3, :cond_a

    cmpg-double v1, v20, v1

    if-gtz v1, :cond_9

    goto :goto_2

    :cond_9
    move-object/from16 v28, v7

    move-object/from16 v29, v9

    move-wide/from16 v2, v20

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v1, 0x2

    .line 211
    new-array v2, v1, [F

    aget v3, v9, v15

    aput v3, v2, v15

    array-length v3, v9

    sub-int/2addr v3, v14

    aget v3, v9, v3

    aput v3, v2, v14

    .line 212
    new-array v1, v1, [I

    array-length v3, v7

    sub-int/2addr v3, v14

    aget v3, v7, v3

    aput v3, v1, v15

    array-length v3, v7

    sub-int/2addr v3, v14

    aget v3, v7, v3

    aput v3, v1, v14

    move-object/from16 v28, v1

    move-object/from16 v29, v2

    move-wide/from16 v12, v18

    move-wide/from16 v2, v22

    :goto_3
    div-double v7, v2, v12

    .line 217
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    move/from16 v4, p3

    move-wide/from16 v2, v18

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    float-to-double v3, v10

    add-double v9, v1, v3

    .line 218
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->mPoints:[Lcom/horcrux/svg/SVGLength;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    div-double v2, v22, v7

    move/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->getVal(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    float-to-double v3, v11

    div-double/2addr v3, v7

    add-double/2addr v1, v3

    .line 224
    new-instance v24, Landroid/graphics/RadialGradient;

    double-to-float v3, v9

    double-to-float v1, v1

    double-to-float v2, v12

    sget-object v30, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move/from16 v26, v1

    move/from16 v27, v2

    move/from16 v25, v3

    invoke-direct/range {v24 .. v30}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v1, v24

    .line 228
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    double-to-float v4, v7

    .line 229
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 231
    iget-object v3, v0, Lcom/horcrux/svg/Brush;->mMatrix:Landroid/graphics/Matrix;

    if-eqz v3, :cond_b

    .line 232
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 235
    :cond_b
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 236
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_c
    :goto_4
    return-void
.end method
