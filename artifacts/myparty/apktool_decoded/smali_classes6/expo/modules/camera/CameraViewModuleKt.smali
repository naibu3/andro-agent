.class public final Lexpo/modules/camera/CameraViewModuleKt;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0006\"\u0019\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0003\u0010\u0004\"\u0019\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "cameraEvents",
        "",
        "",
        "getCameraEvents",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "cameraPermissions",
        "getCameraPermissions",
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
.field private static final cameraEvents:[Ljava/lang/String;

.field private static final cameraPermissions:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x7

    .line 43
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "onCameraReady"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 44
    const-string v1, "onMountError"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 45
    const-string v1, "onBarcodeScanned"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v1, 0x3

    .line 46
    const-string v5, "onFacesDetected"

    aput-object v5, v0, v1

    const/4 v1, 0x4

    .line 47
    const-string v5, "onFaceDetectionError"

    aput-object v5, v0, v1

    const/4 v1, 0x5

    .line 48
    const-string v5, "onPictureSaved"

    aput-object v5, v0, v1

    const/4 v1, 0x6

    .line 49
    const-string v5, "onAvailableLensesChanged"

    aput-object v5, v0, v1

    .line 42
    sput-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraEvents:[Ljava/lang/String;

    .line 52
    sget-object v0, Lexpo/modules/core/utilities/VRUtilities;->Companion:Lexpo/modules/core/utilities/VRUtilities$Companion;

    invoke-virtual {v0}, Lexpo/modules/core/utilities/VRUtilities$Companion;->isQuest()Z

    move-result v0

    const-string v1, "android.permission.CAMERA"

    if-eqz v0, :cond_0

    .line 54
    new-array v0, v4, [Ljava/lang/String;

    aput-object v1, v0, v2

    .line 55
    const-string v1, "horizonos.permission.HEADSET_CAMERA"

    aput-object v1, v0, v3

    goto :goto_0

    .line 58
    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    aput-object v1, v0, v2

    .line 52
    :goto_0
    sput-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraPermissions:[Ljava/lang/String;

    return-void
.end method

.method public static final getCameraEvents()[Ljava/lang/String;
    .locals 1

    .line 42
    sget-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraEvents:[Ljava/lang/String;

    return-object v0
.end method

.method public static final getCameraPermissions()[Ljava/lang/String;
    .locals 1

    .line 52
    sget-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraPermissions:[Ljava/lang/String;

    return-object v0
.end method
