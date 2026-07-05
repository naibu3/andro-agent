.class final Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;
.super Landroidx/camera/core/imagecapture/PostviewSettings;
.source "AutoValue_PostviewSettings.java"


# instance fields
.field private final inputFormat:I

.field private final resolution:Landroid/util/Size;


# direct methods
.method constructor <init>(Landroid/util/Size;I)V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroidx/camera/core/imagecapture/PostviewSettings;-><init>()V

    if-eqz p1, :cond_0

    .line 21
    iput-object p1, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->resolution:Landroid/util/Size;

    .line 22
    iput p2, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->inputFormat:I

    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null resolution"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 48
    :cond_0
    instance-of v1, p1, Landroidx/camera/core/imagecapture/PostviewSettings;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 49
    check-cast p1, Landroidx/camera/core/imagecapture/PostviewSettings;

    .line 50
    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->resolution:Landroid/util/Size;

    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/PostviewSettings;->getResolution()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->inputFormat:I

    .line 51
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/PostviewSettings;->getInputFormat()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public getInputFormat()I
    .locals 1

    .line 32
    iget v0, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->inputFormat:I

    return v0
.end method

.method public getResolution()Landroid/util/Size;
    .locals 1

    .line 27
    iget-object v0, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->resolution:Landroid/util/Size;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 60
    iget-object v0, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->resolution:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    .line 62
    iget v1, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->inputFormat:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PostviewSettings{resolution="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->resolution:Landroid/util/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", inputFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;->inputFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
