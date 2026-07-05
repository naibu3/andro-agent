.class final Landroidx/camera/camera2/internal/LowLightBoostControl;
.super Ljava/lang/Object;
.source "LowLightBoostControl.java"


# static fields
.field static final DEFAULT_LLB_STATE:I = -0x1

.field private static final TAG:Ljava/lang/String; = "LowLightBoostControl"


# instance fields
.field private final mCamera2CameraControlImpl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

.field final mCaptureResultListener:Landroidx/camera/camera2/internal/Camera2CameraControlImpl$CaptureResultListener;

.field mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final mExecutor:Ljava/util/concurrent/Executor;

.field private mIsActive:Z

.field private final mIsLowLightBoostSupported:Z

.field private final mLock:Ljava/lang/Object;

.field private mLowLightBoostDisabledByUseCaseSessionConfig:Z

.field private final mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mLowLightBoostStateAtomic:Ljava/util/concurrent/atomic/AtomicInteger;

.field mTargetLlbEnabled:Z


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/Camera2CameraControlImpl;Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostStateAtomic:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 67
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostDisabledByUseCaseSessionConfig:Z

    .line 92
    iput-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mCamera2CameraControlImpl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 93
    iput-object p3, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mExecutor:Ljava/util/concurrent/Executor;

    .line 95
    invoke-static {p2}, Landroidx/camera/camera2/internal/LowLightBoostControl;->checkLowLightBoostAvailability(Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mIsLowLightBoostSupported:Z

    .line 96
    new-instance p3, Landroidx/lifecycle/MutableLiveData;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    .line 98
    new-instance p3, Landroidx/camera/camera2/internal/LowLightBoostControl$$ExternalSyntheticLambda0;

    invoke-direct {p3, p0}, Landroidx/camera/camera2/internal/LowLightBoostControl$$ExternalSyntheticLambda0;-><init>(Landroidx/camera/camera2/internal/LowLightBoostControl;)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mCaptureResultListener:Landroidx/camera/camera2/internal/Camera2CameraControlImpl$CaptureResultListener;

    if-eqz p2, :cond_0

    .line 136
    invoke-virtual {p1, p3}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->addCaptureResultListener(Landroidx/camera/camera2/internal/Camera2CameraControlImpl$CaptureResultListener;)V

    :cond_0
    return-void
.end method

.method static checkLowLightBoostAvailability(Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;)Z
    .locals 5

    .line 290
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-gt v0, v1, :cond_0

    return v2

    .line 294
    :cond_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    if-eqz p0, :cond_2

    .line 297
    array-length v0, p0

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_2

    aget v3, p0, v1

    const/4 v4, 0x6

    if-ne v3, v4, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method private setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 309
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostStateAtomic:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v0

    if-eq v0, p2, :cond_1

    .line 310
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->isMainThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void

    .line 313
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method enableLowLightBoost(Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 220
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mIsLowLightBoostSupported:Z

    if-nez v0, :cond_0

    .line 221
    const-string p1, "LowLightBoostControl"

    const-string v0, "Unable to enable low-light boost due to it is not supported."

    invoke-static {p1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Low-light boost is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/camera/core/impl/utils/futures/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 226
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    .line 229
    new-instance v0, Landroidx/camera/camera2/internal/LowLightBoostControl$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/LowLightBoostControl$$ExternalSyntheticLambda2;-><init>(Landroidx/camera/camera2/internal/LowLightBoostControl;Z)V

    invoke-static {v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method enableLowLightBoostInternal(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer<",
            "Ljava/lang/Void;",
            ">;Z)V"
        }
    .end annotation

    .line 252
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 253
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostDisabledByUseCaseSessionConfig:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    .line 254
    iget-object p2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p0, p2, v2}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    if-eqz p1, :cond_0

    .line 256
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v1, "Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."

    invoke-direct {p2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->setException(Ljava/lang/Throwable;)Z

    .line 260
    :cond_0
    monitor-exit v0

    return-void

    .line 262
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mIsActive:Z

    if-nez v0, :cond_3

    .line 265
    iget-object p2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p0, p2, v2}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    if-eqz p1, :cond_2

    .line 267
    new-instance p2, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->setException(Ljava/lang/Throwable;)Z

    :cond_2
    return-void

    .line 273
    :cond_3
    iput-boolean p2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    .line 274
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mCamera2CameraControlImpl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    invoke-virtual {v0, p2}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->enableLowLightBoostInternal(Z)V

    .line 275
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    if-eqz p2, :cond_4

    const/4 v2, 0x0

    :cond_4
    invoke-direct {p0, v0, v2}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    .line 277
    iget-object p2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    if-eqz p2, :cond_5

    .line 278
    new-instance v0, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "There is a new enableLowLightBoost being set"

    invoke-direct {v0, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->setException(Ljava/lang/Throwable;)Z

    .line 281
    :cond_5
    iput-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    return-void

    :catchall_0
    move-exception p1

    .line 262
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method getLowLightBoostState()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 246
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method isLowLightBoostDisabledByUseCaseSessionConfig()Z
    .locals 2

    .line 193
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 194
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostDisabledByUseCaseSessionConfig:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 195
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method isLowLightBoostSupported()Z
    .locals 1

    .line 285
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mIsLowLightBoostSupported:Z

    return v0
.end method

.method synthetic lambda$enableLowLightBoost$1$androidx-camera-camera2-internal-LowLightBoostControl(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Z)V
    .locals 0

    .line 230
    invoke-virtual {p0, p1, p2}, Landroidx/camera/camera2/internal/LowLightBoostControl;->enableLowLightBoostInternal(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Z)V

    return-void
.end method

.method synthetic lambda$enableLowLightBoost$2$androidx-camera-camera2-internal-LowLightBoostControl(ZLandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 230
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/LowLightBoostControl$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p2, p1}, Landroidx/camera/camera2/internal/LowLightBoostControl$$ExternalSyntheticLambda1;-><init>(Landroidx/camera/camera2/internal/LowLightBoostControl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 231
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "enableLowLightBoost: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method synthetic lambda$new$0$androidx-camera-camera2-internal-LowLightBoostControl(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 3

    .line 99
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 100
    invoke-virtual {p1}, Landroid/hardware/camera2/TotalCaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    .line 101
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    return v1

    .line 114
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x6

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 115
    :goto_0
    iget-boolean v2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    if-ne v0, v2, :cond_2

    .line 116
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 117
    iput-object v2, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    goto :goto_1

    :cond_2
    return v1

    .line 123
    :cond_3
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x23

    if-lt v0, v2, :cond_4

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    if-eqz v0, :cond_4

    .line 125
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_LOW_LIGHT_BOOST_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_4

    .line 127
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    :cond_4
    return v1
.end method

.method setActive(Z)V
    .locals 2

    .line 147
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mIsActive:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mIsActive:Z

    if-nez p1, :cond_2

    .line 154
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 155
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    .line 156
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mCamera2CameraControlImpl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->enableLowLightBoostInternal(Z)V

    .line 157
    iget-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    .line 160
    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    if-eqz p1, :cond_2

    .line 161
    new-instance v0, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->setException(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    .line 163
    iput-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    :cond_2
    :goto_0
    return-void
.end method

.method setLowLightBoostDisabledByUseCaseSessionConfig(Z)V
    .locals 2

    .line 170
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 171
    :try_start_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostDisabledByUseCaseSessionConfig:Z

    if-nez p1, :cond_0

    .line 174
    monitor-exit v0

    return-void

    .line 176
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 179
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mTargetLlbEnabled:Z

    .line 180
    iget-object v0, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mCamera2CameraControlImpl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->enableLowLightBoostInternal(Z)V

    .line 181
    iget-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mLowLightBoostState:Landroidx/lifecycle/MutableLiveData;

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/LowLightBoostControl;->setLiveDataValue(Landroidx/lifecycle/MutableLiveData;I)V

    .line 183
    iget-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    if-eqz p1, :cond_1

    .line 184
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->setException(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    .line 187
    iput-object p1, p0, Landroidx/camera/camera2/internal/LowLightBoostControl;->mEnableLlbCompleter:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 176
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
