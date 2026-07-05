.class public final synthetic Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lexpo/modules/camera/tasks/PictureSavedDelegate;


# instance fields
.field public final synthetic f$0:Lexpo/modules/camera/PictureOptions;

.field public final synthetic f$1:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;->f$0:Lexpo/modules/camera/PictureOptions;

    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;->f$1:Lexpo/modules/camera/ExpoCameraView;

    return-void
.end method


# virtual methods
.method public final onPictureSaved(Landroid/os/Bundle;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;->f$0:Lexpo/modules/camera/PictureOptions;

    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;->f$1:Lexpo/modules/camera/ExpoCameraView;

    invoke-static {v0, v1, p1}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$r8$lambda$QKaIh7gl3MNreoMTgkDE9WA5MIM(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;Landroid/os/Bundle;)V

    return-void
.end method
