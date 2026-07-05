.class public final synthetic Landroidx/camera/core/impl/AdapterCameraInfo$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/arch/core/util/Function;


# instance fields
.field public final synthetic f$0:Landroid/util/Range;


# direct methods
.method public synthetic constructor <init>(Landroid/util/Range;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/AdapterCameraInfo$$ExternalSyntheticLambda0;->f$0:Landroid/util/Range;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInfo$$ExternalSyntheticLambda0;->f$0:Landroid/util/Range;

    check-cast p1, Landroidx/camera/core/ZoomState;

    invoke-static {v0, p1}, Landroidx/camera/core/impl/AdapterCameraInfo;->lambda$getZoomState$0(Landroid/util/Range;Landroidx/camera/core/ZoomState;)Landroidx/camera/core/ZoomState;

    move-result-object p1

    return-object p1
.end method
