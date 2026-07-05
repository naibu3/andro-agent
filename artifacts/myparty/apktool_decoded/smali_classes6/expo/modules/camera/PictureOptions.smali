.class public final Lexpo/modules/camera/PictureOptions;
.super Ljava/lang/Object;
.source "Options.kt"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u00088\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0008H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u000eH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\t\u0010@\u001a\u00020\u0011H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\u0096\u0001\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00052\u0008\u0010F\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010G\u001a\u00020\u0011H\u00d6\u0001J\t\u0010H\u001a\u00020\tH\u00d6\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001e\u0010\u0018\u001a\u0004\u0008\u001f\u0010\u001dR*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u0018\u001a\u0004\u0008!\u0010\"R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010\u0018\u001a\u0004\u0008$\u0010\u001dR\u001c\u0010\u000c\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008%\u0010\u0018\u001a\u0004\u0008&\u0010\u001dR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\'\u0010\u0018\u001a\u0004\u0008(\u0010)R\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008*\u0010\u0018\u001a\u0004\u0008+\u0010\u001dR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010/\u0012\u0004\u0008,\u0010\u0018\u001a\u0004\u0008-\u0010.R\u001c\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00080\u0010\u0018\u001a\u0004\u00081\u00102R\u001c\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00083\u0010\u0018\u001a\u0004\u00084\u0010\u001dR\u001c\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00085\u0010\u0018\u001a\u0004\u00086\u0010\u001d\u00a8\u0006I"
    }
    d2 = {
        "Lexpo/modules/camera/PictureOptions;",
        "Lexpo/modules/kotlin/records/Record;",
        "quality",
        "",
        "base64",
        "",
        "exif",
        "additionalExif",
        "",
        "",
        "",
        "mirror",
        "skipProcessing",
        "imageType",
        "Lexpo/modules/camera/PictureFormat;",
        "fastMode",
        "id",
        "",
        "maxDownsampling",
        "shutterSound",
        "pictureRef",
        "<init>",
        "(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)V",
        "getQuality$annotations",
        "()V",
        "getQuality",
        "()D",
        "getBase64$annotations",
        "getBase64",
        "()Z",
        "getExif$annotations",
        "getExif",
        "getAdditionalExif$annotations",
        "getAdditionalExif",
        "()Ljava/util/Map;",
        "getMirror$annotations",
        "getMirror",
        "getSkipProcessing$annotations",
        "getSkipProcessing",
        "getImageType$annotations",
        "getImageType",
        "()Lexpo/modules/camera/PictureFormat;",
        "getFastMode$annotations",
        "getFastMode",
        "getId$annotations",
        "getId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMaxDownsampling$annotations",
        "getMaxDownsampling",
        "()I",
        "getShutterSound$annotations",
        "getShutterSound",
        "getPictureRef$annotations",
        "getPictureRef",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)Lexpo/modules/camera/PictureOptions;",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private final additionalExif:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final base64:Z

.field private final exif:Z

.field private final fastMode:Z

.field private final id:Ljava/lang/Integer;

.field private final imageType:Lexpo/modules/camera/PictureFormat;

.field private final maxDownsampling:I

.field private final mirror:Z

.field private final pictureRef:Z

.field private final quality:D

.field private final shutterSound:Z

.field private final skipProcessing:Z


# direct methods
.method public constructor <init>()V
    .locals 16

    const/16 v14, 0xfff

    const/4 v15, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lexpo/modules/camera/PictureOptions;-><init>(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Lexpo/modules/camera/PictureFormat;",
            "Z",
            "Ljava/lang/Integer;",
            "IZZ)V"
        }
    .end annotation

    const-string v0, "imageType"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide p1, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    .line 9
    iput-boolean p3, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    .line 10
    iput-boolean p4, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    .line 11
    iput-object p5, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    .line 12
    iput-boolean p6, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    .line 13
    iput-boolean p7, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    .line 14
    iput-object p8, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    .line 15
    iput-boolean p9, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    .line 16
    iput-object p10, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    .line 17
    iput p11, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    .line 18
    iput-boolean p12, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    .line 19
    iput-boolean p13, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    return-void
.end method

.method public synthetic constructor <init>(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    move v5, v4

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    move-object v6, v7

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    move v8, v4

    goto :goto_4

    :cond_4
    move/from16 v8, p6

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    move v9, v4

    goto :goto_5

    :cond_5
    move/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    .line 14
    sget-object v10, Lexpo/modules/camera/PictureFormat;->JPEG:Lexpo/modules/camera/PictureFormat;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    move v11, v4

    goto :goto_7

    :cond_7
    move/from16 v11, p9

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v7, p10

    :goto_8
    and-int/lit16 v12, v0, 0x200

    const/4 v13, 0x1

    if-eqz v12, :cond_9

    move v12, v13

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move/from16 p14, v4

    goto :goto_b

    :cond_b
    move/from16 p14, p13

    :goto_b
    move-object/from16 p1, p0

    move-wide/from16 p2, v1

    move/from16 p4, v3

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p11, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v11

    move/from16 p12, v12

    move/from16 p13, v13

    .line 7
    invoke-direct/range {p1 .. p14}, Lexpo/modules/camera/PictureOptions;-><init>(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/camera/PictureOptions;DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZILjava/lang/Object;)Lexpo/modules/camera/PictureOptions;
    .locals 13

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    iget-object v5, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p7

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    iget-object v8, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    iget-object v10, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    iget v11, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    goto :goto_9

    :cond_9
    move/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p12

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    move/from16 p14, v0

    goto :goto_b

    :cond_b
    move/from16 p14, p13

    :goto_b
    move-object p1, p0

    move-wide p2, v1

    move/from16 p4, v3

    move/from16 p5, v4

    move-object/from16 p6, v5

    move/from16 p7, v6

    move/from16 p8, v7

    move-object/from16 p9, v8

    move/from16 p10, v9

    move-object/from16 p11, v10

    move/from16 p12, v11

    move/from16 p13, v12

    invoke-virtual/range {p1 .. p14}, Lexpo/modules/camera/PictureOptions;->copy(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)Lexpo/modules/camera/PictureOptions;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAdditionalExif$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getBase64$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getExif$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getFastMode$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getImageType$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getMaxDownsampling$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getMirror$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getPictureRef$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getQuality$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getShutterSound$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getSkipProcessing$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    return-wide v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    return v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    return v0
.end method

.method public final component7()Lexpo/modules/camera/PictureFormat;
    .locals 1

    iget-object v0, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    return v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)Lexpo/modules/camera/PictureOptions;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Lexpo/modules/camera/PictureFormat;",
            "Z",
            "Ljava/lang/Integer;",
            "IZZ)",
            "Lexpo/modules/camera/PictureOptions;"
        }
    .end annotation

    const-string v0, "imageType"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lexpo/modules/camera/PictureOptions;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lexpo/modules/camera/PictureOptions;-><init>(DZZLjava/util/Map;ZZLexpo/modules/camera/PictureFormat;ZLjava/lang/Integer;IZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lexpo/modules/camera/PictureOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lexpo/modules/camera/PictureOptions;

    iget-wide v3, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    iget-wide v5, p1, Lexpo/modules/camera/PictureOptions;->quality:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    iget-boolean v3, p1, Lexpo/modules/camera/PictureOptions;->base64:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    iget-boolean v3, p1, Lexpo/modules/camera/PictureOptions;->exif:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    iget-object v3, p1, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    iget-boolean v3, p1, Lexpo/modules/camera/PictureOptions;->mirror:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    iget-boolean v3, p1, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    iget-object v3, p1, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    iget-boolean v3, p1, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    iget-object v3, p1, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    iget v3, p1, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    iget-boolean v3, p1, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    iget-boolean p1, p1, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAdditionalExif()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    return-object v0
.end method

.method public final getBase64()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    return v0
.end method

.method public final getExif()Z
    .locals 1

    .line 10
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    return v0
.end method

.method public final getFastMode()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    return v0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 1

    .line 16
    iget-object v0, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getImageType()Lexpo/modules/camera/PictureFormat;
    .locals 1

    .line 14
    iget-object v0, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    return-object v0
.end method

.method public final getMaxDownsampling()I
    .locals 1

    .line 17
    iget v0, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    return v0
.end method

.method public final getMirror()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    return v0
.end method

.method public final getPictureRef()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    return v0
.end method

.method public final getQuality()D
    .locals 2

    .line 8
    iget-wide v0, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    return-wide v0
.end method

.method public final getShutterSound()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    return v0
.end method

.method public final getSkipProcessing()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    invoke-virtual {v1}, Lexpo/modules/camera/PictureFormat;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-wide v0, p0, Lexpo/modules/camera/PictureOptions;->quality:D

    iget-boolean v2, p0, Lexpo/modules/camera/PictureOptions;->base64:Z

    iget-boolean v3, p0, Lexpo/modules/camera/PictureOptions;->exif:Z

    iget-object v4, p0, Lexpo/modules/camera/PictureOptions;->additionalExif:Ljava/util/Map;

    iget-boolean v5, p0, Lexpo/modules/camera/PictureOptions;->mirror:Z

    iget-boolean v6, p0, Lexpo/modules/camera/PictureOptions;->skipProcessing:Z

    iget-object v7, p0, Lexpo/modules/camera/PictureOptions;->imageType:Lexpo/modules/camera/PictureFormat;

    iget-boolean v8, p0, Lexpo/modules/camera/PictureOptions;->fastMode:Z

    iget-object v9, p0, Lexpo/modules/camera/PictureOptions;->id:Ljava/lang/Integer;

    iget v10, p0, Lexpo/modules/camera/PictureOptions;->maxDownsampling:I

    iget-boolean v11, p0, Lexpo/modules/camera/PictureOptions;->shutterSound:Z

    iget-boolean v12, p0, Lexpo/modules/camera/PictureOptions;->pictureRef:Z

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "PictureOptions(quality="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", base64="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exif="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", additionalExif="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mirror="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", skipProcessing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fastMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxDownsampling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shutterSound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pictureRef="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
