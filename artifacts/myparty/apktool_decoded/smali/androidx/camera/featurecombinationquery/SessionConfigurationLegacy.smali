.class public Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;
.super Ljava/lang/Object;
.source "SessionConfigurationLegacy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    }
.end annotation


# instance fields
.field private final mOutputConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;


# direct methods
.method private constructor <init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;",
            "Landroidx/camera/featurecombinationquery/SessionParametersLegacy;",
            ")V"
        }
    .end annotation

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mOutputConfigs:Ljava/util/List;

    .line 61
    iput-object p2, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$1;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;-><init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;)V

    return-void
.end method


# virtual methods
.method public getOutputConfigurations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mOutputConfigs:Ljava/util/List;

    return-object v0
.end method

.method public getSessionParameters()Landroidx/camera/featurecombinationquery/SessionParametersLegacy;
    .locals 1

    .line 77
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    return-object v0
.end method
