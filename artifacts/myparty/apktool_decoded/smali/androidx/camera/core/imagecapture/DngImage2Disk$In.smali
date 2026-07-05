.class abstract Landroidx/camera/core/imagecapture/DngImage2Disk$In;
.super Ljava/lang/Object;
.source "DngImage2Disk.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/imagecapture/DngImage2Disk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "In"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static of(Landroidx/camera/core/ImageProxy;ILandroidx/camera/core/ImageCapture$OutputFileOptions;)Landroidx/camera/core/imagecapture/DngImage2Disk$In;
    .locals 1

    .line 125
    new-instance v0, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;

    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/core/imagecapture/AutoValue_DngImage2Disk_In;-><init>(Landroidx/camera/core/ImageProxy;ILandroidx/camera/core/ImageCapture$OutputFileOptions;)V

    return-object v0
.end method


# virtual methods
.method abstract getImageProxy()Landroidx/camera/core/ImageProxy;
.end method

.method abstract getOutputFileOptions()Landroidx/camera/core/ImageCapture$OutputFileOptions;
.end method

.method abstract getRotationDegrees()I
.end method
