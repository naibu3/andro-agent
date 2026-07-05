.class public final Lexpo/modules/camera/tasks/ResolveTakenPicture;
.super Ljava/lang/Object;
.source "ResolveTakenPicture.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000e\u0010\u0016\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0002\u0010\u0018J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006&"
    }
    d2 = {
        "Lexpo/modules/camera/tasks/ResolveTakenPicture;",
        "",
        "imageData",
        "",
        "promise",
        "Lexpo/modules/kotlin/Promise;",
        "options",
        "Lexpo/modules/camera/PictureOptions;",
        "mirror",
        "",
        "runtimeContext",
        "Lexpo/modules/kotlin/RuntimeContext;",
        "directory",
        "Ljava/io/File;",
        "pictureSavedDelegate",
        "Lexpo/modules/camera/tasks/PictureSavedDelegate;",
        "<init>",
        "([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V",
        "quality",
        "",
        "getQuality",
        "()I",
        "resolve",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "processImage",
        "Landroid/os/Bundle;",
        "skipProcessing",
        "onComplete",
        "response",
        "decodeBitmap",
        "Landroid/graphics/Bitmap;",
        "orientation",
        "bitmapOptions",
        "Landroid/graphics/BitmapFactory$Options;",
        "decodeAndRotateBitmap",
        "angle",
        "getImageRotation",
        "expo-camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final directory:Ljava/io/File;

.field private imageData:[B

.field private mirror:Z

.field private options:Lexpo/modules/camera/PictureOptions;

.field private pictureSavedDelegate:Lexpo/modules/camera/tasks/PictureSavedDelegate;

.field private promise:Lexpo/modules/kotlin/Promise;

.field private final runtimeContext:Lexpo/modules/kotlin/RuntimeContext;


# direct methods
.method public constructor <init>([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V
    .locals 1

    const-string v0, "imageData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runtimeContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pictureSavedDelegate"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    .line 62
    iput-object p2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 63
    iput-object p3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 64
    iput-boolean p4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    .line 65
    iput-object p5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    .line 66
    iput-object p6, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->directory:Ljava/io/File;

    .line 67
    iput-object p7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->pictureSavedDelegate:Lexpo/modules/camera/tasks/PictureSavedDelegate;

    return-void
.end method

.method public static final synthetic access$getOptions$p(Lexpo/modules/camera/tasks/ResolveTakenPicture;)Lexpo/modules/camera/PictureOptions;
    .locals 0

    .line 60
    iget-object p0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    return-object p0
.end method

.method public static final synthetic access$onComplete(Lexpo/modules/camera/tasks/ResolveTakenPicture;Landroid/os/Bundle;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->onComplete(Landroid/os/Bundle;)V

    return-void
.end method

.method public static final synthetic access$processImage(Lexpo/modules/camera/tasks/ResolveTakenPicture;)Landroid/os/Bundle;
    .locals 0

    .line 60
    invoke-direct {p0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->processImage()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method private final decodeAndRotateBitmap([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x0

    .line 252
    array-length v1, p1

    invoke-static {p1, v0, v1, p3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez p2, :cond_0

    .line 255
    iget-boolean p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    if-nez p1, :cond_0

    .line 256
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v2

    .line 259
    :cond_0
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p1, p2

    .line 261
    invoke-virtual {v7, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 262
    iget-boolean p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    if-eqz p1, :cond_1

    const/high16 p1, -0x40800000    # -1.0f

    const/high16 p2, 0x3f800000    # 1.0f

    .line 263
    invoke-virtual {v7, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 268
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p2

    if-nez p2, :cond_2

    .line 270
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object p1

    .line 273
    :catch_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v2
.end method

.method private final decodeBitmap([BILexpo/modules/camera/PictureOptions;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 0

    .line 244
    invoke-virtual {p3}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    move-result p3

    if-nez p3, :cond_0

    .line 245
    invoke-direct {p0, p2}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->getImageRotation(I)I

    move-result p2

    invoke-direct {p0, p1, p2, p4}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->decodeAndRotateBitmap([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p2, 0x0

    .line 247
    array-length p3, p1

    invoke-static {p1, p2, p3, p4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 246
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final getImageRotation(I)I
    .locals 3

    const/16 v0, 0x10e

    const/16 v1, 0x5a

    const/16 v2, 0xb4

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    return v0

    :pswitch_1
    return v1

    :pswitch_2
    return v2

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getQuality()I
    .locals 4

    .line 70
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getQuality()D

    move-result-wide v0

    const/16 v2, 0x64

    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method private final onComplete(Landroid/os/Bundle;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 232
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getFastMode()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 234
    iget-object v1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v1}, Lexpo/modules/camera/PictureOptions;->getId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "id"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 235
    const-string v1, "data"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 236
    iget-object p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->pictureSavedDelegate:Lexpo/modules/camera/tasks/PictureSavedDelegate;

    invoke-interface {p1, v0}, Lexpo/modules/camera/tasks/PictureSavedDelegate;->onPictureSaved(Landroid/os/Bundle;)V

    return-void

    .line 234
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 238
    :cond_2
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    invoke-interface {v0, p1}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method private final processImage()Landroid/os/Bundle;
    .locals 12

    .line 81
    const-string v0, "Orientation"

    iget-object v1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v1}, Lexpo/modules/camera/PictureOptions;->getSkipProcessing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 82
    invoke-direct {p0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->skipProcessing()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 87
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    check-cast v2, Ljava/io/Closeable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    move-object v3, v2

    check-cast v3, Ljava/io/ByteArrayInputStream;

    .line 88
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 90
    new-instance v5, Landroidx/exifinterface/media/ExifInterface;

    check-cast v3, Ljava/io/InputStream;

    invoke-direct {v5, v3}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/io/InputStream;)V

    .line 93
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v3}, Lexpo/modules/camera/PictureOptions;->getAdditionalExif()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 94
    invoke-static {v5, v3}, Lexpo/modules/camera/utils/CameraViewHelper;->setExifData(Landroidx/exifinterface/media/ExifInterface;Ljava/util/Map;)V

    :cond_1
    const/4 v3, 0x1

    .line 98
    invoke-virtual {v5, v0, v3}, Landroidx/exifinterface/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v6

    .line 102
    iget-boolean v7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    if-eqz v7, :cond_2

    .line 103
    invoke-static {v6}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->getMirroredOrientation(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v0, v7}, Landroidx/exifinterface/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :cond_2
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 109
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 111
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    move-object v7, v1

    .line 115
    :goto_0
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget-object v9, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v9}, Lexpo/modules/camera/PictureOptions;->getMaxDownsampling()I

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v10, 0x2

    if-gt v8, v9, :cond_3

    .line 117
    :try_start_2
    iget-object v8, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    iget-object v9, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-direct {p0, v8, v6, v9, v0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->decodeBitmap([BILexpo/modules/camera/PictureOptions;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v8

    iput-object v8, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catch_0
    move-exception v7

    .line 120
    :try_start_3
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/2addr v8, v10

    iput v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 121
    check-cast v7, Ljava/lang/Error;

    goto :goto_0

    .line 125
    :cond_3
    :goto_1
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v0, :cond_4

    .line 126
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v3, "ERR_CAMERA_OUT_OF_MEMORY"

    const-string v4, "Cannot allocate enough space to process the taken picture."

    check-cast v7, Ljava/lang/Throwable;

    invoke-interface {v0, v3, v4, v7}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 127
    :try_start_4
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    return-object v1

    .line 131
    :cond_4
    :try_start_5
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 132
    invoke-static {v5}, Lexpo/modules/camera/utils/CameraViewHelper;->getExifData(Landroidx/exifinterface/media/ExifInterface;)Landroid/os/Bundle;

    move-result-object v0

    .line 133
    const-string v6, "exif"

    invoke-virtual {v4, v6, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 138
    :cond_5
    const-string v0, "width"

    iget-object v6, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v4, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 139
    const-string v0, "height"

    iget-object v6, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-virtual {v4, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 142
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getPictureRef()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 143
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    new-instance v5, Lexpo/modules/camera/PictureRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/Bitmap;

    iget-object v6, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    invoke-direct {v5, v3, v6}, Lexpo/modules/camera/PictureRef;-><init>(Landroid/graphics/Bitmap;Lexpo/modules/kotlin/RuntimeContext;)V

    invoke-interface {v0, v5}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 144
    :try_start_6
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_3

    .line 148
    :cond_6
    :try_start_7
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    check-cast v0, Ljava/io/Closeable;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    move-object v6, v0

    check-cast v6, Ljava/io/ByteArrayOutputStream;

    .line 149
    iget-object v7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v7}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    move-result-object v7

    sget-object v8, Lexpo/modules/camera/PictureFormat;->PNG:Lexpo/modules/camera/PictureFormat;

    if-ne v7, v8, :cond_7

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_2

    :cond_7
    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 150
    :goto_2
    iget-object v8, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->getQuality()I

    move-result v9

    move-object v11, v6

    check-cast v11, Ljava/io/OutputStream;

    invoke-virtual {v8, v7, v9, v11}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 152
    iget-object v7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->directory:Ljava/io/File;

    iget-object v8, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v8}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    move-result-object v8

    invoke-virtual {v8}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v6, v8}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->writeStreamToFile(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 153
    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 155
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v3}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 156
    new-instance v3, Landroidx/exifinterface/media/ExifInterface;

    invoke-direct {v3, v7}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-static {v3, v5}, Lexpo/modules/camera/utils/CameraViewHelper;->addExifData(Landroidx/exifinterface/media/ExifInterface;Landroidx/exifinterface/media/ExifInterface;)V

    .line 159
    :cond_8
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 160
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "toString(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    const-string v5, "uri"

    invoke-virtual {v4, v5, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v3, "format"

    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v5}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    move-result-object v5

    invoke-virtual {v5}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v3}, Lexpo/modules/camera/PictureOptions;->getBase64()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 166
    const-string v3, "base64"

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    invoke-static {v5, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    :cond_9
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 148
    :try_start_9
    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 169
    :try_start_a
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    :goto_3
    return-object v4

    :catchall_0
    move-exception v3

    .line 148
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :catchall_1
    move-exception v4

    :try_start_c
    invoke-static {v0, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    move-exception v0

    .line 169
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catchall_3
    move-exception v3

    :try_start_e
    invoke-static {v2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    :catch_1
    move-exception v0

    .line 173
    instance-of v2, v0, Landroid/content/res/Resources$NotFoundException;

    const-string v3, "E_TAKING_PICTURE_FAILED"

    if-eqz v2, :cond_a

    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v4, "Documents directory of the app could not be found."

    move-object v5, v0

    check-cast v5, Ljava/lang/Throwable;

    invoke-interface {v2, v3, v4, v5}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 174
    :cond_a
    instance-of v2, v0, Ljava/io/IOException;

    if-eqz v2, :cond_b

    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v4, "An unknown I/O exception has occurred."

    move-object v5, v0

    check-cast v5, Ljava/lang/Throwable;

    invoke-interface {v2, v3, v4, v5}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 175
    :cond_b
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v4, "An incompatible parameter has been passed in. "

    move-object v5, v0

    check-cast v5, Ljava/lang/Throwable;

    invoke-interface {v2, v3, v4, v5}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 176
    :cond_c
    instance-of v2, v0, Lexpo/modules/camera/CameraExceptions$WriteImageException;

    if-eqz v2, :cond_d

    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    move-object v3, v0

    check-cast v3, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {v2, v3}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    goto :goto_4

    .line 177
    :cond_d
    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v4, "An unknown exception has occurred."

    move-object v5, v0

    check-cast v5, Ljava/lang/Throwable;

    invoke-interface {v2, v3, v4, v5}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v1
.end method

.method private final skipProcessing()Landroid/os/Bundle;
    .locals 8

    .line 186
    const-string v0, "E_TAKING_PICTURE_FAILED"

    const/4 v1, 0x0

    .line 188
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    check-cast v2, Ljava/io/Closeable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    move-object v3, v2

    check-cast v3, Ljava/io/ByteArrayOutputStream;

    .line 189
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    invoke-virtual {v3, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 192
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->directory:Ljava/io/File;

    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v5}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    move-result-object v5

    invoke-virtual {v5}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v3, v5}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->writeStreamToFile(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 193
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 196
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    new-instance v5, Landroidx/exifinterface/media/ExifInterface;

    invoke-direct {v5, v3}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 201
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 202
    const-string v6, "uri"

    invoke-virtual {v3, v6, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const-string v4, "width"

    const-string v6, "ImageWidth"

    const/4 v7, -0x1

    invoke-virtual {v5, v6, v7}, Landroidx/exifinterface/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 204
    const-string v4, "height"

    const-string v6, "ImageLength"

    invoke-virtual {v5, v6, v7}, Landroidx/exifinterface/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 206
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v4}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 207
    invoke-static {v5}, Lexpo/modules/camera/utils/CameraViewHelper;->getExifData(Landroidx/exifinterface/media/ExifInterface;)Landroid/os/Bundle;

    move-result-object v4

    .line 208
    const-string v5, "exif"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 211
    :cond_0
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v4}, Lexpo/modules/camera/PictureOptions;->getBase64()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 212
    const-string v4, "base64"

    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    const/4 v6, 0x2

    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    :cond_1
    :try_start_2
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v3

    :catchall_0
    move-exception v3

    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v4

    :try_start_4
    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v2

    .line 220
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v4, "An unknown exception has occurred."

    move-object v5, v2

    check-cast v5, Ljava/lang/Throwable;

    invoke-interface {v3, v0, v4, v5}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v2

    .line 217
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    const-string v4, "An unknown I/O exception has occurred."

    move-object v5, v2

    check-cast v5, Ljava/lang/Throwable;

    invoke-interface {v3, v0, v4, v5}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    return-object v1
.end method


# virtual methods
.method public final resolve(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 72
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lexpo/modules/camera/tasks/ResolveTakenPicture$resolve$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lexpo/modules/camera/tasks/ResolveTakenPicture$resolve$2;-><init>(Lexpo/modules/camera/tasks/ResolveTakenPicture;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
