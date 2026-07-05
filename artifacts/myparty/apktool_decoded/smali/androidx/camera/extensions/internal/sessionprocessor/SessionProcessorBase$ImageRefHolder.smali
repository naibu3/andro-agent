.class Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;
.super Ljava/lang/Object;
.source "SessionProcessorBase.java"

# interfaces
.implements Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ImageRefHolder"
.end annotation


# instance fields
.field private final mImage:Landroid/media/Image;

.field private final mImageLock:Ljava/lang/Object;

.field private mRefCount:I


# direct methods
.method constructor <init>(Landroid/media/Image;)V
    .locals 1

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImageLock:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 248
    iput v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 249
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImage:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method public decrement()Z
    .locals 3

    .line 265
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImageLock:Ljava/lang/Object;

    monitor-enter v0

    .line 266
    :try_start_0
    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    if-gtz v1, :cond_0

    const/4 v1, 0x0

    .line 267
    monitor-exit v0

    return v1

    :cond_0
    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 269
    iput v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    if-gtz v1, :cond_1

    .line 271
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->close()V

    .line 273
    :cond_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public get()Landroid/media/Image;
    .locals 1

    .line 279
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImage:Landroid/media/Image;

    return-object v0
.end method

.method public increment()Z
    .locals 3

    .line 254
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mImageLock:Ljava/lang/Object;

    monitor-enter v0

    .line 255
    :try_start_0
    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    if-gtz v1, :cond_0

    const/4 v1, 0x0

    .line 256
    monitor-exit v0

    return v1

    :cond_0
    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 258
    iput v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/SessionProcessorBase$ImageRefHolder;->mRefCount:I

    .line 259
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
