.class public final Lexpo/modules/camera/utils/ExifTagsKt;
.super Ljava/lang/Object;
.source "ExifTags.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001f\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0007\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "VIDEO_2160P",
        "",
        "VIDEO_1080P",
        "VIDEO_720P",
        "VIDEO_480P",
        "VIDEO_4x3",
        "exifTags",
        "",
        "",
        "getExifTags",
        "()[[Ljava/lang/String;",
        "[[Ljava/lang/String;",
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
.field public static final VIDEO_1080P:I = 0x1

.field public static final VIDEO_2160P:I = 0x0

.field public static final VIDEO_480P:I = 0x3

.field public static final VIDEO_4x3:I = 0x4

.field public static final VIDEO_720P:I = 0x2

.field private static final exifTags:[[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x85

    .line 12
    new-array v0, v0, [[Ljava/lang/String;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "string"

    aput-object v4, v2, v3

    const-string v5, "Artist"

    const/4 v6, 0x1

    aput-object v5, v2, v6

    aput-object v2, v0, v3

    .line 13
    new-array v2, v1, [Ljava/lang/String;

    const-string v5, "int"

    aput-object v5, v2, v3

    const-string v7, "BitsPerSample"

    aput-object v7, v2, v6

    aput-object v2, v0, v6

    .line 14
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "Compression"

    aput-object v7, v2, v6

    aput-object v2, v0, v1

    .line 15
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "Copyright"

    aput-object v7, v2, v6

    const/4 v7, 0x3

    aput-object v2, v0, v7

    .line 16
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "DateTime"

    aput-object v7, v2, v6

    const/4 v7, 0x4

    aput-object v2, v0, v7

    .line 17
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "ImageDescription"

    aput-object v7, v2, v6

    const/4 v7, 0x5

    aput-object v2, v0, v7

    .line 18
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "ImageLength"

    aput-object v7, v2, v6

    const/4 v7, 0x6

    aput-object v2, v0, v7

    .line 19
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "ImageWidth"

    aput-object v7, v2, v6

    const/4 v7, 0x7

    aput-object v2, v0, v7

    .line 20
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "JPEGInterchangeFormat"

    aput-object v7, v2, v6

    const/16 v7, 0x8

    aput-object v2, v0, v7

    .line 21
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "JPEGInterchangeFormatLength"

    aput-object v7, v2, v6

    const/16 v7, 0x9

    aput-object v2, v0, v7

    .line 22
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "Make"

    aput-object v7, v2, v6

    const/16 v7, 0xa

    aput-object v2, v0, v7

    .line 23
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "Model"

    aput-object v7, v2, v6

    const/16 v7, 0xb

    aput-object v2, v0, v7

    .line 24
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "Orientation"

    aput-object v7, v2, v6

    const/16 v7, 0xc

    aput-object v2, v0, v7

    .line 25
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "PhotometricInterpretation"

    aput-object v7, v2, v6

    const/16 v7, 0xd

    aput-object v2, v0, v7

    .line 26
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v7, "PlanarConfiguration"

    aput-object v7, v2, v6

    const/16 v7, 0xe

    aput-object v2, v0, v7

    .line 27
    new-array v2, v1, [Ljava/lang/String;

    const-string v7, "double"

    aput-object v7, v2, v3

    const-string v8, "PrimaryChromaticities"

    aput-object v8, v2, v6

    const/16 v8, 0xf

    aput-object v2, v0, v8

    .line 28
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "ReferenceBlackWhite"

    aput-object v8, v2, v6

    const/16 v8, 0x10

    aput-object v2, v0, v8

    .line 29
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "ResolutionUnit"

    aput-object v8, v2, v6

    const/16 v8, 0x11

    aput-object v2, v0, v8

    .line 30
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "RowsPerStrip"

    aput-object v8, v2, v6

    const/16 v8, 0x12

    aput-object v2, v0, v8

    .line 31
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SamplesPerPixel"

    aput-object v8, v2, v6

    const/16 v8, 0x13

    aput-object v2, v0, v8

    .line 32
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "Software"

    aput-object v8, v2, v6

    const/16 v8, 0x14

    aput-object v2, v0, v8

    .line 33
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "StripByteCounts"

    aput-object v8, v2, v6

    const/16 v8, 0x15

    aput-object v2, v0, v8

    .line 34
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "StripOffsets"

    aput-object v8, v2, v6

    const/16 v8, 0x16

    aput-object v2, v0, v8

    .line 35
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "TransferFunction"

    aput-object v8, v2, v6

    const/16 v8, 0x17

    aput-object v2, v0, v8

    .line 36
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "WhitePoint"

    aput-object v8, v2, v6

    const/16 v8, 0x18

    aput-object v2, v0, v8

    .line 37
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "XResolution"

    aput-object v8, v2, v6

    const/16 v8, 0x19

    aput-object v2, v0, v8

    .line 38
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "YCbCrCoefficients"

    aput-object v8, v2, v6

    const/16 v8, 0x1a

    aput-object v2, v0, v8

    .line 39
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "YCbCrPositioning"

    aput-object v8, v2, v6

    const/16 v8, 0x1b

    aput-object v2, v0, v8

    .line 40
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "YCbCrSubSampling"

    aput-object v8, v2, v6

    const/16 v8, 0x1c

    aput-object v2, v0, v8

    .line 41
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "YResolution"

    aput-object v8, v2, v6

    const/16 v8, 0x1d

    aput-object v2, v0, v8

    .line 42
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "ApertureValue"

    aput-object v8, v2, v6

    const/16 v8, 0x1e

    aput-object v2, v0, v8

    .line 43
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "BrightnessValue"

    aput-object v8, v2, v6

    const/16 v8, 0x1f

    aput-object v2, v0, v8

    .line 44
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "CFAPattern"

    aput-object v8, v2, v6

    const/16 v8, 0x20

    aput-object v2, v0, v8

    .line 45
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "ColorSpace"

    aput-object v8, v2, v6

    const/16 v8, 0x21

    aput-object v2, v0, v8

    .line 46
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "ComponentsConfiguration"

    aput-object v8, v2, v6

    const/16 v8, 0x22

    aput-object v2, v0, v8

    .line 47
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "CompressedBitsPerPixel"

    aput-object v8, v2, v6

    const/16 v8, 0x23

    aput-object v2, v0, v8

    .line 48
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "Contrast"

    aput-object v8, v2, v6

    const/16 v8, 0x24

    aput-object v2, v0, v8

    .line 49
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "CustomRendered"

    aput-object v8, v2, v6

    const/16 v8, 0x25

    aput-object v2, v0, v8

    .line 50
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "DateTimeDigitized"

    aput-object v8, v2, v6

    const/16 v8, 0x26

    aput-object v2, v0, v8

    .line 51
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "DateTimeOriginal"

    aput-object v8, v2, v6

    const/16 v8, 0x27

    aput-object v2, v0, v8

    .line 52
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "DeviceSettingDescription"

    aput-object v8, v2, v6

    const/16 v8, 0x28

    aput-object v2, v0, v8

    .line 53
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "DigitalZoomRatio"

    aput-object v8, v2, v6

    const/16 v8, 0x29

    aput-object v2, v0, v8

    .line 54
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "ExifVersion"

    aput-object v8, v2, v6

    const/16 v8, 0x2a

    aput-object v2, v0, v8

    .line 55
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "ExposureBiasValue"

    aput-object v8, v2, v6

    const/16 v8, 0x2b

    aput-object v2, v0, v8

    .line 56
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "ExposureIndex"

    aput-object v8, v2, v6

    const/16 v8, 0x2c

    aput-object v2, v0, v8

    .line 57
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "ExposureMode"

    aput-object v8, v2, v6

    const/16 v8, 0x2d

    aput-object v2, v0, v8

    .line 58
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "ExposureProgram"

    aput-object v8, v2, v6

    const/16 v8, 0x2e

    aput-object v2, v0, v8

    .line 59
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "ExposureTime"

    aput-object v8, v2, v6

    const/16 v8, 0x2f

    aput-object v2, v0, v8

    .line 60
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "FNumber"

    aput-object v8, v2, v6

    const/16 v8, 0x30

    aput-object v2, v0, v8

    .line 61
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "FileSource"

    aput-object v8, v2, v6

    const/16 v8, 0x31

    aput-object v2, v0, v8

    .line 62
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "Flash"

    aput-object v8, v2, v6

    const/16 v8, 0x32

    aput-object v2, v0, v8

    .line 63
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "FlashEnergy"

    aput-object v8, v2, v6

    const/16 v8, 0x33

    aput-object v2, v0, v8

    .line 64
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "FlashpixVersion"

    aput-object v8, v2, v6

    const/16 v8, 0x34

    aput-object v2, v0, v8

    .line 65
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "FocalLength"

    aput-object v8, v2, v6

    const/16 v8, 0x35

    aput-object v2, v0, v8

    .line 66
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "FocalLengthIn35mmFilm"

    aput-object v8, v2, v6

    const/16 v8, 0x36

    aput-object v2, v0, v8

    .line 67
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "FocalPlaneResolutionUnit"

    aput-object v8, v2, v6

    const/16 v8, 0x37

    aput-object v2, v0, v8

    .line 68
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "FocalPlaneXResolution"

    aput-object v8, v2, v6

    const/16 v8, 0x38

    aput-object v2, v0, v8

    .line 69
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "FocalPlaneYResolution"

    aput-object v8, v2, v6

    const/16 v8, 0x39

    aput-object v2, v0, v8

    .line 70
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "GainControl"

    aput-object v8, v2, v6

    const/16 v8, 0x3a

    aput-object v2, v0, v8

    .line 71
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "ISOSpeedRatings"

    aput-object v8, v2, v6

    const/16 v8, 0x3b

    aput-object v2, v0, v8

    .line 72
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "ImageUniqueID"

    aput-object v8, v2, v6

    const/16 v8, 0x3c

    aput-object v2, v0, v8

    .line 73
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "LightSource"

    aput-object v8, v2, v6

    const/16 v8, 0x3d

    aput-object v2, v0, v8

    .line 74
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "MakerNote"

    aput-object v8, v2, v6

    const/16 v8, 0x3e

    aput-object v2, v0, v8

    .line 75
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "MaxApertureValue"

    aput-object v8, v2, v6

    const/16 v8, 0x3f

    aput-object v2, v0, v8

    .line 76
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "MeteringMode"

    aput-object v8, v2, v6

    const/16 v8, 0x40

    aput-object v2, v0, v8

    .line 77
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "NewSubfileType"

    aput-object v8, v2, v6

    const/16 v8, 0x41

    aput-object v2, v0, v8

    .line 78
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "OECF"

    aput-object v8, v2, v6

    const/16 v8, 0x42

    aput-object v2, v0, v8

    .line 79
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "PixelXDimension"

    aput-object v8, v2, v6

    const/16 v8, 0x43

    aput-object v2, v0, v8

    .line 80
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "PixelYDimension"

    aput-object v8, v2, v6

    const/16 v8, 0x44

    aput-object v2, v0, v8

    .line 81
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "RelatedSoundFile"

    aput-object v8, v2, v6

    const/16 v8, 0x45

    aput-object v2, v0, v8

    .line 82
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "Saturation"

    aput-object v8, v2, v6

    const/16 v8, 0x46

    aput-object v2, v0, v8

    .line 83
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SceneCaptureType"

    aput-object v8, v2, v6

    const/16 v8, 0x47

    aput-object v2, v0, v8

    .line 84
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "SceneType"

    aput-object v8, v2, v6

    const/16 v8, 0x48

    aput-object v2, v0, v8

    .line 85
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SensingMethod"

    aput-object v8, v2, v6

    const/16 v8, 0x49

    aput-object v2, v0, v8

    .line 86
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "Sharpness"

    aput-object v8, v2, v6

    const/16 v8, 0x4a

    aput-object v2, v0, v8

    .line 87
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "ShutterSpeedValue"

    aput-object v8, v2, v6

    const/16 v8, 0x4b

    aput-object v2, v0, v8

    .line 88
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "SpatialFrequencyResponse"

    aput-object v8, v2, v6

    const/16 v8, 0x4c

    aput-object v2, v0, v8

    .line 89
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "SpectralSensitivity"

    aput-object v8, v2, v6

    const/16 v8, 0x4d

    aput-object v2, v0, v8

    .line 90
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SubfileType"

    aput-object v8, v2, v6

    const/16 v8, 0x4e

    aput-object v2, v0, v8

    .line 91
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "SubSecTime"

    aput-object v8, v2, v6

    const/16 v8, 0x4f

    aput-object v2, v0, v8

    .line 92
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "SubSecTimeDigitized"

    aput-object v8, v2, v6

    const/16 v8, 0x50

    aput-object v2, v0, v8

    .line 93
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "SubSecTimeOriginal"

    aput-object v8, v2, v6

    const/16 v8, 0x51

    aput-object v2, v0, v8

    .line 94
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SubjectArea"

    aput-object v8, v2, v6

    const/16 v8, 0x52

    aput-object v2, v0, v8

    .line 95
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "SubjectDistance"

    aput-object v8, v2, v6

    const/16 v8, 0x53

    aput-object v2, v0, v8

    .line 96
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SubjectDistanceRange"

    aput-object v8, v2, v6

    const/16 v8, 0x54

    aput-object v2, v0, v8

    .line 97
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "SubjectLocation"

    aput-object v8, v2, v6

    const/16 v8, 0x55

    aput-object v2, v0, v8

    .line 98
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "UserComment"

    aput-object v8, v2, v6

    const/16 v8, 0x56

    aput-object v2, v0, v8

    .line 99
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "WhiteBalance"

    aput-object v8, v2, v6

    const/16 v8, 0x57

    aput-object v2, v0, v8

    .line 100
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSAltitude"

    aput-object v8, v2, v6

    const/16 v8, 0x58

    aput-object v2, v0, v8

    .line 101
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "GPSAltitudeRef"

    aput-object v8, v2, v6

    const/16 v8, 0x59

    aput-object v2, v0, v8

    .line 102
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSAreaInformation"

    aput-object v8, v2, v6

    const/16 v8, 0x5a

    aput-object v2, v0, v8

    .line 103
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSDOP"

    aput-object v8, v2, v6

    const/16 v8, 0x5b

    aput-object v2, v0, v8

    .line 104
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSDateStamp"

    aput-object v8, v2, v6

    const/16 v8, 0x5c

    aput-object v2, v0, v8

    .line 105
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSDestBearing"

    aput-object v8, v2, v6

    const/16 v8, 0x5d

    aput-object v2, v0, v8

    .line 106
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSDestBearingRef"

    aput-object v8, v2, v6

    const/16 v8, 0x5e

    aput-object v2, v0, v8

    .line 107
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSDestDistance"

    aput-object v8, v2, v6

    const/16 v8, 0x5f

    aput-object v2, v0, v8

    .line 108
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSDestDistanceRef"

    aput-object v8, v2, v6

    const/16 v8, 0x60

    aput-object v2, v0, v8

    .line 109
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSDestLatitude"

    aput-object v8, v2, v6

    const/16 v8, 0x61

    aput-object v2, v0, v8

    .line 110
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSDestLatitudeRef"

    aput-object v8, v2, v6

    const/16 v8, 0x62

    aput-object v2, v0, v8

    .line 111
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSDestLongitude"

    aput-object v8, v2, v6

    const/16 v8, 0x63

    aput-object v2, v0, v8

    .line 112
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSDestLongitudeRef"

    aput-object v8, v2, v6

    const/16 v8, 0x64

    aput-object v2, v0, v8

    .line 113
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v8, "GPSDifferential"

    aput-object v8, v2, v6

    const/16 v8, 0x65

    aput-object v2, v0, v8

    .line 114
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSHPositioningError"

    aput-object v8, v2, v6

    const/16 v8, 0x66

    aput-object v2, v0, v8

    .line 115
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSImgDirection"

    aput-object v8, v2, v6

    const/16 v8, 0x67

    aput-object v2, v0, v8

    .line 116
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSImgDirectionRef"

    aput-object v8, v2, v6

    const/16 v8, 0x68

    aput-object v2, v0, v8

    .line 117
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSLatitude"

    aput-object v8, v2, v6

    const/16 v8, 0x69

    aput-object v2, v0, v8

    .line 118
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSLatitudeRef"

    aput-object v8, v2, v6

    const/16 v8, 0x6a

    aput-object v2, v0, v8

    .line 119
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSLongitude"

    aput-object v8, v2, v6

    const/16 v8, 0x6b

    aput-object v2, v0, v8

    .line 120
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSLongitudeRef"

    aput-object v8, v2, v6

    const/16 v8, 0x6c

    aput-object v2, v0, v8

    .line 121
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSMapDatum"

    aput-object v8, v2, v6

    const/16 v8, 0x6d

    aput-object v2, v0, v8

    .line 122
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSMeasureMode"

    aput-object v8, v2, v6

    const/16 v8, 0x6e

    aput-object v2, v0, v8

    .line 123
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSProcessingMethod"

    aput-object v8, v2, v6

    const/16 v8, 0x6f

    aput-object v2, v0, v8

    .line 124
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSSatellites"

    aput-object v8, v2, v6

    const/16 v8, 0x70

    aput-object v2, v0, v8

    .line 125
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v8, "GPSSpeed"

    aput-object v8, v2, v6

    const/16 v8, 0x71

    aput-object v2, v0, v8

    .line 126
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSSpeedRef"

    aput-object v8, v2, v6

    const/16 v8, 0x72

    aput-object v2, v0, v8

    .line 127
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSStatus"

    aput-object v8, v2, v6

    const/16 v8, 0x73

    aput-object v2, v0, v8

    .line 128
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v8, "GPSTimeStamp"

    aput-object v8, v2, v6

    const/16 v8, 0x74

    aput-object v2, v0, v8

    .line 129
    new-array v2, v1, [Ljava/lang/String;

    aput-object v7, v2, v3

    const-string v7, "GPSTrack"

    aput-object v7, v2, v6

    const/16 v7, 0x75

    aput-object v2, v0, v7

    .line 130
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "GPSTrackRef"

    aput-object v7, v2, v6

    const/16 v7, 0x76

    aput-object v2, v0, v7

    .line 131
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v7, "GPSVersionID"

    aput-object v7, v2, v6

    const/16 v7, 0x77

    aput-object v2, v0, v7

    .line 132
    new-array v2, v1, [Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v4, "InteroperabilityIndex"

    aput-object v4, v2, v6

    const/16 v4, 0x78

    aput-object v2, v0, v4

    .line 133
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "ThumbnailImageLength"

    aput-object v4, v2, v6

    const/16 v4, 0x79

    aput-object v2, v0, v4

    .line 134
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "ThumbnailImageWidth"

    aput-object v4, v2, v6

    const/16 v4, 0x7a

    aput-object v2, v0, v4

    .line 135
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "DNGVersion"

    aput-object v4, v2, v6

    const/16 v4, 0x7b

    aput-object v2, v0, v4

    .line 136
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "DefaultCropSize"

    aput-object v4, v2, v6

    const/16 v4, 0x7c

    aput-object v2, v0, v4

    .line 137
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "PreviewImageStart"

    aput-object v4, v2, v6

    const/16 v4, 0x7d

    aput-object v2, v0, v4

    .line 138
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "PreviewImageLength"

    aput-object v4, v2, v6

    const/16 v4, 0x7e

    aput-object v2, v0, v4

    .line 139
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "AspectFrame"

    aput-object v4, v2, v6

    const/16 v4, 0x7f

    aput-object v2, v0, v4

    .line 140
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "SensorBottomBorder"

    aput-object v4, v2, v6

    const/16 v4, 0x80

    aput-object v2, v0, v4

    .line 141
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "SensorLeftBorder"

    aput-object v4, v2, v6

    const/16 v4, 0x81

    aput-object v2, v0, v4

    .line 142
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "SensorRightBorder"

    aput-object v4, v2, v6

    const/16 v4, 0x82

    aput-object v2, v0, v4

    .line 143
    new-array v2, v1, [Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v4, "SensorTopBorder"

    aput-object v4, v2, v6

    const/16 v4, 0x83

    aput-object v2, v0, v4

    .line 144
    new-array v1, v1, [Ljava/lang/String;

    aput-object v5, v1, v3

    const-string v2, "ISO"

    aput-object v2, v1, v6

    const/16 v2, 0x84

    aput-object v1, v0, v2

    .line 11
    sput-object v0, Lexpo/modules/camera/utils/ExifTagsKt;->exifTags:[[Ljava/lang/String;

    return-void
.end method

.method public static final getExifTags()[[Ljava/lang/String;
    .locals 1

    .line 11
    sget-object v0, Lexpo/modules/camera/utils/ExifTagsKt;->exifTags:[[Ljava/lang/String;

    return-object v0
.end method
