.class public final synthetic Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/core/util/Consumer;


# instance fields
.field public final synthetic f$0:Lexpo/modules/camera/ExpoCameraView;

.field public final synthetic f$1:Lexpo/modules/kotlin/Promise;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;->f$0:Lexpo/modules/camera/ExpoCameraView;

    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;->f$1:Lexpo/modules/kotlin/Promise;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;->f$0:Lexpo/modules/camera/ExpoCameraView;

    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;->f$1:Lexpo/modules/kotlin/Promise;

    check-cast p1, Landroidx/camera/video/VideoRecordEvent;

    invoke-static {v0, v1, p1}, Lexpo/modules/camera/ExpoCameraView;->$r8$lambda$PfHccbbgFuWoL4DJEKjx3JTBBDk(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;Landroidx/camera/video/VideoRecordEvent;)V

    return-void
.end method
