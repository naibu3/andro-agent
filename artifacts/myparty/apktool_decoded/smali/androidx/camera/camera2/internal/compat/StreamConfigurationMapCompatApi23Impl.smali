.class Landroidx/camera/camera2/internal/compat/StreamConfigurationMapCompatApi23Impl;
.super Landroidx/camera/camera2/internal/compat/StreamConfigurationMapCompatBaseImpl;
.source "StreamConfigurationMapCompatApi23Impl.java"


# direct methods
.method constructor <init>(Landroid/hardware/camera2/params/StreamConfigurationMap;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/compat/StreamConfigurationMapCompatBaseImpl;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;)V

    return-void
.end method


# virtual methods
.method public getOutputMinFrameDuration(ILandroid/util/Size;)J
    .locals 1

    .line 41
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/StreamConfigurationMapCompatApi23Impl;->mStreamConfigurationMap:Landroid/hardware/camera2/params/StreamConfigurationMap;

    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide p1

    return-wide p1
.end method

.method public getOutputSizes(I)[Landroid/util/Size;
    .locals 1

    .line 36
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/StreamConfigurationMapCompatApi23Impl;->mStreamConfigurationMap:Landroid/hardware/camera2/params/StreamConfigurationMap;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method
