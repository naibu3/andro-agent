.class public final synthetic Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroidx/camera/camera2/internal/SupportedSurfaceCombination;

.field public final synthetic f$1:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$FeatureSettings;

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:Ljava/util/Map;

.field public final synthetic f$4:Ljava/util/List;

.field public final synthetic f$5:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/SupportedSurfaceCombination;Landroidx/camera/camera2/internal/SupportedSurfaceCombination$FeatureSettings;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$0:Landroidx/camera/camera2/internal/SupportedSurfaceCombination;

    iput-object p2, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$1:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$FeatureSettings;

    iput-object p3, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$2:Ljava/util/List;

    iput-object p4, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$3:Ljava/util/Map;

    iput-object p5, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$4:Ljava/util/List;

    iput-object p6, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$5:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$0:Landroidx/camera/camera2/internal/SupportedSurfaceCombination;

    iget-object v1, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$1:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$FeatureSettings;

    iget-object v2, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$2:Ljava/util/List;

    iget-object v3, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$3:Ljava/util/Map;

    iget-object v4, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$4:Ljava/util/List;

    iget-object v5, p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$$ExternalSyntheticLambda1;->f$5:Ljava/util/List;

    invoke-virtual/range {v0 .. v5}, Landroidx/camera/camera2/internal/SupportedSurfaceCombination;->lambda$findBestSizesAndFps$1$androidx-camera-camera2-internal-SupportedSurfaceCombination(Landroidx/camera/camera2/internal/SupportedSurfaceCombination$FeatureSettings;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
