.class public interface abstract Landroidx/camera/video/internal/encoder/EncoderConfig;
.super Ljava/lang/Object;
.source "EncoderConfig.java"


# static fields
.field public static final CODEC_PROFILE_NONE:I = -0x1

.field public static final KEY_CSD_0:Ljava/lang/String; = "csd-0"

.field public static final KEY_CSD_1:Ljava/lang/String; = "csd-1"

.field public static final KEY_CSD_2:Ljava/lang/String; = "csd-2"


# virtual methods
.method public abstract getInputTimebase()Landroidx/camera/core/impl/Timebase;
.end method

.method public abstract getMimeType()Ljava/lang/String;
.end method

.method public abstract getProfile()I
.end method

.method public abstract toMediaFormat()Landroid/media/MediaFormat;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/video/internal/encoder/InvalidConfigException;
        }
    .end annotation
.end method
