.class final Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;
.super Landroidx/camera/video/internal/audio/AudioSettings$Builder;
.source "AutoValue_AudioSettings.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/internal/audio/AutoValue_AudioSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private audioFormat:Ljava/lang/Integer;

.field private audioSource:Ljava/lang/Integer;

.field private captureSampleRate:Ljava/lang/Integer;

.field private channelCount:Ljava/lang/Integer;

.field private encodeSampleRate:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/AudioSettings$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Landroidx/camera/video/internal/audio/AudioSettings;)V
    .locals 1

    .line 117
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/AudioSettings$Builder;-><init>()V

    .line 118
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getAudioSource()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioSource:Ljava/lang/Integer;

    .line 119
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getCaptureSampleRate()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->captureSampleRate:Ljava/lang/Integer;

    .line 120
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getEncodeSampleRate()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->encodeSampleRate:Ljava/lang/Integer;

    .line 121
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getChannelCount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->channelCount:Ljava/lang/Integer;

    .line 122
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getAudioFormat()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioFormat:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Landroidx/camera/video/internal/audio/AudioSettings;Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$1;)V
    .locals 0

    .line 109
    invoke-direct {p0, p1}, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;-><init>(Landroidx/camera/video/internal/audio/AudioSettings;)V

    return-void
.end method


# virtual methods
.method autoBuild()Landroidx/camera/video/internal/audio/AudioSettings;
    .locals 9

    .line 152
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioSource:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 153
    const-string v0, " audioSource"

    goto :goto_0

    .line 152
    :cond_0
    const-string v0, ""

    .line 155
    :goto_0
    iget-object v1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->captureSampleRate:Ljava/lang/Integer;

    if-nez v1, :cond_1

    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " captureSampleRate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 158
    :cond_1
    iget-object v1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->encodeSampleRate:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 159
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " encodeSampleRate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 161
    :cond_2
    iget-object v1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->channelCount:Ljava/lang/Integer;

    if-nez v1, :cond_3

    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " channelCount"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 164
    :cond_3
    iget-object v1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioFormat:Ljava/lang/Integer;

    if-nez v1, :cond_4

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " audioFormat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 167
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 170
    new-instance v2, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings;

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioSource:Ljava/lang/Integer;

    .line 171
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->captureSampleRate:Ljava/lang/Integer;

    .line 172
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->encodeSampleRate:Ljava/lang/Integer;

    .line 173
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->channelCount:Ljava/lang/Integer;

    .line 174
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioFormat:Ljava/lang/Integer;

    .line 175
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings;-><init>(IIIIILandroidx/camera/video/internal/audio/AutoValue_AudioSettings$1;)V

    return-object v2

    .line 168
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Missing required properties:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public setAudioFormat(I)Landroidx/camera/video/internal/audio/AudioSettings$Builder;
    .locals 0

    .line 146
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioFormat:Ljava/lang/Integer;

    return-object p0
.end method

.method public setAudioSource(I)Landroidx/camera/video/internal/audio/AudioSettings$Builder;
    .locals 0

    .line 126
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->audioSource:Ljava/lang/Integer;

    return-object p0
.end method

.method public setCaptureSampleRate(I)Landroidx/camera/video/internal/audio/AudioSettings$Builder;
    .locals 0

    .line 131
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->captureSampleRate:Ljava/lang/Integer;

    return-object p0
.end method

.method public setChannelCount(I)Landroidx/camera/video/internal/audio/AudioSettings$Builder;
    .locals 0

    .line 141
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->channelCount:Ljava/lang/Integer;

    return-object p0
.end method

.method public setEncodeSampleRate(I)Landroidx/camera/video/internal/audio/AudioSettings$Builder;
    .locals 0

    .line 136
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/video/internal/audio/AutoValue_AudioSettings$Builder;->encodeSampleRate:Ljava/lang/Integer;

    return-object p0
.end method
