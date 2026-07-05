.class public final Lexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1;
.super Ljava/lang/Object;
.source "ImagePickerConstants.kt"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/imagepicker/ImagePickerConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nImagePickerConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickerConstants.kt\nexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n77#2:166\n97#2,2:167\n99#2,3:173\n1563#3:169\n1634#3,3:170\n*S KotlinDebug\n*F\n+ 1 ImagePickerConstants.kt\nexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1\n*L\n19#1:166\n19#1:167,2\n19#1:173,3\n19#1:169\n19#1:170,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001b\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0005H\u0096\u0002R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "expo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1",
        "",
        "Lkotlin/Pair;",
        "",
        "iterator",
        "",
        "typeToTags",
        "",
        "",
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
.field private final typeToTags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 26

    .line 13
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 23
    new-array v1, v0, [Lkotlin/Pair;

    const/16 v2, 0x2e

    .line 24
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "Artist"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 25
    const-string v3, "CFAPattern"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    .line 26
    const-string v3, "ComponentsConfiguration"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    .line 27
    const-string v3, "Copyright"

    aput-object v3, v2, v0

    .line 28
    const-string v3, "DateTime"

    const/4 v7, 0x4

    aput-object v3, v2, v7

    .line 29
    const-string v3, "DateTimeDigitized"

    const/4 v8, 0x5

    aput-object v3, v2, v8

    .line 30
    const-string v3, "DateTimeOriginal"

    const/4 v9, 0x6

    aput-object v3, v2, v9

    .line 31
    const-string v3, "DeviceSettingDescription"

    const/4 v10, 0x7

    aput-object v3, v2, v10

    .line 32
    const-string v3, "ExifVersion"

    const/16 v11, 0x8

    aput-object v3, v2, v11

    .line 33
    const-string v3, "FileSource"

    const/16 v12, 0x9

    aput-object v3, v2, v12

    .line 34
    const-string v3, "FlashpixVersion"

    const/16 v13, 0xa

    aput-object v3, v2, v13

    .line 35
    const-string v3, "GPSAreaInformation"

    const/16 v14, 0xb

    aput-object v3, v2, v14

    .line 36
    const-string v3, "GPSDateStamp"

    const/16 v15, 0xc

    aput-object v3, v2, v15

    .line 37
    const-string v3, "GPSDestBearingRef"

    const/16 v16, 0xd

    aput-object v3, v2, v16

    .line 38
    const-string v3, "GPSDestDistanceRef"

    const/16 v17, 0xe

    aput-object v3, v2, v17

    .line 39
    const-string v3, "GPSDestLatitudeRef"

    const/16 v18, 0xf

    aput-object v3, v2, v18

    .line 40
    const-string v3, "GPSDestLongitudeRef"

    const/16 v19, 0x10

    aput-object v3, v2, v19

    .line 41
    const-string v3, "GPSHPositioningError"

    const/16 v20, 0x11

    aput-object v3, v2, v20

    .line 42
    const-string v3, "GPSImgDirectionRef"

    const/16 v21, 0x12

    aput-object v3, v2, v21

    .line 43
    const-string v3, "GPSLatitudeRef"

    const/16 v22, 0x13

    aput-object v3, v2, v22

    .line 44
    const-string v3, "GPSLongitudeRef"

    const/16 v23, 0x14

    aput-object v3, v2, v23

    .line 45
    const-string v3, "GPSMapDatum"

    const/16 v24, 0x15

    aput-object v3, v2, v24

    const/16 v3, 0x16

    .line 46
    const-string v25, "GPSMeasureMode"

    aput-object v25, v2, v3

    const/16 v3, 0x17

    .line 47
    const-string v25, "GPSProcessingMethod"

    aput-object v25, v2, v3

    const/16 v3, 0x18

    .line 48
    const-string v25, "GPSSatellites"

    aput-object v25, v2, v3

    const/16 v3, 0x19

    .line 49
    const-string v25, "GPSSpeedRef"

    aput-object v25, v2, v3

    const/16 v3, 0x1a

    .line 50
    const-string v25, "GPSStatus"

    aput-object v25, v2, v3

    const/16 v3, 0x1b

    .line 51
    const-string v25, "GPSTimeStamp"

    aput-object v25, v2, v3

    const/16 v3, 0x1c

    .line 52
    const-string v25, "GPSTrackRef"

    aput-object v25, v2, v3

    const/16 v3, 0x1d

    .line 53
    const-string v25, "GPSVersionID"

    aput-object v25, v2, v3

    const/16 v3, 0x1e

    .line 54
    const-string v25, "ImageDescription"

    aput-object v25, v2, v3

    const/16 v3, 0x1f

    .line 55
    const-string v25, "ImageUniqueID"

    aput-object v25, v2, v3

    const/16 v3, 0x20

    .line 56
    const-string v25, "InteroperabilityIndex"

    aput-object v25, v2, v3

    const/16 v3, 0x21

    .line 57
    const-string v25, "Make"

    aput-object v25, v2, v3

    const/16 v3, 0x22

    .line 58
    const-string v25, "MakerNote"

    aput-object v25, v2, v3

    const/16 v3, 0x23

    .line 59
    const-string v25, "Model"

    aput-object v25, v2, v3

    const/16 v3, 0x24

    .line 60
    const-string v25, "OECF"

    aput-object v25, v2, v3

    const/16 v3, 0x25

    .line 61
    const-string v25, "RelatedSoundFile"

    aput-object v25, v2, v3

    const/16 v3, 0x26

    .line 62
    const-string v25, "SceneType"

    aput-object v25, v2, v3

    const/16 v3, 0x27

    .line 63
    const-string v25, "Software"

    aput-object v25, v2, v3

    const/16 v3, 0x28

    .line 64
    const-string v25, "SpatialFrequencyResponse"

    aput-object v25, v2, v3

    const/16 v3, 0x29

    .line 65
    const-string v25, "SpectralSensitivity"

    aput-object v25, v2, v3

    const/16 v3, 0x2a

    .line 66
    const-string v25, "SubSecTime"

    aput-object v25, v2, v3

    const/16 v3, 0x2b

    .line 67
    const-string v25, "SubSecTimeDigitized"

    aput-object v25, v2, v3

    const/16 v3, 0x2c

    .line 68
    const-string v25, "SubSecTimeOriginal"

    aput-object v25, v2, v3

    const/16 v3, 0x2d

    .line 69
    const-string v25, "UserComment"

    aput-object v25, v2, v3

    .line 23
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "string"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v4

    const/16 v2, 0x20

    .line 72
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "ApertureValue"

    aput-object v3, v2, v4

    .line 73
    const-string v3, "BrightnessValue"

    aput-object v3, v2, v5

    .line 74
    const-string v3, "CompressedBitsPerPixel"

    aput-object v3, v2, v6

    .line 75
    const-string v3, "DigitalZoomRatio"

    aput-object v3, v2, v0

    .line 76
    const-string v3, "ExposureBiasValue"

    aput-object v3, v2, v7

    .line 77
    const-string v3, "ExposureIndex"

    aput-object v3, v2, v8

    .line 78
    const-string v3, "ExposureTime"

    aput-object v3, v2, v9

    .line 79
    const-string v3, "FlashEnergy"

    aput-object v3, v2, v10

    .line 80
    const-string v3, "FocalLength"

    aput-object v3, v2, v11

    .line 81
    const-string v3, "FocalPlaneXResolution"

    aput-object v3, v2, v12

    .line 82
    const-string v3, "FocalPlaneYResolution"

    aput-object v3, v2, v13

    .line 83
    const-string v3, "FNumber"

    aput-object v3, v2, v14

    .line 84
    const-string v3, "GPSAltitude"

    aput-object v3, v2, v15

    .line 85
    const-string v3, "GPSDestBearing"

    aput-object v3, v2, v16

    .line 86
    const-string v3, "GPSDestDistance"

    aput-object v3, v2, v17

    .line 87
    const-string v3, "GPSDestLatitude"

    aput-object v3, v2, v18

    .line 88
    const-string v3, "GPSDestLongitude"

    aput-object v3, v2, v19

    .line 89
    const-string v3, "GPSDOP"

    aput-object v3, v2, v20

    .line 90
    const-string v3, "GPSImgDirection"

    aput-object v3, v2, v21

    .line 91
    const-string v3, "GPSLatitude"

    aput-object v3, v2, v22

    .line 92
    const-string v3, "GPSLongitude"

    aput-object v3, v2, v23

    .line 93
    const-string v3, "GPSSpeed"

    aput-object v3, v2, v24

    const/16 v3, 0x16

    .line 94
    const-string v25, "GPSTrack"

    aput-object v25, v2, v3

    const/16 v3, 0x17

    .line 95
    const-string v25, "MaxApertureValue"

    aput-object v25, v2, v3

    const/16 v3, 0x18

    .line 96
    const-string v25, "PrimaryChromaticities"

    aput-object v25, v2, v3

    const/16 v3, 0x19

    .line 97
    const-string v25, "ReferenceBlackWhite"

    aput-object v25, v2, v3

    const/16 v3, 0x1a

    .line 98
    const-string v25, "ShutterSpeedValue"

    aput-object v25, v2, v3

    const/16 v3, 0x1b

    .line 99
    const-string v25, "SubjectDistance"

    aput-object v25, v2, v3

    const/16 v3, 0x1c

    .line 100
    const-string v25, "WhitePoint"

    aput-object v25, v2, v3

    const/16 v3, 0x1d

    .line 101
    const-string v25, "XResolution"

    aput-object v25, v2, v3

    const/16 v3, 0x1e

    .line 102
    const-string v25, "YCbCrCoefficients"

    aput-object v25, v2, v3

    const/16 v3, 0x1f

    .line 103
    const-string v25, "YResolution"

    aput-object v25, v2, v3

    .line 71
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "double"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v5

    const/16 v2, 0x37

    .line 106
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "BitsPerSample"

    aput-object v3, v2, v4

    .line 107
    const-string v3, "ColorSpace"

    aput-object v3, v2, v5

    .line 108
    const-string v3, "Compression"

    aput-object v3, v2, v6

    .line 109
    const-string v3, "Contrast"

    aput-object v3, v2, v0

    .line 110
    const-string v0, "CustomRendered"

    aput-object v0, v2, v7

    .line 111
    const-string v0, "DefaultCropSize"

    aput-object v0, v2, v8

    .line 112
    const-string v0, "DNGVersion"

    aput-object v0, v2, v9

    .line 113
    const-string v0, "ExposureMode"

    aput-object v0, v2, v10

    .line 114
    const-string v0, "ExposureProgram"

    aput-object v0, v2, v11

    .line 115
    const-string v0, "Flash"

    aput-object v0, v2, v12

    .line 116
    const-string v0, "FocalLengthIn35mmFilm"

    aput-object v0, v2, v13

    .line 117
    const-string v0, "FocalPlaneResolutionUnit"

    aput-object v0, v2, v14

    .line 118
    const-string v0, "GainControl"

    aput-object v0, v2, v15

    .line 119
    const-string v0, "GPSAltitudeRef"

    aput-object v0, v2, v16

    .line 120
    const-string v0, "GPSDifferential"

    aput-object v0, v2, v17

    .line 121
    const-string v0, "ImageLength"

    aput-object v0, v2, v18

    .line 122
    const-string v0, "ImageWidth"

    aput-object v0, v2, v19

    .line 123
    const-string v0, "ISOSpeedRatings"

    aput-object v0, v2, v20

    .line 124
    const-string v0, "JPEGInterchangeFormat"

    aput-object v0, v2, v21

    .line 125
    const-string v0, "JPEGInterchangeFormatLength"

    aput-object v0, v2, v22

    .line 126
    const-string v0, "LightSource"

    aput-object v0, v2, v23

    .line 127
    const-string v0, "MeteringMode"

    aput-object v0, v2, v24

    const/16 v0, 0x16

    .line 128
    const-string v3, "NewSubfileType"

    aput-object v3, v2, v0

    const/16 v0, 0x17

    .line 129
    const-string v3, "AspectFrame"

    aput-object v3, v2, v0

    const/16 v0, 0x18

    .line 130
    const-string v3, "PreviewImageLength"

    aput-object v3, v2, v0

    const/16 v0, 0x19

    .line 131
    const-string v3, "PreviewImageStart"

    aput-object v3, v2, v0

    const/16 v0, 0x1a

    .line 132
    const-string v3, "Orientation"

    aput-object v3, v2, v0

    const/16 v0, 0x1b

    .line 133
    const-string v3, "PhotometricInterpretation"

    aput-object v3, v2, v0

    const/16 v0, 0x1c

    .line 134
    const-string v3, "PixelXDimension"

    aput-object v3, v2, v0

    const/16 v0, 0x1d

    .line 135
    const-string v3, "PixelYDimension"

    aput-object v3, v2, v0

    const/16 v0, 0x1e

    .line 136
    const-string v3, "PlanarConfiguration"

    aput-object v3, v2, v0

    const/16 v0, 0x1f

    .line 137
    const-string v3, "ResolutionUnit"

    aput-object v3, v2, v0

    const/16 v0, 0x20

    .line 138
    const-string v3, "RowsPerStrip"

    aput-object v3, v2, v0

    const/16 v0, 0x21

    .line 139
    const-string v3, "ISO"

    aput-object v3, v2, v0

    const/16 v0, 0x22

    .line 140
    const-string v3, "SensorBottomBorder"

    aput-object v3, v2, v0

    const/16 v0, 0x23

    .line 141
    const-string v3, "SensorLeftBorder"

    aput-object v3, v2, v0

    const/16 v0, 0x24

    .line 142
    const-string v3, "SensorRightBorder"

    aput-object v3, v2, v0

    const/16 v0, 0x25

    .line 143
    const-string v3, "SensorTopBorder"

    aput-object v3, v2, v0

    const/16 v0, 0x26

    .line 144
    const-string v3, "SamplesPerPixel"

    aput-object v3, v2, v0

    const/16 v0, 0x27

    .line 145
    const-string v3, "Saturation"

    aput-object v3, v2, v0

    const/16 v0, 0x28

    .line 146
    const-string v3, "SceneCaptureType"

    aput-object v3, v2, v0

    const/16 v0, 0x29

    .line 147
    const-string v3, "SensingMethod"

    aput-object v3, v2, v0

    const/16 v0, 0x2a

    .line 148
    const-string v3, "Sharpness"

    aput-object v3, v2, v0

    const/16 v0, 0x2b

    .line 149
    const-string v3, "StripByteCounts"

    aput-object v3, v2, v0

    const/16 v0, 0x2c

    .line 150
    const-string v3, "StripOffsets"

    aput-object v3, v2, v0

    const/16 v0, 0x2d

    .line 151
    const-string v3, "SubfileType"

    aput-object v3, v2, v0

    const/16 v0, 0x2e

    .line 152
    const-string v3, "SubjectArea"

    aput-object v3, v2, v0

    const/16 v0, 0x2f

    .line 153
    const-string v3, "SubjectDistanceRange"

    aput-object v3, v2, v0

    const/16 v0, 0x30

    .line 154
    const-string v3, "SubjectLocation"

    aput-object v3, v2, v0

    const/16 v0, 0x31

    .line 155
    const-string v3, "ThumbnailImageLength"

    aput-object v3, v2, v0

    const/16 v0, 0x32

    .line 156
    const-string v3, "ThumbnailImageWidth"

    aput-object v3, v2, v0

    const/16 v0, 0x33

    .line 157
    const-string v3, "TransferFunction"

    aput-object v3, v2, v0

    const/16 v0, 0x34

    .line 158
    const-string v3, "WhiteBalance"

    aput-object v3, v2, v0

    const/16 v0, 0x35

    .line 159
    const-string v3, "YCbCrPositioning"

    aput-object v3, v2, v0

    const/16 v0, 0x36

    .line 160
    const-string v3, "YCbCrSubSampling"

    aput-object v3, v2, v0

    .line 105
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "int"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v6

    .line 22
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1;->typeToTags:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1;->typeToTags:Ljava/util/Map;

    .line 166
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 167
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 168
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 19
    check-cast v2, Ljava/lang/Iterable;

    .line 169
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 170
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 171
    check-cast v5, Ljava/lang/String;

    .line 19
    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 171
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 172
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 169
    check-cast v4, Ljava/lang/Iterable;

    .line 173
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    .line 175
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
