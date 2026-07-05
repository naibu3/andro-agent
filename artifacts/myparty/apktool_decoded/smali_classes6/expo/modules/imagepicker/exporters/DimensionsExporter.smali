.class public final Lexpo/modules/imagepicker/exporters/DimensionsExporter;
.super Ljava/lang/Object;
.source "DimensionsExporter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDimensionsExporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimensionsExporter.kt\nexpo/modules/imagepicker/exporters/DimensionsExporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0006\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/imagepicker/exporters/DimensionsExporter;",
        "",
        "file",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "isRotatedLandscape",
        "",
        "()Z",
        "isRotatedLandscape$delegate",
        "Lkotlin/Lazy;",
        "metadata",
        "Landroid/graphics/BitmapFactory$Options;",
        "getMetadata",
        "()Landroid/graphics/BitmapFactory$Options;",
        "metadata$delegate",
        "width",
        "",
        "getWidth",
        "()I",
        "height",
        "getHeight",
        "expo-image-picker_release"
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
.field private final file:Ljava/io/File;

.field private final isRotatedLandscape$delegate:Lkotlin/Lazy;

.field private final metadata$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$Fofy5NJzPWkwgKnaaz5RtIr2sZM(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Z
    .locals 0

    invoke-static {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape_delegate$lambda$0(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$c3OxBCif8pMnAqJWoDjHPlXd7fw(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    invoke-static {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->metadata_delegate$lambda$2(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Landroid/graphics/BitmapFactory$Options;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->file:Ljava/io/File;

    .line 12
    new-instance p1, Lexpo/modules/imagepicker/exporters/DimensionsExporter$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape$delegate:Lkotlin/Lazy;

    .line 23
    new-instance p1, Lexpo/modules/imagepicker/exporters/DimensionsExporter$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter$$ExternalSyntheticLambda1;-><init>(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->metadata$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getMetadata()Landroid/graphics/BitmapFactory$Options;
    .locals 1

    .line 23
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->metadata$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/BitmapFactory$Options;

    return-object v0
.end method

.method private final isRotatedLandscape()Z
    .locals 1

    .line 12
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private static final isRotatedLandscape_delegate$lambda$0(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Z
    .locals 2

    .line 13
    new-instance v0, Landroidx/exifinterface/media/ExifInterface;

    iget-object p0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->file:Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 14
    const-string p0, "Orientation"

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroidx/exifinterface/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final metadata_delegate$lambda$2(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 24
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 25
    iget-object p0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->file:Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method public final getHeight()I
    .locals 1

    .line 33
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    return v0

    :cond_0
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 30
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    return v0

    :cond_0
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    return v0
.end method
