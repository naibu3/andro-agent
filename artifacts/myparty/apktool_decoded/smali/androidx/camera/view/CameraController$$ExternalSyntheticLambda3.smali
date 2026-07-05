.class public final synthetic Landroidx/camera/view/CameraController$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroidx/camera/view/CameraController$FocusMeteringResultCallback;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/CameraController$FocusMeteringResultCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/CameraController$$ExternalSyntheticLambda3;->f$0:Landroidx/camera/view/CameraController$FocusMeteringResultCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/camera/view/CameraController$$ExternalSyntheticLambda3;->f$0:Landroidx/camera/view/CameraController$FocusMeteringResultCallback;

    invoke-virtual {v0}, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->resetStateAndClose()V

    return-void
.end method
