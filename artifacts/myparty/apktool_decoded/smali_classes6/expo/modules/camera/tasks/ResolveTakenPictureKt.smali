.class public final Lexpo/modules/camera/tasks/ResolveTakenPictureKt;
.super Ljava/lang/Object;
.source "ResolveTakenPicture.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012\u001a \u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "DIRECTORY_NOT_FOUND_MSG",
        "",
        "UNKNOWN_IO_EXCEPTION_MSG",
        "UNKNOWN_EXCEPTION_MSG",
        "PARAMETER_EXCEPTION_MSG",
        "OUT_OF_MEMORY_EXCEPTION_MSG",
        "ERROR_TAG",
        "OUT_OF_MEMORY_TAG",
        "DIRECTORY_NAME",
        "BASE64_KEY",
        "HEIGHT_KEY",
        "WIDTH_KEY",
        "EXIF_KEY",
        "DATA_KEY",
        "URI_KEY",
        "FORMAT_KEY",
        "ID_KEY",
        "getMirroredOrientation",
        "",
        "orientation",
        "writeStreamToFile",
        "directory",
        "Ljava/io/File;",
        "inputStream",
        "Ljava/io/ByteArrayOutputStream;",
        "extension",
        "expo-camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BASE64_KEY:Ljava/lang/String; = "base64"

.field private static final DATA_KEY:Ljava/lang/String; = "data"

.field private static final DIRECTORY_NAME:Ljava/lang/String; = "Camera"

.field private static final DIRECTORY_NOT_FOUND_MSG:Ljava/lang/String; = "Documents directory of the app could not be found."

.field private static final ERROR_TAG:Ljava/lang/String; = "E_TAKING_PICTURE_FAILED"

.field private static final EXIF_KEY:Ljava/lang/String; = "exif"

.field private static final FORMAT_KEY:Ljava/lang/String; = "format"

.field private static final HEIGHT_KEY:Ljava/lang/String; = "height"

.field private static final ID_KEY:Ljava/lang/String; = "id"

.field private static final OUT_OF_MEMORY_EXCEPTION_MSG:Ljava/lang/String; = "Cannot allocate enough space to process the taken picture."

.field private static final OUT_OF_MEMORY_TAG:Ljava/lang/String; = "ERR_CAMERA_OUT_OF_MEMORY"

.field private static final PARAMETER_EXCEPTION_MSG:Ljava/lang/String; = "An incompatible parameter has been passed in. "

.field private static final UNKNOWN_EXCEPTION_MSG:Ljava/lang/String; = "An unknown exception has occurred."

.field private static final UNKNOWN_IO_EXCEPTION_MSG:Ljava/lang/String; = "An unknown I/O exception has occurred."

.field private static final URI_KEY:Ljava/lang/String; = "uri"

.field private static final WIDTH_KEY:Ljava/lang/String; = "width"


# direct methods
.method public static final getMirroredOrientation(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return p0

    :pswitch_0
    const/4 p0, 0x7

    return p0

    :pswitch_1
    const/16 p0, 0x8

    return p0

    :pswitch_2
    const/4 p0, 0x5

    return p0

    :pswitch_3
    const/4 p0, 0x6

    return p0

    :pswitch_4
    const/4 p0, 0x3

    return p0

    :pswitch_5
    const/4 p0, 0x4

    return p0

    :pswitch_6
    const/4 p0, 0x1

    return p0

    :pswitch_7
    const/4 p0, 0x2

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final writeStreamToFile(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "directory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extension"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    :try_start_0
    sget-object v0, Lexpo/modules/camera/utils/FileSystemUtils;->INSTANCE:Lexpo/modules/camera/utils/FileSystemUtils;

    const-string v1, "Camera"

    invoke-virtual {v0, p0, v1, p2}, Lexpo/modules/camera/utils/FileSystemUtils;->generateOutputPath(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 294
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/io/Closeable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    move-object v0, p2

    check-cast v0, Ljava/io/FileOutputStream;

    .line 295
    check-cast v0, Ljava/io/OutputStream;

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 296
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x0

    .line 294
    :try_start_2
    invoke-static {p2, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-static {p2, p0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 299
    new-instance p1, Lexpo/modules/camera/CameraExceptions$WriteImageException;

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lexpo/modules/camera/CameraExceptions$WriteImageException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic writeStreamToFile$default(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    .line 291
    sget-object p2, Lexpo/modules/camera/PictureFormat;->JPEG:Lexpo/modules/camera/PictureFormat;

    invoke-virtual {p2}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    move-result-object p2

    .line 290
    :cond_0
    invoke-static {p0, p1, p2}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->writeStreamToFile(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
