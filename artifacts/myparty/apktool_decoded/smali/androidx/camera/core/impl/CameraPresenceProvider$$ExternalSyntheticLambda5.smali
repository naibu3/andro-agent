.class public final synthetic Landroidx/camera/core/impl/CameraPresenceProvider$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic f$0:Landroidx/camera/core/impl/CameraPresenceProvider;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/CameraPresenceProvider;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/CameraPresenceProvider$$ExternalSyntheticLambda5;->f$0:Landroidx/camera/core/impl/CameraPresenceProvider;

    iput-object p2, p0, Landroidx/camera/core/impl/CameraPresenceProvider$$ExternalSyntheticLambda5;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Landroidx/camera/core/impl/CameraPresenceProvider$$ExternalSyntheticLambda5;->f$0:Landroidx/camera/core/impl/CameraPresenceProvider;

    iget-object v1, p0, Landroidx/camera/core/impl/CameraPresenceProvider$$ExternalSyntheticLambda5;->f$1:Ljava/lang/String;

    check-cast p1, Landroidx/camera/core/CameraState;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/impl/CameraPresenceProvider;->$r8$lambda$8I2SiglK5IZGTt2SYeSQEdhpeBc(Landroidx/camera/core/impl/CameraPresenceProvider;Ljava/lang/String;Landroidx/camera/core/CameraState;)V

    return-void
.end method
