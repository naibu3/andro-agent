.class final enum Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;
.super Ljava/lang/Enum;
.source "SupportedSurfaceCombination.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/SupportedSurfaceCombination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "CheckingMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

.field public static final enum WITHOUT_FEATURE_COMBO:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

.field public static final enum WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

.field public static final enum WITH_FEATURE_COMBO:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;


# direct methods
.method private static synthetic $values()[Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;
    .locals 3

    .line 2198
    sget-object v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->WITHOUT_FEATURE_COMBO:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    sget-object v1, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->WITH_FEATURE_COMBO:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    sget-object v2, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    filled-new-array {v0, v1, v2}, [Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 2199
    new-instance v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    const-string v1, "WITHOUT_FEATURE_COMBO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->WITHOUT_FEATURE_COMBO:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    .line 2200
    new-instance v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    const-string v1, "WITH_FEATURE_COMBO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->WITH_FEATURE_COMBO:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    .line 2201
    new-instance v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    const-string v1, "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT:Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    .line 2198
    invoke-static {}, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->$values()[Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    move-result-object v0

    sput-object v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->$VALUES:[Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2198
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            null
        }
    .end annotation

    .line 2198
    const-class v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    return-object p0
.end method

.method public static values()[Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;
    .locals 1

    .line 2198
    sget-object v0, Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->$VALUES:[Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    invoke-virtual {v0}, [Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/camera2/internal/SupportedSurfaceCombination$CheckingMethod;

    return-object v0
.end method
