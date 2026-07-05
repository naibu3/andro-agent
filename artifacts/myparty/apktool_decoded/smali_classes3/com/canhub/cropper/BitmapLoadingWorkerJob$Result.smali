.class public final Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;
.super Ljava/lang/Object;
.source "BitmapLoadingWorkerJob.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/BitmapLoadingWorkerJob;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Result"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000c\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\u0016\u0010$\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ^\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0010\u0008\u0002\u0010\u000c\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\n2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0007H\u00d6\u0001J\t\u0010*\u001a\u00020+H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u001b\u0010\u000c\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\r\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006,"
    }
    d2 = {
        "Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;",
        "",
        "uri",
        "Landroid/net/Uri;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "loadSampleSize",
        "",
        "degreesRotated",
        "flipHorizontally",
        "",
        "flipVertically",
        "error",
        "Lkotlin/Exception;",
        "Ljava/lang/Exception;",
        "<init>",
        "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V",
        "getUri",
        "()Landroid/net/Uri;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "getLoadSampleSize",
        "()I",
        "getDegreesRotated",
        "getFlipHorizontally",
        "()Z",
        "getFlipVertically",
        "getError",
        "()Ljava/lang/Exception;",
        "Ljava/lang/Exception;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "cropper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final degreesRotated:I

.field private final error:Ljava/lang/Exception;

.field private final flipHorizontally:Z

.field private final flipVertically:Z

.field private final loadSampleSize:I

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V
    .locals 1

    const-string/jumbo v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    .line 102
    iput-object p2, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    .line 103
    iput p3, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    .line 104
    iput p4, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    .line 105
    iput-boolean p5, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    .line 106
    iput-boolean p6, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    .line 107
    iput-object p7, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    return-void
.end method

.method public static synthetic copy$default(Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;ILjava/lang/Object;)Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->copy(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public final component2()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    return v0
.end method

.method public final component7()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public final copy(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;
    .locals 9

    const-string/jumbo v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;

    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    iget-object v3, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    iget v3, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    iget v3, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    iget-object p1, p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getDegreesRotated()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    return v0
.end method

.method public final getError()Ljava/lang/Exception;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public final getFlipHorizontally()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    return v0
.end method

.method public final getFlipVertically()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    return v0
.end method

.method public final getLoadSampleSize()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    return v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Exception;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->uri:Landroid/net/Uri;

    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->loadSampleSize:I

    iget v3, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->degreesRotated:I

    iget-boolean v4, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipHorizontally:Z

    iget-boolean v5, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->flipVertically:Z

    iget-object v6, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->error:Ljava/lang/Exception;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Result(uri="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", bitmap="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", loadSampleSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", degreesRotated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flipHorizontally="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flipVertically="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
