.class Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;
.super Landroidx/camera/core/ForwardingImageProxy;
.source "ImageProcessingUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ImageProcessingUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NV21ImageProxy"
.end annotation


# instance fields
.field private final mHeight:I

.field private final mPlanes:[Landroidx/camera/core/ImageProxy$PlaneProxy;

.field private final mWidth:I


# direct methods
.method constructor <init>(Landroidx/camera/core/ImageProxy;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V
    .locals 0

    .line 650
    invoke-direct {p0, p1}, Landroidx/camera/core/ForwardingImageProxy;-><init>(Landroidx/camera/core/ImageProxy;)V

    .line 651
    invoke-direct {p0, p2, p3, p4, p5}, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->createPlanes(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/ImageProxy$PlaneProxy;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->mPlanes:[Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 652
    iput p5, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->mWidth:I

    .line 653
    iput p6, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->mHeight:I

    return-void
.end method

.method private createPlanes(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/ImageProxy$PlaneProxy;
    .locals 2

    const/4 v0, 0x3

    .line 677
    new-array v0, v0, [Landroidx/camera/core/ImageProxy$PlaneProxy;

    .line 678
    new-instance v1, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;

    invoke-direct {v1, p0, p4, p1}, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy$1;-><init>(Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;ILjava/nio/ByteBuffer;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    .line 694
    new-instance p1, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;

    invoke-direct {p1, p2, p4}, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;-><init>(Ljava/nio/ByteBuffer;I)V

    const/4 p2, 0x1

    aput-object p1, v0, p2

    .line 695
    new-instance p1, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;

    invoke-direct {p1, p3, p4}, Landroidx/camera/core/ImageProcessingUtil$NV21PlaneProxy;-><init>(Ljava/nio/ByteBuffer;I)V

    const/4 p2, 0x2

    aput-object p1, v0, p2

    return-object v0
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    .line 658
    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->mHeight:I

    return v0
.end method

.method public getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;
    .locals 1

    .line 668
    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->mPlanes:[Landroidx/camera/core/ImageProxy$PlaneProxy;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 663
    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$NV21ImageProxy;->mWidth:I

    return v0
.end method
