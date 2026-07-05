.class public final Lcom/canhub/cropper/CropWindowHandler;
.super Ljava/lang/Object;
.source "CropWindowHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropWindowHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0008J\u0006\u0010\u0014\u001a\u00020\u0008J\u0006\u0010\u0015\u001a\u00020\u0008J\u0006\u0010\u0016\u001a\u00020\u0008J\u0006\u0010\u0017\u001a\u00020\u0008J\u0006\u0010\u0018\u001a\u00020\u0008J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cJ&\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\u00082\u0006\u0010$\u001a\u00020\u00082\u0006\u0010%\u001a\u00020\u0008J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020,J0\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u00082\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020,J*\u00105\u001a\u0004\u0018\u0001062\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u00082\u0006\u00104\u001a\u00020,H\u0002J\"\u00107\u001a\u0004\u0018\u0001062\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u00104\u001a\u00020,H\u0002J*\u00108\u001a\u0004\u0018\u0001062\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u00082\u0006\u00104\u001a\u00020,H\u0002J*\u00109\u001a\u0004\u0018\u0001062\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u00082\u0006\u00104\u001a\u00020,H\u0002J0\u0010:\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u0010;\u001a\u00020\u00082\u0006\u0010<\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u0008H\u0002J(\u0010=\u001a\u00020\u00082\u0006\u0010>\u001a\u00020\u00082\u0006\u0010?\u001a\u00020\u00082\u0006\u0010@\u001a\u00020\u00082\u0006\u0010A\u001a\u00020\u0008H\u0002J8\u0010B\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u0010C\u001a\u00020\u00082\u0006\u0010D\u001a\u00020\u00082\u0006\u0010<\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u0008H\u0002J8\u0010E\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u0010;\u001a\u00020\u00082\u0006\u0010F\u001a\u00020\u00082\u0006\u0010G\u001a\u00020\u00082\u0006\u00101\u001a\u00020\u0008H\u0002J8\u0010H\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00082\u0006\u0010I\u001a\u00020\u00082\u0006\u0010J\u001a\u00020\u00082\u0006\u0010K\u001a\u00020\u00082\u0006\u0010L\u001a\u00020\u0008H\u0002J\u0008\u0010M\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"
    }
    d2 = {
        "Lcom/canhub/cropper/CropWindowHandler;",
        "",
        "<init>",
        "()V",
        "mEdges",
        "Landroid/graphics/RectF;",
        "mGetEdges",
        "mMinCropWindowWidth",
        "",
        "mMinCropWindowHeight",
        "mMaxCropWindowWidth",
        "mMaxCropWindowHeight",
        "mMinCropResultWidth",
        "mMinCropResultHeight",
        "mMaxCropResultWidth",
        "mMaxCropResultHeight",
        "mScaleFactorWidth",
        "mScaleFactorHeight",
        "getRect",
        "getMinCropWidth",
        "getMinCropHeight",
        "getMaxCropWidth",
        "getMaxCropHeight",
        "getScaleFactorWidth",
        "getScaleFactorHeight",
        "setMinCropResultSize",
        "",
        "minCropResultWidth",
        "",
        "minCropResultHeight",
        "setMaxCropResultSize",
        "maxCropResultWidth",
        "maxCropResultHeight",
        "setCropWindowLimits",
        "maxWidth",
        "maxHeight",
        "scaleFactorWidth",
        "scaleFactorHeight",
        "setInitialAttributeValues",
        "options",
        "Lcom/canhub/cropper/CropImageOptions;",
        "setRect",
        "rect",
        "showGuidelines",
        "",
        "getMoveHandler",
        "Lcom/canhub/cropper/CropWindowMoveHandler;",
        "x",
        "y",
        "targetRadius",
        "cropShape",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "isCenterMoveEnabled",
        "getRectanglePressedMoveType",
        "Lcom/canhub/cropper/CropWindowMoveHandler$Type;",
        "getOvalPressedMoveType",
        "getRectangleVerticalOnlyPressedMoveType",
        "getRectangleHorizontalOnlyPressedMoveType",
        "isInCornerTargetZone",
        "handleX",
        "handleY",
        "distance",
        "x1",
        "y1",
        "x2",
        "y2",
        "isInHorizontalTargetZone",
        "handleXStart",
        "handleXEnd",
        "isInVerticalTargetZone",
        "handleYStart",
        "handleYEnd",
        "isInCenterTargetZone",
        "left",
        "top",
        "right",
        "bottom",
        "focusCenter",
        "cropper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mEdges:Landroid/graphics/RectF;

.field private final mGetEdges:Landroid/graphics/RectF;

.field private mMaxCropResultHeight:F

.field private mMaxCropResultWidth:F

.field private mMaxCropWindowHeight:F

.field private mMaxCropWindowWidth:F

.field private mMinCropResultHeight:F

.field private mMinCropResultWidth:F

.field private mMinCropWindowHeight:F

.field private mMinCropWindowWidth:F

.field private mScaleFactorHeight:F

.field private mScaleFactorWidth:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    .line 20
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mGetEdges:Landroid/graphics/RectF;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 59
    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorWidth:F

    .line 62
    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorHeight:F

    return-void
.end method

.method private final distance(FFFF)F
    .locals 0

    sub-float/2addr p1, p3

    .line 394
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sub-float/2addr p2, p4

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method

.method private final focusCenter()Z
    .locals 1

    .line 465
    invoke-virtual {p0}, Lcom/canhub/cropper/CropWindowHandler;->showGuidelines()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final getOvalPressedMoveType(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;
    .locals 6

    .line 259
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v1, 0x6

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 260
    iget-object v2, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v0

    .line 261
    iget-object v3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    const/4 v4, 0x5

    int-to-float v4, v4

    mul-float/2addr v0, v4

    add-float/2addr v3, v0

    .line 262
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v1

    .line 263
    iget-object v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v0

    .line 264
    iget-object v5, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->top:F

    mul-float/2addr v4, v0

    add-float/2addr v5, v4

    cmpg-float v0, p1, v2

    if-gez v0, :cond_2

    cmpg-float p1, p2, v1

    if-gez p1, :cond_0

    .line 268
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP_LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_0
    cmpg-float p1, p2, v5

    if-gez p1, :cond_1

    .line 269
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 270
    :cond_1
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM_LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_2
    cmpg-float p1, p1, v3

    if-gez p1, :cond_6

    cmpg-float p1, p2, v1

    if-gez p1, :cond_3

    .line 275
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_3
    cmpg-float p1, p2, v5

    if-gez p1, :cond_5

    if-eqz p3, :cond_4

    .line 277
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1

    .line 281
    :cond_5
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_6
    cmpg-float p1, p2, v1

    if-gez p1, :cond_7

    .line 286
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP_RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_7
    cmpg-float p1, p2, v5

    if-gez p1, :cond_8

    .line 287
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 288
    :cond_8
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM_RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1
.end method

.method private final getRectangleHorizontalOnlyPressedMoveType(FFFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;
    .locals 7

    .line 348
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/canhub/cropper/CropWindowHandler;->distance(FFFF)F

    move-result v0

    cmpg-float v0, v0, p3

    if-gtz v0, :cond_0

    .line 349
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 351
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/canhub/cropper/CropWindowHandler;->distance(FFFF)F

    move-result v0

    cmpg-float p3, v0, p3

    if-gtz p3, :cond_1

    .line 352
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_1
    if-eqz p4, :cond_2

    .line 355
    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p3, Landroid/graphics/RectF;->left:F

    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p3, Landroid/graphics/RectF;->top:F

    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p3, Landroid/graphics/RectF;->right:F

    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v6, p3, Landroid/graphics/RectF;->bottom:F

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInCenterTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 356
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_2
    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 358
    :cond_3
    invoke-direct {p0, v1, v2, p4}, Lcom/canhub/cropper/CropWindowHandler;->getOvalPressedMoveType(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p1

    return-object p1
.end method

.method private final getRectanglePressedMoveType(FFFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;
    .locals 7

    .line 195
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, v0, Landroid/graphics/RectF;->top:F

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInCornerTargetZone(FFFFF)Z

    move-result p1

    move-object v0, v1

    move v1, v2

    move v2, v3

    if-eqz p1, :cond_0

    .line 196
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP_LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 198
    :cond_0
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->top:F

    move v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/canhub/cropper/CropWindowHandler;->isInCornerTargetZone(FFFFF)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 199
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP_RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 201
    :cond_1
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->bottom:F

    move v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/canhub/cropper/CropWindowHandler;->isInCornerTargetZone(FFFFF)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 202
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM_LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 204
    :cond_2
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->bottom:F

    move v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/canhub/cropper/CropWindowHandler;->isInCornerTargetZone(FFFFF)Z

    move-result p1

    move p2, v5

    if-eqz p1, :cond_3

    .line 205
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM_RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_3
    if-eqz p4, :cond_4

    .line 208
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInCenterTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 209
    invoke-direct {p0}, Lcom/canhub/cropper/CropWindowHandler;->focusCenter()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 210
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 212
    :cond_4
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p1, Landroid/graphics/RectF;->top:F

    move v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInHorizontalTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 213
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 215
    :cond_5
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInHorizontalTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 216
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 218
    :cond_6
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInVerticalTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 219
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 221
    :cond_7
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInVerticalTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 222
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_8
    if-eqz p4, :cond_9

    .line 225
    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p1, Landroid/graphics/RectF;->right:F

    iget-object p1, v0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInCenterTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 226
    invoke-direct {p0}, Lcom/canhub/cropper/CropWindowHandler;->focusCenter()Z

    move-result p1

    if-nez p1, :cond_9

    .line 227
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 229
    :cond_9
    invoke-direct {p0, v1, v2, p4}, Lcom/canhub/cropper/CropWindowHandler;->getOvalPressedMoveType(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p1

    return-object p1
.end method

.method private final getRectangleVerticalOnlyPressedMoveType(FFFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;
    .locals 7

    .line 314
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/canhub/cropper/CropWindowHandler;->distance(FFFF)F

    move-result v0

    cmpg-float v0, v0, p3

    if-gtz v0, :cond_0

    .line 315
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/canhub/cropper/CropWindowHandler;->distance(FFFF)F

    move-result v0

    cmpg-float p3, v0, p3

    if-gtz p3, :cond_1

    .line 318
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_1
    if-eqz p4, :cond_2

    .line 321
    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v3, p3, Landroid/graphics/RectF;->left:F

    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v4, p3, Landroid/graphics/RectF;->top:F

    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v5, p3, Landroid/graphics/RectF;->right:F

    iget-object p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    iget v6, p3, Landroid/graphics/RectF;->bottom:F

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/CropWindowHandler;->isInCenterTargetZone(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 322
    sget-object p1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    return-object p1

    :cond_2
    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 324
    :cond_3
    invoke-direct {p0, v1, v2, p4}, Lcom/canhub/cropper/CropWindowHandler;->getOvalPressedMoveType(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p1

    return-object p1
.end method

.method private final isInCenterTargetZone(FFFFFF)Z
    .locals 0

    cmpl-float p3, p1, p3

    if-lez p3, :cond_0

    cmpg-float p1, p1, p5

    if-gez p1, :cond_0

    cmpl-float p1, p2, p4

    if-lez p1, :cond_0

    cmpg-float p1, p2, p6

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isInCornerTargetZone(FFFFF)Z
    .locals 0

    .line 378
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/canhub/cropper/CropWindowHandler;->distance(FFFF)F

    move-result p1

    cmpg-float p1, p1, p5

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isInHorizontalTargetZone(FFFFFF)Z
    .locals 0

    cmpl-float p3, p1, p3

    if-lez p3, :cond_0

    cmpg-float p1, p1, p4

    if-gez p1, :cond_0

    sub-float/2addr p2, p5

    .line 414
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, p6

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isInVerticalTargetZone(FFFFFF)Z
    .locals 0

    sub-float/2addr p1, p3

    .line 434
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, p6

    if-gtz p1, :cond_0

    cmpl-float p1, p2, p4

    if-lez p1, :cond_0

    cmpg-float p1, p2, p5

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final getMaxCropHeight()F
    .locals 3

    .line 84
    iget v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropWindowHeight:F

    iget v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropResultHeight:F

    iget v2, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorHeight:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v0

    return v0
.end method

.method public final getMaxCropWidth()F
    .locals 3

    .line 80
    iget v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropWindowWidth:F

    iget v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropResultWidth:F

    iget v2, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorWidth:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v0

    return v0
.end method

.method public final getMinCropHeight()F
    .locals 3

    .line 76
    iget v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropWindowHeight:F

    iget v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropResultHeight:F

    iget v2, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorHeight:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v0

    return v0
.end method

.method public final getMinCropWidth()F
    .locals 3

    .line 72
    iget v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropWindowWidth:F

    iget v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropResultWidth:F

    iget v2, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorWidth:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v0

    return v0
.end method

.method public final getMoveHandler(FFFLcom/canhub/cropper/CropImageView$CropShape;Z)Lcom/canhub/cropper/CropWindowMoveHandler;
    .locals 1

    const-string v0, "cropShape"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    sget-object v0, Lcom/canhub/cropper/CropWindowHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p4}, Lcom/canhub/cropper/CropImageView$CropShape;->ordinal()I

    move-result p4

    aget p4, v0, p4

    const/4 v0, 0x1

    if-eq p4, v0, :cond_3

    const/4 v0, 0x2

    if-eq p4, v0, :cond_2

    const/4 v0, 0x3

    if-eq p4, v0, :cond_1

    const/4 v0, 0x4

    if-ne p4, v0, :cond_0

    .line 171
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/canhub/cropper/CropWindowHandler;->getRectangleHorizontalOnlyPressedMoveType(FFFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p3

    goto :goto_0

    .line 167
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 170
    :cond_1
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/canhub/cropper/CropWindowHandler;->getRectangleVerticalOnlyPressedMoveType(FFFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p3

    goto :goto_0

    .line 169
    :cond_2
    invoke-direct {p0, p1, p2, p5}, Lcom/canhub/cropper/CropWindowHandler;->getOvalPressedMoveType(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p3

    goto :goto_0

    .line 168
    :cond_3
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/canhub/cropper/CropWindowHandler;->getRectanglePressedMoveType(FFFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    move-result-object p3

    :goto_0
    if-eqz p3, :cond_4

    .line 174
    new-instance p4, Lcom/canhub/cropper/CropWindowMoveHandler;

    invoke-direct {p4, p3, p0, p1, p2}, Lcom/canhub/cropper/CropWindowMoveHandler;-><init>(Lcom/canhub/cropper/CropWindowMoveHandler$Type;Lcom/canhub/cropper/CropWindowHandler;FF)V

    return-object p4

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getRect()Landroid/graphics/RectF;
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mGetEdges:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 67
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mGetEdges:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final getScaleFactorHeight()F
    .locals 1

    .line 90
    iget v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorHeight:F

    return v0
.end method

.method public final getScaleFactorWidth()F
    .locals 1

    .line 87
    iget v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorWidth:F

    return v0
.end method

.method public final setCropWindowLimits(FFFF)V
    .locals 0

    .line 120
    iput p1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropWindowWidth:F

    .line 121
    iput p2, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropWindowHeight:F

    .line 122
    iput p3, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorWidth:F

    .line 123
    iput p4, p0, Lcom/canhub/cropper/CropWindowHandler;->mScaleFactorHeight:F

    return-void
.end method

.method public final setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->minCropWindowWidth:I

    int-to-float v0, v0

    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropWindowWidth:F

    .line 129
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->minCropWindowHeight:I

    int-to-float v0, v0

    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropWindowHeight:F

    .line 130
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->minCropResultWidth:I

    int-to-float v0, v0

    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropResultWidth:F

    .line 131
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->minCropResultHeight:I

    int-to-float v0, v0

    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropResultHeight:F

    .line 132
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->maxCropResultWidth:I

    int-to-float v0, v0

    iput v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropResultWidth:F

    .line 133
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->maxCropResultHeight:I

    int-to-float p1, p1

    iput p1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropResultHeight:F

    return-void
.end method

.method public final setMaxCropResultSize(II)V
    .locals 0

    int-to-float p1, p1

    .line 106
    iput p1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropResultWidth:F

    int-to-float p1, p2

    .line 107
    iput p1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMaxCropResultHeight:F

    return-void
.end method

.method public final setMinCropResultSize(II)V
    .locals 0

    int-to-float p1, p1

    .line 97
    iput p1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropResultWidth:F

    int-to-float p1, p2

    .line 98
    iput p1, p0, Lcom/canhub/cropper/CropWindowHandler;->mMinCropResultHeight:F

    return-void
.end method

.method public final setRect(Landroid/graphics/RectF;)V
    .locals 1

    const-string/jumbo v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    return-void
.end method

.method public final showGuidelines()Z
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/canhub/cropper/CropWindowHandler;->mEdges:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
