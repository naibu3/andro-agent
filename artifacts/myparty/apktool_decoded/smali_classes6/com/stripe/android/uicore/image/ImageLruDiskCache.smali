.class public final Lcom/stripe/android/uicore/image/ImageLruDiskCache;
.super Ljava/lang/Object;
.source "ImageLruDiskCache.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/image/ImageLruDiskCache$Companion;,
        Lcom/stripe/android/uicore/image/ImageLruDiskCache$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nImageLruDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLruDiskCache.kt\ncom/stripe/android/uicore/image/ImageLruDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u000c\u0010\u001b\u001a\u00020\u0005*\u00020\u0005H\u0002J$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u001d\u001a\u00060\u001eR\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000c\u0010!\u001a\u00020\"*\u00020 H\u0002J\u000c\u0010#\u001a\u00020$*\u00020\"H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u0005H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/ImageLruDiskCache;",
        "",
        "context",
        "Landroid/content/Context;",
        "cacheFolder",
        "",
        "maxSizeBytes",
        "",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;J)V",
        "diskLruCache",
        "Lcom/jakewharton/disklrucache/DiskLruCache;",
        "getDiskLruCache",
        "()Lcom/jakewharton/disklrucache/DiskLruCache;",
        "diskLruCache$delegate",
        "Lkotlin/Lazy;",
        "put",
        "",
        "key",
        "image",
        "Lcom/stripe/android/uicore/image/LoadedImage;",
        "get",
        "containsKey",
        "",
        "clearCache",
        "debug",
        "s",
        "toKey",
        "writeImageToFile",
        "editor",
        "Lcom/jakewharton/disklrucache/DiskLruCache$Editor;",
        "contentType",
        "Lcom/stripe/android/uicore/image/LoadedImage$ContentType;",
        "toCompressFormat",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "quality",
        "",
        "getDiskCacheDir",
        "Ljava/io/File;",
        "uniqueName",
        "Companion",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field private static final APP_VERSION:I = 0x2

.field private static final Companion:Lcom/stripe/android/uicore/image/ImageLruDiskCache$Companion;

.field private static final IO_BUFFER_SIZE:I = 0x2000

.field private static final JPEG_COMPRESS_QUALITY:I = 0x50

.field private static final PNG_COMPRESS_QUALITY:I = 0x64

.field private static final TAG:Ljava/lang/String; = "stripe_image_disk_cache"

.field private static final VALUE_COUNT:I = 0x2

.field private static final WEBP_COMPRESS_QUALITY:I = 0x50


# instance fields
.field private final diskLruCache$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$B64L7PXMI4NjjxNnxTuKRb6GCGg(Lcom/stripe/android/uicore/image/ImageLruDiskCache;Landroid/content/Context;Ljava/lang/String;J)Lcom/jakewharton/disklrucache/DiskLruCache;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->diskLruCache_delegate$lambda$0(Lcom/stripe/android/uicore/image/ImageLruDiskCache;Landroid/content/Context;Ljava/lang/String;J)Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->Companion:Lcom/stripe/android/uicore/image/ImageLruDiskCache$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheFolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v1, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/image/ImageLruDiskCache;Landroid/content/Context;Ljava/lang/String;J)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, v2, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->diskLruCache$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-wide/32 p3, 0xa00000

    .line 31
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;-><init>(Landroid/content/Context;Ljava/lang/String;J)V

    return-void
.end method

.method private final debug(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private static final diskLruCache_delegate$lambda$0(Lcom/stripe/android/uicore/image/ImageLruDiskCache;Landroid/content/Context;Ljava/lang/String;J)Lcom/jakewharton/disklrucache/DiskLruCache;
    .locals 0

    .line 40
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getDiskCacheDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    const/4 p1, 0x2

    .line 38
    invoke-static {p0, p1, p1, p3, p4}, Lcom/jakewharton/disklrucache/DiskLruCache;->open(Ljava/io/File;IIJ)Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 49
    const-string p1, "error opening cache"

    check-cast p0, Ljava/lang/Throwable;

    const-string p2, "stripe_image_disk_cache"

    invoke-static {p2, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method private final getDiskCacheDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 187
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getPath(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    new-instance v0, Ljava/io/File;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final getDiskLruCache()Lcom/jakewharton/disklrucache/DiskLruCache;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->diskLruCache$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jakewharton/disklrucache/DiskLruCache;

    return-object v0
.end method

.method private final quality(Landroid/graphics/Bitmap$CompressFormat;)I
    .locals 3

    .line 179
    sget-object v0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Landroid/graphics/Bitmap$CompressFormat;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/16 v2, 0x50

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    return v2

    .line 183
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected compress format: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 p1, 0x64

    return p1

    :cond_2
    return v2
.end method

.method private final toCompressFormat(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;)Landroid/graphics/Bitmap$CompressFormat;
    .locals 3

    .line 173
    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Jpeg:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    if-ne p1, v0, :cond_0

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    return-object p1

    .line 174
    :cond_0
    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Png:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    if-ne p1, v0, :cond_1

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    return-object p1

    .line 175
    :cond_1
    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Webp:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    if-ne p1, v0, :cond_2

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    return-object p1

    .line 176
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-interface {p1}, Lcom/stripe/android/uicore/image/LoadedImage$ContentType;->getValue()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected image type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final toKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 151
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final writeImageToFile(Lcom/stripe/android/uicore/image/LoadedImage;Lcom/jakewharton/disklrucache/DiskLruCache$Editor;Lcom/stripe/android/uicore/image/LoadedImage$ContentType;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 161
    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->newOutputStream(I)Ljava/io/OutputStream;

    move-result-object v2

    const/16 v3, 0x2000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    check-cast v1, Ljava/io/OutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 162
    :try_start_1
    invoke-virtual {p1}, Lcom/stripe/android/uicore/image/LoadedImage;->getContentType()Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/uicore/image/LoadedImage$ContentType;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p2, v2, v0}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->set(ILjava/lang/String;)V

    .line 164
    invoke-direct {p0, p3}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->toCompressFormat(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object p2

    .line 166
    invoke-virtual {p1}, Lcom/stripe/android/uicore/image/LoadedImage;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, p2}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->quality(Landroid/graphics/Bitmap$CompressFormat;)I

    move-result p3

    invoke-virtual {p1, p2, p3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    return p1

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_0
    throw p1
.end method


# virtual methods
.method public final clearCache()V
    .locals 3

    .line 135
    const-string v0, "disk cache CLEARED"

    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->debug(Ljava/lang/String;)V

    .line 137
    :try_start_0
    invoke-direct {p0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getDiskLruCache()Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jakewharton/disklrucache/DiskLruCache;->delete()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 139
    const-string v1, "error clearing cache"

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, "stripe_image_disk_cache"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final containsKey(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 124
    :try_start_0
    invoke-direct {p0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getDiskLruCache()Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->toKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/jakewharton/disklrucache/DiskLruCache;->get(Ljava/lang/String;)Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-eqz p1, :cond_2

    .line 129
    invoke-virtual {p1}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->close()V

    :cond_2
    return v0

    :catchall_0
    move-exception p1

    throw p1

    :catch_0
    move-exception p1

    .line 127
    const-string v1, "stripe_image_disk_cache"

    const-string v2, "error reading from cache"

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v0
.end method

.method public final get(Ljava/lang/String;)Lcom/stripe/android/uicore/image/LoadedImage;
    .locals 8

    const-string v0, "image not in cache: "

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->toKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 89
    :try_start_0
    invoke-direct {p0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getDiskLruCache()Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Lcom/jakewharton/disklrucache/DiskLruCache;->get(Ljava/lang/String;)Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_1

    .line 92
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 91
    invoke-direct {p0, v3}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->debug(Ljava/lang/String;)V

    return-object v1

    :cond_1
    const/4 v3, 0x0

    .line 96
    invoke-virtual {v2, v3}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object v3

    const-string v4, "getInputStream(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    .line 97
    invoke-virtual {v2, v4}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 98
    new-instance v5, Ljava/io/BufferedInputStream;

    const/16 v6, 0x2000

    invoke-direct {v5, v3, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 99
    check-cast v5, Ljava/io/InputStream;

    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 101
    new-instance v5, Lcom/stripe/android/uicore/image/LoadedImage;

    .line 102
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 103
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 101
    invoke-direct {v5, v4, v3}, Lcom/stripe/android/uicore/image/LoadedImage;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    invoke-virtual {v2}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->close()V

    move-object v1, v5

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_4

    :catch_0
    move-exception v3

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception v2

    move-object v3, v1

    .line 106
    :goto_1
    :try_start_2
    const-string v4, "stripe_image_disk_cache"

    const-string v5, "error getting bitmap from cache"

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v4, v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v3, :cond_2

    .line 108
    invoke-virtual {v3}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->close()V

    :cond_2
    :goto_2
    if-nez v1, :cond_3

    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 114
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "image read from disk "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 110
    :goto_3
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->debug(Ljava/lang/String;)V

    return-object v1

    :catchall_2
    move-exception p1

    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_4

    .line 108
    invoke-virtual {v1}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->close()V

    :cond_4
    throw p1
.end method

.method public final put(Ljava/lang/String;Lcom/stripe/android/uicore/image/LoadedImage;)V
    .locals 6

    const-string v0, "stripe_image_disk_cache"

    const-string v1, "image put on disk cache "

    const-string v2, "ERROR on: image put on disk cache "

    const-string v3, "key"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "image"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->toKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 58
    const-string p1, "Image already cached"

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->debug(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 61
    :try_start_0
    invoke-direct {p0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getDiskLruCache()Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4, v3}, Lcom/jakewharton/disklrucache/DiskLruCache;->edit(Ljava/lang/String;)Lcom/jakewharton/disklrucache/DiskLruCache$Editor;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move-object v4, p1

    :goto_0
    if-nez v4, :cond_2

    return-void

    .line 67
    :cond_2
    :try_start_1
    invoke-virtual {p2}, Lcom/stripe/android/uicore/image/LoadedImage;->getContentType()Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    move-result-object v5

    .line 64
    invoke-direct {p0, p2, v4, v5}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->writeImageToFile(Lcom/stripe/android/uicore/image/LoadedImage;Lcom/jakewharton/disklrucache/DiskLruCache$Editor;Lcom/stripe/android/uicore/image/LoadedImage$ContentType;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 70
    invoke-direct {p0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getDiskLruCache()Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/jakewharton/disklrucache/DiskLruCache;->flush()V

    .line 71
    :cond_3
    invoke-virtual {v4}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->commit()V

    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->debug(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-void

    .line 74
    :cond_4
    invoke-virtual {v4}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->abort()V

    .line 75
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    move-object v4, p1

    .line 78
    :catch_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, v4

    check-cast p2, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->abort()V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_5
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    return-void
.end method
