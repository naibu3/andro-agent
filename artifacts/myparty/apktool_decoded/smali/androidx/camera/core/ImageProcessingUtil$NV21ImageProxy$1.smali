.class Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;
.super Ljava/lang/Object;
.source "ImageProcessingUtil.java"

# interfaces
.implements Landroidx/camera/core/ImageProxy$PlaneProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->createPlanes(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/ImageProxy$PlaneProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;

.field final synthetic val$delegateBufferY:Ljava/nio/ByteBuffer;

.field final synthetic val$rowStride:I


# direct methods
.method constructor <init>(Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;ILjava/nio/ByteBuffer;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 678
    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;->this$0:Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;

    iput p2, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;->val$rowStride:I

    iput-object p3, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;->val$delegateBufferY:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 691
    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;->val$delegateBufferY:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getPixelStride()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getRowStride()I
    .locals 1

    .line 681
    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;->val$rowStride:I

    return v0
.end method
