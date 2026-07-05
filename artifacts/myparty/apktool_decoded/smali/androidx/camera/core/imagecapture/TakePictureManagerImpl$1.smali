.class Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;
.super Ljava/lang/Object;
.source "TakePictureManagerImpl.java"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->submitCameraRequest(Landroidx/camera/core/imagecapture/CameraRequest;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

.field final synthetic val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;


# direct methods
.method constructor <init>(Landroidx/camera/core/imagecapture/TakePictureManagerImpl;Landroidx/camera/core/imagecapture/CameraRequest;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 253
    iput-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    iput-object p2, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5

    .line 261
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;

    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/CameraRequest;->isAborted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 268
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;

    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/CameraRequest;->getCaptureConfigs()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/CaptureConfig;

    invoke-virtual {v0}, Landroidx/camera/core/impl/CaptureConfig;->getId()I

    move-result v0

    .line 269
    instance-of v1, p1, Landroidx/camera/core/ImageCaptureException;

    if-eqz v1, :cond_1

    .line 270
    iget-object v1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    iget-object v1, v1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    check-cast p1, Landroidx/camera/core/ImageCaptureException;

    .line 271
    invoke-static {v0, p1}, Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;->of(ILandroidx/camera/core/ImageCaptureException;)Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;

    move-result-object p1

    .line 270
    invoke-virtual {v1, p1}, Landroidx/camera/core/imagecapture/ImagePipeline;->notifyCaptureError(Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;)V

    goto :goto_0

    .line 273
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    iget-object v1, v1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    new-instance v2, Landroidx/camera/core/ImageCaptureException;

    const/4 v3, 0x2

    const-string v4, "Failed to submit capture request"

    invoke-direct {v2, v3, v4, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    invoke-static {v0, v2}, Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;->of(ILandroidx/camera/core/ImageCaptureException;)Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;

    move-result-object p1

    .line 273
    invoke-virtual {v1, p1}, Landroidx/camera/core/imagecapture/ImagePipeline;->notifyCaptureError(Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;)V

    .line 280
    :goto_0
    iget-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    iget-object p1, p1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    invoke-interface {p1}, Landroidx/camera/core/imagecapture/ImageCaptureControl;->unlockFlashMode()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .line 253
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 256
    iget-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    iget-object p1, p1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    invoke-interface {p1}, Landroidx/camera/core/imagecapture/ImageCaptureControl;->unlockFlashMode()V

    return-void
.end method
