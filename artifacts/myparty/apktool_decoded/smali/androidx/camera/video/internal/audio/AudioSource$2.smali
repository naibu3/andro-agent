.class Landroidx/camera/video/internal/audio/AudioSource$2;
.super Ljava/lang/Object;
.source "AudioSource.java"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/internal/audio/AudioSource;->resetBufferProvider(Landroidx/camera/video/internal/BufferProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Landroidx/camera/video/internal/encoder/InputBuffer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/video/internal/audio/AudioSource;

.field final synthetic val$bufferProvider:Landroidx/camera/video/internal/BufferProvider;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/audio/AudioSource;Landroidx/camera/video/internal/BufferProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 431
    iput-object p1, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iput-object p2, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->val$bufferProvider:Landroidx/camera/video/internal/BufferProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 474
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-object v0, v0, Landroidx/camera/video/internal/audio/AudioSource;->mBufferProvider:Landroidx/camera/video/internal/BufferProvider;

    iget-object v1, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->val$bufferProvider:Landroidx/camera/video/internal/BufferProvider;

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 477
    :cond_0
    const-string v0, "AudioSource"

    const-string v1, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state."

    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    instance-of v0, p1, Ljava/lang/IllegalStateException;

    if-nez v0, :cond_1

    .line 483
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/audio/AudioSource;->notifyError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onSuccess(Landroidx/camera/video/internal/encoder/InputBuffer;)V
    .locals 6

    .line 435
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-boolean v0, v0, Landroidx/camera/video/internal/audio/AudioSource;->mIsSendingAudio:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-object v0, v0, Landroidx/camera/video/internal/audio/AudioSource;->mBufferProvider:Landroidx/camera/video/internal/BufferProvider;

    iget-object v1, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->val$bufferProvider:Landroidx/camera/video/internal/BufferProvider;

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    .line 439
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-boolean v0, v0, Landroidx/camera/video/internal/audio/AudioSource;->mInSilentStartState:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioSource;->isStartRetryIntervalReached()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 440
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioSource;->retryStartAudioStream()V

    .line 446
    :cond_1
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioSource;->getCurrentAudioStream()Landroidx/camera/video/internal/audio/AudioStream;

    move-result-object v0

    .line 447
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/InputBuffer;->getByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 448
    invoke-interface {v0, v1}, Landroidx/camera/video/internal/audio/AudioStream;->read(Ljava/nio/ByteBuffer;)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;

    move-result-object v0

    .line 449
    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getSizeInBytes()I

    move-result v2

    if-lez v2, :cond_4

    .line 450
    iget-object v2, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-boolean v2, v2, Landroidx/camera/video/internal/audio/AudioSource;->mMuted:Z

    if-eqz v2, :cond_2

    .line 451
    iget-object v2, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getSizeInBytes()I

    move-result v3

    invoke-virtual {v2, v1, v3}, Landroidx/camera/video/internal/audio/AudioSource;->overrideBySilence(Ljava/nio/ByteBuffer;I)V

    .line 455
    :cond_2
    iget-object v2, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-object v2, v2, Landroidx/camera/video/internal/audio/AudioSource;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    if-eqz v2, :cond_3

    .line 456
    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getTimestampNs()J

    move-result-wide v2

    iget-object v4, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    iget-wide v4, v4, Landroidx/camera/video/internal/audio/AudioSource;->mAmplitudeTimestamp:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xc8

    cmp-long v2, v2, v4

    if-ltz v2, :cond_3

    .line 457
    iget-object v2, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getTimestampNs()J

    move-result-wide v3

    iput-wide v3, v2, Landroidx/camera/video/internal/audio/AudioSource;->mAmplitudeTimestamp:J

    .line 458
    iget-object v2, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {v2, v1}, Landroidx/camera/video/internal/audio/AudioSource;->postMaxAmplitude(Ljava/nio/ByteBuffer;)V

    .line 460
    :cond_3
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getSizeInBytes()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 461
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 462
    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getTimestampNs()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    .line 461
    invoke-interface {p1, v0, v1}, Landroidx/camera/video/internal/encoder/InputBuffer;->setPresentationTimeUs(J)V

    .line 463
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/InputBuffer;->submit()Z

    goto :goto_0

    .line 465
    :cond_4
    const-string v0, "AudioSource"

    const-string v1, "Unable to read data from AudioStream."

    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/InputBuffer;->cancel()Z

    .line 468
    :goto_0
    iget-object p1, p0, Landroidx/camera/video/internal/audio/AudioSource$2;->this$0:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSource;->sendNextAudio()V

    return-void

    .line 436
    :cond_5
    :goto_1
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/InputBuffer;->cancel()Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .line 431
    check-cast p1, Landroidx/camera/video/internal/encoder/InputBuffer;

    invoke-virtual {p0, p1}, Landroidx/camera/video/internal/audio/AudioSource$2;->onSuccess(Landroidx/camera/video/internal/encoder/InputBuffer;)V

    return-void
.end method
