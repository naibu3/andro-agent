.class public final Lexpo/modules/camera/common/PictureSavedEvent;
.super Ljava/lang/Object;
.source "CommonEvents.kt"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lexpo/modules/camera/common/PictureSavedEvent;",
        "Lexpo/modules/kotlin/records/Record;",
        "id",
        "",
        "data",
        "Landroid/os/Bundle;",
        "<init>",
        "(ILandroid/os/Bundle;)V",
        "getId$annotations",
        "()V",
        "getId",
        "()I",
        "getData$annotations",
        "getData",
        "()Landroid/os/Bundle;",
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
.field private final data:Landroid/os/Bundle;

.field private final id:I


# direct methods
.method public constructor <init>(ILandroid/os/Bundle;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lexpo/modules/camera/common/PictureSavedEvent;->id:I

    .line 23
    iput-object p2, p0, Lexpo/modules/camera/common/PictureSavedEvent;->data:Landroid/os/Bundle;

    return-void
.end method

.method public static synthetic getData$annotations()V
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


# virtual methods
.method public final getData()Landroid/os/Bundle;
    .locals 1

    .line 23
    iget-object v0, p0, Lexpo/modules/camera/common/PictureSavedEvent;->data:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    .line 22
    iget v0, p0, Lexpo/modules/camera/common/PictureSavedEvent;->id:I

    return v0
.end method
