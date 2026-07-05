.class public final Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;
.super Ljava/lang/Object;
.source "HighSpeedVideoSessionConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/HighSpeedVideoSessionConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000cJ\u0014\u0010\u0010\u001a\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;",
        "",
        "videoCapture",
        "Landroidx/camera/video/VideoCapture;",
        "<init>",
        "(Landroidx/camera/video/VideoCapture;)V",
        "preview",
        "Landroidx/camera/core/Preview;",
        "frameRateRange",
        "Landroid/util/Range;",
        "",
        "isSlowMotionEnabled",
        "",
        "setPreview",
        "setSlowMotionEnabled",
        "enabled",
        "setFrameRateRange",
        "build",
        "Landroidx/camera/video/HighSpeedVideoSessionConfig;",
        "camera-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private frameRateRange:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private isSlowMotionEnabled:Z

.field private preview:Landroidx/camera/core/Preview;

.field private final videoCapture:Landroidx/camera/video/VideoCapture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/video/VideoCapture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/camera/video/VideoCapture;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/video/VideoCapture<",
            "*>;)V"
        }
    .end annotation

    const-string/jumbo v0, "videoCapture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->videoCapture:Landroidx/camera/video/VideoCapture;

    .line 113
    sget-object p1, Landroidx/camera/core/impl/StreamSpec;->FRAME_RATE_RANGE_UNSPECIFIED:Landroid/util/Range;

    const-string v0, "FRAME_RATE_RANGE_UNSPECIFIED"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->frameRateRange:Landroid/util/Range;

    return-void
.end method


# virtual methods
.method public final build()Landroidx/camera/video/HighSpeedVideoSessionConfig;
    .locals 5

    .line 140
    new-instance v0, Landroidx/camera/video/HighSpeedVideoSessionConfig;

    .line 141
    iget-object v1, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->videoCapture:Landroidx/camera/video/VideoCapture;

    .line 142
    iget-object v2, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->preview:Landroidx/camera/core/Preview;

    .line 143
    iget-object v3, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->frameRateRange:Landroid/util/Range;

    .line 144
    iget-boolean v4, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->isSlowMotionEnabled:Z

    .line 140
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/camera/video/HighSpeedVideoSessionConfig;-><init>(Landroidx/camera/video/VideoCapture;Landroidx/camera/core/Preview;Landroid/util/Range;Z)V

    return-object v0
.end method

.method public final setFrameRateRange(Landroid/util/Range;)Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;"
        }
    .end annotation

    const-string v0, "frameRateRange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iput-object p1, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->frameRateRange:Landroid/util/Range;

    return-object p0
.end method

.method public final setPreview(Landroidx/camera/core/Preview;)Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;
    .locals 0

    .line 118
    iput-object p1, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->preview:Landroidx/camera/core/Preview;

    return-object p0
.end method

.method public final setSlowMotionEnabled(Z)Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;
    .locals 0

    .line 124
    iput-boolean p1, p0, Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;->isSlowMotionEnabled:Z

    return-object p0
.end method
