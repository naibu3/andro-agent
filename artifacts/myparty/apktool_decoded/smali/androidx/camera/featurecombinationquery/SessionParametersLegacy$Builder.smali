.class public final Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;
.super Ljava/lang/Object;
.source "SessionParametersLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/featurecombinationquery/SessionParametersLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final mKeyVal:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;->mKeyVal:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public build()Landroidx/camera/featurecombinationquery/SessionParametersLegacy;
    .locals 3

    .line 137
    new-instance v0, Landroidx/camera/featurecombinationquery/SessionParametersLegacy;

    iget-object v1, p0, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;->mKeyVal:Ljava/util/HashMap;

    invoke-static {v1}, Lkotlin/UByte$$ExternalSyntheticBackport0;->m(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/featurecombinationquery/SessionParametersLegacy;-><init>(Ljava/util/Map;Landroidx/camera/featurecombinationquery/SessionParametersLegacy$1;)V

    return-object v0
.end method

.method public set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TT;>;TT;)",
            "Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Landroidx/camera/featurecombinationquery/SessionParametersLegacy$Builder;->mKeyVal:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
