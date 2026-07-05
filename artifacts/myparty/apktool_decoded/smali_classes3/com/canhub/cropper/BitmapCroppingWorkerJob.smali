.class public final Lcom/canhub/cropper/BitmapCroppingWorkerJob;
.super Ljava/lang/Object;
.source "BitmapCroppingWorkerJob.kt"

# interfaces
.implements Lkotlinx/coroutines/CoroutineScope;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001.B\u00ab\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0006\u0010\'\u001a\u00020(J\u0016\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0082@\u00a2\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00a8\u0006/"
    }
    d2 = {
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob;",
        "Lkotlinx/coroutines/CoroutineScope;",
        "context",
        "Landroid/content/Context;",
        "cropImageViewReference",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/canhub/cropper/CropImageView;",
        "uri",
        "Landroid/net/Uri;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "cropPoints",
        "",
        "degreesRotated",
        "",
        "orgWidth",
        "orgHeight",
        "fixAspectRatio",
        "",
        "aspectRatioX",
        "aspectRatioY",
        "reqWidth",
        "reqHeight",
        "flipHorizontally",
        "flipVertically",
        "options",
        "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;",
        "saveCompressFormat",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "saveCompressQuality",
        "customOutputUri",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V",
        "job",
        "Lkotlinx/coroutines/Job;",
        "coroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "getCoroutineContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "start",
        "",
        "onPostExecute",
        "result",
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;",
        "(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancel",
        "Result",
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
.field private final aspectRatioX:I

.field private final aspectRatioY:I

.field private final bitmap:Landroid/graphics/Bitmap;

.field private final context:Landroid/content/Context;

.field private final cropImageViewReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/canhub/cropper/CropImageView;",
            ">;"
        }
    .end annotation
.end field

.field private final cropPoints:[F

.field private final customOutputUri:Landroid/net/Uri;

.field private final degreesRotated:I

.field private final fixAspectRatio:Z

.field private final flipHorizontally:Z

.field private final flipVertically:Z

.field private job:Lkotlinx/coroutines/Job;

.field private final options:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

.field private final orgHeight:I

.field private final orgWidth:I

.field private final reqHeight:I

.field private final reqWidth:I

.field private final saveCompressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private final saveCompressQuality:I

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/canhub/cropper/CropImageView;",
            ">;",
            "Landroid/net/Uri;",
            "Landroid/graphics/Bitmap;",
            "[FIIIZIIIIZZ",
            "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;",
            "Landroid/graphics/Bitmap$CompressFormat;",
            "I",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p16

    move-object/from16 v1, p17

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cropImageViewReference"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cropPoints"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "options"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "saveCompressFormat"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->context:Landroid/content/Context;

    .line 17
    iput-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->cropImageViewReference:Ljava/lang/ref/WeakReference;

    .line 18
    iput-object p3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->uri:Landroid/net/Uri;

    .line 19
    iput-object p4, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->bitmap:Landroid/graphics/Bitmap;

    .line 20
    iput-object p5, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->cropPoints:[F

    .line 21
    iput p6, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->degreesRotated:I

    .line 22
    iput p7, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->orgWidth:I

    .line 23
    iput p8, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->orgHeight:I

    .line 24
    iput-boolean p9, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->fixAspectRatio:Z

    .line 25
    iput p10, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->aspectRatioX:I

    .line 26
    iput p11, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->aspectRatioY:I

    .line 27
    iput p12, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->reqWidth:I

    move/from16 p1, p13

    .line 28
    iput p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->reqHeight:I

    move/from16 p1, p14

    .line 29
    iput-boolean p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->flipHorizontally:Z

    move/from16 p1, p15

    .line 30
    iput-boolean p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->flipVertically:Z

    .line 31
    iput-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->options:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 32
    iput-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->saveCompressFormat:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 p1, p18

    .line 33
    iput p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->saveCompressQuality:I

    move-object/from16 p1, p19

    .line 34
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->customOutputUri:Landroid/net/Uri;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 36
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/JobKt;->Job$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/Job;

    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->job:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getAspectRatioX$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->aspectRatioX:I

    return p0
.end method

.method public static final synthetic access$getAspectRatioY$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->aspectRatioY:I

    return p0
.end method

.method public static final synthetic access$getBitmap$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/graphics/Bitmap;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->bitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/content/Context;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getCropImageViewReference$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->cropImageViewReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static final synthetic access$getCropPoints$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)[F
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->cropPoints:[F

    return-object p0
.end method

.method public static final synthetic access$getCustomOutputUri$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/net/Uri;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->customOutputUri:Landroid/net/Uri;

    return-object p0
.end method

.method public static final synthetic access$getDegreesRotated$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->degreesRotated:I

    return p0
.end method

.method public static final synthetic access$getFixAspectRatio$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Z
    .locals 0

    .line 15
    iget-boolean p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->fixAspectRatio:Z

    return p0
.end method

.method public static final synthetic access$getFlipHorizontally$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Z
    .locals 0

    .line 15
    iget-boolean p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->flipHorizontally:Z

    return p0
.end method

.method public static final synthetic access$getFlipVertically$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Z
    .locals 0

    .line 15
    iget-boolean p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->flipVertically:Z

    return p0
.end method

.method public static final synthetic access$getOptions$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Lcom/canhub/cropper/CropImageView$RequestSizeOptions;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->options:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    return-object p0
.end method

.method public static final synthetic access$getOrgHeight$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->orgHeight:I

    return p0
.end method

.method public static final synthetic access$getOrgWidth$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->orgWidth:I

    return p0
.end method

.method public static final synthetic access$getReqHeight$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->reqHeight:I

    return p0
.end method

.method public static final synthetic access$getReqWidth$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->reqWidth:I

    return p0
.end method

.method public static final synthetic access$getSaveCompressFormat$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/graphics/Bitmap$CompressFormat;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->saveCompressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object p0
.end method

.method public static final synthetic access$getSaveCompressQuality$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 15
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->saveCompressQuality:I

    return p0
.end method

.method public static final synthetic access$getUri$p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/net/Uri;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->uri:Landroid/net/Uri;

    return-object p0
.end method

.method public static final synthetic access$onPostExecute(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->onPostExecute(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final onPostExecute(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 128
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 144
    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->job:Lkotlinx/coroutines/Job;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public getCoroutineContext()Lkotlin/coroutines/CoroutineContext;
    .locals 2

    .line 38
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->job:Lkotlinx/coroutines/Job;

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {v0, v1}, Lkotlinx/coroutines/MainCoroutineDispatcher;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method

.method public final start()V
    .locals 6

    .line 41
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->job:Lkotlinx/coroutines/Job;

    return-void
.end method
