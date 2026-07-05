.class public final Lexpo/modules/camera/common/BarcodeScannedEvent;
.super Ljava/lang/Object;
.source "CommonEvents.kt"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0014\u0010\u0011\u001a\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0017\u0010\u0011\u001a\u0004\u0008\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0011\u001a\u0004\u0008\u001a\u0010\u0016R,\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001b\u0010\u0011\u001a\u0004\u0008\u001c\u0010\u001dR\u001c\u0010\u000c\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001e\u0010\u0011\u001a\u0004\u0008\u001f\u0010 R\u001e\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008!\u0010\u0011\u001a\u0004\u0008\"\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lexpo/modules/camera/common/BarcodeScannedEvent;",
        "Lexpo/modules/kotlin/records/Record;",
        "target",
        "",
        "data",
        "",
        "raw",
        "type",
        "cornerPoints",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "bounds",
        "extra",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Bundle;Landroid/os/Bundle;)V",
        "getTarget$annotations",
        "()V",
        "getTarget",
        "()I",
        "getData$annotations",
        "getData",
        "()Ljava/lang/String;",
        "getRaw$annotations",
        "getRaw",
        "getType$annotations",
        "getType",
        "getCornerPoints$annotations",
        "getCornerPoints",
        "()Ljava/util/ArrayList;",
        "getBounds$annotations",
        "getBounds",
        "()Landroid/os/Bundle;",
        "getExtra$annotations",
        "getExtra",
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
.field private final bounds:Landroid/os/Bundle;

.field private final cornerPoints:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field private final data:Ljava/lang/String;

.field private final extra:Landroid/os/Bundle;

.field private final raw:Ljava/lang/String;

.field private final target:I

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "raw"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cornerPoints"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bounds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->target:I

    .line 9
    iput-object p2, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->data:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->raw:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->type:Ljava/lang/String;

    .line 12
    iput-object p5, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->cornerPoints:Ljava/util/ArrayList;

    .line 13
    iput-object p6, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->bounds:Landroid/os/Bundle;

    .line 14
    iput-object p7, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->extra:Landroid/os/Bundle;

    return-void
.end method

.method public static synthetic getBounds$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getCornerPoints$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getData$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getExtra$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getRaw$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getTarget$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getBounds()Landroid/os/Bundle;
    .locals 1

    .line 13
    iget-object v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->bounds:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getCornerPoints()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->cornerPoints:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getData()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->data:Ljava/lang/String;

    return-object v0
.end method

.method public final getExtra()Landroid/os/Bundle;
    .locals 1

    .line 14
    iget-object v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->extra:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getRaw()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->raw:Ljava/lang/String;

    return-object v0
.end method

.method public final getTarget()I
    .locals 1

    .line 8
    iget v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->target:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lexpo/modules/camera/common/BarcodeScannedEvent;->type:Ljava/lang/String;

    return-object v0
.end method
