.class public Landroidx/camera/core/impl/AdapterCameraInfo;
.super Landroidx/camera/core/impl/ForwardingCameraInfo;
.source "AdapterCameraInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/AdapterCameraInfo$CameraOperation;
    }
.end annotation


# static fields
.field public static final CAMERA_OPERATION_AE_REGION:I = 0x3

.field public static final CAMERA_OPERATION_AF_REGION:I = 0x2

.field public static final CAMERA_OPERATION_AUTO_FOCUS:I = 0x1

.field public static final CAMERA_OPERATION_AWB_REGION:I = 0x4

.field public static final CAMERA_OPERATION_EXPOSURE_COMPENSATION:I = 0x7

.field public static final CAMERA_OPERATION_EXTENSION_STRENGTH:I = 0x8

.field public static final CAMERA_OPERATION_FLASH:I = 0x5

.field public static final CAMERA_OPERATION_TORCH:I = 0x6

.field public static final CAMERA_OPERATION_ZOOM:I


# instance fields
.field private final mCameraConfig:Landroidx/camera/core/impl/CameraConfig;

.field private final mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

.field private mExtensionZoomStateLiveData:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/camera/core/ZoomState;",
            ">;"
        }
    .end annotation
.end field

.field private mIsCaptureProcessProgressSupported:Z

.field private mIsPostviewSupported:Z

.field private final mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/impl/CameraConfig;)V
    .locals 1

    .line 80
    invoke-direct {p0, p1}, Landroidx/camera/core/impl/ForwardingCameraInfo;-><init>(Landroidx/camera/core/impl/CameraInfoInternal;)V

    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mIsPostviewSupported:Z

    .line 74
    iput-boolean v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mIsCaptureProcessProgressSupported:Z

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mExtensionZoomStateLiveData:Landroidx/lifecycle/LiveData;

    .line 81
    iput-object p1, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    .line 82
    iput-object p2, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraConfig:Landroidx/camera/core/impl/CameraConfig;

    .line 83
    invoke-interface {p2, v0}, Landroidx/camera/core/impl/CameraConfig;->getSessionProcessor(Landroidx/camera/core/impl/SessionProcessor;)Landroidx/camera/core/impl/SessionProcessor;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 85
    invoke-interface {p2}, Landroidx/camera/core/impl/CameraConfig;->isPostviewSupported()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/AdapterCameraInfo;->setPostviewSupported(Z)V

    .line 86
    invoke-interface {p2}, Landroidx/camera/core/impl/CameraConfig;->isCaptureProcessProgressSupported()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/AdapterCameraInfo;->setCaptureProcessProgressSupported(Z)V

    return-void
.end method

.method public static getPercentageByRatio(FFF)F
    .locals 3

    cmpl-float v0, p2, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    cmpl-float v0, p0, p2

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v0, :cond_1

    return v2

    :cond_1
    cmpl-float v0, p0, p1

    if-nez v0, :cond_2

    return v1

    :cond_2
    div-float p0, v2, p0

    div-float p2, v2, p2

    div-float/2addr v2, p1

    sub-float/2addr p0, v2

    sub-float/2addr p2, v2

    div-float/2addr p0, p2

    return p0
.end method

.method public static getZoomRatioByPercentage(FFF)F
    .locals 11

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p0, v0

    if-nez v1, :cond_0

    return p2

    :cond_0
    const/4 v1, 0x0

    cmpl-float v1, p0, v1

    if-nez v1, :cond_1

    return p1

    :cond_1
    div-float v1, v0, p2

    float-to-double v1, v1

    div-float/2addr v0, p1

    float-to-double v3, v0

    sub-double/2addr v1, v3

    float-to-double v5, p0

    mul-double/2addr v1, v5

    add-double/2addr v3, v1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    div-double v5, v0, v3

    float-to-double v7, p1

    float-to-double v9, p2

    .line 145
    invoke-static/range {v5 .. v10}, Landroidx/core/math/MathUtils;->clamp(DDD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method static synthetic lambda$getZoomState$0(Landroid/util/Range;Landroidx/camera/core/ZoomState;)Landroidx/camera/core/ZoomState;
    .locals 4

    .line 191
    invoke-interface {p1}, Landroidx/camera/core/ZoomState;->getZoomRatio()F

    move-result v0

    .line 192
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 193
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 194
    invoke-interface {p1}, Landroidx/camera/core/ZoomState;->getZoomRatio()F

    move-result p1

    .line 195
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 196
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    .line 194
    invoke-static {p1, v3, p0}, Landroidx/camera/core/impl/AdapterCameraInfo;->getPercentageByRatio(FFF)F

    move-result p0

    .line 190
    invoke-static {v0, v1, v2, p0}, Landroidx/camera/core/internal/ImmutableZoomState;->create(FFFF)Landroidx/camera/core/ZoomState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getCameraConfig()Landroidx/camera/core/impl/CameraConfig;
    .locals 1

    .line 90
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraConfig:Landroidx/camera/core/impl/CameraConfig;

    return-object v0
.end method

.method public getExposureState()Landroidx/camera/core/ExposureState;
    .locals 2

    .line 208
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    const/4 v1, 0x7

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/SessionProcessorUtil;->isOperationSupported(Landroidx/camera/core/impl/SessionProcessor;[I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    new-instance v0, Landroidx/camera/core/impl/AdapterCameraInfo$1;

    invoke-direct {v0, p0}, Landroidx/camera/core/impl/AdapterCameraInfo$1;-><init>(Landroidx/camera/core/impl/AdapterCameraInfo;)V

    return-object v0

    .line 232
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInfoInternal;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v0

    return-object v0
.end method

.method public getImplementation()Landroidx/camera/core/impl/CameraInfoInternal;
    .locals 1

    .line 95
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    return-object v0
.end method

.method public getSessionProcessor()Landroidx/camera/core/impl/SessionProcessor;
    .locals 1

    .line 102
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    return-object v0
.end method

.method public getTorchState()Landroidx/lifecycle/LiveData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    const/4 v1, 0x6

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/SessionProcessorUtil;->isOperationSupported(Landroidx/camera/core/impl/SessionProcessor;[I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 120
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInfoInternal;->getTorchState()Landroidx/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method

.method public getZoomState()Landroidx/lifecycle/LiveData;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/camera/core/ZoomState;",
            ">;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    const/4 v1, 0x0

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/SessionProcessorUtil;->isOperationSupported(Landroidx/camera/core/impl/SessionProcessor;[I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v2, v2, v1}, Landroidx/camera/core/internal/ImmutableZoomState;->create(FFFF)Landroidx/camera/core/ZoomState;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 180
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    if-eqz v0, :cond_3

    .line 181
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInfoInternal;->getZoomState()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/ZoomState;

    .line 182
    iget-object v1, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    invoke-interface {v1}, Landroidx/camera/core/impl/SessionProcessor;->getExtensionZoomRange()Landroid/util/Range;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 184
    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-interface {v0}, Landroidx/camera/core/ZoomState;->getMinZoomRatio()F

    move-result v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    .line 185
    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-interface {v0}, Landroidx/camera/core/ZoomState;->getMaxZoomRatio()F

    move-result v0

    cmpl-float v0, v2, v0

    if-eqz v0, :cond_3

    .line 186
    :cond_1
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mExtensionZoomStateLiveData:Landroidx/lifecycle/LiveData;

    if-nez v0, :cond_2

    .line 188
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInfoInternal;->getZoomState()Landroidx/lifecycle/LiveData;

    move-result-object v0

    new-instance v2, Landroidx/camera/core/impl/AdapterCameraInfo$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Landroidx/camera/core/impl/AdapterCameraInfo$$ExternalSyntheticLambda0;-><init>(Landroid/util/Range;)V

    invoke-static {v0, v2}, Landroidx/camera/core/impl/utils/LiveDataUtil;->map(Landroidx/lifecycle/LiveData;Landroidx/arch/core/util/Function;)Landroidx/lifecycle/LiveData;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mExtensionZoomStateLiveData:Landroidx/lifecycle/LiveData;

    .line 200
    :cond_2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mExtensionZoomStateLiveData:Landroidx/lifecycle/LiveData;

    return-object v0

    .line 203
    :cond_3
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInfoInternal;->getZoomState()Landroidx/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method

.method public hasFlashUnit()Z
    .locals 2

    .line 107
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    const/4 v1, 0x5

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/SessionProcessorUtil;->isOperationSupported(Landroidx/camera/core/impl/SessionProcessor;[I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 111
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInfoInternal;->hasFlashUnit()Z

    move-result v0

    return v0
.end method

.method public isCaptureProcessProgressSupported()Z
    .locals 1

    .line 269
    iget-boolean v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mIsCaptureProcessProgressSupported:Z

    return v0
.end method

.method public isFocusMeteringSupported(Landroidx/camera/core/FocusMeteringAction;)Z
    .locals 1

    .line 237
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 238
    invoke-static {v0, p1}, Landroidx/camera/core/impl/utils/SessionProcessorUtil;->getModifiedFocusMeteringAction(Landroidx/camera/core/impl/SessionProcessor;Landroidx/camera/core/FocusMeteringAction;)Landroidx/camera/core/FocusMeteringAction;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 242
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraInfoInternal;->isFocusMeteringSupported(Landroidx/camera/core/FocusMeteringAction;)Z

    move-result p1

    return p1
.end method

.method public isPostviewSupported()Z
    .locals 1

    .line 264
    iget-boolean v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mIsPostviewSupported:Z

    return v0
.end method

.method public isPreviewStabilizationSupported()Z
    .locals 6

    .line 290
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    if-eqz v0, :cond_2

    .line 291
    invoke-interface {v0}, Landroidx/camera/core/impl/SessionProcessor;->getExtensionAvailableStabilizationModes()[I

    move-result-object v0

    if-eqz v0, :cond_2

    .line 293
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2

    .line 301
    :cond_2
    invoke-super {p0}, Landroidx/camera/core/impl/ForwardingCameraInfo;->isPreviewStabilizationSupported()Z

    move-result v0

    return v0
.end method

.method public isUseCaseCombinationSupported(Ljava/util/List;IZ)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/UseCase;",
            ">;IZ)Z"
        }
    .end annotation

    .line 307
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraInfo:Landroidx/camera/core/impl/CameraInfoInternal;

    iget-object v1, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mCameraConfig:Landroidx/camera/core/impl/CameraConfig;

    invoke-interface {v0, p1, p2, p3, v1}, Landroidx/camera/core/impl/CameraInfoInternal;->isUseCaseCombinationSupported(Ljava/util/List;IZLandroidx/camera/core/impl/CameraConfig;)Z

    move-result p1

    return p1
.end method

.method public isVideoStabilizationSupported()Z
    .locals 6

    .line 274
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    if-eqz v0, :cond_2

    .line 275
    invoke-interface {v0}, Landroidx/camera/core/impl/SessionProcessor;->getExtensionAvailableStabilizationModes()[I

    move-result-object v0

    if-eqz v0, :cond_2

    .line 277
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    return v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2

    .line 285
    :cond_2
    invoke-super {p0}, Landroidx/camera/core/impl/ForwardingCameraInfo;->isVideoStabilizationSupported()Z

    move-result v0

    return v0
.end method

.method public setCaptureProcessProgressSupported(Z)V
    .locals 0

    .line 256
    iput-boolean p1, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mIsCaptureProcessProgressSupported:Z

    return-void
.end method

.method public setPostviewSupported(Z)V
    .locals 0

    .line 249
    iput-boolean p1, p0, Landroidx/camera/core/impl/AdapterCameraInfo;->mIsPostviewSupported:Z

    return-void
.end method
