.class public final synthetic Lio/qonversion/sandwich/MappersKt$WhenMappings;
.super Ljava/lang/Object;
.source "Mappers.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/qonversion/sandwich/MappersKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;->values()[Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;->Treatment:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;->Control:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lio/qonversion/sandwich/MappersKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->values()[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v3, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->RemoteConfiguration:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v3, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ExperimentTreatmentGroup:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v3, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ExperimentControlGroup:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ordinal()I

    move-result v3

    const/4 v4, 0x3

    aput v4, v0, v3
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, Lio/qonversion/sandwich/MappersKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->values()[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_5
    sget-object v3, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Auto:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Manual:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Lio/qonversion/sandwich/MappersKt$WhenMappings;->$EnumSwitchMapping$2:[I

    return-void
.end method
