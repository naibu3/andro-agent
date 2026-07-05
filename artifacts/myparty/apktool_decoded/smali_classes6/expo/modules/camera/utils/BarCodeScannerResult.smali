.class public final Lexpo/modules/camera/utils/BarCodeScannerResult;
.super Ljava/lang/Object;
.source "BarCodeScannerResult.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001#BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0010\"\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u000c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0010\"\u0004\u0008\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "",
        "type",
        "",
        "value",
        "",
        "raw",
        "extra",
        "Landroid/os/Bundle;",
        "cornerPoints",
        "",
        "height",
        "width",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V",
        "getType",
        "()I",
        "getValue",
        "()Ljava/lang/String;",
        "getRaw",
        "getExtra",
        "()Landroid/os/Bundle;",
        "getCornerPoints",
        "()Ljava/util/List;",
        "setCornerPoints",
        "(Ljava/util/List;)V",
        "getHeight",
        "setHeight",
        "(I)V",
        "getWidth",
        "setWidth",
        "boundingBox",
        "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
        "getBoundingBox",
        "()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
        "BoundingBox",
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
.field private cornerPoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final extra:Landroid/os/Bundle;

.field private height:I

.field private final raw:Ljava/lang/String;

.field private final type:I

.field private final value:Ljava/lang/String;

.field private width:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II)V"
        }
    .end annotation

    const-string v0, "extra"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cornerPoints"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->type:I

    .line 7
    iput-object p2, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->value:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->raw:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->extra:Landroid/os/Bundle;

    .line 10
    iput-object p5, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    .line 11
    iput p6, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->height:I

    .line 12
    iput p7, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->width:I

    return-void
.end method


# virtual methods
.method public final getBoundingBox()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;
    .locals 8

    .line 18
    iget-object v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 19
    new-instance v0, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;

    invoke-direct {v0, v1, v1, v1, v1}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;-><init>(IIII)V

    return-object v0

    :cond_0
    const/high16 v0, -0x80000000

    const v2, 0x7fffffff

    move v3, v2

    move v4, v3

    move v2, v1

    move v1, v0

    .line 27
    :goto_0
    iget-object v5, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_1

    .line 28
    iget-object v5, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 29
    iget-object v6, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    add-int/lit8 v7, v2, 0x1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 31
    invoke-static {v3, v5}, Ljava/lang/Integer;->min(II)I

    move-result v3

    .line 32
    invoke-static {v4, v6}, Ljava/lang/Integer;->min(II)I

    move-result v4

    .line 33
    invoke-static {v0, v5}, Ljava/lang/Integer;->max(II)I

    move-result v0

    .line 34
    invoke-static {v1, v6}, Ljava/lang/Integer;->max(II)I

    move-result v1

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 38
    :cond_1
    new-instance v2, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;

    sub-int/2addr v0, v3

    sub-int/2addr v1, v4

    invoke-direct {v2, v3, v4, v0, v1}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;-><init>(IIII)V

    return-object v2
.end method

.method public final getCornerPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getExtra()Landroid/os/Bundle;
    .locals 1

    .line 9
    iget-object v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->extra:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 11
    iget v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->height:I

    return v0
.end method

.method public final getRaw()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->raw:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 6
    iget v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->type:I

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    .line 12
    iget v0, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->width:I

    return v0
.end method

.method public final setCornerPoints(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iput-object p1, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->cornerPoints:Ljava/util/List;

    return-void
.end method

.method public final setHeight(I)V
    .locals 0

    .line 11
    iput p1, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->height:I

    return-void
.end method

.method public final setWidth(I)V
    .locals 0

    .line 12
    iput p1, p0, Lexpo/modules/camera/utils/BarCodeScannerResult;->width:I

    return-void
.end method
