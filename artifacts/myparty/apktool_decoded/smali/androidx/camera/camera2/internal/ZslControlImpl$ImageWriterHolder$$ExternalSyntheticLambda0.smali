.class public final synthetic Landroidx/camera/camera2/internal/ZslControlImpl$ImageWriterHolder$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/media/ImageWriter$OnImageReleasedListener;


# instance fields
.field public final synthetic f$0:Landroidx/camera/core/ImageProxy;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/ImageProxy;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/ZslControlImpl$ImageWriterHolder$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/core/ImageProxy;

    return-void
.end method


# virtual methods
.method public final onImageReleased(Landroid/media/ImageWriter;)V
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/camera/camera2/internal/ZslControlImpl$ImageWriterHolder$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/core/ImageProxy;

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/ZslControlImpl$ImageWriterHolder;->lambda$enqueueImageToImageWriter$0(Landroidx/camera/core/ImageProxy;Landroid/media/ImageWriter;)V

    return-void
.end method
