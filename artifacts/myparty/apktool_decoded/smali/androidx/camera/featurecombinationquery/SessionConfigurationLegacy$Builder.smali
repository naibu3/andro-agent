.class public final Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
.super Ljava/lang/Object;
.source "SessionConfigurationLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final mOutputConfigs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    .line 86
    new-instance v0, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;

    invoke-direct {v0}, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;-><init>()V

    .line 88
    invoke-virtual {v0}, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;->build()Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    return-void
.end method


# virtual methods
.method public addOutputConfiguration(Landroid/hardware/camera2/params/OutputConfiguration;)Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    .locals 1

    .line 101
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addOutputConfigurations(Ljava/util/Collection;)Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/hardware/camera2/params/OutputConfiguration;",
            ">;)",
            "Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;"
        }
    .end annotation

    .line 114
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public build()Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;
    .locals 4

    .line 147
    new-instance v0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;

    iget-object v1, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mOutputConfigs:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/UByte$$ExternalSyntheticBackport0;->m(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy;-><init>(Ljava/util/List;Landroidx/camera/featurecombinationquery/SessionParametersLegacy;Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$1;)V

    return-object v0
.end method

.method public setSessionParameters(Landroidx/camera/featurecombinationquery/SessionParametersLegacy;)Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;
    .locals 0

    .line 127
    iput-object p1, p0, Landroidx/camera/featurecombinationquery/SessionConfigurationLegacy$Builder;->mSessionParams:Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    return-object p0
.end method
