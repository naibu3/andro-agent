.class final Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;
.super Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;
.source "AutoValue_SurfaceOutputConfig.java"


# instance fields
.field private final id:I

.field private final physicalCameraId:Ljava/lang/String;

.field private final surface:Landroid/view/Surface;

.field private final surfaceGroupId:I

.field private final surfaceSharingOutputConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/extensions/internal/sessionprocessor/Camera2OutputConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(IILjava/lang/String;Ljava/util/List;Landroid/view/Surface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/camera/extensions/internal/sessionprocessor/Camera2OutputConfig;",
            ">;",
            "Landroid/view/Surface;",
            ")V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;-><init>()V

    .line 29
    iput p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->id:I

    .line 30
    iput p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceGroupId:I

    .line 31
    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->physicalCameraId:Ljava/lang/String;

    if-eqz p4, :cond_1

    .line 35
    iput-object p4, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceSharingOutputConfigs:Ljava/util/List;

    if-eqz p5, :cond_0

    .line 39
    iput-object p5, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surface:Landroid/view/Surface;

    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null surface"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null surfaceSharingOutputConfigs"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 83
    :cond_0
    instance-of v1, p1, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 84
    check-cast p1, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;

    .line 85
    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->id:I

    invoke-virtual {p1}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;->getId()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceGroupId:I

    .line 86
    invoke-virtual {p1}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;->getSurfaceGroupId()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->physicalCameraId:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 87
    invoke-virtual {p1}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;->getPhysicalCameraId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;->getPhysicalCameraId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceSharingOutputConfigs:Ljava/util/List;

    .line 88
    invoke-virtual {p1}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;->getSurfaceSharingOutputConfigs()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surface:Landroid/view/Surface;

    .line 89
    invoke-virtual {p1}, Landroidx/camera/extensions/internal/sessionprocessor/SurfaceOutputConfig;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public getId()I
    .locals 1

    .line 44
    iget v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->id:I

    return v0
.end method

.method public getPhysicalCameraId()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->physicalCameraId:Ljava/lang/String;

    return-object v0
.end method

.method getSurface()Landroid/view/Surface;
    .locals 1

    .line 64
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surface:Landroid/view/Surface;

    return-object v0
.end method

.method public getSurfaceGroupId()I
    .locals 1

    .line 49
    iget v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceGroupId:I

    return v0
.end method

.method public getSurfaceSharingOutputConfigs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/extensions/internal/sessionprocessor/Camera2OutputConfig;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceSharingOutputConfigs:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 98
    iget v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->id:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    .line 100
    iget v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceGroupId:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 102
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->physicalCameraId:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 104
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceSharingOutputConfigs:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 106
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surface:Landroid/view/Surface;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SurfaceOutputConfig{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surfaceGroupId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceGroupId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", physicalCameraId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->physicalCameraId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surfaceSharingOutputConfigs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surfaceSharingOutputConfigs:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_SurfaceOutputConfig;->surface:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
