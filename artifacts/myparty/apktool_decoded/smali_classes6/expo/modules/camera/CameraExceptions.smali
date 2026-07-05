.class public final Lexpo/modules/camera/CameraExceptions;
.super Ljava/lang/Object;
.source "CameraExceptions.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/CameraExceptions$BarcodeScanningCancelledException;,
        Lexpo/modules/camera/CameraExceptions$BarcodeScanningFailedException;,
        Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;,
        Lexpo/modules/camera/CameraExceptions$ImageCaptureFailed;,
        Lexpo/modules/camera/CameraExceptions$ImageRetrievalException;,
        Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;,
        Lexpo/modules/camera/CameraExceptions$VideoRecordingFailed;,
        Lexpo/modules/camera/CameraExceptions$WriteImageException;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0008\u0004\u0005\u0006\u0007\u0008\t\n\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/camera/CameraExceptions;",
        "",
        "<init>",
        "()V",
        "ImageCaptureFailed",
        "VideoRecordingFailed",
        "ImageRetrievalException",
        "BarcodeScanningCancelledException",
        "BarcodeScanningFailedException",
        "MLKitUnavailableException",
        "GooglePlayServicesUnavailableException",
        "WriteImageException",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
