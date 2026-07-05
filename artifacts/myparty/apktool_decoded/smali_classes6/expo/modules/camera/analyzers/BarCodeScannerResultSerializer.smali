.class public final Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;
.super Ljava/lang/Object;
.source "BarcodeScannerResultSerializer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBarcodeScannerResultSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerResultSerializer.kt\nexpo/modules/camera/analyzers/BarCodeScannerResultSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJB\u0010\u000f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\u0008\u0012\u0004\u0012\u00020\u0005`\u0012\u0012\u0004\u0012\u00020\u00050\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000cJ\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0002\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;",
        "",
        "<init>",
        "()V",
        "toBundle",
        "Landroid/os/Bundle;",
        "result",
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "density",
        "",
        "parseBarcodeScanningResult",
        "barcode",
        "Lcom/google/mlkit/vision/barcode/common/Barcode;",
        "inputImage",
        "Lcom/google/mlkit/vision/common/InputImage;",
        "getCornerPointsAndBoundingBox",
        "Landroid/util/Pair;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "cornerPoints",
        "",
        "",
        "boundingBox",
        "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
        "parseExtraDate",
        "getSize",
        "width",
        "height",
        "getPoint",
        "x",
        "y",
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


# static fields
.field public static final INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    invoke-direct {v0}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;-><init>()V

    sput-object v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;F)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
            "F)",
            "Landroid/util/Pair<",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v3, v1, v2}, Lkotlin/internal/ProgressionUtilKt;->getProgressionLastElement(III)I

    move-result v1

    if-ltz v1, :cond_0

    .line 46
    :goto_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, p3

    add-int/lit8 v4, v3, 0x1

    .line 47
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, p3

    .line 49
    invoke-direct {p0, v2, v4}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getPoint(FF)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v3, v1, :cond_0

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 52
    sget-object v1, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getX()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, p3

    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getY()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, p3

    invoke-direct {v1, v2, v3}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getPoint(FF)Landroid/os/Bundle;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    const-string v3, "origin"

    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 53
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, p3

    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, p3

    invoke-direct {v1, v2, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getSize(FF)Landroid/os/Bundle;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    const-string p3, "size"

    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 55
    new-instance p2, Landroid/util/Pair;

    invoke-direct {p2, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method private final getPoint(FF)Landroid/os/Bundle;
    .locals 2

    .line 170
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v1, "x"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 172
    const-string p1, "y"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v0
.end method

.method private final getSize(FF)Landroid/os/Bundle;
    .locals 2

    .line 164
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 165
    const-string v1, "width"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 166
    const-string p1, "height"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v0
.end method

.method public static synthetic parseBarcodeScanningResult$default(Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;Lcom/google/mlkit/vision/barcode/common/Barcode;Lcom/google/mlkit/vision/common/InputImage;ILjava/lang/Object;)Lexpo/modules/camera/utils/BarCodeScannerResult;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 21
    :cond_0
    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseBarcodeScanningResult(Lcom/google/mlkit/vision/barcode/common/Barcode;Lcom/google/mlkit/vision/common/InputImage;)Lexpo/modules/camera/utils/BarCodeScannerResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final parseBarcodeScanningResult(Lcom/google/mlkit/vision/barcode/common/Barcode;Lcom/google/mlkit/vision/common/InputImage;)Lexpo/modules/camera/utils/BarCodeScannerResult;
    .locals 11

    const-string v0, "barcode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getRawValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getRawBytes()[B

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/String;

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v4, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    move-object v4, v0

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getValueType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    move-object v3, v4

    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getDisplayValue()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 28
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 29
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getCornerPoints()[Landroid/graphics/Point;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 30
    array-length v5, v0

    move v7, v2

    :goto_2
    if-ge v7, v5, :cond_3

    aget-object v8, v0, v7

    const/4 v9, 0x2

    .line 31
    new-array v9, v9, [Ljava/lang/Integer;

    iget v10, v8, Landroid/graphics/Point;->x:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v2

    iget v8, v8, Landroid/graphics/Point;->y:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v9, v1

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v6, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 35
    :cond_3
    invoke-virtual {p0, p1}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseExtraDate(Lcom/google/mlkit/vision/barcode/common/Barcode;)Landroid/os/Bundle;

    move-result-object v5

    .line 36
    new-instance v1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getFormat()I

    move-result p1

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getHeight()I

    move-result v0

    move v7, v0

    goto :goto_3

    :cond_4
    move v7, v2

    :goto_3
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getWidth()I

    move-result v2

    :cond_5
    move v8, v2

    move v2, p1

    invoke-direct/range {v1 .. v8}, Lexpo/modules/camera/utils/BarCodeScannerResult;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V

    return-object v1
.end method

.method public final parseExtraDate(Lcom/google/mlkit/vision/barcode/common/Barcode;)Landroid/os/Bundle;
    .locals 12

    const-string v0, "barcode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 61
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getValueType()I

    move-result v1

    const/4 v2, 0x1

    const-string v3, "lastName"

    const-string v4, "middleName"

    const-string v5, "phone"

    const-string v6, "address"

    const-string v7, "email"

    const-string v8, "firstName"

    const-string v9, "url"

    const-string v10, "type"

    const/4 v11, 0x0

    if-eq v1, v2, :cond_1e

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1a

    const/4 v2, 0x4

    if-eq v1, v2, :cond_17

    const/4 v2, 0x6

    if-eq v1, v2, :cond_14

    packed-switch v1, :pswitch_data_0

    return-object v0

    .line 115
    :pswitch_0
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getDriverLicense()Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;

    move-result-object p1

    .line 117
    const-string v1, "driverLicense"

    invoke-virtual {v0, v10, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 118
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getFirstName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v11

    :goto_0
    invoke-virtual {v0, v8, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 119
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getMiddleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v11

    :goto_1
    invoke-virtual {v0, v4, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 120
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getLastName()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v11

    :goto_2
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    .line 121
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getLicenseNumber()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v11

    :goto_3
    const-string v2, "licenseNumber"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    .line 122
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getExpiryDate()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v11

    :goto_4
    const-string v2, "expiryDate"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_5

    .line 123
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getIssueDate()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object v1, v11

    :goto_5
    const-string v2, "issueDate"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    .line 124
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getAddressStreet()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_6
    move-object v1, v11

    :goto_6
    const-string v2, "addressStreet"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_7

    .line 125
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getAddressCity()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_7
    move-object v1, v11

    :goto_7
    const-string v2, "addressCity"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_8

    .line 126
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;->getAddressState()Ljava/lang/String;

    move-result-object v11

    :cond_8
    const-string p1, "addressState"

    invoke-virtual {v0, p1, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 103
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getCalendarEvent()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;

    move-result-object p1

    .line 105
    const-string v1, "calendarEvent"

    invoke-virtual {v0, v10, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_9

    .line 106
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;->getSummary()Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :cond_9
    move-object v1, v11

    :goto_8
    const-string v2, "summary"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_a

    .line 107
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;->getDescription()Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_a
    move-object v1, v11

    :goto_9
    const-string v2, "description"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_b

    .line 108
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;->getLocation()Ljava/lang/String;

    move-result-object v1

    goto :goto_a

    :cond_b
    move-object v1, v11

    :goto_a
    const-string v2, "location"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_c

    .line 109
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;->getStart()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_c
    move-object v1, v11

    :goto_b
    const-string v2, "start"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_d

    .line 110
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;->getEnd()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->toString()Ljava/lang/String;

    move-result-object v11

    :cond_d
    const-string p1, "end"

    invoke-virtual {v0, p1, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 79
    :pswitch_2
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getGeoPoint()Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;

    move-result-object p1

    .line 81
    const-string v1, "geoPoint"

    invoke-virtual {v0, v10, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_e

    .line 82
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;->getLat()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_c

    :cond_e
    move-object v1, v11

    :goto_c
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "lat"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_f

    .line 83
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;->getLng()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    :cond_f
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "lng"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 150
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getWifi()Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;

    move-result-object p1

    .line 152
    const-string v1, "wifi"

    invoke-virtual {v0, v10, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_10

    .line 153
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->getSsid()Ljava/lang/String;

    move-result-object v1

    goto :goto_d

    :cond_10
    move-object v1, v11

    :goto_d
    const-string v2, "ssid"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_11

    .line 154
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->getPassword()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    :cond_11
    move-object v1, v11

    :goto_e
    const-string v2, "password"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_12

    .line 155
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->getEncryptionType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    :cond_12
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v10, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 97
    :pswitch_4
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getUrl()Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;

    move-result-object p1

    .line 98
    invoke-virtual {v0, v10, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_13

    .line 99
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;->getUrl()Ljava/lang/String;

    move-result-object v11

    :cond_13
    invoke-virtual {v0, v9, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 88
    :cond_14
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getSms()Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;

    move-result-object p1

    .line 90
    const-string v1, "sms"

    invoke-virtual {v0, v10, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_15

    .line 91
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :cond_15
    move-object v1, v11

    :goto_f
    const-string v2, "phoneNumber"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_16

    .line 92
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;->getMessage()Ljava/lang/String;

    move-result-object v11

    :cond_16
    const-string p1, "message"

    invoke-virtual {v0, p1, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 141
    :cond_17
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getPhone()Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    move-result-object p1

    .line 143
    invoke-virtual {v0, v10, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_18

    .line 144
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->getNumber()Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    :cond_18
    move-object v1, v11

    :goto_10
    const-string v2, "number"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_19

    .line 145
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->getType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    :cond_19
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "phoneNumberType"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 131
    :cond_1a
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getEmail()Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    move-result-object p1

    .line 133
    invoke-virtual {v0, v10, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1b

    .line 134
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;->getAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_11

    :cond_1b
    move-object v1, v11

    :goto_11
    invoke-virtual {v0, v6, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1c

    .line 135
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;->getSubject()Ljava/lang/String;

    move-result-object v1

    goto :goto_12

    :cond_1c
    move-object v1, v11

    :goto_12
    const-string v2, "subject"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1d

    .line 136
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;->getBody()Ljava/lang/String;

    move-result-object v11

    :cond_1d
    const-string p1, "body"

    invoke-virtual {v0, p1, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 63
    :cond_1e
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getContactInfo()Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;

    move-result-object p1

    .line 65
    const-string v1, "contactInfo"

    invoke-virtual {v0, v10, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1f

    .line 66
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getName()Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;

    move-result-object v1

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;->getFirst()Ljava/lang/String;

    move-result-object v1

    goto :goto_13

    :cond_1f
    move-object v1, v11

    :goto_13
    invoke-virtual {v0, v8, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_20

    .line 67
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getName()Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;->getMiddle()Ljava/lang/String;

    move-result-object v1

    goto :goto_14

    :cond_20
    move-object v1, v11

    :goto_14
    invoke-virtual {v0, v4, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_21

    .line 68
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getName()Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;

    move-result-object v1

    if-eqz v1, :cond_21

    invoke-virtual {v1}, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;->getLast()Ljava/lang/String;

    move-result-object v1

    goto :goto_15

    :cond_21
    move-object v1, v11

    :goto_15
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_22

    .line 69
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_16

    :cond_22
    move-object v1, v11

    :goto_16
    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_23

    .line 70
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getOrganization()Ljava/lang/String;

    move-result-object v1

    goto :goto_17

    :cond_23
    move-object v1, v11

    :goto_17
    const-string v2, "organization"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_24

    .line 71
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getEmails()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_24

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    if-eqz v1, :cond_24

    invoke-virtual {v1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;->getAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_18

    :cond_24
    move-object v1, v11

    :goto_18
    invoke-virtual {v0, v7, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_25

    .line 72
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getPhones()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_25

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    if-eqz v1, :cond_25

    invoke-virtual {v1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->getNumber()Ljava/lang/String;

    move-result-object v1

    goto :goto_19

    :cond_25
    move-object v1, v11

    :goto_19
    invoke-virtual {v0, v5, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_26

    .line 73
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getUrls()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_26

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1a

    :cond_26
    move-object v1, v11

    :goto_1a
    invoke-virtual {v0, v9, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_27

    .line 74
    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;->getAddresses()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_27

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;

    if-eqz p1, :cond_27

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;->getAddressLines()[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_27

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v11, p1

    check-cast v11, Ljava/lang/String;

    :cond_27
    invoke-virtual {v0, v6, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toBundle(Lexpo/modules/camera/utils/BarCodeScannerResult;F)Landroid/os/Bundle;
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    const-string v1, "data"

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    const-string v1, "raw"

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getRaw()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    const-string v1, "type"

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 15
    const-string v1, "extra"

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getExtra()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    sget-object v1, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getCornerPoints()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getBoundingBox()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;

    move-result-object p1

    invoke-direct {v1, v2, p1, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;F)Landroid/util/Pair;

    move-result-object p1

    .line 17
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    const-string v1, "cornerPoints"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 18
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Landroid/os/Bundle;

    const-string p2, "bounds"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
