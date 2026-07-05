.class public final Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;
.super Ljava/lang/Object;
.source "BitmapCroppingWorkerJob.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/BitmapCroppingWorkerJob;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Result"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0008j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0016\u0010\u0018\u001a\n\u0018\u00010\u0008j\u0004\u0018\u0001`\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003JB\u0010\u001a\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0018\u00010\u0008j\u0004\u0018\u0001`\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0006\u001a\n\u0018\u00010\u0008j\u0004\u0018\u0001`\u0007\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "uri",
        "Landroid/net/Uri;",
        "error",
        "Lkotlin/Exception;",
        "Ljava/lang/Exception;",
        "sampleSize",
        "",
        "<init>",
        "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "getUri",
        "()Landroid/net/Uri;",
        "getError",
        "()Ljava/lang/Exception;",
        "Ljava/lang/Exception;",
        "getSampleSize",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;",
        "equals",
        "",
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

.field private final error:Ljava/lang/Exception;

.field private final sampleSize:I

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V
    .locals 0

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    .line 148
    iput-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    .line 149
    iput-object p3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    .line 150
    iput p4, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;IILjava/lang/Object;)Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->copy(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final component2()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public final component3()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    return v0
.end method

.method public final copy(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;
    .locals 1

    new-instance v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;

    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    iget-object v3, p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    iget-object v3, p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    iget p1, p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getError()Ljava/lang/Exception;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public final getSampleSize()I
    .locals 1

    .line 150
    iget v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    return v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Exception;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->bitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->uri:Landroid/net/Uri;

    iget-object v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->error:Ljava/lang/Exception;

    iget v3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->sampleSize:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Result(bitmap="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", uri="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sampleSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
