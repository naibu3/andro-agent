.class Lcom/horcrux/svg/FeCompositeView;
.super Lcom/horcrux/svg/FilterPrimitiveView;
.source "FeCompositeView.java"


# instance fields
.field mIn1:Ljava/lang/String;

.field mIn2:Ljava/lang/String;

.field mK1:F

.field mK2:F

.field mK3:F

.field mK4:F

.field mOperator:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/horcrux/svg/FilterPrimitiveView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public applyFilter(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 63
    iget-object v3, v0, Lcom/horcrux/svg/FeCompositeView;->mIn1:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/horcrux/svg/FeCompositeView;->getSource(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 64
    iget-object v4, v0, Lcom/horcrux/svg/FeCompositeView;->mIn2:Ljava/lang/String;

    invoke-static {v1, v2, v4}, Lcom/horcrux/svg/FeCompositeView;->getSource(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 65
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 66
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 67
    new-instance v2, Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v4, 0x0

    .line 68
    invoke-virtual {v1, v3, v4, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 70
    sget-object v3, Lcom/horcrux/svg/FeCompositeView$1;->$SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator:[I

    iget-object v7, v0, Lcom/horcrux/svg/FeCompositeView;->mOperator:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    invoke-virtual {v7}, Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;->ordinal()I

    move-result v7

    aget v3, v3, v7

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 88
    :pswitch_0
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int/2addr v3, v7

    .line 89
    new-array v7, v3, [I

    .line 90
    new-array v14, v3, [I

    .line 92
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 91
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move-object v13, v6

    move-object v15, v7

    .line 93
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v6, v14

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_0

    .line 96
    aget v9, v15, v8

    .line 97
    aget v10, v6, v8

    shr-int/lit8 v11, v9, 0x10

    const/16 v12, 0xff

    and-int/2addr v11, v12

    shr-int/lit8 v14, v9, 0x8

    and-int/2addr v14, v12

    and-int/lit16 v4, v9, 0xff

    ushr-int/lit8 v9, v9, 0x18

    shr-int/lit8 v7, v10, 0x10

    and-int/2addr v7, v12

    move/from16 v16, v3

    shr-int/lit8 v3, v10, 0x8

    and-int/2addr v3, v12

    and-int/lit16 v12, v10, 0xff

    ushr-int/lit8 v10, v10, 0x18

    move-object/from16 v17, v6

    .line 108
    iget v6, v0, Lcom/horcrux/svg/FeCompositeView;->mK1:F

    int-to-float v11, v11

    mul-float v18, v6, v11

    int-to-float v7, v7

    mul-float v18, v18, v7

    move/from16 v19, v6

    iget v6, v0, Lcom/horcrux/svg/FeCompositeView;->mK2:F

    mul-float/2addr v11, v6

    add-float v18, v18, v11

    iget v11, v0, Lcom/horcrux/svg/FeCompositeView;->mK3:F

    mul-float/2addr v7, v11

    add-float v18, v18, v7

    iget v7, v0, Lcom/horcrux/svg/FeCompositeView;->mK4:F

    move/from16 v20, v6

    add-float v6, v18, v7

    float-to-int v6, v6

    int-to-float v14, v14

    mul-float v18, v19, v14

    int-to-float v3, v3

    mul-float v18, v18, v3

    mul-float v14, v14, v20

    add-float v18, v18, v14

    mul-float/2addr v3, v11

    add-float v18, v18, v3

    add-float v3, v18, v7

    float-to-int v3, v3

    int-to-float v4, v4

    mul-float v14, v19, v4

    int-to-float v12, v12

    mul-float/2addr v14, v12

    mul-float v4, v4, v20

    add-float/2addr v14, v4

    mul-float/2addr v12, v11

    add-float/2addr v14, v12

    add-float/2addr v14, v7

    float-to-int v4, v14

    int-to-float v9, v9

    mul-float v12, v19, v9

    int-to-float v10, v10

    mul-float/2addr v12, v10

    mul-float v9, v9, v20

    add-float/2addr v12, v9

    mul-float/2addr v11, v10

    add-float/2addr v12, v11

    add-float/2addr v12, v7

    float-to-int v7, v12

    const/4 v9, 0x0

    .line 113
    invoke-static {v9, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/16 v10, 0xff

    invoke-static {v10, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 114
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 115
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 116
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    shl-int/lit8 v7, v7, 0x18

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v6, v7

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v3, v6

    or-int/2addr v3, v4

    .line 119
    aput v3, v15, v8

    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v16

    move-object/from16 v6, v17

    const/4 v4, 0x0

    goto/16 :goto_0

    .line 123
    :cond_0
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    move-object v6, v13

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v15

    .line 122
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    goto :goto_1

    .line 84
    :pswitch_1
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_1

    .line 81
    :pswitch_2
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_1

    .line 78
    :pswitch_3
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_1

    .line 75
    :pswitch_4
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_1

    .line 72
    :pswitch_5
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 127
    :goto_1
    iget-object v3, v0, Lcom/horcrux/svg/FeCompositeView;->mOperator:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    sget-object v4, Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;->ARITHMETIC:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    if-eq v3, v4, :cond_1

    const/4 v3, 0x0

    .line 128
    invoke-virtual {v1, v5, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    return-object v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setIn1(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/horcrux/svg/FeCompositeView;->mIn1:Ljava/lang/String;

    .line 28
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method

.method public setIn2(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/horcrux/svg/FeCompositeView;->mIn2:Ljava/lang/String;

    .line 33
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method

.method public setK1(Ljava/lang/Float;)V
    .locals 0

    .line 37
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->mK1:F

    .line 38
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method

.method public setK2(Ljava/lang/Float;)V
    .locals 0

    .line 42
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->mK2:F

    .line 43
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method

.method public setK3(Ljava/lang/Float;)V
    .locals 0

    .line 47
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->mK3:F

    .line 48
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method

.method public setK4(Ljava/lang/Float;)V
    .locals 0

    .line 52
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/horcrux/svg/FeCompositeView;->mK4:F

    .line 53
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method

.method public setOperator(Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-static {p1}, Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;->getEnum(Ljava/lang/String;)Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FeCompositeView;->mOperator:Lcom/horcrux/svg/FilterProperties$FeCompositeOperator;

    .line 58
    invoke-virtual {p0}, Lcom/horcrux/svg/FeCompositeView;->invalidate()V

    return-void
.end method
