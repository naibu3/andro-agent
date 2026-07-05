.class final Landroidx/camera/video/AutoValue_VideoSpec;
.super Landroidx/camera/video/VideoSpec;
.source "AutoValue_VideoSpec.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/AutoValue_VideoSpec$Builder;
    }
.end annotation


# instance fields
.field private final aspectRatio:I

.field private final bitrate:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final encodeFrameRate:I

.field private final qualitySelector:Landroidx/camera/video/QualitySelector;


# direct methods
.method private constructor <init>(Landroidx/camera/video/QualitySelector;ILandroid/util/Range;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/video/QualitySelector;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Landroidx/camera/video/VideoSpec;-><init>()V

    .line 25
    iput-object p1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->qualitySelector:Landroidx/camera/video/QualitySelector;

    .line 26
    iput p2, p0, Landroidx/camera/video/AutoValue_VideoSpec;->encodeFrameRate:I

    .line 27
    iput-object p3, p0, Landroidx/camera/video/AutoValue_VideoSpec;->bitrate:Landroid/util/Range;

    .line 28
    iput p4, p0, Landroidx/camera/video/AutoValue_VideoSpec;->aspectRatio:I

    return-void
.end method

.method synthetic constructor <init>(Landroidx/camera/video/QualitySelector;ILandroid/util/Range;ILandroidx/camera/video/AutoValue_VideoSpec$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/video/AutoValue_VideoSpec;-><init>(Landroidx/camera/video/QualitySelector;ILandroid/util/Range;I)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 67
    :cond_0
    instance-of v1, p1, Landroidx/camera/video/VideoSpec;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 68
    check-cast p1, Landroidx/camera/video/VideoSpec;

    .line 69
    iget-object v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->qualitySelector:Landroidx/camera/video/QualitySelector;

    invoke-virtual {p1}, Landroidx/camera/video/VideoSpec;->getQualitySelector()Landroidx/camera/video/QualitySelector;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->encodeFrameRate:I

    .line 70
    invoke-virtual {p1}, Landroidx/camera/video/VideoSpec;->getEncodeFrameRate()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->bitrate:Landroid/util/Range;

    .line 71
    invoke-virtual {p1}, Landroidx/camera/video/VideoSpec;->getBitrate()Landroid/util/Range;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->aspectRatio:I

    .line 72
    invoke-virtual {p1}, Landroidx/camera/video/VideoSpec;->getAspectRatio()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method getAspectRatio()I
    .locals 1

    .line 49
    iget v0, p0, Landroidx/camera/video/AutoValue_VideoSpec;->aspectRatio:I

    return v0
.end method

.method public getBitrate()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Landroidx/camera/video/AutoValue_VideoSpec;->bitrate:Landroid/util/Range;

    return-object v0
.end method

.method public getEncodeFrameRate()I
    .locals 1

    .line 38
    iget v0, p0, Landroidx/camera/video/AutoValue_VideoSpec;->encodeFrameRate:I

    return v0
.end method

.method public getQualitySelector()Landroidx/camera/video/QualitySelector;
    .locals 1

    .line 33
    iget-object v0, p0, Landroidx/camera/video/AutoValue_VideoSpec;->qualitySelector:Landroidx/camera/video/QualitySelector;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 81
    iget-object v0, p0, Landroidx/camera/video/AutoValue_VideoSpec;->qualitySelector:Landroidx/camera/video/QualitySelector;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    .line 83
    iget v2, p0, Landroidx/camera/video/AutoValue_VideoSpec;->encodeFrameRate:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 85
    iget-object v2, p0, Landroidx/camera/video/AutoValue_VideoSpec;->bitrate:Landroid/util/Range;

    invoke-virtual {v2}, Landroid/util/Range;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 87
    iget v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->aspectRatio:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toBuilder()Landroidx/camera/video/VideoSpec$Builder;
    .locals 2

    .line 93
    new-instance v0, Landroidx/camera/video/AutoValue_VideoSpec$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/camera/video/AutoValue_VideoSpec$Builder;-><init>(Landroidx/camera/video/VideoSpec;Landroidx/camera/video/AutoValue_VideoSpec$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VideoSpec{qualitySelector="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->qualitySelector:Landroidx/camera/video/QualitySelector;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", encodeFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->encodeFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->bitrate:Landroid/util/Range;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aspectRatio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/camera/video/AutoValue_VideoSpec;->aspectRatio:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
