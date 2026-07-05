.class public final Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;
.super Ljava/lang/Object;
.source "FeatureCombinationQuery.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\u0008\u00030\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0001\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;",
        "",
        "<init>",
        "()V",
        "NO_OP_FEATURE_COMBINATION_QUERY",
        "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;",
        "createSessionConfigBuilder",
        "Landroidx/camera/core/impl/SessionConfig$Builder;",
        "Landroidx/camera/core/impl/UseCaseConfig;",
        "resolution",
        "Landroid/util/Size;",
        "dynamicRange",
        "Landroidx/camera/core/DynamicRange;",
        "camera-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;

    invoke-direct {v0}, Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;-><init>()V

    sput-object v0, Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;->$$INSTANCE:Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createSessionConfigBuilder(Landroidx/camera/core/impl/UseCaseConfig;Landroid/util/Size;Landroidx/camera/core/DynamicRange;)Landroidx/camera/core/impl/SessionConfig$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/UseCaseConfig<",
            "*>;",
            "Landroid/util/Size;",
            "Landroidx/camera/core/DynamicRange;",
            ")",
            "Landroidx/camera/core/impl/SessionConfig$Builder;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dynamicRange"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-interface {p1}, Landroidx/camera/core/impl/UseCaseConfig;->getInputFormat()I

    move-result v0

    new-instance v1, Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1;

    invoke-direct {v1, p2, v0}, Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1;-><init>(Landroid/util/Size;I)V

    check-cast v1, Landroidx/camera/core/impl/DeferrableSurface;

    .line 78
    sget-object v0, Landroidx/camera/core/featuregroup/impl/UseCaseType;->Companion:Landroidx/camera/core/featuregroup/impl/UseCaseType$Companion;

    invoke-virtual {v0, p1}, Landroidx/camera/core/featuregroup/impl/UseCaseType$Companion;->getFeatureGroupUseCaseType(Landroidx/camera/core/impl/UseCaseConfig;)Landroidx/camera/core/featuregroup/impl/UseCaseType;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/featuregroup/impl/UseCaseType;->getSurfaceClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/DeferrableSurface;->setContainerClass(Ljava/lang/Class;)V

    .line 82
    :cond_0
    invoke-static {p1, p2}, Landroidx/camera/core/impl/SessionConfig$Builder;->createFrom(Landroidx/camera/core/impl/UseCaseConfig;Landroid/util/Size;)Landroidx/camera/core/impl/SessionConfig$Builder;

    move-result-object p1

    .line 83
    invoke-virtual {p1, v1, p3}, Landroidx/camera/core/impl/SessionConfig$Builder;->addSurface(Landroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/core/DynamicRange;)Landroidx/camera/core/impl/SessionConfig$Builder;

    move-result-object p1

    const-string p2, "addSurface(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
