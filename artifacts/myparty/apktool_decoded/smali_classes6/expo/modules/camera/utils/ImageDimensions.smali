.class public final Lexpo/modules/camera/utils/ImageDimensions;
.super Ljava/lang/Object;
.source "ImageDimensions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u000b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/camera/utils/ImageDimensions;",
        "",
        "mWidth",
        "",
        "mHeight",
        "rotation",
        "facing",
        "Lexpo/modules/camera/records/CameraType;",
        "<init>",
        "(IIILexpo/modules/camera/records/CameraType;)V",
        "getRotation",
        "()I",
        "getFacing",
        "()Lexpo/modules/camera/records/CameraType;",
        "isLandscape",
        "",
        "()Z",
        "width",
        "getWidth",
        "height",
        "getHeight",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final facing:Lexpo/modules/camera/records/CameraType;

.field private final mHeight:I

.field private final mWidth:I

.field private final rotation:I


# direct methods
.method public constructor <init>(II)V
    .locals 7

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 7

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILexpo/modules/camera/records/CameraType;)V
    .locals 1

    const-string v0, "facing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    iput p2, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    iput p3, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    iput-object p4, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    return-void
.end method

.method public synthetic constructor <init>(IIILexpo/modules/camera/records/CameraType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 5
    sget-object p4, Lexpo/modules/camera/records/CameraType;->BACK:Lexpo/modules/camera/records/CameraType;

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;)V

    return-void
.end method

.method private final component1()I
    .locals 1

    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    return v0
.end method

.method private final component2()I
    .locals 1

    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    return v0
.end method

.method public static synthetic copy$default(Lexpo/modules/camera/utils/ImageDimensions;IIILexpo/modules/camera/records/CameraType;ILjava/lang/Object;)Lexpo/modules/camera/utils/ImageDimensions;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/camera/utils/ImageDimensions;->copy(IIILexpo/modules/camera/records/CameraType;)Lexpo/modules/camera/utils/ImageDimensions;

    move-result-object p0

    return-object p0
.end method

.method private final isLandscape()Z
    .locals 2

    .line 7
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    rem-int/lit16 v0, v0, 0xb4

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final component3()I
    .locals 1

    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    return v0
.end method

.method public final component4()Lexpo/modules/camera/records/CameraType;
    .locals 1

    iget-object v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    return-object v0
.end method

.method public final copy(IIILexpo/modules/camera/records/CameraType;)Lexpo/modules/camera/utils/ImageDimensions;
    .locals 1

    const-string v0, "facing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lexpo/modules/camera/utils/ImageDimensions;

    invoke-direct {v0, p1, p2, p3, p4}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lexpo/modules/camera/utils/ImageDimensions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lexpo/modules/camera/utils/ImageDimensions;

    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    iget v3, p1, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    iget v3, p1, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    iget v3, p1, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    iget-object p1, p1, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFacing()Lexpo/modules/camera/records/CameraType;
    .locals 1

    .line 5
    iget-object v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 15
    invoke-direct {p0}, Lexpo/modules/camera/utils/ImageDimensions;->isLandscape()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    return v0

    .line 18
    :cond_0
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    return v0
.end method

.method public final getRotation()I
    .locals 1

    .line 5
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 9
    invoke-direct {p0}, Lexpo/modules/camera/utils/ImageDimensions;->isLandscape()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    return v0

    .line 12
    :cond_0
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    invoke-virtual {v1}, Lexpo/modules/camera/records/CameraType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    iget v2, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    iget-object v3, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ImageDimensions(mWidth="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", mHeight="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", facing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
