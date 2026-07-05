.class public Lcom/horcrux/svg/CustomFilter;
.super Ljava/lang/Object;
.source "CustomFilter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static apply(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/horcrux/svg/CustomFilterFunction;)Landroid/graphics/Bitmap;
    .locals 17

    .line 11
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 12
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int v0, v3, v7

    .line 13
    new-array v1, v0, [I

    .line 14
    new-array v8, v0, [I

    .line 15
    new-array v9, v0, [I

    const/4 v0, 0x4

    .line 17
    new-array v10, v0, [F

    const/4 v11, 0x0

    const/4 v2, 0x0

    aput v2, v10, v11

    const/4 v12, 0x1

    aput v2, v10, v12

    const/4 v13, 0x2

    aput v2, v10, v13

    const/4 v14, 0x3

    aput v2, v10, v14

    .line 19
    new-array v15, v0, [F

    aput v2, v15, v11

    aput v2, v15, v12

    aput v2, v15, v13

    aput v2, v15, v14

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    move-object/from16 v0, p0

    .line 22
    :try_start_0
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v16, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    move-object/from16 v0, p1

    move-object v1, v8

    .line 23
    :try_start_1
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object/from16 v16, v1

    move-object v1, v8

    :catch_1
    :goto_0
    move v0, v11

    :goto_1
    if-ge v0, v7, :cond_1

    move v2, v11

    :goto_2
    if-ge v2, v3, :cond_0

    mul-int v4, v0, v3

    add-int/2addr v4, v2

    .line 29
    aget v5, v16, v4

    shr-int/lit8 v6, v5, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    const/high16 v8, 0x437f0000    # 255.0f

    div-float/2addr v6, v8

    .line 30
    aput v6, v10, v11

    shr-int/lit8 v6, v5, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v8

    .line 31
    aput v6, v10, v12

    shr-int/lit8 v6, v5, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v8

    .line 32
    aput v6, v10, v13

    and-int/lit16 v5, v5, 0xff

    int-to-float v5, v5

    div-float/2addr v5, v8

    .line 33
    aput v5, v10, v14

    .line 35
    aget v5, v1, v4

    shr-int/lit8 v6, v5, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v8

    .line 36
    aput v6, v15, v11

    shr-int/lit8 v6, v5, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v8

    .line 37
    aput v6, v15, v12

    shr-int/lit8 v6, v5, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v8

    .line 38
    aput v6, v15, v13

    and-int/lit16 v5, v5, 0xff

    int-to-float v5, v5

    div-float/2addr v5, v8

    .line 39
    aput v5, v15, v14

    move-object/from16 v5, p2

    .line 41
    invoke-interface {v5, v10, v15}, Lcom/horcrux/svg/CustomFilterFunction;->execute([F[F)[F

    move-result-object v6

    invoke-static {v6}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloats([F)I

    move-result v6

    aput v6, v9, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_0
    move-object/from16 v5, p2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 45
    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v9, v3, v7, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static normalizeFromFloat(F)I
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p0, v0

    .line 49
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/16 v0, 0xff

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static normalizeFromFloats([F)I
    .locals 4

    .line 53
    array-length v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    aget v0, p0, v2

    invoke-static {v0}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    aget v0, p0, v2

    invoke-static {v0}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    const/4 v1, 0x1

    aget v1, p0, v1

    aget v3, p0, v2

    div-float/2addr v1, v3

    .line 57
    invoke-static {v1}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, p0, v1

    aget v3, p0, v2

    div-float/2addr v1, v3

    .line 58
    invoke-static {v1}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x3

    aget v1, p0, v1

    aget p0, p0, v2

    div-float/2addr v1, p0

    .line 59
    invoke-static {v1}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    move-result p0

    or-int/2addr p0, v0

    return p0

    :cond_1
    :goto_0
    return v2
.end method
