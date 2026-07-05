.class public final synthetic Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/camera/core/Preview$SurfaceProvider;


# instance fields
.field public final synthetic f$0:Landroid/graphics/SurfaceTexture;

.field public final synthetic f$1:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;->f$0:Landroid/graphics/SurfaceTexture;

    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;->f$1:Lexpo/modules/camera/ExpoCameraView;

    return-void
.end method


# virtual methods
.method public final onSurfaceRequested(Landroidx/camera/core/SurfaceRequest;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;->f$0:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;->f$1:Lexpo/modules/camera/ExpoCameraView;

    invoke-static {v0, v1, p1}, Lexpo/modules/camera/ExpoCameraView;->$r8$lambda$0D0b5hkRFuZ4LFjQj3CTzRiOxDQ(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/SurfaceRequest;)V

    return-void
.end method
