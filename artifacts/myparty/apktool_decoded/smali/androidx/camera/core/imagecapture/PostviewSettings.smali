.class public abstract Landroidx/camera/core/imagecapture/PostviewSettings;
.super Ljava/lang/Object;
.source "PostviewSettings.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/util/Size;I)Landroidx/camera/core/imagecapture/PostviewSettings;
    .locals 1

    .line 44
    new-instance v0, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;

    invoke-direct {v0, p0, p1}, Landroidx/camera/core/imagecapture/AutoValue_PostviewSettings;-><init>(Landroid/util/Size;I)V

    return-object v0
.end method


# virtual methods
.method public abstract getInputFormat()I
.end method

.method public abstract getResolution()Landroid/util/Size;
.end method
