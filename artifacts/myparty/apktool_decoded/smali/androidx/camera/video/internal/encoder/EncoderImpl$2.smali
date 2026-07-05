.class Landroidx/camera/video/internal/encoder/EncoderImpl$2;
.super Landroidx/camera/video/internal/encoder/InputBufferImpl;
.source "EncoderImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/internal/encoder/EncoderImpl;->matchAcquisitionsAndFreeBufferIndexes()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/video/internal/encoder/EncoderImpl;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/encoder/EncoderImpl;Landroid/media/MediaCodec;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .line 1073
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/EncoderImpl$2;->this$0:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-direct {p0, p2, p3}, Landroidx/camera/video/internal/encoder/InputBufferImpl;-><init>(Landroid/media/MediaCodec;I)V

    return-void
.end method


# virtual methods
.method public setPresentationTimeUs(J)V
    .locals 1

    .line 1080
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/EncoderImpl$2;->this$0:Landroidx/camera/video/internal/encoder/EncoderImpl;

    iget-boolean v0, v0, Landroidx/camera/video/internal/encoder/EncoderImpl;->mIsVideoEncoder:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1081
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/EncoderImpl$2;->this$0:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0, p1, p2}, Landroidx/camera/video/internal/encoder/EncoderImpl;->access$000(Landroidx/camera/video/internal/encoder/EncoderImpl;J)J

    move-result-wide p1

    .line 1080
    :goto_0
    invoke-super {p0, p1, p2}, Landroidx/camera/video/internal/encoder/InputBufferImpl;->setPresentationTimeUs(J)V

    return-void
.end method
