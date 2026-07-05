.class Landroidx/camera/core/impl/UseCaseConfig$1;
.super Ljava/lang/Object;
.source "UseCaseConfig.java"

# interfaces
.implements Landroidx/camera/core/imagecapture/TakePictureManager$Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/impl/UseCaseConfig;->getTakePictureManagerProvider()Landroidx/camera/core/imagecapture/TakePictureManager$Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/core/impl/UseCaseConfig;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/UseCaseConfig;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    .line 399
    iput-object p1, p0, Landroidx/camera/core/impl/UseCaseConfig$1;->this$0:Landroidx/camera/core/impl/UseCaseConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newInstance(Landroidx/camera/core/imagecapture/ImageCaptureControl;)Landroidx/camera/core/imagecapture/TakePictureManager;
    .locals 1

    .line 403
    new-instance v0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    invoke-direct {v0, p1}, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;-><init>(Landroidx/camera/core/imagecapture/ImageCaptureControl;)V

    return-object v0
.end method
