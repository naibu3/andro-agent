.class final Lexpo/modules/camera/CameraViewModule$definition$1$12$18$1$1;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"

# interfaces
.implements Lexpo/modules/camera/tasks/PictureSavedDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule$definition$1$12$18$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $view:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method constructor <init>(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$12$18$1$1;->$view:Lexpo/modules/camera/ExpoCameraView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPictureSaved(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$12$18$1$1;->$view:Lexpo/modules/camera/ExpoCameraView;

    invoke-virtual {v0, p1}, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved(Landroid/os/Bundle;)V

    return-void
.end method
