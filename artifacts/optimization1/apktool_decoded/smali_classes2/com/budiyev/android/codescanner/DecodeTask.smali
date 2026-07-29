.class final Lcom/budiyev/android/codescanner/DecodeTask;
.super Ljava/lang/Object;
.source "DecodeTask.java"


# instance fields
.field private final mImage:[B

.field private final mImageSize:Lcom/budiyev/android/codescanner/Point;

.field private final mOrientation:I

.field private final mPreviewSize:Lcom/budiyev/android/codescanner/Point;

.field private final mReverseHorizontal:Z

.field private final mViewFrameRect:Lcom/budiyev/android/codescanner/Rect;

.field private final mViewSize:Lcom/budiyev/android/codescanner/Point;


# direct methods
.method public constructor <init>([BLcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Rect;IZ)V
    .locals 0
    .param p1, "image"    # [B
    .param p2, "imageSize"    # Lcom/budiyev/android/codescanner/Point;
    .param p3, "previewSize"    # Lcom/budiyev/android/codescanner/Point;
    .param p4, "viewSize"    # Lcom/budiyev/android/codescanner/Point;
    .param p5, "viewFrameRect"    # Lcom/budiyev/android/codescanner/Rect;
    .param p6, "orientation"    # I
    .param p7, "reverseHorizontal"    # Z

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mImage:[B

    .line 48
    iput-object p2, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mImageSize:Lcom/budiyev/android/codescanner/Point;

    .line 49
    iput-object p3, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mPreviewSize:Lcom/budiyev/android/codescanner/Point;

    .line 50
    iput-object p4, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mViewSize:Lcom/budiyev/android/codescanner/Point;

    .line 51
    iput-object p5, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mViewFrameRect:Lcom/budiyev/android/codescanner/Rect;

    .line 52
    iput p6, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mOrientation:I

    .line 53
    iput-boolean p7, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mReverseHorizontal:Z

    .line 54
    return-void
.end method


# virtual methods
.method public decode(Lcom/google/zxing/MultiFormatReader;)Lcom/google/zxing/Result;
    .locals 13
    .param p1, "reader"    # Lcom/google/zxing/MultiFormatReader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/ReaderException;
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mImageSize:Lcom/budiyev/android/codescanner/Point;

    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Point;->getX()I

    move-result v0

    .line 60
    .local v0, "imageWidth":I
    iget-object v1, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mImageSize:Lcom/budiyev/android/codescanner/Point;

    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/Point;->getY()I

    move-result v1

    .line 61
    .local v1, "imageHeight":I
    iget v2, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mOrientation:I

    .line 62
    .local v2, "orientation":I
    iget-object v3, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mImage:[B

    invoke-static {v3, v0, v1, v2}, Lcom/budiyev/android/codescanner/Utils;->rotateYuv([BIII)[B

    move-result-object v5

    .line 63
    .local v5, "image":[B
    const/16 v3, 0x5a

    if-eq v2, v3, :cond_1

    const/16 v3, 0x10e

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v6, v0

    move v7, v1

    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    move v3, v0

    .line 65
    .local v3, "width":I
    move v0, v1

    .line 66
    move v1, v3

    move v6, v0

    move v7, v1

    .line 68
    .end local v0    # "imageWidth":I
    .end local v1    # "imageHeight":I
    .end local v3    # "width":I
    .local v6, "imageWidth":I
    .local v7, "imageHeight":I
    :goto_1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mViewFrameRect:Lcom/budiyev/android/codescanner/Rect;

    iget-object v1, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mPreviewSize:Lcom/budiyev/android/codescanner/Point;

    iget-object v3, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mViewSize:Lcom/budiyev/android/codescanner/Point;

    .line 69
    invoke-static {v6, v7, v0, v1, v3}, Lcom/budiyev/android/codescanner/Utils;->getImageFrameRect(IILcom/budiyev/android/codescanner/Rect;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Point;)Lcom/budiyev/android/codescanner/Rect;

    move-result-object v0

    .line 71
    .local v0, "frameRect":Lcom/budiyev/android/codescanner/Rect;
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getWidth()I

    move-result v10

    .line 72
    .local v10, "frameWidth":I
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getHeight()I

    move-result v11

    .line 73
    .local v11, "frameHeight":I
    const/4 v1, 0x1

    if-lt v10, v1, :cond_3

    if-ge v11, v1, :cond_2

    goto :goto_2

    .line 76
    :cond_2
    new-instance v4, Lcom/google/zxing/PlanarYUVLuminanceSource;

    .line 77
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getLeft()I

    move-result v8

    .line 78
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/Rect;->getTop()I

    move-result v9

    iget-boolean v12, p0, Lcom/budiyev/android/codescanner/DecodeTask;->mReverseHorizontal:Z

    invoke-direct/range {v4 .. v12}, Lcom/google/zxing/PlanarYUVLuminanceSource;-><init>([BIIIIIIZ)V

    .line 76
    invoke-static {p1, v4}, Lcom/budiyev/android/codescanner/Utils;->decodeLuminanceSource(Lcom/google/zxing/MultiFormatReader;Lcom/google/zxing/LuminanceSource;)Lcom/google/zxing/Result;

    move-result-object v1

    return-object v1

    .line 74
    :cond_3
    :goto_2
    const/4 v1, 0x0

    return-object v1
.end method
