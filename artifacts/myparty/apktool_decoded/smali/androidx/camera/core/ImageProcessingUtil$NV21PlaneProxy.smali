.class Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;
.super Ljava/lang/Object;
.source "ImageProcessingUtil.java"

# interfaces
.implements Landroidx/camera/core/ImageProxy$PlaneProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ImageProcessingUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NV21PlaneProxy"
.end annotation


# instance fields
.field private final mByteBuffer:Ljava/nio/ByteBuffer;

.field private final mRowStride:I


# direct methods
.method constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 0

    .line 705
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 706
    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;->mByteBuffer:Ljava/nio/ByteBuffer;

    .line 707
    iput p2, p0, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;->mRowStride:I

    return-void
.end method


# virtual methods
.method public getBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 723
    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;->mByteBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getPixelStride()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public getRowStride()I
    .locals 1

    .line 712
    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;->mRowStride:I

    return v0
.end method
