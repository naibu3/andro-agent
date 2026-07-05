.class public final synthetic Landroidx/camera/core/internal/compat/ImageWriterCompatApi23Impl$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/media/ImageWriter$OnImageReleasedListener;


# instance fields
.field public final synthetic f$0:Ljava/util/concurrent/Executor;

.field public final synthetic f$1:Landroid/media/ImageWriter$OnImageReleasedListener;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Landroid/media/ImageWriter$OnImageReleasedListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/internal/compat/ImageWriterCompatApi23Impl$$ExternalSyntheticLambda1;->f$0:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/camera/core/internal/compat/ImageWriterCompatApi23Impl$$ExternalSyntheticLambda1;->f$1:Landroid/media/ImageWriter$OnImageReleasedListener;

    return-void
.end method


# virtual methods
.method public final onImageReleased(Landroid/media/ImageWriter;)V
    .locals 2

    .line 0
    iget-object v0, p0, Landroidx/camera/core/internal/compat/ImageWriterCompatApi23Impl$$ExternalSyntheticLambda1;->f$0:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/core/internal/compat/ImageWriterCompatApi23Impl$$ExternalSyntheticLambda1;->f$1:Landroid/media/ImageWriter$OnImageReleasedListener;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/internal/compat/ImageWriterCompatApi23Impl;->lambda$setOnImageReleasedListener$1(Ljava/util/concurrent/Executor;Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V

    return-void
.end method
