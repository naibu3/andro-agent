.class public final Lexpo/modules/camera/analyzers/BarcodeAnalyzer;
.super Ljava/lang/Object;
.source "BarcodeAnalyzer.kt"

# interfaces
.implements Landroidx/camera/core/ImageAnalysis$Analyzer;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBarcodeAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeAnalyzer.kt\nexpo/modules/camera/analyzers/BarcodeAnalyzer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n1563#2:94\n1634#2,3:95\n2783#2,7:98\n1#3:105\n13537#4,3:106\n*S KotlinDebug\n*F\n+ 1 BarcodeAnalyzer.kt\nexpo/modules/camera/analyzers/BarcodeAnalyzer\n*L\n21#1:94\n21#1:95,3\n21#1:98,7\n49#1:106,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/camera/analyzers/BarcodeAnalyzer;",
        "Landroidx/camera/core/ImageAnalysis$Analyzer;",
        "lensFacing",
        "Lexpo/modules/camera/records/CameraType;",
        "formats",
        "",
        "Lexpo/modules/camera/records/BarcodeType;",
        "onComplete",
        "Lkotlin/Function1;",
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "",
        "<init>",
        "(Lexpo/modules/camera/records/CameraType;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V",
        "getOnComplete",
        "()Lkotlin/jvm/functions/Function1;",
        "barcodeFormats",
        "",
        "barcodeScannerOptions",
        "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;",
        "barcodeScanner",
        "Lcom/google/mlkit/vision/barcode/BarcodeScanner;",
        "analyze",
        "imageProxy",
        "Landroidx/camera/core/ImageProxy;",
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
.field private final barcodeFormats:I

.field private barcodeScanner:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

.field private barcodeScannerOptions:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

.field private final lensFacing:Lexpo/modules/camera/records/CameraType;

.field private final onComplete:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lexpo/modules/camera/utils/BarCodeScannerResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$JQ9biyV9H921KtaIhJHksY-ztCw(Landroidx/camera/core/ImageProxy;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$9(Landroidx/camera/core/ImageProxy;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Ql1VUZlTRcStAR_uTeqTeYEz8rw(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;Landroidx/camera/core/ImageProxy;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$6(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;Landroidx/camera/core/ImageProxy;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$py8gWFOqtIBsbOqut-TrD60Wgkc(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic $r8$lambda$wMaLoG3qGulPfCKPmxmCPKCyoLA(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$8(Ljava/lang/Exception;)V

    return-void
.end method

.method public constructor <init>(Lexpo/modules/camera/records/CameraType;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/camera/records/CameraType;",
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lexpo/modules/camera/utils/BarCodeScannerResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lensFacing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->lensFacing:Lexpo/modules/camera/records/CameraType;

    iput-object p3, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->onComplete:Lkotlin/jvm/functions/Function1;

    .line 18
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    move p1, p3

    goto :goto_2

    .line 21
    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    .line 94
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 95
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 96
    check-cast v0, Lexpo/modules/camera/records/BarcodeType;

    .line 21
    invoke-virtual {v0}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 96
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 97
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 94
    check-cast p1, Ljava/lang/Iterable;

    .line 98
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 101
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    or-int/2addr p2, v0

    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_1

    .line 104
    :cond_2
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 18
    :goto_2
    iput p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeFormats:I

    .line 26
    new-instance p2, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;

    invoke-direct {p2}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;-><init>()V

    .line 27
    new-array p3, p3, [I

    invoke-virtual {p2, p1, p3}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->setBarcodeFormats(I[I)Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;

    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->build()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeScannerOptions:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    .line 29
    invoke-static {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScanning;->getClient(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    move-result-object p1

    const-string p2, "getClient(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeScanner:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    return-void

    .line 99
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Empty collection can\'t be reduced."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final analyze$lambda$6(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;Landroidx/camera/core/ImageProxy;Ljava/util/List;)Lkotlin/Unit;
    .locals 9

    .line 40
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 43
    :cond_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/mlkit/vision/barcode/common/Barcode;

    .line 44
    invoke-virtual {p2}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getRawValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getRawBytes()[B

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/String;

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v4, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    move-object v4, v0

    .line 46
    :goto_0
    invoke-virtual {p2}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getCornerPoints()[Landroid/graphics/Point;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 48
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [I

    .line 107
    array-length v2, v0

    const/4 v3, 0x0

    move v5, v3

    :goto_1
    if-ge v3, v2, :cond_3

    aget-object v6, v0, v3

    add-int/lit8 v7, v5, 0x1

    mul-int/lit8 v5, v5, 0x2

    .line 50
    iget v8, v6, Landroid/graphics/Point;->x:I

    aput v8, v1, v5

    add-int/lit8 v5, v5, 0x1

    .line 51
    iget v6, v6, Landroid/graphics/Point;->y:I

    aput v6, v1, v5

    add-int/lit8 v3, v3, 0x1

    move v5, v7

    goto :goto_1

    .line 53
    :cond_3
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toMutableList([I)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_5

    .line 54
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    :cond_5
    move-object v6, v0

    .line 56
    sget-object v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseExtraDate(Lcom/google/mlkit/vision/barcode/common/Barcode;)Landroid/os/Bundle;

    move-result-object v5

    .line 57
    iget-object p0, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->onComplete:Lkotlin/jvm/functions/Function1;

    .line 58
    new-instance v1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 59
    invoke-virtual {p2}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getFormat()I

    move-result v2

    .line 60
    invoke-virtual {p2}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getDisplayValue()Ljava/lang/String;

    move-result-object v3

    .line 64
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    move-result v7

    .line 65
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    move-result v8

    .line 58
    invoke-direct/range {v1 .. v8}, Lexpo/modules/camera/utils/BarCodeScannerResult;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V

    .line 57
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final analyze$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 39
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final analyze$lambda$8(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "Barcode scanning failed"

    :cond_1
    const-string v0, "SCANNER"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final analyze$lambda$9(Landroidx/camera/core/ImageProxy;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->close()V

    return-void
.end method


# virtual methods
.method public analyze(Landroidx/camera/core/ImageProxy;)V
    .locals 3

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImage()Landroid/media/Image;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 35
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/ImageInfo;->getRotationDegrees()I

    move-result v1

    iget-object v2, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->lensFacing:Lexpo/modules/camera/records/CameraType;

    invoke-static {v1, v2}, Lexpo/modules/camera/CameraViewHelper;->getCorrectCameraRotation(ILexpo/modules/camera/records/CameraType;)I

    move-result v1

    .line 36
    invoke-static {v0, v1}, Lcom/google/mlkit/vision/common/InputImage;->fromMediaImage(Landroid/media/Image;I)Lcom/google/mlkit/vision/common/InputImage;

    move-result-object v0

    const-string v1, "fromMediaImage(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeScanner:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    invoke-interface {v1, v0}, Lcom/google/mlkit/vision/barcode/BarcodeScanner;->process(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 39
    new-instance v1, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;Landroidx/camera/core/ImageProxy;)V

    new-instance v2, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda1;

    invoke-direct {v2, v1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 69
    new-instance v1, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda2;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 72
    new-instance v1, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda3;

    invoke-direct {v1, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer$$ExternalSyntheticLambda3;-><init>(Landroidx/camera/core/ImageProxy;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public final getOnComplete()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lexpo/modules/camera/utils/BarCodeScannerResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->onComplete:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
