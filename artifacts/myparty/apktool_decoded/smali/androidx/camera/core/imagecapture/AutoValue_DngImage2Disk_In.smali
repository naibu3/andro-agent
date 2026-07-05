.class final Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;
.super Landroidx/camera/core/imagecapture/DngImage2Disk$In;
.source "AutoValue_DngImage2Disk_In.java"


# instance fields
.field private final imageProxy:Landroidx/camera/core/ImageProxy;

.field private final outputFileOptions:Landroidx/camera/core/ImageCapture$OutputFileOptions;

.field private final rotationDegrees:I


# direct methods
.method constructor <init>(Landroidx/camera/core/ImageProxy;ILandroidx/camera/core/ImageCapture$OutputFileOptions;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroidx/camera/core/imagecapture/DngImage2Disk$In;-><init>()V

    if-eqz p1, :cond_1

    .line 25
    iput-object p1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->imageProxy:Landroidx/camera/core/ImageProxy;

    .line 26
    iput p2, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->rotationDegrees:I

    if-eqz p3, :cond_0

    .line 30
    iput-object p3, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->outputFileOptions:Landroidx/camera/core/ImageCapture$OutputFileOptions;

    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null outputFileOptions"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null imageProxy"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 62
    :cond_0
    instance-of v1, p1, Landroidx/camera/core/imagecapture/DngImage2Disk$In;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 63
    check-cast p1, Landroidx/camera/core/imagecapture/DngImage2Disk$In;

    .line 64
    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->imageProxy:Landroidx/camera/core/ImageProxy;

    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/DngImage2Disk$In;->getImageProxy()Landroidx/camera/core/ImageProxy;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->rotationDegrees:I

    .line 65
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/DngImage2Disk$In;->getRotationDegrees()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->outputFileOptions:Landroidx/camera/core/ImageCapture$OutputFileOptions;

    .line 66
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/DngImage2Disk$In;->getOutputFileOptions()Landroidx/camera/core/ImageCapture$OutputFileOptions;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method getImageProxy()Landroidx/camera/core/ImageProxy;
    .locals 1

    .line 35
    iget-object v0, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->imageProxy:Landroidx/camera/core/ImageProxy;

    return-object v0
.end method

.method getOutputFileOptions()Landroidx/camera/core/ImageCapture$OutputFileOptions;
    .locals 1

    .line 45
    iget-object v0, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->outputFileOptions:Landroidx/camera/core/ImageCapture$OutputFileOptions;

    return-object v0
.end method

.method getRotationDegrees()I
    .locals 1

    .line 40
    iget v0, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->rotationDegrees:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 75
    iget-object v0, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->imageProxy:Landroidx/camera/core/ImageProxy;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    .line 77
    iget v2, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->rotationDegrees:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 79
    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->outputFileOptions:Landroidx/camera/core/ImageCapture$OutputFileOptions;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "In{imageProxy="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->imageProxy:Landroidx/camera/core/ImageProxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->rotationDegrees:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", outputFileOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;->outputFileOptions:Landroidx/camera/core/ImageCapture$OutputFileOptions;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
