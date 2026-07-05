.class public final Lcom/canhub/cropper/CropImageAnimation;
.super Landroid/view/animation/Animation;
.source "CropImageAnimation.kt"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0001H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0001H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageAnimation;",
        "Landroid/view/animation/Animation;",
        "Landroid/view/animation/Animation$AnimationListener;",
        "imageView",
        "Landroid/widget/ImageView;",
        "cropOverlayView",
        "Lcom/canhub/cropper/CropOverlayView;",
        "<init>",
        "(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V",
        "startBoundPoints",
        "",
        "endBoundPoints",
        "startCropWindowRect",
        "Landroid/graphics/RectF;",
        "endCropWindowRect",
        "startImageMatrix",
        "endImageMatrix",
        "setStartState",
        "",
        "boundPoints",
        "imageMatrix",
        "Landroid/graphics/Matrix;",
        "setEndState",
        "applyTransformation",
        "interpolatedTime",
        "",
        "t",
        "Landroid/view/animation/Transformation;",
        "onAnimationStart",
        "animation",
        "onAnimationEnd",
        "onAnimationRepeat",
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
.field private final cropOverlayView:Lcom/canhub/cropper/CropOverlayView;

.field private final endBoundPoints:[F

.field private final endCropWindowRect:Landroid/graphics/RectF;

.field private final endImageMatrix:[F

.field private final imageView:Landroid/widget/ImageView;

.field private final startBoundPoints:[F

.field private final startCropWindowRect:Landroid/graphics/RectF;

.field private final startImageMatrix:[F


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V
    .locals 1

    const-string v0, "imageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cropOverlayView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->imageView:Landroid/widget/ImageView;

    .line 17
    iput-object p2, p0, Lcom/canhub/cropper/CropImageAnimation;->cropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    const/16 p1, 0x8

    .line 21
    new-array p2, p1, [F

    iput-object p2, p0, Lcom/canhub/cropper/CropImageAnimation;->startBoundPoints:[F

    .line 22
    new-array p1, p1, [F

    iput-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->endBoundPoints:[F

    .line 23
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    .line 24
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->endCropWindowRect:Landroid/graphics/RectF;

    const/16 p1, 0x9

    .line 25
    new-array p2, p1, [F

    iput-object p2, p0, Lcom/canhub/cropper/CropImageAnimation;->startImageMatrix:[F

    .line 26
    new-array p1, p1, [F

    iput-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->endImageMatrix:[F

    const-wide/16 p1, 0x12c

    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/CropImageAnimation;->setDuration(J)V

    const/4 p1, 0x1

    .line 30
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageAnimation;->setFillAfter(Z)V

    .line 31
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    check-cast p1, Landroid/view/animation/Interpolator;

    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 32
    move-object p1, p0

    check-cast p1, Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 6

    const-string/jumbo v0, "t"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 50
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/canhub/cropper/CropImageAnimation;->endCropWindowRect:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->left:F

    .line 51
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/canhub/cropper/CropImageAnimation;->endCropWindowRect:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    iget-object v2, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->top:F

    .line 52
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/canhub/cropper/CropImageAnimation;->endCropWindowRect:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    iget-object v2, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->right:F

    .line 53
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/canhub/cropper/CropImageAnimation;->endCropWindowRect:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v2, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->bottom:F

    const/16 v0, 0x8

    .line 56
    new-array v1, v0, [F

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    .line 58
    iget-object v4, p0, Lcom/canhub/cropper/CropImageAnimation;->startBoundPoints:[F

    aget v4, v4, v3

    iget-object v5, p0, Lcom/canhub/cropper/CropImageAnimation;->endBoundPoints:[F

    aget v5, v5, v3

    sub-float/2addr v5, v4

    mul-float/2addr v5, p1

    add-float/2addr v4, v5

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->cropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    .line 62
    invoke-virtual {v0, p2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 63
    iget-object p2, p0, Lcom/canhub/cropper/CropImageAnimation;->imageView:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getWidth()I

    move-result p2

    iget-object v3, p0, Lcom/canhub/cropper/CropImageAnimation;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, p2, v3}, Lcom/canhub/cropper/CropOverlayView;->setBounds([FII)V

    .line 64
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->invalidate()V

    const/16 p2, 0x9

    .line 67
    new-array v0, p2, [F

    :goto_1
    if-ge v2, p2, :cond_1

    .line 69
    iget-object v1, p0, Lcom/canhub/cropper/CropImageAnimation;->startImageMatrix:[F

    aget v1, v1, v2

    iget-object v3, p0, Lcom/canhub/cropper/CropImageAnimation;->endImageMatrix:[F

    aget v3, v3, v2

    sub-float/2addr v3, v1

    mul-float/2addr v3, p1

    add-float/2addr v1, v3

    aput v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 72
    :cond_1
    iget-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->imageView:Landroid/widget/ImageView;

    .line 73
    invoke-virtual {p1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 74
    invoke-virtual {p1}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->imageView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setEndState([FLandroid/graphics/Matrix;)V
    .locals 3

    const-string v0, "boundPoints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageMatrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->endBoundPoints:[F

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    iget-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->endCropWindowRect:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->cropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 45
    iget-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->endImageMatrix:[F

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    return-void
.end method

.method public final setStartState([FLandroid/graphics/Matrix;)V
    .locals 3

    const-string v0, "boundPoints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageMatrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageAnimation;->reset()V

    .line 37
    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->startBoundPoints:[F

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    iget-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->startCropWindowRect:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/canhub/cropper/CropImageAnimation;->cropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 39
    iget-object p1, p0, Lcom/canhub/cropper/CropImageAnimation;->startImageMatrix:[F

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    return-void
.end method
